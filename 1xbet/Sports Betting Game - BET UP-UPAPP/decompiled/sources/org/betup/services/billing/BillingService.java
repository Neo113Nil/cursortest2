package org.betup.services.billing;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.android.billingclient.api.QueryPurchasesParams;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.bus.PurchaseSuccessMessage;
import org.betup.bus.SubscriptionUpdatedMessage;
import org.betup.injection.provider.BillingClientProvider;
import org.betup.model.domain.ShopConstants;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.analytics.GetSignedPendingOfferInteractor;
import org.betup.model.remote.api.rest.analytics.PostFullOfferSignatureInteractor;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.shop.ShopPurchaseInteractor;
import org.betup.model.remote.api.rest.shop.V7MakeSubscriptionPurchaseInteractor;
import org.betup.model.remote.api.rest.user.balance.V7BalanceHistoryInteractor;
import org.betup.model.remote.entity.analytics.OfferModel;
import org.betup.model.remote.entity.shop.ShopResponseDataModel;
import org.betup.services.billing.BillingService;
import org.betup.services.user.UserService;
import org.greenrobot.eventbus.EventBus;

@Singleton
/* loaded from: classes2.dex */
public class BillingService implements PurchasesUpdatedListener, BaseCachedSharedInteractor.OnFetchedListener<String, String>, ConsumeResponseListener {
    private static final int MAX_SKUS_PER_QUERY = 20;
    private static final String TAG = "BETUP-BILLING";
    private String activeOfferToken;
    private final V7BalanceHistoryInteractor balanceHistoryInteractor;
    private final GetSignedPendingOfferInteractor getSignedPendingOfferInteractor;
    private final Handler handler;
    private boolean isConnected;
    private final BillingClient mBillingClient;
    private final BaseCachedSharedInteractor.OnFetchedListener<OfferModel, String> onSignatureGotListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.services.billing.BillingService$$ExternalSyntheticLambda3
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            BillingService.this.m12745lambda$new$3$orgbetupservicesbillingBillingService(fetchedResponseMessage);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<Boolean, String> onSubscriptionPurchaseCompleted = new BaseCachedSharedInteractor.OnFetchedListener<Boolean, String>() { // from class: org.betup.services.billing.BillingService.4
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<Boolean, String> responseMessage) {
            PurchaseListener purchaseListener = BillingService.this.purchaseListener != null ? (PurchaseListener) BillingService.this.purchaseListener.get() : null;
            if (responseMessage.getStat() != FetchStat.SUCCESS) {
                if (purchaseListener != null) {
                    purchaseListener.purchaseFailed(BillingError.INVALID_TOKEN);
                }
            } else {
                BillingService.this.userService.invalidate(UserService.InfoKind.GENERAL);
                BillingService.this.userService.syncProfile(UserService.InfoKind.GENERAL);
                if (purchaseListener != null) {
                    purchaseListener.purchaseCompleted();
                }
                EventBus.getDefault().post(new SubscriptionUpdatedMessage(true));
            }
        }
    };
    private PostFullOfferSignatureInteractor postFullOfferSignatureInteractor;
    private final Map<String, ProductDetails> productsCache;
    private WeakReference<PurchaseListener> purchaseListener;
    private final ShopPurchaseInteractor shopPurchaseInteractor;
    private final UserService userService;
    private final V7MakeSubscriptionPurchaseInteractor v7MakeSubscriptionPurchaseInteractor;

    public enum BillingError {
        INVALID_TOKEN,
        NO_CONNECTION,
        CANCELED
    }

    public interface DetailsGotListener {
        void detailsGot(Map<String, ProductDetails> details);
    }

    public interface PurchaseListener {
        void purchaseCompleted();

        void purchaseFailed(BillingError error);
    }

    @Inject
    public BillingService(Context context, UserService userService, BillingClientProvider billingClientProvider, ShopPurchaseInteractor shopPurchaseInteractor, PostFullOfferSignatureInteractor postFullOfferSignatureInteractor, V7BalanceHistoryInteractor balanceHistoryInteractor, GetSignedPendingOfferInteractor getSignedPendingOfferInteractor, V7MakeSubscriptionPurchaseInteractor v7MakeSubscriptionPurchaseInteractor) {
        this.userService = userService;
        this.shopPurchaseInteractor = shopPurchaseInteractor;
        this.balanceHistoryInteractor = balanceHistoryInteractor;
        this.postFullOfferSignatureInteractor = postFullOfferSignatureInteractor;
        this.getSignedPendingOfferInteractor = getSignedPendingOfferInteractor;
        this.v7MakeSubscriptionPurchaseInteractor = v7MakeSubscriptionPurchaseInteractor;
        Context applicationContext = context.getApplicationContext();
        this.productsCache = new HashMap();
        this.mBillingClient = billingClientProvider.createBillingClient(applicationContext, this);
        this.handler = new Handler(Looper.getMainLooper());
    }

    public void purchaseItem(final Activity activity, final String productId, final PurchaseListener listener) {
        this.purchaseListener = new WeakReference<>(listener);
        if (this.mBillingClient.isReady()) {
            purchaseItem(activity, productId);
        } else {
            this.mBillingClient.startConnection(new BillingClientStateListener() { // from class: org.betup.services.billing.BillingService.1
                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingSetupFinished(BillingResult billingResult) {
                    Log.d(BillingService.TAG, "Reconnected to billing service...");
                    if (billingResult.getResponseCode() == 0) {
                        BillingService.this.purchaseItem(activity, productId);
                        return;
                    }
                    PurchaseListener purchaseListener = listener;
                    if (purchaseListener != null) {
                        purchaseListener.purchaseFailed(BillingError.NO_CONNECTION);
                    }
                }

                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingServiceDisconnected() {
                    PurchaseListener purchaseListener;
                    if (BillingService.this.purchaseListener == null || (purchaseListener = (PurchaseListener) BillingService.this.purchaseListener.get()) == null) {
                        return;
                    }
                    purchaseListener.purchaseFailed(BillingError.NO_CONNECTION);
                }
            });
        }
    }

    public void purchaseOfferItem(final Activity activity, final String productId, final String offerToken, PurchaseListener listener) {
        this.activeOfferToken = offerToken;
        purchaseItem(activity, productId, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void purchaseItem(final Activity activity, final String id) {
        if (activity == null) {
            return;
        }
        if (id == null || id.isEmpty()) {
            Log.e(TAG, "purchaseItem: empty product id");
            notifyPurchaseFailed(BillingError.INVALID_TOKEN);
            return;
        }
        Log.d(TAG, "SUPPORT FOR IAP = " + this.mBillingClient.isReady());
        ProductDetails productDetails = this.productsCache.get(id);
        if (productDetails == null) {
            queryProductDetails(Collections.singletonList(id), resolveProductType(id), new ProductDetailsResponseListener() { // from class: org.betup.services.billing.BillingService$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.ProductDetailsResponseListener
                public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
                    BillingService.this.m12746lambda$purchaseItem$0$orgbetupservicesbillingBillingService(id, activity, billingResult, queryProductDetailsResult);
                }
            });
        } else {
            launchPurchaseFlow(activity, productDetails);
        }
    }

    /* renamed from: lambda$purchaseItem$0$org-betup-services-billing-BillingService, reason: not valid java name */
    /* synthetic */ void m12746lambda$purchaseItem$0$orgbetupservicesbillingBillingService(String str, Activity activity, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        if (billingResult.getResponseCode() == 0 && queryProductDetailsResult != null) {
            for (ProductDetails productDetails : queryProductDetailsResult.getProductDetailsList()) {
                this.productsCache.put(productDetails.getProductId(), productDetails);
            }
        }
        ProductDetails productDetails2 = this.productsCache.get(str);
        if (productDetails2 == null) {
            Log.e(TAG, "purchaseItem: product not found in Play Console for id=" + str);
            notifyPurchaseFailed(BillingError.INVALID_TOKEN);
        } else {
            launchPurchaseFlow(activity, productDetails2);
        }
    }

    private void launchPurchaseFlow(Activity activity, ProductDetails productDetails) {
        BillingFlowParams.ProductDetailsParams.Builder productDetails2 = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails);
        String offerToken = ProductDetailsPrice.offerToken(productDetails);
        if (offerToken != null && !offerToken.isEmpty()) {
            productDetails2.setOfferToken(offerToken);
        } else if (BillingClient.ProductType.SUBS.equals(productDetails.getProductType())) {
            Log.e(TAG, "launchPurchaseFlow: missing offerToken for subscription " + productDetails.getProductId());
            notifyPurchaseFailed(BillingError.INVALID_TOKEN);
            return;
        }
        Log.d(TAG, "RESPONSE = " + this.mBillingClient.launchBillingFlow(activity, BillingFlowParams.newBuilder().setProductDetailsParamsList(Collections.singletonList(productDetails2.build())).build()).getResponseCode());
    }

    private void notifyPurchaseFailed(final BillingError error) {
        final PurchaseListener purchaseListener;
        WeakReference<PurchaseListener> weakReference = this.purchaseListener;
        if (weakReference == null || (purchaseListener = weakReference.get()) == null) {
            return;
        }
        this.handler.post(new Runnable() { // from class: org.betup.services.billing.BillingService$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                BillingService.PurchaseListener.this.purchaseFailed(error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processPurchases(List<Purchase> purchases) {
        Log.d(TAG, "Purchases updated...");
        if (purchases != null) {
            Log.d(TAG, "Purchases not null");
            for (Purchase purchase : purchases) {
                String str = purchase.getProducts().get(0);
                try {
                    Log.d(TAG, "msg = " + str + " token = " + purchase.getPurchaseToken());
                    Bundle bundle = new Bundle();
                    bundle.putString("token", purchase.getPurchaseToken());
                    if (isSpecialOffer(str)) {
                        processSpecialOffer(purchase);
                    } else if (purchase.isAutoRenewing()) {
                        bundle.putString("token", purchase.getOriginalJson());
                        this.v7MakeSubscriptionPurchaseInteractor.load(this.onSubscriptionPurchaseCompleted, str, bundle);
                    } else {
                        this.shopPurchaseInteractor.load(this, str, bundle);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return;
        }
        Log.d(TAG, "Purchases null");
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<String, String> responseMessage) {
        Log.d(TAG, "ON FETCHED!");
        this.activeOfferToken = null;
        WeakReference<PurchaseListener> weakReference = this.purchaseListener;
        PurchaseListener purchaseListener = weakReference != null ? weakReference.get() : null;
        if (responseMessage.getStat() != FetchStat.SUCCESS) {
            if (purchaseListener != null) {
                Log.d(TAG, "Purchase failed with code = " + responseMessage.getStat());
                purchaseListener.purchaseFailed(BillingError.INVALID_TOKEN);
                return;
            }
            return;
        }
        ShopResponseDataModel shopResponseDataModel = (ShopResponseDataModel) new Gson().fromJson(responseMessage.getModel(), ShopResponseDataModel.class);
        this.mBillingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(shopResponseDataModel.getToken()).build(), this);
        this.balanceHistoryInteractor.invalidate();
        if (purchaseListener != null) {
            purchaseListener.purchaseCompleted();
        }
        if (shopResponseDataModel.getAmount() > 0) {
            if (this.userService.isRegistered()) {
                this.userService.getShortProfile().getUserProgressModel().setMoneyBalance(shopResponseDataModel.getMoneyBalance());
            }
            if (shopResponseDataModel.getShopItemModel() == null || ShopConstants.ONE_TIMER_OFFER_PRODUCT_ID.equals(Integer.valueOf(shopResponseDataModel.getShopItemModel().getId())) || shopResponseDataModel.getShopItemModel().getBetcoins() <= 0) {
                return;
            }
            EventBus.getDefault().post(new PurchaseSuccessMessage(shopResponseDataModel.getShopItemModel()));
        }
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> purchases) {
        WeakReference<PurchaseListener> weakReference;
        PurchaseListener purchaseListener;
        if (billingResult.getResponseCode() == 1 && (weakReference = this.purchaseListener) != null && (purchaseListener = weakReference.get()) != null) {
            purchaseListener.purchaseFailed(BillingError.CANCELED);
        }
        processPurchases(purchases);
    }

    public void getProductDetails(final List<String> products, DetailsGotListener gotListener) {
        getDetailsInternal(products, BillingClient.ProductType.INAPP, gotListener);
    }

    public void getSubscriptionDetails(final List<String> products, DetailsGotListener gotListener) {
        getDetailsInternal(products, BillingClient.ProductType.SUBS, gotListener);
    }

    private void getDetailsInternal(final List<String> products, final String productType, final DetailsGotListener gotListener) {
        final WeakReference<DetailsGotListener> weakReference = new WeakReference<>(gotListener);
        if (!this.mBillingClient.isReady()) {
            this.mBillingClient.startConnection(new BillingClientStateListener() { // from class: org.betup.services.billing.BillingService.2
                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingSetupFinished(BillingResult billingResult) {
                    if (billingResult.getResponseCode() == 0) {
                        BillingService.this.fetchDetails(products, productType, weakReference);
                        return;
                    }
                    DetailsGotListener detailsGotListener = (DetailsGotListener) weakReference.get();
                    if (detailsGotListener != null) {
                        BillingService.this.notifyListener(detailsGotListener, new HashMap());
                    }
                }

                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingServiceDisconnected() {
                    DetailsGotListener detailsGotListener = (DetailsGotListener) weakReference.get();
                    if (detailsGotListener != null) {
                        BillingService.this.notifyListener(detailsGotListener, new HashMap());
                    }
                }
            });
        } else {
            fetchDetails(products, productType, weakReference);
        }
    }

    public void initConnection() {
        if (this.isConnected) {
            return;
        }
        this.mBillingClient.startConnection(new BillingClientStateListener() { // from class: org.betup.services.billing.BillingService.3
            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingSetupFinished(BillingResult billingResult) {
                if (billingResult.getResponseCode() == 0) {
                    Log.d(BillingService.TAG, "client ready");
                    BillingService.this.mBillingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(BillingClient.ProductType.INAPP).build(), new PurchasesResponseListener() { // from class: org.betup.services.billing.BillingService.3.1
                        @Override // com.android.billingclient.api.PurchasesResponseListener
                        public void onQueryPurchasesResponse(BillingResult billingResult2, List<Purchase> list) {
                            if (billingResult2.getResponseCode() == 0) {
                                BillingService.this.processPurchases(list);
                            }
                        }
                    });
                    BillingService.this.isConnected = true;
                } else {
                    Log.d(BillingService.TAG, "client code = " + billingResult.getResponseCode());
                    BillingService.this.isConnected = false;
                }
            }

            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingServiceDisconnected() {
                Log.d(BillingService.TAG, "client disconnected!");
                BillingService.this.isConnected = false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchDetails(final List<String> products, String productType, final WeakReference<DetailsGotListener> listener) {
        if (products.isEmpty()) {
            DetailsGotListener detailsGotListener = listener.get();
            if (detailsGotListener != null) {
                notifyListener(detailsGotListener, new HashMap());
                return;
            }
            return;
        }
        fetchDetailsChunk(products, 0, productType, new HashMap(), listener);
    }

    private void fetchDetailsChunk(final List<String> products, final int startIndex, final String productType, final Map<String, ProductDetails> aggregated, final WeakReference<DetailsGotListener> listener) {
        final int min = Math.min(startIndex + 20, products.size());
        queryProductDetails(products.subList(startIndex, min), productType, new ProductDetailsResponseListener() { // from class: org.betup.services.billing.BillingService$$ExternalSyntheticLambda1
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
                BillingService.this.m12744x2afb3da3(aggregated, min, products, productType, listener, billingResult, queryProductDetailsResult);
            }
        });
    }

    /* renamed from: lambda$fetchDetailsChunk$2$org-betup-services-billing-BillingService, reason: not valid java name */
    /* synthetic */ void m12744x2afb3da3(Map map, int i, List list, String str, WeakReference weakReference, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        if (billingResult.getResponseCode() == 0 && queryProductDetailsResult != null) {
            for (ProductDetails productDetails : queryProductDetailsResult.getProductDetailsList()) {
                this.productsCache.put(productDetails.getProductId(), productDetails);
                map.put(productDetails.getProductId(), productDetails);
            }
        }
        if (i < list.size()) {
            fetchDetailsChunk(list, i, str, map, weakReference);
            return;
        }
        DetailsGotListener detailsGotListener = (DetailsGotListener) weakReference.get();
        if (detailsGotListener == null) {
            return;
        }
        notifyListener(detailsGotListener, map);
    }

    private void queryProductDetails(List<String> productIds, String productType, ProductDetailsResponseListener listener) {
        ArrayList arrayList = new ArrayList(productIds.size());
        Iterator<String> it = productIds.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(it.next()).setProductType(productType).build());
        }
        this.mBillingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(arrayList).build(), listener);
    }

    private static String resolveProductType(String productId) {
        if (ShopConstants.SUBSCRIPTION_MONTH_ID.equals(productId) || ShopConstants.SUBSCRIPTION_WEEK_ID.equals(productId)) {
            return BillingClient.ProductType.SUBS;
        }
        return BillingClient.ProductType.INAPP;
    }

    private boolean isSpecialOffer(String sku) {
        return sku != null && sku.startsWith(ShopConstants.OFFER_PREFIX);
    }

    private void processSpecialOffer(Purchase purchase) {
        Bundle bundle = new Bundle();
        bundle.putString("token", purchase.getPurchaseToken());
        bundle.putString("productId", purchase.getProducts().get(0));
        String str = this.activeOfferToken;
        if (str != null) {
            this.postFullOfferSignatureInteractor.load(this, str, bundle);
            this.activeOfferToken = null;
        } else {
            this.getSignedPendingOfferInteractor.load(this.onSignatureGotListener, purchase.getProducts().get(0), bundle);
        }
    }

    /* renamed from: lambda$new$3$org-betup-services-billing-BillingService, reason: not valid java name */
    /* synthetic */ void m12745lambda$new$3$orgbetupservicesbillingBillingService(FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
            FirebaseCrashlytics.getInstance().recordException(new IllegalStateException(String.format("Can't confirm purchase for product %s via token %s", fetchedResponseMessage.getId(), fetchedResponseMessage.getArgs().getString("token"))));
        } else {
            this.postFullOfferSignatureInteractor.load(this, ((OfferModel) fetchedResponseMessage.getModel()).getSignature(), fetchedResponseMessage.getArgs());
        }
    }

    @Override // com.android.billingclient.api.ConsumeResponseListener
    public void onConsumeResponse(BillingResult billingResult, String s) {
        Log.d(TAG, "client code = " + billingResult.getResponseCode());
    }

    public ProductDetails getCachedProductDetails(String productId) {
        if (productId == null) {
            return null;
        }
        return this.productsCache.get(productId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyListener(final DetailsGotListener listener, final Map<String, ProductDetails> details) {
        this.handler.post(new Runnable() { // from class: org.betup.services.billing.BillingService$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                BillingService.DetailsGotListener.this.detailsGot(details);
            }
        });
    }
}

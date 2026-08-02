package org.betup.services.billing;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.android.billingclient.api.ProductDetails;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import org.betup.R;
import org.betup.bus.BetsUnlockedMessage;
import org.betup.model.domain.ShopConstants;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.shop.NewSingleShopInteractor;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.model.remote.entity.analytics.PurchaseType;
import org.betup.model.remote.entity.shop.NewShopItemModel;
import org.betup.model.remote.entity.shop.ShopItemModel;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.analytics.FirebaseAnalyticsHelper;
import org.betup.services.billing.BillingService;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.ui.ProgressDisplay;
import org.betup.ui.dialogs.PurchaseUnlockDialogFragment;
import org.betup.ui.dialogs.UnlockBetGroupsDialogFragment;
import org.betup.utils.PriceFormatUtils;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes2.dex */
public class UnlockBetTypesFlow implements PurchaseFlow, BillingService.DetailsGotListener, PurchaseConfirmationListener, BillingService.PurchaseListener, VideoRewardService.VideoRewardServiceClient {
    private static final PurchaseType PURCHASE_TYPE = PurchaseType.UNLOCK_BET_TYPES;
    private final Activity activity;
    private final AnalyticsService analyticsService;
    private final BillingService billingService;
    private final FirebaseRemoteConfig firebaseRemoteConfig;
    private final NewSingleShopInteractor newSingleShopInteractor;
    private PurchasePlacement placement;
    private final ProgressDisplay progressDisplay;
    private PurchaseCompletedListener purchaseListener;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewShopItemModel, String> shopItemListener = new BaseCachedSharedInteractor.OnFetchedListener<NewShopItemModel, String>() { // from class: org.betup.services.billing.UnlockBetTypesFlow.1
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<NewShopItemModel, String> responseMessage) {
            if (responseMessage.getStat() == FetchStat.SUCCESS) {
                NewShopItemModel model = responseMessage.getModel();
                UnlockBetTypesFlow.this.unlockBetGroupsItem = model.toShopItemModel();
                UnlockBetTypesFlow unlockBetTypesFlow = UnlockBetTypesFlow.this;
                unlockBetTypesFlow.applyBillingPrice(unlockBetTypesFlow.unlockBetGroupsItem);
                UnlockBetTypesFlow.this.videoRewardService.getVideoRewardInfo(PromoService.PromoPlacement.UNLOCK_ALL_BET_GROUPS, null, null);
                return;
            }
            Log.d("BUYDIALOG", "Server load failed, creating fallback shop item");
            UnlockBetTypesFlow.this.createFallbackShopItem();
            UnlockBetTypesFlow.this.videoRewardService.getVideoRewardInfo(PromoService.PromoPlacement.UNLOCK_ALL_BET_GROUPS, null, null);
        }
    };
    private ShopItemModel unlockBetGroupsItem;
    private ProductDetails unlockBetGroupsSku;
    private boolean unlockCompleted;
    private UserService userService;
    private VideoRewardService videoRewardService;

    public UnlockBetTypesFlow(Activity activity, BillingService billingService, FirebaseRemoteConfig firebaseRemoteConfig, NewSingleShopInteractor newSingleShopInteractor, ProgressDisplay progressDisplay, PurchasePlacement placement, AnalyticsService analyticsService, UserService userService, VideoRewardService videoRewardService) {
        this.activity = activity;
        this.billingService = billingService;
        this.progressDisplay = progressDisplay;
        this.newSingleShopInteractor = newSingleShopInteractor;
        this.firebaseRemoteConfig = firebaseRemoteConfig;
        this.placement = placement;
        this.analyticsService = analyticsService;
        this.userService = userService;
        this.videoRewardService = videoRewardService;
    }

    @Override // org.betup.services.billing.PurchaseFlow
    public void start(PurchaseCompletedListener purchaseListener, String... args) {
        this.unlockCompleted = false;
        this.videoRewardService.connectClient(PromoService.PromoPlacement.UNLOCK_ALL_BET_GROUPS, null, this);
        this.purchaseListener = purchaseListener;
        this.billingService.getProductDetails(Collections.singletonList(getSkuId()), this);
        this.progressDisplay.displayProgress();
    }

    @Override // org.betup.services.billing.BillingService.DetailsGotListener
    public void detailsGot(Map<String, ProductDetails> details) {
        Log.d("BUYDIALOG", "DETAILS GOT! " + details.size());
        String skuId = getSkuId();
        ProductDetails productDetails = details.get(skuId);
        this.unlockBetGroupsSku = productDetails;
        if (productDetails == null) {
            ProductDetails cachedProductDetails = this.billingService.getCachedProductDetails(skuId);
            this.unlockBetGroupsSku = cachedProductDetails;
            if (cachedProductDetails != null) {
                Log.d("BUYDIALOG", "Using cached billing details for " + skuId);
            } else {
                Log.d("BUYDIALOG", "Billing details not available for " + skuId + ", loading shop item anyway");
            }
        }
        this.newSingleShopInteractor.load(this.shopItemListener, getSkuId());
    }

    private String getSkuId() {
        String string = this.firebaseRemoteConfig.getString(ShopConstants.UNLOCK_BETS_SKU_KEY);
        return (string == null || string.length() == 0) ? "unlock_bet_groups_new" : string;
    }

    @Override // org.betup.services.billing.PurchaseConfirmationListener
    public void onPurchaseConfirmed(String skuId) {
        this.videoRewardService.disconnectClient(PromoService.PromoPlacement.UNLOCK_ALL_BET_GROUPS, null);
        this.billingService.purchaseItem(this.activity, skuId, this);
        this.progressDisplay.displayProgress();
    }

    @Override // org.betup.services.billing.PurchaseConfirmationListener
    public void onVideoConfirmed() {
        this.videoRewardService.redeemReward(PromoService.PromoPlacement.UNLOCK_ALL_BET_GROUPS, null, null);
    }

    @Override // org.betup.services.billing.PurchaseConfirmationListener
    public void onPurchaseCanceledByUser() {
        this.progressDisplay.hideProgress();
        this.videoRewardService.disconnectClient(PromoService.PromoPlacement.UNLOCK_ALL_BET_GROUPS, null);
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
    public void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info) {
        boolean z;
        Activity activity;
        Fragment findFragmentByTag;
        if (this.unlockCompleted) {
            this.progressDisplay.hideProgress();
            return;
        }
        boolean z2 = false;
        try {
            z = this.videoRewardService.isRewardedReady(PromoService.PromoPlacement.UNLOCK_ALL_BET_GROUPS);
        } catch (Exception e) {
            Log.e("UnlockBetTypesFlow", "Error checking rewarded ad availability", e);
            z = false;
        }
        boolean z3 = info.isAvailable() && !info.isQuotaExhausted();
        if (z3 && z) {
            z2 = true;
        }
        Log.d("UnlockBetTypesFlow", "Video reward updated: backendAvailable=" + z3 + ", adSdkAvailable=" + z + ", finalAvailable=" + z2 + ", amount=" + info.getPrizeAmount());
        if (z3 && !this.videoRewardService.isRewardedReady(PromoService.PromoPlacement.UNLOCK_ALL_BET_GROUPS)) {
            this.videoRewardService.preloadRewarded();
        }
        if (this.unlockBetGroupsItem == null || (activity = this.activity) == null) {
            Log.d("UnlockBetTypesFlow", "Shop item not ready yet, waiting for offer data");
            return;
        }
        try {
            if ((activity instanceof FragmentActivity) && (findFragmentByTag = ((FragmentActivity) activity).getSupportFragmentManager().findFragmentByTag("UnlockBetGroupsDialog")) != null && findFragmentByTag.isAdded()) {
                Log.d("UnlockBetTypesFlow", "Unlock dialog already showing, skipping");
                this.progressDisplay.hideProgress();
            } else {
                this.progressDisplay.hideProgress();
                UnlockBetGroupsDialogFragment.showDialog(this.activity, this.unlockBetGroupsItem, z2, this);
            }
        } catch (Exception e2) {
            Log.e("UnlockBetTypesFlow", "Failed to show unlock dialog", e2);
            this.progressDisplay.hideProgress();
        }
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardServiceClient
    public void onVideoRewardRequestProcessed(VideoRewardService.RewardedVideoResult result, long amount) {
        if (result == VideoRewardService.RewardedVideoResult.SUCCESS) {
            this.unlockCompleted = true;
            this.videoRewardService.disconnectClient(PromoService.PromoPlacement.UNLOCK_ALL_BET_GROUPS, null);
            this.progressDisplay.hideProgress();
            this.userService.invalidate(UserService.InfoKind.GENERAL, UserService.InfoKind.PROGRESS);
            this.userService.syncProfile(UserService.InfoKind.GENERAL, UserService.InfoKind.STATS, UserService.InfoKind.PROGRESS);
            EventBus.getDefault().post(new BetsUnlockedMessage());
            this.purchaseListener.purchaseCompleted();
            return;
        }
        SnackbarHelper.showShort(this.activity, R.string.error);
    }

    @Override // org.betup.services.billing.BillingService.PurchaseListener
    public void purchaseCompleted() {
        this.unlockCompleted = true;
        this.videoRewardService.disconnectClient(PromoService.PromoPlacement.UNLOCK_ALL_BET_GROUPS, null);
        PurchasePlacement purchasePlacement = this.placement;
        PurchaseType purchaseType = PURCHASE_TYPE;
        FirebaseAnalyticsHelper.trackPurchase(purchasePlacement, purchaseType);
        trackPurchaseAnalytics();
        this.progressDisplay.hideProgress();
        ShopItemModel shopItemModel = this.unlockBetGroupsItem;
        if (shopItemModel != null) {
            this.analyticsService.sendPurchaseEvent(shopItemModel.getStoreCode(), this.placement, purchaseType);
        }
        this.purchaseListener.purchaseCompleted();
        this.userService.invalidate(UserService.InfoKind.GENERAL, UserService.InfoKind.PROGRESS);
        this.userService.syncProfile(UserService.InfoKind.GENERAL, UserService.InfoKind.STATS, UserService.InfoKind.PROGRESS);
        EventBus.getDefault().post(new BetsUnlockedMessage());
        if (this.unlockBetGroupsItem != null) {
            Activity activity = this.activity;
            PurchaseUnlockDialogFragment.showDialog(activity, activity.getString(R.string.unlock_all_bets_desc), this.unlockBetGroupsItem.getBonus());
        }
    }

    private void trackPurchaseAnalytics() {
        try {
            SharedPreferences sharedPreferences = this.activity.getSharedPreferences("analytics", 0);
            int i = sharedPreferences.getInt("purchase_count", 0);
            long j = sharedPreferences.getLong("registration_timestamp", 0L);
            int currentTimeMillis = j > 0 ? (int) ((System.currentTimeMillis() - j) / CalendarModelKt.MillisecondsIn24Hours) : 0;
            double priceAmountMicros = this.unlockBetGroupsSku != null ? ProductDetailsPrice.priceAmountMicros(r3) / 1000000.0d : 0.0d;
            String priceCurrencyCode = ProductDetailsPrice.priceCurrencyCode(this.unlockBetGroupsSku);
            if (priceCurrencyCode == null) {
                priceCurrencyCode = "USD";
            }
            String str = priceCurrencyCode;
            ShopItemModel shopItemModel = this.unlockBetGroupsItem;
            int i2 = i + 1;
            AnalyticsHelper.INSTANCE.logPurchase(UUID.randomUUID().toString(), priceAmountMicros, str, shopItemModel != null ? shopItemModel.getStoreCode() : "unlock_bet_types", i2, currentTimeMillis);
            sharedPreferences.edit().putInt("purchase_count", i2).apply();
        } catch (Exception e) {
            Log.e("UnlockBetTypesFlow", "Error tracking purchase analytics", e);
        }
    }

    @Override // org.betup.services.billing.BillingService.PurchaseListener
    public void purchaseFailed(BillingService.BillingError error) {
        this.progressDisplay.hideProgress();
        if (error == BillingService.BillingError.CANCELED) {
            return;
        }
        SnackbarHelper.showShort(this.activity, R.string.error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyBillingPrice(ShopItemModel item) {
        ProductDetails productDetails;
        String resolveSkuPrice;
        if (item == null || (productDetails = this.unlockBetGroupsSku) == null || (resolveSkuPrice = resolveSkuPrice(productDetails)) == null) {
            return;
        }
        item.setPrice(resolveSkuPrice);
    }

    private String resolveSkuPrice(ProductDetails productDetails) {
        long priceAmountMicros = ProductDetailsPrice.priceAmountMicros(productDetails);
        String priceCurrencyCode = ProductDetailsPrice.priceCurrencyCode(productDetails);
        if (priceAmountMicros > 0 && priceCurrencyCode != null && priceCurrencyCode.length() > 0) {
            return PriceFormatUtils.INSTANCE.formatPriceWithCurrencySymbol(priceAmountMicros, priceCurrencyCode);
        }
        String formattedPrice = ProductDetailsPrice.formattedPrice(productDetails);
        if (formattedPrice == null || formattedPrice.length() <= 0) {
            return null;
        }
        String ensureSymbolBeforePrice = PriceFormatUtils.INSTANCE.ensureSymbolBeforePrice(formattedPrice, priceCurrencyCode);
        return (ensureSymbolBeforePrice == null || ensureSymbolBeforePrice.length() <= 0) ? formattedPrice : ensureSymbolBeforePrice;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createFallbackShopItem() {
        ShopItemModel shopItemModel = new ShopItemModel();
        this.unlockBetGroupsItem = shopItemModel;
        shopItemModel.setStoreCode(getSkuId());
        this.unlockBetGroupsItem.setBonus(0L);
        this.unlockBetGroupsItem.setBetcoins(0L);
        this.unlockBetGroupsItem.setAvailable(true);
        applyBillingPrice(this.unlockBetGroupsItem);
    }
}

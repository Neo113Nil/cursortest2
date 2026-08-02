package org.betup.services.billing;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.material3.internal.CalendarModelKt;
import com.android.billingclient.api.ProductDetails;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import org.betup.R;
import org.betup.model.domain.ShopConstants;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.shop.NewSingleShopInteractor;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.model.remote.entity.analytics.PurchaseType;
import org.betup.model.remote.entity.shop.NewShopItemModel;
import org.betup.model.remote.entity.shop.ShopItemModel;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.analytics.FirebaseAnalyticsHelper;
import org.betup.services.billing.BillingService;
import org.betup.services.user.UserService;
import org.betup.ui.ProgressDisplay;
import org.betup.ui.dialogs.PurchaseUnlockDialogFragment;
import org.betup.ui.dialogs.UnlockBetAmountDialog;
import org.betup.utils.SnackbarHelper;

/* loaded from: classes2.dex */
public class UnlockBetAmountFlow implements PurchaseFlow, BillingService.DetailsGotListener, PurchaseConfirmationListener, BillingService.PurchaseListener {
    private static final PurchaseType purchaseType = PurchaseType.UNLOCK_BET_AMOUNT;
    private final Activity activity;
    private final AnalyticsService analyticsService;
    private final BillingService billingService;
    private final FirebaseRemoteConfig firebaseRemoteConfig;
    private final NewSingleShopInteractor newSingleShopInteractor;
    private final ProgressDisplay progressDisplay;
    private PurchaseCompletedListener purchaseListener;
    private final PurchasePlacement purchasePlacement;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewShopItemModel, String> shopItemListener = new BaseCachedSharedInteractor.OnFetchedListener<NewShopItemModel, String>() { // from class: org.betup.services.billing.UnlockBetAmountFlow.1
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<NewShopItemModel, String> responseMessage) {
            if (responseMessage.getStat() == FetchStat.SUCCESS) {
                NewShopItemModel model = responseMessage.getModel();
                UnlockBetAmountFlow.this.unlockBetAmountItem = model.toShopItemModel();
                UnlockBetAmountFlow.this.unlockBetAmountItem.setPrice(ProductDetailsPrice.formattedPrice(UnlockBetAmountFlow.this.unlockBetAmountSku));
                UnlockBetAmountDialog.showDialog(UnlockBetAmountFlow.this.activity, UnlockBetAmountFlow.this.unlockBetAmountItem, UnlockBetAmountFlow.this);
            }
        }
    };
    private ShopItemModel unlockBetAmountItem;
    private ProductDetails unlockBetAmountSku;
    private UserService userService;

    @Override // org.betup.services.billing.PurchaseConfirmationListener
    public void onVideoConfirmed() {
    }

    public UnlockBetAmountFlow(Activity activity, BillingService billingService, FirebaseRemoteConfig firebaseRemoteConfig, NewSingleShopInteractor newSingleShopInteractor, ProgressDisplay progressDisplay, PurchasePlacement purchasePlacement, AnalyticsService analyticsService, UserService userService) {
        this.activity = activity;
        this.billingService = billingService;
        this.progressDisplay = progressDisplay;
        this.newSingleShopInteractor = newSingleShopInteractor;
        this.firebaseRemoteConfig = firebaseRemoteConfig;
        this.purchasePlacement = purchasePlacement;
        this.analyticsService = analyticsService;
        this.userService = userService;
    }

    @Override // org.betup.services.billing.PurchaseFlow
    public void start(PurchaseCompletedListener purchaseListener, String... args) {
        this.purchaseListener = purchaseListener;
        this.billingService.getProductDetails(Collections.singletonList(this.firebaseRemoteConfig.getString(ShopConstants.UNLOCK_AMOUNT_SKU_KEY)), this);
    }

    @Override // org.betup.services.billing.BillingService.DetailsGotListener
    public void detailsGot(Map<String, ProductDetails> details) {
        Log.d("BUYDIALOG", "DETAILS GOT! " + details.size());
        String string = this.firebaseRemoteConfig.getString(ShopConstants.UNLOCK_AMOUNT_SKU_KEY);
        this.unlockBetAmountSku = details.get(string);
        if (details.get(string) == null) {
            return;
        }
        this.newSingleShopInteractor.load(this.shopItemListener, this.firebaseRemoteConfig.getString(ShopConstants.UNLOCK_AMOUNT_SKU_KEY));
    }

    @Override // org.betup.services.billing.PurchaseConfirmationListener
    public void onPurchaseConfirmed(String skuId) {
        this.billingService.purchaseItem(this.activity, skuId, this);
        this.progressDisplay.displayProgress();
    }

    @Override // org.betup.services.billing.PurchaseConfirmationListener
    public void onPurchaseCanceledByUser() {
        this.progressDisplay.hideProgress();
    }

    @Override // org.betup.services.billing.BillingService.PurchaseListener
    public void purchaseCompleted() {
        FirebaseAnalyticsHelper.trackPurchase(this.purchasePlacement, purchaseType);
        trackPurchaseAnalytics();
        ShopItemModel shopItemModel = this.unlockBetAmountItem;
        if (shopItemModel != null) {
            this.analyticsService.sendPurchaseEvent(shopItemModel.getStoreCode(), this.purchasePlacement, PurchaseType.PACKS);
        }
        this.progressDisplay.hideProgress();
        this.purchaseListener.purchaseCompleted();
        this.userService.invalidate(UserService.InfoKind.PROGRESS);
        this.userService.syncProfile(UserService.InfoKind.STATS);
        if (this.unlockBetAmountItem != null) {
            Activity activity = this.activity;
            PurchaseUnlockDialogFragment.showDialog(activity, activity.getString(R.string.unlock_all_bets_desc), this.unlockBetAmountItem.getBonus());
        }
    }

    private void trackPurchaseAnalytics() {
        try {
            SharedPreferences sharedPreferences = this.activity.getSharedPreferences("analytics", 0);
            int i = sharedPreferences.getInt("purchase_count", 0);
            long j = sharedPreferences.getLong("registration_timestamp", 0L);
            int currentTimeMillis = j > 0 ? (int) ((System.currentTimeMillis() - j) / CalendarModelKt.MillisecondsIn24Hours) : 0;
            double priceAmountMicros = this.unlockBetAmountSku != null ? ProductDetailsPrice.priceAmountMicros(r3) / 1000000.0d : 0.0d;
            String priceCurrencyCode = ProductDetailsPrice.priceCurrencyCode(this.unlockBetAmountSku);
            if (priceCurrencyCode == null) {
                priceCurrencyCode = "USD";
            }
            String str = priceCurrencyCode;
            ShopItemModel shopItemModel = this.unlockBetAmountItem;
            int i2 = i + 1;
            AnalyticsHelper.INSTANCE.logPurchase(UUID.randomUUID().toString(), priceAmountMicros, str, shopItemModel != null ? shopItemModel.getStoreCode() : "unlock_bet_amount", i2, currentTimeMillis);
            sharedPreferences.edit().putInt("purchase_count", i2).apply();
        } catch (Exception e) {
            Log.e("UnlockBetAmountFlow", "Error tracking purchase analytics", e);
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
}

package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public abstract class BillingClient {

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BillingResponseCode {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;
        public static final int NETWORK_ERROR = 12;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;

        @java.lang.Deprecated
        public static final int SERVICE_TIMEOUT = -3;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    public static final class Builder {
        private volatile java.lang.String zza;
        private volatile com.android.billingclient.api.PendingPurchasesParams zzb;
        private final android.content.Context zzc;
        private volatile com.android.billingclient.api.PurchasesUpdatedListener zzd;
        private volatile com.android.billingclient.api.zzck zze;
        private volatile com.android.billingclient.api.zzcc zzf;
        private volatile com.android.billingclient.api.zzc zzg;
        private volatile com.android.billingclient.api.UserChoiceBillingListener zzh;
        private volatile java.util.concurrent.ExecutorService zzi;
        private volatile boolean zzj;
        private volatile boolean zzk;
        private volatile boolean zzl;

        /* synthetic */ Builder(android.content.Context context, com.android.billingclient.api.zzp zzpVar) {
            this.zzc = context;
        }

        public com.android.billingclient.api.BillingClient build() {
            if (this.zzc == null) {
                throw new java.lang.IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.zzd != null) {
                if (this.zzb == null || !this.zzb.isEnabledForOneTimeProducts()) {
                    throw new java.lang.IllegalArgumentException("Pending purchases for one-time products must be supported.");
                }
                return this.zzd != null ? this.zzh == null ? new com.android.billingclient.api.BillingClientImpl((java.lang.String) null, this.zzb, this.zzc, this.zzd, (com.android.billingclient.api.zzc) null, (com.android.billingclient.api.zzcc) null, (java.util.concurrent.ExecutorService) null) : new com.android.billingclient.api.BillingClientImpl((java.lang.String) null, this.zzb, this.zzc, this.zzd, this.zzh, (com.android.billingclient.api.zzcc) null, (java.util.concurrent.ExecutorService) null) : new com.android.billingclient.api.BillingClientImpl(null, this.zzb, this.zzc, null, null, null);
            }
            if (this.zzh != null) {
                throw new java.lang.IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
            }
            if (this.zzj || this.zzk) {
                return new com.android.billingclient.api.BillingClientImpl(null, this.zzc, null, null);
            }
            throw new java.lang.IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }

        public com.android.billingclient.api.BillingClient.Builder enableAlternativeBillingOnly() {
            this.zzj = true;
            return this;
        }

        public com.android.billingclient.api.BillingClient.Builder enableExternalOffer() {
            this.zzk = true;
            return this;
        }

        @java.lang.Deprecated
        public com.android.billingclient.api.BillingClient.Builder enablePendingPurchases() {
            com.android.billingclient.api.PendingPurchasesParams.Builder newBuilder = com.android.billingclient.api.PendingPurchasesParams.newBuilder();
            newBuilder.enableOneTimeProducts();
            enablePendingPurchases(newBuilder.build());
            return this;
        }

        public com.android.billingclient.api.BillingClient.Builder enablePendingPurchases(com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams) {
            this.zzb = pendingPurchasesParams;
            return this;
        }

        public com.android.billingclient.api.BillingClient.Builder enableUserChoiceBilling(com.android.billingclient.api.UserChoiceBillingListener userChoiceBillingListener) {
            this.zzh = userChoiceBillingListener;
            return this;
        }

        public com.android.billingclient.api.BillingClient.Builder setListener(com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener) {
            this.zzd = purchasesUpdatedListener;
            return this;
        }
    }

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ConnectionState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FeatureType {
        public static final java.lang.String ALTERNATIVE_BILLING_ONLY = "jjj";
        public static final java.lang.String BILLING_CONFIG = "ggg";
        public static final java.lang.String EXTERNAL_OFFER = "kkk";
        public static final java.lang.String IN_APP_MESSAGING = "bbb";
        public static final java.lang.String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";
        public static final java.lang.String PRODUCT_DETAILS = "fff";
        public static final java.lang.String SUBSCRIPTIONS = "subscriptions";
        public static final java.lang.String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
    }

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ProductType {
        public static final java.lang.String INAPP = "inapp";
        public static final java.lang.String SUBS = "subs";
    }

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.Deprecated
    public @interface SkuType {
        public static final java.lang.String INAPP = "inapp";
        public static final java.lang.String SUBS = "subs";
    }

    public static com.android.billingclient.api.BillingClient.Builder newBuilder(android.content.Context context) {
        return new com.android.billingclient.api.BillingClient.Builder(context, null);
    }

    public abstract void acknowledgePurchase(com.android.billingclient.api.AcknowledgePurchaseParams acknowledgePurchaseParams, com.android.billingclient.api.AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);

    public abstract void consumeAsync(com.android.billingclient.api.ConsumeParams consumeParams, com.android.billingclient.api.ConsumeResponseListener consumeResponseListener);

    public abstract void createAlternativeBillingOnlyReportingDetailsAsync(com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener);

    public abstract void createExternalOfferReportingDetailsAsync(com.android.billingclient.api.ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener);

    public abstract void endConnection();

    public abstract void getBillingConfigAsync(com.android.billingclient.api.GetBillingConfigParams getBillingConfigParams, com.android.billingclient.api.BillingConfigResponseListener billingConfigResponseListener);

    public abstract int getConnectionState();

    public abstract void isAlternativeBillingOnlyAvailableAsync(com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener);

    public abstract void isExternalOfferAvailableAsync(com.android.billingclient.api.ExternalOfferAvailabilityListener externalOfferAvailabilityListener);

    public abstract com.android.billingclient.api.BillingResult isFeatureSupported(java.lang.String str);

    public abstract boolean isReady();

    public abstract com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity activity, com.android.billingclient.api.BillingFlowParams billingFlowParams);

    public abstract void queryProductDetailsAsync(com.android.billingclient.api.QueryProductDetailsParams queryProductDetailsParams, com.android.billingclient.api.ProductDetailsResponseListener productDetailsResponseListener);

    @java.lang.Deprecated
    public abstract void queryPurchaseHistoryAsync(com.android.billingclient.api.QueryPurchaseHistoryParams queryPurchaseHistoryParams, com.android.billingclient.api.PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    @java.lang.Deprecated
    public abstract void queryPurchaseHistoryAsync(java.lang.String str, com.android.billingclient.api.PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    public abstract void queryPurchasesAsync(com.android.billingclient.api.QueryPurchasesParams queryPurchasesParams, com.android.billingclient.api.PurchasesResponseListener purchasesResponseListener);

    @java.lang.Deprecated
    public abstract void queryPurchasesAsync(java.lang.String str, com.android.billingclient.api.PurchasesResponseListener purchasesResponseListener);

    @java.lang.Deprecated
    public abstract void querySkuDetailsAsync(com.android.billingclient.api.SkuDetailsParams skuDetailsParams, com.android.billingclient.api.SkuDetailsResponseListener skuDetailsResponseListener);

    public abstract com.android.billingclient.api.BillingResult showAlternativeBillingOnlyInformationDialog(android.app.Activity activity, com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener);

    public abstract com.android.billingclient.api.BillingResult showExternalOfferInformationDialog(android.app.Activity activity, com.android.billingclient.api.ExternalOfferInformationDialogListener externalOfferInformationDialogListener);

    public abstract com.android.billingclient.api.BillingResult showInAppMessages(android.app.Activity activity, com.android.billingclient.api.InAppMessageParams inAppMessageParams, com.android.billingclient.api.InAppMessageResponseListener inAppMessageResponseListener);

    public abstract void startConnection(com.android.billingclient.api.BillingClientStateListener billingClientStateListener);
}

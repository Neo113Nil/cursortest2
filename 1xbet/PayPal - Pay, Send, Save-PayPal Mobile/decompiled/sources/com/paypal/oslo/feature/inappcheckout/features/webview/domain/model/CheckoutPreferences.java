package com.paypal.oslo.feature.inappcheckout.features.webview.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.CHECKOUT_URLS_KEY, "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;", "apiMerchantIntegrationChannel", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;", "merchantDetails", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", "getCheckoutURLs", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;", "getApiMerchantIntegrationChannel", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;", "getMerchantDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CheckoutPreferences {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration apiMerchantIntegrationChannel;
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs checkoutURLs;
    private final com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails;

    public CheckoutPreferences(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs checkoutURLs, com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration apiIntegration, com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutURLs, "");
        this.checkoutURLs = checkoutURLs;
        this.apiMerchantIntegrationChannel = apiIntegration;
        this.merchantDetails = merchantDetails;
    }

    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs getCheckoutURLs() {
        return this.checkoutURLs;
    }

    public final com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration getApiMerchantIntegrationChannel() {
        return this.apiMerchantIntegrationChannel;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails getMerchantDetails() {
        return this.merchantDetails;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs checkoutURLs = this.checkoutURLs;
        com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration apiIntegration = this.apiMerchantIntegrationChannel;
        com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails = this.merchantDetails;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CheckoutPreferences(checkoutURLs=");
        sb.append(checkoutURLs);
        sb.append(", apiMerchantIntegrationChannel=");
        sb.append(apiIntegration);
        sb.append(", merchantDetails=");
        sb.append(merchantDetails);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.checkoutURLs.hashCode();
        com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration apiIntegration = this.apiMerchantIntegrationChannel;
        int hashCode2 = apiIntegration == null ? 0 : apiIntegration.hashCode();
        com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails = this.merchantDetails;
        return (((hashCode * 31) + hashCode2) * 31) + (merchantDetails != null ? merchantDetails.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutURLs, checkoutPreferences.checkoutURLs) && kotlin.jvm.internal.Intrinsics.areEqual(this.apiMerchantIntegrationChannel, checkoutPreferences.apiMerchantIntegrationChannel) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantDetails, checkoutPreferences.merchantDetails);
    }

    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences copy(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs checkoutURLs, com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration apiMerchantIntegrationChannel, com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutURLs, "");
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences(checkoutURLs, apiMerchantIntegrationChannel, merchantDetails);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails getMerchantDetails() {
        return this.merchantDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration getApiMerchantIntegrationChannel() {
        return this.apiMerchantIntegrationChannel;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs getCheckoutURLs() {
        return this.checkoutURLs;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences copy$default(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs checkoutURLs, com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration apiIntegration, com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            checkoutURLs = checkoutPreferences.checkoutURLs;
        }
        if ((i & 2) != 0) {
            apiIntegration = checkoutPreferences.apiMerchantIntegrationChannel;
        }
        if ((i & 4) != 0) {
            merchantDetails = checkoutPreferences.merchantDetails;
        }
        return checkoutPreferences.copy(checkoutURLs, apiIntegration, merchantDetails);
    }
}

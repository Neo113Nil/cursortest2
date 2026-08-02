package com.paypal.oslo.feature.inappcheckout.features.webview.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationData;", "", "", com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingExtensionsKt.KeyAuthCodeParam, "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;", "checkoutPreferences", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAuthCode", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;", "getCheckoutPreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OneShotAuthenticationData {
    public static final int $stable = 8;
    private final java.lang.String authCode;
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences;

    public OneShotAuthenticationData(java.lang.String str, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutPreferences, "");
        this.authCode = str;
        this.checkoutPreferences = checkoutPreferences;
    }

    public final java.lang.String getAuthCode() {
        return this.authCode;
    }

    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences getCheckoutPreferences() {
        return this.checkoutPreferences;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.authCode;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences = this.checkoutPreferences;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OneShotAuthenticationData(authCode=");
        sb.append(str);
        sb.append(", checkoutPreferences=");
        sb.append(checkoutPreferences);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.authCode;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.checkoutPreferences.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationData)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationData oneShotAuthenticationData = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.authCode, oneShotAuthenticationData.authCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutPreferences, oneShotAuthenticationData.checkoutPreferences);
    }

    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationData copy(java.lang.String authCode, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutPreferences, "");
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationData(authCode, checkoutPreferences);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences getCheckoutPreferences() {
        return this.checkoutPreferences;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAuthCode() {
        return this.authCode;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationData copy$default(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationData oneShotAuthenticationData, java.lang.String str, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = oneShotAuthenticationData.authCode;
        }
        if ((i & 2) != 0) {
            checkoutPreferences = oneShotAuthenticationData.checkoutPreferences;
        }
        return oneShotAuthenticationData.copy(str, checkoutPreferences);
    }
}

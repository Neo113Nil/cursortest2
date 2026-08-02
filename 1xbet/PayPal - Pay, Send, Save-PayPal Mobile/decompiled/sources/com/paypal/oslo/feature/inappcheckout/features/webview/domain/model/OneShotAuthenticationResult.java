package com.paypal.oslo.feature.inappcheckout.features.webview.domain.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0011\u0010 \u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\"\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationResult;", "", "", com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingExtensionsKt.KeyAuthCodeParam, "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;", "checkoutPreferences", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "nativeRYP", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAuthCode", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;", "getCheckoutPreferences", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "getNativeRYP", "isWebFlow", "()Z", "isNativeFlow"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OneShotAuthenticationResult {
    public static final int $stable = 8;
    private final java.lang.String authCode;
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences;
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse nativeRYP;

    public OneShotAuthenticationResult(java.lang.String str, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
        this.authCode = str;
        this.checkoutPreferences = checkoutPreferences;
        this.nativeRYP = authenticationXOResponse;
    }

    public /* synthetic */ OneShotAuthenticationResult(java.lang.String str, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, checkoutPreferences, (i & 4) != 0 ? null : authenticationXOResponse);
    }

    public final java.lang.String getAuthCode() {
        return this.authCode;
    }

    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences getCheckoutPreferences() {
        return this.checkoutPreferences;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getNativeRYP() {
        return this.nativeRYP;
    }

    public final boolean isWebFlow() {
        return (this.authCode == null || this.checkoutPreferences == null) ? false : true;
    }

    public final boolean isNativeFlow() {
        return this.nativeRYP != null;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.authCode;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences = this.checkoutPreferences;
        com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = this.nativeRYP;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OneShotAuthenticationResult(authCode=");
        sb.append(str);
        sb.append(", checkoutPreferences=");
        sb.append(checkoutPreferences);
        sb.append(", nativeRYP=");
        sb.append(authenticationXOResponse);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.authCode;
        int hashCode = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences = this.checkoutPreferences;
        int hashCode2 = checkoutPreferences == null ? 0 : checkoutPreferences.hashCode();
        com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = this.nativeRYP;
        return (((hashCode * 31) + hashCode2) * 31) + (authenticationXOResponse != null ? authenticationXOResponse.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult oneShotAuthenticationResult = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.authCode, oneShotAuthenticationResult.authCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutPreferences, oneShotAuthenticationResult.checkoutPreferences) && kotlin.jvm.internal.Intrinsics.areEqual(this.nativeRYP, oneShotAuthenticationResult.nativeRYP);
    }

    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult copy(java.lang.String authCode, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse nativeRYP) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult(authCode, checkoutPreferences, nativeRYP);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getNativeRYP() {
        return this.nativeRYP;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences getCheckoutPreferences() {
        return this.checkoutPreferences;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAuthCode() {
        return this.authCode;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult copy$default(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult oneShotAuthenticationResult, java.lang.String str, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = oneShotAuthenticationResult.authCode;
        }
        if ((i & 2) != 0) {
            checkoutPreferences = oneShotAuthenticationResult.checkoutPreferences;
        }
        if ((i & 4) != 0) {
            authenticationXOResponse = oneShotAuthenticationResult.nativeRYP;
        }
        return oneShotAuthenticationResult.copy(str, checkoutPreferences, authenticationXOResponse);
    }
}

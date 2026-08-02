package com.paypal.oslo.feature.paymentauth.api.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthRequest;", "", "", "authPayload", "", "allowedCapabilities", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthUICustomization;", "uiCustomization", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthUICustomization;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthUICustomization;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthUICustomization;)Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAuthPayload", "Ljava/util/List;", "getAllowedCapabilities", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthUICustomization;", "getUiCustomization"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentAuthRequest {
    public static final int $stable = 8;
    private final java.util.List<java.lang.String> allowedCapabilities;
    private final java.lang.String authPayload;
    private final com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthUICustomization uiCustomization;

    public PaymentAuthRequest(java.lang.String str, java.util.List<java.lang.String> list, com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthUICustomization paymentAuthUICustomization) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.authPayload = str;
        this.allowedCapabilities = list;
        this.uiCustomization = paymentAuthUICustomization;
    }

    public final java.lang.String getAuthPayload() {
        return this.authPayload;
    }

    public final java.util.List<java.lang.String> getAllowedCapabilities() {
        return this.allowedCapabilities;
    }

    public final com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthUICustomization getUiCustomization() {
        return this.uiCustomization;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.authPayload;
        java.util.List<java.lang.String> list = this.allowedCapabilities;
        com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthUICustomization paymentAuthUICustomization = this.uiCustomization;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentAuthRequest(authPayload=");
        sb.append(str);
        sb.append(", allowedCapabilities=");
        sb.append(list);
        sb.append(", uiCustomization=");
        sb.append(paymentAuthUICustomization);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.authPayload.hashCode();
        int hashCode2 = this.allowedCapabilities.hashCode();
        com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthUICustomization paymentAuthUICustomization = this.uiCustomization;
        return (((hashCode * 31) + hashCode2) * 31) + (paymentAuthUICustomization == null ? 0 : paymentAuthUICustomization.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthRequest)) {
            return false;
        }
        com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthRequest paymentAuthRequest = (com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.authPayload, paymentAuthRequest.authPayload) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowedCapabilities, paymentAuthRequest.allowedCapabilities) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiCustomization, paymentAuthRequest.uiCustomization);
    }

    public final com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthRequest copy(java.lang.String authPayload, java.util.List<java.lang.String> allowedCapabilities, com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthUICustomization uiCustomization) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authPayload, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowedCapabilities, "");
        return new com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthRequest(authPayload, allowedCapabilities, uiCustomization);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthUICustomization getUiCustomization() {
        return this.uiCustomization;
    }

    public final java.util.List<java.lang.String> component2() {
        return this.allowedCapabilities;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAuthPayload() {
        return this.authPayload;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthRequest copy$default(com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthRequest paymentAuthRequest, java.lang.String str, java.util.List list, com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthUICustomization paymentAuthUICustomization, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = paymentAuthRequest.authPayload;
        }
        if ((i & 2) != 0) {
            list = paymentAuthRequest.allowedCapabilities;
        }
        if ((i & 4) != 0) {
            paymentAuthUICustomization = paymentAuthRequest.uiCustomization;
        }
        return paymentAuthRequest.copy(str, list, paymentAuthUICustomization);
    }
}

package com.paypal.oslo.feature.checkcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureSessionDetails;", "", "Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureCustomer;", "customer", "", "sessionId", "ssoToken", "<init>", "(Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureCustomer;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureCustomer;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureCustomer;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureSessionDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureCustomer;", "getCustomer", "Ljava/lang/String;", "getSessionId", "getSsoToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CheckCaptureSessionDetails {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomer customer;
    private final java.lang.String sessionId;
    private final java.lang.String ssoToken;

    public CheckCaptureSessionDetails(com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomer checkCaptureCustomer, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCaptureCustomer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.customer = checkCaptureCustomer;
        this.sessionId = str;
        this.ssoToken = str2;
        if (kotlin.text.StringsKt.isBlank(str)) {
            throw new java.lang.IllegalArgumentException("Session ID cannot be blank".toString());
        }
        if (kotlin.text.StringsKt.isBlank(str2)) {
            throw new java.lang.IllegalArgumentException("SSO token cannot be blank".toString());
        }
    }

    public final com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomer getCustomer() {
        return this.customer;
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final java.lang.String getSsoToken() {
        return this.ssoToken;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomer checkCaptureCustomer = this.customer;
        java.lang.String str = this.sessionId;
        java.lang.String str2 = this.ssoToken;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CheckCaptureSessionDetails(customer=");
        sb.append(checkCaptureCustomer);
        sb.append(", sessionId=");
        sb.append(str);
        sb.append(", ssoToken=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.customer.hashCode() * 31) + this.sessionId.hashCode()) * 31) + this.ssoToken.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails)) {
            return false;
        }
        com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails checkCaptureSessionDetails = (com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.customer, checkCaptureSessionDetails.customer) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, checkCaptureSessionDetails.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.ssoToken, checkCaptureSessionDetails.ssoToken);
    }

    public final com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails copy(com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomer customer, java.lang.String sessionId, java.lang.String ssoToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ssoToken, "");
        return new com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails(customer, sessionId, ssoToken);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSsoToken() {
        return this.ssoToken;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomer getCustomer() {
        return this.customer;
    }

    public static /* synthetic */ com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails copy$default(com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails checkCaptureSessionDetails, com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomer checkCaptureCustomer, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            checkCaptureCustomer = checkCaptureSessionDetails.customer;
        }
        if ((i & 2) != 0) {
            str = checkCaptureSessionDetails.sessionId;
        }
        if ((i & 4) != 0) {
            str2 = checkCaptureSessionDetails.ssoToken;
        }
        return checkCaptureSessionDetails.copy(checkCaptureCustomer, str, str2);
    }
}

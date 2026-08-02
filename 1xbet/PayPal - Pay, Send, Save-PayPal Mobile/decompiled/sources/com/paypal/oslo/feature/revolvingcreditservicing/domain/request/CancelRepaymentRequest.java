package com.paypal.oslo.feature.revolvingcreditservicing.domain.request;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/CancelRepaymentRequest;", "", "", "creditAccountId", "paymentId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/CancelRepaymentRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "getPaymentId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CancelRepaymentRequest {
    public static final int $stable = 0;
    private final java.lang.String creditAccountId;
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
    private final java.lang.String paymentId;

    public CancelRepaymentRequest(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        this.creditAccountId = str;
        this.paymentId = str2;
        this.creditProductIdentifier = creditProductIdentifier;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.lang.String getPaymentId() {
        return this.paymentId;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.creditAccountId;
        java.lang.String str2 = this.paymentId;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelRepaymentRequest(creditAccountId=");
        sb.append(str);
        sb.append(", paymentId=");
        sb.append(str2);
        sb.append(", creditProductIdentifier=");
        sb.append(creditProductIdentifier);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.creditAccountId.hashCode() * 31) + this.paymentId.hashCode()) * 31) + this.creditProductIdentifier.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest cancelRepaymentRequest = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, cancelRepaymentRequest.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentId, cancelRepaymentRequest.paymentId) && this.creditProductIdentifier == cancelRepaymentRequest.creditProductIdentifier;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest copy(java.lang.String creditAccountId, java.lang.String paymentId, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest(creditAccountId, paymentId, creditProductIdentifier);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPaymentId() {
        return this.paymentId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest cancelRepaymentRequest, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cancelRepaymentRequest.creditAccountId;
        }
        if ((i & 2) != 0) {
            str2 = cancelRepaymentRequest.paymentId;
        }
        if ((i & 4) != 0) {
            creditProductIdentifier = cancelRepaymentRequest.creditProductIdentifier;
        }
        return cancelRepaymentRequest.copy(str, str2, creditProductIdentifier);
    }
}

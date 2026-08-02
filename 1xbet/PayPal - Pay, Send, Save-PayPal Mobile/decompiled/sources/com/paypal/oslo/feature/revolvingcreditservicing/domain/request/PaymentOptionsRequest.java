package com.paypal.oslo.feature.revolvingcreditservicing.domain.request;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/PaymentOptionsRequest;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "creditAccountId", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/makepayment/PaymentConstraintsType;", "paymentConstraintsTypes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/makepayment/PaymentType;", "paymentTypes", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/PaymentOptionsRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/lang/String;", "getCreditAccountId", "Ljava/util/List;", "getPaymentConstraintsTypes", "getPaymentTypes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PaymentOptionsRequest {
    public static final int $stable = 8;
    private final java.lang.String creditAccountId;
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType> paymentConstraintsTypes;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType> paymentTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentOptionsRequest(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType> list, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.creditProductIdentifier = creditProductIdentifier;
        this.creditAccountId = str;
        this.paymentConstraintsTypes = list;
        this.paymentTypes = list2;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType> getPaymentConstraintsTypes() {
        return this.paymentConstraintsTypes;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType> getPaymentTypes() {
        return this.paymentTypes;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
        java.lang.String str = this.creditAccountId;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType> list = this.paymentConstraintsTypes;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType> list2 = this.paymentTypes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentOptionsRequest(creditProductIdentifier=");
        sb.append(creditProductIdentifier);
        sb.append(", creditAccountId=");
        sb.append(str);
        sb.append(", paymentConstraintsTypes=");
        sb.append(list);
        sb.append(", paymentTypes=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.creditProductIdentifier.hashCode();
        java.lang.String str = this.creditAccountId;
        return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.paymentConstraintsTypes.hashCode()) * 31) + this.paymentTypes.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest paymentOptionsRequest = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest) other;
        return this.creditProductIdentifier == paymentOptionsRequest.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, paymentOptionsRequest.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentConstraintsTypes, paymentOptionsRequest.paymentConstraintsTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTypes, paymentOptionsRequest.paymentTypes);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String creditAccountId, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType> paymentConstraintsTypes, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType> paymentTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentConstraintsTypes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTypes, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest(creditProductIdentifier, creditAccountId, paymentConstraintsTypes, paymentTypes);
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType> component4() {
        return this.paymentTypes;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType> component3() {
        return this.paymentConstraintsTypes;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest paymentOptionsRequest, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            creditProductIdentifier = paymentOptionsRequest.creditProductIdentifier;
        }
        if ((i & 2) != 0) {
            str = paymentOptionsRequest.creditAccountId;
        }
        if ((i & 4) != 0) {
            list = paymentOptionsRequest.paymentConstraintsTypes;
        }
        if ((i & 8) != 0) {
            list2 = paymentOptionsRequest.paymentTypes;
        }
        return paymentOptionsRequest.copy(creditProductIdentifier, str, list, list2);
    }
}

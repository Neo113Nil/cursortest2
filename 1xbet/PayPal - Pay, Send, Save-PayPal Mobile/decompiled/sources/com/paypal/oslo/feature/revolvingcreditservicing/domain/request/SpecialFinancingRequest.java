package com.paypal.oslo.feature.revolvingcreditservicing.domain.request;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/SpecialFinancingRequest;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "creditAccountId", "", "offset", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;I)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component2", "()Ljava/lang/String;", "component3", "()I", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;I)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/SpecialFinancingRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/lang/String;", "getCreditAccountId", com.visa.cbp.getEncExpo.warmup, "getOffset"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SpecialFinancingRequest {
    public static final int $stable = 0;
    private final java.lang.String creditAccountId;
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
    private final int offset;

    public SpecialFinancingRequest(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        this.creditProductIdentifier = creditProductIdentifier;
        this.creditAccountId = str;
        this.offset = i;
    }

    public /* synthetic */ SpecialFinancingRequest(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(creditProductIdentifier, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
        java.lang.String str = this.creditAccountId;
        int i = this.offset;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SpecialFinancingRequest(creditProductIdentifier=");
        sb.append(creditProductIdentifier);
        sb.append(", creditAccountId=");
        sb.append(str);
        sb.append(", offset=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.creditProductIdentifier.hashCode();
        java.lang.String str = this.creditAccountId;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.offset);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.request.SpecialFinancingRequest)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.SpecialFinancingRequest specialFinancingRequest = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.SpecialFinancingRequest) other;
        return this.creditProductIdentifier == specialFinancingRequest.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, specialFinancingRequest.creditAccountId) && this.offset == specialFinancingRequest.offset;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.SpecialFinancingRequest copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String creditAccountId, int offset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.SpecialFinancingRequest(creditProductIdentifier, creditAccountId, offset);
    }

    /* renamed from: component3, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.request.SpecialFinancingRequest copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.SpecialFinancingRequest specialFinancingRequest, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            creditProductIdentifier = specialFinancingRequest.creditProductIdentifier;
        }
        if ((i2 & 2) != 0) {
            str = specialFinancingRequest.creditAccountId;
        }
        if ((i2 & 4) != 0) {
            i = specialFinancingRequest.offset;
        }
        return specialFinancingRequest.copy(creditProductIdentifier, str, i);
    }
}

package com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/input/MakeAPaymentEligibleFiInput;", "", "", "creditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "creditProductIdentifier", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/input/MakeAPaymentEligibleFiInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCreditProductIdentifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MakeAPaymentEligibleFiInput {
    public static final int $stable = 0;
    private final java.lang.String creditAccountId;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier;

    public MakeAPaymentEligibleFiInput(java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.creditAccountId = str;
        this.creditProductIdentifier = creditProductIdentifier;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.creditAccountId;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MakeAPaymentEligibleFiInput(creditAccountId=");
        sb.append(str);
        sb.append(", creditProductIdentifier=");
        sb.append(creditProductIdentifier);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.creditAccountId.hashCode();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
        return (hashCode * 31) + (creditProductIdentifier == null ? 0 : creditProductIdentifier.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentEligibleFiInput)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentEligibleFiInput makeAPaymentEligibleFiInput = (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentEligibleFiInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, makeAPaymentEligibleFiInput.creditAccountId) && this.creditProductIdentifier == makeAPaymentEligibleFiInput.creditProductIdentifier;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentEligibleFiInput copy(java.lang.String creditAccountId, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentEligibleFiInput(creditAccountId, creditProductIdentifier);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentEligibleFiInput copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentEligibleFiInput makeAPaymentEligibleFiInput, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = makeAPaymentEligibleFiInput.creditAccountId;
        }
        if ((i & 2) != 0) {
            creditProductIdentifier = makeAPaymentEligibleFiInput.creditProductIdentifier;
        }
        return makeAPaymentEligibleFiInput.copy(str, creditProductIdentifier);
    }
}

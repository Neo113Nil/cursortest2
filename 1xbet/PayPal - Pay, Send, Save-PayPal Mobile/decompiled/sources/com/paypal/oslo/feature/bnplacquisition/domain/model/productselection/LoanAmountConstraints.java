package com.paypal.oslo.feature.bnplacquisition.domain.model.productselection;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/LoanAmountConstraints;", "", "", "maxAllowedCharacters", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "maxAmount", "minAmount", "<init>", "(ILcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;)V", "component1", "()I", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "component3", "copy", "(ILcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/LoanAmountConstraints;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMaxAllowedCharacters", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "getMaxAmount", "getMinAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LoanAmountConstraints {
    public static final int $stable = 0;
    private final int maxAllowedCharacters;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money maxAmount;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money minAmount;

    public LoanAmountConstraints(int i, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money2, "");
        this.maxAllowedCharacters = i;
        this.maxAmount = money;
        this.minAmount = money2;
    }

    public final int getMaxAllowedCharacters() {
        return this.maxAllowedCharacters;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getMaxAmount() {
        return this.maxAmount;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getMinAmount() {
        return this.minAmount;
    }

    public final java.lang.String toString() {
        int i = this.maxAllowedCharacters;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = this.maxAmount;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money2 = this.minAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LoanAmountConstraints(maxAllowedCharacters=");
        sb.append(i);
        sb.append(", maxAmount=");
        sb.append(money);
        sb.append(", minAmount=");
        sb.append(money2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.maxAllowedCharacters) * 31) + this.maxAmount.hashCode()) * 31) + this.minAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.LoanAmountConstraints)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.LoanAmountConstraints loanAmountConstraints = (com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.LoanAmountConstraints) other;
        return this.maxAllowedCharacters == loanAmountConstraints.maxAllowedCharacters && kotlin.jvm.internal.Intrinsics.areEqual(this.maxAmount, loanAmountConstraints.maxAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.minAmount, loanAmountConstraints.minAmount);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.LoanAmountConstraints copy(int maxAllowedCharacters, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money maxAmount, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money minAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minAmount, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.LoanAmountConstraints(maxAllowedCharacters, maxAmount, minAmount);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getMinAmount() {
        return this.minAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getMaxAmount() {
        return this.maxAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxAllowedCharacters() {
        return this.maxAllowedCharacters;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.LoanAmountConstraints copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.LoanAmountConstraints loanAmountConstraints, int i, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = loanAmountConstraints.maxAllowedCharacters;
        }
        if ((i2 & 2) != 0) {
            money = loanAmountConstraints.maxAmount;
        }
        if ((i2 & 4) != 0) {
            money2 = loanAmountConstraints.minAmount;
        }
        return loanAmountConstraints.copy(i, money, money2);
    }
}

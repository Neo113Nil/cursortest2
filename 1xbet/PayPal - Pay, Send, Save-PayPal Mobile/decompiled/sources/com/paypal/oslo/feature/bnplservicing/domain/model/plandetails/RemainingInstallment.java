package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/RemainingInstallment;", "", "", "dueDate", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "amount", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentDerivedStatus;", "derivedStatus", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentDerivedStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentDerivedStatus;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentDerivedStatus;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/RemainingInstallment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDueDate", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "getAmount", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentDerivedStatus;", "getDerivedStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RemainingInstallment {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money amount;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus derivedStatus;
    private final java.lang.String dueDate;

    public RemainingInstallment(java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus installmentDerivedStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(installmentDerivedStatus, "");
        this.dueDate = str;
        this.amount = money;
        this.derivedStatus = installmentDerivedStatus;
    }

    public final java.lang.String getDueDate() {
        return this.dueDate;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getAmount() {
        return this.amount;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus getDerivedStatus() {
        return this.derivedStatus;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.dueDate;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.amount;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus installmentDerivedStatus = this.derivedStatus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RemainingInstallment(dueDate=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(money);
        sb.append(", derivedStatus=");
        sb.append(installmentDerivedStatus);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.dueDate.hashCode() * 31) + this.amount.hashCode()) * 31) + this.derivedStatus.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.RemainingInstallment)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.RemainingInstallment remainingInstallment = (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.RemainingInstallment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dueDate, remainingInstallment.dueDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, remainingInstallment.amount) && this.derivedStatus == remainingInstallment.derivedStatus;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.RemainingInstallment copy(java.lang.String dueDate, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money amount, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus derivedStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dueDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(derivedStatus, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.RemainingInstallment(dueDate, amount, derivedStatus);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus getDerivedStatus() {
        return this.derivedStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDueDate() {
        return this.dueDate;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.RemainingInstallment copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.RemainingInstallment remainingInstallment, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus installmentDerivedStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = remainingInstallment.dueDate;
        }
        if ((i & 2) != 0) {
            money = remainingInstallment.amount;
        }
        if ((i & 4) != 0) {
            installmentDerivedStatus = remainingInstallment.derivedStatus;
        }
        return remainingInstallment.copy(str, money, installmentDerivedStatus);
    }
}

package com.paypal.oslo.feature.bnplacquisition.domain.model.repayments;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/SelectedOffer;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "periodicPaymentAmount", "", "installmentCount", "", "firstPaymentDate", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;ILjava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "component2", "()I", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;ILjava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/SelectedOffer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "getPeriodicPaymentAmount", com.visa.cbp.getEncExpo.warmup, "getInstallmentCount", "Ljava/lang/String;", "getFirstPaymentDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectedOffer {
    public static final int $stable = 0;
    private final java.lang.String firstPaymentDate;
    private final int installmentCount;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money periodicPaymentAmount;

    public SelectedOffer(com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, int i, java.lang.String str) {
        this.periodicPaymentAmount = money;
        this.installmentCount = i;
        this.firstPaymentDate = str;
    }

    public /* synthetic */ SelectedOffer(com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, int i, java.lang.String str, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : money, i, (i2 & 4) != 0 ? null : str);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getPeriodicPaymentAmount() {
        return this.periodicPaymentAmount;
    }

    public final int getInstallmentCount() {
        return this.installmentCount;
    }

    public final java.lang.String getFirstPaymentDate() {
        return this.firstPaymentDate;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = this.periodicPaymentAmount;
        int i = this.installmentCount;
        java.lang.String str = this.firstPaymentDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectedOffer(periodicPaymentAmount=");
        sb.append(money);
        sb.append(", installmentCount=");
        sb.append(i);
        sb.append(", firstPaymentDate=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = this.periodicPaymentAmount;
        int hashCode = money == null ? 0 : money.hashCode();
        int hashCode2 = java.lang.Integer.hashCode(this.installmentCount);
        java.lang.String str = this.firstPaymentDate;
        return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.SelectedOffer)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.SelectedOffer selectedOffer = (com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.SelectedOffer) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.periodicPaymentAmount, selectedOffer.periodicPaymentAmount) && this.installmentCount == selectedOffer.installmentCount && kotlin.jvm.internal.Intrinsics.areEqual(this.firstPaymentDate, selectedOffer.firstPaymentDate);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.SelectedOffer copy(com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money periodicPaymentAmount, int installmentCount, java.lang.String firstPaymentDate) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.SelectedOffer(periodicPaymentAmount, installmentCount, firstPaymentDate);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFirstPaymentDate() {
        return this.firstPaymentDate;
    }

    /* renamed from: component2, reason: from getter */
    public final int getInstallmentCount() {
        return this.installmentCount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getPeriodicPaymentAmount() {
        return this.periodicPaymentAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.SelectedOffer copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.SelectedOffer selectedOffer, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            money = selectedOffer.periodicPaymentAmount;
        }
        if ((i2 & 2) != 0) {
            i = selectedOffer.installmentCount;
        }
        if ((i2 & 4) != 0) {
            str = selectedOffer.firstPaymentDate;
        }
        return selectedOffer.copy(money, i, str);
    }
}

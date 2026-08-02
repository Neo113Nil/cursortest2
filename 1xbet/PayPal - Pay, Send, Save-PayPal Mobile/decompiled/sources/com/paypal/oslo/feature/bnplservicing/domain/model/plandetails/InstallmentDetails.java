package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJF\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentDetails;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "paidAmount", "totalRemainingAmount", "", "totalInstallmentsCount", "totalInstallmentsPaid", "totalInstallmentsRemaining", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;III)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "component2", "component3", "()I", "component4", "component5", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;III)Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "getPaidAmount", "getTotalRemainingAmount", com.visa.cbp.getEncExpo.warmup, "getTotalInstallmentsCount", "getTotalInstallmentsPaid", "getTotalInstallmentsRemaining"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InstallmentDetails {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money paidAmount;
    private final int totalInstallmentsCount;
    private final int totalInstallmentsPaid;
    private final int totalInstallmentsRemaining;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money totalRemainingAmount;

    public InstallmentDetails(com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2, int i, int i2, int i3) {
        this.paidAmount = money;
        this.totalRemainingAmount = money2;
        this.totalInstallmentsCount = i;
        this.totalInstallmentsPaid = i2;
        this.totalInstallmentsRemaining = i3;
    }

    public /* synthetic */ InstallmentDetails(com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2, int i, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : money, (i4 & 2) == 0 ? money2 : null, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getPaidAmount() {
        return this.paidAmount;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getTotalRemainingAmount() {
        return this.totalRemainingAmount;
    }

    public final int getTotalInstallmentsCount() {
        return this.totalInstallmentsCount;
    }

    public final int getTotalInstallmentsPaid() {
        return this.totalInstallmentsPaid;
    }

    public final int getTotalInstallmentsRemaining() {
        return this.totalInstallmentsRemaining;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.paidAmount;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2 = this.totalRemainingAmount;
        int i = this.totalInstallmentsCount;
        int i2 = this.totalInstallmentsPaid;
        int i3 = this.totalInstallmentsRemaining;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InstallmentDetails(paidAmount=");
        sb.append(money);
        sb.append(", totalRemainingAmount=");
        sb.append(money2);
        sb.append(", totalInstallmentsCount=");
        sb.append(i);
        sb.append(", totalInstallmentsPaid=");
        sb.append(i2);
        sb.append(", totalInstallmentsRemaining=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.paidAmount;
        int hashCode = money == null ? 0 : money.hashCode();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2 = this.totalRemainingAmount;
        return (((((((hashCode * 31) + (money2 != null ? money2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.totalInstallmentsCount)) * 31) + java.lang.Integer.hashCode(this.totalInstallmentsPaid)) * 31) + java.lang.Integer.hashCode(this.totalInstallmentsRemaining);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDetails)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDetails installmentDetails = (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.paidAmount, installmentDetails.paidAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalRemainingAmount, installmentDetails.totalRemainingAmount) && this.totalInstallmentsCount == installmentDetails.totalInstallmentsCount && this.totalInstallmentsPaid == installmentDetails.totalInstallmentsPaid && this.totalInstallmentsRemaining == installmentDetails.totalInstallmentsRemaining;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDetails copy(com.paypal.oslo.feature.bnplservicing.domain.model.common.Money paidAmount, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money totalRemainingAmount, int totalInstallmentsCount, int totalInstallmentsPaid, int totalInstallmentsRemaining) {
        return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDetails(paidAmount, totalRemainingAmount, totalInstallmentsCount, totalInstallmentsPaid, totalInstallmentsRemaining);
    }

    /* renamed from: component5, reason: from getter */
    public final int getTotalInstallmentsRemaining() {
        return this.totalInstallmentsRemaining;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTotalInstallmentsPaid() {
        return this.totalInstallmentsPaid;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotalInstallmentsCount() {
        return this.totalInstallmentsCount;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getTotalRemainingAmount() {
        return this.totalRemainingAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getPaidAmount() {
        return this.paidAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDetails copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDetails installmentDetails, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            money = installmentDetails.paidAmount;
        }
        if ((i4 & 2) != 0) {
            money2 = installmentDetails.totalRemainingAmount;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money3 = money2;
        if ((i4 & 4) != 0) {
            i = installmentDetails.totalInstallmentsCount;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = installmentDetails.totalInstallmentsPaid;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = installmentDetails.totalInstallmentsRemaining;
        }
        return installmentDetails.copy(money, money3, i5, i6, i3);
    }

    public InstallmentDetails() {
        this(null, null, 0, 0, 0, 31, null);
    }
}

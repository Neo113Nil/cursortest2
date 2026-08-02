package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentSchedule;", "", "", "amount", "", "numberOfPayments", "startDate", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;ILjava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentSchedule;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getAmount", com.visa.cbp.getEncExpo.warmup, "getNumberOfPayments", "getStartDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RepaymentSchedule {
    public static final int $stable = 0;
    private final java.lang.String amount;
    private final int numberOfPayments;
    private final java.lang.String startDate;

    public RepaymentSchedule(java.lang.String str, int i, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.amount = str;
        this.numberOfPayments = i;
        this.startDate = str2;
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final int getNumberOfPayments() {
        return this.numberOfPayments;
    }

    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.amount;
        int i = this.numberOfPayments;
        java.lang.String str2 = this.startDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RepaymentSchedule(amount=");
        sb.append(str);
        sb.append(", numberOfPayments=");
        sb.append(i);
        sb.append(", startDate=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.amount.hashCode() * 31) + java.lang.Integer.hashCode(this.numberOfPayments)) * 31) + this.startDate.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentSchedule)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentSchedule repaymentSchedule = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentSchedule) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, repaymentSchedule.amount) && this.numberOfPayments == repaymentSchedule.numberOfPayments && kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, repaymentSchedule.startDate);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentSchedule copy(java.lang.String amount, int numberOfPayments, java.lang.String startDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDate, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentSchedule(amount, numberOfPayments, startDate);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNumberOfPayments() {
        return this.numberOfPayments;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentSchedule copy$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentSchedule repaymentSchedule, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = repaymentSchedule.amount;
        }
        if ((i2 & 2) != 0) {
            i = repaymentSchedule.numberOfPayments;
        }
        if ((i2 & 4) != 0) {
            str2 = repaymentSchedule.startDate;
        }
        return repaymentSchedule.copy(str, i, str2);
    }
}

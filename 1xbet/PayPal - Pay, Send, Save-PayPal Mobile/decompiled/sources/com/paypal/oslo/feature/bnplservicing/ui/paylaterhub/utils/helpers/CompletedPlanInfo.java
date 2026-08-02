package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/CompletedPlanInfo;", "", "", "isRefundPending", "", "completedDateTime", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/InstallmentInfo;", "installments", "<init>", "(ZLjava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/InstallmentInfo;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/InstallmentInfo;", "copy", "(ZLjava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/InstallmentInfo;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/CompletedPlanInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getCompletedDateTime", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/InstallmentInfo;", "getInstallments"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CompletedPlanInfo {
    public static final int $stable = 0;
    private final java.lang.String completedDateTime;
    private final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.InstallmentInfo installments;
    private final boolean isRefundPending;

    public CompletedPlanInfo(boolean z, java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.InstallmentInfo installmentInfo) {
        this.isRefundPending = z;
        this.completedDateTime = str;
        this.installments = installmentInfo;
    }

    public final boolean isRefundPending() {
        return this.isRefundPending;
    }

    public final java.lang.String getCompletedDateTime() {
        return this.completedDateTime;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.InstallmentInfo getInstallments() {
        return this.installments;
    }

    public final java.lang.String toString() {
        boolean z = this.isRefundPending;
        java.lang.String str = this.completedDateTime;
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.InstallmentInfo installmentInfo = this.installments;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CompletedPlanInfo(isRefundPending=");
        sb.append(z);
        sb.append(", completedDateTime=");
        sb.append(str);
        sb.append(", installments=");
        sb.append(installmentInfo);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isRefundPending);
        java.lang.String str = this.completedDateTime;
        int hashCode2 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.InstallmentInfo installmentInfo = this.installments;
        return (((hashCode * 31) + hashCode2) * 31) + (installmentInfo != null ? installmentInfo.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.CompletedPlanInfo)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.CompletedPlanInfo completedPlanInfo = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.CompletedPlanInfo) other;
        return this.isRefundPending == completedPlanInfo.isRefundPending && kotlin.jvm.internal.Intrinsics.areEqual(this.completedDateTime, completedPlanInfo.completedDateTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.installments, completedPlanInfo.installments);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.CompletedPlanInfo copy(boolean isRefundPending, java.lang.String completedDateTime, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.InstallmentInfo installments) {
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.CompletedPlanInfo(isRefundPending, completedDateTime, installments);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.InstallmentInfo getInstallments() {
        return this.installments;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCompletedDateTime() {
        return this.completedDateTime;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRefundPending() {
        return this.isRefundPending;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.CompletedPlanInfo copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.CompletedPlanInfo completedPlanInfo, boolean z, java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.InstallmentInfo installmentInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = completedPlanInfo.isRefundPending;
        }
        if ((i & 2) != 0) {
            str = completedPlanInfo.completedDateTime;
        }
        if ((i & 4) != 0) {
            installmentInfo = completedPlanInfo.installments;
        }
        return completedPlanInfo.copy(z, str, installmentInfo);
    }
}

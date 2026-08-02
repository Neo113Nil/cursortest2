package com.paypal.oslo.feature.bnplacquisition.domain.model.vcc;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/InstallmentSummary;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "installmentAmount", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/InstallmentFrequency;", "installmentFrequency", "", "totalInstallmentsCount", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/InstallmentFrequency;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/InstallmentFrequency;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/InstallmentFrequency;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/InstallmentSummary;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "getInstallmentAmount", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/InstallmentFrequency;", "getInstallmentFrequency", "Ljava/lang/String;", "getTotalInstallmentsCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InstallmentSummary {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money installmentAmount;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency installmentFrequency;
    private final java.lang.String totalInstallmentsCount;

    public InstallmentSummary(com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency installmentFrequency, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(installmentFrequency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.installmentAmount = money;
        this.installmentFrequency = installmentFrequency;
        this.totalInstallmentsCount = str;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getInstallmentAmount() {
        return this.installmentAmount;
    }

    public /* synthetic */ InstallmentSummary(com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency installmentFrequency, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(money, (i & 2) != 0 ? com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency.UNKNOWN : installmentFrequency, str);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency getInstallmentFrequency() {
        return this.installmentFrequency;
    }

    public final java.lang.String getTotalInstallmentsCount() {
        return this.totalInstallmentsCount;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = this.installmentAmount;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency installmentFrequency = this.installmentFrequency;
        java.lang.String str = this.totalInstallmentsCount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InstallmentSummary(installmentAmount=");
        sb.append(money);
        sb.append(", installmentFrequency=");
        sb.append(installmentFrequency);
        sb.append(", totalInstallmentsCount=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.installmentAmount.hashCode() * 31) + this.installmentFrequency.hashCode()) * 31) + this.totalInstallmentsCount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InstallmentSummary)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InstallmentSummary installmentSummary = (com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InstallmentSummary) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.installmentAmount, installmentSummary.installmentAmount) && this.installmentFrequency == installmentSummary.installmentFrequency && kotlin.jvm.internal.Intrinsics.areEqual(this.totalInstallmentsCount, installmentSummary.totalInstallmentsCount);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InstallmentSummary copy(com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money installmentAmount, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency installmentFrequency, java.lang.String totalInstallmentsCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(installmentAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(installmentFrequency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalInstallmentsCount, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InstallmentSummary(installmentAmount, installmentFrequency, totalInstallmentsCount);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTotalInstallmentsCount() {
        return this.totalInstallmentsCount;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency getInstallmentFrequency() {
        return this.installmentFrequency;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getInstallmentAmount() {
        return this.installmentAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InstallmentSummary copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InstallmentSummary installmentSummary, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency installmentFrequency, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            money = installmentSummary.installmentAmount;
        }
        if ((i & 2) != 0) {
            installmentFrequency = installmentSummary.installmentFrequency;
        }
        if ((i & 4) != 0) {
            str = installmentSummary.totalInstallmentsCount;
        }
        return installmentSummary.copy(money, installmentFrequency, str);
    }
}

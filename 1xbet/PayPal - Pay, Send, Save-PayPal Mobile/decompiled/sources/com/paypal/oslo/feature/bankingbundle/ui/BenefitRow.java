package com.paypal.oslo.feature.bankingbundle.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/ui/BenefitRow;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/feature/bankingbundle/ui/BenefitAvailability;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.CURRENT_STATUS_KEY, "availableStatus", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bankingbundle/ui/BenefitAvailability;Lcom/paypal/oslo/feature/bankingbundle/ui/BenefitAvailability;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bankingbundle/ui/BenefitAvailability;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bankingbundle/ui/BenefitAvailability;Lcom/paypal/oslo/feature/bankingbundle/ui/BenefitAvailability;)Lcom/paypal/oslo/feature/bankingbundle/ui/BenefitRow;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDescription", "Lcom/paypal/oslo/feature/bankingbundle/ui/BenefitAvailability;", "getCurrentStatus", "getAvailableStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BenefitRow {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability availableStatus;
    private final com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability currentStatus;
    private final java.lang.String description;

    public BenefitRow(java.lang.String str, com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability benefitAvailability, com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability benefitAvailability2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitAvailability, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitAvailability2, "");
        this.description = str;
        this.currentStatus = benefitAvailability;
        this.availableStatus = benefitAvailability2;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability getCurrentStatus() {
        return this.currentStatus;
    }

    public final com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability getAvailableStatus() {
        return this.availableStatus;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.description;
        com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability benefitAvailability = this.currentStatus;
        com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability benefitAvailability2 = this.availableStatus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BenefitRow(description=");
        sb.append(str);
        sb.append(", currentStatus=");
        sb.append(benefitAvailability);
        sb.append(", availableStatus=");
        sb.append(benefitAvailability2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.description.hashCode() * 31) + this.currentStatus.hashCode()) * 31) + this.availableStatus.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bankingbundle.ui.BenefitRow)) {
            return false;
        }
        com.paypal.oslo.feature.bankingbundle.ui.BenefitRow benefitRow = (com.paypal.oslo.feature.bankingbundle.ui.BenefitRow) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.description, benefitRow.description) && this.currentStatus == benefitRow.currentStatus && this.availableStatus == benefitRow.availableStatus;
    }

    public final com.paypal.oslo.feature.bankingbundle.ui.BenefitRow copy(java.lang.String description, com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability currentStatus, com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability availableStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableStatus, "");
        return new com.paypal.oslo.feature.bankingbundle.ui.BenefitRow(description, currentStatus, availableStatus);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability getAvailableStatus() {
        return this.availableStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability getCurrentStatus() {
        return this.currentStatus;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bankingbundle.ui.BenefitRow copy$default(com.paypal.oslo.feature.bankingbundle.ui.BenefitRow benefitRow, java.lang.String str, com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability benefitAvailability, com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability benefitAvailability2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = benefitRow.description;
        }
        if ((i & 2) != 0) {
            benefitAvailability = benefitRow.currentStatus;
        }
        if ((i & 4) != 0) {
            benefitAvailability2 = benefitRow.availableStatus;
        }
        return benefitRow.copy(str, benefitAvailability, benefitAvailability2);
    }
}

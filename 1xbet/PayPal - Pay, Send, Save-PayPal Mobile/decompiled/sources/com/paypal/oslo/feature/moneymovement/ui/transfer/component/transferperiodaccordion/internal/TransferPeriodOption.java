package com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/transferperiodaccordion/internal/TransferPeriodOption;", "", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferSpeed;", "transferSpeed", "", "displayName", "feeText", "Lcom/paypal/pds/core/Icon;", "icon", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferSpeed;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Icon;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferSpeed;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/paypal/pds/core/Icon;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferSpeed;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Icon;)Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/transferperiodaccordion/internal/TransferPeriodOption;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferSpeed;", "getTransferSpeed", "Ljava/lang/String;", "getDisplayName", "getFeeText", "Lcom/paypal/pds/core/Icon;", "getIcon"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TransferPeriodOption {
    public static final int $stable = 0;
    private final java.lang.String displayName;
    private final java.lang.String feeText;
    private final com.paypal.pds.core.Icon icon;
    private final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed;

    public TransferPeriodOption(com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed, java.lang.String str, java.lang.String str2, com.paypal.pds.core.Icon icon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferSpeed, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        this.transferSpeed = transferSpeed;
        this.displayName = str;
        this.feeText = str2;
        this.icon = icon;
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed getTransferSpeed() {
        return this.transferSpeed;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final java.lang.String getFeeText() {
        return this.feeText;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed = this.transferSpeed;
        java.lang.String str = this.displayName;
        java.lang.String str2 = this.feeText;
        com.paypal.pds.core.Icon icon = this.icon;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferPeriodOption(transferSpeed=");
        sb.append(transferSpeed);
        sb.append(", displayName=");
        sb.append(str);
        sb.append(", feeText=");
        sb.append(str2);
        sb.append(", icon=");
        sb.append(icon);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.transferSpeed.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.feeText.hashCode()) * 31) + this.icon.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodOption)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodOption transferPeriodOption = (com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodOption) other;
        return this.transferSpeed == transferPeriodOption.transferSpeed && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, transferPeriodOption.displayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.feeText, transferPeriodOption.feeText) && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, transferPeriodOption.icon);
    }

    public final com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodOption copy(com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed, java.lang.String displayName, java.lang.String feeText, com.paypal.pds.core.Icon icon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferSpeed, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feeText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        return new com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodOption(transferSpeed, displayName, feeText, icon);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFeeText() {
        return this.feeText;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed getTransferSpeed() {
        return this.transferSpeed;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodOption copy$default(com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.internal.TransferPeriodOption transferPeriodOption, com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed, java.lang.String str, java.lang.String str2, com.paypal.pds.core.Icon icon, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            transferSpeed = transferPeriodOption.transferSpeed;
        }
        if ((i & 2) != 0) {
            str = transferPeriodOption.displayName;
        }
        if ((i & 4) != 0) {
            str2 = transferPeriodOption.feeText;
        }
        if ((i & 8) != 0) {
            icon = transferPeriodOption.icon;
        }
        return transferPeriodOption.copy(transferSpeed, str, str2, icon);
    }
}

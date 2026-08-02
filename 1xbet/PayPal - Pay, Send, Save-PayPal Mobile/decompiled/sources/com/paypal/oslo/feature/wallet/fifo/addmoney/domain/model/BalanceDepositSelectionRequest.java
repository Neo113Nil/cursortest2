package com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionRequest;", "", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "depositAmount", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;", "depositType", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "transferSpeed", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "component2", "()Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;", "component3", "()Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "copy", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getDepositAmount", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;", "getDepositType", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "getTransferSpeed"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BalanceDepositSelectionRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money depositAmount;
    private final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType;
    private final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed;

    public BalanceDepositSelectionRequest(com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        this.depositAmount = money;
        this.depositType = depositType;
        this.transferSpeed = transferSpeed;
    }

    public /* synthetic */ BalanceDepositSelectionRequest(com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(money, (i & 2) != 0 ? null : depositType, (i & 4) != 0 ? null : transferSpeed);
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getDepositAmount() {
        return this.depositAmount;
    }

    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType getDepositType() {
        return this.depositType;
    }

    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed getTransferSpeed() {
        return this.transferSpeed;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.depositAmount;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType = this.depositType;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed = this.transferSpeed;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceDepositSelectionRequest(depositAmount=");
        sb.append(money);
        sb.append(", depositType=");
        sb.append(depositType);
        sb.append(", transferSpeed=");
        sb.append(transferSpeed);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.depositAmount.hashCode();
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType = this.depositType;
        int hashCode2 = depositType == null ? 0 : depositType.hashCode();
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed = this.transferSpeed;
        return (((hashCode * 31) + hashCode2) * 31) + (transferSpeed != null ? transferSpeed.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionRequest)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionRequest balanceDepositSelectionRequest = (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.depositAmount, balanceDepositSelectionRequest.depositAmount) && this.depositType == balanceDepositSelectionRequest.depositType && this.transferSpeed == balanceDepositSelectionRequest.transferSpeed;
    }

    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionRequest copy(com.paypal.oslo.feature.wallet.common.domain.model.Money depositAmount, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositAmount, "");
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionRequest(depositAmount, depositType, transferSpeed);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed getTransferSpeed() {
        return this.transferSpeed;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType getDepositType() {
        return this.depositType;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getDepositAmount() {
        return this.depositAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionRequest copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionRequest balanceDepositSelectionRequest, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            money = balanceDepositSelectionRequest.depositAmount;
        }
        if ((i & 2) != 0) {
            depositType = balanceDepositSelectionRequest.depositType;
        }
        if ((i & 4) != 0) {
            transferSpeed = balanceDepositSelectionRequest.transferSpeed;
        }
        return balanceDepositSelectionRequest.copy(money, depositType, transferSpeed);
    }
}

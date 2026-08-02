package com.paypal.oslo.feature.savings.domain.model.transfers;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferResult;", "", "", "success", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransfer;", "transfer", "<init>", "(ZLcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransfer;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransfer;", "copy", "(ZLcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransfer;)Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSuccess", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransfer;", "getTransfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MoneyboxTransferResult {
    public static final int $stable = 0;
    private final boolean success;
    private final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransfer transfer;

    public MoneyboxTransferResult(boolean z, com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransfer moneyboxTransfer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxTransfer, "");
        this.success = z;
        this.transfer = moneyboxTransfer;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransfer getTransfer() {
        return this.transfer;
    }

    public final java.lang.String toString() {
        boolean z = this.success;
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransfer moneyboxTransfer = this.transfer;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyboxTransferResult(success=");
        sb.append(z);
        sb.append(", transfer=");
        sb.append(moneyboxTransfer);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.success) * 31) + this.transfer.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult moneyboxTransferResult = (com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult) other;
        return this.success == moneyboxTransferResult.success && kotlin.jvm.internal.Intrinsics.areEqual(this.transfer, moneyboxTransferResult.transfer);
    }

    public final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult copy(boolean success, com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransfer transfer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transfer, "");
        return new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult(success, transfer);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransfer getTransfer() {
        return this.transfer;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult copy$default(com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult moneyboxTransferResult, boolean z, com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransfer moneyboxTransfer, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = moneyboxTransferResult.success;
        }
        if ((i & 2) != 0) {
            moneyboxTransfer = moneyboxTransferResult.transfer;
        }
        return moneyboxTransferResult.copy(z, moneyboxTransfer);
    }
}

package com.paypal.oslo.feature.savings.domain.model.transfers;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/transfers/UpdateMoneyboxTransferScheduleResult;", "", "", "success", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/TransferScheduleDetails;", "transferSchedule", "<init>", "(ZLcom/paypal/oslo/feature/savings/domain/model/transfers/TransferScheduleDetails;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/TransferScheduleDetails;", "copy", "(ZLcom/paypal/oslo/feature/savings/domain/model/transfers/TransferScheduleDetails;)Lcom/paypal/oslo/feature/savings/domain/model/transfers/UpdateMoneyboxTransferScheduleResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSuccess", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/TransferScheduleDetails;", "getTransferSchedule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class UpdateMoneyboxTransferScheduleResult {
    public static final int $stable = 0;
    private final boolean success;
    private final com.paypal.oslo.feature.savings.domain.model.transfers.TransferScheduleDetails transferSchedule;

    public UpdateMoneyboxTransferScheduleResult(boolean z, com.paypal.oslo.feature.savings.domain.model.transfers.TransferScheduleDetails transferScheduleDetails) {
        this.success = z;
        this.transferSchedule = transferScheduleDetails;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final com.paypal.oslo.feature.savings.domain.model.transfers.TransferScheduleDetails getTransferSchedule() {
        return this.transferSchedule;
    }

    public final java.lang.String toString() {
        boolean z = this.success;
        com.paypal.oslo.feature.savings.domain.model.transfers.TransferScheduleDetails transferScheduleDetails = this.transferSchedule;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateMoneyboxTransferScheduleResult(success=");
        sb.append(z);
        sb.append(", transferSchedule=");
        sb.append(transferScheduleDetails);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.success);
        com.paypal.oslo.feature.savings.domain.model.transfers.TransferScheduleDetails transferScheduleDetails = this.transferSchedule;
        return (hashCode * 31) + (transferScheduleDetails == null ? 0 : transferScheduleDetails.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.transfers.UpdateMoneyboxTransferScheduleResult)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.transfers.UpdateMoneyboxTransferScheduleResult updateMoneyboxTransferScheduleResult = (com.paypal.oslo.feature.savings.domain.model.transfers.UpdateMoneyboxTransferScheduleResult) other;
        return this.success == updateMoneyboxTransferScheduleResult.success && kotlin.jvm.internal.Intrinsics.areEqual(this.transferSchedule, updateMoneyboxTransferScheduleResult.transferSchedule);
    }

    public final com.paypal.oslo.feature.savings.domain.model.transfers.UpdateMoneyboxTransferScheduleResult copy(boolean success, com.paypal.oslo.feature.savings.domain.model.transfers.TransferScheduleDetails transferSchedule) {
        return new com.paypal.oslo.feature.savings.domain.model.transfers.UpdateMoneyboxTransferScheduleResult(success, transferSchedule);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.transfers.TransferScheduleDetails getTransferSchedule() {
        return this.transferSchedule;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.transfers.UpdateMoneyboxTransferScheduleResult copy$default(com.paypal.oslo.feature.savings.domain.model.transfers.UpdateMoneyboxTransferScheduleResult updateMoneyboxTransferScheduleResult, boolean z, com.paypal.oslo.feature.savings.domain.model.transfers.TransferScheduleDetails transferScheduleDetails, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = updateMoneyboxTransferScheduleResult.success;
        }
        if ((i & 2) != 0) {
            transferScheduleDetails = updateMoneyboxTransferScheduleResult.transferSchedule;
        }
        return updateMoneyboxTransferScheduleResult.copy(z, transferScheduleDetails);
    }
}

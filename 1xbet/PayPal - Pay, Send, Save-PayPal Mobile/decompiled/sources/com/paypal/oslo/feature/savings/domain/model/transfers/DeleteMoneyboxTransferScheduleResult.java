package com.paypal.oslo.feature.savings.domain.model.transfers;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/transfers/DeleteMoneyboxTransferScheduleResult;", "", "", "success", "", "deletedScheduleId", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/savings/domain/model/transfers/DeleteMoneyboxTransferScheduleResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getSuccess", "Ljava/lang/String;", "getDeletedScheduleId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DeleteMoneyboxTransferScheduleResult {
    public static final int $stable = 0;
    private final java.lang.String deletedScheduleId;
    private final boolean success;

    public DeleteMoneyboxTransferScheduleResult(boolean z, java.lang.String str) {
        this.success = z;
        this.deletedScheduleId = str;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final java.lang.String getDeletedScheduleId() {
        return this.deletedScheduleId;
    }

    public final java.lang.String toString() {
        boolean z = this.success;
        java.lang.String str = this.deletedScheduleId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteMoneyboxTransferScheduleResult(success=");
        sb.append(z);
        sb.append(", deletedScheduleId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.success);
        java.lang.String str = this.deletedScheduleId;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.transfers.DeleteMoneyboxTransferScheduleResult)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.transfers.DeleteMoneyboxTransferScheduleResult deleteMoneyboxTransferScheduleResult = (com.paypal.oslo.feature.savings.domain.model.transfers.DeleteMoneyboxTransferScheduleResult) other;
        return this.success == deleteMoneyboxTransferScheduleResult.success && kotlin.jvm.internal.Intrinsics.areEqual(this.deletedScheduleId, deleteMoneyboxTransferScheduleResult.deletedScheduleId);
    }

    public final com.paypal.oslo.feature.savings.domain.model.transfers.DeleteMoneyboxTransferScheduleResult copy(boolean success, java.lang.String deletedScheduleId) {
        return new com.paypal.oslo.feature.savings.domain.model.transfers.DeleteMoneyboxTransferScheduleResult(success, deletedScheduleId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDeletedScheduleId() {
        return this.deletedScheduleId;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.transfers.DeleteMoneyboxTransferScheduleResult copy$default(com.paypal.oslo.feature.savings.domain.model.transfers.DeleteMoneyboxTransferScheduleResult deleteMoneyboxTransferScheduleResult, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = deleteMoneyboxTransferScheduleResult.success;
        }
        if ((i & 2) != 0) {
            str = deleteMoneyboxTransferScheduleResult.deletedScheduleId;
        }
        return deleteMoneyboxTransferScheduleResult.copy(z, str);
    }
}

package com.paypal.oslo.feature.savings.domain.model.goals;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/goals/UpdateMoneyboxResult;", "", "Lcom/paypal/oslo/feature/savings/domain/model/goals/UpdatedMoneyboxData;", "moneybox", "", "success", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/goals/UpdatedMoneyboxData;Z)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/goals/UpdatedMoneyboxData;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/goals/UpdatedMoneyboxData;Z)Lcom/paypal/oslo/feature/savings/domain/model/goals/UpdateMoneyboxResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/goals/UpdatedMoneyboxData;", "getMoneybox", "Z", "getSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class UpdateMoneyboxResult {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.savings.domain.model.goals.UpdatedMoneyboxData moneybox;
    private final boolean success;

    public UpdateMoneyboxResult(com.paypal.oslo.feature.savings.domain.model.goals.UpdatedMoneyboxData updatedMoneyboxData, boolean z) {
        this.moneybox = updatedMoneyboxData;
        this.success = z;
    }

    public final com.paypal.oslo.feature.savings.domain.model.goals.UpdatedMoneyboxData getMoneybox() {
        return this.moneybox;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.savings.domain.model.goals.UpdatedMoneyboxData updatedMoneyboxData = this.moneybox;
        boolean z = this.success;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateMoneyboxResult(moneybox=");
        sb.append(updatedMoneyboxData);
        sb.append(", success=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.savings.domain.model.goals.UpdatedMoneyboxData updatedMoneyboxData = this.moneybox;
        return ((updatedMoneyboxData == null ? 0 : updatedMoneyboxData.hashCode()) * 31) + java.lang.Boolean.hashCode(this.success);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult updateMoneyboxResult = (com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.moneybox, updateMoneyboxResult.moneybox) && this.success == updateMoneyboxResult.success;
    }

    public final com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult copy(com.paypal.oslo.feature.savings.domain.model.goals.UpdatedMoneyboxData moneybox, boolean success) {
        return new com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult(moneybox, success);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.goals.UpdatedMoneyboxData getMoneybox() {
        return this.moneybox;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult copy$default(com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult updateMoneyboxResult, com.paypal.oslo.feature.savings.domain.model.goals.UpdatedMoneyboxData updatedMoneyboxData, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updatedMoneyboxData = updateMoneyboxResult.moneybox;
        }
        if ((i & 2) != 0) {
            z = updateMoneyboxResult.success;
        }
        return updateMoneyboxResult.copy(updatedMoneyboxData, z);
    }
}

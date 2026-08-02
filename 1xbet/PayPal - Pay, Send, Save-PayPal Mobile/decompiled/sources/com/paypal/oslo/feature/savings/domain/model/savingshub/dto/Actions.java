package com.paypal.oslo.feature.savings.domain.model.savingshub.dto;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Actions;", "", "", "transfer", "addMoney", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Actions;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getTransfer", "getAddMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Actions {
    public static final int $stable = 0;
    private final boolean addMoney;
    private final boolean transfer;

    public Actions(boolean z, boolean z2) {
        this.transfer = z;
        this.addMoney = z2;
    }

    public final boolean getTransfer() {
        return this.transfer;
    }

    public final boolean getAddMoney() {
        return this.addMoney;
    }

    public final java.lang.String toString() {
        boolean z = this.transfer;
        boolean z2 = this.addMoney;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Actions(transfer=");
        sb.append(z);
        sb.append(", addMoney=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.transfer) * 31) + java.lang.Boolean.hashCode(this.addMoney);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Actions)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Actions actions = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Actions) other;
        return this.transfer == actions.transfer && this.addMoney == actions.addMoney;
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Actions copy(boolean transfer, boolean addMoney) {
        return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Actions(transfer, addMoney);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAddMoney() {
        return this.addMoney;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getTransfer() {
        return this.transfer;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Actions copy$default(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Actions actions, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = actions.transfer;
        }
        if ((i & 2) != 0) {
            z2 = actions.addMoney;
        }
        return actions.copy(z, z2);
    }
}

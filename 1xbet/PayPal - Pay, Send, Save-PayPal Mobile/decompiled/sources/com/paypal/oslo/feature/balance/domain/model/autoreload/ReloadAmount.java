package com.paypal.oslo.feature.balance.domain.model.autoreload;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/ReloadAmount;", "", "", "id", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "amount", "<init>", "(JLcom/paypal/oslo/feature/balance/domain/model/Money;)V", "component1", "()J", "component2", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "copy", "(JLcom/paypal/oslo/feature/balance/domain/model/Money;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/ReloadAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getId", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ReloadAmount {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.balance.domain.model.Money amount;
    private final long id;

    public ReloadAmount(long j, com.paypal.oslo.feature.balance.domain.model.Money money) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        this.id = j;
        this.amount = money;
    }

    public final long getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getAmount() {
        return this.amount;
    }

    public final java.lang.String toString() {
        long j = this.id;
        com.paypal.oslo.feature.balance.domain.model.Money money = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReloadAmount(id=");
        sb.append(j);
        sb.append(", amount=");
        sb.append(money);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Long.hashCode(this.id) * 31) + this.amount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.ReloadAmount)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.autoreload.ReloadAmount reloadAmount = (com.paypal.oslo.feature.balance.domain.model.autoreload.ReloadAmount) other;
        return this.id == reloadAmount.id && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, reloadAmount.amount);
    }

    public final com.paypal.oslo.feature.balance.domain.model.autoreload.ReloadAmount copy(long id, com.paypal.oslo.feature.balance.domain.model.Money amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.ReloadAmount(id, amount);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.domain.model.autoreload.ReloadAmount copy$default(com.paypal.oslo.feature.balance.domain.model.autoreload.ReloadAmount reloadAmount, long j, com.paypal.oslo.feature.balance.domain.model.Money money, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = reloadAmount.id;
        }
        if ((i & 2) != 0) {
            money = reloadAmount.amount;
        }
        return reloadAmount.copy(j, money);
    }
}

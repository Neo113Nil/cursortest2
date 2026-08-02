package com.paypal.oslo.feature.balance.domain.model.autoreload;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/Moneybox;", "", "", "id", "name", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "currentBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/Moneybox;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getCurrentBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Moneybox {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.balance.domain.model.Money currentBalance;
    private final java.lang.String id;
    private final java.lang.String name;

    public Moneybox(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.domain.model.Money money) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        this.id = str;
        this.name = str2;
        this.currentBalance = money;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getCurrentBalance() {
        return this.currentBalance;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        com.paypal.oslo.feature.balance.domain.model.Money money = this.currentBalance;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Moneybox(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", currentBalance=");
        sb.append(money);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.currentBalance.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.Moneybox)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.autoreload.Moneybox moneybox = (com.paypal.oslo.feature.balance.domain.model.autoreload.Moneybox) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, moneybox.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, moneybox.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentBalance, moneybox.currentBalance);
    }

    public final com.paypal.oslo.feature.balance.domain.model.autoreload.Moneybox copy(java.lang.String id, java.lang.String name2, com.paypal.oslo.feature.balance.domain.model.Money currentBalance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentBalance, "");
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.Moneybox(id, name2, currentBalance);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getCurrentBalance() {
        return this.currentBalance;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.domain.model.autoreload.Moneybox copy$default(com.paypal.oslo.feature.balance.domain.model.autoreload.Moneybox moneybox, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.domain.model.Money money, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = moneybox.id;
        }
        if ((i & 2) != 0) {
            str2 = moneybox.name;
        }
        if ((i & 4) != 0) {
            money = moneybox.currentBalance;
        }
        return moneybox.copy(str, str2, money);
    }
}

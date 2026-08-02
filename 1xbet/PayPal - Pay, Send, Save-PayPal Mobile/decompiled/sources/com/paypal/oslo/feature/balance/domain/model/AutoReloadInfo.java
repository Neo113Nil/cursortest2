package com.paypal.oslo.feature.balance.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JH\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b\u0003\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b\u0004\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;", "", "", "isEnabled", "isEligible", "Ljava/time/ZonedDateTime;", "nextReloadDate", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "reloadAmount", "reloadThreshold", "<init>", "(ZZLjava/time/ZonedDateTime;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;)V", "component1", "()Z", "component2", "component3", "()Ljava/time/ZonedDateTime;", "component4", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "component5", "copy", "(ZZLjava/time/ZonedDateTime;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;)Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Ljava/time/ZonedDateTime;", "getNextReloadDate", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getReloadAmount", "getReloadThreshold"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutoReloadInfo {
    public static final int $stable = 8;
    private final boolean isEligible;
    private final boolean isEnabled;
    private final java.time.ZonedDateTime nextReloadDate;
    private final com.paypal.oslo.feature.balance.domain.model.Money reloadAmount;
    private final com.paypal.oslo.feature.balance.domain.model.Money reloadThreshold;

    public AutoReloadInfo(boolean z, boolean z2, java.time.ZonedDateTime zonedDateTime, com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2) {
        this.isEnabled = z;
        this.isEligible = z2;
        this.nextReloadDate = zonedDateTime;
        this.reloadAmount = money;
        this.reloadThreshold = money2;
    }

    public /* synthetic */ AutoReloadInfo(boolean z, boolean z2, java.time.ZonedDateTime zonedDateTime, com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i & 4) != 0 ? null : zonedDateTime, (i & 8) != 0 ? null : money, (i & 16) != 0 ? null : money2);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isEligible() {
        return this.isEligible;
    }

    public final java.time.ZonedDateTime getNextReloadDate() {
        return this.nextReloadDate;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getReloadAmount() {
        return this.reloadAmount;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getReloadThreshold() {
        return this.reloadThreshold;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnabled;
        boolean z2 = this.isEligible;
        java.time.ZonedDateTime zonedDateTime = this.nextReloadDate;
        com.paypal.oslo.feature.balance.domain.model.Money money = this.reloadAmount;
        com.paypal.oslo.feature.balance.domain.model.Money money2 = this.reloadThreshold;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoReloadInfo(isEnabled=");
        sb.append(z);
        sb.append(", isEligible=");
        sb.append(z2);
        sb.append(", nextReloadDate=");
        sb.append(zonedDateTime);
        sb.append(", reloadAmount=");
        sb.append(money);
        sb.append(", reloadThreshold=");
        sb.append(money2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isEnabled);
        int hashCode2 = java.lang.Boolean.hashCode(this.isEligible);
        java.time.ZonedDateTime zonedDateTime = this.nextReloadDate;
        int hashCode3 = zonedDateTime == null ? 0 : zonedDateTime.hashCode();
        com.paypal.oslo.feature.balance.domain.model.Money money = this.reloadAmount;
        int hashCode4 = money == null ? 0 : money.hashCode();
        com.paypal.oslo.feature.balance.domain.model.Money money2 = this.reloadThreshold;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (money2 != null ? money2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo = (com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo) other;
        return this.isEnabled == autoReloadInfo.isEnabled && this.isEligible == autoReloadInfo.isEligible && kotlin.jvm.internal.Intrinsics.areEqual(this.nextReloadDate, autoReloadInfo.nextReloadDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.reloadAmount, autoReloadInfo.reloadAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.reloadThreshold, autoReloadInfo.reloadThreshold);
    }

    public final com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo copy(boolean isEnabled, boolean isEligible, java.time.ZonedDateTime nextReloadDate, com.paypal.oslo.feature.balance.domain.model.Money reloadAmount, com.paypal.oslo.feature.balance.domain.model.Money reloadThreshold) {
        return new com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo(isEnabled, isEligible, nextReloadDate, reloadAmount, reloadThreshold);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getReloadThreshold() {
        return this.reloadThreshold;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getReloadAmount() {
        return this.reloadAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final java.time.ZonedDateTime getNextReloadDate() {
        return this.nextReloadDate;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEligible() {
        return this.isEligible;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo copy$default(com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo, boolean z, boolean z2, java.time.ZonedDateTime zonedDateTime, com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = autoReloadInfo.isEnabled;
        }
        if ((i & 2) != 0) {
            z2 = autoReloadInfo.isEligible;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            zonedDateTime = autoReloadInfo.nextReloadDate;
        }
        java.time.ZonedDateTime zonedDateTime2 = zonedDateTime;
        if ((i & 8) != 0) {
            money = autoReloadInfo.reloadAmount;
        }
        com.paypal.oslo.feature.balance.domain.model.Money money3 = money;
        if ((i & 16) != 0) {
            money2 = autoReloadInfo.reloadThreshold;
        }
        return autoReloadInfo.copy(z, z3, zonedDateTime2, money3, money2);
    }
}

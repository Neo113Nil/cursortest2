package com.paypal.oslo.feature.balance.domain.model.autoreload;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JJ\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u0003\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/LowBalanceConfig;", "", "", "isEnabled", "", "balanceId", "financialInstrumentId", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "reloadAmount", "reloadThreshold", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "component5", "copy", "(ZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/LowBalanceConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getBalanceId", "getFinancialInstrumentId", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getReloadAmount", "getReloadThreshold"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LowBalanceConfig {
    public static final int $stable = 0;
    private final java.lang.String balanceId;
    private final java.lang.String financialInstrumentId;
    private final boolean isEnabled;
    private final com.paypal.oslo.feature.balance.domain.model.Money reloadAmount;
    private final com.paypal.oslo.feature.balance.domain.model.Money reloadThreshold;

    public LowBalanceConfig(boolean z, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2) {
        this.isEnabled = z;
        this.balanceId = str;
        this.financialInstrumentId = str2;
        this.reloadAmount = money;
        this.reloadThreshold = money2;
    }

    public /* synthetic */ LowBalanceConfig(boolean z, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : money, (i & 16) != 0 ? null : money2);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final java.lang.String getBalanceId() {
        return this.balanceId;
    }

    public final java.lang.String getFinancialInstrumentId() {
        return this.financialInstrumentId;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getReloadAmount() {
        return this.reloadAmount;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getReloadThreshold() {
        return this.reloadThreshold;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnabled;
        java.lang.String str = this.balanceId;
        java.lang.String str2 = this.financialInstrumentId;
        com.paypal.oslo.feature.balance.domain.model.Money money = this.reloadAmount;
        com.paypal.oslo.feature.balance.domain.model.Money money2 = this.reloadThreshold;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LowBalanceConfig(isEnabled=");
        sb.append(z);
        sb.append(", balanceId=");
        sb.append(str);
        sb.append(", financialInstrumentId=");
        sb.append(str2);
        sb.append(", reloadAmount=");
        sb.append(money);
        sb.append(", reloadThreshold=");
        sb.append(money2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isEnabled);
        java.lang.String str = this.balanceId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.financialInstrumentId;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.balance.domain.model.Money money = this.reloadAmount;
        int hashCode4 = money == null ? 0 : money.hashCode();
        com.paypal.oslo.feature.balance.domain.model.Money money2 = this.reloadThreshold;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (money2 != null ? money2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalanceConfig = (com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig) other;
        return this.isEnabled == lowBalanceConfig.isEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceId, lowBalanceConfig.balanceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentId, lowBalanceConfig.financialInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.reloadAmount, lowBalanceConfig.reloadAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.reloadThreshold, lowBalanceConfig.reloadThreshold);
    }

    public final com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig copy(boolean isEnabled, java.lang.String balanceId, java.lang.String financialInstrumentId, com.paypal.oslo.feature.balance.domain.model.Money reloadAmount, com.paypal.oslo.feature.balance.domain.model.Money reloadThreshold) {
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig(isEnabled, balanceId, financialInstrumentId, reloadAmount, reloadThreshold);
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
    public final java.lang.String getFinancialInstrumentId() {
        return this.financialInstrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBalanceId() {
        return this.balanceId;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig copy$default(com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalanceConfig, boolean z, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = lowBalanceConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            str = lowBalanceConfig.balanceId;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            str2 = lowBalanceConfig.financialInstrumentId;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            money = lowBalanceConfig.reloadAmount;
        }
        com.paypal.oslo.feature.balance.domain.model.Money money3 = money;
        if ((i & 16) != 0) {
            money2 = lowBalanceConfig.reloadThreshold;
        }
        return lowBalanceConfig.copy(z, str3, str4, money3, money2);
    }
}

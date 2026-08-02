package com.paypal.oslo.feature.balance.domain.model.autoreload;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JN\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b%\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/LowBalanceData;", "", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "minimumAmount", "maximumAmount", "", "currencyCode", "", "rechargeOptions", "thresholdOptions", "<init>", "(Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "component5", "copy", "(Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/LowBalanceData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getMinimumAmount", "getMaximumAmount", "Ljava/lang/String;", "getCurrencyCode", "Ljava/util/List;", "getRechargeOptions", "getThresholdOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LowBalanceData {
    public static final int $stable = 8;
    private final java.lang.String currencyCode;
    private final com.paypal.oslo.feature.balance.domain.model.Money maximumAmount;
    private final com.paypal.oslo.feature.balance.domain.model.Money minimumAmount;
    private final java.util.List<com.paypal.oslo.feature.balance.domain.model.Money> rechargeOptions;
    private final java.util.List<com.paypal.oslo.feature.balance.domain.model.Money> thresholdOptions;

    public LowBalanceData(com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2, java.lang.String str, java.util.List<com.paypal.oslo.feature.balance.domain.model.Money> list, java.util.List<com.paypal.oslo.feature.balance.domain.model.Money> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.minimumAmount = money;
        this.maximumAmount = money2;
        this.currencyCode = str;
        this.rechargeOptions = list;
        this.thresholdOptions = list2;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getMinimumAmount() {
        return this.minimumAmount;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getMaximumAmount() {
        return this.maximumAmount;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.util.List<com.paypal.oslo.feature.balance.domain.model.Money> getRechargeOptions() {
        return this.rechargeOptions;
    }

    public final java.util.List<com.paypal.oslo.feature.balance.domain.model.Money> getThresholdOptions() {
        return this.thresholdOptions;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.balance.domain.model.Money money = this.minimumAmount;
        com.paypal.oslo.feature.balance.domain.model.Money money2 = this.maximumAmount;
        java.lang.String str = this.currencyCode;
        java.util.List<com.paypal.oslo.feature.balance.domain.model.Money> list = this.rechargeOptions;
        java.util.List<com.paypal.oslo.feature.balance.domain.model.Money> list2 = this.thresholdOptions;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LowBalanceData(minimumAmount=");
        sb.append(money);
        sb.append(", maximumAmount=");
        sb.append(money2);
        sb.append(", currencyCode=");
        sb.append(str);
        sb.append(", rechargeOptions=");
        sb.append(list);
        sb.append(", thresholdOptions=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.minimumAmount.hashCode() * 31) + this.maximumAmount.hashCode()) * 31) + this.currencyCode.hashCode()) * 31) + this.rechargeOptions.hashCode()) * 31) + this.thresholdOptions.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceData)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceData lowBalanceData = (com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.minimumAmount, lowBalanceData.minimumAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.maximumAmount, lowBalanceData.maximumAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, lowBalanceData.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.rechargeOptions, lowBalanceData.rechargeOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.thresholdOptions, lowBalanceData.thresholdOptions);
    }

    public final com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceData copy(com.paypal.oslo.feature.balance.domain.model.Money minimumAmount, com.paypal.oslo.feature.balance.domain.model.Money maximumAmount, java.lang.String currencyCode, java.util.List<com.paypal.oslo.feature.balance.domain.model.Money> rechargeOptions, java.util.List<com.paypal.oslo.feature.balance.domain.model.Money> thresholdOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minimumAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maximumAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rechargeOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholdOptions, "");
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceData(minimumAmount, maximumAmount, currencyCode, rechargeOptions, thresholdOptions);
    }

    public final java.util.List<com.paypal.oslo.feature.balance.domain.model.Money> component5() {
        return this.thresholdOptions;
    }

    public final java.util.List<com.paypal.oslo.feature.balance.domain.model.Money> component4() {
        return this.rechargeOptions;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getMaximumAmount() {
        return this.maximumAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getMinimumAmount() {
        return this.minimumAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceData copy$default(com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceData lowBalanceData, com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2, java.lang.String str, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            money = lowBalanceData.minimumAmount;
        }
        if ((i & 2) != 0) {
            money2 = lowBalanceData.maximumAmount;
        }
        com.paypal.oslo.feature.balance.domain.model.Money money3 = money2;
        if ((i & 4) != 0) {
            str = lowBalanceData.currencyCode;
        }
        java.lang.String str2 = str;
        if ((i & 8) != 0) {
            list = lowBalanceData.rechargeOptions;
        }
        java.util.List list3 = list;
        if ((i & 16) != 0) {
            list2 = lowBalanceData.thresholdOptions;
        }
        return lowBalanceData.copy(money, money3, str2, list3, list2);
    }
}

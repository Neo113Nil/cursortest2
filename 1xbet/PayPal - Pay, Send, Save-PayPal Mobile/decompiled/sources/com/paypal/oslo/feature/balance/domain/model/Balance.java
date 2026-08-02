package com.paypal.oslo.feature.balance.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0019J\u0010\u0010)\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u0019Jª\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b3\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010\u001eR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010 R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b=\u0010 R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010#R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010%R\u001a\u0010\u0012\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010B\u001a\u0004\bC\u0010'R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\bD\u0010\u0019R\u001a\u0010\u0014\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010B\u001a\u0004\bE\u0010'R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\bF\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/Balance;", "", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "availableAmount", "totalAmount", "pendingAmount", "reservedAmount", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PRIMARY_CURRENCY, "", "Lcom/paypal/oslo/feature/balance/domain/model/Hold;", "holds", "Lcom/paypal/oslo/feature/balance/domain/model/CurrencyBalance;", "currencies", "Ljava/time/ZonedDateTime;", "lastUpdated", "", "prepaidStatus", "hasMoneyOnHold", "moneyOnHoldAmount", "hasTaxOnHold", "taxOnHoldAmount", "<init>", "(Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/time/ZonedDateTime;Ljava/lang/Boolean;ZLcom/paypal/oslo/feature/balance/domain/model/Money;ZLcom/paypal/oslo/feature/balance/domain/model/Money;)V", "component1", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "component2", "component3", "component4", "component5", "()Ljava/lang/String;", "component6", "()Ljava/util/List;", "component7", "component8", "()Ljava/time/ZonedDateTime;", "component9", "()Ljava/lang/Boolean;", "component10", "()Z", "component11", "component12", "component13", "copy", "(Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/time/ZonedDateTime;Ljava/lang/Boolean;ZLcom/paypal/oslo/feature/balance/domain/model/Money;ZLcom/paypal/oslo/feature/balance/domain/model/Money;)Lcom/paypal/oslo/feature/balance/domain/model/Balance;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getAvailableAmount", "getTotalAmount", "getPendingAmount", "getReservedAmount", "Ljava/lang/String;", "getPrimaryCurrency", "Ljava/util/List;", "getHolds", "getCurrencies", "Ljava/time/ZonedDateTime;", "getLastUpdated", "Ljava/lang/Boolean;", "getPrepaidStatus", "Z", "getHasMoneyOnHold", "getMoneyOnHoldAmount", "getHasTaxOnHold", "getTaxOnHoldAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Balance {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.balance.domain.model.Money availableAmount;
    private final java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> currencies;
    private final boolean hasMoneyOnHold;
    private final boolean hasTaxOnHold;
    private final java.util.List<com.paypal.oslo.feature.balance.domain.model.Hold> holds;
    private final java.time.ZonedDateTime lastUpdated;
    private final com.paypal.oslo.feature.balance.domain.model.Money moneyOnHoldAmount;
    private final com.paypal.oslo.feature.balance.domain.model.Money pendingAmount;
    private final java.lang.Boolean prepaidStatus;
    private final java.lang.String primaryCurrency;
    private final com.paypal.oslo.feature.balance.domain.model.Money reservedAmount;
    private final com.paypal.oslo.feature.balance.domain.model.Money taxOnHoldAmount;
    private final com.paypal.oslo.feature.balance.domain.model.Money totalAmount;

    public Balance(com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2, com.paypal.oslo.feature.balance.domain.model.Money money3, com.paypal.oslo.feature.balance.domain.model.Money money4, java.lang.String str, java.util.List<com.paypal.oslo.feature.balance.domain.model.Hold> list, java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> list2, java.time.ZonedDateTime zonedDateTime, java.lang.Boolean bool, boolean z, com.paypal.oslo.feature.balance.domain.model.Money money5, boolean z2, com.paypal.oslo.feature.balance.domain.model.Money money6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zonedDateTime, "");
        this.availableAmount = money;
        this.totalAmount = money2;
        this.pendingAmount = money3;
        this.reservedAmount = money4;
        this.primaryCurrency = str;
        this.holds = list;
        this.currencies = list2;
        this.lastUpdated = zonedDateTime;
        this.prepaidStatus = bool;
        this.hasMoneyOnHold = z;
        this.moneyOnHoldAmount = money5;
        this.hasTaxOnHold = z2;
        this.taxOnHoldAmount = money6;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getAvailableAmount() {
        return this.availableAmount;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getTotalAmount() {
        return this.totalAmount;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getPendingAmount() {
        return this.pendingAmount;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getReservedAmount() {
        return this.reservedAmount;
    }

    public final java.lang.String getPrimaryCurrency() {
        return this.primaryCurrency;
    }

    public /* synthetic */ Balance(com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2, com.paypal.oslo.feature.balance.domain.model.Money money3, com.paypal.oslo.feature.balance.domain.model.Money money4, java.lang.String str, java.util.List list, java.util.List list2, java.time.ZonedDateTime zonedDateTime, java.lang.Boolean bool, boolean z, com.paypal.oslo.feature.balance.domain.model.Money money5, boolean z2, com.paypal.oslo.feature.balance.domain.model.Money money6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(money, money2, (i & 4) != 0 ? null : money3, (i & 8) != 0 ? null : money4, (i & 16) != 0 ? null : str, (i & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, zonedDateTime, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? null : money5, (i & 2048) != 0 ? false : z2, (i & 4096) != 0 ? null : money6);
    }

    public final java.util.List<com.paypal.oslo.feature.balance.domain.model.Hold> getHolds() {
        return this.holds;
    }

    public final java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> getCurrencies() {
        return this.currencies;
    }

    public final java.time.ZonedDateTime getLastUpdated() {
        return this.lastUpdated;
    }

    public final java.lang.Boolean getPrepaidStatus() {
        return this.prepaidStatus;
    }

    public final boolean getHasMoneyOnHold() {
        return this.hasMoneyOnHold;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getMoneyOnHoldAmount() {
        return this.moneyOnHoldAmount;
    }

    public final boolean getHasTaxOnHold() {
        return this.hasTaxOnHold;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getTaxOnHoldAmount() {
        return this.taxOnHoldAmount;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.balance.domain.model.Money money = this.availableAmount;
        com.paypal.oslo.feature.balance.domain.model.Money money2 = this.totalAmount;
        com.paypal.oslo.feature.balance.domain.model.Money money3 = this.pendingAmount;
        com.paypal.oslo.feature.balance.domain.model.Money money4 = this.reservedAmount;
        java.lang.String str = this.primaryCurrency;
        java.util.List<com.paypal.oslo.feature.balance.domain.model.Hold> list = this.holds;
        java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> list2 = this.currencies;
        java.time.ZonedDateTime zonedDateTime = this.lastUpdated;
        java.lang.Boolean bool = this.prepaidStatus;
        boolean z = this.hasMoneyOnHold;
        com.paypal.oslo.feature.balance.domain.model.Money money5 = this.moneyOnHoldAmount;
        boolean z2 = this.hasTaxOnHold;
        com.paypal.oslo.feature.balance.domain.model.Money money6 = this.taxOnHoldAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Balance(availableAmount=");
        sb.append(money);
        sb.append(", totalAmount=");
        sb.append(money2);
        sb.append(", pendingAmount=");
        sb.append(money3);
        sb.append(", reservedAmount=");
        sb.append(money4);
        sb.append(", primaryCurrency=");
        sb.append(str);
        sb.append(", holds=");
        sb.append(list);
        sb.append(", currencies=");
        sb.append(list2);
        sb.append(", lastUpdated=");
        sb.append(zonedDateTime);
        sb.append(", prepaidStatus=");
        sb.append(bool);
        sb.append(", hasMoneyOnHold=");
        sb.append(z);
        sb.append(", moneyOnHoldAmount=");
        sb.append(money5);
        sb.append(", hasTaxOnHold=");
        sb.append(z2);
        sb.append(", taxOnHoldAmount=");
        sb.append(money6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.availableAmount.hashCode();
        int hashCode2 = this.totalAmount.hashCode();
        com.paypal.oslo.feature.balance.domain.model.Money money = this.pendingAmount;
        int hashCode3 = money == null ? 0 : money.hashCode();
        com.paypal.oslo.feature.balance.domain.model.Money money2 = this.reservedAmount;
        int hashCode4 = money2 == null ? 0 : money2.hashCode();
        java.lang.String str = this.primaryCurrency;
        int hashCode5 = str == null ? 0 : str.hashCode();
        int hashCode6 = this.holds.hashCode();
        int hashCode7 = this.currencies.hashCode();
        int hashCode8 = this.lastUpdated.hashCode();
        java.lang.Boolean bool = this.prepaidStatus;
        int hashCode9 = bool == null ? 0 : bool.hashCode();
        int hashCode10 = java.lang.Boolean.hashCode(this.hasMoneyOnHold);
        com.paypal.oslo.feature.balance.domain.model.Money money3 = this.moneyOnHoldAmount;
        int hashCode11 = money3 == null ? 0 : money3.hashCode();
        int hashCode12 = java.lang.Boolean.hashCode(this.hasTaxOnHold);
        com.paypal.oslo.feature.balance.domain.model.Money money4 = this.taxOnHoldAmount;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (money4 != null ? money4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.Balance)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.Balance balance = (com.paypal.oslo.feature.balance.domain.model.Balance) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.availableAmount, balance.availableAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmount, balance.totalAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.pendingAmount, balance.pendingAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.reservedAmount, balance.reservedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrency, balance.primaryCurrency) && kotlin.jvm.internal.Intrinsics.areEqual(this.holds, balance.holds) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencies, balance.currencies) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastUpdated, balance.lastUpdated) && kotlin.jvm.internal.Intrinsics.areEqual(this.prepaidStatus, balance.prepaidStatus) && this.hasMoneyOnHold == balance.hasMoneyOnHold && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyOnHoldAmount, balance.moneyOnHoldAmount) && this.hasTaxOnHold == balance.hasTaxOnHold && kotlin.jvm.internal.Intrinsics.areEqual(this.taxOnHoldAmount, balance.taxOnHoldAmount);
    }

    public final com.paypal.oslo.feature.balance.domain.model.Balance copy(com.paypal.oslo.feature.balance.domain.model.Money availableAmount, com.paypal.oslo.feature.balance.domain.model.Money totalAmount, com.paypal.oslo.feature.balance.domain.model.Money pendingAmount, com.paypal.oslo.feature.balance.domain.model.Money reservedAmount, java.lang.String primaryCurrency, java.util.List<com.paypal.oslo.feature.balance.domain.model.Hold> holds, java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> currencies, java.time.ZonedDateTime lastUpdated, java.lang.Boolean prepaidStatus, boolean hasMoneyOnHold, com.paypal.oslo.feature.balance.domain.model.Money moneyOnHoldAmount, boolean hasTaxOnHold, com.paypal.oslo.feature.balance.domain.model.Money taxOnHoldAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holds, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencies, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastUpdated, "");
        return new com.paypal.oslo.feature.balance.domain.model.Balance(availableAmount, totalAmount, pendingAmount, reservedAmount, primaryCurrency, holds, currencies, lastUpdated, prepaidStatus, hasMoneyOnHold, moneyOnHoldAmount, hasTaxOnHold, taxOnHoldAmount);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.Boolean getPrepaidStatus() {
        return this.prepaidStatus;
    }

    /* renamed from: component8, reason: from getter */
    public final java.time.ZonedDateTime getLastUpdated() {
        return this.lastUpdated;
    }

    public final java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> component7() {
        return this.currencies;
    }

    public final java.util.List<com.paypal.oslo.feature.balance.domain.model.Hold> component6() {
        return this.holds;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getPrimaryCurrency() {
        return this.primaryCurrency;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getReservedAmount() {
        return this.reservedAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getPendingAmount() {
        return this.pendingAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getTotalAmount() {
        return this.totalAmount;
    }

    /* renamed from: component13, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getTaxOnHoldAmount() {
        return this.taxOnHoldAmount;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getHasTaxOnHold() {
        return this.hasTaxOnHold;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getMoneyOnHoldAmount() {
        return this.moneyOnHoldAmount;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getHasMoneyOnHold() {
        return this.hasMoneyOnHold;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getAvailableAmount() {
        return this.availableAmount;
    }
}

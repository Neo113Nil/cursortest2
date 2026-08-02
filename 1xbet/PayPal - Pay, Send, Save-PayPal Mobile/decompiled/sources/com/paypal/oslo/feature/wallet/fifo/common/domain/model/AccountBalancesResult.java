package com.paypal.oslo.feature.wallet.fifo.common.domain.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJb\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0016R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/AccountBalancesResult;", "", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "availableAmount", "totalAmount", "pendingAmount", "reservedAmount", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PRIMARY_CURRENCY, "", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CurrencyBalance;", "currencies", "Ljava/time/ZonedDateTime;", "lastUpdated", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Ljava/lang/String;Ljava/util/List;Ljava/time/ZonedDateTime;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "component2", "component3", "component4", "component5", "()Ljava/lang/String;", "component6", "()Ljava/util/List;", "component7", "()Ljava/time/ZonedDateTime;", "copy", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Ljava/lang/String;Ljava/util/List;Ljava/time/ZonedDateTime;)Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/AccountBalancesResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getAvailableAmount", "getTotalAmount", "getPendingAmount", "getReservedAmount", "Ljava/lang/String;", "getPrimaryCurrency", "Ljava/util/List;", "getCurrencies", "Ljava/time/ZonedDateTime;", "getLastUpdated"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AccountBalancesResult {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money availableAmount;
    private final java.util.List<com.paypal.oslo.feature.wallet.fifo.common.domain.model.CurrencyBalance> currencies;
    private final java.time.ZonedDateTime lastUpdated;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money pendingAmount;
    private final java.lang.String primaryCurrency;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money reservedAmount;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money totalAmount;

    public AccountBalancesResult(com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.common.domain.model.Money money2, com.paypal.oslo.feature.wallet.common.domain.model.Money money3, com.paypal.oslo.feature.wallet.common.domain.model.Money money4, java.lang.String str, java.util.List<com.paypal.oslo.feature.wallet.fifo.common.domain.model.CurrencyBalance> list, java.time.ZonedDateTime zonedDateTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zonedDateTime, "");
        this.availableAmount = money;
        this.totalAmount = money2;
        this.pendingAmount = money3;
        this.reservedAmount = money4;
        this.primaryCurrency = str;
        this.currencies = list;
        this.lastUpdated = zonedDateTime;
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAvailableAmount() {
        return this.availableAmount;
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getTotalAmount() {
        return this.totalAmount;
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getPendingAmount() {
        return this.pendingAmount;
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getReservedAmount() {
        return this.reservedAmount;
    }

    public final java.lang.String getPrimaryCurrency() {
        return this.primaryCurrency;
    }

    public /* synthetic */ AccountBalancesResult(com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.common.domain.model.Money money2, com.paypal.oslo.feature.wallet.common.domain.model.Money money3, com.paypal.oslo.feature.wallet.common.domain.model.Money money4, java.lang.String str, java.util.List list, java.time.ZonedDateTime zonedDateTime, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(money, money2, (i & 4) != 0 ? null : money3, (i & 8) != 0 ? null : money4, (i & 16) != 0 ? null : str, (i & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, zonedDateTime);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.common.domain.model.CurrencyBalance> getCurrencies() {
        return this.currencies;
    }

    public final java.time.ZonedDateTime getLastUpdated() {
        return this.lastUpdated;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.availableAmount;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money2 = this.totalAmount;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money3 = this.pendingAmount;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money4 = this.reservedAmount;
        java.lang.String str = this.primaryCurrency;
        java.util.List<com.paypal.oslo.feature.wallet.fifo.common.domain.model.CurrencyBalance> list = this.currencies;
        java.time.ZonedDateTime zonedDateTime = this.lastUpdated;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccountBalancesResult(availableAmount=");
        sb.append(money);
        sb.append(", totalAmount=");
        sb.append(money2);
        sb.append(", pendingAmount=");
        sb.append(money3);
        sb.append(", reservedAmount=");
        sb.append(money4);
        sb.append(", primaryCurrency=");
        sb.append(str);
        sb.append(", currencies=");
        sb.append(list);
        sb.append(", lastUpdated=");
        sb.append(zonedDateTime);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.availableAmount.hashCode();
        int hashCode2 = this.totalAmount.hashCode();
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.pendingAmount;
        int hashCode3 = money == null ? 0 : money.hashCode();
        com.paypal.oslo.feature.wallet.common.domain.model.Money money2 = this.reservedAmount;
        int hashCode4 = money2 == null ? 0 : money2.hashCode();
        java.lang.String str = this.primaryCurrency;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.currencies.hashCode()) * 31) + this.lastUpdated.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult accountBalancesResult = (com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.availableAmount, accountBalancesResult.availableAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmount, accountBalancesResult.totalAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.pendingAmount, accountBalancesResult.pendingAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.reservedAmount, accountBalancesResult.reservedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrency, accountBalancesResult.primaryCurrency) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencies, accountBalancesResult.currencies) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastUpdated, accountBalancesResult.lastUpdated);
    }

    public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult copy(com.paypal.oslo.feature.wallet.common.domain.model.Money availableAmount, com.paypal.oslo.feature.wallet.common.domain.model.Money totalAmount, com.paypal.oslo.feature.wallet.common.domain.model.Money pendingAmount, com.paypal.oslo.feature.wallet.common.domain.model.Money reservedAmount, java.lang.String primaryCurrency, java.util.List<com.paypal.oslo.feature.wallet.fifo.common.domain.model.CurrencyBalance> currencies, java.time.ZonedDateTime lastUpdated) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencies, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastUpdated, "");
        return new com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult(availableAmount, totalAmount, pendingAmount, reservedAmount, primaryCurrency, currencies, lastUpdated);
    }

    /* renamed from: component7, reason: from getter */
    public final java.time.ZonedDateTime getLastUpdated() {
        return this.lastUpdated;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.common.domain.model.CurrencyBalance> component6() {
        return this.currencies;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getPrimaryCurrency() {
        return this.primaryCurrency;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getReservedAmount() {
        return this.reservedAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getPendingAmount() {
        return this.pendingAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getTotalAmount() {
        return this.totalAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAvailableAmount() {
        return this.availableAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult copy$default(com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult accountBalancesResult, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.common.domain.model.Money money2, com.paypal.oslo.feature.wallet.common.domain.model.Money money3, com.paypal.oslo.feature.wallet.common.domain.model.Money money4, java.lang.String str, java.util.List list, java.time.ZonedDateTime zonedDateTime, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            money = accountBalancesResult.availableAmount;
        }
        if ((i & 2) != 0) {
            money2 = accountBalancesResult.totalAmount;
        }
        com.paypal.oslo.feature.wallet.common.domain.model.Money money5 = money2;
        if ((i & 4) != 0) {
            money3 = accountBalancesResult.pendingAmount;
        }
        com.paypal.oslo.feature.wallet.common.domain.model.Money money6 = money3;
        if ((i & 8) != 0) {
            money4 = accountBalancesResult.reservedAmount;
        }
        com.paypal.oslo.feature.wallet.common.domain.model.Money money7 = money4;
        if ((i & 16) != 0) {
            str = accountBalancesResult.primaryCurrency;
        }
        java.lang.String str2 = str;
        if ((i & 32) != 0) {
            list = accountBalancesResult.currencies;
        }
        java.util.List list2 = list;
        if ((i & 64) != 0) {
            zonedDateTime = accountBalancesResult.lastUpdated;
        }
        return accountBalancesResult.copy(money, money5, money6, money7, str2, list2, zonedDateTime);
    }
}

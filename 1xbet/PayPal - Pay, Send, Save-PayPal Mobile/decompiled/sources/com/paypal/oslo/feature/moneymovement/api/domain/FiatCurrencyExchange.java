package com.paypal.oslo.feature.moneymovement.api.domain;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/FiatCurrencyExchange;", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "amountFrom", "amountTo", "Lcom/paypal/oslo/feature/moneymovement/api/domain/CurrencyConversion;", "exchangeRate", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/domain/CurrencyConversion;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "component2", "component3", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/CurrencyConversion;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/domain/CurrencyConversion;)Lcom/paypal/oslo/feature/moneymovement/api/domain/FiatCurrencyExchange;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getAmountFrom", "getAmountTo", "Lcom/paypal/oslo/feature/moneymovement/api/domain/CurrencyConversion;", "getExchangeRate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FiatCurrencyExchange {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amountFrom;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amountTo;
    private final com.paypal.oslo.feature.moneymovement.api.domain.CurrencyConversion exchangeRate;

    public FiatCurrencyExchange(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2, com.paypal.oslo.feature.moneymovement.api.domain.CurrencyConversion currencyConversion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyConversion, "");
        this.amountFrom = moneyAmount;
        this.amountTo = moneyAmount2;
        this.exchangeRate = currencyConversion;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getAmountFrom() {
        return this.amountFrom;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getAmountTo() {
        return this.amountTo;
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.CurrencyConversion getExchangeRate() {
        return this.exchangeRate;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.amountFrom;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2 = this.amountTo;
        com.paypal.oslo.feature.moneymovement.api.domain.CurrencyConversion currencyConversion = this.exchangeRate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FiatCurrencyExchange(amountFrom=");
        sb.append(moneyAmount);
        sb.append(", amountTo=");
        sb.append(moneyAmount2);
        sb.append(", exchangeRate=");
        sb.append(currencyConversion);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.amountFrom.hashCode() * 31) + this.amountTo.hashCode()) * 31) + this.exchangeRate.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.domain.FiatCurrencyExchange)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.domain.FiatCurrencyExchange fiatCurrencyExchange = (com.paypal.oslo.feature.moneymovement.api.domain.FiatCurrencyExchange) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amountFrom, fiatCurrencyExchange.amountFrom) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountTo, fiatCurrencyExchange.amountTo) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRate, fiatCurrencyExchange.exchangeRate);
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.FiatCurrencyExchange copy(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amountFrom, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amountTo, com.paypal.oslo.feature.moneymovement.api.domain.CurrencyConversion exchangeRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountFrom, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountTo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRate, "");
        return new com.paypal.oslo.feature.moneymovement.api.domain.FiatCurrencyExchange(amountFrom, amountTo, exchangeRate);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.domain.CurrencyConversion getExchangeRate() {
        return this.exchangeRate;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getAmountTo() {
        return this.amountTo;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getAmountFrom() {
        return this.amountFrom;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.FiatCurrencyExchange copy$default(com.paypal.oslo.feature.moneymovement.api.domain.FiatCurrencyExchange fiatCurrencyExchange, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2, com.paypal.oslo.feature.moneymovement.api.domain.CurrencyConversion currencyConversion, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            moneyAmount = fiatCurrencyExchange.amountFrom;
        }
        if ((i & 2) != 0) {
            moneyAmount2 = fiatCurrencyExchange.amountTo;
        }
        if ((i & 4) != 0) {
            currencyConversion = fiatCurrencyExchange.exchangeRate;
        }
        return fiatCurrencyExchange.copy(moneyAmount, moneyAmount2, currencyConversion);
    }
}

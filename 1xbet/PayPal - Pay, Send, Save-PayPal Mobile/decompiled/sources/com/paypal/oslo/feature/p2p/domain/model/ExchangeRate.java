package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ExchangeRate;", "", "Lcom/paypal/oslo/feature/p2p/domain/model/Money;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_FROM, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_TO, "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/Money;Lcom/paypal/oslo/feature/p2p/domain/model/Money;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/Money;", "component2", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/Money;Lcom/paypal/oslo/feature/p2p/domain/model/Money;)Lcom/paypal/oslo/feature/p2p/domain/model/ExchangeRate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/Money;", "getFromCurrency", "getToCurrency"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ExchangeRate {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.p2p.domain.model.Money fromCurrency;
    private final com.paypal.oslo.feature.p2p.domain.model.Money toCurrency;

    public ExchangeRate(com.paypal.oslo.feature.p2p.domain.model.Money money, com.paypal.oslo.feature.p2p.domain.model.Money money2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money2, "");
        this.fromCurrency = money;
        this.toCurrency = money2;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.Money getFromCurrency() {
        return this.fromCurrency;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.Money getToCurrency() {
        return this.toCurrency;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.p2p.domain.model.Money money = this.fromCurrency;
        com.paypal.oslo.feature.p2p.domain.model.Money money2 = this.toCurrency;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExchangeRate(fromCurrency=");
        sb.append(money);
        sb.append(", toCurrency=");
        sb.append(money2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.fromCurrency.hashCode() * 31) + this.toCurrency.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.ExchangeRate)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.ExchangeRate exchangeRate = (com.paypal.oslo.feature.p2p.domain.model.ExchangeRate) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fromCurrency, exchangeRate.fromCurrency) && kotlin.jvm.internal.Intrinsics.areEqual(this.toCurrency, exchangeRate.toCurrency);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.ExchangeRate copy(com.paypal.oslo.feature.p2p.domain.model.Money fromCurrency, com.paypal.oslo.feature.p2p.domain.model.Money toCurrency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fromCurrency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toCurrency, "");
        return new com.paypal.oslo.feature.p2p.domain.model.ExchangeRate(fromCurrency, toCurrency);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.Money getToCurrency() {
        return this.toCurrency;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.Money getFromCurrency() {
        return this.fromCurrency;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ExchangeRate copy$default(com.paypal.oslo.feature.p2p.domain.model.ExchangeRate exchangeRate, com.paypal.oslo.feature.p2p.domain.model.Money money, com.paypal.oslo.feature.p2p.domain.model.Money money2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            money = exchangeRate.fromCurrency;
        }
        if ((i & 2) != 0) {
            money2 = exchangeRate.toCurrency;
        }
        return exchangeRate.copy(money, money2);
    }
}

package com.paypal.oslo.feature.moneymovement.api.domain;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/CurrencyConversion;", "", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_FROM, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_TO, "<init>", "(DD)V", "component1", "()D", "component2", "copy", "(DD)Lcom/paypal/oslo/feature/moneymovement/api/domain/CurrencyConversion;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "D", "getFromCurrency", "getToCurrency"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CurrencyConversion {
    public static final int $stable = 0;
    private final double fromCurrency;
    private final double toCurrency;

    public CurrencyConversion(double d, double d2) {
        this.fromCurrency = d;
        this.toCurrency = d2;
    }

    public final double getFromCurrency() {
        return this.fromCurrency;
    }

    public final double getToCurrency() {
        return this.toCurrency;
    }

    public final java.lang.String toString() {
        double d = this.fromCurrency;
        double d2 = this.toCurrency;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyConversion(fromCurrency=");
        sb.append(d);
        sb.append(", toCurrency=");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Double.hashCode(this.fromCurrency) * 31) + java.lang.Double.hashCode(this.toCurrency);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.domain.CurrencyConversion)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.domain.CurrencyConversion currencyConversion = (com.paypal.oslo.feature.moneymovement.api.domain.CurrencyConversion) other;
        return java.lang.Double.compare(this.fromCurrency, currencyConversion.fromCurrency) == 0 && java.lang.Double.compare(this.toCurrency, currencyConversion.toCurrency) == 0;
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.CurrencyConversion copy(double fromCurrency, double toCurrency) {
        return new com.paypal.oslo.feature.moneymovement.api.domain.CurrencyConversion(fromCurrency, toCurrency);
    }

    /* renamed from: component2, reason: from getter */
    public final double getToCurrency() {
        return this.toCurrency;
    }

    /* renamed from: component1, reason: from getter */
    public final double getFromCurrency() {
        return this.fromCurrency;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.CurrencyConversion copy$default(com.paypal.oslo.feature.moneymovement.api.domain.CurrencyConversion currencyConversion, double d, double d2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = currencyConversion.fromCurrency;
        }
        if ((i & 2) != 0) {
            d2 = currencyConversion.toCurrency;
        }
        return currencyConversion.copy(d, d2);
    }
}

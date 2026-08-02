package com.paypal.oslo.feature.moneymovement.api.shared.domain;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/ExchangeRateInfo;", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_FROM, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_TO, "Ljava/math/BigDecimal;", "rate", "Ljava/time/ZonedDateTime;", "lastUpdatedAt", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;Ljava/math/BigDecimal;Ljava/time/ZonedDateTime;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;", "component2", "component3", "()Ljava/math/BigDecimal;", "component4", "()Ljava/time/ZonedDateTime;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;Ljava/math/BigDecimal;Ljava/time/ZonedDateTime;)Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/ExchangeRateInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;", "getFromCurrency", "getToCurrency", "Ljava/math/BigDecimal;", "getRate", "Ljava/time/ZonedDateTime;", "getLastUpdatedAt"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExchangeRateInfo {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency fromCurrency;
    private final java.time.ZonedDateTime lastUpdatedAt;
    private final java.math.BigDecimal rate;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency toCurrency;

    public ExchangeRateInfo(com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency currency, com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency currency2, java.math.BigDecimal bigDecimal, java.time.ZonedDateTime zonedDateTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        this.fromCurrency = currency;
        this.toCurrency = currency2;
        this.rate = bigDecimal;
        this.lastUpdatedAt = zonedDateTime;
    }

    public /* synthetic */ ExchangeRateInfo(com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency currency, com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency currency2, java.math.BigDecimal bigDecimal, java.time.ZonedDateTime zonedDateTime, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(currency, currency2, bigDecimal, (i & 8) != 0 ? null : zonedDateTime);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency getFromCurrency() {
        return this.fromCurrency;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency getToCurrency() {
        return this.toCurrency;
    }

    public final java.math.BigDecimal getRate() {
        return this.rate;
    }

    public final java.time.ZonedDateTime getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency currency = this.fromCurrency;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency currency2 = this.toCurrency;
        java.math.BigDecimal bigDecimal = this.rate;
        java.time.ZonedDateTime zonedDateTime = this.lastUpdatedAt;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExchangeRateInfo(fromCurrency=");
        sb.append(currency);
        sb.append(", toCurrency=");
        sb.append(currency2);
        sb.append(", rate=");
        sb.append(bigDecimal);
        sb.append(", lastUpdatedAt=");
        sb.append(zonedDateTime);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.fromCurrency.hashCode();
        int hashCode2 = this.toCurrency.hashCode();
        int hashCode3 = this.rate.hashCode();
        java.time.ZonedDateTime zonedDateTime = this.lastUpdatedAt;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (zonedDateTime == null ? 0 : zonedDateTime.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.domain.ExchangeRateInfo)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.domain.ExchangeRateInfo exchangeRateInfo = (com.paypal.oslo.feature.moneymovement.api.shared.domain.ExchangeRateInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fromCurrency, exchangeRateInfo.fromCurrency) && kotlin.jvm.internal.Intrinsics.areEqual(this.toCurrency, exchangeRateInfo.toCurrency) && kotlin.jvm.internal.Intrinsics.areEqual(this.rate, exchangeRateInfo.rate) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastUpdatedAt, exchangeRateInfo.lastUpdatedAt);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.ExchangeRateInfo copy(com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency fromCurrency, com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency toCurrency, java.math.BigDecimal rate, java.time.ZonedDateTime lastUpdatedAt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fromCurrency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toCurrency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rate, "");
        return new com.paypal.oslo.feature.moneymovement.api.shared.domain.ExchangeRateInfo(fromCurrency, toCurrency, rate, lastUpdatedAt);
    }

    /* renamed from: component4, reason: from getter */
    public final java.time.ZonedDateTime getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /* renamed from: component3, reason: from getter */
    public final java.math.BigDecimal getRate() {
        return this.rate;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency getToCurrency() {
        return this.toCurrency;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency getFromCurrency() {
        return this.fromCurrency;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.domain.ExchangeRateInfo copy$default(com.paypal.oslo.feature.moneymovement.api.shared.domain.ExchangeRateInfo exchangeRateInfo, com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency currency, com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency currency2, java.math.BigDecimal bigDecimal, java.time.ZonedDateTime zonedDateTime, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            currency = exchangeRateInfo.fromCurrency;
        }
        if ((i & 2) != 0) {
            currency2 = exchangeRateInfo.toCurrency;
        }
        if ((i & 4) != 0) {
            bigDecimal = exchangeRateInfo.rate;
        }
        if ((i & 8) != 0) {
            zonedDateTime = exchangeRateInfo.lastUpdatedAt;
        }
        return exchangeRateInfo.copy(currency, currency2, bigDecimal, zonedDateTime);
    }
}

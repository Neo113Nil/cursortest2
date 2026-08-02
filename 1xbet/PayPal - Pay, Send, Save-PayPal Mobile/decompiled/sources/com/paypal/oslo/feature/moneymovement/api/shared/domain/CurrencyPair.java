package com.paypal.oslo.feature.moneymovement.api.shared.domain;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyPair;", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;", "component2", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;)Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyPair;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;", "getFrom", "getTo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CurrencyPair {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency from;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency to;

    public CurrencyPair(com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency currency, com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency currency2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency2, "");
        this.from = currency;
        this.to = currency2;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency getFrom() {
        return this.from;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency getTo() {
        return this.to;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency currency = this.from;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency currency2 = this.to;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyPair(from=");
        sb.append(currency);
        sb.append(", to=");
        sb.append(currency2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.from.hashCode() * 31) + this.to.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyPair)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyPair currencyPair = (com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyPair) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.from, currencyPair.from) && kotlin.jvm.internal.Intrinsics.areEqual(this.to, currencyPair.to);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyPair copy(com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency from, com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency to) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(to, "");
        return new com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyPair(from, to);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency getTo() {
        return this.to;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency getFrom() {
        return this.from;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyPair copy$default(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyPair currencyPair, com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency currency, com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency currency2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            currency = currencyPair.from;
        }
        if ((i & 2) != 0) {
            currency2 = currencyPair.to;
        }
        return currencyPair.copy(currency, currency2);
    }
}

package com.paypal.oslo.feature.moneymovement.api.shared.domain;

@kotlin.Deprecated(message = "use MoneyAmount instead.")
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;", "", "", "code", "symbol", "name", "", "decimalPlaces", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCode", "getSymbol", "getName", com.visa.cbp.getEncExpo.warmup, "getDecimalPlaces", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Currency {
    public static final int $stable = 0;
    private final java.lang.String code;
    private final int decimalPlaces;
    private final java.lang.String name;
    private final java.lang.String symbol;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency.Companion INSTANCE = new com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency.Companion(null);
    private static final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency USD = new com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency("USD", com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD, "US Dollar", 2);
    private static final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency EUR = new com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_EUR, "Euro", 2);
    private static final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency GBP = new com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency("GBP", com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_GBP, "British Pound", 2);
    private static final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency BTC = new com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency("BTC", "₿", "Bitcoin", 8);
    private static final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency ETH = new com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency("ETH", "Ξ", "Ethereum", 8);

    public Currency(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.code = str;
        this.symbol = str2;
        this.name = str3;
        this.decimalPlaces = i;
    }

    public /* synthetic */ Currency(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 2 : i);
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final java.lang.String getSymbol() {
        return this.symbol;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final int getDecimalPlaces() {
        return this.decimalPlaces;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;", "USD", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;", "getUSD", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;", com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, "getEUR", "GBP", "getGBP", "BTC", "getBTC", "ETH", "getETH"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency getUSD() {
            return com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency.USD;
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency getEUR() {
            return com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency.EUR;
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency getGBP() {
            return com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency.GBP;
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency getBTC() {
            return com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency.BTC;
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency getETH() {
            return com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency.ETH;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.code;
        java.lang.String str2 = this.symbol;
        java.lang.String str3 = this.name;
        int i = this.decimalPlaces;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Currency(code=");
        sb.append(str);
        sb.append(", symbol=");
        sb.append(str2);
        sb.append(", name=");
        sb.append(str3);
        sb.append(", decimalPlaces=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.code.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.name.hashCode()) * 31) + java.lang.Integer.hashCode(this.decimalPlaces);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency currency = (com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.code, currency.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.symbol, currency.symbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, currency.name) && this.decimalPlaces == currency.decimalPlaces;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency copy(java.lang.String code, java.lang.String symbol, java.lang.String name2, int decimalPlaces) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(symbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency(code, symbol, name2, decimalPlaces);
    }

    /* renamed from: component4, reason: from getter */
    public final int getDecimalPlaces() {
        return this.decimalPlaces;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCode() {
        return this.code;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency copy$default(com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency currency, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = currency.code;
        }
        if ((i2 & 2) != 0) {
            str2 = currency.symbol;
        }
        if ((i2 & 4) != 0) {
            str3 = currency.name;
        }
        if ((i2 & 8) != 0) {
            i = currency.decimalPlaces;
        }
        return currency.copy(str, str2, str3, i);
    }
}

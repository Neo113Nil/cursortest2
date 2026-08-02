package com.paypal.oslo.feature.moneymovement.api.shared.backend;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/CurrencyNode;", "", "", "code", "symbol", "name", "", "decimalPlaces", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_TO, "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/CurrencyNode;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCode", "getSymbol", "getName", com.visa.cbp.getEncExpo.warmup, "getDecimalPlaces"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CurrencyNode {
    public static final int $stable = 0;
    private final java.lang.String code;
    private final int decimalPlaces;
    private final java.lang.String name;
    private final java.lang.String symbol;

    public CurrencyNode(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.code = str;
        this.symbol = str2;
        this.name = str3;
        this.decimalPlaces = i;
    }

    public /* synthetic */ CurrencyNode(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
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

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency toCurrency() {
        return new com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency(this.code, this.symbol, this.name, this.decimalPlaces);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.code;
        java.lang.String str2 = this.symbol;
        java.lang.String str3 = this.name;
        int i = this.decimalPlaces;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyNode(code=");
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
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode currencyNode = (com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.code, currencyNode.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.symbol, currencyNode.symbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, currencyNode.name) && this.decimalPlaces == currencyNode.decimalPlaces;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode copy(java.lang.String code, java.lang.String symbol, java.lang.String name2, int decimalPlaces) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(symbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode(code, symbol, name2, decimalPlaces);
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

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode copy$default(com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode currencyNode, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = currencyNode.code;
        }
        if ((i2 & 2) != 0) {
            str2 = currencyNode.symbol;
        }
        if ((i2 & 4) != 0) {
            str3 = currencyNode.name;
        }
        if ((i2 & 8) != 0) {
            i = currencyNode.decimalPlaces;
        }
        return currencyNode.copy(str, str2, str3, i);
    }
}

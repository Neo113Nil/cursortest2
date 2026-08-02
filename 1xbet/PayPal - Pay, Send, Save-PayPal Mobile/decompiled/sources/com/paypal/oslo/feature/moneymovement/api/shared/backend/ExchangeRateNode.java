package com.paypal.oslo.feature.moneymovement.api.shared.backend;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ExchangeRateNode;", "", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_FROM, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_TO, "Ljava/math/BigDecimal;", "rate", "lastUpdatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/math/BigDecimal;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ExchangeRateNode;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFromCurrency", "getToCurrency", "Ljava/math/BigDecimal;", "getRate", "getLastUpdatedAt"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExchangeRateNode {
    public static final int $stable = 0;
    private final java.lang.String fromCurrency;
    private final java.lang.String lastUpdatedAt;
    private final java.math.BigDecimal rate;
    private final java.lang.String toCurrency;

    public ExchangeRateNode(java.lang.String str, java.lang.String str2, java.math.BigDecimal bigDecimal, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        this.fromCurrency = str;
        this.toCurrency = str2;
        this.rate = bigDecimal;
        this.lastUpdatedAt = str3;
    }

    public /* synthetic */ ExchangeRateNode(java.lang.String str, java.lang.String str2, java.math.BigDecimal bigDecimal, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bigDecimal, (i & 8) != 0 ? null : str3);
    }

    public final java.lang.String getFromCurrency() {
        return this.fromCurrency;
    }

    public final java.lang.String getToCurrency() {
        return this.toCurrency;
    }

    public final java.math.BigDecimal getRate() {
        return this.rate;
    }

    public final java.lang.String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.fromCurrency;
        java.lang.String str2 = this.toCurrency;
        java.math.BigDecimal bigDecimal = this.rate;
        java.lang.String str3 = this.lastUpdatedAt;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExchangeRateNode(fromCurrency=");
        sb.append(str);
        sb.append(", toCurrency=");
        sb.append(str2);
        sb.append(", rate=");
        sb.append(bigDecimal);
        sb.append(", lastUpdatedAt=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.fromCurrency.hashCode();
        int hashCode2 = this.toCurrency.hashCode();
        int hashCode3 = this.rate.hashCode();
        java.lang.String str = this.lastUpdatedAt;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.backend.ExchangeRateNode)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.backend.ExchangeRateNode exchangeRateNode = (com.paypal.oslo.feature.moneymovement.api.shared.backend.ExchangeRateNode) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fromCurrency, exchangeRateNode.fromCurrency) && kotlin.jvm.internal.Intrinsics.areEqual(this.toCurrency, exchangeRateNode.toCurrency) && kotlin.jvm.internal.Intrinsics.areEqual(this.rate, exchangeRateNode.rate) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastUpdatedAt, exchangeRateNode.lastUpdatedAt);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.ExchangeRateNode copy(java.lang.String fromCurrency, java.lang.String toCurrency, java.math.BigDecimal rate, java.lang.String lastUpdatedAt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fromCurrency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toCurrency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rate, "");
        return new com.paypal.oslo.feature.moneymovement.api.shared.backend.ExchangeRateNode(fromCurrency, toCurrency, rate, lastUpdatedAt);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /* renamed from: component3, reason: from getter */
    public final java.math.BigDecimal getRate() {
        return this.rate;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getToCurrency() {
        return this.toCurrency;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFromCurrency() {
        return this.fromCurrency;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.backend.ExchangeRateNode copy$default(com.paypal.oslo.feature.moneymovement.api.shared.backend.ExchangeRateNode exchangeRateNode, java.lang.String str, java.lang.String str2, java.math.BigDecimal bigDecimal, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = exchangeRateNode.fromCurrency;
        }
        if ((i & 2) != 0) {
            str2 = exchangeRateNode.toCurrency;
        }
        if ((i & 4) != 0) {
            bigDecimal = exchangeRateNode.rate;
        }
        if ((i & 8) != 0) {
            str3 = exchangeRateNode.lastUpdatedAt;
        }
        return exchangeRateNode.copy(str, str2, bigDecimal, str3);
    }
}

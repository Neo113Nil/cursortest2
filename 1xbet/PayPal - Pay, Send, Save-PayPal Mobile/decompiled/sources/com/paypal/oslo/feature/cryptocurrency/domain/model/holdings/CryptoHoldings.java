package com.paypal.oslo.feature.cryptocurrency.domain.model.holdings;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;", "", "", "totalHoldingValue", "currencyCode", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHolding;", "holdings", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/TotalReturn;", "totalReturn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/TotalReturn;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/TotalReturn;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/TotalReturn;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTotalHoldingValue", "getCurrencyCode", "Ljava/util/List;", "getHoldings", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/TotalReturn;", "getTotalReturn"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoHoldings {
    public static final int $stable = 8;
    private final java.lang.String currencyCode;
    private final java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding> holdings;
    private final java.lang.String totalHoldingValue;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn totalReturn;

    public CryptoHoldings(java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding> list, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn totalReturn) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.totalHoldingValue = str;
        this.currencyCode = str2;
        this.holdings = list;
        this.totalReturn = totalReturn;
    }

    public /* synthetic */ CryptoHoldings(java.lang.String str, java.lang.String str2, java.util.List list, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn totalReturn, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i & 8) != 0 ? null : totalReturn);
    }

    public final java.lang.String getTotalHoldingValue() {
        return this.totalHoldingValue;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding> getHoldings() {
        return this.holdings;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn getTotalReturn() {
        return this.totalReturn;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.totalHoldingValue;
        java.lang.String str2 = this.currencyCode;
        java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding> list = this.holdings;
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn totalReturn = this.totalReturn;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoHoldings(totalHoldingValue=");
        sb.append(str);
        sb.append(", currencyCode=");
        sb.append(str2);
        sb.append(", holdings=");
        sb.append(list);
        sb.append(", totalReturn=");
        sb.append(totalReturn);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.totalHoldingValue.hashCode();
        int hashCode2 = this.currencyCode.hashCode();
        int hashCode3 = this.holdings.hashCode();
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn totalReturn = this.totalReturn;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (totalReturn == null ? 0 : totalReturn.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings cryptoHoldings = (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.totalHoldingValue, cryptoHoldings.totalHoldingValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, cryptoHoldings.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.holdings, cryptoHoldings.holdings) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalReturn, cryptoHoldings.totalReturn);
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings copy(java.lang.String totalHoldingValue, java.lang.String currencyCode, java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding> holdings, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn totalReturn) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalHoldingValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holdings, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings(totalHoldingValue, currencyCode, holdings, totalReturn);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn getTotalReturn() {
        return this.totalReturn;
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding> component3() {
        return this.holdings;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTotalHoldingValue() {
        return this.totalHoldingValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings cryptoHoldings, java.lang.String str, java.lang.String str2, java.util.List list, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn totalReturn, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cryptoHoldings.totalHoldingValue;
        }
        if ((i & 2) != 0) {
            str2 = cryptoHoldings.currencyCode;
        }
        if ((i & 4) != 0) {
            list = cryptoHoldings.holdings;
        }
        if ((i & 8) != 0) {
            totalReturn = cryptoHoldings.totalReturn;
        }
        return cryptoHoldings.copy(str, str2, list, totalReturn);
    }
}

package com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJT\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\rR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/CryptoDetailsPollingData;", "", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceDetails;", "priceDetails", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceHistory;", "priceHistory", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHolding;", "holding", "<init>", "(Larrow/core/Either;Larrow/core/Either;Larrow/core/Either;)V", "component1", "()Larrow/core/Either;", "component2", "component3", "copy", "(Larrow/core/Either;Larrow/core/Either;Larrow/core/Either;)Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/CryptoDetailsPollingData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Larrow/core/Either;", "getPriceDetails", "getPriceHistory", "getHolding"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoDetailsPollingData {
    public static final int $stable = 8;
    private final arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding> holding;
    private final arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails> priceDetails;
    private final arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory> priceHistory;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoDetailsPollingData(arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails> either, arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory> either2, arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding> either3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either3, "");
        this.priceDetails = either;
        this.priceHistory = either2;
        this.holding = either3;
    }

    public final arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails> getPriceDetails() {
        return this.priceDetails;
    }

    public final arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory> getPriceHistory() {
        return this.priceHistory;
    }

    public final arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding> getHolding() {
        return this.holding;
    }

    public final java.lang.String toString() {
        arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails> either = this.priceDetails;
        arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory> either2 = this.priceHistory;
        arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding> either3 = this.holding;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoDetailsPollingData(priceDetails=");
        sb.append(either);
        sb.append(", priceHistory=");
        sb.append(either2);
        sb.append(", holding=");
        sb.append(either3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.priceDetails.hashCode() * 31) + this.priceHistory.hashCode()) * 31) + this.holding.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.CryptoDetailsPollingData)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.CryptoDetailsPollingData cryptoDetailsPollingData = (com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.CryptoDetailsPollingData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.priceDetails, cryptoDetailsPollingData.priceDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.priceHistory, cryptoDetailsPollingData.priceHistory) && kotlin.jvm.internal.Intrinsics.areEqual(this.holding, cryptoDetailsPollingData.holding);
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.CryptoDetailsPollingData copy(arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails> priceDetails, arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory> priceHistory, arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding> holding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priceDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priceHistory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holding, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.CryptoDetailsPollingData(priceDetails, priceHistory, holding);
    }

    public final arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding> component3() {
        return this.holding;
    }

    public final arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory> component2() {
        return this.priceHistory;
    }

    public final arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails> component1() {
        return this.priceDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.CryptoDetailsPollingData copy$default(com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.CryptoDetailsPollingData cryptoDetailsPollingData, arrow.core.Either either, arrow.core.Either either2, arrow.core.Either either3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            either = cryptoDetailsPollingData.priceDetails;
        }
        if ((i & 2) != 0) {
            either2 = cryptoDetailsPollingData.priceHistory;
        }
        if ((i & 4) != 0) {
            either3 = cryptoDetailsPollingData.holding;
        }
        return cryptoDetailsPollingData.copy(either, either2, either3);
    }
}

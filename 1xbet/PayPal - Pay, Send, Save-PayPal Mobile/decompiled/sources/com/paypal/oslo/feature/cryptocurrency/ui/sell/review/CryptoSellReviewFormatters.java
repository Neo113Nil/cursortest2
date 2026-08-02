package com.paypal.oslo.feature.cryptocurrency.ui.sell.review;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/CryptoSellReviewFormatters;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "cryptoPrice", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/ExchangeRateFormatter;", "exchangeRate", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoAmountFormatter;", "cryptoAmount", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/ExchangeRateFormatter;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoAmountFormatter;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/ExchangeRateFormatter;", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoAmountFormatter;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/ExchangeRateFormatter;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoAmountFormatter;)Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/CryptoSellReviewFormatters;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "getCryptoPrice", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/ExchangeRateFormatter;", "getExchangeRate", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoAmountFormatter;", "getCryptoAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoSellReviewFormatters {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter cryptoAmount;
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPrice;
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter exchangeRate;

    @javax.inject.Inject
    public CryptoSellReviewFormatters(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter exchangeRateFormatter, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter cryptoAmountFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPriceFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRateFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoAmountFormatter, "");
        this.cryptoPrice = cryptoPriceFormatter;
        this.exchangeRate = exchangeRateFormatter;
        this.cryptoAmount = cryptoAmountFormatter;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter getCryptoPrice() {
        return this.cryptoPrice;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter getExchangeRate() {
        return this.exchangeRate;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter getCryptoAmount() {
        return this.cryptoAmount;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter = this.cryptoPrice;
        com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter exchangeRateFormatter = this.exchangeRate;
        com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter cryptoAmountFormatter = this.cryptoAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoSellReviewFormatters(cryptoPrice=");
        sb.append(cryptoPriceFormatter);
        sb.append(", exchangeRate=");
        sb.append(exchangeRateFormatter);
        sb.append(", cryptoAmount=");
        sb.append(cryptoAmountFormatter);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.cryptoPrice.hashCode() * 31) + this.exchangeRate.hashCode()) * 31) + this.cryptoAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters cryptoSellReviewFormatters = (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoPrice, cryptoSellReviewFormatters.cryptoPrice) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRate, cryptoSellReviewFormatters.exchangeRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoAmount, cryptoSellReviewFormatters.cryptoAmount);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters copy(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPrice, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter exchangeRate, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter cryptoAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPrice, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoAmount, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters(cryptoPrice, exchangeRate, cryptoAmount);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter getCryptoAmount() {
        return this.cryptoAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter getExchangeRate() {
        return this.exchangeRate;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter getCryptoPrice() {
        return this.cryptoPrice;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters copy$default(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters cryptoSellReviewFormatters, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter exchangeRateFormatter, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter cryptoAmountFormatter, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cryptoPriceFormatter = cryptoSellReviewFormatters.cryptoPrice;
        }
        if ((i & 2) != 0) {
            exchangeRateFormatter = cryptoSellReviewFormatters.exchangeRate;
        }
        if ((i & 4) != 0) {
            cryptoAmountFormatter = cryptoSellReviewFormatters.cryptoAmount;
        }
        return cryptoSellReviewFormatters.copy(cryptoPriceFormatter, exchangeRateFormatter, cryptoAmountFormatter);
    }
}

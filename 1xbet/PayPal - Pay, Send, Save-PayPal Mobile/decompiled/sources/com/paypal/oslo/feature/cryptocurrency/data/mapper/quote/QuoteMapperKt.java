package com.paypal.oslo.feature.cryptocurrency.data.mapper.quote;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$Data;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/quote/CryptoQuote;", "toDomain", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$Data;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class QuoteMapperKt {
    public static final arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote> toDomain(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.Data data) {
        com.paypal.oslo.feature.cryptocurrency.domain.model.quote.TradeAmountBreakdown tradeAmountBreakdown;
        java.lang.Object currencyCode;
        java.lang.Object currencyCode2;
        java.lang.Object currencyCode3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.GenerateCryptocurrencyQuote generateCryptocurrencyQuote = data.getGenerateCryptocurrencyQuote();
        java.lang.String str = null;
        com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TradeAmountBreakdown tradeAmountBreakdown2 = generateCryptocurrencyQuote != null ? generateCryptocurrencyQuote.getTradeAmountBreakdown() : null;
        if (tradeAmountBreakdown2 == null) {
            tradeAmountBreakdown = null;
        } else {
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.BaseAmount baseAmount = tradeAmountBreakdown2.getBaseAmount();
            java.lang.String value = baseAmount != null ? baseAmount.getValue() : null;
            if (value == null) {
                value = "";
            }
            java.lang.String obj = (baseAmount == null || (currencyCode3 = baseAmount.getCurrencyCode()) == null) ? null : currencyCode3.toString();
            if (obj == null) {
                obj = "";
            }
            com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money = new com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money(value, obj);
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalAmount totalAmount = tradeAmountBreakdown2.getTotalAmount();
            java.lang.String value2 = totalAmount != null ? totalAmount.getValue() : null;
            if (value2 == null) {
                value2 = "";
            }
            java.lang.String obj2 = (totalAmount == null || (currencyCode2 = totalAmount.getCurrencyCode()) == null) ? null : currencyCode2.toString();
            if (obj2 == null) {
                obj2 = "";
            }
            com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money2 = new com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money(value2, obj2);
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalFee totalFee = tradeAmountBreakdown2.getTotalFee();
            java.lang.String value3 = totalFee != null ? totalFee.getValue() : null;
            if (value3 == null) {
                value3 = "";
            }
            if (totalFee != null && (currencyCode = totalFee.getCurrencyCode()) != null) {
                str = currencyCode.toString();
            }
            tradeAmountBreakdown = new com.paypal.oslo.feature.cryptocurrency.domain.model.quote.TradeAmountBreakdown(money, money2, new com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money(value3, str != null ? str : ""));
        }
        if (generateCryptocurrencyQuote == null || tradeAmountBreakdown == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
        }
        java.lang.String quoteId = generateCryptocurrencyQuote.getQuoteId();
        java.lang.String rawValue = generateCryptocurrencyQuote.getAssetSymbol().getRawValue();
        java.lang.String rawValue2 = generateCryptocurrencyQuote.getAction().getRawValue();
        com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.AssetPrice assetPrice = generateCryptocurrencyQuote.getAssetPrice();
        com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money3 = new com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money(assetPrice.getValue(), assetPrice.getCurrencyCode().toString());
        com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.QuoteQuantity quoteQuantity = generateCryptocurrencyQuote.getQuoteQuantity();
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote(quoteId, rawValue, rawValue2, money3, new com.paypal.oslo.feature.cryptocurrency.domain.model.common.AssetQuantity(quoteQuantity.getAssetSymbol().getRawValue(), quoteQuantity.getQuantity()), tradeAmountBreakdown));
    }
}

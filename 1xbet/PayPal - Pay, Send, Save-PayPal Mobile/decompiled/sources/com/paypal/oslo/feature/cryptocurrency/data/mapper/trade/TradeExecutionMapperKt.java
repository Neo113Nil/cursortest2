package com.paypal.oslo.feature.cryptocurrency.data.mapper.trade;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$Data;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeExecution;", "toDomain", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$Data;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TradeExecutionMapperKt {
    public static final arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution> toDomain(com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Data data) {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
        java.lang.Object currencyCode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.ExecuteCryptocurrencyTrade executeCryptocurrencyTrade = data.getExecuteCryptocurrencyTrade();
        if (executeCryptocurrencyTrade == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
        }
        java.lang.String id = executeCryptocurrencyTrade.getId();
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeStatus status = executeCryptocurrencyTrade.getStatus();
        java.lang.String rawValue = status != null ? status.getRawValue() : null;
        if (rawValue == null) {
            rawValue = "";
        }
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeStatusReason statusReason = executeCryptocurrencyTrade.getStatusReason();
        java.lang.String rawValue2 = statusReason != null ? statusReason.getRawValue() : null;
        com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AmountFulfilled amountFulfilled = executeCryptocurrencyTrade.getAmountFulfilled();
        java.lang.String value = amountFulfilled != null ? amountFulfilled.getValue() : null;
        if (value == null) {
            value = "";
        }
        java.lang.String obj = (amountFulfilled == null || (currencyCode = amountFulfilled.getCurrencyCode()) == null) ? null : currencyCode.toString();
        if (obj == null) {
            obj = "";
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money = new com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money(value, obj);
        com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AssetQuantityTruncated assetQuantityTruncated = executeCryptocurrencyTrade.getAssetQuantityTruncated();
        java.lang.String rawValue3 = (assetQuantityTruncated == null || (assetSymbol = assetQuantityTruncated.getAssetSymbol()) == null) ? null : assetSymbol.getRawValue();
        if (rawValue3 == null) {
            rawValue3 = "";
        }
        java.lang.String quantity = assetQuantityTruncated != null ? assetQuantityTruncated.getQuantity() : null;
        if (quantity == null) {
            quantity = "";
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.common.AssetQuantity assetQuantity = new com.paypal.oslo.feature.cryptocurrency.domain.model.common.AssetQuantity(rawValue3, quantity);
        com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Payment payment = executeCryptocurrencyTrade.getPayment();
        java.lang.String id2 = payment != null ? payment.getId() : null;
        java.lang.String str = id2 == null ? "" : id2;
        java.lang.Object createTime = executeCryptocurrencyTrade.getCreateTime();
        java.lang.String obj2 = createTime != null ? createTime.toString() : null;
        java.lang.String str2 = obj2 == null ? "" : obj2;
        java.lang.Object fulfilledTime = executeCryptocurrencyTrade.getFulfilledTime();
        java.lang.String obj3 = fulfilledTime != null ? fulfilledTime.toString() : null;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction action = executeCryptocurrencyTrade.getAction();
        java.lang.String rawValue4 = action != null ? action.getRawValue() : null;
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution(id, rawValue, rawValue2, money, assetQuantity, str, str2, obj3, rawValue4 == null ? "" : rawValue4));
    }
}

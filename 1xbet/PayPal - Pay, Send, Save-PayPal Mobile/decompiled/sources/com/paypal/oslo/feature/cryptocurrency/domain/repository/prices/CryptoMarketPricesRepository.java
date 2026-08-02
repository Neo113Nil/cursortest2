package com.paypal.oslo.feature.cryptocurrency.domain.repository.prices;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ6\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\r\u0010\u000eJ>\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0012\u0010\u0013À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/prices/CryptoMarketPricesRepository;", "", "", "currencyCode", "", "forceNetwork", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoMarketPrices;", "getCurrentMarketPrices", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceDetails;", "getCurrentAssetPriceDetails", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;", "priceTimeRange", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceHistory;", "getAssetPriceHistory", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CryptoMarketPricesRepository {
    java.lang.Object getAssetPriceHistory(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory>> continuation);

    java.lang.Object getCurrentAssetPriceDetails(java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails>> continuation);

    java.lang.Object getCurrentMarketPrices(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object getCurrentMarketPrices$default(com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository cryptoMarketPricesRepository, java.lang.String str, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrentMarketPrices");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return cryptoMarketPricesRepository.getCurrentMarketPrices(str, z, continuation);
    }

    static /* synthetic */ java.lang.Object getCurrentAssetPriceDetails$default(com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository cryptoMarketPricesRepository, java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrentAssetPriceDetails");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return cryptoMarketPricesRepository.getCurrentAssetPriceDetails(str, str2, z, continuation);
    }

    static /* synthetic */ java.lang.Object getAssetPriceHistory$default(com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository cryptoMarketPricesRepository, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssetPriceHistory");
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return cryptoMarketPricesRepository.getAssetPriceHistory(str, str2, priceTimeRange, z, continuation);
    }
}

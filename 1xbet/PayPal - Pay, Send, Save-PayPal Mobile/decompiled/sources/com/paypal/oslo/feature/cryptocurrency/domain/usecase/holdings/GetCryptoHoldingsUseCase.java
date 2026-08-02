package com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetCryptoHoldingsUseCase;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/holdings/CryptoHoldingsRepository;", "cryptoHoldingsRepository", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "currencyProvider", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/holdings/CryptoHoldingsRepository;Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;)V", "", "currencyCode", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/holdings/CryptoHoldingsRepository;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetCryptoHoldingsUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetCryptoHoldingsUseCase(com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository cryptoHoldingsRepository, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHoldingsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyProvider, "");
        this.getHighSpeedVideoFpsRanges = cryptoHoldingsRepository;
        this.Camera2StreamConfigurationMap = currencyProvider;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase getCryptoHoldingsUseCase, java.lang.String str, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return getCryptoHoldingsUseCase.invoke(str, continuation);
    }

    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings>> continuation) {
        if (str == null) {
            str = this.Camera2StreamConfigurationMap.getCurrencyCode();
        }
        return com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository.getCryptoHoldings$default(this.getHighSpeedVideoFpsRanges, str, null, false, continuation, 6, null);
    }
}

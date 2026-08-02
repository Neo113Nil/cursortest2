package com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u00102\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollCryptoHoldingsUseCase;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/holdings/CryptoHoldingsRepository;", "cryptoHoldingsRepository", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "currencyProvider", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/values/DynamicConfigurationManager;", "dynamicConfigurationManager", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/holdings/CryptoHoldingsRepository;Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/values/DynamicConfigurationManager;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "currencyCode", "", "immediate", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;", "invoke", "(Ljava/lang/String;Z)Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/holdings/CryptoHoldingsRepository;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/values/DynamicConfigurationManager;", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PollCryptoHoldingsUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PollCryptoHoldingsUseCase(com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository cryptoHoldingsRepository, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHoldingsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfigurationManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoSizes = cryptoHoldingsRepository;
        this.Camera2StreamConfigurationMap = currencyProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = dynamicConfigurationManager;
        this.getHighSpeedVideoFpsRanges = coroutineDispatcher;
    }

    public /* synthetic */ PollCryptoHoldingsUseCase(com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository cryptoHoldingsRepository, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoHoldingsRepository, currencyProvider, dynamicConfigurationManager, (i & 8) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow invoke$default(com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase pollCryptoHoldingsUseCase, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return pollCryptoHoldingsUseCase.invoke(str, z);
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings>> invoke(java.lang.String currencyCode, boolean immediate) {
        return kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase$invoke$1(currencyCode, this, immediate, null)), this.getHighSpeedVideoFpsRanges);
    }
}

package com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ<\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollCryptoDetailsUseCase;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/prices/CryptoMarketPricesRepository;", "cryptoMarketPricesRepository", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/holdings/CryptoHoldingsRepository;", "cryptoHoldingsRepository", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "currencyProvider", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/values/DynamicConfigurationManager;", "dynamicConfigurationManager", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/prices/CryptoMarketPricesRepository;Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/holdings/CryptoHoldingsRepository;Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/values/DynamicConfigurationManager;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;", "priceTimeRange", "currencyCode", "", "immediate", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/CryptoDetailsPollingData;", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;Ljava/lang/String;Z)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/prices/CryptoMarketPricesRepository;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/holdings/CryptoHoldingsRepository;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/values/DynamicConfigurationManager;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PollCryptoDetailsUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PollCryptoDetailsUseCase(com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository cryptoMarketPricesRepository, com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository cryptoHoldingsRepository, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoMarketPricesRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHoldingsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfigurationManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRanges = cryptoMarketPricesRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = cryptoHoldingsRepository;
        this.getHighSpeedVideoFpsRangesFor = currencyProvider;
        this.Camera2StreamConfigurationMap = dynamicConfigurationManager;
        this.getHighSpeedVideoSizes = coroutineDispatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
    
        if (r14 != r8) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$fetchAllData(com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase pollCryptoDetailsUseCase, java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase$fetchAllData$1 pollCryptoDetailsUseCase$fetchAllData$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.Object assetPriceHistory;
        java.lang.String str3;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange2;
        java.lang.String str4;
        arrow.core.Either either;
        java.lang.Object cryptoHoldings$default;
        arrow.core.Either either2;
        arrow.core.Either.Right right;
        java.lang.Object obj;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase$fetchAllData$1) {
            pollCryptoDetailsUseCase$fetchAllData$1 = (com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase$fetchAllData$1) continuation;
            if ((pollCryptoDetailsUseCase$fetchAllData$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                pollCryptoDetailsUseCase$fetchAllData$1.getInputFormats -= 2147483648;
                java.lang.Object obj2 = pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoSizesFor;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pollCryptoDetailsUseCase$fetchAllData$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository cryptoMarketPricesRepository = pollCryptoDetailsUseCase.getHighSpeedVideoFpsRanges;
                    pollCryptoDetailsUseCase$fetchAllData$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoFpsRangesFor = priceTimeRange;
                    pollCryptoDetailsUseCase$fetchAllData$1.Camera2StreamConfigurationMap = str2;
                    pollCryptoDetailsUseCase$fetchAllData$1.getInputFormats = 1;
                    obj2 = cryptoMarketPricesRepository.getCurrentAssetPriceDetails(str, str2, true, pollCryptoDetailsUseCase$fetchAllData$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            either2 = (arrow.core.Either) pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoFpsRanges;
                            either = (arrow.core.Either) pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoSizes;
                            str4 = (java.lang.String) pollCryptoDetailsUseCase$fetchAllData$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            right = (arrow.core.Either) obj2;
                            if (!(right instanceof arrow.core.Either.Right)) {
                                java.util.Iterator<T> it = ((com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings) ((arrow.core.Either.Right) right).getValue()).getHoldings().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it.next();
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding) obj).getAssetSymbol(), str4)) {
                                        break;
                                    }
                                }
                                right = new arrow.core.Either.Right((com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding) obj);
                            } else if (!(right instanceof arrow.core.Either.Left)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.CryptoDetailsPollingData(either, either2, right);
                        }
                        either = (arrow.core.Either) pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoSizes;
                        java.lang.String str5 = (java.lang.String) pollCryptoDetailsUseCase$fetchAllData$1.Camera2StreamConfigurationMap;
                        priceTimeRange2 = (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange) pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoFpsRangesFor;
                        java.lang.String str6 = (java.lang.String) pollCryptoDetailsUseCase$fetchAllData$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        str3 = str5;
                        str4 = str6;
                        arrow.core.Either either3 = (arrow.core.Either) obj2;
                        com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository cryptoHoldingsRepository = pollCryptoDetailsUseCase.getHighResolutionOutputSizeshNQ4ISI;
                        pollCryptoDetailsUseCase$fetchAllData$1.getHighResolutionOutputSizeshNQ4ISI = str4;
                        pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(priceTimeRange2);
                        pollCryptoDetailsUseCase$fetchAllData$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                        pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoSizes = either;
                        pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoFpsRanges = either3;
                        pollCryptoDetailsUseCase$fetchAllData$1.getInputFormats = 3;
                        cryptoHoldings$default = com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository.getCryptoHoldings$default(cryptoHoldingsRepository, str3, str4, false, pollCryptoDetailsUseCase$fetchAllData$1, 4, null);
                        if (cryptoHoldings$default != coroutine_suspended) {
                            obj2 = cryptoHoldings$default;
                            either2 = either3;
                            right = (arrow.core.Either) obj2;
                            if (!(right instanceof arrow.core.Either.Right)) {
                            }
                            return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.CryptoDetailsPollingData(either, either2, right);
                        }
                        return coroutine_suspended;
                    }
                    str2 = (java.lang.String) pollCryptoDetailsUseCase$fetchAllData$1.Camera2StreamConfigurationMap;
                    priceTimeRange = (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange) pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoFpsRangesFor;
                    str = (java.lang.String) pollCryptoDetailsUseCase$fetchAllData$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                arrow.core.Either either4 = (arrow.core.Either) obj2;
                com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository cryptoMarketPricesRepository2 = pollCryptoDetailsUseCase.getHighSpeedVideoFpsRanges;
                pollCryptoDetailsUseCase$fetchAllData$1.getHighResolutionOutputSizeshNQ4ISI = str;
                pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(priceTimeRange);
                pollCryptoDetailsUseCase$fetchAllData$1.Camera2StreamConfigurationMap = str2;
                pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoSizes = either4;
                pollCryptoDetailsUseCase$fetchAllData$1.getInputFormats = 2;
                assetPriceHistory = cryptoMarketPricesRepository2.getAssetPriceHistory(str, str2, priceTimeRange, true, pollCryptoDetailsUseCase$fetchAllData$1);
                if (assetPriceHistory != coroutine_suspended) {
                    str3 = str2;
                    priceTimeRange2 = priceTimeRange;
                    str4 = str;
                    either = either4;
                    obj2 = assetPriceHistory;
                    arrow.core.Either either32 = (arrow.core.Either) obj2;
                    com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository cryptoHoldingsRepository2 = pollCryptoDetailsUseCase.getHighResolutionOutputSizeshNQ4ISI;
                    pollCryptoDetailsUseCase$fetchAllData$1.getHighResolutionOutputSizeshNQ4ISI = str4;
                    pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(priceTimeRange2);
                    pollCryptoDetailsUseCase$fetchAllData$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoSizes = either;
                    pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoFpsRanges = either32;
                    pollCryptoDetailsUseCase$fetchAllData$1.getInputFormats = 3;
                    cryptoHoldings$default = com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository.getCryptoHoldings$default(cryptoHoldingsRepository2, str3, str4, false, pollCryptoDetailsUseCase$fetchAllData$1, 4, null);
                    if (cryptoHoldings$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        pollCryptoDetailsUseCase$fetchAllData$1 = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase$fetchAllData$1(pollCryptoDetailsUseCase, continuation);
        java.lang.Object obj22 = pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoSizesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pollCryptoDetailsUseCase$fetchAllData$1.getInputFormats;
        if (i != 0) {
        }
        arrow.core.Either either42 = (arrow.core.Either) obj22;
        com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository cryptoMarketPricesRepository22 = pollCryptoDetailsUseCase.getHighSpeedVideoFpsRanges;
        pollCryptoDetailsUseCase$fetchAllData$1.getHighResolutionOutputSizeshNQ4ISI = str;
        pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(priceTimeRange);
        pollCryptoDetailsUseCase$fetchAllData$1.Camera2StreamConfigurationMap = str2;
        pollCryptoDetailsUseCase$fetchAllData$1.getHighSpeedVideoSizes = either42;
        pollCryptoDetailsUseCase$fetchAllData$1.getInputFormats = 2;
        assetPriceHistory = cryptoMarketPricesRepository22.getAssetPriceHistory(str, str2, priceTimeRange, true, pollCryptoDetailsUseCase$fetchAllData$1);
        if (assetPriceHistory != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public /* synthetic */ PollCryptoDetailsUseCase(com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository cryptoMarketPricesRepository, com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository cryptoHoldingsRepository, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoMarketPricesRepository, cryptoHoldingsRepository, currencyProvider, dynamicConfigurationManager, (i & 16) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow invoke$default(com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase pollCryptoDetailsUseCase, java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return pollCryptoDetailsUseCase.invoke(str, priceTimeRange, str2, z);
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.CryptoDetailsPollingData> invoke(java.lang.String assetSymbol, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, java.lang.String currencyCode, boolean immediate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priceTimeRange, "");
        return kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase$invoke$1(currencyCode, this, immediate, assetSymbol, priceTimeRange, null)), this.getHighSpeedVideoSizes);
    }
}

package com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetAssetHoldingUseCase;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/holdings/CryptoHoldingsRepository;", "cryptoHoldingsRepository", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "currencyProvider", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/holdings/CryptoHoldingsRepository;Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;)V", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "currencyCode", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHolding;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/holdings/CryptoHoldingsRepository;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetAssetHoldingUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetAssetHoldingUseCase(com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository cryptoHoldingsRepository, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHoldingsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyProvider, "");
        this.getHighSpeedVideoFpsRanges = cryptoHoldingsRepository;
        this.getHighSpeedVideoFpsRangesFor = currencyProvider;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getAssetHoldingUseCase, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return getAssetHoldingUseCase.invoke(str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase$invoke$1 getAssetHoldingUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        java.lang.Object obj;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase$invoke$1) {
            getAssetHoldingUseCase$invoke$1 = (com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase$invoke$1) continuation;
            if ((getAssetHoldingUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                getAssetHoldingUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase$invoke$1 getAssetHoldingUseCase$invoke$12 = getAssetHoldingUseCase$invoke$1;
                java.lang.Object obj2 = getAssetHoldingUseCase$invoke$12.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getAssetHoldingUseCase$invoke$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    java.lang.String currencyCode = str2 == null ? this.getHighSpeedVideoFpsRangesFor.getCurrencyCode() : str2;
                    com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository cryptoHoldingsRepository = this.getHighSpeedVideoFpsRanges;
                    getAssetHoldingUseCase$invoke$12.getHighSpeedVideoFpsRanges = str;
                    getAssetHoldingUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    getAssetHoldingUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyCode);
                    getAssetHoldingUseCase$invoke$12.Camera2StreamConfigurationMap = 1;
                    obj2 = com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository.getCryptoHoldings$default(cryptoHoldingsRepository, currencyCode, str, false, getAssetHoldingUseCase$invoke$12, 4, null);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) getAssetHoldingUseCase$invoke$12.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                either = (arrow.core.Either) obj2;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.util.Iterator<T> it = ((com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings) ((arrow.core.Either.Right) either).getValue()).getHoldings().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding) obj).getAssetSymbol(), str)) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding cryptoHolding = (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding) obj;
                    return (cryptoHolding == null || (right = arrow.core.EitherKt.right(cryptoHolding)) == null) ? arrow.core.EitherKt.left(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE) : right;
                }
                if (either instanceof arrow.core.Either.Left) {
                    return arrow.core.EitherKt.left((com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError) ((arrow.core.Either.Left) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getAssetHoldingUseCase$invoke$1 = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase$invoke$1(this, continuation);
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase$invoke$1 getAssetHoldingUseCase$invoke$122 = getAssetHoldingUseCase$invoke$1;
        java.lang.Object obj22 = getAssetHoldingUseCase$invoke$122.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getAssetHoldingUseCase$invoke$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj22;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}

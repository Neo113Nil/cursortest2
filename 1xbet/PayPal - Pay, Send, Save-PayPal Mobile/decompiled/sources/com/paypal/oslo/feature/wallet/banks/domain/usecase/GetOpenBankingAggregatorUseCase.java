package com.paypal.oslo.feature.wallet.banks.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/GetOpenBankingAggregatorUseCase;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/OpenBankingAggregatorRepository;", "openBankingAggregatorRepository", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/repository/OpenBankingAggregatorRepository;)V", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "excludeAggregators", "invoke", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/OpenBankingAggregatorRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetOpenBankingAggregatorUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingAggregatorRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetOpenBankingAggregatorUseCase(com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingAggregatorRepository openBankingAggregatorRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openBankingAggregatorRepository, "");
        this.Camera2StreamConfigurationMap = openBankingAggregatorRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.util.List<? extends com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> continuation) {
        com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase$invoke$1 getOpenBankingAggregatorUseCase$invoke$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase$invoke$1) {
            getOpenBankingAggregatorUseCase$invoke$1 = (com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase$invoke$1) continuation;
            if ((getOpenBankingAggregatorUseCase$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                getOpenBankingAggregatorUseCase$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = getOpenBankingAggregatorUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getOpenBankingAggregatorUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorParams openBankingAggregatorParams = new com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorParams(addFIFlow, list);
                    com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingAggregatorRepository openBankingAggregatorRepository = this.Camera2StreamConfigurationMap;
                    getOpenBankingAggregatorUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addFIFlow);
                    getOpenBankingAggregatorUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    getOpenBankingAggregatorUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(openBankingAggregatorParams);
                    getOpenBankingAggregatorUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = openBankingAggregatorRepository.getOpenBankingAggregator(openBankingAggregatorParams, getOpenBankingAggregatorUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError openBankingAggregatorError = (com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError) ior.leftOrNull();
                    if (openBankingAggregatorError != null) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCaseKt.access$toStringError(openBankingAggregatorError), null, null, null, 14, null);
                    }
                    com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult openBankingAggregatorResult = (com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult) ior.getOrNull();
                    if (openBankingAggregatorResult != null) {
                        return openBankingAggregatorResult.getAggregator();
                    }
                    return null;
                }
                if (ior instanceof arrow.core.Ior.Left) {
                    com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError openBankingAggregatorError2 = (com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError) ior.leftOrNull();
                    if (openBankingAggregatorError2 != null) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCaseKt.access$toStringError(openBankingAggregatorError2), null, null, null, 14, null);
                    }
                    return null;
                }
                if (!(ior instanceof arrow.core.Ior.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult openBankingAggregatorResult2 = (com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult) ior.getOrNull();
                if (openBankingAggregatorResult2 != null) {
                    return openBankingAggregatorResult2.getAggregator();
                }
                return null;
            }
        }
        getOpenBankingAggregatorUseCase$invoke$1 = new com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getOpenBankingAggregatorUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getOpenBankingAggregatorUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Both)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase getOpenBankingAggregatorUseCase, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.util.List list, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            addFIFlow = com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET;
        }
        if ((i & 2) != 0) {
            list = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.YODLEE_FASTLINK);
        }
        return getOpenBankingAggregatorUseCase.invoke(addFIFlow, list, continuation);
    }
}

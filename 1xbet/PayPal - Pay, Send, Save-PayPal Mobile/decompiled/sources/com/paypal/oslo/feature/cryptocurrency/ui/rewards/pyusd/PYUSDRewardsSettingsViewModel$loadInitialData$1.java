package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$loadInitialData$1", f = "PYUSDRewardsSettingsViewModel.kt", i = {1, 1, 1, 1, 1}, l = {90, 104}, m = "invokeSuspend", n = {"this_$iv", "rewardsStatus", "statusUi", "$i$f$fold", "$i$a$-fold-PYUSDRewardsSettingsViewModel$loadInitialData$1$3"}, nl = {91, 105}, s = {"L$0", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes12.dex */
final class PYUSDRewardsSettingsViewModel$loadInitialData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel getInputFormats;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0062, code lost:
    
        if (r15 != r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ac  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatusUseCase;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsStatusUiMapper pYUSDRewardsStatusUiMapper;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getAssetHoldingUseCase;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi pYUSDRewardsStatusUi;
        arrow.core.Either either;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsHoldingsUiMapper pYUSDRewardsHoldingsUiMapper;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        boolean z = false;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputFormats.getInputSizeshNQ4ISI;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState) value, true, false, null, false, false, false, 62, null)));
            getPYUSDRewardsStatusUseCase = this.getInputFormats.Camera2StreamConfigurationMap;
            this.getOutputFormats = 1;
            obj = getPYUSDRewardsStatusUseCase.invoke(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pYUSDRewardsStatusUi = (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi) this.getOutputMinFrameDuration;
                pYUSDRewardsSettingsViewModel = (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding cryptoHolding = (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding) ((arrow.core.Either.Right) either).getValue();
                    pYUSDRewardsHoldingsUiMapper = pYUSDRewardsSettingsViewModel.getHighSpeedVideoSizes;
                    z = pYUSDRewardsHoldingsUiMapper.map(cryptoHolding.getPyusdRewardHoldings()).isCannotPerformPayoutError();
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                mutableStateFlow3 = pYUSDRewardsSettingsViewModel.getInputSizeshNQ4ISI;
                do {
                    value3 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value3, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState) value3, false, false, pYUSDRewardsStatusUi.getFormattedRate(), pYUSDRewardsStatusUi.isAccruingRewards(), false, z, 16, null)));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either2 = (arrow.core.Either) obj;
        pYUSDRewardsSettingsViewModel = this.getInputFormats;
        if (either2 instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus pYUSDRewardsStatus = (com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus) ((arrow.core.Either.Right) either2).getValue();
            pYUSDRewardsStatusUiMapper = pYUSDRewardsSettingsViewModel.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi map = pYUSDRewardsStatusUiMapper.map(pYUSDRewardsStatus);
            getAssetHoldingUseCase = pYUSDRewardsSettingsViewModel.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
            this.getHighResolutionOutputSizeshNQ4ISI = pYUSDRewardsSettingsViewModel;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pYUSDRewardsStatus);
            this.getOutputMinFrameDuration = map;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getOutputFormats = 2;
            obj = com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase.invoke$default(getAssetHoldingUseCase, "PYUSD", null, this, 2, null);
            if (obj != coroutine_suspended) {
                pYUSDRewardsStatusUi = map;
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                }
                mutableStateFlow3 = pYUSDRewardsSettingsViewModel.getInputSizeshNQ4ISI;
                do {
                    value3 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value3, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState) value3, false, false, pYUSDRewardsStatusUi.getFormattedRate(), pYUSDRewardsStatusUi.isAccruingRewards(), false, z, 16, null)));
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        if (either2 instanceof arrow.core.Either.Left) {
            mutableStateFlow2 = pYUSDRewardsSettingsViewModel.getInputSizeshNQ4ISI;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState) value2, false, true, null, false, false, false, 60, null)));
            return kotlin.Unit.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$loadInitialData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$loadInitialData$1(this.getInputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PYUSDRewardsSettingsViewModel$loadInitialData$1(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$loadInitialData$1> continuation) {
        super(2, continuation);
        this.getInputFormats = pYUSDRewardsSettingsViewModel;
    }
}

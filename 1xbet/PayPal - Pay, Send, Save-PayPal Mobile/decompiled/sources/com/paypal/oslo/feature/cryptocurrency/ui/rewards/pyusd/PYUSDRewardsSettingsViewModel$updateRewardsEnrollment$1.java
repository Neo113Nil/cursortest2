package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$updateRewardsEnrollment$1", f = "PYUSDRewardsSettingsViewModel.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, nl = {154}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class PYUSDRewardsSettingsViewModel$updateRewardsEnrollment$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase updatePYUSDRewardsEnrollmentUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value2;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsStatusUiMapper pYUSDRewardsStatusUiMapper;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object value3;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI;
            if (((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState) mutableStateFlow.getValue()).isToggleLoading()) {
                return kotlin.Unit.INSTANCE;
            }
            mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState) value, false, false, null, false, true, false, 47, null)));
            updatePYUSDRewardsEnrollmentUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            obj = updatePYUSDRewardsEnrollmentUseCase.invoke(this.getHighSpeedVideoSizes, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect pYUSDRewardsSettingsEffect = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus pYUSDRewardsStatus = (com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus) ((arrow.core.Either.Right) either).getValue();
            pYUSDRewardsStatusUiMapper = pYUSDRewardsSettingsViewModel.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi map = pYUSDRewardsStatusUiMapper.map(pYUSDRewardsStatus);
            mutableStateFlow4 = pYUSDRewardsSettingsViewModel.getInputSizeshNQ4ISI;
            do {
                value3 = mutableStateFlow4.getValue();
            } while (!mutableStateFlow4.compareAndSet(value3, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState) value3, false, false, map.getFormattedRate(), map.isAccruingRewards(), false, false, 35, null)));
            mutableSharedFlow = pYUSDRewardsSettingsViewModel.getOutputFormats;
            mutableSharedFlow.tryEmit(pYUSDRewardsSettingsEffect);
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow3 = pYUSDRewardsSettingsViewModel.getInputSizeshNQ4ISI;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value2, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState) value2, false, false, null, false, false, false, 47, null)));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$updateRewardsEnrollment$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$updateRewardsEnrollment$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PYUSDRewardsSettingsViewModel$updateRewardsEnrollment$1(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel, boolean z, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect pYUSDRewardsSettingsEffect, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$updateRewardsEnrollment$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = pYUSDRewardsSettingsViewModel;
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRangesFor = pYUSDRewardsSettingsEffect;
    }
}

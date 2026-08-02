package com.paypal.oslo.feature.activity.ui.detail.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel$fetchActivityDetailResult$1", f = "ActivityTransactionDetailViewModel.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, nl = {102}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivityTransactionDetailViewModel$fetchActivityDetailResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase activityDetailUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                mutableStateFlow2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
                activityDetailUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = mutableStateFlow2;
                this.Camera2StreamConfigurationMap = 1;
                java.lang.Object invoke = activityDetailUseCase.invoke(this.getHighSpeedVideoSizes, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableStateFlow3 = mutableStateFlow2;
                obj = invoke;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow3 = (kotlinx.coroutines.flow.MutableStateFlow) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            arrow.core.Either either = ((arrow.core.Ior) obj).toEither();
            if (either instanceof arrow.core.Either.Right) {
                obj2 = (com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState) new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success((com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult) ((arrow.core.Either.Right) either).getValue());
            } else if (either instanceof arrow.core.Either.Left) {
                obj2 = (com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState) new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure((com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult) ((arrow.core.Either.Left) either).getValue());
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            mutableStateFlow3.setValue(obj2);
        } catch (java.lang.Exception e) {
            iActivityErrorMapper = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError mapToDomainError = iActivityErrorMapper.mapToDomainError(e);
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow.setValue(new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl(mapToDomainError.getErrorMessage(), null, 2, null), 1, null)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel$fetchActivityDetailResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel$fetchActivityDetailResult$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityTransactionDetailViewModel$fetchActivityDetailResult$1(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto activityTransactionDto, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel$fetchActivityDetailResult$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = activityTransactionDetailViewModel;
        this.getHighSpeedVideoSizes = activityTransactionDto;
    }
}

package com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel$processConfirmClicked$1", f = "SnoozeViewModel.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, nl = {114}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class SnoozeViewModel$processConfirmClicked$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase postSnoozeUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            postSnoozeUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = postSnoozeUseCase.invoke2(((com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Submitting) this.Camera2StreamConfigurationMap).getUiModel().getSelectedOption().getId(), (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) obj;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) || (useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess)) {
            this.getHighSpeedVideoSizes.processEvent$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.OnSnoozeSuccess.INSTANCE);
        } else {
            if (!(useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoSizes.processEvent$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.OnSnoozeError.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel$processConfirmClicked$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel$processConfirmClicked$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnoozeViewModel$processConfirmClicked$1(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel snoozeViewModel, com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState snoozeUiState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel$processConfirmClicked$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = snoozeViewModel;
        this.Camera2StreamConfigurationMap = snoozeUiState;
    }
}

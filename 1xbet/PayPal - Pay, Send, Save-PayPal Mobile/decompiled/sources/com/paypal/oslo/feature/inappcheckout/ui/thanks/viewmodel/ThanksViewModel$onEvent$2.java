package com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel$onEvent$2", f = "ThanksViewModel.kt", i = {}, l = {60, 65}, m = "invokeSuspend", n = {}, nl = {61, 69}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ThanksViewModel$onEvent$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(3000, r7) != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (r8.emit(new com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Effect.NavigateToReturnUrl(((com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.Initialise) r7.getHighSpeedVideoSizes).getThanksScreenData().getReturnUrl()), r7) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (((com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.Initialise) this.getHighSpeedVideoSizes).getThanksScreenData().getReturnUrl() == null) {
                this.getHighSpeedVideoFpsRanges = 1;
            } else {
                mutableSharedFlow = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = 2;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State.copy$default((com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State) value, true, null, null, 6, null)));
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel$onEvent$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel$onEvent$2(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThanksViewModel$onEvent$2(com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event event, com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel thanksViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel$onEvent$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = event;
        this.Camera2StreamConfigurationMap = thanksViewModel;
    }
}

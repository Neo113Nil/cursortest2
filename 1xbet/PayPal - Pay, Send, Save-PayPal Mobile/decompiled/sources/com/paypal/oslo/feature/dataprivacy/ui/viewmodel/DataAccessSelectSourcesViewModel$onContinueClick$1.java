package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel$onContinueClick$1", f = "DataAccessSelectSourcesViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, nl = {109}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DataAccessSelectSourcesViewModel$onContinueClick$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            if (!((java.util.List) mutableStateFlow.getValue()).isEmpty()) {
                mutableSharedFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                mutableStateFlow2 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoSizes = 1;
                if (mutableSharedFlow.emit(new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect.NavigateToChooseFormat((java.util.List) mutableStateFlow2.getValue()), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel$onContinueClick$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel$onContinueClick$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataAccessSelectSourcesViewModel$onContinueClick$1(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel dataAccessSelectSourcesViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel$onContinueClick$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = dataAccessSelectSourcesViewModel;
    }
}

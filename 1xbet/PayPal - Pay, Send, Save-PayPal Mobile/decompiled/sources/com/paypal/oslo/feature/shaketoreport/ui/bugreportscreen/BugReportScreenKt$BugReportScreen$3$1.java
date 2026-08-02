package com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$3$1", f = "BugReportScreen.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class BugReportScreenKt$BugReportScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportResultState getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.shaketoreport.domain.BugReportError> bugReportError = this.Camera2StreamConfigurationMap.getBugReportError();
            final com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportResultState bugReportResultState = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = 1;
            if (bugReportError.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$3$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportResultState.this.handleError((com.paypal.oslo.feature.shaketoreport.domain.BugReportError) obj2);
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$3$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BugReportScreenKt$BugReportScreen$3$1(com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel bugReportViewModel, com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportResultState bugReportResultState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = bugReportViewModel;
        this.getHighSpeedVideoFpsRangesFor = bugReportResultState;
    }
}

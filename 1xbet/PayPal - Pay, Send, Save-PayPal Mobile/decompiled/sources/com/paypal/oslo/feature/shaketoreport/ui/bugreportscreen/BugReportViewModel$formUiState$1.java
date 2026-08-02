package com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/shaketoreport/ui/bugreportscreen/BugReportFormUiState;", "titleValue", "", "stepsValue", "frequencyValue", "emailValue"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel$formUiState$1", f = "BugReportViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class BugReportViewModel$formUiState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormUiState>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str2 = (java.lang.String) this.getHighSpeedVideoFpsRanges;
        java.lang.String str3 = (java.lang.String) this.Camera2StreamConfigurationMap;
        java.lang.String str4 = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormUiState(str, str2, str3, str4);
    }

    @Override // kotlin.jvm.functions.Function5
    public final /* synthetic */ java.lang.Object invoke(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormUiState> continuation) {
        com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel$formUiState$1 bugReportViewModel$formUiState$1 = new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel$formUiState$1(continuation);
        bugReportViewModel$formUiState$1.getHighSpeedVideoFpsRangesFor = str;
        bugReportViewModel$formUiState$1.getHighSpeedVideoFpsRanges = str2;
        bugReportViewModel$formUiState$1.Camera2StreamConfigurationMap = str3;
        bugReportViewModel$formUiState$1.getHighResolutionOutputSizeshNQ4ISI = str4;
        return bugReportViewModel$formUiState$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    BugReportViewModel$formUiState$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel$formUiState$1> continuation) {
        super(5, continuation);
    }
}

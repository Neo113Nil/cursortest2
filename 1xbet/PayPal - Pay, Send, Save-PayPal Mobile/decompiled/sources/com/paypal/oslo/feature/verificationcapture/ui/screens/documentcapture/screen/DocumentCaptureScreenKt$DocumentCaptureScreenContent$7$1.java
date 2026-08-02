package com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenKt$DocumentCaptureScreenContent$7$1", f = "DocumentCaptureScreen.kt", i = {}, l = {326, com.visa.cbp.getCertUsage.getAppPrgrmIDAID}, m = "invokeSuspend", n = {}, nl = {327, com.visa.cbp.getCertUsage.setODAData}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class DocumentCaptureScreenKt$DocumentCaptureScreenContent$7$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(200, r6) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap.processEvent(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.ConfirmPreview.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoSizes.setValue(java.lang.Boolean.valueOf(false));
        this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(true));
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(java.lang.Boolean.valueOf(true));
        this.getHighSpeedVideoFpsRangesFor = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenKt$DocumentCaptureScreenContent$7$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenKt$DocumentCaptureScreenContent$7$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentCaptureScreenKt$DocumentCaptureScreenContent$7$1(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel documentCaptureViewModel, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenKt$DocumentCaptureScreenContent$7$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = documentCaptureViewModel;
        this.getHighSpeedVideoSizes = mutableState;
        this.getHighSpeedVideoFpsRanges = mutableState2;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState3;
    }
}

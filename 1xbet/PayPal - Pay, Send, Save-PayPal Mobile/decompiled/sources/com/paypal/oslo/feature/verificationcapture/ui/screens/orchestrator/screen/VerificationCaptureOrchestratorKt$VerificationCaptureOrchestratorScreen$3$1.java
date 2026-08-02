package com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$3$1", f = "VerificationCaptureOrchestrator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.util.Navigator Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult documentCaptureNavResult = (com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Received DocumentCaptureNavResult", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(documentCaptureNavResult.getClass()).getSimpleName())), null, 4, null);
        com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.handler.ResultHandler resultHandler = com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.handler.ResultHandler.INSTANCE;
        com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel verificationCaptureOrchestratorViewModel = this.getHighSpeedVideoSizes;
        resultHandler.m20680handleDocumentResult1z4cvM0(documentCaptureNavResult, verificationCaptureOrchestratorViewModel, this.Camera2StreamConfigurationMap, verificationCaptureOrchestratorViewModel.getDocumentCaptureRequestId());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult documentCaptureNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$3$1) create(documentCaptureNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$3$1 verificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$3$1 = new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$3$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        verificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$3$1.getHighSpeedVideoFpsRangesFor = obj;
        return verificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$3$1(com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel verificationCaptureOrchestratorViewModel, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = verificationCaptureOrchestratorViewModel;
        this.Camera2StreamConfigurationMap = navigator;
    }
}

package com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$4$1", f = "VerificationCaptureOrchestrator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.util.Navigator getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult livenessNavResult = (com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Received LivenessNavResult", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(livenessNavResult.getClass()).getSimpleName())), null, 4, null);
        com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.handler.ResultHandler.INSTANCE.handleLivenessResult(livenessNavResult, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult livenessNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$4$1) create(livenessNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$4$1 verificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$4$1 = new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$4$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        verificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$4$1.getHighSpeedVideoSizes = obj;
        return verificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$4$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$4$1(com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel verificationCaptureOrchestratorViewModel, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$4$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = verificationCaptureOrchestratorViewModel;
        this.getHighSpeedVideoFpsRanges = navigator;
    }
}

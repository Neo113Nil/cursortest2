package com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$1$1", f = "VerificationCaptureOrchestrator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.util.Navigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ android.content.Context getHighSpeedVideoSizes;
    int getOutputFormats;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext> getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[Orchestrator] LaunchedEffect triggered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("context", com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt.access$VerificationCaptureOrchestratorScreen$lambda$0(this.getOutputMinFrameDuration))), null, 4, null);
        if (com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt.access$VerificationCaptureOrchestratorScreen$lambda$0(this.getOutputMinFrameDuration) == null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[Orchestrator] Initializing ViewModel with workflowContext", null, null, 6, null);
            this.Camera2StreamConfigurationMap.initialize(this.getHighResolutionOutputSizeshNQ4ISI);
            if (androidx.core.content.ContextCompat.checkSelfPermission(this.getHighSpeedVideoSizes, "android.permission.CAMERA") == 0) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[Orchestrator] Camera permission already granted — routing to entry point", null, null, 6, null);
                com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.routing.FlowRouter.INSTANCE.m20682routeToEntryPointhEdsvIk(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap.getDocumentCaptureRequestId(), this.Camera2StreamConfigurationMap.getLivenessRequestId());
            } else {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[Orchestrator] Requesting camera permission before routing", null, null, 6, null);
                this.getHighSpeedVideoFpsRanges.launch("android.permission.CAMERA");
            }
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[Orchestrator] Context already initialized, skipping routeToEntryPoint", null, null, 6, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$1$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$1$1(com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel verificationCaptureOrchestratorViewModel, com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext workflowContext, android.content.Context context, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.lang.Boolean> managedActivityResultLauncher, androidx.compose.runtime.State<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = verificationCaptureOrchestratorViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = workflowContext;
        this.getHighSpeedVideoSizes = context;
        this.getHighSpeedVideoFpsRangesFor = navigator;
        this.getHighSpeedVideoFpsRanges = managedActivityResultLauncher;
        this.getOutputMinFrameDuration = state;
    }
}

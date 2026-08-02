package com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel$uploadDocument$1", f = "VerificationCaptureOrchestratorViewModel.kt", i = {0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, m = "invokeSuspend", n = {"workflowCtx", "partyId", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "metadata"}, nl = {255}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes15.dex */
final class VerificationCaptureOrchestratorViewModel$uploadDocument$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ byte[] getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.verificationcapture.api.VerificationCaptureService verificationCaptureService;
        java.lang.Object uploadDocument;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult> workflowResults;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Starting document upload", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("size_bytes", kotlin.coroutines.jvm.internal.Boxing.boxInt(this.getHighResolutionOutputSizeshNQ4ISI.length)), kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.DOCUMENT_TYPE, this.getHighSpeedVideoSizes), kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.DOCUMENT_SIDE, this.Camera2StreamConfigurationMap)), null, 4, null);
            mutableStateFlow = this.getOutputFormats.getHighSpeedVideoFpsRanges;
            mutableStateFlow.setValue(com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Uploading.INSTANCE);
            mutableStateFlow2 = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext workflowContext = (com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext) mutableStateFlow2.getValue();
            if (workflowContext == null || (str = workflowContext.getPartyId()) == null) {
                str = "unknown";
            }
            if (workflowContext == null || (str2 = workflowContext.getFlowName()) == null) {
                str2 = "IDENTITY_VERIFICATION";
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Upload metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("party_id", str), kotlin.TuplesKt.to("flow_name", str2)), null, 4, null);
            com.paypal.oslo.feature.verificationcapture.api.models.DocumentMetadata documentMetadata = new com.paypal.oslo.feature.verificationcapture.api.models.DocumentMetadata(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, str, str2, (java.util.Map) null, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            verificationCaptureService = this.getOutputFormats.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(workflowContext);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documentMetadata);
            this.getInputFormats = 1;
            uploadDocument = verificationCaptureService.uploadDocument(this.getHighResolutionOutputSizeshNQ4ISI, documentMetadata, this);
            if (uploadDocument == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            uploadDocument = obj;
        }
        arrow.core.Either either = (arrow.core.Either) uploadDocument;
        if (either instanceof arrow.core.Either.Right) {
            java.lang.String str3 = (java.lang.String) ((arrow.core.Either.Right) either).getValue();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Document upload succeeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("document_id", str3)), null, 4, null);
            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult workflowResult = new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.DOCUMENT_UPLOAD, str3, null, str3, 0, false, null, null, null, null, null, null, null, 8176, null);
            mutableStateFlow4 = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext workflowContext2 = (com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext) mutableStateFlow4.getValue();
            if (workflowContext2 != null && (workflowResults = workflowContext2.getWorkflowResults()) != null) {
                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(workflowResults.add(workflowResult));
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Stored upload result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("document_id", str3)), null, 4, null);
            mutableStateFlow5 = this.getOutputFormats.getHighSpeedVideoFpsRanges;
            mutableStateFlow5.setValue(new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Success(str3));
        } else {
            if (!(either instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Either.Left left = (arrow.core.Either.Left) either;
            java.lang.Throwable cause = ((com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError) left.getValue()).getCause();
            if (cause != null) {
                com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog().e("Document upload failed", cause);
            }
            mutableStateFlow3 = this.getOutputFormats.getHighSpeedVideoFpsRanges;
            mutableStateFlow3.setValue(new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Error((com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError) left.getValue()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel$uploadDocument$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel$uploadDocument$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getOutputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationCaptureOrchestratorViewModel$uploadDocument$1(byte[] bArr, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel verificationCaptureOrchestratorViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel$uploadDocument$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getOutputFormats = verificationCaptureOrchestratorViewModel;
    }
}

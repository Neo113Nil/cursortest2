package com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.handler;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/handler/ResultHandler;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult;", "result", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel;", "viewModel", "Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;", "navigator", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "documentCaptureRequestId", "", "handleDocumentResult-1z4cvM0", "(Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel;Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;Ljava/lang/String;)V", "handleDocumentResult", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult;", "handleLivenessResult", "(Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel;Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;)V", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState;", "uploadState", "handleUploadState-1z4cvM0", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel;Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;Ljava/lang/String;)V", "handleUploadState", "p0", "p1", "p2", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel;Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;Ljava/lang/String;)V", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel;Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;)V", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowContext;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowContext;Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ResultHandler {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.handler.ResultHandler INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.handler.ResultHandler();

    private ResultHandler() {
    }

    /* renamed from: handleDocumentResult-1z4cvM0, reason: not valid java name */
    public final void m20680handleDocumentResult1z4cvM0(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult result, com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel viewModel, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, java.lang.String documentCaptureRequestId) {
        com.paypal.oslo.feature.verificationcapture.domain.model.ResultType resultType;
        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult> emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentCaptureRequestId, "");
        if (!viewModel.isWebFlow()) {
            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value = viewModel.getWorkflowContext().getValue();
            if (value == null || (resultType = value.getResultType()) == null) {
                resultType = com.paypal.oslo.feature.verificationcapture.domain.model.ResultType.FILE;
            }
            if (result instanceof com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success) {
                int i = com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.handler.ResultHandler.WhenMappings.$EnumSwitchMapping$0[resultType.ordinal()];
                if (i == 1) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "ResultType.VP_ID: Uploading document to backend", null, null, 6, null);
                    com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success success = (com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success) result;
                    viewModel.uploadDocument(success.getImageBytes(), success.getDocumentType(), success.getDocumentSide());
                    return;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Unexpected WEB resultType in normal flow handler", null, null, 6, null);
                    return;
                }
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "ResultType.FILE: Storing image bytes locally", null, null, 6, null);
                com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success success2 = (com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success) result;
                viewModel.storeDocumentFile(success2.getImageBytes(), success2.getDocumentType(), success2.getDocumentSide());
                if (viewModel.moveToNextWorkflow()) {
                    Camera2StreamConfigurationMap(viewModel, navigator, documentCaptureRequestId);
                    return;
                }
                com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value2 = viewModel.getWorkflowContext().getValue();
                if (value2 == null) {
                    throw new java.lang.IllegalStateException("Workflow context is null after FILE store".toString());
                }
                getHighSpeedVideoSizes(value2, navigator);
                return;
            }
            if (result instanceof com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Cancelled) {
                Camera2StreamConfigurationMap(viewModel, navigator);
                return;
            }
            if (result instanceof com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Timeout) {
                com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.handler.TimeoutHandler.INSTANCE.handleDocumentTimeout(viewModel, navigator);
                return;
            }
            if (!(result instanceof com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value3 = viewModel.getWorkflowContext().getValue();
            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig currentConfig = value3 != null ? value3.getCurrentConfig() : null;
            if (currentConfig != null && currentConfig.isAllowManualCapture() && kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error) result).getErrorCode(), "SDK_FAILURE")) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Fallback to manual capture", null, null, 6, null);
                return;
            }
            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value4 = viewModel.getWorkflowContext().getValue();
            if (value4 != null) {
                value4.setResultStatusCode(com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode.FAILURE);
                navigator.popBackStack();
                return;
            }
            return;
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Web flow detected - handling document result", null, null, 6, null);
        if (result instanceof com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success) {
            com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success success3 = (com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success) result;
            viewModel.storeDocumentFile(success3.getImageBytes(), success3.getDocumentType(), success3.getDocumentSide());
            if (viewModel.moveToNextWorkflow()) {
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Web flow: more captures pending, continuing workflow", null, null, 6, null);
                return;
            }
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Web flow: all captures complete, queuing result for WebView return", null, null, 6, null);
            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value5 = viewModel.getWorkflowContext().getValue();
            if (value5 == null || (emptyList = value5.getWorkflowResults()) == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            viewModel.queueWebResult(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertDocumentResults(emptyList));
            navigator.popBackStack();
            return;
        }
        if (!(result instanceof com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Cancelled)) {
            if (!(result instanceof com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Timeout)) {
                if (!(result instanceof com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Cleanup temp file", null, null, 6, null);
                com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error error = (com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error) result;
                viewModel.queueWebResult(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertError(error.getErrorCode(), error.getErrorMessage()));
                navigator.popBackStack();
                return;
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Cleanup temp file", null, null, 6, null);
            viewModel.queueWebResult(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertTimeout());
            navigator.popBackStack();
            return;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Cleanup temp file", null, null, 6, null);
        viewModel.queueWebResult(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertCancel());
        navigator.popBackStack();
    }

    public final void handleLivenessResult(com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult result, com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel viewModel, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator) {
        java.lang.String convertError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        if (!viewModel.isWebFlow()) {
            if (result instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success) {
                com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success success = (com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success) result;
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Liveness check succeeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("session_id", success.getSessionId())), null, 4, null);
                viewModel.storeLivenessData(success.getFaceScanData(), success.getAuditTrailImages(), success.getLowQualityAuditTrailImages(), success.getSessionId(), success.getRetryCount());
                if (viewModel.moveToNextWorkflow()) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "More workflows remain after liveness", null, null, 6, null);
                    return;
                }
                com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value = viewModel.getWorkflowContext().getValue();
                if (value == null) {
                    throw new java.lang.IllegalStateException("Workflow context is null after completing workflows".toString());
                }
                getHighSpeedVideoSizes(value, navigator);
                return;
            }
            if (result instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Cancelled) {
                Camera2StreamConfigurationMap(viewModel, navigator);
                return;
            }
            if (result instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Timeout) {
                com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.handler.TimeoutHandler.INSTANCE.handleLivenessTimeout(viewModel, navigator);
                return;
            }
            if (!(result instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Liveness check failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_message", ((com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error) result).getErrorMessage())), null, null, 12, null);
            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value2 = viewModel.getWorkflowContext().getValue();
            if (value2 != null) {
                value2.setResultStatusCode(com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode.FAILURE);
                navigator.popBackStack();
                return;
            }
            return;
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Web flow detected - sending liveness result back to WebView", null, null, 6, null);
        if (result instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success) {
            convertError = com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertLivenessResult((com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success) result);
        } else if (result instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Cancelled) {
            convertError = com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertCancel();
        } else if (result instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Timeout) {
            convertError = com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertTimeout();
        } else {
            if (!(result instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error error = (com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error) result;
            convertError = com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertError(error.getErrorCode(), error.getErrorMessage());
        }
        viewModel.queueWebResult(convertError);
        navigator.popBackStack();
    }

    /* renamed from: handleUploadState-1z4cvM0, reason: not valid java name */
    public final void m20681handleUploadState1z4cvM0(com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState uploadState, com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel viewModel, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, java.lang.String documentCaptureRequestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentCaptureRequestId, "");
        if (uploadState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Success) {
            viewModel.resetUploadState();
            if (viewModel.moveToNextWorkflow()) {
                Camera2StreamConfigurationMap(viewModel, navigator, documentCaptureRequestId);
                return;
            }
            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value = viewModel.getWorkflowContext().getValue();
            if (value == null) {
                throw new java.lang.IllegalStateException("Workflow context is null after upload success".toString());
            }
            getHighSpeedVideoSizes(value, navigator);
            return;
        }
        if (uploadState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Error) {
            viewModel.resetUploadState();
            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value2 = viewModel.getWorkflowContext().getValue();
            if (value2 != null) {
                value2.setResultStatusCode(com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode.FAILURE);
                navigator.popBackStack();
                return;
            }
            return;
        }
        if (!(uploadState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Uploading) && !(uploadState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Idle)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    private static void Camera2StreamConfigurationMap(com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel p0, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator p1, java.lang.String p2) {
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value = p0.getWorkflowContext().getValue();
        if (value != null) {
            if (value.hasMoreWorkflows()) {
                com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig currentConfig = value.getCurrentConfig();
                if (currentConfig == null) {
                    return;
                }
                if (kotlin.text.StringsKt.equals(p0.getFlowName(), com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.EARLY_RELEASE_FLOW_NAME, true)) {
                    value.setShowIntermediateTutorialPage(true);
                }
                int i = com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.handler.ResultHandler.WhenMappings.$EnumSwitchMapping$1[currentConfig.getWorkflowType().ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Liveness capture not yet implemented in orchestrator", null, null, 6, null);
                    return;
                }
                java.lang.String docType = currentConfig.getDocType();
                if (docType.length() == 0) {
                    docType = "DRIVERS_LICENSE";
                }
                java.lang.String str = docType;
                java.lang.String docSide = currentConfig.getDocSide();
                if (docSide == null) {
                    docSide = com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT;
                }
                p1.mo20615navigateForResultqCNXlvQ(p2, new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination(str, docSide, value.getLocale()));
                return;
            }
            getHighSpeedVideoSizes(value, p1);
        }
    }

    private static void Camera2StreamConfigurationMap(com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel p0, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator p1) {
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value = p0.getWorkflowContext().getValue();
        if (value == null) {
            return;
        }
        if (!value.getCanGoBack() && kotlin.text.StringsKt.equals(p0.getFlowName(), com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.EARLY_RELEASE_FLOW_NAME, true)) {
            p1.navigate(new com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination(value.getManualReviewHours()));
            return;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value2 = p0.getWorkflowContext().getValue();
        if (value2 != null) {
            value2.setResultStatusCode(com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode.CANCEL);
            p1.popBackStack();
        }
    }

    private static void getHighSpeedVideoSizes(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext p0, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator p1) {
        boolean z;
        p0.setResultStatusCode(com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode.RESULT);
        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult> workflowResults = p0.getWorkflowResults();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(workflowResults, 10));
        for (com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult workflowResult : workflowResults) {
            arrayList.add(new com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult(workflowResult.getDocumentContext(), workflowResult.getFaceScan(), workflowResult.getAuditTrailCompressedBase64(), workflowResult.getLowQualityAuditTrailCompressedBase64(), workflowResult.getDocumentId(), workflowResult.getVpId(), workflowResult.getSessionId(), workflowResult.getRetryCount(), workflowResult.isManualCapture(), workflowResult.getBarcode(), workflowResult.getExtractedData(), workflowResult.getMetaData()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult> workflowResults2 = p0.getWorkflowResults();
        if (!(workflowResults2 instanceof java.util.Collection) || !workflowResults2.isEmpty()) {
            java.util.Iterator<T> it = workflowResults2.iterator();
            while (it.hasNext()) {
                if (((com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult) it.next()).getWorkflowType() == com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.SELFIE) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        java.lang.String flowName = p0.getFlowName();
        if (flowName == null) {
            flowName = "";
        }
        com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Success success = new com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Success(arrayList2, z, flowName);
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Finishing workflow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("capture_results_count", java.lang.Integer.valueOf(arrayList2.size())), kotlin.TuplesKt.to("liveness_completed", java.lang.Boolean.valueOf(success.getLivenessCompleted()))), null, 4, null);
        p1.popBackStack(new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination("", "", (com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), success);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.verificationcapture.domain.model.ResultType.values().length];
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.domain.model.ResultType.VP_ID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.domain.model.ResultType.FILE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.domain.model.ResultType.WEB.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.DOCUMENT_UPLOAD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.POA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.SELFIE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}

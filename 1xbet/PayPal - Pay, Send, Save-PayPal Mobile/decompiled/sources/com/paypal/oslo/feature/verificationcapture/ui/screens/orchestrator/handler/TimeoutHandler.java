package com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.handler;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/handler/TimeoutHandler;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel;", "viewModel", "Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;", "navigator", "", "handleDocumentTimeout", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel;Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;)V", "handleLivenessTimeout"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TimeoutHandler {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.handler.TimeoutHandler INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.handler.TimeoutHandler();

    private TimeoutHandler() {
    }

    public final void handleDocumentTimeout(com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel viewModel, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        java.lang.String flowName = viewModel.getFlowName();
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value = viewModel.getWorkflowContext().getValue();
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig currentConfig = value != null ? value.getCurrentConfig() : null;
        if (!kotlin.text.StringsKt.equals(flowName, com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.CIP_FLOW_NAME, true) && !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) flowName, (java.lang.CharSequence) com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.ZB_FLOW_NAME, false, 2, (java.lang.Object) null)) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(currentConfig != null ? currentConfig.getCaptureMode() : null, "MANUAL")) {
                com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value2 = viewModel.getWorkflowContext().getValue();
                if (value2 != null) {
                    value2.setResultStatusCode(com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode.CANCEL);
                    navigator.popBackStack();
                    return;
                }
                return;
            }
        }
        if (currentConfig != null && currentConfig.isHandleManualCapture()) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Show timeout failover page", null, null, 6, null);
        } else {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Navigate to manual upload", null, null, 6, null);
        }
    }

    public final void handleLivenessTimeout(com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel viewModel, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        if (kotlin.text.StringsKt.equals(viewModel.getFlowName(), com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.EARLY_RELEASE_FLOW_NAME, true)) {
            if (!viewModel.isLivenessRetryLimitReached()) {
                viewModel.incrementLivenessRetry();
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Show liveness retry page", null, null, 6, null);
                return;
            }
            viewModel.resetLivenessRetry();
            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value = viewModel.getWorkflowContext().getValue();
            if (value != null) {
                value.setResultStatusCode(com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode.FAILURE);
                navigator.popBackStack();
                return;
            }
            return;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value2 = viewModel.getWorkflowContext().getValue();
        if (value2 != null) {
            value2.setResultStatusCode(com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode.TIMEOUT);
            navigator.popBackStack();
        }
    }
}

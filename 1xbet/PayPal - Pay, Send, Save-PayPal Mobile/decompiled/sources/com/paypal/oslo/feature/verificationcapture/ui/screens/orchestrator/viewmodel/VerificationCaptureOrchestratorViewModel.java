package com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 J2\u00020\u0001:\u0002KJB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u000fJ\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u000fJ\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u000fJ%\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b!\u0010 JA\u0010)\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00132\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130#2\u0006\u0010&\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\n¢\u0006\u0004\b+\u0010\u0018J\r\u0010,\u001a\u00020\r¢\u0006\u0004\b,\u0010\u000fJ\u0015\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0013¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0013¢\u0006\u0004\b0\u0010/R\u0014\u00103\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0017\u00108\u001a\u0002078\u0007¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u0015R\u001a\u0010;\u001a\u0002078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010\u0015R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u0010>R\"\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0@8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020'0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010>R \u0010E\u001a\b\u0012\u0004\u0012\u00020'0@8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u0010DR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020G0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u0010>R \u0010H\u001a\b\u0012\u0004\u0012\u00020G0@8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010B\u001a\u0004\bI\u0010D"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/verificationcapture/api/VerificationCaptureService;", "verificationService", "Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;", "webViewDelegate", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/api/VerificationCaptureService;Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;)V", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowContext;", "context", "", "initialize", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowContext;)V", "", "moveToNextWorkflow", "()Z", "isDocumentCapture", "isLivenessCapture", "shouldShowIntermediateTutorial", "", "getFlowName", "()Ljava/lang/String;", "isPOACapture", "incrementLivenessRetry", "()V", "resetLivenessRetry", "isLivenessRetryLimitReached", "", "imageBytes", "documentType", "documentSide", "uploadDocument", "([BLjava/lang/String;Ljava/lang/String;)V", "storeDocumentFile", "faceScanData", "", "auditTrailImages", "lowQualityAuditTrailImages", "sessionId", "", "retryCount", "storeLivenessData", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;I)V", "resetUploadState", "isWebFlow", "jsonPayload", "sendWebResult", "(Ljava/lang/String;)V", "queueWebResult", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/verificationcapture/api/VerificationCaptureService;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "documentCaptureRequestId", "Ljava/lang/String;", "getDocumentCaptureRequestId-QDVFmTU", "livenessRequestId", "getLivenessRequestId-QDVFmTU", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "workflowContext", "Lkotlinx/coroutines/flow/StateFlow;", "getWorkflowContext", "()Lkotlinx/coroutines/flow/StateFlow;", "livenessRetryCount", "getLivenessRetryCount", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState;", "uploadState", "getUploadState", "Companion", "UploadState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VerificationCaptureOrchestratorViewModel extends androidx.view.ViewModel {
    public static final java.lang.String CIP_FLOW_NAME = "CIP";
    public static final java.lang.String EARLY_RELEASE_FLOW_NAME = "SRS";
    public static final java.lang.String HK_CIP_FLOW_NAME = "HK_CIP";
    public static final int LIVENESS_RETRY_LIMIT = 5;
    public static final java.lang.String ZB_FLOW_NAME = "ZB";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String documentCaptureRequestId;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.api.VerificationCaptureService Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl getHighSpeedVideoFpsRangesFor;
    private final java.lang.String livenessRequestId;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> livenessRetryCount;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState> uploadState;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext> workflowContext;
    public static final int $stable = 8;

    @javax.inject.Inject
    public VerificationCaptureOrchestratorViewModel(com.paypal.oslo.feature.verificationcapture.api.VerificationCaptureService verificationCaptureService, com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureWebViewDelegateImpl, "");
        this.Camera2StreamConfigurationMap = verificationCaptureService;
        this.getHighSpeedVideoFpsRangesFor = verificationCaptureWebViewDelegateImpl;
        this.documentCaptureRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        this.livenessRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.workflowContext = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(0);
        this.getHighSpeedVideoSizes = MutableStateFlow2;
        this.livenessRetryCount = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Idle.INSTANCE);
        this.getHighSpeedVideoFpsRanges = MutableStateFlow3;
        this.uploadState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow3);
    }

    /* renamed from: getDocumentCaptureRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getDocumentCaptureRequestId() {
        return this.documentCaptureRequestId;
    }

    /* renamed from: getLivenessRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getLivenessRequestId() {
        return this.livenessRequestId;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext> getWorkflowContext() {
        return this.workflowContext;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getLivenessRetryCount() {
        return this.livenessRetryCount;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState> getUploadState() {
        return this.uploadState;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState;", "", "<init>", "()V", "Idle", "Uploading", "Success", "Error", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState$Error;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState$Idle;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState$Success;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState$Uploading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class UploadState {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState$Idle;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Idle extends com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Idle INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Idle();

            public final int hashCode() {
                return -292324496;
            }

            private Idle() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Idle";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Idle)) {
                    return false;
                }
                return true;
            }
        }

        private UploadState() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState$Uploading;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Uploading extends com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Uploading INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Uploading();

            public final int hashCode() {
                return -1059462107;
            }

            private Uploading() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Uploading";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Uploading)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState$Success;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDocumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Success extends com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState {
            public static final int $stable = 0;
            private final java.lang.String documentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.documentId = str;
            }

            public final java.lang.String getDocumentId() {
                return this.documentId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.documentId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(documentId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.documentId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, ((com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Success) other).documentId);
            }

            public final com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Success copy(java.lang.String documentId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentId, "");
                return new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Success(documentId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getDocumentId() {
                return this.documentId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Success copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Success success, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = success.documentId;
                }
                return success.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState$Error;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState;", "Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationCaptureError;", "error", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationCaptureError;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationCaptureError;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationCaptureError;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationCaptureError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error extends com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState {
            public static final int $stable = com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.$stable;
            private final com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError verificationCaptureError) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureError, "");
                this.error = verificationCaptureError;
            }

            public final com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError getError() {
                return this.error;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError verificationCaptureError = this.error;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(error=");
                sb.append(verificationCaptureError);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Error) other).error);
            }

            public final com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Error copy(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Error(error);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError getError() {
                return this.error;
            }

            public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Error copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Error error, com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError verificationCaptureError, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    verificationCaptureError = error.error;
                }
                return error.copy(verificationCaptureError);
            }
        }

        public /* synthetic */ UploadState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void initialize(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(context);
        this.getHighSpeedVideoSizes.setValue(0);
    }

    public final boolean moveToNextWorkflow() {
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        if (value == null) {
            return false;
        }
        value.incrementIndex();
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(value);
        return value.hasMoreWorkflows();
    }

    public final boolean isDocumentCapture() {
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig currentConfig = value != null ? value.getCurrentConfig() : null;
        if ((currentConfig != null ? currentConfig.getWorkflowType() : null) != com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.DOCUMENT_UPLOAD) {
            return (currentConfig != null ? currentConfig.getWorkflowType() : null) == com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.POA;
        }
        return true;
    }

    public final boolean isLivenessCapture() {
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig currentConfig = value != null ? value.getCurrentConfig() : null;
        return (currentConfig != null ? currentConfig.getWorkflowType() : null) == com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.SELFIE;
    }

    public final boolean shouldShowIntermediateTutorial() {
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        return value != null && value.getShowIntermediateTutorialPage();
    }

    public final java.lang.String getFlowName() {
        java.lang.String flowName;
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        return (value == null || (flowName = value.getFlowName()) == null) ? "" : flowName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        r0 = r0.getOptions();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isPOACapture() {
        java.lang.String options;
        java.lang.Integer intOrNull;
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig currentConfig = value != null ? value.getCurrentConfig() : null;
        if (currentConfig != null && options != null) {
            try {
                java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) options, new java.lang.String[]{"#"}, false, 0, 6, (java.lang.Object) null);
                if (split$default.size() == 2) {
                    java.util.List split$default2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) split$default.get(1), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
                    if (split$default2.size() >= 5 && (intOrNull = kotlin.text.StringsKt.toIntOrNull((java.lang.String) split$default2.get(4))) != null) {
                        if (intOrNull.intValue() == 4) {
                            return true;
                        }
                    }
                    return false;
                }
            } catch (java.lang.Exception e) {
                com.paypal.android.logger.Logger log = com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog();
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                pairArr[0] = kotlin.TuplesKt.to("options", options);
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                pairArr[1] = kotlin.TuplesKt.to("error", message);
                com.paypal.android.logger.Logger.w$default(log, "[VerificationCaptureOrchestratorViewModel] Failed to parse POA options", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            }
        }
        return false;
    }

    public final void incrementLivenessRetry() {
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> mutableStateFlow = this.getHighSpeedVideoSizes;
        mutableStateFlow.setValue(java.lang.Integer.valueOf(mutableStateFlow.getValue().intValue() + 1));
    }

    public final void resetLivenessRetry() {
        this.getHighSpeedVideoSizes.setValue(0);
    }

    public final boolean isLivenessRetryLimitReached() {
        return this.getHighSpeedVideoSizes.getValue().intValue() >= 5;
    }

    public final void uploadDocument(byte[] imageBytes, java.lang.String documentType, java.lang.String documentSide) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageBytes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel$uploadDocument$1(imageBytes, documentType, documentSide, this, null), 3, null);
    }

    public final void storeDocumentFile(byte[] imageBytes, java.lang.String documentType, java.lang.String documentSide) {
        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult> workflowResults;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageBytes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Storing document bytes locally", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("size_bytes", java.lang.Integer.valueOf(imageBytes.length)), kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.DOCUMENT_TYPE, documentType), kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.DOCUMENT_SIDE, documentSide)), null, 4, null);
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult workflowResult = new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.DOCUMENT_UPLOAD, null, imageBytes, null, 0, false, null, null, null, null, null, null, null, 8176, null);
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        if (value != null && (workflowResults = value.getWorkflowResults()) != null) {
            workflowResults.add(workflowResult);
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Stored document bytes result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("size_bytes", java.lang.Integer.valueOf(imageBytes.length))), null, 4, null);
    }

    public final void storeLivenessData(java.lang.String faceScanData, java.util.List<java.lang.String> auditTrailImages, java.util.List<java.lang.String> lowQualityAuditTrailImages, java.lang.String sessionId, int retryCount) {
        byte[] decode;
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult workflowResult;
        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult> workflowResults;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceScanData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auditTrailImages, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lowQualityAuditTrailImages, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Storing liveness data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("session_id", sessionId), kotlin.TuplesKt.to("retry_count", java.lang.Integer.valueOf(retryCount))), null, 4, null);
        try {
            decode = android.util.Base64.decode(faceScanData, 0);
            workflowResult = new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.SELFIE, null, null, null, retryCount, false, null, null, null, decode, auditTrailImages, lowQualityAuditTrailImages, sessionId, 494, null);
        } catch (java.lang.Exception e) {
            e = e;
        }
        try {
            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
            if (value != null && (workflowResults = value.getWorkflowResults()) != null) {
                workflowResults.add(workflowResult);
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Stored liveness data result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("face_scan_bytes", java.lang.Integer.valueOf(decode.length)), kotlin.TuplesKt.to("audit_trail_image_count", java.lang.Integer.valueOf(auditTrailImages.size()))), null, 4, null);
        } catch (java.lang.Exception e2) {
            e = e2;
            com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog().e("Failed to store liveness data", e);
        }
    }

    public final void resetUploadState() {
        this.getHighSpeedVideoFpsRanges.setValue(com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState.Idle.INSTANCE);
    }

    public final boolean isWebFlow() {
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext value = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        return value != null && value.isWebFlow();
    }

    public final void sendWebResult(java.lang.String jsonPayload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPayload, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Sending web result back to WebView", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("payload_prefix", kotlin.text.StringsKt.take(jsonPayload, 100))), null, 4, null);
        this.getHighSpeedVideoFpsRangesFor.onCaptureResult(jsonPayload);
    }

    public final void queueWebResult(java.lang.String jsonPayload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPayload, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Queuing web result for WebView return", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("payload_prefix", kotlin.text.StringsKt.take(jsonPayload, 100))), null, 4, null);
        this.getHighSpeedVideoFpsRangesFor.queueForWebView(jsonPayload);
    }
}

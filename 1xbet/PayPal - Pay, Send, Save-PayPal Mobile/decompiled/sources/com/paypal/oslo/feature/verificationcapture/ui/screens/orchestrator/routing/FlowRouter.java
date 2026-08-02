package com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.routing;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/routing/FlowRouter;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowContext;", "context", "Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;", "navigator", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "documentCaptureRequestId", "livenessRequestId", "", "routeToEntryPoint-hEdsvIk", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowContext;Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;Ljava/lang/String;Ljava/lang/String;)V", "routeToEntryPoint", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowConfig;", "p0", "p1", "p2", "p3", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowConfig;Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowContext;Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FlowRouter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.routing.FlowRouter INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.routing.FlowRouter();

    private FlowRouter() {
    }

    /* renamed from: routeToEntryPoint-hEdsvIk, reason: not valid java name */
    public final void m20682routeToEntryPointhEdsvIk(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext context, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, java.lang.String documentCaptureRequestId, java.lang.String livenessRequestId) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String sessionToken;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentCaptureRequestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(livenessRequestId, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[Orchestrator] routeToEntryPoint() called", null, null, 6, null);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[Orchestrator] isWebFlow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("is_web_flow", java.lang.Boolean.valueOf(context.isWebFlow()))), null, 4, null);
        if (context.isWebFlow()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[Orchestrator] This is a WEB FLOW", null, null, 6, null);
            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig currentConfig = context.getCurrentConfig();
            com.paypal.android.logger.Logger log = com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog();
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = kotlin.TuplesKt.to("workflow_type", currentConfig != null ? currentConfig.getWorkflowType() : null);
            pairArr[1] = kotlin.TuplesKt.to("doc_type", currentConfig != null ? currentConfig.getDocType() : null);
            if (currentConfig == null || (sessionToken = currentConfig.getSessionToken()) == null) {
                str = com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT;
                str2 = null;
            } else {
                str = com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT;
                str2 = kotlin.text.StringsKt.take(sessionToken, 10);
            }
            pairArr[2] = kotlin.TuplesKt.to("session_token", str2);
            com.paypal.android.logger.Logger.d$default(log, "[Orchestrator] config", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            if (currentConfig == null) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[Orchestrator] No workflow config found for web flow", null, null, null, 14, null);
                navigator.popBackStack();
                return;
            }
            if (currentConfig.getWorkflowType() != com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.SELFIE) {
                if (currentConfig.getWorkflowType() != com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.DOCUMENT_UPLOAD && currentConfig.getWorkflowType() != com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.POA) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[Orchestrator] Unknown workflow type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("workflow_type", currentConfig.getWorkflowType())), null, null, 12, null);
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Unknown workflow type for web flow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("workflow_type", currentConfig.getWorkflowType())), null, 4, null);
                    navigator.popBackStack();
                    return;
                } else {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[Orchestrator] DOCUMENT_UPLOAD workflow detected - routing to document capture", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("doc_type", currentConfig.getDocType()), kotlin.TuplesKt.to("doc_side", currentConfig.getDocSide())), null, 4, null);
                    java.lang.String docType = currentConfig.getDocType();
                    java.lang.String str3 = docType != null ? docType : "DRIVERS_LICENSE";
                    java.lang.String docSide = currentConfig.getDocSide();
                    navigator.mo20615navigateForResultqCNXlvQ(documentCaptureRequestId, new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination(str3, docSide == null ? str : docSide, context.getLocale()));
                    return;
                }
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[Orchestrator] SELFIE workflow detected - routing to liveness capture", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("vendor", currentConfig.getVendor()), kotlin.TuplesKt.to("flow_name", context.getFlowName())), null, 4, null);
            java.lang.String upperCase = currentConfig.getVendor().toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(upperCase, "FACETEC")) {
                Camera2StreamConfigurationMap(currentConfig, context, navigator, livenessRequestId);
                return;
            } else {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[Orchestrator] Unsupported vendor", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("vendor", currentConfig.getVendor())), null, null, 12, null);
                navigator.popBackStack();
                return;
            }
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig currentConfig2 = context.getCurrentConfig();
        if (kotlin.text.StringsKt.equals(context.getFlowName(), com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.EARLY_RELEASE_FLOW_NAME, true)) {
            navigator.navigate(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureConfirmIdentityDestination.INSTANCE);
            return;
        }
        if ((currentConfig2 != null ? currentConfig2.getWorkflowType() : null) != com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.DOCUMENT_UPLOAD) {
            if ((currentConfig2 != null ? currentConfig2.getWorkflowType() : null) != com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.POA) {
                if ((currentConfig2 != null ? currentConfig2.getWorkflowType() : null) != com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.SELFIE) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "No valid workflow configuration found", null, null, null, 14, null);
                    navigator.popBackStack();
                    return;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[Orchestrator] Routing to liveness by vendor", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("vendor", currentConfig2.getVendor()), kotlin.TuplesKt.to("flow_name", context.getFlowName())), null, 4, null);
                java.lang.String upperCase2 = currentConfig2.getVendor().toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(upperCase2, "FACETEC")) {
                    Camera2StreamConfigurationMap(currentConfig2, context, navigator, livenessRequestId);
                    return;
                } else {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Unsupported vendor", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("vendor", currentConfig2.getVendor())), null, null, 12, null);
                    navigator.popBackStack();
                    return;
                }
            }
        }
        java.lang.String docType2 = currentConfig2.getDocType();
        java.lang.String str4 = docType2.length() != 0 ? docType2 : "DRIVERS_LICENSE";
        java.lang.String docSide2 = currentConfig2.getDocSide();
        navigator.mo20615navigateForResultqCNXlvQ(documentCaptureRequestId, new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination(str4, docSide2 == null ? com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT : docSide2, context.getLocale()));
    }

    private static void Camera2StreamConfigurationMap(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig p0, com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext p1, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator p2, java.lang.String p3) {
        java.lang.String sessionToken = p0.getSessionToken();
        java.lang.String deviceKeyIdentifier = p0.getDeviceKeyIdentifier();
        java.lang.String productionKey = p0.getProductionKey();
        java.lang.String licenseExpirationDate = p0.getLicenseExpirationDate();
        boolean isWebFlow = p1.isWebFlow();
        java.lang.String flowName = p1.getFlowName();
        java.lang.String partyId = p1.getPartyId();
        java.lang.String str = partyId == null ? "" : partyId;
        if (sessionToken != null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[Orchestrator] Navigating to FaceTec liveness with credentials from workflow", null, null, 6, null);
            p2.mo20615navigateForResultqCNXlvQ(p3, new com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureLivenessDestination(sessionToken, deviceKeyIdentifier == null ? "" : deviceKeyIdentifier, productionKey == null ? "" : productionKey, licenseExpirationDate != null ? licenseExpirationDate : "", isWebFlow, flowName, str));
            return;
        }
        com.paypal.android.logger.Logger log = com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog();
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        pairArr[0] = kotlin.TuplesKt.to("hasSessionToken", java.lang.Boolean.FALSE);
        pairArr[1] = kotlin.TuplesKt.to("hasDeviceKey", java.lang.Boolean.valueOf(deviceKeyIdentifier != null));
        pairArr[2] = kotlin.TuplesKt.to("hasProductionKey", java.lang.Boolean.valueOf(productionKey != null));
        pairArr[3] = kotlin.TuplesKt.to("hasLicenseExpiry", java.lang.Boolean.valueOf(licenseExpirationDate != null));
        com.paypal.android.logger.Logger.e$default(log, "Missing FaceTec session token - cannot proceed", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
        p2.popBackStack();
    }
}

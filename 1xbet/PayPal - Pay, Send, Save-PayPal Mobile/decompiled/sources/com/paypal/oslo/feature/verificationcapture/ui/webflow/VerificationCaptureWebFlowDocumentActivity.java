package com.paypal.oslo.feature.verificationcapture.ui.webflow;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\b\u0001\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J&\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J_\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\"H\u0000¢\u0006\u0002\b#J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0015H\u0002J\u0012\u0010'\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010\u0015H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006*²\u0006\n\u0010+\u001a\u00020,X\u008a\u008e\u0002"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/webflow/VerificationCaptureWebFlowDocumentActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "delegate", "Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;", "getDelegate$verification_capture_prodRelease", "()Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;", "setDelegate$verification_capture_prodRelease", "(Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "resolveDocumentWorkflows", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowContext;", "startCapture", "documentWorkflows", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowConfig;", "partyId", "", "isStage", "", "processCaptureResult", "result", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;", "config", "capturedResults", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowResult;", "documentSide", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "onNextStep", "Lkotlin/Function0;", "processCaptureResult$verification_capture_prodRelease", "parseDocumentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "docType", "parseDocumentSide", "docSide", "Companion", "verification-capture_prodRelease", "currentStep", ""}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.hilt.android.AndroidEntryPoint
/* loaded from: classes15.dex */
public final class VerificationCaptureWebFlowDocumentActivity extends com.paypal.oslo.feature.verificationcapture.ui.webflow.Hilt_VerificationCaptureWebFlowDocumentActivity {

    @javax.inject.Inject
    public com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.Companion(null);
    public static final int $stable = 8;

    public final com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl getDelegate$verification_capture_prodRelease() {
        com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl = this.delegate;
        if (verificationCaptureWebViewDelegateImpl != null) {
            return verificationCaptureWebViewDelegateImpl;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setDelegate$verification_capture_prodRelease(com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureWebViewDelegateImpl, "");
        this.delegate = verificationCaptureWebViewDelegateImpl;
    }

    @Override // com.paypal.oslo.feature.verificationcapture.ui.webflow.Hilt_VerificationCaptureWebFlowDocumentActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        java.lang.String stringExtra = getIntent().getStringExtra("extra_flow_config");
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext workflowContext = null;
        if (stringExtra == null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[WebFlowDocumentActivity] No flowConfig in Intent extras", null, null, null, 14, null);
            getDelegate$verification_capture_prodRelease().sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertError("NO_CONFIG", "Missing flow config"));
        } else {
            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext parse = com.paypal.oslo.feature.verificationcapture.webview.WebSdkPayloadParser.INSTANCE.parse(stringExtra);
            if (parse == null) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[WebFlowDocumentActivity] Failed to parse flowConfig", null, null, null, 14, null);
                getDelegate$verification_capture_prodRelease().sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertError("PARSE_ERROR", "Failed to parse flow config"));
            } else {
                java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig> workflowConfigs = parse.getWorkflowConfigs();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : workflowConfigs) {
                    com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig workflowConfig = (com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig) obj;
                    if (workflowConfig.getWorkflowType() == com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.DOCUMENT_UPLOAD || workflowConfig.getWorkflowType() == com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.POA) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[WebFlowDocumentActivity] No document workflows configured", null, null, null, 14, null);
                    getDelegate$verification_capture_prodRelease().sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertError("NO_WORKFLOWS", "No document workflows configured"));
                } else {
                    workflowContext = parse;
                }
            }
        }
        if (workflowContext == null) {
            finish();
            return;
        }
        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig> workflowConfigs2 = workflowContext.getWorkflowConfigs();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : workflowConfigs2) {
            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig workflowConfig2 = (com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig) obj2;
            if (workflowConfig2.getWorkflowType() == com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.DOCUMENT_UPLOAD || workflowConfig2.getWorkflowType() == com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.POA) {
                arrayList2.add(obj2);
            }
        }
        final java.util.ArrayList arrayList3 = arrayList2;
        final java.lang.String partyId = workflowContext.getPartyId();
        if (partyId == null) {
            partyId = "";
        }
        final boolean booleanExtra = getIntent().getBooleanExtra("extra_is_stage", false);
        androidx.view.result.ActivityResultLauncher registerForActivityResult = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.RequestPermission(), new androidx.view.result.ActivityResultCallback() { // from class: com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity$$ExternalSyntheticLambda3
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj3) {
                com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.m20696$r8$lambda$B4B5dLv8ISxrpciCUaIcqrxRKw(com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.this, arrayList3, partyId, booleanExtra, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        if (androidx.core.content.ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") == 0) {
            getHighSpeedVideoFpsRanges(arrayList3, partyId, booleanExtra);
        } else {
            registerForActivityResult.launch("android.permission.CAMERA");
        }
    }

    private final void getHighSpeedVideoFpsRanges(final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig> list, final java.lang.String str, final boolean z) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.view.compose.ComponentActivityKt.setContent$default(this, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1178058432, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.m20697$r8$lambda$SEOt5P2Usgr0BWd7F6tZP1OAvo(list, this, arrayList, str, z, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }), 1, null);
    }

    public final void processCaptureResult$verification_capture_prodRelease(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult result, com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig config, java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult> capturedResults, java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig> documentWorkflows, java.lang.String partyId, boolean isStage, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, kotlin.jvm.functions.Function0<kotlin.Unit> onNextStep) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capturedResults, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentWorkflows, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partyId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onNextStep, "");
        if (result instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success) {
            com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success success = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success) result;
            byte[] compressForFileStorage = com.paypal.oslo.feature.verificationcapture.util.ImageCompressionUtil.INSTANCE.compressForFileStorage(success.getImage(), documentWorkflows.size());
            com.paypal.oslo.feature.verificationcapture.webview.DocumentCaptureMetaDataBuilder documentCaptureMetaDataBuilder = com.paypal.oslo.feature.verificationcapture.webview.DocumentCaptureMetaDataBuilder.INSTANCE;
            com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity verificationCaptureWebFlowDocumentActivity = this;
            java.lang.String docSide = config.getDocSide();
            capturedResults.add(new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult(config.getWorkflowType(), null, compressForFileStorage, null, success.getCaptureData().getRetryCount(), success.getCaptureData().isManualCapture(), success.getCaptureData().getBarcode(), success.getCaptureData().getExtractedData(), documentCaptureMetaDataBuilder.build(verificationCaptureWebFlowDocumentActivity, compressForFileStorage, docSide == null ? documentSide.name() : docSide, success.getDeviceCaptureData(), partyId, isStage, success.getCaptureData().getBarcode(), success.getCaptureData().getExtractedData()), null, null, null, null, 7690, null));
            if (capturedResults.size() >= documentWorkflows.size()) {
                getDelegate$verification_capture_prodRelease().sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertDocumentResults(capturedResults));
                finish();
                return;
            } else {
                onNextStep.invoke();
                return;
            }
        }
        if (result instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess) {
            capturedResults.add(new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult(config.getWorkflowType(), null, new byte[0], ((com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess) result).getDocumentId(), 0, false, null, null, null, null, null, null, null, 8178, null));
            if (capturedResults.size() >= documentWorkflows.size()) {
                getDelegate$verification_capture_prodRelease().sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertDocumentResults(capturedResults));
                finish();
                return;
            } else {
                onNextStep.invoke();
                return;
            }
        }
        if (result instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Cancelled) {
            getDelegate$verification_capture_prodRelease().sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertCancel());
            finish();
        } else if (result instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Timeout) {
            getDelegate$verification_capture_prodRelease().sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertTimeout());
            finish();
        } else {
            if (!(result instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure failure = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure) result;
            getDelegate$verification_capture_prodRelease().sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertError(failure.getErrorCode(), failure.getErrorMessage()));
            finish();
        }
    }

    private static com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType Camera2StreamConfigurationMap(java.lang.String str) {
        java.lang.String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.DRIVERS_LICENSE;
        }
        if (kotlin.text.StringsKt.equals(str, "DRIVING_LICENSE", true)) {
            return com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.DRIVERS_LICENSE;
        }
        try {
            java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            return com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.valueOf(upperCase);
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("provided_value", str);
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            pairArr[1] = kotlin.TuplesKt.to("error", message);
            com.paypal.android.logger.Logger.w$default(logger, "[WebFlowDocumentActivity] Unknown document type, using DRIVERS_LICENSE", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.DRIVERS_LICENSE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/webflow/VerificationCaptureWebFlowDocumentActivity$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "flowConfig", "", "isStage", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/String;Z)Landroid/content/Intent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ android.content.Intent createIntent$default(com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.Companion companion, android.content.Context context, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            return companion.createIntent(context, str, z);
        }

        public final android.content.Intent createIntent(android.content.Context context, java.lang.String flowConfig, boolean isStage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowConfig, "");
            android.content.Intent putExtra = new android.content.Intent(context, (java.lang.Class<?>) com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.class).putExtra("extra_flow_config", flowConfig).putExtra("extra_is_stage", isStage);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "");
            return putExtra;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$B4B5dLv8ISxrpc-iCUaIcqrxRKw, reason: not valid java name */
    public static /* synthetic */ void m20696$r8$lambda$B4B5dLv8ISxrpciCUaIcqrxRKw(com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity verificationCaptureWebFlowDocumentActivity, java.util.List list, java.lang.String str, boolean z, boolean z2) {
        if (z2) {
            verificationCaptureWebFlowDocumentActivity.getHighSpeedVideoFpsRanges(list, str, z);
            return;
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[WebFlowDocumentActivity] Camera permission denied", null, null, 6, null);
        verificationCaptureWebFlowDocumentActivity.getDelegate$verification_capture_prodRelease().sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertError("PERMISSION_DENIED", "Camera permission denied"));
        verificationCaptureWebFlowDocumentActivity.finish();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$E24EyOAyolmuOhAwv9PmzSYH7AI(androidx.compose.runtime.MutableIntState mutableIntState) {
        mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r1.equals("FIRST_PAGE") != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        r1 = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.FRONT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0090, code lost:
    
        if (r1.equals("FRONT_SIDE") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0099, code lost:
    
        if (r1.equals(com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a4, code lost:
    
        if (r1.equals(com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.BACK) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        r1 = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.BACK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ad, code lost:
    
        if (r1.equals("BACK_SIDE") != false) goto L38;
     */
    /* renamed from: $r8$lambda$SEOt5P2Usgr0BWd7F6tZP1OA-vo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ kotlin.Unit m20697$r8$lambda$SEOt5P2Usgr0BWd7F6tZP1OAvo(final java.util.List list, final com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity verificationCaptureWebFlowDocumentActivity, final java.util.List list2, final java.lang.String str, final boolean z, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String str2;
        final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide;
        boolean changedInstance;
        boolean changed;
        boolean changedInstance2;
        boolean changedInstance3;
        boolean changed2;
        boolean changed3;
        boolean changed4;
        java.lang.Object rememberedValue;
        kotlin.jvm.functions.Function1 function1;
        boolean changedInstance4;
        java.lang.Object rememberedValue2;
        kotlin.jvm.functions.Function0 function0;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1178058432, i, -1, "com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.startCapture.<anonymous> (VerificationCaptureWebFlowDocumentActivity.kt:136)");
            }
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
                composer.updateRememberedValue(rememberedValue3);
            }
            final androidx.compose.runtime.MutableIntState mutableIntState = (androidx.compose.runtime.MutableIntState) rememberedValue3;
            androidx.compose.runtime.MutableIntState mutableIntState2 = mutableIntState;
            if (mutableIntState2.getIntValue() < list.size()) {
                composer.startReplaceGroup(1361177659);
                final com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig workflowConfig = (com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig) list.get(mutableIntState2.getIntValue());
                com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(workflowConfig.getDocType());
                java.lang.String docSide = workflowConfig.getDocSide();
                if (docSide != null) {
                    str2 = docSide.toUpperCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -143685201:
                            break;
                        case 2030823:
                            break;
                        case 67167753:
                            break;
                        case 190580173:
                            break;
                        case 353719006:
                            break;
                    }
                    documentSide = r1;
                    composer.startMovableGroup(-1757199648, java.lang.Integer.valueOf(mutableIntState2.getIntValue()));
                    changedInstance = composer.changedInstance(verificationCaptureWebFlowDocumentActivity);
                    changed = composer.changed(workflowConfig);
                    changedInstance2 = composer.changedInstance(list2);
                    changedInstance3 = composer.changedInstance(list);
                    changed2 = composer.changed(str);
                    changed3 = composer.changed(z);
                    changed4 = composer.changed(documentSide.ordinal());
                    rememberedValue = composer.rememberedValue();
                    if (!(changedInstance | changed | changedInstance2 | changedInstance3 | changed2 | changed3 | changed4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        java.lang.Object obj = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.m20698$r8$lambda$XncDkR6Wo3cO_VAOmNOUvgf8Mk(com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.this, workflowConfig, list2, list, str, z, documentSide, mutableIntState, (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult) obj2);
                            }
                        };
                        composer.updateRememberedValue(obj);
                        rememberedValue = obj;
                    }
                    function1 = (kotlin.jvm.functions.Function1) rememberedValue;
                    changedInstance4 = composer.changedInstance(verificationCaptureWebFlowDocumentActivity);
                    rememberedValue2 = composer.rememberedValue();
                    if (!changedInstance4 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.$r8$lambda$annW_AsHkcaN6p6RctqLdikBM9k(com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.this);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    if (workflowConfig.getWorkflowType() != com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.POA || kotlin.text.StringsKt.equals(workflowConfig.getCaptureMode(), "MANUAL_POA", true)) {
                        composer.startReplaceGroup(1362716003);
                        com.paypal.oslo.feature.verificationcapture.ui.screens.manualcapture.ManualCaptureScreenKt.PoaCaptureScreen(documentSide, function1, function0, composer, 0);
                        composer.endReplaceGroup();
                    } else if (kotlin.text.StringsKt.equals(workflowConfig.getCaptureMode(), "MANUAL", true)) {
                        composer.startReplaceGroup(1363083136);
                        com.paypal.oslo.feature.verificationcapture.ui.screens.manualcapture.ManualCaptureScreenKt.ManualCaptureScreen(documentSide, function1, function0, composer, 0);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(1363405505);
                        com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenKt.DocumentCaptureScreen(Camera2StreamConfigurationMap, documentSide, null, null, function1, function0, null, composer, 0, 76);
                        composer.endReplaceGroup();
                    }
                    composer.endMovableGroup();
                    composer.endReplaceGroup();
                }
                com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide2 = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.FRONT;
                documentSide = documentSide2;
                composer.startMovableGroup(-1757199648, java.lang.Integer.valueOf(mutableIntState2.getIntValue()));
                changedInstance = composer.changedInstance(verificationCaptureWebFlowDocumentActivity);
                changed = composer.changed(workflowConfig);
                changedInstance2 = composer.changedInstance(list2);
                changedInstance3 = composer.changedInstance(list);
                changed2 = composer.changed(str);
                changed3 = composer.changed(z);
                changed4 = composer.changed(documentSide.ordinal());
                rememberedValue = composer.rememberedValue();
                if (!(changedInstance | changed | changedInstance2 | changedInstance3 | changed2 | changed3 | changed4)) {
                }
                java.lang.Object obj2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj22) {
                        return com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.m20698$r8$lambda$XncDkR6Wo3cO_VAOmNOUvgf8Mk(com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.this, workflowConfig, list2, list, str, z, documentSide, mutableIntState, (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult) obj22);
                    }
                };
                composer.updateRememberedValue(obj2);
                rememberedValue = obj2;
                function1 = (kotlin.jvm.functions.Function1) rememberedValue;
                changedInstance4 = composer.changedInstance(verificationCaptureWebFlowDocumentActivity);
                rememberedValue2 = composer.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.$r8$lambda$annW_AsHkcaN6p6RctqLdikBM9k(com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
                function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                if (workflowConfig.getWorkflowType() != com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.POA) {
                }
                composer.startReplaceGroup(1362716003);
                com.paypal.oslo.feature.verificationcapture.ui.screens.manualcapture.ManualCaptureScreenKt.PoaCaptureScreen(documentSide, function1, function0, composer, 0);
                composer.endReplaceGroup();
                composer.endMovableGroup();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1363798306);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XncDkR6Wo3cO_VAOmNOUvgf8-Mk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20698$r8$lambda$XncDkR6Wo3cO_VAOmNOUvgf8Mk(com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity verificationCaptureWebFlowDocumentActivity, com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig workflowConfig, java.util.List list, java.util.List list2, java.lang.String str, boolean z, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, final androidx.compose.runtime.MutableIntState mutableIntState, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult captureResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureResult, "");
        verificationCaptureWebFlowDocumentActivity.processCaptureResult$verification_capture_prodRelease(captureResult, workflowConfig, list, list2, str, z, documentSide, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.$r8$lambda$E24EyOAyolmuOhAwv9PmzSYH7AI(androidx.compose.runtime.MutableIntState.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$annW_AsHkcaN6p6RctqLdikBM9k(com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity verificationCaptureWebFlowDocumentActivity) {
        verificationCaptureWebFlowDocumentActivity.getDelegate$verification_capture_prodRelease().sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertCancel());
        verificationCaptureWebFlowDocumentActivity.finish();
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.verificationcapture.ui.webflow.Hilt_VerificationCaptureWebFlowDocumentActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.ui.webflow.Hilt_VerificationCaptureWebFlowDocumentActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // com.paypal.oslo.feature.verificationcapture.ui.webflow.Hilt_VerificationCaptureWebFlowDocumentActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // com.paypal.oslo.feature.verificationcapture.ui.webflow.Hilt_VerificationCaptureWebFlowDocumentActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }
}

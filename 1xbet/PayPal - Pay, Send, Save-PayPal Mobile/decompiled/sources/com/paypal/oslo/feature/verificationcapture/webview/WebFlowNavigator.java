package com.paypal.oslo.feature.verificationcapture.webview;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/webview/WebFlowNavigator;", "", "Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;", "delegate", "Lcom/paypal/oslo/feature/verificationcapture/webview/ActivityProvider;", "activityProvider", "Lcom/paypal/oslo/feature/verificationcapture/data/datasource/FaceTecLivenessDataSource;", "faceTecDataSource", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;Lcom/paypal/oslo/feature/verificationcapture/webview/ActivityProvider;Lcom/paypal/oslo/feature/verificationcapture/data/datasource/FaceTecLivenessDataSource;Lkotlinx/coroutines/CoroutineScope;)V", "", "flowConfig", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowContext;", "context", "", "navigateToCapture", "(Ljava/lang/String;Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowContext;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/verificationcapture/webview/ActivityProvider;", "Lcom/paypal/oslo/feature/verificationcapture/data/datasource/FaceTecLivenessDataSource;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WebFlowNavigator {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.verificationcapture.webview.ActivityProvider Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl getHighResolutionOutputSizeshNQ4ISI;

    public WebFlowNavigator(com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl, com.paypal.oslo.feature.verificationcapture.webview.ActivityProvider activityProvider, com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureWebViewDelegateImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighResolutionOutputSizeshNQ4ISI = verificationCaptureWebViewDelegateImpl;
        this.Camera2StreamConfigurationMap = activityProvider;
        this.getHighSpeedVideoFpsRangesFor = faceTecLivenessDataSource;
        this.getHighSpeedVideoFpsRanges = coroutineScope;
    }

    public final void navigateToCapture(java.lang.String flowConfig, com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext context) {
        com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig workflowConfig = (com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) context.getWorkflowConfigs());
        if (workflowConfig == null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "No workflows configured", null, null, null, 14, null);
            this.getHighResolutionOutputSizeshNQ4ISI.sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertError("NO_CONFIG", "No workflows configured"));
            return;
        }
        if (context.getWorkflowConfigs().size() != 1) {
            java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig> workflowConfigs = context.getWorkflowConfigs();
            if (!(workflowConfigs instanceof java.util.Collection) || !workflowConfigs.isEmpty()) {
                for (com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig workflowConfig2 : workflowConfigs) {
                    if (workflowConfig2.getWorkflowType() != com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.DOCUMENT_UPLOAD && workflowConfig2.getWorkflowType() != com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.POA) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Unexpected mixed SELFIE+document workflow payload — WebSDK sends these as separate calls", null, null, null, 14, null);
                        this.getHighResolutionOutputSizeshNQ4ISI.sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertError("INVALID_CONFIG", "Unexpected mixed workflow configuration"));
                        return;
                    }
                }
            }
            com.paypal.oslo.feature.verificationcapture.webview.ActivityProvider activityProvider = this.Camera2StreamConfigurationMap;
            androidx.fragment.app.FragmentActivity currentActivity = activityProvider != null ? activityProvider.getCurrentActivity() : null;
            if (currentActivity != null) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, null, null, new com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchDocumentCaptureDirectly$1(this, currentActivity, flowConfig, null), 3, null);
                return;
            } else {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "No activity available for document-only web flow", null, null, null, 14, null);
                this.getHighResolutionOutputSizeshNQ4ISI.sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertError("NO_ACTIVITY", "No activity available for document capture"));
                return;
            }
        }
        int i = com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator.WhenMappings.$EnumSwitchMapping$0[workflowConfig.getWorkflowType().ordinal()];
        if (i == 1 || i == 2) {
            com.paypal.oslo.feature.verificationcapture.webview.ActivityProvider activityProvider2 = this.Camera2StreamConfigurationMap;
            androidx.fragment.app.FragmentActivity currentActivity2 = activityProvider2 != null ? activityProvider2.getCurrentActivity() : null;
            if (currentActivity2 != null) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, null, null, new com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchDocumentCaptureDirectly$1(this, currentActivity2, flowConfig, null), 3, null);
                return;
            } else {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "No activity available for document web flow", null, null, null, 14, null);
                this.getHighResolutionOutputSizeshNQ4ISI.sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertError("NO_ACTIVITY", "No activity available for document capture"));
                return;
            }
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.verificationcapture.webview.ActivityProvider activityProvider3 = this.Camera2StreamConfigurationMap;
        androidx.fragment.app.FragmentActivity currentActivity3 = activityProvider3 != null ? activityProvider3.getCurrentActivity() : null;
        if (currentActivity3 == null || (faceTecLivenessDataSource = this.getHighSpeedVideoFpsRangesFor) == null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "No activity or FaceTec data source for SELFIE web flow", null, null, null, 14, null);
            this.getHighResolutionOutputSizeshNQ4ISI.sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertError("NO_ACTIVITY", "No activity available for SELFIE capture"));
        } else if (faceTecLivenessDataSource != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, null, null, new com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchFaceTecDirectly$1(this, faceTecLivenessDataSource, workflowConfig, currentActivity3, context, null), 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, androidx.activity.result.ActivityResultLauncher] */
    public static final /* synthetic */ java.lang.Object access$requestCameraPermissionIfNeeded(com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator webFlowNavigator, androidx.fragment.app.FragmentActivity fragmentActivity, kotlin.coroutines.Continuation continuation) {
        androidx.view.result.ActivityResultLauncher activityResultLauncher;
        if (androidx.core.content.ContextCompat.checkSelfPermission(fragmentActivity, "android.permission.CAMERA") == 0) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        java.lang.String concat = "facetec_camera_permission_".concat(java.lang.String.valueOf(java.lang.System.nanoTime()));
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = fragmentActivity.getActivityResultRegistry().register(concat, new androidx.activity.result.contract.ActivityResultContracts.RequestPermission(), new androidx.view.result.ActivityResultCallback() { // from class: com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$requestCameraPermissionIfNeeded$2$1
            @Override // androidx.view.result.ActivityResultCallback
            public final /* synthetic */ void onActivityResult(java.lang.Object obj) {
                androidx.view.result.ActivityResultLauncher<java.lang.String> activityResultLauncher2;
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                if (objectRef.element == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    activityResultLauncher2 = null;
                } else {
                    activityResultLauncher2 = objectRef.element;
                }
                activityResultLauncher2.unregister();
                if (cancellableContinuationImpl2.isActive()) {
                    kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cancellableContinuation = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(java.lang.Boolean.valueOf(booleanValue)));
                }
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$requestCameraPermissionIfNeeded$2$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                androidx.view.result.ActivityResultLauncher<java.lang.String> activityResultLauncher2;
                if (objectRef.element == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    activityResultLauncher2 = null;
                } else {
                    activityResultLauncher2 = objectRef.element;
                }
                activityResultLauncher2.unregister();
                return kotlin.Unit.INSTANCE;
            }
        });
        if (objectRef.element == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            activityResultLauncher = null;
        } else {
            activityResultLauncher = (androidx.view.result.ActivityResultLauncher) objectRef.element;
        }
        activityResultLauncher.launch("android.permission.CAMERA");
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.DOCUMENT_UPLOAD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.POA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.SELFIE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

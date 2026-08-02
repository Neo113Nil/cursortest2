package com.paypal.oslo.feature.verificationcapture.webview;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0015\u0010(\u001a\u00020%8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureJavaScriptInterface;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;", "delegate", "Lcom/paypal/oslo/feature/verificationcapture/webview/ActivityProvider;", "activityProvider", "Lcom/paypal/oslo/feature/verificationcapture/data/datasource/FaceTecLivenessDataSource;", "faceTecDataSource", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;Lcom/paypal/oslo/feature/verificationcapture/webview/ActivityProvider;Lcom/paypal/oslo/feature/verificationcapture/data/datasource/FaceTecLivenessDataSource;Lkotlinx/coroutines/CoroutineScope;)V", "", "flowConfig", "statusCode", "", "startIdAssuranceCapture", "(Ljava/lang/String;Ljava/lang/String;)V", "getInfo", "()V", "action", "closeIdAssurance", "(Ljava/lang/String;)V", "scanResult", "onResult", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/verificationcapture/webview/ActivityProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/verificationcapture/data/datasource/FaceTecLivenessDataSource;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/paypal/oslo/feature/verificationcapture/webview/WebFlowNavigator;", "getInputFormats", "Lkotlin/Lazy;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VerificationCaptureJavaScriptInterface {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.verificationcapture.webview.ActivityProvider getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizesFor;

    public VerificationCaptureJavaScriptInterface(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl, com.paypal.oslo.feature.verificationcapture.webview.ActivityProvider activityProvider, com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureWebViewDelegateImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.Camera2StreamConfigurationMap = verificationCaptureWebViewDelegateImpl;
        this.getHighSpeedVideoSizes = activityProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = faceTecLivenessDataSource;
        this.getHighSpeedVideoFpsRangesFor = coroutineScope;
        this.getHighSpeedVideoSizesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface.$r8$lambda$ogEj3fJuE01sR1PKENKfdFWJE0I(com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface.this);
            }
        });
    }

    public /* synthetic */ VerificationCaptureJavaScriptInterface(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl, com.paypal.oslo.feature.verificationcapture.webview.ActivityProvider activityProvider, com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource, kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(appNavigator, verificationCaptureWebViewDelegateImpl, (i & 4) != 0 ? null : activityProvider, (i & 8) != 0 ? null : faceTecLivenessDataSource, (i & 16) != 0 ? kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(kotlinx.coroutines.Dispatchers.getIO())) : coroutineScope);
    }

    @android.webkit.JavascriptInterface
    public final void startIdAssuranceCapture(java.lang.String flowConfig, java.lang.String statusCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusCode, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "startIdAssuranceCapture from webview", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status_code", statusCode)), null, 4, null);
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext parse = com.paypal.oslo.feature.verificationcapture.webview.WebSdkPayloadParser.INSTANCE.parse(flowConfig);
        if (parse == null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Failed to parse flowConfig", null, null, null, 14, null);
            return;
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("workflow_count", java.lang.Integer.valueOf(parse.getWorkflowConfigs().size()));
        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig> workflowConfigs = parse.getWorkflowConfigs();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(workflowConfigs, 10));
        java.util.Iterator<T> it = workflowConfigs.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig) it.next()).getWorkflowType().name());
        }
        pairArr[1] = kotlin.TuplesKt.to("types", arrayList.toString());
        com.paypal.android.logger.Logger.d$default(logger, "startIdAssuranceCapture parsed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, kotlinx.coroutines.Dispatchers.getMain(), null, new com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface$startIdAssuranceCapture$2(this, flowConfig, parse, null), 2, null);
    }

    @android.webkit.JavascriptInterface
    public final void getInfo() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "getInfo from webview", null, null, 6, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, kotlinx.coroutines.Dispatchers.getMain(), null, new com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface$getInfo$1(this, com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.buildAppInfoPayload(), null), 2, null);
    }

    @android.webkit.JavascriptInterface
    public final void closeIdAssurance(java.lang.String action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "closeIdAssurance called", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", action)), null, 4, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, kotlinx.coroutines.Dispatchers.getMain(), null, new com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface$closeIdAssurance$1(this, action, null), 2, null);
    }

    @android.webkit.JavascriptInterface
    public final void onResult(java.lang.String scanResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scanResult, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "onResult called from WebView", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("response_length", java.lang.Integer.valueOf(scanResult.length()))), null, 4, null);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(scanResult);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("error");
            if (optJSONObject != null) {
                java.lang.String optString = optJSONObject.optString("type");
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "WebView returned error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, optString)), null, null, 12, null);
                com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl = this.Camera2StreamConfigurationMap;
                java.lang.String str = optString;
                if (str.length() == 0) {
                    str = "FACETEC_UNKNOWN_ERROR";
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                java.lang.String optString2 = optJSONObject.optString("message", "WebView processing failed");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString2, "");
                verificationCaptureWebViewDelegateImpl.deliverScanResult(new com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult.Error(str, optString2));
                return;
            }
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("result");
            java.lang.String optString3 = optJSONObject2 != null ? optJSONObject2.optString("scanResultBlob") : null;
            java.lang.String str2 = optString3;
            if (str2 != null && str2.length() != 0) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Received scanResultBlob", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("blob_length", java.lang.Integer.valueOf(optString3.length()))), null, 4, null);
                this.Camera2StreamConfigurationMap.deliverScanResult(new com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult.Blob(optString3));
                return;
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "scanResultBlob missing in WebView response", null, null, null, 14, null);
            this.Camera2StreamConfigurationMap.deliverScanResult(new com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult.Error("FACETEC_UNKNOWN_ERROR", "scanResultBlob missing"));
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            com.paypal.android.logger.Logger.e$default(logger, "Failed to parse onResult", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, null, 12, null);
            com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl2 = this.Camera2StreamConfigurationMap;
            java.lang.String message2 = e.getMessage();
            if (message2 == null) {
                message2 = "Parse failed";
            }
            verificationCaptureWebViewDelegateImpl2.deliverScanResult(new com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge.ScanResult.Error("FACETEC_UNKNOWN_ERROR", message2));
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator $r8$lambda$ogEj3fJuE01sR1PKENKfdFWJE0I(com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface verificationCaptureJavaScriptInterface) {
        return new com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator(verificationCaptureJavaScriptInterface.Camera2StreamConfigurationMap, verificationCaptureJavaScriptInterface.getHighSpeedVideoSizes, verificationCaptureJavaScriptInterface.getHighResolutionOutputSizeshNQ4ISI, verificationCaptureJavaScriptInterface.getHighSpeedVideoFpsRangesFor);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator access$getWebFlowNavigator(com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface verificationCaptureJavaScriptInterface) {
        return (com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator) verificationCaptureJavaScriptInterface.getHighSpeedVideoSizesFor.getValue();
    }
}

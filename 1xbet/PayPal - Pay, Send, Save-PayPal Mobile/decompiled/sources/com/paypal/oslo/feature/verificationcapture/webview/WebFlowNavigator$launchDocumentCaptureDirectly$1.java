package com.paypal.oslo.feature.verificationcapture.webview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchDocumentCaptureDirectly$1", f = "WebFlowNavigator.kt", i = {1, 1, 1}, l = {126, 143}, m = "invokeSuspend", n = {"currentActivity", "granted", "isStage"}, nl = {129, 148}, s = {"L$0", "Z$0", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class WebFlowNavigator$launchDocumentCaptureDirectly$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.fragment.app.FragmentActivity getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchDocumentCaptureDirectly$1.AnonymousClass1(r1, r11.Camera2StreamConfigurationMap, r3, null), r11) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
    
        if (r12 != r0) goto L12;
     */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.verificationcapture.webview.ActivityProvider activityProvider;
        com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource;
        com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputSizeshNQ4ISI = 1;
            obj = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchDocumentCaptureDirectly$1$granted$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, null), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (!booleanValue) {
            verificationCaptureWebViewDelegateImpl = this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI;
            verificationCaptureWebViewDelegateImpl.sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertError("PERMISSION_DENIED", "Camera permission denied"));
            return kotlin.Unit.INSTANCE;
        }
        activityProvider = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
        androidx.fragment.app.FragmentActivity currentActivity = activityProvider != null ? activityProvider.getCurrentActivity() : null;
        if (currentActivity != null) {
            faceTecLivenessDataSource = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor;
            ?? isStage = faceTecLivenessDataSource != null ? faceTecLivenessDataSource.isStage() : 0;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currentActivity);
            this.getHighResolutionOutputSizeshNQ4ISI = booleanValue;
            this.getHighSpeedVideoFpsRanges = isStage;
            this.getInputSizeshNQ4ISI = 2;
        } else {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[WebFlowNavigator] Activity gone after permission check, aborting", null, null, 6, null);
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchDocumentCaptureDirectly$1$1", f = "WebFlowNavigator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchDocumentCaptureDirectly$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ boolean Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.fragment.app.FragmentActivity getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges.startActivity(com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity.INSTANCE.createIntent(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchDocumentCaptureDirectly$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchDocumentCaptureDirectly$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.fragment.app.FragmentActivity fragmentActivity, java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchDocumentCaptureDirectly$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = fragmentActivity;
            this.getHighSpeedVideoSizes = str;
            this.Camera2StreamConfigurationMap = z;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchDocumentCaptureDirectly$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchDocumentCaptureDirectly$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebFlowNavigator$launchDocumentCaptureDirectly$1(com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator webFlowNavigator, androidx.fragment.app.FragmentActivity fragmentActivity, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchDocumentCaptureDirectly$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = webFlowNavigator;
        this.getHighSpeedVideoSizes = fragmentActivity;
        this.Camera2StreamConfigurationMap = str;
    }
}

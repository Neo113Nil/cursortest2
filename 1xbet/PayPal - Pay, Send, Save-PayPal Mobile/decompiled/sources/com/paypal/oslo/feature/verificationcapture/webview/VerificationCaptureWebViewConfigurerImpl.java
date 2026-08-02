package com.paypal.oslo.feature.verificationcapture.webview;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewConfigurerImpl;", "Lcom/paypal/oslo/feature/verificationcapture/api/webview/VerificationCaptureWebViewConfigurer;", "Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;", "delegate", "Lcom/paypal/oslo/feature/verificationcapture/data/datasource/FaceTecLivenessDataSource;", "faceTecLivenessDataSource", "Lcom/paypal/oslo/feature/verificationcapture/webview/ActivityProvider;", "activityProvider", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;Lcom/paypal/oslo/feature/verificationcapture/data/datasource/FaceTecLivenessDataSource;Lcom/paypal/oslo/feature/verificationcapture/webview/ActivityProvider;)V", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "baseConfig", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "configure", "(Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;Lcom/paypal/oslo/core/navigation/AppNavigator;)Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/verificationcapture/data/datasource/FaceTecLivenessDataSource;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/verificationcapture/webview/ActivityProvider;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationCaptureWebViewConfigurerImpl implements com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewConfigurer {
    private final com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.verificationcapture.webview.ActivityProvider getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public VerificationCaptureWebViewConfigurerImpl(com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl, com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource, com.paypal.oslo.feature.verificationcapture.webview.ActivityProvider activityProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureWebViewDelegateImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceTecLivenessDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityProvider, "");
        this.Camera2StreamConfigurationMap = verificationCaptureWebViewDelegateImpl;
        this.getHighSpeedVideoSizes = faceTecLivenessDataSource;
        this.getHighSpeedVideoFpsRangesFor = activityProvider;
    }

    @Override // com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewConfigurer
    public final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration configure(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration baseConfig, com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface verificationCaptureJavaScriptInterface = new com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface(navigator, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, null, 16, null);
        com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration javascript = baseConfig.getJavascript();
        java.util.Map<java.lang.String, java.lang.Object> jsInterfaces = javascript != null ? javascript.getJsInterfaces() : null;
        if (jsInterfaces == null) {
            jsInterfaces = kotlin.collections.MapsKt.emptyMap();
        }
        java.util.Map plus = kotlin.collections.MapsKt.plus(jsInterfaces, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("IDAssurance", verificationCaptureJavaScriptInterface)));
        final kotlin.jvm.functions.Function1<com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, kotlin.Unit> jsBridgeCallback = javascript != null ? javascript.getJsBridgeCallback() : null;
        return com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.copy$default(baseConfig, null, null, new com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl$mergeCallbacks$1(baseConfig.getCallback(), this), null, null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration(plus, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl.$r8$lambda$5iksMcy7Ebx7AfmDHv5BDOBw3A0(com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl.this, jsBridgeCallback, (com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge) obj);
            }
        }), null, 91, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5iksMcy7Ebx7AfmDHv5BDOBw3A0(com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl verificationCaptureWebViewConfigurerImpl, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge secureWebViewJavaScriptBridge) {
        if (secureWebViewJavaScriptBridge != null) {
            verificationCaptureWebViewConfigurerImpl.Camera2StreamConfigurationMap.setJsBridge(secureWebViewJavaScriptBridge);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[VerificationCapture] JavaScript bridge stored in singleton delegate", null, null, 6, null);
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[VerificationCapture] JavaScript bridge disposed, but keeping reference for callbacks", null, null, 6, null);
        }
        if (function1 != null) {
            function1.invoke(secureWebViewJavaScriptBridge);
        }
        return kotlin.Unit.INSTANCE;
    }
}

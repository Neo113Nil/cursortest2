package com.paypal.oslo.feature.verificationcapture.webview;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewConfigurerImpl$mergeCallbacks$1;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewCallback;", "", "url", "", "onLoadingStarted", "(Ljava/lang/String;)V", "onLoadingFinished", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;", "error", "onLoadFailed", "(Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationCaptureWebViewConfigurerImpl$mergeCallbacks$1 implements com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback getHighSpeedVideoFpsRangesFor;

    VerificationCaptureWebViewConfigurerImpl$mergeCallbacks$1(com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback, com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl verificationCaptureWebViewConfigurerImpl) {
        this.getHighSpeedVideoFpsRangesFor = secureWebViewCallback;
        this.getHighResolutionOutputSizeshNQ4ISI = verificationCaptureWebViewConfigurerImpl;
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
    public final /* bridge */ void onActionsReady(com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle webViewActionBundle) {
        super.onActionsReady(webViewActionBundle);
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
    public final /* bridge */ void onDownloadRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
        super.onDownloadRequest(str, str2, str3, str4, j);
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
    public final void onLoadingStarted(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[VerificationCapture] ═══ WebView loading STARTED", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url)), null, 4, null);
        com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback = this.getHighSpeedVideoFpsRangesFor;
        if (secureWebViewCallback != null) {
            secureWebViewCallback.onLoadingStarted(url);
        }
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
    public final void onLoadingFinished(java.lang.String url) {
        com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl;
        com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[VerificationCapture] ═══ WebView loading FINISHED", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url)), null, 4, null);
        verificationCaptureWebViewDelegateImpl = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
        final java.lang.String pendingResult = verificationCaptureWebViewDelegateImpl.getPendingResult();
        if (pendingResult != null) {
            verificationCaptureWebViewDelegateImpl2 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            verificationCaptureWebViewDelegateImpl2.setPendingResult$verification_capture_prodRelease(null);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[VerificationCapture] Detected pending result after WebView reload, sending in 1 second...", null, null, 6, null);
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            final com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl verificationCaptureWebViewConfigurerImpl = this.getHighResolutionOutputSizeshNQ4ISI;
            handler.postDelayed(new java.lang.Runnable() { // from class: com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl$mergeCallbacks$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl$mergeCallbacks$1.$r8$lambda$lacCPkRI49zFRk1AqL5Rrbtsrzg(com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl.this, pendingResult);
                }
            }, 1000L);
        }
        com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback = this.getHighSpeedVideoFpsRangesFor;
        if (secureWebViewCallback != null) {
            secureWebViewCallback.onLoadingFinished(url);
        }
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
    public final void onLoadFailed(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[VerificationCapture] ═══ WebView LOAD FAILED", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", error.toString())), null, null, 12, null);
        if (error instanceof com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[VerificationCapture] Configuration failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("message", ((com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed) error).getMessage())), null, null, 12, null);
        } else if (error instanceof com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.UnauthorizedUrl) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[VerificationCapture] Unauthorized URL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", ((com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.UnauthorizedUrl) error).getUrl())), null, null, 12, null);
        } else {
            if (!(error instanceof com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.AuthFailed)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.AuthFailed authFailed = (com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.AuthFailed) error;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[VerificationCapture] Authentication failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", authFailed.getUrl()), kotlin.TuplesKt.to("error", authFailed.getError())), null, null, 12, null);
        }
        com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback = this.getHighSpeedVideoFpsRangesFor;
        if (secureWebViewCallback != null) {
            secureWebViewCallback.onLoadFailed(error);
        }
    }

    public static /* synthetic */ void $r8$lambda$lacCPkRI49zFRk1AqL5Rrbtsrzg(com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl verificationCaptureWebViewConfigurerImpl, java.lang.String str) {
        com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl;
        verificationCaptureWebViewDelegateImpl = verificationCaptureWebViewConfigurerImpl.Camera2StreamConfigurationMap;
        verificationCaptureWebViewDelegateImpl.sendCallback(str);
    }
}

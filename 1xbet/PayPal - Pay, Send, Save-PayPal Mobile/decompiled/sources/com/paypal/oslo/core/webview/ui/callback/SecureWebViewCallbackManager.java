package com.paypal.oslo.core.webview.ui.callback;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\f\u001a\u00020\t2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0000¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewCallbackManager;", "", "", "source", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewCallback;", "clientCallback", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewCallback;)V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "action", "notifyCallbacks$webview_release", "(Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewCallback;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SecureWebViewCallbackManager {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback Camera2StreamConfigurationMap;

    public SecureWebViewCallbackManager(java.lang.String str, com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = secureWebViewCallback;
        this.getHighSpeedVideoSizes = new com.paypal.oslo.core.webview.ui.logging.SecureWebViewCallbackLogger(str);
    }

    public final void notifyCallbacks$webview_release(kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        action.invoke(this.getHighSpeedVideoSizes);
        com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback = this.Camera2StreamConfigurationMap;
        if (secureWebViewCallback != null) {
            action.invoke(secureWebViewCallback);
        }
    }
}

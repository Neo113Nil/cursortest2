package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class JavaScriptReplyProxyImpl extends androidx.webkit.JavaScriptReplyProxy {
    private final org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface getHighSpeedVideoSizes;

    public JavaScriptReplyProxyImpl(org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.getHighSpeedVideoSizes = jsReplyProxyBoundaryInterface;
    }

    public static androidx.webkit.internal.JavaScriptReplyProxyImpl forInvocationHandler(java.lang.reflect.InvocationHandler invocationHandler) {
        final org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (androidx.webkit.internal.JavaScriptReplyProxyImpl) jsReplyProxyBoundaryInterface.getOrCreatePeer(new java.util.concurrent.Callable() { // from class: androidx.webkit.internal.JavaScriptReplyProxyImpl$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return androidx.webkit.internal.JavaScriptReplyProxyImpl.getHighResolutionOutputSizeshNQ4ISI(org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.this);
            }
        });
    }

    static /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI(org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) throws java.lang.Exception {
        return new androidx.webkit.internal.JavaScriptReplyProxyImpl(jsReplyProxyBoundaryInterface);
    }

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(java.lang.String str) {
        if (androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            this.getHighSpeedVideoSizes.postMessage(str);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(byte[] bArr) {
        java.util.Objects.requireNonNull(bArr, "ArrayBuffer must be non-null");
        if (androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView()) {
            this.getHighSpeedVideoSizes.postMessageWithPayload(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.WebMessagePayloadAdapter(bArr)));
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }
}

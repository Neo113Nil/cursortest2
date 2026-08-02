package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebMessagePortImpl extends androidx.webkit.WebMessagePortCompat {
    private android.webkit.WebMessagePort Camera2StreamConfigurationMap;
    private org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface getHighSpeedVideoFpsRanges;

    public WebMessagePortImpl(android.webkit.WebMessagePort webMessagePort) {
        this.Camera2StreamConfigurationMap = webMessagePort;
    }

    public WebMessagePortImpl(java.lang.reflect.InvocationHandler invocationHandler) {
        this.getHighSpeedVideoFpsRanges = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    private android.webkit.WebMessagePort getHighResolutionOutputSizeshNQ4ISI() {
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertWebMessagePort(java.lang.reflect.Proxy.getInvocationHandler(this.getHighSpeedVideoFpsRanges));
        }
        return this.Camera2StreamConfigurationMap;
    }

    private org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface getHighSpeedVideoFpsRanges() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class, androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertWebMessagePort(this.Camera2StreamConfigurationMap));
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void postMessage(androidx.webkit.WebMessageCompat webMessageCompat) {
        androidx.webkit.internal.ApiFeature.M m = androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_PORT_POST_MESSAGE;
        if (webMessageCompat.getType() == 0) {
            getHighResolutionOutputSizeshNQ4ISI().postMessage(compatToFrameworkMessage(webMessageCompat));
        } else {
            if (m.isSupportedByWebView() && androidx.webkit.internal.WebMessageAdapter.isMessagePayloadTypeSupportedByWebView(webMessageCompat.getType())) {
                getHighSpeedVideoFpsRanges().postMessage(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.WebMessageAdapter(webMessageCompat)));
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void close() {
        getHighResolutionOutputSizeshNQ4ISI().close();
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void setWebMessageCallback(final androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        if (androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK.isSupportedByWebView()) {
            getHighSpeedVideoFpsRanges().setWebMessageCallback(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.WebMessageCallbackAdapter(webMessageCallbackCompat)));
        } else {
            getHighResolutionOutputSizeshNQ4ISI().setWebMessageCallback(new android.webkit.WebMessagePort.WebMessageCallback() { // from class: androidx.webkit.internal.WebMessagePortImpl.1
                @Override // android.webkit.WebMessagePort.WebMessageCallback
                public void onMessage(android.webkit.WebMessagePort webMessagePort, android.webkit.WebMessage webMessage) {
                    webMessageCallbackCompat.onMessage(new androidx.webkit.internal.WebMessagePortImpl(webMessagePort), androidx.webkit.internal.WebMessagePortImpl.frameworkMessageToCompat(webMessage));
                }
            });
        }
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void setWebMessageCallback(android.os.Handler handler, final androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        if (androidx.webkit.internal.WebViewFeatureInternal.CREATE_WEB_MESSAGE_CHANNEL.isSupportedByWebView()) {
            getHighSpeedVideoFpsRanges().setWebMessageCallback(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.WebMessageCallbackAdapter(webMessageCallbackCompat)), handler);
        } else {
            getHighResolutionOutputSizeshNQ4ISI().setWebMessageCallback(new android.webkit.WebMessagePort.WebMessageCallback() { // from class: androidx.webkit.internal.WebMessagePortImpl.2
                @Override // android.webkit.WebMessagePort.WebMessageCallback
                public void onMessage(android.webkit.WebMessagePort webMessagePort, android.webkit.WebMessage webMessage) {
                    webMessageCallbackCompat.onMessage(new androidx.webkit.internal.WebMessagePortImpl(webMessagePort), androidx.webkit.internal.WebMessagePortImpl.frameworkMessageToCompat(webMessage));
                }
            }, handler);
        }
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public android.webkit.WebMessagePort getFrameworkPort() {
        return getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public java.lang.reflect.InvocationHandler getInvocationHandler() {
        return java.lang.reflect.Proxy.getInvocationHandler(getHighSpeedVideoFpsRanges());
    }

    public static androidx.webkit.WebMessagePortCompat[] portsToCompat(android.webkit.WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        androidx.webkit.WebMessagePortCompat[] webMessagePortCompatArr = new androidx.webkit.WebMessagePortCompat[webMessagePortArr.length];
        for (int i = 0; i < webMessagePortArr.length; i++) {
            webMessagePortCompatArr[i] = new androidx.webkit.internal.WebMessagePortImpl(webMessagePortArr[i]);
        }
        return webMessagePortCompatArr;
    }

    public static android.webkit.WebMessagePort[] compatToPorts(androidx.webkit.WebMessagePortCompat[] webMessagePortCompatArr) {
        if (webMessagePortCompatArr == null) {
            return null;
        }
        int length = webMessagePortCompatArr.length;
        android.webkit.WebMessagePort[] webMessagePortArr = new android.webkit.WebMessagePort[length];
        for (int i = 0; i < length; i++) {
            webMessagePortArr[i] = webMessagePortCompatArr[i].getFrameworkPort();
        }
        return webMessagePortArr;
    }

    public static android.webkit.WebMessage compatToFrameworkMessage(androidx.webkit.WebMessageCompat webMessageCompat) {
        return new android.webkit.WebMessage(webMessageCompat.getData(), compatToPorts(webMessageCompat.getPorts()));
    }

    public static androidx.webkit.WebMessageCompat frameworkMessageToCompat(android.webkit.WebMessage webMessage) {
        return new androidx.webkit.WebMessageCompat(webMessage.getData(), portsToCompat(webMessage.getPorts()));
    }
}

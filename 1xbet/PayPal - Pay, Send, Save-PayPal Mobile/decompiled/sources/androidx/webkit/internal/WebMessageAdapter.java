package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebMessageAdapter implements org.chromium.support_lib_boundary.WebMessageBoundaryInterface {
    private static final java.lang.String[] getHighSpeedVideoFpsRangesFor = {"WEB_MESSAGE_ARRAY_BUFFER"};
    private final androidx.webkit.WebMessageCompat Camera2StreamConfigurationMap;

    public WebMessageAdapter(androidx.webkit.WebMessageCompat webMessageCompat) {
        this.Camera2StreamConfigurationMap = webMessageCompat;
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @java.lang.Deprecated
    public java.lang.String getData() {
        return this.Camera2StreamConfigurationMap.getData();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public java.lang.reflect.InvocationHandler getMessagePayload() {
        androidx.webkit.internal.WebMessagePayloadAdapter webMessagePayloadAdapter;
        int type = this.Camera2StreamConfigurationMap.getType();
        if (type == 0) {
            webMessagePayloadAdapter = new androidx.webkit.internal.WebMessagePayloadAdapter(this.Camera2StreamConfigurationMap.getData());
        } else if (type == 1) {
            webMessagePayloadAdapter = new androidx.webkit.internal.WebMessagePayloadAdapter((byte[]) java.util.Objects.requireNonNull(this.Camera2StreamConfigurationMap.getArrayBuffer()));
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown web message payload type: ");
            sb.append(this.Camera2StreamConfigurationMap.getType());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(webMessagePayloadAdapter);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public java.lang.reflect.InvocationHandler[] getPorts() {
        androidx.webkit.WebMessagePortCompat[] ports = this.Camera2StreamConfigurationMap.getPorts();
        if (ports == null) {
            return null;
        }
        java.lang.reflect.InvocationHandler[] invocationHandlerArr = new java.lang.reflect.InvocationHandler[ports.length];
        for (int i = 0; i < ports.length; i++) {
            invocationHandlerArr[i] = ports[i].getInvocationHandler();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static boolean isMessagePayloadTypeSupportedByWebView(int i) {
        return i == 0 || (i == 1 && androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView());
    }

    public static androidx.webkit.WebMessageCompat webMessageCompatFromBoundaryInterface(org.chromium.support_lib_boundary.WebMessageBoundaryInterface webMessageBoundaryInterface) {
        java.lang.reflect.InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        androidx.webkit.WebMessagePortCompat[] webMessagePortCompatArr = new androidx.webkit.WebMessagePortCompat[ports.length];
        for (int i = 0; i < ports.length; i++) {
            webMessagePortCompatArr[i] = new androidx.webkit.internal.WebMessagePortImpl(ports[i]);
        }
        if (androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView()) {
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                return new androidx.webkit.WebMessageCompat(webMessagePayloadBoundaryInterface.getAsString(), webMessagePortCompatArr);
            }
            if (type != 1) {
                return null;
            }
            return new androidx.webkit.WebMessageCompat(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), webMessagePortCompatArr);
        }
        return new androidx.webkit.WebMessageCompat(webMessageBoundaryInterface.getData(), webMessagePortCompatArr);
    }
}

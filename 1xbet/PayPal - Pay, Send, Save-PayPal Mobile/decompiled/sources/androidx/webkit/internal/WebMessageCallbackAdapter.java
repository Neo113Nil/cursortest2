package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebMessageCallbackAdapter implements org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface {
    private final androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat getHighResolutionOutputSizeshNQ4ISI;

    public WebMessageCallbackAdapter(androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        this.getHighResolutionOutputSizeshNQ4ISI = webMessageCallbackCompat;
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(java.lang.reflect.InvocationHandler invocationHandler, java.lang.reflect.InvocationHandler invocationHandler2) {
        androidx.webkit.WebMessageCompat webMessageCompatFromBoundaryInterface = androidx.webkit.internal.WebMessageAdapter.webMessageCompatFromBoundaryInterface((org.chromium.support_lib_boundary.WebMessageBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class, invocationHandler2));
        if (webMessageCompatFromBoundaryInterface != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.onMessage(new androidx.webkit.internal.WebMessagePortImpl(invocationHandler), webMessageCompatFromBoundaryInterface);
        }
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
        return new java.lang.String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }
}

package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebViewProviderFactoryAdapter implements androidx.webkit.internal.WebViewProviderFactory {
    final org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface Camera2StreamConfigurationMap;

    public WebViewProviderFactoryAdapter(org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.Camera2StreamConfigurationMap = webViewProviderFactoryBoundaryInterface;
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface getWebViewBuilder() {
        return (org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface.class, this.Camera2StreamConfigurationMap.getWebViewBuilder());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface createWebView(android.webkit.WebView webView) {
        return (org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface.class, this.Camera2StreamConfigurationMap.createWebView(webView));
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface.class, this.Camera2StreamConfigurationMap.getWebkitToCompatConverter());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.StaticsBoundaryInterface getStatics() {
        return (org.chromium.support_lib_boundary.StaticsBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.StaticsBoundaryInterface.class, this.Camera2StreamConfigurationMap.getStatics());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public java.lang.String[] getWebViewFeatures() {
        return this.Camera2StreamConfigurationMap.getSupportedFeatures();
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface.class, this.Camera2StreamConfigurationMap.getServiceWorkerController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.TracingControllerBoundaryInterface getTracingController() {
        return (org.chromium.support_lib_boundary.TracingControllerBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.TracingControllerBoundaryInterface.class, this.Camera2StreamConfigurationMap.getTracingController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface getProxyController() {
        return (org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface.class, this.Camera2StreamConfigurationMap.getProxyController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface.class, this.Camera2StreamConfigurationMap.getDropDataProvider());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface getProfileStore() {
        return (org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface.class, this.Camera2StreamConfigurationMap.getProfileStore());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public void startUpWebView(androidx.webkit.WebViewStartUpConfig webViewStartUpConfig, androidx.webkit.WebViewCompat.WebViewStartUpCallback webViewStartUpCallback) {
        this.Camera2StreamConfigurationMap.startUpWebView(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.WebViewStartUpConfigAdapter(webViewStartUpConfig)), org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.WebViewStartUpCallbackAdapter(webViewStartUpCallback)));
    }
}

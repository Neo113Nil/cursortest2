package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebkitToCompatConverter {
    private final org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface Camera2StreamConfigurationMap;

    public WebkitToCompatConverter(org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.Camera2StreamConfigurationMap = webkitToCompatConverterBoundaryInterface;
    }

    public androidx.webkit.internal.WebSettingsAdapter convertSettings(android.webkit.WebSettings webSettings) {
        return new androidx.webkit.internal.WebSettingsAdapter((org.chromium.support_lib_boundary.WebSettingsBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebSettingsBoundaryInterface.class, this.Camera2StreamConfigurationMap.convertSettings(webSettings)));
    }

    public androidx.webkit.internal.WebResourceRequestAdapter convertWebResourceRequest(android.webkit.WebResourceRequest webResourceRequest) {
        return new androidx.webkit.internal.WebResourceRequestAdapter((org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface.class, this.Camera2StreamConfigurationMap.convertWebResourceRequest(webResourceRequest)));
    }

    public java.lang.reflect.InvocationHandler convertServiceWorkerSettings(android.webkit.ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.Camera2StreamConfigurationMap.convertServiceWorkerSettings(serviceWorkerWebSettings);
    }

    public android.webkit.ServiceWorkerWebSettings convertServiceWorkerSettings(java.lang.reflect.InvocationHandler invocationHandler) {
        return (android.webkit.ServiceWorkerWebSettings) this.Camera2StreamConfigurationMap.convertServiceWorkerSettings(invocationHandler);
    }

    public java.lang.reflect.InvocationHandler convertWebResourceError(android.webkit.WebResourceError webResourceError) {
        return this.Camera2StreamConfigurationMap.convertWebResourceError(webResourceError);
    }

    public android.webkit.WebResourceError convertWebResourceError(java.lang.reflect.InvocationHandler invocationHandler) {
        return (android.webkit.WebResourceError) this.Camera2StreamConfigurationMap.convertWebResourceError(invocationHandler);
    }

    public java.lang.reflect.InvocationHandler convertSafeBrowsingResponse(android.webkit.SafeBrowsingResponse safeBrowsingResponse) {
        return this.Camera2StreamConfigurationMap.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    public android.webkit.SafeBrowsingResponse convertSafeBrowsingResponse(java.lang.reflect.InvocationHandler invocationHandler) {
        return (android.webkit.SafeBrowsingResponse) this.Camera2StreamConfigurationMap.convertSafeBrowsingResponse(invocationHandler);
    }

    public java.lang.reflect.InvocationHandler convertWebMessagePort(android.webkit.WebMessagePort webMessagePort) {
        return this.Camera2StreamConfigurationMap.convertWebMessagePort(webMessagePort);
    }

    public android.webkit.WebMessagePort convertWebMessagePort(java.lang.reflect.InvocationHandler invocationHandler) {
        return (android.webkit.WebMessagePort) this.Camera2StreamConfigurationMap.convertWebMessagePort(invocationHandler);
    }

    public androidx.webkit.internal.CookieManagerAdapter convertCookieManager(android.webkit.CookieManager cookieManager) {
        return new androidx.webkit.internal.CookieManagerAdapter((org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface.class, this.Camera2StreamConfigurationMap.convertCookieManager(cookieManager)));
    }

    public androidx.webkit.internal.WebStorageAdapter convertWebStorage(android.webkit.WebStorage webStorage) {
        return new androidx.webkit.internal.WebStorageAdapter((org.chromium.support_lib_boundary.WebStorageBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebStorageBoundaryInterface.class, this.Camera2StreamConfigurationMap.convertWebStorage(webStorage)));
    }
}

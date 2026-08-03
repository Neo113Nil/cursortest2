package org.chromium.support_lib_boundary;

/* loaded from: classes6.dex */
public interface ProfileBoundaryInterface {
    void cancelPrefetch(java.lang.String str);

    void clearPrefetch(java.lang.String str, android.webkit.ValueCallback<java.lang.reflect.InvocationHandler> valueCallback);

    android.webkit.CookieManager getCookieManager();

    android.webkit.GeolocationPermissions getGeoLocationPermissions();

    java.lang.String getName();

    android.webkit.ServiceWorkerController getServiceWorkerController();

    android.webkit.WebStorage getWebStorage();

    void prefetchUrl(java.lang.String str, android.webkit.ValueCallback<java.lang.reflect.InvocationHandler> valueCallback);

    void prefetchUrl(java.lang.String str, java.lang.reflect.InvocationHandler invocationHandler, android.webkit.ValueCallback<java.lang.reflect.InvocationHandler> valueCallback);
}

package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface ProfileBoundaryInterface {
    void addOriginMatchedHeader(java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set);

    void addQuicHints(java.util.Set<java.lang.String> set);

    void clearAllOriginMatchedHeaders();

    @java.lang.Deprecated
    void clearOriginMatchedHeader(java.lang.String str);

    void clearOriginMatchedHeader(java.lang.String str, java.lang.String str2);

    void clearPrefetch(java.lang.String str, java.util.concurrent.Executor executor, java.lang.reflect.InvocationHandler invocationHandler);

    android.webkit.CookieManager getCookieManager();

    android.webkit.GeolocationPermissions getGeoLocationPermissions();

    java.lang.String getName();

    java.util.List<java.lang.reflect.InvocationHandler> getOriginMatchedHeaders(java.lang.String str, java.lang.String str2);

    android.webkit.ServiceWorkerController getServiceWorkerController();

    android.webkit.WebStorage getWebStorage();

    boolean hasOriginMatchedHeader(java.lang.String str);

    void preconnect(java.lang.String str);

    void prefetchUrl(java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, java.lang.reflect.InvocationHandler invocationHandler);

    void prefetchUrl(java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, java.lang.reflect.InvocationHandler invocationHandler, java.lang.reflect.InvocationHandler invocationHandler2);

    @java.lang.Deprecated
    void setOriginMatchedHeader(java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set);

    void setSpeculativeLoadingConfig(java.lang.reflect.InvocationHandler invocationHandler);

    void warmUpRendererProcess();
}

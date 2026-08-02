package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class ServiceWorkerWebSettingsImpl extends androidx.webkit.ServiceWorkerWebSettingsCompat {
    private org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface Camera2StreamConfigurationMap;
    private android.webkit.ServiceWorkerWebSettings getHighSpeedVideoFpsRanges;

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    @java.lang.Deprecated(forRemoval = true)
    public void setRequestedWithHeaderOriginAllowList(java.util.Set<java.lang.String> set) {
    }

    public ServiceWorkerWebSettingsImpl(android.webkit.ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.getHighSpeedVideoFpsRanges = serviceWorkerWebSettings;
    }

    public ServiceWorkerWebSettingsImpl(java.lang.reflect.InvocationHandler invocationHandler) {
        this.Camera2StreamConfigurationMap = (org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }

    private android.webkit.ServiceWorkerWebSettings getHighSpeedVideoFpsRangesFor() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertServiceWorkerSettings(java.lang.reflect.Proxy.getInvocationHandler(this.Camera2StreamConfigurationMap));
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    private org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface Camera2StreamConfigurationMap() {
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = (org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface.class, androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertServiceWorkerSettings(this.getHighSpeedVideoFpsRanges));
        }
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setCacheMode(int i) {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_CACHE_MODE;
        if (n.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForN.setCacheMode(getHighSpeedVideoFpsRangesFor(), i);
        } else {
            if (n.isSupportedByWebView()) {
                Camera2StreamConfigurationMap().setCacheMode(i);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public int getCacheMode() {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_CACHE_MODE;
        if (n.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForN.getCacheMode(getHighSpeedVideoFpsRangesFor());
        }
        if (n.isSupportedByWebView()) {
            return Camera2StreamConfigurationMap().getCacheMode();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setAllowContentAccess(boolean z) {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_CONTENT_ACCESS;
        if (n.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForN.setAllowContentAccess(getHighSpeedVideoFpsRangesFor(), z);
        } else {
            if (n.isSupportedByWebView()) {
                Camera2StreamConfigurationMap().setAllowContentAccess(z);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getAllowContentAccess() {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_CONTENT_ACCESS;
        if (n.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForN.getAllowContentAccess(getHighSpeedVideoFpsRangesFor());
        }
        if (n.isSupportedByWebView()) {
            return Camera2StreamConfigurationMap().getAllowContentAccess();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setAllowFileAccess(boolean z) {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_FILE_ACCESS;
        if (n.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForN.setAllowFileAccess(getHighSpeedVideoFpsRangesFor(), z);
        } else {
            if (n.isSupportedByWebView()) {
                Camera2StreamConfigurationMap().setAllowFileAccess(z);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getAllowFileAccess() {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_FILE_ACCESS;
        if (n.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForN.getAllowFileAccess(getHighSpeedVideoFpsRangesFor());
        }
        if (n.isSupportedByWebView()) {
            return Camera2StreamConfigurationMap().getAllowFileAccess();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setBlockNetworkLoads(boolean z) {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_BLOCK_NETWORK_LOADS;
        if (n.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForN.setBlockNetworkLoads(getHighSpeedVideoFpsRangesFor(), z);
        } else {
            if (n.isSupportedByWebView()) {
                Camera2StreamConfigurationMap().setBlockNetworkLoads(z);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getBlockNetworkLoads() {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_BLOCK_NETWORK_LOADS;
        if (n.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForN.getBlockNetworkLoads(getHighSpeedVideoFpsRangesFor());
        }
        if (n.isSupportedByWebView()) {
            return Camera2StreamConfigurationMap().getBlockNetworkLoads();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    @java.lang.Deprecated(forRemoval = true)
    public java.util.Set<java.lang.String> getRequestedWithHeaderOriginAllowList() {
        return java.util.Collections.emptySet();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setIncludeCookiesOnShouldInterceptRequestEnabled(boolean z) {
        if (!androidx.webkit.internal.WebViewFeatureInternal.COOKIE_INTERCEPT.isSupportedByWebView()) {
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
        Camera2StreamConfigurationMap().setIncludeCookiesOnIntercept(z);
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean isIncludeCookiesOnShouldInterceptRequestEnabled() {
        if (!androidx.webkit.internal.WebViewFeatureInternal.COOKIE_INTERCEPT.isSupportedByWebView()) {
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return Camera2StreamConfigurationMap().getIncludeCookiesOnIntercept();
    }
}

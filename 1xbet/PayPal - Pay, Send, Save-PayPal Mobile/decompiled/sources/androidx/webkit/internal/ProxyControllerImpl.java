package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class ProxyControllerImpl extends androidx.webkit.ProxyController {
    private org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface getHighSpeedVideoFpsRangesFor;

    @Override // androidx.webkit.ProxyController
    public void setProxyOverride(androidx.webkit.ProxyConfig proxyConfig, java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        androidx.webkit.internal.ApiFeature.NoFramework noFramework = androidx.webkit.internal.WebViewFeatureInternal.PROXY_OVERRIDE;
        androidx.webkit.internal.ApiFeature.NoFramework noFramework2 = androidx.webkit.internal.WebViewFeatureInternal.PROXY_OVERRIDE_REVERSE_BYPASS;
        java.lang.String[][] proxyRulesToStringArray = proxyRulesToStringArray(proxyConfig.getProxyRules());
        java.lang.String[] strArr = (java.lang.String[]) proxyConfig.getBypassRules().toArray(new java.lang.String[0]);
        if (!noFramework.isSupportedByWebView() || proxyConfig.isReverseBypassEnabled()) {
            if (!noFramework.isSupportedByWebView() || !noFramework2.isSupportedByWebView()) {
                throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
            }
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getProxyController();
            }
            this.getHighSpeedVideoFpsRangesFor.setProxyOverride(proxyRulesToStringArray, strArr, runnable, executor, proxyConfig.isReverseBypassEnabled());
            return;
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getProxyController();
        }
        this.getHighSpeedVideoFpsRangesFor.setProxyOverride(proxyRulesToStringArray, strArr, runnable, executor);
    }

    @Override // androidx.webkit.ProxyController
    public void clearProxyOverride(java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        if (!androidx.webkit.internal.WebViewFeatureInternal.PROXY_OVERRIDE.isSupportedByWebView()) {
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getProxyController();
        }
        this.getHighSpeedVideoFpsRangesFor.clearProxyOverride(runnable, executor);
    }

    public static java.lang.String[][] proxyRulesToStringArray(java.util.List<androidx.webkit.ProxyConfig.ProxyRule> list) {
        java.lang.String[][] strArr = (java.lang.String[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.String.class, list.size(), 2);
        for (int i = 0; i < list.size(); i++) {
            strArr[i][0] = list.get(i).getSchemeFilter();
            strArr[i][1] = list.get(i).getUrl();
        }
        return strArr;
    }
}

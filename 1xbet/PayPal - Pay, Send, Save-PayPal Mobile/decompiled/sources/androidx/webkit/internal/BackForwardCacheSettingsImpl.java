package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class BackForwardCacheSettingsImpl implements org.chromium.support_lib_boundary.WebViewBackForwardCacheSettingsBoundaryInterface {
    androidx.webkit.BackForwardCacheSettings getHighSpeedVideoFpsRangesFor;

    public BackForwardCacheSettingsImpl(androidx.webkit.BackForwardCacheSettings backForwardCacheSettings) {
        this.getHighSpeedVideoFpsRangesFor = backForwardCacheSettings;
    }

    @Override // org.chromium.support_lib_boundary.WebViewBackForwardCacheSettingsBoundaryInterface
    public int getTimeoutInSeconds() {
        return (int) this.getHighSpeedVideoFpsRangesFor.getTimeoutSeconds();
    }

    @Override // org.chromium.support_lib_boundary.WebViewBackForwardCacheSettingsBoundaryInterface
    public int getMaxPagesInCache() {
        return this.getHighSpeedVideoFpsRangesFor.getMaxPagesInCache();
    }

    @Override // org.chromium.support_lib_boundary.IsomorphicObjectBoundaryInterface
    public java.lang.Object getOrCreatePeer(java.util.concurrent.Callable<java.lang.Object> callable) {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}

package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebViewStartUpConfigAdapter implements org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface {
    private final androidx.webkit.WebViewStartUpConfig getHighSpeedVideoFpsRanges;

    public WebViewStartUpConfigAdapter(androidx.webkit.WebViewStartUpConfig webViewStartUpConfig) {
        this.getHighSpeedVideoFpsRanges = webViewStartUpConfig;
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public java.util.concurrent.Executor getBackgroundExecutor() {
        return this.getHighSpeedVideoFpsRanges.getBackgroundExecutor();
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public boolean shouldRunUiThreadStartUpTasks() {
        return this.getHighSpeedVideoFpsRanges.shouldRunUiThreadStartUpTasks();
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public java.util.Set<java.lang.String> getProfileNamesToLoad() {
        return this.getHighSpeedVideoFpsRanges.getProfilesToLoadDuringStartup();
    }
}

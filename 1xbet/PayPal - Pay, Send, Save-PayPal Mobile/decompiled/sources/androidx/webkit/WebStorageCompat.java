package androidx.webkit;

/* loaded from: classes7.dex */
public final class WebStorageCompat {
    private WebStorageCompat() {
    }

    public static void deleteBrowsingData(android.webkit.WebStorage webStorage, java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        if (androidx.webkit.internal.WebViewFeatureInternal.DELETE_BROWSING_DATA.isSupportedByWebView()) {
            getHighSpeedVideoFpsRangesFor(webStorage).deleteBrowsingData(executor, runnable);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void deleteBrowsingData(android.webkit.WebStorage webStorage, java.lang.Runnable runnable) {
        deleteBrowsingData(webStorage, new java.util.concurrent.Executor() { // from class: androidx.webkit.WebStorageCompat$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable2) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(runnable2);
            }
        }, runnable);
    }

    public static java.lang.String deleteBrowsingDataForSite(android.webkit.WebStorage webStorage, java.lang.String str, java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        if (androidx.webkit.internal.WebViewFeatureInternal.DELETE_BROWSING_DATA.isSupportedByWebView()) {
            return getHighSpeedVideoFpsRangesFor(webStorage).deleteBrowsingDataForSite(str, executor, runnable);
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static java.lang.String deleteBrowsingDataForSite(android.webkit.WebStorage webStorage, java.lang.String str, java.lang.Runnable runnable) {
        return deleteBrowsingDataForSite(webStorage, str, new java.util.concurrent.Executor() { // from class: androidx.webkit.WebStorageCompat$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable2) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(runnable2);
            }
        }, runnable);
    }

    private static androidx.webkit.internal.WebStorageAdapter getHighSpeedVideoFpsRangesFor(android.webkit.WebStorage webStorage) {
        return androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertWebStorage(webStorage);
    }
}

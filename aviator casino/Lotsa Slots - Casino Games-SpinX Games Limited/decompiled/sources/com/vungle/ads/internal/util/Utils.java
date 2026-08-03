package com.vungle.ads.internal.util;

/* compiled from: Utils.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/util/Utils;", "", "()V", "getFolderSize", "", "dir", "Ljava/io/File;", "getWebViewDataSize", "context", "Landroid/content/Context;", "isOSVersionInvalid", "", "isUrlValid", "url", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class Utils {
    public static final com.vungle.ads.internal.util.Utils INSTANCE = new com.vungle.ads.internal.util.Utils();

    private Utils() {
    }

    public final boolean isUrlValid(java.lang.String url) {
        java.lang.String str = url;
        return (str == null || str.length() == 0 || (!android.webkit.URLUtil.isHttpsUrl(url) && !android.webkit.URLUtil.isHttpUrl(url))) ? false : true;
    }

    public final boolean isOSVersionInvalid() {
        return android.os.Build.VERSION.SDK_INT < 25;
    }

    private final long getFolderSize(java.io.File dir) {
        long j = 0;
        if (dir.exists()) {
            for (java.io.File file : kotlin.io.FilesKt.walkTopDown(dir)) {
                if (file.isFile()) {
                    j += file.length();
                }
            }
        }
        return j;
    }

    public final long getWebViewDataSize(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            java.io.File file = new java.io.File(context.getApplicationInfo().dataDir, "app_webview");
            r0 = file.exists() ? getFolderSize(file) : 0L;
            java.io.File cacheDir = context.getCacheDir();
            if (!cacheDir.exists()) {
                return r0;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cacheDir, "cacheDir");
            return r0 + getFolderSize(kotlin.io.FilesKt.resolve(cacheDir, "webviewCache"));
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e("WebViewSize", "Error reading WebView data size: " + e.getMessage());
            return r0;
        }
    }
}

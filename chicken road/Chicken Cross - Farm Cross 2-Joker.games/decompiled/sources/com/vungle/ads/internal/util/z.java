package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.Build;
import android.webkit.URLUtil;
import java.io.File;
import java.util.Iterator;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class z {
    public static boolean a(String str) {
        return (str == null || str.length() == 0 || (!URLUtil.isHttpsUrl(str) && !URLUtil.isHttpUrl(str))) ? false : true;
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT < 25;
    }

    public static long a(Context context) {
        long j;
        Intrinsics.checkNotNullParameter(context, "context");
        long j2 = 0;
        try {
            File file = new File(context.getApplicationInfo().dataDir, "app_webview");
            if (file.exists() && file.exists()) {
                Iterator<File> it = FilesKt.walkTopDown(file).iterator();
                j = 0;
                while (it.hasNext()) {
                    File next = it.next();
                    if (next.isFile()) {
                        j += next.length();
                    }
                }
            } else {
                j = 0;
            }
            try {
                File cacheDir = context.getCacheDir();
                if (!cacheDir.exists()) {
                    return j;
                }
                Intrinsics.checkNotNullExpressionValue(cacheDir, "cacheDir");
                File resolve = FilesKt.resolve(cacheDir, "webviewCache");
                if (resolve.exists()) {
                    Iterator<File> it2 = FilesKt.walkTopDown(resolve).iterator();
                    while (it2.hasNext()) {
                        File next2 = it2.next();
                        if (next2.isFile()) {
                            j2 += next2.length();
                        }
                    }
                }
                return j + j2;
            } catch (Exception e) {
                e = e;
                j2 = j;
                boolean z = u.f12190a;
                t.b("WebViewSize", com.iab.omid.library.vungle.internal.l.a("Error reading WebView data size: ").append(e.getMessage()).toString());
                return j2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}

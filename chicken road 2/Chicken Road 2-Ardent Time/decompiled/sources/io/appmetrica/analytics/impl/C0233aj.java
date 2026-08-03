package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.aj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233aj {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0011 A[Catch: all -> 0x002f, TRY_ENTER, TryCatch #3 {all -> 0x002f, blocks: (B:3:0x0003, B:7:0x0011, B:9:0x001f), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #3 {all -> 0x002f, blocks: (B:3:0x0003, B:7:0x0011, B:9:0x001f), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static io.appmetrica.analytics.coreapi.internal.model.ScreenInfo a(android.content.Context context) {
        android.graphics.Point point;
        int i2;
        float f2;
        android.util.DisplayMetrics displayMetrics;
        android.view.Display display;
        if (io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(30)) {
            try {
                display = context.getDisplay();
            } catch (java.lang.Throwable unused) {
            }
            if (display == null) {
                display = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
            }
            if (display != null) {
                point = (android.graphics.Point) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceSafely(display, "getting display metrics", "Display", new io.appmetrica.analytics.impl.Zi());
                if (point == null) {
                    return null;
                }
                int max = java.lang.Math.max(point.x, point.y);
                int min = java.lang.Math.min(point.x, point.y);
                try {
                    displayMetrics = context.getResources().getDisplayMetrics();
                    i2 = displayMetrics.densityDpi;
                } catch (java.lang.Throwable unused2) {
                    i2 = 0;
                }
                try {
                    f2 = displayMetrics.density;
                } catch (java.lang.Throwable unused3) {
                    f2 = 0.0f;
                    return new io.appmetrica.analytics.coreapi.internal.model.ScreenInfo(max, min, i2, f2);
                }
                return new io.appmetrica.analytics.coreapi.internal.model.ScreenInfo(max, min, i2, f2);
            }
            point = null;
            if (point == null) {
            }
        }
        display = null;
        if (display == null) {
        }
        if (display != null) {
        }
        point = null;
        if (point == null) {
        }
    }
}

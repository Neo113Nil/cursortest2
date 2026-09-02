package A;

import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import g0.h;
import m.r;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f0a = new b();

    public final r a(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        h.e(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        h.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return r.a(null, windowInsets);
    }
}

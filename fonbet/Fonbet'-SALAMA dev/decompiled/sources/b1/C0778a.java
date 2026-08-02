package b1;

import P.q0;
import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import t6.h;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0778a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0778a f10125a = new C0778a();

    public final q0 a(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        h.e(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        h.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return q0.g(windowInsets, null);
    }
}

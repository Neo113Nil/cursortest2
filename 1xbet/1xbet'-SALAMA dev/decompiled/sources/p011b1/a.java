package p011b1;

import P.q0;
import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10125a = new a();

    public final q0 a(Context context) {
        h.e(context, "context");
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        h.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return q0.g(windowInsets, null);
    }
}

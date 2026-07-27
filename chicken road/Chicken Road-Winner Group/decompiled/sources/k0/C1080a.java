package k0;

import D.V;
import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.internal.j;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1080a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1080a f9657a = new C1080a();

    public final V a(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        j.e(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        j.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return V.a(windowInsets, null);
    }
}

package d0;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107a {

    /* renamed from: a, reason: collision with root package name */
    public static final d0.C0107a f2738a = new d0.C0107a();

    public final y.Q a(android.content.Context context) {
        android.view.WindowMetrics currentWindowMetrics;
        android.view.WindowInsets windowInsets;
        kotlin.jvm.internal.i.e(context, "context");
        currentWindowMetrics = ((android.view.WindowManager) context.getSystemService(android.view.WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        kotlin.jvm.internal.i.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return y.Q.a(windowInsets, null);
    }
}

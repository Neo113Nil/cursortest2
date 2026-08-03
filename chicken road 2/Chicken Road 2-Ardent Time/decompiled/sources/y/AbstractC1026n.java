package y;

/* renamed from: y.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1026n {
    public static android.view.WindowInsets a(android.view.View view, android.view.WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static android.view.WindowInsets b(android.view.View view, android.view.WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(android.view.View view) {
        view.requestApplyInsets();
    }
}

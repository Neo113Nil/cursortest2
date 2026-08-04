package O0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f4897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f4898b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f4897a = new v();
        } else {
            f4897a = new u();
        }
        f4898b = new c(Float.class, "translationAlpha", 5);
        new c(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i7, int i8, int i9, int i10) {
        f4897a.p0(view, i7, i8, i9, i10);
    }
}

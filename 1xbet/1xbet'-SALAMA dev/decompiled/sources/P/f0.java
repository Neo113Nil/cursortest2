package P;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Field f5061c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f5062d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Constructor f5063e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f5064f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WindowInsets f5065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public I.c f5066b;

    public f0() {
        this.f5065a = e();
    }

    private static WindowInsets e() {
        if (!f5062d) {
            try {
                f5061c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f5062d = true;
        }
        Field field = f5061c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e8);
            }
        }
        if (!f5064f) {
            try {
                f5063e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e9);
            }
            f5064f = true;
        }
        Constructor constructor = f5063e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e10);
            }
        }
        return null;
    }

    @Override // P.i0
    public q0 b() {
        a();
        q0 q0VarG = q0.g(this.f5065a, null);
        p0 p0Var = q0VarG.f5101a;
        p0Var.l(null);
        p0Var.n(this.f5066b);
        return q0VarG;
    }

    @Override // P.i0
    public void c(I.c cVar) {
        this.f5066b = cVar;
    }

    @Override // P.i0
    public void d(I.c cVar) {
        WindowInsets windowInsets = this.f5065a;
        if (windowInsets != null) {
            this.f5065a = windowInsets.replaceSystemWindowInsets(cVar.f3462a, cVar.f3463b, cVar.f3464c, cVar.f3465d);
        }
    }

    public f0(q0 q0Var) {
        super(q0Var);
        this.f5065a = q0Var.f();
    }
}

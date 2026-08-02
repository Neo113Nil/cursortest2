package P;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class j0 extends p0 {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f5078f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Method f5079g;

    /* renamed from: h, reason: collision with root package name */
    public static Class f5080h;

    /* renamed from: i, reason: collision with root package name */
    public static Field f5081i;
    public static Field j;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f5082c;

    /* renamed from: d, reason: collision with root package name */
    public I.c f5083d;

    /* renamed from: e, reason: collision with root package name */
    public I.c f5084e;

    public j0(q0 q0Var, WindowInsets windowInsets) {
        super(q0Var);
        this.f5083d = null;
        this.f5082c = windowInsets;
    }

    private I.c o(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f5078f) {
            p();
        }
        Method method = f5079g;
        if (method != null && f5080h != null && f5081i != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f5081i.get(j.get(invoke));
                if (rect != null) {
                    return I.c.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e7) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
            }
        }
        return null;
    }

    private static void p() {
        try {
            f5079g = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f5080h = cls;
            f5081i = cls.getDeclaredField("mVisibleInsets");
            j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f5081i.setAccessible(true);
            j.setAccessible(true);
        } catch (ReflectiveOperationException e7) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
        }
        f5078f = true;
    }

    @Override // P.p0
    public void d(View view) {
        I.c o7 = o(view);
        if (o7 == null) {
            o7 = I.c.f3461e;
        }
        q(o7);
    }

    @Override // P.p0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f5084e, ((j0) obj).f5084e);
        }
        return false;
    }

    @Override // P.p0
    public final I.c h() {
        if (this.f5083d == null) {
            WindowInsets windowInsets = this.f5082c;
            this.f5083d = I.c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f5083d;
    }

    @Override // P.p0
    public q0 i(int i7, int i8, int i9, int i10) {
        q0 g3 = q0.g(this.f5082c, null);
        int i11 = Build.VERSION.SDK_INT;
        i0 h0Var = i11 >= 30 ? new h0(g3) : i11 >= 29 ? new g0(g3) : new f0(g3);
        h0Var.d(q0.e(h(), i7, i8, i9, i10));
        h0Var.c(q0.e(f(), i7, i8, i9, i10));
        return h0Var.b();
    }

    @Override // P.p0
    public boolean k() {
        return this.f5082c.isRound();
    }

    public void q(I.c cVar) {
        this.f5084e = cVar;
    }

    @Override // P.p0
    public void l(I.c[] cVarArr) {
    }

    @Override // P.p0
    public void m(q0 q0Var) {
    }
}

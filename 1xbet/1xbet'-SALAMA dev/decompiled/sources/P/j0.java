package P;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends p0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f5078f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f5079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Class f5080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Field f5081i;
    public static Field j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f5082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public I.c f5083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
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
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f5081i.get(j.get(objInvoke));
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
        I.c cVarO = o(view);
        if (cVarO == null) {
            cVarO = I.c.f3461e;
        }
        q(cVarO);
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
        i0 g0Var;
        q0 q0VarG = q0.g(this.f5082c, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            g0Var = new h0(q0VarG);
        } else {
            g0Var = i11 >= 29 ? new g0(q0VarG) : new f0(q0VarG);
        }
        g0Var.d(q0.e(h(), i7, i8, i9, i10));
        g0Var.c(q0.e(f(), i7, i8, i9, i10));
        return g0Var.b();
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

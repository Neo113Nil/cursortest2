package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* renamed from: n.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2146p {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f18306b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C2146p f18307c;

    /* renamed from: a, reason: collision with root package name */
    public m0 f18308a;

    public static synchronized void b() {
        synchronized (C2146p.class) {
            if (f18307c == null) {
                C2146p c2146p = new C2146p();
                f18307c = c2146p;
                c2146p.f18308a = m0.d();
                f18307c.f18308a.l(new C0.c());
            }
        }
    }

    public static void c(Drawable drawable, t0 t0Var, int[] iArr) {
        PorterDuff.Mode mode = m0.f18282h;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z3 = t0Var.f18325b;
        if (z3 || t0Var.f18324a) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z3 ? (ColorStateList) t0Var.f18326c : null;
            PorterDuff.Mode mode2 = t0Var.f18324a ? (PorterDuff.Mode) t0Var.f18327d : m0.f18282h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = m0.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable a(Context context, int i) {
        return this.f18308a.f(context, i);
    }
}

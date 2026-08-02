package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import h.AbstractC1986a;
import java.lang.reflect.Field;
import r.C2322H;
import x0.C2630p;

/* renamed from: n.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2145o {

    /* renamed from: a, reason: collision with root package name */
    public int f18294a;

    /* renamed from: b, reason: collision with root package name */
    public Object f18295b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18296c;

    /* renamed from: d, reason: collision with root package name */
    public Object f18297d;

    /* renamed from: e, reason: collision with root package name */
    public Object f18298e;
    public Object f;

    public C2145o(View view) {
        C2146p c2146p;
        this.f18294a = -1;
        this.f18295b = view;
        PorterDuff.Mode mode = C2146p.f18306b;
        synchronized (C2146p.class) {
            try {
                if (C2146p.f18307c == null) {
                    C2146p.b();
                }
                c2146p = C2146p.f18307c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f18296c = c2146p;
    }

    public void a() {
        View view = (View) this.f18295b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((t0) this.f18297d) != null) {
                if (((t0) this.f) == null) {
                    this.f = new t0();
                }
                t0 t0Var = (t0) this.f;
                t0Var.f18326c = null;
                t0Var.f18325b = false;
                t0Var.f18327d = null;
                t0Var.f18324a = false;
                Field field = n1.C.f18360a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    t0Var.f18325b = true;
                    t0Var.f18326c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    t0Var.f18324a = true;
                    t0Var.f18327d = backgroundTintMode;
                }
                if (t0Var.f18325b || t0Var.f18324a) {
                    C2146p.c(background, t0Var, view.getDrawableState());
                    return;
                }
            }
            t0 t0Var2 = (t0) this.f18298e;
            if (t0Var2 != null) {
                C2146p.c(background, t0Var2, view.getDrawableState());
                return;
            }
            t0 t0Var3 = (t0) this.f18297d;
            if (t0Var3 != null) {
                C2146p.c(background, t0Var3, view.getDrawableState());
            }
        }
    }

    public void b(AttributeSet attributeSet, int i) {
        ColorStateList i5;
        View view = (View) this.f18295b;
        Context context = view.getContext();
        int[] iArr = AbstractC1986a.f17185s;
        v3.e G5 = v3.e.G(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) G5.f20433m;
        View view2 = (View) this.f18295b;
        n1.C.c(view2, view2.getContext(), iArr, attributeSet, (TypedArray) G5.f20433m, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f18294a = typedArray.getResourceId(0, -1);
                C2146p c2146p = (C2146p) this.f18296c;
                Context context2 = view.getContext();
                int i6 = this.f18294a;
                synchronized (c2146p) {
                    i5 = c2146p.f18308a.i(context2, i6);
                }
                if (i5 != null) {
                    d(i5);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(G5.w(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(AbstractC2119M.b(typedArray.getInt(2, -1), null));
            }
            G5.J();
        } catch (Throwable th) {
            G5.J();
            throw th;
        }
    }

    public void c(int i) {
        ColorStateList colorStateList;
        this.f18294a = i;
        C2146p c2146p = (C2146p) this.f18296c;
        if (c2146p != null) {
            Context context = ((View) this.f18295b).getContext();
            synchronized (c2146p) {
                colorStateList = c2146p.f18308a.i(context, i);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    public void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((t0) this.f18297d) == null) {
                this.f18297d = new t0();
            }
            t0 t0Var = (t0) this.f18297d;
            t0Var.f18326c = colorStateList;
            t0Var.f18325b = true;
        } else {
            this.f18297d = null;
        }
        a();
    }

    public void e(ColorStateList colorStateList) {
        if (((t0) this.f18298e) == null) {
            this.f18298e = new t0();
        }
        t0 t0Var = (t0) this.f18298e;
        t0Var.f18326c = colorStateList;
        t0Var.f18325b = true;
        a();
    }

    public void f(PorterDuff.Mode mode) {
        if (((t0) this.f18298e) == null) {
            this.f18298e = new t0();
        }
        t0 t0Var = (t0) this.f18298e;
        t0Var.f18327d = mode;
        t0Var.f18324a = true;
        a();
    }

    public C2145o() {
        this.f18295b = new C2630p[32];
        this.f18296c = new float[32];
        this.f18297d = new byte[32];
        int i = r.P.f18958a;
        this.f18298e = new C2322H();
        this.f = new C2322H();
    }
}

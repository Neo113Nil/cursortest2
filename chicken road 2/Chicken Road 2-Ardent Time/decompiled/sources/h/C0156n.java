package h;

/* renamed from: h.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156n {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f3200a;

    /* renamed from: b, reason: collision with root package name */
    public final h.C0157o f3201b;

    /* renamed from: c, reason: collision with root package name */
    public int f3202c = -1;

    /* renamed from: d, reason: collision with root package name */
    public I1.h f3203d;

    /* renamed from: e, reason: collision with root package name */
    public I1.h f3204e;

    /* renamed from: f, reason: collision with root package name */
    public I1.h f3205f;

    public C0156n(android.view.View view) {
        h.C0157o c0157o;
        this.f3200a = view;
        android.graphics.PorterDuff.Mode mode = h.C0157o.f3219b;
        synchronized (h.C0157o.class) {
            try {
                if (h.C0157o.f3220c == null) {
                    h.C0157o.b();
                }
                c0157o = h.C0157o.f3220c;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        this.f3201b = c0157o;
    }

    public final void a() {
        android.view.View view = this.f3200a;
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background != null) {
            if (this.f3203d != null) {
                if (this.f3205f == null) {
                    this.f3205f = new I1.h();
                }
                I1.h hVar = this.f3205f;
                hVar.f725c = null;
                hVar.f724b = false;
                hVar.f726d = null;
                hVar.f723a = false;
                java.lang.reflect.Field field = y.x.f8478a;
                android.content.res.ColorStateList g2 = y.AbstractC1028p.g(view);
                if (g2 != null) {
                    hVar.f724b = true;
                    hVar.f725c = g2;
                }
                android.graphics.PorterDuff.Mode h2 = y.AbstractC1028p.h(view);
                if (h2 != null) {
                    hVar.f723a = true;
                    hVar.f726d = h2;
                }
                if (hVar.f724b || hVar.f723a) {
                    h.C0157o.c(background, hVar, view.getDrawableState());
                    return;
                }
            }
            I1.h hVar2 = this.f3204e;
            if (hVar2 != null) {
                h.C0157o.c(background, hVar2, view.getDrawableState());
                return;
            }
            I1.h hVar3 = this.f3203d;
            if (hVar3 != null) {
                h.C0157o.c(background, hVar3, view.getDrawableState());
            }
        }
    }

    public final void b(android.util.AttributeSet attributeSet, int i2) {
        android.content.res.ColorStateList f2;
        android.view.View view = this.f3200a;
        I0.b H2 = I0.b.H(view.getContext(), attributeSet, c.AbstractC0095a.f2551u, i2);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) H2.f658c;
        try {
            if (typedArray.hasValue(0)) {
                this.f3202c = typedArray.getResourceId(0, -1);
                h.C0157o c0157o = this.f3201b;
                android.content.Context context = view.getContext();
                int i3 = this.f3202c;
                synchronized (c0157o) {
                    f2 = c0157o.f3221a.f(context, i3);
                }
                if (f2 != null) {
                    d(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                android.content.res.ColorStateList z2 = H2.z(1);
                java.lang.reflect.Field field = y.x.f8478a;
                y.AbstractC1028p.q(view, z2);
            }
            if (typedArray.hasValue(2)) {
                android.graphics.PorterDuff.Mode c2 = h.AbstractC0165x.c(typedArray.getInt(2, -1), null);
                java.lang.reflect.Field field2 = y.x.f8478a;
                y.AbstractC1028p.r(view, c2);
            }
        } finally {
            H2.K();
        }
    }

    public final void c(int i2) {
        android.content.res.ColorStateList colorStateList;
        this.f3202c = i2;
        h.C0157o c0157o = this.f3201b;
        if (c0157o != null) {
            android.content.Context context = this.f3200a.getContext();
            synchronized (c0157o) {
                colorStateList = c0157o.f3221a.f(context, i2);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    public final void d(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3203d == null) {
                this.f3203d = new I1.h();
            }
            I1.h hVar = this.f3203d;
            hVar.f725c = colorStateList;
            hVar.f724b = true;
        } else {
            this.f3203d = null;
        }
        a();
    }

    public final void e(android.content.res.ColorStateList colorStateList) {
        if (this.f3204e == null) {
            this.f3204e = new I1.h();
        }
        I1.h hVar = this.f3204e;
        hVar.f725c = colorStateList;
        hVar.f724b = true;
        a();
    }

    public final void f(android.graphics.PorterDuff.Mode mode) {
        if (this.f3204e == null) {
            this.f3204e = new I1.h();
        }
        I1.h hVar = this.f3204e;
        hVar.f726d = mode;
        hVar.f723a = true;
        a();
    }
}

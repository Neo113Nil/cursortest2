package l;

import D.AbstractC0016q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import g.AbstractC0301a;
import java.lang.reflect.Field;

/* renamed from: l.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1095n {

    /* renamed from: a, reason: collision with root package name */
    public final View f9837a;

    /* renamed from: b, reason: collision with root package name */
    public final C1096o f9838b;

    /* renamed from: c, reason: collision with root package name */
    public int f9839c = -1;

    /* renamed from: d, reason: collision with root package name */
    public V.e f9840d;

    /* renamed from: e, reason: collision with root package name */
    public V.e f9841e;
    public V.e f;

    public C1095n(View view) {
        C1096o c1096o;
        this.f9837a = view;
        PorterDuff.Mode mode = C1096o.f9842b;
        synchronized (C1096o.class) {
            try {
                if (C1096o.f9843c == null) {
                    C1096o.b();
                }
                c1096o = C1096o.f9843c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9838b = c1096o;
    }

    public final void a() {
        View view = this.f9837a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f9840d != null) {
                if (this.f == null) {
                    this.f = new V.e();
                }
                V.e eVar = this.f;
                eVar.f1604c = null;
                eVar.f1603b = false;
                eVar.f1605d = null;
                eVar.f1602a = false;
                Field field = D.z.f259a;
                ColorStateList g3 = AbstractC0016q.g(view);
                if (g3 != null) {
                    eVar.f1603b = true;
                    eVar.f1604c = g3;
                }
                PorterDuff.Mode h3 = AbstractC0016q.h(view);
                if (h3 != null) {
                    eVar.f1602a = true;
                    eVar.f1605d = h3;
                }
                if (eVar.f1603b || eVar.f1602a) {
                    C1096o.c(background, eVar, view.getDrawableState());
                    return;
                }
            }
            V.e eVar2 = this.f9841e;
            if (eVar2 != null) {
                C1096o.c(background, eVar2, view.getDrawableState());
                return;
            }
            V.e eVar3 = this.f9840d;
            if (eVar3 != null) {
                C1096o.c(background, eVar3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i3) {
        ColorStateList f;
        View view = this.f9837a;
        A0.j I3 = A0.j.I(view.getContext(), attributeSet, AbstractC0301a.f4945u, i3);
        TypedArray typedArray = (TypedArray) I3.f67c;
        try {
            if (typedArray.hasValue(0)) {
                this.f9839c = typedArray.getResourceId(0, -1);
                C1096o c1096o = this.f9838b;
                Context context = view.getContext();
                int i4 = this.f9839c;
                synchronized (c1096o) {
                    f = c1096o.f9844a.f(context, i4);
                }
                if (f != null) {
                    d(f);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList z3 = I3.z(1);
                Field field = D.z.f259a;
                AbstractC0016q.q(view, z3);
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode c3 = AbstractC1105y.c(typedArray.getInt(2, -1), null);
                Field field2 = D.z.f259a;
                AbstractC0016q.r(view, c3);
            }
        } finally {
            I3.L();
        }
    }

    public final void c(int i3) {
        ColorStateList colorStateList;
        this.f9839c = i3;
        C1096o c1096o = this.f9838b;
        if (c1096o != null) {
            Context context = this.f9837a.getContext();
            synchronized (c1096o) {
                colorStateList = c1096o.f9844a.f(context, i3);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f9840d == null) {
                this.f9840d = new V.e();
            }
            V.e eVar = this.f9840d;
            eVar.f1604c = colorStateList;
            eVar.f1603b = true;
        } else {
            this.f9840d = null;
        }
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (this.f9841e == null) {
            this.f9841e = new V.e();
        }
        V.e eVar = this.f9841e;
        eVar.f1604c = colorStateList;
        eVar.f1603b = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (this.f9841e == null) {
            this.f9841e = new V.e();
        }
        V.e eVar = this.f9841e;
        eVar.f1605d = mode;
        eVar.f1602a = true;
        a();
    }
}

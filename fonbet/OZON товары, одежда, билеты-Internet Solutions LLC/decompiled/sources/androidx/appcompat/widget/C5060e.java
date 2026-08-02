package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import i.C6977a;

/* renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5060e {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f37899a;

    /* renamed from: d, reason: collision with root package name */
    private Z f37902d;

    /* renamed from: e, reason: collision with root package name */
    private Z f37903e;

    /* renamed from: f, reason: collision with root package name */
    private Z f37904f;

    /* renamed from: c, reason: collision with root package name */
    private int f37901c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final C5064i f37900b = C5064i.b();

    C5060e(@NonNull View view) {
        this.f37899a = view;
    }

    final void a() {
        View view = this.f37899a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f37902d != null) {
                if (this.f37904f == null) {
                    this.f37904f = new Z();
                }
                Z z11 = this.f37904f;
                z11.f37849a = null;
                z11.f37852d = false;
                z11.f37850b = null;
                z11.f37851c = false;
                ColorStateList i11 = androidx.core.view.Y.i(view);
                if (i11 != null) {
                    z11.f37852d = true;
                    z11.f37849a = i11;
                }
                PorterDuff.Mode j11 = androidx.core.view.Y.j(view);
                if (j11 != null) {
                    z11.f37851c = true;
                    z11.f37850b = j11;
                }
                if (z11.f37852d || z11.f37851c) {
                    int[] drawableState = view.getDrawableState();
                    int i12 = C5064i.f37940d;
                    T.i(background, z11, drawableState);
                    return;
                }
            }
            Z z12 = this.f37903e;
            if (z12 != null) {
                int[] drawableState2 = view.getDrawableState();
                int i13 = C5064i.f37940d;
                T.i(background, z12, drawableState2);
            } else {
                Z z13 = this.f37902d;
                if (z13 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    int i14 = C5064i.f37940d;
                    T.i(background, z13, drawableState3);
                }
            }
        }
    }

    final ColorStateList b() {
        Z z11 = this.f37903e;
        if (z11 != null) {
            return z11.f37849a;
        }
        return null;
    }

    final PorterDuff.Mode c() {
        Z z11 = this.f37903e;
        if (z11 != null) {
            return z11.f37850b;
        }
        return null;
    }

    final void d(AttributeSet attributeSet, int i11) {
        View view = this.f37899a;
        Context context = view.getContext();
        int[] iArr = C6977a.f65645A;
        b0 v11 = b0.v(context, attributeSet, iArr, i11, 0);
        androidx.core.view.Y.B(view, view.getContext(), iArr, attributeSet, v11.r(), i11);
        try {
            if (v11.s(0)) {
                this.f37901c = v11.n(0, -1);
                ColorStateList f7 = this.f37900b.f(this.f37901c, view.getContext());
                if (f7 != null) {
                    g(f7);
                }
            }
            if (v11.s(1)) {
                androidx.core.view.Y.F(view, v11.c(1));
            }
            if (v11.s(2)) {
                androidx.core.view.Y.G(view, H.c(v11.k(2, -1), null));
            }
            v11.x();
        } catch (Throwable th2) {
            v11.x();
            throw th2;
        }
    }

    final void e() {
        this.f37901c = -1;
        g(null);
        a();
    }

    final void f(int i11) {
        this.f37901c = i11;
        C5064i c5064i = this.f37900b;
        g(c5064i != null ? c5064i.f(i11, this.f37899a.getContext()) : null);
        a();
    }

    final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f37902d == null) {
                this.f37902d = new Z();
            }
            Z z11 = this.f37902d;
            z11.f37849a = colorStateList;
            z11.f37852d = true;
        } else {
            this.f37902d = null;
        }
        a();
    }

    final void h(ColorStateList colorStateList) {
        if (this.f37903e == null) {
            this.f37903e = new Z();
        }
        Z z11 = this.f37903e;
        z11.f37849a = colorStateList;
        z11.f37852d = true;
        a();
    }

    final void i(PorterDuff.Mode mode) {
        if (this.f37903e == null) {
            this.f37903e = new Z();
        }
        Z z11 = this.f37903e;
        z11.f37850b = mode;
        z11.f37851c = true;
        a();
    }
}

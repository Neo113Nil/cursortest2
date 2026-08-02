package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.res.g;
import i.C6977a;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5080z {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final TextView f38007a;

    /* renamed from: b, reason: collision with root package name */
    private Z f38008b;

    /* renamed from: c, reason: collision with root package name */
    private Z f38009c;

    /* renamed from: d, reason: collision with root package name */
    private Z f38010d;

    /* renamed from: e, reason: collision with root package name */
    private Z f38011e;

    /* renamed from: f, reason: collision with root package name */
    private Z f38012f;

    /* renamed from: g, reason: collision with root package name */
    private Z f38013g;

    /* renamed from: h, reason: collision with root package name */
    private Z f38014h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    private final A f38015i;

    /* renamed from: j, reason: collision with root package name */
    private int f38016j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f38017k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f38018l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f38019m;

    /* renamed from: androidx.appcompat.widget.z$a */
    final class a extends g.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f38020a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38021b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f38022c;

        a(int i11, int i12, WeakReference weakReference) {
            this.f38020a = i11;
            this.f38021b = i12;
            this.f38022c = weakReference;
        }

        @Override // androidx.core.content.res.g.e
        public final void b(int i11) {
        }

        @Override // androidx.core.content.res.g.e
        public final void c(@NonNull Typeface typeface) {
            int i11;
            if (Build.VERSION.SDK_INT >= 28 && (i11 = this.f38020a) != -1) {
                typeface = e.a(typeface, i11, (this.f38021b & 2) != 0);
            }
            C5080z.this.n(this.f38022c, typeface);
        }
    }

    /* renamed from: androidx.appcompat.widget.z$b */
    /* loaded from: classes8.dex */
    final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f38024a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f38025b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f38026c;

        b(TextView textView, Typeface typeface, int i11) {
            this.f38024a = textView;
            this.f38025b = typeface;
            this.f38026c = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f38024a.setTypeface(this.f38025b, this.f38026c);
        }
    }

    /* renamed from: androidx.appcompat.widget.z$c */
    static class c {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: androidx.appcompat.widget.z$d */
    static class d {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i11, int i12, int i13, int i14) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
        }

        static void c(TextView textView, int[] iArr, int i11) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i11);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* renamed from: androidx.appcompat.widget.z$e */
    static class e {
        static Typeface a(Typeface typeface, int i11, boolean z11) {
            return Typeface.create(typeface, i11, z11);
        }
    }

    C5080z(@NonNull TextView textView) {
        this.f38007a = textView;
        this.f38015i = new A(textView);
    }

    private void a(Drawable drawable, Z z11) {
        if (drawable == null || z11 == null) {
            return;
        }
        int[] drawableState = this.f38007a.getDrawableState();
        int i11 = C5064i.f37940d;
        T.i(drawable, z11, drawableState);
    }

    private static Z d(Context context, C5064i c5064i, int i11) {
        ColorStateList f7 = c5064i.f(i11, context);
        if (f7 == null) {
            return null;
        }
        Z z11 = new Z();
        z11.f37852d = true;
        z11.f37849a = f7;
        return z11;
    }

    private void w(Context context, b0 b0Var) {
        String o11;
        this.f38016j = b0Var.k(2, this.f38016j);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int k11 = b0Var.k(11, -1);
            this.f38017k = k11;
            if (k11 != -1) {
                this.f38016j &= 2;
            }
        }
        if (!b0Var.s(10) && !b0Var.s(12)) {
            if (b0Var.s(1)) {
                this.f38019m = false;
                int k12 = b0Var.k(1, 1);
                if (k12 == 1) {
                    this.f38018l = Typeface.SANS_SERIF;
                    return;
                } else if (k12 == 2) {
                    this.f38018l = Typeface.SERIF;
                    return;
                } else {
                    if (k12 != 3) {
                        return;
                    }
                    this.f38018l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f38018l = null;
        int i12 = b0Var.s(12) ? 12 : 10;
        int i13 = this.f38017k;
        int i14 = this.f38016j;
        if (!context.isRestricted()) {
            try {
                Typeface j11 = b0Var.j(i12, this.f38016j, new a(i13, i14, new WeakReference(this.f38007a)));
                if (j11 != null) {
                    if (i11 < 28 || this.f38017k == -1) {
                        this.f38018l = j11;
                    } else {
                        this.f38018l = e.a(Typeface.create(j11, 0), this.f38017k, (this.f38016j & 2) != 0);
                    }
                }
                this.f38019m = this.f38018l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f38018l != null || (o11 = b0Var.o(i12)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f38017k == -1) {
            this.f38018l = Typeface.create(o11, this.f38016j);
        } else {
            this.f38018l = e.a(Typeface.create(o11, 0), this.f38017k, (this.f38016j & 2) != 0);
        }
    }

    final void b() {
        Z z11 = this.f38008b;
        TextView textView = this.f38007a;
        if (z11 != null || this.f38009c != null || this.f38010d != null || this.f38011e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f38008b);
            a(compoundDrawables[1], this.f38009c);
            a(compoundDrawables[2], this.f38010d);
            a(compoundDrawables[3], this.f38011e);
        }
        if (this.f38012f == null && this.f38013g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f38012f);
        a(compoundDrawablesRelative[2], this.f38013g);
    }

    final void c() {
        this.f38015i.a();
    }

    final int e() {
        return this.f38015i.d();
    }

    final int f() {
        return this.f38015i.e();
    }

    final int g() {
        return this.f38015i.f();
    }

    final int[] h() {
        return this.f38015i.g();
    }

    final int i() {
        return this.f38015i.h();
    }

    final ColorStateList j() {
        Z z11 = this.f38014h;
        if (z11 != null) {
            return z11.f37849a;
        }
        return null;
    }

    final PorterDuff.Mode k() {
        Z z11 = this.f38014h;
        if (z11 != null) {
            return z11.f37850b;
        }
        return null;
    }

    final boolean l() {
        return this.f38015i.k();
    }

    @SuppressLint({"NewApi"})
    final void m(AttributeSet attributeSet, int i11) {
        boolean z11;
        boolean z12;
        String str;
        String str2;
        int i12;
        float f7;
        TextView textView = this.f38007a;
        Context context = textView.getContext();
        C5064i b11 = C5064i.b();
        int[] iArr = C6977a.f65654h;
        b0 v11 = b0.v(context, attributeSet, iArr, i11, 0);
        androidx.core.view.Y.B(textView, textView.getContext(), iArr, attributeSet, v11.r(), i11);
        int n11 = v11.n(0, -1);
        if (v11.s(3)) {
            this.f38008b = d(context, b11, v11.n(3, 0));
        }
        if (v11.s(1)) {
            this.f38009c = d(context, b11, v11.n(1, 0));
        }
        if (v11.s(4)) {
            this.f38010d = d(context, b11, v11.n(4, 0));
        }
        if (v11.s(2)) {
            this.f38011e = d(context, b11, v11.n(2, 0));
        }
        if (v11.s(5)) {
            this.f38012f = d(context, b11, v11.n(5, 0));
        }
        if (v11.s(6)) {
            this.f38013g = d(context, b11, v11.n(6, 0));
        }
        v11.x();
        boolean z13 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = C6977a.f65670x;
        if (n11 != -1) {
            b0 t2 = b0.t(context, n11, iArr2);
            if (z13 || !t2.s(14)) {
                z11 = false;
                z12 = false;
            } else {
                z11 = t2.a(14, false);
                z12 = true;
            }
            w(context, t2);
            str = t2.s(15) ? t2.o(15) : null;
            str2 = t2.s(13) ? t2.o(13) : null;
            t2.x();
        } else {
            z11 = false;
            z12 = false;
            str = null;
            str2 = null;
        }
        b0 v12 = b0.v(context, attributeSet, iArr2, i11, 0);
        if (!z13 && v12.s(14)) {
            z11 = v12.a(14, false);
            z12 = true;
        }
        boolean z14 = z11;
        int i13 = Build.VERSION.SDK_INT;
        if (v12.s(15)) {
            str = v12.o(15);
        }
        if (v12.s(13)) {
            str2 = v12.o(13);
        }
        String str3 = str2;
        if (i13 >= 28 && v12.s(0) && v12.f(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        w(context, v12);
        v12.x();
        if (!z13 && z12) {
            p(z14);
        }
        Typeface typeface = this.f38018l;
        if (typeface != null) {
            if (this.f38017k == -1) {
                textView.setTypeface(typeface, this.f38016j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            d.d(textView, str3);
        }
        if (str != null) {
            c.b(textView, c.a(str));
        }
        A a11 = this.f38015i;
        a11.l(attributeSet, i11);
        if (i0.f37950c && a11.h() != 0) {
            int[] g10 = a11.g();
            if (g10.length > 0) {
                if (d.a(textView) != -1.0f) {
                    d.b(textView, a11.e(), a11.d(), a11.f(), 0);
                } else {
                    d.c(textView, g10, 0);
                }
            }
        }
        b0 u11 = b0.u(context, attributeSet, C6977a.f65655i);
        int n12 = u11.n(8, -1);
        Drawable c11 = n12 != -1 ? b11.c(context, n12) : null;
        int n13 = u11.n(13, -1);
        Drawable c12 = n13 != -1 ? b11.c(context, n13) : null;
        int n14 = u11.n(9, -1);
        Drawable c13 = n14 != -1 ? b11.c(context, n14) : null;
        int n15 = u11.n(6, -1);
        Drawable c14 = n15 != -1 ? b11.c(context, n15) : null;
        int n16 = u11.n(10, -1);
        Drawable c15 = n16 != -1 ? b11.c(context, n16) : null;
        int n17 = u11.n(7, -1);
        Drawable c16 = n17 != -1 ? b11.c(context, n17) : null;
        if (c15 != null || c16 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (c15 == null) {
                c15 = compoundDrawablesRelative[0];
            }
            if (c12 == null) {
                c12 = compoundDrawablesRelative[1];
            }
            if (c16 == null) {
                c16 = compoundDrawablesRelative[2];
            }
            if (c14 == null) {
                c14 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(c15, c12, c16, c14);
        } else if (c11 != null || c12 != null || c13 != null || c14 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (c11 == null) {
                    c11 = compoundDrawables[0];
                }
                if (c12 == null) {
                    c12 = compoundDrawables[1];
                }
                if (c13 == null) {
                    c13 = compoundDrawables[2];
                }
                if (c14 == null) {
                    c14 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(c11, c12, c13, c14);
            } else {
                if (c12 == null) {
                    c12 = compoundDrawablesRelative2[1];
                }
                if (c14 == null) {
                    c14 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, c12, compoundDrawablesRelative2[2], c14);
            }
        }
        if (u11.s(11)) {
            androidx.core.widget.k.d(textView, u11.c(11));
        }
        if (u11.s(12)) {
            androidx.core.widget.k.e(textView, H.c(u11.k(12, -1), null));
        }
        int f11 = u11.f(15, -1);
        int f12 = u11.f(18, -1);
        if (u11.s(19)) {
            TypedValue w11 = u11.w();
            if (w11 == null || w11.type != 5) {
                f7 = u11.f(19, -1);
                i12 = -1;
            } else {
                int i14 = w11.data;
                i12 = i14 & 15;
                f7 = TypedValue.complexToFloat(i14);
            }
        } else {
            i12 = -1;
            f7 = -1.0f;
        }
        u11.x();
        if (f11 != -1) {
            androidx.core.widget.k.f(textView, f11);
        }
        if (f12 != -1) {
            androidx.core.widget.k.g(textView, f12);
        }
        if (f7 != -1.0f) {
            if (i12 == -1) {
                androidx.core.widget.k.h(textView, (int) f7);
            } else {
                androidx.core.widget.k.i(textView, i12, f7);
            }
        }
    }

    final void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f38019m) {
            this.f38018l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f38016j));
                } else {
                    textView.setTypeface(typeface, this.f38016j);
                }
            }
        }
    }

    final void o(int i11, Context context) {
        String o11;
        b0 t2 = b0.t(context, i11, C6977a.f65670x);
        if (t2.s(14)) {
            p(t2.a(14, false));
        }
        boolean s11 = t2.s(0);
        TextView textView = this.f38007a;
        if (s11 && t2.f(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        w(context, t2);
        if (t2.s(13) && (o11 = t2.o(13)) != null) {
            d.d(textView, o11);
        }
        t2.x();
        Typeface typeface = this.f38018l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f38016j);
        }
    }

    final void p(boolean z11) {
        this.f38007a.setAllCaps(z11);
    }

    final void q(int i11, int i12, int i13, int i14) throws IllegalArgumentException {
        this.f38015i.m(i11, i12, i13, i14);
    }

    final void r(@NonNull int[] iArr, int i11) throws IllegalArgumentException {
        this.f38015i.n(iArr, i11);
    }

    final void s(int i11) {
        this.f38015i.o(i11);
    }

    final void t(ColorStateList colorStateList) {
        if (this.f38014h == null) {
            this.f38014h = new Z();
        }
        Z z11 = this.f38014h;
        z11.f37849a = colorStateList;
        z11.f37852d = colorStateList != null;
        this.f38008b = z11;
        this.f38009c = z11;
        this.f38010d = z11;
        this.f38011e = z11;
        this.f38012f = z11;
        this.f38013g = z11;
    }

    final void u(PorterDuff.Mode mode) {
        if (this.f38014h == null) {
            this.f38014h = new Z();
        }
        Z z11 = this.f38014h;
        z11.f37850b = mode;
        z11.f37851c = mode != null;
        this.f38008b = z11;
        this.f38009c = z11;
        this.f38010d = z11;
        this.f38011e = z11;
        this.f38012f = z11;
        this.f38013g = z11;
    }

    final void v(int i11, float f7) {
        if (i0.f37950c) {
            return;
        }
        A a11 = this.f38015i;
        if (a11.k()) {
            return;
        }
        a11.p(f7, i11);
    }
}

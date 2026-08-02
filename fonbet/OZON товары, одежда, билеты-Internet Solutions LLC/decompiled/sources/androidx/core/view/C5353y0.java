package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import jf.C7417b;

/* renamed from: androidx.core.view.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5353y0 {

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public static final C5353y0 f42353b;

    /* renamed from: a, reason: collision with root package name */
    private final l f42354a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: androidx.core.view.y0$a */
    /* loaded from: classes8.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Field f42355a;

        /* renamed from: b, reason: collision with root package name */
        private static Field f42356b;

        /* renamed from: c, reason: collision with root package name */
        private static Field f42357c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f42358d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f42355a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f42356b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f42357c = declaredField3;
                declaredField3.setAccessible(true);
                f42358d = true;
            } catch (ReflectiveOperationException e11) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e11.getMessage(), e11);
            }
        }

        public static C5353y0 a(@NonNull View view) {
            if (!f42358d || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = f42355a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) f42356b.get(obj);
                Rect rect2 = (Rect) f42357c.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                b bVar = new b();
                bVar.c(androidx.core.graphics.d.b(rect.left, rect.top, rect.right, rect.bottom));
                bVar.d(androidx.core.graphics.d.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                C5353y0 a11 = bVar.a();
                a11.r(a11);
                a11.d(view.getRootView());
                return a11;
            } catch (IllegalAccessException e11) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e11.getMessage(), e11);
                return null;
            }
        }
    }

    /* renamed from: androidx.core.view.y0$e */
    private static class e extends d {
        e() {
        }

        @Override // androidx.core.view.C5353y0.f
        void c(int i11, @NonNull androidx.core.graphics.d dVar) {
            this.f42366c.setInsets(n.a(i11), dVar.d());
        }

        e(@NonNull C5353y0 c5353y0) {
            super(c5353y0);
        }
    }

    /* renamed from: androidx.core.view.y0$f */
    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private final C5353y0 f42367a;

        /* renamed from: b, reason: collision with root package name */
        androidx.core.graphics.d[] f42368b;

        f() {
            this(new C5353y0());
        }

        protected final void a() {
            androidx.core.graphics.d[] dVarArr = this.f42368b;
            if (dVarArr != null) {
                androidx.core.graphics.d dVar = dVarArr[0];
                androidx.core.graphics.d dVar2 = dVarArr[1];
                C5353y0 c5353y0 = this.f42367a;
                if (dVar2 == null) {
                    dVar2 = c5353y0.f(2);
                }
                if (dVar == null) {
                    dVar = c5353y0.f(1);
                }
                g(androidx.core.graphics.d.a(dVar, dVar2));
                androidx.core.graphics.d dVar3 = this.f42368b[m.a(16)];
                if (dVar3 != null) {
                    f(dVar3);
                }
                androidx.core.graphics.d dVar4 = this.f42368b[m.a(32)];
                if (dVar4 != null) {
                    d(dVar4);
                }
                androidx.core.graphics.d dVar5 = this.f42368b[m.a(64)];
                if (dVar5 != null) {
                    h(dVar5);
                }
            }
        }

        @NonNull
        C5353y0 b() {
            throw null;
        }

        void c(int i11, @NonNull androidx.core.graphics.d dVar) {
            if (this.f42368b == null) {
                this.f42368b = new androidx.core.graphics.d[9];
            }
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    this.f42368b[m.a(i12)] = dVar;
                }
            }
        }

        void d(@NonNull androidx.core.graphics.d dVar) {
        }

        void e(@NonNull androidx.core.graphics.d dVar) {
            throw null;
        }

        void f(@NonNull androidx.core.graphics.d dVar) {
        }

        void g(@NonNull androidx.core.graphics.d dVar) {
            throw null;
        }

        void h(@NonNull androidx.core.graphics.d dVar) {
        }

        f(@NonNull C5353y0 c5353y0) {
            this.f42367a = c5353y0;
        }
    }

    /* renamed from: androidx.core.view.y0$g */
    private static class g extends l {

        /* renamed from: h, reason: collision with root package name */
        private static boolean f42369h = false;

        /* renamed from: i, reason: collision with root package name */
        private static Method f42370i;

        /* renamed from: j, reason: collision with root package name */
        private static Class<?> f42371j;

        /* renamed from: k, reason: collision with root package name */
        private static Field f42372k;

        /* renamed from: l, reason: collision with root package name */
        private static Field f42373l;

        /* renamed from: c, reason: collision with root package name */
        @NonNull
        final WindowInsets f42374c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.d[] f42375d;

        /* renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.d f42376e;

        /* renamed from: f, reason: collision with root package name */
        private C5353y0 f42377f;

        /* renamed from: g, reason: collision with root package name */
        androidx.core.graphics.d f42378g;

        g(@NonNull C5353y0 c5353y0, @NonNull WindowInsets windowInsets) {
            super(c5353y0);
            this.f42376e = null;
            this.f42374c = windowInsets;
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.d t(int i11, boolean z11) {
            androidx.core.graphics.d dVar = androidx.core.graphics.d.f42125e;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    dVar = androidx.core.graphics.d.a(dVar, u(i12, z11));
                }
            }
            return dVar;
        }

        private androidx.core.graphics.d v() {
            C5353y0 c5353y0 = this.f42377f;
            return c5353y0 != null ? c5353y0.h() : androidx.core.graphics.d.f42125e;
        }

        private androidx.core.graphics.d w(@NonNull View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f42369h) {
                y();
            }
            Method method = f42370i;
            if (method != null && f42371j != null && f42372k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f42372k.get(f42373l.get(invoke));
                    if (rect != null) {
                        return androidx.core.graphics.d.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e11.getMessage(), e11);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void y() {
            try {
                f42370i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f42371j = cls;
                f42372k = cls.getDeclaredField("mVisibleInsets");
                f42373l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f42372k.setAccessible(true);
                f42373l.setAccessible(true);
            } catch (ReflectiveOperationException e11) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e11.getMessage(), e11);
            }
            f42369h = true;
        }

        @Override // androidx.core.view.C5353y0.l
        void d(@NonNull View view) {
            androidx.core.graphics.d w11 = w(view);
            if (w11 == null) {
                w11 = androidx.core.graphics.d.f42125e;
            }
            z(w11);
        }

        @Override // androidx.core.view.C5353y0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f42378g, ((g) obj).f42378g);
            }
            return false;
        }

        @Override // androidx.core.view.C5353y0.l
        @NonNull
        public androidx.core.graphics.d f(int i11) {
            return t(i11, false);
        }

        @Override // androidx.core.view.C5353y0.l
        @NonNull
        public androidx.core.graphics.d g(int i11) {
            return t(i11, true);
        }

        @Override // androidx.core.view.C5353y0.l
        @NonNull
        final androidx.core.graphics.d k() {
            if (this.f42376e == null) {
                WindowInsets windowInsets = this.f42374c;
                this.f42376e = androidx.core.graphics.d.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f42376e;
        }

        @Override // androidx.core.view.C5353y0.l
        @NonNull
        C5353y0 m(int i11, int i12, int i13, int i14) {
            b bVar = new b(C5353y0.u(null, this.f42374c));
            bVar.d(C5353y0.n(k(), i11, i12, i13, i14));
            bVar.c(C5353y0.n(i(), i11, i12, i13, i14));
            return bVar.a();
        }

        @Override // androidx.core.view.C5353y0.l
        boolean o() {
            return this.f42374c.isRound();
        }

        @Override // androidx.core.view.C5353y0.l
        @SuppressLint({"WrongConstant"})
        boolean p(int i11) {
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0 && !x(i12)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.C5353y0.l
        public void q(androidx.core.graphics.d[] dVarArr) {
            this.f42375d = dVarArr;
        }

        @Override // androidx.core.view.C5353y0.l
        void r(C5353y0 c5353y0) {
            this.f42377f = c5353y0;
        }

        @NonNull
        protected androidx.core.graphics.d u(int i11, boolean z11) {
            androidx.core.graphics.d h11;
            int i12;
            if (i11 == 1) {
                return z11 ? androidx.core.graphics.d.b(0, Math.max(v().f42127b, k().f42127b), 0, 0) : androidx.core.graphics.d.b(0, k().f42127b, 0, 0);
            }
            if (i11 == 2) {
                if (z11) {
                    androidx.core.graphics.d v11 = v();
                    androidx.core.graphics.d i13 = i();
                    return androidx.core.graphics.d.b(Math.max(v11.f42126a, i13.f42126a), 0, Math.max(v11.f42128c, i13.f42128c), Math.max(v11.f42129d, i13.f42129d));
                }
                androidx.core.graphics.d k11 = k();
                C5353y0 c5353y0 = this.f42377f;
                h11 = c5353y0 != null ? c5353y0.h() : null;
                int i14 = k11.f42129d;
                if (h11 != null) {
                    i14 = Math.min(i14, h11.f42129d);
                }
                return androidx.core.graphics.d.b(k11.f42126a, 0, k11.f42128c, i14);
            }
            androidx.core.graphics.d dVar = androidx.core.graphics.d.f42125e;
            if (i11 == 8) {
                androidx.core.graphics.d[] dVarArr = this.f42375d;
                h11 = dVarArr != null ? dVarArr[m.a(8)] : null;
                if (h11 != null) {
                    return h11;
                }
                androidx.core.graphics.d k12 = k();
                androidx.core.graphics.d v12 = v();
                int i15 = k12.f42129d;
                if (i15 > v12.f42129d) {
                    return androidx.core.graphics.d.b(0, 0, 0, i15);
                }
                androidx.core.graphics.d dVar2 = this.f42378g;
                if (dVar2 != null && !dVar2.equals(dVar) && (i12 = this.f42378g.f42129d) > v12.f42129d) {
                    return androidx.core.graphics.d.b(0, 0, 0, i12);
                }
            } else {
                if (i11 == 16) {
                    return j();
                }
                if (i11 == 32) {
                    return h();
                }
                if (i11 == 64) {
                    return l();
                }
                if (i11 == 128) {
                    C5353y0 c5353y02 = this.f42377f;
                    C5331n e11 = c5353y02 != null ? c5353y02.e() : e();
                    if (e11 != null) {
                        return androidx.core.graphics.d.b(e11.b(), e11.d(), e11.c(), e11.a());
                    }
                }
            }
            return dVar;
        }

        protected boolean x(int i11) {
            if (i11 != 1 && i11 != 2) {
                if (i11 == 4) {
                    return false;
                }
                if (i11 != 8 && i11 != 128) {
                    return true;
                }
            }
            return !u(i11, false).equals(androidx.core.graphics.d.f42125e);
        }

        void z(@NonNull androidx.core.graphics.d dVar) {
            this.f42378g = dVar;
        }
    }

    /* renamed from: androidx.core.view.y0$h */
    private static class h extends g {

        /* renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.d f42379m;

        h(@NonNull C5353y0 c5353y0, @NonNull WindowInsets windowInsets) {
            super(c5353y0, windowInsets);
            this.f42379m = null;
        }

        @Override // androidx.core.view.C5353y0.l
        @NonNull
        C5353y0 b() {
            return C5353y0.u(null, this.f42374c.consumeStableInsets());
        }

        @Override // androidx.core.view.C5353y0.l
        @NonNull
        C5353y0 c() {
            return C5353y0.u(null, this.f42374c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.C5353y0.l
        @NonNull
        final androidx.core.graphics.d i() {
            if (this.f42379m == null) {
                WindowInsets windowInsets = this.f42374c;
                this.f42379m = androidx.core.graphics.d.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f42379m;
        }

        @Override // androidx.core.view.C5353y0.l
        boolean n() {
            return this.f42374c.isConsumed();
        }

        @Override // androidx.core.view.C5353y0.l
        public void s(androidx.core.graphics.d dVar) {
            this.f42379m = dVar;
        }
    }

    /* renamed from: androidx.core.view.y0$i */
    private static class i extends h {
        i(@NonNull C5353y0 c5353y0, @NonNull WindowInsets windowInsets) {
            super(c5353y0, windowInsets);
        }

        @Override // androidx.core.view.C5353y0.l
        @NonNull
        C5353y0 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f42374c.consumeDisplayCutout();
            return C5353y0.u(null, consumeDisplayCutout);
        }

        @Override // androidx.core.view.C5353y0.l
        C5331n e() {
            DisplayCutout displayCutout;
            displayCutout = this.f42374c.getDisplayCutout();
            return C5331n.f(displayCutout);
        }

        @Override // androidx.core.view.C5353y0.g, androidx.core.view.C5353y0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f42374c, iVar.f42374c) && Objects.equals(this.f42378g, iVar.f42378g);
        }

        @Override // androidx.core.view.C5353y0.l
        public int hashCode() {
            return this.f42374c.hashCode();
        }
    }

    /* renamed from: androidx.core.view.y0$j */
    private static class j extends i {

        /* renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.d f42380n;

        /* renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.d f42381o;

        /* renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.d f42382p;

        j(@NonNull C5353y0 c5353y0, @NonNull WindowInsets windowInsets) {
            super(c5353y0, windowInsets);
            this.f42380n = null;
            this.f42381o = null;
            this.f42382p = null;
        }

        @Override // androidx.core.view.C5353y0.l
        @NonNull
        androidx.core.graphics.d h() {
            Insets mandatorySystemGestureInsets;
            if (this.f42381o == null) {
                mandatorySystemGestureInsets = this.f42374c.getMandatorySystemGestureInsets();
                this.f42381o = androidx.core.graphics.d.c(mandatorySystemGestureInsets);
            }
            return this.f42381o;
        }

        @Override // androidx.core.view.C5353y0.l
        @NonNull
        androidx.core.graphics.d j() {
            Insets systemGestureInsets;
            if (this.f42380n == null) {
                systemGestureInsets = this.f42374c.getSystemGestureInsets();
                this.f42380n = androidx.core.graphics.d.c(systemGestureInsets);
            }
            return this.f42380n;
        }

        @Override // androidx.core.view.C5353y0.l
        @NonNull
        androidx.core.graphics.d l() {
            Insets tappableElementInsets;
            if (this.f42382p == null) {
                tappableElementInsets = this.f42374c.getTappableElementInsets();
                this.f42382p = androidx.core.graphics.d.c(tappableElementInsets);
            }
            return this.f42382p;
        }

        @Override // androidx.core.view.C5353y0.g, androidx.core.view.C5353y0.l
        @NonNull
        C5353y0 m(int i11, int i12, int i13, int i14) {
            WindowInsets inset;
            inset = this.f42374c.inset(i11, i12, i13, i14);
            return C5353y0.u(null, inset);
        }

        @Override // androidx.core.view.C5353y0.h, androidx.core.view.C5353y0.l
        public void s(androidx.core.graphics.d dVar) {
        }
    }

    /* renamed from: androidx.core.view.y0$k */
    private static class k extends j {

        /* renamed from: q, reason: collision with root package name */
        @NonNull
        static final C5353y0 f42383q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f42383q = C5353y0.u(null, windowInsets);
        }

        k(@NonNull C5353y0 c5353y0, @NonNull WindowInsets windowInsets) {
            super(c5353y0, windowInsets);
        }

        @Override // androidx.core.view.C5353y0.g, androidx.core.view.C5353y0.l
        final void d(@NonNull View view) {
        }

        @Override // androidx.core.view.C5353y0.g, androidx.core.view.C5353y0.l
        @NonNull
        public androidx.core.graphics.d f(int i11) {
            Insets insets;
            insets = this.f42374c.getInsets(n.a(i11));
            return androidx.core.graphics.d.c(insets);
        }

        @Override // androidx.core.view.C5353y0.g, androidx.core.view.C5353y0.l
        @NonNull
        public androidx.core.graphics.d g(int i11) {
            Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.f42374c.getInsetsIgnoringVisibility(n.a(i11));
            return androidx.core.graphics.d.c(insetsIgnoringVisibility);
        }

        @Override // androidx.core.view.C5353y0.g, androidx.core.view.C5353y0.l
        public boolean p(int i11) {
            boolean isVisible;
            isVisible = this.f42374c.isVisible(n.a(i11));
            return isVisible;
        }
    }

    /* renamed from: androidx.core.view.y0$l */
    private static class l {

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        static final C5353y0 f42384b = new b().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        final C5353y0 f42385a;

        l(@NonNull C5353y0 c5353y0) {
            this.f42385a = c5353y0;
        }

        @NonNull
        C5353y0 a() {
            return this.f42385a;
        }

        @NonNull
        C5353y0 b() {
            return this.f42385a;
        }

        @NonNull
        C5353y0 c() {
            return this.f42385a;
        }

        void d(@NonNull View view) {
        }

        C5331n e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && Objects.equals(k(), lVar.k()) && Objects.equals(i(), lVar.i()) && Objects.equals(e(), lVar.e());
        }

        @NonNull
        androidx.core.graphics.d f(int i11) {
            return androidx.core.graphics.d.f42125e;
        }

        @NonNull
        androidx.core.graphics.d g(int i11) {
            if ((i11 & 8) == 0) {
                return androidx.core.graphics.d.f42125e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        @NonNull
        androidx.core.graphics.d h() {
            return k();
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
        }

        @NonNull
        androidx.core.graphics.d i() {
            return androidx.core.graphics.d.f42125e;
        }

        @NonNull
        androidx.core.graphics.d j() {
            return k();
        }

        @NonNull
        androidx.core.graphics.d k() {
            return androidx.core.graphics.d.f42125e;
        }

        @NonNull
        androidx.core.graphics.d l() {
            return k();
        }

        @NonNull
        C5353y0 m(int i11, int i12, int i13, int i14) {
            return f42384b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        boolean p(int i11) {
            return true;
        }

        public void q(androidx.core.graphics.d[] dVarArr) {
        }

        void r(C5353y0 c5353y0) {
        }

        public void s(androidx.core.graphics.d dVar) {
        }
    }

    /* renamed from: androidx.core.view.y0$m */
    public static final class m {
        static int a(int i11) {
            if (i11 == 1) {
                return 0;
            }
            if (i11 == 2) {
                return 1;
            }
            if (i11 == 4) {
                return 2;
            }
            if (i11 == 8) {
                return 3;
            }
            if (i11 == 16) {
                return 4;
            }
            if (i11 == 32) {
                return 5;
            }
            if (i11 == 64) {
                return 6;
            }
            if (i11 == 128) {
                return 7;
            }
            if (i11 == 256) {
                return 8;
            }
            throw new IllegalArgumentException(Ej.b.a(i11, "type needs to be >= FIRST and <= LAST, type="));
        }
    }

    /* renamed from: androidx.core.view.y0$n */
    private static final class n {
        static int a(int i11) {
            int statusBars;
            int i12 = 0;
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i11 & i13) != 0) {
                    if (i13 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i13 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i13 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i13 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i13 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i13 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i13 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i13 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i12 |= statusBars;
                }
            }
            return i12;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f42353b = k.f42383q;
        } else {
            f42353b = l.f42384b;
        }
    }

    private C5353y0(@NonNull WindowInsets windowInsets) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            this.f42354a = new k(this, windowInsets);
            return;
        }
        if (i11 >= 29) {
            this.f42354a = new j(this, windowInsets);
        } else if (i11 >= 28) {
            this.f42354a = new i(this, windowInsets);
        } else {
            this.f42354a = new h(this, windowInsets);
        }
    }

    static androidx.core.graphics.d n(@NonNull androidx.core.graphics.d dVar, int i11, int i12, int i13, int i14) {
        int max = Math.max(0, dVar.f42126a - i11);
        int max2 = Math.max(0, dVar.f42127b - i12);
        int max3 = Math.max(0, dVar.f42128c - i13);
        int max4 = Math.max(0, dVar.f42129d - i14);
        return (max == i11 && max2 == i12 && max3 == i13 && max4 == i14) ? dVar : androidx.core.graphics.d.b(max, max2, max3, max4);
    }

    @NonNull
    public static C5353y0 u(View view, @NonNull WindowInsets windowInsets) {
        windowInsets.getClass();
        C5353y0 c5353y0 = new C5353y0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i11 = Y.f42258g;
            c5353y0.r(Y.e.a(view));
            c5353y0.d(view.getRootView());
        }
        return c5353y0;
    }

    @NonNull
    @Deprecated
    public final C5353y0 a() {
        return this.f42354a.a();
    }

    @NonNull
    @Deprecated
    public final C5353y0 b() {
        return this.f42354a.b();
    }

    @NonNull
    @Deprecated
    public final C5353y0 c() {
        return this.f42354a.c();
    }

    final void d(@NonNull View view) {
        this.f42354a.d(view);
    }

    public final C5331n e() {
        return this.f42354a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5353y0)) {
            return false;
        }
        return Objects.equals(this.f42354a, ((C5353y0) obj).f42354a);
    }

    @NonNull
    public final androidx.core.graphics.d f(int i11) {
        return this.f42354a.f(i11);
    }

    @NonNull
    public final androidx.core.graphics.d g(int i11) {
        return this.f42354a.g(i11);
    }

    @NonNull
    @Deprecated
    public final androidx.core.graphics.d h() {
        return this.f42354a.i();
    }

    public final int hashCode() {
        l lVar = this.f42354a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public final int i() {
        return this.f42354a.k().f42129d;
    }

    @Deprecated
    public final int j() {
        return this.f42354a.k().f42126a;
    }

    @Deprecated
    public final int k() {
        return this.f42354a.k().f42128c;
    }

    @Deprecated
    public final int l() {
        return this.f42354a.k().f42127b;
    }

    @NonNull
    public final C5353y0 m(int i11, int i12, int i13, int i14) {
        return this.f42354a.m(i11, i12, i13, i14);
    }

    public final boolean o() {
        return this.f42354a.n();
    }

    public final boolean p(int i11) {
        return this.f42354a.p(i11);
    }

    final void q(androidx.core.graphics.d[] dVarArr) {
        this.f42354a.q(dVarArr);
    }

    final void r(C5353y0 c5353y0) {
        this.f42354a.r(c5353y0);
    }

    final void s(androidx.core.graphics.d dVar) {
        this.f42354a.s(dVar);
    }

    public final WindowInsets t() {
        l lVar = this.f42354a;
        if (lVar instanceof g) {
            return ((g) lVar).f42374c;
        }
        return null;
    }

    /* renamed from: androidx.core.view.y0$c */
    /* loaded from: classes8.dex */
    private static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private static Field f42360e = null;

        /* renamed from: f, reason: collision with root package name */
        private static boolean f42361f = false;

        /* renamed from: g, reason: collision with root package name */
        private static Constructor<WindowInsets> f42362g = null;

        /* renamed from: h, reason: collision with root package name */
        private static boolean f42363h = false;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsets f42364c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.d f42365d;

        c() {
            this.f42364c = i();
        }

        private static WindowInsets i() {
            if (!f42361f) {
                try {
                    f42360e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e11);
                }
                f42361f = true;
            }
            Field field = f42360e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e12);
                }
            }
            if (!f42363h) {
                try {
                    f42362g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e13);
                }
                f42363h = true;
            }
            Constructor<WindowInsets> constructor = f42362g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e14) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e14);
                }
            }
            return null;
        }

        @Override // androidx.core.view.C5353y0.f
        @NonNull
        C5353y0 b() {
            a();
            C5353y0 u11 = C5353y0.u(null, this.f42364c);
            u11.q(this.f42368b);
            u11.s(this.f42365d);
            return u11;
        }

        @Override // androidx.core.view.C5353y0.f
        void e(androidx.core.graphics.d dVar) {
            this.f42365d = dVar;
        }

        @Override // androidx.core.view.C5353y0.f
        void g(@NonNull androidx.core.graphics.d dVar) {
            WindowInsets windowInsets = this.f42364c;
            if (windowInsets != null) {
                this.f42364c = windowInsets.replaceSystemWindowInsets(dVar.f42126a, dVar.f42127b, dVar.f42128c, dVar.f42129d);
            }
        }

        c(@NonNull C5353y0 c5353y0) {
            super(c5353y0);
            this.f42364c = c5353y0.t();
        }
    }

    /* renamed from: androidx.core.view.y0$d */
    private static class d extends f {

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f42366c;

        d() {
            this.f42366c = C7417b.a();
        }

        @Override // androidx.core.view.C5353y0.f
        @NonNull
        C5353y0 b() {
            WindowInsets build;
            a();
            build = this.f42366c.build();
            C5353y0 u11 = C5353y0.u(null, build);
            u11.q(this.f42368b);
            return u11;
        }

        @Override // androidx.core.view.C5353y0.f
        void d(@NonNull androidx.core.graphics.d dVar) {
            this.f42366c.setMandatorySystemGestureInsets(dVar.d());
        }

        @Override // androidx.core.view.C5353y0.f
        void e(@NonNull androidx.core.graphics.d dVar) {
            this.f42366c.setStableInsets(dVar.d());
        }

        @Override // androidx.core.view.C5353y0.f
        void f(@NonNull androidx.core.graphics.d dVar) {
            this.f42366c.setSystemGestureInsets(dVar.d());
        }

        @Override // androidx.core.view.C5353y0.f
        void g(@NonNull androidx.core.graphics.d dVar) {
            this.f42366c.setSystemWindowInsets(dVar.d());
        }

        @Override // androidx.core.view.C5353y0.f
        void h(@NonNull androidx.core.graphics.d dVar) {
            this.f42366c.setTappableElementInsets(dVar.d());
        }

        d(@NonNull C5353y0 c5353y0) {
            super(c5353y0);
            WindowInsets.Builder a11;
            WindowInsets t2 = c5353y0.t();
            if (t2 != null) {
                a11 = C0.a(t2);
            } else {
                a11 = C7417b.a();
            }
            this.f42366c = a11;
        }
    }

    /* renamed from: androidx.core.view.y0$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final f f42359a;

        public b() {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                this.f42359a = new e();
            } else if (i11 >= 29) {
                this.f42359a = new d();
            } else {
                this.f42359a = new c();
            }
        }

        @NonNull
        public final C5353y0 a() {
            return this.f42359a.b();
        }

        @NonNull
        public final void b(int i11, @NonNull androidx.core.graphics.d dVar) {
            this.f42359a.c(i11, dVar);
        }

        @NonNull
        @Deprecated
        public final void c(@NonNull androidx.core.graphics.d dVar) {
            this.f42359a.e(dVar);
        }

        @NonNull
        @Deprecated
        public final void d(@NonNull androidx.core.graphics.d dVar) {
            this.f42359a.g(dVar);
        }

        public b(@NonNull C5353y0 c5353y0) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                this.f42359a = new e(c5353y0);
            } else if (i11 >= 29) {
                this.f42359a = new d(c5353y0);
            } else {
                this.f42359a = new c(c5353y0);
            }
        }
    }

    public C5353y0() {
        this.f42354a = new l(this);
    }
}

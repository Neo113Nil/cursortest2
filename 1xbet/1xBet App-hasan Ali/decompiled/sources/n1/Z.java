package n1;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import g1.C1968b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public class Z extends h0 {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f18397n = false;

    /* renamed from: o, reason: collision with root package name */
    public static Method f18398o;

    /* renamed from: p, reason: collision with root package name */
    public static Class f18399p;

    /* renamed from: q, reason: collision with root package name */
    public static Field f18400q;

    /* renamed from: r, reason: collision with root package name */
    public static Field f18401r;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f18402c;

    /* renamed from: d, reason: collision with root package name */
    public C1968b[] f18403d;

    /* renamed from: e, reason: collision with root package name */
    public C1968b f18404e;
    public k0 f;

    /* renamed from: g, reason: collision with root package name */
    public C1968b f18405g;

    /* renamed from: h, reason: collision with root package name */
    public int f18406h;
    public C2165f i;

    /* renamed from: j, reason: collision with root package name */
    public int f18407j;

    /* renamed from: k, reason: collision with root package name */
    public int f18408k;

    /* renamed from: l, reason: collision with root package name */
    public Rect[][] f18409l;

    /* renamed from: m, reason: collision with root package name */
    public Rect[][] f18410m;

    public Z(k0 k0Var, WindowInsets windowInsets) {
        super(k0Var);
        this.f18404e = null;
        this.f18409l = new Rect[10][];
        this.f18410m = new Rect[10][];
        this.f18402c = windowInsets;
    }

    private C2165f D(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f18434a.f18442a.t()) {
            return C2165f.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        C2170k C5 = AbstractC2349a.C(display, 0);
        C2170k C6 = AbstractC2349a.C(display, 1);
        C2170k C7 = AbstractC2349a.C(display, 2);
        C2170k C8 = AbstractC2349a.C(display, 3);
        return C2165f.a(point.x, point.y, false, C5 != null ? C5.f18439b : 0, C6 != null ? C6.f18439b : 0, C7 != null ? C7.f18439b : 0, C8 != null ? C8.f18439b : 0);
    }

    private static List<Rect> E(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i & i5) != 0 && (rectArr2 = rectArr[G4.l.E(i5)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] F(C1968b c1968b) {
        ArrayList arrayList = new ArrayList();
        if (c1968b.f17073a != 0) {
            arrayList.add(new Rect(0, 0, c1968b.f17073a, this.f18407j));
        }
        int i = c1968b.f17074b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, this.f18408k, i));
        }
        int i5 = c1968b.f17075c;
        if (i5 != 0) {
            int i6 = this.f18408k;
            arrayList.add(new Rect(i6 - i5, 0, i6, this.f18407j));
        }
        int i7 = c1968b.f17076d;
        if (i7 != 0) {
            int i8 = this.f18407j;
            arrayList.add(new Rect(0, i8 - i7, this.f18408k, i8));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private C1968b G(int i, boolean z3) {
        C1968b c1968b = C1968b.f17072e;
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i & i5) != 0) {
                c1968b = C1968b.a(c1968b, H(i5, z3));
            }
        }
        return c1968b;
    }

    private C1968b I() {
        k0 k0Var = this.f;
        return k0Var != null ? k0Var.f18442a.l() : C1968b.f17072e;
    }

    private C1968b J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f18397n) {
            L();
        }
        Method method = f18398o;
        if (method != null && f18399p != null && f18400q != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f18400q.get(f18401r.get(invoke));
                if (rect != null) {
                    return C1968b.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e3) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
            }
        }
        return null;
    }

    private static void L() {
        try {
            f18398o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f18399p = cls;
            f18400q = cls.getDeclaredField("mVisibleInsets");
            f18401r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f18400q.setAccessible(true);
            f18401r.setAccessible(true);
        } catch (ReflectiveOperationException e3) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
        }
        f18397n = true;
    }

    public static boolean M(int i, int i5) {
        return (i & 6) == (i5 & 6);
    }

    @Override // n1.h0
    public void A(int i) {
        this.f18406h = i;
    }

    @Override // n1.h0
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f18409l = (Rect[][]) rectArr.clone();
    }

    @Override // n1.h0
    public void C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f18410m = (Rect[][]) rectArr.clone();
    }

    public C1968b H(int i, boolean z3) {
        C1968b l5;
        int i5;
        C1968b c1968b = C1968b.f17072e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    C1968b[] c1968bArr = this.f18403d;
                    l5 = c1968bArr != null ? c1968bArr[G4.l.E(8)] : null;
                    if (l5 != null) {
                        return l5;
                    }
                    C1968b n5 = n();
                    C1968b I5 = I();
                    int i6 = n5.f17076d;
                    if (i6 > I5.f17076d) {
                        return C1968b.b(0, 0, 0, i6);
                    }
                    C1968b c1968b2 = this.f18405g;
                    if (c1968b2 != null && !c1968b2.equals(c1968b) && (i5 = this.f18405g.f17076d) > I5.f17076d) {
                        return C1968b.b(0, 0, 0, i5);
                    }
                } else {
                    if (i == 16) {
                        return m();
                    }
                    if (i == 32) {
                        return k();
                    }
                    if (i == 64) {
                        return o();
                    }
                    if (i == 128) {
                        k0 k0Var = this.f;
                        C2163d h3 = k0Var != null ? k0Var.f18442a.h() : h();
                        if (h3 != null) {
                            int i7 = Build.VERSION.SDK_INT;
                            return C1968b.b(i7 >= 28 ? d1.i.h(h3.f18426a) : 0, i7 >= 28 ? d1.i.j(h3.f18426a) : 0, i7 >= 28 ? d1.i.i(h3.f18426a) : 0, i7 >= 28 ? d1.i.g(h3.f18426a) : 0);
                        }
                    }
                }
            } else {
                if (z3) {
                    C1968b I6 = I();
                    C1968b l6 = l();
                    return C1968b.b(Math.max(I6.f17073a, l6.f17073a), 0, Math.max(I6.f17075c, l6.f17075c), Math.max(I6.f17076d, l6.f17076d));
                }
                if ((this.f18406h & 2) == 0) {
                    C1968b n6 = n();
                    k0 k0Var2 = this.f;
                    l5 = k0Var2 != null ? k0Var2.f18442a.l() : null;
                    int i8 = n6.f17076d;
                    if (l5 != null) {
                        i8 = Math.min(i8, l5.f17076d);
                    }
                    return C1968b.b(n6.f17073a, 0, n6.f17075c, i8);
                }
            }
        } else {
            if (z3) {
                return C1968b.b(0, Math.max(I().f17074b, n().f17074b), 0, 0);
            }
            if ((this.f18406h & 4) == 0) {
                return C1968b.b(0, n().f17074b, 0, 0);
            }
        }
        return c1968b;
    }

    public boolean K(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !H(i, false).equals(C1968b.f17072e);
    }

    @Override // n1.h0
    public void d(View view) {
        this.f18408k = view.getWidth();
        this.f18407j = view.getHeight();
        C1968b J = J(view);
        if (J == null) {
            J = C1968b.f17072e;
        }
        x(J);
    }

    @Override // n1.h0
    public void e(k0 k0Var) {
        k0Var.f18442a.y(this.f);
        C1968b c1968b = this.f18405g;
        h0 h0Var = k0Var.f18442a;
        h0Var.x(c1968b);
        h0Var.A(this.f18406h);
        h0Var.v(this.i);
        h0Var.B(this.f18409l);
        h0Var.C(this.f18410m);
    }

    @Override // n1.h0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Z z3 = (Z) obj;
        return Objects.equals(this.f18405g, z3.f18405g) && M(this.f18406h, z3.f18406h);
    }

    @Override // n1.h0
    public List<Rect> f(int i) {
        return E(this.f18409l, i);
    }

    @Override // n1.h0
    public List<Rect> g(int i) {
        return E(this.f18410m, i);
    }

    @Override // n1.h0
    public C1968b i(int i) {
        return G(i, false);
    }

    @Override // n1.h0
    public C1968b j(int i) {
        return G(i, true);
    }

    @Override // n1.h0
    public final C1968b n() {
        if (this.f18404e == null) {
            WindowInsets windowInsets = this.f18402c;
            this.f18404e = C1968b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f18404e;
    }

    @Override // n1.h0
    public void p(View view) {
        this.i = D(view);
    }

    @Override // n1.h0
    public void q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int E5 = G4.l.E(i);
            this.f18409l[E5] = F(i(i));
            if (i != 8) {
                this.f18410m[E5] = F(j(i));
            }
        }
    }

    @Override // n1.h0
    public k0 r(int i, int i5, int i6, int i7) {
        k0 c5 = k0.c(null, this.f18402c);
        int i8 = Build.VERSION.SDK_INT;
        Y x5 = i8 >= 36 ? new X(c5) : i8 >= 35 ? new W(c5) : i8 >= 34 ? new V(c5) : i8 >= 31 ? new U(c5) : i8 >= 30 ? new T(c5) : i8 >= 29 ? new S(c5) : new P(c5);
        x5.h(k0.a(n(), i, i5, i6, i7));
        x5.f(k0.a(l(), i, i5, i6, i7));
        return x5.b();
    }

    @Override // n1.h0
    public boolean t() {
        return this.f18402c.isRound();
    }

    @Override // n1.h0
    public boolean u(int i) {
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i & i5) != 0 && !K(i5)) {
                return false;
            }
        }
        return true;
    }

    @Override // n1.h0
    public void v(C2165f c2165f) {
        this.i = c2165f;
    }

    @Override // n1.h0
    public void w(C1968b[] c1968bArr) {
        this.f18403d = c1968bArr;
    }

    @Override // n1.h0
    public void x(C1968b c1968b) {
        this.f18405g = c1968b;
    }

    @Override // n1.h0
    public void y(k0 k0Var) {
        this.f = k0Var;
    }

    public Z(k0 k0Var, Z z3) {
        this(k0Var, new WindowInsets(z3.f18402c));
    }
}

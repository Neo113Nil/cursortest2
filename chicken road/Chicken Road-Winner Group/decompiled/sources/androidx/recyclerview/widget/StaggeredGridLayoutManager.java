package androidx.recyclerview.widget;

import D.z;
import P0.j;
import Q.b;
import U.A;
import U.C0073m;
import U.D;
import U.I;
import U.K;
import U.L;
import U.M;
import U.u;
import U.v;
import a.AbstractC0086a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.util.BitSet;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends u {

    /* renamed from: h, reason: collision with root package name */
    public final int f2426h;

    /* renamed from: i, reason: collision with root package name */
    public final M[] f2427i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2428j;

    /* renamed from: k, reason: collision with root package name */
    public final b f2429k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2430l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f2431m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2432n = false;

    /* renamed from: o, reason: collision with root package name */
    public final K f2433o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2434p;

    /* renamed from: q, reason: collision with root package name */
    public L f2435q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2436r;

    /* renamed from: s, reason: collision with root package name */
    public final A.b f2437s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f2426h = -1;
        this.f2431m = false;
        K k3 = new K();
        this.f2433o = k3;
        this.f2434p = 2;
        new Rect();
        new j(28, this);
        this.f2436r = true;
        this.f2437s = new A.b(10, this);
        C0073m w3 = u.w(context, attributeSet, i3, i4);
        int i5 = w3.f1573b;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i5 != this.f2430l) {
            this.f2430l = i5;
            b bVar = this.f2428j;
            this.f2428j = this.f2429k;
            this.f2429k = bVar;
            H();
        }
        int i6 = w3.f1574c;
        a(null);
        if (i6 != this.f2426h) {
            k3.f1500a = null;
            H();
            this.f2426h = i6;
            new BitSet(this.f2426h);
            this.f2427i = new M[this.f2426h];
            for (int i7 = 0; i7 < this.f2426h; i7++) {
                this.f2427i[i7] = new M(this, i7);
            }
            H();
        }
        boolean z3 = w3.f1575d;
        a(null);
        L l3 = this.f2435q;
        if (l3 != null && l3.f1507h != z3) {
            l3.f1507h = z3;
        }
        this.f2431m = z3;
        H();
        this.f2428j = b.a(this, this.f2430l);
        this.f2429k = b.a(this, 1 - this.f2430l);
    }

    @Override // U.u
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View O2 = O(false);
            View N2 = N(false);
            if (O2 == null || N2 == null) {
                return;
            }
            ((v) O2.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // U.u
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof L) {
            this.f2435q = (L) parcelable;
            H();
        }
    }

    @Override // U.u
    public final Parcelable C() {
        L l3 = this.f2435q;
        if (l3 != null) {
            L l4 = new L();
            l4.f1503c = l3.f1503c;
            l4.f1501a = l3.f1501a;
            l4.f1502b = l3.f1502b;
            l4.f1504d = l3.f1504d;
            l4.f1505e = l3.f1505e;
            l4.f = l3.f;
            l4.f1507h = l3.f1507h;
            l4.f1508i = l3.f1508i;
            l4.f1509j = l3.f1509j;
            l4.f1506g = l3.f1506g;
            return l4;
        }
        L l5 = new L();
        l5.f1507h = this.f2431m;
        l5.f1508i = false;
        l5.f1509j = false;
        l5.f1505e = 0;
        if (p() <= 0) {
            l5.f1501a = -1;
            l5.f1502b = -1;
            l5.f1503c = 0;
            return l5;
        }
        P();
        l5.f1501a = 0;
        View N2 = this.f2432n ? N(true) : O(true);
        if (N2 != null) {
            ((v) N2.getLayoutParams()).getClass();
            throw null;
        }
        l5.f1502b = -1;
        int i3 = this.f2426h;
        l5.f1503c = i3;
        l5.f1504d = new int[i3];
        for (int i4 = 0; i4 < this.f2426h; i4++) {
            M m3 = this.f2427i[i4];
            int i5 = m3.f1511b;
            if (i5 == Integer.MIN_VALUE) {
                if (m3.f1510a.size() == 0) {
                    i5 = Integer.MIN_VALUE;
                } else {
                    View view = (View) m3.f1510a.get(0);
                    I i6 = (I) view.getLayoutParams();
                    m3.f1511b = m3.f1514e.f2428j.c(view);
                    i6.getClass();
                    i5 = m3.f1511b;
                }
            }
            if (i5 != Integer.MIN_VALUE) {
                i5 -= this.f2428j.e();
            }
            l5.f1504d[i4] = i5;
        }
        return l5;
    }

    @Override // U.u
    public final void D(int i3) {
        if (i3 == 0) {
            J();
        }
    }

    public final boolean J() {
        int i3 = this.f2426h;
        boolean z3 = this.f2432n;
        if (p() == 0 || this.f2434p == 0 || !this.f1589e) {
            return false;
        }
        if (z3) {
            Q();
            P();
        } else {
            P();
            Q();
        }
        int p3 = p();
        int i4 = p3 - 1;
        new BitSet(i3).set(0, i3, true);
        if (this.f2430l == 1) {
            RecyclerView recyclerView = this.f1586b;
            Field field = z.f259a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z3) {
            p3 = -1;
        } else {
            i4 = 0;
        }
        if (i4 == p3) {
            return false;
        }
        ((I) o(i4).getLayoutParams()).getClass();
        throw null;
    }

    public final int K(D d3) {
        if (p() == 0) {
            return 0;
        }
        b bVar = this.f2428j;
        boolean z3 = !this.f2436r;
        return AbstractC0086a.i(d3, bVar, O(z3), N(z3), this, this.f2436r);
    }

    public final void L(D d3) {
        if (p() == 0) {
            return;
        }
        boolean z3 = !this.f2436r;
        View O2 = O(z3);
        View N2 = N(z3);
        if (p() == 0 || d3.a() == 0 || O2 == null || N2 == null) {
            return;
        }
        ((v) O2.getLayoutParams()).getClass();
        throw null;
    }

    public final int M(D d3) {
        if (p() == 0) {
            return 0;
        }
        b bVar = this.f2428j;
        boolean z3 = !this.f2436r;
        return AbstractC0086a.j(d3, bVar, O(z3), N(z3), this, this.f2436r);
    }

    public final View N(boolean z3) {
        int e3 = this.f2428j.e();
        int d3 = this.f2428j.d();
        View view = null;
        for (int p3 = p() - 1; p3 >= 0; p3--) {
            View o3 = o(p3);
            int c3 = this.f2428j.c(o3);
            int b3 = this.f2428j.b(o3);
            if (b3 > e3 && c3 < d3) {
                if (b3 <= d3 || !z3) {
                    return o3;
                }
                if (view == null) {
                    view = o3;
                }
            }
        }
        return view;
    }

    public final View O(boolean z3) {
        int e3 = this.f2428j.e();
        int d3 = this.f2428j.d();
        int p3 = p();
        View view = null;
        for (int i3 = 0; i3 < p3; i3++) {
            View o3 = o(i3);
            int c3 = this.f2428j.c(o3);
            if (this.f2428j.b(o3) > e3 && c3 < d3) {
                if (c3 >= e3 || !z3) {
                    return o3;
                }
                if (view == null) {
                    view = o3;
                }
            }
        }
        return view;
    }

    public final void P() {
        if (p() == 0) {
            return;
        }
        u.v(o(0));
        throw null;
    }

    public final void Q() {
        int p3 = p();
        if (p3 == 0) {
            return;
        }
        u.v(o(p3 - 1));
        throw null;
    }

    @Override // U.u
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f2435q != null || (recyclerView = this.f1586b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // U.u
    public final boolean b() {
        return this.f2430l == 0;
    }

    @Override // U.u
    public final boolean c() {
        return this.f2430l == 1;
    }

    @Override // U.u
    public final boolean d(v vVar) {
        return vVar instanceof I;
    }

    @Override // U.u
    public final int f(D d3) {
        return K(d3);
    }

    @Override // U.u
    public final void g(D d3) {
        L(d3);
    }

    @Override // U.u
    public final int h(D d3) {
        return M(d3);
    }

    @Override // U.u
    public final int i(D d3) {
        return K(d3);
    }

    @Override // U.u
    public final void j(D d3) {
        L(d3);
    }

    @Override // U.u
    public final int k(D d3) {
        return M(d3);
    }

    @Override // U.u
    public final v l() {
        return this.f2430l == 0 ? new I(-2, -1) : new I(-1, -2);
    }

    @Override // U.u
    public final v m(Context context, AttributeSet attributeSet) {
        return new I(context, attributeSet);
    }

    @Override // U.u
    public final v n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new I((ViewGroup.MarginLayoutParams) layoutParams) : new I(layoutParams);
    }

    @Override // U.u
    public final int q(A a3, D d3) {
        if (this.f2430l == 1) {
            return this.f2426h;
        }
        super.q(a3, d3);
        return 1;
    }

    @Override // U.u
    public final int x(A a3, D d3) {
        if (this.f2430l == 0) {
            return this.f2426h;
        }
        super.x(a3, d3);
        return 1;
    }

    @Override // U.u
    public final boolean y() {
        return this.f2434p != 0;
    }

    @Override // U.u
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1586b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2437s);
        }
        for (int i3 = 0; i3 < this.f2426h; i3++) {
            M m3 = this.f2427i[i3];
            m3.f1510a.clear();
            m3.f1511b = Integer.MIN_VALUE;
            m3.f1512c = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}

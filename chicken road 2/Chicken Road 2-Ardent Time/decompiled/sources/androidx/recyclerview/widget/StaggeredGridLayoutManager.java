package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends P.v {

    /* renamed from: h, reason: collision with root package name */
    public final int f2497h;

    /* renamed from: i, reason: collision with root package name */
    public final P.M[] f2498i;

    /* renamed from: j, reason: collision with root package name */
    public final L.b f2499j;

    /* renamed from: k, reason: collision with root package name */
    public final L.b f2500k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2501l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f2502m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2503n = false;

    /* renamed from: o, reason: collision with root package name */
    public final I1.l f2504o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2505p;

    /* renamed from: q, reason: collision with root package name */
    public P.L f2506q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2507r;

    /* renamed from: s, reason: collision with root package name */
    public final C.b f2508s;

    public StaggeredGridLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i2, int i3) {
        this.f2497h = -1;
        this.f2502m = false;
        I1.l lVar = new I1.l();
        this.f2504o = lVar;
        this.f2505p = 2;
        new android.graphics.Rect();
        new m0.j(16, this);
        this.f2507r = true;
        this.f2508s = new C.b(6, this);
        P.C0040m w2 = P.v.w(context, attributeSet, i2, i3);
        int i4 = w2.f1288b;
        if (i4 != 0 && i4 != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i4 != this.f2501l) {
            this.f2501l = i4;
            L.b bVar = this.f2499j;
            this.f2499j = this.f2500k;
            this.f2500k = bVar;
            H();
        }
        int i5 = w2.f1289c;
        a(null);
        if (i5 != this.f2497h) {
            lVar.f750a = null;
            H();
            this.f2497h = i5;
            new java.util.BitSet(this.f2497h);
            this.f2498i = new P.M[this.f2497h];
            for (int i6 = 0; i6 < this.f2497h; i6++) {
                this.f2498i[i6] = new P.M(this, i6);
            }
            H();
        }
        boolean z2 = w2.f1290d;
        a(null);
        P.L l2 = this.f2506q;
        if (l2 != null && l2.f1218h != z2) {
            l2.f1218h = z2;
        }
        this.f2502m = z2;
        H();
        P.C0039l c0039l = new P.C0039l(0);
        c0039l.f1285b = 0;
        c0039l.f1286c = 0;
        this.f2499j = L.b.a(this, this.f2501l);
        this.f2500k = L.b.a(this, 1 - this.f2501l);
    }

    @Override // P.v
    public final void A(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            android.view.View O2 = O(false);
            android.view.View N2 = N(false);
            if (O2 == null || N2 == null) {
                return;
            }
            ((P.w) O2.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // P.v
    public final void B(android.os.Parcelable parcelable) {
        if (parcelable instanceof P.L) {
            this.f2506q = (P.L) parcelable;
            H();
        }
    }

    @Override // P.v
    public final android.os.Parcelable C() {
        P.L l2 = this.f2506q;
        if (l2 != null) {
            P.L l3 = new P.L();
            l3.f1213c = l2.f1213c;
            l3.f1211a = l2.f1211a;
            l3.f1212b = l2.f1212b;
            l3.f1214d = l2.f1214d;
            l3.f1215e = l2.f1215e;
            l3.f1216f = l2.f1216f;
            l3.f1218h = l2.f1218h;
            l3.f1219i = l2.f1219i;
            l3.f1220j = l2.f1220j;
            l3.f1217g = l2.f1217g;
            return l3;
        }
        P.L l4 = new P.L();
        l4.f1218h = this.f2502m;
        l4.f1219i = false;
        l4.f1220j = false;
        l4.f1215e = 0;
        if (p() > 0) {
            P();
            l4.f1211a = 0;
            android.view.View N2 = this.f2503n ? N(true) : O(true);
            if (N2 != null) {
                ((P.w) N2.getLayoutParams()).getClass();
                throw null;
            }
            l4.f1212b = -1;
            int i2 = this.f2497h;
            l4.f1213c = i2;
            l4.f1214d = new int[i2];
            for (int i3 = 0; i3 < this.f2497h; i3++) {
                P.M m2 = this.f2498i[i3];
                int i4 = m2.f1222b;
                if (i4 == Integer.MIN_VALUE) {
                    if (m2.f1221a.size() == 0) {
                        i4 = Integer.MIN_VALUE;
                    } else {
                        android.view.View view = (android.view.View) m2.f1221a.get(0);
                        P.J j2 = (P.J) view.getLayoutParams();
                        m2.f1222b = m2.f1225e.f2499j.c(view);
                        j2.getClass();
                        i4 = m2.f1222b;
                    }
                }
                if (i4 != Integer.MIN_VALUE) {
                    i4 -= this.f2499j.e();
                }
                l4.f1214d[i3] = i4;
            }
        } else {
            l4.f1211a = -1;
            l4.f1212b = -1;
            l4.f1213c = 0;
        }
        return l4;
    }

    @Override // P.v
    public final void D(int i2) {
        if (i2 == 0) {
            J();
        }
    }

    public final boolean J() {
        int i2 = this.f2497h;
        boolean z2 = this.f2503n;
        if (p() == 0 || this.f2505p == 0 || !this.f1306e) {
            return false;
        }
        if (z2) {
            Q();
            P();
        } else {
            P();
            Q();
        }
        int p2 = p();
        int i3 = p2 - 1;
        new java.util.BitSet(i2).set(0, i2, true);
        if (this.f2501l == 1) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f1303b;
            java.lang.reflect.Field field = y.x.f8478a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z2) {
            p2 = -1;
        } else {
            i3 = 0;
        }
        if (i3 == p2) {
            return false;
        }
        ((P.J) o(i3).getLayoutParams()).getClass();
        throw null;
    }

    public final int K(P.E e2) {
        if (p() == 0) {
            return 0;
        }
        L.b bVar = this.f2499j;
        boolean z2 = !this.f2507r;
        return u0.AbstractC0995a.d(e2, bVar, O(z2), N(z2), this, this.f2507r);
    }

    public final void L(P.E e2) {
        if (p() == 0) {
            return;
        }
        boolean z2 = !this.f2507r;
        android.view.View O2 = O(z2);
        android.view.View N2 = N(z2);
        if (p() == 0 || e2.a() == 0 || O2 == null || N2 == null) {
            return;
        }
        ((P.w) O2.getLayoutParams()).getClass();
        throw null;
    }

    public final int M(P.E e2) {
        if (p() == 0) {
            return 0;
        }
        L.b bVar = this.f2499j;
        boolean z2 = !this.f2507r;
        return u0.AbstractC0995a.e(e2, bVar, O(z2), N(z2), this, this.f2507r);
    }

    public final android.view.View N(boolean z2) {
        int e2 = this.f2499j.e();
        int d2 = this.f2499j.d();
        android.view.View view = null;
        for (int p2 = p() - 1; p2 >= 0; p2--) {
            android.view.View o2 = o(p2);
            int c2 = this.f2499j.c(o2);
            int b2 = this.f2499j.b(o2);
            if (b2 > e2 && c2 < d2) {
                if (b2 <= d2 || !z2) {
                    return o2;
                }
                if (view == null) {
                    view = o2;
                }
            }
        }
        return view;
    }

    public final android.view.View O(boolean z2) {
        int e2 = this.f2499j.e();
        int d2 = this.f2499j.d();
        int p2 = p();
        android.view.View view = null;
        for (int i2 = 0; i2 < p2; i2++) {
            android.view.View o2 = o(i2);
            int c2 = this.f2499j.c(o2);
            if (this.f2499j.b(o2) > e2 && c2 < d2) {
                if (c2 >= e2 || !z2) {
                    return o2;
                }
                if (view == null) {
                    view = o2;
                }
            }
        }
        return view;
    }

    public final void P() {
        if (p() == 0) {
            return;
        }
        P.v.v(o(0));
        throw null;
    }

    public final void Q() {
        int p2 = p();
        if (p2 == 0) {
            return;
        }
        P.v.v(o(p2 - 1));
        throw null;
    }

    @Override // P.v
    public final void a(java.lang.String str) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        if (this.f2506q != null || (recyclerView = this.f1303b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // P.v
    public final boolean b() {
        return this.f2501l == 0;
    }

    @Override // P.v
    public final boolean c() {
        return this.f2501l == 1;
    }

    @Override // P.v
    public final boolean d(P.w wVar) {
        return wVar instanceof P.J;
    }

    @Override // P.v
    public final int f(P.E e2) {
        return K(e2);
    }

    @Override // P.v
    public final void g(P.E e2) {
        L(e2);
    }

    @Override // P.v
    public final int h(P.E e2) {
        return M(e2);
    }

    @Override // P.v
    public final int i(P.E e2) {
        return K(e2);
    }

    @Override // P.v
    public final void j(P.E e2) {
        L(e2);
    }

    @Override // P.v
    public final int k(P.E e2) {
        return M(e2);
    }

    @Override // P.v
    public final P.w l() {
        return this.f2501l == 0 ? new P.J(-2, -1) : new P.J(-1, -2);
    }

    @Override // P.v
    public final P.w m(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new P.J(context, attributeSet);
    }

    @Override // P.v
    public final P.w n(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new P.J((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new P.J(layoutParams);
    }

    @Override // P.v
    public final int q(P.B b2, P.E e2) {
        if (this.f2501l == 1) {
            return this.f2497h;
        }
        super.q(b2, e2);
        return 1;
    }

    @Override // P.v
    public final int x(P.B b2, P.E e2) {
        if (this.f2501l == 0) {
            return this.f2497h;
        }
        super.x(b2, e2);
        return 1;
    }

    @Override // P.v
    public final boolean y() {
        return this.f2505p != 0;
    }

    @Override // P.v
    public final void z(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f1303b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2508s);
        }
        for (int i2 = 0; i2 < this.f2497h; i2++) {
            P.M m2 = this.f2498i[i2];
            m2.f1221a.clear();
            m2.f1222b = Integer.MIN_VALUE;
            m2.f1223c = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}

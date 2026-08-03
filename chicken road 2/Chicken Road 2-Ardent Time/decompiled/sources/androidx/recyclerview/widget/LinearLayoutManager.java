package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class LinearLayoutManager extends P.v {

    /* renamed from: h, reason: collision with root package name */
    public final int f2434h;

    /* renamed from: i, reason: collision with root package name */
    public m0.j f2435i;

    /* renamed from: j, reason: collision with root package name */
    public final L.b f2436j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2437k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2438l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2439m = false;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2440n = true;

    /* renamed from: o, reason: collision with root package name */
    public P.C0041n f2441o = null;

    public LinearLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i2, int i3) {
        this.f2434h = 1;
        this.f2437k = false;
        P.C0040m c0040m = new P.C0040m(0);
        c0040m.f1288b = -1;
        c0040m.f1289c = Integer.MIN_VALUE;
        c0040m.f1290d = false;
        c0040m.f1291e = false;
        P.C0040m w2 = P.v.w(context, attributeSet, i2, i3);
        int i4 = w2.f1288b;
        if (i4 != 0 && i4 != 1) {
            throw new java.lang.IllegalArgumentException(B1.a.f(i4, "invalid orientation:"));
        }
        a(null);
        if (i4 != this.f2434h || this.f2436j == null) {
            this.f2436j = L.b.a(this, i4);
            this.f2434h = i4;
            H();
        }
        boolean z2 = w2.f1290d;
        a(null);
        if (z2 != this.f2437k) {
            this.f2437k = z2;
            H();
        }
        Q(w2.f1291e);
    }

    @Override // P.v
    public final void A(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            android.view.View P2 = P(0, p(), false);
            if (P2 != null) {
                ((P.w) P2.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            android.view.View P3 = P(p() - 1, -1, false);
            if (P3 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((P.w) P3.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // P.v
    public final void B(android.os.Parcelable parcelable) {
        if (parcelable instanceof P.C0041n) {
            this.f2441o = (P.C0041n) parcelable;
            H();
        }
    }

    @Override // P.v
    public final android.os.Parcelable C() {
        P.C0041n c0041n = this.f2441o;
        if (c0041n != null) {
            P.C0041n c0041n2 = new P.C0041n();
            c0041n2.f1292a = c0041n.f1292a;
            c0041n2.f1293b = c0041n.f1293b;
            c0041n2.f1294c = c0041n.f1294c;
            return c0041n2;
        }
        P.C0041n c0041n3 = new P.C0041n();
        if (p() <= 0) {
            c0041n3.f1292a = -1;
            return c0041n3;
        }
        M();
        boolean z2 = this.f2438l;
        c0041n3.f1294c = z2;
        if (!z2) {
            P.v.v(o(z2 ? p() - 1 : 0));
            throw null;
        }
        android.view.View o2 = o(z2 ? 0 : p() - 1);
        c0041n3.f1293b = this.f2436j.d() - this.f2436j.b(o2);
        P.v.v(o2);
        throw null;
    }

    public final int J(P.E e2) {
        if (p() == 0) {
            return 0;
        }
        M();
        L.b bVar = this.f2436j;
        boolean z2 = !this.f2440n;
        return u0.AbstractC0995a.d(e2, bVar, O(z2), N(z2), this, this.f2440n);
    }

    public final void K(P.E e2) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z2 = !this.f2440n;
        android.view.View O2 = O(z2);
        android.view.View N2 = N(z2);
        if (p() == 0 || e2.a() == 0 || O2 == null || N2 == null) {
            return;
        }
        ((P.w) O2.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(P.E e2) {
        if (p() == 0) {
            return 0;
        }
        M();
        L.b bVar = this.f2436j;
        boolean z2 = !this.f2440n;
        return u0.AbstractC0995a.e(e2, bVar, O(z2), N(z2), this, this.f2440n);
    }

    public final void M() {
        if (this.f2435i == null) {
            this.f2435i = new m0.j(12, false);
        }
    }

    public final android.view.View N(boolean z2) {
        return this.f2438l ? P(0, p(), z2) : P(p() - 1, -1, z2);
    }

    public final android.view.View O(boolean z2) {
        return this.f2438l ? P(p() - 1, -1, z2) : P(0, p(), z2);
    }

    public final android.view.View P(int i2, int i3, boolean z2) {
        M();
        int i4 = z2 ? 24579 : 320;
        return this.f2434h == 0 ? this.f1304c.q(i2, i3, i4, 320) : this.f1305d.q(i2, i3, i4, 320);
    }

    public void Q(boolean z2) {
        a(null);
        if (this.f2439m == z2) {
            return;
        }
        this.f2439m = z2;
        H();
    }

    @Override // P.v
    public final void a(java.lang.String str) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        if (this.f2441o != null || (recyclerView = this.f1303b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // P.v
    public final boolean b() {
        return this.f2434h == 0;
    }

    @Override // P.v
    public final boolean c() {
        return this.f2434h == 1;
    }

    @Override // P.v
    public final int f(P.E e2) {
        return J(e2);
    }

    @Override // P.v
    public final void g(P.E e2) {
        K(e2);
    }

    @Override // P.v
    public final int h(P.E e2) {
        return L(e2);
    }

    @Override // P.v
    public final int i(P.E e2) {
        return J(e2);
    }

    @Override // P.v
    public final void j(P.E e2) {
        K(e2);
    }

    @Override // P.v
    public final int k(P.E e2) {
        return L(e2);
    }

    @Override // P.v
    public P.w l() {
        return new P.w(-2, -2);
    }

    @Override // P.v
    public final boolean y() {
        return true;
    }

    @Override // P.v
    public final void z(androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
}

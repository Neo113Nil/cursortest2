package androidx.recyclerview.widget;

import B0.c;
import P0.j;
import Q.b;
import U.C0073m;
import U.C0074n;
import U.D;
import U.u;
import U.v;
import a.AbstractC0086a;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public class LinearLayoutManager extends u {

    /* renamed from: h, reason: collision with root package name */
    public final int f2362h;

    /* renamed from: i, reason: collision with root package name */
    public j f2363i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2364j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2365k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2366l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2367m = false;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2368n = true;

    /* renamed from: o, reason: collision with root package name */
    public C0074n f2369o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f2362h = 1;
        this.f2365k = false;
        C0073m c0073m = new C0073m(0);
        c0073m.f1573b = -1;
        c0073m.f1574c = Integer.MIN_VALUE;
        c0073m.f1575d = false;
        c0073m.f1576e = false;
        C0073m w3 = u.w(context, attributeSet, i3, i4);
        int i5 = w3.f1573b;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException(c.h(i5, "invalid orientation:"));
        }
        a(null);
        if (i5 != this.f2362h || this.f2364j == null) {
            this.f2364j = b.a(this, i5);
            this.f2362h = i5;
            H();
        }
        boolean z3 = w3.f1575d;
        a(null);
        if (z3 != this.f2365k) {
            this.f2365k = z3;
            H();
        }
        Q(w3.f1576e);
    }

    @Override // U.u
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View P2 = P(0, p(), false);
            if (P2 != null) {
                ((v) P2.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View P3 = P(p() - 1, -1, false);
            if (P3 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((v) P3.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // U.u
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0074n) {
            this.f2369o = (C0074n) parcelable;
            H();
        }
    }

    @Override // U.u
    public final Parcelable C() {
        C0074n c0074n = this.f2369o;
        if (c0074n != null) {
            C0074n c0074n2 = new C0074n();
            c0074n2.f1577a = c0074n.f1577a;
            c0074n2.f1578b = c0074n.f1578b;
            c0074n2.f1579c = c0074n.f1579c;
            return c0074n2;
        }
        C0074n c0074n3 = new C0074n();
        if (p() <= 0) {
            c0074n3.f1577a = -1;
            return c0074n3;
        }
        M();
        boolean z3 = this.f2366l;
        c0074n3.f1579c = z3;
        if (!z3) {
            u.v(o(z3 ? p() - 1 : 0));
            throw null;
        }
        View o3 = o(z3 ? 0 : p() - 1);
        c0074n3.f1578b = this.f2364j.d() - this.f2364j.b(o3);
        u.v(o3);
        throw null;
    }

    public final int J(D d3) {
        if (p() == 0) {
            return 0;
        }
        M();
        b bVar = this.f2364j;
        boolean z3 = !this.f2368n;
        return AbstractC0086a.i(d3, bVar, O(z3), N(z3), this, this.f2368n);
    }

    public final void K(D d3) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z3 = !this.f2368n;
        View O2 = O(z3);
        View N2 = N(z3);
        if (p() == 0 || d3.a() == 0 || O2 == null || N2 == null) {
            return;
        }
        ((v) O2.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(D d3) {
        if (p() == 0) {
            return 0;
        }
        M();
        b bVar = this.f2364j;
        boolean z3 = !this.f2368n;
        return AbstractC0086a.j(d3, bVar, O(z3), N(z3), this, this.f2368n);
    }

    public final void M() {
        if (this.f2363i == null) {
            this.f2363i = new j(24);
        }
    }

    public final View N(boolean z3) {
        return this.f2366l ? P(0, p(), z3) : P(p() - 1, -1, z3);
    }

    public final View O(boolean z3) {
        return this.f2366l ? P(p() - 1, -1, z3) : P(0, p(), z3);
    }

    public final View P(int i3, int i4, boolean z3) {
        M();
        int i5 = z3 ? 24579 : 320;
        return this.f2362h == 0 ? this.f1587c.z(i3, i4, i5, 320) : this.f1588d.z(i3, i4, i5, 320);
    }

    public void Q(boolean z3) {
        a(null);
        if (this.f2367m == z3) {
            return;
        }
        this.f2367m = z3;
        H();
    }

    @Override // U.u
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f2369o != null || (recyclerView = this.f1586b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // U.u
    public final boolean b() {
        return this.f2362h == 0;
    }

    @Override // U.u
    public final boolean c() {
        return this.f2362h == 1;
    }

    @Override // U.u
    public final int f(D d3) {
        return J(d3);
    }

    @Override // U.u
    public final void g(D d3) {
        K(d3);
    }

    @Override // U.u
    public final int h(D d3) {
        return L(d3);
    }

    @Override // U.u
    public final int i(D d3) {
        return J(d3);
    }

    @Override // U.u
    public final void j(D d3) {
        K(d3);
    }

    @Override // U.u
    public final int k(D d3) {
        return L(d3);
    }

    @Override // U.u
    public v l() {
        return new v(-2, -2);
    }

    @Override // U.u
    public final boolean y() {
        return true;
    }

    @Override // U.u
    public final void z(RecyclerView recyclerView) {
    }
}

package androidx.recyclerview.widget;

import B.a;
import E.C0042q;
import L3.j;
import T4.l;
import W.B;
import W.C0168m;
import W.G;
import W.I;
import W.J;
import W.o;
import W.t;
import W.u;
import W1.e;
import a.AbstractC0169a;
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
public class StaggeredGridLayoutManager extends t {

    /* renamed from: h, reason: collision with root package name */
    public final int f4684h;

    /* renamed from: i, reason: collision with root package name */
    public final J[] f4685i;

    /* renamed from: j, reason: collision with root package name */
    public final o f4686j;

    /* renamed from: k, reason: collision with root package name */
    public final o f4687k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4688l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f4689m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f4690n = false;

    /* renamed from: o, reason: collision with root package name */
    public final j f4691o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4692p;

    /* renamed from: q, reason: collision with root package name */
    public I f4693q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4694r;

    /* renamed from: s, reason: collision with root package name */
    public final a f4695s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f4684h = -1;
        this.f4689m = false;
        j jVar = new j();
        this.f4691o = jVar;
        this.f4692p = 2;
        new Rect();
        new e(this);
        this.f4694r = true;
        this.f4695s = new a(10, this);
        C0168m w3 = t.w(context, attributeSet, i2, i3);
        int i6 = w3.f3354b;
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i6 != this.f4688l) {
            this.f4688l = i6;
            o oVar = this.f4686j;
            this.f4686j = this.f4687k;
            this.f4687k = oVar;
            H();
        }
        int i7 = w3.f3355c;
        a(null);
        if (i7 != this.f4684h) {
            jVar.f1503a = null;
            H();
            this.f4684h = i7;
            new BitSet(this.f4684h);
            this.f4685i = new J[this.f4684h];
            for (int i8 = 0; i8 < this.f4684h; i8++) {
                this.f4685i[i8] = new J(this, i8);
            }
            H();
        }
        boolean z = w3.f3356d;
        a(null);
        I i9 = this.f4693q;
        if (i9 != null && i9.f3283h != z) {
            i9.f3283h = z;
        }
        this.f4689m = z;
        H();
        C0042q c0042q = new C0042q(2);
        c0042q.f631b = 0;
        c0042q.f632c = 0;
        this.f4686j = o.a(this, this.f4688l);
        this.f4687k = o.a(this, 1 - this.f4688l);
    }

    @Override // W.t
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View O5 = O(false);
            View N = N(false);
            if (O5 == null || N == null) {
                return;
            }
            ((u) O5.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // W.t
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof I) {
            this.f4693q = (I) parcelable;
            H();
        }
    }

    @Override // W.t
    public final Parcelable C() {
        I i2 = this.f4693q;
        if (i2 != null) {
            I i3 = new I();
            i3.f3278c = i2.f3278c;
            i3.f3276a = i2.f3276a;
            i3.f3277b = i2.f3277b;
            i3.f3279d = i2.f3279d;
            i3.f3280e = i2.f3280e;
            i3.f3281f = i2.f3281f;
            i3.f3283h = i2.f3283h;
            i3.f3284i = i2.f3284i;
            i3.f3285j = i2.f3285j;
            i3.f3282g = i2.f3282g;
            return i3;
        }
        I i6 = new I();
        i6.f3283h = this.f4689m;
        i6.f3284i = false;
        i6.f3285j = false;
        i6.f3280e = 0;
        if (p() > 0) {
            P();
            i6.f3276a = 0;
            View N = this.f4690n ? N(true) : O(true);
            if (N != null) {
                ((u) N.getLayoutParams()).getClass();
                throw null;
            }
            i6.f3277b = -1;
            int i7 = this.f4684h;
            i6.f3278c = i7;
            i6.f3279d = new int[i7];
            for (int i8 = 0; i8 < this.f4684h; i8++) {
                J j2 = this.f4685i[i8];
                int i9 = j2.f3287b;
                if (i9 == Integer.MIN_VALUE) {
                    if (j2.f3286a.size() == 0) {
                        i9 = Integer.MIN_VALUE;
                    } else {
                        View view = (View) j2.f3286a.get(0);
                        G g6 = (G) view.getLayoutParams();
                        j2.f3287b = j2.f3290e.f4686j.c(view);
                        g6.getClass();
                        i9 = j2.f3287b;
                    }
                }
                if (i9 != Integer.MIN_VALUE) {
                    i9 -= this.f4686j.e();
                }
                i6.f3279d[i8] = i9;
            }
        } else {
            i6.f3276a = -1;
            i6.f3277b = -1;
            i6.f3278c = 0;
        }
        return i6;
    }

    @Override // W.t
    public final void D(int i2) {
        if (i2 == 0) {
            J();
        }
    }

    public final boolean J() {
        int i2 = this.f4684h;
        boolean z = this.f4690n;
        if (p() == 0 || this.f4692p == 0 || !this.f3371e) {
            return false;
        }
        if (z) {
            Q();
            P();
        } else {
            P();
            Q();
        }
        int p5 = p();
        int i3 = p5 - 1;
        new BitSet(i2).set(0, i2, true);
        if (this.f4688l == 1) {
            RecyclerView recyclerView = this.f3368b;
            Field field = E.G.f566a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z) {
            p5 = -1;
        } else {
            i3 = 0;
        }
        if (i3 == p5) {
            return false;
        }
        ((G) o(i3).getLayoutParams()).getClass();
        throw null;
    }

    public final int K(B b6) {
        if (p() == 0) {
            return 0;
        }
        o oVar = this.f4686j;
        boolean z = !this.f4694r;
        return AbstractC0169a.d(b6, oVar, O(z), N(z), this, this.f4694r);
    }

    public final void L(B b6) {
        if (p() == 0) {
            return;
        }
        boolean z = !this.f4694r;
        View O5 = O(z);
        View N = N(z);
        if (p() == 0 || b6.a() == 0 || O5 == null || N == null) {
            return;
        }
        ((u) O5.getLayoutParams()).getClass();
        throw null;
    }

    public final int M(B b6) {
        if (p() == 0) {
            return 0;
        }
        o oVar = this.f4686j;
        boolean z = !this.f4694r;
        return AbstractC0169a.e(b6, oVar, O(z), N(z), this, this.f4694r);
    }

    public final View N(boolean z) {
        int e3 = this.f4686j.e();
        int d6 = this.f4686j.d();
        View view = null;
        for (int p5 = p() - 1; p5 >= 0; p5--) {
            View o2 = o(p5);
            int c2 = this.f4686j.c(o2);
            int b6 = this.f4686j.b(o2);
            if (b6 > e3 && c2 < d6) {
                if (b6 <= d6 || !z) {
                    return o2;
                }
                if (view == null) {
                    view = o2;
                }
            }
        }
        return view;
    }

    public final View O(boolean z) {
        int e3 = this.f4686j.e();
        int d6 = this.f4686j.d();
        int p5 = p();
        View view = null;
        for (int i2 = 0; i2 < p5; i2++) {
            View o2 = o(i2);
            int c2 = this.f4686j.c(o2);
            if (this.f4686j.b(o2) > e3 && c2 < d6) {
                if (c2 >= e3 || !z) {
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
        t.v(o(0));
        throw null;
    }

    public final void Q() {
        int p5 = p();
        if (p5 == 0) {
            return;
        }
        t.v(o(p5 - 1));
        throw null;
    }

    @Override // W.t
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f4693q != null || (recyclerView = this.f3368b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // W.t
    public final boolean b() {
        return this.f4688l == 0;
    }

    @Override // W.t
    public final boolean c() {
        return this.f4688l == 1;
    }

    @Override // W.t
    public final boolean d(u uVar) {
        return uVar instanceof G;
    }

    @Override // W.t
    public final int f(B b6) {
        return K(b6);
    }

    @Override // W.t
    public final void g(B b6) {
        L(b6);
    }

    @Override // W.t
    public final int h(B b6) {
        return M(b6);
    }

    @Override // W.t
    public final int i(B b6) {
        return K(b6);
    }

    @Override // W.t
    public final void j(B b6) {
        L(b6);
    }

    @Override // W.t
    public final int k(B b6) {
        return M(b6);
    }

    @Override // W.t
    public final u l() {
        return this.f4688l == 0 ? new G(-2, -1) : new G(-1, -2);
    }

    @Override // W.t
    public final u m(Context context, AttributeSet attributeSet) {
        return new G(context, attributeSet);
    }

    @Override // W.t
    public final u n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new G((ViewGroup.MarginLayoutParams) layoutParams) : new G(layoutParams);
    }

    @Override // W.t
    public final int q(l lVar, B b6) {
        if (this.f4688l == 1) {
            return this.f4684h;
        }
        super.q(lVar, b6);
        return 1;
    }

    @Override // W.t
    public final int x(l lVar, B b6) {
        if (this.f4688l == 0) {
            return this.f4684h;
        }
        super.x(lVar, b6);
        return 1;
    }

    @Override // W.t
    public final boolean y() {
        return this.f4692p != 0;
    }

    @Override // W.t
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3368b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f4695s);
        }
        for (int i2 = 0; i2 < this.f4684h; i2++) {
            J j2 = this.f4685i[i2];
            j2.f3286a.clear();
            j2.f3287b = Integer.MIN_VALUE;
            j2.f3288c = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}

package S0;

import Hj0.C3156m;
import S0.InterfaceC3967k;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3944b1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3947c1 f25346a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final int[] f25347b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25348c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object[] f25349d;

    /* renamed from: e, reason: collision with root package name */
    private final int f25350e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25351f;

    /* renamed from: g, reason: collision with root package name */
    private int f25352g;

    /* renamed from: h, reason: collision with root package name */
    private int f25353h;

    /* renamed from: i, reason: collision with root package name */
    private int f25354i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final W f25355j;

    /* renamed from: k, reason: collision with root package name */
    private int f25356k;

    /* renamed from: l, reason: collision with root package name */
    private int f25357l;

    /* renamed from: m, reason: collision with root package name */
    private int f25358m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f25359n;

    public C3944b1(@NotNull C3947c1 c3947c1) {
        this.f25346a = c3947c1;
        this.f25347b = c3947c1.o();
        int q11 = c3947c1.q();
        this.f25348c = q11;
        this.f25349d = c3947c1.r();
        this.f25350e = c3947c1.s();
        this.f25353h = q11;
        this.f25354i = -1;
        this.f25355j = new W();
    }

    public final Object A(int i11, int i12) {
        int[] iArr = this.f25347b;
        int m11 = C3156m.m(iArr, i11);
        int i13 = i11 + 1;
        int i14 = m11 + i12;
        return i14 < (i13 < this.f25348c ? iArr[(i13 * 5) + 4] : this.f25350e) ? this.f25349d[i14] : InterfaceC3967k.a.a();
    }

    public final int B(int i11) {
        return this.f25347b[i11 * 5];
    }

    public final Object C(int i11) {
        int[] iArr = this.f25347b;
        if (C3156m.f(iArr, i11)) {
            return this.f25349d[C3156m.j(iArr, i11)];
        }
        return null;
    }

    public final int D(int i11) {
        return C3156m.d(this.f25347b, i11);
    }

    public final boolean E(int i11) {
        return (this.f25347b[(i11 * 5) + 1] & 134217728) != 0;
    }

    public final boolean F(int i11) {
        return C3156m.f(this.f25347b, i11);
    }

    public final boolean G() {
        return s() || this.f25352g == this.f25353h;
    }

    public final boolean H() {
        return C3156m.g(this.f25347b, this.f25352g);
    }

    public final boolean I(int i11) {
        return C3156m.g(this.f25347b, i11);
    }

    public final Object J() {
        int i11;
        if (this.f25356k > 0 || (i11 = this.f25357l) >= this.f25358m) {
            this.f25359n = false;
            return InterfaceC3967k.a.a();
        }
        this.f25359n = true;
        this.f25357l = i11 + 1;
        return this.f25349d[i11];
    }

    public final Object K(int i11) {
        int[] iArr = this.f25347b;
        if (!C3156m.g(iArr, i11)) {
            return null;
        }
        if (!C3156m.g(iArr, i11)) {
            return InterfaceC3967k.a.a();
        }
        return this.f25349d[iArr[(i11 * 5) + 4]];
    }

    public final int L(int i11) {
        return C3156m.i(this.f25347b, i11);
    }

    public final int M(int i11) {
        return C3156m.k(this.f25347b, i11);
    }

    public final void N(int i11) {
        if (!(this.f25356k == 0)) {
            r.j("Cannot reposition while in an empty region");
            throw null;
        }
        this.f25352g = i11;
        int[] iArr = this.f25347b;
        int i12 = this.f25348c;
        int k11 = i11 < i12 ? C3156m.k(iArr, i11) : -1;
        this.f25354i = k11;
        if (k11 < 0) {
            this.f25353h = i12;
        } else {
            this.f25353h = C3156m.d(iArr, k11) + k11;
        }
        this.f25357l = 0;
        this.f25358m = 0;
    }

    public final void O(int i11) {
        int d11 = C3156m.d(this.f25347b, i11) + i11;
        int i12 = this.f25352g;
        if (i12 >= i11 && i12 <= d11) {
            this.f25354i = i11;
            this.f25353h = d11;
            this.f25357l = 0;
            this.f25358m = 0;
            return;
        }
        r.j("Index " + i11 + " is not a parent of " + i12);
        throw null;
    }

    public final int P() {
        if (!(this.f25356k == 0)) {
            r.j("Cannot skip while in an empty region");
            throw null;
        }
        int i11 = this.f25352g;
        int[] iArr = this.f25347b;
        int i12 = C3156m.g(iArr, i11) ? 1 : C3156m.i(iArr, this.f25352g);
        int i13 = this.f25352g;
        this.f25352g = C3156m.d(iArr, i13) + i13;
        return i12;
    }

    public final void Q() {
        if (!(this.f25356k == 0)) {
            r.j("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
        this.f25352g = this.f25353h;
        this.f25357l = 0;
        this.f25358m = 0;
    }

    public final void R() {
        if (this.f25356k <= 0) {
            int i11 = this.f25354i;
            int i12 = this.f25352g;
            int[] iArr = this.f25347b;
            if (!(C3156m.k(iArr, i12) == i11)) {
                B0.a("Invalid slot table detected");
                throw null;
            }
            int i13 = this.f25357l;
            int i14 = this.f25358m;
            W w11 = this.f25355j;
            if (i13 == 0 && i14 == 0) {
                w11.j(-1);
            } else {
                w11.j(i13);
            }
            this.f25354i = i12;
            this.f25353h = C3156m.d(iArr, i12) + i12;
            int i15 = i12 + 1;
            this.f25352g = i15;
            this.f25357l = C3156m.m(iArr, i12);
            this.f25358m = i12 >= this.f25348c - 1 ? this.f25350e : C3156m.b(iArr, i15);
        }
    }

    public final void S() {
        if (this.f25356k <= 0) {
            if (C3156m.g(this.f25347b, this.f25352g)) {
                R();
            } else {
                B0.a("Expected a node group");
                throw null;
            }
        }
    }

    @NotNull
    public final C3945c a(int i11) {
        int p11;
        ArrayList<C3945c> m11 = this.f25346a.m();
        p11 = C3156m.p(m11, i11, this.f25348c);
        if (p11 >= 0) {
            return m11.get(p11);
        }
        C3945c c3945c = new C3945c(i11);
        m11.add(-(p11 + 1), c3945c);
        return c3945c;
    }

    public final void b() {
        this.f25356k++;
    }

    public final void c() {
        this.f25351f = true;
        this.f25346a.e(this);
    }

    public final boolean d(int i11) {
        return C3156m.a(this.f25347b, i11);
    }

    public final void e() {
        int i11 = this.f25356k;
        if (i11 > 0) {
            this.f25356k = i11 - 1;
        } else {
            B0.a("Unbalanced begin/end empty");
            throw null;
        }
    }

    public final void f() {
        if (this.f25356k == 0) {
            if (!(this.f25352g == this.f25353h)) {
                r.j("endGroup() not called at the end of a group");
                throw null;
            }
            int i11 = this.f25354i;
            int[] iArr = this.f25347b;
            int k11 = C3156m.k(iArr, i11);
            this.f25354i = k11;
            int i12 = this.f25348c;
            this.f25353h = k11 < 0 ? i12 : C3156m.d(iArr, k11) + k11;
            int i13 = this.f25355j.i();
            if (i13 < 0) {
                this.f25357l = 0;
                this.f25358m = 0;
            } else {
                this.f25357l = i13;
                this.f25358m = k11 >= i12 - 1 ? this.f25350e : C3156m.b(iArr, k11 + 1);
            }
        }
    }

    @NotNull
    public final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        if (this.f25356k <= 0) {
            int i11 = this.f25352g;
            while (i11 < this.f25353h) {
                int i12 = i11 * 5;
                int[] iArr = this.f25347b;
                arrayList.add(new C3940a0(C3156m.f(iArr, i11) ? this.f25349d[C3156m.j(iArr, i11)] : null, iArr[i12], i11, C3156m.g(iArr, i11) ? 1 : C3156m.i(iArr, i11)));
                i11 += iArr[i12 + 3];
            }
        }
        return arrayList;
    }

    public final boolean h() {
        return this.f25351f;
    }

    public final int i() {
        return this.f25353h;
    }

    public final int j() {
        return this.f25352g;
    }

    public final Object k() {
        int i11;
        int i12 = this.f25352g;
        int i13 = 0;
        if (i12 >= this.f25353h) {
            return 0;
        }
        int[] iArr = this.f25347b;
        if (!C3156m.e(iArr, i12)) {
            return InterfaceC3967k.a.a();
        }
        int i14 = i12 * 5;
        if (i14 >= iArr.length) {
            i11 = iArr.length;
        } else {
            int i15 = iArr[i14 + 4];
            switch (iArr[i14 + 1] >> 29) {
                case 0:
                    break;
                case 1:
                case 2:
                case 4:
                    i13 = 1;
                    break;
                case 3:
                case 5:
                case 6:
                    i13 = 2;
                    break;
                default:
                    i13 = 3;
                    break;
            }
            i11 = i15 + i13;
        }
        return this.f25349d[i11];
    }

    public final int l() {
        return this.f25353h;
    }

    public final int m() {
        int i11 = this.f25352g;
        if (i11 >= this.f25353h) {
            return 0;
        }
        return this.f25347b[i11 * 5];
    }

    public final Object n() {
        int i11 = this.f25352g;
        if (i11 < this.f25353h) {
            int[] iArr = this.f25347b;
            if (C3156m.f(iArr, i11)) {
                return this.f25349d[C3156m.j(iArr, i11)];
            }
        }
        return null;
    }

    public final int o() {
        return C3156m.d(this.f25347b, this.f25352g);
    }

    public final int p() {
        return this.f25357l - C3156m.m(this.f25347b, this.f25354i);
    }

    public final boolean q() {
        return this.f25359n;
    }

    public final boolean r() {
        int i11 = this.f25352g;
        return i11 < this.f25353h && C3156m.f(this.f25347b, i11);
    }

    public final boolean s() {
        return this.f25356k > 0;
    }

    public final int t() {
        return this.f25354i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f25352g);
        sb2.append(", key=");
        sb2.append(m());
        sb2.append(", parent=");
        sb2.append(this.f25354i);
        sb2.append(", end=");
        return Ek.a.d(sb2, this.f25353h, ')');
    }

    public final int u() {
        int i11 = this.f25354i;
        if (i11 >= 0) {
            return C3156m.i(this.f25347b, i11);
        }
        return 0;
    }

    public final int v() {
        return this.f25358m - this.f25357l;
    }

    public final int w() {
        return this.f25348c;
    }

    @NotNull
    public final C3947c1 x() {
        return this.f25346a;
    }

    public final Object y(int i11) {
        int i12;
        int[] iArr = this.f25347b;
        if (!C3156m.e(iArr, i11)) {
            return InterfaceC3967k.a.a();
        }
        int i13 = i11 * 5;
        if (i13 >= iArr.length) {
            i12 = iArr.length;
        } else {
            int i14 = iArr[i13 + 4];
            int i15 = 1;
            switch (iArr[i13 + 1] >> 29) {
                case 0:
                    i15 = 0;
                    break;
                case 1:
                case 2:
                case 4:
                    break;
                case 3:
                case 5:
                case 6:
                    i15 = 2;
                    break;
                default:
                    i15 = 3;
                    break;
            }
            i12 = i14 + i15;
        }
        return this.f25349d[i12];
    }

    public final Object z(int i11) {
        return A(this.f25352g, i11);
    }
}

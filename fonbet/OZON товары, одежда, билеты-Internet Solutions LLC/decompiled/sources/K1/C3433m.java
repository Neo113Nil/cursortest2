package K1;

import Am.C2438a;
import java.util.ArrayList;
import java.util.List;
import k1.C7459e;
import k1.C7460f;
import kotlin.collections.C7714v;
import l1.AbstractC7799Q;
import l1.C7786D;
import l1.C7790H;
import l1.H0;
import l1.InterfaceC7802U;
import n1.AbstractC8413f;
import org.jetbrains.annotations.NotNull;

/* renamed from: K1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3433m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3434n f15065a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15066b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15067c;

    /* renamed from: d, reason: collision with root package name */
    private final float f15068d;

    /* renamed from: e, reason: collision with root package name */
    private final float f15069e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15070f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayList f15071g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ArrayList f15072h;

    public C3433m(C3434n c3434n, long j11, int i11, boolean z11, int i12) {
        boolean z12;
        int j12;
        this.f15065a = c3434n;
        this.f15066b = i11;
        if (Z1.b.m(j11) != 0 || Z1.b.l(j11) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c3434n.e();
        int size = arrayList2.size();
        int i13 = 0;
        float f7 = 0.0f;
        int i14 = 0;
        while (i14 < size) {
            r rVar = (r) arrayList2.get(i14);
            InterfaceC3438s b11 = rVar.b();
            int k11 = Z1.b.k(j11);
            if (Z1.b.f(j11)) {
                j12 = Z1.b.j(j11) - ((int) Math.ceil(f7));
                if (j12 < 0) {
                    j12 = 0;
                }
            } else {
                j12 = Z1.b.j(j11);
            }
            C3421a c3421a = new C3421a((S1.d) b11, this.f15066b - i13, z11, Z1.c.b(k11, j12, 5));
            float h11 = c3421a.h() + f7;
            int l11 = c3421a.l() + i13;
            arrayList.add(new C3437q(c3421a, rVar.c(), rVar.a(), i13, l11, f7, h11));
            if (c3421a.f() || (l11 == this.f15066b && i14 != C7714v.P(this.f15065a.e()))) {
                z12 = true;
                i13 = l11;
                f7 = h11;
                break;
            } else {
                i14++;
                i13 = l11;
                f7 = h11;
            }
        }
        z12 = false;
        this.f15069e = f7;
        this.f15070f = i13;
        this.f15067c = z12;
        this.f15072h = arrayList;
        this.f15068d = Z1.b.k(j11);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i15 = 0; i15 < size2; i15++) {
            C3437q c3437q = (C3437q) arrayList.get(i15);
            List<C7460f> y11 = ((C3421a) c3437q.e()).y();
            ArrayList arrayList4 = new ArrayList(y11.size());
            int size3 = y11.size();
            for (int i16 = 0; i16 < size3; i16++) {
                C7460f c7460f = y11.get(i16);
                arrayList4.add(c7460f != null ? c3437q.i(c7460f) : null);
            }
            C7714v.p(arrayList4, arrayList3);
        }
        if (arrayList3.size() < this.f15065a.f().size()) {
            int size4 = this.f15065a.f().size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i17 = 0; i17 < size4; i17++) {
                arrayList5.add(null);
            }
            arrayList3 = C7714v.p0(arrayList5, arrayList3);
        }
        this.f15071g = arrayList3;
    }

    public static void D(C3433m c3433m, InterfaceC7802U interfaceC7802U, AbstractC7799Q abstractC7799Q, float f7, H0 h02, V1.i iVar, AbstractC8413f abstractC8413f) {
        c3433m.getClass();
        S1.b.a(c3433m, interfaceC7802U, abstractC7799Q, f7, h02, iVar, abstractC8413f);
    }

    private final void E(int i11) {
        C3434n c3434n = this.f15065a;
        if (i11 < 0 || i11 >= c3434n.d().h().length()) {
            StringBuilder f7 = P4.f.f(i11, "offset(", ") is out of bounds [0, ");
            f7.append(c3434n.d().length());
            f7.append(')');
            throw new IllegalArgumentException(f7.toString().toString());
        }
    }

    private final void F(int i11) {
        C3434n c3434n = this.f15065a;
        if (i11 < 0 || i11 > c3434n.d().h().length()) {
            StringBuilder f7 = P4.f.f(i11, "offset(", ") is out of bounds [0, ");
            f7.append(c3434n.d().length());
            f7.append(']');
            throw new IllegalArgumentException(f7.toString().toString());
        }
    }

    private final void G(int i11) {
        int i12 = this.f15070f;
        if (i11 < 0 || i11 >= i12) {
            throw new IllegalArgumentException(("lineIndex(" + i11 + ") is out of bounds [0, " + i12 + ')').toString());
        }
    }

    public final long A(int i11) {
        F(i11);
        int length = this.f15065a.d().length();
        ArrayList arrayList = this.f15072h;
        C3437q c3437q = (C3437q) arrayList.get(i11 == length ? C7714v.P(arrayList) : C3435o.a(i11, arrayList));
        return c3437q.k(((C3421a) c3437q.e()).B(c3437q.q(i11)), false);
    }

    public final boolean B(int i11) {
        G(i11);
        ArrayList arrayList = this.f15072h;
        return ((C3421a) ((C3437q) arrayList.get(C3435o.b(i11, arrayList))).e()).C(i11);
    }

    public final void C(@NotNull InterfaceC7802U interfaceC7802U, long j11, H0 h02, V1.i iVar, AbstractC8413f abstractC8413f) {
        interfaceC7802U.save();
        ArrayList arrayList = this.f15072h;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3437q c3437q = (C3437q) arrayList.get(i11);
            ((C3421a) c3437q.e()).E(interfaceC7802U, j11, h02, iVar, abstractC8413f);
            interfaceC7802U.f(0.0f, ((C3421a) c3437q.e()).h());
        }
        interfaceC7802U.p();
    }

    @NotNull
    public final void a(long j11, @NotNull float[] fArr) {
        E(Q.h(j11));
        F(Q.g(j11));
        kotlin.jvm.internal.K k11 = new kotlin.jvm.internal.K();
        k11.f71785a = 0;
        C3435o.d(this.f15072h, j11, new C3431k(j11, fArr, k11, new kotlin.jvm.internal.J()));
    }

    @NotNull
    public final V1.g b(int i11) {
        F(i11);
        int length = this.f15065a.d().length();
        ArrayList arrayList = this.f15072h;
        C3437q c3437q = (C3437q) arrayList.get(i11 == length ? C7714v.P(arrayList) : C3435o.a(i11, arrayList));
        return ((C3421a) c3437q.e()).c(c3437q.q(i11));
    }

    @NotNull
    public final C7460f c(int i11) {
        E(i11);
        ArrayList arrayList = this.f15072h;
        C3437q c3437q = (C3437q) arrayList.get(C3435o.a(i11, arrayList));
        return c3437q.i(((C3421a) c3437q.e()).d(c3437q.q(i11)));
    }

    @NotNull
    public final C7460f d(int i11) {
        F(i11);
        int length = this.f15065a.d().length();
        ArrayList arrayList = this.f15072h;
        C3437q c3437q = (C3437q) arrayList.get(i11 == length ? C7714v.P(arrayList) : C3435o.a(i11, arrayList));
        return c3437q.i(((C3421a) c3437q.e()).e(c3437q.q(i11)));
    }

    public final boolean e() {
        return this.f15067c;
    }

    public final float f() {
        ArrayList arrayList = this.f15072h;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        return ((C3421a) ((C3437q) arrayList.get(0)).e()).g();
    }

    public final float g() {
        return this.f15069e;
    }

    public final float h(int i11, boolean z11) {
        F(i11);
        int length = this.f15065a.d().length();
        ArrayList arrayList = this.f15072h;
        C3437q c3437q = (C3437q) arrayList.get(i11 == length ? C7714v.P(arrayList) : C3435o.a(i11, arrayList));
        return ((C3421a) c3437q.e()).i(c3437q.q(i11), z11);
    }

    @NotNull
    public final C3434n i() {
        return this.f15065a;
    }

    public final float j() {
        ArrayList arrayList = this.f15072h;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        C3437q c3437q = (C3437q) C7714v.X(arrayList);
        return c3437q.n(((C3421a) c3437q.e()).j());
    }

    public final float k(int i11) {
        G(i11);
        ArrayList arrayList = this.f15072h;
        C3437q c3437q = (C3437q) arrayList.get(C3435o.b(i11, arrayList));
        return c3437q.n(((C3421a) c3437q.e()).k(c3437q.r(i11)));
    }

    public final int l() {
        return this.f15070f;
    }

    public final int m(int i11, boolean z11) {
        G(i11);
        ArrayList arrayList = this.f15072h;
        C3437q c3437q = (C3437q) arrayList.get(C3435o.b(i11, arrayList));
        return c3437q.l(((C3421a) c3437q.e()).m(c3437q.r(i11), z11));
    }

    public final int n(int i11) {
        int length = this.f15065a.d().length();
        ArrayList arrayList = this.f15072h;
        C3437q c3437q = (C3437q) arrayList.get(i11 >= length ? C7714v.P(arrayList) : i11 < 0 ? 0 : C3435o.a(i11, arrayList));
        return c3437q.m(((C3421a) c3437q.e()).n(c3437q.q(i11)));
    }

    public final int o(float f7) {
        ArrayList arrayList = this.f15072h;
        C3437q c3437q = (C3437q) arrayList.get(C3435o.c(arrayList, f7));
        if (c3437q.d() == 0) {
            return c3437q.g();
        }
        return c3437q.m(((C3421a) c3437q.e()).o(c3437q.s(f7)));
    }

    public final float p(int i11) {
        G(i11);
        ArrayList arrayList = this.f15072h;
        C3437q c3437q = (C3437q) arrayList.get(C3435o.b(i11, arrayList));
        return ((C3421a) c3437q.e()).p(c3437q.r(i11));
    }

    public final float q(int i11) {
        G(i11);
        ArrayList arrayList = this.f15072h;
        C3437q c3437q = (C3437q) arrayList.get(C3435o.b(i11, arrayList));
        return ((C3421a) c3437q.e()).q(c3437q.r(i11));
    }

    public final int r(int i11) {
        G(i11);
        ArrayList arrayList = this.f15072h;
        C3437q c3437q = (C3437q) arrayList.get(C3435o.b(i11, arrayList));
        return c3437q.l(((C3421a) c3437q.e()).r(c3437q.r(i11)));
    }

    public final float s(int i11) {
        G(i11);
        ArrayList arrayList = this.f15072h;
        C3437q c3437q = (C3437q) arrayList.get(C3435o.b(i11, arrayList));
        return c3437q.n(((C3421a) c3437q.e()).s(c3437q.r(i11)));
    }

    public final int t(long j11) {
        ArrayList arrayList = this.f15072h;
        C3437q c3437q = (C3437q) arrayList.get(C3435o.c(arrayList, C7459e.h(j11)));
        if (c3437q.d() == 0) {
            return c3437q.f();
        }
        return c3437q.l(((C3421a) c3437q.e()).v(c3437q.p(j11)));
    }

    @NotNull
    public final V1.g u(int i11) {
        F(i11);
        int length = this.f15065a.d().length();
        ArrayList arrayList = this.f15072h;
        C3437q c3437q = (C3437q) arrayList.get(i11 == length ? C7714v.P(arrayList) : C3435o.a(i11, arrayList));
        return ((C3421a) c3437q.e()).w(c3437q.q(i11));
    }

    @NotNull
    public final ArrayList v() {
        return this.f15072h;
    }

    @NotNull
    public final C7786D w(int i11, int i12) {
        C3434n c3434n = this.f15065a;
        if (i11 < 0 || i11 > i12 || i12 > c3434n.d().h().length()) {
            StringBuilder a11 = C2438a.a("Start(", i11, ") or End(", ") is out of range [0..", i12);
            a11.append(c3434n.d().h().length());
            a11.append("), or start > end!");
            throw new IllegalArgumentException(a11.toString().toString());
        }
        if (i11 == i12) {
            return C7790H.a();
        }
        C7786D a12 = C7790H.a();
        C3435o.d(this.f15072h, S.a(i11, i12), new C3432l(a12, i11, i12));
        return a12;
    }

    @NotNull
    public final List<C7460f> x() {
        return this.f15071g;
    }

    /* JADX WARN: Incorrect condition in loop: B:18:0x0073 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0039 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long y(@NotNull C7460f c7460f, int i11, @NotNull H h11) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        ArrayList arrayList = this.f15072h;
        int c11 = C3435o.c(arrayList, c7460f.q());
        if (((C3437q) arrayList.get(c11)).a() >= c7460f.h() || c11 == C7714v.P(arrayList)) {
            C3437q c3437q = (C3437q) arrayList.get(c11);
            return c3437q.k(((C3421a) c3437q.e()).z(c3437q.o(c7460f), i11, h11), true);
        }
        int c12 = C3435o.c(arrayList, c7460f.h());
        j11 = Q.f15009b;
        while (Q.d(j11, j12) && c11 <= c12) {
            C3437q c3437q2 = (C3437q) arrayList.get(c11);
            j11 = c3437q2.k(((C3421a) c3437q2.e()).z(c3437q2.o(c7460f), i11, h11), true);
            c11++;
        }
        j13 = Q.f15009b;
        if (Q.d(j11, j13)) {
            j17 = Q.f15009b;
            return j17;
        }
        j14 = Q.f15009b;
        while (Q.d(j14, j15) && c11 <= c12) {
            C3437q c3437q3 = (C3437q) arrayList.get(c12);
            j14 = c3437q3.k(((C3421a) c3437q3.e()).z(c3437q3.o(c7460f), i11, h11), true);
            c12--;
        }
        j16 = Q.f15009b;
        return Q.d(j14, j16) ? j11 : S.a((int) (j11 >> 32), (int) (4294967295L & j14));
    }

    public final float z() {
        return this.f15068d;
    }
}

package B0;

import K1.C3422b;
import K1.C3433m;
import K1.C3434n;
import K1.C3442w;
import P1.AbstractC3809p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: B0.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2471f1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3422b f1711a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final K1.T f1712b;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1715e;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Z1.d f1717g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final AbstractC3809p.a f1718h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final List<C3422b.C0288b<C3442w>> f1719i;

    /* renamed from: j, reason: collision with root package name */
    private C3434n f1720j;

    /* renamed from: k, reason: collision with root package name */
    private Z1.s f1721k;

    /* renamed from: c, reason: collision with root package name */
    private final int f1713c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private final int f1714d = 1;

    /* renamed from: f, reason: collision with root package name */
    private final int f1716f = 1;

    public C2471f1(C3422b c3422b, K1.T t2, boolean z11, Z1.d dVar, AbstractC3809p.a aVar, List list) {
        this.f1711a = c3422b;
        this.f1712b = t2;
        this.f1715e = z11;
        this.f1717g = dVar;
        this.f1718h = aVar;
        this.f1719i = list;
    }

    @NotNull
    public final Z1.d a() {
        return this.f1717g;
    }

    @NotNull
    public final AbstractC3809p.a b() {
        return this.f1718h;
    }

    public final int c() {
        C3434n c3434n = this.f1720j;
        if (c3434n != null) {
            return C2474g1.a(c3434n.c());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public final int d() {
        return this.f1713c;
    }

    public final int e() {
        return this.f1714d;
    }

    public final int f() {
        return this.f1716f;
    }

    @NotNull
    public final List<C3422b.C0288b<C3442w>> g() {
        return this.f1719i;
    }

    public final boolean h() {
        return this.f1715e;
    }

    @NotNull
    public final K1.T i() {
        return this.f1712b;
    }

    @NotNull
    public final C3422b j() {
        return this.f1711a;
    }

    @NotNull
    public final K1.K k(long j11, @NotNull Z1.s sVar, K1.K k11) {
        int i11 = this.f1716f;
        boolean z11 = this.f1715e;
        int i12 = this.f1713c;
        if (k11 != null) {
            K1.J k12 = k11.k();
            if (!k11.v().i().a() && Intrinsics.d(k12.j(), this.f1711a) && k12.i().B(this.f1712b) && Intrinsics.d(k12.g(), this.f1719i) && k12.e() == i12 && k12.h() == z11 && k12.f() == i11 && Intrinsics.d(k12.b(), this.f1717g) && k12.d() == sVar && Intrinsics.d(k12.c(), this.f1718h) && Z1.b.m(j11) == Z1.b.m(k12.a()) && ((!z11 && i11 != 2) || (Z1.b.k(j11) == Z1.b.k(k12.a()) && Z1.b.j(j11) == Z1.b.j(k12.a())))) {
                return k11.a(new K1.J(k11.k().j(), this.f1712b, k11.k().g(), k11.k().e(), k11.k().h(), k11.k().f(), k11.k().b(), k11.k().d(), k11.k().c(), j11), Z1.c.e(j11, Z1.r.a(C2474g1.a(k11.v().z()), C2474g1.a(k11.v().g()))));
            }
        }
        l(sVar);
        int m11 = Z1.b.m(j11);
        int k13 = ((z11 || i11 == 2) && Z1.b.g(j11)) ? Z1.b.k(j11) : Integer.MAX_VALUE;
        int i13 = (z11 || i11 != 2) ? i12 : 1;
        if (m11 != k13) {
            k13 = kotlin.ranges.h.e(c(), m11, k13);
        }
        C3434n c3434n = this.f1720j;
        if (c3434n == null) {
            throw new IllegalStateException("layoutIntrinsics must be called first");
        }
        int j12 = Z1.b.j(j11);
        int min = Math.min(0, 262142);
        int min2 = k13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(k13, 262142);
        int c11 = Z1.c.c(min2 == Integer.MAX_VALUE ? min : min2);
        C3433m c3433m = new C3433m(c3434n, Z1.c.a(min, min2, Math.min(c11, 0), j12 != Integer.MAX_VALUE ? Math.min(c11, j12) : Integer.MAX_VALUE), i13, i11 == 2, 0);
        return new K1.K(new K1.J(this.f1711a, this.f1712b, this.f1719i, this.f1713c, this.f1715e, this.f1716f, this.f1717g, sVar, this.f1718h, j11), c3433m, Z1.c.e(j11, Z1.r.a(C2474g1.a(c3433m.z()), C2474g1.a(c3433m.g()))));
    }

    public final void l(@NotNull Z1.s sVar) {
        C3434n c3434n = this.f1720j;
        if (c3434n == null || sVar != this.f1721k || c3434n.a()) {
            this.f1721k = sVar;
            c3434n = new C3434n(this.f1711a, K1.U.b(this.f1712b, sVar), this.f1719i, this.f1717g, this.f1718h);
        }
        this.f1720j = c3434n;
    }
}

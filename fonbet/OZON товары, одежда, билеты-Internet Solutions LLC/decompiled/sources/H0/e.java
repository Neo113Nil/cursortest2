package H0;

import B0.C2474g1;
import H0.c;
import K1.C3422b;
import K1.C3433m;
import K1.C3434n;
import K1.C3442w;
import K1.J;
import K1.K;
import K1.T;
import K1.U;
import P1.AbstractC3809p;
import Z1.r;
import Z1.s;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private C3422b f10369a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private T f10370b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private AbstractC3809p.a f10371c;

    /* renamed from: d, reason: collision with root package name */
    private int f10372d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10373e;

    /* renamed from: f, reason: collision with root package name */
    private int f10374f;

    /* renamed from: g, reason: collision with root package name */
    private int f10375g;

    /* renamed from: h, reason: collision with root package name */
    private List<C3422b.C0288b<C3442w>> f10376h;

    /* renamed from: i, reason: collision with root package name */
    private c f10377i;

    /* renamed from: j, reason: collision with root package name */
    private long f10378j;

    /* renamed from: k, reason: collision with root package name */
    private Z1.d f10379k;

    /* renamed from: l, reason: collision with root package name */
    private C3434n f10380l;

    /* renamed from: m, reason: collision with root package name */
    private s f10381m;

    /* renamed from: n, reason: collision with root package name */
    private K f10382n;

    /* renamed from: o, reason: collision with root package name */
    private int f10383o;

    /* renamed from: p, reason: collision with root package name */
    private int f10384p;

    public e(C3422b c3422b, T t2, AbstractC3809p.a aVar, int i11, boolean z11, int i12, int i13, List list) {
        long j11;
        this.f10369a = c3422b;
        this.f10370b = t2;
        this.f10371c = aVar;
        this.f10372d = i11;
        this.f10373e = z11;
        this.f10374f = i12;
        this.f10375g = i13;
        this.f10376h = list;
        j11 = a.f10357a;
        this.f10378j = j11;
        this.f10383o = -1;
        this.f10384p = -1;
    }

    private final C3433m e(long j11, s sVar) {
        C3434n j12 = j(sVar);
        long a11 = b.a(j11, this.f10373e, this.f10372d, j12.c());
        boolean z11 = this.f10373e;
        int i11 = this.f10372d;
        int i12 = this.f10374f;
        if ((!z11 && i11 == 2) || i12 < 1) {
            i12 = 1;
        }
        return new C3433m(j12, a11, i12, i11 == 2, 0);
    }

    private final C3434n j(s sVar) {
        C3434n c3434n = this.f10380l;
        if (c3434n == null || sVar != this.f10381m || c3434n.a()) {
            this.f10381m = sVar;
            C3422b c3422b = this.f10369a;
            T b11 = U.b(this.f10370b, sVar);
            Z1.d dVar = this.f10379k;
            Intrinsics.f(dVar);
            AbstractC3809p.a aVar = this.f10371c;
            List list = this.f10376h;
            if (list == null) {
                list = kotlin.collections.K.f71697a;
            }
            c3434n = new C3434n(c3422b, b11, list, dVar, aVar);
        }
        this.f10380l = c3434n;
        return c3434n;
    }

    private final K k(s sVar, long j11, C3433m c3433m) {
        float min = Math.min(c3433m.i().c(), c3433m.z());
        C3422b c3422b = this.f10369a;
        T t2 = this.f10370b;
        List list = this.f10376h;
        if (list == null) {
            list = kotlin.collections.K.f71697a;
        }
        int i11 = this.f10374f;
        boolean z11 = this.f10373e;
        int i12 = this.f10372d;
        Z1.d dVar = this.f10379k;
        Intrinsics.f(dVar);
        return new K(new J(c3422b, t2, list, i11, z11, i12, dVar, sVar, this.f10371c, j11), c3433m, Z1.c.e(j11, r.a(C2474g1.a(min), C2474g1.a(c3433m.g()))));
    }

    public final Z1.d a() {
        return this.f10379k;
    }

    public final K b() {
        return this.f10382n;
    }

    @NotNull
    public final K c() {
        K k11 = this.f10382n;
        if (k11 != null) {
            return k11;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int d(int i11, @NotNull s sVar) {
        int i12 = this.f10383o;
        int i13 = this.f10384p;
        if (i11 == i12 && i12 != -1) {
            return i13;
        }
        int a11 = C2474g1.a(e(Z1.c.a(0, i11, 0, Integer.MAX_VALUE), sVar).g());
        this.f10383o = i11;
        this.f10384p = a11;
        return a11;
    }

    public final boolean f(long j11, @NotNull s sVar) {
        if (this.f10375g > 1) {
            c cVar = this.f10377i;
            T t2 = this.f10370b;
            Z1.d dVar = this.f10379k;
            Intrinsics.f(dVar);
            c a11 = c.a.a(cVar, sVar, t2, dVar, this.f10371c);
            this.f10377i = a11;
            j11 = a11.c(this.f10375g, j11);
        }
        K k11 = this.f10382n;
        if (k11 == null || k11.v().i().a() || sVar != k11.k().d() || (!Z1.b.e(j11, k11.k().a()) && (Z1.b.k(j11) != Z1.b.k(k11.k().a()) || Z1.b.j(j11) < k11.v().g() || k11.v().e()))) {
            this.f10382n = k(sVar, j11, e(j11, sVar));
            return true;
        }
        K k12 = this.f10382n;
        Intrinsics.f(k12);
        if (Z1.b.e(j11, k12.k().a())) {
            return false;
        }
        K k13 = this.f10382n;
        Intrinsics.f(k13);
        this.f10382n = k(sVar, j11, k13.v());
        return true;
    }

    public final int g(@NotNull s sVar) {
        return C2474g1.a(j(sVar).c());
    }

    public final int h(@NotNull s sVar) {
        return C2474g1.a(j(sVar).b());
    }

    public final void i(Z1.d dVar) {
        long j11;
        Z1.d dVar2 = this.f10379k;
        if (dVar != null) {
            int i11 = a.f10358b;
            j11 = a.b(dVar.g(), dVar.u1());
        } else {
            j11 = a.f10357a;
        }
        if (dVar2 == null) {
            this.f10379k = dVar;
            this.f10378j = j11;
        } else if (dVar == null || this.f10378j != j11) {
            this.f10379k = dVar;
            this.f10378j = j11;
            this.f10380l = null;
            this.f10382n = null;
            this.f10384p = -1;
            this.f10383o = -1;
        }
    }

    public final void l(@NotNull C3422b c3422b, @NotNull T t2, @NotNull AbstractC3809p.a aVar, int i11, boolean z11, int i12, int i13, List<C3422b.C0288b<C3442w>> list) {
        this.f10369a = c3422b;
        this.f10370b = t2;
        this.f10371c = aVar;
        this.f10372d = i11;
        this.f10373e = z11;
        this.f10374f = i12;
        this.f10375g = i13;
        this.f10376h = list;
        this.f10380l = null;
        this.f10382n = null;
        this.f10384p = -1;
        this.f10383o = -1;
    }
}

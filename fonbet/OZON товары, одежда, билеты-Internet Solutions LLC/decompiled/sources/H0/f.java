package H0;

import B0.C2474g1;
import H0.c;
import K1.C3421a;
import K1.C3422b;
import K1.C3433m;
import K1.C3434n;
import K1.InterfaceC3436p;
import K1.InterfaceC3438s;
import K1.J;
import K1.T;
import K1.U;
import P1.AbstractC3809p;
import Z1.r;
import Z1.s;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private String f10385a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private T f10386b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private AbstractC3809p.a f10387c;

    /* renamed from: d, reason: collision with root package name */
    private int f10388d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10389e;

    /* renamed from: f, reason: collision with root package name */
    private int f10390f;

    /* renamed from: g, reason: collision with root package name */
    private int f10391g;

    /* renamed from: h, reason: collision with root package name */
    private long f10392h;

    /* renamed from: i, reason: collision with root package name */
    private Z1.d f10393i;

    /* renamed from: j, reason: collision with root package name */
    private C3421a f10394j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10395k;

    /* renamed from: l, reason: collision with root package name */
    private long f10396l;

    /* renamed from: m, reason: collision with root package name */
    private c f10397m;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC3438s f10398n;

    /* renamed from: o, reason: collision with root package name */
    private s f10399o;

    /* renamed from: p, reason: collision with root package name */
    private long f10400p;

    /* renamed from: q, reason: collision with root package name */
    private int f10401q;

    /* renamed from: r, reason: collision with root package name */
    private int f10402r;

    public f(String str, T t2, AbstractC3809p.a aVar, int i11, boolean z11, int i12, int i13) {
        long j11;
        this.f10385a = str;
        this.f10386b = t2;
        this.f10387c = aVar;
        this.f10388d = i11;
        this.f10389e = z11;
        this.f10390f = i12;
        this.f10391g = i13;
        j11 = a.f10357a;
        this.f10392h = j11;
        this.f10396l = r.a(0, 0);
        this.f10400p = Z1.c.i(0, 0, 0, 0);
        this.f10401q = -1;
        this.f10402r = -1;
    }

    private final C3421a g(long j11, s sVar) {
        InterfaceC3438s l11 = l(sVar);
        long a11 = b.a(j11, this.f10389e, this.f10388d, l11.c());
        boolean z11 = this.f10389e;
        int i11 = this.f10388d;
        int i12 = this.f10390f;
        return new C3421a((S1.d) l11, ((z11 || i11 != 2) && i12 >= 1) ? i12 : 1, i11 == 2, a11);
    }

    private final InterfaceC3438s l(s sVar) {
        InterfaceC3438s interfaceC3438s = this.f10398n;
        if (interfaceC3438s == null || sVar != this.f10399o || interfaceC3438s.a()) {
            this.f10399o = sVar;
            String str = this.f10385a;
            T b11 = U.b(this.f10386b, sVar);
            Z1.d dVar = this.f10393i;
            Intrinsics.f(dVar);
            AbstractC3809p.a aVar = this.f10387c;
            K k11 = K.f71697a;
            interfaceC3438s = new S1.d(str, b11, k11, k11, aVar, dVar);
        }
        this.f10398n = interfaceC3438s;
        return interfaceC3438s;
    }

    public final Z1.d a() {
        return this.f10393i;
    }

    public final boolean b() {
        return this.f10395k;
    }

    public final long c() {
        return this.f10396l;
    }

    @NotNull
    public final void d() {
        InterfaceC3438s interfaceC3438s = this.f10398n;
        if (interfaceC3438s != null) {
            interfaceC3438s.a();
        }
        Unit unit = Unit.f71690a;
    }

    public final InterfaceC3436p e() {
        return this.f10394j;
    }

    public final int f(int i11, @NotNull s sVar) {
        int i12 = this.f10401q;
        int i13 = this.f10402r;
        if (i11 == i12 && i12 != -1) {
            return i13;
        }
        int a11 = C2474g1.a(g(Z1.c.a(0, i11, 0, Integer.MAX_VALUE), sVar).h());
        this.f10401q = i11;
        this.f10402r = a11;
        return a11;
    }

    public final boolean h(long j11, @NotNull s sVar) {
        InterfaceC3438s interfaceC3438s;
        boolean z11 = true;
        if (this.f10391g > 1) {
            c cVar = this.f10397m;
            T t2 = this.f10386b;
            Z1.d dVar = this.f10393i;
            Intrinsics.f(dVar);
            c a11 = c.a.a(cVar, sVar, t2, dVar, this.f10387c);
            this.f10397m = a11;
            j11 = a11.c(this.f10391g, j11);
        }
        C3421a c3421a = this.f10394j;
        boolean z12 = false;
        if (c3421a == null || (interfaceC3438s = this.f10398n) == null || interfaceC3438s.a() || sVar != this.f10399o || (!Z1.b.e(j11, this.f10400p) && (Z1.b.k(j11) != Z1.b.k(this.f10400p) || Z1.b.j(j11) < c3421a.h() || c3421a.f()))) {
            C3421a g10 = g(j11, sVar);
            this.f10400p = j11;
            this.f10396l = Z1.c.e(j11, r.a(C2474g1.a(g10.A()), C2474g1.a(g10.h())));
            if (this.f10388d != 3 && (((int) (r11 >> 32)) < g10.A() || ((int) (r11 & 4294967295L)) < g10.h())) {
                z12 = true;
            }
            this.f10395k = z12;
            this.f10394j = g10;
            return true;
        }
        if (!Z1.b.e(j11, this.f10400p)) {
            C3421a c3421a2 = this.f10394j;
            Intrinsics.f(c3421a2);
            this.f10396l = Z1.c.e(j11, r.a(C2474g1.a(Math.min(c3421a2.t(), c3421a2.A())), C2474g1.a(c3421a2.h())));
            if (this.f10388d == 3 || (((int) (r7 >> 32)) >= c3421a2.A() && ((int) (4294967295L & r7)) >= c3421a2.h())) {
                z11 = false;
            }
            this.f10395k = z11;
            this.f10400p = j11;
        }
        return false;
    }

    public final int i(@NotNull s sVar) {
        return C2474g1.a(l(sVar).c());
    }

    public final int j(@NotNull s sVar) {
        return C2474g1.a(l(sVar).b());
    }

    public final void k(Z1.d dVar) {
        long j11;
        Z1.d dVar2 = this.f10393i;
        if (dVar != null) {
            int i11 = a.f10358b;
            j11 = a.b(dVar.g(), dVar.u1());
        } else {
            j11 = a.f10357a;
        }
        if (dVar2 == null) {
            this.f10393i = dVar;
            this.f10392h = j11;
            return;
        }
        if (dVar == null || this.f10392h != j11) {
            this.f10393i = dVar;
            this.f10392h = j11;
            this.f10394j = null;
            this.f10398n = null;
            this.f10399o = null;
            this.f10401q = -1;
            this.f10402r = -1;
            this.f10400p = Z1.c.i(0, 0, 0, 0);
            this.f10396l = r.a(0, 0);
            this.f10395k = false;
        }
    }

    public final K1.K m(@NotNull T t2) {
        Z1.d dVar;
        s sVar = this.f10399o;
        if (sVar != null && (dVar = this.f10393i) != null) {
            C3422b c3422b = new C3422b(6, this.f10385a, null);
            if (this.f10394j != null && this.f10398n != null) {
                long c11 = Z1.b.c(0, 0, 0, 0, 10, this.f10400p);
                K k11 = K.f71697a;
                int i11 = this.f10390f;
                boolean z11 = this.f10389e;
                int i12 = this.f10388d;
                AbstractC3809p.a aVar = this.f10387c;
                return new K1.K(new J(c3422b, t2, k11, i11, z11, i12, dVar, sVar, aVar, c11), new C3433m(new C3434n(c3422b, t2, k11, dVar, aVar), c11, this.f10390f, this.f10388d == 2, 0), this.f10396l);
            }
        }
        return null;
    }

    public final void n(@NotNull String str, @NotNull T t2, @NotNull AbstractC3809p.a aVar, int i11, boolean z11, int i12, int i13) {
        this.f10385a = str;
        this.f10386b = t2;
        this.f10387c = aVar;
        this.f10388d = i11;
        this.f10389e = z11;
        this.f10390f = i12;
        this.f10391g = i13;
        this.f10394j = null;
        this.f10398n = null;
        this.f10399o = null;
        this.f10401q = -1;
        this.f10402r = -1;
        this.f10400p = Z1.c.i(0, 0, 0, 0);
        this.f10396l = r.a(0, 0);
        this.f10395k = false;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb2.append(this.f10394j != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        long j11 = this.f10392h;
        int i11 = a.f10358b;
        sb2.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j11 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j11 & 4294967295L)) + ')'));
        sb2.append(')');
        return sb2.toString();
    }
}

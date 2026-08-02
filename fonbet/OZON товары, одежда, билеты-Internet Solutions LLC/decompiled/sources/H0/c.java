package H0;

import K1.C3439t;
import K1.T;
import K1.U;
import P1.AbstractC3809p;
import Z1.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    private static c f10359h;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final s f10360a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final T f10361b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Z1.d f10362c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AbstractC3809p.a f10363d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final T f10364e;

    /* renamed from: f, reason: collision with root package name */
    private float f10365f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    private float f10366g = Float.NaN;

    public static final class a {
        @NotNull
        public static c a(c cVar, @NotNull s sVar, @NotNull T t2, @NotNull Z1.d dVar, @NotNull AbstractC3809p.a aVar) {
            if (cVar != null && sVar == cVar.g() && Intrinsics.d(t2, cVar.f()) && dVar.g() == cVar.d().g() && aVar == cVar.e()) {
                return cVar;
            }
            c cVar2 = c.f10359h;
            if (cVar2 != null && sVar == cVar2.g() && Intrinsics.d(t2, cVar2.f()) && dVar.g() == cVar2.d().g() && aVar == cVar2.e()) {
                return cVar2;
            }
            c cVar3 = new c(sVar, U.b(t2, sVar), Z1.f.a(dVar.g(), dVar.u1()), aVar);
            c.f10359h = cVar3;
            return cVar3;
        }
    }

    public c(s sVar, T t2, Z1.d dVar, AbstractC3809p.a aVar) {
        this.f10360a = sVar;
        this.f10361b = t2;
        this.f10362c = dVar;
        this.f10363d = aVar;
        this.f10364e = U.b(t2, sVar);
    }

    public final long c(int i11, long j11) {
        String str;
        String str2;
        int l11;
        float f7 = this.f10366g;
        float f11 = this.f10365f;
        if (Float.isNaN(f7) || Float.isNaN(f11)) {
            str = d.f10367a;
            long b11 = Z1.c.b(0, 0, 15);
            Z1.d dVar = this.f10362c;
            float h11 = C3439t.a(str, this.f10364e, b11, dVar, this.f10363d, null, 1, 96).h();
            str2 = d.f10368b;
            float h12 = C3439t.a(str2, this.f10364e, Z1.c.b(0, 0, 15), dVar, this.f10363d, null, 2, 96).h() - h11;
            this.f10366g = h11;
            this.f10365f = h12;
            f11 = h12;
            f7 = h11;
        }
        if (i11 != 1) {
            int round = Math.round((f11 * (i11 - 1)) + f7);
            l11 = round >= 0 ? round : 0;
            int j12 = Z1.b.j(j11);
            if (l11 > j12) {
                l11 = j12;
            }
        } else {
            l11 = Z1.b.l(j11);
        }
        return Z1.c.a(Z1.b.m(j11), Z1.b.k(j11), l11, Z1.b.j(j11));
    }

    @NotNull
    public final Z1.d d() {
        return this.f10362c;
    }

    @NotNull
    public final AbstractC3809p.a e() {
        return this.f10363d;
    }

    @NotNull
    public final T f() {
        return this.f10361b;
    }

    @NotNull
    public final s g() {
        return this.f10360a;
    }
}

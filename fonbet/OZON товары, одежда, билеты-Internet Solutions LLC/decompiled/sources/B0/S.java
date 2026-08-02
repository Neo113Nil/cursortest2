package B0;

import B1.C2533b;
import B1.InterfaceC2552v;
import B1.InterfaceC2553w;
import B1.m0;
import D1.AbstractC2810k0;
import c1.AbstractC5715f;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class S implements B1.V {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ O0 f1506a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<K1.K, Unit> f1507b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Q1.K f1508c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Q1.D f1509d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Z1.d f1510e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f1511f;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f1512b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    S(O0 o02, Function1<? super K1.K, Unit> function1, Q1.K k11, Q1.D d11, Z1.d dVar, int i11) {
        this.f1506a = o02;
        this.f1507b = function1;
        this.f1508c = k11;
        this.f1509d = d11;
        this.f1510e = dVar;
        this.f1511f = i11;
    }

    @Override // B1.V
    public final int maxIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        O0 o02 = this.f1506a;
        o02.v().l(((AbstractC2810k0) interfaceC2553w).getLayoutDirection());
        return o02.v().c();
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final B1.W mo2measure3p2s80s(@NotNull B1.Y y11, @NotNull List<? extends B1.U> list, long j11) {
        O0 o02 = this.f1506a;
        AbstractC5715f a11 = AbstractC5715f.a.a();
        Function1<Object, Unit> h11 = a11 != null ? a11.h() : null;
        AbstractC5715f b11 = AbstractC5715f.a.b(a11);
        try {
            R1 j12 = o02.j();
            K1.K e11 = j12 != null ? j12.e() : null;
            K1.K k11 = o02.v().k(j11, y11.getLayoutDirection(), e11);
            Sc.v vVar = new Sc.v(Integer.valueOf((int) (k11.A() >> 32)), Integer.valueOf((int) (k11.A() & 4294967295L)), k11);
            int intValue = ((Number) vVar.a()).intValue();
            int intValue2 = ((Number) vVar.b()).intValue();
            K1.K k12 = (K1.K) vVar.d();
            if (!Intrinsics.d(e11, k12)) {
                o02.F(new R1(j12 != null ? j12.b() : null, k12));
                this.f1507b.invoke(k12);
                C2514u0.i(o02, this.f1508c, this.f1509d);
            }
            o02.G(this.f1510e.B(this.f1511f == 1 ? C2474g1.a(k12.l(0)) : 0));
            return y11.z0(intValue, intValue2, kotlin.collections.U.j(new Pair(C2533b.a(), Integer.valueOf(Math.round(k12.g()))), new Pair(C2533b.b(), Integer.valueOf(Math.round(k12.j())))), a.f1512b);
        } finally {
            AbstractC5715f.a.d(a11, b11, h11);
        }
    }
}

package E0;

import B0.C2474g1;
import B1.AbstractC2531a;
import B1.C2533b;
import B1.m0;
import D1.AbstractC2810k0;
import D1.C2805i;
import D1.InterfaceC2803h;
import D1.InterfaceC2821v;
import P1.AbstractC3809p;
import androidx.compose.ui.e;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class W0 extends e.c implements D1.E, InterfaceC2821v, InterfaceC2803h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Z0 f7120a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7121b;

    /* renamed from: c, reason: collision with root package name */
    private Map<AbstractC2531a, Integer> f7122c;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B1.m0 f7123b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B1.m0 m0Var) {
            super(1);
            this.f7123b = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.d(this.f7123b, 0, 0, 0.0f);
            return Unit.f71690a;
        }
    }

    public W0(@NotNull Z0 z02, @NotNull c1 c1Var, @NotNull K1.T t2, boolean z11, Function2<? super Z1.d, ? super Function0<K1.K>, Unit> function2) {
        this.f7120a = z02;
        this.f7121b = z11;
        z02.o(function2);
        Z0 z03 = this.f7120a;
        boolean z12 = this.f7121b;
        z03.q(c1Var, t2, z12, !z12);
    }

    @Override // D1.E
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        K1.K k11 = this.f7120a.k(y11, y11.getLayoutDirection(), (AbstractC3809p.a) C2805i.a(this, androidx.compose.ui.platform.K0.g()), j11);
        int A11 = (int) (k11.A() >> 32);
        int A12 = (int) (k11.A() >> 32);
        int A13 = (int) (k11.A() & 4294967295L);
        int A14 = (int) (k11.A() & 4294967295L);
        int min = Math.min(A11, 262142);
        int min2 = A12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(A12, 262142);
        int c11 = Z1.c.c(min2 == Integer.MAX_VALUE ? min : min2);
        B1.m0 a02 = u11.a0(Z1.c.a(min, min2, Math.min(c11, A13), A14 != Integer.MAX_VALUE ? Math.min(c11, A14) : Integer.MAX_VALUE));
        this.f7120a.n(this.f7121b ? y11.B(C2474g1.a(k11.l(0))) : 0);
        Map<AbstractC2531a, Integer> map = this.f7122c;
        if (map == null) {
            map = new LinkedHashMap<>(2);
        }
        map.put(C2533b.a(), Integer.valueOf(Math.round(k11.g())));
        map.put(C2533b.b(), Integer.valueOf(Math.round(k11.j())));
        this.f7122c = map;
        int A15 = (int) (k11.A() >> 32);
        int A16 = (int) (k11.A() & 4294967295L);
        Map<AbstractC2531a, Integer> map2 = this.f7122c;
        Intrinsics.f(map2);
        return y11.z0(A15, A16, map2, new a(a02));
    }

    public final void I1(@NotNull Z0 z02, @NotNull c1 c1Var, @NotNull K1.T t2, boolean z11, Function2<? super Z1.d, ? super Function0<K1.K>, Unit> function2) {
        this.f7120a = z02;
        z02.o(function2);
        this.f7121b = z11;
        this.f7120a.q(c1Var, t2, z11, !z11);
    }

    @Override // D1.InterfaceC2821v
    public final void s(@NotNull AbstractC2810k0 abstractC2810k0) {
        this.f7120a.p(abstractC2810k0);
    }
}

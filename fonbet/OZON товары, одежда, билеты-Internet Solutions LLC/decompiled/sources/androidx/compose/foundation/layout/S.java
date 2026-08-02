package androidx.compose.foundation.layout;

import B1.m0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class S extends e.c implements D1.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Function1<? super Z1.d, Z1.m> f39387a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39388b;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B1.Y f39390c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m0 f39391d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B1.Y y11, m0 m0Var) {
            super(1);
            this.f39390c = y11;
            this.f39391d = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            S s11 = S.this;
            long g10 = s11.I1().invoke(this.f39390c).g();
            boolean J12 = s11.J1();
            m0 m0Var = this.f39391d;
            if (J12) {
                m0.a.k(aVar2, m0Var, (int) (g10 >> 32), (int) (g10 & 4294967295L));
            } else {
                m0.a.o(aVar2, m0Var, (int) (g10 >> 32), (int) (g10 & 4294967295L), null, 12);
            }
            return Unit.f71690a;
        }
    }

    public S(@NotNull Function1<? super Z1.d, Z1.m> function1, boolean z11) {
        this.f39387a = function1;
        this.f39388b = z11;
    }

    @Override // D1.E
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        B1.W z02;
        m0 a02 = u11.a0(j11);
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new a(y11, a02));
        return z02;
    }

    @NotNull
    public final Function1<Z1.d, Z1.m> I1() {
        return this.f39387a;
    }

    public final boolean J1() {
        return this.f39388b;
    }

    public final void K1(@NotNull Function1<? super Z1.d, Z1.m> function1) {
        this.f39387a = function1;
    }

    public final void L1(boolean z11) {
        this.f39388b = z11;
    }
}

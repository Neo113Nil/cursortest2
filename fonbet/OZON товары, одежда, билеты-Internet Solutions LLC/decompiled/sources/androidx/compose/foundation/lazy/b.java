package androidx.compose.foundation.lazy;

import B1.U;
import B1.W;
import B1.Y;
import B1.m0;
import D1.E;
import S0.C3987u0;
import Z1.c;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class b extends e.c implements E {

    /* renamed from: a, reason: collision with root package name */
    private float f39575a;

    /* renamed from: b, reason: collision with root package name */
    private C3987u0 f39576b;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f39577b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var) {
            super(1);
            this.f39577b = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.d(this.f39577b, 0, 0, 0.0f);
            return Unit.f71690a;
        }
    }

    public b(float f7, C3987u0 c3987u0) {
        this.f39575a = f7;
        this.f39576b = c3987u0;
    }

    @Override // D1.E
    @NotNull
    public final W D(@NotNull Y y11, @NotNull U u11, long j11) {
        W z02;
        C3987u0 c3987u0 = this.f39576b;
        int round = (c3987u0 == null || c3987u0.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(c3987u0.getValue().floatValue() * this.f39575a);
        int m11 = round != Integer.MAX_VALUE ? round : Z1.b.m(j11);
        int l11 = Z1.b.l(j11);
        if (round == Integer.MAX_VALUE) {
            round = Z1.b.k(j11);
        }
        m0 a02 = u11.a0(c.a(m11, round, l11, Z1.b.j(j11)));
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new a(a02));
        return z02;
    }

    public final void I1(float f7) {
        this.f39575a = f7;
    }

    public final void J1(C3987u0 c3987u0) {
        this.f39576b = c3987u0;
    }
}

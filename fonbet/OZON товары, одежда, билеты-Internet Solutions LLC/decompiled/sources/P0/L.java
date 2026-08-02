package P0;

import B1.m0;
import D1.C2805i;
import D1.InterfaceC2803h;
import androidx.compose.ui.e;
import hd.C6915b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class L extends e.c implements InterfaceC2803h, D1.E {

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20670b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B1.m0 f20671c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f20672d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, int i12, B1.m0 m0Var) {
            super(1);
            this.f20670b = i11;
            this.f20671c = m0Var;
            this.f20672d = i12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.d(this.f20671c, C6915b.c((this.f20670b - r0.u0()) / 2.0f), C6915b.c((this.f20672d - r0.l0()) / 2.0f), 0.0f);
            return Unit.f71690a;
        }
    }

    @Override // D1.E
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        B1.W z02;
        float d11 = ((Z1.h) C2805i.a(this, H.a())).d();
        float f7 = 0;
        if (d11 < f7) {
            d11 = f7;
        }
        B1.m0 a02 = u11.a0(j11);
        boolean z11 = isAttached() && !Float.isNaN(d11) && Float.compare(d11, f7) > 0;
        int Y02 = Float.isNaN(d11) ? 0 : y11.Y0(d11);
        int max = z11 ? Math.max(a02.u0(), Y02) : a02.u0();
        int max2 = z11 ? Math.max(a02.l0(), Y02) : a02.l0();
        z02 = y11.z0(max, max2, kotlin.collections.U.c(), new a(max, max2, a02));
        return z02;
    }
}

package androidx.compose.foundation.layout;

import B1.InterfaceC2552v;
import B1.m0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class c0 extends e.c implements D1.E {

    /* renamed from: a, reason: collision with root package name */
    private float f39472a;

    /* renamed from: b, reason: collision with root package name */
    private float f39473b;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f39474b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var) {
            super(1);
            this.f39474b = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.h(this.f39474b, 0, 0, 0.0f);
            return Unit.f71690a;
        }
    }

    public c0(float f7, float f11) {
        this.f39472a = f7;
        this.f39473b = f11;
    }

    @Override // D1.E
    public final int A(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        int T11 = interfaceC2552v.T(i11);
        int Y02 = !Z1.h.b(this.f39472a, Float.NaN) ? v11.Y0(this.f39472a) : 0;
        return T11 < Y02 ? Y02 : T11;
    }

    @Override // D1.E
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        int m11;
        B1.W z02;
        int i11 = 0;
        if (Z1.h.b(this.f39472a, Float.NaN) || Z1.b.m(j11) != 0) {
            m11 = Z1.b.m(j11);
        } else {
            m11 = y11.Y0(this.f39472a);
            int k11 = Z1.b.k(j11);
            if (m11 > k11) {
                m11 = k11;
            }
            if (m11 < 0) {
                m11 = 0;
            }
        }
        int k12 = Z1.b.k(j11);
        if (Z1.h.b(this.f39473b, Float.NaN) || Z1.b.l(j11) != 0) {
            i11 = Z1.b.l(j11);
        } else {
            int Y02 = y11.Y0(this.f39473b);
            int j12 = Z1.b.j(j11);
            if (Y02 > j12) {
                Y02 = j12;
            }
            if (Y02 >= 0) {
                i11 = Y02;
            }
        }
        m0 a02 = u11.a0(Z1.c.a(m11, k12, i11, Z1.b.j(j11)));
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new a(a02));
        return z02;
    }

    @Override // D1.E
    public final int I(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        int D11 = interfaceC2552v.D(i11);
        int Y02 = !Z1.h.b(this.f39473b, Float.NaN) ? v11.Y0(this.f39473b) : 0;
        return D11 < Y02 ? Y02 : D11;
    }

    public final void I1(float f7) {
        this.f39473b = f7;
    }

    public final void J1(float f7) {
        this.f39472a = f7;
    }

    @Override // D1.E
    public final int K(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        int O11 = interfaceC2552v.O(i11);
        int Y02 = !Z1.h.b(this.f39473b, Float.NaN) ? v11.Y0(this.f39473b) : 0;
        return O11 < Y02 ? Y02 : O11;
    }

    @Override // D1.E
    public final int u(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        int Y11 = interfaceC2552v.Y(i11);
        int Y02 = !Z1.h.b(this.f39472a, Float.NaN) ? v11.Y0(this.f39472a) : 0;
        return Y11 < Y02 ? Y02 : Y11;
    }
}

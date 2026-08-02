package androidx.compose.foundation.layout;

import B1.InterfaceC2552v;
import B1.m0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
abstract class N extends e.c implements D1.E {

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f39361b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var) {
            super(1);
            this.f39361b = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a.j(this.f39361b, aVar);
            return Unit.f71690a;
        }
    }

    @Override // D1.E
    public int A(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return interfaceC2552v.T(i11);
    }

    @Override // D1.E
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        B1.W z02;
        long I12 = I1(u11, j11);
        if (J1()) {
            I12 = Z1.c.f(j11, I12);
        }
        m0 a02 = u11.a0(I12);
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new a(a02));
        return z02;
    }

    public int I(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return interfaceC2552v.D(i11);
    }

    public abstract long I1(@NotNull B1.U u11, long j11);

    public abstract boolean J1();

    public int K(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return interfaceC2552v.O(i11);
    }

    @Override // D1.E
    public int u(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return interfaceC2552v.Y(i11);
    }
}

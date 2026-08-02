package androidx.compose.foundation.layout;

import B1.m0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import u0.EnumC9900i;

/* renamed from: androidx.compose.foundation.layout.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5195s extends e.c implements D1.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private EnumC9900i f39543a;

    /* renamed from: b, reason: collision with root package name */
    private float f39544b;

    /* renamed from: androidx.compose.foundation.layout.s$a */
    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f39545b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var) {
            super(1);
            this.f39545b = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.h(this.f39545b, 0, 0, 0.0f);
            return Unit.f71690a;
        }
    }

    public C5195s(@NotNull EnumC9900i enumC9900i, float f7) {
        this.f39543a = enumC9900i;
        this.f39544b = f7;
    }

    @Override // D1.E
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        int m11;
        int k11;
        int j12;
        int i11;
        B1.W z02;
        if (!Z1.b.g(j11) || this.f39543a == EnumC9900i.Vertical) {
            m11 = Z1.b.m(j11);
            k11 = Z1.b.k(j11);
        } else {
            m11 = kotlin.ranges.h.e(Math.round(Z1.b.k(j11) * this.f39544b), Z1.b.m(j11), Z1.b.k(j11));
            k11 = m11;
        }
        if (!Z1.b.f(j11) || this.f39543a == EnumC9900i.Horizontal) {
            int l11 = Z1.b.l(j11);
            j12 = Z1.b.j(j11);
            i11 = l11;
        } else {
            i11 = kotlin.ranges.h.e(Math.round(Z1.b.j(j11) * this.f39544b), Z1.b.l(j11), Z1.b.j(j11));
            j12 = i11;
        }
        m0 a02 = u11.a0(Z1.c.a(m11, k11, i11, j12));
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new a(a02));
        return z02;
    }

    public final void I1(@NotNull EnumC9900i enumC9900i) {
        this.f39543a = enumC9900i;
    }

    public final void J1(float f7) {
        this.f39544b = f7;
    }
}

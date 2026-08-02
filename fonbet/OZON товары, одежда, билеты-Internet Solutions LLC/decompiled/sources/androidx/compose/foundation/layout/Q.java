package androidx.compose.foundation.layout;

import B1.m0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class Q extends e.c implements D1.E {

    /* renamed from: a, reason: collision with root package name */
    private float f39381a;

    /* renamed from: b, reason: collision with root package name */
    private float f39382b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f39383c;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m0 f39385c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B1.Y f39386d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var, B1.Y y11) {
            super(1);
            this.f39385c = m0Var;
            this.f39386d = y11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            Q q11 = Q.this;
            boolean I12 = q11.I1();
            B1.Y y11 = this.f39386d;
            m0 m0Var = this.f39385c;
            if (I12) {
                aVar2.h(m0Var, y11.Y0(q11.J1()), y11.Y0(q11.K1()), 0.0f);
            } else {
                aVar2.d(m0Var, y11.Y0(q11.J1()), y11.Y0(q11.K1()), 0.0f);
            }
            return Unit.f71690a;
        }
    }

    public Q(float f7, float f11, boolean z11) {
        this.f39381a = f7;
        this.f39382b = f11;
        this.f39383c = z11;
    }

    @Override // D1.E
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        B1.W z02;
        m0 a02 = u11.a0(j11);
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new a(a02, y11));
        return z02;
    }

    public final boolean I1() {
        return this.f39383c;
    }

    public final float J1() {
        return this.f39381a;
    }

    public final float K1() {
        return this.f39382b;
    }

    public final void L1(boolean z11) {
        this.f39383c = z11;
    }

    public final void M1(float f7) {
        this.f39381a = f7;
    }

    public final void N1(float f7) {
        this.f39382b = f7;
    }
}

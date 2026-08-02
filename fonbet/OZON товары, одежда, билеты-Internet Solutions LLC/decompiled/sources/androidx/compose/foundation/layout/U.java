package androidx.compose.foundation.layout;

import B1.m0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class U extends e.c implements D1.E {

    /* renamed from: a, reason: collision with root package name */
    private float f39406a;

    /* renamed from: b, reason: collision with root package name */
    private float f39407b;

    /* renamed from: c, reason: collision with root package name */
    private float f39408c;

    /* renamed from: d, reason: collision with root package name */
    private float f39409d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f39410e;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m0 f39412c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B1.Y f39413d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var, B1.Y y11) {
            super(1);
            this.f39412c = m0Var;
            this.f39413d = y11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            U u11 = U.this;
            boolean I12 = u11.I1();
            B1.Y y11 = this.f39413d;
            m0 m0Var = this.f39412c;
            if (I12) {
                aVar2.h(m0Var, y11.Y0(u11.J1()), y11.Y0(u11.K1()), 0.0f);
            } else {
                aVar2.d(m0Var, y11.Y0(u11.J1()), y11.Y0(u11.K1()), 0.0f);
            }
            return Unit.f71690a;
        }
    }

    public U(float f7, float f11, float f12, float f13, boolean z11) {
        this.f39406a = f7;
        this.f39407b = f11;
        this.f39408c = f12;
        this.f39409d = f13;
        this.f39410e = z11;
    }

    @Override // D1.E
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        B1.W z02;
        int Y02 = y11.Y0(this.f39408c) + y11.Y0(this.f39406a);
        int Y03 = y11.Y0(this.f39409d) + y11.Y0(this.f39407b);
        m0 a02 = u11.a0(Z1.c.k(-Y02, -Y03, j11));
        z02 = y11.z0(Z1.c.h(a02.u0() + Y02, j11), Z1.c.g(a02.l0() + Y03, j11), kotlin.collections.U.c(), new a(a02, y11));
        return z02;
    }

    public final boolean I1() {
        return this.f39410e;
    }

    public final float J1() {
        return this.f39406a;
    }

    public final float K1() {
        return this.f39407b;
    }

    public final void L1(float f7) {
        this.f39409d = f7;
    }

    public final void M1(float f7) {
        this.f39408c = f7;
    }

    public final void N1(boolean z11) {
        this.f39410e = z11;
    }

    public final void O1(float f7) {
        this.f39406a = f7;
    }

    public final void P1(float f7) {
        this.f39407b = f7;
    }
}

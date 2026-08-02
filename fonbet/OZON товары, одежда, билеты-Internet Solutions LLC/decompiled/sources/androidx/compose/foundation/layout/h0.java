package androidx.compose.foundation.layout;

import B1.m0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import u0.EnumC9900i;

/* loaded from: classes.dex */
final class h0 extends e.c implements D1.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private EnumC9900i f39492a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39493b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f39494c;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f39496c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m0 f39497d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f39498e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B1.Y f39499f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, m0 m0Var, int i12, B1.Y y11) {
            super(1);
            this.f39496c = i11;
            this.f39497d = m0Var;
            this.f39498e = i12;
            this.f39499f = y11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            Function2<Z1.q, Z1.s, Z1.m> I12 = h0.this.I1();
            m0 m0Var = this.f39497d;
            aVar.f(m0Var, I12.invoke(Z1.q.a(Z1.r.a(this.f39496c - m0Var.u0(), this.f39498e - m0Var.l0())), this.f39499f.getLayoutDirection()).g(), 0.0f);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0(@NotNull EnumC9900i enumC9900i, boolean z11, @NotNull Function2<? super Z1.q, ? super Z1.s, Z1.m> function2) {
        this.f39492a = enumC9900i;
        this.f39493b = z11;
        this.f39494c = (AbstractC7737t) function2;
    }

    @Override // D1.E
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        B1.W z02;
        EnumC9900i enumC9900i = this.f39492a;
        EnumC9900i enumC9900i2 = EnumC9900i.Vertical;
        int m11 = enumC9900i != enumC9900i2 ? 0 : Z1.b.m(j11);
        EnumC9900i enumC9900i3 = this.f39492a;
        EnumC9900i enumC9900i4 = EnumC9900i.Horizontal;
        m0 a02 = u11.a0(Z1.c.a(m11, (this.f39492a == enumC9900i2 || !this.f39493b) ? Z1.b.k(j11) : Integer.MAX_VALUE, enumC9900i3 == enumC9900i4 ? Z1.b.l(j11) : 0, (this.f39492a == enumC9900i4 || !this.f39493b) ? Z1.b.j(j11) : Integer.MAX_VALUE));
        int e11 = kotlin.ranges.h.e(a02.u0(), Z1.b.m(j11), Z1.b.k(j11));
        int e12 = kotlin.ranges.h.e(a02.l0(), Z1.b.l(j11), Z1.b.j(j11));
        z02 = y11.z0(e11, e12, kotlin.collections.U.c(), new a(e11, a02, e12, y11));
        return z02;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function2<Z1.q, Z1.s, Z1.m>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function2<Z1.q, Z1.s, Z1.m> I1() {
        return this.f39494c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J1(@NotNull Function2<? super Z1.q, ? super Z1.s, Z1.m> function2) {
        this.f39494c = (AbstractC7737t) function2;
    }

    public final void K1(@NotNull EnumC9900i enumC9900i) {
        this.f39492a = enumC9900i;
    }

    public final void L1(boolean z11) {
        this.f39493b = z11;
    }
}

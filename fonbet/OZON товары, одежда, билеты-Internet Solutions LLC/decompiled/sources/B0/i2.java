package B0;

import B1.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;

/* loaded from: classes.dex */
final class i2 implements B1.J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M1 f1802a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1803b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Q1.W f1804c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<R1> f1805d;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B1.Y f1806b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i2 f1807c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B1.m0 f1808d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f1809e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B1.Y y11, i2 i2Var, B1.m0 m0Var, int i11) {
            super(1);
            this.f1806b = y11;
            this.f1807c = i2Var;
            this.f1808d = m0Var;
            this.f1809e = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            i2 i2Var = this.f1807c;
            int a11 = i2Var.a();
            Q1.W d11 = i2Var.d();
            R1 invoke = i2Var.c().invoke();
            K1.K e11 = invoke != null ? invoke.e() : null;
            B1.m0 m0Var = this.f1808d;
            i2Var.b().h(EnumC9142v.Vertical, I1.a(this.f1806b, a11, d11, e11, false, m0Var.u0()), this.f1809e, m0Var.l0());
            aVar2.h(m0Var, 0, Math.round(-i2Var.b().c()), 0.0f);
            return Unit.f71690a;
        }
    }

    public i2(@NotNull M1 m12, int i11, @NotNull Q1.W w11, @NotNull Function0<R1> function0) {
        this.f1802a = m12;
        this.f1803b = i11;
        this.f1804c = w11;
        this.f1805d = function0;
    }

    @Override // B1.J
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        B1.W z02;
        B1.m0 a02 = u11.a0(Z1.b.c(0, 0, 0, Integer.MAX_VALUE, 7, j11));
        int min = Math.min(a02.l0(), Z1.b.j(j11));
        z02 = y11.z0(a02.u0(), min, kotlin.collections.U.c(), new a(y11, this, a02, min));
        return z02;
    }

    public final int a() {
        return this.f1803b;
    }

    @NotNull
    public final M1 b() {
        return this.f1802a;
    }

    @NotNull
    public final Function0<R1> c() {
        return this.f1805d;
    }

    @NotNull
    public final Q1.W d() {
        return this.f1804c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return Intrinsics.d(this.f1802a, i2Var.f1802a) && this.f1803b == i2Var.f1803b && Intrinsics.d(this.f1804c, i2Var.f1804c) && Intrinsics.d(this.f1805d, i2Var.f1805d);
    }

    public final int hashCode() {
        return this.f1805d.hashCode() + ((this.f1804c.hashCode() + C2454a.a(this.f1803b, this.f1802a.hashCode() * 31, 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f1802a + ", cursorOffset=" + this.f1803b + ", transformedText=" + this.f1804c + ", textLayoutResultProvider=" + this.f1805d + ')';
    }
}

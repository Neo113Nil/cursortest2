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
final class D0 implements B1.J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M1 f1358a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1359b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Q1.W f1360c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<R1> f1361d;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B1.Y f1362b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ D0 f1363c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B1.m0 f1364d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f1365e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B1.Y y11, D0 d02, B1.m0 m0Var, int i11) {
            super(1);
            this.f1362b = y11;
            this.f1363c = d02;
            this.f1364d = m0Var;
            this.f1365e = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            D0 d02 = this.f1363c;
            int a11 = d02.a();
            Q1.W d11 = d02.d();
            R1 invoke = d02.c().invoke();
            K1.K e11 = invoke != null ? invoke.e() : null;
            B1.Y y11 = this.f1362b;
            boolean z11 = y11.getLayoutDirection() == Z1.s.Rtl;
            B1.m0 m0Var = this.f1364d;
            d02.b().h(EnumC9142v.Horizontal, I1.a(y11, a11, d11, e11, z11, m0Var.u0()), this.f1365e, m0Var.u0());
            aVar2.h(m0Var, Math.round(-d02.b().c()), 0, 0.0f);
            return Unit.f71690a;
        }
    }

    public D0(@NotNull M1 m12, int i11, @NotNull Q1.W w11, @NotNull Function0<R1> function0) {
        this.f1358a = m12;
        this.f1359b = i11;
        this.f1360c = w11;
        this.f1361d = function0;
    }

    @Override // B1.J
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        long j12;
        B1.W z02;
        if (u11.Y(Z1.b.j(j11)) < Z1.b.k(j11)) {
            j12 = j11;
        } else {
            j12 = j11;
            j11 = Z1.b.c(0, Integer.MAX_VALUE, 0, 0, 13, j12);
        }
        B1.m0 a02 = u11.a0(j11);
        int min = Math.min(a02.u0(), Z1.b.k(j12));
        z02 = y11.z0(min, a02.l0(), kotlin.collections.U.c(), new a(y11, this, a02, min));
        return z02;
    }

    public final int a() {
        return this.f1359b;
    }

    @NotNull
    public final M1 b() {
        return this.f1358a;
    }

    @NotNull
    public final Function0<R1> c() {
        return this.f1361d;
    }

    @NotNull
    public final Q1.W d() {
        return this.f1360c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        return Intrinsics.d(this.f1358a, d02.f1358a) && this.f1359b == d02.f1359b && Intrinsics.d(this.f1360c, d02.f1360c) && Intrinsics.d(this.f1361d, d02.f1361d);
    }

    public final int hashCode() {
        return this.f1361d.hashCode() + ((this.f1360c.hashCode() + C2454a.a(this.f1359b, this.f1358a.hashCode() * 31, 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f1358a + ", cursorOffset=" + this.f1359b + ", transformedText=" + this.f1360c + ", textLayoutResultProvider=" + this.f1361d + ')';
    }
}

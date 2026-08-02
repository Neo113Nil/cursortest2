package androidx.compose.ui.draw;

import B1.InterfaceC2547p;
import B1.InterfaceC2552v;
import B1.U;
import B1.W;
import B1.Y;
import B1.m0;
import B1.t0;
import D1.E;
import D1.InterfaceC2819t;
import D1.J;
import D1.V;
import Z1.r;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7809a0;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "LD1/E;", "Landroidx/compose/ui/e$c;", "LD1/t;", "Lq1/b;", "painter", "Lq1/b;", "I1", "()Lq1/b;", "R1", "(Lq1/b;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PainterNode extends e.c implements E, InterfaceC2819t {

    /* renamed from: a, reason: collision with root package name */
    private boolean f40336a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private InterfaceC6250b f40337b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private InterfaceC2547p f40338c;

    /* renamed from: d, reason: collision with root package name */
    private float f40339d;

    /* renamed from: e, reason: collision with root package name */
    private C7809a0 f40340e;

    @NotNull
    private AbstractC8972b painter;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f40341b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var) {
            super(1);
            this.f40341b = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.h(this.f40341b, 0, 0, 0.0f);
            return Unit.f71690a;
        }
    }

    public PainterNode(@NotNull AbstractC8972b abstractC8972b, boolean z11, @NotNull InterfaceC6250b interfaceC6250b, @NotNull InterfaceC2547p interfaceC2547p, float f7, C7809a0 c7809a0) {
        this.painter = abstractC8972b;
        this.f40336a = z11;
        this.f40337b = interfaceC6250b;
        this.f40338c = interfaceC2547p;
        this.f40339d = f7;
        this.f40340e = c7809a0;
    }

    private final boolean K1() {
        return this.f40336a && this.painter.getF40457d() != 9205357640488583168L;
    }

    private static boolean L1(long j11) {
        if (C7464j.c(j11, 9205357640488583168L)) {
            return false;
        }
        float d11 = C7464j.d(j11);
        return (Float.isInfinite(d11) || Float.isNaN(d11)) ? false : true;
    }

    private static boolean M1(long j11) {
        if (C7464j.c(j11, 9205357640488583168L)) {
            return false;
        }
        float f7 = C7464j.f(j11);
        return (Float.isInfinite(f7) || Float.isNaN(f7)) ? false : true;
    }

    private final long N1(long j11) {
        boolean z11 = false;
        boolean z12 = Z1.b.g(j11) && Z1.b.f(j11);
        if (Z1.b.i(j11) && Z1.b.h(j11)) {
            z11 = true;
        }
        if ((!K1() && z12) || z11) {
            return Z1.b.c(Z1.b.k(j11), 0, Z1.b.j(j11), 0, 10, j11);
        }
        long f40457d = this.painter.getF40457d();
        long a11 = C7465k.a(Z1.c.h(M1(f40457d) ? Math.round(C7464j.f(f40457d)) : Z1.b.m(j11), j11), Z1.c.g(L1(f40457d) ? Math.round(C7464j.d(f40457d)) : Z1.b.l(j11), j11));
        if (K1()) {
            long a12 = C7465k.a(!M1(this.painter.getF40457d()) ? C7464j.f(a11) : C7464j.f(this.painter.getF40457d()), !L1(this.painter.getF40457d()) ? C7464j.d(a11) : C7464j.d(this.painter.getF40457d()));
            a11 = (C7464j.f(a11) == 0.0f || C7464j.d(a11) == 0.0f) ? 0L : t0.b(a12, this.f40338c.a(a12, a11));
        }
        return Z1.b.c(Z1.c.h(Math.round(C7464j.f(a11)), j11), 0, Z1.c.g(Math.round(C7464j.d(a11)), j11), 0, 10, j11);
    }

    @Override // D1.E
    public final int A(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        if (!K1()) {
            return interfaceC2552v.T(i11);
        }
        long N12 = N1(Z1.c.b(0, i11, 7));
        return Math.max(Z1.b.m(N12), interfaceC2552v.T(i11));
    }

    @Override // D1.E
    @NotNull
    public final W D(@NotNull Y y11, @NotNull U u11, long j11) {
        W z02;
        m0 a02 = u11.a0(N1(j11));
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new a(a02));
        return z02;
    }

    @Override // D1.E
    public final int I(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        if (!K1()) {
            return interfaceC2552v.D(i11);
        }
        long N12 = N1(Z1.c.b(i11, 0, 13));
        return Math.max(Z1.b.l(N12), interfaceC2552v.D(i11));
    }

    @NotNull
    /* renamed from: I1, reason: from getter */
    public final AbstractC8972b getPainter() {
        return this.painter;
    }

    /* renamed from: J1, reason: from getter */
    public final boolean getF40336a() {
        return this.f40336a;
    }

    @Override // D1.E
    public final int K(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        if (!K1()) {
            return interfaceC2552v.O(i11);
        }
        long N12 = N1(Z1.c.b(i11, 0, 13));
        return Math.max(Z1.b.l(N12), interfaceC2552v.O(i11));
    }

    public final void O1(@NotNull InterfaceC6250b interfaceC6250b) {
        this.f40337b = interfaceC6250b;
    }

    public final void P1(C7809a0 c7809a0) {
        this.f40340e = c7809a0;
    }

    public final void Q1(@NotNull InterfaceC2547p interfaceC2547p) {
        this.f40338c = interfaceC2547p;
    }

    public final void R1(@NotNull AbstractC8972b abstractC8972b) {
        this.painter = abstractC8972b;
    }

    public final void S1(boolean z11) {
        this.f40336a = z11;
    }

    @Override // D1.InterfaceC2819t
    public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        long f40457d = this.painter.getF40457d();
        long a11 = C7465k.a(M1(f40457d) ? C7464j.f(f40457d) : C7464j.f(((J) interfaceC8410c).i()), L1(f40457d) ? C7464j.d(f40457d) : C7464j.d(((J) interfaceC8410c).i()));
        J j11 = (J) interfaceC8410c;
        long b11 = (C7464j.f(j11.i()) == 0.0f || C7464j.d(j11.i()) == 0.0f) ? 0L : t0.b(a11, this.f40338c.a(a11, j11.i()));
        long a12 = this.f40337b.a(r.a(Math.round(C7464j.f(b11)), Math.round(C7464j.d(b11))), r.a(Math.round(C7464j.f(j11.i())), Math.round(C7464j.d(j11.i()))), j11.getLayoutDirection());
        float f7 = (int) (a12 >> 32);
        float f11 = (int) (a12 & 4294967295L);
        j11.w0().f().g(f7, f11);
        try {
            this.painter.m444drawx_KDEd0(interfaceC8410c, b11, this.f40339d, this.f40340e);
            j11.w0().f().g(-f7, -f11);
            j11.F0();
        } catch (Throwable th2) {
            j11.w0().f().g(-f7, -f11);
            throw th2;
        }
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void setAlpha(float f7) {
        this.f40339d = f7;
    }

    @NotNull
    public final String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.f40336a + ", alignment=" + this.f40337b + ", alpha=" + this.f40339d + ", colorFilter=" + this.f40340e + ')';
    }

    @Override // D1.E
    public final int u(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        if (!K1()) {
            return interfaceC2552v.Y(i11);
        }
        long N12 = N1(Z1.c.b(0, i11, 7));
        return Math.max(Z1.b.m(N12), interfaceC2552v.Y(i11));
    }
}

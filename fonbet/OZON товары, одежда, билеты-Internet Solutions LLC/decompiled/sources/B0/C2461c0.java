package B0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2461c0 extends AbstractC7737t implements Function1<B1.B, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O0 f1687b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f1688c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.i2 f1689d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ I0.W0 f1690e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Q1.K f1691f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Q1.D f1692g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2461c0(O0 o02, boolean z11, androidx.compose.ui.platform.i2 i2Var, I0.W0 w02, Q1.K k11, Q1.D d11) {
        super(1);
        this.f1687b = o02;
        this.f1688c = z11;
        this.f1689d = i2Var;
        this.f1690e = w02;
        this.f1691f = k11;
        this.f1692g = d11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(B1.B b11) {
        Q1.V g10;
        B1.B c11;
        B1.B b12;
        B1.B b13 = b11;
        O0 o02 = this.f1687b;
        o02.E(b13);
        R1 j11 = o02.j();
        if (j11 != null) {
            j11.h(b13);
        }
        if (this.f1688c) {
            EnumC2529z0 d11 = o02.d();
            EnumC2529z0 enumC2529z0 = EnumC2529z0.Selection;
            I0.W0 w02 = this.f1690e;
            Q1.K k11 = this.f1691f;
            if (d11 == enumC2529z0) {
                if (o02.s() && this.f1689d.a()) {
                    w02.c0();
                } else {
                    w02.L();
                }
                o02.L(I0.X0.b(w02, true));
                o02.K(I0.X0.b(w02, false));
                o02.I(K1.Q.e(k11.e()));
            } else if (o02.d() == EnumC2529z0.Cursor) {
                o02.I(I0.X0.b(w02, true));
            }
            C2514u0.i(o02, k11, this.f1692g);
            R1 j12 = o02.j();
            if (j12 != null && (g10 = o02.g()) != null && o02.e() && (c11 = j12.c()) != null && c11.I() && (b12 = j12.b()) != null) {
                g10.d(this.f1691f, this.f1692g, j12.e(), new C2495n1(c11), I0.B0.f(c11), c11.K(b12, false));
            }
        }
        return Unit.f71690a;
    }
}

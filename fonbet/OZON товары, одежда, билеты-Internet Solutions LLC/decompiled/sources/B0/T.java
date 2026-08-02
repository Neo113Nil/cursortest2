package B0;

import D1.InterfaceC2801g;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;

/* loaded from: classes.dex */
final class T extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ I0.W0 f1522b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ O0 f1523c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f1524d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f1525e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<K1.K, Unit> f1526f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Q1.K f1527g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Q1.D f1528h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Z1.d f1529i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f1530j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    T(I0.W0 w02, O0 o02, boolean z11, boolean z12, Function1<? super K1.K, Unit> function1, Q1.K k11, Q1.D d11, Z1.d dVar, int i11) {
        super(2);
        this.f1522b = w02;
        this.f1523c = o02;
        this.f1524d = z11;
        this.f1525e = z12;
        this.f1526f = function1;
        this.f1527g = k11;
        this.f1528h = d11;
        this.f1529i = dVar;
        this.f1530j = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        boolean z11;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            O0 o02 = this.f1523c;
            S s11 = new S(o02, this.f1526f, this.f1527g, this.f1528h, this.f1529i, this.f1530j);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            int I11 = interfaceC3967k2.I();
            S0.A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, aVar);
            InterfaceC2801g.f5440U.getClass();
            Function0 a11 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a11);
            } else {
                interfaceC3967k2.e();
            }
            S0.F1.b(interfaceC3967k2, s11, InterfaceC2801g.a.e());
            S0.F1.b(interfaceC3967k2, d11, InterfaceC2801g.a.g());
            Function2 b11 = InterfaceC2801g.a.b();
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(b11, I11, interfaceC3967k2, I11);
            }
            S0.F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
            interfaceC3967k2.f();
            EnumC2529z0 d12 = o02.d();
            EnumC2529z0 enumC2529z0 = EnumC2529z0.None;
            boolean z12 = this.f1524d;
            if (d12 != enumC2529z0 && o02.i() != null) {
                B1.B i11 = o02.i();
                Intrinsics.f(i11);
                if (i11.I() && z12) {
                    z11 = true;
                    I0.W0 w02 = this.f1522b;
                    C2514u0.e(w02, z11, interfaceC3967k2, 0);
                    if (o02.d() == EnumC2529z0.Cursor || this.f1525e || !z12) {
                        interfaceC3967k2.o(-1955394);
                        interfaceC3967k2.k();
                    } else {
                        interfaceC3967k2.o(-2032274);
                        C2514u0.c(w02, interfaceC3967k2, 0);
                        interfaceC3967k2.k();
                    }
                }
            }
            z11 = false;
            I0.W0 w022 = this.f1522b;
            C2514u0.e(w022, z11, interfaceC3967k2, 0);
            if (o02.d() == EnumC2529z0.Cursor) {
            }
            interfaceC3967k2.o(-1955394);
            interfaceC3967k2.k();
        }
        return Unit.f71690a;
    }
}

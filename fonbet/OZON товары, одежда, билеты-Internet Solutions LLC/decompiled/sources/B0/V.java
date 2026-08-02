package B0;

import B0.I1;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import androidx.compose.ui.platform.C5242e1;
import i1.C6988h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import r0.EnumC9142v;
import z0.InterfaceC10969b;

/* loaded from: classes.dex */
final class V extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O0 f1558b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K1.T f1559c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f1560d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f1561e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ M1 f1562f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Q1.K f1563g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Q1.X f1564h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f1565i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f1566j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f1567k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f1568l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ InterfaceC10969b f1569m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ I0.W0 f1570n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ boolean f1571o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ boolean f1572p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Function1<K1.K, Unit> f1573q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ Q1.D f1574r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ Z1.d f1575s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    V(O0 o02, K1.T t2, int i11, int i12, M1 m12, Q1.K k11, Q1.X x11, androidx.compose.ui.e eVar, androidx.compose.ui.e eVar2, androidx.compose.ui.e eVar3, androidx.compose.ui.e eVar4, InterfaceC10969b interfaceC10969b, I0.W0 w02, boolean z11, boolean z12, Function1<? super K1.K, Unit> function1, Q1.D d11, Z1.d dVar) {
        super(2);
        this.f1558b = o02;
        this.f1559c = t2;
        this.f1560d = i11;
        this.f1561e = i12;
        this.f1562f = m12;
        this.f1563g = k11;
        this.f1564h = x11;
        this.f1565i = eVar;
        this.f1566j = eVar2;
        this.f1567k = eVar3;
        this.f1568l = eVar4;
        this.f1569m = interfaceC10969b;
        this.f1570n = w02;
        this.f1571o = z11;
        this.f1572p = z12;
        this.f1573q = function1;
        this.f1574r = d11;
        this.f1575s = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        androidx.compose.ui.e i2Var;
        androidx.compose.ui.e b11;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            O0 o02 = this.f1558b;
            androidx.compose.ui.e h11 = androidx.compose.foundation.layout.a0.h(aVar, o02.k(), 0.0f, 2);
            Function1<C5242e1, Unit> a11 = C5236c1.a();
            int i11 = this.f1560d;
            int i12 = this.f1561e;
            K1.T t2 = this.f1559c;
            androidx.compose.ui.e b12 = androidx.compose.ui.c.b(h11, a11, new B0(i11, i12, t2));
            boolean F11 = interfaceC3967k2.F(o02);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new U(o02);
                interfaceC3967k2.x(C11);
            }
            Function0 function0 = (Function0) C11;
            M1 m12 = this.f1562f;
            EnumC9142v e11 = m12.e();
            Q1.K k11 = this.f1563g;
            int d11 = m12.d(k11.e());
            m12.g(k11.e());
            Q1.W c11 = h2.c(this.f1564h, k11.c());
            int i13 = I1.a.f1409a[e11.ordinal()];
            if (i13 == 1) {
                i2Var = new i2(m12, d11, c11, function0);
            } else {
                if (i13 != 2) {
                    throw new Sc.o();
                }
                i2Var = new D0(m12, d11, c11, function0);
            }
            b11 = androidx.compose.ui.c.b(C6988h.b(b12).l0(i2Var).l0(this.f1565i).l0(this.f1566j), C5236c1.a(), new Q1(t2));
            I0.R0.a(androidx.compose.foundation.relocation.c.b(b11.l0(this.f1567k).l0(this.f1568l), this.f1569m), a1.c.c(-363167407, new T(this.f1570n, o02, this.f1571o, this.f1572p, this.f1573q, this.f1563g, this.f1574r, this.f1575s, this.f1561e), interfaceC3967k2), interfaceC3967k2, 48);
        }
        return Unit.f71690a;
    }
}

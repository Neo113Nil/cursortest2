package Mf0;

import B0.N0;
import D1.InterfaceC2801g;
import I0.C3173b;
import I0.W;
import J0.C3332q;
import J0.F1;
import J0.u3;
import S0.A0;
import S0.InterfaceC3967k;
import S0.InterfaceC3972m0;
import S0.InterfaceC3978p0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.material.e0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import e1.InterfaceC6250b;
import e1.d;
import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import u0.C9891D;
import u0.InterfaceC9895d;

/* loaded from: classes3.dex */
final class z extends AbstractC7737t implements InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<String> f18065b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3972m0 f18066c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f18067d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f18068e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ fd.p<String, Boolean, Boolean, Boolean, Integer, Unit> f18069f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ O f18070g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<String> f18071h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<String> f18072i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ N f18073j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<String> f18074k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Map<String, String>> f18075l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    z(InterfaceC3978p0<String> interfaceC3978p0, InterfaceC3972m0 interfaceC3972m0, InterfaceC3978p0<Boolean> interfaceC3978p02, InterfaceC3978p0<Boolean> interfaceC3978p03, fd.p<? super String, ? super Boolean, ? super Boolean, ? super Boolean, ? super Integer, Unit> pVar, O o11, InterfaceC3978p0<String> interfaceC3978p04, InterfaceC3978p0<String> interfaceC3978p05, N n11, InterfaceC3978p0<String> interfaceC3978p06, InterfaceC3978p0<Map<String, String>> interfaceC3978p07) {
        super(3);
        this.f18065b = interfaceC3978p0;
        this.f18066c = interfaceC3972m0;
        this.f18067d = interfaceC3978p02;
        this.f18068e = interfaceC3978p03;
        this.f18069f = pVar;
        this.f18070g = o11;
        this.f18071h = interfaceC3978p04;
        this.f18072i = interfaceC3978p05;
        this.f18073j = n11;
        this.f18074k = interfaceC3978p06;
        this.f18075l = interfaceC3978p07;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC9895d interfaceC9895d, InterfaceC3967k interfaceC3967k, Integer num) {
        String str;
        z zVar;
        int i11;
        InterfaceC9895d Block = interfaceC9895d;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(Block, "$this$Block");
        if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            float f7 = 16;
            u3.b("Статус последнего запроса:", androidx.compose.foundation.layout.T.j(androidx.compose.foundation.layout.T.h(a0.e(aVar, 1.0f), f7, 0.0f, 2), 0.0f, f7, 0.0f, 0.0f, 13), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 54, 0, 131068);
            W.a(null, a1.c.c(456994921, new C3637t(this.f18073j), interfaceC3967k2), interfaceC3967k2, 48);
            Sf0.e.a("Сетевой клиент", androidx.compose.foundation.layout.T.j(aVar, f7, f7, 0.0f, 0.0f, 12), interfaceC3967k2, 6, 0);
            InterfaceC3978p0<String> interfaceC3978p0 = this.f18065b;
            String value = interfaceC3978p0.getValue();
            androidx.compose.ui.e f11 = androidx.compose.foundation.layout.T.f(a0.e(aVar, 1.0f), f7);
            interfaceC3967k2.o(-1991473513);
            boolean n11 = interfaceC3967k2.n(interfaceC3978p0);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new u(interfaceC3978p0);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            F1.b(value, (Function1) C11, f11, false, false, null, C3619a.f18010a, null, null, false, null, null, null, false, 0, 0, null, null, interfaceC3967k2, 1573248, 0, 1048504);
            InterfaceC3972m0 interfaceC3972m0 = this.f18066c;
            int intValue2 = interfaceC3972m0.getIntValue();
            Integer valueOf = Integer.valueOf(intValue2);
            if (intValue2 <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "";
            }
            N0 n02 = new N0(0, 3, 123);
            androidx.compose.ui.e h11 = androidx.compose.foundation.layout.T.h(a0.e(aVar, 1.0f), f7, 0.0f, 2);
            interfaceC3967k2.o(-1991463904);
            boolean n12 = interfaceC3967k2.n(interfaceC3972m0);
            Object C12 = interfaceC3967k2.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new v(interfaceC3972m0);
                interfaceC3967k2.x(C12);
            }
            interfaceC3967k2.k();
            F1.b(str, (Function1) C12, h11, false, false, null, C3619a.f18011b, null, null, false, null, n02, null, false, 0, 0, null, null, interfaceC3967k2, 1573248, 384, 1044408);
            d.b i12 = InterfaceC6250b.a.i();
            float f12 = 8;
            float f13 = 48;
            androidx.compose.ui.e f14 = a0.f(androidx.compose.foundation.layout.T.j(aVar, 0.0f, f12, 0.0f, 0.0f, 13), f13);
            InterfaceC3978p0<Boolean> interfaceC3978p02 = this.f18067d;
            boolean booleanValue = interfaceC3978p02.getValue().booleanValue();
            I1.i a11 = I1.i.a(2);
            interfaceC3967k2.o(-1991443546);
            boolean n13 = interfaceC3967k2.n(interfaceC3978p02);
            Object C13 = interfaceC3967k2.C();
            if (n13 || C13 == InterfaceC3967k.a.a()) {
                C13 = new w(interfaceC3978p02);
                interfaceC3967k2.x(C13);
            }
            interfaceC3967k2.k();
            androidx.compose.ui.e b11 = androidx.compose.foundation.selection.c.b(f14, booleanValue, a11, (Function0) C13, 2);
            Y b12 = X.b(C5179b.f(), i12, interfaceC3967k2, 48);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f15 = androidx.compose.ui.c.f(interfaceC3967k2, b11);
            InterfaceC2801g.f5440U.getClass();
            Function0 a12 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a12);
            } else {
                interfaceC3967k2.e();
            }
            Function2 f16 = C3173b.f(interfaceC3967k2, b12, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(f16, I11, interfaceC3967k2, I11);
            }
            S0.F1.b(interfaceC3967k2, f15, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            u3.b("Кронет", androidx.compose.foundation.layout.T.j(c9891d.a(aVar, 1.0f, true), f7, 0.0f, f12, 0.0f, 10), 0L, Hj0.T.d(16), null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 3078, 0, 131060);
            e0.a(interfaceC3978p02.getValue().booleanValue(), null, androidx.compose.foundation.layout.T.j(aVar, 0.0f, 0.0f, f7, 0.0f, 11), false, null, interfaceC3967k2, 432, 56);
            interfaceC3967k2.f();
            d.b i13 = InterfaceC6250b.a.i();
            androidx.compose.ui.e f17 = a0.f(aVar, f13);
            InterfaceC3978p0<Boolean> interfaceC3978p03 = this.f18068e;
            boolean booleanValue2 = interfaceC3978p03.getValue().booleanValue();
            I1.i a13 = I1.i.a(2);
            interfaceC3967k2.o(-1991419032);
            boolean n14 = interfaceC3967k2.n(interfaceC3978p03);
            Object C14 = interfaceC3967k2.C();
            if (n14 || C14 == InterfaceC3967k.a.a()) {
                C14 = new x(interfaceC3978p03);
                interfaceC3967k2.x(C14);
            }
            interfaceC3967k2.k();
            androidx.compose.ui.e b13 = androidx.compose.foundation.selection.c.b(f17, booleanValue2, a13, (Function0) C14, 2);
            Y b14 = X.b(C5179b.f(), i13, interfaceC3967k2, 48);
            int I12 = interfaceC3967k2.I();
            A0 d12 = interfaceC3967k2.d();
            androidx.compose.ui.e f18 = androidx.compose.ui.c.f(interfaceC3967k2, b13);
            Function0 a14 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a14);
            } else {
                interfaceC3967k2.e();
            }
            Function2 f19 = C3173b.f(interfaceC3967k2, b14, interfaceC3967k2, d12);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
                Nk.a.d(f19, I12, interfaceC3967k2, I12);
            }
            S0.F1.b(interfaceC3967k2, f18, InterfaceC2801g.a.f());
            u3.b("ГОСТ TLS", androidx.compose.foundation.layout.T.j(c9891d.a(aVar, 1.0f, true), f7, 0.0f, f12, 0.0f, 10), 0L, Hj0.T.d(16), null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 3078, 0, 131060);
            e0.a(interfaceC3978p03.getValue().booleanValue(), null, androidx.compose.foundation.layout.T.j(aVar, 0.0f, 0.0f, f7, 0.0f, 11), false, null, interfaceC3967k2, 432, 56);
            interfaceC3967k2.f();
            interfaceC3967k2.o(-1991402083);
            fd.p<String, Boolean, Boolean, Boolean, Integer, Unit> pVar = this.f18069f;
            boolean n15 = interfaceC3967k2.n(pVar) | interfaceC3967k2.n(interfaceC3978p0) | interfaceC3967k2.n(interfaceC3978p02) | interfaceC3967k2.n(interfaceC3978p03) | interfaceC3967k2.n(interfaceC3972m0);
            Object C15 = interfaceC3967k2.C();
            if (n15 || C15 == InterfaceC3967k.a.a()) {
                C15 = new y(this.f18069f, this.f18065b, this.f18067d, this.f18068e, this.f18066c);
                interfaceC3967k2.x(C15);
            }
            interfaceC3967k2.k();
            float f21 = 56;
            C3332q.a((Function0) C15, androidx.compose.foundation.layout.T.j(androidx.compose.foundation.layout.T.h(a0.f(a0.e(aVar, 1.0f), f21), f7, 0.0f, 2), 0.0f, 0.0f, 0.0f, f7, 7), false, null, null, null, null, C3619a.f18012c, interfaceC3967k2, 805306416, 508);
            Sf0.e.a("Retrofit", androidx.compose.foundation.layout.T.j(aVar, f7, f7, 0.0f, 0.0f, 12), interfaceC3967k2, 6, 0);
            interfaceC3967k2.o(-1991383620);
            boolean n16 = interfaceC3967k2.n(interfaceC3978p03) | interfaceC3967k2.n(interfaceC3978p02) | interfaceC3967k2.n(pVar) | interfaceC3967k2.n(interfaceC3978p0) | interfaceC3967k2.n(interfaceC3972m0);
            Object C16 = interfaceC3967k2.C();
            if (n16 || C16 == InterfaceC3967k.a.a()) {
                zVar = this;
                C16 = new C3631m(zVar.f18069f, zVar.f18065b, zVar.f18067d, zVar.f18068e, zVar.f18066c);
                interfaceC3967k2.x(C16);
            } else {
                zVar = this;
            }
            interfaceC3967k2.k();
            C3332q.a((Function0) C16, androidx.compose.foundation.layout.T.j(androidx.compose.foundation.layout.T.h(a0.f(a0.e(aVar, 1.0f), f21), f7, 0.0f, 2), 0.0f, 0.0f, 0.0f, f7, 7), false, null, null, null, null, C3619a.f18013d, interfaceC3967k2, 805306416, 508);
            String value2 = zVar.f18074k.getValue();
            interfaceC3967k2.o(-1991371392);
            if (value2 == null) {
                i11 = 0;
            } else {
                i11 = 0;
                M.a(value2, interfaceC3967k2, 0);
                Unit unit = Unit.f71690a;
            }
            interfaceC3967k2.k();
            Sf0.e.a("Extra headers", androidx.compose.foundation.layout.T.j(aVar, f7, f7, 0.0f, 0.0f, 12), interfaceC3967k2, 6, i11);
            InterfaceC3978p0<String> interfaceC3978p04 = zVar.f18071h;
            String value3 = interfaceC3978p04.getValue();
            if (value3 == null) {
                value3 = "";
            }
            N0 n03 = new N0(i11, 1, 123);
            androidx.compose.ui.e h12 = androidx.compose.foundation.layout.T.h(Q1.a(a0.e(aVar, 1.0f), "MeshVersionHeader"), f7, 0.0f, 2);
            interfaceC3967k2.o(-1991360031);
            O o11 = zVar.f18070g;
            boolean F11 = interfaceC3967k2.F(o11) | interfaceC3967k2.n(interfaceC3978p04);
            Object C17 = interfaceC3967k2.C();
            if (F11 || C17 == InterfaceC3967k.a.a()) {
                C17 = new C3632n(o11, interfaceC3978p04);
                interfaceC3967k2.x(C17);
            }
            interfaceC3967k2.k();
            F1.b(value3, (Function1) C17, h12, false, false, null, C3619a.f18014e, null, a1.c.c(-1722463779, new C3634p(o11, interfaceC3978p04), interfaceC3967k2), false, null, n03, null, true, 0, 0, null, null, interfaceC3967k2, 806879616, 24960, 1027512);
            InterfaceC3978p0<String> interfaceC3978p05 = zVar.f18072i;
            String value4 = interfaceC3978p05.getValue();
            String str2 = value4 != null ? value4 : "";
            N0 n04 = new N0(0, 1, 123);
            androidx.compose.ui.e j11 = androidx.compose.foundation.layout.T.j(Q1.a(a0.e(aVar, 1.0f), "InternalHeadersToken"), f7, 0.0f, f7, f12, 2);
            interfaceC3967k2.o(-1991315286);
            boolean F12 = interfaceC3967k2.F(o11) | interfaceC3967k2.n(interfaceC3978p05);
            Object C18 = interfaceC3967k2.C();
            if (F12 || C18 == InterfaceC3967k.a.a()) {
                C18 = new C3635q(o11, interfaceC3978p05);
                interfaceC3967k2.x(C18);
            }
            interfaceC3967k2.k();
            F1.b(str2, (Function1) C18, j11, false, false, null, C3619a.f18016g, null, a1.c.c(-1486293956, new C3636s(o11, interfaceC3978p05), interfaceC3967k2), false, null, n04, null, true, 0, 0, null, null, interfaceC3967k2, 806879616, 24960, 1027512);
            for (Map.Entry<String, String> entry : zVar.f18075l.getValue().entrySet()) {
                u3.b(((Object) entry.getKey()) + " = " + ((Object) entry.getValue()), androidx.compose.foundation.layout.T.j(androidx.compose.ui.e.f40358c0, f7, 4, 0.0f, 0.0f, 12), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 0, 0, 131068);
            }
        }
        return Unit.f71690a;
    }
}

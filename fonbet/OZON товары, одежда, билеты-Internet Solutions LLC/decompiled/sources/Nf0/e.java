package Nf0;

import D1.InterfaceC2801g;
import E0.C2942q;
import I0.C3173b;
import J0.C3332q;
import J0.P;
import J0.u3;
import Nf0.h;
import P1.F;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import fd.InterfaceC6512o;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import m3.C8060b;
import u0.E;
import v0.InterfaceC10165e;

/* loaded from: classes3.dex */
public final class e extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f19511b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f19512c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f19513d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ j f19514e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, f fVar, boolean z11, j jVar) {
        super(4);
        this.f19511b = list;
        this.f19512c = fVar;
        this.f19513d = z11;
        this.f19514e = jVar;
    }

    @Override // fd.InterfaceC6512o
    public final Unit invoke(InterfaceC10165e interfaceC10165e, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
        int i11;
        long j11;
        androidx.compose.ui.e b11;
        float f7;
        long j12;
        F f11;
        long j13;
        long j14;
        long j15;
        long j16;
        float f12;
        long j17;
        long j18;
        long j19;
        long j21;
        long j22;
        long j23;
        InterfaceC10165e interfaceC10165e2 = interfaceC10165e;
        int intValue = num.intValue();
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i11 = (interfaceC3967k2.n(interfaceC10165e2) ? 4 : 2) | intValue2;
        } else {
            i11 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i11 |= interfaceC3967k2.r(intValue) ? 32 : 16;
        }
        if ((i11 & 147) == 146 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            h.b bVar = (h.b) this.f19511b.get(intValue);
            interfaceC3967k2.o(-465545138);
            boolean isEmpty = bVar.d().isEmpty();
            boolean isEmpty2 = bVar.e().isEmpty();
            boolean h11 = bVar.h();
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e d11 = a0.d(aVar);
            j11 = C7807Z.f72250d;
            b11 = androidx.compose.foundation.e.b(d11, j11, y0.a());
            f fVar = this.f19512c;
            f7 = fVar.f19517c;
            androidx.compose.ui.e f13 = T.f(b11, f7);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k2, 0);
            int I11 = interfaceC3967k2.I();
            A0 d12 = interfaceC3967k2.d();
            androidx.compose.ui.e f14 = androidx.compose.ui.c.f(interfaceC3967k2, f13);
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
            Function2 c11 = P.c(interfaceC3967k2, a11, interfaceC3967k2, d12);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(c11, I11, interfaceC3967k2, I11);
            }
            F1.b(interfaceC3967k2, f14, InterfaceC2801g.a.f());
            androidx.compose.ui.e e11 = a0.e(aVar, 1.0f);
            Y b12 = X.b(C5179b.d(), InterfaceC6250b.a.i(), interfaceC3967k2, 54);
            int I12 = interfaceC3967k2.I();
            A0 d13 = interfaceC3967k2.d();
            androidx.compose.ui.e f15 = androidx.compose.ui.c.f(interfaceC3967k2, e11);
            Function0 a13 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a13);
            } else {
                interfaceC3967k2.e();
            }
            Function2 f16 = C3173b.f(interfaceC3967k2, b12, interfaceC3967k2, d13);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
                Nk.a.d(f16, I12, interfaceC3967k2, I12);
            }
            F1.b(interfaceC3967k2, f15, InterfaceC2801g.a.f());
            String c12 = bVar.c();
            j12 = fVar.f19515a;
            f11 = F.f21512j;
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            int i12 = i11;
            u3.b(c12, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 0L, j12, f11, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 196608, 0, 131028);
            boolean z11 = !this.f19513d;
            interfaceC3967k2.o(-1585354651);
            j jVar = this.f19514e;
            boolean F11 = interfaceC3967k2.F(jVar) | ((((i12 & 112) ^ 48) > 32 && interfaceC3967k2.r(intValue)) || (i12 & 48) == 32);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new c(jVar, intValue);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            C3332q.a((Function0) C11, null, z11, null, null, null, null, a.f19504a, interfaceC3967k2, 805306368, 506);
            interfaceC3967k2.f();
            androidx.compose.ui.e e12 = a0.e(aVar, 1.0f);
            C5194q a14 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k2, 0);
            int I13 = interfaceC3967k2.I();
            A0 d14 = interfaceC3967k2.d();
            androidx.compose.ui.e f17 = androidx.compose.ui.c.f(interfaceC3967k2, e12);
            Function0 a15 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a15);
            } else {
                interfaceC3967k2.e();
            }
            Function2 c13 = P.c(interfaceC3967k2, a14, interfaceC3967k2, d14);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I13))) {
                Nk.a.d(c13, I13, interfaceC3967k2, I13);
            }
            F1.b(interfaceC3967k2, f17, InterfaceC2801g.a.f());
            String str = "isCronetEnabled: " + bVar.f();
            j13 = fVar.f19516b;
            j14 = C7807Z.f72248b;
            u3.b(str, null, j14, j13, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 384, 0, 131058);
            String str2 = "isGostTlsEnabled: " + bVar.g();
            j15 = fVar.f19516b;
            j16 = C7807Z.f72248b;
            u3.b(str2, null, j16, j15, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 384, 0, 131058);
            InterfaceC3967k interfaceC3967k3 = interfaceC3967k2;
            interfaceC3967k3.o(-1585330255);
            if (h11) {
                j22 = fVar.f19516b;
                j23 = C7807Z.f72253g;
                u3.b("Клиент валиден", null, j23, j22, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k3, 390, 0, 131058);
                interfaceC3967k3 = interfaceC3967k3;
            }
            interfaceC3967k3.k();
            interfaceC3967k3.o(-1585320872);
            if (!isEmpty) {
                Iterator<T> it = bVar.d().iterator();
                while (it.hasNext()) {
                    String b13 = Nk.a.b("Error: ", (String) it.next());
                    j19 = fVar.f19516b;
                    j21 = C7807Z.f72252f;
                    InterfaceC3967k interfaceC3967k4 = interfaceC3967k3;
                    u3.b(b13, null, j21, j19, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k4, 384, 0, 131058);
                    interfaceC3967k3 = interfaceC3967k4;
                }
            }
            interfaceC3967k3.k();
            interfaceC3967k3.o(-1585308287);
            if (!isEmpty2) {
                Iterator<T> it2 = bVar.e().iterator();
                while (it2.hasNext()) {
                    String b14 = Nk.a.b("Warning: ", (String) it2.next());
                    j17 = fVar.f19516b;
                    j18 = C7807Z.f72255i;
                    InterfaceC3967k interfaceC3967k5 = interfaceC3967k3;
                    u3.b(b14, null, j18, j17, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k5, 384, 0, 131058);
                    interfaceC3967k3 = interfaceC3967k5;
                }
            }
            interfaceC3967k3.k();
            interfaceC3967k3.f();
            interfaceC3967k3.f();
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            f12 = fVar.f19518d;
            E.a(interfaceC3967k3, T.f(aVar2, f12));
            interfaceC3967k3.k();
        }
        return Unit.f71690a;
    }
}

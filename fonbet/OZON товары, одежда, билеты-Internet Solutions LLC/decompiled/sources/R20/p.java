package R20;

import J20.C3373c;
import J20.C3376f;
import J20.C3378h;
import J20.D;
import J20.H;
import J20.y;
import S0.InterfaceC3967k;
import S20.a;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import v0.InterfaceC10165e;

/* loaded from: classes3.dex */
public final class p extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f24529b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f24530c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(List list, u uVar) {
        super(4);
        this.f24529b = list;
        this.f24530c = uVar;
    }

    @Override // fd.InterfaceC6512o
    public final Unit invoke(InterfaceC10165e interfaceC10165e, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
        int i11;
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
            Object obj = (S20.a) this.f24529b.get(intValue);
            interfaceC3967k2.o(330305811);
            if (obj instanceof a.g) {
                interfaceC3967k2.o(2088865518);
                J20.t.a(0, interfaceC3967k2, null, ((a.g) obj).a());
                interfaceC3967k2.k();
            } else if (obj instanceof a.C0509a) {
                interfaceC3967k2.o(2088867431);
                C3373c.a((a.C0509a) obj, interfaceC3967k2);
                interfaceC3967k2.k();
            } else if (obj instanceof a.b) {
                interfaceC3967k2.o(2088869160);
                C3376f.a((a.b) obj, null, interfaceC3967k2, 0);
                interfaceC3967k2.k();
            } else if (obj instanceof a.c) {
                interfaceC3967k2.o(2088870953);
                C3378h.a((a.c) obj, interfaceC3967k2);
                interfaceC3967k2.k();
            } else if (obj instanceof a.e) {
                interfaceC3967k2.o(2088872678);
                J20.p.a((a.e) obj, interfaceC3967k2);
                interfaceC3967k2.k();
            } else {
                boolean z11 = obj instanceof a.i;
                u uVar = this.f24530c;
                if (z11) {
                    interfaceC3967k2.o(2088874642);
                    a.i iVar = (a.i) obj;
                    interfaceC3967k2.o(2088877750);
                    boolean F11 = interfaceC3967k2.F(uVar) | interfaceC3967k2.n(obj);
                    Object C11 = interfaceC3967k2.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new k(uVar, (a.i) obj);
                        interfaceC3967k2.x(C11);
                    }
                    interfaceC3967k2.k();
                    D.b(iVar, null, (Function1) C11, interfaceC3967k2, 0);
                    interfaceC3967k2.k();
                } else if (obj instanceof a.h) {
                    interfaceC3967k2.o(2088880810);
                    a.h hVar = (a.h) obj;
                    interfaceC3967k2.o(2088883670);
                    boolean F12 = interfaceC3967k2.F(uVar) | interfaceC3967k2.n(obj);
                    Object C12 = interfaceC3967k2.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new l(uVar, (a.h) obj);
                        interfaceC3967k2.x(C12);
                    }
                    interfaceC3967k2.k();
                    y.a(hVar, (Function1) C12, null, null, interfaceC3967k2, 0);
                    interfaceC3967k2.k();
                } else if (obj instanceof a.j) {
                    interfaceC3967k2.o(2088886764);
                    a.j jVar = (a.j) obj;
                    interfaceC3967k2.o(2088889655);
                    boolean F13 = interfaceC3967k2.F(uVar) | interfaceC3967k2.n(obj);
                    Object C13 = interfaceC3967k2.C();
                    if (F13 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new m(uVar, (a.j) obj);
                        interfaceC3967k2.x(C13);
                    }
                    interfaceC3967k2.k();
                    H.a(jVar, (Function1) C13, null, interfaceC3967k2, 0);
                    interfaceC3967k2.k();
                } else if (obj instanceof a.d) {
                    interfaceC3967k2.o(2088893044);
                    J20.j.a((a.d) obj, null, interfaceC3967k2, 0);
                    interfaceC3967k2.k();
                } else {
                    if (!(obj instanceof a.f)) {
                        throw U7.l.c(interfaceC3967k2, 2088865008);
                    }
                    interfaceC3967k2.o(2088895308);
                    J20.r.a((a.f) obj, null, interfaceC3967k2, 0);
                    interfaceC3967k2.k();
                }
            }
            interfaceC3967k2.k();
        }
        return Unit.f71690a;
    }
}

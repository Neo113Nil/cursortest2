package J0;

import B0.C2454a;
import D1.InterfaceC2801g;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import i1.C6981a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import m3.C8060b;

/* renamed from: J0.a3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3267a3 extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f13131b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ T2 f13132c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f13133d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f13134e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3267a3(float f7, T2 t2, boolean z11, C4912a c4912a) {
        super(3);
        this.f13131b = f7;
        this.f13132c = t2;
        this.f13133d = z11;
        this.f13134e = c4912a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd.InterfaceC6511n
    public final Unit invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        androidx.compose.ui.e eVar2 = eVar;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.n(eVar2) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e a11 = C6981a.a(eVar2, this.f13131b);
            B1.V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = interfaceC3967k2.I();
            S0.A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, a11);
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
            Function2 d12 = C2454a.d(interfaceC3967k2, f7, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(d12, I11, interfaceC3967k2, I11);
            }
            S0.F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
            j3.b(((C7807Z) this.f13132c.d(this.f13133d, interfaceC3967k2).getValue()).w(), ((D3) interfaceC3967k2.m(E3.c())).f(), this.f13134e, interfaceC3967k2, 0, 4);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}

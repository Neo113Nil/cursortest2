package androidx.compose.foundation.lazy.layout;

import B1.W;
import B1.v0;
import B1.y0;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import b1.InterfaceC5505h;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import x0.C10584M;
import x0.InterfaceC10573B;
import x0.f0;
import x0.g0;

/* loaded from: classes.dex */
final class l extends AbstractC7737t implements InterfaceC6511n<InterfaceC5505h, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f39655b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f39656c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC10573B, Z1.b, W> f39657d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f39658e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(o oVar, androidx.compose.ui.e eVar, Function2 function2, InterfaceC3978p0 interfaceC3978p0) {
        super(3);
        this.f39655b = oVar;
        this.f39656c = eVar;
        this.f39657d = function2;
        this.f39658e = interfaceC3978p0;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC5505h interfaceC5505h, InterfaceC3967k interfaceC3967k, Integer num) {
        androidx.compose.ui.e l02;
        InterfaceC5505h interfaceC5505h2 = interfaceC5505h;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        Object C11 = interfaceC3967k2.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = new f(interfaceC5505h2, new k(this.f39658e));
            interfaceC3967k2.x(C11);
        }
        f fVar = (f) C11;
        Object C12 = interfaceC3967k2.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = new y0(new g(fVar));
            interfaceC3967k2.x(C12);
        }
        y0 y0Var = (y0) C12;
        o oVar = this.f39655b;
        if (oVar != null) {
            interfaceC3967k2.o(205264983);
            f0 d11 = oVar.d();
            if (d11 == null) {
                interfaceC3967k2.o(6622915);
                d11 = g0.a(interfaceC3967k2);
            } else {
                interfaceC3967k2.o(6621830);
            }
            interfaceC3967k2.k();
            Object[] objArr = {oVar, fVar, y0Var, d11};
            boolean n11 = interfaceC3967k2.n(oVar) | interfaceC3967k2.F(fVar) | interfaceC3967k2.F(y0Var) | interfaceC3967k2.F(d11);
            Object C13 = interfaceC3967k2.C();
            if (n11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new i(oVar, fVar, y0Var, d11);
                interfaceC3967k2.x(C13);
            }
            Q.d(objArr, (Function1) C13, interfaceC3967k2);
            interfaceC3967k2.k();
        } else {
            interfaceC3967k2.o(205858881);
            interfaceC3967k2.k();
        }
        int i11 = C10584M.f104688b;
        androidx.compose.ui.e eVar = this.f39656c;
        if (oVar != null && (l02 = eVar.l0(new TraversablePrefetchStateModifierElement(oVar))) != null) {
            eVar = l02;
        }
        boolean n12 = interfaceC3967k2.n(fVar);
        Function2<InterfaceC10573B, Z1.b, W> function2 = this.f39657d;
        boolean n13 = n12 | interfaceC3967k2.n(function2);
        Object C14 = interfaceC3967k2.C();
        if (n13 || C14 == InterfaceC3967k.a.a()) {
            C14 = new j(fVar, function2);
            interfaceC3967k2.x(C14);
        }
        v0.a(y0Var, eVar, (Function2) C14, interfaceC3967k2, 8);
        return Unit.f71690a;
    }
}

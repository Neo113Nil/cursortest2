package J0;

import S0.InterfaceC3978p0;
import bc.C5637m;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.e0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3284e0 extends AbstractC7737t implements Function2<Z1.o, Z1.o, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<l1.N0> f13195b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3284e0(InterfaceC3978p0<l1.N0> interfaceC3978p0) {
        super(2);
        this.f13195b = interfaceC3978p0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Unit invoke(Z1.o oVar, Z1.o oVar2) {
        float min;
        Z1.o oVar3 = oVar;
        Z1.o oVar4 = oVar2;
        int i11 = C3314l1.f13282h;
        float f7 = 1.0f;
        if (oVar4.e() < oVar3.f()) {
            if (oVar4.f() <= oVar3.e()) {
                min = 1.0f;
            } else if (oVar4.i() != 0) {
                min = (((Math.min(oVar3.f(), oVar4.f()) + Math.max(oVar3.e(), oVar4.e())) / 2) - oVar4.e()) / oVar4.i();
            }
            if (oVar4.g() < oVar3.c()) {
                if (oVar4.c() > oVar3.g()) {
                    if (oVar4.d() != 0) {
                        f7 = (((Math.min(oVar3.c(), oVar4.c()) + Math.max(oVar3.g(), oVar4.g())) / 2) - oVar4.g()) / oVar4.d();
                    }
                }
                this.f13195b.setValue(l1.N0.b(C5637m.a(min, f7)));
                return Unit.f71690a;
            }
            f7 = 0.0f;
            this.f13195b.setValue(l1.N0.b(C5637m.a(min, f7)));
            return Unit.f71690a;
        }
        min = 0.0f;
        if (oVar4.g() < oVar3.c()) {
        }
        f7 = 0.0f;
        this.f13195b.setValue(l1.N0.b(C5637m.a(min, f7)));
        return Unit.f71690a;
    }
}

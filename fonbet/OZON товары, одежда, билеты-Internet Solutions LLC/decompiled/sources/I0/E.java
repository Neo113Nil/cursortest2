package I0;

import I0.C3220z;
import I0.F;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final /* synthetic */ class E implements F {
    @Override // I0.F
    public final C3220z a(InterfaceC3198n0 interfaceC3198n0) {
        C3220z.a b11;
        C3220z.a b12;
        C3220z.a d11;
        C3220z.a aVar;
        C3220z e11 = interfaceC3198n0.e();
        if (e11 == null) {
            return I.a(interfaceC3198n0, F.a.b.f11312a);
        }
        if (interfaceC3198n0.a()) {
            b11 = e11.d();
            b12 = I.b(interfaceC3198n0, interfaceC3198n0.g(), b11);
            aVar = e11.b();
            d11 = b12;
        } else {
            b11 = e11.b();
            b12 = I.b(interfaceC3198n0, interfaceC3198n0.f(), b11);
            d11 = e11.d();
            aVar = b12;
        }
        if (Intrinsics.d(b12, b11)) {
            return e11;
        }
        return I.d(new C3220z(d11, aVar, interfaceC3198n0.c() == EnumC3195m.CROSSED || (interfaceC3198n0.c() == EnumC3195m.COLLAPSED && d11.c() > aVar.c())), interfaceC3198n0);
    }
}

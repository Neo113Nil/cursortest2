package H4;

import G0.C0051a;
import k4.C1224j;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final C0051a f1201a = new C0051a("NULL", 2);

    public static /* synthetic */ G4.d a(q qVar, E4.e eVar, int i2, int i3, int i6) {
        InterfaceC1223i interfaceC1223i = eVar;
        if ((i6 & 1) != 0) {
            interfaceC1223i = C1224j.f10720a;
        }
        if ((i6 & 2) != 0) {
            i2 = -3;
        }
        if ((i6 & 4) != 0) {
            i3 = 1;
        }
        return qVar.a(interfaceC1223i, i2, i3);
    }

    public static final Object b(InterfaceC1223i interfaceC1223i, Object obj, Object obj2, InterfaceC1445p interfaceC1445p, InterfaceC1218d frame) {
        Object n6 = I4.a.n(interfaceC1223i, obj2);
        try {
            A a6 = new A(frame, interfaceC1223i);
            kotlin.jvm.internal.v.b(2, interfaceC1445p);
            Object invoke = interfaceC1445p.invoke(obj, a6);
            I4.a.h(interfaceC1223i, n6);
            if (invoke == EnumC1260a.f11058a) {
                kotlin.jvm.internal.i.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            I4.a.h(interfaceC1223i, n6);
            throw th;
        }
    }
}

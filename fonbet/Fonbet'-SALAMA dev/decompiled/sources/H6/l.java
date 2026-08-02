package H6;

import D6.t0;
import F2.W0;
import i6.C1293j;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final W0 f3444a = new W0("NULL", 1);

    public static /* synthetic */ G6.g a(j jVar, t0 t0Var, int i7, int i8, int i9) {
        InterfaceC1292i interfaceC1292i = t0Var;
        if ((i9 & 1) != 0) {
            interfaceC1292i = C1293j.f14068a;
        }
        if ((i9 & 2) != 0) {
            i7 = -3;
        }
        if ((i9 & 4) != 0) {
            i8 = 1;
        }
        return jVar.t(interfaceC1292i, i7, i8);
    }

    public static final Object b(InterfaceC1292i interfaceC1292i, Object obj, Object obj2, Function2 function2, InterfaceC1287d interfaceC1287d) {
        Object m7 = I6.a.m(interfaceC1292i, obj2);
        try {
            s sVar = new s(interfaceC1287d, interfaceC1292i);
            t6.s.a(2, function2);
            Object invoke = function2.invoke(obj, sVar);
            I6.a.g(interfaceC1292i, m7);
            if (invoke == j6.a.f14642a) {
                t6.h.e(interfaceC1287d, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            I6.a.g(interfaceC1292i, m7);
            throw th;
        }
    }
}

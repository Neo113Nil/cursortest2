package Ae;

import Sc.C4001c;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import kotlin.Unit;

/* loaded from: classes.dex */
final /* synthetic */ class B {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(T0 t02, InterfaceC6511n interfaceC6511n, Throwable th2, kotlin.coroutines.jvm.internal.c cVar) {
        C2424y c2424y;
        int i11;
        try {
            if (cVar instanceof C2424y) {
                c2424y = (C2424y) cVar;
                int i12 = c2424y.f1167f;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c2424y.f1167f = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c2424y.f1166e;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c2424y.f1167f;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        c2424y.f1165d = th2;
                        c2424y.f1167f = 1;
                        if (interfaceC6511n.invoke(t02, th2, c2424y) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = c2424y.f1165d;
                        Sc.s.b(obj);
                    }
                    return Unit.f71690a;
                }
            }
            if (i11 != 0) {
            }
            return Unit.f71690a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                C4001c.a(th3, th2);
            }
            throw th3;
        }
        c2424y = new C2424y(cVar);
        Object obj2 = c2424y.f1166e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c2424y.f1167f;
    }
}

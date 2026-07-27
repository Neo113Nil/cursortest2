package A2;

import B2.v;
import g2.InterfaceC0319c;
import h2.EnumC0326a;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final v f108a = new v("NULL");

    public static /* synthetic */ z2.d a(j jVar, x2.c cVar, int i3, int i4, int i5) {
        g2.h hVar = cVar;
        if ((i5 & 1) != 0) {
            hVar = g2.i.f4981a;
        }
        if ((i5 & 2) != 0) {
            i3 = -3;
        }
        if ((i5 & 4) != 0) {
            i4 = 1;
        }
        return jVar.p(hVar, i3, i4);
    }

    public static final Object b(g2.h hVar, Object obj, Object obj2, o2.p pVar, InterfaceC0319c frame) {
        Object l3 = B2.a.l(hVar, obj2);
        try {
            s sVar = new s(frame, hVar);
            kotlin.jvm.internal.t.a(2, pVar);
            Object invoke = pVar.invoke(obj, sVar);
            B2.a.f(hVar, l3);
            if (invoke == EnumC0326a.f4994a) {
                kotlin.jvm.internal.j.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            B2.a.f(hVar, l3);
            throw th;
        }
    }
}

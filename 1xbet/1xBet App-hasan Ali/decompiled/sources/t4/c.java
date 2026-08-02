package t4;

import b4.EnumC0510a;
import n.AbstractC2107A;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a4.c[] f19595a = new a4.c[0];

    /* renamed from: b, reason: collision with root package name */
    public static final H3.g f19596b = new H3.g("NULL", 5);

    public static final Object a(a4.h hVar, Object obj, Object obj2, i4.e eVar, a4.c cVar) {
        Object invoke;
        Object l5 = u4.a.l(hVar, obj2);
        try {
            x xVar = new x(cVar, hVar);
            if (AbstractC2107A.A(eVar)) {
                kotlin.jvm.internal.z.b(2, eVar);
                invoke = eVar.invoke(obj, xVar);
            } else {
                invoke = AbstractC2346c.J(eVar, obj, xVar);
            }
            u4.a.g(hVar, l5);
            if (invoke == EnumC0510a.f7289k) {
                kotlin.jvm.internal.l.f("frame", cVar);
            }
            return invoke;
        } catch (Throwable th) {
            u4.a.g(hVar, l5);
            throw th;
        }
    }
}

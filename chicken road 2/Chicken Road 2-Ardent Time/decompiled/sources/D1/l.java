package D1;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final C.j f240a = new C.j(3, "NULL");

    public static /* synthetic */ C1.d a(D1.j jVar, A1.c cVar, int i2, int i3, int i4) {
        k1.i iVar = cVar;
        if ((i4 & 1) != 0) {
            iVar = k1.j.f7951a;
        }
        if ((i4 & 2) != 0) {
            i2 = -3;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return jVar.n(iVar, i2, i3);
    }

    public static final java.lang.Object b(k1.i iVar, java.lang.Object obj, java.lang.Object obj2, s1.p pVar, k1.d frame) {
        java.lang.Object m2 = E1.AbstractC0000a.m(iVar, obj2);
        try {
            D1.s sVar = new D1.s(frame, iVar);
            kotlin.jvm.internal.s.a(2, pVar);
            java.lang.Object invoke = pVar.invoke(obj, sVar);
            E1.AbstractC0000a.g(iVar, m2);
            if (invoke == l1.EnumC0927a.f8017a) {
                kotlin.jvm.internal.i.e(frame, "frame");
            }
            return invoke;
        } catch (java.lang.Throwable th) {
            E1.AbstractC0000a.g(iVar, m2);
            throw th;
        }
    }
}

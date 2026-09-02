package o0;

import a.AbstractC0018a;
import m0.C0048e;
import m0.C0060q;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1088a = new i();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(r rVar, w.i iVar, a0.b bVar) {
        o oVar;
        int i2;
        try {
            if (bVar instanceof o) {
                oVar = (o) bVar;
                int i3 = oVar.f1094g;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    oVar.f1094g = i3 - Integer.MIN_VALUE;
                    Object obj = oVar.f1093f;
                    i2 = oVar.f1094g;
                    if (i2 != 0) {
                        AbstractC0018a.C(obj);
                        Y.i iVar2 = oVar.f419c;
                        g0.h.b(iVar2);
                        if (iVar2.d(C0060q.f943c) != rVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        oVar.f1092e = iVar;
                        oVar.f1094g = 1;
                        C0048e c0048e = new C0048e(AbstractC0018a.n(oVar), 1);
                        c0048e.q();
                        ((q) rVar).N(new p(c0048e));
                        Object p2 = c0048e.p();
                        Z.a aVar = Z.a.f411b;
                        if (p2 == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iVar = oVar.f1092e;
                        AbstractC0018a.C(obj);
                    }
                    iVar.a();
                    return W.g.f394a;
                }
            }
            if (i2 != 0) {
            }
            iVar.a();
            return W.g.f394a;
        } catch (Throwable th) {
            iVar.a();
            throw th;
        }
        oVar = new o(bVar);
        Object obj2 = oVar.f1093f;
        i2 = oVar.f1094g;
    }
}

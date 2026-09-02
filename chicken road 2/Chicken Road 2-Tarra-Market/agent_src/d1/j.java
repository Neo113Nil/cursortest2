package d1;

import a.AbstractC0009a;
import b1.C0017e;
import b1.C0029q;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f939a = new i();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v5, types: [U0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(r rVar, A.j jVar, O0.b bVar) {
        o oVar;
        int i2;
        try {
            if (bVar instanceof o) {
                oVar = (o) bVar;
                int i3 = oVar.f946f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    oVar.f946f = i3 - Integer.MIN_VALUE;
                    Object obj = oVar.f945e;
                    N0.a aVar = N0.a.f260a;
                    i2 = oVar.f946f;
                    if (i2 != 0) {
                        V.a.C(obj);
                        M0.i iVar = oVar.f277b;
                        kotlin.jvm.internal.j.b(iVar);
                        if (iVar.i(C0029q.f679b) != rVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        oVar.f944d = jVar;
                        oVar.f946f = 1;
                        C0017e c0017e = new C0017e(AbstractC0009a.r(oVar), 1);
                        c0017e.p();
                        ((q) rVar).M(new p(c0017e));
                        jVar = jVar;
                        if (c0017e.o() == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r5 = oVar.f944d;
                        V.a.C(obj);
                        jVar = r5;
                    }
                    jVar.invoke();
                    return K0.i.f206a;
                }
            }
            if (i2 != 0) {
            }
            jVar.invoke();
            return K0.i.f206a;
        } catch (Throwable th) {
            jVar.invoke();
            throw th;
        }
        oVar = new o(bVar);
        Object obj2 = oVar.f945e;
        N0.a aVar2 = N0.a.f260a;
        i2 = oVar.f946f;
    }
}

package B;

import A0.C0022e0;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Y.c f698a;

    /* renamed from: b, reason: collision with root package name */
    public final A.m f699b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f700c = new LinkedHashMap();

    public q(Y.c cVar, A.m mVar) {
        this.f698a = cVar;
        this.f699b = mVar;
    }

    public final i4.e a(int i, Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = this.f700c;
        p pVar = (p) linkedHashMap.get(obj);
        if (pVar != null && pVar.f695c == i && kotlin.jvm.internal.l.a(pVar.f694b, obj2)) {
            X.d dVar = pVar.f696d;
            if (dVar != null) {
                return dVar;
            }
            X.d dVar2 = new X.d(1403994769, new C0022e0(1, pVar.f697e, pVar), true);
            pVar.f696d = dVar2;
            return dVar2;
        }
        p pVar2 = new p(this, i, obj, obj2);
        linkedHashMap.put(obj, pVar2);
        X.d dVar3 = pVar2.f696d;
        if (dVar3 != null) {
            return dVar3;
        }
        X.d dVar4 = new X.d(1403994769, new C0022e0(1, this, pVar2), true);
        pVar2.f696d = dVar4;
        return dVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = (p) this.f700c.get(obj);
        if (pVar != null) {
            return pVar.f694b;
        }
        A.k kVar = (A.k) this.f699b.invoke();
        int b3 = kVar.f61d.b(obj);
        if (b3 != -1) {
            return kVar.b(b3);
        }
        return null;
    }
}

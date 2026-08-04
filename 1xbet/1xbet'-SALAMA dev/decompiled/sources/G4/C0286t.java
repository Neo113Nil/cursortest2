package G4;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: G4.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0286t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C0286t f3023b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3024a;

    public C0286t(int i7) {
        switch (i7) {
            case 1:
                this.f3024a = new HashMap();
                break;
            case 2:
                this.f3024a = new HashMap();
                break;
            default:
                this.f3024a = new HashMap();
                break;
        }
    }

    public static C0286t b() {
        if (f3023b == null) {
            f3023b = new C0286t(1);
        }
        return f3023b;
    }

    public boolean a(H4.m mVar) {
        p113p3.f.O("Expected a collection path.", mVar.f3312a.size() % 2 == 1, new Object[0]);
        String strH = mVar.h();
        H4.m mVar2 = (H4.m) mVar.t();
        HashMap map = this.f3024a;
        HashSet hashSet = (HashSet) map.get(strH);
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(strH, hashSet);
        }
        return hashSet.add(mVar2);
    }

    public void c(String str, p128r5.b bVar) {
        HashMap map = this.f3024a;
        if (bVar != null) {
            map.put(str, bVar);
        } else {
            map.remove(str);
        }
    }

    public void d(p134s4.c cVar) {
        int i7 = cVar.f16159a;
        p120q4.k.b("Only child changes supported for tracking", i7 == 2 || i7 == 4 || i7 == 1);
        v4.c cVar2 = v4.c.f17177d;
        v4.c cVar3 = cVar.f16162d;
        p120q4.k.c(!cVar3.equals(cVar2));
        HashMap map = this.f3024a;
        if (!map.containsKey(cVar3)) {
            map.put(cVar3, cVar);
            return;
        }
        p134s4.c cVar4 = (p134s4.c) map.get(cVar3);
        int i8 = cVar4.f16159a;
        v4.l lVar = cVar.f16160b;
        if (i7 == 2 && i8 == 1) {
            map.put(cVar3, new p134s4.c(4, lVar, cVar3, null, cVar4.f16160b));
            return;
        }
        if (i7 == 1 && i8 == 2) {
            map.remove(cVar3);
            return;
        }
        v4.l lVar2 = cVar4.f16161c;
        if (i7 == 1 && i8 == 4) {
            map.put(cVar3, new p134s4.c(1, lVar2, cVar3, null, null));
            return;
        }
        if (i7 == 4 && i8 == 2) {
            map.put(cVar3, new p134s4.c(2, lVar, cVar3, null, null));
            return;
        }
        if (i7 == 4 && i8 == 4) {
            map.put(cVar3, new p134s4.c(4, lVar, cVar3, null, lVar2));
            return;
        }
        throw new IllegalStateException("Illegal combination of changes: " + cVar + " occurred after " + cVar4);
    }
}

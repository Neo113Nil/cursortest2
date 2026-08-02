package G4;

import java.util.HashMap;
import java.util.HashSet;
import r5.C1577b;
import s4.C1595c;

/* renamed from: G4.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0286t {

    /* renamed from: b, reason: collision with root package name */
    public static C0286t f3023b;

    /* renamed from: a, reason: collision with root package name */
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
        p3.f.O("Expected a collection path.", mVar.f3312a.size() % 2 == 1, new Object[0]);
        String h6 = mVar.h();
        H4.m mVar2 = (H4.m) mVar.t();
        HashMap hashMap = this.f3024a;
        HashSet hashSet = (HashSet) hashMap.get(h6);
        if (hashSet == null) {
            hashSet = new HashSet();
            hashMap.put(h6, hashSet);
        }
        return hashSet.add(mVar2);
    }

    public void c(String str, C1577b c1577b) {
        HashMap hashMap = this.f3024a;
        if (c1577b != null) {
            hashMap.put(str, c1577b);
        } else {
            hashMap.remove(str);
        }
    }

    public void d(C1595c c1595c) {
        int i7 = c1595c.f16153a;
        q4.k.b("Only child changes supported for tracking", i7 == 2 || i7 == 4 || i7 == 1);
        v4.c cVar = v4.c.f17171d;
        v4.c cVar2 = c1595c.f16156d;
        q4.k.c(!cVar2.equals(cVar));
        HashMap hashMap = this.f3024a;
        if (!hashMap.containsKey(cVar2)) {
            hashMap.put(cVar2, c1595c);
            return;
        }
        C1595c c1595c2 = (C1595c) hashMap.get(cVar2);
        int i8 = c1595c2.f16153a;
        v4.l lVar = c1595c.f16154b;
        if (i7 == 2 && i8 == 1) {
            hashMap.put(cVar2, new C1595c(4, lVar, cVar2, null, c1595c2.f16154b));
            return;
        }
        if (i7 == 1 && i8 == 2) {
            hashMap.remove(cVar2);
            return;
        }
        v4.l lVar2 = c1595c2.f16155c;
        if (i7 == 1 && i8 == 4) {
            hashMap.put(cVar2, new C1595c(1, lVar2, cVar2, null, null));
            return;
        }
        if (i7 == 4 && i8 == 2) {
            hashMap.put(cVar2, new C1595c(2, lVar, cVar2, null, null));
            return;
        }
        if (i7 == 4 && i8 == 4) {
            hashMap.put(cVar2, new C1595c(4, lVar, cVar2, null, lVar2));
            return;
        }
        throw new IllegalStateException("Illegal combination of changes: " + c1595c + " occurred after " + c1595c2);
    }
}

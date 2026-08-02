package I4;

import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class m extends h {

    /* renamed from: d, reason: collision with root package name */
    public final H4.l f3686d;

    /* renamed from: e, reason: collision with root package name */
    public final f f3687e;

    public m(H4.h hVar, H4.l lVar, f fVar, n nVar) {
        this(hVar, lVar, fVar, nVar, new ArrayList());
    }

    @Override // I4.h
    public final f a(H4.k kVar, f fVar, Timestamp timestamp) {
        j(kVar);
        if (!this.f3671b.b(kVar)) {
            return fVar;
        }
        HashMap h6 = h(timestamp, kVar);
        HashMap k7 = k();
        H4.l lVar = kVar.f3327e;
        lVar.h(k7);
        lVar.h(h6);
        kVar.a(kVar.f3325c, kVar.f3327e);
        kVar.f3328f = 1;
        kVar.f3325c = H4.n.f3332b;
        if (fVar == null) {
            return null;
        }
        HashSet hashSet = new HashSet(fVar.f3667a);
        hashSet.addAll(this.f3687e.f3667a);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f3672c.iterator();
        while (it.hasNext()) {
            arrayList.add(((g) it.next()).f3668a);
        }
        hashSet.addAll(arrayList);
        return new f(hashSet);
    }

    @Override // I4.h
    public final void b(H4.k kVar, k kVar2) {
        j(kVar);
        if (!this.f3671b.b(kVar)) {
            kVar.f3325c = kVar2.f3683a;
            kVar.f3324b = 4;
            kVar.f3327e = new H4.l();
            kVar.f3328f = 2;
            return;
        }
        HashMap i7 = i(kVar, kVar2.f3684b);
        H4.l lVar = kVar.f3327e;
        lVar.h(k());
        lVar.h(i7);
        kVar.a(kVar2.f3683a, kVar.f3327e);
        kVar.f3328f = 2;
    }

    @Override // I4.h
    public final f d() {
        return this.f3687e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return e(mVar) && this.f3686d.equals(mVar.f3686d) && this.f3672c.equals(mVar.f3672c);
    }

    public final int hashCode() {
        return this.f3686d.hashCode() + (f() * 31);
    }

    public final HashMap k() {
        HashMap hashMap = new HashMap();
        Iterator it = this.f3687e.f3667a.iterator();
        while (it.hasNext()) {
            H4.j jVar = (H4.j) it.next();
            if (!jVar.isEmpty()) {
                hashMap.put(jVar, this.f3686d.f(jVar));
            }
        }
        return hashMap;
    }

    public final String toString() {
        return "PatchMutation{" + g() + ", mask=" + this.f3687e + ", value=" + this.f3686d + "}";
    }

    public m(H4.h hVar, H4.l lVar, f fVar, n nVar, List list) {
        super(hVar, nVar, list);
        this.f3686d = lVar;
        this.f3687e = fVar;
    }
}

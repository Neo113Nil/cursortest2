package I4;

import Y4.I0;
import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final H4.h f3670a;

    /* renamed from: b, reason: collision with root package name */
    public final n f3671b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3672c;

    public h(H4.h hVar, n nVar) {
        this(hVar, nVar, new ArrayList());
    }

    public static h c(H4.k kVar, f fVar) {
        if (!kVar.c()) {
            return null;
        }
        if (fVar != null && fVar.f3667a.isEmpty()) {
            return null;
        }
        H4.h hVar = kVar.f3323a;
        if (fVar == null) {
            return kVar.e() ? new e(hVar, n.f3688c) : new p(hVar, kVar.f3327e, n.f3688c, new ArrayList());
        }
        H4.l lVar = kVar.f3327e;
        H4.l lVar2 = new H4.l();
        HashSet hashSet = new HashSet();
        Iterator it = fVar.f3667a.iterator();
        while (it.hasNext()) {
            H4.j jVar = (H4.j) it.next();
            if (!hashSet.contains(jVar)) {
                if (lVar.f(jVar) == null && jVar.f3312a.size() > 1) {
                    jVar = (H4.j) jVar.t();
                }
                lVar2.g(jVar, lVar.f(jVar));
                hashSet.add(jVar);
            }
        }
        return new m(hVar, lVar2, new f(hashSet), n.f3688c);
    }

    public abstract f a(H4.k kVar, f fVar, Timestamp timestamp);

    public abstract void b(H4.k kVar, k kVar2);

    public abstract f d();

    public final boolean e(h hVar) {
        return this.f3670a.equals(hVar.f3670a) && this.f3671b.equals(hVar.f3671b);
    }

    public final int f() {
        return this.f3671b.hashCode() + (this.f3670a.f3318a.hashCode() * 31);
    }

    public final String g() {
        return "key=" + this.f3670a + ", precondition=" + this.f3671b;
    }

    public final HashMap h(Timestamp timestamp, H4.k kVar) {
        List<g> list = this.f3672c;
        HashMap hashMap = new HashMap(list.size());
        for (g gVar : list) {
            q qVar = gVar.f3669b;
            H4.l lVar = kVar.f3327e;
            H4.j jVar = gVar.f3668a;
            hashMap.put(jVar, qVar.a(lVar.f(jVar), timestamp));
        }
        return hashMap;
    }

    public final HashMap i(H4.k kVar, ArrayList arrayList) {
        List list = this.f3672c;
        HashMap hashMap = new HashMap(list.size());
        p3.f.O("server transform count (%d) should match field transform count (%d)", list.size() == arrayList.size(), Integer.valueOf(arrayList.size()), Integer.valueOf(list.size()));
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            g gVar = (g) list.get(i7);
            q qVar = gVar.f3669b;
            H4.l lVar = kVar.f3327e;
            H4.j jVar = gVar.f3668a;
            hashMap.put(jVar, qVar.c(lVar.f(jVar), (I0) arrayList.get(i7)));
        }
        return hashMap;
    }

    public final void j(H4.k kVar) {
        p3.f.O("Can only apply a mutation to a document with the same key", kVar.f3323a.equals(this.f3670a), new Object[0]);
    }

    public h(H4.h hVar, n nVar, List list) {
        this.f3670a = hVar;
        this.f3671b = nVar;
        this.f3672c = list;
    }
}

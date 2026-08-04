package D4;

import B4.E;
import B4.S;
import E4.C;
import G4.C0279l;
import G4.RunnableC0278k;
import G4.Z;
import H4.k;
import H4.m;
import H4.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f1743b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f1748g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1744c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p075k4.c f1746e = H4.g.f3315a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f1745d = new HashMap();

    public d(a aVar, e eVar) {
        this.f1742a = aVar;
        this.f1743b = eVar;
    }

    public final S a(c cVar, long j) {
        p003a.a.e("Unexpected bundle metadata element.", !(cVar instanceof e), new Object[0]);
        int size = this.f1746e.size();
        if (cVar instanceof i) {
            this.f1744c.add((i) cVar);
        } else if (cVar instanceof g) {
            g gVar = (g) cVar;
            HashMap map = this.f1745d;
            H4.h hVar = gVar.f1760a;
            map.put(hVar, gVar);
            this.f1748g = gVar;
            if (!gVar.f1762c) {
                p075k4.c cVar2 = this.f1746e;
                n nVar = gVar.f1761b;
                k kVarH = k.h(hVar, nVar);
                kVarH.f3326d = nVar;
                this.f1746e = cVar2.D(hVar, kVarH);
                this.f1748g = null;
            }
        } else if (cVar instanceof b) {
            b bVar = (b) cVar;
            g gVar2 = this.f1748g;
            if (gVar2 != null) {
                if (bVar.f1741a.f3323a.equals(gVar2.f1760a)) {
                    p075k4.c cVar3 = this.f1746e;
                    k kVar = bVar.f1741a;
                    kVar.f3326d = this.f1748g.f1761b;
                    this.f1746e = cVar3.D(kVar.f3323a, kVar);
                    this.f1748g = null;
                }
            }
            throw new IllegalArgumentException("The document being added does not match the stored metadata.");
        }
        this.f1747f += j;
        if (size == this.f1746e.size()) {
            return null;
        }
        int size2 = this.f1746e.size();
        e eVar = this.f1743b;
        return new S(size2, eVar.f1752d, this.f1747f, eVar.f1753e, null, 2);
    }

    public final p075k4.c b() {
        p003a.a.e("Bundled documents end with a document metadata element instead of a document.", this.f1748g == null, new Object[0]);
        e eVar = this.f1743b;
        String str = eVar.f1749a;
        p003a.a.e("Bundle ID must be set", str != null, new Object[0]);
        int size = this.f1746e.size();
        int i7 = eVar.f1752d;
        p003a.a.e("Expected %s documents, but loaded %s.", size == i7, Integer.valueOf(i7), Integer.valueOf(this.f1746e.size()));
        p075k4.c cVar = this.f1746e;
        C0279l c0279l = (C0279l) this.f1742a;
        E e7 = new E(c0279l, cVar, c0279l.a(new C(m.y("__bundle__/docs/" + str), null).i()), 2);
        P6.b bVar = c0279l.f2991a;
        p075k4.c cVar2 = (p075k4.c) bVar.G("Apply bundle documents", e7);
        HashMap map = new HashMap();
        ArrayList<i> arrayList = this.f1744c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.put(((i) it.next()).f1766a, H4.h.f3317c);
        }
        for (g gVar : this.f1745d.values()) {
            for (String str2 : gVar.f1763d) {
                map.put(str2, ((p075k4.e) map.get(str2)).l(gVar.f1760a));
            }
        }
        for (i iVar : arrayList) {
            p075k4.e eVar2 = (p075k4.e) map.get(iVar.f1766a);
            Z zA = c0279l.a(iVar.f1767b.f1764a);
            bVar.H(new RunnableC0278k(c0279l, iVar, zA, zA.f2954b, eVar2), "Saved named query");
        }
        bVar.H(new A0.f(13, c0279l, eVar), "Save bundle");
        return cVar2;
    }
}

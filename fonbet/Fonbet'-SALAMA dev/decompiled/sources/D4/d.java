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
import a.AbstractC0603a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k4.AbstractC1341c;
import k4.C1343e;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f1742a;

    /* renamed from: b, reason: collision with root package name */
    public final e f1743b;

    /* renamed from: f, reason: collision with root package name */
    public long f1747f;

    /* renamed from: g, reason: collision with root package name */
    public g f1748g;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1744c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1341c f1746e = H4.g.f3315a;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1745d = new HashMap();

    public d(a aVar, e eVar) {
        this.f1742a = aVar;
        this.f1743b = eVar;
    }

    public final S a(c cVar, long j) {
        AbstractC0603a.e("Unexpected bundle metadata element.", !(cVar instanceof e), new Object[0]);
        int size = this.f1746e.size();
        if (cVar instanceof i) {
            this.f1744c.add((i) cVar);
        } else if (cVar instanceof g) {
            g gVar = (g) cVar;
            HashMap hashMap = this.f1745d;
            H4.h hVar = gVar.f1760a;
            hashMap.put(hVar, gVar);
            this.f1748g = gVar;
            if (!gVar.f1762c) {
                AbstractC1341c abstractC1341c = this.f1746e;
                n nVar = gVar.f1761b;
                k h6 = k.h(hVar, nVar);
                h6.f3326d = nVar;
                this.f1746e = abstractC1341c.D(hVar, h6);
                this.f1748g = null;
            }
        } else if (cVar instanceof b) {
            b bVar = (b) cVar;
            g gVar2 = this.f1748g;
            if (gVar2 != null) {
                if (bVar.f1741a.f3323a.equals(gVar2.f1760a)) {
                    AbstractC1341c abstractC1341c2 = this.f1746e;
                    k kVar = bVar.f1741a;
                    kVar.f3326d = this.f1748g.f1761b;
                    this.f1746e = abstractC1341c2.D(kVar.f3323a, kVar);
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

    public final AbstractC1341c b() {
        AbstractC0603a.e("Bundled documents end with a document metadata element instead of a document.", this.f1748g == null, new Object[0]);
        e eVar = this.f1743b;
        String str = eVar.f1749a;
        AbstractC0603a.e("Bundle ID must be set", str != null, new Object[0]);
        int size = this.f1746e.size();
        int i7 = eVar.f1752d;
        AbstractC0603a.e("Expected %s documents, but loaded %s.", size == i7, Integer.valueOf(i7), Integer.valueOf(this.f1746e.size()));
        AbstractC1341c abstractC1341c = this.f1746e;
        C0279l c0279l = (C0279l) this.f1742a;
        E e7 = new E(c0279l, abstractC1341c, c0279l.a(new C(m.y("__bundle__/docs/" + str), null).i()), 2);
        P6.b bVar = c0279l.f2991a;
        AbstractC1341c abstractC1341c2 = (AbstractC1341c) bVar.G("Apply bundle documents", e7);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.f1744c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.put(((i) it.next()).f1766a, H4.h.f3317c);
        }
        for (g gVar : this.f1745d.values()) {
            Iterator it2 = gVar.f1763d.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                hashMap.put(str2, ((C1343e) hashMap.get(str2)).l(gVar.f1760a));
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            i iVar = (i) it3.next();
            C1343e c1343e = (C1343e) hashMap.get(iVar.f1766a);
            Z a2 = c0279l.a(iVar.f1767b.f1764a);
            bVar.H(new RunnableC0278k(c0279l, iVar, a2, a2.f2954b, c1343e), "Saved named query");
        }
        bVar.H(new A0.f(13, c0279l, eVar), "Save bundle");
        return abstractC1341c2;
    }
}

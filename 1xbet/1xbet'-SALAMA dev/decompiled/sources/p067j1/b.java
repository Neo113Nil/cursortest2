package p067j1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p023d1.n;
import p060i1.c;
import p072k1.d;
import p088m1.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14552a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f14554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f14555d;

    public b(d dVar) {
        this.f14554c = dVar;
    }

    public abstract boolean a(i iVar);

    public abstract boolean b(Object obj);

    public final void c(Collection collection) {
        this.f14552a.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (a(iVar)) {
                this.f14552a.add(iVar.f15222a);
            }
        }
        if (this.f14552a.isEmpty()) {
            this.f14554c.b(this);
        } else {
            d dVar = this.f14554c;
            synchronized (dVar.f14672c) {
                try {
                    if (dVar.f14673d.add(this)) {
                        if (dVar.f14673d.size() == 1) {
                            dVar.f14674e = dVar.a();
                            n.d().b(d.f14669f, String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f14674e), new Throwable[0]);
                            dVar.d();
                        }
                        Object obj = dVar.f14674e;
                        this.f14553b = obj;
                        d(this.f14555d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f14555d, this.f14553b);
    }

    public final void d(c cVar, Object obj) {
        if (this.f14552a.isEmpty() || cVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList arrayList = this.f14552a;
            synchronized (cVar.f13842c) {
                p060i1.b bVar = cVar.f13840a;
                if (bVar != null) {
                    bVar.d(arrayList);
                }
            }
            return;
        }
        ArrayList<String> arrayList2 = this.f14552a;
        synchronized (cVar.f13842c) {
            try {
                ArrayList arrayList3 = new ArrayList();
                for (String str : arrayList2) {
                    if (cVar.a(str)) {
                        n.d().b(c.f13839d, "Constraints met for " + str, new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                p060i1.b bVar2 = cVar.f13840a;
                if (bVar2 != null) {
                    bVar2.f(arrayList3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

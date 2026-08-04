package p101o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f15532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f15533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f15534c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15535d = 0;

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f15535d != fVar.f15535d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f15532a, this.f15533b, 0);
        this.f15534c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public c l(Object obj) {
        c cVar = this.f15532a;
        while (cVar != null && !cVar.f15525a.equals(obj)) {
            cVar = cVar.f15527c;
        }
        return cVar;
    }

    public Object m(Object obj) {
        c cVarL = l(obj);
        if (cVarL == null) {
            return null;
        }
        this.f15535d--;
        WeakHashMap weakHashMap = this.f15534c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarL);
            }
        }
        c cVar = cVarL.f15528d;
        if (cVar != null) {
            cVar.f15527c = cVarL.f15527c;
        } else {
            this.f15532a = cVarL.f15527c;
        }
        c cVar2 = cVarL.f15527c;
        if (cVar2 != null) {
            cVar2.f15528d = cVar;
        } else {
            this.f15533b = cVar;
        }
        cVarL.f15527c = null;
        cVarL.f15528d = null;
        return cVarL.f15526b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}

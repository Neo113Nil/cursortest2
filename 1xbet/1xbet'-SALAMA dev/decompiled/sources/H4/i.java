package H4;

import E3.F;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p075k4.c f3319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p075k4.e f3320b;

    public i(p075k4.c cVar, p075k4.e eVar) {
        this.f3319a = cVar;
        this.f3320b = eVar;
    }

    public final boolean equals(Object obj) {
        F f7;
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f3319a.size() != iVar.f3319a.size()) {
            return false;
        }
        Iterator it = this.f3320b.iterator();
        Iterator it2 = iVar.f3320b.iterator();
        do {
            f7 = (F) it;
            if (!((Iterator) f7.f1994b).hasNext()) {
                return true;
            }
        } while (((k) f7.next()).equals((k) ((F) it2).next()));
        return false;
    }

    public final int hashCode() {
        Iterator it = this.f3320b.iterator();
        int iHashCode = 0;
        while (true) {
            F f7 = (F) it;
            if (!((Iterator) f7.f1994b).hasNext()) {
                return iHashCode;
            }
            k kVar = (k) f7.next();
            iHashCode = kVar.f3327e.hashCode() + ((kVar.f3323a.f3318a.hashCode() + (iHashCode * 31)) * 31);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f3320b.iterator();
    }

    public final i l(h hVar) {
        p075k4.c cVar = this.f3319a;
        k kVar = (k) cVar.m(hVar);
        return kVar == null ? this : new i(cVar.F(hVar), this.f3320b.t(kVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = this.f3320b.iterator();
        boolean z4 = true;
        while (true) {
            F f7 = (F) it;
            if (!((Iterator) f7.f1994b).hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            k kVar = (k) f7.next();
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append(kVar);
        }
    }
}

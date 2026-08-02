package H4;

import E3.F;
import java.util.Iterator;
import k4.AbstractC1341c;
import k4.C1343e;

/* loaded from: classes2.dex */
public final class i implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1341c f3319a;

    /* renamed from: b, reason: collision with root package name */
    public final C1343e f3320b;

    public i(AbstractC1341c abstractC1341c, C1343e c1343e) {
        this.f3319a = abstractC1341c;
        this.f3320b = c1343e;
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
        int i7 = 0;
        while (true) {
            F f7 = (F) it;
            if (!((Iterator) f7.f1994b).hasNext()) {
                return i7;
            }
            k kVar = (k) f7.next();
            i7 = kVar.f3327e.hashCode() + ((kVar.f3323a.f3318a.hashCode() + (i7 * 31)) * 31);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f3320b.iterator();
    }

    public final i l(h hVar) {
        AbstractC1341c abstractC1341c = this.f3319a;
        k kVar = (k) abstractC1341c.m(hVar);
        return kVar == null ? this : new i(abstractC1341c.F(hVar), this.f3320b.t(kVar));
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

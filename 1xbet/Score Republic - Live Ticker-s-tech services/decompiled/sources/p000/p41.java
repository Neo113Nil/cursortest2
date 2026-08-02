package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class p41 implements Iterable {

    /* JADX INFO: renamed from: j */
    public m41 f5982j;

    /* JADX INFO: renamed from: k */
    public m41 f5983k;

    /* JADX INFO: renamed from: l */
    public final WeakHashMap f5984l = new WeakHashMap();

    /* JADX INFO: renamed from: m */
    public int f5985m = 0;

    /* JADX INFO: renamed from: b */
    public m41 mo2353b(Object obj) {
        m41 m41Var = this.f5982j;
        while (m41Var != null && !m41Var.f4972j.equals(obj)) {
            m41Var = m41Var.f4974l;
        }
        return m41Var;
    }

    /* JADX INFO: renamed from: c */
    public Object mo2354c(Object obj) {
        m41 m41VarMo2353b = mo2353b(obj);
        if (m41VarMo2353b == null) {
            return null;
        }
        this.f5985m--;
        WeakHashMap weakHashMap = this.f5984l;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((o41) it.next()).mo3169a(m41VarMo2353b);
            }
        }
        m41 m41Var = m41VarMo2353b.f4975m;
        m41 m41Var2 = m41VarMo2353b.f4974l;
        if (m41Var != null) {
            m41Var.f4974l = m41Var2;
        } else {
            this.f5982j = m41Var2;
        }
        m41 m41Var3 = m41VarMo2353b.f4974l;
        if (m41Var3 != null) {
            m41Var3.f4975m = m41Var;
        } else {
            this.f5983k = m41Var;
        }
        m41VarMo2353b.f4974l = null;
        m41VarMo2353b.f4975m = null;
        return m41VarMo2353b.f4973k;
    }

    public final boolean equals(Object obj) {
        l41 l41Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p41)) {
            return false;
        }
        p41 p41Var = (p41) obj;
        if (this.f5985m != p41Var.f5985m) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = p41Var.iterator();
        while (true) {
            l41Var = (l41) it;
            if (!l41Var.hasNext()) {
                break;
            }
            l41 l41Var2 = (l41) it2;
            if (!l41Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) l41Var.next();
            Object next = l41Var2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (l41Var.hasNext() || ((l41) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            l41 l41Var = (l41) it;
            if (!l41Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) l41Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        l41 l41Var = new l41(this.f5982j, this.f5983k, 0);
        this.f5984l.put(l41Var, Boolean.FALSE);
        return l41Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            l41 l41Var = (l41) it;
            if (!l41Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) l41Var.next()).toString());
            if (l41Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}

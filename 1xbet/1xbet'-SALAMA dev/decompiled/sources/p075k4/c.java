package p075k4;

import H4.k;
import Q0.a;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements Iterable {
    public abstract Object A(Object obj);

    public abstract void B(a aVar);

    public abstract int C(k kVar);

    public abstract c D(Object obj, Object obj2);

    public abstract Iterator E(Object obj);

    public abstract c F(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!t().equals(cVar.t()) || size() != cVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = cVar.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = t().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    public abstract boolean isEmpty();

    public abstract boolean l(Object obj);

    public abstract Object m(Comparable comparable);

    public abstract int size();

    public abstract Comparator t();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator it = iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }

    public abstract Iterator w();

    public abstract Object y();

    public abstract Object z();
}

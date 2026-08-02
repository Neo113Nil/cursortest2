package k4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: k4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1341c implements Iterable {
    public abstract Object A(Object obj);

    public abstract void B(Q0.a aVar);

    public abstract int C(H4.k kVar);

    public abstract AbstractC1341c D(Object obj, Object obj2);

    public abstract Iterator E(Object obj);

    public abstract AbstractC1341c F(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1341c)) {
            return false;
        }
        AbstractC1341c abstractC1341c = (AbstractC1341c) obj;
        if (!t().equals(abstractC1341c.t()) || size() != abstractC1341c.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = abstractC1341c.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = t().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return hashCode;
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

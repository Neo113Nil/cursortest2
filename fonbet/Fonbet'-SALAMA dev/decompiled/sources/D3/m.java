package D3;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements l, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f1728a;

    public m(List list) {
        this.f1728a = list;
    }

    @Override // D3.l
    public final boolean apply(Object obj) {
        int i7 = 0;
        while (true) {
            List list = this.f1728a;
            if (i7 >= list.size()) {
                return true;
            }
            if (!((l) list.get(i7)).apply(obj)) {
                return false;
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f1728a.equals(((m) obj).f1728a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1728a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z4 = true;
        for (Object obj : this.f1728a) {
            if (!z4) {
                sb.append(',');
            }
            sb.append(obj);
            z4 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}

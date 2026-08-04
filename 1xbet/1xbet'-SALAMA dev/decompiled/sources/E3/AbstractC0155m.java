package E3;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: E3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0155m implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C0163v c0163v = (C0163v) this;
        if (p097n3.a.t(c0163v.f2072a, entry.getKey())) {
            return p097n3.a.t(c0163v.f2073b, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C0163v c0163v = (C0163v) this;
        Object obj = c0163v.f2072a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        List list = c0163v.f2073b;
        return iHashCode ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0163v c0163v = (C0163v) this;
        sb.append(c0163v.f2072a);
        sb.append("=");
        sb.append(c0163v.f2073b);
        return sb.toString();
    }
}

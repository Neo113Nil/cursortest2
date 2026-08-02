package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class x81 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: j */
    public final Comparable f8863j;

    /* JADX INFO: renamed from: k */
    public Object f8864k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ t81 f8865l;

    public x81(t81 t81Var, Comparable comparable, Object obj) {
        this.f8865l = t81Var;
        this.f8863j = comparable;
        this.f8864k = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f8863j.compareTo(((x81) obj).f8863j);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f8863j;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f8864k;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8863j;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8864k;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f8863j;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f8864k;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f8865l.m4766b();
        Object obj2 = this.f8864k;
        this.f8864k = obj;
        return obj2;
    }

    public final String toString() {
        return this.f8863j + "=" + this.f8864k;
    }
}

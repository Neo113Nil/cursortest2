package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class w81 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: j */
    public final Comparable f8458j;

    /* JADX INFO: renamed from: k */
    public Object f8459k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ s81 f8460l;

    public w81(s81 s81Var, Comparable comparable, Object obj) {
        this.f8460l = s81Var;
        this.f8458j = comparable;
        this.f8459k = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f8458j.compareTo(((w81) obj).f8458j);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f8458j;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f8459k;
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
        return this.f8458j;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8459k;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f8458j;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f8459k;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f8460l.m4500b();
        Object obj2 = this.f8459k;
        this.f8459k = obj;
        return obj2;
    }

    public final String toString() {
        return this.f8458j + "=" + this.f8459k;
    }
}

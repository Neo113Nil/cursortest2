package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class kq1 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: j */
    public final Comparable f4500j;

    /* JADX INFO: renamed from: k */
    public Object f4501k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ jq1 f4502l;

    public kq1(jq1 jq1Var, Comparable comparable, Object obj) {
        this.f4502l = jq1Var;
        this.f4500j = comparable;
        this.f4501k = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f4500j.compareTo(((kq1) obj).f4500j);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f4500j;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f4501k;
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
    public final /* synthetic */ Object getKey() {
        return this.f4500j;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4501k;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f4500j;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f4501k;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f4502l.m2959f();
        Object obj2 = this.f4501k;
        this.f4501k = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f4500j);
        String strValueOf2 = String.valueOf(this.f4501k);
        return AbstractC0024an.m286i(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}

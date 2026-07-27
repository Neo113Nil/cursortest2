package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class Z implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f2208a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y f2210c;

    public Z(Y y, Comparable comparable, Object obj) {
        this.f2210c = y;
        this.f2208a = comparable;
        this.f2209b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2208a.compareTo(((Z) obj).f2208a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f2208a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f2209b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2208a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2209b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f2208a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f2209b;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f2210c.b();
        Object obj2 = this.f2209b;
        this.f2209b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f2208a + "=" + this.f2209b;
    }
}

package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class Y implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f4411a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X f4413c;

    public Y(X x5, Comparable comparable, Object obj) {
        this.f4413c = x5;
        this.f4411a = comparable;
        this.f4412b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4411a.compareTo(((Y) obj).f4411a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f4411a;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f4412b;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4411a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4412b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f4411a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f4412b;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f4413c.c();
        Object obj2 = this.f4412b;
        this.f4412b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f4411a + "=" + this.f4412b;
    }
}

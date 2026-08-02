package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class X implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f9155a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9156b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f9157c;

    public X(W w7, Comparable comparable, Object obj) {
        this.f9157c = w7;
        this.f9155a = comparable;
        this.f9156b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f9155a.compareTo(((X) obj).f9155a);
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
        Comparable comparable = this.f9155a;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f9156b;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9155a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9156b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f9155a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f9156b;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f9157c.b();
        Object obj2 = this.f9156b;
        this.f9156b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f9155a + "=" + this.f9156b;
    }
}

package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class B extends C {

    /* loaded from: classes8.dex */
    static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a, reason: collision with root package name */
        private Map.Entry<K, B> f42456a;

        a(Map.Entry entry) {
            this.f42456a = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f42456a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            B value = this.f42456a.getValue();
            if (value == null) {
                return null;
            }
            return value.b(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj instanceof Q) {
                return this.f42456a.getValue().c((Q) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* loaded from: classes8.dex */
    static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f42457a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f42457a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f42457a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f42457a.next();
            return next.getValue() instanceof B ? new a(next) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f42457a.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final boolean equals(Object obj) {
        return b(null).equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final int hashCode() {
        return b(null).hashCode();
    }

    public final String toString() {
        return b(null).toString();
    }
}

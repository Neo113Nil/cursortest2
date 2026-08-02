package Td;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class k extends l {

    /* loaded from: classes10.dex */
    static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a, reason: collision with root package name */
        private Map.Entry<K, k> f27093a;

        a(Map.Entry entry) {
            this.f27093a = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f27093a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            k value = this.f27093a.getValue();
            if (value == null) {
                return null;
            }
            return value.a();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof p)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            k value = this.f27093a.getValue();
            p pVar = value.f27095a;
            value.f27095a = (p) obj;
            return pVar;
        }
    }

    /* loaded from: classes10.dex */
    static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f27094a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f27094a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f27094a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f27094a.next();
            return next.getValue() instanceof k ? new a(next) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f27094a.remove();
        }
    }

    public final p a() {
        if (this.f27095a == null) {
            synchronized (this) {
                if (this.f27095a == null) {
                    try {
                        this.f27095a = null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return this.f27095a;
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}

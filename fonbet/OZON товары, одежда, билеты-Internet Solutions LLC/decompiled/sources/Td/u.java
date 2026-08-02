package Td;

import g.C6594f;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
class u<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final int f27116a;

    /* renamed from: b, reason: collision with root package name */
    private List<u<K, V>.b> f27117b = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    private Map<K, V> f27118c = Collections.EMPTY_MAP;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27119d;

    /* renamed from: e, reason: collision with root package name */
    private volatile u<K, V>.d f27120e;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f27121a = new C0544a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f27122b = new b();

        /* renamed from: Td.u$a$a, reason: collision with other inner class name */
        static class C0544a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return a.f27121a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f27122b;
        }
    }

    private class b implements Comparable<u<K, V>.b>, Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private final K f27123a;

        /* renamed from: b, reason: collision with root package name */
        private V f27124b;

        b() {
            throw null;
        }

        b(K k11, V v11) {
            this.f27123a = k11;
            this.f27124b = v11;
        }

        public final K a() {
            return this.f27123a;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f27123a.compareTo(((b) obj).f27123a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    K k11 = this.f27123a;
                    if (k11 == null ? key == null : k11.equals(key)) {
                        V v11 = this.f27124b;
                        Object value = entry.getValue();
                        if (v11 == null ? value == null : v11.equals(value)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f27123a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f27124b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k11 = this.f27123a;
            int hashCode = k11 == null ? 0 : k11.hashCode();
            V v11 = this.f27124b;
            return (v11 != null ? v11.hashCode() : 0) ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v11) {
            u.this.j();
            V v12 = this.f27124b;
            this.f27124b = v11;
            return v12;
        }

        public final String toString() {
            String valueOf = String.valueOf(this.f27123a);
            String valueOf2 = String.valueOf(this.f27124b);
            return C6594f.a(valueOf, "=", valueOf2, new StringBuilder(valueOf2.length() + valueOf.length() + 1));
        }
    }

    private class c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private int f27126a = -1;

        /* renamed from: b, reason: collision with root package name */
        private boolean f27127b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f27128c;

        c() {
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f27128c == null) {
                this.f27128c = u.this.f27118c.entrySet().iterator();
            }
            return this.f27128c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f27126a + 1 < u.this.f27117b.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f27127b = true;
            int i11 = this.f27126a + 1;
            this.f27126a = i11;
            u uVar = u.this;
            return i11 < uVar.f27117b.size() ? (Map.Entry) uVar.f27117b.get(this.f27126a) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f27127b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f27127b = false;
            u uVar = u.this;
            uVar.j();
            if (this.f27126a >= uVar.f27117b.size()) {
                a().remove();
                return;
            }
            int i11 = this.f27126a;
            this.f27126a = i11 - 1;
            uVar.r(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            u.this.q((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = u.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            u.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return u.this.size();
        }
    }

    u(int i11) {
        this.f27116a = i11;
    }

    private int i(K k11) {
        int i11;
        int size = this.f27117b.size();
        int i12 = size - 1;
        if (i12 >= 0) {
            int compareTo = k11.compareTo(this.f27117b.get(i12).a());
            if (compareTo > 0) {
                i11 = size + 1;
                return -i11;
            }
            if (compareTo == 0) {
                return i12;
            }
        }
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) / 2;
            int compareTo2 = k11.compareTo(this.f27117b.get(i14).a());
            if (compareTo2 < 0) {
                i12 = i14 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i14;
                }
                i13 = i14 + 1;
            }
        }
        i11 = i13 + 1;
        return -i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f27119d) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap<K, V> n() {
        j();
        if (this.f27118c.isEmpty() && !(this.f27118c instanceof TreeMap)) {
            this.f27118c = new TreeMap();
        }
        return (SortedMap) this.f27118c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V r(int i11) {
        j();
        V value = this.f27117b.remove(i11).getValue();
        if (!this.f27118c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = n().entrySet().iterator();
            List<u<K, V>.b> list = this.f27117b;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        j();
        if (!this.f27117b.isEmpty()) {
            this.f27117b.clear();
        }
        if (this.f27118c.isEmpty()) {
            return;
        }
        this.f27118c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return i(comparable) >= 0 || this.f27118c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f27120e == null) {
            this.f27120e = new d();
        }
        return this.f27120e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int i11 = i(comparable);
        return i11 >= 0 ? this.f27117b.get(i11).getValue() : this.f27118c.get(comparable);
    }

    public final Map.Entry<K, V> k(int i11) {
        return this.f27117b.get(i11);
    }

    public final int l() {
        return this.f27117b.size();
    }

    public final Iterable<Map.Entry<K, V>> m() {
        return this.f27118c.isEmpty() ? a.b() : this.f27118c.entrySet();
    }

    public final boolean o() {
        return this.f27119d;
    }

    public void p() {
        if (this.f27119d) {
            return;
        }
        this.f27118c = this.f27118c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f27118c);
        this.f27119d = true;
    }

    public final V q(K k11, V v11) {
        j();
        int i11 = i(k11);
        if (i11 >= 0) {
            return this.f27117b.get(i11).setValue(v11);
        }
        j();
        boolean isEmpty = this.f27117b.isEmpty();
        int i12 = this.f27116a;
        if (isEmpty && !(this.f27117b instanceof ArrayList)) {
            this.f27117b = new ArrayList(i12);
        }
        int i13 = -(i11 + 1);
        if (i13 >= i12) {
            return n().put(k11, v11);
        }
        if (this.f27117b.size() == i12) {
            u<K, V>.b remove = this.f27117b.remove(i12 - 1);
            n().put(remove.a(), remove.getValue());
        }
        this.f27117b.add(i13, new b(k11, v11));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        j();
        Comparable comparable = (Comparable) obj;
        int i11 = i(comparable);
        if (i11 >= 0) {
            return (V) r(i11);
        }
        if (this.f27118c.isEmpty()) {
            return null;
        }
        return this.f27118c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f27118c.size() + this.f27117b.size();
    }
}

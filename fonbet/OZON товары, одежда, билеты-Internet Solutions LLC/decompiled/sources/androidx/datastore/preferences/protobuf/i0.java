package androidx.datastore.preferences.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
class i0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private List<i0<K, V>.c> f42551a = Collections.EMPTY_LIST;

    /* renamed from: b, reason: collision with root package name */
    private Map<K, V> f42552b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f42553c;

    /* renamed from: d, reason: collision with root package name */
    private volatile i0<K, V>.e f42554d;

    /* renamed from: e, reason: collision with root package name */
    private Map<K, V> f42555e;

    /* renamed from: f, reason: collision with root package name */
    private volatile i0<K, V>.b f42556f;

    /* loaded from: classes8.dex */
    private class a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private int f42557a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f42558b;

        a() {
            this.f42557a = i0.this.f42551a.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f42558b == null) {
                this.f42558b = i0.this.f42555e.entrySet().iterator();
            }
            return this.f42558b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i11 = this.f42557a;
            return (i11 > 0 && i11 <= i0.this.f42551a.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return a().next();
            }
            List list = i0.this.f42551a;
            int i11 = this.f42557a - 1;
            this.f42557a = i11;
            return (Map.Entry) list.get(i11);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    class b extends i0<K, V>.e {
        b() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }
    }

    /* loaded from: classes8.dex */
    private class c implements Map.Entry<K, V>, Comparable<i0<K, V>.c> {

        /* renamed from: a, reason: collision with root package name */
        private final K f42561a;

        /* renamed from: b, reason: collision with root package name */
        private V f42562b;

        c(i0 i0Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        public final K a() {
            return this.f42561a;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f42561a.compareTo(((c) obj).f42561a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    K k11 = this.f42561a;
                    if (k11 == null ? key == null : k11.equals(key)) {
                        V v11 = this.f42562b;
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
            return this.f42561a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f42562b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k11 = this.f42561a;
            int hashCode = k11 == null ? 0 : k11.hashCode();
            V v11 = this.f42562b;
            return (v11 != null ? v11.hashCode() : 0) ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v11) {
            i0.this.k();
            V v12 = this.f42562b;
            this.f42562b = v11;
            return v12;
        }

        public final String toString() {
            return this.f42561a + "=" + this.f42562b;
        }

        c(K k11, V v11) {
            this.f42561a = k11;
            this.f42562b = v11;
        }
    }

    /* loaded from: classes8.dex */
    private class d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private int f42564a = -1;

        /* renamed from: b, reason: collision with root package name */
        private boolean f42565b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f42566c;

        d() {
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f42566c == null) {
                this.f42566c = i0.this.f42552b.entrySet().iterator();
            }
            return this.f42566c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i11 = this.f42564a + 1;
            i0 i0Var = i0.this;
            return i11 < i0Var.f42551a.size() || (!i0Var.f42552b.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f42565b = true;
            int i11 = this.f42564a + 1;
            this.f42564a = i11;
            i0 i0Var = i0.this;
            return i11 < i0Var.f42551a.size() ? (Map.Entry) i0Var.f42551a.get(this.f42564a) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f42565b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f42565b = false;
            i0 i0Var = i0.this;
            i0Var.k();
            if (this.f42564a >= i0Var.f42551a.size()) {
                a().remove();
                return;
            }
            int i11 = this.f42564a;
            this.f42564a = i11 - 1;
            i0Var.u(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    class e extends AbstractSet<Map.Entry<K, V>> {
        e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            i0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            i0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = i0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            i0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return i0.this.size();
        }
    }

    private i0() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f42552b = map;
        this.f42555e = map;
    }

    private int j(K k11) {
        int i11;
        int size = this.f42551a.size();
        int i12 = size - 1;
        if (i12 >= 0) {
            int compareTo = k11.compareTo(this.f42551a.get(i12).a());
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
            int compareTo2 = k11.compareTo(this.f42551a.get(i14).a());
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
    public void k() {
        if (this.f42553c) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap<K, V> p() {
        k();
        if (this.f42552b.isEmpty() && !(this.f42552b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f42552b = treeMap;
            this.f42555e = treeMap.descendingMap();
        }
        return (SortedMap) this.f42552b;
    }

    static h0 s() {
        return new h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V u(int i11) {
        k();
        V value = this.f42551a.remove(i11).getValue();
        if (!this.f42552b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = p().entrySet().iterator();
            this.f42551a.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        k();
        if (!this.f42551a.isEmpty()) {
            this.f42551a.clear();
        }
        if (this.f42552b.isEmpty()) {
            return;
        }
        this.f42552b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return j(comparable) >= 0 || this.f42552b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f42554d == null) {
            this.f42554d = new e();
        }
        return this.f42554d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        int size = size();
        if (size == i0Var.size()) {
            int size2 = this.f42551a.size();
            if (size2 != i0Var.f42551a.size()) {
                return ((AbstractSet) entrySet()).equals(i0Var.entrySet());
            }
            for (int i11 = 0; i11 < size2; i11++) {
                if (m(i11).equals(i0Var.m(i11))) {
                }
            }
            if (size2 != size) {
                return this.f42552b.equals(i0Var.f42552b);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int j11 = j(comparable);
        return j11 >= 0 ? this.f42551a.get(j11).getValue() : this.f42552b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f42551a.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += this.f42551a.get(i12).hashCode();
        }
        return this.f42552b.size() > 0 ? this.f42552b.hashCode() + i11 : i11;
    }

    final Set<Map.Entry<K, V>> l() {
        if (this.f42556f == null) {
            this.f42556f = new b();
        }
        return this.f42556f;
    }

    public final Map.Entry<K, V> m(int i11) {
        return this.f42551a.get(i11);
    }

    public final int n() {
        return this.f42551a.size();
    }

    public final Set o() {
        return this.f42552b.isEmpty() ? Collections.EMPTY_SET : this.f42552b.entrySet();
    }

    public final boolean q() {
        return this.f42553c;
    }

    public void r() {
        if (this.f42553c) {
            return;
        }
        this.f42552b = this.f42552b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f42552b);
        this.f42555e = this.f42555e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f42555e);
        this.f42553c = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        k();
        Comparable comparable = (Comparable) obj;
        int j11 = j(comparable);
        if (j11 >= 0) {
            return (V) u(j11);
        }
        if (this.f42552b.isEmpty()) {
            return null;
        }
        return this.f42552b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f42552b.size() + this.f42551a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final V put(K k11, V v11) {
        k();
        int j11 = j(k11);
        if (j11 >= 0) {
            return this.f42551a.get(j11).setValue(v11);
        }
        k();
        if (this.f42551a.isEmpty() && !(this.f42551a instanceof ArrayList)) {
            this.f42551a = new ArrayList(16);
        }
        int i11 = -(j11 + 1);
        if (i11 >= 16) {
            return p().put(k11, v11);
        }
        if (this.f42551a.size() == 16) {
            i0<K, V>.c remove = this.f42551a.remove(15);
            p().put(remove.a(), remove.getValue());
        }
        this.f42551a.add(i11, new c(k11, v11));
        return null;
    }
}

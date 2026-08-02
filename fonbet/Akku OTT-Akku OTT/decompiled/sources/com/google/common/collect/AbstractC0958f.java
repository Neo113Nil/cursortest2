package com.google.common.collect;

import com.google.common.collect.AbstractC0960h;
import com.google.common.collect.P;
import com.google.common.collect.V;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.common.collect.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0958f<K, V> extends AbstractC0960h<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map<K, Collection<V>> e;
    public transient int f;

    /* renamed from: com.google.common.collect.f$a */
    public class a extends V.e<K, Collection<V>> {
        public final transient Map<K, Collection<V>> c;

        /* renamed from: com.google.common.collect.f$a$a, reason: collision with other inner class name */
        public class C0133a extends V.a<K, Collection<V>> {
            public C0133a() {
            }

            @Override // com.google.common.collect.V.a
            public final Map<K, Collection<V>> a() {
                return a.this;
            }

            @Override // com.google.common.collect.V.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> entrySet = a.this.c.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return a.this.new b();
            }

            @Override // com.google.common.collect.V.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Collection<V> collection;
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC0958f abstractC0958f = AbstractC0958f.this;
                Object key = entry.getKey();
                Map<K, Collection<V>> map = abstractC0958f.e;
                map.getClass();
                try {
                    collection = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    collection = null;
                }
                Collection<V> collection2 = collection;
                if (collection2 == null) {
                    return true;
                }
                int size = collection2.size();
                collection2.clear();
                abstractC0958f.f -= size;
                return true;
            }
        }

        /* renamed from: com.google.common.collect.f$a$b */
        public class b implements Iterator<Map.Entry<K, Collection<V>>> {
            public final Iterator<Map.Entry<K, Collection<V>>> a;
            public Collection<V> b;

            public b() {
                this.a = a.this.c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.a.next();
                this.b = next.getValue();
                return a.this.a(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                com.google.common.base.k.i(this.b != null, "no calls to next() since the last call to remove()");
                this.a.remove();
                AbstractC0958f.this.f -= this.b.size();
                this.b.clear();
                this.b = null;
            }
        }

        public a(Map<K, Collection<V>> map) {
            this.c = map;
        }

        public final F a(Map.Entry entry) {
            Object key = entry.getKey();
            return new F(key, AbstractC0958f.this.k((Collection) entry.getValue(), key));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            AbstractC0958f abstractC0958f = AbstractC0958f.this;
            if (this.c == abstractC0958f.e) {
                abstractC0958f.f();
            } else {
                P.a(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.c;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(Object obj) {
            return this == obj || this.c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection<V> collection;
            Map<K, Collection<V>> map = this.c;
            map.getClass();
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            return AbstractC0958f.this.k(collection2, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            AbstractC0958f abstractC0958f = AbstractC0958f.this;
            Set<K> set = abstractC0958f.b;
            if (set != null) {
                return set;
            }
            Set<K> i = abstractC0958f.i();
            abstractC0958f.b = i;
            return i;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection<V> remove = this.c.remove(obj);
            if (remove == null) {
                return null;
            }
            AbstractC0958f abstractC0958f = AbstractC0958f.this;
            Collection<V> h = abstractC0958f.h();
            h.addAll(remove);
            abstractC0958f.f -= remove.size();
            remove.clear();
            return h;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.c.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.c.toString();
        }
    }

    /* renamed from: com.google.common.collect.f$b */
    public abstract class b<T> implements Iterator<T> {
        public final Iterator<Map.Entry<K, Collection<V>>> a;
        public K b = null;
        public Collection<V> c = null;
        public Iterator<V> d = P.b.a;

        public b() {
            this.a = AbstractC0958f.this.e.entrySet().iterator();
        }

        public abstract T a(K k, V v);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasNext() || this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.a.next();
                this.b = next.getKey();
                Collection<V> value = next.getValue();
                this.c = value;
                this.d = value.iterator();
            }
            return a(this.b, this.d.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.d.remove();
            Collection<V> collection = this.c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.a.remove();
            }
            AbstractC0958f abstractC0958f = AbstractC0958f.this;
            abstractC0958f.f--;
        }
    }

    /* renamed from: com.google.common.collect.f$c */
    public class c extends V.c<K, Collection<V>> {

        /* renamed from: com.google.common.collect.f$c$a */
        public class a implements Iterator<K> {
            public Map.Entry<K, Collection<V>> a;
            public final /* synthetic */ Iterator b;
            public final /* synthetic */ c c;

            public a(c cVar, Iterator it) {
                this.b = it;
                this.c = cVar;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.b.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.b.next();
                this.a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                com.google.common.base.k.i(this.a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.a.getValue();
                this.b.remove();
                AbstractC0958f.this.f -= value.size();
                value.clear();
                this.a = null;
            }
        }

        public c(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            P.a(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.a.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return this == obj || this.a.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.a.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this, this.a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) this.a.remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                AbstractC0958f.this.f -= i;
            } else {
                i = 0;
            }
            return i > 0;
        }
    }

    /* renamed from: com.google.common.collect.f$d */
    public final class d extends AbstractC0958f<K, V>.g implements NavigableMap<K, Collection<V>> {
        public final /* synthetic */ Y i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y y, NavigableMap navigableMap) {
            super(y, navigableMap);
            this.i = y;
        }

        @Override // com.google.common.collect.AbstractC0958f.g
        public final SortedSet b() {
            return new e(this.i, d());
        }

        @Override // com.google.common.collect.AbstractC0958f.g
        /* renamed from: c */
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> ceilingEntry = d().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return a(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k) {
            return d().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new d(this.i, d().descendingMap());
        }

        public final F e(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection h = this.i.h();
            h.addAll((Collection) entry.getValue());
            it.remove();
            return new F(entry.getKey(), Collections.unmodifiableList((List) h));
        }

        @Override // com.google.common.collect.AbstractC0958f.g
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> d() {
            return (NavigableMap) ((SortedMap) this.c);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = d().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return a(firstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> floorEntry = d().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return a(floorEntry);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k) {
            return d().floorKey(k);
        }

        @Override // com.google.common.collect.AbstractC0958f.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> higherEntry = d().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return a(higherEntry);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k) {
            return d().higherKey(k);
        }

        @Override // com.google.common.collect.AbstractC0958f.g, com.google.common.collect.AbstractC0958f.a, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = d().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return a(lastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> lowerEntry = d().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return a(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k) {
            return d().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return e(((a.C0133a) entrySet()).iterator());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return e(((a.C0133a) ((V.e) descendingMap()).entrySet()).iterator());
        }

        @Override // com.google.common.collect.AbstractC0958f.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractC0958f.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new d(this.i, d().headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new d(this.i, d().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new d(this.i, d().tailMap(k, z));
        }
    }

    /* renamed from: com.google.common.collect.f$e */
    public final class e extends AbstractC0958f<K, V>.h implements NavigableSet<K> {
        public final /* synthetic */ Y d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y y, NavigableMap navigableMap) {
            super(y, navigableMap);
            this.d = y;
        }

        @Override // com.google.common.collect.AbstractC0958f.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> a() {
            return (NavigableMap) ((SortedMap) this.a);
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k) {
            return a().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((c) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new e(this.d, a().descendingMap());
        }

        @Override // java.util.NavigableSet
        public final K floor(K k) {
            return a().floorKey(k);
        }

        @Override // com.google.common.collect.AbstractC0958f.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public final K higher(K k) {
            return a().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public final K lower(K k) {
            return a().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            c.a aVar = (c.a) iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K k = (K) aVar.next();
            aVar.remove();
            return k;
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            Iterator<K> descendingIterator = descendingIterator();
            if (!descendingIterator.hasNext()) {
                return null;
            }
            K next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }

        @Override // com.google.common.collect.AbstractC0958f.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractC0958f.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k, boolean z) {
            return new e(this.d, a().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new e(this.d, a().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k, boolean z) {
            return new e(this.d, a().tailMap(k, z));
        }
    }

    /* renamed from: com.google.common.collect.f$f, reason: collision with other inner class name */
    public class C0134f extends AbstractC0958f<K, V>.j implements RandomAccess {
    }

    /* renamed from: com.google.common.collect.f$g */
    public class g extends AbstractC0958f<K, V>.a implements SortedMap<K, Collection<V>> {
        public SortedSet<K> e;
        public final /* synthetic */ Y f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y y, SortedMap sortedMap) {
            super(sortedMap);
            this.f = y;
        }

        public SortedSet<K> b() {
            return new h(this.f, d());
        }

        @Override // com.google.common.collect.AbstractC0958f.a, java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> b = b();
            this.e = b;
            return b;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            return d().comparator();
        }

        public SortedMap<K, Collection<V>> d() {
            return (SortedMap) this.c;
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return d().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new g(this.f, d().headMap(k));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return d().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new g(this.f, d().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new g(this.f, d().tailMap(k));
        }
    }

    /* renamed from: com.google.common.collect.f$h */
    public class h extends AbstractC0958f<K, V>.c implements SortedSet<K> {
        public final /* synthetic */ Y c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y y, SortedMap sortedMap) {
            super(sortedMap);
            this.c = y;
        }

        public SortedMap<K, Collection<V>> a() {
            return (SortedMap) this.a;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return a().comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return a().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new h(this.c, a().headMap(k));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return a().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new h(this.c, a().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new h(this.c, a().tailMap(k));
        }
    }

    /* renamed from: com.google.common.collect.f$k */
    public class k extends AbstractC0958f<K, V>.i implements Set<V> {
        public final /* synthetic */ AbstractC0961i f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AbstractC0961i abstractC0961i, Object obj, Set set) {
            super(obj, set, null);
            this.f = abstractC0961i;
        }

        @Override // com.google.common.collect.AbstractC0958f.i, java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean e = t0.e(collection, (Set) this.b);
            if (e) {
                this.f.f += this.b.size() - size;
                c();
            }
            return e;
        }
    }

    public AbstractC0958f(Map<K, Collection<V>> map) {
        com.google.common.base.k.c(map.isEmpty());
        this.e = map;
    }

    @Override // com.google.common.collect.W
    public Collection<Map.Entry<K, V>> a() {
        Collection<Map.Entry<K, V>> collection = this.a;
        if (collection == null) {
            collection = this instanceof o0 ? new AbstractC0960h.b(this) : new AbstractC0960h.a(this);
            this.a = collection;
        }
        return collection;
    }

    public final void f() {
        Iterator<Collection<V>> it = this.e.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.e.clear();
        this.f = 0;
    }

    public Map<K, Collection<V>> g() {
        return new a(this.e);
    }

    @Override // com.google.common.collect.W
    public Collection<V> get(K k2) {
        Collection<V> collection = this.e.get(k2);
        if (collection == null) {
            collection = h();
        }
        return k(collection, k2);
    }

    public abstract Collection<V> h();

    public Set<K> i() {
        return new c(this.e);
    }

    public final void j(Map<K, Collection<V>> map) {
        this.e = map;
        this.f = 0;
        for (Collection<V> collection : map.values()) {
            com.google.common.base.k.c(!collection.isEmpty());
            this.f = collection.size() + this.f;
        }
    }

    public abstract Collection k(Collection collection, Object obj);

    @Override // com.google.common.collect.W
    public boolean put(K k2, V v) {
        Collection<V> collection = this.e.get(k2);
        if (collection != null) {
            if (!collection.add(v)) {
                return false;
            }
            this.f++;
            return true;
        }
        Collection<V> h2 = h();
        if (!h2.add(v)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f++;
        this.e.put(k2, h2);
        return true;
    }

    @Override // com.google.common.collect.W
    public final int size() {
        return this.f;
    }

    @Override // com.google.common.collect.W
    public final Collection<V> values() {
        Collection<V> collection = this.c;
        if (collection != null) {
            return collection;
        }
        AbstractC0960h.c cVar = new AbstractC0960h.c(this);
        this.c = cVar;
        return cVar;
    }

    /* renamed from: com.google.common.collect.f$j */
    public class j extends AbstractC0958f<K, V>.i implements List<V> {

        /* renamed from: com.google.common.collect.f$j$a */
        public class a extends AbstractC0958f<K, V>.i.a implements ListIterator<V> {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public final void add(V v) {
                j jVar = j.this;
                boolean isEmpty = jVar.isEmpty();
                b().add(v);
                AbstractC0958f.this.f++;
                if (isEmpty) {
                    jVar.a();
                }
            }

            public final ListIterator<V> b() {
                a();
                return (ListIterator) this.a;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return b().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return b().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return b().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v) {
                b().set(v);
            }

            public a(int i) {
                super(j.this, ((List) j.this.b).listIterator(i));
            }
        }

        public j(K k, List<V> list, AbstractC0958f<K, V>.i iVar) {
            super(k, list, iVar);
        }

        @Override // java.util.List
        public final void add(int i, V v) {
            b();
            boolean isEmpty = this.b.isEmpty();
            ((List) this.b).add(i, v);
            AbstractC0958f.this.f++;
            if (isEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.b).addAll(i, collection);
            if (addAll) {
                AbstractC0958f.this.f += this.b.size() - size;
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public final V get(int i) {
            b();
            return (V) ((List) this.b).get(i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            b();
            return ((List) this.b).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            b();
            return ((List) this.b).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            b();
            return new a();
        }

        @Override // java.util.List
        public final V remove(int i) {
            b();
            V v = (V) ((List) this.b).remove(i);
            AbstractC0958f abstractC0958f = AbstractC0958f.this;
            abstractC0958f.f--;
            c();
            return v;
        }

        @Override // java.util.List
        public final V set(int i, V v) {
            b();
            return (V) ((List) this.b).set(i, v);
        }

        @Override // java.util.List
        public final List<V> subList(int i, int i2) {
            b();
            List subList = ((List) this.b).subList(i, i2);
            AbstractC0958f<K, V>.i iVar = this.c;
            if (iVar == null) {
                iVar = this;
            }
            boolean z = subList instanceof RandomAccess;
            AbstractC0958f abstractC0958f = AbstractC0958f.this;
            K k = this.a;
            return z ? new C0134f(k, subList, iVar) : new j(k, subList, iVar);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i) {
            b();
            return new a(i);
        }
    }

    /* renamed from: com.google.common.collect.f$i */
    public class i extends AbstractCollection<V> {
        public final K a;
        public Collection<V> b;
        public final AbstractC0958f<K, V>.i c;
        public final Collection<V> d;

        public i(K k, Collection<V> collection, AbstractC0958f<K, V>.i iVar) {
            this.a = k;
            this.b = collection;
            this.c = iVar;
            this.d = iVar == null ? null : iVar.b;
        }

        public final void a() {
            AbstractC0958f<K, V>.i iVar = this.c;
            if (iVar != null) {
                iVar.a();
            } else {
                AbstractC0958f.this.e.put(this.a, this.b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v) {
            b();
            boolean isEmpty = this.b.isEmpty();
            boolean add = this.b.add(v);
            if (add) {
                AbstractC0958f.this.f++;
                if (isEmpty) {
                    a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.b.addAll(collection);
            if (addAll) {
                AbstractC0958f.this.f += this.b.size() - size;
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        public final void b() {
            Collection<V> collection;
            AbstractC0958f<K, V>.i iVar = this.c;
            if (iVar != null) {
                iVar.b();
                if (iVar.b != this.d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.b.isEmpty() || (collection = AbstractC0958f.this.e.get(this.a)) == null) {
                    return;
                }
                this.b = collection;
            }
        }

        public final void c() {
            AbstractC0958f<K, V>.i iVar = this.c;
            if (iVar != null) {
                iVar.c();
            } else if (this.b.isEmpty()) {
                AbstractC0958f.this.e.remove(this.a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.b.clear();
            AbstractC0958f.this.f -= size;
            c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            b();
            return this.b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            b();
            return this.b.containsAll(collection);
        }

        @Override // java.util.Collection
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            b();
            return this.b.equals(obj);
        }

        @Override // java.util.Collection
        public final int hashCode() {
            b();
            return this.b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            b();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            b();
            boolean remove = this.b.remove(obj);
            if (remove) {
                AbstractC0958f abstractC0958f = AbstractC0958f.this;
                abstractC0958f.f--;
                c();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.b.removeAll(collection);
            if (removeAll) {
                AbstractC0958f.this.f += this.b.size() - size;
                c();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean retainAll = this.b.retainAll(collection);
            if (retainAll) {
                AbstractC0958f.this.f += this.b.size() - size;
                c();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            b();
            return this.b.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            b();
            return this.b.toString();
        }

        /* renamed from: com.google.common.collect.f$i$a */
        public class a implements Iterator<V> {
            public final Iterator<V> a;
            public final Collection<V> b;

            public a() {
                Collection<V> collection = i.this.b;
                this.b = collection;
                this.a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            public final void a() {
                i iVar = i.this;
                iVar.b();
                if (iVar.b != this.b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                a();
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                a();
                return this.a.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.a.remove();
                i iVar = i.this;
                AbstractC0958f abstractC0958f = AbstractC0958f.this;
                abstractC0958f.f--;
                iVar.c();
            }

            public a(j jVar, ListIterator listIterator) {
                i.this = jVar;
                this.b = jVar.b;
                this.a = listIterator;
            }
        }
    }
}

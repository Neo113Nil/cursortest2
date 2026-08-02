package com.google.common.collect;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes4.dex */
public final class r<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object l = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient c i;
    public transient a j;
    public transient e k;

    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            r.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            r rVar = r.this;
            Map<K, V> c = rVar.c();
            if (c != null) {
                return c.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int e = rVar.e(entry.getKey());
                if (e != -1 && com.google.common.base.i.a(rVar.l()[e], entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            r rVar = r.this;
            Map<K, V> c = rVar.c();
            return c != null ? c.entrySet().iterator() : new C0968p(rVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            r rVar = r.this;
            Map<K, V> c = rVar.c();
            if (c != null) {
                return c.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (rVar.h()) {
                return false;
            }
            int d = rVar.d();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = rVar.a;
            Objects.requireNonNull(obj2);
            int e = C0971t.e(key, value, d, obj2, rVar.j(), rVar.k(), rVar.l());
            if (e == -1) {
                return false;
            }
            rVar.g(e, d);
            rVar.f--;
            rVar.e += 32;
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return r.this.size();
        }
    }

    public abstract class b<T> implements Iterator<T> {
        public int a;
        public int b;
        public int c;

        public b() {
            this.a = r.this.e;
            this.b = r.this.isEmpty() ? -1 : 0;
            this.c = -1;
        }

        public abstract T a(int i);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b >= 0;
        }

        @Override // java.util.Iterator
        public final T next() {
            r rVar = r.this;
            if (rVar.e != this.a) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.b;
            this.c = i;
            T a = a(i);
            int i2 = this.b + 1;
            if (i2 >= rVar.f) {
                i2 = -1;
            }
            this.b = i2;
            return a;
        }

        @Override // java.util.Iterator
        public final void remove() {
            r rVar = r.this;
            if (rVar.e != this.a) {
                throw new ConcurrentModificationException();
            }
            com.google.common.base.k.i(this.c >= 0, "no calls to next() since the last call to remove()");
            this.a += 32;
            rVar.remove(rVar.k()[this.c]);
            this.b--;
            this.c = -1;
        }
    }

    public class c extends AbstractSet<K> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            r.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return r.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            r rVar = r.this;
            Map<K, V> c = rVar.c();
            return c != null ? c.keySet().iterator() : new C0967o(rVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            r rVar = r.this;
            Map<K, V> c = rVar.c();
            return c != null ? c.keySet().remove(obj) : rVar.i(obj) != r.l;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return r.this.size();
        }
    }

    public final class d extends AbstractC0959g<K, V> {
        public final K a;
        public int b;

        public d(int i) {
            Object obj = r.l;
            this.a = (K) r.this.k()[i];
            this.b = i;
        }

        public final void a() {
            int i = this.b;
            K k = this.a;
            r rVar = r.this;
            if (i != -1 && i < rVar.size()) {
                if (com.google.common.base.i.a(k, rVar.k()[this.b])) {
                    return;
                }
            }
            Object obj = r.l;
            this.b = rVar.e(k);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            r rVar = r.this;
            Map<K, V> c = rVar.c();
            if (c != null) {
                return c.get(this.a);
            }
            a();
            int i = this.b;
            if (i == -1) {
                return null;
            }
            return (V) rVar.l()[i];
        }

        @Override // com.google.common.collect.AbstractC0959g, java.util.Map.Entry
        public final V setValue(V v) {
            r rVar = r.this;
            Map<K, V> c = rVar.c();
            K k = this.a;
            if (c != null) {
                return c.put(k, v);
            }
            a();
            int i = this.b;
            if (i == -1) {
                rVar.put(k, v);
                return null;
            }
            V v2 = (V) rVar.l()[i];
            rVar.l()[this.b] = v;
            return v2;
        }
    }

    public class e extends AbstractCollection<V> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            r.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            r rVar = r.this;
            Map<K, V> c = rVar.c();
            return c != null ? c.values().iterator() : new C0969q(rVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return r.this.size();
        }
    }

    public static <K, V> r<K, V> a() {
        r<K, V> rVar = new r<>();
        rVar.f(3);
        return rVar;
    }

    public static <K, V> r<K, V> b(int i) {
        r<K, V> rVar = new r<>();
        rVar.f(i);
        return rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(android.support.v4.media.a.a(readInt, "Invalid size: "));
        }
        f(readInt);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map<K, V> c2 = c();
        Iterator<Map.Entry<K, V>> it = c2 != null ? c2.entrySet().iterator() : new C0968p(this);
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public final Map<K, V> c() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (h()) {
            return;
        }
        this.e += 32;
        Map<K, V> c2 = c();
        if (c2 != null) {
            this.e = com.google.common.primitives.c.c(size(), 3);
            c2.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(k(), 0, this.f, (Object) null);
        Arrays.fill(l(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(j(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map<K, V> c2 = c();
        return c2 != null ? c2.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map<K, V> c2 = c();
        if (c2 != null) {
            return c2.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (com.google.common.base.i.a(obj, l()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (h()) {
            return -1;
        }
        int b2 = C.b(obj);
        int d2 = d();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int f = C0971t.f(b2 & d2, obj2);
        if (f == 0) {
            return -1;
        }
        int i = ~d2;
        int i2 = b2 & i;
        do {
            int i3 = f - 1;
            int i4 = j()[i3];
            if ((i4 & i) == i2 && com.google.common.base.i.a(obj, k()[i3])) {
                return i3;
            }
            f = i4 & d2;
        } while (f != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.j = aVar2;
        return aVar2;
    }

    public final void f(int i) {
        com.google.common.base.k.d(i >= 0, "Expected size must be >= 0");
        this.e = com.google.common.primitives.c.c(i, 1);
    }

    public final void g(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] j = j();
        Object[] k = k();
        Object[] l2 = l();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            k[i] = null;
            l2[i] = null;
            j[i] = 0;
            return;
        }
        Object obj2 = k[i3];
        k[i] = obj2;
        l2[i] = l2[i3];
        k[i3] = null;
        l2[i3] = null;
        j[i] = j[i3];
        j[i3] = 0;
        int b2 = C.b(obj2) & i2;
        int f = C0971t.f(b2, obj);
        if (f == size) {
            C0971t.g(obj, b2, i + 1);
            return;
        }
        while (true) {
            int i4 = f - 1;
            int i5 = j[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                j[i4] = C0971t.c(i5, i + 1, i2);
                return;
            }
            f = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> c2 = c();
        if (c2 != null) {
            return c2.get(obj);
        }
        int e2 = e(obj);
        if (e2 == -1) {
            return null;
        }
        return (V) l()[e2];
    }

    public final boolean h() {
        return this.a == null;
    }

    public final Object i(Object obj) {
        if (!h()) {
            int d2 = d();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int e2 = C0971t.e(obj, null, d2, obj2, j(), k(), null);
            if (e2 != -1) {
                Object obj3 = l()[e2];
                g(e2, d2);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int[] j() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] k() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        c cVar = this.i;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.i = cVar2;
        return cVar2;
    }

    public final Object[] l() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int m(int i, int i2, int i3, int i4) {
        Object b2 = C0971t.b(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C0971t.g(b2, i3 & i5, i4 + 1);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] j = j();
        for (int i6 = 0; i6 <= i; i6++) {
            int f = C0971t.f(i6, obj);
            while (f != 0) {
                int i7 = f - 1;
                int i8 = j[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int f2 = C0971t.f(i10, b2);
                C0971t.g(b2, i10, f);
                j[i7] = C0971t.c(i9, f2, i5);
                f = i8 & i;
            }
        }
        this.a = b2;
        this.e = C0971t.c(this.e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d7 -> B:35:0x00bf). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V put(K k, V v) {
        int i;
        int i2;
        int i3 = 1;
        if (h()) {
            com.google.common.base.k.i(h(), "Arrays already allocated");
            int i4 = this.e;
            int h = C0971t.h(i4);
            this.a = C0971t.b(h);
            this.e = C0971t.c(this.e, 32 - Integer.numberOfLeadingZeros(h - 1), 31);
            this.b = new int[i4];
            this.c = new Object[i4];
            this.d = new Object[i4];
        }
        Map<K, V> c2 = c();
        if (c2 != null) {
            return c2.put(k, v);
        }
        int[] j = j();
        Object[] k2 = k();
        Object[] l2 = l();
        int i5 = this.f;
        int i6 = i5 + 1;
        int b2 = C.b(k);
        int d2 = d();
        int i7 = b2 & d2;
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int f = C0971t.f(i7, obj);
        if (f == 0) {
            if (i6 > d2) {
                d2 = m(d2, C0971t.d(d2), b2, i5);
            } else {
                Object obj2 = this.a;
                Objects.requireNonNull(obj2);
                C0971t.g(obj2, i7, i6);
            }
            i = 1;
        } else {
            int i8 = ~d2;
            int i9 = b2 & i8;
            int i10 = 0;
            while (true) {
                int i11 = f - i3;
                int i12 = j[i11];
                i = i3;
                if ((i12 & i8) == i9 && com.google.common.base.i.a(k, k2[i11])) {
                    V v2 = (V) l2[i11];
                    l2[i11] = v;
                    return v2;
                }
                int i13 = i12 & d2;
                int i14 = i10 + 1;
                if (i13 != 0) {
                    f = i13;
                    i10 = i14;
                    i3 = i;
                } else {
                    if (i14 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d() + 1, 1.0f);
                        if (!isEmpty()) {
                            i2 = 0;
                            while (i2 >= 0) {
                                linkedHashMap.put(k()[i2], l()[i2]);
                                i2++;
                                if (i2 < this.f) {
                                }
                            }
                            this.a = linkedHashMap;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e += 32;
                            return (V) linkedHashMap.put(k, v);
                        }
                        i2 = -1;
                        while (i2 >= 0) {
                        }
                        this.a = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e += 32;
                        return (V) linkedHashMap.put(k, v);
                    }
                    if (i6 > d2) {
                        d2 = m(d2, C0971t.d(d2), b2, i5);
                    } else {
                        j[i11] = C0971t.c(i12, i6, d2);
                    }
                }
            }
        }
        int length = j().length;
        if (i6 > length) {
            int i15 = i;
            int min = Math.min(1073741823, (Math.max(i15, length >>> 1) + length) | i15);
            if (min != length) {
                this.b = Arrays.copyOf(j(), min);
                this.c = Arrays.copyOf(k(), min);
                this.d = Arrays.copyOf(l(), min);
            }
        }
        j()[i5] = C0971t.c(b2, 0, d2);
        k()[i5] = k;
        l()[i5] = v;
        this.f = i6;
        this.e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> c2 = c();
        if (c2 != null) {
            return c2.remove(obj);
        }
        V v = (V) i(obj);
        if (v == l) {
            return null;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> c2 = c();
        return c2 != null ? c2.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        e eVar = this.k;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.k = eVar2;
        return eVar2;
    }
}

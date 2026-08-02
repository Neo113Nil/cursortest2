package androidx.datastore.preferences.protobuf;

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
public final class W extends AbstractMap {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f9149f = 0;

    /* renamed from: a, reason: collision with root package name */
    public List f9150a;

    /* renamed from: b, reason: collision with root package name */
    public Map f9151b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9152c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Z f9153d;

    /* renamed from: e, reason: collision with root package name */
    public Map f9154e;

    public static W f() {
        W w7 = new W();
        w7.f9150a = Collections.emptyList();
        w7.f9151b = Collections.emptyMap();
        w7.f9154e = Collections.emptyMap();
        return w7;
    }

    public final int a(Comparable comparable) {
        int i7;
        int size = this.f9150a.size();
        int i8 = size - 1;
        if (i8 >= 0) {
            int compareTo = comparable.compareTo(((X) this.f9150a.get(i8)).f9155a);
            if (compareTo > 0) {
                i7 = size + 1;
                return -i7;
            }
            if (compareTo == 0) {
                return i8;
            }
        }
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) / 2;
            int compareTo2 = comparable.compareTo(((X) this.f9150a.get(i10)).f9155a);
            if (compareTo2 < 0) {
                i8 = i10 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i10;
                }
                i9 = i10 + 1;
            }
        }
        i7 = i9 + 1;
        return -i7;
    }

    public final void b() {
        if (this.f9152c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i7) {
        return (Map.Entry) this.f9150a.get(i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f9150a.isEmpty()) {
            this.f9150a.clear();
        }
        if (this.f9151b.isEmpty()) {
            return;
        }
        this.f9151b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f9151b.containsKey(comparable);
    }

    public final Set d() {
        return this.f9151b.isEmpty() ? Collections.emptySet() : this.f9151b.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f9151b.isEmpty() && !(this.f9151b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9151b = treeMap;
            this.f9154e = treeMap.descendingMap();
        }
        return (SortedMap) this.f9151b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f9153d == null) {
            this.f9153d = new Z(this, 0);
        }
        return this.f9153d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return super.equals(obj);
        }
        W w7 = (W) obj;
        int size = size();
        if (size != w7.size()) {
            return false;
        }
        int size2 = this.f9150a.size();
        if (size2 != w7.f9150a.size()) {
            return ((AbstractSet) entrySet()).equals(w7.entrySet());
        }
        for (int i7 = 0; i7 < size2; i7++) {
            if (!c(i7).equals(w7.c(i7))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f9151b.equals(w7.f9151b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((X) this.f9150a.get(a2)).setValue(obj);
        }
        b();
        if (this.f9150a.isEmpty() && !(this.f9150a instanceof ArrayList)) {
            this.f9150a = new ArrayList(16);
        }
        int i7 = -(a2 + 1);
        if (i7 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f9150a.size() == 16) {
            X x4 = (X) this.f9150a.remove(15);
            e().put(x4.f9155a, x4.f9156b);
        }
        this.f9150a.add(i7, new X(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? ((X) this.f9150a.get(a2)).f9156b : this.f9151b.get(comparable);
    }

    public final Object h(int i7) {
        b();
        Object obj = ((X) this.f9150a.remove(i7)).f9156b;
        if (!this.f9151b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f9150a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new X(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f9150a.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += ((X) this.f9150a.get(i8)).hashCode();
        }
        return this.f9151b.size() > 0 ? i7 + this.f9151b.hashCode() : i7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return h(a2);
        }
        if (this.f9151b.isEmpty()) {
            return null;
        }
        return this.f9151b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9151b.size() + this.f9150a.size();
    }
}

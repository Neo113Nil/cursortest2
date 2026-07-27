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
public final class Y extends AbstractMap {
    public static final /* synthetic */ int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public List f2203a;

    /* renamed from: b, reason: collision with root package name */
    public Map f2204b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2205c;

    /* renamed from: d, reason: collision with root package name */
    public volatile b0 f2206d;

    /* renamed from: e, reason: collision with root package name */
    public Map f2207e;

    public static Y f() {
        Y y = new Y();
        y.f2203a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        y.f2204b = map;
        y.f2207e = map;
        return y;
    }

    public final int a(Comparable comparable) {
        int i3;
        int size = this.f2203a.size();
        int i4 = size - 1;
        if (i4 >= 0) {
            int compareTo = comparable.compareTo(((Z) this.f2203a.get(i4)).f2208a);
            if (compareTo > 0) {
                i3 = size + 1;
                return -i3;
            }
            if (compareTo == 0) {
                return i4;
            }
        }
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) / 2;
            int compareTo2 = comparable.compareTo(((Z) this.f2203a.get(i6)).f2208a);
            if (compareTo2 < 0) {
                i4 = i6 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i6;
                }
                i5 = i6 + 1;
            }
        }
        i3 = i5 + 1;
        return -i3;
    }

    public final void b() {
        if (this.f2205c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i3) {
        return (Map.Entry) this.f2203a.get(i3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f2203a.isEmpty()) {
            this.f2203a.clear();
        }
        if (this.f2204b.isEmpty()) {
            return;
        }
        this.f2204b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f2204b.containsKey(comparable);
    }

    public final Set d() {
        return this.f2204b.isEmpty() ? Collections.EMPTY_SET : this.f2204b.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f2204b.isEmpty() && !(this.f2204b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2204b = treeMap;
            this.f2207e = treeMap.descendingMap();
        }
        return (SortedMap) this.f2204b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f2206d == null) {
            this.f2206d = new b0(this);
        }
        return this.f2206d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return super.equals(obj);
        }
        Y y = (Y) obj;
        int size = size();
        if (size == y.size()) {
            int size2 = this.f2203a.size();
            if (size2 != y.f2203a.size()) {
                return ((AbstractSet) entrySet()).equals(y.entrySet());
            }
            for (int i3 = 0; i3 < size2; i3++) {
                if (c(i3).equals(y.c(i3))) {
                }
            }
            if (size2 != size) {
                return this.f2204b.equals(y.f2204b);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a3 = a(comparable);
        if (a3 >= 0) {
            return ((Z) this.f2203a.get(a3)).setValue(obj);
        }
        b();
        if (this.f2203a.isEmpty() && !(this.f2203a instanceof ArrayList)) {
            this.f2203a = new ArrayList(16);
        }
        int i3 = -(a3 + 1);
        if (i3 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f2203a.size() == 16) {
            Z z3 = (Z) this.f2203a.remove(15);
            e().put(z3.f2208a, z3.f2209b);
        }
        this.f2203a.add(i3, new Z(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        return a3 >= 0 ? ((Z) this.f2203a.get(a3)).f2209b : this.f2204b.get(comparable);
    }

    public final Object h(int i3) {
        b();
        Object obj = ((Z) this.f2203a.remove(i3)).f2209b;
        if (!this.f2204b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f2203a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Z(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f2203a.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += ((Z) this.f2203a.get(i4)).hashCode();
        }
        return this.f2204b.size() > 0 ? this.f2204b.hashCode() + i3 : i3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        if (a3 >= 0) {
            return h(a3);
        }
        if (this.f2204b.isEmpty()) {
            return null;
        }
        return this.f2204b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2204b.size() + this.f2203a.size();
    }
}

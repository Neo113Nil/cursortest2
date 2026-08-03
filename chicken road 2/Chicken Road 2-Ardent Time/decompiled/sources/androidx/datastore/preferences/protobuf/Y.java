package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class Y extends java.util.AbstractMap {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f2272f = 0;

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f2273a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f2274b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2275c;

    /* renamed from: d, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.b0 f2276d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f2277e;

    public static androidx.datastore.preferences.protobuf.Y f() {
        androidx.datastore.preferences.protobuf.Y y2 = new androidx.datastore.preferences.protobuf.Y();
        y2.f2273a = java.util.Collections.emptyList();
        y2.f2274b = java.util.Collections.emptyMap();
        y2.f2277e = java.util.Collections.emptyMap();
        return y2;
    }

    public final int a(java.lang.Comparable comparable) {
        int i2;
        int size = this.f2273a.size();
        int i3 = size - 1;
        if (i3 >= 0) {
            int compareTo = comparable.compareTo(((androidx.datastore.preferences.protobuf.Z) this.f2273a.get(i3)).f2278a);
            if (compareTo > 0) {
                i2 = size + 1;
                return -i2;
            }
            if (compareTo == 0) {
                return i3;
            }
        }
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            int compareTo2 = comparable.compareTo(((androidx.datastore.preferences.protobuf.Z) this.f2273a.get(i5)).f2278a);
            if (compareTo2 < 0) {
                i3 = i5 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i5;
                }
                i4 = i5 + 1;
            }
        }
        i2 = i4 + 1;
        return -i2;
    }

    public final void b() {
        if (this.f2275c) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final java.util.Map.Entry c(int i2) {
        return (java.util.Map.Entry) this.f2273a.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f2273a.isEmpty()) {
            this.f2273a.clear();
        }
        if (this.f2274b.isEmpty()) {
            return;
        }
        this.f2274b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return a(comparable) >= 0 || this.f2274b.containsKey(comparable);
    }

    public final java.util.Set d() {
        return this.f2274b.isEmpty() ? java.util.Collections.emptySet() : this.f2274b.entrySet();
    }

    public final java.util.SortedMap e() {
        b();
        if (this.f2274b.isEmpty() && !(this.f2274b instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.f2274b = treeMap;
            this.f2277e = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.f2274b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        if (this.f2276d == null) {
            this.f2276d = new androidx.datastore.preferences.protobuf.b0(this);
        }
        return this.f2276d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.datastore.preferences.protobuf.Y)) {
            return super.equals(obj);
        }
        androidx.datastore.preferences.protobuf.Y y2 = (androidx.datastore.preferences.protobuf.Y) obj;
        int size = size();
        if (size != y2.size()) {
            return false;
        }
        int size2 = this.f2273a.size();
        if (size2 != y2.f2273a.size()) {
            return ((java.util.AbstractSet) entrySet()).equals(y2.entrySet());
        }
        for (int i2 = 0; i2 < size2; i2++) {
            if (!c(i2).equals(y2.c(i2))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f2274b.equals(y2.f2274b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object put(java.lang.Comparable comparable, java.lang.Object obj) {
        b();
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((androidx.datastore.preferences.protobuf.Z) this.f2273a.get(a2)).setValue(obj);
        }
        b();
        if (this.f2273a.isEmpty() && !(this.f2273a instanceof java.util.ArrayList)) {
            this.f2273a = new java.util.ArrayList(16);
        }
        int i2 = -(a2 + 1);
        if (i2 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f2273a.size() == 16) {
            androidx.datastore.preferences.protobuf.Z z2 = (androidx.datastore.preferences.protobuf.Z) this.f2273a.remove(15);
            e().put(z2.f2278a, z2.f2279b);
        }
        this.f2273a.add(i2, new androidx.datastore.preferences.protobuf.Z(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? ((androidx.datastore.preferences.protobuf.Z) this.f2273a.get(a2)).f2279b : this.f2274b.get(comparable);
    }

    public final java.lang.Object h(int i2) {
        b();
        java.lang.Object obj = ((androidx.datastore.preferences.protobuf.Z) this.f2273a.remove(i2)).f2279b;
        if (!this.f2274b.isEmpty()) {
            java.util.Iterator it = e().entrySet().iterator();
            java.util.List list = this.f2273a;
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            list.add(new androidx.datastore.preferences.protobuf.Z(this, (java.lang.Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f2273a.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((androidx.datastore.preferences.protobuf.Z) this.f2273a.get(i3)).hashCode();
        }
        return this.f2274b.size() > 0 ? i2 + this.f2274b.hashCode() : i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        b();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return h(a2);
        }
        if (this.f2274b.isEmpty()) {
            return null;
        }
        return this.f2274b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2274b.size() + this.f2273a.size();
    }
}

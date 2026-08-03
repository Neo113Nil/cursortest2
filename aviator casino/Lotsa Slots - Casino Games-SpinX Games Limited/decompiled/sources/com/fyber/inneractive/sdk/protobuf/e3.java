package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public abstract class e3 extends java.util.AbstractMap {
    public static final /* synthetic */ int h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f4187a;
    public boolean d;
    public volatile com.fyber.inneractive.sdk.protobuf.d3 e;
    public volatile com.fyber.inneractive.sdk.protobuf.x2 g;
    public java.util.List b = java.util.Collections.emptyList();
    public java.util.Map c = java.util.Collections.emptyMap();
    public java.util.Map f = java.util.Collections.emptyMap();

    public e3(int i) {
        this.f4187a = i;
    }

    public final java.lang.Object a(java.lang.Comparable comparable, java.lang.Object obj) {
        a();
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((com.fyber.inneractive.sdk.protobuf.b3) this.b.get(a2)).setValue(obj);
        }
        a();
        if (this.b.isEmpty() && !(this.b instanceof java.util.ArrayList)) {
            this.b = new java.util.ArrayList(this.f4187a);
        }
        int i = -(a2 + 1);
        if (i >= this.f4187a) {
            return c().put(comparable, obj);
        }
        int size = this.b.size();
        int i2 = this.f4187a;
        if (size == i2) {
            com.fyber.inneractive.sdk.protobuf.b3 b3Var = (com.fyber.inneractive.sdk.protobuf.b3) this.b.remove(i2 - 1);
            c().put(b3Var.f4179a, b3Var.b);
        }
        this.b.add(i, new com.fyber.inneractive.sdk.protobuf.b3(this, comparable, obj));
        return null;
    }

    public final java.lang.Iterable b() {
        return this.c.isEmpty() ? com.fyber.inneractive.sdk.protobuf.a3.b : this.c.entrySet();
    }

    public final java.util.SortedMap c() {
        a();
        if (this.c.isEmpty() && !(this.c instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return a(comparable) >= 0 || this.c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        if (this.e == null) {
            this.e = new com.fyber.inneractive.sdk.protobuf.d3(this);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.fyber.inneractive.sdk.protobuf.e3)) {
            return super.equals(obj);
        }
        com.fyber.inneractive.sdk.protobuf.e3 e3Var = (com.fyber.inneractive.sdk.protobuf.e3) obj;
        int size = size();
        if (size != e3Var.size()) {
            return false;
        }
        int size2 = this.b.size();
        if (size2 != e3Var.b.size()) {
            return entrySet().equals(e3Var.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!((java.util.Map.Entry) this.b.get(i)).equals((java.util.Map.Entry) e3Var.b.get(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.c.equals(e3Var.c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? ((com.fyber.inneractive.sdk.protobuf.b3) this.b.get(a2)).b : this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((com.fyber.inneractive.sdk.protobuf.b3) this.b.get(i2)).hashCode();
        }
        return this.c.size() > 0 ? i + this.c.hashCode() : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        a();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int a2 = a(comparable);
        if (a2 < 0) {
            if (this.c.isEmpty()) {
                return null;
            }
            return this.c.remove(comparable);
        }
        a();
        java.lang.Object obj2 = ((com.fyber.inneractive.sdk.protobuf.b3) this.b.remove(a2)).b;
        if (!this.c.isEmpty()) {
            java.util.Iterator it = c().entrySet().iterator();
            this.b.add(new com.fyber.inneractive.sdk.protobuf.b3(this, (java.util.Map.Entry) it.next()));
            it.remove();
        }
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b.size();
    }

    public final int a(java.lang.Comparable comparable) {
        int i;
        int size = this.b.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((com.fyber.inneractive.sdk.protobuf.b3) this.b.get(i2)).f4179a);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((com.fyber.inneractive.sdk.protobuf.b3) this.b.get(i4)).f4179a);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final void a() {
        if (this.d) {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}

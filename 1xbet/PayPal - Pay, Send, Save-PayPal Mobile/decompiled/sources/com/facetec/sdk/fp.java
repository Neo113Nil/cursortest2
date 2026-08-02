package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class fp<K, V> extends java.util.AbstractMap<K, V> implements java.io.Serializable {
    private static final java.util.Comparator<java.lang.Comparable> c = new java.util.Comparator<java.lang.Comparable>() { // from class: com.facetec.sdk.fp.4
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    private static /* synthetic */ boolean f = true;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Comparator<? super K> f3574a;
    final com.facetec.sdk.fp.c<K, V> b;
    int d;
    int e;
    private final boolean g;
    private com.facetec.sdk.fp<K, V>.b h;
    private com.facetec.sdk.fp.c<K, V> i;
    private com.facetec.sdk.fp<K, V>.a j;

    public fp() {
        this(c, true);
    }

    public fp(byte b2) {
        this(c, false);
    }

    private fp(java.util.Comparator<? super K> comparator, boolean z) {
        this.e = 0;
        this.d = 0;
        this.f3574a = comparator == null ? c : comparator;
        this.g = z;
        this.b = new com.facetec.sdk.fp.c<>(z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(java.lang.Object obj) {
        com.facetec.sdk.fp.c<K, V> e2 = e(obj);
        if (e2 != null) {
            return e2.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return e(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        if (v == null && !this.g) {
            throw new java.lang.NullPointerException("value == null");
        }
        com.facetec.sdk.fp.c<K, V> e2 = e(k, true);
        V v2 = e2.g;
        e2.g = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.i = null;
        this.e = 0;
        this.d++;
        com.facetec.sdk.fp.c<K, V> cVar = this.b;
        cVar.c = cVar;
        cVar.b = cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        com.facetec.sdk.fp.c<K, V> b2 = b(obj);
        if (b2 != null) {
            return b2.g;
        }
        return null;
    }

    private com.facetec.sdk.fp.c<K, V> e(K k, boolean z) {
        int i;
        com.facetec.sdk.fp.c<K, V> cVar;
        java.util.Comparator<? super K> comparator = this.f3574a;
        com.facetec.sdk.fp.c<K, V> cVar2 = this.i;
        if (cVar2 != null) {
            java.lang.Comparable comparable = comparator == c ? (java.lang.Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(cVar2.i);
                } else {
                    i = comparator.compare(k, cVar2.i);
                }
                if (i != 0) {
                    com.facetec.sdk.fp.c<K, V> cVar3 = i < 0 ? cVar2.d : cVar2.e;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar2 = cVar3;
                } else {
                    return cVar2;
                }
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        com.facetec.sdk.fp.c<K, V> cVar4 = this.b;
        if (cVar2 == null) {
            if (comparator == c && !(k instanceof java.lang.Comparable)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(k.getClass().getName());
                sb.append(" is not Comparable");
                throw new java.lang.ClassCastException(sb.toString());
            }
            cVar = new com.facetec.sdk.fp.c<>(this.g, cVar2, k, cVar4, cVar4.c);
            this.i = cVar;
        } else {
            cVar = new com.facetec.sdk.fp.c<>(this.g, cVar2, k, cVar4, cVar4.c);
            if (i < 0) {
                cVar2.d = cVar;
            } else {
                cVar2.e = cVar;
            }
            c((com.facetec.sdk.fp.c) cVar2, true);
        }
        this.e++;
        this.d++;
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.facetec.sdk.fp.c<K, V> e(java.lang.Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return e(obj, false);
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    final com.facetec.sdk.fp.c<K, V> a(java.util.Map.Entry<?, ?> entry) {
        com.facetec.sdk.fp.c<K, V> e2 = e(entry.getKey());
        if (e2 == null) {
            return null;
        }
        V v = e2.g;
        java.lang.Object value = entry.getValue();
        if (v == value || (v != null && v.equals(value))) {
            return e2;
        }
        return null;
    }

    final void d(com.facetec.sdk.fp.c<K, V> cVar, boolean z) {
        int i;
        if (z) {
            cVar.c.b = cVar.b;
            cVar.b.c = cVar.c;
        }
        com.facetec.sdk.fp.c<K, V> cVar2 = cVar.d;
        com.facetec.sdk.fp.c<K, V> cVar3 = cVar.e;
        com.facetec.sdk.fp.c<K, V> cVar4 = cVar.f3576a;
        int i2 = 0;
        if (cVar2 != null && cVar3 != null) {
            if (cVar2.j > cVar3.j) {
                com.facetec.sdk.fp.c<K, V> cVar5 = cVar2.e;
                while (cVar5 != null) {
                    com.facetec.sdk.fp.c<K, V> cVar6 = cVar5;
                    cVar5 = cVar5.e;
                    cVar2 = cVar6;
                }
            } else {
                while (true) {
                    com.facetec.sdk.fp.c<K, V> cVar7 = cVar3.d;
                    if (cVar7 == null) {
                        break;
                    } else {
                        cVar3 = cVar7;
                    }
                }
                cVar2 = cVar3;
            }
            d(cVar2, false);
            com.facetec.sdk.fp.c<K, V> cVar8 = cVar.d;
            if (cVar8 != null) {
                i = cVar8.j;
                cVar2.d = cVar8;
                cVar8.f3576a = cVar2;
                cVar.d = null;
            } else {
                i = 0;
            }
            com.facetec.sdk.fp.c<K, V> cVar9 = cVar.e;
            if (cVar9 != null) {
                i2 = cVar9.j;
                cVar2.e = cVar9;
                cVar9.f3576a = cVar2;
                cVar.e = null;
            }
            cVar2.j = java.lang.Math.max(i, i2) + 1;
            c(cVar, cVar2);
            return;
        }
        if (cVar2 != null) {
            c(cVar, cVar2);
            cVar.d = null;
        } else if (cVar3 != null) {
            c(cVar, cVar3);
            cVar.e = null;
        } else {
            c(cVar, (com.facetec.sdk.fp.c) null);
        }
        c((com.facetec.sdk.fp.c) cVar4, false);
        this.e--;
        this.d++;
    }

    final com.facetec.sdk.fp.c<K, V> b(java.lang.Object obj) {
        com.facetec.sdk.fp.c<K, V> e2 = e(obj);
        if (e2 != null) {
            d(e2, true);
        }
        return e2;
    }

    private void c(com.facetec.sdk.fp.c<K, V> cVar, com.facetec.sdk.fp.c<K, V> cVar2) {
        com.facetec.sdk.fp.c<K, V> cVar3 = cVar.f3576a;
        cVar.f3576a = null;
        if (cVar2 != null) {
            cVar2.f3576a = cVar3;
        }
        if (cVar3 != null) {
            if (cVar3.d == cVar) {
                cVar3.d = cVar2;
                return;
            } else {
                if (!f && cVar3.e != cVar) {
                    throw new java.lang.AssertionError();
                }
                cVar3.e = cVar2;
                return;
            }
        }
        this.i = cVar2;
    }

    private void c(com.facetec.sdk.fp.c<K, V> cVar, boolean z) {
        while (cVar != null) {
            com.facetec.sdk.fp.c<K, V> cVar2 = cVar.d;
            com.facetec.sdk.fp.c<K, V> cVar3 = cVar.e;
            int i = cVar2 != null ? cVar2.j : 0;
            int i2 = cVar3 != null ? cVar3.j : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                com.facetec.sdk.fp.c<K, V> cVar4 = cVar3.d;
                com.facetec.sdk.fp.c<K, V> cVar5 = cVar3.e;
                int i4 = (cVar4 != null ? cVar4.j : 0) - (cVar5 != null ? cVar5.j : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    c(cVar);
                } else {
                    if (!f && i4 != 1) {
                        throw new java.lang.AssertionError();
                    }
                    e((com.facetec.sdk.fp.c) cVar3);
                    c(cVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                com.facetec.sdk.fp.c<K, V> cVar6 = cVar2.d;
                com.facetec.sdk.fp.c<K, V> cVar7 = cVar2.e;
                int i5 = (cVar6 != null ? cVar6.j : 0) - (cVar7 != null ? cVar7.j : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    e((com.facetec.sdk.fp.c) cVar);
                } else {
                    if (!f && i5 != -1) {
                        throw new java.lang.AssertionError();
                    }
                    c(cVar2);
                    e((com.facetec.sdk.fp.c) cVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                cVar.j = i + 1;
                if (z) {
                    return;
                }
            } else {
                if (!f && i3 != -1 && i3 != 1) {
                    throw new java.lang.AssertionError();
                }
                cVar.j = java.lang.Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            cVar = cVar.f3576a;
        }
    }

    private void c(com.facetec.sdk.fp.c<K, V> cVar) {
        com.facetec.sdk.fp.c<K, V> cVar2 = cVar.d;
        com.facetec.sdk.fp.c<K, V> cVar3 = cVar.e;
        com.facetec.sdk.fp.c<K, V> cVar4 = cVar3.d;
        com.facetec.sdk.fp.c<K, V> cVar5 = cVar3.e;
        cVar.e = cVar4;
        if (cVar4 != null) {
            cVar4.f3576a = cVar;
        }
        c(cVar, cVar3);
        cVar3.d = cVar;
        cVar.f3576a = cVar3;
        cVar.j = java.lang.Math.max(cVar2 != null ? cVar2.j : 0, cVar4 != null ? cVar4.j : 0) + 1;
        cVar3.j = java.lang.Math.max(cVar.j, cVar5 != null ? cVar5.j : 0) + 1;
    }

    private void e(com.facetec.sdk.fp.c<K, V> cVar) {
        com.facetec.sdk.fp.c<K, V> cVar2 = cVar.d;
        com.facetec.sdk.fp.c<K, V> cVar3 = cVar.e;
        com.facetec.sdk.fp.c<K, V> cVar4 = cVar2.d;
        com.facetec.sdk.fp.c<K, V> cVar5 = cVar2.e;
        cVar.d = cVar5;
        if (cVar5 != null) {
            cVar5.f3576a = cVar;
        }
        c(cVar, cVar2);
        cVar2.e = cVar;
        cVar.f3576a = cVar2;
        cVar.j = java.lang.Math.max(cVar3 != null ? cVar3.j : 0, cVar5 != null ? cVar5.j : 0) + 1;
        cVar2.j = java.lang.Math.max(cVar.j, cVar4 != null ? cVar4.j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        com.facetec.sdk.fp<K, V>.b bVar = this.h;
        if (bVar != null) {
            return bVar;
        }
        com.facetec.sdk.fp<K, V>.b bVar2 = new com.facetec.sdk.fp.b();
        this.h = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<K> keySet() {
        com.facetec.sdk.fp<K, V>.a aVar = this.j;
        if (aVar != null) {
            return aVar;
        }
        com.facetec.sdk.fp<K, V>.a aVar2 = new com.facetec.sdk.fp.a();
        this.j = aVar2;
        return aVar2;
    }

    static final class c<K, V> implements java.util.Map.Entry<K, V> {
        public static int f;
        public static int h;

        /* renamed from: a, reason: collision with root package name */
        com.facetec.sdk.fp.c<K, V> f3576a;
        com.facetec.sdk.fp.c<K, V> b;
        com.facetec.sdk.fp.c<K, V> c;
        com.facetec.sdk.fp.c<K, V> d;
        com.facetec.sdk.fp.c<K, V> e;
        V g;
        final K i;
        int j;
        private boolean k;

        c(boolean z) {
            this.i = null;
            this.k = z;
            this.c = this;
            this.b = this;
        }

        c(boolean z, com.facetec.sdk.fp.c<K, V> cVar, K k, com.facetec.sdk.fp.c<K, V> cVar2, com.facetec.sdk.fp.c<K, V> cVar3) {
            this.f3576a = cVar;
            this.i = k;
            this.k = z;
            this.j = 1;
            this.b = cVar2;
            this.c = cVar3;
            cVar3.b = this;
            cVar2.c = this;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.i;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.g;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (v == null && !this.k) {
                throw new java.lang.NullPointerException("value == null");
            }
            V v2 = this.g;
            this.g = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            K k = this.i;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.g;
            return v == null ? entry.getValue() == null : v.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.i;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.g;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.i);
            sb.append("=");
            sb.append(this.g);
            return sb.toString();
        }

        public static int e() {
            int i = h;
            h = i + 1;
            if (i % 6842201 != 0) {
                return f;
            }
            int nextInt = new java.util.Random().nextInt();
            f = nextInt;
            return nextInt;
        }
    }

    abstract class e<T> implements java.util.Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        private com.facetec.sdk.fp.c<K, V> f3577a = null;
        private int b;
        private com.facetec.sdk.fp.c<K, V> c;

        e() {
            this.c = com.facetec.sdk.fp.this.b.b;
            this.b = com.facetec.sdk.fp.this.d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c != com.facetec.sdk.fp.this.b;
        }

        final com.facetec.sdk.fp.c<K, V> e() {
            com.facetec.sdk.fp.c<K, V> cVar = this.c;
            if (cVar == com.facetec.sdk.fp.this.b) {
                throw new java.util.NoSuchElementException();
            }
            if (com.facetec.sdk.fp.this.d != this.b) {
                throw new java.util.ConcurrentModificationException();
            }
            this.c = cVar.b;
            this.f3577a = cVar;
            return cVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.facetec.sdk.fp.c<K, V> cVar = this.f3577a;
            if (cVar == null) {
                throw new java.lang.IllegalStateException();
            }
            com.facetec.sdk.fp.this.d(cVar, true);
            this.f3577a = null;
            this.b = com.facetec.sdk.fp.this.d;
        }
    }

    final class b extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        public static int d;
        public static int e;

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return com.facetec.sdk.fp.this.e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new com.facetec.sdk.fp<K, V>.e<java.util.Map.Entry<K, V>>() { // from class: com.facetec.sdk.fp.b.1
                {
                    com.facetec.sdk.fp fpVar = com.facetec.sdk.fp.this;
                }

                @Override // java.util.Iterator
                public final /* synthetic */ java.lang.Object next() {
                    return e();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return (obj instanceof java.util.Map.Entry) && com.facetec.sdk.fp.this.a((java.util.Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            com.facetec.sdk.fp.c<K, V> a2;
            if (!(obj instanceof java.util.Map.Entry) || (a2 = com.facetec.sdk.fp.this.a((java.util.Map.Entry) obj)) == null) {
                return false;
            }
            com.facetec.sdk.fp.this.d(a2, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            com.facetec.sdk.fp.this.clear();
        }

        public static int e() {
            int i = d;
            d = i + 1;
            if (i % 7764644 != 0) {
                return e;
            }
            int nextInt = new java.util.Random().nextInt(1923462786);
            e = nextInt;
            return nextInt;
        }
    }

    final class a extends java.util.AbstractSet<K> {

        /* renamed from: a, reason: collision with root package name */
        public static int f3575a;
        public static int b;

        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return com.facetec.sdk.fp.this.e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<K> iterator() {
            return new com.facetec.sdk.fp<K, V>.e<K>() { // from class: com.facetec.sdk.fp.a.2
                {
                    com.facetec.sdk.fp fpVar = com.facetec.sdk.fp.this;
                }

                @Override // java.util.Iterator
                public final K next() {
                    return e().i;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return com.facetec.sdk.fp.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            return com.facetec.sdk.fp.this.b(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            com.facetec.sdk.fp.this.clear();
        }

        public static int c() {
            int i = b;
            b = i + 1;
            if (i % 8165410 != 0) {
                return f3575a;
            }
            int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
            f3575a = uptimeMillis;
            return uptimeMillis;
        }
    }

    private java.lang.Object writeReplace() throws java.io.ObjectStreamException {
        return new java.util.LinkedHashMap(this);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException {
        throw new java.io.InvalidObjectException("Deserialization is unsupported");
    }
}

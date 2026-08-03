package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class PC<K, V> {
    public static java.lang.String[] A03 = {"1zdW1KODsFltmNuWmrotTBJZ", "RgZO4eFyMPRXq", "TNHX835HuEpqCwzJlYfwEUi8GaEU5NHd", "eVTb3p4k2JpJ0D4m3J9D4ZVPKPKe0wis", "2WztFDsRGhQaALYpxh067UM8", "jcxZvazs935Xr", "SKBAj5hBfWgpr40k574HTlm5xQmSLGYw", "jjH4wggc1wpWWLxRj5DmyzPuqk4QCdce"};

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/PC<TK;TV;>.EntrySet; */
    @javax.annotation.Nullable
    public com.facebook.ads.redexgen.core.P8 A00;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/PC<TK;TV;>.KeySet; */
    @javax.annotation.Nullable
    public com.facebook.ads.redexgen.core.P9 A01;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/PC<TK;TV;>.ValuesCollection; */
    @javax.annotation.Nullable
    public com.facebook.ads.redexgen.core.PB A02;

    public abstract int A04();

    public abstract int A05(java.lang.Object obj);

    public abstract int A06(java.lang.Object obj);

    public abstract java.util.Map<K, V> A07();

    public abstract java.lang.Object A0B(int i, int i2);

    public abstract V A0C(int i, V v);

    public abstract void A0D();

    public abstract void A0E(int i);

    public abstract void A0F(K k, V v);

    public static <K, V> boolean A00(java.util.Map<K, V> map, java.util.Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            boolean containsKey = map.containsKey(it.next());
            java.lang.String[] strArr = A03;
            if (strArr[6].charAt(29) == strArr[2].charAt(29)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[6] = "cUAXgIbWxWmXM8IdimkoIKbOqppmM6Vz";
            strArr2[2] = "Ax9eiVneWoZpIcbsPIrW3KpgweGiIvpy";
            if (!containsKey) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean A01(java.util.Map<K, V> map, java.util.Collection<?> collection) {
        int size = map.size();
        for (java.lang.Object obj : collection) {
            if (A03[7].charAt(9) != 'w') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A03;
            strArr[6] = "E45UHwgrMTIMwaLYI7blxmvG7mW9Qs1w";
            strArr[2] = "z9os9R0vn0p5TampC1nMxoZk5TfunpzS";
            map.remove(obj);
        }
        int oldSize = map.size();
        return size != oldSize;
    }

    public static <K, V> boolean A02(java.util.Map<K, V> map, java.util.Collection<?> collection) {
        int size = map.size();
        java.util.Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            boolean contains = collection.contains(it.next());
            java.lang.String[] strArr = A03;
            java.lang.String str = strArr[4];
            java.lang.String str2 = strArr[0];
            int length = str.length();
            int oldSize = str2.length();
            if (length != oldSize) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[6] = "5v4gpohEe9mjCzRiIQv41Zeqn5qom46c";
            strArr2[2] = "O6DgVsMjSRRAXWI9cjkKRDle2DCyXpBO";
            if (!contains) {
                it.remove();
            }
        }
        int oldSize2 = map.size();
        return size != oldSize2;
    }

    public static <T> boolean A03(java.util.Set<T> set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        boolean z = obj instanceof java.util.Set;
        java.lang.String[] strArr = A03;
        if (strArr[5].length() != strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A03;
        strArr2[4] = "EyqH2KYHB8yq5zU8TINZ2CMR";
        strArr2[0] = "l4DYdurHJXrazQVJZIOfW52E";
        if (!z) {
            return false;
        }
        java.util.Set set2 = (java.util.Set) obj;
        try {
            if (set.size() == set2.size()) {
                if (set.containsAll(set2)) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.ClassCastException unused) {
            return false;
        } catch (java.lang.NullPointerException unused2) {
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PC != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final java.util.Set<java.util.Map.Entry<K, V>> A08() {
        if (this.A00 == null) {
            this.A00 = new com.facebook.ads.redexgen.core.P8(this);
        }
        com.facebook.ads.redexgen.core.P8 p8 = this.A00;
        java.lang.String[] strArr = A03;
        if (strArr[6].charAt(29) == strArr[2].charAt(29)) {
            throw new java.lang.RuntimeException();
        }
        A03[3] = "P6bvb6eoffQLg6Q5qx1NG9tFVzgAZtCe";
        return p8;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PC != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final java.util.Set<K> A09() {
        if (this.A01 == null) {
            this.A01 = new com.facebook.ads.redexgen.core.P9(this);
        }
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PC != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final java.util.Collection<V> A0A() {
        if (this.A02 == null) {
            this.A02 = new com.facebook.ads.redexgen.core.PB(this);
        }
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PC != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final java.lang.Object[] A0G(int i) {
        int A04 = A04();
        java.lang.Object[] objArr = new java.lang.Object[A04];
        for (int i2 = 0; i2 < A04; i2++) {
            objArr[i2] = A0B(i2, i);
        }
        return objArr;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PC != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final <T> T[] A0H(T[] tArr, int i) {
        int A04 = A04();
        if (tArr.length < A04) {
            tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), A04));
        }
        for (int i2 = 0; i2 < A04; i2++) {
            tArr[i2] = A0B(i2, i);
        }
        if (tArr.length > A04) {
            tArr[A04] = null;
        }
        return tArr;
    }
}

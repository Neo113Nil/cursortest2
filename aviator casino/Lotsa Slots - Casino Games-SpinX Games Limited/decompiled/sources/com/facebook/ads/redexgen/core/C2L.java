package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.2L, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C2L<K, V> extends com.facebook.ads.redexgen.core.AbstractC0604Bq<K, V> implements java.io.Serializable {
    public static byte[] A02 = null;
    public static java.lang.String[] A03 = {"8r4g5TVHuPTTEnOtjBSYLe2NoPZev3PL", "ZANRIcgacCs2MrGdQFs4BnSQ4f0OwMHM", "INAFHP4NB26l7mhFzzAYwDEUO08LdW1T", "w9HTcMerj5Ucor1CBa36675WVQ4LimP", "S0p05mXNQ0J7ss", "bhB1flpiQfpMN0", "TPylgZWOdIZWygeLq1OgLn1DVzZt4taa", "Gp6xvn2xjKoLwUaOKBIxtDMJneYJVeH8"};
    public static final long serialVersionUID = 2447537837011683357L;
    public transient int A00;
    public transient java.util.Map<K, java.util.Collection<V>> A01;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 76);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A08() {
        A02 = new byte[]{56, 19, 1, 86, 53, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SUB, 19, com.google.common.base.Ascii.NAK, 2, com.google.common.base.Ascii.US, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CAN, 86, 0, com.google.common.base.Ascii.US, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, 2, 19, com.google.common.base.Ascii.DC2, 86, 2, com.google.common.base.Ascii.RS, 19, 86, 53, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SUB, 19, com.google.common.base.Ascii.NAK, 2, com.google.common.base.Ascii.US, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CAN, 86, 5, 6, 19, com.google.common.base.Ascii.NAK};
    }

    public abstract java.util.Collection<V> A0D();

    public abstract java.util.Collection<V> A0F(@com.google.common.collect.ParametricNullness K key, java.util.Collection<V> collection);

    public abstract <E> java.util.Collection<E> A0G(java.util.Collection<E> collection);

    static {
        A08();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public C2L(java.util.Map<K, java.util.Collection<V>> map) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A0C(map.isEmpty());
        this.A01 = map;
    }

    public static /* synthetic */ int A00(com.facebook.ads.redexgen.core.C2L c2l) {
        int i = c2l.A00;
        c2l.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A01(com.facebook.ads.redexgen.core.C2L c2l) {
        int i = c2l.A00;
        c2l.A00 = i - 1;
        return i;
    }

    public static /* synthetic */ int A02(com.facebook.ads.redexgen.core.C2L c2l, int i) {
        int i2 = c2l.A00 + i;
        c2l.A00 = i2;
        return i2;
    }

    public static /* synthetic */ int A03(com.facebook.ads.redexgen.core.C2L c2l, int i) {
        int i2 = c2l.A00 - i;
        c2l.A00 = i2;
        return i2;
    }

    public static <E> java.util.Iterator<E> A05(java.util.Collection<E> collection) {
        if (collection instanceof java.util.List) {
            return ((java.util.List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public void A0A(@javax.annotation.CheckForNull java.lang.Object key) {
        java.util.Collection<V> collection = (java.util.Collection) com.facebook.ads.redexgen.core.AbstractC2166po.A06(this.A01, key);
        if (collection != null) {
            int count = collection.size();
            collection.clear();
            this.A00 -= count;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC0604Bq
    public final java.util.Collection<V> A0B() {
        return new com.facebook.ads.redexgen.core.C1937ls(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC0604Bq
    public java.util.Iterator<V> A0C() {
        return new com.facebook.ads.redexgen.core.C0608Bu(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public java.util.Collection<V> A0E(@com.google.common.collect.ParametricNullness K key) {
        return A0D();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lp != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/List<TV;>;Lcom/facebook/ads/redexgen/X/2L<TK;TV;>.WrappedCollection;)Ljava/util/List<TV;>; */
    public final java.util.List A0H(@com.google.common.collect.ParametricNullness java.lang.Object key, @javax.annotation.CheckForNull java.util.List list, com.facebook.ads.redexgen.core.C1934lp ancestor) {
        if (list instanceof java.util.RandomAccess) {
            return new com.facebook.ads.redexgen.core.C2N(this, key, list, ancestor);
        }
        return new com.facebook.ads.redexgen.core.C0605Br(this, key, list, ancestor);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public java.util.Map<K, java.util.Collection<V>> A0I() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public final java.util.Map<K, java.util.Collection<V>> A0J() {
        if (this.A01 instanceof java.util.NavigableMap) {
            return new com.facebook.ads.redexgen.core.AnonymousClass19(this, (java.util.NavigableMap) this.A01);
        }
        boolean z = this.A01 instanceof java.util.SortedMap;
        if (A03[2].charAt(31) == 'o') {
            throw new java.lang.RuntimeException();
        }
        A03[3] = "NCYt1eTwLWbpcysHbDqNMrCxO6pYN55";
        if (z) {
            return new com.facebook.ads.redexgen.core.C2M(this, (java.util.SortedMap) this.A01);
        }
        return new com.facebook.ads.redexgen.core.C0607Bt(this, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public final java.util.Set<K> A0K() {
        if (this.A01 instanceof java.util.NavigableMap) {
            return new com.facebook.ads.redexgen.core.C0u(this, (java.util.NavigableMap) this.A01);
        }
        if (this.A01 instanceof java.util.SortedMap) {
            return new com.facebook.ads.redexgen.core.AnonymousClass18(this, (java.util.SortedMap) this.A01);
        }
        return new com.facebook.ads.redexgen.core.C2O(this, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public final void A0L(java.util.Map<K, java.util.Collection<V>> map) {
        this.A01 = map;
        this.A00 = 0;
        for (java.util.Collection<V> collection : map.values()) {
            com.facebook.ads.redexgen.core.AbstractC1866ki.A0C(!collection.isEmpty());
            this.A00 += collection.size();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2181q3
    public boolean AHE(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        java.util.Collection<V> collection = this.A01.get(key);
        if (collection == null) {
            java.util.Collection<V> A0E = A0E(key);
            if (A0E.add(value)) {
                this.A00++;
                this.A01.put(key, A0E);
                return true;
            }
            throw new java.lang.AssertionError(A04(0, 43, 58));
        }
        if (collection.add(value)) {
            int i = this.A00 + 1;
            if (A03[2].charAt(31) == 'o') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A03;
            strArr[4] = "qdqPg3EJJL9zSp";
            strArr[5] = "JvkYzNNxKsGyOY";
            this.A00 = i;
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2181q3
    public void clear() {
        java.util.Iterator<java.util.Collection<V>> it = this.A01.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.A01.clear();
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2181q3
    public int size() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC0604Bq, com.facebook.ads.redexgen.core.InterfaceC2181q3
    public java.util.Collection<V> values() {
        return super.values();
    }
}

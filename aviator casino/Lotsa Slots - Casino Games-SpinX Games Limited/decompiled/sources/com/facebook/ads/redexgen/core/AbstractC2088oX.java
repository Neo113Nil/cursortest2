package com.facebook.ads.redexgen.core;

@com.google.errorprone.annotations.DoNotMock("Use ImmutableMap.of or another implementation")
@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.oX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2088oX<K, V> implements java.util.Map<K, V>, java.io.Serializable {
    public static byte[] A03 = null;
    public static java.lang.String[] A04 = {"vKCQqMCBbbLRNayk93g", "pkt0IymnSuuTvT2UABZ", "PNc8ARlkPwYFJqJCIOuFP53ZqzL63Ot9", "eX2I8z36J32Go", "gIGV4Wf8BZM4VYT7BzYv5KONe75pspBB", "tYe4jTWn6nAHNSv3aqiqFSpTtkmDAUnf", "8sr0nS9u8yYglBLPy9xKZ", "QmruhXeOtXDmPURP7V7IzoRRfHSq4IXC"};
    public static final java.util.Map.Entry<?, ?>[] A05;
    public static final long serialVersionUID = 912559;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    public transient com.facebook.ads.redexgen.core.AbstractC2079oO<V> A00;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    public transient com.facebook.ads.redexgen.core.BO<java.util.Map.Entry<K, V>> A01;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    public transient com.facebook.ads.redexgen.core.BO<K> A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <K, V> com.facebook.ads.redexgen.core.AbstractC2088oX<K, V> A05(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> entries) {
        com.facebook.ads.redexgen.core.C2086oV c2086oV = new com.facebook.ads.redexgen.core.C2086oV(entries instanceof java.util.Collection ? ((java.util.Collection) entries).size() : 4);
        c2086oV.A04(entries);
        return c2086oV.A07();
    }

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 10);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A08() {
        A03 = new byte[]{103, -123, 119, 50, 101, 119, -124, 123, 115, 126, 123, -116, 119, 118, 88, -127, -124, Byte.MAX_VALUE};
    }

    public abstract com.facebook.ads.redexgen.core.AbstractC2079oO<V> A0A();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.Map
    /* renamed from: A0B, reason: merged with bridge method [inline-methods] */
    public com.facebook.ads.redexgen.core.BO<java.util.Map.Entry<K, V>> entrySet() {
        com.facebook.ads.redexgen.core.BO<java.util.Map.Entry<K, V>> bo = this.A01;
        if (bo != null) {
            return bo;
        }
        com.facebook.ads.redexgen.core.BO<java.util.Map.Entry<K, V>> A0D = A0D();
        this.A01 = A0D;
        return A0D;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.Map
    /* renamed from: A0C, reason: merged with bridge method [inline-methods] */
    public com.facebook.ads.redexgen.core.BO<K> keySet() {
        com.facebook.ads.redexgen.core.BO<K> bo = this.A02;
        if (bo != null) {
            return bo;
        }
        com.facebook.ads.redexgen.core.BO<K> A0E = A0E();
        this.A02 = A0E;
        return A0E;
    }

    public abstract com.facebook.ads.redexgen.core.BO<java.util.Map.Entry<K, V>> A0D();

    public abstract com.facebook.ads.redexgen.core.BO<K> A0E();

    public abstract boolean A0F();

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    public abstract V get(@javax.annotation.CheckForNull java.lang.Object key);

    static {
        A08();
        A05 = new java.util.Map.Entry[0];
    }

    public static <K, V> com.facebook.ads.redexgen.core.C2086oV<K, V> A03() {
        return new com.facebook.ads.redexgen.core.C2086oV<>();
    }

    public static <K, V> com.facebook.ads.redexgen.core.AbstractC2088oX<K, V> A04() {
        com.facebook.ads.redexgen.core.AbstractC2088oX<K, V> abstractC2088oX = (com.facebook.ads.redexgen.core.AbstractC2088oX<K, V>) com.facebook.ads.redexgen.core.B9.A04;
        if (A04[4].charAt(3) != 'V') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A04;
        strArr[0] = "QWSx7KQEMPZzsm7sYqB";
        strArr[1] = "rV1plHJifYQu2yuYFjd";
        return abstractC2088oX;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    public static <K, V> com.facebook.ads.redexgen.core.AbstractC2088oX<K, V> A06(java.util.Map<? extends K, ? extends V> map) {
        if ((map instanceof com.facebook.ads.redexgen.core.AbstractC2088oX) && !(map instanceof java.util.SortedMap)) {
            com.facebook.ads.redexgen.core.AbstractC2088oX<K, V> abstractC2088oX = (com.facebook.ads.redexgen.core.AbstractC2088oX) map;
            if (!abstractC2088oX.A0F()) {
                return abstractC2088oX;
            }
        }
        return A05(map.entrySet());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oO != com.google.common.collect.ImmutableCollection<V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    /* renamed from: A09, reason: merged with bridge method [inline-methods] */
    public com.facebook.ads.redexgen.core.AbstractC2079oO<V> values() {
        com.facebook.ads.redexgen.core.AbstractC2079oO<V> abstractC2079oO = this.A00;
        if (abstractC2079oO == null) {
            abstractC2079oO = A0A();
            if (A04[3].length() == 23) {
                throw new java.lang.RuntimeException();
            }
            A04[6] = "23ujWmcydF5ICCpn56C";
            this.A00 = abstractC2079oO;
        }
        return abstractC2079oO;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return get(key) != null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public final boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        return values().contains(value);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return com.facebook.ads.redexgen.core.AbstractC2166po.A0B(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @javax.annotation.CheckForNull
    public final V getOrDefault(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull V defaultValue) {
        V result = get(key);
        if (result != null) {
            return result;
        }
        return defaultValue;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public int hashCode() {
        return com.facebook.ads.redexgen.core.AbstractC2219qj.A00(entrySet());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final V put(K k, V v) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @java.lang.Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException(A07(0, 18, 8));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final V remove(@javax.annotation.CheckForNull java.lang.Object o) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    public final java.lang.String toString() {
        return com.facebook.ads.redexgen.core.AbstractC2166po.A08(this);
    }
}

package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.nh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2037nh<K, V> extends java.util.AbstractMap<K, V> implements java.io.Serializable {
    public static byte[] A09;
    public static java.lang.String[] A0A = {"wSivjbfpZ5vyyNQvPGO2", "feAeK30V825ODXthr2nXiZ2IyDp7foTM", "DkUlp4YVWOkxqgis7dBpeo68CZmBo3n0", "aa93WRLI7l2jdXj6upMcNohuPuXZSHnj", "yd6MpWWB34WJL2xwsTp1Hrf9QPnPIJjU", "QxuCDFa1e2lEwJ6Nl0AGtIVp0Ykbd3", "6Mqvrbexx8eO9W", "SxE34IM9tKvZCcEi8I123n5xI40gl8"};
    public static final java.lang.Object A0B;

    @javax.annotation.CheckForNull
    public transient int[] A00;

    @javax.annotation.CheckForNull
    public transient java.lang.Object[] A01;

    @javax.annotation.CheckForNull
    public transient java.lang.Object[] A02;
    public transient int A03;
    public transient int A04;

    @javax.annotation.CheckForNull
    public transient java.lang.Object A05;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    public transient java.util.Collection<V> A06;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    public transient java.util.Set<java.util.Map.Entry<K, V>> A07;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    public transient java.util.Set<K> A08;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public int A07(@javax.annotation.CheckForNull java.lang.Object key) {
        if (A0p()) {
            return -1;
        }
        int A02 = com.facebook.ads.redexgen.core.AbstractC2073oI.A02(key);
        int A00 = A00();
        int A05 = com.facebook.ads.redexgen.core.AbstractC2040nk.A05(A0C(), A02 & A00);
        if (A05 == 0) {
            return -1;
        }
        int A022 = com.facebook.ads.redexgen.core.AbstractC2040nk.A02(A02, A00);
        do {
            int i = A05 - 1;
            int A01 = A01(i);
            if (com.facebook.ads.redexgen.core.AbstractC2040nk.A02(A01, A00) == A022 && com.facebook.ads.redexgen.core.CB.A01(key, A0E(i))) {
                return i;
            }
            A05 = com.facebook.ads.redexgen.core.AbstractC2040nk.A03(A01, A00);
        } while (A05 != 0);
        return -1;
    }

    public static java.lang.String A0L(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 52);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0M() {
        A09 = new byte[]{-18, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SO, 38, 32, -51, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SO, 17, 38, -51, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SO, 33, com.google.common.base.Ascii.DC2, 17, -119, -68, -76, -87, -89, -72, -87, -88, 100, -73, -83, -66, -87, 100, -79, -71, -73, -72, 100, -90, -87, 100, -126, -127, 100, 116, -108, -71, -63, -84, -73, -76, -81, 107, -66, -76, -59, -80, -123, 107};
        java.lang.String[] strArr = A0A;
        if (strArr[0].length() == strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0A;
        strArr2[7] = "IoFO5J0AFYg4y0jUjWJp7QnfwHFEsl";
        strArr2[5] = "MD8kR9gChUuO1ad3jnDINjX3f2IxRH";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final java.util.Iterator<java.util.Map.Entry<K, V>> A0d() {
        java.util.Map<K, V> A0h = A0h();
        return A0h != null ? A0h.entrySet().iterator() : new com.facebook.ads.redexgen.core.C0599Bl(this);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final java.util.Iterator<V> A0f() {
        java.util.Map<K, V> A0h = A0h();
        return A0h != null ? A0h.values().iterator() : new com.facebook.ads.redexgen.core.C0597Bj(this);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public void A0n(int dstIndex, int mask) {
        int i;
        int i2;
        java.lang.Object A0C = A0C();
        int[] A0T = A0T();
        java.lang.Object[] A0V = A0V();
        java.lang.Object[] A0W = A0W();
        int size = size() - 1;
        if (dstIndex >= size) {
            A0V[dstIndex] = null;
            A0W[dstIndex] = null;
            A0T[dstIndex] = 0;
            return;
        }
        java.lang.Object obj = A0V[size];
        A0V[dstIndex] = obj;
        A0W[dstIndex] = A0W[size];
        A0V[size] = null;
        A0W[size] = null;
        A0T[dstIndex] = A0T[size];
        java.lang.String[] strArr = A0A;
        if (strArr[0].length() == strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        A0A[4] = "JpifJf2kbZdDbZEcWvjQntDjOJA2HcxY";
        A0T[size] = 0;
        int A02 = com.facebook.ads.redexgen.core.AbstractC2073oI.A02(obj) & mask;
        int A05 = com.facebook.ads.redexgen.core.AbstractC2040nk.A05(A0C, A02);
        int i3 = size + 1;
        if (A05 == i3) {
            com.facebook.ads.redexgen.core.AbstractC2040nk.A0B(A0C, A02, dstIndex + 1);
            return;
        }
        do {
            i = A05 - 1;
            i2 = A0T[i];
            A05 = com.facebook.ads.redexgen.core.AbstractC2040nk.A03(i2, mask);
        } while (A05 != i3);
        int A04 = com.facebook.ads.redexgen.core.AbstractC2040nk.A04(i2, dstIndex + 1, mask);
        if (A0A[4].charAt(27) == 'c') {
            throw new java.lang.RuntimeException();
        }
        A0A[2] = "ewyZpZbIi25h1LX0jZUdN0qrqZxWH2dV";
        A0T[i] = A04;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public final V put(@com.google.common.collect.ParametricNullness K k, @com.google.common.collect.ParametricNullness V v) {
        int i;
        int i2;
        if (A0p()) {
            A0Z();
        }
        java.util.Map<K, V> A0h = A0h();
        if (A0h != null) {
            return A0h.put(k, v);
        }
        int[] A0T = A0T();
        java.lang.Object[] A0V = A0V();
        java.lang.Object[] A0W = A0W();
        int i3 = this.A04;
        int i4 = i3 + 1;
        int A02 = com.facebook.ads.redexgen.core.AbstractC2073oI.A02(k);
        int A00 = A00();
        int i5 = A02 & A00;
        int A05 = com.facebook.ads.redexgen.core.AbstractC2040nk.A05(A0C(), i5);
        if (A05 != 0) {
            int A022 = com.facebook.ads.redexgen.core.AbstractC2040nk.A02(A02, A00);
            int i6 = 0;
            do {
                i = A05 - 1;
                i2 = A0T[i];
                if (com.facebook.ads.redexgen.core.AbstractC2040nk.A02(i2, A00) == A022 && com.facebook.ads.redexgen.core.CB.A01(k, A0V[i])) {
                    V v2 = (V) A0W[i];
                    A0W[i] = v;
                    A0k(i);
                    return v2;
                }
                A05 = com.facebook.ads.redexgen.core.AbstractC2040nk.A03(i2, A00);
                i6++;
            } while (A05 != 0);
            if (i6 >= 9) {
                return A0g().put(k, v);
            }
            if (i4 > A00) {
                A00 = A02(A00, com.facebook.ads.redexgen.core.AbstractC2040nk.A00(A00), A02, i3);
            } else {
                A0T[i] = com.facebook.ads.redexgen.core.AbstractC2040nk.A04(i2, i3 + 1, A00);
            }
        } else {
            if (i4 <= A00) {
                com.facebook.ads.redexgen.core.AbstractC2040nk.A0B(A0C(), i5, i3 + 1);
                java.lang.String[] strArr = A0A;
                if (strArr[0].length() != strArr[1].length()) {
                    A0A[2] = "2ZAiwLyczl80nzcVv99ytgXWx8HMLtqx";
                }
                throw new java.lang.RuntimeException();
            }
            A00 = A02(A00, com.facebook.ads.redexgen.core.AbstractC2040nk.A00(A00), A02, i3);
        }
        A0N(i4);
        A0o(i3, k, v, A02, A00);
        this.A04 = i4;
        A0j();
        if (A0A[6].length() == 14) {
            java.lang.String[] strArr2 = A0A;
            strArr2[0] = "efczO3YJEcN3CoMhojB5";
            strArr2[1] = "vhmQa5OnZZeWmVDY77t31AOxDsfMGclq";
            return null;
        }
        throw new java.lang.RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        java.util.Map<K, V> A0h = A0h();
        return A0h != null ? A0h.size() : this.A04;
    }

    static {
        A0M();
        A0B = new java.lang.Object();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public C2037nh() {
        A0l(3);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public C2037nh(int expectedSize) {
        A0l(expectedSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public int A00() {
        return (1 << (this.A03 & 31)) - 1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    private int A01(int i) {
        return A0T()[i];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    private int A02(int oldMask, int newCapacity, int targetHash, int targetEntryIndex) {
        java.lang.Object A07 = com.facebook.ads.redexgen.core.AbstractC2040nk.A07(newCapacity);
        int hash = newCapacity - 1;
        if (targetEntryIndex != 0) {
            com.facebook.ads.redexgen.core.AbstractC2040nk.A0B(A07, targetHash & hash, targetEntryIndex + 1);
        }
        java.lang.Object A0C = A0C();
        int[] A0T = A0T();
        for (int oldTableIndex = 0; oldTableIndex <= oldMask; oldTableIndex++) {
            int A05 = com.facebook.ads.redexgen.core.AbstractC2040nk.A05(A0C, oldTableIndex);
            while (A05 != 0) {
                int i = A05 - 1;
                int newMask = A0T[i];
                int A02 = com.facebook.ads.redexgen.core.AbstractC2040nk.A02(newMask, oldMask) | oldTableIndex;
                int i2 = A02 & hash;
                int A052 = com.facebook.ads.redexgen.core.AbstractC2040nk.A05(A07, i2);
                com.facebook.ads.redexgen.core.AbstractC2040nk.A0B(A07, i2, A05);
                A0T[i] = com.facebook.ads.redexgen.core.AbstractC2040nk.A04(A02, A052, hash);
                A05 = com.facebook.ads.redexgen.core.AbstractC2040nk.A03(newMask, oldMask);
            }
        }
        this.A05 = A07;
        A0O(hash);
        return hash;
    }

    public static /* synthetic */ int A04(com.facebook.ads.redexgen.core.C2037nh c2037nh) {
        int i = c2037nh.A04;
        c2037nh.A04 = i - 1;
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    private final java.util.Set<java.util.Map.Entry<K, V>> A08() {
        return new com.facebook.ads.redexgen.core.C2033nd(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    private final java.util.Set<K> A09() {
        return new com.facebook.ads.redexgen.core.C2035nf(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    private final java.util.Collection<V> A0A() {
        return new com.facebook.ads.redexgen.core.C2036ng(this);
    }

    public static <K, V> com.facebook.ads.redexgen.core.C2037nh<K, V> A0B(int expectedSize) {
        return new com.facebook.ads.redexgen.core.C2037nh<>(expectedSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public java.lang.Object A0C() {
        return java.util.Objects.requireNonNull(this.A05);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public K A0E(int i) {
        return (K) A0V()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public V A0F(int i) {
        return (V) A0W()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public java.lang.Object A0K(@javax.annotation.CheckForNull java.lang.Object key) {
        if (A0p()) {
            return A0B;
        }
        int A00 = A00();
        int A06 = com.facebook.ads.redexgen.core.AbstractC2040nk.A06(key, null, A00, A0C(), A0T(), A0V(), null);
        if (A06 == -1) {
            java.lang.Object obj = A0B;
            java.lang.String[] strArr = A0A;
            java.lang.String str = strArr[7];
            java.lang.String str2 = strArr[5];
            int index = str.length();
            int mask = str2.length();
            if (index != mask) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0A;
            strArr2[0] = "F8ZzCx46VEt3o6V5ZJCH";
            strArr2[1] = "RA5kHayy5QpfLDjl1dNEtk1yryeED7Tz";
            return obj;
        }
        V A0F = A0F(A06);
        A0n(A06, A00);
        int mask2 = this.A04;
        this.A04 = mask2 - 1;
        A0j();
        return A0F;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    private void A0N(int newSize) {
        int entriesSize;
        int length = A0T().length;
        if (newSize > length && (entriesSize = java.lang.Math.min(kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (java.lang.Math.max(1, length >>> 1) + length) | 1)) != length) {
            A0m(entriesSize);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    private void A0O(int mask) {
        int hashTableBits = com.facebook.ads.redexgen.core.AbstractC2040nk.A04(this.A03, 32 - java.lang.Integer.numberOfLeadingZeros(mask), 31);
        this.A03 = hashTableBits;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    private void A0P(int i, int value) {
        A0T()[i] = value;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    private void A0Q(int i, K key) {
        A0V()[i] = key;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public void A0R(int i, V value) {
        A0W()[i] = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public int[] A0T() {
        return (int[]) java.util.Objects.requireNonNull(this.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public java.lang.Object[] A0V() {
        return (java.lang.Object[]) java.util.Objects.requireNonNull(this.A01);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public java.lang.Object[] A0W() {
        return (java.lang.Object[]) java.util.Objects.requireNonNull(this.A02);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public int A0Z() {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A0F(A0p(), A0L(0, 24, 121));
        int i = this.A03;
        int buckets = com.facebook.ads.redexgen.core.AbstractC2040nk.A01(i);
        this.A05 = com.facebook.ads.redexgen.core.AbstractC2040nk.A07(buckets);
        int expectedSize = buckets - 1;
        A0O(expectedSize);
        this.A00 = new int[i];
        this.A01 = new java.lang.Object[i];
        this.A02 = new java.lang.Object[i];
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public int A0a() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public int A0b(int entryIndex) {
        if (entryIndex + 1 < this.A04) {
            return entryIndex + 1;
        }
        return -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public int A0c(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove - 1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public final java.util.Iterator<K> A0e() {
        java.util.Map<K, V> delegate = A0h();
        if (delegate != null) {
            java.util.Iterator<K> it = delegate.keySet().iterator();
            java.lang.String[] strArr = A0A;
            if (strArr[0].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            A0A[3] = "GopoyTSNvP2uUGwCw8coQru7y5edTQ0w";
            return it;
        }
        return new com.facebook.ads.redexgen.core.C0600Bm(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public java.util.Map<K, V> A0g() {
        java.util.Map<K, V> A0i = A0i(A00() + 1);
        int A0a = A0a();
        while (A0a >= 0) {
            A0i.put(A0E(A0a), A0F(A0a));
            A0a = A0b(A0a);
        }
        this.A05 = A0i;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        A0j();
        return A0i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    @javax.annotation.CheckForNull
    public final java.util.Map<K, V> A0h() {
        if (this.A05 instanceof java.util.Map) {
            return (java.util.Map) this.A05;
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public java.util.Map<K, V> A0i(int tableSize) {
        return new java.util.LinkedHashMap(tableSize, 1.0f);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public final void A0j() {
        this.A03 += 32;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public void A0k(int index) {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public void A0l(int expectedSize) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A0E(expectedSize >= 0, A0L(24, 26, 16));
        this.A03 = com.facebook.ads.redexgen.core.AbstractC0580As.A01(expectedSize, 1, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public void A0m(int newCapacity) {
        this.A00 = java.util.Arrays.copyOf(A0T(), newCapacity);
        this.A01 = java.util.Arrays.copyOf(A0V(), newCapacity);
        this.A02 = java.util.Arrays.copyOf(A0W(), newCapacity);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public void A0o(@com.google.common.collect.ParametricNullness int entryIndex, @com.google.common.collect.ParametricNullness K key, V value, int hash, int mask) {
        A0P(entryIndex, com.facebook.ads.redexgen.core.AbstractC2040nk.A04(hash, 0, mask));
        A0Q(entryIndex, key);
        A0R(entryIndex, value);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    public final boolean A0p() {
        return this.A05 == null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (A0p()) {
            return;
        }
        A0j();
        java.util.Map<K, V> A0h = A0h();
        if (A0h == null) {
            java.util.Arrays.fill(A0V(), 0, this.A04, (java.lang.Object) null);
            java.util.Arrays.fill(A0W(), 0, this.A04, (java.lang.Object) null);
            com.facebook.ads.redexgen.core.AbstractC2040nk.A0A(A0C());
            if (A0A[4].charAt(27) == 'c') {
                throw new java.lang.RuntimeException();
            }
            A0A[3] = "HEGfGjMW8cX3B6hZei5dHcacBQ1QHslD";
            java.util.Arrays.fill(A0T(), 0, this.A04, 0);
            this.A04 = 0;
            return;
        }
        this.A03 = com.facebook.ads.redexgen.core.AbstractC0580As.A01(size(), 3, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        A0h.clear();
        this.A05 = null;
        this.A04 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        java.util.Map<K, V> delegate = A0h();
        return delegate != null ? delegate.containsKey(key) : A07(key) != -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        java.util.Map<K, V> delegate = A0h();
        if (delegate != null) {
            return delegate.containsValue(value);
        }
        for (int i = 0; i < this.A04; i++) {
            if (com.facebook.ads.redexgen.core.CB.A01(value, A0F(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        if (this.A07 != null) {
            return this.A07;
        }
        java.util.Set<java.util.Map.Entry<K, V>> A08 = A08();
        this.A07 = A08;
        return A08;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public final V get(@javax.annotation.CheckForNull java.lang.Object key) {
        java.util.Map<K, V> delegate = A0h();
        if (delegate != null) {
            return delegate.get(key);
        }
        int index = A07(key);
        if (index == -1) {
            return null;
        }
        A0k(index);
        return A0F(index);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<K> keySet() {
        if (this.A08 != null) {
            return this.A08;
        }
        java.util.Set<K> A092 = A09();
        this.A08 = A092;
        return A092;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
        stream.defaultReadObject();
        int readInt = stream.readInt();
        if (readInt >= 0) {
            A0l(readInt);
            for (int i = 0; i < readInt; i++) {
                put(stream.readObject(), stream.readObject());
            }
            return;
        }
        throw new java.io.InvalidObjectException(A0L(50, 14, 23) + readInt);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public final V remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Map<K, V> A0h = A0h();
        if (A0h != null) {
            return A0h.remove(obj);
        }
        V v = (V) A0K(obj);
        if (v == A0B) {
            return null;
        }
        return v;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection<V> values() {
        if (this.A06 != null) {
            return this.A06;
        }
        java.util.Collection<V> A0A2 = A0A();
        this.A06 = A0A2;
        return A0A2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nh != com.google.common.collect.CompactHashMap<K, V> */
    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.defaultWriteObject();
        stream.writeInt(size());
        java.util.Iterator<java.util.Map.Entry<K, V>> A0d = A0d();
        while (true) {
            boolean hasNext = A0d.hasNext();
            java.lang.String[] strArr = A0A;
            if (strArr[7].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0A;
            strArr2[0] = "lZkXti1hHETGLNP2mJng";
            strArr2[1] = "UqMxjQlbiD6IC1mODYXJWocLTdBCXsJ0";
            if (hasNext) {
                java.util.Map.Entry<K, V> e = A0d.next();
                stream.writeObject(e.getKey());
                stream.writeObject(e.getValue());
            } else {
                return;
            }
        }
    }
}

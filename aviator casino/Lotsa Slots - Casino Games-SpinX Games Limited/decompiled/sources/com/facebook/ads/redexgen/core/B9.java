package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network/classes2.dex */
public final class B9<K, V> extends com.facebook.ads.redexgen.core.AbstractC2088oX<K, V> {
    public static java.lang.String[] A03 = {"BLd", "8EKeVjTJIU6MDNPM6ZTo", "HWbOsw9VtzWta1ewMSd8SFleZB3uycJV", "4g", "oHZcZe8PYtJP7zuLK1jInYJjmOVWCxEe", "hqSXyAZ2zuGNDHd4PkKakj6NBzhfvhom", "1gwnz8jAk7EqAxYvZHDnpar6edM6d04", "wfrdBhaNwCqY"};
    public static final com.facebook.ads.redexgen.core.AbstractC2088oX<java.lang.Object, java.lang.Object> A04 = new com.facebook.ads.redexgen.core.B9(null, new java.lang.Object[0], 0);
    public static final long serialVersionUID = 0;
    public final transient java.lang.Object[] A00;
    public final transient int A01;

    @javax.annotation.CheckForNull
    public final transient java.lang.Object A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <K, V> com.facebook.ads.redexgen.core.B9<K, V> A00(int n, java.lang.Object[] alternatingKeysAndValues, com.facebook.ads.redexgen.core.C2086oV<K, V> builder) {
        java.lang.Object obj;
        if (n == 0) {
            return (com.facebook.ads.redexgen.core.B9) A04;
        }
        if (n == 1) {
            com.facebook.ads.redexgen.core.AbstractC2013nJ.A03(java.util.Objects.requireNonNull(alternatingKeysAndValues[0]), java.util.Objects.requireNonNull(alternatingKeysAndValues[1]));
            return new com.facebook.ads.redexgen.core.B9<>(null, alternatingKeysAndValues, 1);
        }
        com.facebook.ads.redexgen.core.AbstractC1866ki.A01(n, alternatingKeysAndValues.length >> 1);
        java.lang.Object A02 = A02(alternatingKeysAndValues, n, com.facebook.ads.redexgen.core.BO.A03(n), 0);
        if (A02 instanceof java.lang.Object[]) {
            java.lang.Object[] objArr = (java.lang.Object[]) A02;
            com.facebook.ads.redexgen.core.C2085oU c2085oU = (com.facebook.ads.redexgen.core.C2085oU) objArr[2];
            if (builder == null) {
                throw c2085oU.A02();
            }
            builder.A01 = c2085oU;
            obj = objArr[0];
            n = ((java.lang.Integer) objArr[1]).intValue();
            alternatingKeysAndValues = java.util.Arrays.copyOf(alternatingKeysAndValues, n * 2);
        } else {
            obj = A02;
        }
        return new com.facebook.ads.redexgen.core.B9<>(obj, alternatingKeysAndValues, n);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    public B9(@javax.annotation.CheckForNull java.lang.Object hashTable, java.lang.Object[] alternatingKeysAndValues, int size) {
        this.A02 = hashTable;
        this.A00 = alternatingKeysAndValues;
        this.A01 = size;
    }

    @javax.annotation.CheckForNull
    public static java.lang.Object A01(@javax.annotation.CheckForNull java.lang.Object hashTableObject, @javax.annotation.CheckForNull java.lang.Object[] alternatingKeysAndValues, int size, int keyOffset, java.lang.Object key) {
        int keyIndex;
        if (key == null) {
            return null;
        }
        if (size == 1) {
            if (!java.util.Objects.requireNonNull(alternatingKeysAndValues[keyOffset]).equals(key)) {
                return null;
            }
            java.lang.Object obj = alternatingKeysAndValues[keyOffset ^ 1];
            if (A03[3].length() == 2) {
                java.lang.String[] strArr = A03;
                strArr[4] = "QVSrtcZKARogVSSTsDMErisHHhx3s08I";
                strArr[2] = "AM5zanCyyloF9oZfJSoNtkvSUtakyhf1";
                return java.util.Objects.requireNonNull(obj);
            }
        } else {
            if (hashTableObject == null) {
                return null;
            }
            if (hashTableObject instanceof byte[]) {
                java.lang.String[] strArr2 = A03;
                if (strArr2[4].charAt(30) != strArr2[2].charAt(30)) {
                    java.lang.String[] strArr3 = A03;
                    strArr3[0] = "33E";
                    strArr3[7] = "0IVWz8DDpNA7";
                    byte[] bArr = (byte[]) hashTableObject;
                    int mask = bArr.length - 1;
                    int A00 = com.facebook.ads.redexgen.core.AbstractC2073oI.A00(key.hashCode());
                    while (true) {
                        int i = A00 & mask;
                        int i2 = bArr[i];
                        java.lang.String[] strArr4 = A03;
                        if (strArr4[0].length() == strArr4[7].length()) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr5 = A03;
                        strArr5[4] = "Av4xGd01JYXCpVUXSFBX5Q3qG21nzo21";
                        strArr5[2] = "UuPO1t2w2j7pNt6wRWMrea5HC47YMJTH";
                        keyIndex = i2 & 255;
                        if (keyIndex == 255) {
                            return null;
                        }
                        boolean equals = key.equals(alternatingKeysAndValues[keyIndex]);
                        java.lang.String[] strArr6 = A03;
                        if (strArr6[0].length() != strArr6[7].length()) {
                            A03[6] = "uEfKnUldtWRHisqrfIDf4ni9PGEoRP0";
                            if (equals) {
                                break;
                            }
                            A00 = i + 1;
                        } else {
                            A03[1] = "rg32th7lbb1pJpYlIRnh";
                            if (equals) {
                                break;
                            }
                            A00 = i + 1;
                        }
                    }
                    java.lang.Object obj2 = alternatingKeysAndValues[keyIndex ^ 1];
                    if (A03[1].length() != 20) {
                        return obj2;
                    }
                    A03[1] = "OPXdJDLfRI5AGRwdD0N1";
                    return obj2;
                }
            } else if (hashTableObject instanceof short[]) {
                short[] sArr = (short[]) hashTableObject;
                int mask2 = sArr.length - 1;
                int A002 = com.facebook.ads.redexgen.core.AbstractC2073oI.A00(key.hashCode());
                while (true) {
                    int i3 = A002 & mask2;
                    int h = sArr[i3] & 65535;
                    if (h == 65535) {
                        return null;
                    }
                    if (key.equals(alternatingKeysAndValues[h])) {
                        return alternatingKeysAndValues[h ^ 1];
                    }
                    A002 = i3 + 1;
                }
            } else {
                int[] iArr = (int[]) hashTableObject;
                int mask3 = iArr.length - 1;
                int A003 = com.facebook.ads.redexgen.core.AbstractC2073oI.A00(key.hashCode());
                while (true) {
                    int i4 = A003 & mask3;
                    int h2 = iArr[i4];
                    if (h2 == -1) {
                        return null;
                    }
                    if (key.equals(alternatingKeysAndValues[h2])) {
                        return alternatingKeysAndValues[h2 ^ 1];
                    }
                    A003 = i4 + 1;
                }
            }
        }
        throw new java.lang.RuntimeException();
    }

    @javax.annotation.CheckForNull
    public static java.lang.Object A02(java.lang.Object[] alternatingKeysAndValues, int n, int tableSize, int keyOffset) {
        if (n == 1) {
            com.facebook.ads.redexgen.core.AbstractC2013nJ.A03(java.util.Objects.requireNonNull(alternatingKeysAndValues[keyOffset]), java.util.Objects.requireNonNull(alternatingKeysAndValues[keyOffset ^ 1]));
            return null;
        }
        int h = tableSize - 1;
        com.facebook.ads.redexgen.core.C2085oU c2085oU = null;
        int i = -1;
        if (tableSize > 128) {
            if (tableSize <= 32768) {
                short[] hashTable = new short[tableSize];
                java.util.Arrays.fill(hashTable, (short) -1);
                int keyIndex = 0;
                for (int i2 = 0; i2 < n; i2++) {
                    int i3 = (i2 * 2) + keyOffset;
                    int h2 = (keyIndex * 2) + keyOffset;
                    java.lang.Object value = java.util.Objects.requireNonNull(alternatingKeysAndValues[i3]);
                    java.lang.Object requireNonNull = java.util.Objects.requireNonNull(alternatingKeysAndValues[i3 ^ 1]);
                    com.facebook.ads.redexgen.core.AbstractC2013nJ.A03(value, requireNonNull);
                    int A00 = com.facebook.ads.redexgen.core.AbstractC2073oI.A00(value.hashCode());
                    while (true) {
                        int i4 = A00 & h;
                        int i5 = hashTable[i4] & 65535;
                        if (i5 == 65535) {
                            hashTable[i4] = (short) h2;
                            if (keyIndex < i2) {
                                alternatingKeysAndValues[h2] = value;
                                alternatingKeysAndValues[h2 ^ 1] = requireNonNull;
                            }
                            keyIndex++;
                        } else {
                            boolean equals = value.equals(alternatingKeysAndValues[i5]);
                            if (A03[5].charAt(16) != 'P') {
                                throw new java.lang.RuntimeException();
                            }
                            A03[5] = "XeR3XdSVagosh0VhP9e0zQ2n8NaTx8OB";
                            if (equals) {
                                c2085oU = new com.facebook.ads.redexgen.core.C2085oU(value, requireNonNull, java.util.Objects.requireNonNull(alternatingKeysAndValues[i5 ^ 1]));
                                alternatingKeysAndValues[i5 ^ 1] = requireNonNull;
                                break;
                            }
                            A00 = i4 + 1;
                        }
                    }
                }
                return keyIndex == n ? hashTable : new java.lang.Object[]{hashTable, java.lang.Integer.valueOf(keyIndex), c2085oU};
            }
            int[] hashTable2 = new int[tableSize];
            java.util.Arrays.fill(hashTable2, -1);
            int i6 = 0;
            int i7 = 0;
            while (i7 < n) {
                int i8 = (i7 * 2) + keyOffset;
                int i9 = (i6 * 2) + keyOffset;
                java.lang.Object requireNonNull2 = java.util.Objects.requireNonNull(alternatingKeysAndValues[i8]);
                java.lang.Object requireNonNull3 = java.util.Objects.requireNonNull(alternatingKeysAndValues[i8 ^ 1]);
                com.facebook.ads.redexgen.core.AbstractC2013nJ.A03(requireNonNull2, requireNonNull3);
                int outKeyIndex = com.facebook.ads.redexgen.core.AbstractC2073oI.A00(requireNonNull2.hashCode());
                while (true) {
                    int outKeyIndex2 = outKeyIndex & h;
                    int i10 = hashTable2[outKeyIndex2];
                    if (i10 == i) {
                        hashTable2[outKeyIndex2] = i9;
                        if (i6 < i7) {
                            alternatingKeysAndValues[i9] = requireNonNull2;
                            alternatingKeysAndValues[i9 ^ 1] = requireNonNull3;
                        }
                        i6++;
                    } else {
                        if (requireNonNull2.equals(alternatingKeysAndValues[i10])) {
                            c2085oU = new com.facebook.ads.redexgen.core.C2085oU(requireNonNull2, requireNonNull3, java.util.Objects.requireNonNull(alternatingKeysAndValues[i10 ^ 1]));
                            alternatingKeysAndValues[i10 ^ 1] = requireNonNull3;
                            break;
                        }
                        outKeyIndex = outKeyIndex2 + 1;
                        i = -1;
                    }
                }
                i7++;
                i = -1;
            }
            return i6 == n ? hashTable2 : new java.lang.Object[]{hashTable2, java.lang.Integer.valueOf(i6), c2085oU};
        }
        byte[] bArr = new byte[tableSize];
        java.util.Arrays.fill(bArr, (byte) -1);
        int i11 = 0;
        for (int i12 = 0; i12 < n; i12++) {
            int i13 = (i12 * 2) + keyOffset;
            int i14 = (i11 * 2) + keyOffset;
            java.lang.Object requireNonNull4 = java.util.Objects.requireNonNull(alternatingKeysAndValues[i13]);
            java.lang.Object requireNonNull5 = java.util.Objects.requireNonNull(alternatingKeysAndValues[i13 ^ 1]);
            com.facebook.ads.redexgen.core.AbstractC2013nJ.A03(requireNonNull4, requireNonNull5);
            int keyIndex2 = com.facebook.ads.redexgen.core.AbstractC2073oI.A00(requireNonNull4.hashCode());
            while (true) {
                int keyIndex3 = keyIndex2 & h;
                int previousKeyIndex = bArr[keyIndex3] & 255;
                if (previousKeyIndex == 255) {
                    bArr[keyIndex3] = (byte) i14;
                    if (i11 < i12) {
                        alternatingKeysAndValues[i14] = requireNonNull4;
                        alternatingKeysAndValues[i14 ^ 1] = requireNonNull5;
                    }
                    i11++;
                } else {
                    if (requireNonNull4.equals(alternatingKeysAndValues[previousKeyIndex])) {
                        c2085oU = new com.facebook.ads.redexgen.core.C2085oU(requireNonNull4, requireNonNull5, java.util.Objects.requireNonNull(alternatingKeysAndValues[previousKeyIndex ^ 1]));
                        alternatingKeysAndValues[previousKeyIndex ^ 1] = requireNonNull5;
                        break;
                    }
                    keyIndex2 = keyIndex3 + 1;
                }
            }
        }
        return i11 == n ? bArr : new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i11), c2085oU};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2088oX
    public final com.facebook.ads.redexgen.core.AbstractC2079oO<V> A0A() {
        return new com.facebook.ads.redexgen.core.C2A(this.A00, 1, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2088oX
    public final com.facebook.ads.redexgen.core.BO<java.util.Map.Entry<K, V>> A0D() {
        return new com.facebook.ads.redexgen.core.C2C(this, this.A00, 0, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<K> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2088oX
    public final com.facebook.ads.redexgen.core.BO<K> A0E() {
        final com.facebook.ads.redexgen.core.C2A c2a = new com.facebook.ads.redexgen.core.C2A(this.A00, 0, this.A01);
        return new com.facebook.ads.redexgen.core.BO<K>(this, c2a) { // from class: com.facebook.ads.redexgen.X.2B
            public final transient com.facebook.ads.redexgen.core.BP<K> A00;
            public final transient com.facebook.ads.redexgen.core.AbstractC2088oX<K, ?> A01;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<K> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, ?> */
            {
                this.A01 = this;
                this.A00 = c2a;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
            public final int A0I(java.lang.Object[] dst, int offset) {
                return A0J().A0I(dst, offset);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.core.BO, com.facebook.ads.redexgen.core.AbstractC2079oO
            public final com.facebook.ads.redexgen.core.BP<K> A0J() {
                return this.A00;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
            public final boolean A0K() {
                return true;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* renamed from: A0N */
            public final com.facebook.ads.redexgen.core.C4C<K> iterator() {
                return A0J().iterator();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.core.AbstractC2079oO, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
                return this.A01.get(object) != null;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2B != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return this.A01.size();
            }
        };
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2088oX
    public final boolean A0F() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2088oX, java.util.Map
    @javax.annotation.CheckForNull
    public final V get(@javax.annotation.CheckForNull java.lang.Object obj) {
        V v = (V) A01(this.A02, this.A00, this.A01, 0, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B9 != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // java.util.Map
    public final int size() {
        return this.A01;
    }
}

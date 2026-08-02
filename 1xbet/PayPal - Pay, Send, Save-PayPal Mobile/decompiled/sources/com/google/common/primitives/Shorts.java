package com.google.common.primitives;

/* loaded from: classes9.dex */
public final class Shorts extends com.google.common.primitives.ShortsMethodsForWeb {
    public static final int BYTES = 2;
    public static final short MAX_POWER_OF_TWO = 16384;

    public static short fromBytes(byte b, byte b2) {
        return (short) ((b << 8) | (b2 & 255));
    }

    public static int hashCode(short s) {
        return s;
    }

    public static short saturatedCast(long j) {
        return j > 32767 ? kotlin.jvm.internal.ShortCompanionObject.MAX_VALUE : j < -32768 ? kotlin.jvm.internal.ShortCompanionObject.MIN_VALUE : (short) j;
    }

    private Shorts() {
    }

    public static short checkedCast(long j) {
        short s = (short) j;
        com.google.common.base.Preconditions.checkArgument(((long) s) == j, "Out of range: %s", j);
        return s;
    }

    public static int compare(short s, short s2) {
        return java.lang.Short.compare(s, s2);
    }

    public static boolean contains(short[] sArr, short s) {
        for (short s2 : sArr) {
            if (s2 == s) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(short[] sArr, short s) {
        return indexOf(sArr, s, 0, sArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(short[] sArr, short s, int i, int i2) {
        while (i < i2) {
            if (sArr[i] == s) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int indexOf(short[] sArr, short[] sArr2) {
        com.google.common.base.Preconditions.checkNotNull(sArr, "array");
        com.google.common.base.Preconditions.checkNotNull(sArr2, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET);
        if (sArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (sArr.length - sArr2.length) + 1) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                if (sArr[i + i2] != sArr2[i2]) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }

    public static int lastIndexOf(short[] sArr, short s) {
        return lastIndexOf(sArr, s, 0, sArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(short[] sArr, short s, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (sArr[i3] == s) {
                return i3;
            }
        }
        return -1;
    }

    public static short min(short... sArr) {
        com.google.common.base.Preconditions.checkArgument(sArr.length > 0);
        short s = sArr[0];
        for (int i = 1; i < sArr.length; i++) {
            short s2 = sArr[i];
            if (s2 < s) {
                s = s2;
            }
        }
        return s;
    }

    public static short max(short... sArr) {
        com.google.common.base.Preconditions.checkArgument(sArr.length > 0);
        short s = sArr[0];
        for (int i = 1; i < sArr.length; i++) {
            short s2 = sArr[i];
            if (s2 > s) {
                s = s2;
            }
        }
        return s;
    }

    public static short constrainToRange(short s, short s2, short s3) {
        com.google.common.base.Preconditions.checkArgument(s2 <= s3, "min (%s) must be less than or equal to max (%s)", (int) s2, (int) s3);
        return s < s2 ? s2 : s < s3 ? s : s3;
    }

    public static short[] concat(short[]... sArr) {
        long j = 0;
        for (short[] sArr2 : sArr) {
            j += sArr2.length;
        }
        short[] sArr3 = new short[checkNoOverflow(j)];
        int i = 0;
        for (short[] sArr4 : sArr) {
            java.lang.System.arraycopy(sArr4, 0, sArr3, i, sArr4.length);
            i += sArr4.length;
        }
        return sArr3;
    }

    private static int checkNoOverflow(long j) {
        int i = (int) j;
        com.google.common.base.Preconditions.checkArgument(j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j);
        return i;
    }

    public static byte[] toByteArray(short s) {
        return new byte[]{(byte) (s >> 8), (byte) s};
    }

    public static short fromByteArray(byte[] bArr) {
        com.google.common.base.Preconditions.checkArgument(bArr.length >= 2, "array too small: %s < %s", bArr.length, 2);
        return fromBytes(bArr[0], bArr[1]);
    }

    static final class ShortConverter extends com.google.common.base.Converter<java.lang.String, java.lang.Short> implements java.io.Serializable {
        static final com.google.common.base.Converter<java.lang.String, java.lang.Short> INSTANCE = new com.google.common.primitives.Shorts.ShortConverter();
        private static final long serialVersionUID = 1;

        private ShortConverter() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public final java.lang.Short doForward(java.lang.String str) {
            return java.lang.Short.decode(str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public final java.lang.String doBackward(java.lang.Short sh) {
            return sh.toString();
        }

        public final java.lang.String toString() {
            return "Shorts.stringConverter()";
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    public static com.google.common.base.Converter<java.lang.String, java.lang.Short> stringConverter() {
        return com.google.common.primitives.Shorts.ShortConverter.INSTANCE;
    }

    public static short[] ensureCapacity(short[] sArr, int i, int i2) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "Invalid minLength: %s", i);
        com.google.common.base.Preconditions.checkArgument(i2 >= 0, "Invalid padding: %s", i2);
        return sArr.length < i ? java.util.Arrays.copyOf(sArr, i + i2) : sArr;
    }

    public static java.lang.String join(java.lang.String str, short... sArr) {
        com.google.common.base.Preconditions.checkNotNull(str);
        if (sArr.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(sArr.length * 6);
        sb.append((int) sArr[0]);
        for (int i = 1; i < sArr.length; i++) {
            sb.append(str);
            sb.append((int) sArr[i]);
        }
        return sb.toString();
    }

    public static java.util.Comparator<short[]> lexicographicalComparator() {
        return com.google.common.primitives.Shorts.LexicographicalComparator.INSTANCE;
    }

    enum LexicographicalComparator implements java.util.Comparator<short[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public final int compare(short[] sArr, short[] sArr2) {
            int min = java.lang.Math.min(sArr.length, sArr2.length);
            for (int i = 0; i < min; i++) {
                int compare = java.lang.Short.compare(sArr[i], sArr2[i]);
                if (compare != 0) {
                    return compare;
                }
            }
            return sArr.length - sArr2.length;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "Shorts.lexicographicalComparator()";
        }
    }

    public static void sortDescending(short[] sArr) {
        com.google.common.base.Preconditions.checkNotNull(sArr);
        sortDescending(sArr, 0, sArr.length);
    }

    public static void sortDescending(short[] sArr, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(sArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, sArr.length);
        java.util.Arrays.sort(sArr, i, i2);
        reverse(sArr, i, i2);
    }

    public static void reverse(short[] sArr) {
        com.google.common.base.Preconditions.checkNotNull(sArr);
        reverse(sArr, 0, sArr.length);
    }

    public static void reverse(short[] sArr, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(sArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, sArr.length);
        while (true) {
            i2--;
            if (i >= i2) {
                return;
            }
            short s = sArr[i];
            sArr[i] = sArr[i2];
            sArr[i2] = s;
            i++;
        }
    }

    public static void rotate(short[] sArr, int i) {
        rotate(sArr, i, 0, sArr.length);
    }

    public static void rotate(short[] sArr, int i, int i2, int i3) {
        com.google.common.base.Preconditions.checkNotNull(sArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i2, i3, sArr.length);
        if (sArr.length > 1) {
            int i4 = i3 - i2;
            int i5 = (-i) % i4;
            if (i5 < 0) {
                i5 += i4;
            }
            int i6 = i5 + i2;
            if (i6 == i2) {
                return;
            }
            reverse(sArr, i2, i6);
            reverse(sArr, i6, i3);
            reverse(sArr, i2, i3);
        }
    }

    public static short[] toArray(java.util.Collection<? extends java.lang.Number> collection) {
        if (collection instanceof com.google.common.primitives.Shorts.ShortArrayAsList) {
            return ((com.google.common.primitives.Shorts.ShortArrayAsList) collection).toShortArray();
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = ((java.lang.Number) com.google.common.base.Preconditions.checkNotNull(array[i])).shortValue();
        }
        return sArr;
    }

    public static java.util.List<java.lang.Short> asList(short... sArr) {
        if (sArr.length == 0) {
            return java.util.Collections.emptyList();
        }
        return new com.google.common.primitives.Shorts.ShortArrayAsList(sArr);
    }

    static final class ShortArrayAsList extends java.util.AbstractList<java.lang.Short> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final short[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        ShortArrayAsList(short[] sArr) {
            this(sArr, 0, sArr.length);
        }

        ShortArrayAsList(short[] sArr, int i, int i2) {
            this.array = sArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.lang.Short get(int i) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            return java.lang.Short.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(java.lang.Object obj) {
            return (obj instanceof java.lang.Short) && com.google.common.primitives.Shorts.indexOf(this.array, ((java.lang.Short) obj).shortValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(java.lang.Object obj) {
            int indexOf;
            if (!(obj instanceof java.lang.Short) || (indexOf = com.google.common.primitives.Shorts.indexOf(this.array, ((java.lang.Short) obj).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return indexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(java.lang.Object obj) {
            int lastIndexOf;
            if (!(obj instanceof java.lang.Short) || (lastIndexOf = com.google.common.primitives.Shorts.lastIndexOf(this.array, ((java.lang.Short) obj).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return lastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.lang.Short set(int i, java.lang.Short sh) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            short[] sArr = this.array;
            int i2 = this.start + i;
            short s = sArr[i2];
            sArr[i2] = ((java.lang.Short) com.google.common.base.Preconditions.checkNotNull(sh)).shortValue();
            return java.lang.Short.valueOf(s);
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.util.List<java.lang.Short> subList(int i, int i2) {
            com.google.common.base.Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return java.util.Collections.emptyList();
            }
            short[] sArr = this.array;
            int i3 = this.start;
            return new com.google.common.primitives.Shorts.ShortArrayAsList(sArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof com.google.common.primitives.Shorts.ShortArrayAsList) {
                com.google.common.primitives.Shorts.ShortArrayAsList shortArrayAsList = (com.google.common.primitives.Shorts.ShortArrayAsList) obj;
                int size = size();
                if (shortArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != shortArrayAsList.array[shortArrayAsList.start + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                i = (i * 31) + java.lang.Short.hashCode(this.array[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractCollection
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 6);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
            sb.append((int) this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(", ");
                    sb.append((int) this.array[i]);
                } else {
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    return sb.toString();
                }
            }
        }

        final short[] toShortArray() {
            return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }
}

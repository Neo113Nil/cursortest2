package com.google.common.primitives;

/* loaded from: classes4.dex */
public final class Ints extends com.google.common.primitives.IntsMethodsForWeb {
    public static final int BYTES = 4;
    public static final int MAX_POWER_OF_TWO = 1073741824;

    public static int fromBytes(byte b, byte b2, byte b3, byte b4) {
        return (b << com.google.common.base.Ascii.CAN) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int hashCode(int i) {
        return i;
    }

    public static int saturatedCast(long j) {
        if (j > androidx.collection.SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        if (j < androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    private Ints() {
    }

    public static int checkedCast(long j) {
        int i = (int) j;
        com.google.common.base.Preconditions.checkArgument(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int compare(int i, int i2) {
        return java.lang.Integer.compare(i, i2);
    }

    public static boolean contains(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(int[] iArr, int i) {
        return indexOf(iArr, i, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int indexOf(int[] iArr, int[] iArr2) {
        com.google.common.base.Preconditions.checkNotNull(iArr, "array");
        com.google.common.base.Preconditions.checkNotNull(iArr2, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET);
        if (iArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (iArr.length - iArr2.length) + 1) {
            for (int i2 = 0; i2 < iArr2.length; i2++) {
                if (iArr[i + i2] != iArr2[i2]) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }

    public static int lastIndexOf(int[] iArr, int i) {
        return lastIndexOf(iArr, i, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    public static int min(int... iArr) {
        com.google.common.base.Preconditions.checkArgument(iArr.length > 0);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public static int max(int... iArr) {
        com.google.common.base.Preconditions.checkArgument(iArr.length > 0);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public static int constrainToRange(int i, int i2, int i3) {
        com.google.common.base.Preconditions.checkArgument(i2 <= i3, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return java.lang.Math.min(java.lang.Math.max(i, i2), i3);
    }

    public static int[] concat(int[]... iArr) {
        long j = 0;
        for (int[] iArr2 : iArr) {
            j += iArr2.length;
        }
        int[] iArr3 = new int[checkNoOverflow(j)];
        int i = 0;
        for (int[] iArr4 : iArr) {
            java.lang.System.arraycopy(iArr4, 0, iArr3, i, iArr4.length);
            i += iArr4.length;
        }
        return iArr3;
    }

    private static int checkNoOverflow(long j) {
        int i = (int) j;
        com.google.common.base.Preconditions.checkArgument(j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j);
        return i;
    }

    public static byte[] toByteArray(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static int fromByteArray(byte[] bArr) {
        com.google.common.base.Preconditions.checkArgument(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return fromBytes(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    /* loaded from: classes9.dex */
    static final class IntConverter extends com.google.common.base.Converter<java.lang.String, java.lang.Integer> implements java.io.Serializable {
        static final com.google.common.base.Converter<java.lang.String, java.lang.Integer> INSTANCE = new com.google.common.primitives.Ints.IntConverter();
        private static final long serialVersionUID = 1;

        private IntConverter() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public final java.lang.Integer doForward(java.lang.String str) {
            return java.lang.Integer.decode(str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public final java.lang.String doBackward(java.lang.Integer num) {
            return num.toString();
        }

        public final java.lang.String toString() {
            return "Ints.stringConverter()";
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    public static com.google.common.base.Converter<java.lang.String, java.lang.Integer> stringConverter() {
        return com.google.common.primitives.Ints.IntConverter.INSTANCE;
    }

    public static int[] ensureCapacity(int[] iArr, int i, int i2) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "Invalid minLength: %s", i);
        com.google.common.base.Preconditions.checkArgument(i2 >= 0, "Invalid padding: %s", i2);
        return iArr.length < i ? java.util.Arrays.copyOf(iArr, i + i2) : iArr;
    }

    public static java.lang.String join(java.lang.String str, int... iArr) {
        com.google.common.base.Preconditions.checkNotNull(str);
        if (iArr.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(iArr.length * 5);
        sb.append(iArr[0]);
        for (int i = 1; i < iArr.length; i++) {
            sb.append(str);
            sb.append(iArr[i]);
        }
        return sb.toString();
    }

    public static java.util.Comparator<int[]> lexicographicalComparator() {
        return com.google.common.primitives.Ints.LexicographicalComparator.INSTANCE;
    }

    /* loaded from: classes9.dex */
    enum LexicographicalComparator implements java.util.Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public final int compare(int[] iArr, int[] iArr2) {
            int min = java.lang.Math.min(iArr.length, iArr2.length);
            for (int i = 0; i < min; i++) {
                int compare = java.lang.Integer.compare(iArr[i], iArr2[i]);
                if (compare != 0) {
                    return compare;
                }
            }
            return iArr.length - iArr2.length;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "Ints.lexicographicalComparator()";
        }
    }

    public static void sortDescending(int[] iArr) {
        com.google.common.base.Preconditions.checkNotNull(iArr);
        sortDescending(iArr, 0, iArr.length);
    }

    public static void sortDescending(int[] iArr, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(iArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, iArr.length);
        java.util.Arrays.sort(iArr, i, i2);
        reverse(iArr, i, i2);
    }

    public static void reverse(int[] iArr) {
        com.google.common.base.Preconditions.checkNotNull(iArr);
        reverse(iArr, 0, iArr.length);
    }

    public static void reverse(int[] iArr, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(iArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, iArr.length);
        while (true) {
            i2--;
            if (i >= i2) {
                return;
            }
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            i++;
        }
    }

    public static void rotate(int[] iArr, int i) {
        rotate(iArr, i, 0, iArr.length);
    }

    public static void rotate(int[] iArr, int i, int i2, int i3) {
        com.google.common.base.Preconditions.checkNotNull(iArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i2, i3, iArr.length);
        if (iArr.length > 1) {
            int i4 = i3 - i2;
            int i5 = (-i) % i4;
            if (i5 < 0) {
                i5 += i4;
            }
            int i6 = i5 + i2;
            if (i6 == i2) {
                return;
            }
            reverse(iArr, i2, i6);
            reverse(iArr, i6, i3);
            reverse(iArr, i2, i3);
        }
    }

    public static int[] toArray(java.util.Collection<? extends java.lang.Number> collection) {
        if (collection instanceof com.google.common.primitives.Ints.IntArrayAsList) {
            return ((com.google.common.primitives.Ints.IntArrayAsList) collection).toIntArray();
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((java.lang.Number) com.google.common.base.Preconditions.checkNotNull(array[i])).intValue();
        }
        return iArr;
    }

    public static java.util.List<java.lang.Integer> asList(int... iArr) {
        if (iArr.length == 0) {
            return java.util.Collections.emptyList();
        }
        return new com.google.common.primitives.Ints.IntArrayAsList(iArr);
    }

    /* loaded from: classes9.dex */
    static final class IntArrayAsList extends java.util.AbstractList<java.lang.Integer> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final int[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        IntArrayAsList(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        IntArrayAsList(int[] iArr, int i, int i2) {
            this.array = iArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.lang.Integer get(int i) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            return java.lang.Integer.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.List
        public final java.util.Spliterator.OfInt spliterator() {
            return java.util.Spliterators.spliterator(this.array, this.start, this.end, 0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(java.lang.Object obj) {
            return (obj instanceof java.lang.Integer) && com.google.common.primitives.Ints.indexOf(this.array, ((java.lang.Integer) obj).intValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(java.lang.Object obj) {
            int indexOf;
            if (!(obj instanceof java.lang.Integer) || (indexOf = com.google.common.primitives.Ints.indexOf(this.array, ((java.lang.Integer) obj).intValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return indexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(java.lang.Object obj) {
            int lastIndexOf;
            if (!(obj instanceof java.lang.Integer) || (lastIndexOf = com.google.common.primitives.Ints.lastIndexOf(this.array, ((java.lang.Integer) obj).intValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return lastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.lang.Integer set(int i, java.lang.Integer num) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            int[] iArr = this.array;
            int i2 = this.start + i;
            int i3 = iArr[i2];
            iArr[i2] = ((java.lang.Integer) com.google.common.base.Preconditions.checkNotNull(num)).intValue();
            return java.lang.Integer.valueOf(i3);
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.util.List<java.lang.Integer> subList(int i, int i2) {
            com.google.common.base.Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return java.util.Collections.emptyList();
            }
            int[] iArr = this.array;
            int i3 = this.start;
            return new com.google.common.primitives.Ints.IntArrayAsList(iArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof com.google.common.primitives.Ints.IntArrayAsList) {
                com.google.common.primitives.Ints.IntArrayAsList intArrayAsList = (com.google.common.primitives.Ints.IntArrayAsList) obj;
                int size = size();
                if (intArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != intArrayAsList.array[intArrayAsList.start + i]) {
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
                i = (i * 31) + java.lang.Integer.hashCode(this.array[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractCollection
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 5);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(", ");
                    sb.append(this.array[i]);
                } else {
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    return sb.toString();
                }
            }
        }

        final int[] toIntArray() {
            return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }

    public static java.lang.Integer tryParse(java.lang.String str) {
        return tryParse(str, 10);
    }

    public static java.lang.Integer tryParse(java.lang.String str, int i) {
        java.lang.Long tryParse = com.google.common.primitives.Longs.tryParse(str, i);
        if (tryParse == null || tryParse.longValue() != tryParse.intValue()) {
            return null;
        }
        return java.lang.Integer.valueOf(tryParse.intValue());
    }
}

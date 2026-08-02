package com.google.common.primitives;

/* loaded from: classes9.dex */
public final class Booleans {
    private Booleans() {
    }

    enum BooleanComparator implements java.util.Comparator<java.lang.Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");

        private final java.lang.String toString;
        private final int trueValue;

        BooleanComparator(int i, java.lang.String str) {
            this.trueValue = i;
            this.toString = str;
        }

        @Override // java.util.Comparator
        public final int compare(java.lang.Boolean bool, java.lang.Boolean bool2) {
            return (bool2.booleanValue() ? this.trueValue : 0) - (bool.booleanValue() ? this.trueValue : 0);
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.toString;
        }
    }

    public static java.util.Comparator<java.lang.Boolean> trueFirst() {
        return com.google.common.primitives.Booleans.BooleanComparator.TRUE_FIRST;
    }

    public static java.util.Comparator<java.lang.Boolean> falseFirst() {
        return com.google.common.primitives.Booleans.BooleanComparator.FALSE_FIRST;
    }

    public static int hashCode(boolean z) {
        return java.lang.Boolean.hashCode(z);
    }

    public static int compare(boolean z, boolean z2) {
        return java.lang.Boolean.compare(z, z2);
    }

    public static boolean contains(boolean[] zArr, boolean z) {
        for (boolean z2 : zArr) {
            if (z2 == z) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(boolean[] zArr, boolean z) {
        return indexOf(zArr, z, 0, zArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(boolean[] zArr, boolean z, int i, int i2) {
        while (i < i2) {
            if (zArr[i] == z) {
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
    public static int indexOf(boolean[] zArr, boolean[] zArr2) {
        com.google.common.base.Preconditions.checkNotNull(zArr, "array");
        com.google.common.base.Preconditions.checkNotNull(zArr2, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET);
        if (zArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (zArr.length - zArr2.length) + 1) {
            for (int i2 = 0; i2 < zArr2.length; i2++) {
                if (zArr[i + i2] != zArr2[i2]) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }

    public static int lastIndexOf(boolean[] zArr, boolean z) {
        return lastIndexOf(zArr, z, 0, zArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(boolean[] zArr, boolean z, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (zArr[i3] == z) {
                return i3;
            }
        }
        return -1;
    }

    public static boolean[] concat(boolean[]... zArr) {
        long j = 0;
        for (boolean[] zArr2 : zArr) {
            j += zArr2.length;
        }
        boolean[] zArr3 = new boolean[checkNoOverflow(j)];
        int i = 0;
        for (boolean[] zArr4 : zArr) {
            java.lang.System.arraycopy(zArr4, 0, zArr3, i, zArr4.length);
            i += zArr4.length;
        }
        return zArr3;
    }

    private static int checkNoOverflow(long j) {
        int i = (int) j;
        com.google.common.base.Preconditions.checkArgument(j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j);
        return i;
    }

    public static boolean[] ensureCapacity(boolean[] zArr, int i, int i2) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "Invalid minLength: %s", i);
        com.google.common.base.Preconditions.checkArgument(i2 >= 0, "Invalid padding: %s", i2);
        return zArr.length < i ? java.util.Arrays.copyOf(zArr, i + i2) : zArr;
    }

    public static java.lang.String join(java.lang.String str, boolean... zArr) {
        com.google.common.base.Preconditions.checkNotNull(str);
        if (zArr.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(zArr.length * 7);
        sb.append(zArr[0]);
        for (int i = 1; i < zArr.length; i++) {
            sb.append(str);
            sb.append(zArr[i]);
        }
        return sb.toString();
    }

    public static java.util.Comparator<boolean[]> lexicographicalComparator() {
        return com.google.common.primitives.Booleans.LexicographicalComparator.INSTANCE;
    }

    enum LexicographicalComparator implements java.util.Comparator<boolean[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public final int compare(boolean[] zArr, boolean[] zArr2) {
            int min = java.lang.Math.min(zArr.length, zArr2.length);
            for (int i = 0; i < min; i++) {
                int compare = java.lang.Boolean.compare(zArr[i], zArr2[i]);
                if (compare != 0) {
                    return compare;
                }
            }
            return zArr.length - zArr2.length;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "Booleans.lexicographicalComparator()";
        }
    }

    public static boolean[] toArray(java.util.Collection<java.lang.Boolean> collection) {
        if (collection instanceof com.google.common.primitives.Booleans.BooleanArrayAsList) {
            return ((com.google.common.primitives.Booleans.BooleanArrayAsList) collection).toBooleanArray();
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = ((java.lang.Boolean) com.google.common.base.Preconditions.checkNotNull(array[i])).booleanValue();
        }
        return zArr;
    }

    public static java.util.List<java.lang.Boolean> asList(boolean... zArr) {
        if (zArr.length == 0) {
            return java.util.Collections.emptyList();
        }
        return new com.google.common.primitives.Booleans.BooleanArrayAsList(zArr);
    }

    static final class BooleanArrayAsList extends java.util.AbstractList<java.lang.Boolean> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final boolean[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        BooleanArrayAsList(boolean[] zArr) {
            this(zArr, 0, zArr.length);
        }

        BooleanArrayAsList(boolean[] zArr, int i, int i2) {
            this.array = zArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.lang.Boolean get(int i) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            return java.lang.Boolean.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(java.lang.Object obj) {
            return (obj instanceof java.lang.Boolean) && com.google.common.primitives.Booleans.indexOf(this.array, ((java.lang.Boolean) obj).booleanValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(java.lang.Object obj) {
            int indexOf;
            if (!(obj instanceof java.lang.Boolean) || (indexOf = com.google.common.primitives.Booleans.indexOf(this.array, ((java.lang.Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return indexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(java.lang.Object obj) {
            int lastIndexOf;
            if (!(obj instanceof java.lang.Boolean) || (lastIndexOf = com.google.common.primitives.Booleans.lastIndexOf(this.array, ((java.lang.Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return lastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.lang.Boolean set(int i, java.lang.Boolean bool) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            boolean[] zArr = this.array;
            int i2 = this.start + i;
            boolean z = zArr[i2];
            zArr[i2] = ((java.lang.Boolean) com.google.common.base.Preconditions.checkNotNull(bool)).booleanValue();
            return java.lang.Boolean.valueOf(z);
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.util.List<java.lang.Boolean> subList(int i, int i2) {
            com.google.common.base.Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return java.util.Collections.emptyList();
            }
            boolean[] zArr = this.array;
            int i3 = this.start;
            return new com.google.common.primitives.Booleans.BooleanArrayAsList(zArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof com.google.common.primitives.Booleans.BooleanArrayAsList) {
                com.google.common.primitives.Booleans.BooleanArrayAsList booleanArrayAsList = (com.google.common.primitives.Booleans.BooleanArrayAsList) obj;
                int size = size();
                if (booleanArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != booleanArrayAsList.array[booleanArrayAsList.start + i]) {
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
                i = (i * 31) + java.lang.Boolean.hashCode(this.array[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractCollection
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 7);
            sb.append(this.array[this.start] ? "[true" : "[false");
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(this.array[i] ? ", true" : ", false");
                } else {
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    return sb.toString();
                }
            }
        }

        final boolean[] toBooleanArray() {
            return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }

    public static int countTrue(boolean... zArr) {
        int i = 0;
        for (boolean z : zArr) {
            if (z) {
                i++;
            }
        }
        return i;
    }

    public static void reverse(boolean[] zArr) {
        com.google.common.base.Preconditions.checkNotNull(zArr);
        reverse(zArr, 0, zArr.length);
    }

    public static void reverse(boolean[] zArr, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(zArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, zArr.length);
        while (true) {
            i2--;
            if (i >= i2) {
                return;
            }
            boolean z = zArr[i];
            zArr[i] = zArr[i2];
            zArr[i2] = z;
            i++;
        }
    }

    public static void rotate(boolean[] zArr, int i) {
        rotate(zArr, i, 0, zArr.length);
    }

    public static void rotate(boolean[] zArr, int i, int i2, int i3) {
        com.google.common.base.Preconditions.checkNotNull(zArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i2, i3, zArr.length);
        if (zArr.length > 1) {
            int i4 = i3 - i2;
            int i5 = (-i) % i4;
            if (i5 < 0) {
                i5 += i4;
            }
            int i6 = i5 + i2;
            if (i6 == i2) {
                return;
            }
            reverse(zArr, i2, i6);
            reverse(zArr, i6, i3);
            reverse(zArr, i2, i3);
        }
    }
}

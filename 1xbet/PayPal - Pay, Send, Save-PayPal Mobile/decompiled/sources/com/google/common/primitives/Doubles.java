package com.google.common.primitives;

/* loaded from: classes9.dex */
public final class Doubles extends com.google.common.primitives.DoublesMethodsForWeb {
    public static final int BYTES = 8;
    static final java.util.regex.Pattern FLOATING_POINT_PATTERN = fpPattern();

    private Doubles() {
    }

    public static int hashCode(double d) {
        return java.lang.Double.hashCode(d);
    }

    public static int compare(double d, double d2) {
        return java.lang.Double.compare(d, d2);
    }

    public static boolean isFinite(double d) {
        return java.lang.Double.isFinite(d);
    }

    public static boolean contains(double[] dArr, double d) {
        for (double d2 : dArr) {
            if (d2 == d) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(double[] dArr, double d) {
        return indexOf(dArr, d, 0, dArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(double[] dArr, double d, int i, int i2) {
        while (i < i2) {
            if (dArr[i] == d) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int indexOf(double[] dArr, double[] dArr2) {
        com.google.common.base.Preconditions.checkNotNull(dArr, "array");
        com.google.common.base.Preconditions.checkNotNull(dArr2, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET);
        if (dArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (dArr.length - dArr2.length) + 1) {
            for (int i2 = 0; i2 < dArr2.length; i2++) {
                if (dArr[i + i2] != dArr2[i2]) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }

    public static int lastIndexOf(double[] dArr, double d) {
        return lastIndexOf(dArr, d, 0, dArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(double[] dArr, double d, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (dArr[i3] == d) {
                return i3;
            }
        }
        return -1;
    }

    public static double min(double... dArr) {
        com.google.common.base.Preconditions.checkArgument(dArr.length > 0);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            d = java.lang.Math.min(d, dArr[i]);
        }
        return d;
    }

    public static double max(double... dArr) {
        com.google.common.base.Preconditions.checkArgument(dArr.length > 0);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            d = java.lang.Math.max(d, dArr[i]);
        }
        return d;
    }

    public static double constrainToRange(double d, double d2, double d3) {
        if (d2 <= d3) {
            return java.lang.Math.min(java.lang.Math.max(d, d2), d3);
        }
        throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat("min (%s) must be less than or equal to max (%s)", java.lang.Double.valueOf(d2), java.lang.Double.valueOf(d3)));
    }

    public static double[] concat(double[]... dArr) {
        long j = 0;
        for (double[] dArr2 : dArr) {
            j += dArr2.length;
        }
        double[] dArr3 = new double[checkNoOverflow(j)];
        int i = 0;
        for (double[] dArr4 : dArr) {
            java.lang.System.arraycopy(dArr4, 0, dArr3, i, dArr4.length);
            i += dArr4.length;
        }
        return dArr3;
    }

    private static int checkNoOverflow(long j) {
        int i = (int) j;
        com.google.common.base.Preconditions.checkArgument(j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j);
        return i;
    }

    static final class DoubleConverter extends com.google.common.base.Converter<java.lang.String, java.lang.Double> implements java.io.Serializable {
        static final com.google.common.base.Converter<java.lang.String, java.lang.Double> INSTANCE = new com.google.common.primitives.Doubles.DoubleConverter();
        private static final long serialVersionUID = 1;

        private DoubleConverter() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public final java.lang.Double doForward(java.lang.String str) {
            return java.lang.Double.valueOf(str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public final java.lang.String doBackward(java.lang.Double d) {
            return d.toString();
        }

        public final java.lang.String toString() {
            return "Doubles.stringConverter()";
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    public static com.google.common.base.Converter<java.lang.String, java.lang.Double> stringConverter() {
        return com.google.common.primitives.Doubles.DoubleConverter.INSTANCE;
    }

    public static double[] ensureCapacity(double[] dArr, int i, int i2) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "Invalid minLength: %s", i);
        com.google.common.base.Preconditions.checkArgument(i2 >= 0, "Invalid padding: %s", i2);
        return dArr.length < i ? java.util.Arrays.copyOf(dArr, i + i2) : dArr;
    }

    public static java.lang.String join(java.lang.String str, double... dArr) {
        com.google.common.base.Preconditions.checkNotNull(str);
        if (dArr.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(dArr.length * 12);
        sb.append(dArr[0]);
        for (int i = 1; i < dArr.length; i++) {
            sb.append(str);
            sb.append(dArr[i]);
        }
        return sb.toString();
    }

    public static java.util.Comparator<double[]> lexicographicalComparator() {
        return com.google.common.primitives.Doubles.LexicographicalComparator.INSTANCE;
    }

    enum LexicographicalComparator implements java.util.Comparator<double[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public final int compare(double[] dArr, double[] dArr2) {
            int min = java.lang.Math.min(dArr.length, dArr2.length);
            for (int i = 0; i < min; i++) {
                int compare = java.lang.Double.compare(dArr[i], dArr2[i]);
                if (compare != 0) {
                    return compare;
                }
            }
            return dArr.length - dArr2.length;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "Doubles.lexicographicalComparator()";
        }
    }

    public static void sortDescending(double[] dArr) {
        com.google.common.base.Preconditions.checkNotNull(dArr);
        sortDescending(dArr, 0, dArr.length);
    }

    public static void sortDescending(double[] dArr, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(dArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, dArr.length);
        java.util.Arrays.sort(dArr, i, i2);
        reverse(dArr, i, i2);
    }

    public static void reverse(double[] dArr) {
        com.google.common.base.Preconditions.checkNotNull(dArr);
        reverse(dArr, 0, dArr.length);
    }

    public static void reverse(double[] dArr, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(dArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, dArr.length);
        while (true) {
            i2--;
            if (i >= i2) {
                return;
            }
            double d = dArr[i];
            dArr[i] = dArr[i2];
            dArr[i2] = d;
            i++;
        }
    }

    public static void rotate(double[] dArr, int i) {
        rotate(dArr, i, 0, dArr.length);
    }

    public static void rotate(double[] dArr, int i, int i2, int i3) {
        com.google.common.base.Preconditions.checkNotNull(dArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i2, i3, dArr.length);
        if (dArr.length > 1) {
            int i4 = i3 - i2;
            int i5 = (-i) % i4;
            if (i5 < 0) {
                i5 += i4;
            }
            int i6 = i5 + i2;
            if (i6 == i2) {
                return;
            }
            reverse(dArr, i2, i6);
            reverse(dArr, i6, i3);
            reverse(dArr, i2, i3);
        }
    }

    public static double[] toArray(java.util.Collection<? extends java.lang.Number> collection) {
        if (collection instanceof com.google.common.primitives.Doubles.DoubleArrayAsList) {
            return ((com.google.common.primitives.Doubles.DoubleArrayAsList) collection).toDoubleArray();
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = ((java.lang.Number) com.google.common.base.Preconditions.checkNotNull(array[i])).doubleValue();
        }
        return dArr;
    }

    public static java.util.List<java.lang.Double> asList(double... dArr) {
        if (dArr.length == 0) {
            return java.util.Collections.emptyList();
        }
        return new com.google.common.primitives.Doubles.DoubleArrayAsList(dArr);
    }

    static final class DoubleArrayAsList extends java.util.AbstractList<java.lang.Double> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final double[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        DoubleArrayAsList(double[] dArr) {
            this(dArr, 0, dArr.length);
        }

        DoubleArrayAsList(double[] dArr, int i, int i2) {
            this.array = dArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.lang.Double get(int i) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            return java.lang.Double.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.List
        public final java.util.Spliterator.OfDouble spliterator() {
            return java.util.Spliterators.spliterator(this.array, this.start, this.end, 0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(java.lang.Object obj) {
            return (obj instanceof java.lang.Double) && com.google.common.primitives.Doubles.indexOf(this.array, ((java.lang.Double) obj).doubleValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(java.lang.Object obj) {
            int indexOf;
            if (!(obj instanceof java.lang.Double) || (indexOf = com.google.common.primitives.Doubles.indexOf(this.array, ((java.lang.Double) obj).doubleValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return indexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(java.lang.Object obj) {
            int lastIndexOf;
            if (!(obj instanceof java.lang.Double) || (lastIndexOf = com.google.common.primitives.Doubles.lastIndexOf(this.array, ((java.lang.Double) obj).doubleValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return lastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.lang.Double set(int i, java.lang.Double d) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            double[] dArr = this.array;
            int i2 = this.start + i;
            double d2 = dArr[i2];
            dArr[i2] = ((java.lang.Double) com.google.common.base.Preconditions.checkNotNull(d)).doubleValue();
            return java.lang.Double.valueOf(d2);
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.util.List<java.lang.Double> subList(int i, int i2) {
            com.google.common.base.Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return java.util.Collections.emptyList();
            }
            double[] dArr = this.array;
            int i3 = this.start;
            return new com.google.common.primitives.Doubles.DoubleArrayAsList(dArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof com.google.common.primitives.Doubles.DoubleArrayAsList) {
                com.google.common.primitives.Doubles.DoubleArrayAsList doubleArrayAsList = (com.google.common.primitives.Doubles.DoubleArrayAsList) obj;
                int size = size();
                if (doubleArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != doubleArrayAsList.array[doubleArrayAsList.start + i]) {
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
                i = (i * 31) + java.lang.Double.hashCode(this.array[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractCollection
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 12);
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

        final double[] toDoubleArray() {
            return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }

    private static java.util.regex.Pattern fpPattern() {
        return java.util.regex.Pattern.compile("[+-]?(?:NaN|Infinity|(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?|0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?)".replace("#", "+"));
    }

    public static java.lang.Double tryParse(java.lang.String str) {
        if (!FLOATING_POINT_PATTERN.matcher(str).matches()) {
            return null;
        }
        try {
            return java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }
}

package com.google.common.primitives;

/* loaded from: classes9.dex */
public final class Floats extends com.google.common.primitives.FloatsMethodsForWeb {
    public static final int BYTES = 4;

    private Floats() {
    }

    public static int hashCode(float f) {
        return java.lang.Float.hashCode(f);
    }

    public static int compare(float f, float f2) {
        return java.lang.Float.compare(f, f2);
    }

    public static boolean isFinite(float f) {
        return java.lang.Float.isFinite(f);
    }

    public static boolean contains(float[] fArr, float f) {
        for (float f2 : fArr) {
            if (f2 == f) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(float[] fArr, float f) {
        return indexOf(fArr, f, 0, fArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
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
    public static int indexOf(float[] fArr, float[] fArr2) {
        com.google.common.base.Preconditions.checkNotNull(fArr, "array");
        com.google.common.base.Preconditions.checkNotNull(fArr2, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET);
        if (fArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (fArr.length - fArr2.length) + 1) {
            for (int i2 = 0; i2 < fArr2.length; i2++) {
                if (fArr[i + i2] != fArr2[i2]) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }

    public static int lastIndexOf(float[] fArr, float f) {
        return lastIndexOf(fArr, f, 0, fArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(float[] fArr, float f, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (fArr[i3] == f) {
                return i3;
            }
        }
        return -1;
    }

    public static float min(float... fArr) {
        com.google.common.base.Preconditions.checkArgument(fArr.length > 0);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = java.lang.Math.min(f, fArr[i]);
        }
        return f;
    }

    public static float max(float... fArr) {
        com.google.common.base.Preconditions.checkArgument(fArr.length > 0);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = java.lang.Math.max(f, fArr[i]);
        }
        return f;
    }

    public static float constrainToRange(float f, float f2, float f3) {
        if (f2 <= f3) {
            return java.lang.Math.min(java.lang.Math.max(f, f2), f3);
        }
        throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat("min (%s) must be less than or equal to max (%s)", java.lang.Float.valueOf(f2), java.lang.Float.valueOf(f3)));
    }

    public static float[] concat(float[]... fArr) {
        long j = 0;
        for (float[] fArr2 : fArr) {
            j += fArr2.length;
        }
        float[] fArr3 = new float[checkNoOverflow(j)];
        int i = 0;
        for (float[] fArr4 : fArr) {
            java.lang.System.arraycopy(fArr4, 0, fArr3, i, fArr4.length);
            i += fArr4.length;
        }
        return fArr3;
    }

    private static int checkNoOverflow(long j) {
        int i = (int) j;
        com.google.common.base.Preconditions.checkArgument(j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j);
        return i;
    }

    static final class FloatConverter extends com.google.common.base.Converter<java.lang.String, java.lang.Float> implements java.io.Serializable {
        static final com.google.common.base.Converter<java.lang.String, java.lang.Float> INSTANCE = new com.google.common.primitives.Floats.FloatConverter();
        private static final long serialVersionUID = 1;

        private FloatConverter() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public final java.lang.Float doForward(java.lang.String str) {
            return java.lang.Float.valueOf(str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public final java.lang.String doBackward(java.lang.Float f) {
            return f.toString();
        }

        public final java.lang.String toString() {
            return "Floats.stringConverter()";
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    public static com.google.common.base.Converter<java.lang.String, java.lang.Float> stringConverter() {
        return com.google.common.primitives.Floats.FloatConverter.INSTANCE;
    }

    public static float[] ensureCapacity(float[] fArr, int i, int i2) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "Invalid minLength: %s", i);
        com.google.common.base.Preconditions.checkArgument(i2 >= 0, "Invalid padding: %s", i2);
        return fArr.length < i ? java.util.Arrays.copyOf(fArr, i + i2) : fArr;
    }

    public static java.lang.String join(java.lang.String str, float... fArr) {
        com.google.common.base.Preconditions.checkNotNull(str);
        if (fArr.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(fArr.length * 12);
        sb.append(fArr[0]);
        for (int i = 1; i < fArr.length; i++) {
            sb.append(str);
            sb.append(fArr[i]);
        }
        return sb.toString();
    }

    public static java.util.Comparator<float[]> lexicographicalComparator() {
        return com.google.common.primitives.Floats.LexicographicalComparator.INSTANCE;
    }

    enum LexicographicalComparator implements java.util.Comparator<float[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public final int compare(float[] fArr, float[] fArr2) {
            int min = java.lang.Math.min(fArr.length, fArr2.length);
            for (int i = 0; i < min; i++) {
                int compare = java.lang.Float.compare(fArr[i], fArr2[i]);
                if (compare != 0) {
                    return compare;
                }
            }
            return fArr.length - fArr2.length;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "Floats.lexicographicalComparator()";
        }
    }

    public static void sortDescending(float[] fArr) {
        com.google.common.base.Preconditions.checkNotNull(fArr);
        sortDescending(fArr, 0, fArr.length);
    }

    public static void sortDescending(float[] fArr, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(fArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, fArr.length);
        java.util.Arrays.sort(fArr, i, i2);
        reverse(fArr, i, i2);
    }

    public static void reverse(float[] fArr) {
        com.google.common.base.Preconditions.checkNotNull(fArr);
        reverse(fArr, 0, fArr.length);
    }

    public static void reverse(float[] fArr, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(fArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, fArr.length);
        while (true) {
            i2--;
            if (i >= i2) {
                return;
            }
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
            i++;
        }
    }

    public static void rotate(float[] fArr, int i) {
        rotate(fArr, i, 0, fArr.length);
    }

    public static void rotate(float[] fArr, int i, int i2, int i3) {
        com.google.common.base.Preconditions.checkNotNull(fArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i2, i3, fArr.length);
        if (fArr.length > 1) {
            int i4 = i3 - i2;
            int i5 = (-i) % i4;
            if (i5 < 0) {
                i5 += i4;
            }
            int i6 = i5 + i2;
            if (i6 == i2) {
                return;
            }
            reverse(fArr, i2, i6);
            reverse(fArr, i6, i3);
            reverse(fArr, i2, i3);
        }
    }

    public static float[] toArray(java.util.Collection<? extends java.lang.Number> collection) {
        if (collection instanceof com.google.common.primitives.Floats.FloatArrayAsList) {
            return ((com.google.common.primitives.Floats.FloatArrayAsList) collection).toFloatArray();
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = ((java.lang.Number) com.google.common.base.Preconditions.checkNotNull(array[i])).floatValue();
        }
        return fArr;
    }

    public static java.util.List<java.lang.Float> asList(float... fArr) {
        if (fArr.length == 0) {
            return java.util.Collections.emptyList();
        }
        return new com.google.common.primitives.Floats.FloatArrayAsList(fArr);
    }

    static final class FloatArrayAsList extends java.util.AbstractList<java.lang.Float> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final float[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        FloatArrayAsList(float[] fArr) {
            this(fArr, 0, fArr.length);
        }

        FloatArrayAsList(float[] fArr, int i, int i2) {
            this.array = fArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.lang.Float get(int i) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            return java.lang.Float.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(java.lang.Object obj) {
            return (obj instanceof java.lang.Float) && com.google.common.primitives.Floats.indexOf(this.array, ((java.lang.Float) obj).floatValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(java.lang.Object obj) {
            int indexOf;
            if (!(obj instanceof java.lang.Float) || (indexOf = com.google.common.primitives.Floats.indexOf(this.array, ((java.lang.Float) obj).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return indexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(java.lang.Object obj) {
            int lastIndexOf;
            if (!(obj instanceof java.lang.Float) || (lastIndexOf = com.google.common.primitives.Floats.lastIndexOf(this.array, ((java.lang.Float) obj).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return lastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.lang.Float set(int i, java.lang.Float f) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            float[] fArr = this.array;
            int i2 = this.start + i;
            float f2 = fArr[i2];
            fArr[i2] = ((java.lang.Float) com.google.common.base.Preconditions.checkNotNull(f)).floatValue();
            return java.lang.Float.valueOf(f2);
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.util.List<java.lang.Float> subList(int i, int i2) {
            com.google.common.base.Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return java.util.Collections.emptyList();
            }
            float[] fArr = this.array;
            int i3 = this.start;
            return new com.google.common.primitives.Floats.FloatArrayAsList(fArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof com.google.common.primitives.Floats.FloatArrayAsList) {
                com.google.common.primitives.Floats.FloatArrayAsList floatArrayAsList = (com.google.common.primitives.Floats.FloatArrayAsList) obj;
                int size = size();
                if (floatArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != floatArrayAsList.array[floatArrayAsList.start + i]) {
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
                i = (i * 31) + java.lang.Float.hashCode(this.array[i2]);
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

        final float[] toFloatArray() {
            return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }

    public static java.lang.Float tryParse(java.lang.String str) {
        if (!com.google.common.primitives.Doubles.FLOATING_POINT_PATTERN.matcher(str).matches()) {
            return null;
        }
        try {
            return java.lang.Float.valueOf(java.lang.Float.parseFloat(str));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }
}

package com.google.common.math;

@com.google.common.math.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class Quantiles {
    /* JADX INFO: Access modifiers changed from: private */
    public static double interpolate(double lower, double upper, double remainder, double scale) {
        if (lower == Double.NEGATIVE_INFINITY) {
            return upper == Double.POSITIVE_INFINITY ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        if (upper == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return lower + (((upper - lower) * remainder) / scale);
    }

    public static com.google.common.math.Quantiles.ScaleAndIndex median() {
        return scale(2).index(1);
    }

    public static com.google.common.math.Quantiles.Scale quartiles() {
        return scale(4);
    }

    public static com.google.common.math.Quantiles.Scale percentiles() {
        return scale(100);
    }

    public static com.google.common.math.Quantiles.Scale scale(int scale) {
        return new com.google.common.math.Quantiles.Scale(scale);
    }

    public static final class Scale {
        private final int scale;

        private Scale(int scale) {
            com.google.common.base.Preconditions.checkArgument(scale > 0, "Quantile scale must be positive");
            this.scale = scale;
        }

        public com.google.common.math.Quantiles.ScaleAndIndex index(int index) {
            return new com.google.common.math.Quantiles.ScaleAndIndex(this.scale, index);
        }

        public com.google.common.math.Quantiles.ScaleAndIndexes indexes(int... indexes) {
            return new com.google.common.math.Quantiles.ScaleAndIndexes(this.scale, (int[]) indexes.clone());
        }

        public com.google.common.math.Quantiles.ScaleAndIndexes indexes(java.util.Collection<java.lang.Integer> indexes) {
            return new com.google.common.math.Quantiles.ScaleAndIndexes(this.scale, com.google.common.primitives.Ints.toArray(indexes));
        }
    }

    public static final class ScaleAndIndex {
        private final int index;
        private final int scale;

        private ScaleAndIndex(int scale, int index) {
            com.google.common.math.Quantiles.checkIndex(index, scale);
            this.scale = scale;
            this.index = index;
        }

        public double compute(java.util.Collection<? extends java.lang.Number> dataset) {
            return computeInPlace(com.google.common.primitives.Doubles.toArray(dataset));
        }

        public double compute(double... dataset) {
            return computeInPlace((double[]) dataset.clone());
        }

        public double compute(long... dataset) {
            return computeInPlace(com.google.common.math.Quantiles.longsToDoubles(dataset));
        }

        public double compute(int... dataset) {
            return computeInPlace(com.google.common.math.Quantiles.intsToDoubles(dataset));
        }

        public double computeInPlace(double... dataset) {
            com.google.common.base.Preconditions.checkArgument(dataset.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (com.google.common.math.Quantiles.containsNaN(dataset)) {
                return Double.NaN;
            }
            long length = this.index * (dataset.length - 1);
            int divide = (int) com.google.common.math.LongMath.divide(length, this.scale, java.math.RoundingMode.DOWN);
            int i = (int) (length - (divide * this.scale));
            com.google.common.math.Quantiles.selectInPlace(divide, dataset, 0, dataset.length - 1);
            if (i != 0) {
                int i2 = divide + 1;
                com.google.common.math.Quantiles.selectInPlace(i2, dataset, i2, dataset.length - 1);
                return com.google.common.math.Quantiles.interpolate(dataset[divide], dataset[i2], i, this.scale);
            }
            return dataset[divide];
        }
    }

    public static final class ScaleAndIndexes {
        private final int[] indexes;
        private final int scale;

        private ScaleAndIndexes(int scale, int[] indexes) {
            for (int i : indexes) {
                com.google.common.math.Quantiles.checkIndex(i, scale);
            }
            com.google.common.base.Preconditions.checkArgument(indexes.length > 0, "Indexes must be a non empty array");
            this.scale = scale;
            this.indexes = indexes;
        }

        public java.util.Map<java.lang.Integer, java.lang.Double> compute(java.util.Collection<? extends java.lang.Number> dataset) {
            return computeInPlace(com.google.common.primitives.Doubles.toArray(dataset));
        }

        public java.util.Map<java.lang.Integer, java.lang.Double> compute(double... dataset) {
            return computeInPlace((double[]) dataset.clone());
        }

        public java.util.Map<java.lang.Integer, java.lang.Double> compute(long... dataset) {
            return computeInPlace(com.google.common.math.Quantiles.longsToDoubles(dataset));
        }

        public java.util.Map<java.lang.Integer, java.lang.Double> compute(int... dataset) {
            return computeInPlace(com.google.common.math.Quantiles.intsToDoubles(dataset));
        }

        public java.util.Map<java.lang.Integer, java.lang.Double> computeInPlace(double... dataset) {
            int i = 0;
            int i2 = 1;
            com.google.common.base.Preconditions.checkArgument(dataset.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (com.google.common.math.Quantiles.containsNaN(dataset)) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                int[] iArr = this.indexes;
                int length = iArr.length;
                while (i < length) {
                    linkedHashMap.put(java.lang.Integer.valueOf(iArr[i]), java.lang.Double.valueOf(Double.NaN));
                    i++;
                }
                return java.util.Collections.unmodifiableMap(linkedHashMap);
            }
            int[] iArr2 = this.indexes;
            int[] iArr3 = new int[iArr2.length];
            int[] iArr4 = new int[iArr2.length];
            int[] iArr5 = new int[iArr2.length * 2];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= this.indexes.length) {
                    break;
                }
                long length2 = r5[i3] * (dataset.length - i2);
                int divide = (int) com.google.common.math.LongMath.divide(length2, this.scale, java.math.RoundingMode.DOWN);
                int i5 = i3;
                int i6 = (int) (length2 - (divide * this.scale));
                iArr3[i5] = divide;
                iArr4[i5] = i6;
                iArr5[i4] = divide;
                int i7 = i4 + 1;
                if (i6 != 0) {
                    iArr5[i7] = divide + 1;
                    i4 += 2;
                } else {
                    i4 = i7;
                }
                i3 = i5 + 1;
                i2 = 1;
            }
            java.util.Arrays.sort(iArr5, 0, i4);
            com.google.common.math.Quantiles.selectAllInPlace(iArr5, 0, i4 - 1, dataset, 0, dataset.length - 1);
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            while (true) {
                int[] iArr6 = this.indexes;
                if (i < iArr6.length) {
                    int i8 = iArr3[i];
                    int i9 = iArr4[i];
                    if (i9 == 0) {
                        linkedHashMap2.put(java.lang.Integer.valueOf(iArr6[i]), java.lang.Double.valueOf(dataset[i8]));
                    } else {
                        linkedHashMap2.put(java.lang.Integer.valueOf(iArr6[i]), java.lang.Double.valueOf(com.google.common.math.Quantiles.interpolate(dataset[i8], dataset[i8 + 1], i9, this.scale)));
                    }
                    i++;
                } else {
                    return java.util.Collections.unmodifiableMap(linkedHashMap2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean containsNaN(double... dataset) {
        for (double d : dataset) {
            if (java.lang.Double.isNaN(d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkIndex(int index, int scale) {
        if (index < 0 || index > scale) {
            throw new java.lang.IllegalArgumentException("Quantile indexes must be between 0 and the scale, which is " + scale);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] longsToDoubles(long[] longs) {
        int length = longs.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = longs[i];
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] intsToDoubles(int[] ints) {
        int length = ints.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = ints[i];
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void selectInPlace(int required, double[] array, int from, int to) {
        if (required != from) {
            while (to > from) {
                int partition = partition(array, from, to);
                if (partition >= required) {
                    to = partition - 1;
                }
                if (partition <= required) {
                    from = partition + 1;
                }
            }
            return;
        }
        int i = from;
        for (int i2 = from + 1; i2 <= to; i2++) {
            if (array[i] > array[i2]) {
                i = i2;
            }
        }
        if (i != from) {
            swap(array, i, from);
        }
    }

    private static int partition(double[] array, int from, int to) {
        movePivotToStartOfSlice(array, from, to);
        double d = array[from];
        int i = to;
        while (to > from) {
            if (array[to] > d) {
                swap(array, i, to);
                i--;
            }
            to--;
        }
        swap(array, from, i);
        return i;
    }

    private static void movePivotToStartOfSlice(double[] array, int from, int to) {
        int i = (from + to) >>> 1;
        double d = array[to];
        double d2 = array[i];
        boolean z = d < d2;
        double d3 = array[from];
        boolean z2 = d2 < d3;
        boolean z3 = d < d3;
        if (z == z2) {
            swap(array, i, from);
        } else if (z != z3) {
            swap(array, from, to);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void selectAllInPlace(int[] allRequired, int requiredFrom, int requiredTo, double[] array, int from, int to) {
        int chooseNextSelection = chooseNextSelection(allRequired, requiredFrom, requiredTo, from, to);
        int i = allRequired[chooseNextSelection];
        selectInPlace(i, array, from, to);
        int i2 = chooseNextSelection - 1;
        while (i2 >= requiredFrom && allRequired[i2] == i) {
            i2--;
        }
        if (i2 >= requiredFrom) {
            selectAllInPlace(allRequired, requiredFrom, i2, array, from, i - 1);
        }
        int i3 = chooseNextSelection + 1;
        while (i3 <= requiredTo && allRequired[i3] == i) {
            i3++;
        }
        if (i3 <= requiredTo) {
            selectAllInPlace(allRequired, i3, requiredTo, array, i + 1, to);
        }
    }

    private static int chooseNextSelection(int[] allRequired, int requiredFrom, int requiredTo, int from, int to) {
        if (requiredFrom == requiredTo) {
            return requiredFrom;
        }
        int i = from + to;
        int i2 = i >>> 1;
        while (requiredTo > requiredFrom + 1) {
            int i3 = (requiredFrom + requiredTo) >>> 1;
            int i4 = allRequired[i3];
            if (i4 > i2) {
                requiredTo = i3;
            } else {
                if (i4 >= i2) {
                    return i3;
                }
                requiredFrom = i3;
            }
        }
        return (i - allRequired[requiredFrom]) - allRequired[requiredTo] > 0 ? requiredTo : requiredFrom;
    }

    private static void swap(double[] array, int i, int j) {
        double d = array[i];
        array[i] = array[j];
        array[j] = d;
    }
}

package com.google.common.math;

/* loaded from: classes9.dex */
public final class Quantiles {
    /* JADX INFO: Access modifiers changed from: private */
    public static double interpolate(double d, double d2, double d3, double d4) {
        if (d == Double.NEGATIVE_INFINITY) {
            return d2 == Double.POSITIVE_INFINITY ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        if (d2 == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return d + (((d2 - d) * d3) / d4);
    }

    @java.lang.Deprecated
    public Quantiles() {
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

    public static com.google.common.math.Quantiles.Scale scale(int i) {
        return new com.google.common.math.Quantiles.Scale(i);
    }

    public static final class Scale {
        private final int scale;

        private Scale(int i) {
            com.google.common.base.Preconditions.checkArgument(i > 0, "Quantile scale must be positive");
            this.scale = i;
        }

        public final com.google.common.math.Quantiles.ScaleAndIndex index(int i) {
            return new com.google.common.math.Quantiles.ScaleAndIndex(this.scale, i);
        }

        public final com.google.common.math.Quantiles.ScaleAndIndexes indexes(int... iArr) {
            return new com.google.common.math.Quantiles.ScaleAndIndexes(this.scale, (int[]) iArr.clone());
        }

        public final com.google.common.math.Quantiles.ScaleAndIndexes indexes(java.util.Collection<java.lang.Integer> collection) {
            return new com.google.common.math.Quantiles.ScaleAndIndexes(this.scale, com.google.common.primitives.Ints.toArray(collection));
        }
    }

    public static final class ScaleAndIndex {
        private final int index;
        private final int scale;

        private ScaleAndIndex(int i, int i2) {
            com.google.common.math.Quantiles.checkIndex(i2, i);
            this.scale = i;
            this.index = i2;
        }

        public final double compute(java.util.Collection<? extends java.lang.Number> collection) {
            return computeInPlace(com.google.common.primitives.Doubles.toArray(collection));
        }

        public final double compute(double... dArr) {
            return computeInPlace((double[]) dArr.clone());
        }

        public final double compute(long... jArr) {
            return computeInPlace(com.google.common.math.Quantiles.longsToDoubles(jArr));
        }

        public final double compute(int... iArr) {
            return computeInPlace(com.google.common.math.Quantiles.intsToDoubles(iArr));
        }

        public final double computeInPlace(double... dArr) {
            com.google.common.base.Preconditions.checkArgument(dArr.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (com.google.common.math.Quantiles.containsNaN(dArr)) {
                return Double.NaN;
            }
            long length = this.index * (dArr.length - 1);
            int divide = (int) com.google.common.math.LongMath.divide(length, this.scale, java.math.RoundingMode.DOWN);
            int i = (int) (length - (divide * this.scale));
            com.google.common.math.Quantiles.selectInPlace(divide, dArr, 0, dArr.length - 1);
            if (i != 0) {
                int i2 = divide + 1;
                com.google.common.math.Quantiles.selectInPlace(i2, dArr, i2, dArr.length - 1);
                return com.google.common.math.Quantiles.interpolate(dArr[divide], dArr[i2], i, this.scale);
            }
            return dArr[divide];
        }
    }

    public static final class ScaleAndIndexes {
        private final int[] indexes;
        private final int scale;

        private ScaleAndIndexes(int i, int[] iArr) {
            for (int i2 : iArr) {
                com.google.common.math.Quantiles.checkIndex(i2, i);
            }
            com.google.common.base.Preconditions.checkArgument(iArr.length > 0, "Indexes must be a non empty array");
            this.scale = i;
            this.indexes = iArr;
        }

        public final java.util.Map<java.lang.Integer, java.lang.Double> compute(java.util.Collection<? extends java.lang.Number> collection) {
            return computeInPlace(com.google.common.primitives.Doubles.toArray(collection));
        }

        public final java.util.Map<java.lang.Integer, java.lang.Double> compute(double... dArr) {
            return computeInPlace((double[]) dArr.clone());
        }

        public final java.util.Map<java.lang.Integer, java.lang.Double> compute(long... jArr) {
            return computeInPlace(com.google.common.math.Quantiles.longsToDoubles(jArr));
        }

        public final java.util.Map<java.lang.Integer, java.lang.Double> compute(int... iArr) {
            return computeInPlace(com.google.common.math.Quantiles.intsToDoubles(iArr));
        }

        public final java.util.Map<java.lang.Integer, java.lang.Double> computeInPlace(double... dArr) {
            int i = 0;
            com.google.common.base.Preconditions.checkArgument(dArr.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (com.google.common.math.Quantiles.containsNaN(dArr)) {
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
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= this.indexes.length) {
                    break;
                }
                long length2 = r5[i2] * (dArr.length - 1);
                int divide = (int) com.google.common.math.LongMath.divide(length2, this.scale, java.math.RoundingMode.DOWN);
                int i4 = (int) (length2 - (divide * this.scale));
                iArr3[i2] = divide;
                iArr4[i2] = i4;
                iArr5[i3] = divide;
                int i5 = i3 + 1;
                if (i4 != 0) {
                    iArr5[i5] = divide + 1;
                    i3 += 2;
                } else {
                    i3 = i5;
                }
                i2++;
            }
            java.util.Arrays.sort(iArr5, 0, i3);
            com.google.common.math.Quantiles.selectAllInPlace(iArr5, 0, i3 - 1, dArr, 0, dArr.length - 1);
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            while (true) {
                int[] iArr6 = this.indexes;
                if (i < iArr6.length) {
                    int i6 = iArr3[i];
                    int i7 = iArr4[i];
                    if (i7 == 0) {
                        linkedHashMap2.put(java.lang.Integer.valueOf(iArr6[i]), java.lang.Double.valueOf(dArr[i6]));
                    } else {
                        linkedHashMap2.put(java.lang.Integer.valueOf(iArr6[i]), java.lang.Double.valueOf(com.google.common.math.Quantiles.interpolate(dArr[i6], dArr[i6 + 1], i7, this.scale)));
                    }
                    i++;
                } else {
                    return java.util.Collections.unmodifiableMap(linkedHashMap2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean containsNaN(double... dArr) {
        for (double d : dArr) {
            if (java.lang.Double.isNaN(d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkIndex(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new java.lang.IllegalArgumentException("Quantile indexes must be between 0 and the scale, which is ".concat(java.lang.String.valueOf(i2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] longsToDoubles(long[] jArr) {
        int length = jArr.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = jArr[i];
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] intsToDoubles(int[] iArr) {
        int length = iArr.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = iArr[i];
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void selectInPlace(int i, double[] dArr, int i2, int i3) {
        if (i != i2) {
            while (i3 > i2) {
                int partition = partition(dArr, i2, i3);
                if (partition >= i) {
                    i3 = partition - 1;
                }
                if (partition <= i) {
                    i2 = partition + 1;
                }
            }
            return;
        }
        int i4 = i2;
        for (int i5 = i2 + 1; i5 <= i3; i5++) {
            if (dArr[i4] > dArr[i5]) {
                i4 = i5;
            }
        }
        if (i4 != i2) {
            swap(dArr, i4, i2);
        }
    }

    private static int partition(double[] dArr, int i, int i2) {
        movePivotToStartOfSlice(dArr, i, i2);
        double d = dArr[i];
        int i3 = i2;
        while (i2 > i) {
            if (dArr[i2] > d) {
                swap(dArr, i3, i2);
                i3--;
            }
            i2--;
        }
        swap(dArr, i, i3);
        return i3;
    }

    private static void movePivotToStartOfSlice(double[] dArr, int i, int i2) {
        int i3 = (i + i2) >>> 1;
        double d = dArr[i2];
        double d2 = dArr[i3];
        boolean z = d < d2;
        double d3 = dArr[i];
        boolean z2 = d2 < d3;
        boolean z3 = d < d3;
        if (z == z2) {
            swap(dArr, i3, i);
        } else if (z != z3) {
            swap(dArr, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void selectAllInPlace(int[] iArr, int i, int i2, double[] dArr, int i3, int i4) {
        int i5 = i;
        int i6 = i3;
        while (true) {
            int chooseNextSelection = chooseNextSelection(iArr, i5, i2, i6, i4);
            int i7 = iArr[chooseNextSelection];
            selectInPlace(i7, dArr, i6, i4);
            int i8 = chooseNextSelection - 1;
            while (i8 >= i5 && iArr[i8] == i7) {
                i8--;
            }
            if (i8 >= i5) {
                selectAllInPlace(iArr, i5, i8, dArr, i6, i7 - 1);
            }
            i5 = chooseNextSelection + 1;
            while (i5 <= i2 && iArr[i5] == i7) {
                i5++;
            }
            if (i5 > i2) {
                return;
            } else {
                i6 = i7 + 1;
            }
        }
    }

    private static int chooseNextSelection(int[] iArr, int i, int i2, int i3, int i4) {
        if (i == i2) {
            return i;
        }
        int i5 = i3 + i4;
        int i6 = i5 >>> 1;
        while (i2 > i + 1) {
            int i7 = (i + i2) >>> 1;
            int i8 = iArr[i7];
            if (i8 > i6) {
                i2 = i7;
            } else {
                if (i8 >= i6) {
                    return i7;
                }
                i = i7;
            }
        }
        return (i5 - iArr[i]) - iArr[i2] > 0 ? i2 : i;
    }

    private static void swap(double[] dArr, int i, int i2) {
        double d = dArr[i];
        dArr[i] = dArr[i2];
        dArr[i2] = d;
    }
}

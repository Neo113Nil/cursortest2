package com.google.common.primitives;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class ImmutableDoubleArray implements java.io.Serializable {
    private static final com.google.common.primitives.ImmutableDoubleArray EMPTY = new com.google.common.primitives.ImmutableDoubleArray(new double[0]);
    private final double[] array;
    private final int end;
    private final transient int start;

    public static com.google.common.primitives.ImmutableDoubleArray of() {
        return EMPTY;
    }

    public static com.google.common.primitives.ImmutableDoubleArray of(double d) {
        return new com.google.common.primitives.ImmutableDoubleArray(new double[]{d});
    }

    public static com.google.common.primitives.ImmutableDoubleArray of(double d, double d2) {
        return new com.google.common.primitives.ImmutableDoubleArray(new double[]{d, d2});
    }

    public static com.google.common.primitives.ImmutableDoubleArray of(double d, double d2, double d3) {
        return new com.google.common.primitives.ImmutableDoubleArray(new double[]{d, d2, d3});
    }

    public static com.google.common.primitives.ImmutableDoubleArray of(double d, double d2, double d3, double d4) {
        return new com.google.common.primitives.ImmutableDoubleArray(new double[]{d, d2, d3, d4});
    }

    public static com.google.common.primitives.ImmutableDoubleArray of(double d, double d2, double d3, double d4, double d5) {
        return new com.google.common.primitives.ImmutableDoubleArray(new double[]{d, d2, d3, d4, d5});
    }

    public static com.google.common.primitives.ImmutableDoubleArray of(double d, double d2, double d3, double d4, double d5, double d6) {
        return new com.google.common.primitives.ImmutableDoubleArray(new double[]{d, d2, d3, d4, d5, d6});
    }

    public static com.google.common.primitives.ImmutableDoubleArray of(double d, double... dArr) {
        com.google.common.base.Preconditions.checkArgument(dArr.length <= 2147483646, "the total number of elements must fit in an int");
        double[] dArr2 = new double[dArr.length + 1];
        dArr2[0] = d;
        java.lang.System.arraycopy(dArr, 0, dArr2, 1, dArr.length);
        return new com.google.common.primitives.ImmutableDoubleArray(dArr2);
    }

    public static com.google.common.primitives.ImmutableDoubleArray copyOf(double[] dArr) {
        if (dArr.length == 0) {
            return EMPTY;
        }
        return new com.google.common.primitives.ImmutableDoubleArray(java.util.Arrays.copyOf(dArr, dArr.length));
    }

    public static com.google.common.primitives.ImmutableDoubleArray copyOf(java.util.Collection<java.lang.Double> collection) {
        return collection.isEmpty() ? EMPTY : new com.google.common.primitives.ImmutableDoubleArray(com.google.common.primitives.Doubles.toArray(collection));
    }

    public static com.google.common.primitives.ImmutableDoubleArray copyOf(java.lang.Iterable<java.lang.Double> iterable) {
        if (iterable instanceof java.util.Collection) {
            return copyOf((java.util.Collection<java.lang.Double>) iterable);
        }
        return builder().addAll(iterable).build();
    }

    public static com.google.common.primitives.ImmutableDoubleArray copyOf(java.util.stream.DoubleStream doubleStream) {
        double[] array = doubleStream.toArray();
        return array.length == 0 ? EMPTY : new com.google.common.primitives.ImmutableDoubleArray(array);
    }

    public static com.google.common.primitives.ImmutableDoubleArray.Builder builder(int i) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "Invalid initialCapacity: %s", i);
        return new com.google.common.primitives.ImmutableDoubleArray.Builder(i);
    }

    public static com.google.common.primitives.ImmutableDoubleArray.Builder builder() {
        return new com.google.common.primitives.ImmutableDoubleArray.Builder(10);
    }

    public static final class Builder {
        public static int Camera2StreamConfigurationMap;
        public static int getHighSpeedVideoFpsRanges;
        private double[] array;
        private int count = 0;

        Builder(int i) {
            this.array = new double[i];
        }

        public final com.google.common.primitives.ImmutableDoubleArray.Builder add(double d) {
            ensureRoomFor(1);
            double[] dArr = this.array;
            int i = this.count;
            dArr[i] = d;
            this.count = i + 1;
            return this;
        }

        public final com.google.common.primitives.ImmutableDoubleArray.Builder addAll(double[] dArr) {
            ensureRoomFor(dArr.length);
            java.lang.System.arraycopy(dArr, 0, this.array, this.count, dArr.length);
            this.count += dArr.length;
            return this;
        }

        public final com.google.common.primitives.ImmutableDoubleArray.Builder addAll(java.lang.Iterable<java.lang.Double> iterable) {
            if (iterable instanceof java.util.Collection) {
                return addAll((java.util.Collection<java.lang.Double>) iterable);
            }
            java.util.Iterator<java.lang.Double> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next().doubleValue());
            }
            return this;
        }

        public final com.google.common.primitives.ImmutableDoubleArray.Builder addAll(java.util.Collection<java.lang.Double> collection) {
            ensureRoomFor(collection.size());
            for (java.lang.Double d : collection) {
                double[] dArr = this.array;
                int i = this.count;
                this.count = i + 1;
                dArr[i] = d.doubleValue();
            }
            return this;
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Spliterator$OfDouble] */
        public final com.google.common.primitives.ImmutableDoubleArray.Builder addAll(java.util.stream.DoubleStream doubleStream) {
            ?? spliterator = doubleStream.spliterator();
            long exactSizeIfKnown = spliterator.getExactSizeIfKnown();
            if (exactSizeIfKnown > 0) {
                ensureRoomFor(com.google.common.primitives.Ints.saturatedCast(exactSizeIfKnown));
            }
            spliterator.forEachRemaining(new java.util.function.DoubleConsumer() { // from class: com.google.common.primitives.ImmutableDoubleArray$Builder$$ExternalSyntheticLambda0
                @Override // java.util.function.DoubleConsumer
                public final void accept(double d) {
                    com.google.common.primitives.ImmutableDoubleArray.Builder.this.add(d);
                }
            });
            return this;
        }

        public final com.google.common.primitives.ImmutableDoubleArray.Builder addAll(com.google.common.primitives.ImmutableDoubleArray immutableDoubleArray) {
            ensureRoomFor(immutableDoubleArray.length());
            java.lang.System.arraycopy(immutableDoubleArray.array, immutableDoubleArray.start, this.array, this.count, immutableDoubleArray.length());
            this.count += immutableDoubleArray.length();
            return this;
        }

        private void ensureRoomFor(int i) {
            int i2 = this.count + i;
            double[] dArr = this.array;
            if (i2 > dArr.length) {
                this.array = java.util.Arrays.copyOf(dArr, expandedCapacity(dArr.length, i2));
            }
        }

        private static int expandedCapacity(int i, int i2) {
            if (i2 < 0) {
                throw new java.lang.AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = java.lang.Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }

        public final com.google.common.primitives.ImmutableDoubleArray build() {
            if (this.count == 0) {
                return com.google.common.primitives.ImmutableDoubleArray.EMPTY;
            }
            return new com.google.common.primitives.ImmutableDoubleArray(this.array, 0, this.count);
        }

        public static int getHighResolutionOutputSizeshNQ4ISI() {
            int i = getHighSpeedVideoFpsRanges;
            int i2 = i % 6721986;
            getHighSpeedVideoFpsRanges = i + 1;
            if (i2 != 0) {
                return Camera2StreamConfigurationMap;
            }
            int myPid = android.os.Process.myPid();
            Camera2StreamConfigurationMap = myPid;
            return myPid;
        }
    }

    private ImmutableDoubleArray(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    private ImmutableDoubleArray(double[] dArr, int i, int i2) {
        this.array = dArr;
        this.start = i;
        this.end = i2;
    }

    public final int length() {
        return this.end - this.start;
    }

    public final boolean isEmpty() {
        return this.end == this.start;
    }

    public final double get(int i) {
        com.google.common.base.Preconditions.checkElementIndex(i, length());
        return this.array[this.start + i];
    }

    public final int indexOf(double d) {
        for (int i = this.start; i < this.end; i++) {
            if (areEqual(this.array[i], d)) {
                return i - this.start;
            }
        }
        return -1;
    }

    public final int lastIndexOf(double d) {
        int i = this.end;
        do {
            i--;
            if (i < this.start) {
                return -1;
            }
        } while (!areEqual(this.array[i], d));
        return i - this.start;
    }

    public final boolean contains(double d) {
        return indexOf(d) >= 0;
    }

    public final void forEach(java.util.function.DoubleConsumer doubleConsumer) {
        com.google.common.base.Preconditions.checkNotNull(doubleConsumer);
        for (int i = this.start; i < this.end; i++) {
            doubleConsumer.accept(this.array[i]);
        }
    }

    public final java.util.stream.DoubleStream stream() {
        return java.util.Arrays.stream(this.array, this.start, this.end);
    }

    public final double[] toArray() {
        return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public final com.google.common.primitives.ImmutableDoubleArray subArray(int i, int i2) {
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, length());
        if (i == i2) {
            return EMPTY;
        }
        double[] dArr = this.array;
        int i3 = this.start;
        return new com.google.common.primitives.ImmutableDoubleArray(dArr, i + i3, i3 + i2);
    }

    final java.util.Spliterator.OfDouble spliterator() {
        return java.util.Spliterators.spliterator(this.array, this.start, this.end, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_WATERMARK);
    }

    public final java.util.List<java.lang.Double> asList() {
        return new com.google.common.primitives.ImmutableDoubleArray.AsList();
    }

    static final class AsList extends java.util.AbstractList<java.lang.Double> implements java.util.RandomAccess, java.io.Serializable {
        private final com.google.common.primitives.ImmutableDoubleArray parent;

        private AsList(com.google.common.primitives.ImmutableDoubleArray immutableDoubleArray) {
            this.parent = immutableDoubleArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.lang.Double get(int i) {
            return java.lang.Double.valueOf(this.parent.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(java.lang.Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.Double) {
                return this.parent.indexOf(((java.lang.Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.Double) {
                return this.parent.lastIndexOf(((java.lang.Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.util.List<java.lang.Double> subList(int i, int i2) {
            return this.parent.subArray(i, i2).asList();
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.List
        public final java.util.Spliterator<java.lang.Double> spliterator() {
            return this.parent.spliterator();
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.primitives.ImmutableDoubleArray.AsList) {
                return this.parent.equals(((com.google.common.primitives.ImmutableDoubleArray.AsList) obj).parent);
            }
            if (!(obj instanceof java.util.List)) {
                return false;
            }
            java.util.List list = (java.util.List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i = this.parent.start;
            for (java.lang.Object obj2 : list) {
                if (!(obj2 instanceof java.lang.Double) || !com.google.common.primitives.ImmutableDoubleArray.areEqual(this.parent.array[i], ((java.lang.Double) obj2).doubleValue())) {
                    return false;
                }
                i++;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            return this.parent.hashCode();
        }

        @Override // java.util.AbstractCollection
        public final java.lang.String toString() {
            return this.parent.toString();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.common.primitives.ImmutableDoubleArray)) {
            return false;
        }
        com.google.common.primitives.ImmutableDoubleArray immutableDoubleArray = (com.google.common.primitives.ImmutableDoubleArray) obj;
        if (length() != immutableDoubleArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (!areEqual(get(i), immutableDoubleArray.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean areEqual(double d, double d2) {
        return java.lang.Double.doubleToLongBits(d) == java.lang.Double.doubleToLongBits(d2);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.start; i2 < this.end; i2++) {
            i = (i * 31) + java.lang.Double.hashCode(this.array[i2]);
        }
        return i;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length() * 5);
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

    public final com.google.common.primitives.ImmutableDoubleArray trimmed() {
        return isPartialView() ? new com.google.common.primitives.ImmutableDoubleArray(toArray()) : this;
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    final java.lang.Object writeReplace() {
        return trimmed();
    }

    final java.lang.Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }
}

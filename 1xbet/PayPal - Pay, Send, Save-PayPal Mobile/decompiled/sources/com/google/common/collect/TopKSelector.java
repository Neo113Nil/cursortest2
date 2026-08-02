package com.google.common.collect;

/* loaded from: classes9.dex */
final class TopKSelector<T> {
    private final T[] buffer;
    private int bufferSize;
    private final java.util.Comparator<? super T> comparator;
    private final int k;
    private T threshold;

    public static <T extends java.lang.Comparable<? super T>> com.google.common.collect.TopKSelector<T> least(int i) {
        return least(i, com.google.common.collect.Ordering.natural());
    }

    public static <T> com.google.common.collect.TopKSelector<T> least(int i, java.util.Comparator<? super T> comparator) {
        return new com.google.common.collect.TopKSelector<>(comparator, i);
    }

    public static <T extends java.lang.Comparable<? super T>> com.google.common.collect.TopKSelector<T> greatest(int i) {
        return greatest(i, com.google.common.collect.Ordering.natural());
    }

    public static <T> com.google.common.collect.TopKSelector<T> greatest(int i, java.util.Comparator<? super T> comparator) {
        return new com.google.common.collect.TopKSelector<>(com.google.common.collect.Ordering.from(comparator).reverse(), i);
    }

    private TopKSelector(java.util.Comparator<? super T> comparator, int i) {
        this.comparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator, "comparator");
        this.k = i;
        com.google.common.base.Preconditions.checkArgument(i >= 0, "k (%s) must be >= 0", i);
        com.google.common.base.Preconditions.checkArgument(i <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i);
        this.buffer = (T[]) new java.lang.Object[java.lang.Math.multiplyExact(i, 2)];
        this.bufferSize = 0;
        this.threshold = null;
    }

    public final void offer(T t) {
        int i = this.k;
        if (i != 0) {
            int i2 = this.bufferSize;
            if (i2 == 0) {
                this.buffer[0] = t;
                this.threshold = t;
                this.bufferSize = 1;
                return;
            }
            if (i2 < i) {
                T[] tArr = this.buffer;
                this.bufferSize = i2 + 1;
                tArr[i2] = t;
                if (this.comparator.compare(t, (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.threshold)) > 0) {
                    this.threshold = t;
                    return;
                }
                return;
            }
            if (this.comparator.compare(t, (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.threshold)) < 0) {
                T[] tArr2 = this.buffer;
                int i3 = this.bufferSize;
                int i4 = i3 + 1;
                this.bufferSize = i4;
                tArr2[i3] = t;
                if (i4 == this.k * 2) {
                    trim();
                }
            }
        }
    }

    private void trim() {
        int i = (this.k * 2) - 1;
        int log2 = com.google.common.math.IntMath.log2(i, java.math.RoundingMode.CEILING);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i) {
                break;
            }
            int partition = partition(i3, i, ((i3 + i) + 1) >>> 1);
            int i5 = this.k;
            if (partition <= i5) {
                if (partition >= i5) {
                    break;
                }
                i3 = java.lang.Math.max(partition, i3 + 1);
                i2 = partition;
            } else {
                i = partition - 1;
            }
            i4++;
            if (i4 >= log2 * 3) {
                java.util.Arrays.sort(this.buffer, i3, i + 1, this.comparator);
                break;
            }
        }
        this.bufferSize = this.k;
        this.threshold = (T) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.buffer[i2]);
        while (true) {
            i2++;
            if (i2 >= this.k) {
                return;
            }
            if (this.comparator.compare((java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.buffer[i2]), (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.threshold)) > 0) {
                this.threshold = this.buffer[i2];
            }
        }
    }

    private int partition(int i, int i2, int i3) {
        java.lang.Object uncheckedCastNullableTToT = com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.buffer[i3]);
        T[] tArr = this.buffer;
        tArr[i3] = tArr[i2];
        int i4 = i;
        while (i < i2) {
            if (this.comparator.compare((java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.buffer[i]), uncheckedCastNullableTToT) < 0) {
                swap(i4, i);
                i4++;
            }
            i++;
        }
        T[] tArr2 = this.buffer;
        tArr2[i2] = tArr2[i4];
        tArr2[i4] = uncheckedCastNullableTToT;
        return i4;
    }

    private void swap(int i, int i2) {
        T[] tArr = this.buffer;
        T t = tArr[i];
        tArr[i] = tArr[i2];
        tArr[i2] = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final com.google.common.collect.TopKSelector<T> combine(com.google.common.collect.TopKSelector<T> topKSelector) {
        for (int i = 0; i < topKSelector.bufferSize; i++) {
            offer(com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(topKSelector.buffer[i]));
        }
        return this;
    }

    public final void offerAll(java.lang.Iterable<? extends T> iterable) {
        offerAll(iterable.iterator());
    }

    public final void offerAll(java.util.Iterator<? extends T> it) {
        while (it.hasNext()) {
            offer(it.next());
        }
    }

    public final java.util.List<T> topK() {
        T[] tArr = this.buffer;
        java.util.Arrays.sort(tArr, 0, this.bufferSize, this.comparator);
        int i = this.bufferSize;
        int i2 = this.k;
        if (i > i2) {
            T[] tArr2 = this.buffer;
            java.util.Arrays.fill(tArr2, i2, tArr2.length, (java.lang.Object) null);
            int i3 = this.k;
            this.bufferSize = i3;
            this.threshold = this.buffer[i3 - 1];
        }
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(java.util.Arrays.copyOf(tArr, this.bufferSize)));
    }
}

package rx.internal.util.atomic;

/* loaded from: classes18.dex */
public final class SpscLinkedArrayQueue<T> implements java.util.Queue<T> {
    static final int Camera2StreamConfigurationMap = java.lang.Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final java.lang.Object getHighSpeedVideoSizesFor = new java.lang.Object();
    int getHighResolutionOutputSizeshNQ4ISI;
    java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> getHighSpeedVideoFpsRanges;
    java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizes;
    long getInputFormats;
    int getInputSizeshNQ4ISI;
    int getOutputFormats;
    final java.util.concurrent.atomic.AtomicLong getOutputMinFrameDuration;

    public SpscLinkedArrayQueue(int i) {
        int roundToPowerOfTwo = rx.internal.util.unsafe.Pow2.roundToPowerOfTwo(i);
        int i2 = roundToPowerOfTwo - 1;
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = new java.util.concurrent.atomic.AtomicReferenceArray<>(roundToPowerOfTwo + 1);
        this.getHighSpeedVideoFpsRangesFor = atomicReferenceArray;
        this.getInputSizeshNQ4ISI = i2;
        this.getOutputFormats = java.lang.Math.min(roundToPowerOfTwo / 4, Camera2StreamConfigurationMap);
        this.getHighSpeedVideoFpsRanges = atomicReferenceArray;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getInputFormats = roundToPowerOfTwo - 2;
        this.getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicLong();
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicLong();
    }

    @Override // java.util.Queue
    public final boolean offer(T t) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.getHighSpeedVideoFpsRangesFor;
        long j = this.getOutputMinFrameDuration.get();
        int i = this.getInputSizeshNQ4ISI;
        int i2 = ((int) j) & i;
        if (j >= this.getInputFormats) {
            long j2 = this.getOutputFormats + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.getInputFormats = j2 - 1;
                atomicReferenceArray.lazySet(i2, t);
                this.getOutputMinFrameDuration.lazySet(j + 1);
                return true;
            }
            long j3 = j + 1;
            if (atomicReferenceArray.get(((int) j3) & i) == null) {
                atomicReferenceArray.lazySet(i2, t);
                this.getOutputMinFrameDuration.lazySet(j3);
                return true;
            }
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray<>(atomicReferenceArray.length());
            this.getHighSpeedVideoFpsRangesFor = atomicReferenceArray2;
            this.getInputFormats = (i + j) - 1;
            atomicReferenceArray2.lazySet(i2, t);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, getHighSpeedVideoSizesFor);
            this.getOutputMinFrameDuration.lazySet(j3);
            return true;
        }
        atomicReferenceArray.lazySet(i2, t);
        this.getOutputMinFrameDuration.lazySet(j + 1);
        return true;
    }

    @Override // java.util.Queue
    public final T poll() {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.getHighSpeedVideoFpsRanges;
        long j = this.getHighSpeedVideoSizes.get();
        int i = this.getHighResolutionOutputSizeshNQ4ISI & ((int) j);
        T t = (T) atomicReferenceArray.get(i);
        boolean z = t == getHighSpeedVideoSizesFor;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i, null);
            this.getHighSpeedVideoSizes.lazySet(j + 1);
            return t;
        }
        if (!z) {
            return null;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = (java.util.concurrent.atomic.AtomicReferenceArray) atomicReferenceArray.get(atomicReferenceArray.length() - 1);
        this.getHighSpeedVideoFpsRanges = atomicReferenceArray2;
        T t2 = (T) atomicReferenceArray2.get(i);
        if (t2 == null) {
            return null;
        }
        atomicReferenceArray2.lazySet(i, null);
        this.getHighSpeedVideoSizes.lazySet(j + 1);
        return t2;
    }

    @Override // java.util.Queue
    public final T peek() {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.getHighSpeedVideoFpsRanges;
        int i = ((int) this.getHighSpeedVideoSizes.get()) & this.getHighResolutionOutputSizeshNQ4ISI;
        T t = (T) atomicReferenceArray.get(i);
        if (t != getHighSpeedVideoSizesFor) {
            return t;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = (java.util.concurrent.atomic.AtomicReferenceArray) atomicReferenceArray.get(atomicReferenceArray.length() - 1);
        this.getHighSpeedVideoFpsRanges = atomicReferenceArray2;
        return (T) atomicReferenceArray2.get(i);
    }

    @Override // java.util.Collection
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final <E> E[] toArray(E[] eArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection<? extends T> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(T t) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final T remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final T element() {
        throw new java.lang.UnsupportedOperationException();
    }

    public final boolean offer(T t, T t2) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.getHighSpeedVideoFpsRangesFor;
        long j = this.getOutputMinFrameDuration.get();
        int i = this.getInputSizeshNQ4ISI;
        long j2 = 2 + j;
        if (atomicReferenceArray.get(((int) j2) & i) != null) {
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray<>(atomicReferenceArray.length());
            this.getHighSpeedVideoFpsRangesFor = atomicReferenceArray2;
            int i2 = ((int) j) & i;
            atomicReferenceArray2.lazySet(i2 + 1, t2);
            atomicReferenceArray2.lazySet(i2, t);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, getHighSpeedVideoSizesFor);
            this.getOutputMinFrameDuration.lazySet(j2);
        } else {
            int i3 = ((int) j) & i;
            atomicReferenceArray.lazySet(i3 + 1, t2);
            atomicReferenceArray.lazySet(i3, t);
            this.getOutputMinFrameDuration.lazySet(j2);
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.getOutputMinFrameDuration.get() == this.getHighSpeedVideoSizes.get();
    }

    @Override // java.util.Collection
    public final int size() {
        long j = this.getHighSpeedVideoSizes.get();
        while (true) {
            long j2 = this.getOutputMinFrameDuration.get();
            long j3 = this.getHighSpeedVideoSizes.get();
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }
}

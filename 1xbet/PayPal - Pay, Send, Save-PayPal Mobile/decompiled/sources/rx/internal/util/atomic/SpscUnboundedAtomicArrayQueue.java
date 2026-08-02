package rx.internal.util.atomic;

/* loaded from: classes18.dex */
public final class SpscUnboundedAtomicArrayQueue<T> implements java.util.Queue<T> {
    static final int getHighSpeedVideoFpsRangesFor = java.lang.Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final java.lang.Object getOutputFormats = new java.lang.Object();
    java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> Camera2StreamConfigurationMap;
    final java.util.concurrent.atomic.AtomicLong getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> getHighSpeedVideoSizes;
    long getHighSpeedVideoSizesFor;
    final java.util.concurrent.atomic.AtomicLong getInputFormats;
    int getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    public SpscUnboundedAtomicArrayQueue(int i) {
        int roundToPowerOfTwo = rx.internal.util.unsafe.Pow2.roundToPowerOfTwo(java.lang.Math.max(8, i));
        int i2 = roundToPowerOfTwo - 1;
        java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong();
        this.getInputFormats = atomicLong;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = new java.util.concurrent.atomic.AtomicReferenceArray<>(roundToPowerOfTwo + 1);
        this.Camera2StreamConfigurationMap = atomicReferenceArray;
        this.getInputSizeshNQ4ISI = i2;
        this.getOutputMinFrameDuration = java.lang.Math.min(roundToPowerOfTwo / 4, getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoSizes = atomicReferenceArray;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getHighSpeedVideoSizesFor = roundToPowerOfTwo - 2;
        atomicLong.lazySet(0L);
    }

    @Override // java.util.Queue
    public final boolean offer(T t) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.Camera2StreamConfigurationMap;
        long j = this.getInputFormats.get();
        int i = this.getInputSizeshNQ4ISI;
        int i2 = ((int) j) & i;
        if (j >= this.getHighSpeedVideoSizesFor) {
            long j2 = this.getOutputMinFrameDuration + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.getHighSpeedVideoSizesFor = j2 - 1;
                this.getInputFormats.lazySet(j + 1);
                atomicReferenceArray.lazySet(i2, t);
                return true;
            }
            long j3 = j + 1;
            if (atomicReferenceArray.get(((int) j3) & i) != null) {
                this.getInputFormats.lazySet(j3);
                atomicReferenceArray.lazySet(i2, t);
                return true;
            }
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray<>(atomicReferenceArray.length());
            this.Camera2StreamConfigurationMap = atomicReferenceArray2;
            this.getHighSpeedVideoSizesFor = (i + j) - 1;
            this.getInputFormats.lazySet(j3);
            atomicReferenceArray2.lazySet(i2, t);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, getOutputFormats);
            return true;
        }
        this.getInputFormats.lazySet(j + 1);
        atomicReferenceArray.lazySet(i2, t);
        return true;
    }

    @Override // java.util.Queue
    public final T poll() {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.getHighSpeedVideoSizes;
        long j = this.getHighResolutionOutputSizeshNQ4ISI.get();
        int i = this.getHighSpeedVideoFpsRanges & ((int) j);
        T t = (T) atomicReferenceArray.get(i);
        boolean z = t == getOutputFormats;
        if (t != null && !z) {
            this.getHighResolutionOutputSizeshNQ4ISI.lazySet(j + 1);
            atomicReferenceArray.lazySet(i, null);
            return t;
        }
        if (!z) {
            return null;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = (java.util.concurrent.atomic.AtomicReferenceArray) atomicReferenceArray.get(atomicReferenceArray.length() - 1);
        this.getHighSpeedVideoSizes = atomicReferenceArray2;
        T t2 = (T) atomicReferenceArray2.get(i);
        if (t2 == null) {
            return null;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.lazySet(j + 1);
        atomicReferenceArray2.lazySet(i, null);
        return t2;
    }

    @Override // java.util.Queue
    public final T peek() {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.getHighSpeedVideoSizes;
        int i = ((int) this.getHighResolutionOutputSizeshNQ4ISI.get()) & this.getHighSpeedVideoFpsRanges;
        T t = (T) atomicReferenceArray.get(i);
        if (t != getOutputFormats) {
            return t;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = (java.util.concurrent.atomic.AtomicReferenceArray) atomicReferenceArray.get(atomicReferenceArray.length() - 1);
        this.getHighSpeedVideoSizes = atomicReferenceArray2;
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

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.getInputFormats.get() == this.getHighResolutionOutputSizeshNQ4ISI.get();
    }

    @Override // java.util.Collection
    public final int size() {
        long j = this.getHighResolutionOutputSizeshNQ4ISI.get();
        while (true) {
            long j2 = this.getInputFormats.get();
            long j3 = this.getHighResolutionOutputSizeshNQ4ISI.get();
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }
}

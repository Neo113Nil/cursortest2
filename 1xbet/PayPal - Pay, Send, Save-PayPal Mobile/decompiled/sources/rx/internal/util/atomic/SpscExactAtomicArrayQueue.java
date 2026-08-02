package rx.internal.util.atomic;

/* loaded from: classes18.dex */
public final class SpscExactAtomicArrayQueue<T> extends java.util.concurrent.atomic.AtomicReferenceArray<T> implements java.util.Queue<T> {
    private static final long serialVersionUID = 6210984603741293445L;
    final int Camera2StreamConfigurationMap;
    final java.util.concurrent.atomic.AtomicLong getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRangesFor;

    public SpscExactAtomicArrayQueue(int i) {
        super(rx.internal.util.unsafe.Pow2.roundToPowerOfTwo(i));
        int length = length();
        this.getHighSpeedVideoFpsRanges = length - 1;
        this.Camera2StreamConfigurationMap = length - i;
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicLong();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
    }

    @Override // java.util.Queue
    public final boolean offer(T t) {
        long j = this.getHighSpeedVideoFpsRangesFor.get();
        int i = this.getHighSpeedVideoFpsRanges;
        if (get(((int) (this.Camera2StreamConfigurationMap + j)) & i) != null) {
            return false;
        }
        this.getHighSpeedVideoFpsRangesFor.lazySet(j + 1);
        lazySet(i & ((int) j), t);
        return true;
    }

    @Override // java.util.Queue
    public final T poll() {
        long j = this.getHighResolutionOutputSizeshNQ4ISI.get();
        int i = ((int) j) & this.getHighSpeedVideoFpsRanges;
        T t = get(i);
        if (t == null) {
            return null;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.lazySet(j + 1);
        lazySet(i, null);
        return t;
    }

    @Override // java.util.Queue
    public final T peek() {
        return get(((int) this.getHighResolutionOutputSizeshNQ4ISI.get()) & this.getHighSpeedVideoFpsRanges);
    }

    @Override // java.util.Collection
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRangesFor == this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.util.Collection
    public final int size() {
        long j = this.getHighResolutionOutputSizeshNQ4ISI.get();
        while (true) {
            long j2 = this.getHighSpeedVideoFpsRangesFor.get();
            long j3 = this.getHighResolutionOutputSizeshNQ4ISI.get();
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
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
}

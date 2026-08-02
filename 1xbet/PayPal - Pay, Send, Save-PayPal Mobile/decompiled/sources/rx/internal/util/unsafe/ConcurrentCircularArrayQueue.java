package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
public abstract class ConcurrentCircularArrayQueue<E> extends rx.internal.util.unsafe.ConcurrentCircularArrayQueueL0Pad<E> {
    protected static final int BUFFER_PAD = 32;
    protected static final int SPARSE_SHIFT;
    private static final int getHighSpeedVideoFpsRangesFor;
    private static final long getHighSpeedVideoSizes;
    protected final E[] buffer;
    protected final long mask;

    static {
        int intValue = java.lang.Integer.getInteger("sparse.shift", 0).intValue();
        SPARSE_SHIFT = intValue;
        int arrayIndexScale = rx.internal.util.unsafe.UnsafeAccess.UNSAFE.arrayIndexScale(java.lang.Object[].class);
        if (4 == arrayIndexScale) {
            getHighSpeedVideoFpsRangesFor = intValue + 2;
        } else if (8 == arrayIndexScale) {
            getHighSpeedVideoFpsRangesFor = intValue + 3;
        } else {
            throw new java.lang.IllegalStateException("Unknown pointer size");
        }
        getHighSpeedVideoSizes = rx.internal.util.unsafe.UnsafeAccess.UNSAFE.arrayBaseOffset(java.lang.Object[].class) + (32 << (getHighSpeedVideoFpsRangesFor - intValue));
    }

    public ConcurrentCircularArrayQueue(int i) {
        int roundToPowerOfTwo = rx.internal.util.unsafe.Pow2.roundToPowerOfTwo(i);
        this.mask = roundToPowerOfTwo - 1;
        this.buffer = (E[]) new java.lang.Object[(roundToPowerOfTwo << SPARSE_SHIFT) + 64];
    }

    protected final long calcElementOffset(long j) {
        return calcElementOffset(j, this.mask);
    }

    protected final long calcElementOffset(long j, long j2) {
        return getHighSpeedVideoSizes + ((j & j2) << getHighSpeedVideoFpsRangesFor);
    }

    protected final void spElement(long j, E e) {
        spElement(this.buffer, j, e);
    }

    protected final void spElement(E[] eArr, long j, E e) {
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putObject(eArr, j, e);
    }

    protected final void soElement(long j, E e) {
        soElement(this.buffer, j, e);
    }

    protected final void soElement(E[] eArr, long j, E e) {
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedObject(eArr, j, e);
    }

    protected final E lpElement(long j) {
        return lpElement(this.buffer, j);
    }

    protected final E lpElement(E[] eArr, long j) {
        return (E) rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getObject(eArr, j);
    }

    protected final E lvElement(long j) {
        return lvElement(this.buffer, j);
    }

    protected final E lvElement(E[] eArr, long j) {
        return (E) rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getObjectVolatile(eArr, j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }
}

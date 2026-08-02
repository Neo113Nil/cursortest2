package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
public abstract class ConcurrentSequencedCircularArrayQueue<E> extends rx.internal.util.unsafe.ConcurrentCircularArrayQueue<E> {
    private static final int getHighResolutionOutputSizeshNQ4ISI;
    private static final long getHighSpeedVideoFpsRangesFor;
    protected final long[] sequenceBuffer;

    static {
        if (8 == rx.internal.util.unsafe.UnsafeAccess.UNSAFE.arrayIndexScale(long[].class)) {
            getHighResolutionOutputSizeshNQ4ISI = SPARSE_SHIFT + 3;
            getHighSpeedVideoFpsRangesFor = rx.internal.util.unsafe.UnsafeAccess.UNSAFE.arrayBaseOffset(long[].class) + (32 << (r0 - SPARSE_SHIFT));
            return;
        }
        throw new java.lang.IllegalStateException("Unexpected long[] element size");
    }

    public ConcurrentSequencedCircularArrayQueue(int i) {
        super(i);
        int i2 = (int) (this.mask + 1);
        this.sequenceBuffer = new long[(i2 << SPARSE_SHIFT) + 64];
        for (long j = 0; j < i2; j++) {
            soSequence(this.sequenceBuffer, calcSequenceOffset(j), j);
        }
    }

    protected final long calcSequenceOffset(long j) {
        return getHighSpeedVideoFpsRangesFor + ((j & this.mask) << getHighResolutionOutputSizeshNQ4ISI);
    }

    protected final void soSequence(long[] jArr, long j, long j2) {
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedLong(jArr, j, j2);
    }

    protected final long lvSequence(long[] jArr, long j) {
        return rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getLongVolatile(jArr, j);
    }
}

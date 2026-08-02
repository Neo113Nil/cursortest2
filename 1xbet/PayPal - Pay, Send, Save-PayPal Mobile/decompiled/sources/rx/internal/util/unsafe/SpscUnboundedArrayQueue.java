package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
public class SpscUnboundedArrayQueue<E> extends rx.internal.util.unsafe.SpscUnboundedArrayQueueConsumerField<E> implements rx.internal.util.unsafe.QueueProgressIndicators {
    private static final long Camera2StreamConfigurationMap;
    private static final long getHighSpeedVideoFpsRanges;
    private static final long getHighSpeedVideoFpsRangesFor;
    private static final int getInputSizeshNQ4ISI;
    static final int getHighResolutionOutputSizeshNQ4ISI = java.lang.Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();

    static {
        int arrayIndexScale = rx.internal.util.unsafe.UnsafeAccess.UNSAFE.arrayIndexScale(java.lang.Object[].class);
        if (4 == arrayIndexScale) {
            getInputSizeshNQ4ISI = 2;
        } else if (8 == arrayIndexScale) {
            getInputSizeshNQ4ISI = 3;
        } else {
            throw new java.lang.IllegalStateException("Unknown pointer size");
        }
        Camera2StreamConfigurationMap = rx.internal.util.unsafe.UnsafeAccess.UNSAFE.arrayBaseOffset(java.lang.Object[].class);
        try {
            getHighSpeedVideoFpsRanges = rx.internal.util.unsafe.UnsafeAccess.UNSAFE.objectFieldOffset(rx.internal.util.unsafe.SpscUnboundedArrayQueueProducerFields.class.getDeclaredField("producerIndex"));
            try {
                getHighSpeedVideoFpsRangesFor = rx.internal.util.unsafe.UnsafeAccess.UNSAFE.objectFieldOffset(rx.internal.util.unsafe.SpscUnboundedArrayQueueConsumerField.class.getDeclaredField("consumerIndex"));
            } catch (java.lang.NoSuchFieldException e) {
                java.lang.InternalError internalError = new java.lang.InternalError();
                internalError.initCause(e);
                throw internalError;
            }
        } catch (java.lang.NoSuchFieldException e2) {
            java.lang.InternalError internalError2 = new java.lang.InternalError();
            internalError2.initCause(e2);
            throw internalError2;
        }
    }

    public SpscUnboundedArrayQueue(int i) {
        int roundToPowerOfTwo = rx.internal.util.unsafe.Pow2.roundToPowerOfTwo(i);
        long j = roundToPowerOfTwo - 1;
        E[] eArr = (E[]) new java.lang.Object[roundToPowerOfTwo + 1];
        this.producerBuffer = eArr;
        this.producerMask = j;
        this.producerLookAheadStep = java.lang.Math.min(roundToPowerOfTwo / 4, getHighResolutionOutputSizeshNQ4ISI);
        this.consumerBuffer = eArr;
        this.consumerMask = j;
        this.producerLookAhead = j - 1;
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedLong(this, getHighSpeedVideoFpsRanges, 0L);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(E e) {
        if (e == null) {
            throw new java.lang.NullPointerException("Null is not a valid element");
        }
        E[] eArr = this.producerBuffer;
        long j = this.producerIndex;
        long j2 = this.producerMask;
        long j3 = Camera2StreamConfigurationMap;
        int i = getInputSizeshNQ4ISI;
        long j4 = ((j & j2) << i) + j3;
        if (j < this.producerLookAhead) {
            return getHighResolutionOutputSizeshNQ4ISI(eArr, e, j, j4);
        }
        long j5 = this.producerLookAheadStep + j;
        if (rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getObjectVolatile(eArr, ((j5 & j2) << i) + j3) == null) {
            this.producerLookAhead = j5 - 1;
            return getHighResolutionOutputSizeshNQ4ISI(eArr, e, j, j4);
        }
        long j6 = j + 1;
        if (rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getObjectVolatile(eArr, j3 + ((j6 & j2) << i)) != null) {
            return getHighResolutionOutputSizeshNQ4ISI(eArr, e, j, j4);
        }
        E[] eArr2 = (E[]) new java.lang.Object[eArr.length];
        this.producerBuffer = eArr2;
        this.producerLookAhead = (j2 + j) - 1;
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedObject(eArr2, j4, e);
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedObject(eArr, j3 + ((eArr.length - 1) << i), eArr2);
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedObject(eArr, j4, getHighSpeedVideoSizes);
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedLong(this, getHighSpeedVideoFpsRanges, j6);
        return true;
    }

    @Override // java.util.Queue
    public final E poll() {
        E[] eArr = this.consumerBuffer;
        long j = this.consumerIndex;
        long j2 = this.consumerMask & j;
        long j3 = Camera2StreamConfigurationMap;
        int i = getInputSizeshNQ4ISI;
        long j4 = (j2 << i) + j3;
        E e = (E) rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getObjectVolatile(eArr, j4);
        boolean z = e == getHighSpeedVideoSizes;
        if (e != null && !z) {
            rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedObject(eArr, j4, (java.lang.Object) null);
            rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedLong(this, getHighSpeedVideoFpsRangesFor, j + 1);
            return e;
        }
        if (!z) {
            return null;
        }
        E[] eArr2 = (E[]) ((java.lang.Object[]) rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getObjectVolatile(eArr, ((eArr.length - 1) << i) + j3));
        this.consumerBuffer = eArr2;
        long j5 = j3 + (j2 << i);
        E e2 = (E) rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getObjectVolatile(eArr2, j5);
        if (e2 == null) {
            return null;
        }
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedObject(eArr2, j5, (java.lang.Object) null);
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedLong(this, getHighSpeedVideoFpsRangesFor, j + 1);
        return e2;
    }

    @Override // java.util.Queue
    public final E peek() {
        E[] eArr = this.consumerBuffer;
        long j = this.consumerIndex & this.consumerMask;
        long j2 = Camera2StreamConfigurationMap;
        int i = getInputSizeshNQ4ISI;
        E e = (E) rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getObjectVolatile(eArr, (j << i) + j2);
        if (e != getHighSpeedVideoSizes) {
            return e;
        }
        E[] eArr2 = (E[]) ((java.lang.Object[]) rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getObjectVolatile(eArr, ((eArr.length - 1) << i) + j2));
        this.consumerBuffer = eArr2;
        return (E) rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getObjectVolatile(eArr2, j2 + (j << i));
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(E[] eArr, E e, long j, long j2) {
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedObject(eArr, j2, e);
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedLong(this, getHighSpeedVideoFpsRanges, j + 1);
        return true;
    }

    @Override // rx.internal.util.unsafe.QueueProgressIndicators
    public long currentConsumerIndex() {
        return rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getLongVolatile(this, getHighSpeedVideoFpsRangesFor);
    }

    @Override // rx.internal.util.unsafe.QueueProgressIndicators
    public long currentProducerIndex() {
        return rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getLongVolatile(this, getHighSpeedVideoFpsRanges);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        long longVolatile = rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getLongVolatile(this, getHighSpeedVideoFpsRangesFor);
        while (true) {
            long longVolatile2 = rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getLongVolatile(this, getHighSpeedVideoFpsRanges);
            long longVolatile3 = rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getLongVolatile(this, getHighSpeedVideoFpsRangesFor);
            if (longVolatile == longVolatile3) {
                return (int) (longVolatile2 - longVolatile3);
            }
            longVolatile = longVolatile3;
        }
    }
}

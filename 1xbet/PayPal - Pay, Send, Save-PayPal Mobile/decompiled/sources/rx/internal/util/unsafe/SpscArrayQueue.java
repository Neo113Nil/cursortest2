package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
public final class SpscArrayQueue<E> extends rx.internal.util.unsafe.SpscArrayQueueL3Pad<E> {
    public SpscArrayQueue(int i) {
        super(i);
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.MessagePassingQueue
    public final boolean offer(E e) {
        if (e == null) {
            throw new java.lang.NullPointerException("null elements not allowed");
        }
        E[] eArr = this.buffer;
        long j = this.producerIndex;
        long calcElementOffset = calcElementOffset(j);
        if (lvElement(eArr, calcElementOffset) != null) {
            return false;
        }
        soElement(eArr, calcElementOffset, e);
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j + 1);
        return true;
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.MessagePassingQueue
    public final E poll() {
        long j = this.consumerIndex;
        long calcElementOffset = calcElementOffset(j);
        E[] eArr = this.buffer;
        E lvElement = lvElement(eArr, calcElementOffset);
        if (lvElement == null) {
            return null;
        }
        soElement(eArr, calcElementOffset, null);
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, j + 1);
        return lvElement;
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.MessagePassingQueue
    public final E peek() {
        return lvElement(calcElementOffset(this.consumerIndex));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.MessagePassingQueue
    public final boolean isEmpty() {
        return rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getLongVolatile(this, P_INDEX_OFFSET) == rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getLongVolatile(this, C_INDEX_OFFSET);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.MessagePassingQueue
    public final int size() {
        long longVolatile = rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getLongVolatile(this, C_INDEX_OFFSET);
        while (true) {
            long longVolatile2 = rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getLongVolatile(this, P_INDEX_OFFSET);
            long longVolatile3 = rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getLongVolatile(this, C_INDEX_OFFSET);
            if (longVolatile == longVolatile3) {
                return (int) (longVolatile2 - longVolatile3);
            }
            longVolatile = longVolatile3;
        }
    }
}

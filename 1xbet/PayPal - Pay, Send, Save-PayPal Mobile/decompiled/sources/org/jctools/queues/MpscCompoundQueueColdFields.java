package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class MpscCompoundQueueColdFields<E> extends org.jctools.queues.MpscCompoundQueueL0Pad<E> {
    protected final int parallelQueues;
    protected final int parallelQueuesMask;
    protected final org.jctools.queues.MpscArrayQueue<E>[] queues;

    MpscCompoundQueueColdFields(int i, int i2) {
        i2 = org.jctools.util.Pow2.isPowerOfTwo(i2) ? i2 : org.jctools.util.Pow2.roundToPowerOfTwo(i2) / 2;
        this.parallelQueues = i2;
        this.parallelQueuesMask = i2 - 1;
        this.queues = new org.jctools.queues.MpscArrayQueue[i2];
        int roundToPowerOfTwo = org.jctools.util.Pow2.roundToPowerOfTwo(i);
        org.jctools.util.RangeUtil.checkGreaterThanOrEqual(roundToPowerOfTwo, i2, "fullCapacity");
        for (int i3 = 0; i3 < this.parallelQueues; i3++) {
            this.queues[i3] = new org.jctools.queues.MpscArrayQueue<>(roundToPowerOfTwo / this.parallelQueues);
        }
    }
}

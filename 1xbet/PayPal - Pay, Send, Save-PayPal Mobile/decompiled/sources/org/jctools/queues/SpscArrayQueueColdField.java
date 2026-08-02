package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class SpscArrayQueueColdField<E> extends org.jctools.queues.ConcurrentCircularArrayQueue<E> {
    public static final int MAX_LOOK_AHEAD_STEP = java.lang.Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    final int lookAheadStep;

    SpscArrayQueueColdField(int i) {
        super(i);
        this.lookAheadStep = java.lang.Math.min(capacity() / 4, MAX_LOOK_AHEAD_STEP);
    }
}

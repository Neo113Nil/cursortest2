package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class SpscAtomicArrayQueueColdField<E> extends org.jctools.queues.atomic.AtomicReferenceArrayQueue<E> {
    public static final int MAX_LOOK_AHEAD_STEP = java.lang.Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    final int lookAheadStep;

    SpscAtomicArrayQueueColdField(int i) {
        super(i);
        this.lookAheadStep = java.lang.Math.min(capacity() / 4, MAX_LOOK_AHEAD_STEP);
    }
}

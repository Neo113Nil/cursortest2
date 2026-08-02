package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
public class AtomicQueueFactory {
    public static <E> java.util.Queue<E> newQueue(org.jctools.queues.spec.ConcurrentQueueSpec concurrentQueueSpec) {
        if (concurrentQueueSpec.isBounded()) {
            if (concurrentQueueSpec.isSpsc()) {
                return new org.jctools.queues.atomic.SpscAtomicArrayQueue(concurrentQueueSpec.capacity);
            }
            if (concurrentQueueSpec.isMpsc()) {
                return new org.jctools.queues.atomic.MpscAtomicArrayQueue(concurrentQueueSpec.capacity);
            }
            if (concurrentQueueSpec.isSpmc()) {
                return new org.jctools.queues.atomic.SpmcAtomicArrayQueue(concurrentQueueSpec.capacity);
            }
            return new org.jctools.queues.atomic.MpmcAtomicArrayQueue(concurrentQueueSpec.capacity);
        }
        if (concurrentQueueSpec.isSpsc()) {
            return new org.jctools.queues.atomic.SpscLinkedAtomicQueue();
        }
        if (concurrentQueueSpec.isMpsc()) {
            return new org.jctools.queues.atomic.MpscLinkedAtomicQueue();
        }
        return new java.util.concurrent.ConcurrentLinkedQueue();
    }
}

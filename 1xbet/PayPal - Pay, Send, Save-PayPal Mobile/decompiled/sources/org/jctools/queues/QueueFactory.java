package org.jctools.queues;

@java.lang.Deprecated
/* loaded from: classes18.dex */
public class QueueFactory {
    public static <E> java.util.Queue<E> newQueue(org.jctools.queues.spec.ConcurrentQueueSpec concurrentQueueSpec) {
        if (concurrentQueueSpec.isBounded()) {
            if (concurrentQueueSpec.isSpsc()) {
                return new org.jctools.queues.SpscArrayQueue(concurrentQueueSpec.capacity);
            }
            if (concurrentQueueSpec.isMpsc()) {
                if (concurrentQueueSpec.ordering != org.jctools.queues.spec.Ordering.NONE) {
                    return new org.jctools.queues.MpscArrayQueue(concurrentQueueSpec.capacity);
                }
                return new org.jctools.queues.MpscCompoundQueue(concurrentQueueSpec.capacity);
            }
            if (concurrentQueueSpec.isSpmc()) {
                return new org.jctools.queues.SpmcArrayQueue(concurrentQueueSpec.capacity);
            }
            return new org.jctools.queues.MpmcArrayQueue(concurrentQueueSpec.capacity);
        }
        if (concurrentQueueSpec.isSpsc()) {
            return new org.jctools.queues.SpscLinkedQueue();
        }
        if (concurrentQueueSpec.isMpsc()) {
            return new org.jctools.queues.MpscLinkedQueue();
        }
        return new java.util.concurrent.ConcurrentLinkedQueue();
    }
}

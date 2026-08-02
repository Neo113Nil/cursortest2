package org.jctools.queues;

/* loaded from: classes5.dex */
public final class MessagePassingQueueUtil {
    public static <E> int drain(org.jctools.queues.MessagePassingQueue<E> messagePassingQueue, org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, int i) {
        if (consumer == null) {
            throw new java.lang.IllegalArgumentException("c is null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("limit is negative: ".concat(java.lang.String.valueOf(i)));
        }
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        while (i2 < i) {
            E relaxedPoll = messagePassingQueue.relaxedPoll();
            if (relaxedPoll == null) {
                break;
            }
            consumer.accept(relaxedPoll);
            i2++;
        }
        return i2;
    }

    public static <E> int drain(org.jctools.queues.MessagePassingQueue<E> messagePassingQueue, org.jctools.queues.MessagePassingQueue.Consumer<E> consumer) {
        if (consumer == null) {
            throw new java.lang.IllegalArgumentException("c is null");
        }
        int i = 0;
        while (true) {
            E relaxedPoll = messagePassingQueue.relaxedPoll();
            if (relaxedPoll == null) {
                return i;
            }
            i++;
            consumer.accept(relaxedPoll);
        }
    }

    public static <E> void drain(org.jctools.queues.MessagePassingQueue<E> messagePassingQueue, org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        E relaxedPoll;
        if (consumer == null) {
            throw new java.lang.IllegalArgumentException("c is null");
        }
        if (waitStrategy == null) {
            throw new java.lang.IllegalArgumentException("wait is null");
        }
        if (exitCondition == null) {
            throw new java.lang.IllegalArgumentException("exit condition is null");
        }
        while (true) {
            while (exitCondition.keepRunning()) {
                relaxedPoll = messagePassingQueue.relaxedPoll();
                int idle = relaxedPoll == null ? waitStrategy.idle(idle) : 0;
            }
            return;
            consumer.accept(relaxedPoll);
        }
    }

    public static <E> void fill(org.jctools.queues.MessagePassingQueue<E> messagePassingQueue, org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        if (waitStrategy == null) {
            throw new java.lang.IllegalArgumentException("waiter is null");
        }
        if (exitCondition == null) {
            throw new java.lang.IllegalArgumentException("exit condition is null");
        }
        while (true) {
            while (exitCondition.keepRunning()) {
                int idle = messagePassingQueue.fill(supplier, org.jctools.util.PortableJvmInfo.RECOMENDED_OFFER_BATCH) == 0 ? waitStrategy.idle(idle) : 0;
            }
            return;
        }
    }

    public static <E> int fillBounded(org.jctools.queues.MessagePassingQueue<E> messagePassingQueue, org.jctools.queues.MessagePassingQueue.Supplier<E> supplier) {
        return fillInBatchesToLimit(messagePassingQueue, supplier, org.jctools.util.PortableJvmInfo.RECOMENDED_OFFER_BATCH, messagePassingQueue.capacity());
    }

    public static <E> int fillInBatchesToLimit(org.jctools.queues.MessagePassingQueue<E> messagePassingQueue, org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, int i, int i2) {
        long j = 0;
        do {
            int fill = messagePassingQueue.fill(supplier, i);
            if (fill == 0) {
                return (int) j;
            }
            j += fill;
        } while (j <= i2);
        return (int) j;
    }

    public static <E> int fillUnbounded(org.jctools.queues.MessagePassingQueue<E> messagePassingQueue, org.jctools.queues.MessagePassingQueue.Supplier<E> supplier) {
        return fillInBatchesToLimit(messagePassingQueue, supplier, org.jctools.util.PortableJvmInfo.RECOMENDED_OFFER_BATCH, 4096);
    }
}

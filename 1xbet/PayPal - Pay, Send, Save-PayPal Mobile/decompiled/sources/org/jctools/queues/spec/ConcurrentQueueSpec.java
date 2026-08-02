package org.jctools.queues.spec;

@java.lang.Deprecated
/* loaded from: classes18.dex */
public final class ConcurrentQueueSpec {
    public final int capacity;
    public final int consumers;
    public final org.jctools.queues.spec.Ordering ordering;
    public final org.jctools.queues.spec.Preference preference;
    public final int producers;

    public static org.jctools.queues.spec.ConcurrentQueueSpec createBoundedSpsc(int i) {
        return new org.jctools.queues.spec.ConcurrentQueueSpec(1, 1, i, org.jctools.queues.spec.Ordering.FIFO, org.jctools.queues.spec.Preference.NONE);
    }

    public static org.jctools.queues.spec.ConcurrentQueueSpec createBoundedMpsc(int i) {
        return new org.jctools.queues.spec.ConcurrentQueueSpec(0, 1, i, org.jctools.queues.spec.Ordering.FIFO, org.jctools.queues.spec.Preference.NONE);
    }

    public static org.jctools.queues.spec.ConcurrentQueueSpec createBoundedSpmc(int i) {
        return new org.jctools.queues.spec.ConcurrentQueueSpec(1, 0, i, org.jctools.queues.spec.Ordering.FIFO, org.jctools.queues.spec.Preference.NONE);
    }

    public static org.jctools.queues.spec.ConcurrentQueueSpec createBoundedMpmc(int i) {
        return new org.jctools.queues.spec.ConcurrentQueueSpec(0, 0, i, org.jctools.queues.spec.Ordering.FIFO, org.jctools.queues.spec.Preference.NONE);
    }

    public ConcurrentQueueSpec(int i, int i2, int i3, org.jctools.queues.spec.Ordering ordering, org.jctools.queues.spec.Preference preference) {
        this.producers = i;
        this.consumers = i2;
        this.capacity = i3 <= 0 ? -1 : i3;
        this.ordering = ordering;
        this.preference = preference;
    }

    public final boolean isSpsc() {
        return this.consumers == 1 && this.producers == 1;
    }

    public final boolean isMpsc() {
        return this.consumers == 1 && this.producers != 1;
    }

    public final boolean isSpmc() {
        return this.consumers != 1 && this.producers == 1;
    }

    public final boolean isMpmc() {
        return (this.consumers == 1 || this.producers == 1) ? false : true;
    }

    public final boolean isBounded() {
        return this.capacity != -1;
    }
}

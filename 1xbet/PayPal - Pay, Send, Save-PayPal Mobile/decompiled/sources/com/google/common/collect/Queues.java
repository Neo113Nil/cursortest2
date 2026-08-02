package com.google.common.collect;

/* loaded from: classes9.dex */
public final class Queues {
    private Queues() {
    }

    public static <E> java.util.concurrent.ArrayBlockingQueue<E> newArrayBlockingQueue(int i) {
        return new java.util.concurrent.ArrayBlockingQueue<>(i);
    }

    public static <E> java.util.ArrayDeque<E> newArrayDeque() {
        return new java.util.ArrayDeque<>();
    }

    public static <E> java.util.ArrayDeque<E> newArrayDeque(java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return new java.util.ArrayDeque<>((java.util.Collection) iterable);
        }
        java.util.ArrayDeque<E> arrayDeque = new java.util.ArrayDeque<>();
        com.google.common.collect.Iterables.addAll(arrayDeque, iterable);
        return arrayDeque;
    }

    public static <E> java.util.concurrent.ConcurrentLinkedQueue<E> newConcurrentLinkedQueue() {
        return new java.util.concurrent.ConcurrentLinkedQueue<>();
    }

    public static <E> java.util.concurrent.ConcurrentLinkedQueue<E> newConcurrentLinkedQueue(java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return new java.util.concurrent.ConcurrentLinkedQueue<>((java.util.Collection) iterable);
        }
        java.util.concurrent.ConcurrentLinkedQueue<E> concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue<>();
        com.google.common.collect.Iterables.addAll(concurrentLinkedQueue, iterable);
        return concurrentLinkedQueue;
    }

    public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque() {
        return new java.util.concurrent.LinkedBlockingDeque<>();
    }

    public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque(int i) {
        return new java.util.concurrent.LinkedBlockingDeque<>(i);
    }

    public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque(java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return new java.util.concurrent.LinkedBlockingDeque<>((java.util.Collection) iterable);
        }
        java.util.concurrent.LinkedBlockingDeque<E> linkedBlockingDeque = new java.util.concurrent.LinkedBlockingDeque<>();
        com.google.common.collect.Iterables.addAll(linkedBlockingDeque, iterable);
        return linkedBlockingDeque;
    }

    public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue() {
        return new java.util.concurrent.LinkedBlockingQueue<>();
    }

    public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue(int i) {
        return new java.util.concurrent.LinkedBlockingQueue<>(i);
    }

    public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue(java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return new java.util.concurrent.LinkedBlockingQueue<>((java.util.Collection) iterable);
        }
        java.util.concurrent.LinkedBlockingQueue<E> linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue<>();
        com.google.common.collect.Iterables.addAll(linkedBlockingQueue, iterable);
        return linkedBlockingQueue;
    }

    public static <E extends java.lang.Comparable> java.util.concurrent.PriorityBlockingQueue<E> newPriorityBlockingQueue() {
        return new java.util.concurrent.PriorityBlockingQueue<>();
    }

    public static <E extends java.lang.Comparable> java.util.concurrent.PriorityBlockingQueue<E> newPriorityBlockingQueue(java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return new java.util.concurrent.PriorityBlockingQueue<>((java.util.Collection) iterable);
        }
        java.util.concurrent.PriorityBlockingQueue<E> priorityBlockingQueue = new java.util.concurrent.PriorityBlockingQueue<>();
        com.google.common.collect.Iterables.addAll(priorityBlockingQueue, iterable);
        return priorityBlockingQueue;
    }

    public static <E extends java.lang.Comparable> java.util.PriorityQueue<E> newPriorityQueue() {
        return new java.util.PriorityQueue<>();
    }

    public static <E extends java.lang.Comparable> java.util.PriorityQueue<E> newPriorityQueue(java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return new java.util.PriorityQueue<>((java.util.Collection) iterable);
        }
        java.util.PriorityQueue<E> priorityQueue = new java.util.PriorityQueue<>();
        com.google.common.collect.Iterables.addAll(priorityQueue, iterable);
        return priorityQueue;
    }

    public static <E> java.util.concurrent.SynchronousQueue<E> newSynchronousQueue() {
        return new java.util.concurrent.SynchronousQueue<>();
    }

    public static <E> int drain(java.util.concurrent.BlockingQueue<E> blockingQueue, java.util.Collection<? super E> collection, int i, java.time.Duration duration) throws java.lang.InterruptedException {
        return drain(blockingQueue, collection, i, duration.toNanos(), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static <E> int drain(java.util.concurrent.BlockingQueue<E> blockingQueue, java.util.Collection<? super E> collection, int i, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        com.google.common.base.Preconditions.checkNotNull(collection);
        long nanoTime = java.lang.System.nanoTime();
        long nanos = timeUnit.toNanos(j);
        int i2 = 0;
        while (i2 < i) {
            i2 += blockingQueue.drainTo(collection, i - i2);
            if (i2 < i) {
                E poll = blockingQueue.poll((nanoTime + nanos) - java.lang.System.nanoTime(), java.util.concurrent.TimeUnit.NANOSECONDS);
                if (poll == null) {
                    return i2;
                }
                collection.add(poll);
                i2++;
            }
        }
        return i2;
    }

    public static <E> int drainUninterruptibly(java.util.concurrent.BlockingQueue<E> blockingQueue, java.util.Collection<? super E> collection, int i, java.time.Duration duration) {
        return drainUninterruptibly(blockingQueue, collection, i, duration.toNanos(), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static <E> int drainUninterruptibly(java.util.concurrent.BlockingQueue<E> blockingQueue, java.util.Collection<? super E> collection, int i, long j, java.util.concurrent.TimeUnit timeUnit) {
        E poll;
        com.google.common.base.Preconditions.checkNotNull(collection);
        long nanoTime = java.lang.System.nanoTime();
        long nanos = timeUnit.toNanos(j);
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            try {
                i2 += blockingQueue.drainTo(collection, i - i2);
                if (i2 < i) {
                    while (true) {
                        try {
                            poll = blockingQueue.poll((nanoTime + nanos) - java.lang.System.nanoTime(), java.util.concurrent.TimeUnit.NANOSECONDS);
                            break;
                        } catch (java.lang.InterruptedException unused) {
                            z = true;
                        }
                    }
                    if (poll == null) {
                        break;
                    }
                    collection.add(poll);
                    i2++;
                }
            } finally {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
        return i2;
    }

    public static <E> java.util.Queue<E> synchronizedQueue(java.util.Queue<E> queue) {
        return com.google.common.collect.Synchronized.queue(queue, null);
    }

    public static <E> java.util.Deque<E> synchronizedDeque(java.util.Deque<E> deque) {
        return com.google.common.collect.Synchronized.deque(deque, null);
    }
}

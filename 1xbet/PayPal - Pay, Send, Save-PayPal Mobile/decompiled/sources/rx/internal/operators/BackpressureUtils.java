package rx.internal.operators;

/* loaded from: classes18.dex */
public final class BackpressureUtils {
    public static long addCap(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    private BackpressureUtils() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static long getAndAddRequest(java.util.concurrent.atomic.AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, addCap(j2, j)));
        return j2;
    }

    public static long multiplyCap(long j, long j2) {
        long j3 = j * j2;
        if (((j | j2) >>> 31) == 0 || j2 == 0 || j3 / j2 == j) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public static <T> void postCompleteDone(java.util.concurrent.atomic.AtomicLong atomicLong, java.util.Queue<T> queue, rx.Subscriber<? super T> subscriber) {
        postCompleteDone(atomicLong, queue, subscriber, rx.internal.util.UtilityFunctions.identity());
    }

    public static <T> boolean postCompleteRequest(java.util.concurrent.atomic.AtomicLong atomicLong, long j, java.util.Queue<T> queue, rx.Subscriber<? super T> subscriber) {
        return postCompleteRequest(atomicLong, j, queue, subscriber, rx.internal.util.UtilityFunctions.identity());
    }

    public static <T, R> void postCompleteDone(java.util.concurrent.atomic.AtomicLong atomicLong, java.util.Queue<T> queue, rx.Subscriber<? super R> subscriber, rx.functions.Func1<? super T, ? extends R> func1) {
        long j;
        do {
            j = atomicLong.get();
            if ((j & Long.MIN_VALUE) != 0) {
                return;
            }
        } while (!atomicLong.compareAndSet(j, Long.MIN_VALUE | j));
        if (j != 0) {
            getHighSpeedVideoFpsRangesFor(atomicLong, queue, subscriber, func1);
        }
    }

    public static <T, R> boolean postCompleteRequest(java.util.concurrent.atomic.AtomicLong atomicLong, long j, java.util.Queue<T> queue, rx.Subscriber<? super R> subscriber, rx.functions.Func1<? super T, ? extends R> func1) {
        long j2;
        long j3;
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
        }
        if (j == 0) {
            return (atomicLong.get() & Long.MIN_VALUE) == 0;
        }
        do {
            j2 = atomicLong.get();
            j3 = j2 & Long.MIN_VALUE;
        } while (!atomicLong.compareAndSet(j2, addCap(Long.MAX_VALUE & j2, j) | j3));
        if (j2 != Long.MIN_VALUE) {
            return j3 == 0;
        }
        getHighSpeedVideoFpsRangesFor(atomicLong, queue, subscriber, func1);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        r0 = r10.addAndGet(-(r6 & Long.MAX_VALUE));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static <T, R> void getHighSpeedVideoFpsRangesFor(java.util.concurrent.atomic.AtomicLong atomicLong, java.util.Queue<T> queue, rx.Subscriber<? super R> subscriber, rx.functions.Func1<? super T, ? extends R> func1) {
        long j = atomicLong.get();
        if (j == Long.MAX_VALUE) {
            while (!subscriber.isUnsubscribed()) {
                java.lang.Object poll = queue.poll();
                if (poll == null) {
                    subscriber.onCompleted();
                    return;
                }
                subscriber.onNext(func1.call(poll));
            }
            return;
        }
        do {
            long j2 = Long.MIN_VALUE;
            while (true) {
                if (j2 != j) {
                    if (subscriber.isUnsubscribed()) {
                        return;
                    }
                    java.lang.Object poll2 = queue.poll();
                    if (poll2 == null) {
                        subscriber.onCompleted();
                        return;
                    } else {
                        subscriber.onNext(func1.call(poll2));
                        j2++;
                    }
                } else {
                    if (j2 == j) {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        if (queue.isEmpty()) {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                    j = atomicLong.get();
                    if (j == j2) {
                        break;
                    }
                }
            }
        } while (j != Long.MIN_VALUE);
    }

    public static long produced(java.util.concurrent.atomic.AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                throw new java.lang.IllegalStateException("More produced than requested: ".concat(java.lang.String.valueOf(j3)));
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }

    public static boolean validate(long j) {
        if (j >= 0) {
            return j != 0;
        }
        throw new java.lang.IllegalArgumentException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
    }
}

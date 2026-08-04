package io.sentry.transport;

import W5.AbstractC0486a1;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* JADX INFO: loaded from: classes2.dex */
public final class ReusableCountLatch {
    private final Sync sync;

    public static final class Sync extends AbstractQueuedSynchronizer {
        private static final long serialVersionUID = 5970133580157457018L;

        public Sync(int i7) {
            setState(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void decrement() {
            releaseShared(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getCount() {
            return getState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void increment() {
            int state;
            do {
                state = getState();
            } while (!compareAndSetState(state, state + 1));
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public int tryAcquireShared(int i7) {
            return getState() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryReleaseShared(int i7) {
            int state;
            int i8;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i8 = state - 1;
            } while (!compareAndSetState(state, i8));
            return i8 == 0;
        }
    }

    public ReusableCountLatch(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0486a1.f(i7, "negative initial count '", "' is not allowed"));
        }
        this.sync = new Sync(i7);
    }

    public void decrement() {
        this.sync.decrement();
    }

    public int getCount() {
        return this.sync.getCount();
    }

    public void increment() {
        this.sync.increment();
    }

    public void waitTillZero() throws InterruptedException {
        this.sync.acquireSharedInterruptibly(1);
    }

    public boolean waitTillZero(long j, TimeUnit timeUnit) {
        return this.sync.tryAcquireSharedNanos(1, timeUnit.toNanos(j));
    }

    public ReusableCountLatch() {
        this(0);
    }
}

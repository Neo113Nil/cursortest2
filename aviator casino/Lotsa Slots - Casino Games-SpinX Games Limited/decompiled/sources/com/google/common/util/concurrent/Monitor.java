package com.google.common.util.concurrent;

@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class Monitor {

    @javax.annotation.CheckForNull
    private com.google.common.util.concurrent.Monitor.Guard activeGuards;
    private final boolean fair;
    private final java.util.concurrent.locks.ReentrantLock lock;

    public static abstract class Guard {
        final java.util.concurrent.locks.Condition condition;
        final com.google.common.util.concurrent.Monitor monitor;

        @javax.annotation.CheckForNull
        com.google.common.util.concurrent.Monitor.Guard next;
        int waiterCount = 0;

        public abstract boolean isSatisfied();

        protected Guard(com.google.common.util.concurrent.Monitor monitor) {
            this.monitor = (com.google.common.util.concurrent.Monitor) com.google.common.base.Preconditions.checkNotNull(monitor, "monitor");
            this.condition = monitor.lock.newCondition();
        }
    }

    public Monitor() {
        this(false);
    }

    public Monitor(boolean fair) {
        this.activeGuards = null;
        this.fair = fair;
        this.lock = new java.util.concurrent.locks.ReentrantLock(fair);
    }

    public void enter() {
        this.lock.lock();
    }

    public boolean enter(long time, java.util.concurrent.TimeUnit unit) {
        boolean tryLock;
        long safeNanos = toSafeNanos(time, unit);
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        boolean z = true;
        if (!this.fair && reentrantLock.tryLock()) {
            return true;
        }
        boolean interrupted = java.lang.Thread.interrupted();
        try {
            long nanoTime = java.lang.System.nanoTime();
            long j = safeNanos;
            while (true) {
                try {
                    try {
                        tryLock = reentrantLock.tryLock(j, java.util.concurrent.TimeUnit.NANOSECONDS);
                        break;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (z) {
                            java.lang.Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (java.lang.InterruptedException unused) {
                    j = remainingNanos(nanoTime, safeNanos);
                    interrupted = true;
                }
            }
            if (interrupted) {
                java.lang.Thread.currentThread().interrupt();
            }
            return tryLock;
        } catch (java.lang.Throwable th2) {
            th = th2;
            z = interrupted;
        }
    }

    public void enterInterruptibly() throws java.lang.InterruptedException {
        this.lock.lockInterruptibly();
    }

    public boolean enterInterruptibly(long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        return this.lock.tryLock(time, unit);
    }

    public boolean tryEnter() {
        return this.lock.tryLock();
    }

    public void enterWhen(com.google.common.util.concurrent.Monitor.Guard guard) throws java.lang.InterruptedException {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lockInterruptibly();
        try {
            if (guard.isSatisfied()) {
                return;
            }
            await(guard, isHeldByCurrentThread);
        } catch (java.lang.Throwable th) {
            leave();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (awaitNanos(r11, r0, r3) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean enterWhen(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        long initNanoTime;
        long safeNanos = toSafeNanos(time, unit);
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        boolean z = false;
        try {
            if (!this.fair) {
                if (java.lang.Thread.interrupted()) {
                    throw new java.lang.InterruptedException();
                }
                if (reentrantLock.tryLock()) {
                    initNanoTime = 0;
                    if (!guard.isSatisfied()) {
                        if (initNanoTime != 0) {
                            safeNanos = remainingNanos(initNanoTime, safeNanos);
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                    return z;
                }
            }
            if (!guard.isSatisfied()) {
            }
            z = true;
            if (!z) {
            }
            return z;
        } catch (java.lang.Throwable th) {
            if (!isHeldByCurrentThread) {
                try {
                    signalNextWaiter();
                } finally {
                    reentrantLock.unlock();
                }
            }
            throw th;
        }
        initNanoTime = initNanoTime(safeNanos);
        if (!reentrantLock.tryLock(time, unit)) {
            return false;
        }
    }

    public void enterWhenUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard) {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lock();
        try {
            if (guard.isSatisfied()) {
                return;
            }
            awaitUninterruptibly(guard, isHeldByCurrentThread);
        } catch (java.lang.Throwable th) {
            leave();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[Catch: all -> 0x0073, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0073, blocks: (B:5:0x0012, B:7:0x001a, B:22:0x004b, B:32:0x0059, B:33:0x005c, B:34:0x0023, B:37:0x0028, B:13:0x0030, B:17:0x003b, B:18:0x0045, B:27:0x0041), top: B:4:0x0012, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean enterWhenUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit) {
        long initNanoTime;
        long remainingNanos;
        long safeNanos = toSafeNanos(time, unit);
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        boolean interrupted = java.lang.Thread.interrupted();
        try {
            boolean z = true;
            if (!this.fair && reentrantLock.tryLock()) {
                initNanoTime = 0;
                while (!guard.isSatisfied()) {
                    try {
                        if (initNanoTime == 0) {
                            initNanoTime = initNanoTime(safeNanos);
                            remainingNanos = safeNanos;
                        } else {
                            remainingNanos = remainingNanos(initNanoTime, safeNanos);
                        }
                        z = awaitNanos(guard, remainingNanos, isHeldByCurrentThread);
                    } catch (java.lang.InterruptedException unused) {
                        isHeldByCurrentThread = false;
                        interrupted = true;
                    } catch (java.lang.Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                if (!z) {
                    reentrantLock.unlock();
                }
                if (interrupted) {
                    java.lang.Thread.currentThread().interrupt();
                }
                return z;
            }
            initNanoTime = initNanoTime(safeNanos);
            long j = safeNanos;
            while (true) {
                try {
                    try {
                        break;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        interrupted = true;
                        if (interrupted) {
                            java.lang.Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (java.lang.InterruptedException unused2) {
                    j = remainingNanos(initNanoTime, safeNanos);
                    interrupted = true;
                }
            }
            if (!reentrantLock.tryLock(j, java.util.concurrent.TimeUnit.NANOSECONDS)) {
                if (interrupted) {
                    java.lang.Thread.currentThread().interrupt();
                }
                return false;
            }
            while (!guard.isSatisfied()) {
            }
            if (!z) {
            }
            if (interrupted) {
            }
            return z;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    public boolean enterIf(com.google.common.util.concurrent.Monitor.Guard guard) {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean isSatisfied = guard.isSatisfied();
            if (!isSatisfied) {
            }
            return isSatisfied;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean enterIf(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit) {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        if (!enter(time, unit)) {
            return false;
        }
        try {
            boolean isSatisfied = guard.isSatisfied();
            if (!isSatisfied) {
            }
            return isSatisfied;
        } finally {
            this.lock.unlock();
        }
    }

    public boolean enterIfInterruptibly(com.google.common.util.concurrent.Monitor.Guard guard) throws java.lang.InterruptedException {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lockInterruptibly();
        try {
            boolean isSatisfied = guard.isSatisfied();
            if (!isSatisfied) {
            }
            return isSatisfied;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean enterIfInterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        if (!reentrantLock.tryLock(time, unit)) {
            return false;
        }
        try {
            boolean isSatisfied = guard.isSatisfied();
            if (!isSatisfied) {
            }
            return isSatisfied;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean tryEnterIf(com.google.common.util.concurrent.Monitor.Guard guard) {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        if (!reentrantLock.tryLock()) {
            return false;
        }
        try {
            boolean isSatisfied = guard.isSatisfied();
            if (!isSatisfied) {
            }
            return isSatisfied;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void waitFor(com.google.common.util.concurrent.Monitor.Guard guard) throws java.lang.InterruptedException {
        if (guard.monitor != this || !this.lock.isHeldByCurrentThread()) {
            throw new java.lang.IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return;
        }
        await(guard, true);
    }

    public boolean waitFor(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        long safeNanos = toSafeNanos(time, unit);
        if (guard.monitor != this || !this.lock.isHeldByCurrentThread()) {
            throw new java.lang.IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return true;
        }
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        return awaitNanos(guard, safeNanos, true);
    }

    public void waitForUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard) {
        if (guard.monitor != this || !this.lock.isHeldByCurrentThread()) {
            throw new java.lang.IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return;
        }
        awaitUninterruptibly(guard, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean waitForUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit) {
        long safeNanos = toSafeNanos(time, unit);
        if (guard.monitor != this || !this.lock.isHeldByCurrentThread()) {
            throw new java.lang.IllegalMonitorStateException();
        }
        boolean z = true;
        if (guard.isSatisfied()) {
            return true;
        }
        long initNanoTime = initNanoTime(safeNanos);
        boolean interrupted = java.lang.Thread.interrupted();
        long j = safeNanos;
        boolean z2 = true;
        while (true) {
            try {
                try {
                    boolean awaitNanos = awaitNanos(guard, j, z2);
                    if (interrupted) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    return awaitNanos;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (z) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (java.lang.InterruptedException unused) {
                if (!guard.isSatisfied()) {
                    j = remainingNanos(initNanoTime, safeNanos);
                    z2 = false;
                    interrupted = true;
                } else {
                    java.lang.Thread.currentThread().interrupt();
                    return true;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                z = interrupted;
                if (z) {
                }
                throw th;
            }
        }
    }

    public void leave() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                signalNextWaiter();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean isFair() {
        return this.fair;
    }

    public boolean isOccupied() {
        return this.lock.isLocked();
    }

    public boolean isOccupiedByCurrentThread() {
        return this.lock.isHeldByCurrentThread();
    }

    public int getOccupiedDepth() {
        return this.lock.getHoldCount();
    }

    public int getQueueLength() {
        return this.lock.getQueueLength();
    }

    public boolean hasQueuedThreads() {
        return this.lock.hasQueuedThreads();
    }

    public boolean hasQueuedThread(java.lang.Thread thread) {
        return this.lock.hasQueuedThread(thread);
    }

    public boolean hasWaiters(com.google.common.util.concurrent.Monitor.Guard guard) {
        return getWaitQueueLength(guard) > 0;
    }

    public int getWaitQueueLength(com.google.common.util.concurrent.Monitor.Guard guard) {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        this.lock.lock();
        try {
            return guard.waiterCount;
        } finally {
            this.lock.unlock();
        }
    }

    private static long toSafeNanos(long time, java.util.concurrent.TimeUnit unit) {
        return com.google.common.primitives.Longs.constrainToRange(unit.toNanos(time), 0L, 6917529027641081853L);
    }

    private static long initNanoTime(long timeoutNanos) {
        if (timeoutNanos <= 0) {
            return 0L;
        }
        long nanoTime = java.lang.System.nanoTime();
        if (nanoTime == 0) {
            return 1L;
        }
        return nanoTime;
    }

    private static long remainingNanos(long startTime, long timeoutNanos) {
        if (timeoutNanos <= 0) {
            return 0L;
        }
        return timeoutNanos - (java.lang.System.nanoTime() - startTime);
    }

    private void signalNextWaiter() {
        for (com.google.common.util.concurrent.Monitor.Guard guard = this.activeGuards; guard != null; guard = guard.next) {
            if (isSatisfied(guard)) {
                guard.condition.signal();
                return;
            }
        }
    }

    private boolean isSatisfied(com.google.common.util.concurrent.Monitor.Guard guard) {
        try {
            return guard.isSatisfied();
        } catch (java.lang.Throwable th) {
            signalAllWaiters();
            throw th;
        }
    }

    private void signalAllWaiters() {
        for (com.google.common.util.concurrent.Monitor.Guard guard = this.activeGuards; guard != null; guard = guard.next) {
            guard.condition.signalAll();
        }
    }

    private void beginWaitingFor(com.google.common.util.concurrent.Monitor.Guard guard) {
        int i = guard.waiterCount;
        guard.waiterCount = i + 1;
        if (i == 0) {
            guard.next = this.activeGuards;
            this.activeGuards = guard;
        }
    }

    private void endWaitingFor(com.google.common.util.concurrent.Monitor.Guard guard) {
        int i = guard.waiterCount - 1;
        guard.waiterCount = i;
        if (i == 0) {
            com.google.common.util.concurrent.Monitor.Guard guard2 = this.activeGuards;
            com.google.common.util.concurrent.Monitor.Guard guard3 = null;
            while (guard2 != guard) {
                guard3 = guard2;
                guard2 = guard2.next;
            }
            if (guard3 == null) {
                this.activeGuards = guard2.next;
            } else {
                guard3.next = guard2.next;
            }
            guard2.next = null;
        }
    }

    private void await(com.google.common.util.concurrent.Monitor.Guard guard, boolean signalBeforeWaiting) throws java.lang.InterruptedException {
        if (signalBeforeWaiting) {
            signalNextWaiter();
        }
        beginWaitingFor(guard);
        do {
            try {
                guard.condition.await();
            } finally {
                endWaitingFor(guard);
            }
        } while (!guard.isSatisfied());
    }

    private void awaitUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, boolean signalBeforeWaiting) {
        if (signalBeforeWaiting) {
            signalNextWaiter();
        }
        beginWaitingFor(guard);
        do {
            try {
                guard.condition.awaitUninterruptibly();
            } finally {
                endWaitingFor(guard);
            }
        } while (!guard.isSatisfied());
    }

    private boolean awaitNanos(com.google.common.util.concurrent.Monitor.Guard guard, long nanos, boolean signalBeforeWaiting) throws java.lang.InterruptedException {
        boolean z = true;
        while (nanos > 0) {
            if (z) {
                if (signalBeforeWaiting) {
                    try {
                        signalNextWaiter();
                    } finally {
                        if (!z) {
                            endWaitingFor(guard);
                        }
                    }
                }
                beginWaitingFor(guard);
                z = false;
            }
            nanos = guard.condition.awaitNanos(nanos);
            if (guard.isSatisfied()) {
                if (!z) {
                    endWaitingFor(guard);
                }
                return true;
            }
        }
        return false;
    }
}

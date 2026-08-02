package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public final class Monitor {
    private com.google.common.util.concurrent.Monitor.Guard activeGuards;
    private final boolean fair;
    private final java.util.concurrent.locks.ReentrantLock lock;

    public static abstract class Guard {
        final java.util.concurrent.locks.Condition condition;
        final com.google.common.util.concurrent.Monitor monitor;
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

    public Monitor(boolean z) {
        this.activeGuards = null;
        this.fair = z;
        this.lock = new java.util.concurrent.locks.ReentrantLock(z);
    }

    public final com.google.common.util.concurrent.Monitor.Guard newGuard(final java.util.function.BooleanSupplier booleanSupplier) {
        com.google.common.base.Preconditions.checkNotNull(booleanSupplier, "isSatisfied");
        return new com.google.common.util.concurrent.Monitor.Guard(this, this) { // from class: com.google.common.util.concurrent.Monitor.1
            final /* synthetic */ com.google.common.util.concurrent.Monitor this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            public boolean isSatisfied() {
                return booleanSupplier.getAsBoolean();
            }
        };
    }

    public final void enter() {
        this.lock.lock();
    }

    public final boolean enter(java.time.Duration duration) {
        return enter(com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final boolean enter(long j, java.util.concurrent.TimeUnit timeUnit) {
        boolean tryLock;
        long safeNanos = toSafeNanos(j, timeUnit);
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        boolean z = true;
        if (!this.fair && reentrantLock.tryLock()) {
            return true;
        }
        boolean interrupted = java.lang.Thread.interrupted();
        try {
            long nanoTime = java.lang.System.nanoTime();
            long j2 = safeNanos;
            while (true) {
                try {
                    try {
                        tryLock = reentrantLock.tryLock(j2, java.util.concurrent.TimeUnit.NANOSECONDS);
                        break;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (z) {
                            java.lang.Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (java.lang.InterruptedException unused) {
                    j2 = remainingNanos(nanoTime, safeNanos);
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

    public final void enterInterruptibly() throws java.lang.InterruptedException {
        this.lock.lockInterruptibly();
    }

    public final boolean enterInterruptibly(java.time.Duration duration) throws java.lang.InterruptedException {
        return enterInterruptibly(com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final boolean enterInterruptibly(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.lock.tryLock(j, timeUnit);
    }

    public final boolean tryEnter() {
        return this.lock.tryLock();
    }

    public final void enterWhen(com.google.common.util.concurrent.Monitor.Guard guard) throws java.lang.InterruptedException {
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

    public final boolean enterWhen(com.google.common.util.concurrent.Monitor.Guard guard, java.time.Duration duration) throws java.lang.InterruptedException {
        return enterWhen(guard, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (awaitNanos(r11, r0, r3) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean enterWhen(com.google.common.util.concurrent.Monitor.Guard guard, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        long initNanoTime;
        long safeNanos = toSafeNanos(j, timeUnit);
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
        if (!reentrantLock.tryLock(j, timeUnit)) {
            return false;
        }
    }

    public final void enterWhenUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard) {
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

    public final boolean enterWhenUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, java.time.Duration duration) {
        return enterWhenUninterruptibly(guard, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0072, blocks: (B:5:0x0012, B:7:0x001a, B:22:0x004b, B:32:0x0059, B:33:0x005c, B:34:0x0023, B:37:0x0028, B:13:0x0030, B:17:0x003b, B:18:0x0045, B:27:0x0041), top: B:4:0x0012, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean enterWhenUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, long j, java.util.concurrent.TimeUnit timeUnit) {
        boolean z;
        long initNanoTime;
        long remainingNanos;
        long safeNanos = toSafeNanos(j, timeUnit);
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        boolean interrupted = java.lang.Thread.interrupted();
        try {
            z = true;
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
                        interrupted = z;
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
            long j2 = safeNanos;
            while (true) {
                try {
                    try {
                        break;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        if (z) {
                            java.lang.Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (java.lang.InterruptedException unused2) {
                    j2 = remainingNanos(initNanoTime, safeNanos);
                    interrupted = true;
                }
            }
            if (!reentrantLock.tryLock(j2, java.util.concurrent.TimeUnit.NANOSECONDS)) {
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
            z = interrupted;
        }
    }

    public final boolean enterIf(com.google.common.util.concurrent.Monitor.Guard guard) {
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

    public final boolean enterIf(com.google.common.util.concurrent.Monitor.Guard guard, java.time.Duration duration) {
        return enterIf(guard, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final boolean enterIf(com.google.common.util.concurrent.Monitor.Guard guard, long j, java.util.concurrent.TimeUnit timeUnit) {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        if (!enter(j, timeUnit)) {
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

    public final boolean enterIfInterruptibly(com.google.common.util.concurrent.Monitor.Guard guard) throws java.lang.InterruptedException {
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

    public final boolean enterIfInterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, java.time.Duration duration) throws java.lang.InterruptedException {
        return enterIfInterruptibly(guard, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final boolean enterIfInterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        if (!reentrantLock.tryLock(j, timeUnit)) {
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

    public final boolean tryEnterIf(com.google.common.util.concurrent.Monitor.Guard guard) {
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

    public final void waitFor(com.google.common.util.concurrent.Monitor.Guard guard) throws java.lang.InterruptedException {
        if (guard.monitor != this || !this.lock.isHeldByCurrentThread()) {
            throw new java.lang.IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return;
        }
        await(guard, true);
    }

    public final boolean waitFor(com.google.common.util.concurrent.Monitor.Guard guard, java.time.Duration duration) throws java.lang.InterruptedException {
        return waitFor(guard, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final boolean waitFor(com.google.common.util.concurrent.Monitor.Guard guard, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        long safeNanos = toSafeNanos(j, timeUnit);
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

    public final void waitForUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard) {
        if (guard.monitor != this || !this.lock.isHeldByCurrentThread()) {
            throw new java.lang.IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return;
        }
        awaitUninterruptibly(guard, true);
    }

    public final boolean waitForUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, java.time.Duration duration) {
        return waitForUninterruptibly(guard, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean waitForUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, long j, java.util.concurrent.TimeUnit timeUnit) {
        long safeNanos = toSafeNanos(j, timeUnit);
        if (guard.monitor != this || !this.lock.isHeldByCurrentThread()) {
            throw new java.lang.IllegalMonitorStateException();
        }
        boolean z = true;
        if (guard.isSatisfied()) {
            return true;
        }
        long initNanoTime = initNanoTime(safeNanos);
        boolean interrupted = java.lang.Thread.interrupted();
        long j2 = safeNanos;
        boolean z2 = true;
        while (true) {
            try {
                try {
                    boolean awaitNanos = awaitNanos(guard, j2, z2);
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
                    j2 = remainingNanos(initNanoTime, safeNanos);
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

    public final void leave() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                signalNextWaiter();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isFair() {
        return this.fair;
    }

    public final boolean isOccupied() {
        return this.lock.isLocked();
    }

    public final boolean isOccupiedByCurrentThread() {
        return this.lock.isHeldByCurrentThread();
    }

    public final int getOccupiedDepth() {
        return this.lock.getHoldCount();
    }

    public final int getQueueLength() {
        return this.lock.getQueueLength();
    }

    public final boolean hasQueuedThreads() {
        return this.lock.hasQueuedThreads();
    }

    public final boolean hasQueuedThread(java.lang.Thread thread) {
        return this.lock.hasQueuedThread(thread);
    }

    public final boolean hasWaiters(com.google.common.util.concurrent.Monitor.Guard guard) {
        return getWaitQueueLength(guard) > 0;
    }

    public final int getWaitQueueLength(com.google.common.util.concurrent.Monitor.Guard guard) {
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

    private static long toSafeNanos(long j, java.util.concurrent.TimeUnit timeUnit) {
        return com.google.common.primitives.Longs.constrainToRange(timeUnit.toNanos(j), 0L, 6917529027641081853L);
    }

    private static long initNanoTime(long j) {
        if (j <= 0) {
            return 0L;
        }
        long nanoTime = java.lang.System.nanoTime();
        if (nanoTime == 0) {
            return 1L;
        }
        return nanoTime;
    }

    private static long remainingNanos(long j, long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        return j2 - (java.lang.System.nanoTime() - j);
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

    private void await(com.google.common.util.concurrent.Monitor.Guard guard, boolean z) throws java.lang.InterruptedException {
        if (z) {
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

    private void awaitUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, boolean z) {
        if (z) {
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

    private boolean awaitNanos(com.google.common.util.concurrent.Monitor.Guard guard, long j, boolean z) throws java.lang.InterruptedException {
        boolean z2 = true;
        while (j > 0) {
            if (z2) {
                if (z) {
                    try {
                        signalNextWaiter();
                    } finally {
                        if (!z2) {
                            endWaitingFor(guard);
                        }
                    }
                }
                beginWaitingFor(guard);
                z2 = false;
            }
            j = guard.condition.awaitNanos(j);
            if (guard.isSatisfied()) {
                if (!z2) {
                    endWaitingFor(guard);
                }
                return true;
            }
        }
        return false;
    }
}

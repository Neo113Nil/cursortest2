package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
abstract class InterruptibleTask<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> implements java.lang.Runnable {
    private static final java.lang.Runnable DONE;
    private static final int MAX_BUSY_WAIT_SPINS = 1000;
    private static final java.lang.Runnable PARKED;

    abstract void afterRanInterruptiblyFailure(java.lang.Throwable th);

    abstract void afterRanInterruptiblySuccess(T t);

    abstract boolean isDone();

    abstract T runInterruptibly() throws java.lang.Exception;

    abstract java.lang.String toPendingString();

    InterruptibleTask() {
    }

    static final class DoNothingRunnable implements java.lang.Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }

        private DoNothingRunnable() {
        }
    }

    static {
        DONE = new com.google.common.util.concurrent.InterruptibleTask.DoNothingRunnable();
        PARKED = new com.google.common.util.concurrent.InterruptibleTask.DoNothingRunnable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.lang.Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean isDone = isDone();
            if (!isDone) {
                try {
                    obj = runInterruptibly();
                } catch (java.lang.Throwable th) {
                    try {
                        com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th);
                        if (!compareAndSet(currentThread, DONE)) {
                            waitForInterrupt(currentThread);
                        }
                        if (isDone) {
                            return;
                        }
                        afterRanInterruptiblyFailure(th);
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, DONE)) {
                            waitForInterrupt(currentThread);
                        }
                        if (!isDone) {
                            afterRanInterruptiblySuccess(com.google.common.util.concurrent.NullnessCasts.uncheckedCastNullableTToT(null));
                        }
                    }
                }
            }
        }
    }

    private void waitForInterrupt(java.lang.Thread thread) {
        java.lang.Runnable runnable = get();
        com.google.common.util.concurrent.InterruptibleTask.Blocker blocker = null;
        int i = 0;
        boolean z = false;
        while (true) {
            boolean z2 = runnable instanceof com.google.common.util.concurrent.InterruptibleTask.Blocker;
            if (!z2 && runnable != PARKED) {
                break;
            }
            if (z2) {
                blocker = (com.google.common.util.concurrent.InterruptibleTask.Blocker) runnable;
            }
            i++;
            if (i > 1000) {
                java.lang.Runnable runnable2 = PARKED;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = java.lang.Thread.interrupted() || z;
                    java.util.concurrent.locks.LockSupport.park(blocker);
                }
            } else {
                java.lang.Thread.yield();
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    final void interruptTask() {
        java.lang.Runnable runnable = get();
        if (runnable instanceof java.lang.Thread) {
            com.google.common.util.concurrent.InterruptibleTask.Blocker blocker = new com.google.common.util.concurrent.InterruptibleTask.Blocker();
            blocker.setOwner(java.lang.Thread.currentThread());
            if (compareAndSet(runnable, blocker)) {
                try {
                    ((java.lang.Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(DONE) == PARKED) {
                        java.util.concurrent.locks.LockSupport.unpark((java.lang.Thread) runnable);
                    }
                }
            }
        }
    }

    static final class Blocker extends java.util.concurrent.locks.AbstractOwnableSynchronizer implements java.lang.Runnable {
        private final com.google.common.util.concurrent.InterruptibleTask<?> task;

        @Override // java.lang.Runnable
        public final void run() {
        }

        private Blocker(com.google.common.util.concurrent.InterruptibleTask<?> interruptibleTask) {
            this.task = interruptibleTask;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwner(java.lang.Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        final java.lang.Thread getOwner() {
            return super.getExclusiveOwnerThread();
        }

        public final java.lang.String toString() {
            return this.task.toString();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.Runnable runnable = get();
        if (runnable == DONE) {
            str = "running=[DONE]";
        } else if (runnable instanceof com.google.common.util.concurrent.InterruptibleTask.Blocker) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof java.lang.Thread) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("running=[RUNNING ON ");
            sb.append(((java.lang.Thread) runnable).getName());
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(", ");
        sb2.append(toPendingString());
        return sb2.toString();
    }
}

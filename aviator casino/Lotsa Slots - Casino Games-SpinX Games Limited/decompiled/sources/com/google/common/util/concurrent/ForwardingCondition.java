package com.google.common.util.concurrent;

@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
abstract class ForwardingCondition implements java.util.concurrent.locks.Condition {
    abstract java.util.concurrent.locks.Condition delegate();

    ForwardingCondition() {
    }

    @Override // java.util.concurrent.locks.Condition
    public void await() throws java.lang.InterruptedException {
        delegate().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        return delegate().await(time, unit);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        delegate().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long nanosTimeout) throws java.lang.InterruptedException {
        return delegate().awaitNanos(nanosTimeout);
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(java.util.Date deadline) throws java.lang.InterruptedException {
        return delegate().awaitUntil(deadline);
    }

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
        delegate().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
        delegate().signalAll();
    }
}

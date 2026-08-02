package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
abstract class ForwardingCondition implements java.util.concurrent.locks.Condition {
    abstract java.util.concurrent.locks.Condition delegate();

    ForwardingCondition() {
    }

    @Override // java.util.concurrent.locks.Condition
    public void await() throws java.lang.InterruptedException {
        delegate().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return delegate().await(j, timeUnit);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        delegate().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long j) throws java.lang.InterruptedException {
        return delegate().awaitNanos(j);
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(java.util.Date date) throws java.lang.InterruptedException {
        return delegate().awaitUntil(date);
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

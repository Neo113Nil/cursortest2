package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
abstract class ForwardingLock implements java.util.concurrent.locks.Lock {
    abstract java.util.concurrent.locks.Lock delegate();

    ForwardingLock() {
    }

    @Override // java.util.concurrent.locks.Lock
    public void lock() {
        delegate().lock();
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() throws java.lang.InterruptedException {
        delegate().lockInterruptibly();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock() {
        return delegate().tryLock();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return delegate().tryLock(j, timeUnit);
    }

    @Override // java.util.concurrent.locks.Lock
    public void unlock() {
        delegate().unlock();
    }

    @Override // java.util.concurrent.locks.Lock
    public java.util.concurrent.locks.Condition newCondition() {
        return delegate().newCondition();
    }
}

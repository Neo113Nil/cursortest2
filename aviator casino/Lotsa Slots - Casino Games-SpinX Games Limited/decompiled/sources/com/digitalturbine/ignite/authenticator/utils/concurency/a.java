package com.digitalturbine.ignite.authenticator.utils.concurency;

/* loaded from: classes2.dex */
public final class a implements java.util.concurrent.ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f3512a = new java.util.concurrent.atomic.AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "ConcurrencyUtil#" + this.f3512a.getAndIncrement());
    }
}

package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class p implements java.util.concurrent.ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f4305a = new java.util.concurrent.atomic.AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "IAConcurrencyUtil#" + this.f4305a.getAndIncrement());
    }
}

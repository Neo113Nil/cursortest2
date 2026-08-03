package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class h0 implements java.util.concurrent.ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f3840a = new java.util.concurrent.atomic.AtomicInteger(100);

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, java.lang.String.format(java.util.Locale.ENGLISH, "FyberMarketplace-Network-%02d", java.lang.Integer.valueOf(this.f3840a.getAndIncrement())));
    }
}

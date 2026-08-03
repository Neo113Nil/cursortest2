package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.cb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerThreadC0277cb extends android.os.HandlerThread implements io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f5644a;

    public HandlerThreadC0277cb(java.lang.String str) {
        super(str);
        this.f5644a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized boolean isRunning() {
        return this.f5644a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized void stopRunning() {
        this.f5644a = false;
        interrupt();
    }
}

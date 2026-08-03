package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ik, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0440ik implements java.util.concurrent.Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f6105a;

    public ExecutorC0440ik(android.os.Handler handler) {
        this.f6105a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f6105a.post(runnable);
    }
}

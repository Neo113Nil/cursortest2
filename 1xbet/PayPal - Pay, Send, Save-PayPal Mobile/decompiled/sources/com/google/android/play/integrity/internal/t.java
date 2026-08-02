package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
public abstract class t implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.tasks.TaskCompletionSource f3856a;

    public void a(java.lang.Exception exc) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.f3856a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    protected abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (java.lang.Exception e) {
            a(e);
        }
    }

    final com.google.android.gms.tasks.TaskCompletionSource c() {
        return this.f3856a;
    }

    public t(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.f3856a = taskCompletionSource;
    }

    t() {
        this.f3856a = null;
    }
}

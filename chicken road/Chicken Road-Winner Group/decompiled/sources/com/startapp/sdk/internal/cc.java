package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class cc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f3546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dc f3547b;

    public cc(dc dcVar, Runnable runnable) {
        this.f3547b = dcVar;
        this.f3546a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3547b.a(this.f3546a);
        synchronized (this.f3547b) {
            this.f3547b.f3585c = null;
        }
    }
}

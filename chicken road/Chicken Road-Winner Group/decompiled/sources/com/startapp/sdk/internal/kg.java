package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class kg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f3961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lg f3962b;

    public kg(lg lgVar, Runnable runnable) {
        this.f3962b = lgVar;
        this.f3961a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3961a.run();
        } finally {
            this.f3962b.a();
        }
    }
}

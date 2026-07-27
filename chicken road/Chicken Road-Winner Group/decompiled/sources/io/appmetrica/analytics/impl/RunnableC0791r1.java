package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0791r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f8185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f8186b;

    public RunnableC0791r1(C0817s1 c0817s1, Throwable th) {
        this.f8186b = c0817s1;
        this.f8185a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1.a(this.f8186b).reportUnhandledException(this.f8185a);
    }
}

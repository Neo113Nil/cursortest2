package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0447j1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.AnrListener f6147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f6148b;

    public RunnableC0447j1(io.appmetrica.analytics.impl.C0706t1 c0706t1, io.appmetrica.analytics.AnrListener anrListener) {
        this.f6148b = c0706t1;
        this.f6147a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0706t1.a(this.f6148b).a(this.f6147a);
    }
}

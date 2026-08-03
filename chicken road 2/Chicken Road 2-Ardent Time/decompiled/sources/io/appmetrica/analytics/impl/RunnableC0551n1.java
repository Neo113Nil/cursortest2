package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0551n1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f6455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f6456b;

    public RunnableC0551n1(io.appmetrica.analytics.impl.C0706t1 c0706t1, java.lang.String str) {
        this.f6456b = c0706t1;
        this.f6455a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0706t1.a(this.f6456b).reportEvent(this.f6455a);
    }
}

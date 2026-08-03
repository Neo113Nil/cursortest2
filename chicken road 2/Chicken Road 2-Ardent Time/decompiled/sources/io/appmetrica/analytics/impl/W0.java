package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class W0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f5182a;

    public W0(io.appmetrica.analytics.impl.C0706t1 c0706t1) {
        this.f5182a = c0706t1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0706t1.a(this.f5182a).sendEventsBuffer();
    }
}

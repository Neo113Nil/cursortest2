package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0318e1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f5769b;

    public RunnableC0318e1(io.appmetrica.analytics.impl.C0706t1 c0706t1, java.lang.String str) {
        this.f5769b = c0706t1;
        this.f5768a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0706t1.a(this.f5769b).b(this.f5768a);
    }
}

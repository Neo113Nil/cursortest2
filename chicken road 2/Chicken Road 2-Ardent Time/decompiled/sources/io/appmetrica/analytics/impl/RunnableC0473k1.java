package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0473k1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.ExternalAttribution f6244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f6245b;

    public RunnableC0473k1(io.appmetrica.analytics.impl.C0706t1 c0706t1, io.appmetrica.analytics.ExternalAttribution externalAttribution) {
        this.f6245b = c0706t1;
        this.f6244a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0706t1.a(this.f6245b).a(this.f6244a);
    }
}

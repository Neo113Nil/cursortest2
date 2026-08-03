package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0577o1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f6550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f6551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f6552c;

    public RunnableC0577o1(io.appmetrica.analytics.impl.C0706t1 c0706t1, java.lang.String str, java.lang.String str2) {
        this.f6552c = c0706t1;
        this.f6550a = str;
        this.f6551b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0706t1.a(this.f6552c).reportEvent(this.f6550a, this.f6551b);
    }
}

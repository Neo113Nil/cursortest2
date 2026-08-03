package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0629q1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f6673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f6674b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f6675c;

    public RunnableC0629q1(io.appmetrica.analytics.impl.C0706t1 c0706t1, java.lang.String str, java.lang.Throwable th) {
        this.f6675c = c0706t1;
        this.f6673a = str;
        this.f6674b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0706t1.a(this.f6675c).reportError(this.f6673a, this.f6674b);
    }
}

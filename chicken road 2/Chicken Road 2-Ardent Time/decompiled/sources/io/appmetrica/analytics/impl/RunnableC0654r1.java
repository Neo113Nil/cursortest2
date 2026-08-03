package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0654r1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f6710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f6711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f6712c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f6713d;

    public RunnableC0654r1(io.appmetrica.analytics.impl.C0706t1 c0706t1, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        this.f6713d = c0706t1;
        this.f6710a = str;
        this.f6711b = str2;
        this.f6712c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0706t1.a(this.f6713d).reportError(this.f6710a, this.f6711b, this.f6712c);
    }
}

package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0293d1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f5686c;

    public RunnableC0293d1(io.appmetrica.analytics.impl.C0706t1 c0706t1, java.lang.String str, java.lang.String str2) {
        this.f5686c = c0706t1;
        this.f5684a = str;
        this.f5685b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0706t1.a(this.f5686c).b(this.f5684a, this.f5685b);
    }
}

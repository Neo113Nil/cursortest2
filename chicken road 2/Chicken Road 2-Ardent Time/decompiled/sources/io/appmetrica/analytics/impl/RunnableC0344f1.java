package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0344f1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f5871c;

    public RunnableC0344f1(io.appmetrica.analytics.impl.C0706t1 c0706t1, java.lang.String str, java.lang.String str2) {
        this.f5871c = c0706t1;
        this.f5869a = str;
        this.f5870b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0861z0 c0861z0 = this.f5871c.f6831a;
        java.lang.String str = this.f5869a;
        java.lang.String str2 = this.f5870b;
        c0861z0.getClass();
        io.appmetrica.analytics.impl.C0835y0.c().putAppEnvironmentValue(str, str2);
    }
}

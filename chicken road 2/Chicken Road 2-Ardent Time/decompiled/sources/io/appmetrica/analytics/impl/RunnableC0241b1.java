package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0241b1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f5489c;

    public RunnableC0241b1(io.appmetrica.analytics.impl.C0706t1 c0706t1, java.lang.String str, java.lang.String str2) {
        this.f5489c = c0706t1;
        this.f5487a = str;
        this.f5488b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0861z0 c0861z0 = this.f5489c.f6831a;
        java.lang.String str = this.f5487a;
        java.lang.String str2 = this.f5488b;
        c0861z0.getClass();
        io.appmetrica.analytics.impl.C0835y0.c().a(str, str2);
    }
}

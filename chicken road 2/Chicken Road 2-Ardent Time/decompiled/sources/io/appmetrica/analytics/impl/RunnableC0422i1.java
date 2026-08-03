package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0422i1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f6069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.StartupParamsCallback f6070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f6071c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f6072d;

    public RunnableC0422i1(io.appmetrica.analytics.impl.C0706t1 c0706t1, android.content.Context context, io.appmetrica.analytics.StartupParamsCallback startupParamsCallback, java.util.List list) {
        this.f6072d = c0706t1;
        this.f6069a = context;
        this.f6070b = startupParamsCallback;
        this.f6071c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0861z0 c0861z0 = this.f6072d.f6831a;
        android.content.Context applicationContext = this.f6069a.getApplicationContext();
        c0861z0.getClass();
        io.appmetrica.analytics.impl.C0835y0 a2 = io.appmetrica.analytics.impl.C0835y0.a(applicationContext);
        a2.f().a(this.f6070b, this.f6071c);
    }
}

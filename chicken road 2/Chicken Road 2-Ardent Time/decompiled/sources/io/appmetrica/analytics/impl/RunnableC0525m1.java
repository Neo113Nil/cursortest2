package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0525m1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f6381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f6382b;

    public RunnableC0525m1(io.appmetrica.analytics.impl.C0706t1 c0706t1, android.app.Activity activity) {
        this.f6382b = c0706t1;
        this.f6381a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0706t1 c0706t1 = this.f6382b;
        io.appmetrica.analytics.impl.Wk wk = c0706t1.f6838h;
        android.app.Activity activity = this.f6381a;
        io.appmetrica.analytics.impl.Ia ia = c0706t1.d().f6186a;
        if (activity != null) {
            wk.f5228f.a(activity);
        }
        if (wk.f5227e.a(activity, io.appmetrica.analytics.impl.EnumC0601p.PAUSED)) {
            ia.b(activity);
        }
    }
}

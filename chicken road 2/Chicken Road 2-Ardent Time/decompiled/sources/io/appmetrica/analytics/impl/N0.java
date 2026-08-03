package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class N0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f4700b;

    public N0(io.appmetrica.analytics.impl.C0706t1 c0706t1, java.lang.String str) {
        this.f4700b = c0706t1;
        this.f4699a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4700b.d().f6187b.a(this.f4699a, false);
    }
}

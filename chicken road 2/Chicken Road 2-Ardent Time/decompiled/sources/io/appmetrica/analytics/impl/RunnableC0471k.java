package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0471k implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f6241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0523m f6242b;

    public RunnableC0471k(io.appmetrica.analytics.impl.C0523m c0523m, android.app.Activity activity) {
        this.f6242b = c0523m;
        this.f6241a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6242b.a(this.f6241a);
    }
}

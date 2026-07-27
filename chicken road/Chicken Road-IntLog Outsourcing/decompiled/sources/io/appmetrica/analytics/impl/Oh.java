package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Oh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f7217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0802li f7218b;

    public Oh(C0802li c0802li, Throwable th) {
        this.f7218b = c0802li;
        this.f7217a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f7218b;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).reportUnhandledException(this.f7217a);
    }
}

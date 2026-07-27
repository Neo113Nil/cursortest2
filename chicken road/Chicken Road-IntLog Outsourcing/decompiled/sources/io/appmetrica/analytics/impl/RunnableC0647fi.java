package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0647fi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f8188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0802li f8189b;

    public RunnableC0647fi(C0802li c0802li, V v4) {
        this.f8189b = c0802li;
        this.f8188a = v4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f8189b;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).a(this.f8188a);
    }
}

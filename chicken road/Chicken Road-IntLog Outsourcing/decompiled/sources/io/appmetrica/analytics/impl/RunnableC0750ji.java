package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ji, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0750ji implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0802li f8548b;

    public RunnableC0750ji(C0802li c0802li, String str) {
        this.f8548b = c0802li;
        this.f8547a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f8548b;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).reportEvent(this.f8547a);
    }
}

package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class U0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f7574a;

    public U0(C0966s1 c0966s1) {
        this.f7574a = c0966s1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1.a(this.f7574a).sendEventsBuffer();
    }
}

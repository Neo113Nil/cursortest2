package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class U0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f6701a;

    public U0(C0817s1 c0817s1) {
        this.f6701a = c0817s1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1.a(this.f6701a).sendEventsBuffer();
    }
}

package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1043v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1069w0 f9424a;

    public RunnableC1043v0(C1069w0 c1069w0) {
        this.f9424a = c1069w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0736j4.l().f8484c.a().executeDelayed(new RunnableC1018u1(this.f9424a.f9493a), TimeUnit.SECONDS.toMillis(5L));
    }
}

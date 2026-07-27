package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0894v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0920w0 f8471a;

    public RunnableC0894v0(C0920w0 c0920w0) {
        this.f8471a = c0920w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0587j4.l().f7572c.a().executeDelayed(new RunnableC0869u1(this.f8471a.f8536a), TimeUnit.SECONDS.toMillis(5L));
    }
}

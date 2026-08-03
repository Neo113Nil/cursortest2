package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0310di implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f5729a;

    public RunnableC0310di(io.appmetrica.analytics.impl.C0387gi c0387gi) {
        this.f5729a = c0387gi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f5729a;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).clearAppEnvironment();
    }
}

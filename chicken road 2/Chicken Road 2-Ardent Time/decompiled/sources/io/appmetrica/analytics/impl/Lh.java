package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Lh implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f4615a;

    public Lh(io.appmetrica.analytics.impl.C0387gi c0387gi) {
        this.f4615a = c0387gi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f4615a;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).pauseSession();
    }
}

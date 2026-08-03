package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Sh implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f4970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f4971b;

    public Sh(io.appmetrica.analytics.impl.C0387gi c0387gi, boolean z2) {
        this.f4971b = c0387gi;
        this.f4970a = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f4971b;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).setDataSendingEnabled(this.f4970a);
    }
}

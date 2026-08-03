package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Mh implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f4675b;

    public Mh(io.appmetrica.analytics.impl.C0387gi c0387gi, java.lang.String str) {
        this.f4675b = c0387gi;
        this.f4674a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f4675b;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).setUserProfileID(this.f4674a);
    }
}

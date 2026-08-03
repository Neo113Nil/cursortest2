package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ei, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0335ei implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f5853b;

    public RunnableC0335ei(io.appmetrica.analytics.impl.C0387gi c0387gi, java.lang.String str) {
        this.f5853b = c0387gi;
        this.f5852a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f5853b;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).reportEvent(this.f5852a);
    }
}

package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0361fi implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f5904c;

    public RunnableC0361fi(io.appmetrica.analytics.impl.C0387gi c0387gi, java.lang.String str, java.lang.String str2) {
        this.f5904c = c0387gi;
        this.f5902a = str;
        this.f5903b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f5904c;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).reportEvent(this.f5902a, this.f5903b);
    }
}

package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Wh implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f5219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f5220c;

    public Wh(io.appmetrica.analytics.impl.C0387gi c0387gi, java.lang.String str, byte[] bArr) {
        this.f5220c = c0387gi;
        this.f5218a = str;
        this.f5219b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f5220c;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).setSessionExtra(this.f5218a, this.f5219b);
    }
}

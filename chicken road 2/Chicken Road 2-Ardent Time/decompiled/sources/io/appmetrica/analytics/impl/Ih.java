package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ih implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4455b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f4456c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f4457d;

    public Ih(io.appmetrica.analytics.impl.C0387gi c0387gi, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        this.f4457d = c0387gi;
        this.f4454a = str;
        this.f4455b = str2;
        this.f4456c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f4457d;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).reportError(this.f4454a, this.f4455b, this.f4456c);
    }
}

package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0284ci implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5661b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f5662c;

    public RunnableC0284ci(io.appmetrica.analytics.impl.C0387gi c0387gi, java.lang.String str, java.lang.String str2) {
        this.f5662c = c0387gi;
        this.f5660a = str;
        this.f5661b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f5662c;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).putAppEnvironmentValue(this.f5660a, this.f5661b);
    }
}

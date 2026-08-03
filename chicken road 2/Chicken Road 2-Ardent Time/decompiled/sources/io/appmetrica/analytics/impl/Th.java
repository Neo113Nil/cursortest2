package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Th implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.ReporterConfig f5026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f5027b;

    public Th(io.appmetrica.analytics.impl.C0387gi c0387gi, io.appmetrica.analytics.ReporterConfig reporterConfig) {
        this.f5027b = c0387gi;
        this.f5026a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f5027b;
        io.appmetrica.analytics.ReporterConfig reporterConfig = this.f5026a;
        io.appmetrica.analytics.impl.C0861z0 c0861z0 = c0387gi.f5991a;
        android.content.Context context = c0387gi.f5994d;
        c0861z0.getClass();
        io.appmetrica.analytics.impl.C0835y0.a(context).f().a(reporterConfig);
    }
}

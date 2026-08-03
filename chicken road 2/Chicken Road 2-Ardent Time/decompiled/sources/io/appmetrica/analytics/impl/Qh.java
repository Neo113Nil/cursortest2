package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Qh implements io.appmetrica.analytics.coreapi.internal.backport.Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0861z0 f4867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f4868b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.ReporterConfig f4869c;

    public Qh(io.appmetrica.analytics.impl.C0861z0 c0861z0, android.content.Context context, io.appmetrica.analytics.ReporterConfig reporterConfig) {
        this.f4867a = c0861z0;
        this.f4868b = context;
        this.f4869c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final java.lang.Object get() {
        io.appmetrica.analytics.impl.C0861z0 c0861z0 = this.f4867a;
        android.content.Context context = this.f4868b;
        io.appmetrica.analytics.ReporterConfig reporterConfig = this.f4869c;
        c0861z0.getClass();
        return io.appmetrica.analytics.impl.C0835y0.a(context).f().c(reporterConfig);
    }
}

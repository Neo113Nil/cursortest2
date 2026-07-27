package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes.dex */
public final class Vh implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1095x0 f7632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f7633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f7634c;

    public Vh(C1095x0 c1095x0, Context context, ReporterConfig reporterConfig) {
        this.f7632a = c1095x0;
        this.f7633b = context;
        this.f7634c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        C1095x0 c1095x0 = this.f7632a;
        Context context = this.f7633b;
        ReporterConfig reporterConfig = this.f7634c;
        c1095x0.getClass();
        return C1069w0.a(context).f().c(reporterConfig);
    }
}

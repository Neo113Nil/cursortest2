package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes.dex */
public final class Vh implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0946x0 f6758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f6760c;

    public Vh(C0946x0 c0946x0, Context context, ReporterConfig reporterConfig) {
        this.f6758a = c0946x0;
        this.f6759b = context;
        this.f6760c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        C0946x0 c0946x0 = this.f6758a;
        Context context = this.f6759b;
        ReporterConfig reporterConfig = this.f6760c;
        c0946x0.getClass();
        return C0920w0.a(context).f().c(reporterConfig);
    }
}

package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* loaded from: classes.dex */
public final class Zh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f7794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0802li f7795b;

    public Zh(C0802li c0802li, ReporterConfig reporterConfig) {
        this.f7795b = c0802li;
        this.f7794a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f7795b;
        ReporterConfig reporterConfig = this.f7794a;
        C1095x0 c1095x0 = c0802li.f8739a;
        Context context = c0802li.f8742d;
        c1095x0.getClass();
        C1069w0.a(context).f().a(reporterConfig);
    }
}

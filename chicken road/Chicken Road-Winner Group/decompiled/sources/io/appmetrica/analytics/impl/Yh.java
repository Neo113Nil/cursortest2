package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* loaded from: classes.dex */
public final class Yh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f6870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0653li f6871b;

    public Yh(C0653li c0653li, ReporterConfig reporterConfig) {
        this.f6871b = c0653li;
        this.f6870a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f6871b;
        ReporterConfig reporterConfig = this.f6870a;
        C0946x0 c0946x0 = c0653li.f7815a;
        Context context = c0653li.f7818d;
        c0946x0.getClass();
        C0920w0.a(context).f().a(reporterConfig);
    }
}

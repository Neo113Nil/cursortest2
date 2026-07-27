package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* loaded from: classes.dex */
public final class Zh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f6916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0653li f6917b;

    public Zh(C0653li c0653li, ReporterConfig reporterConfig) {
        this.f6917b = c0653li;
        this.f6916a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f6917b;
        ReporterConfig reporterConfig = this.f6916a;
        C0946x0 c0946x0 = c0653li.f7815a;
        Context context = c0653li.f7818d;
        c0946x0.getClass();
        C0920w0.a(context).f().a(reporterConfig);
    }
}

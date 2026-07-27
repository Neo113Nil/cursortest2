package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0971y0 implements Dc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A0 f8626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f8627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f8628c;

    public C0971y0(A0 a02, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f8626a = a02;
        this.f8627b = appMetricaConfig;
        this.f8628c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.Dc
    public final C0725oc a() {
        A0 a02 = this.f8626a;
        C0731oi c0731oi = a02.f5658g;
        AppMetricaConfig appMetricaConfig = this.f8627b;
        PublicLogger publicLogger = this.f8628c;
        L7 l7 = a02.f5660i;
        return c0731oi.a(appMetricaConfig, publicLogger, new C0635l0(l7.f6221j, l7.f6219h));
    }
}

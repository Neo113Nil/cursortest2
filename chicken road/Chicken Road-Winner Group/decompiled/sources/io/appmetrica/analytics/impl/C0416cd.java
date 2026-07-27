package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* renamed from: io.appmetrica.analytics.impl.cd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416cd implements ModuleEventServiceHandlerReporter {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7103a;

    /* renamed from: b, reason: collision with root package name */
    public final C0799r9 f7104b;

    /* renamed from: c, reason: collision with root package name */
    public final W5 f7105c;

    public C0416cd(boolean z3, C0799r9 c0799r9, W5 w5) {
        this.f7103a = z3;
        this.f7104b = c0799r9;
        this.f7105c = w5;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final boolean isMain() {
        return this.f7103a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(CounterReportApi counterReportApi) {
        W5 d3 = W5.d(this.f7105c);
        d3.f6778d = counterReportApi.getType();
        d3.f6779e = counterReportApi.getCustomType();
        d3.setName(counterReportApi.getName());
        String value = counterReportApi.getValue();
        if (value != null) {
            d3.setValue(value);
        }
        byte[] valueBytes = counterReportApi.getValueBytes();
        if (valueBytes != null) {
            d3.setValueBytes(valueBytes);
        }
        d3.f6780g = counterReportApi.getBytesTruncated();
        C0799r9 c0799r9 = this.f7104b;
        c0799r9.a(d3, Wk.a(c0799r9.f8207c.b(d3), d3.f6782i));
    }
}

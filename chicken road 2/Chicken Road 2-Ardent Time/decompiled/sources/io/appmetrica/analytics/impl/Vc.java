package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Vc implements io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5137a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0481k9 f5138b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.P5 f5139c;

    public Vc(boolean z2, io.appmetrica.analytics.impl.C0481k9 c0481k9, io.appmetrica.analytics.impl.P5 p5) {
        this.f5137a = z2;
        this.f5138b = c0481k9;
        this.f5139c = p5;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final boolean isMain() {
        return this.f5137a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(io.appmetrica.analytics.coreapi.internal.event.CounterReportApi counterReportApi) {
        io.appmetrica.analytics.impl.P5 d2 = io.appmetrica.analytics.impl.P5.d(this.f5139c);
        d2.f4816d = counterReportApi.getType();
        d2.f4817e = counterReportApi.getCustomType();
        d2.setName(counterReportApi.getName());
        java.lang.String value = counterReportApi.getValue();
        if (value != null) {
            d2.setValue(value);
        }
        byte[] valueBytes = counterReportApi.getValueBytes();
        if (valueBytes != null) {
            d2.setValueBytes(valueBytes);
        }
        d2.f4819g = counterReportApi.getBytesTruncated();
        io.appmetrica.analytics.impl.C0481k9 c0481k9 = this.f5138b;
        c0481k9.a(d2, io.appmetrica.analytics.impl.Rk.a(c0481k9.f6266c.b(d2), d2.f4821i));
    }
}

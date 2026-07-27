package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes.dex */
public class Ug extends Ch {

    /* renamed from: e, reason: collision with root package name */
    public final Ah f6722e;

    public Ug(C0739p0 c0739p0, InterfaceC0450dl interfaceC0450dl, Ah ah) {
        super(c0739p0, interfaceC0450dl);
        this.f6722e = ah;
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(Throwable th) {
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(IAppMetricaService iAppMetricaService) {
        Ah ah = this.f6722e;
        iAppMetricaService.reportData(ah.f5701c, ah.f5699a.d(ah.f5703e.c()));
    }
}

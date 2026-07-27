package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes.dex */
public final class Pn extends Ch {

    /* renamed from: e, reason: collision with root package name */
    public final int f7290e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f7291f;

    public Pn(C0888p0 c0888p0, InterfaceC0599dl interfaceC0599dl, int i2, Bundle bundle) {
        super(c0888p0, interfaceC0599dl);
        this.f7290e = i2;
        this.f7291f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(IAppMetricaService iAppMetricaService) {
        iAppMetricaService.reportData(this.f7290e, this.f7291f);
    }
}

package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes.dex */
public final class Pn extends Ch {

    /* renamed from: e, reason: collision with root package name */
    public final int f6433e;
    public final Bundle f;

    public Pn(C0739p0 c0739p0, InterfaceC0450dl interfaceC0450dl, int i3, Bundle bundle) {
        super(c0739p0, interfaceC0450dl);
        this.f6433e = i3;
        this.f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(IAppMetricaService iAppMetricaService) {
        iAppMetricaService.reportData(this.f6433e, this.f);
    }
}

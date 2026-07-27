package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes.dex */
public final class Ji extends Ch {

    /* renamed from: e, reason: collision with root package name */
    public final Gf f6164e;

    public Ji(C0739p0 c0739p0, InterfaceC0450dl interfaceC0450dl, Gf gf) {
        super(c0739p0, interfaceC0450dl);
        this.f6164e = gf;
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Gf gf = this.f6164e;
        synchronized (gf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", gf);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }
}

package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.xe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1109xe extends Ch {

    /* renamed from: e, reason: collision with root package name */
    public final Gf f9574e;

    public C1109xe(C0888p0 c0888p0, InterfaceC0599dl interfaceC0599dl, Gf gf) {
        super(c0888p0, interfaceC0599dl);
        this.f9574e = gf;
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Gf gf = this.f9574e;
        synchronized (gf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", gf);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}

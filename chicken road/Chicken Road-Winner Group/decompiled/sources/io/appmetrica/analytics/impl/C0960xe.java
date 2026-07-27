package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.xe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0960xe extends Ch {

    /* renamed from: e, reason: collision with root package name */
    public final Gf f8615e;

    public C0960xe(C0739p0 c0739p0, InterfaceC0450dl interfaceC0450dl, Gf gf) {
        super(c0739p0, interfaceC0450dl);
        this.f8615e = gf;
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Gf gf = this.f8615e;
        synchronized (gf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", gf);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}

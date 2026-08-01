package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CL implements InterfaceC2924gc {
    public final C1908Cb A00;
    public final EnumC2929gh A01;

    public CL(C1908Cb c1908Cb, EnumC2929gh enumC2929gh) {
        this.A00 = c1908Cb;
        this.A01 = enumC2929gh;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2924gc
    public void A4D(Map<InterfaceC2906gK, EnumC2929gh> map, Map<SyncModifiableBundle, EnumC2916gU> map2) {
        map.put(this.A00, this.A01);
    }
}

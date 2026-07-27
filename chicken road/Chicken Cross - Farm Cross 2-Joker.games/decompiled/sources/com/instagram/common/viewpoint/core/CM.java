package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CM implements InterfaceC2924gc {
    public final EnumC2916gU A00;
    public final AbstractC16712d A01;

    public CM(AbstractC16712d abstractC16712d, EnumC2916gU enumC2916gU) {
        this.A01 = abstractC16712d;
        this.A00 = enumC2916gU;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2924gc
    public void A4D(Map<InterfaceC2906gK, EnumC2929gh> map, Map<SyncModifiableBundle, EnumC2916gU> map2) {
        map2.put(null, this.A00);
    }
}

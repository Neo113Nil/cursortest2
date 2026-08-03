package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CL implements com.facebook.ads.redexgen.core.InterfaceC1630gc {
    public final com.facebook.ads.redexgen.core.C0614Cb A00;
    public final com.facebook.ads.redexgen.core.EnumC1635gh A01;

    public CL(com.facebook.ads.redexgen.core.C0614Cb c0614Cb, com.facebook.ads.redexgen.core.EnumC1635gh enumC1635gh) {
        this.A00 = c0614Cb;
        this.A01 = enumC1635gh;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1630gc
    public void A4D(java.util.Map<com.facebook.ads.redexgen.core.InterfaceC1612gK, com.facebook.ads.redexgen.core.EnumC1635gh> map, java.util.Map<com.facebook.ads.sync.SyncModifiableBundle, com.facebook.ads.redexgen.core.EnumC1622gU> map2) {
        map.put(this.A00, this.A01);
    }
}

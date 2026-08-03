package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CM implements com.facebook.ads.redexgen.core.InterfaceC1630gc {
    public final com.facebook.ads.redexgen.core.EnumC1622gU A00;
    public final com.facebook.ads.redexgen.core.AbstractC03772d A01;

    public CM(com.facebook.ads.redexgen.core.AbstractC03772d abstractC03772d, com.facebook.ads.redexgen.core.EnumC1622gU enumC1622gU) {
        this.A01 = abstractC03772d;
        this.A00 = enumC1622gU;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1630gc
    public void A4D(java.util.Map<com.facebook.ads.redexgen.core.InterfaceC1612gK, com.facebook.ads.redexgen.core.EnumC1635gh> map, java.util.Map<com.facebook.ads.sync.SyncModifiableBundle, com.facebook.ads.redexgen.core.EnumC1622gU> map2) {
        map2.put(null, this.A00);
    }
}

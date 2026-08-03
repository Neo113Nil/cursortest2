package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ax, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1281ax implements com.facebook.ads.redexgen.core.TC {
    public final /* synthetic */ com.facebook.ads.internal.bridge.gms.AdvertisingId A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1272ao A01;

    public C1281ax(com.facebook.ads.redexgen.core.C1272ao c1272ao, com.facebook.ads.internal.bridge.gms.AdvertisingId advertisingId) {
        this.A01 = c1272ao;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.core.TC
    public final boolean AAX() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.core.TC
    public final java.lang.String getId() {
        return this.A00.getId();
    }
}

package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* renamed from: com.facebook.ads.redexgen.X.ax, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2575ax implements TC {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ C2566ao A01;

    public C2575ax(C2566ao c2566ao, AdvertisingId advertisingId) {
        this.A01 = c2566ao;
        this.A00 = advertisingId;
    }

    @Override // com.instagram.common.viewpoint.core.TC
    public final boolean AAX() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.instagram.common.viewpoint.core.TC
    public final String getId() {
        return this.A00.getId();
    }
}

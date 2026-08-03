package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0667Ee implements android.media.Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0668Ef A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05539h A01;

    public C0667Ee(com.facebook.ads.redexgen.core.C0668Ef c0668Ef, com.facebook.ads.redexgen.core.C05539h c05539h) {
        this.A00 = c0668Ef;
        this.A01 = c05539h;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(android.media.Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(android.media.Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }
}

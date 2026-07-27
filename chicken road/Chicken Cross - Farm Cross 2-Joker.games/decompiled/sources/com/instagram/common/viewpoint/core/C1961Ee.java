package com.instagram.common.viewpoint.core;

import android.media.Spatializer;

/* renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1961Ee implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ C1962Ef A00;
    public final /* synthetic */ C18479h A01;

    public C1961Ee(C1962Ef c1962Ef, C18479h c18479h) {
        this.A00 = c1962Ef;
        this.A01 = c18479h;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }
}

package com.microblink.blinkid.fragment.overlay.components.settings;

/* loaded from: classes10.dex */
public class ScanRegionOfInterestSettings {
    public final boolean isRotatable;
    public final com.microblink.blinkid.geometry.Rectangle roi;

    public ScanRegionOfInterestSettings(com.microblink.blinkid.geometry.Rectangle rectangle, boolean z) {
        this.roi = rectangle;
        this.isRotatable = z;
    }
}

package com.microblink.blinkid.uisettings.options;

/* loaded from: classes10.dex */
public enum OverlayOrientation {
    PORTRAIT,
    LANDSCAPE;

    public final int toActivityInfoOrientation() {
        return this == PORTRAIT ? 1 : 0;
    }

    public final com.microblink.blinkid.hardware.orientation.Orientation toOrientation() {
        return this == PORTRAIT ? com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT;
    }
}

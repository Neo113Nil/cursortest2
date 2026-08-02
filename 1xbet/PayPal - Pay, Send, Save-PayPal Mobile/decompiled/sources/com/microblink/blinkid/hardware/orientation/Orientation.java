package com.microblink.blinkid.hardware.orientation;

/* loaded from: classes.dex */
public enum Orientation {
    ORIENTATION_PORTRAIT(0, true, false),
    ORIENTATION_LANDSCAPE_RIGHT(1, false, true),
    ORIENTATION_PORTRAIT_UPSIDE(2, true, false),
    ORIENTATION_LANDSCAPE_LEFT(3, false, true),
    ORIENTATION_UNKNOWN(4, false, false);

    private final boolean Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoSizes;

    Orientation(int i, boolean z, boolean z2) {
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = z;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
    }

    public static com.microblink.blinkid.hardware.orientation.Orientation fromActivityInfoCode(int i) {
        return i != 0 ? i != 1 ? i != 8 ? i != 9 ? ORIENTATION_PORTRAIT : ORIENTATION_PORTRAIT_UPSIDE : ORIENTATION_LANDSCAPE_LEFT : ORIENTATION_PORTRAIT : ORIENTATION_LANDSCAPE_RIGHT;
    }

    public static com.microblink.blinkid.hardware.orientation.Orientation fromInt(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? ORIENTATION_UNKNOWN : ORIENTATION_LANDSCAPE_LEFT : ORIENTATION_PORTRAIT_UPSIDE : ORIENTATION_LANDSCAPE_RIGHT : ORIENTATION_PORTRAIT;
    }

    public final int intValue() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean isHorizontal() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean isVertical() {
        return this.Camera2StreamConfigurationMap;
    }

    public final com.microblink.blinkid.hardware.orientation.Orientation rotate180() {
        return fromInt((this.getHighSpeedVideoSizes + 2) % 4);
    }

    public final com.microblink.blinkid.hardware.orientation.Orientation rotate90Clockwise() {
        return fromInt((this.getHighSpeedVideoSizes + 3) % 4);
    }

    public final com.microblink.blinkid.hardware.orientation.Orientation rotate90CounterClockwise() {
        return fromInt((this.getHighSpeedVideoSizes + 1) % 4);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        int i = this.getHighSpeedVideoSizes;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown" : "Landscape left" : "Inverse portrait" : "Landscape right" : "Portrait";
    }
}

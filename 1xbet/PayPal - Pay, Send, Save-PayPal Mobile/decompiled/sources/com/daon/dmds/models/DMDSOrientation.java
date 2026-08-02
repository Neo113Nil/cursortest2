package com.daon.dmds.models;

/* loaded from: classes7.dex */
public enum DMDSOrientation {
    DMDS_ORIENTATION_PORTRAIT(0),
    DMDS_ORIENTATION_LANDSCAPE_RIGHT(1),
    DMDS_ORIENTATION_PORTRAIT_UPSIDE(2),
    DMDS_ORIENTATION_LANDSCAPE_LEFT(3),
    DMDS_ORIENTATION_UNKNOWN(4);

    private int Camera2StreamConfigurationMap;

    /* renamed from: com.daon.dmds.models.DMDSOrientation$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.microblink.blinkid.hardware.orientation.Orientation.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    DMDSOrientation(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public static com.daon.dmds.models.DMDSOrientation fromOrientation(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        int i = com.daon.dmds.models.DMDSOrientation.AnonymousClass1.getHighSpeedVideoSizes[orientation.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? DMDS_ORIENTATION_UNKNOWN : DMDS_ORIENTATION_LANDSCAPE_RIGHT : DMDS_ORIENTATION_LANDSCAPE_LEFT : DMDS_ORIENTATION_PORTRAIT_UPSIDE : DMDS_ORIENTATION_PORTRAIT;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        int i = this.Camera2StreamConfigurationMap;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "ORIENTATION UNKNOWN" : "ORIENTATION LANDSCAPE LEFT" : "ORIENTATION PORTRAIT UPSIDE" : "ORIENTATION LANDSCAPE RIGHT" : "ORIENTATION PORTRAIT";
    }
}

package com.daon.dmds.models;

/* loaded from: classes7.dex */
public enum DMDSDocumentRotation {
    HORIZONTAL(0),
    CLOCKWISE_90(-90),
    CLOCKWISE_180(-180),
    CLOCKWISE_270(-270);

    private final int getHighSpeedVideoSizes;

    /* renamed from: com.daon.dmds.models.DMDSDocumentRotation$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.daon.dmds.models.DMDSDocumentRotation.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[com.daon.dmds.models.DMDSDocumentRotation.CLOCKWISE_90.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.models.DMDSDocumentRotation.CLOCKWISE_180.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.models.DMDSDocumentRotation.CLOCKWISE_270.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.models.DMDSDocumentRotation.HORIZONTAL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.values().length];
            getHighSpeedVideoSizes = iArr2;
            try {
                iArr2[com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.Zero.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoSizes[com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.Clockwise90.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoSizes[com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.UpsideDown.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoSizes[com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.CounterClockwise90.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    DMDSDocumentRotation(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public static com.daon.dmds.models.DMDSDocumentRotation fromMBCardRotation(com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation cardRotation) {
        int i = com.daon.dmds.models.DMDSDocumentRotation.AnonymousClass1.getHighSpeedVideoSizes[cardRotation.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? HORIZONTAL : CLOCKWISE_270 : CLOCKWISE_180 : CLOCKWISE_90;
    }

    public final int getRotationDegrees() {
        return this.getHighSpeedVideoSizes;
    }

    public final com.microblink.blinkid.hardware.orientation.Orientation toMBOrientation() {
        int i = com.daon.dmds.models.DMDSDocumentRotation.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT;
    }
}

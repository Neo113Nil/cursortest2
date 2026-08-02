package com.daon.dmds.models;

/* loaded from: classes7.dex */
public enum DMDSStrictnessLevel {
    DMDS_STRICTNESS_LEVEL_HIGH,
    DMDS_STRICTNESS_LEVEL_NORMAL,
    DMDS_STRICTNESS_LEVEL_LOW;

    /* renamed from: com.daon.dmds.models.DMDSStrictnessLevel$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[com.daon.dmds.models.DMDSStrictnessLevel.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[com.daon.dmds.models.DMDSStrictnessLevel.DMDS_STRICTNESS_LEVEL_HIGH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.models.DMDSStrictnessLevel.DMDS_STRICTNESS_LEVEL_NORMAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.models.DMDSStrictnessLevel.DMDS_STRICTNESS_LEVEL_LOW.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public static java.lang.String getShortName(com.daon.dmds.models.DMDSStrictnessLevel dMDSStrictnessLevel) {
        int i = com.daon.dmds.models.DMDSStrictnessLevel.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[dMDSStrictnessLevel.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "" : "Low" : "Normal" : "High";
    }

    public static com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.StrictnessLevel toStrictnessLevel(com.daon.dmds.models.DMDSStrictnessLevel dMDSStrictnessLevel) {
        int i = com.daon.dmds.models.DMDSStrictnessLevel.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[dMDSStrictnessLevel.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.StrictnessLevel.Normal : com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.StrictnessLevel.Relaxed : com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.StrictnessLevel.Normal : com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.StrictnessLevel.Strict;
    }
}

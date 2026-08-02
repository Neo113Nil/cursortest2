package org.bouncycastle.pqc.crypto.qtesla;

/* loaded from: classes17.dex */
public class QTESLASecurityCategory {
    public static final int PROVABLY_SECURE_I = 5;
    public static final int PROVABLY_SECURE_III = 6;

    static void Camera2StreamConfigurationMap(int i) {
        if (i != 5 && i != 6) {
            throw new java.lang.IllegalArgumentException("unknown security category: ".concat(java.lang.String.valueOf(i)));
        }
    }

    static int getHighSpeedVideoFpsRanges(int i) {
        if (i == 5) {
            return 2592;
        }
        if (i == 6) {
            return 5664;
        }
        throw new java.lang.IllegalArgumentException("unknown security category: ".concat(java.lang.String.valueOf(i)));
    }

    static int getHighSpeedVideoSizes(int i) {
        if (i == 5) {
            return 14880;
        }
        if (i == 6) {
            return 38432;
        }
        throw new java.lang.IllegalArgumentException("unknown security category: ".concat(java.lang.String.valueOf(i)));
    }

    static int getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (i == 5) {
            return 5224;
        }
        if (i == 6) {
            return 12392;
        }
        throw new java.lang.IllegalArgumentException("unknown security category: ".concat(java.lang.String.valueOf(i)));
    }

    public static java.lang.String getName(int i) {
        if (i == 5) {
            return "qTESLA-p-I";
        }
        if (i == 6) {
            return "qTESLA-p-III";
        }
        throw new java.lang.IllegalArgumentException("unknown security category: ".concat(java.lang.String.valueOf(i)));
    }

    private QTESLASecurityCategory() {
    }
}

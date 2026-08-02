package com.airbnb.lottie.model.content;

/* loaded from: classes7.dex */
public enum LBlendMode {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    /* renamed from: com.airbnb.lottie.model.content.LBlendMode$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[com.airbnb.lottie.model.content.LBlendMode.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[com.airbnb.lottie.model.content.LBlendMode.NORMAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.LBlendMode.MULTIPLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.LBlendMode.SCREEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.LBlendMode.OVERLAY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.LBlendMode.DARKEN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.LBlendMode.LIGHTEN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.LBlendMode.ADD.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.LBlendMode.COLOR_DODGE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.LBlendMode.COLOR_BURN.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.LBlendMode.HARD_LIGHT.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.LBlendMode.SOFT_LIGHT.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.LBlendMode.DIFFERENCE.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.LBlendMode.EXCLUSION.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.LBlendMode.HUE.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.LBlendMode.SATURATION.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.LBlendMode.COLOR.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.LBlendMode.LUMINOSITY.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.LBlendMode.HARD_MIX.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
        }
    }

    public final androidx.core.graphics.BlendModeCompat toNativeBlendMode() {
        switch (com.airbnb.lottie.model.content.LBlendMode.AnonymousClass1.getHighSpeedVideoFpsRanges[ordinal()]) {
            case 2:
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    return androidx.core.graphics.BlendModeCompat.MULTIPLY;
                }
                return androidx.core.graphics.BlendModeCompat.MODULATE;
            case 3:
                return androidx.core.graphics.BlendModeCompat.SCREEN;
            case 4:
                return androidx.core.graphics.BlendModeCompat.OVERLAY;
            case 5:
                return androidx.core.graphics.BlendModeCompat.DARKEN;
            case 6:
                return androidx.core.graphics.BlendModeCompat.LIGHTEN;
            case 7:
                return androidx.core.graphics.BlendModeCompat.PLUS;
            default:
                return null;
        }
    }
}

package com.gemalto.mfs.mwsdk.mobilegateway;

/* loaded from: classes8.dex */
public final class BuildConfig {
    public static final java.lang.String BUILD_TYPE;
    private static int Camera2StreamConfigurationMap = 0;
    public static final boolean DEBUG = false;
    public static final boolean INSECURE_CONNECTION_ALLOWED = false;
    public static final java.lang.String RELEASE_QUALIFIER;
    public static final java.lang.String RELEASE_VERSION;
    public static final java.lang.String SDK_KEY_ID;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        int i4 = getHighSpeedVideoSizes;
        int i5 = i4 + 41;
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        getHighSpeedVideoFpsRanges = (i4 + 83) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i6 = raVar.f2649;
            cArr[i6] = (char) (cArr[i6] - ((int) (Camera2StreamConfigurationMap ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 43) % 128;
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 65) % 128;
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        java.lang.String str2 = new java.lang.String(cArr);
        int i7 = getHighSpeedVideoFpsRanges + 7;
        getHighSpeedVideoSizes = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    static void getHighSpeedVideoFpsRanges() {
        Camera2StreamConfigurationMap = -1231763808;
    }

    static {
        getHighSpeedVideoFpsRanges();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\u0000�\u0005\u0001", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, 3 - android.view.View.getDefaultSize(0, 0), android.view.KeyEvent.getDeadChar(0, 0) + 103, true, objArr);
        SDK_KEY_ID = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\ufffe\u0006\u0000\ufffe\u0002\u0001", 5 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.text.TextUtils.indexOf("", "") + 2, 102 - android.view.View.MeasureSpec.getMode(0), true, objArr2);
        RELEASE_VERSION = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("￩￪\uffe7+\u001c", 5 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 2 - android.graphics.Color.green(0), 125 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), false, objArr3);
        RELEASE_QUALIFIER = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("￼\n\ufff8￼\u0003￼\t", 7 - android.view.KeyEvent.normalizeMetaState(0), 7 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.Gravity.getAbsoluteGravity(0, 0) + 159, true, objArr4);
        BUILD_TYPE = ((java.lang.String) objArr4[0]).intern();
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 87) % 128;
    }
}

package com.gemalto.mfs.mwsdk;

/* loaded from: classes8.dex */
public final class BuildConfig {
    public static final java.lang.String BUILD_TYPE;
    private static char[] Camera2StreamConfigurationMap = null;
    public static final boolean DEBUG = false;
    public static final boolean INSECURE_CONNECTION_ALLOWED = false;
    public static final java.lang.String LIBRARY_PACKAGE_NAME;
    public static final boolean MOB_SEC_LOG_002 = true;
    public static final java.lang.String RELEASE_BUILD;
    public static final java.lang.String RELEASE_QUALIFIER;
    public static final java.lang.String RELEASE_VERSION;
    public static final java.lang.String SDK_KEY_ID;
    public static final boolean SDK_TESTING = false;
    public static final boolean SKIP_DETECTION = false;
    public static final int VERSION_CODE = 612000;
    public static final java.lang.String VERSION_NAME;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static boolean getHighSpeedVideoSizes = false;
    private static boolean getInputFormats = false;
    private static int getOutputFormats = 0;
    private static int getOutputMinFrameDuration = 1;

    private static void getHighSpeedVideoSizes(int i, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = Camera2StreamConfigurationMap;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getOutputFormats);
        if (!getInputFormats) {
            if (!getHighSpeedVideoSizes) {
                throw null;
            }
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 91) % 128;
            throw null;
        }
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 57) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 83) % 128;
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoFpsRanges() {
        Camera2StreamConfigurationMap = new char[]{64163, 64187, 64164, 64167, 64165, 64103, 64118, 64173, 64112, 64113, 64161, 64162, 64116, 64115, 64184, 64160, 64121, 64102, 64122, 64120, 64114, 64097, 64098, 64126};
        getOutputFormats = -1074857259;
        getHighSpeedVideoSizes = true;
        getInputFormats = true;
    }

    static {
        getHighSpeedVideoFpsRanges();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(128 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0085\u0082\u0084\u0083\u0082\u0081", objArr);
        VERSION_NAME = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes(127 - android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u0084\u0083\u0082\u0081", objArr2);
        SDK_KEY_ID = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 127, "\u0085\u0082\u0084\u0083\u0082\u0081", objArr3);
        RELEASE_VERSION = ((java.lang.String) objArr3[0]).intern();
        int i = getHighResolutionOutputSizeshNQ4ISI + 51;
        getOutputMinFrameDuration = i % 128;
        int i2 = i % 2;
        try {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 127, "\u0083\u0085\u0087\u0086\u0082", objArr4);
            RELEASE_QUALIFIER = ((java.lang.String) objArr4[0]).intern();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoSizes(126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0088\u0083\u008c\u0085\u0084\u0083\u0081\u0083\u0081\u0085\u0090\u0084\u0085\u0084\u008f\u008d\u008e\u0085\u008d\u008c\u008b\u0083\u008a\u008a\u0089\u0088\u0085", objArr5);
            RELEASE_BUILD = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoSizes(127 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0089\u0092\u008d\u0089\u0091\u0089\u0086", objArr6);
            BUILD_TYPE = ((java.lang.String) objArr6[0]).intern();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoSizes(126 - android.widget.ExpandableListView.getPackedPositionChild(0L), "\u0098\u008a\u0092\u0097\u0094\u0082\u0092\u008e\u0094\u0082\u0093\u0096\u0091\u008d\u0094\u0089\u0095\u0082\u0094\u0093\u0087", objArr7);
            LIBRARY_PACKAGE_NAME = ((java.lang.String) objArr7[0]).intern();
            getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 109) % 128;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}

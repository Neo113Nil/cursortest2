package util.h.xy.cg;

/* loaded from: classes5.dex */
public final class mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState m25916(java.lang.String str) {
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState;
        int i = (Camera2StreamConfigurationMap + 21) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        if (str == null) {
            return null;
        }
        int i2 = (i ^ 13) + ((i & 13) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            android.text.TextUtils.isEmpty(str);
            throw null;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE.toString())) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 95;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState2 = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE;
                throw null;
            }
            digitalizedCardState = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE;
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
        } else if (str.equalsIgnoreCase(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED.toString())) {
            digitalizedCardState = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED;
        } else if (str.equalsIgnoreCase(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.RETIRED.toString())) {
            int i4 = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = (((i4 | 97) << 1) - (i4 ^ 97)) % 128;
            digitalizedCardState = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.RETIRED;
        } else {
            digitalizedCardState = null;
        }
        int i5 = Camera2StreamConfigurationMap + 47;
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 == 0) {
            return digitalizedCardState;
        }
        throw null;
    }
}

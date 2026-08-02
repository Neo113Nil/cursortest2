package util.h.xy.g;

/* loaded from: classes5.dex */
public final class c {
    private static int Camera2StreamConfigurationMap = 18;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m26867(util.h.xy.s.re reVar) throws com.gemalto.mfs.mwsdk.exception.CPSKeyStoreException {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        Camera2StreamConfigurationMap = ((i2 & 109) + (i2 | 109)) % 128;
        if (reVar == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f726);
        }
        util.h.xy.g.b highSpeedVideoFpsRanges = util.h.xy.g.rb.getHighSpeedVideoFpsRanges(reVar);
        if (highSpeedVideoFpsRanges != null) {
            java.lang.String highSpeedVideoFpsRanges2 = util.h.xy.g.rb.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges);
            if (highSpeedVideoFpsRanges2 != null) {
                util.h.xy.g.d.getHighSpeedVideoFpsRanges(util.h.xy.al.mc.m25015(highSpeedVideoFpsRanges2.getBytes()));
            }
        } else {
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap = (((i3 | 87) << 1) - (i3 ^ 87)) % 128;
        }
        int i4 = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (i4 + 75) % 128;
        Camera2StreamConfigurationMap = (i4 + 37) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean m26868() {
        int i = Camera2StreamConfigurationMap + 29;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            boolean highSpeedVideoSizes = util.h.xy.g.d.getHighSpeedVideoSizes();
            int i2 = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = ((i2 & 19) + (i2 | 19)) % 128;
            return highSpeedVideoSizes;
        }
        util.h.xy.g.d.getHighSpeedVideoSizes();
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.g.b m26869() throws com.gemalto.mfs.mwsdk.exception.CPSKeyStoreException {
        byte[] bArr;
        java.lang.String str;
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 103) % 128;
        java.util.HashMap<java.lang.String, byte[]> Camera2StreamConfigurationMap2 = util.h.xy.g.d.Camera2StreamConfigurationMap(util.h.xy.ag.a.m24556().m24558());
        if (Camera2StreamConfigurationMap2 != null) {
            int i = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = (((i | 75) << 1) - (i ^ 75)) % 128;
            bArr = util.h.xy.al.mc.m25012(Camera2StreamConfigurationMap2);
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap = ((i2 & 63) + (i2 | 63)) % 128;
        } else {
            bArr = null;
        }
        if (bArr != null) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 23;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0 ? bArr.length != 0 : bArr.length != 0) {
                try {
                    str = new java.lang.String(bArr, util.h.xy.al.ra.f459);
                    getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 5) % 128;
                } catch (java.io.UnsupportedEncodingException unused) {
                    str = new java.lang.String(bArr);
                }
                return util.h.xy.g.rb.Camera2StreamConfigurationMap(str);
            }
        }
        return null;
    }
}

package util.h.xy.bu;

/* loaded from: classes5.dex */
public final class d {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static util.h.xy.bu.d getHighSpeedVideoFpsRanges = null;
    private static int getHighSpeedVideoSizes = 1;
    private boolean Camera2StreamConfigurationMap = false;
    private java.util.Map<java.lang.String, com.gemalto.mfs.mwsdk.payment.CustomApduListener> getHighSpeedVideoFpsRangesFor;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.bu.d m25655() {
        util.h.xy.bu.d dVar;
        synchronized (util.h.xy.bu.d.class) {
            int i = getHighSpeedVideoSizes + 15;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
            if (getHighSpeedVideoFpsRanges == null) {
                getHighSpeedVideoFpsRanges = new util.h.xy.bu.d();
                int i2 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoSizes = ((i2 & 53) + (i2 | 53)) % 128;
            }
            dVar = getHighSpeedVideoFpsRanges;
            int i3 = getHighSpeedVideoSizes + 65;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
        }
        return dVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25657(com.gemalto.mfs.mwsdk.payment.CustomApduListener customApduListener, java.lang.String[] strArr) {
        if (customApduListener == null || strArr == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f437);
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = java.util.Collections.synchronizedMap(new java.util.HashMap());
        }
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            int i = 0;
            while (i < strArr.length) {
                java.lang.String str = strArr[i];
                if (str == null || str.isEmpty()) {
                    throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f467);
                }
                if (this.getHighSpeedVideoFpsRangesFor.containsKey(str)) {
                    throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f468);
                }
                this.getHighSpeedVideoFpsRangesFor.put(str, customApduListener);
                this.Camera2StreamConfigurationMap = true;
                int i2 = (i ^ 15) + ((i & 15) << 1);
                i = (i2 ^ (-14)) + ((i2 & (-14)) << 1);
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final boolean m25656() {
        int i = (getHighSpeedVideoSizes + 1) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        boolean z = this.Camera2StreamConfigurationMap;
        int i2 = ((i | 71) << 1) - (i ^ 71);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.payment.CustomApduListener m25658(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i | 105) << 1) - (i ^ 105);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.util.Map<java.lang.String, com.gemalto.mfs.mwsdk.payment.CustomApduListener> map = this.getHighSpeedVideoFpsRangesFor;
        if (map == null || map.isEmpty()) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoSizes = (((i3 | 95) << 1) - (i3 ^ 95)) % 128;
            return null;
        }
        com.gemalto.mfs.mwsdk.payment.CustomApduListener customApduListener = this.getHighSpeedVideoFpsRangesFor.get(str);
        int i4 = getHighSpeedVideoSizes;
        int i5 = (i4 ^ 73) + ((i4 & 73) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 == 0) {
            return customApduListener;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25659() {
        java.util.Map<java.lang.String, com.gemalto.mfs.mwsdk.payment.CustomApduListener> map = this.getHighSpeedVideoFpsRangesFor;
        if (map != null) {
            synchronized (map) {
                this.getHighSpeedVideoFpsRangesFor.clear();
            }
        }
        this.Camera2StreamConfigurationMap = false;
    }
}

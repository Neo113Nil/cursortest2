package util.h.xy.bh;

/* loaded from: classes5.dex */
public final class ra {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static util.h.xy.bh.ra getHighSpeedVideoFpsRangesFor;
    private android.content.Context getHighSpeedVideoSizes;

    private ra() {
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.bh.ra m25484() {
        util.h.xy.bh.ra raVar;
        synchronized (util.h.xy.bh.ra.class) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap = (((i | 37) << 1) - (i ^ 37)) % 128;
            if (getHighSpeedVideoFpsRangesFor == null) {
                getHighSpeedVideoFpsRangesFor = new util.h.xy.bh.ra();
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 27) % 128;
            }
            raVar = getHighSpeedVideoFpsRangesFor;
        }
        return raVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25486(android.content.Context context) throws java.lang.IllegalArgumentException {
        synchronized (this) {
            int i = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = (((i | 91) << 1) - (i ^ 91)) % 128;
            if (context == null) {
                throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f675);
            }
            this.getHighSpeedVideoSizes = context.getApplicationContext();
            int i2 = Camera2StreamConfigurationMap;
            int i3 = (i2 & 59) + (i2 | 59);
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                throw new java.lang.NullPointerException();
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final android.content.Context m25485() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 85;
        int i2 = i % 128;
        Camera2StreamConfigurationMap = i2;
        if (i % 2 != 0) {
            throw null;
        }
        android.content.Context context = this.getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 1) % 128;
        return context;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25487(java.lang.Runnable runnable) {
        synchronized (this) {
            int i = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = ((i & 107) + (i | 107)) % 128;
            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                new android.os.Handler(this.getHighSpeedVideoSizes.getMainLooper()).post(runnable);
                int i2 = Camera2StreamConfigurationMap + 39;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 4 / 2;
                }
            } else {
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
                runnable.run();
            }
            int i4 = getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap = ((i4 ^ 61) + ((i4 & 61) << 1)) % 128;
        }
    }
}

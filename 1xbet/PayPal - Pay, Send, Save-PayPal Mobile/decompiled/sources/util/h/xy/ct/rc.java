package util.h.xy.ct;

/* loaded from: classes5.dex */
public final class rc {
    private static util.h.xy.ct.a Camera2StreamConfigurationMap = null;
    private static util.h.xy.ct.rb getHighResolutionOutputSizeshNQ4ISI = null;
    private static util.h.xy.ct.ma getHighSpeedVideoFpsRanges = null;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.ct.ma m26047() throws util.h.xy.ct.mc {
        util.h.xy.ct.ma maVar;
        synchronized (util.h.xy.ct.rc.class) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 65) % 128;
            if (getHighSpeedVideoFpsRanges == null) {
                getHighSpeedVideoFpsRanges = new util.h.xy.ct.b();
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 75) % 128;
            }
            maVar = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 99) % 128;
        }
        return maVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.ct.a m26048() throws util.h.xy.ct.mc {
        util.h.xy.ct.a aVar;
        synchronized (util.h.xy.ct.rc.class) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 61) % 128;
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = new util.h.xy.ct.ra();
            }
            aVar = Camera2StreamConfigurationMap;
            int i = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = ((i ^ 11) + ((i & 11) << 1)) % 128;
        }
        return aVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.ct.rb m26046() throws util.h.xy.ct.mc {
        util.h.xy.ct.rb rbVar;
        synchronized (util.h.xy.ct.rc.class) {
            int i = getHighSpeedVideoSizes;
            int i2 = (i & 119) + (i | 119);
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
            if (getHighResolutionOutputSizeshNQ4ISI == null) {
                getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.ct.d();
                int i3 = getHighSpeedVideoFpsRangesFor + 113;
                getHighSpeedVideoSizes = i3 % 128;
                int i4 = i3 % 2;
            }
            rbVar = getHighResolutionOutputSizeshNQ4ISI;
            int i5 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = (((i5 | 71) << 1) - (i5 ^ 71)) % 128;
        }
        return rbVar;
    }
}

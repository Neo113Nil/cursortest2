package util.h.xy.cw;

/* loaded from: classes5.dex */
public final class c {
    private static util.h.xy.db.mb getHighSpeedVideoFpsRanges = null;
    private static util.h.xy.db.mb Camera2StreamConfigurationMap = new util.h.xy.cz.mb();
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 73) % 128;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.db.mb m26082() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i & 25) + (i | 25)) % 128;
        getHighSpeedVideoSizes = i2;
        util.h.xy.db.mb mbVar = getHighSpeedVideoFpsRanges;
        if (mbVar == null) {
            int i3 = i2 + 49;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            mbVar = Camera2StreamConfigurationMap;
        } else {
            int i4 = i + 119;
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 3;
            }
        }
        int i6 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i6 & 5) + (i6 | 5)) % 128;
        return mbVar;
    }
}

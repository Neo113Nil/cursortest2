package util.h.xy.ep;

/* loaded from: classes18.dex */
public class mb implements util.h.xy.ef.mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m26662() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 29) + (i | 29);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i + 109) % 128;
        return z;
    }

    public mb(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }
}

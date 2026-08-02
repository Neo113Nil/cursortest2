package util.h.xy.ew;

/* loaded from: classes18.dex */
public final class rc {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.ed.a Camera2StreamConfigurationMap;
    private java.lang.Object getHighSpeedVideoFpsRanges;

    /* renamed from: ˏ, reason: contains not printable characters */
    public final java.lang.Object m26730() {
        int i = getHighSpeedVideoSizes + 19;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (i % 2 == 0) {
            throw null;
        }
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges;
        int i3 = i2 + 95;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    public rc(util.h.xy.ed.a aVar, byte[] bArr) {
        this.Camera2StreamConfigurationMap = aVar;
        this.getHighSpeedVideoFpsRanges = bArr;
    }
}

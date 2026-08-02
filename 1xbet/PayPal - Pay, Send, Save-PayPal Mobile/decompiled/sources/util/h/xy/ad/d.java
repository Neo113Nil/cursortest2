package util.h.xy.ad;

/* loaded from: classes5.dex */
final class d implements util.h.xy.ad.mb {
    static int Camera2StreamConfigurationMap = 1;
    static int getHighSpeedVideoFpsRangesFor;
    byte[] getHighSpeedVideoSizes;

    public d(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private d(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.getHighSpeedVideoSizes = bArr2;
        util.h.xy.ad.a.m24549(bArr, 0, bArr2, 0, i);
    }
}

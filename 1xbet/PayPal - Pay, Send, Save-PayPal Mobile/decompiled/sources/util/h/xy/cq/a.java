package util.h.xy.cq;

/* loaded from: classes5.dex */
final class a {
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {58};
    private static int getHighSpeedVideoFpsRanges = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
    private static int getHighSpeedVideoSizes = 1;
    private final byte[] Camera2StreamConfigurationMap;
    private long getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizesFor;

    static {
        int i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE % 2;
    }

    final void getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoFpsRanges + 69;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            byte[][] bArr = new byte[5][];
            bArr[0] = this.Camera2StreamConfigurationMap;
            bArr[1] = this.getHighSpeedVideoSizesFor;
            util.h.xy.cv.ra.m26068(bArr);
        } else {
            util.h.xy.cv.ra.m26068(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor);
        }
        this.getHighSpeedVideoFpsRangesFor = 0L;
    }
}

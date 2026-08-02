package util.h.xy.au;

/* loaded from: classes5.dex */
public final class e extends com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionHistoryConfiguration {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private final byte[] Camera2StreamConfigurationMap;

    public e(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str.getBytes();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m25123() {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 53) % 128;
        byte[] bArr = (byte[]) this.Camera2StreamConfigurationMap.clone();
        int i = getHighSpeedVideoFpsRangesFor + 61;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            return bArr;
        }
        throw null;
    }
}

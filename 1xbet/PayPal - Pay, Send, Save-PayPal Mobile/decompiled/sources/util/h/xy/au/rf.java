package util.h.xy.au;

/* loaded from: classes5.dex */
public final class rf extends com.gemalto.mfs.mwsdk.mobilegateway.MGWalletConfiguration {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;
    private final byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;

    public rf(java.lang.String str, java.lang.String str2) {
        this.getHighSpeedVideoFpsRanges = str.getBytes();
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = str2.getBytes();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m25211() {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 125;
        int i3 = i2 % 128;
        Camera2StreamConfigurationMap = i3;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        if (bArr == null || bArr.length <= 0) {
            Camera2StreamConfigurationMap = ((i & 31) + (i | 31)) % 128;
            return null;
        }
        int i4 = ((i3 | 47) << 1) - (i3 ^ 47);
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 == 0) {
            return (byte[]) bArr.clone();
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m25212() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (i + 119) % 128;
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        if (bArr != null) {
            int i2 = i + 17;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                int length = bArr.length;
                throw new java.lang.ArithmeticException();
            }
            if (bArr.length > 0) {
                int i3 = ((i | 99) << 1) - (i ^ 99);
                getHighSpeedVideoSizes = i3 % 128;
                if (i3 % 2 == 0) {
                    return (byte[]) bArr.clone();
                }
                throw null;
            }
        }
        getHighSpeedVideoSizes = ((i ^ 89) + ((i & 89) << 1)) % 128;
        return null;
    }
}

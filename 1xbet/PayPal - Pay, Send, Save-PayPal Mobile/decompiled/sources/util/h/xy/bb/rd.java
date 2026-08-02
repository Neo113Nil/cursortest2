package util.h.xy.bb;

/* loaded from: classes18.dex */
public final class rd implements com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditionSession {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private byte[] Camera2StreamConfigurationMap;
    private java.lang.String getHighSpeedVideoSizes;

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25363(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (i + 111) % 128;
        if (bArr != null) {
            int i2 = (i & 71) + (i | 71);
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                byte[] bArr2 = new byte[bArr.length];
                this.Camera2StreamConfigurationMap = bArr2;
                java.lang.System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
            } else {
                byte[] bArr3 = new byte[bArr.length];
                this.Camera2StreamConfigurationMap = bArr3;
                java.lang.System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            }
            int i3 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = ((i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i3 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
        }
        int i4 = getHighSpeedVideoFpsRangesFor + 23;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m25365() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i & 27) + (i | 27)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        byte[] bArr = this.Camera2StreamConfigurationMap;
        if (bArr != null) {
            int i3 = i2 + 121;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 == 0) {
                return java.util.Arrays.copyOf(bArr, bArr.length);
            }
            java.util.Arrays.copyOf(bArr, bArr.length);
            throw null;
        }
        getHighSpeedVideoFpsRanges = (((i2 | 119) << 1) - (i2 ^ 119)) % 128;
        return null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final java.lang.String m25364() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
        java.lang.String str = this.getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (((i | 121) << 1) - (i ^ 121)) % 128;
        return str;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25362(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (((i | 25) << 1) - (i ^ 25)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        this.getHighSpeedVideoSizes = str;
        int i3 = ((i2 | 61) << 1) - (i2 ^ 61);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}

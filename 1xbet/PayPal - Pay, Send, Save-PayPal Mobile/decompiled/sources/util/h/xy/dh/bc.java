package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class bc {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes = 0;

    /* renamed from: ˊ, reason: contains not printable characters */
    public final java.lang.String m26283() {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 11;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.getHighSpeedVideoSizes;
        if (i3 == -1) {
            int i4 = i + 79;
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int indexOf = this.getHighSpeedVideoFpsRangesFor.indexOf(46, i3);
        if (indexOf == -1) {
            int i5 = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = (((i5 | 97) << 1) - (i5 ^ 97)) % 128;
            java.lang.String substring = this.getHighSpeedVideoFpsRangesFor.substring(this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoSizes = -1;
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 109) % 128;
            return substring;
        }
        java.lang.String substring2 = this.getHighSpeedVideoFpsRangesFor.substring(this.getHighSpeedVideoSizes, indexOf);
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i6 = ((-465) - (~(-(-(indexOf * (-929)))))) + (((~((indexOf ^ identityHashCode) | (indexOf & identityHashCode))) | (-2)) * (-465));
        int i7 = ~((identityHashCode ^ (-2)) | (identityHashCode & (-2)));
        int i8 = ((indexOf ^ i7) | (indexOf & i7)) * 930;
        this.getHighSpeedVideoSizes = (((i6 ^ i8) + ((i8 & i6) << 1)) - (~(-(-((r5 | (-2)) * 465))))) - 1;
        int i9 = getHighSpeedVideoFpsRanges;
        int i10 = ((i9 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i9 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        Camera2StreamConfigurationMap = i10 % 128;
        if (i10 % 2 == 0) {
            return substring2;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m26284() {
        boolean z;
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (i + 85) % 128;
        if (this.getHighSpeedVideoSizes != -1) {
            getHighSpeedVideoFpsRanges = (i + 33) % 128;
            z = true;
        } else {
            getHighSpeedVideoFpsRanges = ((i ^ 25) + ((i & 25) << 1)) % 128;
            z = false;
        }
        int i2 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i2 ^ 13) + ((i2 & 13) << 1)) % 128;
        return z;
    }

    public bc(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}

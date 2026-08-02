package util.h.xy.dh;

/* loaded from: classes5.dex */
abstract class mn {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    final java.lang.Class getHighSpeedVideoFpsRangesFor;

    public final int hashCode() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 95) << 1) - (i ^ 95);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        int hashCode = super.hashCode();
        int i3 = Camera2StreamConfigurationMap;
        int i4 = (i3 ^ 79) + ((i3 & 79) << 1);
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 != 0) {
            return hashCode;
        }
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        boolean z;
        int i = (getHighSpeedVideoFpsRanges + 17) % 128;
        Camera2StreamConfigurationMap = i;
        if (this == obj) {
            getHighSpeedVideoFpsRanges = (i + 89) % 128;
            z = true;
        } else {
            z = false;
        }
        int i2 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i2 ^ 95) + ((i2 & 95) << 1)) % 128;
        return z;
    }

    mn(java.lang.Class cls) {
        this.getHighSpeedVideoFpsRangesFor = cls;
    }
}

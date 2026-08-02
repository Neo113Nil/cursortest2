package util.h.xy.aq;

/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] f861;

    public b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f861 = bArr2;
    }

    public b(int i) {
        this.f861 = new byte[]{(byte) i};
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final boolean m25040() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 29;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0 ? (this.f861[0] & 32) == 0 : (this.f861[1] & 120) == 0) {
            Camera2StreamConfigurationMap = ((i & 117) + (i | 117)) % 128;
            return false;
        }
        int i3 = (i & 121) + (i | 121);
        Camera2StreamConfigurationMap = i3 % 128;
        return i3 % 2 == 0;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRanges + 31;
        int i2 = i % 128;
        Camera2StreamConfigurationMap = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            getHighSpeedVideoFpsRanges = ((i2 ^ 79) + ((i2 & 79) << 1)) % 128;
            int i3 = ((i2 | 63) << 1) - (i2 ^ 63);
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (obj != null) {
            getHighSpeedVideoFpsRanges = (((i2 | 117) << 1) - (i2 ^ 117)) % 128;
            if (getClass() == obj.getClass()) {
                return java.util.Arrays.equals(this.f861, ((util.h.xy.aq.b) obj).f861);
            }
        }
        int i4 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i4 & 81) + (i4 | 81)) % 128;
        return false;
    }

    public final int hashCode() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i & 7) + (i | 7)) % 128;
        int hashCode = java.util.Arrays.hashCode(this.f861);
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i2 ^ 101) + ((i2 & 101) << 1)) % 128;
        return hashCode;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (m25040()) {
            int i = getHighSpeedVideoFpsRanges;
            int i2 = (i & 73) + (i | 73);
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                java.lang.String str2 = util.h.xy.al.ra.f344;
                throw null;
            }
            str = util.h.xy.al.ra.f344;
        } else {
            str = util.h.xy.al.ra.f375;
            int i3 = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = ((i3 ^ 79) + ((i3 & 79) << 1)) % 128;
        }
        sb.append(str);
        byte[] bArr = this.f861;
        sb.append(util.h.xy.aq.ma.m25044(bArr, 0, bArr.length));
        java.lang.String obj = sb.toString();
        int i4 = Camera2StreamConfigurationMap;
        int i5 = (i4 & 45) + (i4 | 45);
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 != 0) {
            return obj;
        }
        throw null;
    }
}

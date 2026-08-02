package util.h.xy.eu;

/* loaded from: classes18.dex */
public final class b {
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static boolean m26716(util.h.xy.ey.b bVar) {
        boolean z;
        int i = getHighSpeedVideoSizes + 1;
        getHighSpeedVideoFpsRangesFor = i % 128;
        int m26740 = bVar.m26740();
        if (i % 2 == 0 ? m26740 != 1 : m26740 != 1) {
            z = false;
        } else {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 17) % 128;
            z = true;
        }
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (((i2 | 67) << 1) - (i2 ^ 67)) % 128;
        return z;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static boolean m26713(util.h.xy.eu.mb mbVar) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 55) % 128;
        boolean m26716 = m26716(mbVar.m26719());
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 89) + (i | 89);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return m26716;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static boolean m26714(util.h.xy.ey.b bVar) {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i ^ 85) + ((i & 85) << 1)) % 128;
        if (bVar.m26740() > 1) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 63) % 128;
            if (bVar.m26741().equals(util.h.xy.eu.ra.f2176)) {
                int i2 = getHighSpeedVideoSizes;
                int i3 = i2 + 59;
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                boolean z = bVar instanceof util.h.xy.ey.a;
                if (i3 % 2 != 0) {
                    throw null;
                }
                if (z) {
                    int i4 = i2 + 25;
                    getHighSpeedVideoFpsRangesFor = i4 % 128;
                    return i4 % 2 == 0;
                }
            }
        }
        int i5 = getHighSpeedVideoFpsRangesFor + 113;
        getHighSpeedVideoSizes = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean m26715(util.h.xy.eu.mb mbVar) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 105) % 128;
        boolean m26714 = m26714(mbVar.m26719());
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 35) + ((i & 35) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return m26714;
        }
        throw new java.lang.ArithmeticException();
    }
}

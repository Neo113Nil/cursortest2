package util.h.xy.cz;

/* loaded from: classes5.dex */
public final class ra implements util.h.xy.db.ma {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static util.h.xy.cz.ra getHighSpeedVideoFpsRangesFor;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.cz.ra m26127() {
        util.h.xy.cz.ra raVar;
        synchronized (util.h.xy.cz.ra.class) {
            int i = getHighSpeedVideoFpsRanges + 119;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                if (getHighSpeedVideoFpsRangesFor == null) {
                    getHighSpeedVideoFpsRangesFor = new util.h.xy.cz.ra();
                    int i2 = getHighSpeedVideoFpsRanges;
                    int i3 = (i2 & 89) + (i2 | 89);
                    getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                    int i4 = i3 % 2;
                }
                raVar = getHighSpeedVideoFpsRangesFor;
            } else {
                throw new java.lang.NullPointerException();
            }
        }
        return raVar;
    }

    @Override // util.h.xy.db.ma
    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] mo26128() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i & 89) + (i | 89)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        getHighResolutionOutputSizeshNQ4ISI = (((i2 | 57) << 1) - (i2 ^ 57)) % 128;
        byte[] bytes = util.h.xy.da.mc.m26262().m26264().getPackageName().getBytes();
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        int i4 = (i3 ^ 91) + ((i3 & 91) << 1);
        int i5 = i4 % 128;
        getHighSpeedVideoFpsRanges = i5;
        if (i4 % 2 != 0) {
            getHighResolutionOutputSizeshNQ4ISI = ((i5 & 31) + (i5 | 31)) % 128;
            return bytes;
        }
        throw null;
    }
}

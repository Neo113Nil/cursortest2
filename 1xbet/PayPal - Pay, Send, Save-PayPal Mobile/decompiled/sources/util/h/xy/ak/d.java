package util.h.xy.ak;

/* loaded from: classes5.dex */
public final class d {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoSizes = 1;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m24966(util.h.xy.da.ra raVar, util.h.xy.da.ra raVar2) throws util.h.xy.da.b {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 125) + (i | 125);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            java.util.ArrayList<byte[]> mo26078 = raVar.mo26078();
            mo26078.size();
            for (byte[] bArr : mo26078) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 75) % 128;
                util.h.xy.ar.b.m25074(bArr);
                raVar2.mo26077(bArr, raVar.mo26081(bArr));
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 81) % 128;
            }
            int i3 = getHighSpeedVideoSizes;
            int i4 = (i3 & 65) + (i3 | 65);
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        java.util.ArrayList<byte[]> mo260782 = raVar.mo26078();
        mo260782.size();
        mo260782.iterator();
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean m24967(util.h.xy.da.ra raVar) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 125) % 128;
        boolean z = false;
        try {
            raVar.mo26075();
            if (!raVar.mo26079()) {
                int i = getHighSpeedVideoSizes + 73;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 == 0) {
                    z = true;
                }
            }
        } catch (util.h.xy.da.b unused) {
        }
        int i2 = getHighSpeedVideoFpsRanges + 119;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        throw null;
    }
}

package util.h.xy.cb;

/* loaded from: classes5.dex */
public class b {
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 3;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final java.lang.String f1091 = "b";

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m25849(java.lang.String str) {
        int i = (getHighSpeedVideoSizes + 5) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        if (str != null) {
            getHighSpeedVideoSizes = (i + 3) % 128;
            if (!str.isEmpty()) {
                android.content.SharedPreferences.Editor edit = util.h.xy.ag.a.m24556().m24558().getSharedPreferences(util.h.xy.al.ra.f601, 0).edit();
                edit.putString(util.h.xy.al.ra.f518, util.h.xy.ar.b.m25074(getHighSpeedVideoFpsRangesFor(str.getBytes())));
                edit.apply();
                edit.commit();
                int i2 = getHighSpeedVideoFpsRangesFor;
                int i3 = ((i2 | 7) << 1) - (i2 ^ 7);
                getHighSpeedVideoSizes = i3 % 128;
                if (i3 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                return;
            }
        }
        int i4 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (((i4 | 107) << 1) - (i4 ^ 107)) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.lang.Boolean m25848(java.lang.String str) {
        java.lang.String string;
        int i = getHighSpeedVideoFpsRangesFor;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        int i2 = (i ^ 59) + ((i & 59) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        if (i2 % 2 != 0 ? (string = util.h.xy.ag.a.m24556().m24558().getSharedPreferences(util.h.xy.al.ra.f601, 0).getString(util.h.xy.al.ra.f518, null)) != null : (string = util.h.xy.ag.a.m24556().m24558().getSharedPreferences(util.h.xy.al.ra.f601, 1).getString(util.h.xy.al.ra.f518, null)) != null) {
            if (!string.equals(util.h.xy.ar.b.m25074(getHighSpeedVideoFpsRangesFor(str.getBytes())))) {
                return bool2;
            }
            int i3 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = (i3 + 107) % 128;
            getHighSpeedVideoSizes = (i3 + 1) % 128;
            return bool;
        }
        int i4 = getHighSpeedVideoFpsRangesFor;
        int i5 = (i4 ^ 5) + ((i4 & 5) << 1);
        getHighSpeedVideoSizes = i5 % 128;
        return i5 % 2 == 0 ? bool : bool2;
    }

    private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        util.h.xy.eh.mc mcVar = new util.h.xy.eh.mc();
        mcVar.mo26562(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[mcVar.mo26565()];
        mcVar.mo26563(bArr2, 0);
        int i = getHighSpeedVideoSizes + 59;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return bArr2;
        }
        throw null;
    }
}

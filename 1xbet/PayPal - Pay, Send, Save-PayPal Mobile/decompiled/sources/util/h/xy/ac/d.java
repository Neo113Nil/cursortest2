package util.h.xy.ac;

/* loaded from: classes5.dex */
public class d {
    private static int getHighSpeedVideoFpsRangesFor = 54;
    private static int getHighSpeedVideoSizes = 1;

    static {
        int i = 54 % 2;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m24541(util.h.xy.da.ra raVar, util.h.xy.ac.a aVar) throws util.h.xy.da.b, util.h.xy.ac.mc {
        new java.util.ArrayList();
        try {
            java.util.ArrayList<byte[]> mo26078 = raVar.mo26078();
            int i = getHighSpeedVideoSizes + 95;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 == 0) {
                mo26078.size();
                byte[] m27013 = util.h.xy.o.ra.m27013();
                byte[] m26996 = util.h.xy.o.ra.m26996();
                byte[] bytes = util.h.xy.al.ra.f797.getBytes();
                for (byte[] bArr : mo26078) {
                    int i2 = getHighSpeedVideoFpsRangesFor;
                    getHighSpeedVideoSizes = (((i2 | 49) << 1) - (i2 ^ 49)) % 128;
                    util.h.xy.ar.b.m25074(bArr);
                    if (util.h.xy.ac.re.m24547(bArr, m27013)) {
                        util.h.xy.ak.ma.f84.m24976(raVar.mo26081(m27013));
                    } else if (util.h.xy.ac.re.m24547(bArr, m26996)) {
                        util.h.xy.ak.ma.f84.m24983(raVar.mo26081(m26996));
                    } else if (!util.h.xy.ac.re.m24547(bArr, bytes)) {
                        aVar.m24537(bArr, raVar.mo26081(bArr));
                    } else {
                        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 3) % 128;
                        util.h.xy.ak.ma.f84.m24987(raVar.mo26081(bytes));
                    }
                }
                int i3 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRangesFor = (((i3 | 99) << 1) - (i3 ^ 99)) % 128;
                return;
            }
            mo26078.size();
            util.h.xy.o.ra.m27013();
            util.h.xy.o.ra.m26996();
            java.lang.String str = util.h.xy.al.ra.f797;
            mo26078.iterator();
            throw null;
        } catch (java.lang.Exception e) {
            throw new util.h.xy.da.b(e.getMessage());
        }
    }
}

package util.h.xy.ah;

/* loaded from: classes5.dex */
public class ra implements util.h.xy.ah.a {
    private static int getHighSpeedVideoFpsRanges = 105;
    private static int getHighSpeedVideoSizes;

    @Override // util.h.xy.ah.a
    @util.h.xy.a.a
    /* renamed from: ˎ */
    public byte[] mo24566() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoSizes + 89;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            byte[] m27427 = util.h.xy.t.mb.f2417.m27427();
            if (m27427 != null) {
                int i2 = getHighSpeedVideoSizes;
                int i3 = ((i2 & 89) + (i2 | 89)) % 128;
                getHighSpeedVideoFpsRanges = i3;
                if (m27427.length != 0) {
                    int i4 = (i3 ^ 69) + ((i3 & 69) << 1);
                    getHighSpeedVideoSizes = i4 % 128;
                    if (i4 % 2 == 0) {
                        return m27427;
                    }
                    throw null;
                }
            }
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.al.ra.f773);
        }
        util.h.xy.t.mb.f2417.m27427();
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.ah.a
    /* renamed from: ˋ */
    public byte[] mo24565() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 77) % 128;
        byte[] m27455 = util.h.xy.t.mb.f2417.m27455();
        if (m27455 != null) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 97) % 128;
            int length = m27455.length;
        }
        int i = getHighSpeedVideoFpsRanges + 87;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            return m27455;
        }
        throw new java.lang.ArithmeticException();
    }
}

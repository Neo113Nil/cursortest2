package util.h.xy.cm;

/* loaded from: classes18.dex */
public final class mc extends util.h.xy.ed.e implements java.security.Principal {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;

    private static util.h.xy.dh.l Camera2StreamConfigurationMap(util.h.xy.dh.mf mfVar) throws java.io.IOException {
        int i = Camera2StreamConfigurationMap + 77;
        getHighSpeedVideoFpsRanges = i % 128;
        try {
            if (i % 2 == 0) {
                return util.h.xy.dh.l.m26303(mfVar.m26317());
            }
            util.h.xy.dh.l.m26303(mfVar.m26317());
            throw new java.lang.ArithmeticException();
        } catch (java.lang.IllegalArgumentException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f335);
            sb.append(e);
            throw new java.io.IOException(sb.toString());
        }
    }

    public mc(byte[] bArr) throws java.io.IOException {
        super(Camera2StreamConfigurationMap(new util.h.xy.dh.mf(bArr)));
    }

    @Override // java.security.Principal
    public final java.lang.String getName() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 69) + ((i & 69) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return toString();
        }
        throw null;
    }

    @Override // util.h.xy.dh.mh
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] mo25969() {
        int i = Camera2StreamConfigurationMap + 109;
        getHighSpeedVideoFpsRanges = i % 128;
        try {
            if (i % 2 == 0) {
                byte[] m26322 = m26322(util.h.xy.al.ra.f501);
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 21) % 128;
                return m26322;
            }
            m26322(util.h.xy.al.ra.f501);
            throw new java.lang.ArithmeticException();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e.toString());
        }
    }
}

package util.h.xy.bv;

/* loaded from: classes5.dex */
public final class mg extends util.h.xy.bv.mb {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes;
    private java.lang.String Camera2StreamConfigurationMap;

    public mg() {
        super(util.h.xy.al.ra.f604);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25739(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (i + 97) % 128;
        this.Camera2StreamConfigurationMap = str;
        int i2 = i + 75;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.bv.mb
    /* renamed from: ˎ */
    protected final java.util.Map<java.lang.String, java.lang.String> mo25690() throws util.h.xy.ck.rc, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 55) + (i | 55);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            java.util.Map<java.lang.String, java.lang.String> mo25690 = super.mo25690();
            mo25690.put(util.h.xy.al.ra.f659, this.Camera2StreamConfigurationMap);
            return mo25690;
        }
        super.mo25690().put(util.h.xy.al.ra.f659, this.Camera2StreamConfigurationMap);
        throw null;
    }
}

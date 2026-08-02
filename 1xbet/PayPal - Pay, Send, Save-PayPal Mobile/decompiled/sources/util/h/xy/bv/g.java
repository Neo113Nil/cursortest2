package util.h.xy.bv;

/* loaded from: classes5.dex */
public final class g extends util.h.xy.bv.mb {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private java.lang.String Camera2StreamConfigurationMap;
    boolean getHighSpeedVideoSizes;

    public g(boolean z) {
        super(util.h.xy.al.ra.f579);
        this.getHighSpeedVideoSizes = z;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25693(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 31) << 1) - (i ^ 31);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            this.Camera2StreamConfigurationMap = str;
            int i3 = (i ^ 119) + ((i & 119) << 1);
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.Camera2StreamConfigurationMap = str;
        throw null;
    }

    @Override // util.h.xy.bv.mb
    /* renamed from: ˎ */
    protected final java.util.Map<java.lang.String, java.lang.String> mo25690() throws util.h.xy.ck.rc, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.util.Map<java.lang.String, java.lang.String> m25721 = util.h.xy.bv.mf.m25721(this, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, new java.util.HashMap());
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 3) << 1) - (i ^ 3);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return m25721;
        }
        throw null;
    }

    @Override // util.h.xy.bv.mb
    /* renamed from: ˋ, reason: contains not printable characters */
    protected final java.util.Map<java.lang.String, java.lang.String> mo25692() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(util.h.xy.al.ra.f571, util.h.xy.aw.ma.m25244());
        int i = getHighSpeedVideoFpsRanges + 19;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return hashMap;
        }
        throw new java.lang.ArithmeticException();
    }
}

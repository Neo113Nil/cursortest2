package util.h.xy.bv;

/* loaded from: classes18.dex */
public final class re extends util.h.xy.bv.mb {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoFpsRanges;

    public re() {
        super(util.h.xy.al.ra.f577);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25755(java.lang.String str) {
        int i = (getHighSpeedVideoFpsRangesFor + 91) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = str;
        int i2 = (i ^ 23) + ((i & 23) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // util.h.xy.bv.mb
    /* renamed from: ˎ */
    protected final java.util.Map<java.lang.String, java.lang.String> mo25690() throws util.h.xy.ck.rc, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 71) % 128;
        java.util.Map<java.lang.String, java.lang.String> mo25690 = super.mo25690();
        mo25690.put(util.h.xy.al.ra.f505, this.getHighSpeedVideoFpsRanges);
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 85) % 128;
        return mo25690;
    }
}

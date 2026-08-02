package util.h.xy.es;

/* loaded from: classes18.dex */
public final class mb extends util.h.xy.dh.mh {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private int getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoSizes;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        dVar.m26290(new util.h.xy.dh.mz(this.getHighSpeedVideoSizes));
        if (this.getHighSpeedVideoFpsRanges != 12) {
            dVar.m26290(new util.h.xy.dh.f(this.getHighSpeedVideoFpsRanges));
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = ((i & 5) + (i | 5)) % 128;
        }
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 25) % 128;
        return aaVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final int m26708() {
        int i = this.getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 109) % 128;
        return i;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m26707() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 69) + ((i & 69) << 1)) % 128;
        byte[] m26821 = util.h.xy.fb.a.m26821(this.getHighSpeedVideoSizes);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 105) % 128;
        return m26821;
    }

    public mb(byte[] bArr, int i) {
        this.getHighSpeedVideoSizes = util.h.xy.fb.a.m26821(bArr);
        this.getHighSpeedVideoFpsRanges = i;
    }

    private mb(util.h.xy.dh.l lVar) {
        this.getHighSpeedVideoSizes = util.h.xy.dh.rh.m26335(lVar.mo26287(0)).m26337();
        this.getHighSpeedVideoFpsRanges = lVar.mo26286() == 2 ? util.h.xy.dh.f.m26291(lVar.mo26287(1)).m26293() : 12;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.es.mb m26706(java.lang.Object obj) {
        if (!(obj instanceof util.h.xy.es.mb)) {
            if (obj == null) {
                return null;
            }
            util.h.xy.es.mb mbVar = new util.h.xy.es.mb(util.h.xy.dh.l.m26303(obj));
            int i = getHighResolutionOutputSizeshNQ4ISI + 75;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                return mbVar;
            }
            throw null;
        }
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = ((i2 & 109) + (i2 | 109)) % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        util.h.xy.es.mb mbVar2 = (util.h.xy.es.mb) obj;
        int i4 = i3 + 35;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            return mbVar2;
        }
        throw new java.lang.ArithmeticException();
    }
}

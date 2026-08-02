package util.h.xy.ed;

/* loaded from: classes18.dex */
public final class c extends util.h.xy.dh.mh {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoFpsRanges;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.mz mzVar = new util.h.xy.dh.mz(m26501());
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 93) % 128;
        return mzVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m26501() {
        int i = getHighSpeedVideoSizes + 111;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        if (i % 2 != 0) {
            return util.h.xy.fb.a.m26821(bArr);
        }
        util.h.xy.fb.a.m26821(bArr);
        throw null;
    }

    protected c(util.h.xy.dh.rh rhVar) {
        this(rhVar.m26337());
    }

    public c(byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = util.h.xy.fb.a.m26821(bArr);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.ed.c m26499(java.lang.Object obj) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i & 97) + (i | 97)) % 128;
        getHighSpeedVideoSizes = i2;
        if (obj instanceof util.h.xy.ed.c) {
            getHighResolutionOutputSizeshNQ4ISI = (((i2 | 15) << 1) - (i2 ^ 15)) % 128;
            return (util.h.xy.ed.c) obj;
        }
        if (obj == null) {
            getHighResolutionOutputSizeshNQ4ISI = (((i2 | 121) << 1) - (i2 ^ 121)) % 128;
            return null;
        }
        util.h.xy.ed.c cVar = new util.h.xy.ed.c(util.h.xy.dh.rh.m26335(obj));
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        int i4 = (i3 & 119) + (i3 | 119);
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 == 0) {
            return cVar;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.ed.c m26500(util.h.xy.dh.mm mmVar, boolean z) {
        int i = getHighSpeedVideoSizes + 69;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        util.h.xy.dh.rh m26336 = util.h.xy.dh.rh.m26336(mmVar, z);
        if (i % 2 != 0) {
            return m26499(m26336);
        }
        m26499(m26336);
        throw null;
    }
}

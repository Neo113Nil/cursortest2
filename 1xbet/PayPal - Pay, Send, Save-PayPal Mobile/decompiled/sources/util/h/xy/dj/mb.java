package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class mb extends util.h.xy.dh.mh {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private util.h.xy.dh.i Camera2StreamConfigurationMap;
    private util.h.xy.dh.rk getHighSpeedVideoSizes;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        dVar.m26290(this.Camera2StreamConfigurationMap);
        dVar.m26290(this.getHighSpeedVideoSizes);
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 69) + ((i & 69) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return aaVar;
        }
        throw new java.lang.ArithmeticException();
    }

    private mb(util.h.xy.dh.l lVar) {
        this.Camera2StreamConfigurationMap = (util.h.xy.dh.i) lVar.mo26287(0);
        this.getHighSpeedVideoSizes = (util.h.xy.dh.rk) lVar.mo26287(1);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.dj.mb m26383(java.lang.Object obj) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 97) << 1) - (i ^ 97);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!(obj instanceof util.h.xy.dj.mb)) {
            if (obj == null) {
                getHighResolutionOutputSizeshNQ4ISI = (i3 + 115) % 128;
                return null;
            }
            util.h.xy.dj.mb mbVar = new util.h.xy.dj.mb(util.h.xy.dh.l.m26303(obj));
            int i4 = getHighSpeedVideoFpsRanges;
            getHighResolutionOutputSizeshNQ4ISI = ((i4 & 15) + (i4 | 15)) % 128;
            return mbVar;
        }
        int i5 = (i + 71) % 128;
        getHighSpeedVideoFpsRanges = i5;
        util.h.xy.dj.mb mbVar2 = (util.h.xy.dj.mb) obj;
        int i6 = (i5 ^ 69) + ((i5 & 69) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
        if (i6 % 2 == 0) {
            return mbVar2;
        }
        throw null;
    }
}

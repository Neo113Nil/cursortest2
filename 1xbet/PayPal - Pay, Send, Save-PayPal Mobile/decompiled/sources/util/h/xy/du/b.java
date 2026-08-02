package util.h.xy.du;

/* loaded from: classes18.dex */
public final class b extends util.h.xy.dh.mh {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    util.h.xy.dh.rh Camera2StreamConfigurationMap;
    util.h.xy.dh.f getHighSpeedVideoFpsRangesFor;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        util.h.xy.dh.f fVar = this.getHighSpeedVideoFpsRangesFor;
        if (fVar != null) {
            int i = getHighSpeedVideoFpsRanges;
            getHighResolutionOutputSizeshNQ4ISI = ((i & 35) + (i | 35)) % 128;
            dVar.m26290(fVar);
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = ((i2 ^ 39) + ((i2 & 39) << 1)) % 128;
        }
        dVar.m26290(this.Camera2StreamConfigurationMap);
        return new util.h.xy.dh.aa(dVar);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m26420() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 3;
        getHighSpeedVideoFpsRanges = i % 128;
        util.h.xy.dh.rh rhVar = this.Camera2StreamConfigurationMap;
        if (i % 2 != 0) {
            return rhVar.m26337();
        }
        rhVar.m26337();
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final java.math.BigInteger m26419() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 21) + ((i & 21) << 1);
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.dh.f fVar = this.getHighSpeedVideoFpsRangesFor;
        if (fVar == null) {
            getHighSpeedVideoFpsRanges = ((i3 & 99) + (i3 | 99)) % 128;
            return null;
        }
        java.math.BigInteger m26295 = fVar.m26295();
        int i4 = getHighSpeedVideoFpsRanges;
        int i5 = (i4 ^ 41) + ((i4 & 41) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 == 0) {
            return m26295;
        }
        throw new java.lang.ArithmeticException();
    }

    private b(util.h.xy.dh.l lVar) {
        util.h.xy.dh.c mo26287;
        if (lVar.mo26286() == 1) {
            this.getHighSpeedVideoFpsRangesFor = null;
            mo26287 = lVar.mo26287(0);
        } else {
            this.getHighSpeedVideoFpsRangesFor = (util.h.xy.dh.f) lVar.mo26287(0);
            mo26287 = lVar.mo26287(1);
        }
        this.Camera2StreamConfigurationMap = (util.h.xy.dh.rh) mo26287;
    }

    public b(int i, byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = new util.h.xy.dh.f(i);
        this.Camera2StreamConfigurationMap = new util.h.xy.dh.mz(bArr);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.du.b m26418(java.lang.Object obj) {
        int i = (getHighSpeedVideoFpsRanges + 121) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        if (obj instanceof util.h.xy.du.b) {
            getHighSpeedVideoFpsRanges = (i + 111) % 128;
            util.h.xy.du.b bVar = (util.h.xy.du.b) obj;
            getHighSpeedVideoFpsRanges = ((i ^ 9) + ((i & 9) << 1)) % 128;
            return bVar;
        }
        if (obj != null) {
            return new util.h.xy.du.b(util.h.xy.dh.l.m26303(obj));
        }
        int i2 = (i & 95) + (i | 95);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }
}

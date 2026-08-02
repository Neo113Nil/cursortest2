package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class d extends util.h.xy.dh.mh {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.dj.me Camera2StreamConfigurationMap;
    private util.h.xy.dj.a getHighResolutionOutputSizeshNQ4ISI;
    private util.h.xy.dh.rk getHighSpeedVideoFpsRanges;
    private util.h.xy.dh.rk getHighSpeedVideoSizesFor;
    private util.h.xy.dh.f getInputSizeshNQ4ISI;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static int m26361(util.h.xy.dj.me meVar, util.h.xy.dh.rk rkVar, util.h.xy.dh.rk rkVar2) {
        int i = 2;
        if (meVar == null) {
            int i2 = getHighSpeedVideoSizes;
            int i3 = (i2 & 59) + (i2 | 59);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (rkVar2 == null) {
                java.util.Enumeration m26344 = rkVar.m26344();
                while (true) {
                    if (!m26344.hasMoreElements()) {
                        i = 0;
                        break;
                    }
                    int i4 = getHighSpeedVideoFpsRangesFor;
                    getHighSpeedVideoSizes = (((i4 | 65) << 1) - (i4 ^ 65)) % 128;
                    if (util.h.xy.dj.h.m26376(m26344.nextElement()).m26378().m26296(0)) {
                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 63) % 128;
                    } else {
                        int i5 = getHighSpeedVideoSizes;
                        int i6 = (i5 ^ 37) + ((i5 & 37) << 1);
                        getHighSpeedVideoFpsRangesFor = i6 % 128;
                        if (i6 % 2 == 0) {
                            i = 3;
                        }
                    }
                }
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 45) % 128;
                return i;
            }
        }
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 59) % 128;
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 45) % 128;
        return i;
    }

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(5);
        dVar.m26290(this.getInputSizeshNQ4ISI);
        if (this.Camera2StreamConfigurationMap != null) {
            dVar.m26290(new util.h.xy.dh.ag(false, 0, this.Camera2StreamConfigurationMap));
        }
        dVar.m26290(this.getHighSpeedVideoFpsRanges);
        dVar.m26290(this.getHighResolutionOutputSizeshNQ4ISI);
        if (this.getHighSpeedVideoSizesFor != null) {
            dVar.m26290(new util.h.xy.dh.ag(false, 1, this.getHighSpeedVideoSizesFor));
        }
        util.h.xy.dh.rs rsVar = new util.h.xy.dh.rs(dVar);
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i & 45) + (i | 45)) % 128;
        return rsVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.dh.rk m26366() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 99) << 1) - (i ^ 99);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getHighSpeedVideoSizesFor;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.dj.a m26363() {
        int i = (getHighSpeedVideoSizes + 101) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        util.h.xy.dj.a aVar = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 95) + ((i & 95) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.dh.rk m26365() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i & 101) + (i | 101)) % 128;
        getHighSpeedVideoSizes = i2;
        util.h.xy.dh.rk rkVar = this.getHighSpeedVideoFpsRanges;
        int i3 = (i2 & 1) + (i2 | 1);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            return rkVar;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.dj.me m26364() {
        int i = getHighSpeedVideoSizes;
        int i2 = (((i | 81) << 1) - (i ^ 81)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        util.h.xy.dj.me meVar = this.Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (i2 + 49) % 128;
        return meVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.dj.d m26362(java.lang.Object obj) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 93) + (i | 93);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (obj instanceof util.h.xy.dj.d) {
            return (util.h.xy.dj.d) obj;
        }
        if (obj == null) {
            getHighSpeedVideoFpsRangesFor = ((i ^ 83) + ((i & 83) << 1)) % 128;
            return null;
        }
        util.h.xy.dj.d dVar = new util.h.xy.dj.d(util.h.xy.dh.l.m26303(obj));
        int i3 = getHighSpeedVideoFpsRangesFor;
        int i4 = (i3 ^ 55) + ((i3 & 55) << 1);
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 == 0) {
            return dVar;
        }
        throw null;
    }

    private d(util.h.xy.dh.l lVar) {
        this.getInputSizeshNQ4ISI = (util.h.xy.dh.f) lVar.mo26287(0);
        util.h.xy.dh.c mo26287 = lVar.mo26287(1);
        int i = 2;
        if (mo26287 instanceof util.h.xy.dh.mm) {
            this.Camera2StreamConfigurationMap = util.h.xy.dj.me.m26389((util.h.xy.dh.mm) mo26287, false);
            mo26287 = lVar.mo26287(2);
            i = 3;
        }
        this.getHighSpeedVideoFpsRanges = util.h.xy.dh.rk.m26341(mo26287);
        int i2 = i + 1;
        this.getHighResolutionOutputSizeshNQ4ISI = util.h.xy.dj.a.m26353(lVar.mo26287(i));
        if (lVar.mo26286() > i2) {
            this.getHighSpeedVideoSizesFor = util.h.xy.dh.rk.m26340((util.h.xy.dh.mm) lVar.mo26287(i2), false);
        }
    }

    public d(util.h.xy.dj.me meVar, util.h.xy.dh.rk rkVar, util.h.xy.dj.a aVar, util.h.xy.dh.rk rkVar2) {
        this.getInputSizeshNQ4ISI = new util.h.xy.dh.f(m26361(meVar, rkVar, rkVar2));
        this.Camera2StreamConfigurationMap = meVar;
        this.getHighSpeedVideoFpsRanges = rkVar;
        this.getHighResolutionOutputSizeshNQ4ISI = aVar;
        this.getHighSpeedVideoSizesFor = rkVar2;
    }
}

package util.h.xy.dt;

/* loaded from: classes18.dex */
public final class ra extends util.h.xy.dh.mh {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoSizes = 1;
    util.h.xy.dh.rh Camera2StreamConfigurationMap;
    util.h.xy.dh.f getHighSpeedVideoFpsRangesFor;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        dVar.m26290(this.Camera2StreamConfigurationMap);
        dVar.m26290(this.getHighSpeedVideoFpsRangesFor);
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 19) % 128;
        return aaVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m26414() {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = ((i ^ 63) + ((i & 63) << 1)) % 128;
        byte[] m26821 = util.h.xy.fb.a.m26821(this.Camera2StreamConfigurationMap.m26337());
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 51) % 128;
        return m26821;
    }

    private ra(util.h.xy.dh.l lVar) {
        this.Camera2StreamConfigurationMap = (util.h.xy.dh.rh) lVar.mo26287(0);
        this.getHighSpeedVideoFpsRangesFor = (util.h.xy.dh.f) lVar.mo26287(1);
    }

    public ra(byte[] bArr, int i) {
        this.Camera2StreamConfigurationMap = new util.h.xy.dh.mz(util.h.xy.fb.a.m26821(bArr));
        this.getHighSpeedVideoFpsRangesFor = new util.h.xy.dh.f(i);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.dt.ra m26413(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 51) << 1) - (i ^ 51);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (obj instanceof util.h.xy.dt.ra) {
            util.h.xy.dt.ra raVar = (util.h.xy.dt.ra) obj;
            int i3 = (i ^ 85) + ((i & 85) << 1);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                return raVar;
            }
            throw new java.lang.ArithmeticException();
        }
        if (obj == null) {
            getHighSpeedVideoSizes = ((i & 5) + (i | 5)) % 128;
            return null;
        }
        util.h.xy.dt.ra raVar2 = new util.h.xy.dt.ra(util.h.xy.dh.l.m26303(obj));
        int i4 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = (((i4 | 99) << 1) - (i4 ^ 99)) % 128;
        return raVar2;
    }
}

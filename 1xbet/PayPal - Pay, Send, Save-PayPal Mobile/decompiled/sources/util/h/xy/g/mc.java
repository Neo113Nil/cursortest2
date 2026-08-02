package util.h.xy.g;

/* loaded from: classes5.dex */
public final class mc implements util.h.xy.g.b {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    util.h.xy.g.a getHighSpeedVideoFpsRanges;

    mc(java.lang.String str, util.h.xy.g.a aVar) {
        if (aVar == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f694);
        }
        if (aVar.getHighSpeedVideoSizes() == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f759);
        }
        if (str == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f711);
        }
        this.getHighSpeedVideoFpsRanges = aVar;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    @Override // util.h.xy.g.b
    /* renamed from: ˏ */
    public final java.lang.String mo26866() {
        int i = (getHighSpeedVideoFpsRangesFor + 109) % 128;
        Camera2StreamConfigurationMap = i;
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (((i | 37) << 1) - (i ^ 37)) % 128;
        return str;
    }

    @Override // util.h.xy.g.b
    /* renamed from: ˊ */
    public final util.h.xy.g.a mo26864() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (i + 17) % 128;
        util.h.xy.g.a aVar = this.getHighSpeedVideoFpsRanges;
        int i2 = i + 29;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    @Override // util.h.xy.g.b
    /* renamed from: ˎ */
    public final util.h.xy.s.a.b mo26865() {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 121) % 128;
        util.h.xy.s.a.b bVar = util.h.xy.s.a.b.f2296;
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 91) + ((i & 91) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return bVar;
        }
        throw null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f825);
        sb.append(util.h.xy.al.ra.f272);
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append('\'');
        sb.append(util.h.xy.al.ra.f857);
        sb.append(this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes().m26877());
        sb.append("'}");
        java.lang.String obj = sb.toString();
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 5) % 128;
        return obj;
    }
}

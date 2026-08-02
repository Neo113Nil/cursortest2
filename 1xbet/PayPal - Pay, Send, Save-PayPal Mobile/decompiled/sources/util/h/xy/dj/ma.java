package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class ma extends util.h.xy.dh.mh implements util.h.xy.dj.ra {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoSizes = 1;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final util.h.xy.dh.i getHighSpeedVideoFpsRanges;
    private final util.h.xy.dh.c getHighSpeedVideoFpsRangesFor;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        dVar.m26290(this.getHighSpeedVideoFpsRanges);
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = ((i ^ 81) + ((i & 81) << 1)) % 128;
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                dVar.m26290(new util.h.xy.dh.at(0, this.getHighSpeedVideoFpsRangesFor));
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 67) % 128;
            } else {
                dVar.m26290(new util.h.xy.dh.mu(0, this.getHighSpeedVideoFpsRangesFor));
            }
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return new util.h.xy.dh.aq(dVar);
        }
        util.h.xy.dh.rs rsVar = new util.h.xy.dh.rs(dVar);
        int i2 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i2 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
        return rsVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.dh.c m26382() {
        int i = Camera2StreamConfigurationMap + 51;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.dh.c cVar = this.getHighSpeedVideoFpsRangesFor;
        int i3 = ((i2 | 65) << 1) - (i2 ^ 65);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            return cVar;
        }
        throw null;
    }

    public ma(util.h.xy.dh.i iVar, util.h.xy.dh.c cVar) {
        this.getHighSpeedVideoFpsRanges = iVar;
        this.getHighSpeedVideoFpsRangesFor = cVar;
        boolean z = true;
        if (cVar == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            return;
        }
        util.h.xy.dh.mi mo26279 = cVar.mo26279();
        if (!(mo26279 instanceof util.h.xy.dh.mz) && !(mo26279 instanceof util.h.xy.dh.aq) && !(mo26279 instanceof util.h.xy.dh.aa)) {
            z = false;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }
}

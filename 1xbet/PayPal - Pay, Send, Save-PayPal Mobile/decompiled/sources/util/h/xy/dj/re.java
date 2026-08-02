package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class re extends util.h.xy.dh.mh {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private util.h.xy.dh.rw getHighSpeedVideoFpsRangesFor;
    private util.h.xy.ed.a getHighSpeedVideoSizes;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        dVar.m26290(this.getHighSpeedVideoSizes);
        dVar.m26290(this.getHighSpeedVideoFpsRangesFor);
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i = getHighResolutionOutputSizeshNQ4ISI + 13;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return aaVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.dj.re m26407(java.lang.Object obj) {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (i + 37) % 128;
        if (obj instanceof util.h.xy.dj.re) {
            int i2 = (i + 23) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i2;
            util.h.xy.dj.re reVar = (util.h.xy.dj.re) obj;
            Camera2StreamConfigurationMap = ((i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
            return reVar;
        }
        if (obj == null) {
            return null;
        }
        util.h.xy.dj.re reVar2 = new util.h.xy.dj.re(util.h.xy.dh.l.m26303(obj));
        int i3 = Camera2StreamConfigurationMap + 77;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            return reVar2;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.dj.re m26408(util.h.xy.dh.mm mmVar, boolean z) {
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 7) % 128;
        util.h.xy.dj.re m26407 = m26407(util.h.xy.dh.l.m26304(mmVar, z));
        int i = ~((int) java.lang.System.currentTimeMillis());
        int i2 = -(-(((~(i | 1221252418)) | (-1775230444)) * (-241)));
        int i3 = (((i2 | 1882207103) << 1) - (i2 ^ 1882207103)) + 79003174;
        int i4 = (i ^ 1221252418) | (i & 1221252418);
        int i5 = ~((i4 ^ (-554141932)) | (i4 & (-554141932)));
        int i6 = ((i5 ^ 1221088512) | (i5 & 1221088512)) * 241;
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i7 = ~currentTimeMillis;
        int i8 = ~((i7 ^ (-1267947376)) | (i7 & (-1267947376)));
        int i9 = (i8 ^ 271354000) | (i8 & 271354000);
        int i10 = ~((1267947375 ^ currentTimeMillis) | (currentTimeMillis & 1267947375));
        int i11 = ((i9 ^ i10) | (i9 & i10)) * (-338);
        if (((i3 | i6) << 1) - (i6 ^ i3) <= ((((i11 & 1086947721) + (1086947721 | i11)) - 2125135426) - (~(((~((1539301375 ^ currentTimeMillis) | (currentTimeMillis & 1539301375))) | (~(i7 | (-1267947376)))) * 338))) - 1) {
            return m26407;
        }
        throw null;
    }

    private re(util.h.xy.dh.l lVar) {
        this.getHighSpeedVideoSizes = util.h.xy.ed.a.m26491(lVar.mo26287(0));
        this.getHighSpeedVideoFpsRangesFor = (util.h.xy.dh.rw) lVar.mo26287(1);
    }
}

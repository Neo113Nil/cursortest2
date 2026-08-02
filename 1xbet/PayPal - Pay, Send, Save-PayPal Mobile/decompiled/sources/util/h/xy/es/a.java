package util.h.xy.es;

/* loaded from: classes18.dex */
public final class a extends util.h.xy.dh.mh {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private int getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        dVar.m26290(new util.h.xy.dh.mz(this.getHighSpeedVideoSizes));
        if (this.getHighSpeedVideoFpsRangesFor != 12) {
            dVar.m26290(new util.h.xy.dh.f(this.getHighSpeedVideoFpsRangesFor));
        }
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i ^ 3) + ((i & 3) << 1)) % 128;
        return aaVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final int m26704() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 113) << 1) - (i ^ 113);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (((i3 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
        return i4;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m26705() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 89) << 1) - (i ^ 89);
        getHighSpeedVideoFpsRanges = i2 % 128;
        byte[] bArr = this.getHighSpeedVideoSizes;
        if (i2 % 2 != 0) {
            return util.h.xy.fb.a.m26821(bArr);
        }
        util.h.xy.fb.a.m26821(bArr);
        throw new java.lang.ArithmeticException();
    }

    public a(byte[] bArr, int i) {
        this.getHighSpeedVideoSizes = util.h.xy.fb.a.m26821(bArr);
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    private a(util.h.xy.dh.l lVar) {
        this.getHighSpeedVideoSizes = util.h.xy.dh.rh.m26335(lVar.mo26287(0)).m26337();
        this.getHighSpeedVideoFpsRangesFor = lVar.mo26286() == 2 ? util.h.xy.dh.f.m26291(lVar.mo26287(1)).m26293() : 12;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.es.a m26703(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 85) + ((i & 85) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!(obj instanceof util.h.xy.es.a)) {
            if (obj == null) {
                int i3 = i + 19;
                Camera2StreamConfigurationMap = i3 % 128;
                if (i3 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            util.h.xy.es.a aVar = new util.h.xy.es.a(util.h.xy.dh.l.m26303(obj));
            int i4 = getHighSpeedVideoFpsRanges;
            int i5 = (i4 ^ 67) + ((i4 & 67) << 1);
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 == 0) {
                return aVar;
            }
            throw null;
        }
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i6 = ~((1995145059 ^ currentTimeMillis) | (currentTimeMillis & 1995145059));
        int i7 = ~currentTimeMillis;
        int i8 = ~(i7 | (-810115332));
        int i9 = 1226080907 - (~(((i6 ^ i8) | (i6 & i8)) * 497));
        int i10 = (~((1950966019 ^ i7) | (i7 & 1950966019))) | 44179040;
        int i11 = ~((currentTimeMillis ^ (-810115332)) | (currentTimeMillis & (-810115332)));
        int i12 = -(-(((i11 ^ i10) | (i11 & i10)) * 497));
        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
        int i13 = ~(currentTimeMillis2 | 206911479);
        int i14 = -(-(((i13 ^ (-2057379786)) | (i13 & (-2057379786))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
        int i15 = ((i14 | 1132433899) << 1) - (i14 ^ 1132433899);
        int i16 = ~currentTimeMillis2;
        int i17 = ~((i16 ^ 206911479) | (i16 & 206911479));
        int i18 = ((i17 ^ (-2130001920)) | (i17 & (-2130001920))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
        util.h.xy.es.a aVar2 = (util.h.xy.es.a) obj;
        if (((i9 | i12) << 1) - (i12 ^ i9) > (i15 & i18) + (i18 | i15)) {
            return aVar2;
        }
        throw null;
    }
}

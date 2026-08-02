package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class rb extends util.h.xy.dh.mh {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private util.h.xy.dj.mc getHighSpeedVideoFpsRanges;
    private util.h.xy.ed.a getHighSpeedVideoFpsRangesFor;
    private util.h.xy.dh.f getHighSpeedVideoSizes;
    private util.h.xy.dh.rh getInputSizeshNQ4ISI;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(4);
        dVar.m26290(this.getHighSpeedVideoSizes);
        dVar.m26290(this.getHighSpeedVideoFpsRanges);
        dVar.m26290(this.getHighSpeedVideoFpsRangesFor);
        dVar.m26290(this.getInputSizeshNQ4ISI);
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 11) + ((i & 11) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return aaVar;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.ed.a m26399() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 107) + ((i & 107) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.dj.mc m26397() {
        int i = Camera2StreamConfigurationMap + 103;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return this.getHighSpeedVideoFpsRanges;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.dh.f m26398() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 95;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            return this.getHighSpeedVideoSizes;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.dj.rb m26395(java.lang.Object obj) {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 109) + ((i & 109) << 1)) % 128;
        if (!(obj instanceof util.h.xy.dj.rb)) {
            if (obj == null) {
                return null;
            }
            util.h.xy.dj.rb rbVar = new util.h.xy.dj.rb(util.h.xy.dh.l.m26303(obj));
            int i2 = Camera2StreamConfigurationMap;
            int i3 = (i2 ^ 109) + ((i2 & 109) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                return rbVar;
            }
            throw new java.lang.ArithmeticException();
        }
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i4 = ~((currentTimeMillis ^ (-1170033003)) | (currentTimeMillis & (-1170033003)));
        int i5 = -(-(((i4 ^ 1160841504) | (i4 & 1160841504)) * 336));
        int i6 = (i5 & 2000299859) + (i5 | 2000299859);
        int i7 = ~(currentTimeMillis | (-281867999));
        int i8 = ((i7 ^ 272676500) | (i7 & 272676500)) * (-168);
        int i9 = ~currentTimeMillis;
        int i10 = ~((i9 ^ (-281867999)) | (i9 & (-281867999)));
        int i11 = ~((int) java.lang.System.currentTimeMillis());
        int i12 = ~(((-111836745) ^ i11) | (i11 & (-111836745)));
        util.h.xy.dj.rb rbVar2 = (util.h.xy.dj.rb) obj;
        if (((((i6 | i8) << 1) - (i8 ^ i6)) - (~(((i10 ^ (-1170033003)) | (i10 & (-1170033003))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))) - 1 > (((((~((282860018 ^ i11) | (i11 & 282860018))) * (-560)) - 1815831911) - (~((~((385777658 ^ r3) | (r3 & 385777658))) * (-560)))) - 1) + (((8919104 ^ i12) | (i12 & 8919104)) * 560)) {
            return rbVar2;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.dj.rb m26396(util.h.xy.dh.mm mmVar, boolean z) {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 57) << 1) - (i ^ 57)) % 128;
        util.h.xy.dj.rb m26395 = m26395(util.h.xy.dh.l.m26304(mmVar, z));
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
        return m26395;
    }

    public rb(util.h.xy.dh.l lVar) {
        this.getHighSpeedVideoSizes = (util.h.xy.dh.f) lVar.mo26287(0);
        this.getHighSpeedVideoFpsRanges = util.h.xy.dj.mc.m26384(lVar.mo26287(1));
        this.getHighSpeedVideoFpsRangesFor = util.h.xy.ed.a.m26491(lVar.mo26287(2));
        this.getInputSizeshNQ4ISI = (util.h.xy.dh.rh) lVar.mo26287(3);
    }
}

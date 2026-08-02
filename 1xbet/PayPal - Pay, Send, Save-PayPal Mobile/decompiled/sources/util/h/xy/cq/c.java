package util.h.xy.cq;

/* loaded from: classes5.dex */
public final class c {
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private util.h.xy.ck.mb Camera2StreamConfigurationMap;
    private util.h.xy.ck.b getHighResolutionOutputSizeshNQ4ISI;
    private util.h.xy.ck.a getHighSpeedVideoFpsRanges;
    private util.h.xy.ck.mc getHighSpeedVideoSizesFor;
    private util.h.xy.ck.ma getInputSizeshNQ4ISI;
    private final util.h.xy.cq.me getOutputFormats = new util.h.xy.cq.me(new java.lang.String(util.h.xy.ci.ra.m25931().m25933(util.h.xy.ci.mb.f1105)));

    static {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i & 15) + (i | 15)) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25997() {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 97) % 128;
        try {
            util.h.xy.cq.b.getHighResolutionOutputSizeshNQ4ISI();
            util.h.xy.cq.me meVar = this.getOutputFormats;
            if (meVar != null) {
                int i = getHighSpeedVideoSizes;
                int i2 = (i ^ 113) + ((i & 113) << 1);
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                if (i2 % 2 == 0) {
                    meVar.m26015();
                } else {
                    meVar.m26015();
                    throw new java.lang.ArithmeticException();
                }
            }
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 113) % 128;
        } catch (util.h.xy.ck.rc unused) {
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.ck.b m26002() {
        util.h.xy.ck.b bVar;
        synchronized (this) {
            int i = getHighSpeedVideoSizes;
            int i2 = (i & 11) + (i | 11);
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.cq.ra(this.getOutputFormats);
                    int i3 = getHighSpeedVideoFpsRangesFor + 47;
                    getHighSpeedVideoSizes = i3 % 128;
                    int i4 = i3 % 2;
                }
                bVar = this.getHighResolutionOutputSizeshNQ4ISI;
                int i5 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRangesFor = (((i5 | 105) << 1) - (i5 ^ 105)) % 128;
            } else {
                throw new java.lang.NullPointerException();
            }
        }
        return bVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.ck.mb m26000() {
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = ~identityHashCode;
        int i2 = ~(2045768659 | i);
        int i3 = ~(((-1476796929) ^ identityHashCode) | (identityHashCode & (-1476796929)));
        int i4 = (i2 ^ i3) | (i2 & i3);
        int i5 = ~((-537514049) | identityHashCode);
        int i6 = ((i4 ^ i5) | (i4 & i5)) * 765;
        int i7 = ~((i ^ 568971731) | (i & 568971731));
        int i8 = (((i6 ^ (-665294620)) + ((i6 & (-665294620)) << 1)) - (~(-(-((((-2045768660) ^ i7) | (i7 & (-2045768660))) * 1530))))) - 1;
        int i9 = (i ^ 1508254611) | (i & 1508254611);
        int i10 = -(-(((~((identityHashCode ^ 568971731) | (identityHashCode & 568971731))) | (~((i9 ^ (-568971732)) | (i9 & (-568971732))))) * 765));
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i11 = ~identityHashCode2;
        int i12 = ~(i11 | 1847980918);
        int i13 = (i12 ^ 272761857) | (i12 & 272761857);
        int i14 = ~((identityHashCode2 ^ (-1711644961)) | (identityHashCode2 & (-1711644961)));
        if (((i8 | i10) << 1) - (i10 ^ i8) > ((((i13 & i14) | (i13 ^ i14)) * 717) - 1889205252) + (((~(identityHashCode2 | 1847980918)) | (~((i11 ^ (-1711644961)) | (i11 & (-1711644961)))) | 272761857) * 717)) {
            throw new java.lang.ArithmeticException();
        }
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = new util.h.xy.cq.rc(this.getOutputFormats);
            int i15 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = ((i15 & 31) + (i15 | 31)) % 128;
        }
        util.h.xy.ck.mb mbVar = this.Camera2StreamConfigurationMap;
        int i16 = getHighSpeedVideoFpsRangesFor + 35;
        getHighSpeedVideoSizes = i16 % 128;
        if (i16 % 2 != 0) {
            return mbVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.ck.a m25998() {
        util.h.xy.ck.a aVar;
        synchronized (this) {
            int i = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = ((i & 55) + (i | 55)) % 128;
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = new util.h.xy.cq.rb(this.getOutputFormats);
                int i2 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRangesFor = ((i2 ^ 61) + ((i2 & 61) << 1)) % 128;
            }
            aVar = this.getHighSpeedVideoFpsRanges;
            int i3 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = ((i3 ^ 35) + ((i3 & 35) << 1)) % 128;
        }
        return aVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.ck.ma m25996() {
        util.h.xy.ck.ma maVar;
        synchronized (this) {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = ((i | 31) << 1) - (i ^ 31);
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.getInputSizeshNQ4ISI == null) {
                this.getInputSizeshNQ4ISI = new util.h.xy.cq.mc(this.getOutputFormats);
                int i3 = getHighSpeedVideoSizes;
                int i4 = (i3 ^ 41) + ((i3 & 41) << 1);
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                int i5 = i4 % 2;
            }
            maVar = this.getInputSizeshNQ4ISI;
            int i6 = getHighSpeedVideoSizes + 35;
            getHighSpeedVideoFpsRangesFor = i6 % 128;
            if (i6 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        return maVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final util.h.xy.ck.mc m25995() {
        util.h.xy.ck.mc mcVar;
        synchronized (this) {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = (i ^ 83) + ((i & 83) << 1);
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                if (this.getHighSpeedVideoSizesFor == null) {
                    this.getHighSpeedVideoSizesFor = new util.h.xy.cq.md(this.getOutputFormats);
                }
                mcVar = this.getHighSpeedVideoSizesFor;
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 115) % 128;
            } else {
                throw new java.lang.NullPointerException();
            }
        }
        return mcVar;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final boolean m25994() throws util.h.xy.ck.rc {
        try {
            boolean mo26034 = util.h.xy.ct.rc.m26047().mo26034(new java.lang.String(util.h.xy.ci.ra.m25931().m25933(util.h.xy.ci.mb.f1107), util.h.xy.al.ra.f846));
            int i = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = (((i | 117) << 1) - (i ^ 117)) % 128;
            return mo26034;
        } catch (java.io.UnsupportedEncodingException e) {
            throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1114, util.h.xy.al.ra.f480, e);
        } catch (util.h.xy.ct.mc e2) {
            throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1108, util.h.xy.al.ra.f507, e2);
        }
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final void m26001() throws util.h.xy.ck.rc {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i & 75) + (i | 75)) % 128;
        try {
            util.h.xy.ct.rc.m26047().mo26033(util.h.xy.ci.ra.m25931().m25933(util.h.xy.ci.mb.f1107));
            int i2 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = (((i2 | 11) << 1) - (i2 ^ 11)) % 128;
        } catch (util.h.xy.ct.mc e) {
            throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1108, util.h.xy.al.ra.f507, e);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final javax.net.ssl.HttpsURLConnection m25999(java.net.URL url) throws java.io.IOException, util.h.xy.ck.rc {
        util.h.xy.cq.d dVar = new util.h.xy.cq.d(url, this.getOutputFormats);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 35) % 128;
        return dVar;
    }
}

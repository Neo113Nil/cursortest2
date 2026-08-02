package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class aa extends util.h.xy.dh.l {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes;
    private int getHighResolutionOutputSizeshNQ4ISI;

    @Override // util.h.xy.dh.l, util.h.xy.dh.mi
    final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 77) + ((i & 77) << 1);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        getHighSpeedVideoSizes = (((i3 | 57) << 1) - (i3 ^ 57)) % 128;
        return this;
    }

    @Override // util.h.xy.dh.l, util.h.xy.dh.mi
    final util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        int i = (getHighSpeedVideoSizes + 27) % 128;
        getHighSpeedVideoFpsRanges = i;
        getHighSpeedVideoSizes = (((i | 37) << 1) - (i ^ 37)) % 128;
        return this;
    }

    @Override // util.h.xy.dh.l
    final util.h.xy.dh.rk getHighSpeedVideoSizes() {
        util.h.xy.dh.av avVar = new util.h.xy.dh.av(false, getInputFormats());
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 35) + ((i & 35) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return avVar;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.l
    final util.h.xy.dh.rh getOutputFormats() {
        util.h.xy.dh.mz mzVar = new util.h.xy.dh.mz(util.h.xy.dh.rr.getHighSpeedVideoFpsRangesFor(getOutputStallDuration()));
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = ((i ^ 99) + ((i & 99) << 1)) % 128;
        return mzVar;
    }

    @Override // util.h.xy.dh.l
    final util.h.xy.dh.rd getInputSizeshNQ4ISI() {
        util.h.xy.dh.rv rvVar = new util.h.xy.dh.rv(this);
        int i = getHighSpeedVideoSizes + 111;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return rvVar;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.l
    final util.h.xy.dh.ma getHighSpeedVideoFpsRanges() {
        util.h.xy.dh.rw rwVar = new util.h.xy.dh.rw(util.h.xy.dh.rq.getHighSpeedVideoSizes(getOutputMinFrameDuration()), false);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 125) % 128;
        return rwVar;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        rjVar.getHighSpeedVideoSizes(z, 48);
        util.h.xy.dh.z highResolutionOutputSizeshNQ4ISI = rjVar.getHighResolutionOutputSizeshNQ4ISI();
        int length = this.getHighSpeedVideoFpsRangesFor.length;
        int i = 0;
        if (this.getHighResolutionOutputSizeshNQ4ISI < 0) {
            int i2 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRanges = (((i2 | 99) << 1) - (i2 ^ 99)) % 128;
            if (length <= 16) {
                util.h.xy.dh.mi[] miVarArr = new util.h.xy.dh.mi[length];
                getHighSpeedVideoFpsRanges = ((i2 & 51) + (i2 | 51)) % 128;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = getHighSpeedVideoFpsRanges;
                    getHighSpeedVideoSizes = (((i5 | 15) << 1) - (i5 ^ 15)) % 128;
                    util.h.xy.dh.mi Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor[i3].mo26279().Camera2StreamConfigurationMap();
                    miVarArr[i3] = Camera2StreamConfigurationMap;
                    i4 = (i4 - (~Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(true))) - 1;
                    i3++;
                    int i6 = getHighSpeedVideoFpsRanges;
                    getHighSpeedVideoSizes = ((i6 & 117) + (i6 | 117)) % 128;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = i4;
                rjVar.getHighSpeedVideoFpsRanges(i4);
                int i7 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoSizes = (((i7 | 97) << 1) - (i7 ^ 97)) % 128;
                while (i < length) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 119) % 128;
                    miVarArr[i].getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, true);
                    int i8 = (i ^ (-26)) + ((i & (-26)) << 1);
                    i = (i8 & 27) + (i8 | 27);
                }
                return;
            }
        }
        rjVar.getHighSpeedVideoFpsRanges(getOutputSizes());
        int i9 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = ((i9 ^ 17) + ((i9 & 17) << 1)) % 128;
        while (i < length) {
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i10 = ~((identityHashCode ^ 370158323) | (identityHashCode & 370158323));
            int i11 = 1829972895 - (~(-(-(((i10 ^ 539623432) | (i10 & 539623432)) * 345))));
            int i12 = ~identityHashCode;
            int i13 = ~((370158323 ^ i12) | (i12 & 370158323));
            int i14 = ((i13 ^ 10384) | (i13 & 10384)) * 345;
            int i15 = -(-((~(identityHashCode | (-539623433))) * 345));
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i16 = ~((identityHashCode2 ^ 1731376527) | (identityHashCode2 & 1731376527));
            int i17 = ~((~identityHashCode2) | 1731376527);
            util.h.xy.dh.c[] cVarArr = this.getHighSpeedVideoFpsRangesFor;
            if ((((i11 & i14) + (i14 | i11)) - (~i15)) - 1 <= (((((1853179857 ^ i16) | (i16 & 1853179857)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 1794957025) - (~(((138756688 ^ i17) | (i17 & 138756688)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))) - 1) {
                cVarArr[i].mo26279().Camera2StreamConfigurationMap().getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, true);
                i += 85;
            } else {
                cVarArr[i].mo26279().Camera2StreamConfigurationMap().getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, true);
                i = (i & 1) + (i | 1);
            }
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) throws java.io.IOException {
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = ~identityHashCode;
        int i2 = (~((-2092054708) | i)) | 1009915904;
        int i3 = ~((i ^ (-1031527949)) | (i & (-1031527949)));
        int i4 = (((i3 ^ i2) | (i3 & i2)) * (-397)) - 122707354;
        int i5 = (i4 & (-1504655360)) + (i4 | (-1504655360));
        int i6 = (identityHashCode ^ 1009915904) | (identityHashCode & 1009915904);
        int i7 = ((i6 ^ (-2113666752)) | (i6 & (-2113666752))) * 397;
        int i8 = ~java.lang.System.identityHashCode(this);
        int i9 = (-1810442405) - (~(-(-(((~(i8 | 459413044)) | 1317039160) * 764))));
        int i10 = -(-(((~((i8 & 1317039160) | (1317039160 ^ i8))) | 291639812) * (-1528)));
        int outputSizes = getOutputSizes();
        if ((i5 ^ i7) + ((i7 & i5) << 1) <= (i9 & i10) + (i10 | i9) + (((~((i8 ^ 459413044) | (i8 & 459413044))) | 1440905740) * 764)) {
            return util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, outputSizes);
        }
        util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, outputSizes);
        throw null;
    }

    private int getOutputSizes() throws java.io.IOException {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 77;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI < 0) {
            getHighSpeedVideoSizes = (((i | 97) << 1) - (i ^ 97)) % 128;
            int length = this.getHighSpeedVideoFpsRangesFor.length;
            int i3 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoSizes = ((i3 & 21) + (i3 | 21)) % 128;
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5 = ((i5 | 1) << 1) - (i5 ^ 1)) {
                int i6 = -(-this.getHighSpeedVideoFpsRangesFor[i5].mo26279().Camera2StreamConfigurationMap().getHighSpeedVideoFpsRanges(true));
                i4 = ((i4 | i6) << 1) - (i4 ^ i6);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = i4;
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 19) % 128;
        }
        int i7 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i8 = getHighSpeedVideoFpsRanges + 31;
        getHighSpeedVideoSizes = i8 % 128;
        if (i8 % 2 == 0) {
            return i7;
        }
        throw new java.lang.ArithmeticException();
    }

    aa(util.h.xy.dh.c[] cVarArr, byte b) {
        super(cVarArr, false);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    public aa(util.h.xy.dh.c[] cVarArr) {
        super(cVarArr);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    public aa(util.h.xy.dh.d dVar) {
        super(dVar);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    public aa(util.h.xy.dh.c cVar) {
        super(cVar);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    public aa() {
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.dh.aa m26277(util.h.xy.dh.l lVar) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 99) + (i | 99);
        getHighSpeedVideoFpsRanges = i2 % 128;
        util.h.xy.dh.aa aaVar = (util.h.xy.dh.aa) lVar.Camera2StreamConfigurationMap();
        if (i2 % 2 != 0) {
            return aaVar;
        }
        throw null;
    }
}

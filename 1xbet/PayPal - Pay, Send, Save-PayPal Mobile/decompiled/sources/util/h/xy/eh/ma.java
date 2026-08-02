package util.h.xy.eh;

/* loaded from: classes5.dex */
public final class ma extends util.h.xy.eh.ra {
    private static int Camera2StreamConfigurationMap = -1231763813;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int[] getOutputMinFrameDuration;
    private int getOutputStallDurationlomOqCM;

    @Override // util.h.xy.fb.c
    /* renamed from: ᐝ */
    public final void mo26585(util.h.xy.fb.c cVar) {
        int i = getHighSpeedVideoFpsRangesFor + 51;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        getHighResolutionOutputSizeshNQ4ISI((util.h.xy.eh.ma) cVar);
        if (i % 2 != 0) {
            throw null;
        }
        int i2 = getHighSpeedVideoFpsRangesFor + 93;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // util.h.xy.fb.c
    /* renamed from: ʻ */
    public final util.h.xy.fb.c mo26581() {
        util.h.xy.eh.ma maVar = new util.h.xy.eh.ma(this);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 65) % 128;
        return maVar;
    }

    @Override // util.h.xy.eh.ra
    /* renamed from: ʼ */
    protected final void mo26582() {
        int i = this.getOutputFormats;
        int i2 = this.getHighSpeedVideoSizesFor;
        int i3 = this.getInputSizeshNQ4ISI;
        int i4 = this.getOutputStallDurationlomOqCM;
        int highSpeedVideoSizes = getHighSpeedVideoSizes(((i + getHighSpeedVideoSizes(i2, i3, i4)) + this.getOutputMinFrameDuration[0]) - 680876936, 7) + i2;
        int highSpeedVideoSizes2 = getHighSpeedVideoSizes(((i4 + getHighSpeedVideoSizes(highSpeedVideoSizes, i2, i3)) + this.getOutputMinFrameDuration[1]) - 389564586, 12) + highSpeedVideoSizes;
        int highSpeedVideoSizes3 = getHighSpeedVideoSizes(i3 + getHighSpeedVideoSizes(highSpeedVideoSizes2, highSpeedVideoSizes, i2) + this.getOutputMinFrameDuration[2] + 606105819, 17) + highSpeedVideoSizes2;
        int highSpeedVideoSizes4 = getHighSpeedVideoSizes(((i2 + getHighSpeedVideoSizes(highSpeedVideoSizes3, highSpeedVideoSizes2, highSpeedVideoSizes)) + this.getOutputMinFrameDuration[3]) - 1044525330, 22) + highSpeedVideoSizes3;
        int highSpeedVideoSizes5 = getHighSpeedVideoSizes(((highSpeedVideoSizes + getHighSpeedVideoSizes(highSpeedVideoSizes4, highSpeedVideoSizes3, highSpeedVideoSizes2)) + this.getOutputMinFrameDuration[4]) - 176418897, 7) + highSpeedVideoSizes4;
        int highSpeedVideoSizes6 = getHighSpeedVideoSizes(highSpeedVideoSizes2 + getHighSpeedVideoSizes(highSpeedVideoSizes5, highSpeedVideoSizes4, highSpeedVideoSizes3) + this.getOutputMinFrameDuration[5] + 1200080426, 12) + highSpeedVideoSizes5;
        int highSpeedVideoSizes7 = getHighSpeedVideoSizes(((highSpeedVideoSizes3 + getHighSpeedVideoSizes(highSpeedVideoSizes6, highSpeedVideoSizes5, highSpeedVideoSizes4)) + this.getOutputMinFrameDuration[6]) - 1473231341, 17) + highSpeedVideoSizes6;
        int highSpeedVideoSizes8 = getHighSpeedVideoSizes(((highSpeedVideoSizes4 + getHighSpeedVideoSizes(highSpeedVideoSizes7, highSpeedVideoSizes6, highSpeedVideoSizes5)) + this.getOutputMinFrameDuration[7]) - 45705983, 22) + highSpeedVideoSizes7;
        int highSpeedVideoSizes9 = getHighSpeedVideoSizes(highSpeedVideoSizes5 + getHighSpeedVideoSizes(highSpeedVideoSizes8, highSpeedVideoSizes7, highSpeedVideoSizes6) + this.getOutputMinFrameDuration[8] + 1770035416, 7) + highSpeedVideoSizes8;
        int highSpeedVideoSizes10 = getHighSpeedVideoSizes(((highSpeedVideoSizes6 + getHighSpeedVideoSizes(highSpeedVideoSizes9, highSpeedVideoSizes8, highSpeedVideoSizes7)) + this.getOutputMinFrameDuration[9]) - 1958414417, 12) + highSpeedVideoSizes9;
        int highSpeedVideoSizes11 = getHighSpeedVideoSizes(((highSpeedVideoSizes7 + getHighSpeedVideoSizes(highSpeedVideoSizes10, highSpeedVideoSizes9, highSpeedVideoSizes8)) + this.getOutputMinFrameDuration[10]) - 42063, 17) + highSpeedVideoSizes10;
        int highSpeedVideoSizes12 = getHighSpeedVideoSizes(((highSpeedVideoSizes8 + getHighSpeedVideoSizes(highSpeedVideoSizes11, highSpeedVideoSizes10, highSpeedVideoSizes9)) + this.getOutputMinFrameDuration[11]) - 1990404162, 22) + highSpeedVideoSizes11;
        int highSpeedVideoSizes13 = getHighSpeedVideoSizes(highSpeedVideoSizes9 + getHighSpeedVideoSizes(highSpeedVideoSizes12, highSpeedVideoSizes11, highSpeedVideoSizes10) + this.getOutputMinFrameDuration[12] + 1804603682, 7) + highSpeedVideoSizes12;
        int highSpeedVideoSizes14 = getHighSpeedVideoSizes(((highSpeedVideoSizes10 + getHighSpeedVideoSizes(highSpeedVideoSizes13, highSpeedVideoSizes12, highSpeedVideoSizes11)) + this.getOutputMinFrameDuration[13]) - 40341101, 12) + highSpeedVideoSizes13;
        int highSpeedVideoSizes15 = getHighSpeedVideoSizes(((highSpeedVideoSizes11 + getHighSpeedVideoSizes(highSpeedVideoSizes14, highSpeedVideoSizes13, highSpeedVideoSizes12)) + this.getOutputMinFrameDuration[14]) - 1502002290, 17) + highSpeedVideoSizes14;
        int highSpeedVideoSizes16 = getHighSpeedVideoSizes(highSpeedVideoSizes12 + getHighSpeedVideoSizes(highSpeedVideoSizes15, highSpeedVideoSizes14, highSpeedVideoSizes13) + this.getOutputMinFrameDuration[15] + 1236535329, 22) + highSpeedVideoSizes15;
        int highSpeedVideoSizes17 = getHighSpeedVideoSizes(((highSpeedVideoSizes13 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes16, highSpeedVideoSizes15, highSpeedVideoSizes14)) + this.getOutputMinFrameDuration[1]) - 165796510, 5) + highSpeedVideoSizes16;
        int highSpeedVideoSizes18 = getHighSpeedVideoSizes(((highSpeedVideoSizes14 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes17, highSpeedVideoSizes16, highSpeedVideoSizes15)) + this.getOutputMinFrameDuration[6]) - 1069501632, 9) + highSpeedVideoSizes17;
        int highSpeedVideoSizes19 = getHighSpeedVideoSizes(highSpeedVideoSizes15 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes18, highSpeedVideoSizes17, highSpeedVideoSizes16) + this.getOutputMinFrameDuration[11] + 643717713, 14) + highSpeedVideoSizes18;
        int highSpeedVideoSizes20 = getHighSpeedVideoSizes(((highSpeedVideoSizes16 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes19, highSpeedVideoSizes18, highSpeedVideoSizes17)) + this.getOutputMinFrameDuration[0]) - 373897302, 20) + highSpeedVideoSizes19;
        int highSpeedVideoSizes21 = getHighSpeedVideoSizes(((highSpeedVideoSizes17 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes20, highSpeedVideoSizes19, highSpeedVideoSizes18)) + this.getOutputMinFrameDuration[5]) - 701558691, 5) + highSpeedVideoSizes20;
        int highSpeedVideoSizes22 = getHighSpeedVideoSizes(highSpeedVideoSizes18 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes21, highSpeedVideoSizes20, highSpeedVideoSizes19) + this.getOutputMinFrameDuration[10] + 38016083, 9) + highSpeedVideoSizes21;
        int highSpeedVideoSizes23 = getHighSpeedVideoSizes(((highSpeedVideoSizes19 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes22, highSpeedVideoSizes21, highSpeedVideoSizes20)) + this.getOutputMinFrameDuration[15]) - 660478335, 14) + highSpeedVideoSizes22;
        int highSpeedVideoSizes24 = getHighSpeedVideoSizes(((highSpeedVideoSizes20 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes23, highSpeedVideoSizes22, highSpeedVideoSizes21)) + this.getOutputMinFrameDuration[4]) - 405537848, 20) + highSpeedVideoSizes23;
        int highSpeedVideoSizes25 = getHighSpeedVideoSizes(highSpeedVideoSizes21 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes24, highSpeedVideoSizes23, highSpeedVideoSizes22) + this.getOutputMinFrameDuration[9] + 568446438, 5) + highSpeedVideoSizes24;
        int highSpeedVideoSizes26 = getHighSpeedVideoSizes(((highSpeedVideoSizes22 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes25, highSpeedVideoSizes24, highSpeedVideoSizes23)) + this.getOutputMinFrameDuration[14]) - 1019803690, 9) + highSpeedVideoSizes25;
        int highSpeedVideoSizes27 = getHighSpeedVideoSizes(((highSpeedVideoSizes23 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes26, highSpeedVideoSizes25, highSpeedVideoSizes24)) + this.getOutputMinFrameDuration[3]) - 187363961, 14) + highSpeedVideoSizes26;
        int highSpeedVideoSizes28 = getHighSpeedVideoSizes(highSpeedVideoSizes24 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes27, highSpeedVideoSizes26, highSpeedVideoSizes25) + this.getOutputMinFrameDuration[8] + 1163531501, 20) + highSpeedVideoSizes27;
        int highSpeedVideoSizes29 = getHighSpeedVideoSizes(((highSpeedVideoSizes25 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes28, highSpeedVideoSizes27, highSpeedVideoSizes26)) + this.getOutputMinFrameDuration[13]) - 1444681467, 5) + highSpeedVideoSizes28;
        int highSpeedVideoSizes30 = getHighSpeedVideoSizes(((highSpeedVideoSizes26 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes29, highSpeedVideoSizes28, highSpeedVideoSizes27)) + this.getOutputMinFrameDuration[2]) - 51403784, 9) + highSpeedVideoSizes29;
        int highSpeedVideoSizes31 = getHighSpeedVideoSizes(highSpeedVideoSizes27 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes30, highSpeedVideoSizes29, highSpeedVideoSizes28) + this.getOutputMinFrameDuration[7] + 1735328473, 14) + highSpeedVideoSizes30;
        int highSpeedVideoSizes32 = getHighSpeedVideoSizes(((highSpeedVideoSizes28 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes31, highSpeedVideoSizes30, highSpeedVideoSizes29)) + this.getOutputMinFrameDuration[12]) - 1926607734, 20) + highSpeedVideoSizes31;
        int i5 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i5 + 57) % 128;
        getHighSpeedVideoFpsRangesFor = (i5 + 81) % 128;
        int highSpeedVideoSizes33 = getHighSpeedVideoSizes(((highSpeedVideoSizes29 + ((highSpeedVideoSizes32 ^ highSpeedVideoSizes31) ^ highSpeedVideoSizes30)) + this.getOutputMinFrameDuration[5]) - 378558, 4) + highSpeedVideoSizes32;
        int i6 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i6 + 57) % 128;
        getHighSpeedVideoFpsRangesFor = (i6 + 81) % 128;
        int highSpeedVideoSizes34 = getHighSpeedVideoSizes(((highSpeedVideoSizes30 + ((highSpeedVideoSizes33 ^ highSpeedVideoSizes32) ^ highSpeedVideoSizes31)) + this.getOutputMinFrameDuration[8]) - 2022574463, 11) + highSpeedVideoSizes33;
        int i7 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i7 + 57) % 128;
        getHighSpeedVideoFpsRangesFor = (i7 + 81) % 128;
        int highSpeedVideoSizes35 = getHighSpeedVideoSizes(highSpeedVideoSizes31 + ((highSpeedVideoSizes34 ^ highSpeedVideoSizes33) ^ highSpeedVideoSizes32) + this.getOutputMinFrameDuration[11] + 1839030562, 16) + highSpeedVideoSizes34;
        int i8 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i8 + 57) % 128;
        getHighSpeedVideoFpsRangesFor = (i8 + 81) % 128;
        int highSpeedVideoSizes36 = getHighSpeedVideoSizes(((highSpeedVideoSizes32 + ((highSpeedVideoSizes35 ^ highSpeedVideoSizes34) ^ highSpeedVideoSizes33)) + this.getOutputMinFrameDuration[14]) - 35309556, 23) + highSpeedVideoSizes35;
        int i9 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i9 + 57) % 128;
        getHighSpeedVideoFpsRangesFor = (i9 + 81) % 128;
        int highSpeedVideoSizes37 = getHighSpeedVideoSizes(((highSpeedVideoSizes33 + ((highSpeedVideoSizes36 ^ highSpeedVideoSizes35) ^ highSpeedVideoSizes34)) + this.getOutputMinFrameDuration[1]) - 1530992060, 4) + highSpeedVideoSizes36;
        int i10 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i10 + 57) % 128;
        getHighSpeedVideoFpsRangesFor = (i10 + 81) % 128;
        int highSpeedVideoSizes38 = getHighSpeedVideoSizes(highSpeedVideoSizes34 + ((highSpeedVideoSizes37 ^ highSpeedVideoSizes36) ^ highSpeedVideoSizes35) + this.getOutputMinFrameDuration[4] + 1272893353, 11) + highSpeedVideoSizes37;
        int i11 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i11 + 57) % 128;
        getHighSpeedVideoFpsRangesFor = (i11 + 81) % 128;
        int highSpeedVideoSizes39 = getHighSpeedVideoSizes(((highSpeedVideoSizes35 + ((highSpeedVideoSizes38 ^ highSpeedVideoSizes37) ^ highSpeedVideoSizes36)) + this.getOutputMinFrameDuration[7]) - 155497632, 16) + highSpeedVideoSizes38;
        int i12 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i12 + 57) % 128;
        getHighSpeedVideoFpsRangesFor = (i12 + 81) % 128;
        int highSpeedVideoSizes40 = getHighSpeedVideoSizes(((highSpeedVideoSizes36 + ((highSpeedVideoSizes39 ^ highSpeedVideoSizes38) ^ highSpeedVideoSizes37)) + this.getOutputMinFrameDuration[10]) - 1094730640, 23) + highSpeedVideoSizes39;
        int i13 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i13 + 57) % 128;
        getHighSpeedVideoFpsRangesFor = (i13 + 81) % 128;
        int highSpeedVideoSizes41 = getHighSpeedVideoSizes(highSpeedVideoSizes37 + ((highSpeedVideoSizes40 ^ highSpeedVideoSizes39) ^ highSpeedVideoSizes38) + this.getOutputMinFrameDuration[13] + 681279174, 4) + highSpeedVideoSizes40;
        int i14 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i14 + 57) % 128;
        getHighSpeedVideoFpsRangesFor = (i14 + 81) % 128;
        int highSpeedVideoSizes42 = getHighSpeedVideoSizes(((highSpeedVideoSizes38 + ((highSpeedVideoSizes41 ^ highSpeedVideoSizes40) ^ highSpeedVideoSizes39)) + this.getOutputMinFrameDuration[0]) - 358537222, 11) + highSpeedVideoSizes41;
        int i15 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i15 + 57) % 128;
        getHighSpeedVideoFpsRangesFor = (i15 + 81) % 128;
        int highSpeedVideoSizes43 = getHighSpeedVideoSizes(((highSpeedVideoSizes39 + ((highSpeedVideoSizes42 ^ highSpeedVideoSizes41) ^ highSpeedVideoSizes40)) + this.getOutputMinFrameDuration[3]) - 722521979, 16) + highSpeedVideoSizes42;
        int i16 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i16 + 57) % 128;
        getHighSpeedVideoFpsRangesFor = (i16 + 81) % 128;
        int highSpeedVideoSizes44 = getHighSpeedVideoSizes(highSpeedVideoSizes40 + ((highSpeedVideoSizes43 ^ highSpeedVideoSizes42) ^ highSpeedVideoSizes41) + this.getOutputMinFrameDuration[6] + 76029189, 23) + highSpeedVideoSizes43;
        int i17 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i17 + 57) % 128;
        getHighSpeedVideoFpsRangesFor = (i17 + 81) % 128;
        int highSpeedVideoSizes45 = getHighSpeedVideoSizes(((highSpeedVideoSizes41 + ((highSpeedVideoSizes44 ^ highSpeedVideoSizes43) ^ highSpeedVideoSizes42)) + this.getOutputMinFrameDuration[9]) - 640364487, 4) + highSpeedVideoSizes44;
        int i18 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i18 + 57) % 128;
        getHighSpeedVideoFpsRangesFor = (i18 + 81) % 128;
        int highSpeedVideoSizes46 = getHighSpeedVideoSizes(((highSpeedVideoSizes42 + ((highSpeedVideoSizes45 ^ highSpeedVideoSizes44) ^ highSpeedVideoSizes43)) + this.getOutputMinFrameDuration[12]) - 421815835, 11) + highSpeedVideoSizes45;
        int i19 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i19 + 57) % 128;
        getHighSpeedVideoFpsRangesFor = (i19 + 81) % 128;
        int highSpeedVideoSizes47 = getHighSpeedVideoSizes(highSpeedVideoSizes43 + ((highSpeedVideoSizes46 ^ highSpeedVideoSizes45) ^ highSpeedVideoSizes44) + this.getOutputMinFrameDuration[15] + 530742520, 16) + highSpeedVideoSizes46;
        int i20 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i20 + 57) % 128;
        getHighSpeedVideoFpsRangesFor = (i20 + 81) % 128;
        int highSpeedVideoSizes48 = getHighSpeedVideoSizes(((highSpeedVideoSizes44 + ((highSpeedVideoSizes47 ^ highSpeedVideoSizes46) ^ highSpeedVideoSizes45)) + this.getOutputMinFrameDuration[2]) - 995338651, 23) + highSpeedVideoSizes47;
        int highSpeedVideoSizes49 = getHighSpeedVideoSizes(((highSpeedVideoSizes45 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes48, highSpeedVideoSizes47, highSpeedVideoSizes46)) + this.getOutputMinFrameDuration[0]) - 198630844, 6) + highSpeedVideoSizes48;
        int highSpeedVideoSizes50 = getHighSpeedVideoSizes(highSpeedVideoSizes46 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes49, highSpeedVideoSizes48, highSpeedVideoSizes47) + this.getOutputMinFrameDuration[7] + 1126891415, 10) + highSpeedVideoSizes49;
        int highSpeedVideoSizes51 = getHighSpeedVideoSizes(((highSpeedVideoSizes47 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes50, highSpeedVideoSizes49, highSpeedVideoSizes48)) + this.getOutputMinFrameDuration[14]) - 1416354905, 15) + highSpeedVideoSizes50;
        int highSpeedVideoSizes52 = getHighSpeedVideoSizes(((highSpeedVideoSizes48 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes51, highSpeedVideoSizes50, highSpeedVideoSizes49)) + this.getOutputMinFrameDuration[5]) - 57434055, 21) + highSpeedVideoSizes51;
        int highSpeedVideoSizes53 = getHighSpeedVideoSizes(highSpeedVideoSizes49 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes52, highSpeedVideoSizes51, highSpeedVideoSizes50) + this.getOutputMinFrameDuration[12] + 1700485571, 6) + highSpeedVideoSizes52;
        int highSpeedVideoSizes54 = getHighSpeedVideoSizes(((highSpeedVideoSizes50 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes53, highSpeedVideoSizes52, highSpeedVideoSizes51)) + this.getOutputMinFrameDuration[3]) - 1894986606, 10) + highSpeedVideoSizes53;
        int highSpeedVideoSizes55 = getHighSpeedVideoSizes(((highSpeedVideoSizes51 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes54, highSpeedVideoSizes53, highSpeedVideoSizes52)) + this.getOutputMinFrameDuration[10]) - 1051523, 15) + highSpeedVideoSizes54;
        int highSpeedVideoSizes56 = getHighSpeedVideoSizes(((highSpeedVideoSizes52 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes55, highSpeedVideoSizes54, highSpeedVideoSizes53)) + this.getOutputMinFrameDuration[1]) - 2054922799, 21) + highSpeedVideoSizes55;
        int highSpeedVideoSizes57 = getHighSpeedVideoSizes(highSpeedVideoSizes53 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes56, highSpeedVideoSizes55, highSpeedVideoSizes54) + this.getOutputMinFrameDuration[8] + 1873313359, 6) + highSpeedVideoSizes56;
        int highSpeedVideoSizes58 = getHighSpeedVideoSizes(((highSpeedVideoSizes54 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes57, highSpeedVideoSizes56, highSpeedVideoSizes55)) + this.getOutputMinFrameDuration[15]) - 30611744, 10) + highSpeedVideoSizes57;
        int highSpeedVideoSizes59 = getHighSpeedVideoSizes(((highSpeedVideoSizes55 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes58, highSpeedVideoSizes57, highSpeedVideoSizes56)) + this.getOutputMinFrameDuration[6]) - 1560198380, 15) + highSpeedVideoSizes58;
        int highSpeedVideoSizes60 = getHighSpeedVideoSizes(highSpeedVideoSizes56 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes59, highSpeedVideoSizes58, highSpeedVideoSizes57) + this.getOutputMinFrameDuration[13] + 1309151649, 21) + highSpeedVideoSizes59;
        int highSpeedVideoSizes61 = getHighSpeedVideoSizes(((highSpeedVideoSizes57 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes60, highSpeedVideoSizes59, highSpeedVideoSizes58)) + this.getOutputMinFrameDuration[4]) - 145523070, 6) + highSpeedVideoSizes60;
        int highSpeedVideoSizes62 = getHighSpeedVideoSizes(((highSpeedVideoSizes58 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes61, highSpeedVideoSizes60, highSpeedVideoSizes59)) + this.getOutputMinFrameDuration[11]) - 1120210379, 10) + highSpeedVideoSizes61;
        int highSpeedVideoSizes63 = getHighSpeedVideoSizes(highSpeedVideoSizes59 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes62, highSpeedVideoSizes61, highSpeedVideoSizes60) + this.getOutputMinFrameDuration[2] + 718787259, 15) + highSpeedVideoSizes62;
        int highSpeedVideoSizes64 = getHighSpeedVideoSizes(((highSpeedVideoSizes60 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes63, highSpeedVideoSizes62, highSpeedVideoSizes61)) + this.getOutputMinFrameDuration[9]) - 343485551, 21);
        this.getOutputFormats += highSpeedVideoSizes61;
        this.getHighSpeedVideoSizesFor += highSpeedVideoSizes64 + highSpeedVideoSizes63;
        this.getInputSizeshNQ4ISI += highSpeedVideoSizes63;
        this.getOutputStallDurationlomOqCM += highSpeedVideoSizes62;
        this.getInputFormats = 0;
        int i21 = 0;
        while (true) {
            int[] iArr = this.getOutputMinFrameDuration;
            if (i21 == iArr.length) {
                return;
            }
            int i22 = getHighResolutionOutputSizeshNQ4ISI;
            int i23 = i22 + 37;
            getHighSpeedVideoFpsRangesFor = i23 % 128;
            if (i23 % 2 == 0) {
                iArr[i21] = 0;
                i21 += 17;
            } else {
                iArr[i21] = 0;
                i21++;
            }
            getHighSpeedVideoFpsRangesFor = (i22 + 81) % 128;
        }
    }

    private static int getHighSpeedVideoFpsRangesFor(int i, int i2, int i3) {
        int i4 = (getHighResolutionOutputSizeshNQ4ISI + 37) % 128;
        getHighSpeedVideoFpsRangesFor = i4;
        getHighResolutionOutputSizeshNQ4ISI = (i4 + 49) % 128;
        return (i | (~i3)) ^ i2;
    }

    private static int getHighSpeedVideoFpsRanges(int i, int i2, int i3) {
        int i4 = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (i4 + 65) % 128;
        getHighResolutionOutputSizeshNQ4ISI = (i4 + 109) % 128;
        return (i & i3) | (i2 & (~i3));
    }

    private static int getHighSpeedVideoSizes(int i, int i2, int i3) {
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 63;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        return (i & i2) | (i3 & (~i));
    }

    private static int getHighSpeedVideoSizes(int i, int i2) {
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i3 + 39) % 128;
        getHighSpeedVideoFpsRangesFor = (i3 + 101) % 128;
        return (i << i2) | (i >>> (32 - i2));
    }

    @Override // util.h.xy.eh.ra, util.h.xy.ef.rd
    /* renamed from: ˏ */
    public final void mo26564() {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 63) % 128;
        super.mo26564();
        this.getOutputFormats = 1732584193;
        this.getHighSpeedVideoSizesFor = -271733879;
        this.getInputSizeshNQ4ISI = -1732584194;
        this.getOutputStallDurationlomOqCM = 271733878;
        this.getInputFormats = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.getOutputMinFrameDuration;
            if (i == iArr.length) {
                return;
            }
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 15;
            int i3 = i2 % 128;
            getHighSpeedVideoFpsRangesFor = i3;
            if (i2 % 2 == 0) {
                iArr[i] = 0;
                i += 111;
            } else {
                iArr[i] = 0;
                i++;
            }
            int i4 = i3 + 27;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 4;
            }
        }
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˏ */
    public final int mo26563(byte[] bArr, int i) {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 121) % 128;
        m26590();
        Camera2StreamConfigurationMap(this.getOutputFormats, bArr, i);
        Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor, bArr, i + 4);
        Camera2StreamConfigurationMap(this.getInputSizeshNQ4ISI, bArr, i + 8);
        Camera2StreamConfigurationMap(this.getOutputStallDurationlomOqCM, bArr, i + 12);
        mo26564();
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 1) % 128;
        return 16;
    }

    private static void Camera2StreamConfigurationMap(int i, byte[] bArr, int i2) {
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i3 + 79) % 128;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
        int i4 = i3 + 29;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.eh.ra
    /* renamed from: ᐝ */
    protected final void mo26584(long j) {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 41) % 128;
        if (this.getInputFormats > 14) {
            mo26582();
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 125) % 128;
        }
        int[] iArr = this.getOutputMinFrameDuration;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // util.h.xy.eh.ra
    /* renamed from: ˊ */
    protected final void mo26583(byte[] bArr, int i) {
        int[] iArr = this.getOutputMinFrameDuration;
        int i2 = this.getInputFormats;
        int i3 = i2 + 1;
        this.getInputFormats = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
            mo26582();
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 67) % 128;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ᐝ */
    public final int mo26565() {
        int i = getHighSpeedVideoFpsRangesFor + 115;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        return i % 2 != 0 ? 77 : 16;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˎ */
    public final java.lang.String mo26561() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i + 87) % 128;
        int i2 = (i + 115) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 35) % 128;
        try {
            int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 4;
            int keyRepeatTimeout = (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1;
            int bitsPerPixel = 78 - android.graphics.ImageFormat.getBitsPerPixel(0);
            int i3 = getHighSpeedVideoFpsRanges + 5;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                char[] charArray = "\ufff3\u000b\u0002".toCharArray();
                util.h.xz.b.ra raVar = new util.h.xz.b.ra();
                char[] cArr = new char[intValue];
                raVar.f2649 = 0;
                while (raVar.f2649 < intValue) {
                    raVar.f2650 = charArray[raVar.f2649];
                    cArr[raVar.f2649] = (char) (raVar.f2650 + bitsPerPixel);
                    int i4 = raVar.f2649;
                    cArr[i4] = (char) (cArr[i4] - ((int) (Camera2StreamConfigurationMap ^ (-4839292868003314026L))));
                    raVar.f2649++;
                }
                if (keyRepeatTimeout > 0) {
                    raVar.f2648 = keyRepeatTimeout;
                    char[] cArr2 = new char[intValue];
                    java.lang.System.arraycopy(cArr, 0, cArr2, 0, intValue);
                    java.lang.System.arraycopy(cArr2, 0, cArr, intValue - raVar.f2648, raVar.f2648);
                    java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, intValue - raVar.f2648);
                }
                return new java.lang.String(cArr).intern();
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.eh.ma maVar) {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 11) % 128;
        super.m26591(maVar);
        this.getOutputFormats = maVar.getOutputFormats;
        this.getHighSpeedVideoSizesFor = maVar.getHighSpeedVideoSizesFor;
        this.getInputSizeshNQ4ISI = maVar.getInputSizeshNQ4ISI;
        this.getOutputStallDurationlomOqCM = maVar.getOutputStallDurationlomOqCM;
        int[] iArr = maVar.getOutputMinFrameDuration;
        java.lang.System.arraycopy(iArr, 0, this.getOutputMinFrameDuration, 0, iArr.length);
        this.getInputFormats = maVar.getInputFormats;
        int i = getHighSpeedVideoFpsRangesFor + 41;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public ma(util.h.xy.eh.ma maVar) {
        super(maVar);
        this.getOutputMinFrameDuration = new int[16];
        getHighResolutionOutputSizeshNQ4ISI(maVar);
    }

    public ma() {
        this.getOutputMinFrameDuration = new int[16];
        mo26564();
    }
}

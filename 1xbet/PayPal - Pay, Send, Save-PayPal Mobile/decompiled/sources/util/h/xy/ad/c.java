package util.h.xy.ad;

/* loaded from: classes5.dex */
final class c extends util.h.xy.ad.ra {
    private static int getHighSpeedVideoFpsRanges = 0;
    private int[] Camera2StreamConfigurationMap = new int[64];
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputSizes;
    private int getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    static final int[] getHighSpeedVideoSizes = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private static int getHighSpeedVideoFpsRangesFor = 1;

    public c() {
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // util.h.xy.ad.b
    public final int getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i ^ 125) + ((i & 125) << 1)) % 128;
        int i2 = (i ^ 1) + ((i & 1) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return 32;
        }
        throw null;
    }

    @Override // util.h.xy.ad.ra
    protected final void getHighSpeedVideoFpsRanges(byte[] bArr, int i) {
        int i2 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i2 | 19) << 1) - (i2 ^ 19)) % 128;
        int i3 = bArr[i] << com.google.common.base.Ascii.CAN;
        int i4 = (i ^ 35) + ((i & 35) << 1);
        int i5 = (i4 ^ (-34)) + ((i4 & (-34)) << 1);
        int i6 = (bArr[i5] & 255) << 16;
        int i7 = i5 + 1;
        int i8 = (i3 ^ i6) | (i3 & i6) | ((bArr[i7] & 255) << 8);
        int i9 = bArr[((i7 | 1) << 1) - (i7 ^ 1)] & 255;
        int[] iArr = this.Camera2StreamConfigurationMap;
        int i10 = this.getOutputMinFrameDuration;
        iArr[i10] = (i9 ^ i8) | (i9 & i8);
        int i11 = i10 + 1;
        this.getOutputMinFrameDuration = i11;
        if (i11 == 16) {
            getHighSpeedVideoFpsRangesFor = (i2 + 121) % 128;
            getHighSpeedVideoFpsRanges();
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 117) % 128;
        }
        int i12 = getHighSpeedVideoFpsRanges + 15;
        getHighSpeedVideoFpsRangesFor = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.ad.ra
    protected final void getHighSpeedVideoSizes(long j) {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i ^ 99) + ((i & 99) << 1)) % 128;
        if (this.getOutputMinFrameDuration > 14) {
            getHighSpeedVideoFpsRangesFor = (i + 87) % 128;
            getHighSpeedVideoFpsRanges();
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 125) % 128;
        }
        int[] iArr = this.Camera2StreamConfigurationMap;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // util.h.xy.ad.b
    public final int getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 113) % 128;
        Camera2StreamConfigurationMap();
        util.h.xy.ad.mc.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor, bArr, 0);
        util.h.xy.ad.mc.Camera2StreamConfigurationMap(this.getOutputFormats, bArr, 4);
        util.h.xy.ad.mc.Camera2StreamConfigurationMap(this.getOutputStallDuration, bArr, 8);
        util.h.xy.ad.mc.Camera2StreamConfigurationMap(this.getInputSizeshNQ4ISI, bArr, 12);
        util.h.xy.ad.mc.Camera2StreamConfigurationMap(this.getOutputStallDurationlomOqCM, bArr, 16);
        util.h.xy.ad.mc.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, bArr, 20);
        util.h.xy.ad.mc.Camera2StreamConfigurationMap(this.getInputFormats, bArr, 24);
        util.h.xy.ad.mc.Camera2StreamConfigurationMap(this.getOutputSizes, bArr, 28);
        getHighSpeedVideoFpsRangesFor();
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (((i2 | 79) << 1) - (i2 ^ 79)) % 128;
        return 32;
    }

    @Override // util.h.xy.ad.ra, util.h.xy.ad.b
    public final void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 59) % 128;
        super.getHighSpeedVideoFpsRangesFor();
        this.getHighSpeedVideoSizesFor = 1779033703;
        this.getOutputFormats = -1150833019;
        this.getOutputStallDuration = 1013904242;
        this.getInputSizeshNQ4ISI = -1521486534;
        this.getOutputStallDurationlomOqCM = 1359893119;
        this.getHighResolutionOutputSizeshNQ4ISI = -1694144372;
        this.getInputFormats = 528734635;
        this.getOutputSizes = 1541459225;
        this.getOutputMinFrameDuration = 0;
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i ^ 119) + ((i & 119) << 1)) % 128;
        int i2 = 0;
        while (true) {
            int[] iArr = this.Camera2StreamConfigurationMap;
            if (i2 == iArr.length) {
                break;
            }
            int i3 = getHighSpeedVideoFpsRangesFor + 23;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                iArr[i2] = 0;
                int i4 = ((i2 | 66) << 1) - (i2 ^ 66);
                i2 = (i4 ^ (-7)) + ((i4 & (-7)) << 1);
            } else {
                iArr[i2] = 0;
                i2++;
            }
        }
        int i5 = getHighSpeedVideoFpsRanges;
        int i6 = (i5 ^ 121) + ((i5 & 121) << 1);
        getHighSpeedVideoFpsRangesFor = i6 % 128;
        if (i6 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // util.h.xy.ad.ra
    protected final void getHighSpeedVideoFpsRanges() {
        int i;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 75) % 128;
        int i2 = 16;
        while (true) {
            i = 1;
            if (i2 > 63) {
                break;
            }
            int[] iArr = this.Camera2StreamConfigurationMap;
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(iArr[(i2 & (-2)) + (i2 | (-2))]);
            int[] iArr2 = this.Camera2StreamConfigurationMap;
            int i3 = -(-iArr2[(i2 & (-7)) + (i2 | (-7))]);
            int i4 = (highSpeedVideoFpsRanges ^ i3) + ((highSpeedVideoFpsRanges & i3) << 1);
            int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(iArr2[((i2 | (-15)) << 1) - (i2 ^ (-15))]);
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i5 = (highSpeedVideoFpsRangesFor * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION) + (i4 * (-903));
            int i6 = ~highSpeedVideoFpsRangesFor;
            int i7 = ~((i6 ^ identityHashCode) | (i6 & identityHashCode));
            int i8 = ~identityHashCode;
            int i9 = ~((i8 ^ i4) | (i8 & i4));
            int i10 = ((i7 ^ i9) | (i7 & i9)) * (-1808);
            int i11 = (i5 ^ i10) + ((i5 & i10) << 1);
            int i12 = ~i4;
            int i13 = ~(i6 | i12 | identityHashCode);
            int i14 = ~((i8 ^ highSpeedVideoFpsRangesFor) | (i8 & highSpeedVideoFpsRangesFor) | i4);
            int i15 = ((i13 ^ i14) | (i13 & i14)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN;
            int i16 = (i11 ^ i15) + ((i15 & i11) << 1);
            int i17 = (~((i6 & i4) | (i4 ^ i6))) | (~((identityHashCode ^ i12) | (i12 & identityHashCode)));
            int i18 = ~(highSpeedVideoFpsRangesFor | i8);
            int i19 = -(-(((i17 ^ i18) | (i17 & i18)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
            int i20 = (i16 & i19) + (i19 | i16);
            int i21 = -(-this.Camera2StreamConfigurationMap[i2 - 16]);
            iArr[i2] = (i20 & i21) + (i21 | i20);
            i2++;
            int i22 = getHighSpeedVideoFpsRangesFor + 21;
            getHighSpeedVideoFpsRanges = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 5 / 5;
            }
        }
        int i24 = this.getHighSpeedVideoSizesFor;
        int i25 = this.getOutputFormats;
        int i26 = this.getOutputStallDuration;
        int i27 = this.getInputSizeshNQ4ISI;
        int i28 = this.getOutputStallDurationlomOqCM;
        int i29 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i30 = this.getInputFormats;
        int i31 = this.getOutputSizes;
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 79) % 128;
        int i32 = 0;
        int i33 = 0;
        while (i32 < 8) {
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i28);
            int highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(i28, i29, i30);
            int i34 = (highResolutionOutputSizeshNQ4ISI ^ highSpeedVideoFpsRangesFor2) + ((highResolutionOutputSizeshNQ4ISI & highSpeedVideoFpsRangesFor2) << i);
            int[] iArr3 = getHighSpeedVideoSizes;
            int i35 = iArr3[i33];
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i36 = i35 * (-919);
            int i37 = i32;
            int i38 = -(-(i34 * (-919)));
            int i39 = (i36 ^ i38) + ((i36 & i38) << 1);
            int i40 = ~i35;
            int i41 = ~i34;
            int i42 = i30;
            int i43 = (i40 ^ i41) | (i40 & i41);
            int i44 = ~(i43 | identityHashCode2);
            int i45 = i28;
            int i46 = ~identityHashCode2;
            int i47 = (i41 ^ i46) | (i41 & i46);
            int i48 = i29;
            int i49 = ~((i47 ^ i35) | (i47 & i35));
            int i50 = ((i44 ^ i49) | (i49 & i44)) * 920;
            int i51 = ~i43;
            int i52 = ~(i40 | i46);
            int i53 = i40 | i41;
            int i54 = ~((i53 ^ i46) | (i53 & i46));
            int i55 = (i40 ^ i34) | (i40 & i34);
            int i56 = ~((i55 ^ identityHashCode2) | (i55 & identityHashCode2));
            int i57 = (i56 ^ i54) | (i54 & i56);
            int i58 = (i35 ^ i41) | (i35 & i41);
            int i59 = ~((i58 ^ identityHashCode2) | (i58 & identityHashCode2));
            int i60 = ((((((i39 | i50) << 1) - (i39 ^ i50)) + (((i51 ^ i52) | (i51 & i52)) * 920)) - (~(((i59 ^ i57) | (i59 & i57)) * 920))) - 1) + this.Camera2StreamConfigurationMap[i33];
            int identityHashCode3 = java.lang.System.identityHashCode(this);
            int i61 = i60 * 1773;
            int i62 = i31 * (-885);
            int i63 = (i61 & i62) + (i61 | i62);
            int i64 = ~i60;
            int i65 = ~i31;
            int i66 = ~((i64 & i65) | (i64 ^ i65));
            int i67 = ~((i65 & identityHashCode3) | (i65 ^ identityHashCode3));
            int i68 = (i66 & i67) | (i66 ^ i67);
            int i69 = ~identityHashCode3;
            int i70 = (i69 ^ i60) | (i69 & i60);
            int i71 = ~((i70 ^ i31) | (i70 & i31));
            int i72 = ((i68 & i71) | (i68 ^ i71)) * 886;
            int i73 = (((i63 | i72) << 1) - (i72 ^ i63)) + (((~((i69 & i31) | (i69 ^ i31))) | i60) * (-1772));
            int i74 = -(-((~i70) * 886));
            int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
            int i76 = i27 + i75;
            int Camera2StreamConfigurationMap = (Camera2StreamConfigurationMap(i24) - (~(-(-Camera2StreamConfigurationMap(i24, i25, i26))))) - 1;
            int i77 = (i75 & Camera2StreamConfigurationMap) + (Camera2StreamConfigurationMap | i75);
            int i78 = i33 + 1;
            int highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(i76);
            int i79 = -(-getHighSpeedVideoFpsRangesFor(i76, i45, i48));
            int i80 = (highResolutionOutputSizeshNQ4ISI2 ^ i79) + ((highResolutionOutputSizeshNQ4ISI2 & i79) << 1);
            int i81 = iArr3[i78];
            int identityHashCode4 = java.lang.System.identityHashCode(this);
            int i82 = i81 * (-419);
            int i83 = i80 * 421;
            int i84 = (((i82 ^ i83) + ((i82 & i83) << 1)) - (~(-(-((~((i80 ^ identityHashCode4) | (i80 & identityHashCode4))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))))) - 1;
            int i85 = ~i81;
            int i86 = ((i85 & i80) | (i80 ^ i85)) * (-420);
            int i87 = ((i84 | i86) << 1) - (i84 ^ i86);
            int i88 = ~identityHashCode4;
            int i89 = -(-(((~(i85 | (~i80))) | (~((i88 ^ i80) | (i88 & i80)))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
            int i90 = (i87 ^ i89) + ((i89 & i87) << 1);
            int i91 = this.Camera2StreamConfigurationMap[i78];
            int i92 = i42 + (((i90 | i91) << 1) - (i91 ^ i90));
            int identityHashCode5 = java.lang.System.identityHashCode(this);
            int i93 = i92 * 677;
            int i94 = -(-(i26 * (-675)));
            int i95 = (i92 ^ identityHashCode5) | (i92 & identityHashCode5);
            int i96 = ~i26;
            int i97 = (((i93 & i94) + (i93 | i94)) - (~(((i95 & i96) | (i95 ^ i96)) * (-676)))) - 1;
            int i98 = ~((i96 ^ i92) | (i96 & i92));
            int i99 = ~identityHashCode5;
            int i100 = ~(i99 | i92);
            int i101 = ((i98 ^ i100) | (i98 & i100)) * 676;
            int i102 = ~i92;
            int i103 = ~((i102 & i96) | (i102 ^ i96));
            int i104 = ~((i96 ^ i99) | (i99 & i96));
            int i105 = (i104 ^ i103) | (i103 & i104);
            int i106 = (i26 ^ i92) | (i26 & i92);
            int i107 = ~((identityHashCode5 ^ i106) | (identityHashCode5 & i106));
            int i108 = ((((i97 | i101) << 1) - (i101 ^ i97)) - (~(((i107 ^ i105) | (i107 & i105)) * 676))) - 1;
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i77);
            int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(i77, i24, i25);
            int i109 = i92 + (Camera2StreamConfigurationMap2 & Camera2StreamConfigurationMap3) + (Camera2StreamConfigurationMap2 | Camera2StreamConfigurationMap3);
            int i110 = i33 + 2;
            int highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(i108) + getHighSpeedVideoFpsRangesFor(i108, i76, i45);
            int i111 = iArr3[i110];
            int i112 = -(-((highResolutionOutputSizeshNQ4ISI3 ^ i111) + ((highResolutionOutputSizeshNQ4ISI3 & i111) << 1) + this.Camera2StreamConfigurationMap[i110]));
            int i113 = (i48 ^ i112) + ((i112 & i48) << 1);
            int identityHashCode6 = java.lang.System.identityHashCode(this);
            int i114 = i113 * 866;
            int i115 = i25 * (-864);
            int i116 = ~i25;
            int i117 = ~i113;
            int i118 = ~identityHashCode6;
            int i119 = ~((i117 ^ i118) | (i117 & i118));
            int i120 = (((i114 ^ i115) + ((i114 & i115) << 1)) - (~(((i119 & i116) | (i119 ^ i116)) * (-865)))) - 1;
            int i121 = (~((identityHashCode6 & i113) | (i113 ^ identityHashCode6))) * 865;
            int i122 = (i120 ^ i121) + ((i121 & i120) << 1);
            int i123 = ~((i116 ^ i118) | (i116 & i118));
            int i124 = ~((i118 & i113) | (i118 ^ i113));
            int i125 = -(-(((i123 ^ i124) | (i124 & i123)) * 865));
            int i126 = (i122 & i125) + (i125 | i122);
            int Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(i109) + Camera2StreamConfigurationMap(i109, i77, i24);
            int i127 = ((i113 | Camera2StreamConfigurationMap4) << 1) - (Camera2StreamConfigurationMap4 ^ i113);
            int i128 = (i110 & (-40)) + (i110 | (-40)) + 41;
            int highResolutionOutputSizeshNQ4ISI4 = (getHighResolutionOutputSizeshNQ4ISI(i126) - (~(-(-getHighSpeedVideoFpsRangesFor(i126, i108, i76))))) - 1;
            int i129 = iArr3[i128];
            int i130 = (i45 - (~(-(-((((highResolutionOutputSizeshNQ4ISI4 & i129) + (highResolutionOutputSizeshNQ4ISI4 | i129)) - (~this.Camera2StreamConfigurationMap[i128])) - 1))))) - 1;
            int i131 = (i24 & i130) + (i24 | i130);
            int i132 = (i130 - (~(Camera2StreamConfigurationMap(i127) + Camera2StreamConfigurationMap(i127, i109, i77)))) - 1;
            int i133 = (i128 ^ 1) + ((i128 & 1) << 1);
            int highResolutionOutputSizeshNQ4ISI5 = getHighResolutionOutputSizeshNQ4ISI(i131) + getHighSpeedVideoFpsRangesFor(i131, i126, i108);
            int i134 = -(-iArr3[i133]);
            int i135 = ((highResolutionOutputSizeshNQ4ISI5 | i134) << 1) - (highResolutionOutputSizeshNQ4ISI5 ^ i134);
            int i136 = -(-this.Camera2StreamConfigurationMap[i133]);
            int i137 = (i135 ^ i136) + ((i136 & i135) << 1);
            int identityHashCode7 = java.lang.System.identityHashCode(this);
            int i138 = i137 * 319;
            int i139 = -(-(i76 * (-317)));
            int i140 = ~i76;
            int i141 = ~((~i137) | identityHashCode7);
            int i142 = (((i138 ^ i139) + ((i138 & i139) << 1)) - (~(((i140 ^ i141) | (i141 & i140)) * (-318)))) - 1;
            int i143 = ~identityHashCode7;
            int i144 = (i143 ^ i137) | (i143 & i137);
            int i145 = -(-(((~((i144 & i76) | (i144 ^ i76))) | (~((i140 ^ identityHashCode7) | (i140 & identityHashCode7)))) * 318));
            int i146 = (i143 ^ i140) | (i143 & i140);
            int i147 = ~((i146 ^ i137) | (i146 & i137));
            int i148 = (i76 ^ i137) | (i76 & i137);
            int i149 = ~((identityHashCode7 ^ i148) | (identityHashCode7 & i148));
            int i150 = (i142 ^ i145) + ((i145 & i142) << 1) + (((i149 ^ i147) | (i149 & i147)) * 318);
            int i151 = ((i77 | i150) << 1) - (i77 ^ i150);
            int Camera2StreamConfigurationMap5 = i150 + ((Camera2StreamConfigurationMap(i132) - (~(-(-Camera2StreamConfigurationMap(i132, i127, i109))))) - 1);
            int i152 = (i133 & 1) + (i133 | 1);
            int highResolutionOutputSizeshNQ4ISI6 = getHighResolutionOutputSizeshNQ4ISI(i151);
            int highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(i151, i131, i126);
            int identityHashCode8 = java.lang.System.identityHashCode(this);
            int i153 = (highSpeedVideoFpsRangesFor3 * 530) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO;
            int i154 = highResolutionOutputSizeshNQ4ISI6 * 530;
            int i155 = ~((~identityHashCode8) | highSpeedVideoFpsRangesFor3);
            int i156 = ~((highSpeedVideoFpsRangesFor3 ^ highResolutionOutputSizeshNQ4ISI6) | (highSpeedVideoFpsRangesFor3 & highResolutionOutputSizeshNQ4ISI6));
            int i157 = ~highResolutionOutputSizeshNQ4ISI6;
            int i158 = ~((highSpeedVideoFpsRangesFor3 & identityHashCode8) | (highSpeedVideoFpsRangesFor3 ^ identityHashCode8));
            int i159 = ((((i153 ^ i154) + ((i153 & i154) << 1)) - (~(((i156 & i155) | (i155 ^ i156)) * 529))) - 1) + (((i157 ^ i158) | (i157 & i158)) * 529);
            int i160 = -(-iArr3[i152]);
            int i161 = (i108 - (~(-(-(((i159 ^ i160) + ((i160 & i159) << 1)) + this.Camera2StreamConfigurationMap[i152]))))) - 1;
            int identityHashCode9 = java.lang.System.identityHashCode(this);
            int i162 = (i161 * 367) + (i109 * 367);
            int i163 = (i161 | i109) * (-366);
            int i164 = ((i162 | i163) << 1) - (i162 ^ i163);
            int i165 = ~i109;
            int i166 = ~((i165 & identityHashCode9) | (i165 ^ identityHashCode9));
            int i167 = ((i166 ^ i161) | (i166 & i161)) * (-366);
            int i168 = ~i161;
            int i169 = (i165 ^ i161) | (i165 & i161);
            int i170 = (((~((i109 & i168) | (i168 ^ i109))) | (~((identityHashCode9 ^ i169) | (identityHashCode9 & i169)))) * 366) + (((i164 | i167) << 1) - (i167 ^ i164));
            int Camera2StreamConfigurationMap6 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap5);
            int Camera2StreamConfigurationMap7 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap5, i132, i127);
            int i171 = ((Camera2StreamConfigurationMap6 | Camera2StreamConfigurationMap7) << 1) - (Camera2StreamConfigurationMap6 ^ Camera2StreamConfigurationMap7);
            int identityHashCode10 = java.lang.System.identityHashCode(this);
            int i172 = ~i171;
            int i173 = (((i171 * (-716)) + (i161 * 1435)) - (~(-(-(((i161 ^ i172) | (i161 & i172)) * (-1434)))))) - 1;
            int i174 = ~identityHashCode10;
            int i175 = ~(i174 | i161);
            int i176 = ~((i171 ^ i161) | (i171 & i161));
            int i177 = (i175 ^ i176) | (i176 & i175);
            int i178 = (i172 & i168) | (i172 ^ i168);
            int i179 = ~((i178 ^ identityHashCode10) | (i178 & identityHashCode10));
            int i180 = ((i177 & i179) | (i177 ^ i179)) * 717;
            int i181 = ~((i178 ^ i174) | (i178 & i174));
            int i182 = ~(i171 | i161);
            int i183 = (i181 ^ i182) | (i181 & i182);
            int i184 = ~((identityHashCode10 ^ i161) | (identityHashCode10 & i161));
            i26 = (((i173 | i180) << 1) - (i180 ^ i173)) + (((i184 ^ i183) | (i183 & i184)) * 717);
            int i185 = ((i152 | 1) << 1) - (i152 ^ 1);
            int highResolutionOutputSizeshNQ4ISI7 = getHighResolutionOutputSizeshNQ4ISI(i170);
            int highSpeedVideoFpsRangesFor4 = getHighSpeedVideoFpsRangesFor(i170, i151, i131);
            int identityHashCode11 = java.lang.System.identityHashCode(this);
            int i186 = highSpeedVideoFpsRangesFor4 * 569;
            int i187 = -(-(highResolutionOutputSizeshNQ4ISI7 * 569));
            int i188 = (i186 ^ i187) + ((i186 & i187) << 1);
            int i189 = ~highSpeedVideoFpsRangesFor4;
            int i190 = ~highResolutionOutputSizeshNQ4ISI7;
            int i191 = (i189 ^ i190) | (i189 & i190);
            int i192 = ~i191;
            int i193 = ~identityHashCode11;
            int i194 = ~(i189 | i193);
            int i195 = (i192 ^ i194) | (i194 & i192);
            int i196 = ~((i190 ^ i193) | (i190 & i193));
            int i197 = -(-(((i195 ^ i196) | (i195 & i196)) * (-1136)));
            int i198 = ~(i189 | identityHashCode11);
            int i199 = ~((i190 & identityHashCode11) | (i190 ^ identityHashCode11));
            int i200 = (i198 & i199) | (i198 ^ i199);
            int i201 = (highSpeedVideoFpsRangesFor4 ^ i193) | (highSpeedVideoFpsRangesFor4 & i193);
            int i202 = ~((i201 ^ highResolutionOutputSizeshNQ4ISI7) | (i201 & highResolutionOutputSizeshNQ4ISI7));
            int i203 = (((i188 ^ i197) + ((i197 & i188) << 1)) - (~(((i200 & i202) | (i200 ^ i202)) * (-568)))) - 1;
            int i204 = ~i201;
            int i205 = ~((highResolutionOutputSizeshNQ4ISI7 ^ i193) | (i193 & highResolutionOutputSizeshNQ4ISI7));
            int i206 = (i204 ^ i205) | (i204 & i205);
            int i207 = ~((i191 ^ identityHashCode11) | (i191 & identityHashCode11));
            int i208 = ((i206 ^ i207) | (i206 & i207)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION;
            int i209 = (i203 ^ i208) + ((i208 & i203) << 1);
            int i210 = iArr3[i185];
            int identityHashCode12 = java.lang.System.identityHashCode(this);
            int i211 = i210 * (-949);
            int i212 = i209 * (-949);
            int i213 = ~i209;
            int i214 = ~identityHashCode12;
            int i215 = ~((i213 ^ i214) | (i213 & i214));
            int i216 = ~((~i210) | identityHashCode12);
            int i217 = (i211 & i212) + (i211 | i212) + (((i215 ^ i216) | (i215 & i216)) * 1900);
            int i218 = -(-(((~(i214 | i210)) | (~((i209 ^ identityHashCode12) | (i209 & identityHashCode12)))) * (-950)));
            int i219 = (i217 ^ i218) + ((i218 & i217) << 1);
            int i220 = -(-(((~((i210 ^ identityHashCode12) | (i210 & identityHashCode12))) | (~((i209 ^ i214) | (i209 & i214)))) * 950));
            int i221 = (i219 & i220) + (i220 | i219);
            int i222 = this.Camera2StreamConfigurationMap[i185];
            int identityHashCode13 = java.lang.System.identityHashCode(this);
            int i223 = i222 * (-109);
            int i224 = -(-(i221 * 111));
            int i225 = ((i223 | i224) << 1) - (i223 ^ i224);
            int i226 = ~i222;
            int i227 = ~((identityHashCode13 ^ i221) | (identityHashCode13 & i221));
            int i228 = -(-(((i226 & i227) | (i226 ^ i227)) * (-220)));
            int i229 = (i225 & i228) + (i228 | i225);
            int i230 = ~((i222 ^ i221) | (i222 & i221));
            int i231 = ((i227 ^ i230) | (i227 & i230)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
            int i232 = (i229 ^ i231) + ((i231 & i229) << 1);
            int i233 = ~(i226 | i221);
            int i234 = ~(i222 | (~i221));
            int i235 = ((i234 ^ i233) | (i234 & i233)) * 110;
            int i236 = i126 + (((i232 | i235) << 1) - (i235 ^ i232));
            int i237 = (i127 - (~(-(-i236)))) - 1;
            int Camera2StreamConfigurationMap8 = Camera2StreamConfigurationMap(i26);
            int Camera2StreamConfigurationMap9 = Camera2StreamConfigurationMap(i26, Camera2StreamConfigurationMap5, i132);
            int identityHashCode14 = java.lang.System.identityHashCode(this);
            int i238 = Camera2StreamConfigurationMap9 * 624;
            int i239 = -(-(Camera2StreamConfigurationMap8 * (-622)));
            int i240 = ((i238 | i239) << 1) - (i238 ^ i239);
            int i241 = ~Camera2StreamConfigurationMap8;
            int i242 = i241 | Camera2StreamConfigurationMap9;
            int i243 = -(-((~((i242 ^ identityHashCode14) | (i242 & identityHashCode14))) * 623));
            int i244 = ((i240 | i243) << 1) - (i243 ^ i240);
            int i245 = ~identityHashCode14;
            int i246 = ~(Camera2StreamConfigurationMap8 | (~Camera2StreamConfigurationMap9));
            int i247 = ((i246 & i245) | (i245 ^ i246)) * (-623);
            int i248 = ~((i241 & Camera2StreamConfigurationMap9) | (i241 ^ Camera2StreamConfigurationMap9));
            int i249 = ~((i241 ^ identityHashCode14) | (i241 & identityHashCode14));
            int i250 = (i249 ^ i248) | (i248 & i249);
            int i251 = ~((Camera2StreamConfigurationMap9 ^ identityHashCode14) | (Camera2StreamConfigurationMap9 & identityHashCode14));
            int i252 = -(-((((i244 | i247) << 1) - (i247 ^ i244)) + (((i250 ^ i251) | (i250 & i251)) * 623)));
            int i253 = ((i236 & i252) << 1) + (i236 ^ i252);
            int i254 = i185 + 1;
            int highResolutionOutputSizeshNQ4ISI8 = getHighResolutionOutputSizeshNQ4ISI(i237);
            int i255 = -(-getHighSpeedVideoFpsRangesFor(i237, i170, i151));
            int i256 = (highResolutionOutputSizeshNQ4ISI8 & i255) + (highResolutionOutputSizeshNQ4ISI8 | i255);
            int i257 = iArr3[i254];
            int identityHashCode15 = java.lang.System.identityHashCode(this);
            int i258 = ((i257 * 471) - (~(i256 * 471))) - 1;
            int i259 = ((i257 ^ i256) | (i257 & i256)) * (-470);
            int i260 = (i258 & i259) + (i258 | i259);
            int i261 = ~i257;
            int i262 = ~i256;
            int i263 = ~((i261 & i262) | (i261 ^ i262));
            int i264 = ~(i262 | identityHashCode15);
            int i265 = (i263 ^ i264) | (i263 & i264);
            int i266 = ~identityHashCode15;
            int i267 = ~((i266 ^ i257) | (i266 & i257) | i256);
            int i268 = -(-(((i265 ^ i267) | (i267 & i265)) * (-470)));
            int i269 = (i262 ^ i257) | (i262 & i257);
            int i270 = ~((identityHashCode15 ^ i269) | (i269 & identityHashCode15));
            int i271 = i257 | i266;
            int i272 = ~((i271 ^ i256) | (i271 & i256));
            int i273 = -(-(((((i260 ^ i268) + ((i268 & i260) << 1)) - (~(-(-(((i270 & i272) | (i272 ^ i270)) * 470))))) - 1) + this.Camera2StreamConfigurationMap[i254]));
            int i274 = ((i131 | i273) << 1) - (i131 ^ i273);
            int identityHashCode16 = java.lang.System.identityHashCode(this);
            int i275 = ((i274 * (-665)) - (~(-(-(i132 * com.visa.cbp.getCertUsage.setODAData))))) - 1;
            int i276 = ~i274;
            int i277 = -(-(i276 * (-333)));
            int i278 = ((i275 | i277) << 1) - (i275 ^ i277);
            int i279 = ~identityHashCode16;
            int i280 = ((~(i276 | i279)) | (~(i132 | identityHashCode16))) * com.visa.cbp.getCertUsage.getODAData;
            int i281 = (i278 ^ i280) + ((i280 & i278) << 1);
            int i282 = ~((identityHashCode16 ^ i276) | (identityHashCode16 & i276));
            int i283 = ~((i279 ^ i132) | (i279 & i132));
            int i284 = ((i282 ^ i283) | (i282 & i283)) * com.visa.cbp.getCertUsage.getODAData;
            i28 = ((i281 | i284) << 1) - (i284 ^ i281);
            int Camera2StreamConfigurationMap10 = Camera2StreamConfigurationMap(i253);
            int Camera2StreamConfigurationMap11 = Camera2StreamConfigurationMap(i253, i26, Camera2StreamConfigurationMap5);
            int identityHashCode17 = java.lang.System.identityHashCode(this);
            int i285 = Camera2StreamConfigurationMap11 * (-432);
            int i286 = -(-(Camera2StreamConfigurationMap10 * 434));
            int i287 = (i285 ^ i286) + ((i285 & i286) << 1);
            int i288 = ~Camera2StreamConfigurationMap11;
            int i289 = ~identityHashCode17;
            int i290 = -(-((~((i289 & i288) | (i288 ^ i289) | Camera2StreamConfigurationMap10)) * 433));
            int i291 = ~Camera2StreamConfigurationMap10;
            int i292 = ~((i291 ^ identityHashCode17) | (i291 & identityHashCode17));
            int i293 = (((i287 & i290) + (i290 | i287)) - (~(((i288 ^ i292) | (i292 & i288)) * (-433)))) - 1;
            int i294 = ~((identityHashCode17 & i288) | (i288 ^ identityHashCode17));
            int i295 = ~((Camera2StreamConfigurationMap10 ^ Camera2StreamConfigurationMap11) | (Camera2StreamConfigurationMap10 & Camera2StreamConfigurationMap11));
            int i296 = -(-(((i295 ^ i294) | (i294 & i295)) * 433));
            int i297 = (i293 ^ i296) + ((i296 & i293) << 1);
            int i298 = ((i254 | 105) << 1) - (i254 ^ 105);
            i33 = (i298 & (-104)) + (i298 | (-104));
            i32 = i37 + 1;
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 21) % 128;
            i24 = (i297 | i274) + (i274 & i297);
            i31 = i151;
            i25 = i253;
            i27 = Camera2StreamConfigurationMap5;
            i30 = i170;
            i29 = i237;
            i = 1;
        }
        int i299 = i30;
        int i300 = i29;
        int i301 = i28;
        int i302 = this.getHighSpeedVideoSizesFor;
        int identityHashCode18 = java.lang.System.identityHashCode(this);
        int i303 = i24 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
        int i304 = i302 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
        int i305 = ~i24;
        int i306 = ~i302;
        int i307 = ~(i305 | i306);
        int i308 = ~identityHashCode18;
        int i309 = (i306 ^ i308) | (i306 & i308);
        int i310 = ~i309;
        int i311 = (i307 ^ i310) | (i307 & i310);
        int i312 = (i302 ^ i24) | (i302 & i24);
        int i313 = ~(identityHashCode18 | i312);
        int i314 = (((((i303 | i304) << 1) - (i303 ^ i304)) + (((i311 & i313) | (i311 ^ i313)) * (-252))) - (~(-(-(i312 * (-252)))))) - 1;
        int i315 = -(-(((~((i24 & i309) | (i309 ^ i24))) | i313) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE));
        this.getHighSpeedVideoSizesFor = ((i314 | i315) << 1) - (i315 ^ i314);
        int i316 = this.getOutputFormats;
        int identityHashCode19 = java.lang.System.identityHashCode(this);
        int i317 = i25 * (-919);
        int i318 = -(-(i316 * (-919)));
        int i319 = ~i25;
        int i320 = ~i316;
        int i321 = (i319 ^ i320) | (i319 & i320);
        int i322 = ~identityHashCode19;
        int i323 = ~i321;
        int i324 = i31;
        int i325 = ~((i319 ^ i322) | (i319 & i322));
        int i326 = -(-(((i323 ^ i325) | (i325 & i323)) * 920));
        int i327 = i319 | i320;
        int i328 = ~((i327 & i322) | (i327 ^ i322));
        int i329 = i316 | i319;
        int i330 = ~((i329 ^ identityHashCode19) | (i329 & identityHashCode19));
        int i331 = (i330 ^ i328) | (i328 & i330);
        int i332 = ~((i320 ^ i25) | (i25 & i320) | identityHashCode19);
        this.getOutputFormats = ((((((i317 & i318) + (i317 | i318)) + (((~((identityHashCode19 ^ i321) | (i321 & identityHashCode19))) | (~(i25 | ((i320 ^ i322) | (i320 & i322))))) * 920)) - (~i326)) - 1) - (~(-(-(((i331 ^ i332) | (i331 & i332)) * 920))))) - 1;
        int i333 = this.getOutputStallDuration;
        int i334 = -(-i26);
        this.getOutputStallDuration = (i333 & i334) + (i333 | i334);
        int i335 = this.getInputSizeshNQ4ISI;
        int identityHashCode20 = java.lang.System.identityHashCode(this);
        int i336 = i27 * (-563);
        int i337 = i335 * 565;
        int i338 = ~i27;
        int i339 = ~i335;
        int i340 = ~identityHashCode20;
        int i341 = ~((i339 ^ i340) | (i339 & i340));
        int i342 = (i341 ^ i338) | (i338 & i341);
        int i343 = ~((i335 ^ identityHashCode20) | (i335 & identityHashCode20));
        int i344 = (((i336 | i337) << 1) - (i336 ^ i337)) + (((i342 & i343) | (i342 ^ i343)) * (-564));
        int i345 = (i338 ^ i335) | (i338 & i335);
        int i346 = -(-((~((identityHashCode20 ^ i345) | (i345 & identityHashCode20))) * 1128));
        int i347 = (i344 ^ i346) + ((i346 & i344) << 1);
        int i348 = ~((i340 & i338) | (i338 ^ i340));
        int i349 = ~((i335 ^ i27) | (i335 & i27));
        int i350 = ((i349 ^ i348) | (i349 & i348)) * 564;
        this.getInputSizeshNQ4ISI = (i347 ^ i350) + ((i350 & i347) << 1);
        int i351 = this.getOutputStallDurationlomOqCM;
        int identityHashCode21 = java.lang.System.identityHashCode(this);
        int i352 = (i301 * 860) + (i351 * (-858)) + ((i301 | identityHashCode21) * (-859));
        int i353 = ~identityHashCode21;
        int i354 = ~i351;
        int i355 = (~i301) | i354;
        int i356 = -(-(((~((identityHashCode21 ^ i355) | (identityHashCode21 & i355))) | (~(i353 | i301))) * 859));
        int i357 = ~((i353 & i354) | (i354 ^ i353));
        int i358 = ~((i354 ^ i301) | (i354 & i301));
        this.getOutputStallDurationlomOqCM = (((i352 ^ i356) + ((i356 & i352) << 1)) - (~(-(-(((i358 ^ i357) | (i358 & i357)) * 859))))) - 1;
        this.getHighResolutionOutputSizeshNQ4ISI = (this.getHighResolutionOutputSizeshNQ4ISI - (~i300)) - 1;
        int i359 = this.getInputFormats;
        int i360 = -(-i299);
        this.getInputFormats = ((i359 | i360) << 1) - (i359 ^ i360);
        int i361 = this.getOutputSizes;
        int identityHashCode22 = java.lang.System.identityHashCode(this);
        int i362 = (i324 * (-1965)) + (i361 * 984);
        int i363 = ~i361;
        int i364 = -(-((i324 | i363) * 983));
        int i365 = (i362 & i364) + (i364 | i362);
        int i366 = ~i324;
        int i367 = ~identityHashCode22;
        int i368 = ~((i363 ^ i367) | (i363 & i367));
        int i369 = ((i368 ^ i366) | (i366 & i368)) * (-983);
        int i370 = ((i365 | i369) << 1) - (i369 ^ i365);
        int i371 = ~(i367 | i366);
        int i372 = ~((i361 ^ i366) | (i361 & i366));
        int i373 = -(-(((i372 ^ i371) | (i372 & i371)) * 983));
        this.getOutputSizes = (i370 & i373) + (i373 | i370);
        this.getOutputMinFrameDuration = 0;
        int i374 = 0;
        while (i374 < 16) {
            int i375 = getHighSpeedVideoFpsRanges + 49;
            getHighSpeedVideoFpsRangesFor = i375 % 128;
            if (i375 % 2 == 0) {
                this.Camera2StreamConfigurationMap[i374] = 1;
                int i376 = i374 + 131;
                i374 = (i376 ^ (-93)) + ((i376 & (-93)) << 1);
            } else {
                this.Camera2StreamConfigurationMap[i374] = 0;
                i374++;
            }
        }
        int i377 = getHighSpeedVideoFpsRanges + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoFpsRangesFor = i377 % 128;
        if (i377 % 2 == 0) {
            throw null;
        }
    }

    private static int getHighSpeedVideoFpsRangesFor(int i, int i2, int i3) {
        int i4 = (getHighSpeedVideoFpsRangesFor + 71) % 128;
        getHighSpeedVideoFpsRanges = i4;
        getHighSpeedVideoFpsRangesFor = (((i4 | 37) << 1) - (i4 ^ 37)) % 128;
        return (i & i2) ^ (i3 & (~i));
    }

    private static int Camera2StreamConfigurationMap(int i, int i2, int i3) {
        int i4 = getHighSpeedVideoFpsRanges;
        int i5 = ((i4 & 35) + (i4 | 35)) % 128;
        getHighSpeedVideoFpsRangesFor = i5;
        int i6 = i & i2;
        int i7 = i & i3;
        int i8 = ((~i7) & i6) | ((~i6) & i7);
        int i9 = i2 & i3;
        getHighSpeedVideoFpsRanges = ((i5 & 67) + (i5 | 67)) % 128;
        return (i8 & (~i9)) | ((~i8) & i9);
    }

    private static int Camera2StreamConfigurationMap(int i) {
        int i2;
        int i3;
        int i4;
        int i5 = getHighSpeedVideoFpsRangesFor;
        int i6 = (i5 ^ 49) + ((i5 & 49) << 1);
        int i7 = i6 % 128;
        getHighSpeedVideoFpsRanges = i7;
        if (i6 % 2 != 0) {
            int i8 = (((i | (-4)) << 1) - (i ^ (-4))) | (i + 54);
            int i9 = i >>> 106;
            int i10 = ((i | 14) << 1) - (i ^ 14);
            int i11 = (i9 ^ i10) | (i9 & i10);
            i2 = (i8 & (~i11)) | ((~i8) & i11);
            i3 = i << 115;
            i4 = i % 42;
        } else {
            int i12 = (i >>> 2) | (i << 30);
            int i13 = i >>> 13;
            int i14 = i << 19;
            int i15 = (i13 ^ i14) | (i13 & i14);
            i2 = (i12 & (~i15)) | ((~i12) & i15);
            i3 = i >>> 22;
            i4 = i << 10;
        }
        int i16 = (i4 ^ i3) | (i4 & i3);
        int i17 = (i7 & 79) + (i7 | 79);
        getHighSpeedVideoFpsRangesFor = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
        return (~(i16 & i2)) & (i16 | i2);
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int i) {
        int i2;
        int i3;
        int i4;
        int i5 = getHighSpeedVideoFpsRanges + 93;
        getHighSpeedVideoFpsRangesFor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = i * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            int i7 = i >>> 88;
            int i8 = i * 22;
            int i9 = i >> 66;
            i2 = ((i6 ^ i7) | (i6 & i7)) ^ ((i8 & i9) | (i8 ^ i9));
            i3 = i % 67;
            i4 = i % 73;
        } else {
            int i10 = i >>> 6;
            int i11 = i << 26;
            int i12 = (i10 ^ i11) | (i10 & i11);
            int i13 = i >>> 11;
            int i14 = i << 21;
            int i15 = (i13 ^ i14) | (i13 & i14);
            i2 = (i12 & (~i15)) | ((~i12) & i15);
            i3 = i >>> 25;
            i4 = i << 7;
        }
        int i16 = (i4 ^ i3) | (i4 & i3);
        return (~(i16 & i2)) & (i16 | i2);
    }

    private static int getHighSpeedVideoFpsRangesFor(int i) {
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = (i2 ^ 71) + ((i2 & 71) << 1);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = (i >>> 7) | (i << 25);
            int i5 = i >>> 18;
            int i6 = i << 14;
            int i7 = (i5 ^ i6) | (i5 & i6);
            return (i >>> 3) ^ ((~(i4 & i7)) & (i4 | i7));
        }
        int i8 = ((i | (-118)) << 1) - (i ^ (-118));
        int i9 = i >>> 110;
        int i10 = (i8 ^ i9) | (i8 & i9);
        int i11 = i % 39;
        int i12 = i >>> 40;
        int i13 = (i11 ^ i12) | (i11 & i12);
        int i14 = (~(i10 & i13)) & (i10 | i13);
        int i15 = i * 5;
        return (~(i15 & i14)) & (i15 | i14);
    }

    private static int getHighSpeedVideoFpsRanges(int i) {
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = (((i2 | 93) << 1) - (i2 ^ 93)) % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        int i4 = i >>> 17;
        int i5 = i << 15;
        int i6 = i >>> 19;
        int i7 = i << 13;
        int i8 = ((i4 ^ i5) | (i4 & i5)) ^ ((i6 & i7) | (i6 ^ i7));
        int i9 = i >>> 10;
        getHighSpeedVideoFpsRanges = (i3 + 15) % 128;
        return (~(i9 & i8)) & (i9 | i8);
    }

    static {
        int i = 1 % 2;
    }
}

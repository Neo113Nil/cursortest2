package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class RIPEMD160Digest extends org.bouncycastle.crypto.digests.GeneralDigest {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int[] getInputSizeshNQ4ISI;
    private int getOutputMinFrameDuration;

    private static int Camera2StreamConfigurationMap(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    private static int Camera2StreamConfigurationMap(int i, int i2, int i3) {
        return (i | (~i2)) ^ i3;
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    private static int getHighSpeedVideoFpsRanges(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private static int getHighSpeedVideoFpsRangesFor(int i, int i2, int i3) {
        return (i & i2) | (i3 & (~i));
    }

    private static int getHighSpeedVideoSizes(int i, int i2, int i3) {
        return i ^ (i2 | (~i3));
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        int i = this.Camera2StreamConfigurationMap;
        int i2 = this.getHighSpeedVideoSizes;
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i5 = this.getHighSpeedVideoFpsRanges;
        int[] iArr = this.getInputSizeshNQ4ISI;
        int i6 = iArr[0];
        int i7 = ((i2 ^ i3) ^ i4) + i + i6;
        int i8 = ((i7 << 11) | (i7 >>> 21)) + i5;
        int i9 = (i3 >>> 22) | (i3 << 10);
        int i10 = iArr[1];
        int i11 = ((i8 ^ i2) ^ i9) + i5 + i10;
        int i12 = ((i11 << 14) | (i11 >>> 18)) + i4;
        int i13 = (i2 >>> 22) | (i2 << 10);
        int i14 = iArr[2];
        int i15 = ((i12 ^ i8) ^ i13) + i4 + i14;
        int i16 = ((i15 >>> 17) | (i15 << 15)) + i9;
        int i17 = (i8 >>> 22) | (i8 << 10);
        int i18 = i9 + ((i16 ^ i12) ^ i17) + iArr[3];
        int i19 = ((i18 >>> 20) | (i18 << 12)) + i13;
        int i20 = (i12 >>> 22) | (i12 << 10);
        int i21 = iArr[4];
        int i22 = i13 + ((i19 ^ i16) ^ i20) + i21;
        int i23 = ((i22 >>> 27) | (i22 << 5)) + i17;
        int i24 = (i16 >>> 22) | (i16 << 10);
        int i25 = iArr[5];
        int i26 = i17 + ((i23 ^ i19) ^ i24) + i25;
        int i27 = ((i26 >>> 24) | (i26 << 8)) + i20;
        int i28 = (i19 >>> 22) | (i19 << 10);
        int i29 = iArr[6];
        int i30 = i20 + ((i27 ^ i23) ^ i28) + i29;
        int i31 = ((i30 >>> 25) | (i30 << 7)) + i24;
        int i32 = (i23 >>> 22) | (i23 << 10);
        int i33 = iArr[7];
        int i34 = i24 + ((i31 ^ i27) ^ i32) + i33;
        int i35 = ((i34 >>> 23) | (i34 << 9)) + i28;
        int i36 = (i27 >>> 22) | (i27 << 10);
        int i37 = iArr[8];
        int i38 = i28 + ((i35 ^ i31) ^ i36) + i37;
        int i39 = ((i38 >>> 21) | (i38 << 11)) + i32;
        int i40 = (i31 >>> 22) | (i31 << 10);
        int i41 = iArr[9];
        int i42 = i32 + ((i39 ^ i35) ^ i40) + i41;
        int i43 = ((i42 >>> 19) | (i42 << 13)) + i36;
        int i44 = (i35 >>> 22) | (i35 << 10);
        int i45 = i36 + ((i43 ^ i39) ^ i44) + iArr[10];
        int i46 = ((i45 >>> 18) | (i45 << 14)) + i40;
        int i47 = (i39 >>> 22) | (i39 << 10);
        int i48 = iArr[11];
        int i49 = i40 + ((i46 ^ i43) ^ i47) + i48;
        int i50 = ((i49 >>> 17) | (i49 << 15)) + i44;
        int i51 = (i43 >>> 22) | (i43 << 10);
        int i52 = i44 + ((i50 ^ i46) ^ i51) + iArr[12];
        int i53 = ((i52 >>> 26) | (i52 << 6)) + i47;
        int i54 = (i46 >>> 22) | (i46 << 10);
        int i55 = iArr[13];
        int i56 = i47 + ((i53 ^ i50) ^ i54) + i55;
        int i57 = ((i56 >>> 25) | (i56 << 7)) + i51;
        int i58 = (i50 >>> 22) | (i50 << 10);
        int i59 = iArr[14];
        int i60 = i51 + ((i57 ^ i53) ^ i58) + i59;
        int i61 = ((i60 >>> 23) | (i60 << 9)) + i54;
        int i62 = (i53 >>> 22) | (i53 << 10);
        int i63 = iArr[15];
        int i64 = i54 + ((i61 ^ i57) ^ i62) + i63;
        int i65 = ((i64 >>> 24) | (i64 << 8)) + i58;
        int i66 = (i57 >>> 22) | (i57 << 10);
        int i67 = i + ((i3 | (~i4)) ^ i2) + i25 + 1352829926;
        int i68 = ((i67 << 8) | (i67 >>> 24)) + i5;
        int i69 = i5 + ((i2 | (~i9)) ^ i68) + i59 + 1352829926;
        int i70 = ((i69 >>> 23) | (i69 << 9)) + i4;
        int i71 = i4 + (((~i13) | i68) ^ i70) + i33 + 1352829926;
        int i72 = ((i71 << 9) | (i71 >>> 23)) + i9;
        int i73 = (i68 << 10) | (i68 >>> 22);
        int i74 = i9 + (((~i73) | i70) ^ i72) + i6 + 1352829926;
        int i75 = ((i74 >>> 21) | (i74 << 11)) + i13;
        int i76 = (i70 << 10) | (i70 >>> 22);
        int i77 = i13 + (((~i76) | i72) ^ i75) + i41 + 1352829926;
        int i78 = ((i77 >>> 19) | (i77 << 13)) + i73;
        int i79 = (i72 << 10) | (i72 >>> 22);
        int i80 = i73 + (((~i79) | i75) ^ i78) + i14 + 1352829926;
        int i81 = ((i80 << 15) | (i80 >>> 17)) + i76;
        int i82 = (i75 << 10) | (i75 >>> 22);
        int i83 = i76 + (((~i82) | i78) ^ i81) + i48 + 1352829926;
        int i84 = ((i83 << 15) | (i83 >>> 17)) + i79;
        int i85 = (i78 << 10) | (i78 >>> 22);
        int i86 = i79 + (((~i85) | i81) ^ i84) + i21 + 1352829926;
        int i87 = ((i86 << 5) | (i86 >>> 27)) + i82;
        int i88 = (i81 << 10) | (i81 >>> 22);
        int i89 = i82 + (((~i88) | i84) ^ i87) + i55 + 1352829926;
        int i90 = ((i89 << 7) | (i89 >>> 25)) + i85;
        int i91 = (i84 << 10) | (i84 >>> 22);
        int i92 = i85 + (((~i91) | i87) ^ i90) + i29 + 1352829926;
        int i93 = ((i92 << 7) | (i92 >>> 25)) + i88;
        int i94 = (i87 << 10) | (i87 >>> 22);
        int i95 = i88 + (((~i94) | i90) ^ i93) + i63 + 1352829926;
        int i96 = ((i95 << 8) | (i95 >>> 24)) + i91;
        int i97 = (i90 << 10) | (i90 >>> 22);
        int i98 = i91 + (((~i97) | i93) ^ i96) + i37 + 1352829926;
        int i99 = ((i98 << 11) | (i98 >>> 21)) + i94;
        int i100 = (i93 >>> 22) | (i93 << 10);
        int i101 = i94 + (((~i100) | i96) ^ i99) + i10 + 1352829926;
        int i102 = ((i101 << 14) | (i101 >>> 18)) + i97;
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i96, 10);
        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i97 + getHighSpeedVideoSizes(i102, i99, Camera2StreamConfigurationMap) + this.getInputSizeshNQ4ISI[10] + 1352829926, 14) + i100;
        int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(i99, 10);
        int Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(i100 + getHighSpeedVideoSizes(Camera2StreamConfigurationMap2, i102, Camera2StreamConfigurationMap3) + this.getInputSizeshNQ4ISI[3] + 1352829926, 12) + Camera2StreamConfigurationMap;
        int Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap(i102, 10);
        int Camera2StreamConfigurationMap6 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap + getHighSpeedVideoSizes(Camera2StreamConfigurationMap4, Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap5) + this.getInputSizeshNQ4ISI[12] + 1352829926, 6) + Camera2StreamConfigurationMap3;
        int Camera2StreamConfigurationMap7 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2, 10);
        int Camera2StreamConfigurationMap8 = Camera2StreamConfigurationMap(i58 + getHighSpeedVideoFpsRangesFor(i65, i61, i66) + this.getInputSizeshNQ4ISI[7] + 1518500249, 7) + i62;
        int Camera2StreamConfigurationMap9 = Camera2StreamConfigurationMap(i61, 10);
        int Camera2StreamConfigurationMap10 = Camera2StreamConfigurationMap(i62 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap8, i65, Camera2StreamConfigurationMap9) + this.getInputSizeshNQ4ISI[4] + 1518500249, 6) + i66;
        int Camera2StreamConfigurationMap11 = Camera2StreamConfigurationMap(i65, 10);
        int Camera2StreamConfigurationMap12 = Camera2StreamConfigurationMap(i66 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap10, Camera2StreamConfigurationMap8, Camera2StreamConfigurationMap11) + this.getInputSizeshNQ4ISI[13] + 1518500249, 8) + Camera2StreamConfigurationMap9;
        int Camera2StreamConfigurationMap13 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap8, 10);
        int Camera2StreamConfigurationMap14 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap9 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap12, Camera2StreamConfigurationMap10, Camera2StreamConfigurationMap13) + this.getInputSizeshNQ4ISI[1] + 1518500249, 13) + Camera2StreamConfigurationMap11;
        int Camera2StreamConfigurationMap15 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap10, 10);
        int Camera2StreamConfigurationMap16 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap11 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap14, Camera2StreamConfigurationMap12, Camera2StreamConfigurationMap15) + this.getInputSizeshNQ4ISI[10] + 1518500249, 11) + Camera2StreamConfigurationMap13;
        int Camera2StreamConfigurationMap17 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap12, 10);
        int Camera2StreamConfigurationMap18 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap13 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap16, Camera2StreamConfigurationMap14, Camera2StreamConfigurationMap17) + this.getInputSizeshNQ4ISI[6] + 1518500249, 9) + Camera2StreamConfigurationMap15;
        int Camera2StreamConfigurationMap19 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap14, 10);
        int Camera2StreamConfigurationMap20 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap15 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap18, Camera2StreamConfigurationMap16, Camera2StreamConfigurationMap19) + this.getInputSizeshNQ4ISI[15] + 1518500249, 7) + Camera2StreamConfigurationMap17;
        int Camera2StreamConfigurationMap21 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap16, 10);
        int Camera2StreamConfigurationMap22 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap17 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap20, Camera2StreamConfigurationMap18, Camera2StreamConfigurationMap21) + this.getInputSizeshNQ4ISI[3] + 1518500249, 15) + Camera2StreamConfigurationMap19;
        int Camera2StreamConfigurationMap23 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap18, 10);
        int Camera2StreamConfigurationMap24 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap19 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap22, Camera2StreamConfigurationMap20, Camera2StreamConfigurationMap23) + this.getInputSizeshNQ4ISI[12] + 1518500249, 7) + Camera2StreamConfigurationMap21;
        int Camera2StreamConfigurationMap25 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap20, 10);
        int Camera2StreamConfigurationMap26 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap21 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap24, Camera2StreamConfigurationMap22, Camera2StreamConfigurationMap25) + this.getInputSizeshNQ4ISI[0] + 1518500249, 12) + Camera2StreamConfigurationMap23;
        int Camera2StreamConfigurationMap27 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap22, 10);
        int Camera2StreamConfigurationMap28 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap23 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap26, Camera2StreamConfigurationMap24, Camera2StreamConfigurationMap27) + this.getInputSizeshNQ4ISI[9] + 1518500249, 15) + Camera2StreamConfigurationMap25;
        int Camera2StreamConfigurationMap29 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap24, 10);
        int Camera2StreamConfigurationMap30 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap25 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap28, Camera2StreamConfigurationMap26, Camera2StreamConfigurationMap29) + this.getInputSizeshNQ4ISI[5] + 1518500249, 9) + Camera2StreamConfigurationMap27;
        int Camera2StreamConfigurationMap31 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap26, 10);
        int Camera2StreamConfigurationMap32 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap27 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap30, Camera2StreamConfigurationMap28, Camera2StreamConfigurationMap31) + this.getInputSizeshNQ4ISI[2] + 1518500249, 11) + Camera2StreamConfigurationMap29;
        int Camera2StreamConfigurationMap33 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap28, 10);
        int Camera2StreamConfigurationMap34 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap29 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap32, Camera2StreamConfigurationMap30, Camera2StreamConfigurationMap33) + this.getInputSizeshNQ4ISI[14] + 1518500249, 7) + Camera2StreamConfigurationMap31;
        int Camera2StreamConfigurationMap35 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap30, 10);
        int Camera2StreamConfigurationMap36 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap31 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap34, Camera2StreamConfigurationMap32, Camera2StreamConfigurationMap35) + this.getInputSizeshNQ4ISI[11] + 1518500249, 13) + Camera2StreamConfigurationMap33;
        int Camera2StreamConfigurationMap37 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap32, 10);
        int Camera2StreamConfigurationMap38 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap33 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap36, Camera2StreamConfigurationMap34, Camera2StreamConfigurationMap37) + this.getInputSizeshNQ4ISI[8] + 1518500249, 12) + Camera2StreamConfigurationMap35;
        int Camera2StreamConfigurationMap39 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap34, 10);
        int Camera2StreamConfigurationMap40 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap3 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap6, Camera2StreamConfigurationMap4, Camera2StreamConfigurationMap7) + this.getInputSizeshNQ4ISI[6] + 1548603684, 9) + Camera2StreamConfigurationMap5;
        int Camera2StreamConfigurationMap41 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap4, 10);
        int Camera2StreamConfigurationMap42 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap5 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap40, Camera2StreamConfigurationMap6, Camera2StreamConfigurationMap41) + this.getInputSizeshNQ4ISI[11] + 1548603684, 13) + Camera2StreamConfigurationMap7;
        int Camera2StreamConfigurationMap43 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap6, 10);
        int Camera2StreamConfigurationMap44 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap7 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap42, Camera2StreamConfigurationMap40, Camera2StreamConfigurationMap43) + this.getInputSizeshNQ4ISI[3] + 1548603684, 15) + Camera2StreamConfigurationMap41;
        int Camera2StreamConfigurationMap45 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap40, 10);
        int Camera2StreamConfigurationMap46 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap41 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap44, Camera2StreamConfigurationMap42, Camera2StreamConfigurationMap45) + this.getInputSizeshNQ4ISI[7] + 1548603684, 7) + Camera2StreamConfigurationMap43;
        int Camera2StreamConfigurationMap47 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap42, 10);
        int Camera2StreamConfigurationMap48 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap43 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap46, Camera2StreamConfigurationMap44, Camera2StreamConfigurationMap47) + this.getInputSizeshNQ4ISI[0] + 1548603684, 12) + Camera2StreamConfigurationMap45;
        int Camera2StreamConfigurationMap49 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap44, 10);
        int Camera2StreamConfigurationMap50 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap45 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap48, Camera2StreamConfigurationMap46, Camera2StreamConfigurationMap49) + this.getInputSizeshNQ4ISI[13] + 1548603684, 8) + Camera2StreamConfigurationMap47;
        int Camera2StreamConfigurationMap51 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap46, 10);
        int Camera2StreamConfigurationMap52 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap47 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap50, Camera2StreamConfigurationMap48, Camera2StreamConfigurationMap51) + this.getInputSizeshNQ4ISI[5] + 1548603684, 9) + Camera2StreamConfigurationMap49;
        int Camera2StreamConfigurationMap53 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap48, 10);
        int Camera2StreamConfigurationMap54 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap49 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap52, Camera2StreamConfigurationMap50, Camera2StreamConfigurationMap53) + this.getInputSizeshNQ4ISI[10] + 1548603684, 11) + Camera2StreamConfigurationMap51;
        int Camera2StreamConfigurationMap55 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap50, 10);
        int Camera2StreamConfigurationMap56 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap51 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap54, Camera2StreamConfigurationMap52, Camera2StreamConfigurationMap55) + this.getInputSizeshNQ4ISI[14] + 1548603684, 7) + Camera2StreamConfigurationMap53;
        int Camera2StreamConfigurationMap57 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap52, 10);
        int Camera2StreamConfigurationMap58 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap53 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap56, Camera2StreamConfigurationMap54, Camera2StreamConfigurationMap57) + this.getInputSizeshNQ4ISI[15] + 1548603684, 7) + Camera2StreamConfigurationMap55;
        int Camera2StreamConfigurationMap59 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap54, 10);
        int Camera2StreamConfigurationMap60 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap55 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap58, Camera2StreamConfigurationMap56, Camera2StreamConfigurationMap59) + this.getInputSizeshNQ4ISI[8] + 1548603684, 12) + Camera2StreamConfigurationMap57;
        int Camera2StreamConfigurationMap61 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap56, 10);
        int Camera2StreamConfigurationMap62 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap57 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap60, Camera2StreamConfigurationMap58, Camera2StreamConfigurationMap61) + this.getInputSizeshNQ4ISI[12] + 1548603684, 7) + Camera2StreamConfigurationMap59;
        int Camera2StreamConfigurationMap63 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap58, 10);
        int Camera2StreamConfigurationMap64 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap59 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap62, Camera2StreamConfigurationMap60, Camera2StreamConfigurationMap63) + this.getInputSizeshNQ4ISI[4] + 1548603684, 6) + Camera2StreamConfigurationMap61;
        int Camera2StreamConfigurationMap65 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap60, 10);
        int Camera2StreamConfigurationMap66 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap61 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap64, Camera2StreamConfigurationMap62, Camera2StreamConfigurationMap65) + this.getInputSizeshNQ4ISI[9] + 1548603684, 15) + Camera2StreamConfigurationMap63;
        int Camera2StreamConfigurationMap67 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap62, 10);
        int Camera2StreamConfigurationMap68 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap63 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap66, Camera2StreamConfigurationMap64, Camera2StreamConfigurationMap67) + this.getInputSizeshNQ4ISI[1] + 1548603684, 13) + Camera2StreamConfigurationMap65;
        int Camera2StreamConfigurationMap69 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap64, 10);
        int Camera2StreamConfigurationMap70 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap65 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap68, Camera2StreamConfigurationMap66, Camera2StreamConfigurationMap69) + this.getInputSizeshNQ4ISI[2] + 1548603684, 11) + Camera2StreamConfigurationMap67;
        int Camera2StreamConfigurationMap71 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap66, 10);
        int Camera2StreamConfigurationMap72 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap35 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap38, Camera2StreamConfigurationMap36, Camera2StreamConfigurationMap39) + this.getInputSizeshNQ4ISI[3] + 1859775393, 11) + Camera2StreamConfigurationMap37;
        int Camera2StreamConfigurationMap73 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap36, 10);
        int Camera2StreamConfigurationMap74 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap37 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap72, Camera2StreamConfigurationMap38, Camera2StreamConfigurationMap73) + this.getInputSizeshNQ4ISI[10] + 1859775393, 13) + Camera2StreamConfigurationMap39;
        int Camera2StreamConfigurationMap75 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap38, 10);
        int Camera2StreamConfigurationMap76 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap39 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap74, Camera2StreamConfigurationMap72, Camera2StreamConfigurationMap75) + this.getInputSizeshNQ4ISI[14] + 1859775393, 6) + Camera2StreamConfigurationMap73;
        int Camera2StreamConfigurationMap77 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap72, 10);
        int Camera2StreamConfigurationMap78 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap73 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap76, Camera2StreamConfigurationMap74, Camera2StreamConfigurationMap77) + this.getInputSizeshNQ4ISI[4] + 1859775393, 7) + Camera2StreamConfigurationMap75;
        int Camera2StreamConfigurationMap79 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap74, 10);
        int Camera2StreamConfigurationMap80 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap75 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap78, Camera2StreamConfigurationMap76, Camera2StreamConfigurationMap79) + this.getInputSizeshNQ4ISI[9] + 1859775393, 14) + Camera2StreamConfigurationMap77;
        int Camera2StreamConfigurationMap81 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap76, 10);
        int Camera2StreamConfigurationMap82 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap77 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap80, Camera2StreamConfigurationMap78, Camera2StreamConfigurationMap81) + this.getInputSizeshNQ4ISI[15] + 1859775393, 9) + Camera2StreamConfigurationMap79;
        int Camera2StreamConfigurationMap83 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap78, 10);
        int Camera2StreamConfigurationMap84 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap79 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap82, Camera2StreamConfigurationMap80, Camera2StreamConfigurationMap83) + this.getInputSizeshNQ4ISI[8] + 1859775393, 13) + Camera2StreamConfigurationMap81;
        int Camera2StreamConfigurationMap85 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap80, 10);
        int Camera2StreamConfigurationMap86 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap81 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap84, Camera2StreamConfigurationMap82, Camera2StreamConfigurationMap85) + this.getInputSizeshNQ4ISI[1] + 1859775393, 15) + Camera2StreamConfigurationMap83;
        int Camera2StreamConfigurationMap87 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap82, 10);
        int Camera2StreamConfigurationMap88 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap83 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap86, Camera2StreamConfigurationMap84, Camera2StreamConfigurationMap87) + this.getInputSizeshNQ4ISI[2] + 1859775393, 14) + Camera2StreamConfigurationMap85;
        int Camera2StreamConfigurationMap89 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap84, 10);
        int Camera2StreamConfigurationMap90 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap85 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap88, Camera2StreamConfigurationMap86, Camera2StreamConfigurationMap89) + this.getInputSizeshNQ4ISI[7] + 1859775393, 8) + Camera2StreamConfigurationMap87;
        int Camera2StreamConfigurationMap91 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap86, 10);
        int Camera2StreamConfigurationMap92 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap87 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap90, Camera2StreamConfigurationMap88, Camera2StreamConfigurationMap91) + this.getInputSizeshNQ4ISI[0] + 1859775393, 13) + Camera2StreamConfigurationMap89;
        int Camera2StreamConfigurationMap93 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap88, 10);
        int Camera2StreamConfigurationMap94 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap89 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap92, Camera2StreamConfigurationMap90, Camera2StreamConfigurationMap93) + this.getInputSizeshNQ4ISI[6] + 1859775393, 6) + Camera2StreamConfigurationMap91;
        int Camera2StreamConfigurationMap95 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap90, 10);
        int Camera2StreamConfigurationMap96 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap91 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap94, Camera2StreamConfigurationMap92, Camera2StreamConfigurationMap95) + this.getInputSizeshNQ4ISI[13] + 1859775393, 5) + Camera2StreamConfigurationMap93;
        int Camera2StreamConfigurationMap97 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap92, 10);
        int Camera2StreamConfigurationMap98 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap93 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap96, Camera2StreamConfigurationMap94, Camera2StreamConfigurationMap97) + this.getInputSizeshNQ4ISI[11] + 1859775393, 12) + Camera2StreamConfigurationMap95;
        int Camera2StreamConfigurationMap99 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap94, 10);
        int Camera2StreamConfigurationMap100 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap95 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap98, Camera2StreamConfigurationMap96, Camera2StreamConfigurationMap99) + this.getInputSizeshNQ4ISI[5] + 1859775393, 7) + Camera2StreamConfigurationMap97;
        int Camera2StreamConfigurationMap101 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap96, 10);
        int Camera2StreamConfigurationMap102 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap97 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap100, Camera2StreamConfigurationMap98, Camera2StreamConfigurationMap101) + this.getInputSizeshNQ4ISI[12] + 1859775393, 5) + Camera2StreamConfigurationMap99;
        int Camera2StreamConfigurationMap103 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap98, 10);
        int Camera2StreamConfigurationMap104 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap67 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap70, Camera2StreamConfigurationMap68, Camera2StreamConfigurationMap71) + this.getInputSizeshNQ4ISI[15] + 1836072691, 9) + Camera2StreamConfigurationMap69;
        int Camera2StreamConfigurationMap105 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap68, 10);
        int Camera2StreamConfigurationMap106 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap69 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap104, Camera2StreamConfigurationMap70, Camera2StreamConfigurationMap105) + this.getInputSizeshNQ4ISI[5] + 1836072691, 7) + Camera2StreamConfigurationMap71;
        int Camera2StreamConfigurationMap107 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap70, 10);
        int Camera2StreamConfigurationMap108 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap71 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap106, Camera2StreamConfigurationMap104, Camera2StreamConfigurationMap107) + this.getInputSizeshNQ4ISI[1] + 1836072691, 15) + Camera2StreamConfigurationMap105;
        int Camera2StreamConfigurationMap109 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap104, 10);
        int Camera2StreamConfigurationMap110 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap105 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap108, Camera2StreamConfigurationMap106, Camera2StreamConfigurationMap109) + this.getInputSizeshNQ4ISI[3] + 1836072691, 11) + Camera2StreamConfigurationMap107;
        int Camera2StreamConfigurationMap111 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap106, 10);
        int Camera2StreamConfigurationMap112 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap107 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap110, Camera2StreamConfigurationMap108, Camera2StreamConfigurationMap111) + this.getInputSizeshNQ4ISI[7] + 1836072691, 8) + Camera2StreamConfigurationMap109;
        int Camera2StreamConfigurationMap113 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap108, 10);
        int Camera2StreamConfigurationMap114 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap109 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap112, Camera2StreamConfigurationMap110, Camera2StreamConfigurationMap113) + this.getInputSizeshNQ4ISI[14] + 1836072691, 6) + Camera2StreamConfigurationMap111;
        int Camera2StreamConfigurationMap115 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap110, 10);
        int Camera2StreamConfigurationMap116 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap111 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap114, Camera2StreamConfigurationMap112, Camera2StreamConfigurationMap115) + this.getInputSizeshNQ4ISI[6] + 1836072691, 6) + Camera2StreamConfigurationMap113;
        int Camera2StreamConfigurationMap117 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap112, 10);
        int Camera2StreamConfigurationMap118 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap113 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap116, Camera2StreamConfigurationMap114, Camera2StreamConfigurationMap117) + this.getInputSizeshNQ4ISI[9] + 1836072691, 14) + Camera2StreamConfigurationMap115;
        int Camera2StreamConfigurationMap119 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap114, 10);
        int Camera2StreamConfigurationMap120 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap115 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap118, Camera2StreamConfigurationMap116, Camera2StreamConfigurationMap119) + this.getInputSizeshNQ4ISI[11] + 1836072691, 12) + Camera2StreamConfigurationMap117;
        int Camera2StreamConfigurationMap121 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap116, 10);
        int Camera2StreamConfigurationMap122 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap117 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap120, Camera2StreamConfigurationMap118, Camera2StreamConfigurationMap121) + this.getInputSizeshNQ4ISI[8] + 1836072691, 13) + Camera2StreamConfigurationMap119;
        int Camera2StreamConfigurationMap123 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap118, 10);
        int Camera2StreamConfigurationMap124 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap119 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap122, Camera2StreamConfigurationMap120, Camera2StreamConfigurationMap123) + this.getInputSizeshNQ4ISI[12] + 1836072691, 5) + Camera2StreamConfigurationMap121;
        int Camera2StreamConfigurationMap125 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap120, 10);
        int Camera2StreamConfigurationMap126 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap121 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap124, Camera2StreamConfigurationMap122, Camera2StreamConfigurationMap125) + this.getInputSizeshNQ4ISI[2] + 1836072691, 14) + Camera2StreamConfigurationMap123;
        int Camera2StreamConfigurationMap127 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap122, 10);
        int Camera2StreamConfigurationMap128 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap123 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap126, Camera2StreamConfigurationMap124, Camera2StreamConfigurationMap127) + this.getInputSizeshNQ4ISI[10] + 1836072691, 13) + Camera2StreamConfigurationMap125;
        int Camera2StreamConfigurationMap129 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap124, 10);
        int Camera2StreamConfigurationMap130 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap125 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap128, Camera2StreamConfigurationMap126, Camera2StreamConfigurationMap129) + this.getInputSizeshNQ4ISI[0] + 1836072691, 13) + Camera2StreamConfigurationMap127;
        int Camera2StreamConfigurationMap131 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap126, 10);
        int Camera2StreamConfigurationMap132 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap127 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap130, Camera2StreamConfigurationMap128, Camera2StreamConfigurationMap131) + this.getInputSizeshNQ4ISI[4] + 1836072691, 7) + Camera2StreamConfigurationMap129;
        int Camera2StreamConfigurationMap133 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap128, 10);
        int Camera2StreamConfigurationMap134 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap129 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap132, Camera2StreamConfigurationMap130, Camera2StreamConfigurationMap133) + this.getInputSizeshNQ4ISI[13] + 1836072691, 5) + Camera2StreamConfigurationMap131;
        int Camera2StreamConfigurationMap135 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap130, 10);
        int Camera2StreamConfigurationMap136 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap99 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap102, Camera2StreamConfigurationMap100, Camera2StreamConfigurationMap103)) + this.getInputSizeshNQ4ISI[1]) - 1894007588, 11) + Camera2StreamConfigurationMap101;
        int Camera2StreamConfigurationMap137 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap100, 10);
        int Camera2StreamConfigurationMap138 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap101 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap136, Camera2StreamConfigurationMap102, Camera2StreamConfigurationMap137)) + this.getInputSizeshNQ4ISI[9]) - 1894007588, 12) + Camera2StreamConfigurationMap103;
        int Camera2StreamConfigurationMap139 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap102, 10);
        int Camera2StreamConfigurationMap140 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap103 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap138, Camera2StreamConfigurationMap136, Camera2StreamConfigurationMap139)) + this.getInputSizeshNQ4ISI[11]) - 1894007588, 14) + Camera2StreamConfigurationMap137;
        int Camera2StreamConfigurationMap141 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap136, 10);
        int Camera2StreamConfigurationMap142 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap137 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap140, Camera2StreamConfigurationMap138, Camera2StreamConfigurationMap141)) + this.getInputSizeshNQ4ISI[10]) - 1894007588, 15) + Camera2StreamConfigurationMap139;
        int Camera2StreamConfigurationMap143 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap138, 10);
        int Camera2StreamConfigurationMap144 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap139 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap142, Camera2StreamConfigurationMap140, Camera2StreamConfigurationMap143)) + this.getInputSizeshNQ4ISI[0]) - 1894007588, 14) + Camera2StreamConfigurationMap141;
        int Camera2StreamConfigurationMap145 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap140, 10);
        int Camera2StreamConfigurationMap146 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap141 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap144, Camera2StreamConfigurationMap142, Camera2StreamConfigurationMap145)) + this.getInputSizeshNQ4ISI[8]) - 1894007588, 15) + Camera2StreamConfigurationMap143;
        int Camera2StreamConfigurationMap147 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap142, 10);
        int Camera2StreamConfigurationMap148 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap143 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap146, Camera2StreamConfigurationMap144, Camera2StreamConfigurationMap147)) + this.getInputSizeshNQ4ISI[12]) - 1894007588, 9) + Camera2StreamConfigurationMap145;
        int Camera2StreamConfigurationMap149 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap144, 10);
        int Camera2StreamConfigurationMap150 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap145 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap148, Camera2StreamConfigurationMap146, Camera2StreamConfigurationMap149)) + this.getInputSizeshNQ4ISI[4]) - 1894007588, 8) + Camera2StreamConfigurationMap147;
        int Camera2StreamConfigurationMap151 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap146, 10);
        int Camera2StreamConfigurationMap152 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap147 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap150, Camera2StreamConfigurationMap148, Camera2StreamConfigurationMap151)) + this.getInputSizeshNQ4ISI[13]) - 1894007588, 9) + Camera2StreamConfigurationMap149;
        int Camera2StreamConfigurationMap153 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap148, 10);
        int Camera2StreamConfigurationMap154 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap149 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap152, Camera2StreamConfigurationMap150, Camera2StreamConfigurationMap153)) + this.getInputSizeshNQ4ISI[3]) - 1894007588, 14) + Camera2StreamConfigurationMap151;
        int Camera2StreamConfigurationMap155 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap150, 10);
        int Camera2StreamConfigurationMap156 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap151 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap154, Camera2StreamConfigurationMap152, Camera2StreamConfigurationMap155)) + this.getInputSizeshNQ4ISI[7]) - 1894007588, 5) + Camera2StreamConfigurationMap153;
        int Camera2StreamConfigurationMap157 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap152, 10);
        int Camera2StreamConfigurationMap158 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap153 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap156, Camera2StreamConfigurationMap154, Camera2StreamConfigurationMap157)) + this.getInputSizeshNQ4ISI[15]) - 1894007588, 6) + Camera2StreamConfigurationMap155;
        int Camera2StreamConfigurationMap159 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap154, 10);
        int Camera2StreamConfigurationMap160 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap155 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap158, Camera2StreamConfigurationMap156, Camera2StreamConfigurationMap159)) + this.getInputSizeshNQ4ISI[14]) - 1894007588, 8) + Camera2StreamConfigurationMap157;
        int Camera2StreamConfigurationMap161 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap156, 10);
        int Camera2StreamConfigurationMap162 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap157 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap160, Camera2StreamConfigurationMap158, Camera2StreamConfigurationMap161)) + this.getInputSizeshNQ4ISI[5]) - 1894007588, 6) + Camera2StreamConfigurationMap159;
        int Camera2StreamConfigurationMap163 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap158, 10);
        int Camera2StreamConfigurationMap164 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap159 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap162, Camera2StreamConfigurationMap160, Camera2StreamConfigurationMap163)) + this.getInputSizeshNQ4ISI[6]) - 1894007588, 5) + Camera2StreamConfigurationMap161;
        int Camera2StreamConfigurationMap165 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap160, 10);
        int Camera2StreamConfigurationMap166 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap161 + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap164, Camera2StreamConfigurationMap162, Camera2StreamConfigurationMap165)) + this.getInputSizeshNQ4ISI[2]) - 1894007588, 12) + Camera2StreamConfigurationMap163;
        int Camera2StreamConfigurationMap167 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap162, 10);
        int Camera2StreamConfigurationMap168 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap131 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap134, Camera2StreamConfigurationMap132, Camera2StreamConfigurationMap135) + this.getInputSizeshNQ4ISI[8] + 2053994217, 15) + Camera2StreamConfigurationMap133;
        int Camera2StreamConfigurationMap169 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap132, 10);
        int Camera2StreamConfigurationMap170 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap133 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap168, Camera2StreamConfigurationMap134, Camera2StreamConfigurationMap169) + this.getInputSizeshNQ4ISI[6] + 2053994217, 5) + Camera2StreamConfigurationMap135;
        int Camera2StreamConfigurationMap171 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap134, 10);
        int Camera2StreamConfigurationMap172 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap135 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap170, Camera2StreamConfigurationMap168, Camera2StreamConfigurationMap171) + this.getInputSizeshNQ4ISI[4] + 2053994217, 8) + Camera2StreamConfigurationMap169;
        int Camera2StreamConfigurationMap173 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap168, 10);
        int Camera2StreamConfigurationMap174 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap169 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap172, Camera2StreamConfigurationMap170, Camera2StreamConfigurationMap173) + this.getInputSizeshNQ4ISI[1] + 2053994217, 11) + Camera2StreamConfigurationMap171;
        int Camera2StreamConfigurationMap175 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap170, 10);
        int Camera2StreamConfigurationMap176 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap171 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap174, Camera2StreamConfigurationMap172, Camera2StreamConfigurationMap175) + this.getInputSizeshNQ4ISI[3] + 2053994217, 14) + Camera2StreamConfigurationMap173;
        int Camera2StreamConfigurationMap177 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap172, 10);
        int Camera2StreamConfigurationMap178 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap173 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap176, Camera2StreamConfigurationMap174, Camera2StreamConfigurationMap177) + this.getInputSizeshNQ4ISI[11] + 2053994217, 14) + Camera2StreamConfigurationMap175;
        int Camera2StreamConfigurationMap179 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap174, 10);
        int Camera2StreamConfigurationMap180 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap175 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap178, Camera2StreamConfigurationMap176, Camera2StreamConfigurationMap179) + this.getInputSizeshNQ4ISI[15] + 2053994217, 6) + Camera2StreamConfigurationMap177;
        int Camera2StreamConfigurationMap181 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap176, 10);
        int Camera2StreamConfigurationMap182 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap177 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap180, Camera2StreamConfigurationMap178, Camera2StreamConfigurationMap181) + this.getInputSizeshNQ4ISI[0] + 2053994217, 14) + Camera2StreamConfigurationMap179;
        int Camera2StreamConfigurationMap183 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap178, 10);
        int Camera2StreamConfigurationMap184 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap179 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap182, Camera2StreamConfigurationMap180, Camera2StreamConfigurationMap183) + this.getInputSizeshNQ4ISI[5] + 2053994217, 6) + Camera2StreamConfigurationMap181;
        int Camera2StreamConfigurationMap185 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap180, 10);
        int Camera2StreamConfigurationMap186 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap181 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap184, Camera2StreamConfigurationMap182, Camera2StreamConfigurationMap185) + this.getInputSizeshNQ4ISI[12] + 2053994217, 9) + Camera2StreamConfigurationMap183;
        int Camera2StreamConfigurationMap187 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap182, 10);
        int Camera2StreamConfigurationMap188 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap183 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap186, Camera2StreamConfigurationMap184, Camera2StreamConfigurationMap187) + this.getInputSizeshNQ4ISI[2] + 2053994217, 12) + Camera2StreamConfigurationMap185;
        int Camera2StreamConfigurationMap189 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap184, 10);
        int Camera2StreamConfigurationMap190 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap185 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap188, Camera2StreamConfigurationMap186, Camera2StreamConfigurationMap189) + this.getInputSizeshNQ4ISI[13] + 2053994217, 9) + Camera2StreamConfigurationMap187;
        int Camera2StreamConfigurationMap191 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap186, 10);
        int Camera2StreamConfigurationMap192 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap187 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap190, Camera2StreamConfigurationMap188, Camera2StreamConfigurationMap191) + this.getInputSizeshNQ4ISI[9] + 2053994217, 12) + Camera2StreamConfigurationMap189;
        int Camera2StreamConfigurationMap193 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap188, 10);
        int Camera2StreamConfigurationMap194 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap189 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap192, Camera2StreamConfigurationMap190, Camera2StreamConfigurationMap193) + this.getInputSizeshNQ4ISI[7] + 2053994217, 5) + Camera2StreamConfigurationMap191;
        int Camera2StreamConfigurationMap195 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap190, 10);
        int Camera2StreamConfigurationMap196 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap191 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap194, Camera2StreamConfigurationMap192, Camera2StreamConfigurationMap195) + this.getInputSizeshNQ4ISI[10] + 2053994217, 15) + Camera2StreamConfigurationMap193;
        int Camera2StreamConfigurationMap197 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap192, 10);
        int Camera2StreamConfigurationMap198 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap193 + getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap196, Camera2StreamConfigurationMap194, Camera2StreamConfigurationMap197) + this.getInputSizeshNQ4ISI[14] + 2053994217, 8) + Camera2StreamConfigurationMap195;
        int Camera2StreamConfigurationMap199 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap194, 10);
        int Camera2StreamConfigurationMap200 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap163 + getHighSpeedVideoSizes(Camera2StreamConfigurationMap166, Camera2StreamConfigurationMap164, Camera2StreamConfigurationMap167)) + this.getInputSizeshNQ4ISI[4]) - 1454113458, 9) + Camera2StreamConfigurationMap165;
        int Camera2StreamConfigurationMap201 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap164, 10);
        int Camera2StreamConfigurationMap202 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap165 + getHighSpeedVideoSizes(Camera2StreamConfigurationMap200, Camera2StreamConfigurationMap166, Camera2StreamConfigurationMap201)) + this.getInputSizeshNQ4ISI[0]) - 1454113458, 15) + Camera2StreamConfigurationMap167;
        int Camera2StreamConfigurationMap203 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap166, 10);
        int Camera2StreamConfigurationMap204 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap167 + getHighSpeedVideoSizes(Camera2StreamConfigurationMap202, Camera2StreamConfigurationMap200, Camera2StreamConfigurationMap203)) + this.getInputSizeshNQ4ISI[5]) - 1454113458, 5) + Camera2StreamConfigurationMap201;
        int Camera2StreamConfigurationMap205 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap200, 10);
        int Camera2StreamConfigurationMap206 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap201 + getHighSpeedVideoSizes(Camera2StreamConfigurationMap204, Camera2StreamConfigurationMap202, Camera2StreamConfigurationMap205)) + this.getInputSizeshNQ4ISI[9]) - 1454113458, 11) + Camera2StreamConfigurationMap203;
        int Camera2StreamConfigurationMap207 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap202, 10);
        int Camera2StreamConfigurationMap208 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap203 + getHighSpeedVideoSizes(Camera2StreamConfigurationMap206, Camera2StreamConfigurationMap204, Camera2StreamConfigurationMap207)) + this.getInputSizeshNQ4ISI[7]) - 1454113458, 6) + Camera2StreamConfigurationMap205;
        int Camera2StreamConfigurationMap209 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap204, 10);
        int Camera2StreamConfigurationMap210 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap205 + getHighSpeedVideoSizes(Camera2StreamConfigurationMap208, Camera2StreamConfigurationMap206, Camera2StreamConfigurationMap209)) + this.getInputSizeshNQ4ISI[12]) - 1454113458, 8) + Camera2StreamConfigurationMap207;
        int Camera2StreamConfigurationMap211 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap206, 10);
        int Camera2StreamConfigurationMap212 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap207 + getHighSpeedVideoSizes(Camera2StreamConfigurationMap210, Camera2StreamConfigurationMap208, Camera2StreamConfigurationMap211)) + this.getInputSizeshNQ4ISI[2]) - 1454113458, 13) + Camera2StreamConfigurationMap209;
        int Camera2StreamConfigurationMap213 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap208, 10);
        int Camera2StreamConfigurationMap214 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap209 + getHighSpeedVideoSizes(Camera2StreamConfigurationMap212, Camera2StreamConfigurationMap210, Camera2StreamConfigurationMap213)) + this.getInputSizeshNQ4ISI[10]) - 1454113458, 12) + Camera2StreamConfigurationMap211;
        int Camera2StreamConfigurationMap215 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap210, 10);
        int Camera2StreamConfigurationMap216 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap211 + getHighSpeedVideoSizes(Camera2StreamConfigurationMap214, Camera2StreamConfigurationMap212, Camera2StreamConfigurationMap215)) + this.getInputSizeshNQ4ISI[14]) - 1454113458, 5) + Camera2StreamConfigurationMap213;
        int Camera2StreamConfigurationMap217 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap212, 10);
        int Camera2StreamConfigurationMap218 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap213 + getHighSpeedVideoSizes(Camera2StreamConfigurationMap216, Camera2StreamConfigurationMap214, Camera2StreamConfigurationMap217)) + this.getInputSizeshNQ4ISI[1]) - 1454113458, 12) + Camera2StreamConfigurationMap215;
        int Camera2StreamConfigurationMap219 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap214, 10);
        int Camera2StreamConfigurationMap220 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap215 + getHighSpeedVideoSizes(Camera2StreamConfigurationMap218, Camera2StreamConfigurationMap216, Camera2StreamConfigurationMap219)) + this.getInputSizeshNQ4ISI[3]) - 1454113458, 13) + Camera2StreamConfigurationMap217;
        int Camera2StreamConfigurationMap221 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap216, 10);
        int Camera2StreamConfigurationMap222 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap217 + getHighSpeedVideoSizes(Camera2StreamConfigurationMap220, Camera2StreamConfigurationMap218, Camera2StreamConfigurationMap221)) + this.getInputSizeshNQ4ISI[8]) - 1454113458, 14) + Camera2StreamConfigurationMap219;
        int Camera2StreamConfigurationMap223 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap218, 10);
        int Camera2StreamConfigurationMap224 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap219 + getHighSpeedVideoSizes(Camera2StreamConfigurationMap222, Camera2StreamConfigurationMap220, Camera2StreamConfigurationMap223)) + this.getInputSizeshNQ4ISI[11]) - 1454113458, 11) + Camera2StreamConfigurationMap221;
        int Camera2StreamConfigurationMap225 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap220, 10);
        int Camera2StreamConfigurationMap226 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap221 + getHighSpeedVideoSizes(Camera2StreamConfigurationMap224, Camera2StreamConfigurationMap222, Camera2StreamConfigurationMap225)) + this.getInputSizeshNQ4ISI[6]) - 1454113458, 8) + Camera2StreamConfigurationMap223;
        int Camera2StreamConfigurationMap227 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap222, 10);
        int Camera2StreamConfigurationMap228 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap223 + getHighSpeedVideoSizes(Camera2StreamConfigurationMap226, Camera2StreamConfigurationMap224, Camera2StreamConfigurationMap227)) + this.getInputSizeshNQ4ISI[15]) - 1454113458, 5) + Camera2StreamConfigurationMap225;
        int Camera2StreamConfigurationMap229 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap224, 10);
        int Camera2StreamConfigurationMap230 = Camera2StreamConfigurationMap(((Camera2StreamConfigurationMap225 + getHighSpeedVideoSizes(Camera2StreamConfigurationMap228, Camera2StreamConfigurationMap226, Camera2StreamConfigurationMap229)) + this.getInputSizeshNQ4ISI[13]) - 1454113458, 6);
        int Camera2StreamConfigurationMap231 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap226, 10);
        int Camera2StreamConfigurationMap232 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap195 + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap198, Camera2StreamConfigurationMap196, Camera2StreamConfigurationMap199) + this.getInputSizeshNQ4ISI[12], 8) + Camera2StreamConfigurationMap197;
        int Camera2StreamConfigurationMap233 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap196, 10);
        int Camera2StreamConfigurationMap234 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap197 + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap232, Camera2StreamConfigurationMap198, Camera2StreamConfigurationMap233) + this.getInputSizeshNQ4ISI[15], 5) + Camera2StreamConfigurationMap199;
        int Camera2StreamConfigurationMap235 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap198, 10);
        int Camera2StreamConfigurationMap236 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap199 + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap234, Camera2StreamConfigurationMap232, Camera2StreamConfigurationMap235) + this.getInputSizeshNQ4ISI[10], 12) + Camera2StreamConfigurationMap233;
        int Camera2StreamConfigurationMap237 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap232, 10);
        int Camera2StreamConfigurationMap238 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap233 + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap236, Camera2StreamConfigurationMap234, Camera2StreamConfigurationMap237) + this.getInputSizeshNQ4ISI[4], 9) + Camera2StreamConfigurationMap235;
        int Camera2StreamConfigurationMap239 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap234, 10);
        int Camera2StreamConfigurationMap240 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap235 + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap238, Camera2StreamConfigurationMap236, Camera2StreamConfigurationMap239) + this.getInputSizeshNQ4ISI[1], 12) + Camera2StreamConfigurationMap237;
        int Camera2StreamConfigurationMap241 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap236, 10);
        int Camera2StreamConfigurationMap242 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap237 + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap240, Camera2StreamConfigurationMap238, Camera2StreamConfigurationMap241) + this.getInputSizeshNQ4ISI[5], 5) + Camera2StreamConfigurationMap239;
        int Camera2StreamConfigurationMap243 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap238, 10);
        int Camera2StreamConfigurationMap244 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap239 + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap242, Camera2StreamConfigurationMap240, Camera2StreamConfigurationMap243) + this.getInputSizeshNQ4ISI[8], 14) + Camera2StreamConfigurationMap241;
        int Camera2StreamConfigurationMap245 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap240, 10);
        int Camera2StreamConfigurationMap246 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap241 + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap244, Camera2StreamConfigurationMap242, Camera2StreamConfigurationMap245) + this.getInputSizeshNQ4ISI[7], 6) + Camera2StreamConfigurationMap243;
        int Camera2StreamConfigurationMap247 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap242, 10);
        int Camera2StreamConfigurationMap248 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap243 + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap246, Camera2StreamConfigurationMap244, Camera2StreamConfigurationMap247) + this.getInputSizeshNQ4ISI[6], 8) + Camera2StreamConfigurationMap245;
        int Camera2StreamConfigurationMap249 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap244, 10);
        int Camera2StreamConfigurationMap250 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap245 + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap248, Camera2StreamConfigurationMap246, Camera2StreamConfigurationMap249) + this.getInputSizeshNQ4ISI[2], 13) + Camera2StreamConfigurationMap247;
        int Camera2StreamConfigurationMap251 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap246, 10);
        int Camera2StreamConfigurationMap252 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap247 + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap250, Camera2StreamConfigurationMap248, Camera2StreamConfigurationMap251) + this.getInputSizeshNQ4ISI[13], 6) + Camera2StreamConfigurationMap249;
        int Camera2StreamConfigurationMap253 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap248, 10);
        int Camera2StreamConfigurationMap254 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap249 + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap252, Camera2StreamConfigurationMap250, Camera2StreamConfigurationMap253) + this.getInputSizeshNQ4ISI[14], 5) + Camera2StreamConfigurationMap251;
        int Camera2StreamConfigurationMap255 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap250, 10);
        int Camera2StreamConfigurationMap256 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap251 + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap254, Camera2StreamConfigurationMap252, Camera2StreamConfigurationMap255) + this.getInputSizeshNQ4ISI[0], 15) + Camera2StreamConfigurationMap253;
        int Camera2StreamConfigurationMap257 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap252, 10);
        int Camera2StreamConfigurationMap258 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap253 + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap256, Camera2StreamConfigurationMap254, Camera2StreamConfigurationMap257) + this.getInputSizeshNQ4ISI[3], 13) + Camera2StreamConfigurationMap255;
        int Camera2StreamConfigurationMap259 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap254, 10);
        int Camera2StreamConfigurationMap260 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap255 + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap258, Camera2StreamConfigurationMap256, Camera2StreamConfigurationMap259) + this.getInputSizeshNQ4ISI[9], 11) + Camera2StreamConfigurationMap257;
        int Camera2StreamConfigurationMap261 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap256, 10);
        int Camera2StreamConfigurationMap262 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap257 + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap260, Camera2StreamConfigurationMap258, Camera2StreamConfigurationMap261) + this.getInputSizeshNQ4ISI[11], 11);
        int Camera2StreamConfigurationMap263 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap258, 10);
        int i103 = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor + Camera2StreamConfigurationMap231 + Camera2StreamConfigurationMap261;
        this.getHighSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI + Camera2StreamConfigurationMap229 + Camera2StreamConfigurationMap259;
        this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges + Camera2StreamConfigurationMap227 + Camera2StreamConfigurationMap262 + Camera2StreamConfigurationMap259;
        this.getHighSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap + Camera2StreamConfigurationMap230 + Camera2StreamConfigurationMap227 + Camera2StreamConfigurationMap260;
        this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap263 + Camera2StreamConfigurationMap228 + i103;
        this.getOutputMinFrameDuration = 0;
        int i104 = 0;
        while (true) {
            int[] iArr2 = this.getInputSizeshNQ4ISI;
            if (i104 == iArr2.length) {
                return;
            }
            iArr2[i104] = 0;
            i104++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        getHighSpeedVideoFpsRanges((org.bouncycastle.crypto.digests.RIPEMD160Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.Camera2StreamConfigurationMap = 1732584193;
        this.getHighSpeedVideoSizes = -271733879;
        this.getHighSpeedVideoFpsRangesFor = -1732584194;
        this.getHighResolutionOutputSizeshNQ4ISI = 271733878;
        this.getHighSpeedVideoFpsRanges = -1009589776;
        this.getOutputMinFrameDuration = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.getInputSizeshNQ4ISI;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i) {
        int[] iArr = this.getInputSizeshNQ4ISI;
        int i2 = this.getOutputMinFrameDuration;
        int i3 = i2 + 1;
        this.getOutputMinFrameDuration = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j) {
        if (this.getOutputMinFrameDuration > 14) {
            processBlock();
        }
        int[] iArr = this.getInputSizeshNQ4ISI;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "RIPEMD160";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, bArr, i);
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, bArr, i + 4);
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, bArr, i + 8);
        getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, bArr, i + 12);
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.RIPEMD160Digest(this);
    }

    private static void getHighSpeedVideoFpsRanges(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private void getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.digests.RIPEMD160Digest rIPEMD160Digest) {
        super.copyIn(rIPEMD160Digest);
        this.Camera2StreamConfigurationMap = rIPEMD160Digest.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = rIPEMD160Digest.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = rIPEMD160Digest.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = rIPEMD160Digest.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = rIPEMD160Digest.getHighSpeedVideoFpsRanges;
        int[] iArr = rIPEMD160Digest.getInputSizeshNQ4ISI;
        java.lang.System.arraycopy(iArr, 0, this.getInputSizeshNQ4ISI, 0, iArr.length);
        this.getOutputMinFrameDuration = rIPEMD160Digest.getOutputMinFrameDuration;
    }

    public RIPEMD160Digest(org.bouncycastle.crypto.digests.RIPEMD160Digest rIPEMD160Digest) {
        super(rIPEMD160Digest);
        this.getInputSizeshNQ4ISI = new int[16];
        getHighSpeedVideoFpsRanges(rIPEMD160Digest);
    }

    public RIPEMD160Digest() {
        this.getInputSizeshNQ4ISI = new int[16];
        reset();
    }
}

package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class RIPEMD320Digest extends org.bouncycastle.crypto.digests.GeneralDigest {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private int[] getOutputSizeshNQ4ISI;
    private int getOutputStallDurationlomOqCM;

    private static int Camera2StreamConfigurationMap(int i, int i2, int i3) {
        return i ^ (i2 | (~i3));
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    private static int getHighSpeedVideoFpsRanges(int i, int i2, int i3) {
        return (i | (~i2)) ^ i3;
    }

    private static int getHighSpeedVideoFpsRangesFor(int i, int i2, int i3) {
        return (i & i2) | (i3 & (~i));
    }

    private static int getHighSpeedVideoSizes(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    private static int getHighSpeedVideoSizes(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 40;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        int i3 = this.getHighSpeedVideoSizes;
        int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i5 = this.Camera2StreamConfigurationMap;
        int i6 = this.getInputSizeshNQ4ISI;
        int i7 = this.getOutputFormats;
        int i8 = this.getInputFormats;
        int i9 = this.getHighSpeedVideoSizesFor;
        int i10 = this.getOutputMinFrameDuration;
        int[] iArr = this.getOutputSizeshNQ4ISI;
        int i11 = iArr[0];
        int i12 = i + ((i2 ^ i3) ^ i4) + i11;
        int i13 = ((i12 << 11) | (i12 >>> 21)) + i5;
        int i14 = (i3 << 10) | (i3 >>> 22);
        int i15 = i5 + ((i13 ^ i2) ^ i14) + iArr[1];
        int i16 = ((i15 >>> 18) | (i15 << 14)) + i4;
        int i17 = (i2 >>> 22) | (i2 << 10);
        int i18 = iArr[2];
        int i19 = i4 + ((i16 ^ i13) ^ i17) + i18;
        int i20 = ((i19 >>> 17) | (i19 << 15)) + i14;
        int i21 = (i13 >>> 22) | (i13 << 10);
        int i22 = i14 + ((i20 ^ i16) ^ i21) + iArr[3];
        int i23 = ((i22 >>> 20) | (i22 << 12)) + i17;
        int i24 = (i16 >>> 22) | (i16 << 10);
        int i25 = iArr[4];
        int i26 = i17 + ((i23 ^ i20) ^ i24) + i25;
        int i27 = ((i26 >>> 27) | (i26 << 5)) + i21;
        int i28 = (i20 >>> 22) | (i20 << 10);
        int i29 = iArr[5];
        int i30 = i21 + ((i27 ^ i23) ^ i28) + i29;
        int i31 = ((i30 >>> 24) | (i30 << 8)) + i24;
        int i32 = (i23 >>> 22) | (i23 << 10);
        int i33 = iArr[6];
        int i34 = i24 + ((i31 ^ i27) ^ i32) + i33;
        int i35 = ((i34 >>> 25) | (i34 << 7)) + i28;
        int i36 = (i27 >>> 22) | (i27 << 10);
        int i37 = iArr[7];
        int i38 = i28 + ((i35 ^ i31) ^ i36) + i37;
        int i39 = ((i38 >>> 23) | (i38 << 9)) + i32;
        int i40 = (i31 >>> 22) | (i31 << 10);
        int i41 = i32 + ((i39 ^ i35) ^ i40) + iArr[8];
        int i42 = ((i41 >>> 21) | (i41 << 11)) + i36;
        int i43 = (i35 >>> 22) | (i35 << 10);
        int i44 = iArr[9];
        int i45 = i36 + ((i42 ^ i39) ^ i43) + i44;
        int i46 = ((i45 >>> 19) | (i45 << 13)) + i40;
        int i47 = (i39 >>> 22) | (i39 << 10);
        int i48 = i40 + ((i46 ^ i42) ^ i47) + iArr[10];
        int i49 = ((i48 >>> 18) | (i48 << 14)) + i43;
        int i50 = (i42 >>> 22) | (i42 << 10);
        int i51 = iArr[11];
        int i52 = i43 + ((i49 ^ i46) ^ i50) + i51;
        int i53 = ((i52 >>> 17) | (i52 << 15)) + i47;
        int i54 = (i46 >>> 22) | (i46 << 10);
        int i55 = i47 + ((i53 ^ i49) ^ i54) + iArr[12];
        int i56 = ((i55 >>> 26) | (i55 << 6)) + i50;
        int i57 = (i49 >>> 22) | (i49 << 10);
        int i58 = iArr[13];
        int i59 = i50 + ((i56 ^ i53) ^ i57) + i58;
        int i60 = ((i59 >>> 25) | (i59 << 7)) + i54;
        int i61 = (i53 >>> 22) | (i53 << 10);
        int i62 = iArr[14];
        int i63 = i54 + ((i60 ^ i56) ^ i61) + i62;
        int i64 = ((i63 >>> 23) | (i63 << 9)) + i57;
        int i65 = (i56 >>> 22) | (i56 << 10);
        int i66 = iArr[15];
        int i67 = i57 + ((i64 ^ i60) ^ i65) + i66;
        int i68 = ((i67 >>> 24) | (i67 << 8)) + i61;
        int i69 = (i60 >>> 22) | (i60 << 10);
        int i70 = i6 + (((~i9) | i8) ^ i7) + i29 + 1352829926;
        int i71 = ((i70 >>> 24) | (i70 << 8)) + i10;
        int i72 = (i8 >>> 22) | (i8 << 10);
        int i73 = i10 + (((~i72) | i7) ^ i71) + i62 + 1352829926;
        int i74 = ((i73 << 9) | (i73 >>> 23)) + i9;
        int i75 = (i7 << 10) | (i7 >>> 22);
        int i76 = i9 + (((~i75) | i71) ^ i74) + i37 + 1352829926;
        int i77 = ((i76 << 9) | (i76 >>> 23)) + i72;
        int i78 = (i71 << 10) | (i71 >>> 22);
        int i79 = i72 + (((~i78) | i74) ^ i77) + i11 + 1352829926;
        int i80 = ((i79 << 11) | (i79 >>> 21)) + i75;
        int i81 = (i74 << 10) | (i74 >>> 22);
        int i82 = i75 + (((~i81) | i77) ^ i80) + i44 + 1352829926;
        int i83 = ((i82 << 13) | (i82 >>> 19)) + i78;
        int i84 = (i77 << 10) | (i77 >>> 22);
        int i85 = i78 + (((~i84) | i80) ^ i83) + i18 + 1352829926;
        int i86 = ((i85 << 15) | (i85 >>> 17)) + i81;
        int i87 = (i80 << 10) | (i80 >>> 22);
        int i88 = i81 + (((~i87) | i83) ^ i86) + i51 + 1352829926;
        int i89 = ((i88 << 15) | (i88 >>> 17)) + i84;
        int i90 = (i83 << 10) | (i83 >>> 22);
        int i91 = i84 + (((~i90) | i86) ^ i89) + i25 + 1352829926;
        int i92 = ((i91 << 5) | (i91 >>> 27)) + i87;
        int i93 = (i86 << 10) | (i86 >>> 22);
        int i94 = i87 + (((~i93) | i89) ^ i92) + i58 + 1352829926;
        int i95 = ((i94 << 7) | (i94 >>> 25)) + i90;
        int i96 = (i89 << 10) | (i89 >>> 22);
        int i97 = i90 + (((~i96) | i92) ^ i95) + i33 + 1352829926;
        int i98 = ((i97 << 7) | (i97 >>> 25)) + i93;
        int i99 = (i92 << 10) | (i92 >>> 22);
        int highSpeedVideoSizes = getHighSpeedVideoSizes(i93 + (((~i99) | i95) ^ i98) + i66 + 1352829926, 8) + i96;
        int highSpeedVideoSizes2 = getHighSpeedVideoSizes(i95, 10);
        int highSpeedVideoSizes3 = getHighSpeedVideoSizes(i96 + Camera2StreamConfigurationMap(highSpeedVideoSizes, i98, highSpeedVideoSizes2) + this.getOutputSizeshNQ4ISI[8] + 1352829926, 11) + i99;
        int highSpeedVideoSizes4 = getHighSpeedVideoSizes(i98, 10);
        int highSpeedVideoSizes5 = getHighSpeedVideoSizes(i99 + Camera2StreamConfigurationMap(highSpeedVideoSizes3, highSpeedVideoSizes, highSpeedVideoSizes4) + this.getOutputSizeshNQ4ISI[1] + 1352829926, 14) + highSpeedVideoSizes2;
        int highSpeedVideoSizes6 = getHighSpeedVideoSizes(highSpeedVideoSizes, 10);
        int highSpeedVideoSizes7 = getHighSpeedVideoSizes(highSpeedVideoSizes2 + Camera2StreamConfigurationMap(highSpeedVideoSizes5, highSpeedVideoSizes3, highSpeedVideoSizes6) + this.getOutputSizeshNQ4ISI[10] + 1352829926, 14) + highSpeedVideoSizes4;
        int highSpeedVideoSizes8 = getHighSpeedVideoSizes(highSpeedVideoSizes3, 10);
        int highSpeedVideoSizes9 = getHighSpeedVideoSizes(highSpeedVideoSizes4 + Camera2StreamConfigurationMap(highSpeedVideoSizes7, highSpeedVideoSizes5, highSpeedVideoSizes8) + this.getOutputSizeshNQ4ISI[3] + 1352829926, 12) + highSpeedVideoSizes6;
        int highSpeedVideoSizes10 = getHighSpeedVideoSizes(highSpeedVideoSizes5, 10);
        int highSpeedVideoSizes11 = getHighSpeedVideoSizes(highSpeedVideoSizes6 + Camera2StreamConfigurationMap(highSpeedVideoSizes9, highSpeedVideoSizes7, highSpeedVideoSizes10) + this.getOutputSizeshNQ4ISI[12] + 1352829926, 6) + highSpeedVideoSizes8;
        int highSpeedVideoSizes12 = getHighSpeedVideoSizes(highSpeedVideoSizes7, 10);
        int highSpeedVideoSizes13 = getHighSpeedVideoSizes(i61 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes11, i64, i69) + this.getOutputSizeshNQ4ISI[7] + 1518500249, 7) + i65;
        int highSpeedVideoSizes14 = getHighSpeedVideoSizes(i64, 10);
        int highSpeedVideoSizes15 = getHighSpeedVideoSizes(i65 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes13, highSpeedVideoSizes11, highSpeedVideoSizes14) + this.getOutputSizeshNQ4ISI[4] + 1518500249, 6) + i69;
        int highSpeedVideoSizes16 = getHighSpeedVideoSizes(highSpeedVideoSizes11, 10);
        int highSpeedVideoSizes17 = getHighSpeedVideoSizes(i69 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes15, highSpeedVideoSizes13, highSpeedVideoSizes16) + this.getOutputSizeshNQ4ISI[13] + 1518500249, 8) + highSpeedVideoSizes14;
        int highSpeedVideoSizes18 = getHighSpeedVideoSizes(highSpeedVideoSizes13, 10);
        int highSpeedVideoSizes19 = getHighSpeedVideoSizes(highSpeedVideoSizes14 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes17, highSpeedVideoSizes15, highSpeedVideoSizes18) + this.getOutputSizeshNQ4ISI[1] + 1518500249, 13) + highSpeedVideoSizes16;
        int highSpeedVideoSizes20 = getHighSpeedVideoSizes(highSpeedVideoSizes15, 10);
        int highSpeedVideoSizes21 = getHighSpeedVideoSizes(highSpeedVideoSizes16 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes19, highSpeedVideoSizes17, highSpeedVideoSizes20) + this.getOutputSizeshNQ4ISI[10] + 1518500249, 11) + highSpeedVideoSizes18;
        int highSpeedVideoSizes22 = getHighSpeedVideoSizes(highSpeedVideoSizes17, 10);
        int highSpeedVideoSizes23 = getHighSpeedVideoSizes(highSpeedVideoSizes18 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes21, highSpeedVideoSizes19, highSpeedVideoSizes22) + this.getOutputSizeshNQ4ISI[6] + 1518500249, 9) + highSpeedVideoSizes20;
        int highSpeedVideoSizes24 = getHighSpeedVideoSizes(highSpeedVideoSizes19, 10);
        int highSpeedVideoSizes25 = getHighSpeedVideoSizes(highSpeedVideoSizes20 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes23, highSpeedVideoSizes21, highSpeedVideoSizes24) + this.getOutputSizeshNQ4ISI[15] + 1518500249, 7) + highSpeedVideoSizes22;
        int highSpeedVideoSizes26 = getHighSpeedVideoSizes(highSpeedVideoSizes21, 10);
        int highSpeedVideoSizes27 = getHighSpeedVideoSizes(highSpeedVideoSizes22 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes25, highSpeedVideoSizes23, highSpeedVideoSizes26) + this.getOutputSizeshNQ4ISI[3] + 1518500249, 15) + highSpeedVideoSizes24;
        int highSpeedVideoSizes28 = getHighSpeedVideoSizes(highSpeedVideoSizes23, 10);
        int highSpeedVideoSizes29 = getHighSpeedVideoSizes(highSpeedVideoSizes24 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes27, highSpeedVideoSizes25, highSpeedVideoSizes28) + this.getOutputSizeshNQ4ISI[12] + 1518500249, 7) + highSpeedVideoSizes26;
        int highSpeedVideoSizes30 = getHighSpeedVideoSizes(highSpeedVideoSizes25, 10);
        int highSpeedVideoSizes31 = getHighSpeedVideoSizes(highSpeedVideoSizes26 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes29, highSpeedVideoSizes27, highSpeedVideoSizes30) + this.getOutputSizeshNQ4ISI[0] + 1518500249, 12) + highSpeedVideoSizes28;
        int highSpeedVideoSizes32 = getHighSpeedVideoSizes(highSpeedVideoSizes27, 10);
        int highSpeedVideoSizes33 = getHighSpeedVideoSizes(highSpeedVideoSizes28 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes31, highSpeedVideoSizes29, highSpeedVideoSizes32) + this.getOutputSizeshNQ4ISI[9] + 1518500249, 15) + highSpeedVideoSizes30;
        int highSpeedVideoSizes34 = getHighSpeedVideoSizes(highSpeedVideoSizes29, 10);
        int highSpeedVideoSizes35 = getHighSpeedVideoSizes(highSpeedVideoSizes30 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes33, highSpeedVideoSizes31, highSpeedVideoSizes34) + this.getOutputSizeshNQ4ISI[5] + 1518500249, 9) + highSpeedVideoSizes32;
        int highSpeedVideoSizes36 = getHighSpeedVideoSizes(highSpeedVideoSizes31, 10);
        int highSpeedVideoSizes37 = getHighSpeedVideoSizes(highSpeedVideoSizes32 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes35, highSpeedVideoSizes33, highSpeedVideoSizes36) + this.getOutputSizeshNQ4ISI[2] + 1518500249, 11) + highSpeedVideoSizes34;
        int highSpeedVideoSizes38 = getHighSpeedVideoSizes(highSpeedVideoSizes33, 10);
        int highSpeedVideoSizes39 = getHighSpeedVideoSizes(highSpeedVideoSizes34 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes37, highSpeedVideoSizes35, highSpeedVideoSizes38) + this.getOutputSizeshNQ4ISI[14] + 1518500249, 7) + highSpeedVideoSizes36;
        int highSpeedVideoSizes40 = getHighSpeedVideoSizes(highSpeedVideoSizes35, 10);
        int highSpeedVideoSizes41 = getHighSpeedVideoSizes(highSpeedVideoSizes36 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes39, highSpeedVideoSizes37, highSpeedVideoSizes40) + this.getOutputSizeshNQ4ISI[11] + 1518500249, 13) + highSpeedVideoSizes38;
        int highSpeedVideoSizes42 = getHighSpeedVideoSizes(highSpeedVideoSizes37, 10);
        int highSpeedVideoSizes43 = getHighSpeedVideoSizes(highSpeedVideoSizes38 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes41, highSpeedVideoSizes39, highSpeedVideoSizes42) + this.getOutputSizeshNQ4ISI[8] + 1518500249, 12) + highSpeedVideoSizes40;
        int highSpeedVideoSizes44 = getHighSpeedVideoSizes(highSpeedVideoSizes39, 10);
        int highSpeedVideoSizes45 = getHighSpeedVideoSizes(highSpeedVideoSizes8 + getHighResolutionOutputSizeshNQ4ISI(i68, highSpeedVideoSizes9, highSpeedVideoSizes12) + this.getOutputSizeshNQ4ISI[6] + 1548603684, 9) + highSpeedVideoSizes10;
        int highSpeedVideoSizes46 = getHighSpeedVideoSizes(highSpeedVideoSizes9, 10);
        int highSpeedVideoSizes47 = getHighSpeedVideoSizes(highSpeedVideoSizes10 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes45, i68, highSpeedVideoSizes46) + this.getOutputSizeshNQ4ISI[11] + 1548603684, 13) + highSpeedVideoSizes12;
        int highSpeedVideoSizes48 = getHighSpeedVideoSizes(i68, 10);
        int highSpeedVideoSizes49 = getHighSpeedVideoSizes(highSpeedVideoSizes12 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes47, highSpeedVideoSizes45, highSpeedVideoSizes48) + this.getOutputSizeshNQ4ISI[3] + 1548603684, 15) + highSpeedVideoSizes46;
        int highSpeedVideoSizes50 = getHighSpeedVideoSizes(highSpeedVideoSizes45, 10);
        int highSpeedVideoSizes51 = getHighSpeedVideoSizes(highSpeedVideoSizes46 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes49, highSpeedVideoSizes47, highSpeedVideoSizes50) + this.getOutputSizeshNQ4ISI[7] + 1548603684, 7) + highSpeedVideoSizes48;
        int highSpeedVideoSizes52 = getHighSpeedVideoSizes(highSpeedVideoSizes47, 10);
        int highSpeedVideoSizes53 = getHighSpeedVideoSizes(highSpeedVideoSizes48 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes51, highSpeedVideoSizes49, highSpeedVideoSizes52) + this.getOutputSizeshNQ4ISI[0] + 1548603684, 12) + highSpeedVideoSizes50;
        int highSpeedVideoSizes54 = getHighSpeedVideoSizes(highSpeedVideoSizes49, 10);
        int highSpeedVideoSizes55 = getHighSpeedVideoSizes(highSpeedVideoSizes50 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes53, highSpeedVideoSizes51, highSpeedVideoSizes54) + this.getOutputSizeshNQ4ISI[13] + 1548603684, 8) + highSpeedVideoSizes52;
        int highSpeedVideoSizes56 = getHighSpeedVideoSizes(highSpeedVideoSizes51, 10);
        int highSpeedVideoSizes57 = getHighSpeedVideoSizes(highSpeedVideoSizes52 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes55, highSpeedVideoSizes53, highSpeedVideoSizes56) + this.getOutputSizeshNQ4ISI[5] + 1548603684, 9) + highSpeedVideoSizes54;
        int highSpeedVideoSizes58 = getHighSpeedVideoSizes(highSpeedVideoSizes53, 10);
        int highSpeedVideoSizes59 = getHighSpeedVideoSizes(highSpeedVideoSizes54 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes57, highSpeedVideoSizes55, highSpeedVideoSizes58) + this.getOutputSizeshNQ4ISI[10] + 1548603684, 11) + highSpeedVideoSizes56;
        int highSpeedVideoSizes60 = getHighSpeedVideoSizes(highSpeedVideoSizes55, 10);
        int highSpeedVideoSizes61 = getHighSpeedVideoSizes(highSpeedVideoSizes56 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes59, highSpeedVideoSizes57, highSpeedVideoSizes60) + this.getOutputSizeshNQ4ISI[14] + 1548603684, 7) + highSpeedVideoSizes58;
        int highSpeedVideoSizes62 = getHighSpeedVideoSizes(highSpeedVideoSizes57, 10);
        int highSpeedVideoSizes63 = getHighSpeedVideoSizes(highSpeedVideoSizes58 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes61, highSpeedVideoSizes59, highSpeedVideoSizes62) + this.getOutputSizeshNQ4ISI[15] + 1548603684, 7) + highSpeedVideoSizes60;
        int highSpeedVideoSizes64 = getHighSpeedVideoSizes(highSpeedVideoSizes59, 10);
        int highSpeedVideoSizes65 = getHighSpeedVideoSizes(highSpeedVideoSizes60 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes63, highSpeedVideoSizes61, highSpeedVideoSizes64) + this.getOutputSizeshNQ4ISI[8] + 1548603684, 12) + highSpeedVideoSizes62;
        int highSpeedVideoSizes66 = getHighSpeedVideoSizes(highSpeedVideoSizes61, 10);
        int highSpeedVideoSizes67 = getHighSpeedVideoSizes(highSpeedVideoSizes62 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes65, highSpeedVideoSizes63, highSpeedVideoSizes66) + this.getOutputSizeshNQ4ISI[12] + 1548603684, 7) + highSpeedVideoSizes64;
        int highSpeedVideoSizes68 = getHighSpeedVideoSizes(highSpeedVideoSizes63, 10);
        int highSpeedVideoSizes69 = getHighSpeedVideoSizes(highSpeedVideoSizes64 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes67, highSpeedVideoSizes65, highSpeedVideoSizes68) + this.getOutputSizeshNQ4ISI[4] + 1548603684, 6) + highSpeedVideoSizes66;
        int highSpeedVideoSizes70 = getHighSpeedVideoSizes(highSpeedVideoSizes65, 10);
        int highSpeedVideoSizes71 = getHighSpeedVideoSizes(highSpeedVideoSizes66 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes69, highSpeedVideoSizes67, highSpeedVideoSizes70) + this.getOutputSizeshNQ4ISI[9] + 1548603684, 15) + highSpeedVideoSizes68;
        int highSpeedVideoSizes72 = getHighSpeedVideoSizes(highSpeedVideoSizes67, 10);
        int highSpeedVideoSizes73 = getHighSpeedVideoSizes(highSpeedVideoSizes68 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes71, highSpeedVideoSizes69, highSpeedVideoSizes72) + this.getOutputSizeshNQ4ISI[1] + 1548603684, 13) + highSpeedVideoSizes70;
        int highSpeedVideoSizes74 = getHighSpeedVideoSizes(highSpeedVideoSizes69, 10);
        int highSpeedVideoSizes75 = getHighSpeedVideoSizes(highSpeedVideoSizes70 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes73, highSpeedVideoSizes71, highSpeedVideoSizes74) + this.getOutputSizeshNQ4ISI[2] + 1548603684, 11) + highSpeedVideoSizes72;
        int highSpeedVideoSizes76 = getHighSpeedVideoSizes(highSpeedVideoSizes71, 10);
        int highSpeedVideoSizes77 = getHighSpeedVideoSizes(highSpeedVideoSizes40 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes43, highSpeedVideoSizes41, highSpeedVideoSizes76) + this.getOutputSizeshNQ4ISI[3] + 1859775393, 11) + highSpeedVideoSizes42;
        int highSpeedVideoSizes78 = getHighSpeedVideoSizes(highSpeedVideoSizes41, 10);
        int highSpeedVideoSizes79 = getHighSpeedVideoSizes(highSpeedVideoSizes42 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes77, highSpeedVideoSizes43, highSpeedVideoSizes78) + this.getOutputSizeshNQ4ISI[10] + 1859775393, 13) + highSpeedVideoSizes76;
        int highSpeedVideoSizes80 = getHighSpeedVideoSizes(highSpeedVideoSizes43, 10);
        int highSpeedVideoSizes81 = getHighSpeedVideoSizes(highSpeedVideoSizes76 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes79, highSpeedVideoSizes77, highSpeedVideoSizes80) + this.getOutputSizeshNQ4ISI[14] + 1859775393, 6) + highSpeedVideoSizes78;
        int highSpeedVideoSizes82 = getHighSpeedVideoSizes(highSpeedVideoSizes77, 10);
        int highSpeedVideoSizes83 = getHighSpeedVideoSizes(highSpeedVideoSizes78 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes81, highSpeedVideoSizes79, highSpeedVideoSizes82) + this.getOutputSizeshNQ4ISI[4] + 1859775393, 7) + highSpeedVideoSizes80;
        int highSpeedVideoSizes84 = getHighSpeedVideoSizes(highSpeedVideoSizes79, 10);
        int highSpeedVideoSizes85 = getHighSpeedVideoSizes(highSpeedVideoSizes80 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes83, highSpeedVideoSizes81, highSpeedVideoSizes84) + this.getOutputSizeshNQ4ISI[9] + 1859775393, 14) + highSpeedVideoSizes82;
        int highSpeedVideoSizes86 = getHighSpeedVideoSizes(highSpeedVideoSizes81, 10);
        int highSpeedVideoSizes87 = getHighSpeedVideoSizes(highSpeedVideoSizes82 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes85, highSpeedVideoSizes83, highSpeedVideoSizes86) + this.getOutputSizeshNQ4ISI[15] + 1859775393, 9) + highSpeedVideoSizes84;
        int highSpeedVideoSizes88 = getHighSpeedVideoSizes(highSpeedVideoSizes83, 10);
        int highSpeedVideoSizes89 = getHighSpeedVideoSizes(highSpeedVideoSizes84 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes87, highSpeedVideoSizes85, highSpeedVideoSizes88) + this.getOutputSizeshNQ4ISI[8] + 1859775393, 13) + highSpeedVideoSizes86;
        int highSpeedVideoSizes90 = getHighSpeedVideoSizes(highSpeedVideoSizes85, 10);
        int highSpeedVideoSizes91 = getHighSpeedVideoSizes(highSpeedVideoSizes86 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes89, highSpeedVideoSizes87, highSpeedVideoSizes90) + this.getOutputSizeshNQ4ISI[1] + 1859775393, 15) + highSpeedVideoSizes88;
        int highSpeedVideoSizes92 = getHighSpeedVideoSizes(highSpeedVideoSizes87, 10);
        int highSpeedVideoSizes93 = getHighSpeedVideoSizes(highSpeedVideoSizes88 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes91, highSpeedVideoSizes89, highSpeedVideoSizes92) + this.getOutputSizeshNQ4ISI[2] + 1859775393, 14) + highSpeedVideoSizes90;
        int highSpeedVideoSizes94 = getHighSpeedVideoSizes(highSpeedVideoSizes89, 10);
        int highSpeedVideoSizes95 = getHighSpeedVideoSizes(highSpeedVideoSizes90 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes93, highSpeedVideoSizes91, highSpeedVideoSizes94) + this.getOutputSizeshNQ4ISI[7] + 1859775393, 8) + highSpeedVideoSizes92;
        int highSpeedVideoSizes96 = getHighSpeedVideoSizes(highSpeedVideoSizes91, 10);
        int highSpeedVideoSizes97 = getHighSpeedVideoSizes(highSpeedVideoSizes92 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes95, highSpeedVideoSizes93, highSpeedVideoSizes96) + this.getOutputSizeshNQ4ISI[0] + 1859775393, 13) + highSpeedVideoSizes94;
        int highSpeedVideoSizes98 = getHighSpeedVideoSizes(highSpeedVideoSizes93, 10);
        int highSpeedVideoSizes99 = getHighSpeedVideoSizes(highSpeedVideoSizes94 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes97, highSpeedVideoSizes95, highSpeedVideoSizes98) + this.getOutputSizeshNQ4ISI[6] + 1859775393, 6) + highSpeedVideoSizes96;
        int highSpeedVideoSizes100 = getHighSpeedVideoSizes(highSpeedVideoSizes95, 10);
        int highSpeedVideoSizes101 = getHighSpeedVideoSizes(highSpeedVideoSizes96 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes99, highSpeedVideoSizes97, highSpeedVideoSizes100) + this.getOutputSizeshNQ4ISI[13] + 1859775393, 5) + highSpeedVideoSizes98;
        int highSpeedVideoSizes102 = getHighSpeedVideoSizes(highSpeedVideoSizes97, 10);
        int highSpeedVideoSizes103 = getHighSpeedVideoSizes(highSpeedVideoSizes98 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes101, highSpeedVideoSizes99, highSpeedVideoSizes102) + this.getOutputSizeshNQ4ISI[11] + 1859775393, 12) + highSpeedVideoSizes100;
        int highSpeedVideoSizes104 = getHighSpeedVideoSizes(highSpeedVideoSizes99, 10);
        int highSpeedVideoSizes105 = getHighSpeedVideoSizes(highSpeedVideoSizes100 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes103, highSpeedVideoSizes101, highSpeedVideoSizes104) + this.getOutputSizeshNQ4ISI[5] + 1859775393, 7) + highSpeedVideoSizes102;
        int highSpeedVideoSizes106 = getHighSpeedVideoSizes(highSpeedVideoSizes101, 10);
        int highSpeedVideoSizes107 = getHighSpeedVideoSizes(highSpeedVideoSizes102 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes105, highSpeedVideoSizes103, highSpeedVideoSizes106) + this.getOutputSizeshNQ4ISI[12] + 1859775393, 5) + highSpeedVideoSizes104;
        int highSpeedVideoSizes108 = getHighSpeedVideoSizes(highSpeedVideoSizes103, 10);
        int highSpeedVideoSizes109 = getHighSpeedVideoSizes(highSpeedVideoSizes72 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes75, highSpeedVideoSizes73, highSpeedVideoSizes44) + this.getOutputSizeshNQ4ISI[15] + 1836072691, 9) + highSpeedVideoSizes74;
        int highSpeedVideoSizes110 = getHighSpeedVideoSizes(highSpeedVideoSizes73, 10);
        int highSpeedVideoSizes111 = getHighSpeedVideoSizes(highSpeedVideoSizes74 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes109, highSpeedVideoSizes75, highSpeedVideoSizes110) + this.getOutputSizeshNQ4ISI[5] + 1836072691, 7) + highSpeedVideoSizes44;
        int highSpeedVideoSizes112 = getHighSpeedVideoSizes(highSpeedVideoSizes75, 10);
        int highSpeedVideoSizes113 = getHighSpeedVideoSizes(highSpeedVideoSizes44 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes111, highSpeedVideoSizes109, highSpeedVideoSizes112) + this.getOutputSizeshNQ4ISI[1] + 1836072691, 15) + highSpeedVideoSizes110;
        int highSpeedVideoSizes114 = getHighSpeedVideoSizes(highSpeedVideoSizes109, 10);
        int highSpeedVideoSizes115 = getHighSpeedVideoSizes(highSpeedVideoSizes110 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes113, highSpeedVideoSizes111, highSpeedVideoSizes114) + this.getOutputSizeshNQ4ISI[3] + 1836072691, 11) + highSpeedVideoSizes112;
        int highSpeedVideoSizes116 = getHighSpeedVideoSizes(highSpeedVideoSizes111, 10);
        int highSpeedVideoSizes117 = getHighSpeedVideoSizes(highSpeedVideoSizes112 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes115, highSpeedVideoSizes113, highSpeedVideoSizes116) + this.getOutputSizeshNQ4ISI[7] + 1836072691, 8) + highSpeedVideoSizes114;
        int highSpeedVideoSizes118 = getHighSpeedVideoSizes(highSpeedVideoSizes113, 10);
        int highSpeedVideoSizes119 = getHighSpeedVideoSizes(highSpeedVideoSizes114 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes117, highSpeedVideoSizes115, highSpeedVideoSizes118) + this.getOutputSizeshNQ4ISI[14] + 1836072691, 6) + highSpeedVideoSizes116;
        int highSpeedVideoSizes120 = getHighSpeedVideoSizes(highSpeedVideoSizes115, 10);
        int highSpeedVideoSizes121 = getHighSpeedVideoSizes(highSpeedVideoSizes116 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes119, highSpeedVideoSizes117, highSpeedVideoSizes120) + this.getOutputSizeshNQ4ISI[6] + 1836072691, 6) + highSpeedVideoSizes118;
        int highSpeedVideoSizes122 = getHighSpeedVideoSizes(highSpeedVideoSizes117, 10);
        int highSpeedVideoSizes123 = getHighSpeedVideoSizes(highSpeedVideoSizes118 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes121, highSpeedVideoSizes119, highSpeedVideoSizes122) + this.getOutputSizeshNQ4ISI[9] + 1836072691, 14) + highSpeedVideoSizes120;
        int highSpeedVideoSizes124 = getHighSpeedVideoSizes(highSpeedVideoSizes119, 10);
        int highSpeedVideoSizes125 = getHighSpeedVideoSizes(highSpeedVideoSizes120 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes123, highSpeedVideoSizes121, highSpeedVideoSizes124) + this.getOutputSizeshNQ4ISI[11] + 1836072691, 12) + highSpeedVideoSizes122;
        int highSpeedVideoSizes126 = getHighSpeedVideoSizes(highSpeedVideoSizes121, 10);
        int highSpeedVideoSizes127 = getHighSpeedVideoSizes(highSpeedVideoSizes122 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes125, highSpeedVideoSizes123, highSpeedVideoSizes126) + this.getOutputSizeshNQ4ISI[8] + 1836072691, 13) + highSpeedVideoSizes124;
        int highSpeedVideoSizes128 = getHighSpeedVideoSizes(highSpeedVideoSizes123, 10);
        int highSpeedVideoSizes129 = getHighSpeedVideoSizes(highSpeedVideoSizes124 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes127, highSpeedVideoSizes125, highSpeedVideoSizes128) + this.getOutputSizeshNQ4ISI[12] + 1836072691, 5) + highSpeedVideoSizes126;
        int highSpeedVideoSizes130 = getHighSpeedVideoSizes(highSpeedVideoSizes125, 10);
        int highSpeedVideoSizes131 = getHighSpeedVideoSizes(highSpeedVideoSizes126 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes129, highSpeedVideoSizes127, highSpeedVideoSizes130) + this.getOutputSizeshNQ4ISI[2] + 1836072691, 14) + highSpeedVideoSizes128;
        int highSpeedVideoSizes132 = getHighSpeedVideoSizes(highSpeedVideoSizes127, 10);
        int highSpeedVideoSizes133 = getHighSpeedVideoSizes(highSpeedVideoSizes128 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes131, highSpeedVideoSizes129, highSpeedVideoSizes132) + this.getOutputSizeshNQ4ISI[10] + 1836072691, 13) + highSpeedVideoSizes130;
        int highSpeedVideoSizes134 = getHighSpeedVideoSizes(highSpeedVideoSizes129, 10);
        int highSpeedVideoSizes135 = getHighSpeedVideoSizes(highSpeedVideoSizes130 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes133, highSpeedVideoSizes131, highSpeedVideoSizes134) + this.getOutputSizeshNQ4ISI[0] + 1836072691, 13) + highSpeedVideoSizes132;
        int highSpeedVideoSizes136 = getHighSpeedVideoSizes(highSpeedVideoSizes131, 10);
        int highSpeedVideoSizes137 = getHighSpeedVideoSizes(highSpeedVideoSizes132 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes135, highSpeedVideoSizes133, highSpeedVideoSizes136) + this.getOutputSizeshNQ4ISI[4] + 1836072691, 7) + highSpeedVideoSizes134;
        int highSpeedVideoSizes138 = getHighSpeedVideoSizes(highSpeedVideoSizes133, 10);
        int highSpeedVideoSizes139 = getHighSpeedVideoSizes(highSpeedVideoSizes134 + getHighSpeedVideoFpsRanges(highSpeedVideoSizes137, highSpeedVideoSizes135, highSpeedVideoSizes138) + this.getOutputSizeshNQ4ISI[13] + 1836072691, 5) + highSpeedVideoSizes136;
        int highSpeedVideoSizes140 = getHighSpeedVideoSizes(highSpeedVideoSizes135, 10);
        int highSpeedVideoSizes141 = getHighSpeedVideoSizes(((highSpeedVideoSizes136 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes107, highSpeedVideoSizes105, highSpeedVideoSizes108)) + this.getOutputSizeshNQ4ISI[1]) - 1894007588, 11) + highSpeedVideoSizes106;
        int highSpeedVideoSizes142 = getHighSpeedVideoSizes(highSpeedVideoSizes105, 10);
        int highSpeedVideoSizes143 = getHighSpeedVideoSizes(((highSpeedVideoSizes106 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes141, highSpeedVideoSizes107, highSpeedVideoSizes142)) + this.getOutputSizeshNQ4ISI[9]) - 1894007588, 12) + highSpeedVideoSizes108;
        int highSpeedVideoSizes144 = getHighSpeedVideoSizes(highSpeedVideoSizes107, 10);
        int highSpeedVideoSizes145 = getHighSpeedVideoSizes(((highSpeedVideoSizes108 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes143, highSpeedVideoSizes141, highSpeedVideoSizes144)) + this.getOutputSizeshNQ4ISI[11]) - 1894007588, 14) + highSpeedVideoSizes142;
        int highSpeedVideoSizes146 = getHighSpeedVideoSizes(highSpeedVideoSizes141, 10);
        int highSpeedVideoSizes147 = getHighSpeedVideoSizes(((highSpeedVideoSizes142 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes145, highSpeedVideoSizes143, highSpeedVideoSizes146)) + this.getOutputSizeshNQ4ISI[10]) - 1894007588, 15) + highSpeedVideoSizes144;
        int highSpeedVideoSizes148 = getHighSpeedVideoSizes(highSpeedVideoSizes143, 10);
        int highSpeedVideoSizes149 = getHighSpeedVideoSizes(((highSpeedVideoSizes144 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes147, highSpeedVideoSizes145, highSpeedVideoSizes148)) + this.getOutputSizeshNQ4ISI[0]) - 1894007588, 14) + highSpeedVideoSizes146;
        int highSpeedVideoSizes150 = getHighSpeedVideoSizes(highSpeedVideoSizes145, 10);
        int highSpeedVideoSizes151 = getHighSpeedVideoSizes(((highSpeedVideoSizes146 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes149, highSpeedVideoSizes147, highSpeedVideoSizes150)) + this.getOutputSizeshNQ4ISI[8]) - 1894007588, 15) + highSpeedVideoSizes148;
        int highSpeedVideoSizes152 = getHighSpeedVideoSizes(highSpeedVideoSizes147, 10);
        int highSpeedVideoSizes153 = getHighSpeedVideoSizes(((highSpeedVideoSizes148 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes151, highSpeedVideoSizes149, highSpeedVideoSizes152)) + this.getOutputSizeshNQ4ISI[12]) - 1894007588, 9) + highSpeedVideoSizes150;
        int highSpeedVideoSizes154 = getHighSpeedVideoSizes(highSpeedVideoSizes149, 10);
        int highSpeedVideoSizes155 = getHighSpeedVideoSizes(((highSpeedVideoSizes150 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes153, highSpeedVideoSizes151, highSpeedVideoSizes154)) + this.getOutputSizeshNQ4ISI[4]) - 1894007588, 8) + highSpeedVideoSizes152;
        int highSpeedVideoSizes156 = getHighSpeedVideoSizes(highSpeedVideoSizes151, 10);
        int highSpeedVideoSizes157 = getHighSpeedVideoSizes(((highSpeedVideoSizes152 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes155, highSpeedVideoSizes153, highSpeedVideoSizes156)) + this.getOutputSizeshNQ4ISI[13]) - 1894007588, 9) + highSpeedVideoSizes154;
        int highSpeedVideoSizes158 = getHighSpeedVideoSizes(highSpeedVideoSizes153, 10);
        int highSpeedVideoSizes159 = getHighSpeedVideoSizes(((highSpeedVideoSizes154 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes157, highSpeedVideoSizes155, highSpeedVideoSizes158)) + this.getOutputSizeshNQ4ISI[3]) - 1894007588, 14) + highSpeedVideoSizes156;
        int highSpeedVideoSizes160 = getHighSpeedVideoSizes(highSpeedVideoSizes155, 10);
        int highSpeedVideoSizes161 = getHighSpeedVideoSizes(((highSpeedVideoSizes156 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes159, highSpeedVideoSizes157, highSpeedVideoSizes160)) + this.getOutputSizeshNQ4ISI[7]) - 1894007588, 5) + highSpeedVideoSizes158;
        int highSpeedVideoSizes162 = getHighSpeedVideoSizes(highSpeedVideoSizes157, 10);
        int highSpeedVideoSizes163 = getHighSpeedVideoSizes(((highSpeedVideoSizes158 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes161, highSpeedVideoSizes159, highSpeedVideoSizes162)) + this.getOutputSizeshNQ4ISI[15]) - 1894007588, 6) + highSpeedVideoSizes160;
        int highSpeedVideoSizes164 = getHighSpeedVideoSizes(highSpeedVideoSizes159, 10);
        int highSpeedVideoSizes165 = getHighSpeedVideoSizes(((highSpeedVideoSizes160 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes163, highSpeedVideoSizes161, highSpeedVideoSizes164)) + this.getOutputSizeshNQ4ISI[14]) - 1894007588, 8) + highSpeedVideoSizes162;
        int highSpeedVideoSizes166 = getHighSpeedVideoSizes(highSpeedVideoSizes161, 10);
        int highSpeedVideoSizes167 = getHighSpeedVideoSizes(((highSpeedVideoSizes162 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes165, highSpeedVideoSizes163, highSpeedVideoSizes166)) + this.getOutputSizeshNQ4ISI[5]) - 1894007588, 6) + highSpeedVideoSizes164;
        int highSpeedVideoSizes168 = getHighSpeedVideoSizes(highSpeedVideoSizes163, 10);
        int highSpeedVideoSizes169 = getHighSpeedVideoSizes(((highSpeedVideoSizes164 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes167, highSpeedVideoSizes165, highSpeedVideoSizes168)) + this.getOutputSizeshNQ4ISI[6]) - 1894007588, 5) + highSpeedVideoSizes166;
        int highSpeedVideoSizes170 = getHighSpeedVideoSizes(highSpeedVideoSizes165, 10);
        int highSpeedVideoSizes171 = getHighSpeedVideoSizes(((highSpeedVideoSizes166 + getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes169, highSpeedVideoSizes167, highSpeedVideoSizes170)) + this.getOutputSizeshNQ4ISI[2]) - 1894007588, 12) + highSpeedVideoSizes168;
        int highSpeedVideoSizes172 = getHighSpeedVideoSizes(highSpeedVideoSizes167, 10);
        int highSpeedVideoSizes173 = getHighSpeedVideoSizes(highSpeedVideoSizes104 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes139, highSpeedVideoSizes137, highSpeedVideoSizes140) + this.getOutputSizeshNQ4ISI[8] + 2053994217, 15) + highSpeedVideoSizes138;
        int highSpeedVideoSizes174 = getHighSpeedVideoSizes(highSpeedVideoSizes137, 10);
        int highSpeedVideoSizes175 = getHighSpeedVideoSizes(highSpeedVideoSizes138 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes173, highSpeedVideoSizes139, highSpeedVideoSizes174) + this.getOutputSizeshNQ4ISI[6] + 2053994217, 5) + highSpeedVideoSizes140;
        int highSpeedVideoSizes176 = getHighSpeedVideoSizes(highSpeedVideoSizes139, 10);
        int highSpeedVideoSizes177 = getHighSpeedVideoSizes(highSpeedVideoSizes140 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes175, highSpeedVideoSizes173, highSpeedVideoSizes176) + this.getOutputSizeshNQ4ISI[4] + 2053994217, 8) + highSpeedVideoSizes174;
        int highSpeedVideoSizes178 = getHighSpeedVideoSizes(highSpeedVideoSizes173, 10);
        int highSpeedVideoSizes179 = getHighSpeedVideoSizes(highSpeedVideoSizes174 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes177, highSpeedVideoSizes175, highSpeedVideoSizes178) + this.getOutputSizeshNQ4ISI[1] + 2053994217, 11) + highSpeedVideoSizes176;
        int highSpeedVideoSizes180 = getHighSpeedVideoSizes(highSpeedVideoSizes175, 10);
        int highSpeedVideoSizes181 = getHighSpeedVideoSizes(highSpeedVideoSizes176 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes179, highSpeedVideoSizes177, highSpeedVideoSizes180) + this.getOutputSizeshNQ4ISI[3] + 2053994217, 14) + highSpeedVideoSizes178;
        int highSpeedVideoSizes182 = getHighSpeedVideoSizes(highSpeedVideoSizes177, 10);
        int highSpeedVideoSizes183 = getHighSpeedVideoSizes(highSpeedVideoSizes178 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes181, highSpeedVideoSizes179, highSpeedVideoSizes182) + this.getOutputSizeshNQ4ISI[11] + 2053994217, 14) + highSpeedVideoSizes180;
        int highSpeedVideoSizes184 = getHighSpeedVideoSizes(highSpeedVideoSizes179, 10);
        int highSpeedVideoSizes185 = getHighSpeedVideoSizes(highSpeedVideoSizes180 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes183, highSpeedVideoSizes181, highSpeedVideoSizes184) + this.getOutputSizeshNQ4ISI[15] + 2053994217, 6) + highSpeedVideoSizes182;
        int highSpeedVideoSizes186 = getHighSpeedVideoSizes(highSpeedVideoSizes181, 10);
        int highSpeedVideoSizes187 = getHighSpeedVideoSizes(highSpeedVideoSizes182 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes185, highSpeedVideoSizes183, highSpeedVideoSizes186) + this.getOutputSizeshNQ4ISI[0] + 2053994217, 14) + highSpeedVideoSizes184;
        int highSpeedVideoSizes188 = getHighSpeedVideoSizes(highSpeedVideoSizes183, 10);
        int highSpeedVideoSizes189 = getHighSpeedVideoSizes(highSpeedVideoSizes184 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes187, highSpeedVideoSizes185, highSpeedVideoSizes188) + this.getOutputSizeshNQ4ISI[5] + 2053994217, 6) + highSpeedVideoSizes186;
        int highSpeedVideoSizes190 = getHighSpeedVideoSizes(highSpeedVideoSizes185, 10);
        int highSpeedVideoSizes191 = getHighSpeedVideoSizes(highSpeedVideoSizes186 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes189, highSpeedVideoSizes187, highSpeedVideoSizes190) + this.getOutputSizeshNQ4ISI[12] + 2053994217, 9) + highSpeedVideoSizes188;
        int highSpeedVideoSizes192 = getHighSpeedVideoSizes(highSpeedVideoSizes187, 10);
        int highSpeedVideoSizes193 = getHighSpeedVideoSizes(highSpeedVideoSizes188 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes191, highSpeedVideoSizes189, highSpeedVideoSizes192) + this.getOutputSizeshNQ4ISI[2] + 2053994217, 12) + highSpeedVideoSizes190;
        int highSpeedVideoSizes194 = getHighSpeedVideoSizes(highSpeedVideoSizes189, 10);
        int highSpeedVideoSizes195 = getHighSpeedVideoSizes(highSpeedVideoSizes190 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes193, highSpeedVideoSizes191, highSpeedVideoSizes194) + this.getOutputSizeshNQ4ISI[13] + 2053994217, 9) + highSpeedVideoSizes192;
        int highSpeedVideoSizes196 = getHighSpeedVideoSizes(highSpeedVideoSizes191, 10);
        int highSpeedVideoSizes197 = getHighSpeedVideoSizes(highSpeedVideoSizes192 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes195, highSpeedVideoSizes193, highSpeedVideoSizes196) + this.getOutputSizeshNQ4ISI[9] + 2053994217, 12) + highSpeedVideoSizes194;
        int highSpeedVideoSizes198 = getHighSpeedVideoSizes(highSpeedVideoSizes193, 10);
        int highSpeedVideoSizes199 = getHighSpeedVideoSizes(highSpeedVideoSizes194 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes197, highSpeedVideoSizes195, highSpeedVideoSizes198) + this.getOutputSizeshNQ4ISI[7] + 2053994217, 5) + highSpeedVideoSizes196;
        int highSpeedVideoSizes200 = getHighSpeedVideoSizes(highSpeedVideoSizes195, 10);
        int highSpeedVideoSizes201 = getHighSpeedVideoSizes(highSpeedVideoSizes196 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes199, highSpeedVideoSizes197, highSpeedVideoSizes200) + this.getOutputSizeshNQ4ISI[10] + 2053994217, 15) + highSpeedVideoSizes198;
        int highSpeedVideoSizes202 = getHighSpeedVideoSizes(highSpeedVideoSizes197, 10);
        int highSpeedVideoSizes203 = getHighSpeedVideoSizes(highSpeedVideoSizes198 + getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes201, highSpeedVideoSizes199, highSpeedVideoSizes202) + this.getOutputSizeshNQ4ISI[14] + 2053994217, 8) + highSpeedVideoSizes200;
        int highSpeedVideoSizes204 = getHighSpeedVideoSizes(highSpeedVideoSizes199, 10);
        int highSpeedVideoSizes205 = getHighSpeedVideoSizes(((highSpeedVideoSizes168 + Camera2StreamConfigurationMap(highSpeedVideoSizes171, highSpeedVideoSizes201, highSpeedVideoSizes172)) + this.getOutputSizeshNQ4ISI[4]) - 1454113458, 9) + highSpeedVideoSizes170;
        int highSpeedVideoSizes206 = getHighSpeedVideoSizes(highSpeedVideoSizes201, 10);
        int highSpeedVideoSizes207 = getHighSpeedVideoSizes(((highSpeedVideoSizes170 + Camera2StreamConfigurationMap(highSpeedVideoSizes205, highSpeedVideoSizes171, highSpeedVideoSizes206)) + this.getOutputSizeshNQ4ISI[0]) - 1454113458, 15) + highSpeedVideoSizes172;
        int highSpeedVideoSizes208 = getHighSpeedVideoSizes(highSpeedVideoSizes171, 10);
        int highSpeedVideoSizes209 = getHighSpeedVideoSizes(((highSpeedVideoSizes172 + Camera2StreamConfigurationMap(highSpeedVideoSizes207, highSpeedVideoSizes205, highSpeedVideoSizes208)) + this.getOutputSizeshNQ4ISI[5]) - 1454113458, 5) + highSpeedVideoSizes206;
        int highSpeedVideoSizes210 = getHighSpeedVideoSizes(highSpeedVideoSizes205, 10);
        int highSpeedVideoSizes211 = getHighSpeedVideoSizes(((highSpeedVideoSizes206 + Camera2StreamConfigurationMap(highSpeedVideoSizes209, highSpeedVideoSizes207, highSpeedVideoSizes210)) + this.getOutputSizeshNQ4ISI[9]) - 1454113458, 11) + highSpeedVideoSizes208;
        int highSpeedVideoSizes212 = getHighSpeedVideoSizes(highSpeedVideoSizes207, 10);
        int highSpeedVideoSizes213 = getHighSpeedVideoSizes(((highSpeedVideoSizes208 + Camera2StreamConfigurationMap(highSpeedVideoSizes211, highSpeedVideoSizes209, highSpeedVideoSizes212)) + this.getOutputSizeshNQ4ISI[7]) - 1454113458, 6) + highSpeedVideoSizes210;
        int highSpeedVideoSizes214 = getHighSpeedVideoSizes(highSpeedVideoSizes209, 10);
        int highSpeedVideoSizes215 = getHighSpeedVideoSizes(((highSpeedVideoSizes210 + Camera2StreamConfigurationMap(highSpeedVideoSizes213, highSpeedVideoSizes211, highSpeedVideoSizes214)) + this.getOutputSizeshNQ4ISI[12]) - 1454113458, 8) + highSpeedVideoSizes212;
        int highSpeedVideoSizes216 = getHighSpeedVideoSizes(highSpeedVideoSizes211, 10);
        int highSpeedVideoSizes217 = getHighSpeedVideoSizes(((highSpeedVideoSizes212 + Camera2StreamConfigurationMap(highSpeedVideoSizes215, highSpeedVideoSizes213, highSpeedVideoSizes216)) + this.getOutputSizeshNQ4ISI[2]) - 1454113458, 13) + highSpeedVideoSizes214;
        int highSpeedVideoSizes218 = getHighSpeedVideoSizes(highSpeedVideoSizes213, 10);
        int highSpeedVideoSizes219 = getHighSpeedVideoSizes(((highSpeedVideoSizes214 + Camera2StreamConfigurationMap(highSpeedVideoSizes217, highSpeedVideoSizes215, highSpeedVideoSizes218)) + this.getOutputSizeshNQ4ISI[10]) - 1454113458, 12) + highSpeedVideoSizes216;
        int highSpeedVideoSizes220 = getHighSpeedVideoSizes(highSpeedVideoSizes215, 10);
        int highSpeedVideoSizes221 = getHighSpeedVideoSizes(((highSpeedVideoSizes216 + Camera2StreamConfigurationMap(highSpeedVideoSizes219, highSpeedVideoSizes217, highSpeedVideoSizes220)) + this.getOutputSizeshNQ4ISI[14]) - 1454113458, 5) + highSpeedVideoSizes218;
        int highSpeedVideoSizes222 = getHighSpeedVideoSizes(highSpeedVideoSizes217, 10);
        int highSpeedVideoSizes223 = getHighSpeedVideoSizes(((highSpeedVideoSizes218 + Camera2StreamConfigurationMap(highSpeedVideoSizes221, highSpeedVideoSizes219, highSpeedVideoSizes222)) + this.getOutputSizeshNQ4ISI[1]) - 1454113458, 12) + highSpeedVideoSizes220;
        int highSpeedVideoSizes224 = getHighSpeedVideoSizes(highSpeedVideoSizes219, 10);
        int highSpeedVideoSizes225 = getHighSpeedVideoSizes(((highSpeedVideoSizes220 + Camera2StreamConfigurationMap(highSpeedVideoSizes223, highSpeedVideoSizes221, highSpeedVideoSizes224)) + this.getOutputSizeshNQ4ISI[3]) - 1454113458, 13) + highSpeedVideoSizes222;
        int highSpeedVideoSizes226 = getHighSpeedVideoSizes(highSpeedVideoSizes221, 10);
        int highSpeedVideoSizes227 = getHighSpeedVideoSizes(((highSpeedVideoSizes222 + Camera2StreamConfigurationMap(highSpeedVideoSizes225, highSpeedVideoSizes223, highSpeedVideoSizes226)) + this.getOutputSizeshNQ4ISI[8]) - 1454113458, 14) + highSpeedVideoSizes224;
        int highSpeedVideoSizes228 = getHighSpeedVideoSizes(highSpeedVideoSizes223, 10);
        int highSpeedVideoSizes229 = getHighSpeedVideoSizes(((highSpeedVideoSizes224 + Camera2StreamConfigurationMap(highSpeedVideoSizes227, highSpeedVideoSizes225, highSpeedVideoSizes228)) + this.getOutputSizeshNQ4ISI[11]) - 1454113458, 11) + highSpeedVideoSizes226;
        int highSpeedVideoSizes230 = getHighSpeedVideoSizes(highSpeedVideoSizes225, 10);
        int highSpeedVideoSizes231 = getHighSpeedVideoSizes(((highSpeedVideoSizes226 + Camera2StreamConfigurationMap(highSpeedVideoSizes229, highSpeedVideoSizes227, highSpeedVideoSizes230)) + this.getOutputSizeshNQ4ISI[6]) - 1454113458, 8) + highSpeedVideoSizes228;
        int highSpeedVideoSizes232 = getHighSpeedVideoSizes(highSpeedVideoSizes227, 10);
        int highSpeedVideoSizes233 = getHighSpeedVideoSizes(((highSpeedVideoSizes228 + Camera2StreamConfigurationMap(highSpeedVideoSizes231, highSpeedVideoSizes229, highSpeedVideoSizes232)) + this.getOutputSizeshNQ4ISI[15]) - 1454113458, 5) + highSpeedVideoSizes230;
        int highSpeedVideoSizes234 = getHighSpeedVideoSizes(highSpeedVideoSizes229, 10);
        int highSpeedVideoSizes235 = getHighSpeedVideoSizes(((highSpeedVideoSizes230 + Camera2StreamConfigurationMap(highSpeedVideoSizes233, highSpeedVideoSizes231, highSpeedVideoSizes234)) + this.getOutputSizeshNQ4ISI[13]) - 1454113458, 6);
        int highSpeedVideoSizes236 = getHighSpeedVideoSizes(highSpeedVideoSizes231, 10);
        int highSpeedVideoSizes237 = getHighSpeedVideoSizes(highSpeedVideoSizes200 + getHighSpeedVideoSizes(highSpeedVideoSizes203, highSpeedVideoSizes169, highSpeedVideoSizes204) + this.getOutputSizeshNQ4ISI[12], 8) + highSpeedVideoSizes202;
        int highSpeedVideoSizes238 = getHighSpeedVideoSizes(highSpeedVideoSizes169, 10);
        int highSpeedVideoSizes239 = getHighSpeedVideoSizes(highSpeedVideoSizes202 + getHighSpeedVideoSizes(highSpeedVideoSizes237, highSpeedVideoSizes203, highSpeedVideoSizes238) + this.getOutputSizeshNQ4ISI[15], 5) + highSpeedVideoSizes204;
        int highSpeedVideoSizes240 = getHighSpeedVideoSizes(highSpeedVideoSizes203, 10);
        int highSpeedVideoSizes241 = getHighSpeedVideoSizes(highSpeedVideoSizes204 + getHighSpeedVideoSizes(highSpeedVideoSizes239, highSpeedVideoSizes237, highSpeedVideoSizes240) + this.getOutputSizeshNQ4ISI[10], 12) + highSpeedVideoSizes238;
        int highSpeedVideoSizes242 = getHighSpeedVideoSizes(highSpeedVideoSizes237, 10);
        int highSpeedVideoSizes243 = getHighSpeedVideoSizes(highSpeedVideoSizes238 + getHighSpeedVideoSizes(highSpeedVideoSizes241, highSpeedVideoSizes239, highSpeedVideoSizes242) + this.getOutputSizeshNQ4ISI[4], 9) + highSpeedVideoSizes240;
        int highSpeedVideoSizes244 = getHighSpeedVideoSizes(highSpeedVideoSizes239, 10);
        int highSpeedVideoSizes245 = getHighSpeedVideoSizes(highSpeedVideoSizes240 + getHighSpeedVideoSizes(highSpeedVideoSizes243, highSpeedVideoSizes241, highSpeedVideoSizes244) + this.getOutputSizeshNQ4ISI[1], 12) + highSpeedVideoSizes242;
        int highSpeedVideoSizes246 = getHighSpeedVideoSizes(highSpeedVideoSizes241, 10);
        int highSpeedVideoSizes247 = getHighSpeedVideoSizes(highSpeedVideoSizes242 + getHighSpeedVideoSizes(highSpeedVideoSizes245, highSpeedVideoSizes243, highSpeedVideoSizes246) + this.getOutputSizeshNQ4ISI[5], 5) + highSpeedVideoSizes244;
        int highSpeedVideoSizes248 = getHighSpeedVideoSizes(highSpeedVideoSizes243, 10);
        int highSpeedVideoSizes249 = getHighSpeedVideoSizes(highSpeedVideoSizes244 + getHighSpeedVideoSizes(highSpeedVideoSizes247, highSpeedVideoSizes245, highSpeedVideoSizes248) + this.getOutputSizeshNQ4ISI[8], 14) + highSpeedVideoSizes246;
        int highSpeedVideoSizes250 = getHighSpeedVideoSizes(highSpeedVideoSizes245, 10);
        int highSpeedVideoSizes251 = getHighSpeedVideoSizes(highSpeedVideoSizes246 + getHighSpeedVideoSizes(highSpeedVideoSizes249, highSpeedVideoSizes247, highSpeedVideoSizes250) + this.getOutputSizeshNQ4ISI[7], 6) + highSpeedVideoSizes248;
        int highSpeedVideoSizes252 = getHighSpeedVideoSizes(highSpeedVideoSizes247, 10);
        int highSpeedVideoSizes253 = getHighSpeedVideoSizes(highSpeedVideoSizes248 + getHighSpeedVideoSizes(highSpeedVideoSizes251, highSpeedVideoSizes249, highSpeedVideoSizes252) + this.getOutputSizeshNQ4ISI[6], 8) + highSpeedVideoSizes250;
        int highSpeedVideoSizes254 = getHighSpeedVideoSizes(highSpeedVideoSizes249, 10);
        int highSpeedVideoSizes255 = getHighSpeedVideoSizes(highSpeedVideoSizes250 + getHighSpeedVideoSizes(highSpeedVideoSizes253, highSpeedVideoSizes251, highSpeedVideoSizes254) + this.getOutputSizeshNQ4ISI[2], 13) + highSpeedVideoSizes252;
        int highSpeedVideoSizes256 = getHighSpeedVideoSizes(highSpeedVideoSizes251, 10);
        int highSpeedVideoSizes257 = getHighSpeedVideoSizes(highSpeedVideoSizes252 + getHighSpeedVideoSizes(highSpeedVideoSizes255, highSpeedVideoSizes253, highSpeedVideoSizes256) + this.getOutputSizeshNQ4ISI[13], 6) + highSpeedVideoSizes254;
        int highSpeedVideoSizes258 = getHighSpeedVideoSizes(highSpeedVideoSizes253, 10);
        int highSpeedVideoSizes259 = getHighSpeedVideoSizes(highSpeedVideoSizes254 + getHighSpeedVideoSizes(highSpeedVideoSizes257, highSpeedVideoSizes255, highSpeedVideoSizes258) + this.getOutputSizeshNQ4ISI[14], 5) + highSpeedVideoSizes256;
        int highSpeedVideoSizes260 = getHighSpeedVideoSizes(highSpeedVideoSizes255, 10);
        int highSpeedVideoSizes261 = getHighSpeedVideoSizes(highSpeedVideoSizes256 + getHighSpeedVideoSizes(highSpeedVideoSizes259, highSpeedVideoSizes257, highSpeedVideoSizes260) + this.getOutputSizeshNQ4ISI[0], 15) + highSpeedVideoSizes258;
        int highSpeedVideoSizes262 = getHighSpeedVideoSizes(highSpeedVideoSizes257, 10);
        int highSpeedVideoSizes263 = getHighSpeedVideoSizes(highSpeedVideoSizes258 + getHighSpeedVideoSizes(highSpeedVideoSizes261, highSpeedVideoSizes259, highSpeedVideoSizes262) + this.getOutputSizeshNQ4ISI[3], 13) + highSpeedVideoSizes260;
        int highSpeedVideoSizes264 = getHighSpeedVideoSizes(highSpeedVideoSizes259, 10);
        int highSpeedVideoSizes265 = getHighSpeedVideoSizes(highSpeedVideoSizes260 + getHighSpeedVideoSizes(highSpeedVideoSizes263, highSpeedVideoSizes261, highSpeedVideoSizes264) + this.getOutputSizeshNQ4ISI[9], 11) + highSpeedVideoSizes262;
        int highSpeedVideoSizes266 = getHighSpeedVideoSizes(highSpeedVideoSizes261, 10);
        int highSpeedVideoSizes267 = getHighSpeedVideoSizes(highSpeedVideoSizes262 + getHighSpeedVideoSizes(highSpeedVideoSizes265, highSpeedVideoSizes263, highSpeedVideoSizes266) + this.getOutputSizeshNQ4ISI[11], 11);
        int highSpeedVideoSizes268 = getHighSpeedVideoSizes(highSpeedVideoSizes263, 10);
        this.getHighSpeedVideoFpsRanges += highSpeedVideoSizes232;
        this.getHighSpeedVideoFpsRangesFor += highSpeedVideoSizes235 + highSpeedVideoSizes232;
        this.getHighSpeedVideoSizes += highSpeedVideoSizes233;
        this.getHighResolutionOutputSizeshNQ4ISI += highSpeedVideoSizes236;
        this.Camera2StreamConfigurationMap += highSpeedVideoSizes266;
        this.getInputSizeshNQ4ISI += highSpeedVideoSizes264;
        this.getOutputFormats += highSpeedVideoSizes267 + highSpeedVideoSizes264;
        this.getInputFormats += highSpeedVideoSizes265;
        this.getHighSpeedVideoSizesFor += highSpeedVideoSizes268;
        this.getOutputMinFrameDuration += highSpeedVideoSizes234;
        this.getOutputStallDurationlomOqCM = 0;
        int i100 = 0;
        while (true) {
            int[] iArr2 = this.getOutputSizeshNQ4ISI;
            if (i100 == iArr2.length) {
                return;
            }
            iArr2[i100] = 0;
            i100++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        getHighResolutionOutputSizeshNQ4ISI((org.bouncycastle.crypto.digests.RIPEMD320Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.getHighSpeedVideoFpsRanges = 1732584193;
        this.getHighSpeedVideoFpsRangesFor = -271733879;
        this.getHighSpeedVideoSizes = -1732584194;
        this.getHighResolutionOutputSizeshNQ4ISI = 271733878;
        this.Camera2StreamConfigurationMap = -1009589776;
        this.getInputSizeshNQ4ISI = 1985229328;
        this.getOutputFormats = -19088744;
        this.getInputFormats = -1985229329;
        this.getHighSpeedVideoSizesFor = 19088743;
        this.getOutputMinFrameDuration = 1009589775;
        this.getOutputStallDurationlomOqCM = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.getOutputSizeshNQ4ISI;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i) {
        int[] iArr = this.getOutputSizeshNQ4ISI;
        int i2 = this.getOutputStallDurationlomOqCM;
        int i3 = i2 + 1;
        this.getOutputStallDurationlomOqCM = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j) {
        if (this.getOutputStallDurationlomOqCM > 14) {
            processBlock();
        }
        int[] iArr = this.getOutputSizeshNQ4ISI;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "RIPEMD320";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, bArr, i);
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, bArr, i + 4);
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, bArr, i + 8);
        getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, bArr, i + 12);
        getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, bArr, i + 16);
        getHighSpeedVideoFpsRanges(this.getInputSizeshNQ4ISI, bArr, i + 20);
        getHighSpeedVideoFpsRanges(this.getOutputFormats, bArr, i + 24);
        getHighSpeedVideoFpsRanges(this.getInputFormats, bArr, i + 28);
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor, bArr, i + 32);
        getHighSpeedVideoFpsRanges(this.getOutputMinFrameDuration, bArr, i + 36);
        reset();
        return 40;
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.RIPEMD320Digest(this);
    }

    private static void getHighSpeedVideoFpsRanges(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.digests.RIPEMD320Digest rIPEMD320Digest) {
        super.copyIn(rIPEMD320Digest);
        this.getHighSpeedVideoFpsRanges = rIPEMD320Digest.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = rIPEMD320Digest.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = rIPEMD320Digest.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = rIPEMD320Digest.getHighResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = rIPEMD320Digest.Camera2StreamConfigurationMap;
        this.getInputSizeshNQ4ISI = rIPEMD320Digest.getInputSizeshNQ4ISI;
        this.getOutputFormats = rIPEMD320Digest.getOutputFormats;
        this.getInputFormats = rIPEMD320Digest.getInputFormats;
        this.getHighSpeedVideoSizesFor = rIPEMD320Digest.getHighSpeedVideoSizesFor;
        this.getOutputMinFrameDuration = rIPEMD320Digest.getOutputMinFrameDuration;
        int[] iArr = rIPEMD320Digest.getOutputSizeshNQ4ISI;
        java.lang.System.arraycopy(iArr, 0, this.getOutputSizeshNQ4ISI, 0, iArr.length);
        this.getOutputStallDurationlomOqCM = rIPEMD320Digest.getOutputStallDurationlomOqCM;
    }

    public RIPEMD320Digest(org.bouncycastle.crypto.digests.RIPEMD320Digest rIPEMD320Digest) {
        super(rIPEMD320Digest);
        this.getOutputSizeshNQ4ISI = new int[16];
        getHighResolutionOutputSizeshNQ4ISI(rIPEMD320Digest);
    }

    public RIPEMD320Digest() {
        this.getOutputSizeshNQ4ISI = new int[16];
        reset();
    }
}

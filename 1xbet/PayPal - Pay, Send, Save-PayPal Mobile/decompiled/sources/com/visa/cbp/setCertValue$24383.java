package com.visa.cbp;

/* loaded from: classes16.dex */
public class setCertValue$24383 {
    public long BuildConfig;
    public float ConfirmReplenishRequest;
    public int ReplenishAckRequest;
    public double ReplenishRequest;
    private final java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getInputFormats;
    public java.lang.Object getTokenInfo;
    public java.lang.Object getTvls;
    public double setTokenInfo;
    public float setTvls;
    public int valueOf;
    public long values;
    private final int[] Camera2StreamConfigurationMap = new int[19];
    private final long[] getHighSpeedVideoFpsRangesFor = new long[19];
    private final float[] getHighSpeedVideoSizes = new float[19];
    private final double[] getOutputFormats = new double[19];

    public int values(int i) {
        switch (i) {
            case 1:
                int[] iArr = this.Camera2StreamConfigurationMap;
                int i2 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i2 + 1;
                iArr[i2] = 5;
                return 0;
            case 2:
                int i3 = this.getHighSpeedVideoFpsRanges - this.ReplenishAckRequest;
                this.getHighSpeedVideoFpsRanges = i3;
                this.getInputFormats = i3;
                return 0;
            case 3:
                int[] iArr2 = this.Camera2StreamConfigurationMap;
                int i4 = this.getInputFormats;
                this.getInputFormats = i4 + 1;
                this.valueOf = iArr2[i4];
                return 0;
            case 4:
                java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
                int i5 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i5 + 1;
                objArr[i5] = this.getTokenInfo;
                return 0;
            case 5:
                int i6 = this.getHighSpeedVideoFpsRanges - 1;
                this.getHighSpeedVideoFpsRanges = i6;
                java.lang.Object[] objArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj = objArr2[i6];
                objArr2[i6] = null;
                objArr2[10] = obj;
                return 0;
            case 6:
                int i7 = this.getHighSpeedVideoFpsRanges;
                int i8 = i7 - 1;
                java.lang.Object[] objArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj2 = objArr3[i8];
                objArr3[i8] = null;
                objArr3[11] = obj2;
                this.Camera2StreamConfigurationMap[i8] = 5;
                this.getHighSpeedVideoFpsRanges = i7 + 1;
                objArr3[i7] = objArr3[9];
                return 0;
            case 7:
                int[] iArr3 = this.Camera2StreamConfigurationMap;
                int i9 = this.getHighSpeedVideoFpsRanges;
                java.lang.Object[] objArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i10 = i9 - 1;
                java.lang.Object obj3 = objArr4[i10];
                objArr4[i10] = null;
                iArr3[i10] = ((byte[]) obj3).length;
                return 0;
            case 8:
                int i11 = this.getHighSpeedVideoFpsRanges;
                int i12 = i11 - 1;
                this.getHighSpeedVideoFpsRanges = i12;
                int[] iArr4 = this.Camera2StreamConfigurationMap;
                int i13 = i11 - 2;
                iArr4[i13] = iArr4[i13] * iArr4[i12];
                return 0;
            case 9:
                java.lang.Object[] objArr5 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i14 = this.getHighSpeedVideoFpsRanges;
                int i15 = i14 - 1;
                objArr5[i15] = new byte[this.Camera2StreamConfigurationMap[i15]];
                int i16 = i14 - 1;
                this.getHighSpeedVideoFpsRanges = i16;
                java.lang.Object obj4 = objArr5[i16];
                objArr5[i16] = null;
                objArr5[12] = obj4;
                return 0;
            case 10:
                java.lang.Object[] objArr6 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i17 = this.getInputFormats;
                this.getInputFormats = i17 + 1;
                java.lang.Object obj5 = objArr6[i17];
                objArr6[i17] = null;
                this.getTvls = obj5;
                return 0;
            case 11:
                java.lang.Object[] objArr7 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i18 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i18 + 1;
                objArr7[i18] = objArr7[12];
                return 0;
            case 12:
                int[] iArr5 = this.Camera2StreamConfigurationMap;
                int i19 = this.getHighSpeedVideoFpsRanges;
                iArr5[i19] = 5;
                this.getHighSpeedVideoFpsRanges = i19;
                java.lang.Object[] objArr8 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i20 = i19 - 1;
                java.lang.Object obj6 = objArr8[i20];
                objArr8[i20] = null;
                iArr5[i20] = ((byte[]) obj6)[5];
                this.getHighSpeedVideoFpsRanges = i19 + 1;
                iArr5[i19] = 255;
                return 0;
            case 13:
                int i21 = this.getHighSpeedVideoFpsRanges;
                int i22 = i21 - 1;
                int[] iArr6 = this.Camera2StreamConfigurationMap;
                int i23 = i21 - 2;
                iArr6[i23] = iArr6[i23] & iArr6[i22];
                iArr6[i22] = 5;
                this.getHighSpeedVideoFpsRanges = i22;
                iArr6[i23] = iArr6[i23] % 5;
                return 0;
            case 14:
                int i24 = this.getHighSpeedVideoFpsRanges;
                int i25 = i24 - 1;
                int[] iArr7 = this.Camera2StreamConfigurationMap;
                iArr7[12] = iArr7[i25];
                this.getHighSpeedVideoFpsRanges = i24;
                iArr7[i25] = 0;
                return 0;
            case 15:
                int i26 = this.getHighSpeedVideoFpsRanges - 1;
                this.getHighSpeedVideoFpsRanges = i26;
                int[] iArr8 = this.Camera2StreamConfigurationMap;
                iArr8[13] = iArr8[i26];
                return 0;
            case 16:
                int[] iArr9 = this.Camera2StreamConfigurationMap;
                int i27 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i27 + 1;
                iArr9[i27] = iArr9[13];
                return 0;
            case 17:
                int i28 = this.getHighSpeedVideoFpsRanges;
                int i29 = i28 - 2;
                this.getHighSpeedVideoFpsRanges = i29;
                int[] iArr10 = this.Camera2StreamConfigurationMap;
                this.valueOf = iArr10[i29] >= iArr10[i28 - 1] ? 0 : 1;
                return 0;
            case 18:
                int[] iArr11 = this.Camera2StreamConfigurationMap;
                int i30 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i30 + 1;
                iArr11[i30] = 5563;
                return 0;
            case 19:
                int[] iArr12 = this.Camera2StreamConfigurationMap;
                int i31 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i31 + 1;
                iArr12[i31] = 0;
                return 0;
            case 20:
                int[] iArr13 = this.Camera2StreamConfigurationMap;
                int i32 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i32 + 1;
                iArr13[i32] = this.ReplenishAckRequest;
                return 0;
            case 21:
                int i33 = this.getHighSpeedVideoFpsRanges;
                int i34 = i33 - 1;
                this.getHighSpeedVideoFpsRanges = i34;
                int[] iArr14 = this.Camera2StreamConfigurationMap;
                int i35 = i33 - 2;
                iArr14[i35] = iArr14[i35] + iArr14[i34];
                return 0;
            case 22:
                java.lang.Object[] objArr9 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i36 = this.getHighSpeedVideoFpsRanges;
                java.lang.Object obj7 = objArr9[i36 - 1];
                objArr9[i36] = obj7;
                this.getHighSpeedVideoFpsRanges = i36;
                objArr9[i36] = null;
                objArr9[14] = obj7;
                return 0;
            case 23:
                int[] iArr15 = this.Camera2StreamConfigurationMap;
                int i37 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i37 + 1;
                iArr15[i37] = 128;
                return 0;
            case 24:
                java.lang.Object[] objArr10 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i38 = this.getHighSpeedVideoFpsRanges;
                objArr10[i38] = objArr10[10];
                int[] iArr16 = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = i38 + 2;
                iArr16[i38 + 1] = 4;
                return 0;
            case 25:
                int i39 = this.getHighSpeedVideoFpsRanges;
                int i40 = i39 - 1;
                int[] iArr17 = this.Camera2StreamConfigurationMap;
                int i41 = i39 - 2;
                iArr17[i41] = iArr17[i41] - iArr17[i40];
                java.lang.Object[] objArr11 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = i39;
                objArr11[i40] = objArr11[14];
                return 0;
            case 26:
                int i42 = this.getHighSpeedVideoFpsRanges;
                int i43 = i42 - 3;
                this.getHighSpeedVideoFpsRanges = i43;
                java.lang.Object[] objArr12 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj8 = objArr12[i43];
                objArr12[i43] = null;
                int i44 = this.Camera2StreamConfigurationMap[i42 - 2];
                int i45 = i42 - 1;
                java.lang.Object obj9 = objArr12[i45];
                objArr12[i45] = null;
                ((java.lang.Object[]) obj8)[i44] = obj9;
                return 0;
            case 27:
                int[] iArr18 = this.Camera2StreamConfigurationMap;
                iArr18[13] = iArr18[13] + 1;
                return 0;
            case 28:
                java.lang.Object[] objArr13 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i46 = this.getHighSpeedVideoFpsRanges;
                objArr13[i46] = objArr13[10];
                int[] iArr19 = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = i46 + 2;
                iArr19[i46 + 1] = iArr19[12];
                return 0;
            case 29:
                java.lang.Object[] objArr14 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i47 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i47 + 1;
                objArr14[i47] = objArr14[9];
                return 0;
            case 30:
                int i48 = this.getHighSpeedVideoFpsRanges;
                int i49 = i48 - 1;
                java.lang.Object[] objArr15 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj10 = objArr15[i49];
                objArr15[i49] = null;
                objArr15[14] = obj10;
                this.getHighSpeedVideoFpsRanges = i48;
                objArr15[i49] = objArr15[7];
                return 0;
            case 31:
                java.lang.Object[] objArr16 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i50 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i50 + 1;
                objArr16[i50] = objArr16[14];
                return 0;
            case 32:
                java.lang.Object[] objArr17 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i51 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i51 + 1;
                objArr17[i51] = objArr17[7];
                return 0;
            case 33:
                long[] jArr = this.getHighSpeedVideoFpsRangesFor;
                int i52 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i52 + 1;
                jArr[i52] = this.values;
                return 0;
            case 34:
                int i53 = this.getHighSpeedVideoFpsRanges - 1;
                this.getHighSpeedVideoFpsRanges = i53;
                java.lang.Object[] objArr18 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj11 = objArr18[i53];
                objArr18[i53] = null;
                objArr18[9] = obj11;
                return 0;
            case 35:
                int i54 = this.getHighSpeedVideoFpsRanges;
                int i55 = i54 - 1;
                long[] jArr2 = this.getHighSpeedVideoFpsRangesFor;
                jArr2[15] = jArr2[i55];
                java.lang.Object[] objArr19 = this.getHighResolutionOutputSizeshNQ4ISI;
                objArr19[i55] = objArr19[9];
                int i56 = i54 - 1;
                this.getHighSpeedVideoFpsRanges = i56;
                java.lang.Object obj12 = objArr19[i56];
                objArr19[i56] = null;
                objArr19[17] = obj12;
                return 0;
            case 36:
                int[] iArr20 = this.Camera2StreamConfigurationMap;
                int i57 = this.getHighSpeedVideoFpsRanges;
                iArr20[i57] = -1;
                iArr20[18] = -1;
                java.lang.Object[] objArr20 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = i57 + 1;
                objArr20[i57] = objArr20[17];
                return 0;
            case 37:
                int[] iArr21 = this.Camera2StreamConfigurationMap;
                int i58 = this.getHighSpeedVideoFpsRanges - 1;
                this.getHighSpeedVideoFpsRanges = i58;
                this.valueOf = iArr21[i58];
                return 0;
            case 38:
                java.lang.Object[] objArr21 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i59 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i59 + 1;
                objArr21[i59] = objArr21[17];
                return 0;
            case 39:
                long[] jArr3 = this.getHighSpeedVideoFpsRangesFor;
                int i60 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i60 + 1;
                jArr3[i60] = 0;
                return 0;
            case 40:
                int i61 = this.getHighSpeedVideoFpsRanges;
                int[] iArr22 = this.Camera2StreamConfigurationMap;
                long[] jArr4 = this.getHighSpeedVideoFpsRangesFor;
                int i62 = i61 - 2;
                int i63 = (jArr4[i62] > jArr4[i61 - 1] ? 1 : (jArr4[i62] == jArr4[i61 - 1] ? 0 : -1));
                iArr22[i62] = i63;
                this.getHighSpeedVideoFpsRanges = i62;
                int i64 = i61 - 3;
                iArr22[i64] = iArr22[i64] - i63;
                return 0;
            case 41:
                int i65 = this.getHighSpeedVideoFpsRanges - 1;
                this.getHighSpeedVideoFpsRanges = i65;
                this.valueOf = this.Camera2StreamConfigurationMap[i65] == 0 ? 0 : 1;
                return 0;
            case 42:
                int[] iArr23 = this.Camera2StreamConfigurationMap;
                int i66 = this.getHighSpeedVideoFpsRanges;
                iArr23[i66] = 0;
                this.getHighSpeedVideoFpsRanges = i66;
                iArr23[18] = 0;
                return 0;
            case 43:
                int[] iArr24 = this.Camera2StreamConfigurationMap;
                int i67 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i67 + 1;
                iArr24[i67] = iArr24[18];
                return 0;
            case 44:
                java.lang.Object[] objArr22 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i68 = this.getHighSpeedVideoFpsRanges;
                objArr22[i68] = objArr22[11];
                int[] iArr25 = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = i68 + 2;
                iArr25[i68 + 1] = 4;
                return 0;
            case 45:
                int i69 = this.getHighSpeedVideoFpsRanges;
                int i70 = i69 - 1;
                int[] iArr26 = this.Camera2StreamConfigurationMap;
                int i71 = i69 - 2;
                iArr26[i71] = iArr26[i71] - iArr26[i70];
                java.lang.Object[] objArr23 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = i69;
                objArr23[i70] = objArr23[7];
                return 0;
            case 46:
                java.lang.Object[] objArr24 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i72 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i72 + 1;
                objArr24[i72] = objArr24[8];
                return 0;
            case 47:
                int i73 = this.getHighSpeedVideoFpsRanges;
                int[] iArr27 = this.Camera2StreamConfigurationMap;
                int i74 = i73 - 2;
                int i75 = iArr27[i74] - iArr27[i73 - 1];
                iArr27[i74] = i75;
                this.getHighSpeedVideoFpsRanges = i74;
                java.lang.Object[] objArr25 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i76 = i73 - 3;
                java.lang.Object obj13 = objArr25[i76];
                objArr25[i76] = null;
                objArr25[i76] = ((java.lang.Object[]) obj13)[i75];
                return 0;
            case 48:
                long[] jArr5 = this.getHighSpeedVideoFpsRangesFor;
                int i77 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i77 + 1;
                jArr5[i77] = jArr5[15];
                return 0;
            case 49:
                int i78 = this.getHighSpeedVideoFpsRanges;
                long[] jArr6 = this.getHighSpeedVideoFpsRangesFor;
                int i79 = i78 - 2;
                jArr6[i79] = jArr6[i79] - jArr6[i78 - 1];
                int i80 = i78 - 2;
                this.getHighSpeedVideoFpsRanges = i80;
                jArr6[17] = jArr6[i80];
                return 0;
            case 50:
                int i81 = this.getHighSpeedVideoFpsRanges - 1;
                this.getHighSpeedVideoFpsRanges = i81;
                this.getHighResolutionOutputSizeshNQ4ISI[i81] = null;
                return 0;
            case 51:
                int[] iArr28 = this.Camera2StreamConfigurationMap;
                int i82 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i82 + 1;
                iArr28[i82] = 48;
                return 0;
            case 52:
                int i83 = this.getHighSpeedVideoFpsRanges;
                int i84 = i83 - 1;
                this.getHighSpeedVideoFpsRanges = i84;
                int[] iArr29 = this.Camera2StreamConfigurationMap;
                int i85 = i83 - 2;
                iArr29[i85] = iArr29[i85] - iArr29[i84];
                return 0;
            case 53:
                int i86 = this.getHighSpeedVideoFpsRanges;
                int i87 = i86 - 1;
                this.getHighSpeedVideoFpsRanges = i87;
                java.lang.Object[] objArr26 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i88 = i86 - 2;
                java.lang.Object obj14 = objArr26[i88];
                objArr26[i88] = null;
                objArr26[i88] = ((java.lang.Object[]) obj14)[this.Camera2StreamConfigurationMap[i87]];
                return 0;
            case 54:
                int[] iArr30 = this.Camera2StreamConfigurationMap;
                int i89 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i89 + 1;
                iArr30[i89] = 8;
                return 0;
            case 55:
                long[] jArr7 = this.getHighSpeedVideoFpsRangesFor;
                int i90 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i90 + 1;
                jArr7[i90] = jArr7[17];
                return 0;
            case 56:
                int i91 = this.getHighSpeedVideoFpsRanges;
                int i92 = i91 - 1;
                this.getHighSpeedVideoFpsRanges = i92;
                int[] iArr31 = this.Camera2StreamConfigurationMap;
                long[] jArr8 = this.getHighSpeedVideoFpsRangesFor;
                int i93 = i91 - 2;
                iArr31[i93] = (jArr8[i93] > jArr8[i92] ? 1 : (jArr8[i93] == jArr8[i92] ? 0 : -1));
                return 0;
            case 57:
                int i94 = this.getHighSpeedVideoFpsRanges - 1;
                this.getHighSpeedVideoFpsRanges = i94;
                this.valueOf = this.Camera2StreamConfigurationMap[i94] <= 0 ? 0 : 1;
                return 0;
            case 58:
                java.lang.Object[] objArr27 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i95 = this.getHighSpeedVideoFpsRanges - 1;
                java.lang.Object obj15 = objArr27[i95];
                objArr27[i95] = null;
                this.getTvls = obj15;
                return 0;
            case 59:
                java.lang.Object[] objArr28 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i96 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i96 + 1;
                objArr28[i96] = objArr28[11];
                return 0;
            case 60:
                int[] iArr32 = this.Camera2StreamConfigurationMap;
                int i97 = this.getHighSpeedVideoFpsRanges;
                int i98 = iArr32[12];
                iArr32[i97] = i98;
                this.getHighSpeedVideoFpsRanges = i97;
                java.lang.Object[] objArr29 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i99 = i97 - 1;
                java.lang.Object obj16 = objArr29[i99];
                objArr29[i99] = null;
                objArr29[i99] = ((java.lang.Object[]) obj16)[i98];
                return 0;
            case 61:
                int[] iArr33 = this.Camera2StreamConfigurationMap;
                int i100 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i100 + 1;
                iArr33[i100] = 2;
                return 0;
            case 62:
                int i101 = this.getHighSpeedVideoFpsRanges;
                int i102 = i101 - 1;
                this.getHighSpeedVideoFpsRanges = i102;
                int[] iArr34 = this.Camera2StreamConfigurationMap;
                int i103 = i101 - 2;
                iArr34[i103] = iArr34[i103] % iArr34[i102];
                return 0;
            case 63:
                int[] iArr35 = this.Camera2StreamConfigurationMap;
                int i104 = this.getHighSpeedVideoFpsRanges;
                iArr35[i104] = 2;
                this.getHighSpeedVideoFpsRanges = i104;
                int i105 = i104 - 1;
                iArr35[i105] = iArr35[i105] % 2;
                return 0;
            case 64:
                int[] iArr36 = this.Camera2StreamConfigurationMap;
                int i106 = this.getHighSpeedVideoFpsRanges;
                iArr36[i106] = 55;
                this.getHighSpeedVideoFpsRanges = i106;
                int i107 = i106 - 1;
                iArr36[i107] = iArr36[i107] + 55;
                return 0;
            case 65:
                int[] iArr37 = this.Camera2StreamConfigurationMap;
                int i108 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i108 + 1;
                iArr37[i108] = iArr37[i108 - 1];
                return 0;
            case 66:
                int i109 = this.getHighSpeedVideoFpsRanges - 1;
                this.getHighSpeedVideoFpsRanges = i109;
                this.valueOf = this.Camera2StreamConfigurationMap[i109] != 0 ? 0 : 1;
                return 0;
            case 67:
                int[] iArr38 = this.Camera2StreamConfigurationMap;
                int i110 = this.getHighSpeedVideoFpsRanges;
                iArr38[i110] = 27;
                int i111 = i110 - 1;
                int i112 = iArr38[i111] + 27;
                iArr38[i111] = i112;
                this.getHighSpeedVideoFpsRanges = i110 + 1;
                iArr38[i110] = i112;
                return 0;
            case 68:
                int[] iArr39 = this.Camera2StreamConfigurationMap;
                int i113 = this.getHighSpeedVideoFpsRanges;
                iArr39[i113] = 128;
                this.getHighSpeedVideoFpsRanges = i113;
                int i114 = i113 - 1;
                iArr39[i114] = iArr39[i114] % 128;
                return 0;
            case 69:
                int[] iArr40 = this.Camera2StreamConfigurationMap;
                int i115 = this.getHighSpeedVideoFpsRanges;
                iArr40[i115] = 1;
                this.getHighSpeedVideoFpsRanges = i115;
                iArr40[18] = 1;
                return 0;
            case 70:
                int[] iArr41 = this.Camera2StreamConfigurationMap;
                int i116 = this.getHighSpeedVideoFpsRanges;
                iArr41[i116] = 61;
                int i117 = i116 - 1;
                int i118 = iArr41[i117] + 61;
                iArr41[i117] = i118;
                this.getHighSpeedVideoFpsRanges = i116 + 1;
                iArr41[i116] = i118;
                return 0;
            case 71:
                int[] iArr42 = this.Camera2StreamConfigurationMap;
                int i119 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i119 + 1;
                iArr42[i119] = 1;
                return 0;
            case 72:
                int i120 = this.getHighSpeedVideoFpsRanges;
                int i121 = i120 - 1;
                java.lang.Object[] objArr30 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj17 = objArr30[i121];
                objArr30[i121] = null;
                objArr30[10] = obj17;
                this.getHighSpeedVideoFpsRanges = i120;
                objArr30[i121] = obj17;
                return 0;
            case 73:
                java.lang.Object[] objArr31 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i122 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i122 + 1;
                objArr31[i122] = objArr31[i122 - 1];
                return 0;
            case 74:
                int i123 = this.getHighSpeedVideoFpsRanges;
                int i124 = i123 - 1;
                java.lang.Object[] objArr32 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj18 = objArr32[i124];
                objArr32[i124] = null;
                objArr32[10] = obj18;
                this.Camera2StreamConfigurationMap[i124] = 1;
                this.getHighSpeedVideoFpsRanges = i123 + 1;
                objArr32[i123] = objArr32[9];
                return 0;
            case 75:
                java.lang.Object[] objArr33 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i125 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i125 + 1;
                objArr33[i125] = objArr33[10];
                return 0;
            case 76:
                java.lang.Object[] objArr34 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i126 = this.getHighSpeedVideoFpsRanges - 1;
                objArr34[i126] = new byte[this.Camera2StreamConfigurationMap[i126]];
                return 0;
            case 77:
                int i127 = this.getHighSpeedVideoFpsRanges;
                int i128 = i127 - 1;
                java.lang.Object[] objArr35 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj19 = objArr35[i128];
                objArr35[i128] = null;
                objArr35[9] = obj19;
                objArr35[i128] = objArr35[10];
                this.getHighSpeedVideoFpsRanges = i127 + 1;
                objArr35[i127] = objArr35[8];
                return 0;
            case 78:
                int[] iArr43 = this.Camera2StreamConfigurationMap;
                int i129 = this.getHighSpeedVideoFpsRanges;
                iArr43[i129] = 0;
                java.lang.Object[] objArr36 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = i129 + 2;
                objArr36[i129 + 1] = objArr36[8];
                return 0;
            case 79:
                int[] iArr44 = this.Camera2StreamConfigurationMap;
                int i130 = this.getHighSpeedVideoFpsRanges;
                java.lang.Object[] objArr37 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i131 = i130 - 1;
                java.lang.Object obj20 = objArr37[i131];
                objArr37[i131] = null;
                iArr44[i131] = ((byte[]) obj20).length;
                this.getHighSpeedVideoFpsRanges = i130 + 1;
                objArr37[i130] = objArr37[9];
                return 0;
            case 80:
                int i132 = this.getHighSpeedVideoFpsRanges - 1;
                this.getHighSpeedVideoFpsRanges = i132;
                int[] iArr45 = this.Camera2StreamConfigurationMap;
                iArr45[8] = iArr45[i132];
                return 0;
            case 81:
                java.lang.Object[] objArr38 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i133 = this.getHighSpeedVideoFpsRanges;
                objArr38[i133] = objArr38[10];
                this.getHighSpeedVideoFpsRanges = i133 + 2;
                objArr38[i133 + 1] = objArr38[9];
                return 0;
            case 82:
                int[] iArr46 = this.Camera2StreamConfigurationMap;
                int i134 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i134 + 1;
                iArr46[i134] = iArr46[8];
                return 0;
            case 83:
                int[] iArr47 = this.Camera2StreamConfigurationMap;
                int i135 = this.getHighSpeedVideoFpsRanges;
                iArr47[i135] = 2;
                this.getHighSpeedVideoFpsRanges = i135 + 2;
                iArr47[i135 + 1] = 2;
                return 0;
            case 84:
                int i136 = this.getHighSpeedVideoFpsRanges;
                int i137 = i136 - 1;
                this.getHighSpeedVideoFpsRanges = i137;
                int[] iArr48 = this.Camera2StreamConfigurationMap;
                int i138 = i136 - 2;
                iArr48[i138] = iArr48[i138] % iArr48[i137];
                int i139 = i136 - 2;
                this.getHighSpeedVideoFpsRanges = i139;
                this.getHighResolutionOutputSizeshNQ4ISI[i139] = null;
                return 0;
            case 86:
                int[] iArr49 = this.Camera2StreamConfigurationMap;
                int i140 = this.getHighSpeedVideoFpsRanges;
                iArr49[i140] = 69;
                int i141 = i140 - 1;
                int i142 = iArr49[i141] + 69;
                iArr49[i141] = i142;
                this.getHighSpeedVideoFpsRanges = i140 + 1;
                iArr49[i140] = i142;
            case 85:
                return 0;
            case 87:
                java.lang.Object[] objArr39 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i143 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i143 + 1;
                objArr39[i143] = null;
                return 0;
            case 88:
                int[] iArr50 = this.Camera2StreamConfigurationMap;
                int i144 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i144 + 1;
                iArr50[i144] = 81;
                return 0;
            case 89:
                int[] iArr51 = this.Camera2StreamConfigurationMap;
                int i145 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i145 + 1;
                iArr51[i145] = 4;
                return 0;
            case 90:
                for (int i146 = this.getHighSpeedVideoFpsRanges - 1; i146 >= 0; i146--) {
                    this.getHighResolutionOutputSizeshNQ4ISI[i146] = null;
                }
                java.lang.Object[] objArr40 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = 1;
                objArr40[0] = this.getTokenInfo;
                return 0;
            case 91:
                int i147 = this.getHighSpeedVideoFpsRanges - 1;
                this.getHighSpeedVideoFpsRanges = i147;
                java.lang.Object[] objArr41 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj21 = objArr41[i147];
                objArr41[i147] = null;
                objArr41[11] = obj21;
                return 0;
            case 92:
                int i148 = this.getHighSpeedVideoFpsRanges - 1;
                this.getHighSpeedVideoFpsRanges = i148;
                java.lang.Object[] objArr42 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj22 = objArr42[i148];
                objArr42[i148] = null;
                objArr42[12] = obj22;
                return 0;
            case 93:
                java.lang.Object[] objArr43 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i149 = this.getHighSpeedVideoFpsRanges;
                int i150 = i149 + 1;
                java.lang.Object obj23 = objArr43[12];
                objArr43[i149] = obj23;
                int[] iArr52 = this.Camera2StreamConfigurationMap;
                iArr52[i150] = 1;
                this.getHighSpeedVideoFpsRanges = i150;
                objArr43[i149] = null;
                iArr52[i149] = ((byte[]) obj23)[1];
                return 0;
            case 94:
                int i151 = this.getHighSpeedVideoFpsRanges - 1;
                this.getHighSpeedVideoFpsRanges = i151;
                int[] iArr53 = this.Camera2StreamConfigurationMap;
                iArr53[12] = iArr53[i151];
                return 0;
            case 95:
                int[] iArr54 = this.Camera2StreamConfigurationMap;
                int i152 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i152 + 1;
                iArr54[i152] = iArr54[12];
                return 0;
            case 96:
                int i153 = this.getHighSpeedVideoFpsRanges - 1;
                this.getHighSpeedVideoFpsRanges = i153;
                this.valueOf = this.Camera2StreamConfigurationMap[i153] > 0 ? 0 : 1;
                return 0;
            case 97:
                int[] iArr55 = this.Camera2StreamConfigurationMap;
                int i154 = this.getHighSpeedVideoFpsRanges;
                iArr55[i154] = 16;
                this.getHighSpeedVideoFpsRanges = i154;
                int i155 = i154 - 1;
                iArr55[i155] = iArr55[i155] >> 16;
                return 0;
            case 98:
                int i156 = this.getHighSpeedVideoFpsRanges - 1;
                this.getHighSpeedVideoFpsRanges = i156;
                java.lang.Object[] objArr44 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj24 = objArr44[i156];
                objArr44[i156] = null;
                objArr44[13] = obj24;
                return 0;
            case 99:
                int[] iArr56 = this.Camera2StreamConfigurationMap;
                int i157 = this.getHighSpeedVideoFpsRanges;
                iArr56[i157] = 0;
                java.lang.Object[] objArr45 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = i157 + 2;
                objArr45[i157 + 1] = objArr45[13];
                return 0;
            case 100:
                int[] iArr57 = this.Camera2StreamConfigurationMap;
                iArr57[12] = iArr57[12] + 1;
                return 0;
            case 101:
                java.lang.Object[] objArr46 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i158 = this.getHighSpeedVideoFpsRanges;
                objArr46[i158] = objArr46[10];
                this.Camera2StreamConfigurationMap[i158 + 1] = 0;
                this.getHighSpeedVideoFpsRanges = i158 + 3;
                objArr46[i158 + 2] = objArr46[9];
                return 0;
            case 102:
                int i159 = this.getHighSpeedVideoFpsRanges;
                int i160 = i159 - 3;
                this.getHighSpeedVideoFpsRanges = i160;
                java.lang.Object[] objArr47 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj25 = objArr47[i160];
                objArr47[i160] = null;
                int[] iArr58 = this.Camera2StreamConfigurationMap;
                int i161 = i159 - 2;
                int i162 = iArr58[i161];
                int i163 = i159 - 1;
                java.lang.Object obj26 = objArr47[i163];
                objArr47[i163] = null;
                ((java.lang.Object[]) obj25)[i162] = obj26;
                this.getHighSpeedVideoFpsRanges = i161;
                iArr58[i160] = 0;
                return 0;
            case 103:
                int i164 = this.getHighSpeedVideoFpsRanges;
                int i165 = i164 - 1;
                java.lang.Object[] objArr48 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj27 = objArr48[i165];
                objArr48[i165] = null;
                objArr48[13] = obj27;
                this.getHighSpeedVideoFpsRanges = i164;
                objArr48[i165] = objArr48[7];
                return 0;
            case 104:
                java.lang.Object[] objArr49 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i166 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i166 + 1;
                objArr49[i166] = objArr49[13];
                return 0;
            case 105:
                int i167 = this.getHighSpeedVideoFpsRanges - 1;
                this.getHighSpeedVideoFpsRanges = i167;
                long[] jArr9 = this.getHighSpeedVideoFpsRangesFor;
                jArr9[15] = jArr9[i167];
                return 0;
            case 106:
                java.lang.Object[] objArr50 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i168 = this.getHighSpeedVideoFpsRanges;
                java.lang.Object obj28 = objArr50[9];
                objArr50[i168] = obj28;
                this.getHighSpeedVideoFpsRanges = i168;
                objArr50[i168] = null;
                objArr50[17] = obj28;
                return 0;
            case 107:
                int i169 = this.getHighSpeedVideoFpsRanges - 1;
                this.getHighSpeedVideoFpsRanges = i169;
                int[] iArr59 = this.Camera2StreamConfigurationMap;
                iArr59[18] = iArr59[i169];
                return 0;
            case 108:
                int[] iArr60 = this.Camera2StreamConfigurationMap;
                int i170 = this.getHighSpeedVideoFpsRanges;
                iArr60[i170] = 0;
                java.lang.Object[] objArr51 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = i170 + 2;
                objArr51[i170 + 1] = objArr51[7];
                return 0;
            case 109:
                int[] iArr61 = this.Camera2StreamConfigurationMap;
                int i171 = this.getHighSpeedVideoFpsRanges;
                iArr61[i171] = 0;
                this.getHighSpeedVideoFpsRanges = i171;
                java.lang.Object[] objArr52 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i172 = i171 - 1;
                java.lang.Object obj29 = objArr52[i172];
                objArr52[i172] = null;
                objArr52[i172] = ((java.lang.Object[]) obj29)[0];
                return 0;
            case 110:
                int i173 = this.getHighSpeedVideoFpsRanges;
                int i174 = i173 - 1;
                this.getHighSpeedVideoFpsRanges = i174;
                long[] jArr10 = this.getHighSpeedVideoFpsRangesFor;
                int i175 = i173 - 2;
                jArr10[i175] = jArr10[i175] - jArr10[i174];
                return 0;
            case 111:
                float[] fArr = this.getHighSpeedVideoSizes;
                int i176 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i176 + 1;
                fArr[i176] = this.ConfirmReplenishRequest;
                return 0;
            case 112:
                int i177 = this.getHighSpeedVideoFpsRanges - 1;
                this.getHighSpeedVideoFpsRanges = i177;
                long[] jArr11 = this.getHighSpeedVideoFpsRangesFor;
                jArr11[17] = jArr11[i177];
                return 0;
            case 113:
                int i178 = this.getHighSpeedVideoFpsRanges;
                int i179 = i178 - 1;
                java.lang.Object[] objArr53 = this.getHighResolutionOutputSizeshNQ4ISI;
                objArr53[i179] = null;
                this.getHighSpeedVideoFpsRanges = i178;
                objArr53[i179] = objArr53[11];
                return 0;
            case 114:
                int[] iArr62 = this.Camera2StreamConfigurationMap;
                int i180 = this.getHighSpeedVideoFpsRanges;
                iArr62[i180] = 0;
                this.getHighSpeedVideoFpsRanges = i180 + 2;
                iArr62[i180 + 1] = 8;
                return 0;
            case 115:
                int i181 = this.getHighSpeedVideoFpsRanges;
                int i182 = i181 - 1;
                this.getHighResolutionOutputSizeshNQ4ISI[i182] = null;
                long[] jArr12 = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRanges = i181;
                jArr12[i182] = jArr12[17];
                return 0;
            case 116:
                java.lang.Object[] objArr54 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i183 = this.getHighSpeedVideoFpsRanges;
                int i184 = i183 + 1;
                java.lang.Object obj30 = objArr54[11];
                objArr54[i183] = obj30;
                this.Camera2StreamConfigurationMap[i184] = 0;
                this.getHighSpeedVideoFpsRanges = i184;
                objArr54[i183] = null;
                objArr54[i183] = ((java.lang.Object[]) obj30)[0];
                return 0;
            case 117:
                int[] iArr63 = this.Camera2StreamConfigurationMap;
                int i185 = this.getHighSpeedVideoFpsRanges;
                iArr63[i185] = 49;
                int i186 = i185 - 1;
                int i187 = iArr63[i186] + 49;
                iArr63[i186] = i187;
                this.getHighSpeedVideoFpsRanges = i185 + 1;
                iArr63[i185] = i187;
                return 0;
            case 118:
                int[] iArr64 = this.Camera2StreamConfigurationMap;
                int i188 = this.getHighSpeedVideoFpsRanges;
                int i189 = i188 + 1;
                iArr64[i188] = 4;
                iArr64[i189] = 3;
                this.getHighSpeedVideoFpsRanges = i189;
                iArr64[i188] = iArr64[i188] * 3;
                return 0;
            case 119:
                int[] iArr65 = this.Camera2StreamConfigurationMap;
                int i190 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i190 + 1;
                iArr65[i190] = 109;
                return 0;
            case 120:
                int i191 = this.getHighSpeedVideoFpsRanges;
                int i192 = i191 - 1;
                int[] iArr66 = this.Camera2StreamConfigurationMap;
                int i193 = i191 - 2;
                int i194 = iArr66[i193] + iArr66[i192];
                iArr66[i193] = i194;
                this.getHighSpeedVideoFpsRanges = i191;
                iArr66[i192] = i194;
                return 0;
            case 121:
                int[] iArr67 = this.Camera2StreamConfigurationMap;
                int i195 = this.getHighSpeedVideoFpsRanges;
                java.lang.Object[] objArr55 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i196 = i195 - 1;
                java.lang.Object obj31 = objArr55[i196];
                objArr55[i196] = null;
                iArr67[i196] = ((int[]) obj31).length;
                return 0;
            case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                int[] iArr68 = this.Camera2StreamConfigurationMap;
                int i197 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i197 + 1;
                iArr68[i197] = 50;
                return 0;
            case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                int[] iArr69 = this.Camera2StreamConfigurationMap;
                int i198 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i198 + 1;
                iArr69[i198] = 14;
                return 0;
            case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                int i199 = this.getHighSpeedVideoFpsRanges;
                int i200 = i199 - 1;
                java.lang.Object[] objArr56 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj32 = objArr56[i200];
                objArr56[i200] = null;
                objArr56[9] = obj32;
                this.getHighSpeedVideoFpsRanges = i199;
                objArr56[i200] = objArr56[10];
                return 0;
            case 125:
                int[] iArr70 = this.Camera2StreamConfigurationMap;
                int i201 = this.getHighSpeedVideoFpsRanges;
                iArr70[i201] = 1;
                java.lang.Object[] objArr57 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = i201 + 2;
                objArr57[i201 + 1] = objArr57[9];
                return 0;
            case 126:
                java.lang.Object[] objArr58 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i202 = this.getHighSpeedVideoFpsRanges;
                int i203 = i202 + 1;
                objArr58[i202] = objArr58[10];
                this.getHighSpeedVideoFpsRanges = i202 + 2;
                java.lang.Object obj33 = objArr58[8];
                objArr58[i203] = obj33;
                int[] iArr71 = this.Camera2StreamConfigurationMap;
                objArr58[i203] = null;
                iArr71[i203] = ((byte[]) obj33).length;
                return 0;
            case 127:
                java.lang.Object[] objArr59 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i204 = this.getHighSpeedVideoFpsRanges;
                int i205 = i204 + 1;
                this.getHighSpeedVideoFpsRanges = i205;
                java.lang.Object obj34 = objArr59[8];
                objArr59[i204] = obj34;
                int[] iArr72 = this.Camera2StreamConfigurationMap;
                objArr59[i204] = null;
                iArr72[i204] = ((byte[]) obj34).length;
                this.getHighSpeedVideoFpsRanges = i204 + 2;
                objArr59[i205] = objArr59[9];
                return 0;
            case 128:
                int i206 = this.getHighSpeedVideoFpsRanges;
                int i207 = i206 - 1;
                int[] iArr73 = this.Camera2StreamConfigurationMap;
                iArr73[8] = iArr73[i207];
                java.lang.Object[] objArr60 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = i206;
                objArr60[i207] = objArr60[10];
                return 0;
            case 129:
                java.lang.Object[] objArr61 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i208 = this.getHighSpeedVideoFpsRanges;
                objArr61[i208] = objArr61[9];
                int[] iArr74 = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = i208 + 2;
                iArr74[i208 + 1] = iArr74[8];
                return 0;
            case 130:
                int[] iArr75 = this.Camera2StreamConfigurationMap;
                int i209 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i209 + 1;
                iArr75[i209] = 95;
                return 0;
            case 131:
                int i210 = this.getHighSpeedVideoFpsRanges;
                int i211 = i210 - 1;
                int[] iArr76 = this.Camera2StreamConfigurationMap;
                int i212 = i210 - 2;
                int i213 = iArr76[i212] + iArr76[i211];
                iArr76[i212] = i213;
                iArr76[i211] = i213;
                this.getHighSpeedVideoFpsRanges = i210 + 1;
                iArr76[i210] = 128;
                return 0;
            case 132:
                int i214 = this.getHighSpeedVideoFpsRanges;
                int i215 = i214 - 1;
                java.lang.Object[] objArr62 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj35 = objArr62[i215];
                objArr62[i215] = null;
                objArr62[10] = obj35;
                int[] iArr77 = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = i214;
                iArr77[i215] = 1;
                return 0;
            case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                int i216 = this.getHighSpeedVideoFpsRanges;
                int i217 = i216 - 1;
                java.lang.Object[] objArr63 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj36 = objArr63[i217];
                objArr63[i217] = null;
                objArr63[11] = obj36;
                int[] iArr78 = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = i216;
                iArr78[i217] = 1;
                return 0;
            case 134:
                java.lang.Object[] objArr64 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i218 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i218 + 1;
                java.lang.Object obj37 = objArr64[9];
                objArr64[i218] = obj37;
                int[] iArr79 = this.Camera2StreamConfigurationMap;
                objArr64[i218] = null;
                iArr79[i218] = ((byte[]) obj37).length;
                return 0;
            case 135:
                int[] iArr80 = this.Camera2StreamConfigurationMap;
                int i219 = this.getHighSpeedVideoFpsRanges;
                iArr80[i219] = 1;
                this.getHighSpeedVideoFpsRanges = i219;
                java.lang.Object[] objArr65 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i220 = i219 - 1;
                java.lang.Object obj38 = objArr65[i220];
                objArr65[i220] = null;
                iArr80[i220] = ((byte[]) obj38)[1];
                int i221 = i219 - 1;
                this.getHighSpeedVideoFpsRanges = i221;
                objArr65[i221] = null;
                return 0;
            case 136:
                int[] iArr81 = this.Camera2StreamConfigurationMap;
                int i222 = this.getHighSpeedVideoFpsRanges;
                iArr81[i222] = 0;
                this.getHighSpeedVideoFpsRanges = i222;
                iArr81[12] = 0;
                return 0;
            case 137:
                int[] iArr82 = this.Camera2StreamConfigurationMap;
                int i223 = this.getHighSpeedVideoFpsRanges;
                iArr82[i223] = 5563;
                this.getHighSpeedVideoFpsRanges = i223 + 2;
                iArr82[i223 + 1] = 0;
                return 0;
            case 138:
                float[] fArr2 = this.getHighSpeedVideoSizes;
                int i224 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i224 + 1;
                fArr2[i224] = 0.0f;
                return 0;
            case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                int i225 = this.getHighSpeedVideoFpsRanges;
                int i226 = i225 - 1;
                this.getHighSpeedVideoFpsRanges = i226;
                int[] iArr83 = this.Camera2StreamConfigurationMap;
                float[] fArr3 = this.getHighSpeedVideoSizes;
                int i227 = i225 - 2;
                iArr83[i227] = (fArr3[i227] > fArr3[i226] ? 1 : (fArr3[i227] == fArr3[i226] ? 0 : -1));
                return 0;
            case 140:
                java.lang.Object[] objArr66 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i228 = this.getHighSpeedVideoFpsRanges;
                objArr66[i228] = objArr66[10];
                int[] iArr84 = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = i228 + 2;
                iArr84[i228 + 1] = 0;
                return 0;
            case 141:
                int[] iArr85 = this.Camera2StreamConfigurationMap;
                int i229 = this.getHighSpeedVideoFpsRanges;
                int i230 = i229 + 1;
                iArr85[i229] = 0;
                java.lang.Object[] objArr67 = this.getHighResolutionOutputSizeshNQ4ISI;
                objArr67[i230] = objArr67[9];
                int i231 = i229 - 1;
                this.getHighSpeedVideoFpsRanges = i231;
                java.lang.Object obj39 = objArr67[i231];
                objArr67[i231] = null;
                java.lang.Object obj40 = objArr67[i230];
                objArr67[i230] = null;
                ((java.lang.Object[]) obj39)[0] = obj40;
                return 0;
            case 142:
                java.lang.Object[] objArr68 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i232 = this.getHighSpeedVideoFpsRanges;
                objArr68[i232] = objArr68[13];
                this.getHighSpeedVideoFpsRanges = i232 + 2;
                objArr68[i232 + 1] = objArr68[7];
                return 0;
            case 143:
                int i233 = this.getHighSpeedVideoFpsRanges;
                int i234 = i233 - 1;
                java.lang.Object[] objArr69 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj41 = objArr69[i234];
                objArr69[i234] = null;
                objArr69[17] = obj41;
                int[] iArr86 = this.Camera2StreamConfigurationMap;
                iArr86[i234] = -1;
                int i235 = i233 - 1;
                this.getHighSpeedVideoFpsRanges = i235;
                iArr86[18] = iArr86[i235];
                return 0;
            case 144:
                java.lang.Object[] objArr70 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i236 = this.getHighSpeedVideoFpsRanges;
                objArr70[i236] = objArr70[11];
                int[] iArr87 = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = i236 + 2;
                iArr87[i236 + 1] = 0;
                return 0;
            case 145:
                java.lang.Object[] objArr71 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i237 = this.getHighSpeedVideoFpsRanges;
                objArr71[i237] = objArr71[7];
                this.getHighSpeedVideoFpsRanges = i237 + 2;
                objArr71[i237 + 1] = objArr71[8];
                return 0;
            case 146:
                java.lang.Object[] objArr72 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i238 = this.getHighSpeedVideoFpsRanges;
                int i239 = i238 + 1;
                java.lang.Object obj42 = objArr72[10];
                objArr72[i238] = obj42;
                this.Camera2StreamConfigurationMap[i239] = 0;
                this.getHighSpeedVideoFpsRanges = i239;
                objArr72[i238] = null;
                objArr72[i238] = ((java.lang.Object[]) obj42)[0];
                return 0;
            case 147:
                long[] jArr13 = this.getHighSpeedVideoFpsRangesFor;
                int i240 = this.getHighSpeedVideoFpsRanges;
                long j = jArr13[15];
                jArr13[i240] = j;
                this.getHighSpeedVideoFpsRanges = i240;
                int i241 = i240 - 1;
                jArr13[i241] = jArr13[i241] - j;
                return 0;
            case 148:
                int i242 = this.getHighSpeedVideoFpsRanges;
                int i243 = i242 - 1;
                java.lang.Object[] objArr73 = this.getHighResolutionOutputSizeshNQ4ISI;
                objArr73[i243] = null;
                objArr73[i243] = objArr73[11];
                int[] iArr88 = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = i242 + 1;
                iArr88[i242] = 0;
                return 0;
            case 149:
                int i244 = this.getHighSpeedVideoFpsRanges;
                int i245 = i244 - 1;
                this.getHighSpeedVideoFpsRanges = i245;
                java.lang.Object[] objArr74 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i246 = i244 - 2;
                java.lang.Object obj43 = objArr74[i246];
                objArr74[i246] = null;
                int[] iArr89 = this.Camera2StreamConfigurationMap;
                objArr74[i246] = ((java.lang.Object[]) obj43)[iArr89[i245]];
                iArr89[i245] = 0;
                this.getHighSpeedVideoFpsRanges = i244 + 1;
                iArr89[i244] = 8;
                return 0;
            case 150:
                int[] iArr90 = this.Camera2StreamConfigurationMap;
                int i247 = this.getHighSpeedVideoFpsRanges;
                iArr90[i247] = 2;
                this.getHighSpeedVideoFpsRanges = i247;
                int i248 = i247 - 1;
                iArr90[i248] = iArr90[i248] % 2;
                int i249 = i247 - 1;
                this.getHighSpeedVideoFpsRanges = i249;
                this.getHighResolutionOutputSizeshNQ4ISI[i249] = null;
                return 0;
            case 151:
                int[] iArr91 = this.Camera2StreamConfigurationMap;
                int i250 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i250 + 1;
                iArr91[i250] = 89;
                return 0;
            case 152:
                int[] iArr92 = this.Camera2StreamConfigurationMap;
                int i251 = this.getHighSpeedVideoFpsRanges;
                iArr92[i251] = 12744;
                this.getHighSpeedVideoFpsRanges = i251 + 2;
                iArr92[i251 + 1] = 1;
                return 0;
            case 153:
                float[] fArr4 = this.getHighSpeedVideoSizes;
                int i252 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i252 + 1;
                fArr4[i252] = 1.0f;
                return 0;
            case 154:
                int i253 = this.getHighSpeedVideoFpsRanges;
                int[] iArr93 = this.Camera2StreamConfigurationMap;
                float[] fArr5 = this.getHighSpeedVideoSizes;
                int i254 = i253 - 2;
                int i255 = (fArr5[i254] > fArr5[i253 - 1] ? 1 : (fArr5[i254] == fArr5[i253 - 1] ? 0 : -1));
                iArr93[i254] = i255;
                this.getHighSpeedVideoFpsRanges = i254;
                int i256 = i253 - 3;
                iArr93[i256] = iArr93[i256] * i255;
                return 0;
            case 155:
                int[] iArr94 = this.Camera2StreamConfigurationMap;
                int i257 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i257 + 1;
                iArr94[i257] = 23258;
                return 0;
            case 156:
                java.lang.Object[] objArr75 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i258 = this.getHighSpeedVideoFpsRanges;
                objArr75[i258] = objArr75[10];
                this.Camera2StreamConfigurationMap[i258 + 1] = 1;
                this.getHighSpeedVideoFpsRanges = i258 + 3;
                objArr75[i258 + 2] = objArr75[13];
                return 0;
            case 157:
                int[] iArr95 = this.Camera2StreamConfigurationMap;
                iArr95[12] = iArr95[12] + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                return 0;
            case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                int[] iArr96 = this.Camera2StreamConfigurationMap;
                int i259 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i259 + 1;
                iArr96[i259] = 67;
                return 0;
            case 159:
                int[] iArr97 = this.Camera2StreamConfigurationMap;
                int i260 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i260 + 1;
                iArr97[i260] = 4;
                return 0;
            case 160:
                int[] iArr98 = this.Camera2StreamConfigurationMap;
                int i261 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i261 + 1;
                iArr98[i261] = 59;
                return 0;
            case 161:
                int[] iArr99 = this.Camera2StreamConfigurationMap;
                int i262 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i262 + 1;
                iArr99[i262] = 33;
                return 0;
            case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                java.lang.Object[] objArr76 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i263 = this.getHighSpeedVideoFpsRanges;
                int i264 = i263 - 1;
                objArr76[i264] = new byte[this.Camera2StreamConfigurationMap[i264]];
                int i265 = i263 - 1;
                this.getHighSpeedVideoFpsRanges = i265;
                java.lang.Object obj44 = objArr76[i265];
                objArr76[i265] = null;
                objArr76[9] = obj44;
                return 0;
            case 163:
                java.lang.Object[] objArr77 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i266 = this.getHighSpeedVideoFpsRanges;
                objArr77[i266] = objArr77[8];
                this.Camera2StreamConfigurationMap[i266 + 1] = 0;
                this.getHighSpeedVideoFpsRanges = i266 + 3;
                objArr77[i266 + 2] = objArr77[8];
                return 0;
            case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                int[] iArr100 = this.Camera2StreamConfigurationMap;
                int i267 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i267 + 1;
                iArr100[i267] = 121;
                return 0;
            case 165:
                int[] iArr101 = this.Camera2StreamConfigurationMap;
                int i268 = this.getHighSpeedVideoFpsRanges;
                iArr101[i268] = iArr101[i268 - 1];
                this.getHighSpeedVideoFpsRanges = i268 + 2;
                iArr101[i268 + 1] = 128;
                return 0;
            default:
                return i;
        }
    }

    public setCertValue$24383(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object[] objArr = new java.lang.Object[19];
        this.getHighResolutionOutputSizeshNQ4ISI = objArr;
        objArr[7] = obj;
        objArr[8] = obj2;
        objArr[9] = obj3;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getInputFormats = -1;
    }
}

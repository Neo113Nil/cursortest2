package com.visa.cbp;

/* loaded from: classes16.dex */
public class setCertFormat$24815 {
    public long BuildConfig;
    private final long[] Camera2StreamConfigurationMap;
    public int ConfirmReplenishRequest;
    public float ReplenishAckRequest;
    public java.lang.Object ReplenishRequest;
    private final float[] getHighResolutionOutputSizeshNQ4ISI;
    private final int[] getHighSpeedVideoFpsRanges;
    private final double[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.Object[] getHighSpeedVideoSizes;
    private int getInputFormats;
    private int getOutputMinFrameDuration;
    public double getTokenInfo;
    public float getTvls;
    public java.lang.Object setTokenInfo;
    public double setTvls;
    public int valueOf;
    public long values;

    public int valueOf(int i) {
        java.lang.Object[] objArr = null;
        switch (i) {
            case 1:
                int[] iArr = this.getHighSpeedVideoFpsRanges;
                int i2 = this.getOutputMinFrameDuration;
                iArr[i2] = 0;
                this.getOutputMinFrameDuration = i2 + 2;
                iArr[i2 + 1] = 0;
                return 0;
            case 2:
                int i3 = this.getOutputMinFrameDuration - this.ConfirmReplenishRequest;
                this.getOutputMinFrameDuration = i3;
                this.getInputFormats = i3;
                return 0;
            case 3:
                int[] iArr2 = this.getHighSpeedVideoFpsRanges;
                int i4 = this.getInputFormats;
                this.getInputFormats = i4 + 1;
                this.valueOf = iArr2[i4];
                return 0;
            case 4:
                int[] iArr3 = this.getHighSpeedVideoFpsRanges;
                int i5 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i5 + 1;
                iArr3[i5] = this.ConfirmReplenishRequest;
                return 0;
            case 5:
                int i6 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i6;
                this.getHighSpeedVideoSizes[i6] = null;
                return 0;
            case 6:
                int[] iArr4 = this.getHighSpeedVideoFpsRanges;
                int i7 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i7 + 1;
                iArr4[i7] = 0;
                return 0;
            case 7:
                long[] jArr = this.Camera2StreamConfigurationMap;
                int i8 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i8 + 1;
                jArr[i8] = this.BuildConfig;
                return 0;
            case 8:
                java.lang.Object[] objArr2 = this.getHighSpeedVideoSizes;
                int i9 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i9 + 1;
                objArr2[i9] = objArr2[14];
                return 0;
            case 9:
                java.lang.Object[] objArr3 = this.getHighSpeedVideoSizes;
                int i10 = this.getInputFormats;
                this.getInputFormats = i10 + 1;
                java.lang.Object obj = objArr3[i10];
                objArr3[i10] = null;
                this.setTokenInfo = obj;
                return 0;
            case 10:
                java.lang.Object[] objArr4 = this.getHighSpeedVideoSizes;
                int i11 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i11 + 1;
                objArr4[i11] = this.ReplenishRequest;
                return 0;
            case 11:
                java.lang.Object[] objArr5 = this.getHighSpeedVideoSizes;
                int i12 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i12 + 1;
                objArr5[i12] = objArr5[i12 - 1];
                return 0;
            case 12:
                int i13 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i13;
                java.lang.Object[] objArr6 = this.getHighSpeedVideoSizes;
                java.lang.Object obj2 = objArr6[i13];
                objArr6[i13] = null;
                objArr6[14] = obj2;
                return 0;
            case 13:
                java.lang.Object[] objArr7 = this.getHighSpeedVideoSizes;
                int i14 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i14 + 1;
                objArr7[i14] = objArr7[13];
                return 0;
            case 14:
                int[] iArr5 = this.getHighSpeedVideoFpsRanges;
                int i15 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i15 + 1;
                iArr5[i15] = 48;
                return 0;
            case 15:
                int i16 = this.getOutputMinFrameDuration;
                int i17 = i16 - 1;
                java.lang.Object[] objArr8 = this.getHighSpeedVideoSizes;
                objArr8[i17] = null;
                this.getOutputMinFrameDuration = i16;
                objArr8[i17] = objArr8[14];
                return 0;
            case 16:
                int i18 = this.getOutputMinFrameDuration;
                int i19 = i18 - 1;
                java.lang.Object[] objArr9 = this.getHighSpeedVideoSizes;
                objArr9[i19] = null;
                this.getOutputMinFrameDuration = i18;
                objArr9[i19] = null;
                return 0;
            case 17:
                java.lang.Object[] objArr10 = this.getHighSpeedVideoSizes;
                int i20 = this.getOutputMinFrameDuration - 1;
                java.lang.Object obj3 = objArr10[i20];
                objArr10[i20] = null;
                this.setTokenInfo = obj3;
                return 0;
            case 18:
                int[] iArr6 = this.getHighSpeedVideoFpsRanges;
                int i21 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i21 + 1;
                iArr6[i21] = 2;
                return 0;
            case 19:
                int i22 = this.getOutputMinFrameDuration;
                int i23 = i22 - 1;
                this.getOutputMinFrameDuration = i23;
                int[] iArr7 = this.getHighSpeedVideoFpsRanges;
                int i24 = i22 - 2;
                iArr7[i24] = iArr7[i24] % iArr7[i23];
                int i25 = i22 - 2;
                this.getOutputMinFrameDuration = i25;
                this.getHighSpeedVideoSizes[i25] = null;
                return 0;
            case 21:
                int[] iArr8 = this.getHighSpeedVideoFpsRanges;
                int i26 = this.getOutputMinFrameDuration;
                iArr8[i26] = 117;
                int i27 = i26 - 1;
                int i28 = iArr8[i27] + 117;
                iArr8[i27] = i28;
                this.getOutputMinFrameDuration = i26 + 1;
                iArr8[i26] = i28;
            case 20:
                return 0;
            case 22:
                int[] iArr9 = this.getHighSpeedVideoFpsRanges;
                int i29 = this.getOutputMinFrameDuration;
                iArr9[i29] = 128;
                this.getOutputMinFrameDuration = i29;
                int i30 = i29 - 1;
                iArr9[i30] = iArr9[i30] % 128;
                return 0;
            case 23:
                int i31 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i31;
                this.valueOf = this.getHighSpeedVideoFpsRanges[i31] == 0 ? 0 : 1;
                return 0;
            case 24:
                int i32 = this.getOutputMinFrameDuration;
                int i33 = i32 - 1;
                this.getOutputMinFrameDuration = i33;
                int[] iArr10 = this.getHighSpeedVideoFpsRanges;
                int i34 = i32 - 2;
                iArr10[i34] = iArr10[i34] % iArr10[i33];
                return 0;
            case 25:
                for (int i35 = this.getOutputMinFrameDuration - 1; i35 >= 0; i35--) {
                    this.getHighSpeedVideoSizes[i35] = null;
                }
                java.lang.Object[] objArr11 = this.getHighSpeedVideoSizes;
                this.getOutputMinFrameDuration = 1;
                objArr11[0] = this.ReplenishRequest;
                return 0;
            case 26:
                int i36 = this.getOutputMinFrameDuration;
                int i37 = i36 - 1;
                int[] iArr11 = this.getHighSpeedVideoFpsRanges;
                iArr11[20] = iArr11[i37];
                java.lang.Object[] objArr12 = this.getHighSpeedVideoSizes;
                this.getOutputMinFrameDuration = i36;
                objArr12[i37] = objArr12[14];
                return 0;
            case 27:
                int i38 = this.getOutputMinFrameDuration;
                int i39 = i38 - 1;
                java.lang.Object[] objArr13 = this.getHighSpeedVideoSizes;
                java.lang.Object obj4 = objArr13[i39];
                objArr13[i39] = null;
                objArr13[21] = obj4;
                objArr13[i39] = null;
                int i40 = i38 - 1;
                this.getOutputMinFrameDuration = i40;
                java.lang.Object obj5 = objArr13[i40];
                objArr13[i40] = null;
                objArr13[22] = obj5;
                return 0;
            case 28:
                java.lang.Object[] objArr14 = this.getHighSpeedVideoSizes;
                int i41 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i41 + 1;
                objArr14[i41] = null;
                return 0;
            case 29:
                int i42 = this.getOutputMinFrameDuration;
                int i43 = i42 - 1;
                java.lang.Object[] objArr15 = this.getHighSpeedVideoSizes;
                java.lang.Object obj6 = objArr15[i43];
                objArr15[i43] = null;
                objArr15[23] = obj6;
                int[] iArr12 = this.getHighSpeedVideoFpsRanges;
                iArr12[i43] = 0;
                int i44 = i42 - 1;
                this.getOutputMinFrameDuration = i44;
                iArr12[24] = iArr12[i44];
                return 0;
            case 30:
                int i45 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i45;
                java.lang.Object[] objArr16 = this.getHighSpeedVideoSizes;
                java.lang.Object obj7 = objArr16[i45];
                objArr16[i45] = null;
                objArr16[25] = obj7;
                return 0;
            case 31:
                int i46 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i46;
                java.lang.Object[] objArr17 = this.getHighSpeedVideoSizes;
                java.lang.Object obj8 = objArr17[i46];
                objArr17[i46] = null;
                objArr17[26] = obj8;
                return 0;
            case 32:
                java.lang.Object[] objArr18 = this.getHighSpeedVideoSizes;
                int i47 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i47 + 1;
                objArr18[i47] = objArr18[12];
                return 0;
            case 33:
                java.lang.Object[] objArr19 = this.getHighSpeedVideoSizes;
                int i48 = this.getOutputMinFrameDuration;
                objArr19[i48] = objArr19[14];
                int[] iArr13 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i48 + 2;
                iArr13[i48 + 1] = 309;
                return 0;
            case 34:
                java.lang.Object[] objArr20 = this.getHighSpeedVideoSizes;
                int i49 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i49 + 1;
                objArr20[i49] = objArr20[26];
                return 0;
            case 35:
                java.lang.Object[] objArr21 = this.getHighSpeedVideoSizes;
                int i50 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i50 + 1;
                objArr21[i50] = objArr21[15];
                return 0;
            case 36:
                int i51 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i51;
                java.lang.Object[] objArr22 = this.getHighSpeedVideoSizes;
                java.lang.Object obj9 = objArr22[i51];
                objArr22[i51] = null;
                this.valueOf = obj9 != null ? 0 : 1;
                return 0;
            case 37:
                java.lang.Object[] objArr23 = this.getHighSpeedVideoSizes;
                int i52 = this.getOutputMinFrameDuration;
                objArr23[i52] = objArr23[26];
                this.getOutputMinFrameDuration = i52 + 2;
                objArr23[i52 + 1] = objArr23[16];
                return 0;
            case 38:
                int i53 = this.getOutputMinFrameDuration;
                int i54 = i53 - 1;
                java.lang.Object[] objArr24 = this.getHighSpeedVideoSizes;
                objArr24[i54] = null;
                this.getOutputMinFrameDuration = i53;
                objArr24[i54] = objArr24[13];
                return 0;
            case 39:
                int i55 = this.getOutputMinFrameDuration;
                int i56 = i55 - 1;
                java.lang.Object[] objArr25 = this.getHighSpeedVideoSizes;
                objArr25[i56] = null;
                this.getOutputMinFrameDuration = i55;
                objArr25[i56] = objArr25[21];
                return 0;
            case 40:
                int i57 = this.getOutputMinFrameDuration;
                int i58 = i57 - 1;
                this.getHighSpeedVideoSizes[i58] = null;
                int[] iArr14 = this.getHighSpeedVideoFpsRanges;
                iArr14[i58] = 0;
                this.getOutputMinFrameDuration = i57 + 1;
                iArr14[i57] = 0;
                return 0;
            case 41:
                int[] iArr15 = this.getHighSpeedVideoFpsRanges;
                int i59 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i59 + 1;
                iArr15[i59] = 1;
                return 0;
            case 42:
                int[] iArr16 = this.getHighSpeedVideoFpsRanges;
                int i60 = this.getOutputMinFrameDuration - 1;
                iArr16[i60] = (byte) iArr16[i60];
                return 0;
            case 43:
                int i61 = this.getOutputMinFrameDuration;
                int i62 = i61 - 1;
                int[] iArr17 = this.getHighSpeedVideoFpsRanges;
                int i63 = i61 - 2;
                iArr17[i63] = iArr17[i63] - iArr17[i62];
                this.getOutputMinFrameDuration = i61;
                iArr17[i62] = 175;
                return 0;
            case 44:
                int[] iArr18 = this.getHighSpeedVideoFpsRanges;
                int i64 = this.getOutputMinFrameDuration;
                iArr18[i64] = 8;
                this.getOutputMinFrameDuration = i64;
                int i65 = i64 - 1;
                iArr18[i65] = iArr18[i65] >> 8;
                return 0;
            case 45:
                int i66 = this.getOutputMinFrameDuration;
                int i67 = i66 - 1;
                int[] iArr19 = this.getHighSpeedVideoFpsRanges;
                int i68 = i66 - 2;
                iArr19[i68] = iArr19[i68] - iArr19[i67];
                long[] jArr2 = this.Camera2StreamConfigurationMap;
                this.getOutputMinFrameDuration = i66;
                jArr2[i67] = 0;
                return 0;
            case 46:
                long[] jArr3 = this.Camera2StreamConfigurationMap;
                int i69 = this.getInputFormats;
                this.getInputFormats = i69 + 1;
                this.values = jArr3[i69];
                return 0;
            case 47:
                int[] iArr20 = this.getHighSpeedVideoFpsRanges;
                int i70 = this.getOutputMinFrameDuration - 1;
                iArr20[i70] = (char) iArr20[i70];
                return 0;
            case 48:
                int i71 = this.getOutputMinFrameDuration;
                int i72 = i71 - 2;
                this.getOutputMinFrameDuration = i72;
                int[] iArr21 = this.getHighSpeedVideoFpsRanges;
                this.valueOf = iArr21[i72] != iArr21[i71 - 1] ? 0 : 1;
                return 0;
            case 49:
                int[] iArr22 = this.getHighSpeedVideoFpsRanges;
                int i73 = this.getOutputMinFrameDuration;
                java.lang.Object[] objArr26 = this.getHighSpeedVideoSizes;
                int i74 = i73 - 1;
                java.lang.Object obj10 = objArr26[i74];
                objArr26[i74] = null;
                iArr22[i74] = ((java.lang.Object[]) obj10).length;
                this.getOutputMinFrameDuration = i73 + 1;
                iArr22[i73] = 3;
                return 0;
            case 50:
                java.lang.Object[] objArr27 = this.getHighSpeedVideoSizes;
                int i75 = this.getOutputMinFrameDuration;
                objArr27[i75] = objArr27[14];
                int[] iArr23 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i75 + 2;
                iArr23[i75 + 1] = 0;
                return 0;
            case 51:
                int i76 = this.getOutputMinFrameDuration;
                int i77 = i76 - 1;
                this.getOutputMinFrameDuration = i77;
                java.lang.Object[] objArr28 = this.getHighSpeedVideoSizes;
                int i78 = i76 - 2;
                java.lang.Object obj11 = objArr28[i78];
                objArr28[i78] = null;
                objArr28[i78] = ((java.lang.Object[]) obj11)[this.getHighSpeedVideoFpsRanges[i77]];
                return 0;
            case 52:
                int[] iArr24 = this.getHighSpeedVideoFpsRanges;
                int i79 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i79 + 1;
                iArr24[i79] = 8;
                return 0;
            case 53:
                java.lang.Object[] objArr29 = this.getHighSpeedVideoSizes;
                int i80 = this.getOutputMinFrameDuration;
                int i81 = i80 + 1;
                java.lang.Object obj12 = objArr29[14];
                objArr29[i80] = obj12;
                this.getHighSpeedVideoFpsRanges[i81] = 1;
                this.getOutputMinFrameDuration = i81;
                objArr29[i80] = null;
                objArr29[i80] = ((java.lang.Object[]) obj12)[1];
                return 0;
            case 54:
                int i82 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i82;
                java.lang.Object[] objArr30 = this.getHighSpeedVideoSizes;
                java.lang.Object obj13 = objArr30[i82];
                objArr30[i82] = null;
                objArr30[21] = obj13;
                return 0;
            case 55:
                java.lang.Object[] objArr31 = this.getHighSpeedVideoSizes;
                int i83 = this.getOutputMinFrameDuration;
                objArr31[i83] = objArr31[14];
                int[] iArr25 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i83 + 2;
                iArr25[i83 + 1] = 2;
                return 0;
            case 56:
                int i84 = this.getOutputMinFrameDuration;
                int i85 = i84 - 1;
                this.getOutputMinFrameDuration = i85;
                int[] iArr26 = this.getHighSpeedVideoFpsRanges;
                int i86 = i84 - 2;
                iArr26[i86] = iArr26[i86] + iArr26[i85];
                return 0;
            case 57:
                int[] iArr27 = this.getHighSpeedVideoFpsRanges;
                int i87 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i87 + 1;
                iArr27[i87] = 178;
                return 0;
            case 58:
                java.lang.Object[] objArr32 = this.getHighSpeedVideoSizes;
                int i88 = this.getOutputMinFrameDuration;
                objArr32[i88] = objArr32[14];
                int[] iArr28 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i88 + 2;
                iArr28[i88 + 1] = 1;
                return 0;
            case 59:
                java.lang.Object[] objArr33 = this.getHighSpeedVideoSizes;
                int i89 = this.getOutputMinFrameDuration;
                objArr33[i89] = objArr33[13];
                this.getOutputMinFrameDuration = i89 + 2;
                objArr33[i89 + 1] = objArr33[14];
                return 0;
            case 60:
                int[] iArr29 = this.getHighSpeedVideoFpsRanges;
                int i90 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i90 + 1;
                iArr29[i90] = 450;
                return 0;
            case 61:
                int i91 = this.getOutputMinFrameDuration;
                int i92 = i91 - 1;
                int[] iArr30 = this.getHighSpeedVideoFpsRanges;
                int i93 = i91 - 2;
                iArr30[i93] = iArr30[i93] - iArr30[i92];
                iArr30[i92] = 178;
                this.getOutputMinFrameDuration = i91 + 1;
                iArr30[i91] = 0;
                return 0;
            case 62:
                int[] iArr31 = this.getHighSpeedVideoFpsRanges;
                int i94 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i94 + 1;
                iArr31[i94] = 20;
                return 0;
            case 63:
                int i95 = this.getOutputMinFrameDuration;
                int i96 = i95 - 1;
                int[] iArr32 = this.getHighSpeedVideoFpsRanges;
                int i97 = i95 - 2;
                iArr32[i97] = iArr32[i97] + iArr32[i96];
                iArr32[i96] = 6;
                this.getOutputMinFrameDuration = i96;
                iArr32[i97] = iArr32[i97] >> 6;
                return 0;
            case 64:
                int[] iArr33 = this.getHighSpeedVideoFpsRanges;
                int i98 = this.getOutputMinFrameDuration;
                iArr33[i98] = 48;
                this.getOutputMinFrameDuration = i98 + 2;
                iArr33[i98 + 1] = 0;
                return 0;
            case 65:
                int i99 = this.getOutputMinFrameDuration;
                int i100 = i99 - 1;
                this.getOutputMinFrameDuration = i100;
                int[] iArr34 = this.getHighSpeedVideoFpsRanges;
                int i101 = i99 - 2;
                int i102 = iArr34[i101] - iArr34[i100];
                iArr34[i101] = i102;
                iArr34[i101] = (char) i102;
                return 0;
            case 66:
                java.lang.Object[] objArr34 = this.getHighSpeedVideoSizes;
                int i103 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i103 + 1;
                objArr34[i103] = objArr34[21];
                return 0;
            case 67:
                int i104 = this.getOutputMinFrameDuration;
                int i105 = i104 - 1;
                this.getOutputMinFrameDuration = i105;
                int[] iArr35 = this.getHighSpeedVideoFpsRanges;
                int i106 = i104 - 2;
                iArr35[i106] = iArr35[i106] - iArr35[i105];
                return 0;
            case 68:
                int[] iArr36 = this.getHighSpeedVideoFpsRanges;
                int i107 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i107 + 1;
                iArr36[i107] = 175;
                return 0;
            case 69:
                int[] iArr37 = this.getHighSpeedVideoFpsRanges;
                int i108 = this.getOutputMinFrameDuration;
                iArr37[i108] = 16;
                int i109 = i108 - 1;
                int i110 = iArr37[i109] >> 16;
                iArr37[i109] = i110;
                this.getOutputMinFrameDuration = i109;
                int i111 = i108 - 2;
                iArr37[i111] = iArr37[i111] + i110;
                return 0;
            case 70:
                float[] fArr = this.getHighResolutionOutputSizeshNQ4ISI;
                int i112 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i112 + 1;
                fArr[i112] = this.ReplenishAckRequest;
                return 0;
            case 71:
                int[] iArr38 = this.getHighSpeedVideoFpsRanges;
                int i113 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i113 + 1;
                iArr38[i113] = -1;
                return 0;
            case 72:
                float[] fArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i114 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i114 + 1;
                fArr2[i114] = 0.0f;
                return 0;
            case 73:
                int i115 = this.getOutputMinFrameDuration;
                int[] iArr39 = this.getHighSpeedVideoFpsRanges;
                float[] fArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i116 = i115 - 2;
                int i117 = (fArr3[i116] > fArr3[i115 - 1] ? 1 : (fArr3[i116] == fArr3[i115 - 1] ? 0 : -1));
                iArr39[i116] = i117;
                this.getOutputMinFrameDuration = i116;
                int i118 = i115 - 3;
                iArr39[i118] = iArr39[i118] + i117;
                return 0;
            case 74:
                int i119 = this.getOutputMinFrameDuration;
                int i120 = i119 - 1;
                this.getOutputMinFrameDuration = i120;
                java.lang.Object[] objArr35 = this.getHighSpeedVideoSizes;
                java.lang.Object obj14 = objArr35[i120];
                objArr35[i120] = null;
                objArr35[14] = obj14;
                int[] iArr40 = this.getHighSpeedVideoFpsRanges;
                int i121 = i119 - 2;
                java.lang.Object obj15 = objArr35[i121];
                objArr35[i121] = null;
                iArr40[i121] = ((java.lang.Object[]) obj15).length;
                this.getOutputMinFrameDuration = i119;
                iArr40[i120] = 5;
                return 0;
            case 75:
                int[] iArr41 = this.getHighSpeedVideoFpsRanges;
                int i122 = this.getOutputMinFrameDuration;
                iArr41[i122] = 1;
                this.getOutputMinFrameDuration = i122;
                java.lang.Object[] objArr36 = this.getHighSpeedVideoSizes;
                int i123 = i122 - 1;
                java.lang.Object obj16 = objArr36[i123];
                objArr36[i123] = null;
                objArr36[i123] = ((java.lang.Object[]) obj16)[1];
                return 0;
            case 76:
                int i124 = this.getOutputMinFrameDuration;
                int i125 = i124 - 1;
                java.lang.Object[] objArr37 = this.getHighSpeedVideoSizes;
                java.lang.Object obj17 = objArr37[i125];
                objArr37[i125] = null;
                objArr37[26] = obj17;
                objArr37[i125] = objArr37[14];
                int[] iArr42 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i124 + 1;
                iArr42[i124] = 3;
                return 0;
            case 77:
                int i126 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i126;
                java.lang.Object[] objArr38 = this.getHighSpeedVideoSizes;
                java.lang.Object obj18 = objArr38[i126];
                objArr38[i126] = null;
                objArr38[27] = obj18;
                return 0;
            case 78:
                java.lang.Object[] objArr39 = this.getHighSpeedVideoSizes;
                int i127 = this.getOutputMinFrameDuration;
                int i128 = i127 + 1;
                java.lang.Object obj19 = objArr39[14];
                objArr39[i127] = obj19;
                this.getHighSpeedVideoFpsRanges[i128] = 4;
                this.getOutputMinFrameDuration = i128;
                objArr39[i127] = null;
                objArr39[i127] = ((java.lang.Object[]) obj19)[4];
                return 0;
            case 79:
                int i129 = this.getOutputMinFrameDuration;
                int i130 = i129 - 1;
                java.lang.Object[] objArr40 = this.getHighSpeedVideoSizes;
                java.lang.Object obj20 = objArr40[i130];
                objArr40[i130] = null;
                objArr40[14] = obj20;
                objArr40[i130] = objArr40[13];
                this.getOutputMinFrameDuration = i129 + 1;
                objArr40[i129] = objArr40[21];
                return 0;
            case 80:
                java.lang.Object[] objArr41 = this.getHighSpeedVideoSizes;
                int i131 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i131 + 1;
                objArr41[i131] = objArr41[17];
                return 0;
            case 81:
                int i132 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i132;
                java.lang.Object[] objArr42 = this.getHighSpeedVideoSizes;
                java.lang.Object obj21 = objArr42[i132];
                objArr42[i132] = null;
                objArr42[17] = obj21;
                return 0;
            case 82:
                int i133 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i133;
                java.lang.Object[] objArr43 = this.getHighSpeedVideoSizes;
                java.lang.Object obj22 = objArr43[i133];
                objArr43[i133] = null;
                this.valueOf = obj22 == null ? 0 : 1;
                return 0;
            case 83:
                java.lang.Object[] objArr44 = this.getHighSpeedVideoSizes;
                int i134 = this.getOutputMinFrameDuration;
                objArr44[i134] = objArr44[27];
                objArr44[i134 + 1] = objArr44[17];
                this.getOutputMinFrameDuration = i134 + 3;
                objArr44[i134 + 2] = objArr44[26];
                return 0;
            case 84:
                int i135 = this.getOutputMinFrameDuration;
                int i136 = i135 - 1;
                this.getOutputMinFrameDuration = i136;
                int[] iArr43 = this.getHighSpeedVideoFpsRanges;
                java.lang.Object[] objArr45 = this.getHighSpeedVideoSizes;
                int i137 = i135 - 2;
                java.lang.Object obj23 = objArr45[i137];
                objArr45[i137] = null;
                iArr43[i137] = ((byte[]) obj23)[iArr43[i136]];
                return 0;
            case 85:
                int[] iArr44 = this.getHighSpeedVideoFpsRanges;
                int i138 = this.getOutputMinFrameDuration;
                java.lang.Object[] objArr46 = this.getHighSpeedVideoSizes;
                int i139 = i138 - 1;
                java.lang.Object obj24 = objArr46[i139];
                objArr46[i139] = null;
                iArr44[i139] = ((byte[]) obj24).length;
                iArr44[i138] = 1;
                this.getOutputMinFrameDuration = i138;
                iArr44[i139] = iArr44[i139] - 1;
                return 0;
            case 86:
                java.lang.Object[] objArr47 = this.getHighSpeedVideoSizes;
                int i140 = this.getOutputMinFrameDuration - 1;
                objArr47[i140] = new byte[this.getHighSpeedVideoFpsRanges[i140]];
                return 0;
            case 87:
                int i141 = this.getOutputMinFrameDuration;
                int i142 = i141 - 1;
                java.lang.Object[] objArr48 = this.getHighSpeedVideoSizes;
                java.lang.Object obj25 = objArr48[i142];
                objArr48[i142] = null;
                objArr48[22] = obj25;
                this.getOutputMinFrameDuration = i141;
                objArr48[i142] = objArr48[14];
                return 0;
            case 88:
                int[] iArr45 = this.getHighSpeedVideoFpsRanges;
                int i143 = this.getOutputMinFrameDuration;
                iArr45[i143] = 1;
                java.lang.Object[] objArr49 = this.getHighSpeedVideoSizes;
                objArr49[i143 + 1] = objArr49[22];
                this.getOutputMinFrameDuration = i143 + 3;
                iArr45[i143 + 2] = 0;
                return 0;
            case 89:
                java.lang.Object[] objArr50 = this.getHighSpeedVideoSizes;
                int i144 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i144 + 1;
                objArr50[i144] = objArr50[22];
                return 0;
            case 90:
                int[] iArr46 = this.getHighSpeedVideoFpsRanges;
                int i145 = this.getOutputMinFrameDuration;
                java.lang.Object[] objArr51 = this.getHighSpeedVideoSizes;
                int i146 = i145 - 1;
                java.lang.Object obj26 = objArr51[i146];
                objArr51[i146] = null;
                iArr46[i146] = ((byte[]) obj26).length;
                return 0;
            case 91:
                int[] iArr47 = this.getHighSpeedVideoFpsRanges;
                int i147 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i147 + 1;
                iArr47[i147] = 159;
                return 0;
            case 92:
                int[] iArr48 = this.getHighSpeedVideoFpsRanges;
                int i148 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i148 + 1;
                iArr48[i148] = 152;
                return 0;
            case 93:
                int[] iArr49 = this.getHighSpeedVideoFpsRanges;
                int i149 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i149;
                this.valueOf = iArr49[i149];
                return 0;
            case 94:
                int[] iArr50 = this.getHighSpeedVideoFpsRanges;
                int i150 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i150 + 1;
                iArr50[i150] = iArr50[20];
                return 0;
            case 95:
                java.lang.Object[] objArr52 = this.getHighSpeedVideoSizes;
                int i151 = this.getOutputMinFrameDuration;
                objArr52[i151] = objArr52[22];
                int[] iArr51 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i151 + 2;
                iArr51[i151 + 1] = 0;
                return 0;
            case 96:
                java.lang.Object[] objArr53 = this.getHighSpeedVideoSizes;
                int i152 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i152 + 1;
                java.lang.Object obj27 = objArr53[22];
                objArr53[i152] = obj27;
                int[] iArr52 = this.getHighSpeedVideoFpsRanges;
                objArr53[i152] = null;
                iArr52[i152] = ((byte[]) obj27).length;
                return 0;
            case 97:
                int i153 = this.getOutputMinFrameDuration;
                int i154 = i153 - 1;
                java.lang.Object[] objArr54 = this.getHighSpeedVideoSizes;
                objArr54[i154] = null;
                this.getOutputMinFrameDuration = i153;
                objArr54[i154] = objArr54[18];
                return 0;
            case 98:
                java.lang.Object[] objArr55 = this.getHighSpeedVideoSizes;
                int i155 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i155 + 1;
                objArr55[i155] = objArr55[19];
                return 0;
            case 99:
                java.lang.Object[] objArr56 = this.getHighSpeedVideoSizes;
                int i156 = this.getOutputMinFrameDuration;
                objArr56[i156] = objArr56[12];
                this.getOutputMinFrameDuration = i156 + 2;
                objArr56[i156 + 1] = objArr56[18];
                return 0;
            case 100:
                java.lang.Object[] objArr57 = this.getHighSpeedVideoSizes;
                int i157 = this.getOutputMinFrameDuration;
                objArr57[i157] = objArr57[22];
                this.getOutputMinFrameDuration = i157 + 2;
                objArr57[i157 + 1] = objArr57[16];
                return 0;
            case 101:
                int[] iArr53 = this.getHighSpeedVideoFpsRanges;
                int i158 = this.getOutputMinFrameDuration;
                int i159 = i158 + 1;
                iArr53[i158] = 0;
                java.lang.Object[] objArr58 = this.getHighSpeedVideoSizes;
                this.getOutputMinFrameDuration = i158 + 2;
                java.lang.Object obj28 = objArr58[21];
                objArr58[i159] = obj28;
                objArr58[i159] = null;
                iArr53[i159] = ((byte[]) obj28).length;
                return 0;
            case 102:
                java.lang.Object[] objArr59 = this.getHighSpeedVideoSizes;
                int i160 = this.getOutputMinFrameDuration;
                objArr59[i160] = objArr59[12];
                this.getOutputMinFrameDuration = i160 + 2;
                objArr59[i160 + 1] = objArr59[21];
                return 0;
            case 103:
                int i161 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i161;
                java.lang.Object[] objArr60 = this.getHighSpeedVideoSizes;
                java.lang.Object obj29 = objArr60[i161];
                objArr60[i161] = null;
                objArr60[23] = obj29;
                return 0;
            case 104:
                float[] fArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i162 = this.getInputFormats;
                this.getInputFormats = i162 + 1;
                this.getTvls = fArr4[i162];
                return 0;
            case 105:
                java.lang.Object[] objArr61 = this.getHighSpeedVideoSizes;
                int i163 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i163 + 1;
                objArr61[i163] = objArr61[23];
                return 0;
            case 106:
                int i164 = this.getOutputMinFrameDuration;
                int i165 = i164 - 1;
                java.lang.Object[] objArr62 = this.getHighSpeedVideoSizes;
                objArr62[i165] = null;
                objArr62[i165] = objArr62[12];
                this.getOutputMinFrameDuration = i164 + 1;
                objArr62[i164] = objArr62[22];
                return 0;
            case 107:
                int i166 = this.getOutputMinFrameDuration;
                int i167 = i166 - 1;
                java.lang.Object[] objArr63 = this.getHighSpeedVideoSizes;
                java.lang.Object obj30 = objArr63[i167];
                objArr63[i167] = null;
                objArr63[14] = obj30;
                objArr63[i167] = objArr63[13];
                this.getOutputMinFrameDuration = i166 + 1;
                objArr63[i166] = objArr63[14];
                return 0;
            case 108:
                int[] iArr54 = this.getHighSpeedVideoFpsRanges;
                int i168 = this.getOutputMinFrameDuration;
                iArr54[i168] = 0;
                float[] fArr5 = this.getHighResolutionOutputSizeshNQ4ISI;
                fArr5[i168 + 1] = 0.0f;
                this.getOutputMinFrameDuration = i168 + 3;
                fArr5[i168 + 2] = 0.0f;
                return 0;
            case 109:
                int i169 = this.getOutputMinFrameDuration;
                int i170 = i169 - 1;
                this.getOutputMinFrameDuration = i170;
                int[] iArr55 = this.getHighSpeedVideoFpsRanges;
                int i171 = i169 - 2;
                int i172 = iArr55[i171] / iArr55[i170];
                iArr55[i171] = i172;
                iArr55[i171] = (short) i172;
                return 0;
            case 110:
                int i173 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i173;
                int[] iArr56 = this.getHighSpeedVideoFpsRanges;
                iArr56[24] = iArr56[i173];
                return 0;
            case 111:
                int[] iArr57 = this.getHighSpeedVideoFpsRanges;
                int i174 = this.getOutputMinFrameDuration;
                iArr57[i174] = 48;
                iArr57[i174 + 1] = 0;
                this.getOutputMinFrameDuration = i174 + 3;
                iArr57[i174 + 2] = 0;
                return 0;
            case 112:
                java.lang.Object[] objArr64 = this.getHighSpeedVideoSizes;
                int i175 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i175 + 1;
                objArr64[i175] = objArr64[18];
                return 0;
            case 113:
                java.lang.Object[] objArr65 = this.getHighSpeedVideoSizes;
                int i176 = this.getOutputMinFrameDuration;
                objArr65[i176] = objArr65[12];
                this.getOutputMinFrameDuration = i176 + 2;
                objArr65[i176 + 1] = objArr65[26];
                return 0;
            case 114:
                int i177 = this.getOutputMinFrameDuration;
                int i178 = i177 - 1;
                java.lang.Object[] objArr66 = this.getHighSpeedVideoSizes;
                java.lang.Object obj31 = objArr66[i178];
                objArr66[i178] = null;
                objArr66[23] = obj31;
                int[] iArr58 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i177;
                iArr58[i178] = 0;
                return 0;
            case 115:
                int i179 = this.getOutputMinFrameDuration;
                int i180 = i179 - 1;
                this.getHighSpeedVideoSizes[i180] = null;
                int[] iArr59 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i179;
                iArr59[i180] = 0;
                return 0;
            case 116:
                java.lang.Object[] objArr67 = this.getHighSpeedVideoSizes;
                int i181 = this.getOutputMinFrameDuration;
                objArr67[i181] = objArr67[23];
                this.getHighSpeedVideoFpsRanges[i181 + 1] = 0;
                this.getOutputMinFrameDuration = i181 + 3;
                objArr67[i181 + 2] = objArr67[23];
                return 0;
            case 117:
                int[] iArr60 = this.getHighSpeedVideoFpsRanges;
                int i182 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i182 + 1;
                iArr60[i182] = 31;
                return 0;
            case 118:
                float[] fArr6 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i183 = this.getOutputMinFrameDuration;
                fArr6[i183] = 0.0f;
                int[] iArr61 = this.getHighSpeedVideoFpsRanges;
                int i184 = i183 - 1;
                int i185 = (fArr6[i184] > 0.0f ? 1 : (fArr6[i184] == 0.0f ? 0 : -1));
                iArr61[i184] = i185;
                this.getOutputMinFrameDuration = i184;
                int i186 = i183 - 2;
                iArr61[i186] = iArr61[i186] + i185;
                return 0;
            case 119:
                int[] iArr62 = this.getHighSpeedVideoFpsRanges;
                int i187 = this.getOutputMinFrameDuration;
                iArr62[i187] = 765;
                float[] fArr7 = this.getHighResolutionOutputSizeshNQ4ISI;
                fArr7[i187 + 1] = 0.0f;
                this.getOutputMinFrameDuration = i187 + 3;
                fArr7[i187 + 2] = 0.0f;
                return 0;
            case 120:
                int[] iArr63 = this.getHighSpeedVideoFpsRanges;
                int i188 = this.getOutputMinFrameDuration;
                iArr63[i188] = 16;
                this.getOutputMinFrameDuration = i188;
                int i189 = i188 - 1;
                int i190 = iArr63[i189] >> 16;
                iArr63[i189] = i190;
                iArr63[i189] = (char) i190;
                return 0;
            case 121:
                int i191 = this.getOutputMinFrameDuration;
                int i192 = i191 - 1;
                java.lang.Object[] objArr68 = this.getHighSpeedVideoSizes;
                objArr68[i192] = null;
                int[] iArr64 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i191;
                iArr64[i192] = 1;
                objArr68[i192] = new byte[1];
                return 0;
            case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                java.lang.Object[] objArr69 = this.getHighSpeedVideoSizes;
                int i193 = this.getOutputMinFrameDuration;
                java.lang.Object obj32 = objArr69[i193 - 1];
                objArr69[i193] = obj32;
                this.getOutputMinFrameDuration = i193;
                objArr69[i193] = null;
                objArr69[14] = obj32;
                return 0;
            case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                int[] iArr65 = this.getHighSpeedVideoFpsRanges;
                int i194 = this.getOutputMinFrameDuration;
                iArr65[i194] = 0;
                this.getOutputMinFrameDuration = i194 + 2;
                iArr65[i194 + 1] = iArr65[24];
                return 0;
            case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                int i195 = this.getOutputMinFrameDuration;
                int i196 = i195 - 3;
                this.getOutputMinFrameDuration = i196;
                java.lang.Object[] objArr70 = this.getHighSpeedVideoSizes;
                java.lang.Object obj33 = objArr70[i196];
                objArr70[i196] = null;
                int[] iArr66 = this.getHighSpeedVideoFpsRanges;
                int i197 = i195 - 2;
                int i198 = i195 - 1;
                ((byte[]) obj33)[iArr66[i197]] = (byte) iArr66[i198];
                objArr70[i196] = objArr70[25];
                this.getOutputMinFrameDuration = i198;
                objArr70[i197] = objArr70[14];
                return 0;
            case 125:
                int i199 = this.getOutputMinFrameDuration;
                int i200 = i199 - 1;
                java.lang.Object[] objArr71 = this.getHighSpeedVideoSizes;
                objArr71[i200] = null;
                this.getOutputMinFrameDuration = i199;
                objArr71[i200] = objArr71[25];
                return 0;
            case 126:
                int[] iArr67 = this.getHighSpeedVideoFpsRanges;
                int i201 = this.getOutputMinFrameDuration;
                iArr67[i201] = 2;
                this.getOutputMinFrameDuration = i201 + 2;
                iArr67[i201 + 1] = 2;
                return 0;
            case 127:
                int[] iArr68 = this.getHighSpeedVideoFpsRanges;
                int i202 = this.getOutputMinFrameDuration;
                iArr68[i202] = 2;
                this.getOutputMinFrameDuration = i202;
                int i203 = i202 - 1;
                iArr68[i203] = iArr68[i203] % 2;
                return 0;
            case 128:
                int[] iArr69 = this.getHighSpeedVideoFpsRanges;
                int i204 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i204 + 1;
                iArr69[i204] = 73;
                return 0;
            case 129:
                int i205 = this.getOutputMinFrameDuration;
                int i206 = i205 - 1;
                int[] iArr70 = this.getHighSpeedVideoFpsRanges;
                int i207 = i205 - 2;
                int i208 = iArr70[i207] + iArr70[i206];
                iArr70[i207] = i208;
                this.getOutputMinFrameDuration = i205;
                iArr70[i206] = i208;
                return 0;
            case 130:
                int[] iArr71 = this.getHighSpeedVideoFpsRanges;
                int i209 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i209 + 1;
                iArr71[i209] = 128;
                return 0;
            case 131:
                int i210 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i210;
                this.valueOf = this.getHighSpeedVideoFpsRanges[i210] != 0 ? 0 : 1;
                return 0;
            case 132:
                int[] iArr72 = this.getHighSpeedVideoFpsRanges;
                int i211 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i211 + 1;
                iArr72[i211] = 38;
                return 0;
            case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                int[] iArr73 = this.getHighSpeedVideoFpsRanges;
                int i212 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i212 + 1;
                iArr73[i212] = 0;
                return 0;
            case 134:
                int i213 = this.getOutputMinFrameDuration;
                int i214 = i213 - 1;
                this.getOutputMinFrameDuration = i214;
                int[] iArr74 = this.getHighSpeedVideoFpsRanges;
                int i215 = i213 - 2;
                iArr74[i215] = iArr74[i215] / iArr74[i214];
                return 0;
            case 135:
                int[] iArr75 = this.getHighSpeedVideoFpsRanges;
                int i216 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i216 + 1;
                iArr75[i216] = 43;
                return 0;
            case 136:
                int[] iArr76 = this.getHighSpeedVideoFpsRanges;
                int i217 = this.getOutputMinFrameDuration;
                iArr76[i217] = iArr76[i217 - 1];
                this.getOutputMinFrameDuration = i217 + 2;
                iArr76[i217 + 1] = 128;
                return 0;
            case 137:
                int[] iArr77 = this.getHighSpeedVideoFpsRanges;
                int i218 = this.getOutputMinFrameDuration;
                iArr77[i218] = 105;
                this.getOutputMinFrameDuration = i218;
                int i219 = i218 - 1;
                iArr77[i219] = iArr77[i219] + 105;
                return 0;
            case 138:
                int[] iArr78 = this.getHighSpeedVideoFpsRanges;
                int i220 = this.getOutputMinFrameDuration;
                int i221 = i220 + 1;
                iArr78[i220] = iArr78[i220 - 1];
                iArr78[i221] = 128;
                this.getOutputMinFrameDuration = i221;
                iArr78[i220] = iArr78[i220] % 128;
                return 0;
            case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                int[] iArr79 = this.getHighSpeedVideoFpsRanges;
                int i222 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i222 + 1;
                iArr79[i222] = 76;
                return 0;
            case 140:
                int[] iArr80 = this.getHighSpeedVideoFpsRanges;
                int i223 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i223 + 1;
                iArr80[i223] = 55;
                return 0;
            case 141:
                int[] iArr81 = this.getHighSpeedVideoFpsRanges;
                int i224 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i224 + 1;
                iArr81[i224] = 69;
                return 0;
            case 142:
                int[] iArr82 = this.getHighSpeedVideoFpsRanges;
                int i225 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i225 + 1;
                iArr82[i225] = 60;
                return 0;
            case 143:
                int[] iArr83 = this.getHighSpeedVideoFpsRanges;
                int i226 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i226 + 1;
                iArr83[i226] = 47;
                return 0;
            case 144:
                int[] iArr84 = this.getHighSpeedVideoFpsRanges;
                int i227 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i227 + 1;
                iArr84[i227] = 16;
                return 0;
            case 145:
                java.lang.Object[] objArr72 = this.getHighSpeedVideoSizes;
                int i228 = this.getOutputMinFrameDuration;
                objArr72[i228] = null;
                this.getOutputMinFrameDuration = i228;
                objArr72[i228] = null;
                objArr72[16] = null;
                return 0;
            case 146:
                int[] iArr85 = this.getHighSpeedVideoFpsRanges;
                int i229 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i229 + 1;
                iArr85[i229] = 319;
                return 0;
            case 147:
                java.lang.Object[] objArr73 = this.getHighSpeedVideoSizes;
                int i230 = this.getOutputMinFrameDuration;
                objArr73[i230] = objArr73[13];
                this.getOutputMinFrameDuration = i230 + 2;
                objArr73[i230 + 1] = objArr73[17];
                return 0;
            case 148:
                java.lang.Object[] objArr74 = this.getHighSpeedVideoSizes;
                int i231 = this.getOutputMinFrameDuration;
                objArr74[i231] = objArr74[15];
                this.getOutputMinFrameDuration = i231 + 2;
                objArr74[i231 + 1] = objArr74[14];
                return 0;
            case 149:
                int i232 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i232;
                java.lang.Object[] objArr75 = this.getHighSpeedVideoSizes;
                java.lang.Object obj34 = objArr75[i232];
                objArr75[i232] = null;
                objArr75[16] = obj34;
                return 0;
            case 150:
                int i233 = this.getOutputMinFrameDuration;
                int i234 = i233 - 1;
                java.lang.Object[] objArr76 = this.getHighSpeedVideoSizes;
                java.lang.Object obj35 = objArr76[i234];
                objArr76[i234] = null;
                objArr76[17] = obj35;
                this.getOutputMinFrameDuration = i233;
                objArr76[i234] = objArr76[13];
                return 0;
            case 151:
                java.lang.Object[] objArr77 = this.getHighSpeedVideoSizes;
                int i235 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i235 + 1;
                objArr77[i235] = objArr77[16];
                return 0;
            case 152:
                int[] iArr86 = this.getHighSpeedVideoFpsRanges;
                int i236 = this.getOutputMinFrameDuration;
                iArr86[i236] = 117;
                this.getOutputMinFrameDuration = i236;
                int i237 = i236 - 1;
                iArr86[i237] = iArr86[i237] + 117;
                return 0;
            case 153:
                int[] iArr87 = this.getHighSpeedVideoFpsRanges;
                int i238 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i238 + 1;
                iArr87[i238] = 3;
                return 0;
            case 154:
                int[] iArr88 = this.getHighSpeedVideoFpsRanges;
                int i239 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i239 + 1;
                iArr88[i239] = 77;
                return 0;
            case 155:
                int[] iArr89 = this.getHighSpeedVideoFpsRanges;
                int i240 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i240 + 1;
                iArr89[i240] = 56;
                return 0;
            case 156:
                java.lang.Object[] objArr78 = this.getHighSpeedVideoSizes;
                int i241 = this.getOutputMinFrameDuration;
                objArr78[i241] = objArr78[12];
                this.getOutputMinFrameDuration = i241 + 2;
                objArr78[i241 + 1] = objArr78[15];
                return 0;
            case 157:
                int[] iArr90 = this.getHighSpeedVideoFpsRanges;
                int i242 = this.getOutputMinFrameDuration;
                int i243 = i242 + 1;
                iArr90[i242] = 2;
                iArr90[i243] = 2;
                this.getOutputMinFrameDuration = i243;
                iArr90[i242] = iArr90[i242] % 2;
                return 0;
            case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                int[] iArr91 = this.getHighSpeedVideoFpsRanges;
                int i244 = this.getOutputMinFrameDuration;
                iArr91[i244] = 3;
                this.getOutputMinFrameDuration = i244;
                int i245 = i244 - 1;
                iArr91[i245] = iArr91[i245] + 3;
                return 0;
            case 159:
                int[] iArr92 = this.getHighSpeedVideoFpsRanges;
                int i246 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i246 + 1;
                iArr92[i246] = iArr92[i246 - 1];
                return 0;
            case 160:
                int[] iArr93 = this.getHighSpeedVideoFpsRanges;
                int i247 = this.getOutputMinFrameDuration;
                java.lang.Object[] objArr79 = this.getHighSpeedVideoSizes;
                int i248 = i247 - 1;
                java.lang.Object obj36 = objArr79[i248];
                objArr79[i248] = null;
                iArr93[i248] = ((int[]) obj36).length;
                return 0;
            case 161:
                int[] iArr94 = this.getHighSpeedVideoFpsRanges;
                int i249 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i249 + 1;
                iArr94[i249] = 13;
                return 0;
            case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                int i250 = this.getOutputMinFrameDuration;
                int i251 = i250 - 1;
                int[] iArr95 = this.getHighSpeedVideoFpsRanges;
                int i252 = i250 - 2;
                int i253 = iArr95[i252] + iArr95[i251];
                iArr95[i252] = i253;
                iArr95[i251] = i253;
                this.getOutputMinFrameDuration = i250 + 1;
                iArr95[i250] = 128;
                return 0;
            case 163:
                int[] iArr96 = this.getHighSpeedVideoFpsRanges;
                int i254 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i254 + 1;
                iArr96[i254] = 2;
                return 0;
            case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                int[] iArr97 = this.getHighSpeedVideoFpsRanges;
                int i255 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i255 + 1;
                iArr97[i255] = 15;
                return 0;
            case 165:
                java.lang.Object[] objArr80 = this.getHighSpeedVideoSizes;
                int i256 = this.getOutputMinFrameDuration;
                objArr80[i256] = objArr80[15];
                int[] iArr98 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i256 + 2;
                iArr98[i256 + 1] = 283;
                return 0;
            case 166:
                int[] iArr99 = this.getHighSpeedVideoFpsRanges;
                int i257 = this.getOutputMinFrameDuration;
                iArr99[i257] = 2;
                this.getOutputMinFrameDuration = i257;
                int i258 = i257 - 1;
                iArr99[i258] = iArr99[i258] % 2;
                int i259 = i257 - 1;
                this.getOutputMinFrameDuration = i259;
                this.getHighSpeedVideoSizes[i259] = null;
                return 0;
            case 167:
                int[] iArr100 = this.getHighSpeedVideoFpsRanges;
                int i260 = this.getOutputMinFrameDuration;
                iArr100[i260] = 21;
                int i261 = i260 - 1;
                int i262 = iArr100[i261] + 21;
                iArr100[i261] = i262;
                this.getOutputMinFrameDuration = i260 + 1;
                iArr100[i260] = i262;
                return 0;
            case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                int[] iArr101 = this.getHighSpeedVideoFpsRanges;
                int i263 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i263 + 1;
                iArr101[i263] = 101;
                return 0;
            case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                java.lang.Object[] objArr81 = this.getHighSpeedVideoSizes;
                int i264 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i264 + 1;
                objArr81[i264] = null;
                int[] iArr102 = this.getHighSpeedVideoFpsRanges;
                objArr81[i264] = null;
                iArr102[i264] = objArr.length;
                this.getOutputMinFrameDuration = i264;
                objArr81[i264] = null;
                return 0;
            case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                int[] iArr103 = this.getHighSpeedVideoFpsRanges;
                int i265 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i265 + 1;
                iArr103[i265] = 65;
                return 0;
            case 171:
                int[] iArr104 = this.getHighSpeedVideoFpsRanges;
                int i266 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i266 + 1;
                iArr104[i266] = 72;
                return 0;
            case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                java.lang.Object[] objArr82 = this.getHighSpeedVideoSizes;
                int i267 = this.getOutputMinFrameDuration;
                objArr82[i267] = null;
                this.getOutputMinFrameDuration = i267;
                objArr82[i267] = null;
                objArr82[14] = null;
                return 0;
            case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                float[] fArr8 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i268 = this.getOutputMinFrameDuration;
                fArr8[i268] = 0.0f;
                this.getOutputMinFrameDuration = i268;
                int i269 = i268 - 1;
                this.getHighSpeedVideoFpsRanges[i269] = (fArr8[i269] > 0.0f ? 1 : (fArr8[i269] == 0.0f ? 0 : -1));
                return 0;
            case 174:
                int[] iArr105 = this.getHighSpeedVideoFpsRanges;
                int i270 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i270 + 1;
                iArr105[i270] = 176;
                return 0;
            case 175:
                long[] jArr4 = this.Camera2StreamConfigurationMap;
                int i271 = this.getOutputMinFrameDuration;
                jArr4[i271] = 0;
                int[] iArr106 = this.getHighSpeedVideoFpsRanges;
                int i272 = i271 - 1;
                int i273 = (jArr4[i272] > 0L ? 1 : (jArr4[i272] == 0L ? 0 : -1));
                iArr106[i272] = i273;
                this.getOutputMinFrameDuration = i272;
                int i274 = i271 - 2;
                iArr106[i274] = iArr106[i274] - i273;
                return 0;
            case 176:
                int i275 = this.getOutputMinFrameDuration;
                int i276 = i275 - 1;
                this.getOutputMinFrameDuration = i276;
                java.lang.Object[] objArr83 = this.getHighSpeedVideoSizes;
                java.lang.Object obj37 = objArr83[i276];
                objArr83[i276] = null;
                objArr83[15] = obj37;
                int[] iArr107 = this.getHighSpeedVideoFpsRanges;
                int i277 = i275 - 2;
                java.lang.Object obj38 = objArr83[i277];
                objArr83[i277] = null;
                iArr107[i277] = ((java.lang.Object[]) obj38).length;
                return 0;
            case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                int[] iArr108 = this.getHighSpeedVideoFpsRanges;
                int i278 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i278 + 1;
                iArr108[i278] = 5;
                return 0;
            case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE:
                java.lang.Object[] objArr84 = this.getHighSpeedVideoSizes;
                int i279 = this.getOutputMinFrameDuration;
                int i280 = i279 + 1;
                java.lang.Object obj39 = objArr84[15];
                objArr84[i279] = obj39;
                this.getHighSpeedVideoFpsRanges[i280] = 0;
                this.getOutputMinFrameDuration = i280;
                objArr84[i279] = null;
                objArr84[i279] = ((java.lang.Object[]) obj39)[0];
                return 0;
            case 179:
                java.lang.Object[] objArr85 = this.getHighSpeedVideoSizes;
                int i281 = this.getOutputMinFrameDuration;
                objArr85[i281] = objArr85[15];
                int[] iArr109 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i281 + 2;
                iArr109[i281 + 1] = 1;
                return 0;
            case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                int i282 = this.getOutputMinFrameDuration;
                int i283 = i282 - 1;
                java.lang.Object[] objArr86 = this.getHighSpeedVideoSizes;
                objArr86[i283] = null;
                this.getOutputMinFrameDuration = i282;
                objArr86[i283] = objArr86[15];
                return 0;
            case 181:
                int[] iArr110 = this.getHighSpeedVideoFpsRanges;
                int i284 = this.getOutputMinFrameDuration;
                iArr110[i284] = 2;
                this.getOutputMinFrameDuration = i284;
                java.lang.Object[] objArr87 = this.getHighSpeedVideoSizes;
                int i285 = i284 - 1;
                java.lang.Object obj40 = objArr87[i285];
                objArr87[i285] = null;
                objArr87[i285] = ((java.lang.Object[]) obj40)[2];
                return 0;
            case SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE:
                int i286 = this.getOutputMinFrameDuration;
                int i287 = i286 - 1;
                java.lang.Object[] objArr88 = this.getHighSpeedVideoSizes;
                java.lang.Object obj41 = objArr88[i287];
                objArr88[i287] = null;
                objArr88[16] = obj41;
                objArr88[i287] = objArr88[15];
                int[] iArr111 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i286 + 1;
                iArr111[i286] = 3;
                return 0;
            case 183:
                java.lang.Object[] objArr89 = this.getHighSpeedVideoSizes;
                int i288 = this.getOutputMinFrameDuration;
                objArr89[i288] = objArr89[15];
                int[] iArr112 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i288 + 2;
                iArr112[i288 + 1] = 4;
                return 0;
            case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                int i289 = this.getOutputMinFrameDuration;
                int i290 = i289 - 1;
                java.lang.Object[] objArr90 = this.getHighSpeedVideoSizes;
                java.lang.Object obj42 = objArr90[i290];
                objArr90[i290] = null;
                objArr90[15] = obj42;
                objArr90[i290] = objArr90[12];
                this.getOutputMinFrameDuration = i289 + 1;
                objArr90[i289] = objArr90[17];
                return 0;
            case 185:
                java.lang.Object[] objArr91 = this.getHighSpeedVideoSizes;
                int i291 = this.getOutputMinFrameDuration;
                objArr91[i291] = null;
                this.getOutputMinFrameDuration = i291 + 2;
                objArr91[i291 + 1] = objArr91[16];
                return 0;
            case 186:
                int i292 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i292;
                java.lang.Object[] objArr92 = this.getHighSpeedVideoSizes;
                java.lang.Object obj43 = objArr92[i292];
                objArr92[i292] = null;
                objArr92[15] = obj43;
                return 0;
            case 187:
                java.lang.Object[] objArr93 = this.getHighSpeedVideoSizes;
                int i293 = this.getOutputMinFrameDuration;
                objArr93[i293] = objArr93[13];
                this.getOutputMinFrameDuration = i293 + 2;
                objArr93[i293 + 1] = objArr93[15];
                return 0;
            case 188:
                int[] iArr113 = this.getHighSpeedVideoFpsRanges;
                int i294 = this.getOutputMinFrameDuration;
                iArr113[i294] = 27;
                this.getOutputMinFrameDuration = i294;
                int i295 = i294 - 1;
                iArr113[i295] = iArr113[i295] + 27;
                return 0;
            case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                int[] iArr114 = this.getHighSpeedVideoFpsRanges;
                int i296 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i296 + 1;
                iArr114[i296] = 51;
                return 0;
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                java.lang.Object[] objArr94 = this.getHighSpeedVideoSizes;
                int i297 = this.getOutputMinFrameDuration;
                objArr94[i297] = objArr94[14];
                int[] iArr115 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i297 + 2;
                iArr115[i297 + 1] = 301;
                return 0;
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                java.lang.Object[] objArr95 = this.getHighSpeedVideoSizes;
                int i298 = this.getOutputMinFrameDuration;
                objArr95[i298] = objArr95[15];
                int[] iArr116 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i298 + 2;
                iArr116[i298 + 1] = 302;
                return 0;
            case 192:
                java.lang.Object[] objArr96 = this.getHighSpeedVideoSizes;
                int i299 = this.getOutputMinFrameDuration;
                objArr96[i299] = objArr96[12];
                this.getOutputMinFrameDuration = i299 + 2;
                objArr96[i299 + 1] = objArr96[16];
                return 0;
            case 193:
                int[] iArr117 = this.getHighSpeedVideoFpsRanges;
                int i300 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i300 + 1;
                iArr117[i300] = 303;
                return 0;
            case SDK_ASSET_ICON_EXTERNAL_VALUE:
                java.lang.Object[] objArr97 = this.getHighSpeedVideoSizes;
                int i301 = this.getOutputMinFrameDuration;
                objArr97[i301] = objArr97[12];
                this.getOutputMinFrameDuration = i301 + 2;
                objArr97[i301 + 1] = objArr97[13];
                return 0;
            case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
                java.lang.Object[] objArr98 = this.getHighSpeedVideoSizes;
                int i302 = this.getOutputMinFrameDuration;
                objArr98[i302] = objArr98[14];
                this.getOutputMinFrameDuration = i302 + 2;
                objArr98[i302 + 1] = objArr98[18];
                return 0;
            case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                int i303 = this.getOutputMinFrameDuration;
                int i304 = i303 - 1;
                java.lang.Object[] objArr99 = this.getHighSpeedVideoSizes;
                java.lang.Object obj44 = objArr99[i304];
                objArr99[i304] = null;
                objArr99[17] = obj44;
                objArr99[i304] = objArr99[13];
                this.getOutputMinFrameDuration = i303 + 1;
                objArr99[i303] = objArr99[15];
                return 0;
            case 197:
                int[] iArr118 = this.getHighSpeedVideoFpsRanges;
                int i305 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i305 + 1;
                iArr118[i305] = 57;
                return 0;
            case SDK_ASSET_ICON_ARROW_UP_VALUE:
                int[] iArr119 = this.getHighSpeedVideoFpsRanges;
                int i306 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i306 + 1;
                iArr119[i306] = 99;
                return 0;
            case 199:
                int[] iArr120 = this.getHighSpeedVideoFpsRanges;
                int i307 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i307 + 1;
                iArr120[i307] = 301;
                return 0;
            case 200:
                int[] iArr121 = this.getHighSpeedVideoFpsRanges;
                int i308 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i308 + 1;
                iArr121[i308] = 302;
                return 0;
            case 201:
                java.lang.Object[] objArr100 = this.getHighSpeedVideoSizes;
                int i309 = this.getOutputMinFrameDuration;
                objArr100[i309] = objArr100[12];
                objArr100[i309 + 1] = objArr100[16];
                int[] iArr122 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i309 + 3;
                iArr122[i309 + 2] = 303;
                return 0;
            case 202:
                java.lang.Object[] objArr101 = this.getHighSpeedVideoSizes;
                int i310 = this.getOutputMinFrameDuration;
                objArr101[i310] = objArr101[15];
                objArr101[i310 + 1] = objArr101[16];
                this.getOutputMinFrameDuration = i310 + 3;
                objArr101[i310 + 2] = objArr101[14];
                return 0;
            case 203:
                int[] iArr123 = this.getHighSpeedVideoFpsRanges;
                int i311 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i311 + 1;
                iArr123[i311] = 5;
                return 0;
            case 204:
                java.lang.Object[] objArr102 = this.getHighSpeedVideoSizes;
                int i312 = this.getOutputMinFrameDuration;
                objArr102[i312] = objArr102[14];
                this.getOutputMinFrameDuration = i312 + 2;
                objArr102[i312 + 1] = objArr102[17];
                return 0;
            case 205:
                int i313 = this.getOutputMinFrameDuration;
                int i314 = i313 - 1;
                java.lang.Object[] objArr103 = this.getHighSpeedVideoSizes;
                java.lang.Object obj45 = objArr103[i314];
                objArr103[i314] = null;
                objArr103[14] = obj45;
                objArr103[i314] = objArr103[12];
                this.getOutputMinFrameDuration = i313 + 1;
                objArr103[i313] = objArr103[14];
                return 0;
            case 206:
                int i315 = this.getOutputMinFrameDuration;
                int i316 = i315 - 1;
                this.getOutputMinFrameDuration = i316;
                int[] iArr124 = this.getHighSpeedVideoFpsRanges;
                int i317 = i315 - 2;
                iArr124[i317] = iArr124[i317] / iArr124[i316];
                int i318 = i315 - 2;
                this.getOutputMinFrameDuration = i318;
                this.getHighSpeedVideoSizes[i318] = null;
                return 0;
            case 207:
                int[] iArr125 = this.getHighSpeedVideoFpsRanges;
                int i319 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i319 + 1;
                iArr125[i319] = 52;
                return 0;
            case SDK_ASSET_ICON_INCOME_VALUE:
                java.lang.Object[] objArr104 = this.getHighSpeedVideoSizes;
                int i320 = this.getOutputMinFrameDuration;
                objArr104[i320] = objArr104[12];
                objArr104[i320 + 1] = objArr104[14];
                int[] iArr126 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i320 + 3;
                iArr126[i320 + 2] = 305;
                return 0;
            case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                java.lang.Object[] objArr105 = this.getHighSpeedVideoSizes;
                int i321 = this.getOutputMinFrameDuration;
                objArr105[i321] = objArr105[12];
                objArr105[i321 + 1] = objArr105[15];
                int[] iArr127 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i321 + 3;
                iArr127[i321 + 2] = 306;
                return 0;
            case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                java.lang.Object[] objArr106 = this.getHighSpeedVideoSizes;
                int i322 = this.getOutputMinFrameDuration;
                objArr106[i322] = objArr106[13];
                this.getOutputMinFrameDuration = i322 + 2;
                objArr106[i322 + 1] = objArr106[16];
                return 0;
            case 211:
                java.lang.Object[] objArr107 = this.getHighSpeedVideoSizes;
                int i323 = this.getOutputMinFrameDuration;
                objArr107[i323] = objArr107[12];
                objArr107[i323 + 1] = objArr107[13];
                this.getOutputMinFrameDuration = i323 + 3;
                objArr107[i323 + 2] = objArr107[14];
                return 0;
            case SDK_ASSET_ICON_OVERRIDE_VALUE:
                java.lang.Object[] objArr108 = this.getHighSpeedVideoSizes;
                int i324 = this.getOutputMinFrameDuration;
                objArr108[i324] = objArr108[15];
                this.getOutputMinFrameDuration = i324 + 2;
                objArr108[i324 + 1] = objArr108[16];
                return 0;
            case SDK_ASSET_ICON_PAUSE_VALUE:
                int[] iArr128 = this.getHighSpeedVideoFpsRanges;
                int i325 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i325 + 1;
                iArr128[i325] = 27;
                return 0;
            case SDK_ASSET_ICON_PIN_VALUE:
                int[] iArr129 = this.getHighSpeedVideoFpsRanges;
                int i326 = this.getOutputMinFrameDuration;
                java.lang.Object[] objArr109 = this.getHighSpeedVideoSizes;
                int i327 = i326 - 1;
                java.lang.Object obj46 = objArr109[i327];
                objArr109[i327] = null;
                iArr129[i327] = ((int[]) obj46).length;
                int i328 = i326 - 1;
                this.getOutputMinFrameDuration = i328;
                objArr109[i328] = null;
                return 0;
            case 215:
                int[] iArr130 = this.getHighSpeedVideoFpsRanges;
                int i329 = this.getOutputMinFrameDuration;
                iArr130[i329] = 107;
                int i330 = i329 - 1;
                int i331 = iArr130[i330] + 107;
                iArr130[i330] = i331;
                this.getOutputMinFrameDuration = i329 + 1;
                iArr130[i329] = i331;
                return 0;
            case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
                int[] iArr131 = this.getHighSpeedVideoFpsRanges;
                int i332 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i332 + 1;
                iArr131[i332] = 36;
                return 0;
            case SDK_ASSET_ICON_PROGRESS_VALUE:
                int[] iArr132 = this.getHighSpeedVideoFpsRanges;
                int i333 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i333 + 1;
                iArr132[i333] = 12;
                return 0;
            case SDK_ASSET_ICON_QUESTION_VALUE:
                int[] iArr133 = this.getHighSpeedVideoFpsRanges;
                int i334 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i334 + 1;
                iArr133[i334] = 66;
                return 0;
            case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                int[] iArr134 = this.getHighSpeedVideoFpsRanges;
                int i335 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i335 + 1;
                iArr134[i335] = 306;
                return 0;
            case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                java.lang.Object[] objArr110 = this.getHighSpeedVideoSizes;
                int i336 = this.getOutputMinFrameDuration;
                java.lang.Object obj47 = objArr110[i336 - 1];
                objArr110[i336] = obj47;
                this.getOutputMinFrameDuration = i336;
                objArr110[i336] = null;
                objArr110[16] = obj47;
                return 0;
            case SDK_ASSET_ICON_SUBMIT_VALUE:
                java.lang.Object[] objArr111 = this.getHighSpeedVideoSizes;
                int i337 = this.getOutputMinFrameDuration;
                objArr111[i337] = objArr111[13];
                objArr111[i337 + 1] = objArr111[14];
                this.getOutputMinFrameDuration = i337 + 3;
                objArr111[i337 + 2] = objArr111[16];
                return 0;
            case SDK_ASSET_ICON_SUBTRACT_VALUE:
                java.lang.Object[] objArr112 = this.getHighSpeedVideoSizes;
                int i338 = this.getOutputMinFrameDuration;
                objArr112[i338] = objArr112[12];
                this.getOutputMinFrameDuration = i338 + 2;
                objArr112[i338 + 1] = objArr112[14];
                return 0;
            case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                int[] iArr135 = this.getHighSpeedVideoFpsRanges;
                int i339 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i339 + 1;
                iArr135[i339] = 23;
                return 0;
            case 224:
                int[] iArr136 = this.getHighSpeedVideoFpsRanges;
                int i340 = this.getOutputMinFrameDuration;
                iArr136[i340] = 49;
                this.getOutputMinFrameDuration = i340;
                int i341 = i340 - 1;
                iArr136[i341] = iArr136[i341] + 49;
                return 0;
            case 225:
                java.lang.Object[] objArr113 = this.getHighSpeedVideoSizes;
                int i342 = this.getOutputMinFrameDuration;
                objArr113[i342] = objArr113[12];
                objArr113[i342 + 1] = objArr113[14];
                int[] iArr137 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i342 + 3;
                iArr137[i342 + 2] = 311;
                return 0;
            case 226:
                int[] iArr138 = this.getHighSpeedVideoFpsRanges;
                int i343 = this.getOutputMinFrameDuration;
                iArr138[i343] = 29;
                int i344 = i343 - 1;
                int i345 = iArr138[i344] + 29;
                iArr138[i344] = i345;
                this.getOutputMinFrameDuration = i343 + 1;
                iArr138[i343] = i345;
                return 0;
            case 227:
                int[] iArr139 = this.getHighSpeedVideoFpsRanges;
                int i346 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i346 + 1;
                iArr139[i346] = 4;
                return 0;
            case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                int[] iArr140 = this.getHighSpeedVideoFpsRanges;
                int i347 = this.getOutputMinFrameDuration;
                iArr140[i347] = 4;
                this.getOutputMinFrameDuration = i347;
                int i348 = i347 - 1;
                iArr140[i348] = iArr140[i348] << 4;
                return 0;
            case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                int[] iArr141 = this.getHighSpeedVideoFpsRanges;
                int i349 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i349 + 1;
                iArr141[i349] = 53;
                return 0;
            case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                int[] iArr142 = this.getHighSpeedVideoFpsRanges;
                int i350 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i350 + 1;
                iArr142[i350] = 256;
                return 0;
            case 231:
                int i351 = this.getOutputMinFrameDuration;
                int i352 = i351 - 1;
                java.lang.Object[] objArr114 = this.getHighSpeedVideoSizes;
                java.lang.Object obj48 = objArr114[i352];
                objArr114[i352] = null;
                objArr114[15] = obj48;
                this.getOutputMinFrameDuration = i351;
                objArr114[i352] = objArr114[13];
                return 0;
            case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                int[] iArr143 = this.getHighSpeedVideoFpsRanges;
                int i353 = this.getOutputMinFrameDuration;
                iArr143[i353] = 7;
                this.getOutputMinFrameDuration = i353;
                int i354 = i353 - 1;
                iArr143[i354] = iArr143[i354] + 7;
                return 0;
            case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                int[] iArr144 = this.getHighSpeedVideoFpsRanges;
                int i355 = this.getOutputMinFrameDuration;
                iArr144[i355] = 93;
                int i356 = i355 - 1;
                int i357 = iArr144[i356] + 93;
                iArr144[i356] = i357;
                this.getOutputMinFrameDuration = i355 + 1;
                iArr144[i355] = i357;
                return 0;
            case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                int i358 = this.getOutputMinFrameDuration;
                int[] iArr145 = this.getHighSpeedVideoFpsRanges;
                int i359 = i358 - 2;
                iArr145[i359] = iArr145[i359] >> iArr145[i358 - 1];
                int i360 = i358 - 2;
                this.getOutputMinFrameDuration = i360;
                this.getHighSpeedVideoSizes[i360] = null;
                return 0;
            case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                java.lang.Object[] objArr115 = this.getHighSpeedVideoSizes;
                int i361 = this.getOutputMinFrameDuration;
                objArr115[i361] = null;
                objArr115[i361] = null;
                objArr115[21] = null;
                int[] iArr146 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i361 + 1;
                iArr146[i361] = 0;
                return 0;
            case 236:
                java.lang.Object[] objArr116 = this.getHighSpeedVideoSizes;
                int i362 = this.getOutputMinFrameDuration;
                objArr116[i362] = null;
                objArr116[i362] = null;
                objArr116[25] = null;
                int[] iArr147 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i362 + 1;
                iArr147[i362] = 0;
                return 0;
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                int i363 = this.getOutputMinFrameDuration;
                int i364 = i363 - 1;
                int[] iArr148 = this.getHighSpeedVideoFpsRanges;
                iArr148[26] = iArr148[i364];
                java.lang.Object[] objArr117 = this.getHighSpeedVideoSizes;
                objArr117[i364] = objArr117[12];
                this.getOutputMinFrameDuration = i363 + 1;
                objArr117[i363] = objArr117[15];
                return 0;
            case 238:
                int[] iArr149 = this.getHighSpeedVideoFpsRanges;
                int i365 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i365 + 1;
                iArr149[i365] = 328;
                return 0;
            case 239:
                java.lang.Object[] objArr118 = this.getHighSpeedVideoSizes;
                int i366 = this.getOutputMinFrameDuration;
                objArr118[i366] = objArr118[17];
                int[] iArr150 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i366 + 2;
                iArr150[i366 + 1] = 331;
                return 0;
            case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE:
                int[] iArr151 = this.getHighSpeedVideoFpsRanges;
                int i367 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i367 + 1;
                iArr151[i367] = 333;
                return 0;
            case 241:
                java.lang.Object[] objArr119 = this.getHighSpeedVideoSizes;
                int i368 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i368 + 1;
                objArr119[i368] = objArr119[27];
                return 0;
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                java.lang.Object[] objArr120 = this.getHighSpeedVideoSizes;
                int i369 = this.getOutputMinFrameDuration;
                objArr120[i369] = objArr120[13];
                objArr120[i369 + 1] = objArr120[15];
                this.getOutputMinFrameDuration = i369 + 3;
                objArr120[i369 + 2] = objArr120[22];
                return 0;
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                int i370 = this.getOutputMinFrameDuration;
                int i371 = i370 - 1;
                java.lang.Object[] objArr121 = this.getHighSpeedVideoSizes;
                java.lang.Object obj49 = objArr121[i371];
                objArr121[i371] = null;
                objArr121[27] = obj49;
                this.getOutputMinFrameDuration = i370;
                objArr121[i371] = objArr121[16];
                return 0;
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                int i372 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i372;
                this.valueOf = this.getHighSpeedVideoFpsRanges[i372] <= 0 ? 0 : 1;
                return 0;
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE:
                java.lang.Object[] objArr122 = this.getHighSpeedVideoSizes;
                int i373 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i373 + 1;
                java.lang.Object obj50 = objArr122[16];
                objArr122[i373] = obj50;
                int[] iArr152 = this.getHighSpeedVideoFpsRanges;
                objArr122[i373] = null;
                iArr152[i373] = ((byte[]) obj50).length;
                return 0;
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE:
                java.lang.Object[] objArr123 = this.getHighSpeedVideoSizes;
                int i374 = this.getOutputMinFrameDuration;
                int i375 = i374 + 1;
                this.getOutputMinFrameDuration = i375;
                java.lang.Object obj51 = objArr123[25];
                objArr123[i374] = obj51;
                int[] iArr153 = this.getHighSpeedVideoFpsRanges;
                objArr123[i374] = null;
                iArr153[i374] = ((byte[]) obj51).length;
                this.getOutputMinFrameDuration = i374 + 2;
                iArr153[i375] = 3;
                return 0;
            case 247:
                int i376 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i376;
                int[] iArr154 = this.getHighSpeedVideoFpsRanges;
                iArr154[26] = iArr154[i376];
                return 0;
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                java.lang.Object[] objArr124 = this.getHighSpeedVideoSizes;
                int i377 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i377 + 1;
                objArr124[i377] = objArr124[20];
                return 0;
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE:
                java.lang.Object[] objArr125 = this.getHighSpeedVideoSizes;
                int i378 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i378 + 1;
                java.lang.Object obj52 = objArr125[20];
                objArr125[i378] = obj52;
                int[] iArr155 = this.getHighSpeedVideoFpsRanges;
                objArr125[i378] = null;
                iArr155[i378] = ((byte[]) obj52).length;
                return 0;
            case 250:
                java.lang.Object[] objArr126 = this.getHighSpeedVideoSizes;
                int i379 = this.getOutputMinFrameDuration;
                objArr126[i379] = objArr126[13];
                this.getOutputMinFrameDuration = i379 + 2;
                objArr126[i379 + 1] = objArr126[18];
                return 0;
            case 251:
                int i380 = this.getOutputMinFrameDuration;
                int i381 = i380 - 1;
                java.lang.Object[] objArr127 = this.getHighSpeedVideoSizes;
                objArr127[i381] = null;
                objArr127[i381] = objArr127[21];
                int[] iArr156 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i380 + 1;
                iArr156[i380] = 0;
                return 0;
            case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE:
                int[] iArr157 = this.getHighSpeedVideoFpsRanges;
                int i382 = this.getOutputMinFrameDuration;
                iArr157[i382] = iArr157[26];
                java.lang.Object[] objArr128 = this.getHighSpeedVideoSizes;
                this.getOutputMinFrameDuration = i382 + 2;
                objArr128[i382 + 1] = objArr128[21];
                return 0;
            case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE:
                int[] iArr158 = this.getHighSpeedVideoFpsRanges;
                int i383 = this.getOutputMinFrameDuration;
                iArr158[i383] = 3;
                this.getOutputMinFrameDuration = i383;
                int i384 = i383 - 1;
                iArr158[i384] = iArr158[i384] + 3;
                return 0;
            case SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE:
                int i385 = this.getOutputMinFrameDuration;
                int i386 = i385 - 1;
                java.lang.Object[] objArr129 = this.getHighSpeedVideoSizes;
                java.lang.Object obj53 = objArr129[i386];
                objArr129[i386] = null;
                objArr129[14] = obj53;
                this.getOutputMinFrameDuration = i385;
                objArr129[i386] = objArr129[13];
                return 0;
            case 255:
                java.lang.Object[] objArr130 = this.getHighSpeedVideoSizes;
                int i387 = this.getOutputMinFrameDuration;
                objArr130[i387] = objArr130[17];
                this.getOutputMinFrameDuration = i387 + 2;
                objArr130[i387 + 1] = objArr130[19];
                return 0;
            case 256:
                int i388 = this.getOutputMinFrameDuration;
                int i389 = i388 - 1;
                java.lang.Object[] objArr131 = this.getHighSpeedVideoSizes;
                java.lang.Object obj54 = objArr131[i389];
                objArr131[i389] = null;
                objArr131[14] = obj54;
                int[] iArr159 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i388;
                iArr159[i389] = 3;
                return 0;
            case 257:
                java.lang.Object[] objArr132 = this.getHighSpeedVideoSizes;
                int i390 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i390 + 1;
                java.lang.Object obj55 = objArr132[14];
                objArr132[i390] = obj55;
                int[] iArr160 = this.getHighSpeedVideoFpsRanges;
                objArr132[i390] = null;
                iArr160[i390] = ((byte[]) obj55).length;
                return 0;
            case 258:
                int[] iArr161 = this.getHighSpeedVideoFpsRanges;
                int i391 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i391 + 1;
                iArr161[i391] = iArr161[26];
                return 0;
            case 259:
                int i392 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i392;
                java.lang.Object[] objArr133 = this.getHighSpeedVideoSizes;
                java.lang.Object obj56 = objArr133[i392];
                objArr133[i392] = null;
                objArr133[13] = obj56;
                return 0;
            case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                java.lang.Object[] objArr134 = this.getHighSpeedVideoSizes;
                int i393 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i393 + 1;
                objArr134[i393] = objArr134[25];
                return 0;
            case SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE:
                int[] iArr162 = this.getHighSpeedVideoFpsRanges;
                int i394 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i394 + 1;
                iArr162[i394] = iArr162[24];
                return 0;
            case SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE:
                java.lang.Object[] objArr135 = this.getHighSpeedVideoSizes;
                int i395 = this.getOutputMinFrameDuration;
                objArr135[i395] = objArr135[21];
                int[] iArr163 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i395 + 2;
                iArr163[i395 + 1] = iArr163[24];
                return 0;
            case 263:
                int[] iArr164 = this.getHighSpeedVideoFpsRanges;
                int i396 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i396 + 1;
                iArr164[i396] = 3;
                return 0;
            case SDK_ASSET_ICON_PLAID_LOGO_VALUE:
                int[] iArr165 = this.getHighSpeedVideoFpsRanges;
                int i397 = this.getOutputMinFrameDuration;
                iArr165[i397] = 63;
                int i398 = i397 - 1;
                int i399 = iArr165[i398] + 63;
                iArr165[i398] = i399;
                this.getOutputMinFrameDuration = i397 + 1;
                iArr165[i397] = i399;
                return 0;
            case SDK_ASSET_HEADER_SHIELD_VALUE:
                int[] iArr166 = this.getHighSpeedVideoFpsRanges;
                int i400 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i400 + 1;
                iArr166[i400] = 86;
                return 0;
            case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                int i401 = this.getOutputMinFrameDuration;
                int i402 = i401 - 1;
                int[] iArr167 = this.getHighSpeedVideoFpsRanges;
                iArr167[23] = iArr167[i402];
                java.lang.Object[] objArr136 = this.getHighSpeedVideoSizes;
                this.getOutputMinFrameDuration = i401;
                objArr136[i402] = null;
                return 0;
            case SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE:
                int i403 = this.getOutputMinFrameDuration;
                int i404 = i403 - 1;
                java.lang.Object[] objArr137 = this.getHighSpeedVideoSizes;
                java.lang.Object obj57 = objArr137[i404];
                objArr137[i404] = null;
                objArr137[24] = obj57;
                int[] iArr168 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i403;
                iArr168[i404] = 0;
                return 0;
            case SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE:
                int i405 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i405;
                int[] iArr169 = this.getHighSpeedVideoFpsRanges;
                iArr169[25] = iArr169[i405];
                return 0;
            case 269:
                java.lang.Object[] objArr138 = this.getHighSpeedVideoSizes;
                int i406 = this.getOutputMinFrameDuration;
                objArr138[i406] = objArr138[12];
                this.getOutputMinFrameDuration = i406 + 2;
                objArr138[i406 + 1] = objArr138[17];
                return 0;
            case 270:
                int[] iArr170 = this.getHighSpeedVideoFpsRanges;
                int i407 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i407 + 1;
                iArr170[i407] = 331;
                return 0;
            case SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE:
                java.lang.Object[] objArr139 = this.getHighSpeedVideoSizes;
                int i408 = this.getOutputMinFrameDuration;
                objArr139[i408] = objArr139[12];
                objArr139[i408 + 1] = objArr139[19];
                int[] iArr171 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i408 + 3;
                iArr171[i408 + 2] = 333;
                return 0;
            case SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE:
                java.lang.Object[] objArr140 = this.getHighSpeedVideoSizes;
                int i409 = this.getOutputMinFrameDuration;
                objArr140[i409] = objArr140[13];
                this.getOutputMinFrameDuration = i409 + 2;
                objArr140[i409 + 1] = objArr140[22];
                return 0;
            case SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE:
                int i410 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i410;
                java.lang.Object[] objArr141 = this.getHighSpeedVideoSizes;
                java.lang.Object obj58 = objArr141[i410];
                objArr141[i410] = null;
                objArr141[22] = obj58;
                return 0;
            case SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE:
                java.lang.Object[] objArr142 = this.getHighSpeedVideoSizes;
                int i411 = this.getOutputMinFrameDuration;
                objArr142[i411] = objArr142[13];
                objArr142[i411 + 1] = objArr142[15];
                this.getOutputMinFrameDuration = i411 + 3;
                objArr142[i411 + 2] = objArr142[26];
                return 0;
            case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE:
                int i412 = this.getOutputMinFrameDuration;
                int i413 = i412 - 1;
                java.lang.Object[] objArr143 = this.getHighSpeedVideoSizes;
                java.lang.Object obj59 = objArr143[i413];
                objArr143[i413] = null;
                objArr143[15] = obj59;
                objArr143[i413] = objArr143[12];
                this.getOutputMinFrameDuration = i412 + 1;
                objArr143[i412] = objArr143[15];
                return 0;
            case SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE:
                java.lang.Object[] objArr144 = this.getHighSpeedVideoSizes;
                int i414 = this.getOutputMinFrameDuration;
                objArr144[i414] = objArr144[12];
                this.getOutputMinFrameDuration = i414 + 2;
                objArr144[i414 + 1] = objArr144[20];
                return 0;
            case SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE:
                int i415 = this.getOutputMinFrameDuration;
                int i416 = i415 - 1;
                java.lang.Object[] objArr145 = this.getHighSpeedVideoSizes;
                java.lang.Object obj60 = objArr145[i416];
                objArr145[i416] = null;
                objArr145[20] = obj60;
                this.getOutputMinFrameDuration = i415;
                objArr145[i416] = objArr145[16];
                return 0;
            case SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE:
                java.lang.Object[] objArr146 = this.getHighSpeedVideoSizes;
                int i417 = this.getOutputMinFrameDuration;
                objArr146[i417] = objArr146[16];
                this.getOutputMinFrameDuration = i417 + 2;
                objArr146[i417 + 1] = objArr146[15];
                return 0;
            case SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE:
                java.lang.Object[] objArr147 = this.getHighSpeedVideoSizes;
                int i418 = this.getOutputMinFrameDuration;
                int i419 = i418 + 1;
                this.getOutputMinFrameDuration = i419;
                java.lang.Object obj61 = objArr147[24];
                objArr147[i418] = obj61;
                int[] iArr172 = this.getHighSpeedVideoFpsRanges;
                objArr147[i418] = null;
                iArr172[i418] = ((byte[]) obj61).length;
                this.getOutputMinFrameDuration = i418 + 2;
                iArr172[i419] = 3;
                return 0;
            case SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE:
                int i420 = this.getOutputMinFrameDuration;
                int[] iArr173 = this.getHighSpeedVideoFpsRanges;
                int i421 = i420 - 2;
                int i422 = iArr173[i421] + iArr173[i420 - 1];
                iArr173[i421] = i422;
                int i423 = i420 - 3;
                iArr173[i423] = iArr173[i423] + i422;
                int i424 = i420 - 3;
                this.getOutputMinFrameDuration = i424;
                iArr173[25] = iArr173[i424];
                return 0;
            case SDK_ASSET_ILLUSTRATION_BANK_VALUE:
                java.lang.Object[] objArr148 = this.getHighSpeedVideoSizes;
                int i425 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i425 + 1;
                java.lang.Object obj62 = objArr148[18];
                objArr148[i425] = obj62;
                int[] iArr174 = this.getHighSpeedVideoFpsRanges;
                objArr148[i425] = null;
                iArr174[i425] = ((byte[]) obj62).length;
                return 0;
            case 282:
                java.lang.Object[] objArr149 = this.getHighSpeedVideoSizes;
                int i426 = this.getOutputMinFrameDuration;
                objArr149[i426] = objArr149[20];
                this.getOutputMinFrameDuration = i426 + 2;
                objArr149[i426 + 1] = objArr149[14];
                return 0;
            case 283:
                int i427 = this.getOutputMinFrameDuration;
                int i428 = i427 - 1;
                this.getHighSpeedVideoSizes[i428] = null;
                float[] fArr9 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputMinFrameDuration = i427;
                fArr9[i428] = 0.0f;
                return 0;
            case SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE:
                java.lang.Object[] objArr150 = this.getHighSpeedVideoSizes;
                int i429 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i429 + 1;
                java.lang.Object obj63 = objArr150[21];
                objArr150[i429] = obj63;
                int[] iArr175 = this.getHighSpeedVideoFpsRanges;
                objArr150[i429] = null;
                iArr175[i429] = ((byte[]) obj63).length;
                return 0;
            case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE:
                int i430 = this.getOutputMinFrameDuration;
                int i431 = i430 - 1;
                this.getHighSpeedVideoSizes[i431] = null;
                int[] iArr176 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i430;
                iArr176[i431] = iArr176[25];
                return 0;
            case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE:
                java.lang.Object[] objArr151 = this.getHighSpeedVideoSizes;
                int i432 = this.getOutputMinFrameDuration;
                int i433 = i432 + 1;
                this.getOutputMinFrameDuration = i433;
                java.lang.Object obj64 = objArr151[21];
                objArr151[i432] = obj64;
                int[] iArr177 = this.getHighSpeedVideoFpsRanges;
                objArr151[i432] = null;
                iArr177[i432] = ((byte[]) obj64).length;
                this.getOutputMinFrameDuration = i432 + 2;
                iArr177[i433] = 3;
                return 0;
            case SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE:
                int i434 = this.getOutputMinFrameDuration;
                int[] iArr178 = this.getHighSpeedVideoFpsRanges;
                int i435 = i434 - 2;
                int i436 = iArr178[i435] + iArr178[i434 - 1];
                iArr178[i435] = i436;
                this.getOutputMinFrameDuration = i435;
                int i437 = i434 - 3;
                iArr178[i437] = iArr178[i437] + i436;
                return 0;
            case SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE:
                int[] iArr179 = this.getHighSpeedVideoFpsRanges;
                int i438 = this.getOutputMinFrameDuration;
                iArr179[i438] = 3;
                java.lang.Object[] objArr152 = this.getHighSpeedVideoSizes;
                this.getOutputMinFrameDuration = i438 + 2;
                objArr152[i438 + 1] = objArr152[14];
                return 0;
            case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE:
                int[] iArr180 = this.getHighSpeedVideoFpsRanges;
                int i439 = this.getOutputMinFrameDuration;
                java.lang.Object[] objArr153 = this.getHighSpeedVideoSizes;
                int i440 = i439 - 1;
                java.lang.Object obj65 = objArr153[i440];
                objArr153[i440] = null;
                int length = ((byte[]) obj65).length;
                iArr180[i440] = length;
                this.getOutputMinFrameDuration = i440;
                int i441 = i439 - 2;
                iArr180[i441] = iArr180[i441] + length;
                return 0;
            case SDK_ASSET_ILLUSTRATION_NOTE_VALUE:
                int[] iArr181 = this.getHighSpeedVideoFpsRanges;
                int i442 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i442 + 1;
                iArr181[i442] = iArr181[25];
                return 0;
            case SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE:
                int i443 = this.getOutputMinFrameDuration;
                int i444 = i443 - 1;
                this.getOutputMinFrameDuration = i444;
                int[] iArr182 = this.getHighSpeedVideoFpsRanges;
                int i445 = i443 - 2;
                int i446 = iArr182[i445] + iArr182[i444];
                iArr182[i445] = i446;
                java.lang.Object[] objArr154 = this.getHighSpeedVideoSizes;
                objArr154[i445] = new byte[i446];
                int i447 = i443 - 2;
                this.getOutputMinFrameDuration = i447;
                java.lang.Object obj66 = objArr154[i447];
                objArr154[i447] = null;
                objArr154[13] = obj66;
                return 0;
            case SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE:
                java.lang.Object[] objArr155 = this.getHighSpeedVideoSizes;
                int i448 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i448 + 1;
                objArr155[i448] = objArr155[24];
                return 0;
            case SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE:
                java.lang.Object[] objArr156 = this.getHighSpeedVideoSizes;
                int i449 = this.getOutputMinFrameDuration;
                objArr156[i449] = objArr156[13];
                int[] iArr183 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i449 + 2;
                iArr183[i449 + 1] = 0;
                return 0;
            case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE:
                java.lang.Object[] objArr157 = this.getHighSpeedVideoSizes;
                int i450 = this.getOutputMinFrameDuration;
                objArr157[i450] = objArr157[24];
                int[] iArr184 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i450 + 2;
                iArr184[i450 + 1] = 0;
                return 0;
            case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE:
                int i451 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i451;
                int[] iArr185 = this.getHighSpeedVideoFpsRanges;
                iArr185[23] = iArr185[i451];
                return 0;
            case SDK_ASSET_LOADING_INDICATOR_VALUE:
                java.lang.Object[] objArr158 = this.getHighSpeedVideoSizes;
                int i452 = this.getOutputMinFrameDuration;
                objArr158[i452] = objArr158[13];
                this.getHighSpeedVideoFpsRanges[i452 + 1] = 1;
                this.getOutputMinFrameDuration = i452 + 3;
                objArr158[i452 + 2] = objArr158[14];
                return 0;
            case SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE:
                int[] iArr186 = this.getHighSpeedVideoFpsRanges;
                int i453 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i453 + 1;
                iArr186[i453] = iArr186[23];
                return 0;
            case SDK_ASSET_BANK_ICON_CIRCLE_VALUE:
                java.lang.Object[] objArr159 = this.getHighSpeedVideoSizes;
                int i454 = this.getOutputMinFrameDuration;
                objArr159[i454] = objArr159[13];
                this.getHighSpeedVideoFpsRanges[i454 + 1] = 2;
                this.getOutputMinFrameDuration = i454 + 3;
                objArr159[i454 + 2] = objArr159[21];
                return 0;
            case 299:
                int[] iArr187 = this.getHighSpeedVideoFpsRanges;
                int i455 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i455 + 1;
                iArr187[i455] = 19;
                return 0;
            case 300:
                int[] iArr188 = this.getHighSpeedVideoFpsRanges;
                int i456 = this.getOutputMinFrameDuration;
                iArr188[i456] = 79;
                int i457 = i456 - 1;
                int i458 = iArr188[i457] + 79;
                iArr188[i457] = i458;
                this.getOutputMinFrameDuration = i456 + 1;
                iArr188[i456] = i458;
                return 0;
            case 301:
                int[] iArr189 = this.getHighSpeedVideoFpsRanges;
                int i459 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i459 + 1;
                iArr189[i459] = 97;
                return 0;
            case 302:
                int[] iArr190 = this.getHighSpeedVideoFpsRanges;
                int i460 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i460 + 1;
                iArr190[i460] = 81;
                return 0;
            case 303:
                int[] iArr191 = this.getHighSpeedVideoFpsRanges;
                int i461 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i461 + 1;
                iArr191[i461] = 46;
                return 0;
            case 304:
                int i462 = this.getOutputMinFrameDuration;
                int i463 = i462 - 1;
                java.lang.Object[] objArr160 = this.getHighSpeedVideoSizes;
                objArr160[i463] = null;
                objArr160[i463] = objArr160[14];
                int[] iArr192 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i462 + 1;
                iArr192[i462] = 0;
                return 0;
            case 305:
                java.lang.Object[] objArr161 = this.getHighSpeedVideoSizes;
                int i464 = this.getOutputMinFrameDuration;
                objArr161[i464] = objArr161[12];
                objArr161[i464 + 1] = objArr161[14];
                this.getOutputMinFrameDuration = i464 + 3;
                objArr161[i464 + 2] = objArr161[15];
                return 0;
            case 306:
                java.lang.Object[] objArr162 = this.getHighSpeedVideoSizes;
                int i465 = this.getOutputMinFrameDuration;
                objArr162[i465] = objArr162[16];
                int[] iArr193 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i465 + 2;
                iArr193[i465 + 1] = 0;
                return 0;
            case 307:
                int[] iArr194 = this.getHighSpeedVideoFpsRanges;
                int i466 = this.getOutputMinFrameDuration;
                iArr194[i466] = 21;
                this.getOutputMinFrameDuration = i466;
                int i467 = i466 - 1;
                iArr194[i467] = iArr194[i467] + 21;
                return 0;
            case 308:
                int[] iArr195 = this.getHighSpeedVideoFpsRanges;
                int i468 = this.getOutputMinFrameDuration;
                iArr195[i468] = 51;
                int i469 = i468 - 1;
                int i470 = iArr195[i469] + 51;
                iArr195[i469] = i470;
                this.getOutputMinFrameDuration = i468 + 1;
                iArr195[i468] = i470;
                return 0;
            case 309:
                int[] iArr196 = this.getHighSpeedVideoFpsRanges;
                int i471 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i471 + 1;
                iArr196[i471] = 29;
                return 0;
            case 310:
                int[] iArr197 = this.getHighSpeedVideoFpsRanges;
                int i472 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i472 + 1;
                iArr197[i472] = 45;
                return 0;
            case 311:
                java.lang.Object[] objArr163 = this.getHighSpeedVideoSizes;
                int i473 = this.getOutputMinFrameDuration;
                objArr163[i473] = objArr163[14];
                this.getOutputMinFrameDuration = i473 + 2;
                objArr163[i473 + 1] = objArr163[15];
                return 0;
            case 312:
                int[] iArr198 = this.getHighSpeedVideoFpsRanges;
                int i474 = this.getOutputMinFrameDuration;
                iArr198[i474] = 0;
                iArr198[i474 + 1] = 0;
                this.getOutputMinFrameDuration = i474 + 3;
                iArr198[i474 + 2] = 0;
                return 0;
            case 313:
                int[] iArr199 = this.getHighSpeedVideoFpsRanges;
                int i475 = this.getOutputMinFrameDuration;
                iArr199[i475] = 0;
                java.lang.Object[] objArr164 = this.getHighSpeedVideoSizes;
                this.getOutputMinFrameDuration = i475 + 2;
                objArr164[i475 + 1] = objArr164[14];
                return 0;
            case 314:
                int[] iArr200 = this.getHighSpeedVideoFpsRanges;
                int i476 = this.getOutputMinFrameDuration;
                iArr200[i476] = 39;
                int i477 = i476 - 1;
                int i478 = iArr200[i477] + 39;
                iArr200[i477] = i478;
                this.getOutputMinFrameDuration = i476 + 1;
                iArr200[i476] = i478;
                return 0;
            case 315:
                int i479 = this.getOutputMinFrameDuration;
                int i480 = i479 - 1;
                this.getOutputMinFrameDuration = i480;
                int[] iArr201 = this.getHighSpeedVideoFpsRanges;
                int i481 = i479 - 2;
                iArr201[i481] = iArr201[i481] >> iArr201[i480];
                return 0;
            case 316:
                int[] iArr202 = this.getHighSpeedVideoFpsRanges;
                int i482 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i482 + 1;
                iArr202[i482] = 54;
                return 0;
            case 317:
                int[] iArr203 = this.getHighSpeedVideoFpsRanges;
                int i483 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i483 + 1;
                iArr203[i483] = 7;
                return 0;
            case 318:
                int[] iArr204 = this.getHighSpeedVideoFpsRanges;
                int i484 = this.getOutputMinFrameDuration;
                iArr204[i484] = 3;
                this.getOutputMinFrameDuration = i484 + 2;
                iArr204[i484 + 1] = 0;
                return 0;
            case 319:
                long[] jArr5 = this.Camera2StreamConfigurationMap;
                int i485 = this.getOutputMinFrameDuration;
                jArr5[i485] = 0;
                this.getOutputMinFrameDuration = i485;
                int i486 = i485 - 1;
                this.getHighSpeedVideoFpsRanges[i486] = (jArr5[i486] > 0L ? 1 : (jArr5[i486] == 0L ? 0 : -1));
                return 0;
            case 320:
                int i487 = this.getOutputMinFrameDuration;
                int i488 = i487 - 1;
                int[] iArr205 = this.getHighSpeedVideoFpsRanges;
                int i489 = i487 - 2;
                iArr205[i489] = iArr205[i489] + iArr205[i488];
                this.getOutputMinFrameDuration = i487;
                iArr205[i488] = 1157;
                return 0;
            case 321:
                int[] iArr206 = this.getHighSpeedVideoFpsRanges;
                int i490 = this.getOutputMinFrameDuration;
                iArr206[i490] = 28801;
                float[] fArr10 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputMinFrameDuration = i490 + 2;
                fArr10[i490 + 1] = 0.0f;
                return 0;
            case 322:
                int i491 = this.getOutputMinFrameDuration;
                int i492 = i491 - 1;
                java.lang.Object[] objArr165 = this.getHighSpeedVideoSizes;
                java.lang.Object obj67 = objArr165[i492];
                objArr165[i492] = null;
                objArr165[13] = obj67;
                int[] iArr207 = this.getHighSpeedVideoFpsRanges;
                iArr207[i492] = 0;
                this.getOutputMinFrameDuration = i491 + 1;
                iArr207[i491] = 0;
                return 0;
            case 323:
                int[] iArr208 = this.getHighSpeedVideoFpsRanges;
                int i493 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i493 + 1;
                iArr208[i493] = 95;
                return 0;
            case 324:
                int[] iArr209 = this.getHighSpeedVideoFpsRanges;
                int i494 = this.getOutputMinFrameDuration;
                iArr209[i494] = 91;
                int i495 = i494 - 1;
                int i496 = iArr209[i495] + 91;
                iArr209[i495] = i496;
                this.getOutputMinFrameDuration = i494 + 1;
                iArr209[i494] = i496;
                return 0;
            case 325:
                int[] iArr210 = this.getHighSpeedVideoFpsRanges;
                int i497 = this.getOutputMinFrameDuration;
                iArr210[i497] = 103;
                this.getOutputMinFrameDuration = i497;
                int i498 = i497 - 1;
                iArr210[i498] = iArr210[i498] + 103;
                return 0;
            case 326:
                int[] iArr211 = this.getHighSpeedVideoFpsRanges;
                int i499 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i499 + 1;
                iArr211[i499] = 79;
                return 0;
            case 327:
                java.lang.Object[] objArr166 = this.getHighSpeedVideoSizes;
                int i500 = this.getOutputMinFrameDuration;
                java.lang.Object obj68 = objArr166[i500 - 1];
                objArr166[i500] = obj68;
                this.getOutputMinFrameDuration = i500;
                objArr166[i500] = null;
                objArr166[15] = obj68;
                return 0;
            case 328:
                java.lang.Object[] objArr167 = this.getHighSpeedVideoSizes;
                int i501 = this.getOutputMinFrameDuration;
                objArr167[i501] = objArr167[15];
                this.getOutputMinFrameDuration = i501 + 2;
                objArr167[i501 + 1] = objArr167[13];
                return 0;
            case 329:
                int i502 = this.getOutputMinFrameDuration;
                int i503 = i502 - 1;
                java.lang.Object[] objArr168 = this.getHighSpeedVideoSizes;
                java.lang.Object obj69 = objArr168[i503];
                objArr168[i503] = null;
                objArr168[13] = obj69;
                this.getOutputMinFrameDuration = i502;
                objArr168[i503] = objArr168[15];
                return 0;
            case com.visa.cbp.getCertUsage.setAucAID /* 330 */:
                int[] iArr212 = this.getHighSpeedVideoFpsRanges;
                int i504 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i504 + 1;
                iArr212[i504] = 22;
                return 0;
            case com.visa.cbp.getCertUsage.getAucAID /* 331 */:
                int i505 = this.getOutputMinFrameDuration;
                int i506 = i505 - 1;
                int[] iArr213 = this.getHighSpeedVideoFpsRanges;
                int i507 = i505 - 2;
                iArr213[i507] = iArr213[i507] - iArr213[i506];
                this.getOutputMinFrameDuration = i505;
                iArr213[i506] = 177;
                return 0;
            case com.visa.cbp.getCertUsage.getAppPrgrmIDAID /* 332 */:
                int[] iArr214 = this.getHighSpeedVideoFpsRanges;
                int i508 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i508 + 1;
                iArr214[i508] = 93;
                return 0;
            case com.visa.cbp.getCertUsage.getODAData /* 333 */:
                int i509 = this.getOutputMinFrameDuration;
                int i510 = i509 - 1;
                java.lang.Object[] objArr169 = this.getHighSpeedVideoSizes;
                java.lang.Object obj70 = objArr169[i510];
                objArr169[i510] = null;
                objArr169[15] = obj70;
                int[] iArr215 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i509;
                iArr215[i510] = 3;
                return 0;
            case com.visa.cbp.getCertUsage.setODAData /* 334 */:
                int i511 = this.getOutputMinFrameDuration;
                int i512 = i511 - 1;
                int[] iArr216 = this.getHighSpeedVideoFpsRanges;
                int i513 = i511 - 2;
                int i514 = iArr216[i513] >> iArr216[i512];
                iArr216[i513] = i514;
                int i515 = i511 - 3;
                iArr216[i515] = iArr216[i515] + i514;
                this.getOutputMinFrameDuration = i512;
                iArr216[i513] = 1173;
                return 0;
            case com.visa.cbp.getCertUsage.setAppPrgrmID /* 335 */:
                int i516 = this.getOutputMinFrameDuration;
                int i517 = i516 - 1;
                java.lang.Object[] objArr170 = this.getHighSpeedVideoSizes;
                java.lang.Object obj71 = objArr170[i517];
                objArr170[i517] = null;
                objArr170[14] = obj71;
                objArr170[i517] = objArr170[15];
                int[] iArr217 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i516 + 1;
                iArr217[i516] = 1;
                return 0;
            case 336:
                int i518 = this.getOutputMinFrameDuration;
                int i519 = i518 - 1;
                java.lang.Object[] objArr171 = this.getHighSpeedVideoSizes;
                java.lang.Object obj72 = objArr171[i519];
                objArr171[i519] = null;
                objArr171[16] = obj72;
                this.getHighSpeedVideoFpsRanges[i519] = 1;
                this.getOutputMinFrameDuration = i518 + 1;
                objArr171[i518] = objArr171[14];
                return 0;
            case 337:
                int[] iArr218 = this.getHighSpeedVideoFpsRanges;
                int i520 = this.getOutputMinFrameDuration;
                iArr218[i520] = 128;
                java.lang.Object[] objArr172 = this.getHighSpeedVideoSizes;
                this.getOutputMinFrameDuration = i520 + 2;
                objArr172[i520 + 1] = objArr172[15];
                return 0;
            case 338:
                java.lang.Object[] objArr173 = this.getHighSpeedVideoSizes;
                int i521 = this.getOutputMinFrameDuration;
                objArr173[i521] = objArr173[15];
                int[] iArr219 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i521 + 2;
                iArr219[i521 + 1] = 0;
                return 0;
            case 339:
                int[] iArr220 = this.getHighSpeedVideoFpsRanges;
                int i522 = this.getOutputMinFrameDuration;
                int i523 = i522 - 1;
                iArr220[i523] = -iArr220[i523];
                this.getOutputMinFrameDuration = i522 + 1;
                iArr220[i522] = 177;
                return 0;
            case 340:
                long[] jArr6 = this.Camera2StreamConfigurationMap;
                int i524 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i524 + 1;
                jArr6[i524] = 0;
                return 0;
            case 341:
                int[] iArr221 = this.getHighSpeedVideoFpsRanges;
                int i525 = this.getOutputMinFrameDuration;
                iArr221[i525] = 16;
                this.getOutputMinFrameDuration = i525;
                int i526 = i525 - 1;
                iArr221[i526] = iArr221[i526] >> 16;
                return 0;
            case com.visa.cbp.getCertUsage.isReperso /* 342 */:
                java.lang.Object[] objArr174 = this.getHighSpeedVideoSizes;
                int i527 = this.getOutputMinFrameDuration;
                objArr174[i527] = objArr174[14];
                this.getHighSpeedVideoFpsRanges[i527 + 1] = 0;
                this.getOutputMinFrameDuration = i527 + 3;
                objArr174[i527 + 2] = objArr174[14];
                return 0;
            case 343:
                int[] iArr222 = this.getHighSpeedVideoFpsRanges;
                int i528 = this.getOutputMinFrameDuration;
                java.lang.Object[] objArr175 = this.getHighSpeedVideoSizes;
                int i529 = i528 - 1;
                java.lang.Object obj73 = objArr175[i529];
                objArr175[i529] = null;
                iArr222[i529] = ((byte[]) obj73).length;
                this.getOutputMinFrameDuration = i528 + 1;
                iArr222[i528] = 2;
                return 0;
            case my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD /* 344 */:
                int[] iArr223 = this.getHighSpeedVideoFpsRanges;
                int i530 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i530 + 1;
                iArr223[i530] = 1156;
                return 0;
            case 345:
                int[] iArr224 = this.getHighSpeedVideoFpsRanges;
                int i531 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i531 + 1;
                iArr224[i531] = 28801;
                return 0;
            case 346:
                int i532 = this.getOutputMinFrameDuration;
                int i533 = i532 - 1;
                java.lang.Object[] objArr176 = this.getHighSpeedVideoSizes;
                java.lang.Object obj74 = objArr176[i533];
                objArr176[i533] = null;
                objArr176[13] = obj74;
                int[] iArr225 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i532;
                iArr225[i533] = 0;
                return 0;
            case 347:
                int i534 = this.getOutputMinFrameDuration;
                int[] iArr226 = this.getHighSpeedVideoFpsRanges;
                int i535 = i534 - 2;
                int i536 = iArr226[i535] >> iArr226[i534 - 1];
                iArr226[i535] = i536;
                this.getOutputMinFrameDuration = i535;
                int i537 = i534 - 3;
                iArr226[i537] = iArr226[i537] + i536;
                return 0;
            case 348:
                int[] iArr227 = this.getHighSpeedVideoFpsRanges;
                int i538 = this.getOutputMinFrameDuration;
                iArr227[i538] = 1195;
                iArr227[i538 + 1] = 0;
                this.getOutputMinFrameDuration = i538 + 3;
                iArr227[i538 + 2] = 0;
                return 0;
            case 349:
                long[] jArr7 = this.Camera2StreamConfigurationMap;
                int i539 = this.getOutputMinFrameDuration;
                jArr7[i539] = 0;
                int[] iArr228 = this.getHighSpeedVideoFpsRanges;
                int i540 = i539 - 1;
                int i541 = (jArr7[i540] > 0L ? 1 : (jArr7[i540] == 0L ? 0 : -1));
                iArr228[i540] = i541;
                this.getOutputMinFrameDuration = i540;
                int i542 = i539 - 2;
                iArr228[i542] = iArr228[i542] + i541;
                return 0;
            case 350:
                java.lang.Object[] objArr177 = this.getHighSpeedVideoSizes;
                int i543 = this.getOutputMinFrameDuration;
                java.lang.Object obj75 = objArr177[i543 - 1];
                objArr177[i543] = obj75;
                objArr177[i543] = null;
                objArr177[15] = obj75;
                int[] iArr229 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i543 + 1;
                iArr229[i543] = 2;
                return 0;
            case 351:
                int[] iArr230 = this.getHighSpeedVideoFpsRanges;
                int i544 = this.getOutputMinFrameDuration;
                iArr230[i544] = 65;
                int i545 = i544 - 1;
                int i546 = iArr230[i545] + 65;
                iArr230[i545] = i546;
                this.getOutputMinFrameDuration = i544 + 1;
                iArr230[i544] = i546;
                return 0;
            case 352:
                int[] iArr231 = this.getHighSpeedVideoFpsRanges;
                int i547 = this.getOutputMinFrameDuration;
                int i548 = i547 + 1;
                iArr231[i547] = 24;
                iArr231[i548] = 0;
                this.getOutputMinFrameDuration = i548;
                iArr231[i547] = iArr231[i547] / 0;
                return 0;
            case 353:
                int[] iArr232 = this.getHighSpeedVideoFpsRanges;
                int i549 = this.getOutputMinFrameDuration;
                iArr232[i549] = 15;
                int i550 = i549 - 1;
                int i551 = iArr232[i550] + 15;
                iArr232[i550] = i551;
                this.getOutputMinFrameDuration = i549 + 1;
                iArr232[i549] = i551;
                return 0;
            case 354:
                int[] iArr233 = this.getHighSpeedVideoFpsRanges;
                int i552 = this.getOutputMinFrameDuration;
                iArr233[i552] = 5;
                int i553 = i552 - 1;
                iArr233[i553] = iArr233[i553] >> 5;
                int i554 = i552 - 1;
                this.getOutputMinFrameDuration = i554;
                this.getHighSpeedVideoSizes[i554] = null;
                return 0;
            case 355:
                int[] iArr234 = this.getHighSpeedVideoFpsRanges;
                int i555 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i555 + 1;
                iArr234[i555] = 98;
                return 0;
            case 356:
                int[] iArr235 = this.getHighSpeedVideoFpsRanges;
                int i556 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i556 + 1;
                iArr235[i556] = 94;
                return 0;
            case 357:
                int[] iArr236 = this.getHighSpeedVideoFpsRanges;
                int i557 = this.getOutputMinFrameDuration;
                iArr236[i557] = 16;
                int i558 = i557 - 1;
                int i559 = iArr236[i558] >> 16;
                iArr236[i558] = i559;
                this.getOutputMinFrameDuration = i558;
                int i560 = i557 - 2;
                iArr236[i560] = iArr236[i560] - i559;
                return 0;
            case 358:
                int i561 = this.getOutputMinFrameDuration;
                int i562 = i561 - 1;
                this.getOutputMinFrameDuration = i562;
                int[] iArr237 = this.getHighSpeedVideoFpsRanges;
                float[] fArr11 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i563 = i561 - 2;
                iArr237[i563] = (fArr11[i563] > fArr11[i562] ? 1 : (fArr11[i563] == fArr11[i562] ? 0 : -1));
                return 0;
            case 359:
                int i564 = this.getOutputMinFrameDuration;
                int i565 = i564 - 1;
                java.lang.Object[] objArr178 = this.getHighSpeedVideoSizes;
                java.lang.Object obj76 = objArr178[i565];
                objArr178[i565] = null;
                objArr178[14] = obj76;
                this.getOutputMinFrameDuration = i564;
                objArr178[i565] = objArr178[12];
                return 0;
            case 360:
                int[] iArr238 = this.getHighSpeedVideoFpsRanges;
                int i566 = this.getOutputMinFrameDuration;
                iArr238[i566] = 125;
                this.getOutputMinFrameDuration = i566;
                int i567 = i566 - 1;
                iArr238[i567] = iArr238[i567] + 125;
                return 0;
            case 361:
                int i568 = this.getOutputMinFrameDuration;
                int i569 = i568 - 1;
                this.getHighSpeedVideoSizes[i569] = null;
                this.getHighSpeedVideoFpsRanges[i569] = 0;
                float[] fArr12 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputMinFrameDuration = i568 + 1;
                fArr12[i568] = 0.0f;
                return 0;
            case 362:
                int[] iArr239 = this.getHighSpeedVideoFpsRanges;
                int i570 = this.getOutputMinFrameDuration;
                iArr239[i570] = 91;
                this.getOutputMinFrameDuration = i570 + 2;
                iArr239[i570 + 1] = 0;
                return 0;
            case 363:
                int[] iArr240 = this.getHighSpeedVideoFpsRanges;
                int i571 = this.getOutputMinFrameDuration;
                iArr240[i571] = 2;
                java.lang.Object[] objArr179 = this.getHighSpeedVideoSizes;
                objArr179[i571 + 1] = objArr179[14];
                this.getOutputMinFrameDuration = i571 + 3;
                iArr240[i571 + 2] = 128;
                return 0;
            case 364:
                java.lang.Object[] objArr180 = this.getHighSpeedVideoSizes;
                int i572 = this.getOutputMinFrameDuration;
                objArr180[i572] = objArr180[17];
                this.getOutputMinFrameDuration = i572 + 2;
                objArr180[i572 + 1] = objArr180[13];
                return 0;
            case 365:
                int i573 = this.getOutputMinFrameDuration;
                int i574 = i573 - 1;
                java.lang.Object[] objArr181 = this.getHighSpeedVideoSizes;
                objArr181[i574] = null;
                this.getOutputMinFrameDuration = i573;
                objArr181[i574] = objArr181[17];
                return 0;
            case 366:
                int i575 = this.getOutputMinFrameDuration;
                int i576 = i575 - 1;
                int[] iArr241 = this.getHighSpeedVideoFpsRanges;
                int i577 = i575 - 2;
                iArr241[i577] = iArr241[i577] + iArr241[i576];
                this.getOutputMinFrameDuration = i575;
                iArr241[i576] = 0;
                return 0;
            case 367:
                java.lang.Object[] objArr182 = this.getHighSpeedVideoSizes;
                int i578 = this.getOutputMinFrameDuration;
                objArr182[i578] = objArr182[13];
                int[] iArr242 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i578 + 2;
                iArr242[i578 + 1] = 1;
                return 0;
            case 368:
                int i579 = this.getOutputMinFrameDuration;
                int i580 = i579 - 1;
                java.lang.Object[] objArr183 = this.getHighSpeedVideoSizes;
                java.lang.Object obj77 = objArr183[i580];
                objArr183[i580] = null;
                objArr183[16] = obj77;
                this.getHighSpeedVideoFpsRanges[i580] = 2;
                this.getOutputMinFrameDuration = i579 + 1;
                objArr183[i579] = objArr183[14];
                return 0;
            case 369:
                int[] iArr243 = this.getHighSpeedVideoFpsRanges;
                int i581 = this.getOutputMinFrameDuration;
                iArr243[i581] = 128;
                java.lang.Object[] objArr184 = this.getHighSpeedVideoSizes;
                this.getOutputMinFrameDuration = i581 + 2;
                objArr184[i581 + 1] = objArr184[13];
                return 0;
            case com.knotapi.knot.utilities.Constants.ID_KROGER /* 370 */:
                int[] iArr244 = this.getHighSpeedVideoFpsRanges;
                int i582 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i582 + 1;
                iArr244[i582] = 123;
                return 0;
            case 371:
                java.lang.Object[] objArr185 = this.getHighSpeedVideoSizes;
                int i583 = this.getOutputMinFrameDuration;
                objArr185[i583] = objArr185[15];
                int[] iArr245 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = i583 + 2;
                iArr245[i583 + 1] = 6;
                return 0;
            case 372:
                int i584 = this.getOutputMinFrameDuration;
                int i585 = i584 - 1;
                this.getOutputMinFrameDuration = i585;
                int[] iArr246 = this.getHighSpeedVideoFpsRanges;
                long[] jArr8 = this.Camera2StreamConfigurationMap;
                int i586 = i584 - 2;
                iArr246[i586] = (jArr8[i586] > jArr8[i585] ? 1 : (jArr8[i586] == jArr8[i585] ? 0 : -1));
                return 0;
            case 373:
                int i587 = this.getOutputMinFrameDuration;
                int i588 = i587 - 1;
                int[] iArr247 = this.getHighSpeedVideoFpsRanges;
                int i589 = i587 - 2;
                iArr247[i589] = iArr247[i589] + iArr247[i588];
                this.getOutputMinFrameDuration = i587;
                iArr247[i588] = 1214;
                return 0;
            case 374:
                int i590 = this.getOutputMinFrameDuration;
                int i591 = i590 - 1;
                this.getOutputMinFrameDuration = i591;
                int[] iArr248 = this.getHighSpeedVideoFpsRanges;
                int i592 = i590 - 2;
                int i593 = iArr248[i592] >> iArr248[i591];
                iArr248[i592] = i593;
                iArr248[i592] = (char) i593;
                return 0;
            case 375:
                int i594 = this.getOutputMinFrameDuration;
                int i595 = i594 - 1;
                java.lang.Object[] objArr186 = this.getHighSpeedVideoSizes;
                java.lang.Object obj78 = objArr186[i595];
                objArr186[i595] = null;
                objArr186[15] = obj78;
                this.getOutputMinFrameDuration = i594;
                objArr186[i595] = objArr186[12];
                return 0;
            case 376:
                java.lang.Object[] objArr187 = this.getHighSpeedVideoSizes;
                int i596 = this.getOutputMinFrameDuration;
                int i597 = i596 - 1;
                objArr187[i597] = new byte[this.getHighSpeedVideoFpsRanges[i597]];
                int i598 = i596 - 1;
                this.getOutputMinFrameDuration = i598;
                java.lang.Object obj79 = objArr187[i598];
                objArr187[i598] = null;
                objArr187[15] = obj79;
                return 0;
            case 377:
                java.lang.Object[] objArr188 = this.getHighSpeedVideoSizes;
                int i599 = this.getOutputMinFrameDuration;
                int[] iArr249 = this.getHighSpeedVideoFpsRanges;
                int i600 = i599 - 1;
                byte[] bArr = new byte[iArr249[i600]];
                objArr188[i600] = bArr;
                objArr188[i600] = null;
                objArr188[16] = bArr;
                this.getOutputMinFrameDuration = i599;
                iArr249[i600] = 8;
                return 0;
            case 378:
                java.lang.Object[] objArr189 = this.getHighSpeedVideoSizes;
                int i601 = this.getOutputMinFrameDuration;
                int i602 = i601 - 1;
                objArr189[i602] = new byte[this.getHighSpeedVideoFpsRanges[i602]];
                int i603 = i601 - 1;
                this.getOutputMinFrameDuration = i603;
                java.lang.Object obj80 = objArr189[i603];
                objArr189[i603] = null;
                objArr189[17] = obj80;
                return 0;
            case 379:
                java.lang.Object[] objArr190 = this.getHighSpeedVideoSizes;
                int i604 = this.getOutputMinFrameDuration;
                int[] iArr250 = this.getHighSpeedVideoFpsRanges;
                int i605 = i604 - 1;
                objArr190[i605] = new byte[iArr250[i605]];
                objArr190[i605] = null;
                this.getOutputMinFrameDuration = i604;
                iArr250[i605] = 8;
                return 0;
            case 380:
                java.lang.Object[] objArr191 = this.getHighSpeedVideoSizes;
                int i606 = this.getOutputMinFrameDuration;
                int i607 = i606 - 1;
                objArr191[i607] = new byte[this.getHighSpeedVideoFpsRanges[i607]];
                int i608 = i606 - 1;
                this.getOutputMinFrameDuration = i608;
                java.lang.Object obj81 = objArr191[i608];
                objArr191[i608] = null;
                objArr191[18] = obj81;
                return 0;
            case 381:
                int[] iArr251 = this.getHighSpeedVideoFpsRanges;
                int i609 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i609 + 1;
                iArr251[i609] = 8;
                this.getHighSpeedVideoSizes[i609] = new byte[8];
                return 0;
            case 382:
                int i610 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i610;
                java.lang.Object[] objArr192 = this.getHighSpeedVideoSizes;
                java.lang.Object obj82 = objArr192[i610];
                objArr192[i610] = null;
                objArr192[19] = obj82;
                return 0;
            case 383:
                int i611 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i611;
                java.lang.Object[] objArr193 = this.getHighSpeedVideoSizes;
                java.lang.Object obj83 = objArr193[i611];
                objArr193[i611] = null;
                objArr193[20] = obj83;
                return 0;
            case 384:
                java.lang.Object[] objArr194 = this.getHighSpeedVideoSizes;
                int i612 = this.getOutputMinFrameDuration;
                objArr194[i612] = objArr194[14];
                this.getHighSpeedVideoFpsRanges[i612 + 1] = 0;
                this.getOutputMinFrameDuration = i612 + 3;
                objArr194[i612 + 2] = objArr194[15];
                return 0;
            case 385:
                java.lang.Object[] objArr195 = this.getHighSpeedVideoSizes;
                int i613 = this.getOutputMinFrameDuration;
                objArr195[i613] = objArr195[16];
                int[] iArr252 = this.getHighSpeedVideoFpsRanges;
                iArr252[i613 + 1] = 0;
                this.getOutputMinFrameDuration = i613 + 3;
                iArr252[i613 + 2] = 8;
                return 0;
            case 386:
                java.lang.Object[] objArr196 = this.getHighSpeedVideoSizes;
                int i614 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i614 + 1;
                java.lang.Object obj84 = objArr196[13];
                objArr196[i614] = obj84;
                int[] iArr253 = this.getHighSpeedVideoFpsRanges;
                objArr196[i614] = null;
                iArr253[i614] = ((byte[]) obj84).length;
                return 0;
            case 387:
                int[] iArr254 = this.getHighSpeedVideoFpsRanges;
                int i615 = this.getOutputMinFrameDuration;
                int i616 = iArr254[i615 - 1];
                iArr254[i615] = i616;
                iArr254[14] = i616;
                this.getOutputMinFrameDuration = i615 + 1;
                iArr254[i615] = 8;
                return 0;
            case 388:
                int[] iArr255 = this.getHighSpeedVideoFpsRanges;
                int i617 = this.getOutputMinFrameDuration;
                iArr255[i617] = iArr255[14];
                this.getOutputMinFrameDuration = i617 + 2;
                iArr255[i617 + 1] = 8;
                return 0;
            case 389:
                int[] iArr256 = this.getHighSpeedVideoFpsRanges;
                int i618 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i618 + 1;
                iArr256[i618] = iArr256[14];
                return 0;
            case 390:
                int i619 = this.getOutputMinFrameDuration;
                int i620 = i619 - 1;
                this.getOutputMinFrameDuration = i620;
                int[] iArr257 = this.getHighSpeedVideoFpsRanges;
                int i621 = i619 - 2;
                int i622 = iArr257[i621] % iArr257[i620];
                iArr257[i621] = i622;
                int i623 = i619 - 3;
                int i624 = iArr257[i623] - i622;
                iArr257[i623] = i624;
                this.getOutputMinFrameDuration = i623;
                int i625 = i619 - 4;
                iArr257[i625] = iArr257[i625] + i624;
                return 0;
            case 391:
                int i626 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i626;
                int[] iArr258 = this.getHighSpeedVideoFpsRanges;
                iArr258[14] = iArr258[i626];
                return 0;
            case my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY /* 392 */:
                int[] iArr259 = this.getHighSpeedVideoFpsRanges;
                int i627 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i627 + 1;
                int i628 = iArr259[14];
                iArr259[i627] = i628;
                this.getHighSpeedVideoSizes[i627] = new byte[i628];
                return 0;
            case 393:
                java.lang.Object[] objArr197 = this.getHighSpeedVideoSizes;
                int i629 = this.getOutputMinFrameDuration;
                objArr197[i629] = objArr197[14];
                this.getHighSpeedVideoFpsRanges[i629 + 1] = 0;
                this.getOutputMinFrameDuration = i629 + 3;
                objArr197[i629 + 2] = objArr197[13];
                return 0;
            case 394:
                int[] iArr260 = this.getHighSpeedVideoFpsRanges;
                int i630 = this.getOutputMinFrameDuration;
                iArr260[i630] = 0;
                java.lang.Object[] objArr198 = this.getHighSpeedVideoSizes;
                this.getOutputMinFrameDuration = i630 + 2;
                objArr198[i630 + 1] = objArr198[13];
                return 0;
            case 395:
                int[] iArr261 = this.getHighSpeedVideoFpsRanges;
                int i631 = this.getOutputMinFrameDuration;
                iArr261[i631] = 0;
                this.getOutputMinFrameDuration = i631 + 2;
                iArr261[i631 + 1] = 8;
                return 0;
            case 396:
                java.lang.Object[] objArr199 = this.getHighSpeedVideoSizes;
                int i632 = this.getOutputMinFrameDuration;
                objArr199[i632] = objArr199[20];
                this.getOutputMinFrameDuration = i632 + 2;
                objArr199[i632 + 1] = objArr199[13];
                return 0;
            case 397:
                int[] iArr262 = this.getHighSpeedVideoFpsRanges;
                int i633 = this.getOutputMinFrameDuration;
                iArr262[i633] = 0;
                java.lang.Object[] objArr200 = this.getHighSpeedVideoSizes;
                this.getOutputMinFrameDuration = i633 + 2;
                objArr200[i633 + 1] = objArr200[18];
                return 0;
            case 398:
                int[] iArr263 = this.getHighSpeedVideoFpsRanges;
                int i634 = this.getOutputMinFrameDuration;
                iArr263[i634] = 8;
                this.getOutputMinFrameDuration = i634;
                int i635 = i634 - 1;
                iArr263[i635] = iArr263[i635] / 8;
                int i636 = i634 - 1;
                this.getOutputMinFrameDuration = i636;
                iArr263[21] = iArr263[i636];
                return 0;
            case 399:
                int i637 = this.getOutputMinFrameDuration - 1;
                this.getOutputMinFrameDuration = i637;
                int[] iArr264 = this.getHighSpeedVideoFpsRanges;
                iArr264[22] = iArr264[i637];
                return 0;
            case 400:
                int[] iArr265 = this.getHighSpeedVideoFpsRanges;
                int i638 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i638 + 1;
                iArr265[i638] = iArr265[22];
                return 0;
            case 401:
                int i639 = this.getOutputMinFrameDuration;
                int i640 = i639 - 2;
                this.getOutputMinFrameDuration = i640;
                int[] iArr266 = this.getHighSpeedVideoFpsRanges;
                this.valueOf = iArr266[i640] >= iArr266[i639 - 1] ? 0 : 1;
                return 0;
            case androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_VISIBILITY /* 402 */:
                int[] iArr267 = this.getHighSpeedVideoFpsRanges;
                int i641 = this.getOutputMinFrameDuration;
                this.getOutputMinFrameDuration = i641 + 1;
                iArr267[i641] = iArr267[21];
                return 0;
            case 403:
                int[] iArr268 = this.getHighSpeedVideoFpsRanges;
                int i642 = this.getOutputMinFrameDuration;
                iArr268[i642] = iArr268[22];
                this.getOutputMinFrameDuration = i642 + 2;
                iArr268[i642 + 1] = 3;
                return 0;
            case 404:
                int i643 = this.getOutputMinFrameDuration;
                int i644 = i643 - 1;
                int[] iArr269 = this.getHighSpeedVideoFpsRanges;
                int i645 = i643 - 2;
                iArr269[i645] = iArr269[i645] << iArr269[i644];
                java.lang.Object[] objArr201 = this.getHighSpeedVideoSizes;
                this.getOutputMinFrameDuration = i643;
                objArr201[i644] = objArr201[19];
                return 0;
            case com.datadog.android.internal.network.HttpSpec.StatusCode.METHOD_NOT_ALLOWED /* 405 */:
                int i646 = this.getOutputMinFrameDuration;
                int i647 = i646 - 1;
                java.lang.Object[] objArr202 = this.getHighSpeedVideoSizes;
                java.lang.Object obj85 = objArr202[i647];
                objArr202[i647] = null;
                objArr202[13] = obj85;
                objArr202[i647] = objArr202[20];
                this.getOutputMinFrameDuration = i646 + 1;
                objArr202[i646] = objArr202[13];
                return 0;
            case 406:
                int[] iArr270 = this.getHighSpeedVideoFpsRanges;
                iArr270[22] = iArr270[22] + 1;
                return 0;
            case 407:
                java.lang.Object[] objArr203 = this.getHighSpeedVideoSizes;
                int i648 = this.getOutputMinFrameDuration;
                objArr203[i648] = objArr203[20];
                objArr203[i648 + 1] = objArr203[18];
                this.getOutputMinFrameDuration = i648 + 3;
                objArr203[i648 + 2] = objArr203[16];
                return 0;
            case 408:
                int[] iArr271 = this.getHighSpeedVideoFpsRanges;
                int i649 = this.getOutputMinFrameDuration;
                iArr271[i649] = 33;
                this.getOutputMinFrameDuration = i649;
                int i650 = i649 - 1;
                iArr271[i650] = iArr271[i650] + 33;
                return 0;
            case 409:
                java.lang.Object[] objArr204 = this.getHighSpeedVideoSizes;
                int i651 = this.getOutputMinFrameDuration;
                objArr204[i651] = objArr204[14];
                int[] iArr272 = this.getHighSpeedVideoFpsRanges;
                iArr272[i651 + 1] = iArr272[22];
                this.getOutputMinFrameDuration = i651 + 3;
                iArr272[i651 + 2] = 5;
                return 0;
            case 410:
                java.lang.Object[] objArr205 = this.getHighSpeedVideoSizes;
                int i652 = this.getOutputMinFrameDuration;
                objArr205[i652] = objArr205[18];
                int[] iArr273 = this.getHighSpeedVideoFpsRanges;
                iArr273[i652 + 1] = 1;
                this.getOutputMinFrameDuration = i652 + 3;
                iArr273[i652 + 2] = 84;
                return 0;
            case 411:
                int[] iArr274 = this.getHighSpeedVideoFpsRanges;
                iArr274[22] = iArr274[22] + 52;
                return 0;
            case 412:
                int[] iArr275 = this.getHighSpeedVideoFpsRanges;
                int i653 = this.getOutputMinFrameDuration;
                iArr275[i653] = 55;
                this.getOutputMinFrameDuration = i653;
                int i654 = i653 - 1;
                iArr275[i654] = iArr275[i654] + 55;
                return 0;
            default:
                return i;
        }
    }

    public setCertFormat$24815(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12) {
        this.getHighSpeedVideoFpsRanges = new int[28];
        this.Camera2StreamConfigurationMap = new long[28];
        this.getHighResolutionOutputSizeshNQ4ISI = new float[28];
        this.getHighSpeedVideoFpsRangesFor = new double[28];
        java.lang.Object[] objArr = new java.lang.Object[28];
        this.getHighSpeedVideoSizes = objArr;
        objArr[12] = obj;
        objArr[13] = obj2;
        objArr[14] = obj3;
        objArr[15] = obj4;
        objArr[16] = obj5;
        objArr[17] = obj6;
        objArr[18] = obj7;
        objArr[19] = obj8;
        objArr[20] = obj9;
        objArr[21] = obj10;
        objArr[22] = obj11;
        objArr[23] = obj12;
        this.getOutputMinFrameDuration = 0;
        this.getInputFormats = -1;
    }

    public setCertFormat$24815(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11) {
        this.getHighSpeedVideoFpsRanges = new int[28];
        this.Camera2StreamConfigurationMap = new long[28];
        this.getHighResolutionOutputSizeshNQ4ISI = new float[28];
        this.getHighSpeedVideoFpsRangesFor = new double[28];
        java.lang.Object[] objArr = new java.lang.Object[28];
        this.getHighSpeedVideoSizes = objArr;
        objArr[12] = obj;
        objArr[13] = obj2;
        objArr[14] = obj3;
        objArr[15] = obj4;
        objArr[16] = obj5;
        objArr[17] = obj6;
        objArr[18] = obj7;
        objArr[19] = obj8;
        objArr[20] = obj9;
        objArr[21] = obj10;
        objArr[22] = obj11;
        this.getOutputMinFrameDuration = 0;
        this.getInputFormats = -1;
    }

    public setCertFormat$24815(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        this.getHighSpeedVideoFpsRanges = new int[28];
        this.Camera2StreamConfigurationMap = new long[28];
        this.getHighResolutionOutputSizeshNQ4ISI = new float[28];
        this.getHighSpeedVideoFpsRangesFor = new double[28];
        java.lang.Object[] objArr = new java.lang.Object[28];
        this.getHighSpeedVideoSizes = objArr;
        objArr[12] = obj;
        objArr[13] = obj2;
        objArr[14] = obj3;
        objArr[15] = obj4;
        objArr[16] = obj5;
        objArr[17] = obj6;
        objArr[18] = obj7;
        objArr[19] = obj8;
        this.getOutputMinFrameDuration = 0;
        this.getInputFormats = -1;
    }

    public setCertFormat$24815(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        this.getHighSpeedVideoFpsRanges = new int[28];
        this.Camera2StreamConfigurationMap = new long[28];
        this.getHighResolutionOutputSizeshNQ4ISI = new float[28];
        this.getHighSpeedVideoFpsRangesFor = new double[28];
        java.lang.Object[] objArr = new java.lang.Object[28];
        this.getHighSpeedVideoSizes = objArr;
        objArr[12] = obj;
        objArr[13] = obj2;
        objArr[14] = obj3;
        objArr[15] = obj4;
        objArr[16] = obj5;
        objArr[17] = obj6;
        objArr[18] = obj7;
        this.getOutputMinFrameDuration = 0;
        this.getInputFormats = -1;
    }

    public setCertFormat$24815(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        this.getHighSpeedVideoFpsRanges = new int[28];
        this.Camera2StreamConfigurationMap = new long[28];
        this.getHighResolutionOutputSizeshNQ4ISI = new float[28];
        this.getHighSpeedVideoFpsRangesFor = new double[28];
        java.lang.Object[] objArr = new java.lang.Object[28];
        this.getHighSpeedVideoSizes = objArr;
        objArr[12] = obj;
        objArr[13] = obj2;
        objArr[14] = obj3;
        objArr[15] = obj4;
        objArr[16] = obj5;
        this.getOutputMinFrameDuration = 0;
        this.getInputFormats = -1;
    }

    public setCertFormat$24815(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        this.getHighSpeedVideoFpsRanges = new int[28];
        this.Camera2StreamConfigurationMap = new long[28];
        this.getHighResolutionOutputSizeshNQ4ISI = new float[28];
        this.getHighSpeedVideoFpsRangesFor = new double[28];
        java.lang.Object[] objArr = new java.lang.Object[28];
        this.getHighSpeedVideoSizes = objArr;
        objArr[12] = obj;
        objArr[13] = obj2;
        objArr[14] = obj3;
        objArr[15] = obj4;
        this.getOutputMinFrameDuration = 0;
        this.getInputFormats = -1;
    }

    public setCertFormat$24815(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.getHighSpeedVideoFpsRanges = new int[28];
        this.Camera2StreamConfigurationMap = new long[28];
        this.getHighResolutionOutputSizeshNQ4ISI = new float[28];
        this.getHighSpeedVideoFpsRangesFor = new double[28];
        java.lang.Object[] objArr = new java.lang.Object[28];
        this.getHighSpeedVideoSizes = objArr;
        objArr[12] = obj;
        objArr[13] = obj2;
        objArr[14] = obj3;
        this.getOutputMinFrameDuration = 0;
        this.getInputFormats = -1;
    }

    public setCertFormat$24815(java.lang.Object obj, java.lang.Object obj2) {
        this.getHighSpeedVideoFpsRanges = new int[28];
        this.Camera2StreamConfigurationMap = new long[28];
        this.getHighResolutionOutputSizeshNQ4ISI = new float[28];
        this.getHighSpeedVideoFpsRangesFor = new double[28];
        java.lang.Object[] objArr = new java.lang.Object[28];
        this.getHighSpeedVideoSizes = objArr;
        objArr[12] = obj;
        objArr[13] = obj2;
        this.getOutputMinFrameDuration = 0;
        this.getInputFormats = -1;
    }
}

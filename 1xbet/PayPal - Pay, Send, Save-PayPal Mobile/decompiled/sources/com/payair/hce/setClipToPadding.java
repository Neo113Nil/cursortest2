package com.payair.hce;

/* loaded from: classes4.dex */
public class setClipToPadding {
    public float AlternateContactlessPaymentDataJson;
    public long DigitizedCardProfile;
    public double IccPrivateKeyCrtComponentsJson;
    public java.lang.Object RecordsJson;
    public double SdkCoreAlternateContactlessPaymentDataImpl;
    private int SdkCoreBusinessLogicModuleImpl;
    public java.lang.Object getAid;
    private final double[] getApplicationLifeCycleData;
    private final java.lang.Object[] getCardLayoutDescription;
    private final int[] getCiacDecline;
    private int getCvrMaskAnd;
    private final long[] getGpoResponse;
    private final float[] getPaymentFci;
    public float getProfileVersion;
    public long valueOf;
    public int values;
    public int writeReplace;

    public int DigitizedCardProfile(int i) {
        switch (i) {
            case 1:
                java.lang.Object[] objArr = this.getCardLayoutDescription;
                int i2 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i2 + 1;
                objArr[i2] = this.getAid;
                return 0;
            case 2:
                java.lang.Object[] objArr2 = this.getCardLayoutDescription;
                int i3 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i3 + 1;
                objArr2[i3] = objArr2[i3 - 1];
                return 0;
            case 3:
                int i4 = this.getCvrMaskAnd - this.writeReplace;
                this.getCvrMaskAnd = i4;
                this.SdkCoreBusinessLogicModuleImpl = i4;
                return 0;
            case 4:
                java.lang.Object[] objArr3 = this.getCardLayoutDescription;
                int i5 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i5 + 1;
                java.lang.Object obj = objArr3[i5];
                objArr3[i5] = null;
                this.RecordsJson = obj;
                return 0;
            case 5:
                int[] iArr = this.getCiacDecline;
                int i6 = this.getCvrMaskAnd;
                int i7 = i6 + 1;
                iArr[i6] = 2;
                iArr[i7] = 2;
                this.getCvrMaskAnd = i7;
                iArr[i6] = iArr[i6] % 2;
                return 0;
            case 6:
                int i8 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i8;
                this.getCardLayoutDescription[i8] = null;
                return 0;
            case 7:
                java.lang.Object[] objArr4 = this.getCardLayoutDescription;
                int i9 = this.getCvrMaskAnd - 1;
                java.lang.Object obj2 = objArr4[i9];
                objArr4[i9] = null;
                this.RecordsJson = obj2;
                return 0;
            case 9:
                int[] iArr2 = this.getCiacDecline;
                int i10 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i10 + 1;
                iArr2[i10] = this.writeReplace;
            case 8:
                return 0;
            case 10:
                int[] iArr3 = this.getCiacDecline;
                int i11 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i11 + 1;
                iArr3[i11] = 121;
                return 0;
            case 11:
                int[] iArr4 = this.getCiacDecline;
                int i12 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i12 + 2;
                iArr4[i12 + 1] = iArr4[i12 - 1];
                iArr4[i12] = iArr4[i12 - 2];
                return 0;
            case 12:
                int i13 = this.getCvrMaskAnd;
                int i14 = i13 - 1;
                this.getCvrMaskAnd = i14;
                int[] iArr5 = this.getCiacDecline;
                int i15 = i13 - 2;
                iArr5[i15] = iArr5[i14] ^ iArr5[i15];
                return 0;
            case 13:
                int[] iArr6 = this.getCiacDecline;
                int i16 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i16 + 1;
                int i17 = i16 - 1;
                int i18 = iArr6[i17];
                iArr6[i16] = i18;
                int i19 = i16 - 2;
                iArr6[i17] = iArr6[i19];
                int i20 = i16 - 3;
                iArr6[i19] = iArr6[i20];
                iArr6[i20] = i18;
                return 0;
            case 14:
                int i21 = this.getCvrMaskAnd;
                int i22 = i21 - 1;
                this.getCvrMaskAnd = i22;
                int[] iArr7 = this.getCiacDecline;
                int i23 = i21 - 2;
                iArr7[i23] = iArr7[i22] & iArr7[i23];
                return 0;
            case 15:
                int i24 = this.getCvrMaskAnd;
                int i25 = i24 - 1;
                this.getCvrMaskAnd = i25;
                int[] iArr8 = this.getCiacDecline;
                int i26 = i24 - 2;
                iArr8[i26] = iArr8[i25] | iArr8[i26];
                return 0;
            case 16:
                int[] iArr9 = this.getCiacDecline;
                int i27 = this.getCvrMaskAnd;
                iArr9[i27] = 1;
                this.getCvrMaskAnd = i27;
                int i28 = i27 - 1;
                iArr9[i28] = iArr9[i28] << 1;
                return 0;
            case 17:
                int i29 = this.getCvrMaskAnd;
                this.getCardLayoutDescription[i29 - 1] = null;
                int i30 = i29 - 2;
                this.getCvrMaskAnd = i30;
                int[] iArr10 = this.getCiacDecline;
                int i31 = i29 - 3;
                iArr10[i31] = iArr10[i30] ^ iArr10[i31];
                return 0;
            case 18:
                int i32 = this.getCvrMaskAnd;
                int i33 = i32 - 1;
                int[] iArr11 = this.getCiacDecline;
                int i34 = i32 - 2;
                int i35 = iArr11[i34] - iArr11[i33];
                iArr11[i34] = i35;
                this.getCvrMaskAnd = i32;
                iArr11[i33] = i35;
                return 0;
            case 19:
                int[] iArr12 = this.getCiacDecline;
                int i36 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i36 + 1;
                iArr12[i36] = 128;
                return 0;
            case 20:
                int i37 = this.getCvrMaskAnd;
                int i38 = i37 - 1;
                this.getCvrMaskAnd = i38;
                int[] iArr13 = this.getCiacDecline;
                int i39 = i37 - 2;
                iArr13[i39] = iArr13[i39] % iArr13[i38];
                return 0;
            case 21:
                int[] iArr14 = this.getCiacDecline;
                int i40 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i40 + 1;
                this.values = iArr14[i40];
                return 0;
            case 22:
                int[] iArr15 = this.getCiacDecline;
                int i41 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i41 + 1;
                iArr15[i41] = 2;
                return 0;
            case 23:
                int i42 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i42;
                this.values = this.getCiacDecline[i42] == 0 ? 0 : 1;
                return 0;
            case 24:
                java.lang.Object[] objArr5 = this.getCardLayoutDescription;
                int i43 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i43 + 1;
                objArr5[i43] = null;
                return 0;
            case 25:
                int[] iArr16 = this.getCiacDecline;
                int i44 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i44 + 1;
                iArr16[i44] = 113;
                return 0;
            case 26:
                int i45 = this.getCvrMaskAnd;
                int i46 = i45 - 1;
                int[] iArr17 = this.getCiacDecline;
                int i47 = i45 - 2;
                int i48 = iArr17[i47] + iArr17[i46];
                iArr17[i47] = i48;
                this.getCvrMaskAnd = i45;
                iArr17[i46] = i48;
                return 0;
            case 27:
                int[] iArr18 = this.getCiacDecline;
                int i49 = this.getCvrMaskAnd;
                iArr18[i49] = 128;
                this.getCvrMaskAnd = i49;
                int i50 = i49 - 1;
                iArr18[i50] = iArr18[i50] % 128;
                return 0;
            case 28:
                int[] iArr19 = this.getCiacDecline;
                int i51 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i51;
                this.values = iArr19[i51];
                return 0;
            case 29:
                int[] iArr20 = this.getCiacDecline;
                int i52 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i52 + 1;
                iArr20[i52] = 1;
                return 0;
            case 30:
                int[] iArr21 = this.getCiacDecline;
                int i53 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i53 + 1;
                iArr21[i53] = 0;
                return 0;
            case 31:
                for (int i54 = this.getCvrMaskAnd - 1; i54 >= 0; i54--) {
                    this.getCardLayoutDescription[i54] = null;
                }
                java.lang.Object[] objArr6 = this.getCardLayoutDescription;
                this.getCvrMaskAnd = 1;
                objArr6[0] = this.getAid;
                return 0;
            case 32:
                int i55 = this.getCvrMaskAnd;
                int i56 = i55 - 1;
                this.getCvrMaskAnd = i56;
                int[] iArr22 = this.getCiacDecline;
                int i57 = i55 - 2;
                iArr22[i57] = iArr22[i57] % iArr22[i56];
                int i58 = i55 - 2;
                this.getCvrMaskAnd = i58;
                this.getCardLayoutDescription[i58] = null;
                return 0;
            case 33:
                int[] iArr23 = this.getCiacDecline;
                int i59 = this.getCvrMaskAnd;
                iArr23[i59] = 3;
                this.getCvrMaskAnd = i59 + 3;
                iArr23[i59 + 2] = 3;
                iArr23[i59 + 1] = iArr23[i59 - 1];
                return 0;
            case 34:
                int i60 = this.getCvrMaskAnd;
                int i61 = i60 - 1;
                int[] iArr24 = this.getCiacDecline;
                int i62 = i60 - 2;
                int i63 = iArr24[i62] ^ iArr24[i61];
                iArr24[i62] = i63;
                iArr24[i61] = i63;
                int i64 = i60 - 3;
                iArr24[i62] = iArr24[i64];
                int i65 = i60 - 4;
                iArr24[i64] = iArr24[i65];
                iArr24[i65] = i63;
                int i66 = i60 - 1;
                this.getCvrMaskAnd = i66;
                this.getCardLayoutDescription[i66] = null;
                return 0;
            case 35:
                int i67 = this.getCvrMaskAnd;
                int i68 = i67 - 1;
                int[] iArr25 = this.getCiacDecline;
                int i69 = i67 - 2;
                int i70 = iArr25[i69] << iArr25[i68];
                iArr25[i69] = i70;
                this.getCvrMaskAnd = i67;
                iArr25[i68] = i70;
                int i71 = i67 - 3;
                iArr25[i69] = iArr25[i71];
                int i72 = i67 - 4;
                iArr25[i71] = iArr25[i72];
                iArr25[i72] = i70;
                return 0;
            case 36:
                int[] iArr26 = this.getCiacDecline;
                int i73 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i73 + 1;
                iArr26[i73] = -1;
                return 0;
            case 37:
                int i74 = this.getCvrMaskAnd;
                int[] iArr27 = this.getCiacDecline;
                int i75 = i74 - 2;
                int i76 = iArr27[i74 - 1] ^ iArr27[i75];
                iArr27[i75] = i76;
                this.getCvrMaskAnd = i75;
                int i77 = i74 - 3;
                iArr27[i77] = i76 & iArr27[i77];
                return 0;
            case 38:
                int[] iArr28 = this.getCiacDecline;
                int i78 = this.getCvrMaskAnd;
                int i79 = i78 - 1;
                int i80 = iArr28[i79];
                iArr28[i78] = i80;
                int i81 = i78 - 2;
                iArr28[i79] = iArr28[i81];
                int i82 = i78 - 3;
                iArr28[i81] = iArr28[i82];
                iArr28[i82] = i80;
                this.getCvrMaskAnd = i78;
                this.getCardLayoutDescription[i78] = null;
                return 0;
            case 39:
                int[] iArr29 = this.getCiacDecline;
                int i83 = this.getCvrMaskAnd;
                int i84 = i83 - 1;
                int i85 = iArr29[i84];
                int i86 = i83 - 2;
                iArr29[i84] = iArr29[i86];
                iArr29[i86] = i85;
                iArr29[i83] = -1;
                this.getCvrMaskAnd = i83;
                iArr29[i84] = iArr29[i84] ^ (-1);
                return 0;
            case 40:
                int i87 = this.getCvrMaskAnd;
                int i88 = i87 - 1;
                int[] iArr30 = this.getCiacDecline;
                int i89 = i87 - 2;
                int i90 = iArr30[i89] & iArr30[i88];
                iArr30[i89] = i90;
                int i91 = i87 - 3;
                int i92 = i90 | iArr30[i91];
                iArr30[i91] = i92;
                this.getCvrMaskAnd = i87;
                iArr30[i88] = i92;
                iArr30[i89] = iArr30[i87 - 4];
                return 0;
            case 41:
                int[] iArr31 = this.getCiacDecline;
                int i93 = this.getCvrMaskAnd;
                int i94 = i93 - 1;
                int i95 = -iArr31[i94];
                iArr31[i94] = i95;
                this.getCvrMaskAnd = i94;
                int i96 = i93 - 2;
                iArr31[i96] = iArr31[i96] | i95;
                return 0;
            case 42:
                int[] iArr32 = this.getCiacDecline;
                int i97 = this.getCvrMaskAnd;
                iArr32[i97] = 1;
                int i98 = i97 - 1;
                int i99 = iArr32[i98] << 1;
                iArr32[i98] = i99;
                this.getCvrMaskAnd = i97 + 1;
                iArr32[i97] = i99;
                int i100 = i97 - 2;
                iArr32[i98] = iArr32[i100];
                int i101 = i97 - 3;
                iArr32[i100] = iArr32[i101];
                iArr32[i101] = i99;
                return 0;
            case 43:
                int i102 = this.getCvrMaskAnd;
                this.getCardLayoutDescription[i102 - 1] = null;
                int[] iArr33 = this.getCiacDecline;
                int i103 = i102 - 2;
                int i104 = -iArr33[i103];
                iArr33[i103] = i104;
                this.getCvrMaskAnd = i103;
                int i105 = i102 - 3;
                iArr33[i105] = iArr33[i105] ^ i104;
                return 0;
            case 44:
                int i106 = this.getCvrMaskAnd;
                int i107 = i106 - 1;
                int[] iArr34 = this.getCiacDecline;
                int i108 = i106 - 2;
                int i109 = iArr34[i108] - iArr34[i107];
                iArr34[i108] = i109;
                iArr34[i107] = i109;
                this.getCvrMaskAnd = i106 + 1;
                iArr34[i106] = 128;
                return 0;
            case 45:
                int[] iArr35 = this.getCiacDecline;
                int i110 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i110 + 1;
                iArr35[i110] = 65;
                iArr35[i110] = -65;
                return 0;
            case 46:
                int[] iArr36 = this.getCiacDecline;
                int i111 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i111 + 1;
                iArr36[i111] = iArr36[i111 - 1];
                return 0;
            case 47:
                int[] iArr37 = this.getCiacDecline;
                int i112 = this.getCvrMaskAnd;
                int i113 = i112 - 1;
                iArr37[i113] = -iArr37[i113];
                iArr37[i112] = -1;
                this.getCvrMaskAnd = i112;
                iArr37[i113] = iArr37[i113] ^ (-1);
                return 0;
            case 48:
                int[] iArr38 = this.getCiacDecline;
                int i114 = this.getCvrMaskAnd;
                int i115 = i114 - 1;
                int i116 = iArr38[i115];
                int i117 = i114 - 2;
                iArr38[i115] = iArr38[i117];
                iArr38[i117] = i116;
                this.getCardLayoutDescription[i115] = null;
                this.getCvrMaskAnd = i114 + 1;
                iArr38[i114] = i116;
                iArr38[i115] = iArr38[i114 - 3];
                return 0;
            case 49:
                int[] iArr39 = this.getCiacDecline;
                int i118 = this.getCvrMaskAnd - 1;
                iArr39[i118] = -iArr39[i118];
                return 0;
            case 50:
                int i119 = this.getCvrMaskAnd;
                int i120 = i119 - 1;
                int[] iArr40 = this.getCiacDecline;
                int i121 = i119 - 2;
                int i122 = iArr40[i121] & iArr40[i120];
                iArr40[i121] = i122;
                iArr40[i120] = i122;
                int i123 = i119 - 3;
                iArr40[i121] = iArr40[i123];
                int i124 = i119 - 4;
                iArr40[i123] = iArr40[i124];
                iArr40[i124] = i122;
                int i125 = i119 - 1;
                this.getCvrMaskAnd = i125;
                this.getCardLayoutDescription[i125] = null;
                return 0;
            case 51:
                int i126 = this.getCvrMaskAnd;
                int i127 = i126 - 1;
                this.getCvrMaskAnd = i127;
                int[] iArr41 = this.getCiacDecline;
                int i128 = i126 - 2;
                iArr41[i128] = iArr41[i128] + iArr41[i127];
                return 0;
            case 52:
                int i129 = this.getCvrMaskAnd;
                int i130 = i129 - 1;
                this.getCvrMaskAnd = i130;
                int[] iArr42 = this.getCiacDecline;
                int i131 = i129 - 2;
                iArr42[i131] = iArr42[i131] - iArr42[i130];
                return 0;
            case 53:
                int i132 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i132;
                this.values = this.getCiacDecline[i132] != 0 ? 0 : 1;
                return 0;
            case 54:
                int[] iArr43 = this.getCiacDecline;
                int i133 = this.getCvrMaskAnd;
                iArr43[i133] = 91;
                this.getCvrMaskAnd = i133 + 3;
                iArr43[i133 + 2] = 91;
                iArr43[i133 + 1] = iArr43[i133 - 1];
                return 0;
            case 55:
                int[] iArr44 = this.getCiacDecline;
                int i134 = this.getCvrMaskAnd;
                int i135 = i134 - 1;
                int i136 = iArr44[i135];
                iArr44[i134] = i136;
                int i137 = i134 - 2;
                iArr44[i135] = iArr44[i137];
                int i138 = i134 - 3;
                iArr44[i137] = iArr44[i138];
                iArr44[i138] = i136;
                this.getCardLayoutDescription[i134] = null;
                this.getCvrMaskAnd = i135;
                iArr44[i137] = iArr44[i137] ^ iArr44[i135];
                return 0;
            case 56:
                int[] iArr45 = this.getCiacDecline;
                int i139 = this.getCvrMaskAnd;
                int i140 = i139 + 1;
                iArr45[i139] = iArr45[i139 - 1];
                iArr45[i140] = 128;
                this.getCvrMaskAnd = i140;
                iArr45[i139] = iArr45[i139] % 128;
                return 0;
            case 57:
                int[] iArr46 = this.getCiacDecline;
                int i141 = this.getCvrMaskAnd;
                iArr46[i141] = 2;
                this.getCvrMaskAnd = i141;
                int i142 = i141 - 1;
                iArr46[i142] = iArr46[i142] % 2;
                return 0;
            case 58:
                int[] iArr47 = this.getCiacDecline;
                int i143 = this.getCvrMaskAnd;
                int i144 = i143 + 1;
                iArr47[i143] = 72;
                iArr47[i144] = 0;
                this.getCvrMaskAnd = i144;
                iArr47[i143] = iArr47[i143] / 0;
                return 0;
            case 59:
                int[] iArr48 = this.getCiacDecline;
                int i145 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i145 + 1;
                iArr48[i145] = 23;
                return 0;
            case 60:
                int[] iArr49 = this.getCiacDecline;
                int i146 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i146 + 1;
                iArr49[i146] = 55;
                return 0;
            case 61:
                java.lang.Object[] objArr7 = this.getCardLayoutDescription;
                int i147 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i147 + 1;
                objArr7[i147] = objArr7[8];
                return 0;
            case 62:
                int[] iArr50 = this.getCiacDecline;
                int i148 = this.getCvrMaskAnd;
                iArr50[i148] = 45;
                this.getCvrMaskAnd = i148 + 3;
                iArr50[i148 + 2] = 45;
                iArr50[i148 + 1] = iArr50[i148 - 1];
                return 0;
            case 63:
                int[] iArr51 = this.getCiacDecline;
                int i149 = this.getCvrMaskAnd;
                iArr51[i149 + 1] = iArr51[i149 - 1];
                iArr51[i149] = iArr51[i149 - 2];
                this.getCvrMaskAnd = i149 + 3;
                iArr51[i149 + 2] = -1;
                return 0;
            case 64:
                int i150 = this.getCvrMaskAnd;
                int i151 = i150 - 1;
                int[] iArr52 = this.getCiacDecline;
                int i152 = i150 - 2;
                int i153 = iArr52[i152] ^ iArr52[i151];
                iArr52[i152] = i153;
                this.getCvrMaskAnd = i150;
                iArr52[i151] = i153;
                int i154 = i150 - 3;
                iArr52[i152] = iArr52[i154];
                int i155 = i150 - 4;
                iArr52[i154] = iArr52[i155];
                iArr52[i155] = i153;
                return 0;
            case 65:
                int i156 = this.getCvrMaskAnd;
                this.getCardLayoutDescription[i156 - 1] = null;
                int i157 = i156 - 2;
                this.getCvrMaskAnd = i157;
                int[] iArr53 = this.getCiacDecline;
                int i158 = i156 - 3;
                iArr53[i158] = iArr53[i157] & iArr53[i158];
                return 0;
            case 66:
                int i159 = this.getCvrMaskAnd;
                int i160 = i159 - 1;
                this.getCvrMaskAnd = i160;
                int[] iArr54 = this.getCiacDecline;
                int i161 = i159 - 2;
                int i162 = iArr54[i160] | iArr54[i161];
                iArr54[i161] = i162;
                iArr54[i161] = -i162;
                return 0;
            case 67:
                int[] iArr55 = this.getCiacDecline;
                int i163 = this.getCvrMaskAnd;
                int i164 = i163 - 1;
                int i165 = -iArr55[i164];
                iArr55[i164] = i165;
                int i166 = i163 - 2;
                int i167 = i165 ^ iArr55[i166];
                iArr55[i166] = i167;
                this.getCvrMaskAnd = i163;
                iArr55[i164] = i167;
                int i168 = i163 - 3;
                iArr55[i166] = iArr55[i168];
                int i169 = i163 - 4;
                iArr55[i168] = iArr55[i169];
                iArr55[i169] = i167;
                return 0;
            case 68:
                int i170 = this.getCvrMaskAnd;
                int i171 = i170 - 1;
                this.getCvrMaskAnd = i171;
                this.getCardLayoutDescription[i171] = null;
                int[] iArr56 = this.getCiacDecline;
                int i172 = i170 - 2;
                iArr56[i172] = -iArr56[i172];
                return 0;
            case 69:
                int i173 = this.getCvrMaskAnd;
                int i174 = i173 - 1;
                int[] iArr57 = this.getCiacDecline;
                int i175 = i173 - 2;
                iArr57[i175] = iArr57[i175] & iArr57[i174];
                iArr57[i174] = 1;
                this.getCvrMaskAnd = i174;
                iArr57[i175] = iArr57[i175] << 1;
                return 0;
            case 70:
                int i176 = this.getCvrMaskAnd;
                int i177 = i176 - 1;
                int[] iArr58 = this.getCiacDecline;
                int i178 = i176 - 2;
                int i179 = iArr58[i178] + iArr58[i177];
                iArr58[i178] = i179;
                iArr58[i177] = i179;
                this.getCvrMaskAnd = i176 + 1;
                iArr58[i176] = 128;
                return 0;
            case 71:
                int[] iArr59 = this.getCiacDecline;
                int i180 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i180 + 1;
                iArr59[i180] = 89;
                return 0;
            case 72:
                int[] iArr60 = this.getCiacDecline;
                int i181 = this.getCvrMaskAnd;
                int i182 = i181 + 1;
                iArr60[i182] = iArr60[i181 - 1];
                iArr60[i181] = iArr60[i181 - 2];
                this.getCvrMaskAnd = i181 + 4;
                iArr60[i181 + 3] = iArr60[i182];
                iArr60[i181 + 2] = iArr60[i181];
                return 0;
            case 73:
                int i183 = this.getCvrMaskAnd;
                int[] iArr61 = this.getCiacDecline;
                int i184 = i183 - 2;
                int i185 = iArr61[i183 - 1] ^ iArr61[i184];
                iArr61[i184] = i185;
                int i186 = i183 - 3;
                iArr61[i186] = i185 ^ iArr61[i186];
                int i187 = i183 - 3;
                this.getCvrMaskAnd = i187;
                this.getCardLayoutDescription[i187] = null;
                return 0;
            case 74:
                int[] iArr62 = this.getCiacDecline;
                int i188 = this.getCvrMaskAnd;
                int i189 = i188 + 1;
                iArr62[i189] = iArr62[i188 - 1];
                int i190 = iArr62[i188 - 2];
                iArr62[i188] = i190;
                this.getCvrMaskAnd = i189;
                iArr62[i188] = iArr62[i189] ^ i190;
                return 0;
            case 75:
                int[] iArr63 = this.getCiacDecline;
                int i191 = this.getCvrMaskAnd;
                int i192 = i191 - 1;
                int i193 = iArr63[i192];
                iArr63[i191] = i193;
                int i194 = i191 - 2;
                iArr63[i192] = iArr63[i194];
                int i195 = i191 - 3;
                iArr63[i194] = iArr63[i195];
                iArr63[i195] = i193;
                this.getCardLayoutDescription[i191] = null;
                this.getCvrMaskAnd = i192;
                iArr63[i194] = iArr63[i194] & iArr63[i192];
                return 0;
            case 76:
                int i196 = this.getCvrMaskAnd;
                this.getCardLayoutDescription[i196 - 1] = null;
                int[] iArr64 = this.getCiacDecline;
                int i197 = i196 - 2;
                int i198 = -iArr64[i197];
                iArr64[i197] = i198;
                this.getCvrMaskAnd = i197;
                int i199 = i196 - 3;
                iArr64[i199] = iArr64[i199] & i198;
                return 0;
            case 77:
                int i200 = this.getCvrMaskAnd;
                int i201 = i200 - 1;
                int[] iArr65 = this.getCiacDecline;
                int i202 = i200 - 2;
                int i203 = iArr65[i202] << iArr65[i201];
                iArr65[i202] = i203;
                int i204 = i200 - 3;
                int i205 = iArr65[i204] + i203;
                iArr65[i204] = i205;
                this.getCvrMaskAnd = i201;
                iArr65[i202] = i205;
                return 0;
            case 78:
                int[] iArr66 = this.getCiacDecline;
                int i206 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i206 + 1;
                iArr66[i206] = 87;
                return 0;
            case 79:
                int[] iArr67 = this.getCiacDecline;
                int i207 = this.getCvrMaskAnd;
                int i208 = i207 + 1;
                iArr67[i207] = iArr67[i207 - 1];
                iArr67[i208] = -1;
                this.getCvrMaskAnd = i208;
                iArr67[i207] = iArr67[i207] ^ (-1);
                return 0;
            case 80:
                int[] iArr68 = this.getCiacDecline;
                int i209 = this.getCvrMaskAnd;
                int i210 = i209 - 1;
                int i211 = iArr68[i210];
                int i212 = i209 - 2;
                iArr68[i210] = iArr68[i212];
                iArr68[i212] = i211;
                this.getCardLayoutDescription[i210] = null;
                this.getCvrMaskAnd = i212;
                int i213 = i209 - 3;
                iArr68[i213] = iArr68[i213] - i211;
                return 0;
            case 81:
                int[] iArr69 = this.getCiacDecline;
                int i214 = this.getCvrMaskAnd;
                iArr69[i214] = 1;
                int i215 = i214 - 1;
                int i216 = iArr69[i215] - 1;
                iArr69[i215] = i216;
                this.getCvrMaskAnd = i214 + 1;
                iArr69[i214] = i216;
                return 0;
            case 82:
                int[] iArr70 = this.getCiacDecline;
                int i217 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i217 + 1;
                iArr70[i217] = 71;
                iArr70[i217] = -71;
                return 0;
            case 83:
                int[] iArr71 = this.getCiacDecline;
                int i218 = this.getCvrMaskAnd;
                int i219 = i218 - 1;
                int i220 = -iArr71[i219];
                iArr71[i219] = i220;
                int i221 = i218 + 1;
                iArr71[i221] = i220;
                int i222 = iArr71[i218 - 2];
                iArr71[i218] = i222;
                this.getCvrMaskAnd = i221;
                iArr71[i218] = iArr71[i221] & i222;
                return 0;
            case 84:
                int[] iArr72 = this.getCiacDecline;
                int i223 = this.getCvrMaskAnd;
                iArr72[i223] = -1;
                this.getCvrMaskAnd = i223;
                int i224 = i223 - 1;
                iArr72[i224] = iArr72[i224] ^ (-1);
                return 0;
            case 85:
                int[] iArr73 = this.getCiacDecline;
                int i225 = this.getCvrMaskAnd;
                int i226 = i225 + 2;
                int i227 = i225 + 1;
                iArr73[i227] = iArr73[i225 - 1];
                iArr73[i225] = iArr73[i225 - 2];
                iArr73[i226] = -1;
                this.getCvrMaskAnd = i226;
                iArr73[i227] = iArr73[i227] ^ (-1);
                return 0;
            case 86:
                int i228 = this.getCvrMaskAnd;
                int i229 = i228 - 1;
                int[] iArr74 = this.getCiacDecline;
                int i230 = i228 - 2;
                iArr74[i230] = iArr74[i230] & iArr74[i229];
                this.getCvrMaskAnd = i228;
                iArr74[i229] = 1;
                return 0;
            case 87:
                int i231 = this.getCvrMaskAnd;
                int i232 = i231 - 1;
                this.getCvrMaskAnd = i232;
                int[] iArr75 = this.getCiacDecline;
                int i233 = i231 - 2;
                iArr75[i233] = iArr75[i233] << iArr75[i232];
                return 0;
            case 88:
                int[] iArr76 = this.getCiacDecline;
                int i234 = this.getCvrMaskAnd;
                int i235 = i234 + 1;
                int i236 = i234 - 1;
                iArr76[i235] = iArr76[i236];
                int i237 = i234 - 2;
                int i238 = iArr76[i237];
                iArr76[i234] = i238;
                int i239 = i238 ^ iArr76[i235];
                iArr76[i234] = i239;
                this.getCvrMaskAnd = i234 + 2;
                iArr76[i235] = i239;
                iArr76[i234] = iArr76[i236];
                iArr76[i236] = iArr76[i237];
                iArr76[i237] = i239;
                return 0;
            case 89:
                int[] iArr77 = this.getCiacDecline;
                int i240 = this.getCvrMaskAnd;
                iArr77[i240] = 1;
                int i241 = i240 - 1;
                int i242 = iArr77[i241] << 1;
                iArr77[i241] = i242;
                this.getCvrMaskAnd = i241;
                int i243 = i240 - 2;
                iArr77[i243] = iArr77[i243] + i242;
                return 0;
            case 90:
                int[] iArr78 = this.getCiacDecline;
                int i244 = this.getCvrMaskAnd;
                iArr78[i244] = 8;
                this.getCvrMaskAnd = i244 + 2;
                iArr78[i244 + 1] = 0;
                return 0;
            case 91:
                int i245 = this.getCvrMaskAnd;
                int i246 = i245 - 1;
                this.getCvrMaskAnd = i246;
                int[] iArr79 = this.getCiacDecline;
                int i247 = i245 - 2;
                iArr79[i247] = iArr79[i247] / iArr79[i246];
                return 0;
            case 92:
                int[] iArr80 = this.getCiacDecline;
                int i248 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i248 + 1;
                iArr80[i248] = 92;
                return 0;
            case 93:
                int[] iArr81 = this.getCiacDecline;
                int i249 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i249 + 1;
                iArr81[i249] = 80;
                return 0;
            default:
                return i;
        }
    }

    public setClipToPadding(java.lang.Object obj) {
        this.getCiacDecline = new int[9];
        this.getGpoResponse = new long[9];
        this.getPaymentFci = new float[9];
        this.getApplicationLifeCycleData = new double[9];
        java.lang.Object[] objArr = new java.lang.Object[9];
        this.getCardLayoutDescription = objArr;
        objArr[8] = obj;
        this.getCvrMaskAnd = 0;
        this.SdkCoreBusinessLogicModuleImpl = -1;
    }

    public setClipToPadding() {
        this.getCiacDecline = new int[9];
        this.getGpoResponse = new long[9];
        this.getPaymentFci = new float[9];
        this.getApplicationLifeCycleData = new double[9];
        this.getCardLayoutDescription = new java.lang.Object[9];
        this.getCvrMaskAnd = 0;
        this.SdkCoreBusinessLogicModuleImpl = -1;
    }
}

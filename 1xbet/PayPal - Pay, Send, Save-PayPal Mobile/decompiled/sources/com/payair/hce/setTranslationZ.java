package com.payair.hce;

/* loaded from: classes4.dex */
public class setTranslationZ {
    public int AlternateContactlessPaymentDataJson;
    public int DigitizedCardProfile;
    public java.lang.Object IccPrivateKeyCrtComponentsJson;
    public double RecordsJson;
    public float SdkCoreAlternateContactlessPaymentDataImpl;
    public double getAid;
    public java.lang.Object getProfileVersion;
    public long valueOf;
    public float values;
    public long writeReplace;
    private final int[] getGpoResponse = new int[35];
    private final long[] SdkCoreBusinessLogicModuleImpl = new long[35];
    private final float[] getCvrMaskAnd = new float[35];
    private final double[] getDualTapResetTimeout = new double[35];
    private final java.lang.Object[] getCardLayoutDescription = new java.lang.Object[35];
    private int getCiacDecline = 0;
    private int getPaymentFci = -1;

    public int AlternateContactlessPaymentDataJson(int i) {
        switch (i) {
            case 1:
                java.lang.Object[] objArr = this.getCardLayoutDescription;
                int i2 = this.getCiacDecline;
                this.getCiacDecline = i2 + 1;
                objArr[i2] = this.IccPrivateKeyCrtComponentsJson;
                return 0;
            case 2:
                int[] iArr = this.getGpoResponse;
                int i3 = this.getCiacDecline;
                this.getCiacDecline = i3 + 1;
                iArr[i3] = 1;
                return 0;
            case 3:
                int i4 = this.getCiacDecline - this.AlternateContactlessPaymentDataJson;
                this.getCiacDecline = i4;
                this.getPaymentFci = i4;
                return 0;
            case 4:
                java.lang.Object[] objArr2 = this.getCardLayoutDescription;
                int i5 = this.getPaymentFci;
                this.getPaymentFci = i5 + 1;
                java.lang.Object obj = objArr2[i5];
                objArr2[i5] = null;
                this.getProfileVersion = obj;
                return 0;
            case 5:
                int[] iArr2 = this.getGpoResponse;
                int i6 = this.getPaymentFci;
                this.getPaymentFci = i6 + 1;
                this.DigitizedCardProfile = iArr2[i6];
                return 0;
            case 6:
                int i7 = this.getCiacDecline - 1;
                this.getCiacDecline = i7;
                java.lang.Object[] objArr3 = this.getCardLayoutDescription;
                java.lang.Object obj2 = objArr3[i7];
                objArr3[i7] = null;
                objArr3[34] = obj2;
                return 0;
            case 7:
                int[] iArr3 = this.getGpoResponse;
                int i8 = this.getCiacDecline;
                this.getCiacDecline = i8 + 1;
                iArr3[i8] = -1;
                return 0;
            case 8:
                long[] jArr = this.SdkCoreBusinessLogicModuleImpl;
                int i9 = this.getCiacDecline;
                this.getCiacDecline = i9 + 1;
                jArr[i9] = this.valueOf;
                return 0;
            case 9:
                long[] jArr2 = this.SdkCoreBusinessLogicModuleImpl;
                int i10 = this.getCiacDecline;
                this.getCiacDecline = i10 + 1;
                jArr2[i10] = 0;
                return 0;
            case 10:
                int i11 = this.getCiacDecline;
                int i12 = i11 - 1;
                this.getCiacDecline = i12;
                int[] iArr4 = this.getGpoResponse;
                long[] jArr3 = this.SdkCoreBusinessLogicModuleImpl;
                int i13 = i11 - 2;
                iArr4[i13] = (jArr3[i13] > jArr3[i12] ? 1 : (jArr3[i13] == jArr3[i12] ? 0 : -1));
                return 0;
            case 11:
                int i14 = this.getCiacDecline;
                int i15 = i14 - 1;
                this.getCiacDecline = i15;
                int[] iArr5 = this.getGpoResponse;
                int i16 = i14 - 2;
                iArr5[i16] = iArr5[i16] + iArr5[i15];
                return 0;
            case 12:
                int i17 = this.getCiacDecline - 1;
                this.getCiacDecline = i17;
                java.lang.Object[] objArr4 = this.getCardLayoutDescription;
                java.lang.Object obj3 = objArr4[i17];
                objArr4[i17] = null;
                objArr4[14] = obj3;
                return 0;
            case 13:
                int[] iArr6 = this.getGpoResponse;
                int i18 = this.getCiacDecline;
                this.getCiacDecline = i18 + 1;
                iArr6[i18] = 0;
                return 0;
            case 14:
                int[] iArr7 = this.getGpoResponse;
                int i19 = this.getCiacDecline;
                this.getCiacDecline = i19 + 1;
                iArr7[i19] = this.AlternateContactlessPaymentDataJson;
                return 0;
            case 15:
                int i20 = this.getCiacDecline - 1;
                this.getCiacDecline = i20;
                java.lang.Object[] objArr5 = this.getCardLayoutDescription;
                java.lang.Object obj4 = objArr5[i20];
                objArr5[i20] = null;
                objArr5[15] = obj4;
                return 0;
            case 16:
                int i21 = this.getCiacDecline - 1;
                this.getCiacDecline = i21;
                java.lang.Object[] objArr6 = this.getCardLayoutDescription;
                java.lang.Object obj5 = objArr6[i21];
                objArr6[i21] = null;
                objArr6[13] = obj5;
                return 0;
            case 17:
                int[] iArr8 = this.getGpoResponse;
                int i22 = this.getCiacDecline;
                int i23 = i22 - 1;
                byte b = (byte) iArr8[i23];
                iArr8[i23] = b;
                this.getCiacDecline = i23;
                int i24 = i22 - 2;
                iArr8[i24] = iArr8[i24] - b;
                return 0;
            case 18:
                int i25 = this.getCiacDecline - 1;
                this.getCiacDecline = i25;
                java.lang.Object[] objArr7 = this.getCardLayoutDescription;
                java.lang.Object obj6 = objArr7[i25];
                objArr7[i25] = null;
                objArr7[18] = obj6;
                return 0;
            case 19:
                long[] jArr4 = this.SdkCoreBusinessLogicModuleImpl;
                int i26 = this.getCiacDecline;
                this.getCiacDecline = i26 + 1;
                jArr4[i26] = jArr4[i26 - 1];
                return 0;
            case 20:
                int i27 = this.getCiacDecline - 1;
                this.getCiacDecline = i27;
                long[] jArr5 = this.SdkCoreBusinessLogicModuleImpl;
                jArr5[10] = jArr5[i27];
                return 0;
            case 21:
                int i28 = this.getCiacDecline - 1;
                this.getCiacDecline = i28;
                this.DigitizedCardProfile = this.getGpoResponse[i28] == 0 ? 0 : 1;
                return 0;
            case 22:
                long[] jArr6 = this.SdkCoreBusinessLogicModuleImpl;
                int i29 = this.getCiacDecline;
                this.getCiacDecline = i29 + 1;
                jArr6[i29] = jArr6[10];
                return 0;
            case 23:
                int i30 = this.getCiacDecline;
                int i31 = i30 - 1;
                this.getCiacDecline = i31;
                long[] jArr7 = this.SdkCoreBusinessLogicModuleImpl;
                int i32 = i30 - 2;
                jArr7[i32] = jArr7[i32] + jArr7[i31];
                return 0;
            case 24:
                java.lang.Object[] objArr8 = this.getCardLayoutDescription;
                int i33 = this.getCiacDecline;
                this.getCiacDecline = i33 + 1;
                objArr8[i33] = objArr8[14];
                return 0;
            case 25:
                java.lang.Object[] objArr9 = this.getCardLayoutDescription;
                int i34 = this.getCiacDecline;
                this.getCiacDecline = i34 + 1;
                objArr9[i34] = objArr9[15];
                return 0;
            case 26:
                java.lang.Object[] objArr10 = this.getCardLayoutDescription;
                int i35 = this.getCiacDecline;
                this.getCiacDecline = i35 + 1;
                objArr10[i35] = null;
                return 0;
            case 27:
                int i36 = this.getCiacDecline - 1;
                this.getCiacDecline = i36;
                this.DigitizedCardProfile = this.getGpoResponse[i36] < 0 ? 0 : 1;
                return 0;
            case 28:
                int i37 = this.getCiacDecline - 1;
                this.getCiacDecline = i37;
                java.lang.Object[] objArr11 = this.getCardLayoutDescription;
                java.lang.Object obj7 = objArr11[i37];
                objArr11[i37] = null;
                objArr11[9] = obj7;
                return 0;
            case 29:
                java.lang.Object[] objArr12 = this.getCardLayoutDescription;
                int i38 = this.getCiacDecline;
                this.getCiacDecline = i38 + 1;
                objArr12[i38] = objArr12[13];
                return 0;
            case 30:
                java.lang.Object[] objArr13 = this.getCardLayoutDescription;
                int i39 = this.getCiacDecline;
                this.getCiacDecline = i39 + 1;
                objArr13[i39] = objArr13[18];
                return 0;
            case 31:
                java.lang.Object[] objArr14 = this.getCardLayoutDescription;
                int i40 = this.getCiacDecline;
                this.getCiacDecline = i40 + 1;
                objArr14[i40] = objArr14[i40 - 1];
                return 0;
            case 32:
                int i41 = this.getCiacDecline - 1;
                this.getCiacDecline = i41;
                java.lang.Object[] objArr15 = this.getCardLayoutDescription;
                java.lang.Object obj8 = objArr15[i41];
                objArr15[i41] = null;
                objArr15[11] = obj8;
                return 0;
            case 33:
                int i42 = this.getCiacDecline - 1;
                this.getCiacDecline = i42;
                java.lang.Object[] objArr16 = this.getCardLayoutDescription;
                java.lang.Object obj9 = objArr16[i42];
                objArr16[i42] = null;
                this.DigitizedCardProfile = obj9 == null ? 0 : 1;
                return 0;
            case 34:
                java.lang.Object[] objArr17 = this.getCardLayoutDescription;
                int i43 = this.getCiacDecline;
                this.getCiacDecline = i43 + 1;
                objArr17[i43] = objArr17[11];
                return 0;
            case 35:
                java.lang.Object[] objArr18 = this.getCardLayoutDescription;
                int i44 = this.getCiacDecline;
                int i45 = i44 - 1;
                java.lang.Object obj10 = objArr18[i45];
                objArr18[i45] = null;
                int i46 = i44 - 2;
                java.lang.Object obj11 = objArr18[i46];
                objArr18[i46] = null;
                objArr18[i45] = obj11;
                objArr18[i46] = obj10;
                return 0;
            case 36:
                int i47 = this.getCiacDecline - 1;
                this.getCiacDecline = i47;
                this.getCardLayoutDescription[i47] = null;
                return 0;
            case 37:
                java.lang.Object[] objArr19 = this.getCardLayoutDescription;
                int i48 = this.getCiacDecline - 1;
                java.lang.Object obj12 = objArr19[i48];
                objArr19[i48] = null;
                this.getProfileVersion = obj12;
                return 0;
            case 38:
                int[] iArr9 = this.getGpoResponse;
                int i49 = this.getCiacDecline;
                this.getCiacDecline = i49 + 1;
                iArr9[i49] = 4;
                return 0;
            case 39:
                java.lang.Object[] objArr20 = this.getCardLayoutDescription;
                int i50 = this.getCiacDecline;
                this.getCiacDecline = i50 + 1;
                int i51 = i50 - 1;
                java.lang.Object obj13 = objArr20[i51];
                objArr20[i51] = null;
                objArr20[i50] = obj13;
                int[] iArr10 = this.getGpoResponse;
                int i52 = i50 - 2;
                iArr10[i51] = iArr10[i52];
                objArr20[i52] = obj13;
                return 0;
            case 40:
                int[] iArr11 = this.getGpoResponse;
                int i53 = this.getCiacDecline;
                int i54 = i53 - 1;
                int i55 = i53 - 2;
                iArr11[i54] = iArr11[i55];
                java.lang.Object[] objArr21 = this.getCardLayoutDescription;
                java.lang.Object obj14 = objArr21[i54];
                objArr21[i54] = null;
                objArr21[i55] = obj14;
                return 0;
            case 41:
                int[] iArr12 = this.getGpoResponse;
                int i56 = this.getCiacDecline;
                this.getCiacDecline = i56 + 1;
                iArr12[i56] = 3;
                return 0;
            case 42:
                java.lang.Object[] objArr22 = this.getCardLayoutDescription;
                int i57 = this.getCiacDecline;
                int i58 = i57 - 2;
                java.lang.Object obj15 = objArr22[i58];
                objArr22[i58] = null;
                int i59 = i57 - 1;
                objArr22[i59] = obj15;
                int[] iArr13 = this.getGpoResponse;
                iArr13[i58] = iArr13[i59];
                return 0;
            case 43:
                int i60 = this.getCiacDecline;
                int i61 = i60 - 3;
                this.getCiacDecline = i61;
                java.lang.Object[] objArr23 = this.getCardLayoutDescription;
                java.lang.Object obj16 = objArr23[i61];
                objArr23[i61] = null;
                int i62 = this.getGpoResponse[i60 - 2];
                int i63 = i60 - 1;
                java.lang.Object obj17 = objArr23[i63];
                objArr23[i63] = null;
                ((java.lang.Object[]) obj16)[i62] = obj17;
                return 0;
            case 44:
                int[] iArr14 = this.getGpoResponse;
                int i64 = this.getCiacDecline;
                this.getCiacDecline = i64 + 1;
                iArr14[i64] = 2;
                java.lang.Object[] objArr24 = this.getCardLayoutDescription;
                int i65 = i64 - 1;
                java.lang.Object obj18 = objArr24[i65];
                objArr24[i65] = null;
                objArr24[i64] = obj18;
                iArr14[i65] = 2;
                return 0;
            case 45:
                int i66 = this.getCiacDecline;
                int i67 = i66 - 3;
                this.getCiacDecline = i67;
                java.lang.Object[] objArr25 = this.getCardLayoutDescription;
                java.lang.Object obj19 = objArr25[i67];
                objArr25[i67] = null;
                int[] iArr15 = this.getGpoResponse;
                int i68 = i66 - 2;
                int i69 = iArr15[i68];
                int i70 = i66 - 1;
                java.lang.Object obj20 = objArr25[i70];
                objArr25[i70] = null;
                ((java.lang.Object[]) obj19)[i69] = obj20;
                this.getCiacDecline = i68;
                int i71 = i66 - 4;
                java.lang.Object obj21 = objArr25[i71];
                objArr25[i71] = null;
                objArr25[i67] = obj21;
                int i72 = i66 - 5;
                int i73 = iArr15[i72];
                iArr15[i71] = i73;
                objArr25[i72] = obj21;
                iArr15[i67] = i73;
                java.lang.Object obj22 = objArr25[i67];
                objArr25[i67] = null;
                objArr25[i71] = obj22;
                return 0;
            case 46:
                java.lang.Object[] objArr26 = this.getCardLayoutDescription;
                int i74 = this.getCiacDecline;
                int i75 = i74 - 2;
                java.lang.Object obj23 = objArr26[i75];
                objArr26[i75] = null;
                int i76 = i74 - 1;
                objArr26[i76] = obj23;
                int[] iArr16 = this.getGpoResponse;
                int i77 = iArr16[i76];
                iArr16[i75] = i77;
                int i78 = i74 - 3;
                this.getCiacDecline = i78;
                java.lang.Object obj24 = objArr26[i78];
                objArr26[i78] = null;
                java.lang.Object obj25 = objArr26[i76];
                objArr26[i76] = null;
                ((java.lang.Object[]) obj24)[i77] = obj25;
                return 0;
            case 47:
                java.lang.Object[] objArr27 = this.getCardLayoutDescription;
                int i79 = this.getCiacDecline;
                int i80 = i79 - 1;
                java.lang.Object obj26 = objArr27[i80];
                objArr27[i80] = null;
                objArr27[i79] = obj26;
                int i81 = i79 - 2;
                java.lang.Object obj27 = objArr27[i81];
                objArr27[i81] = null;
                objArr27[i80] = obj27;
                objArr27[i81] = obj26;
                java.lang.Object obj28 = objArr27[i79];
                objArr27[i79] = null;
                java.lang.Object obj29 = objArr27[i80];
                objArr27[i80] = null;
                objArr27[i79] = obj29;
                objArr27[i80] = obj28;
                int[] iArr17 = this.getGpoResponse;
                this.getCiacDecline = i79 + 2;
                iArr17[i79 + 1] = 0;
                return 0;
            case 48:
                java.lang.Object[] objArr28 = this.getCardLayoutDescription;
                int i82 = this.getCiacDecline;
                objArr28[i82] = objArr28[i82 - 1];
                int[] iArr18 = this.getGpoResponse;
                this.getCiacDecline = i82 + 2;
                iArr18[i82 + 1] = 0;
                return 0;
            case 49:
                java.lang.Object[] objArr29 = this.getCardLayoutDescription;
                int i83 = this.getCiacDecline;
                this.getCiacDecline = i83 + 1;
                objArr29[i83] = objArr29[34];
                return 0;
            case 50:
                int i84 = this.getCiacDecline;
                int i85 = i84 - 3;
                this.getCiacDecline = i85;
                java.lang.Object[] objArr30 = this.getCardLayoutDescription;
                java.lang.Object obj30 = objArr30[i85];
                objArr30[i85] = null;
                int[] iArr19 = this.getGpoResponse;
                int i86 = i84 - 2;
                int i87 = iArr19[i86];
                int i88 = i84 - 1;
                java.lang.Object obj31 = objArr30[i88];
                objArr30[i88] = null;
                ((java.lang.Object[]) obj30)[i87] = obj31;
                objArr30[i85] = objArr30[i84 - 4];
                this.getCiacDecline = i88;
                iArr19[i86] = 1;
                return 0;
            case 51:
                int i89 = this.getCiacDecline;
                int i90 = i89 - 3;
                this.getCiacDecline = i90;
                java.lang.Object[] objArr31 = this.getCardLayoutDescription;
                java.lang.Object obj32 = objArr31[i90];
                objArr31[i90] = null;
                int i91 = i89 - 2;
                int i92 = this.getGpoResponse[i91];
                int i93 = i89 - 1;
                java.lang.Object obj33 = objArr31[i93];
                objArr31[i93] = null;
                ((java.lang.Object[]) obj32)[i92] = obj33;
                this.getCiacDecline = i91;
                objArr31[i90] = objArr31[i89 - 4];
                return 0;
            case 52:
                int[] iArr20 = this.getGpoResponse;
                int i94 = this.getCiacDecline;
                this.getCiacDecline = i94 + 1;
                iArr20[i94] = 2;
                return 0;
            case 53:
                int i95 = this.getCiacDecline;
                int i96 = i95 - 3;
                this.getCiacDecline = i96;
                java.lang.Object[] objArr32 = this.getCardLayoutDescription;
                java.lang.Object obj34 = objArr32[i96];
                objArr32[i96] = null;
                int[] iArr21 = this.getGpoResponse;
                int i97 = i95 - 2;
                int i98 = iArr21[i97];
                int i99 = i95 - 1;
                java.lang.Object obj35 = objArr32[i99];
                objArr32[i99] = null;
                ((java.lang.Object[]) obj34)[i98] = obj35;
                objArr32[i96] = objArr32[i95 - 4];
                this.getCiacDecline = i99;
                iArr21[i97] = 3;
                return 0;
            case 54:
                java.lang.Object[] objArr33 = this.getCardLayoutDescription;
                int i100 = this.getCiacDecline;
                this.getCiacDecline = i100 + 1;
                objArr33[i100] = null;
                objArr33[i100] = null;
                int i101 = i100 - 1;
                java.lang.Object obj36 = objArr33[i101];
                objArr33[i101] = null;
                objArr33[i100] = obj36;
                objArr33[i101] = null;
                return 0;
            case 55:
                java.lang.Object[] objArr34 = this.getCardLayoutDescription;
                int i102 = this.getCiacDecline;
                java.lang.Object obj37 = objArr34[i102 - 1];
                objArr34[i102] = obj37;
                this.getCiacDecline = i102;
                objArr34[i102] = null;
                objArr34[9] = obj37;
                return 0;
            case 56:
                java.lang.Object[] objArr35 = this.getCardLayoutDescription;
                int i103 = this.getCiacDecline;
                objArr35[i103] = null;
                int[] iArr22 = this.getGpoResponse;
                this.getCiacDecline = i103 + 2;
                iArr22[i103 + 1] = 0;
                return 0;
            case 57:
                long[] jArr8 = this.SdkCoreBusinessLogicModuleImpl;
                int i104 = this.getPaymentFci;
                this.getPaymentFci = i104 + 1;
                this.writeReplace = jArr8[i104];
                return 0;
            case 58:
                int i105 = this.getCiacDecline;
                int i106 = i105 - 1;
                java.lang.Object[] objArr36 = this.getCardLayoutDescription;
                java.lang.Object obj38 = objArr36[i106];
                objArr36[i106] = null;
                objArr36[33] = obj38;
                int i107 = i105 - 2;
                this.getCiacDecline = i107;
                objArr36[i107] = null;
                return 0;
            case 59:
                int i108 = this.getCiacDecline;
                int i109 = i108 - 1;
                java.lang.Object[] objArr37 = this.getCardLayoutDescription;
                objArr37[i109] = null;
                int i110 = i108 - 2;
                objArr37[i110] = null;
                this.getCiacDecline = i109;
                objArr37[i110] = objArr37[33];
                return 0;
            case 60:
                java.lang.Object[] objArr38 = this.getCardLayoutDescription;
                int i111 = this.getCiacDecline;
                this.getCiacDecline = i111 + 1;
                objArr38[i111] = objArr38[33];
                return 0;
            case 61:
                java.lang.Object[] objArr39 = this.getCardLayoutDescription;
                int i112 = this.getCiacDecline;
                objArr39[i112] = objArr39[9];
                int[] iArr23 = this.getGpoResponse;
                this.getCiacDecline = i112 + 2;
                iArr23[i112 + 1] = 1;
                return 0;
            case 62:
                int i113 = this.getCiacDecline;
                int i114 = i113 - 1;
                this.getCiacDecline = i114;
                java.lang.Object[] objArr40 = this.getCardLayoutDescription;
                int i115 = i113 - 2;
                java.lang.Object obj39 = objArr40[i115];
                objArr40[i115] = null;
                objArr40[i115] = ((java.lang.Object[]) obj39)[this.getGpoResponse[i114]];
                return 0;
            case 63:
                int i116 = this.getCiacDecline;
                int i117 = i116 - 1;
                this.getCiacDecline = i117;
                int[] iArr24 = this.getGpoResponse;
                java.lang.Object[] objArr41 = this.getCardLayoutDescription;
                int i118 = i116 - 2;
                java.lang.Object obj40 = objArr41[i118];
                objArr41[i118] = null;
                iArr24[i118] = ((int[]) obj40)[iArr24[i117]];
                int i119 = i116 - 2;
                this.getCiacDecline = i119;
                iArr24[11] = iArr24[i119];
                return 0;
            case 64:
                java.lang.Object[] objArr42 = this.getCardLayoutDescription;
                int i120 = this.getCiacDecline;
                int i121 = i120 + 1;
                java.lang.Object obj41 = objArr42[9];
                objArr42[i120] = obj41;
                this.getGpoResponse[i121] = 0;
                this.getCiacDecline = i121;
                objArr42[i120] = null;
                objArr42[i120] = ((java.lang.Object[]) obj41)[0];
                return 0;
            case 65:
                int[] iArr25 = this.getGpoResponse;
                int i122 = this.getCiacDecline;
                iArr25[i122] = 0;
                this.getCiacDecline = i122;
                java.lang.Object[] objArr43 = this.getCardLayoutDescription;
                int i123 = i122 - 1;
                java.lang.Object obj42 = objArr43[i123];
                objArr43[i123] = null;
                iArr25[i123] = ((int[]) obj42)[0];
                return 0;
            case 66:
                int[] iArr26 = this.getGpoResponse;
                int i124 = this.getCiacDecline;
                int i125 = iArr26[i124 - 1];
                iArr26[i124] = i125;
                iArr26[10] = i125;
                this.getCiacDecline = i124 + 1;
                iArr26[i124] = iArr26[11];
                return 0;
            case 67:
                int i126 = this.getCiacDecline;
                int i127 = i126 - 2;
                this.getCiacDecline = i127;
                int[] iArr27 = this.getGpoResponse;
                this.DigitizedCardProfile = iArr27[i127] != iArr27[i126 - 1] ? 0 : 1;
                return 0;
            case 68:
                java.lang.Object[] objArr44 = this.getCardLayoutDescription;
                int i128 = this.getCiacDecline;
                this.getCiacDecline = i128 + 1;
                objArr44[i128] = objArr44[9];
                return 0;
            case 69:
                java.lang.Object[] objArr45 = this.getCardLayoutDescription;
                int i129 = this.getCiacDecline;
                int i130 = i129 + 1;
                java.lang.Object obj43 = objArr45[i129 - 1];
                objArr45[i129] = obj43;
                this.getGpoResponse[i130] = 4;
                this.getCiacDecline = i130;
                objArr45[i129] = null;
                objArr45[i129] = ((java.lang.Object[]) obj43)[4];
                return 0;
            case 70:
                java.lang.Object[] objArr46 = this.getCardLayoutDescription;
                int i131 = this.getCiacDecline;
                java.lang.Object obj44 = objArr46[i131 - 1];
                objArr46[i131] = obj44;
                objArr46[i131] = null;
                objArr46[12] = obj44;
                this.getCiacDecline = i131 + 1;
                objArr46[i131] = objArr46[9];
                return 0;
            case 71:
                int i132 = this.getCiacDecline;
                int i133 = i132 - 1;
                java.lang.Object[] objArr47 = this.getCardLayoutDescription;
                objArr47[i133] = null;
                objArr47[i133] = objArr47[12];
                this.getCiacDecline = i132 + 1;
                objArr47[i132] = objArr47[9];
                return 0;
            case 72:
                int[] iArr28 = this.getGpoResponse;
                int i134 = this.getCiacDecline;
                this.getCiacDecline = i134 + 1;
                iArr28[i134] = iArr28[11];
                return 0;
            case 73:
                int[] iArr29 = this.getGpoResponse;
                int i135 = this.getCiacDecline;
                int i136 = iArr29[10];
                iArr29[i135] = i136;
                this.getCiacDecline = i135;
                int i137 = i135 - 1;
                int i138 = iArr29[i137] ^ i136;
                iArr29[i137] = i138;
                this.SdkCoreBusinessLogicModuleImpl[i137] = i138;
                return 0;
            case 74:
                int i139 = this.getCiacDecline;
                int i140 = i139 - 1;
                this.getCiacDecline = i140;
                long[] jArr9 = this.SdkCoreBusinessLogicModuleImpl;
                int i141 = i139 - 2;
                jArr9[i141] = jArr9[i141] ^ jArr9[i140];
                return 0;
            case 75:
                java.lang.Object[] objArr48 = this.getCardLayoutDescription;
                int i142 = this.getCiacDecline;
                this.getCiacDecline = i142 + 1;
                int i143 = i142 - 1;
                java.lang.Object obj45 = objArr48[i143];
                objArr48[i143] = null;
                objArr48[i142] = obj45;
                long[] jArr10 = this.SdkCoreBusinessLogicModuleImpl;
                int i144 = i142 - 2;
                jArr10[i143] = jArr10[i144];
                objArr48[i144] = obj45;
                return 0;
            case 76:
                java.lang.Object[] objArr49 = this.getCardLayoutDescription;
                int i145 = this.getCiacDecline;
                int i146 = i145 - 1;
                java.lang.Object obj46 = objArr49[i146];
                objArr49[i146] = null;
                int i147 = i145 - 2;
                java.lang.Object obj47 = objArr49[i147];
                objArr49[i147] = null;
                objArr49[i146] = obj47;
                objArr49[i147] = obj46;
                this.getCiacDecline = i145 + 1;
                java.lang.Object obj48 = objArr49[i146];
                objArr49[i146] = null;
                objArr49[i145] = obj48;
                java.lang.Object obj49 = objArr49[i147];
                objArr49[i147] = null;
                objArr49[i146] = obj49;
                objArr49[i147] = obj48;
                return 0;
            case 77:
                java.lang.Object[] objArr50 = this.getCardLayoutDescription;
                int i148 = this.getCiacDecline;
                int i149 = i148 - 1;
                java.lang.Object obj50 = objArr50[i149];
                objArr50[i149] = null;
                objArr50[i148] = obj50;
                long[] jArr11 = this.SdkCoreBusinessLogicModuleImpl;
                int i150 = i148 - 2;
                jArr11[i149] = jArr11[i150];
                objArr50[i150] = obj50;
                this.getCiacDecline = i148;
                objArr50[i148] = null;
                return 0;
            case 78:
                java.lang.Object[] objArr51 = this.getCardLayoutDescription;
                int i151 = this.getCiacDecline;
                int i152 = i151 - 1;
                java.lang.Object obj51 = objArr51[i152];
                objArr51[i152] = null;
                int i153 = i151 - 2;
                java.lang.Object obj52 = objArr51[i153];
                objArr51[i153] = null;
                objArr51[i152] = obj52;
                objArr51[i153] = obj51;
                this.getCiacDecline = i151 + 1;
                java.lang.Object obj53 = objArr51[i152];
                objArr51[i152] = null;
                objArr51[i151] = obj53;
                java.lang.Object obj54 = objArr51[i153];
                objArr51[i153] = null;
                objArr51[i152] = obj54;
                objArr51[i153] = obj53;
                java.lang.Object obj55 = objArr51[i151];
                objArr51[i151] = null;
                java.lang.Object obj56 = objArr51[i152];
                objArr51[i152] = null;
                objArr51[i151] = obj56;
                objArr51[i152] = obj55;
                return 0;
            case 79:
                int[] iArr30 = this.getGpoResponse;
                int i154 = this.getCiacDecline;
                this.getCiacDecline = i154 + 1;
                iArr30[i154] = 0;
                java.lang.Object[] objArr52 = this.getCardLayoutDescription;
                int i155 = i154 - 1;
                java.lang.Object obj57 = objArr52[i155];
                objArr52[i155] = null;
                objArr52[i154] = obj57;
                iArr30[i155] = 0;
                return 0;
            case 80:
                java.lang.Object[] objArr53 = this.getCardLayoutDescription;
                int i156 = this.getCiacDecline;
                objArr53[i156] = objArr53[i156 - 1];
                int[] iArr31 = this.getGpoResponse;
                this.getCiacDecline = i156 + 2;
                iArr31[i156 + 1] = 1;
                return 0;
            case 81:
                java.lang.Object[] objArr54 = this.getCardLayoutDescription;
                int i157 = this.getCiacDecline;
                java.lang.Object obj58 = objArr54[9];
                objArr54[i157] = obj58;
                this.getCiacDecline = i157 + 2;
                objArr54[i157 + 1] = obj58;
                return 0;
            case 82:
                int i158 = this.getCiacDecline;
                int i159 = i158 - 1;
                this.getCiacDecline = i159;
                int[] iArr32 = this.getGpoResponse;
                java.lang.Object[] objArr55 = this.getCardLayoutDescription;
                int i160 = i158 - 2;
                java.lang.Object obj59 = objArr55[i160];
                objArr55[i160] = null;
                iArr32[i160] = ((int[]) obj59)[iArr32[i159]];
                return 0;
            case 83:
                long[] jArr12 = this.SdkCoreBusinessLogicModuleImpl;
                int i161 = this.getCiacDecline;
                long j = jArr12[i161 - 1];
                jArr12[i161] = j;
                this.getCiacDecline = i161;
                jArr12[16] = j;
                return 0;
            case 84:
                long[] jArr13 = this.SdkCoreBusinessLogicModuleImpl;
                int i162 = this.getCiacDecline;
                this.getCiacDecline = i162 + 1;
                jArr13[i162] = jArr13[16];
                return 0;
            case 85:
                java.lang.Object[] objArr56 = this.getCardLayoutDescription;
                int i163 = this.getCiacDecline;
                objArr56[i163] = objArr56[15];
                int[] iArr33 = this.getGpoResponse;
                this.getCiacDecline = i163 + 2;
                iArr33[i163 + 1] = 0;
                return 0;
            case 86:
                java.lang.Object[] objArr57 = this.getCardLayoutDescription;
                int i164 = this.getCiacDecline;
                objArr57[i164] = null;
                this.getCiacDecline = i164 + 2;
                objArr57[i164 + 1] = null;
                return 0;
            case 87:
                java.lang.Object[] objArr58 = this.getCardLayoutDescription;
                int i165 = this.getCiacDecline;
                java.lang.Object obj60 = objArr58[i165 - 1];
                objArr58[i165] = obj60;
                this.getCiacDecline = i165;
                objArr58[i165] = null;
                objArr58[17] = obj60;
                return 0;
            case 88:
                java.lang.Object[] objArr59 = this.getCardLayoutDescription;
                int i166 = this.getCiacDecline;
                this.getCiacDecline = i166 + 1;
                objArr59[i166] = objArr59[17];
                return 0;
            case 89:
                int i167 = this.getCiacDecline - 1;
                this.getCiacDecline = i167;
                java.lang.Object[] objArr60 = this.getCardLayoutDescription;
                java.lang.Object obj61 = objArr60[i167];
                objArr60[i167] = null;
                objArr60[17] = obj61;
                return 0;
            case 90:
                int[] iArr34 = this.getGpoResponse;
                int i168 = this.getCiacDecline;
                iArr34[i168] = 0;
                this.getCiacDecline = i168 + 2;
                iArr34[i168 + 1] = 0;
                return 0;
            case 91:
                java.lang.Object[] objArr61 = this.getCardLayoutDescription;
                int i169 = this.getCiacDecline;
                this.getCiacDecline = i169 + 1;
                int i170 = i169 - 1;
                java.lang.Object obj62 = objArr61[i170];
                objArr61[i170] = null;
                objArr61[i169] = obj62;
                int[] iArr35 = this.getGpoResponse;
                int i171 = i169 - 2;
                int i172 = iArr35[i171];
                iArr35[i170] = i172;
                objArr61[i171] = obj62;
                iArr35[i169] = i172;
                java.lang.Object obj63 = objArr61[i169];
                objArr61[i169] = null;
                objArr61[i170] = obj63;
                return 0;
            case 92:
                java.lang.Object[] objArr62 = this.getCardLayoutDescription;
                int i173 = this.getCiacDecline;
                int i174 = i173 - 2;
                java.lang.Object obj64 = objArr62[i174];
                objArr62[i174] = null;
                int i175 = i173 - 1;
                objArr62[i175] = obj64;
                int[] iArr36 = this.getGpoResponse;
                int i176 = iArr36[i175];
                iArr36[i174] = i176;
                int i177 = i173 - 3;
                this.getCiacDecline = i177;
                java.lang.Object obj65 = objArr62[i177];
                objArr62[i177] = null;
                java.lang.Object obj66 = objArr62[i175];
                objArr62[i175] = null;
                ((java.lang.Object[]) obj65)[i176] = obj66;
                this.getCiacDecline = i174;
                int i178 = i173 - 4;
                java.lang.Object obj67 = objArr62[i178];
                objArr62[i178] = null;
                objArr62[i177] = obj67;
                int i179 = i173 - 5;
                iArr36[i178] = iArr36[i179];
                objArr62[i179] = obj67;
                return 0;
            case 93:
                int[] iArr37 = this.getGpoResponse;
                int i180 = this.getCiacDecline;
                iArr37[i180] = 2;
                java.lang.Object[] objArr63 = this.getCardLayoutDescription;
                int i181 = i180 - 1;
                java.lang.Object obj68 = objArr63[i181];
                objArr63[i181] = null;
                objArr63[i180] = obj68;
                iArr37[i181] = 2;
                int i182 = i180 - 2;
                this.getCiacDecline = i182;
                java.lang.Object obj69 = objArr63[i182];
                objArr63[i182] = null;
                java.lang.Object obj70 = objArr63[i180];
                objArr63[i180] = null;
                ((java.lang.Object[]) obj69)[2] = obj70;
                return 0;
            case 94:
                int[] iArr38 = this.getGpoResponse;
                int i183 = this.getCiacDecline;
                iArr38[i183] = 1;
                java.lang.Object[] objArr64 = this.getCardLayoutDescription;
                int i184 = i183 - 1;
                java.lang.Object obj71 = objArr64[i184];
                objArr64[i184] = null;
                objArr64[i183] = obj71;
                iArr38[i184] = 1;
                int i185 = i183 - 2;
                this.getCiacDecline = i185;
                java.lang.Object obj72 = objArr64[i185];
                objArr64[i185] = null;
                java.lang.Object obj73 = objArr64[i183];
                objArr64[i183] = null;
                ((java.lang.Object[]) obj72)[1] = obj73;
                return 0;
            case 95:
                java.lang.Object[] objArr65 = this.getCardLayoutDescription;
                int i186 = this.getCiacDecline;
                this.getCiacDecline = i186 + 1;
                int i187 = i186 - 1;
                java.lang.Object obj74 = objArr65[i187];
                objArr65[i187] = null;
                objArr65[i186] = obj74;
                int i188 = i186 - 2;
                java.lang.Object obj75 = objArr65[i188];
                objArr65[i188] = null;
                objArr65[i187] = obj75;
                objArr65[i188] = obj74;
                return 0;
            case 96:
                java.lang.Object[] objArr66 = this.getCardLayoutDescription;
                int i189 = this.getCiacDecline;
                int i190 = i189 - 1;
                java.lang.Object obj76 = objArr66[i190];
                objArr66[i190] = null;
                int i191 = i189 - 2;
                java.lang.Object obj77 = objArr66[i191];
                objArr66[i191] = null;
                objArr66[i190] = obj77;
                objArr66[i191] = obj76;
                int[] iArr39 = this.getGpoResponse;
                this.getCiacDecline = i189 + 1;
                iArr39[i189] = 0;
                java.lang.Object obj78 = objArr66[i190];
                objArr66[i190] = null;
                objArr66[i189] = obj78;
                iArr39[i190] = 0;
                return 0;
            case 97:
                java.lang.Object[] objArr67 = this.getCardLayoutDescription;
                int i192 = this.getCiacDecline;
                objArr67[i192] = null;
                this.getCiacDecline = i192 + 2;
                objArr67[i192 + 1] = null;
                return 0;
            case 98:
                int i193 = this.getCiacDecline;
                int i194 = i193 - 1;
                java.lang.Object[] objArr68 = this.getCardLayoutDescription;
                java.lang.Object obj79 = objArr68[i194];
                objArr68[i194] = null;
                objArr68[33] = obj79;
                objArr68[i193 - 2] = null;
                int i195 = i193 - 3;
                this.getCiacDecline = i195;
                objArr68[i195] = null;
                return 0;
            case 99:
                java.lang.Object[] objArr69 = this.getCardLayoutDescription;
                int i196 = this.getCiacDecline;
                objArr69[i196] = objArr69[33];
                this.getCiacDecline = i196 + 2;
                objArr69[i196 + 1] = objArr69[33];
                return 0;
            case 100:
                int[] iArr40 = this.getGpoResponse;
                int i197 = this.getCiacDecline;
                iArr40[i197] = 0;
                this.getCiacDecline = i197;
                java.lang.Object[] objArr70 = this.getCardLayoutDescription;
                int i198 = i197 - 1;
                java.lang.Object obj80 = objArr70[i198];
                objArr70[i198] = null;
                iArr40[i198] = ((int[]) obj80)[0];
                int i199 = i197 - 1;
                this.getCiacDecline = i199;
                iArr40[11] = iArr40[i199];
                return 0;
            case 101:
                int[] iArr41 = this.getGpoResponse;
                int i200 = this.getCiacDecline;
                iArr41[i200] = 0;
                this.getCiacDecline = i200;
                java.lang.Object[] objArr71 = this.getCardLayoutDescription;
                int i201 = i200 - 1;
                java.lang.Object obj81 = objArr71[i201];
                objArr71[i201] = null;
                iArr41[i201] = ((int[]) obj81)[0];
                this.getCiacDecline = i200 + 1;
                iArr41[i200] = iArr41[11];
                return 0;
            case 102:
                int i202 = this.getCiacDecline;
                int i203 = i202 - 2;
                this.getCiacDecline = i203;
                int[] iArr42 = this.getGpoResponse;
                this.DigitizedCardProfile = iArr42[i203] == iArr42[i202 - 1] ? 0 : 1;
                return 0;
            case 103:
                int i204 = this.getCiacDecline;
                int i205 = i204 - 1;
                java.lang.Object[] objArr72 = this.getCardLayoutDescription;
                java.lang.Object obj82 = objArr72[i205];
                objArr72[i205] = null;
                objArr72[10] = obj82;
                this.getCiacDecline = i204;
                objArr72[i205] = objArr72[9];
                return 0;
            case 104:
                int[] iArr43 = this.getGpoResponse;
                int i206 = this.getCiacDecline;
                iArr43[i206] = 2;
                this.getCiacDecline = i206;
                java.lang.Object[] objArr73 = this.getCardLayoutDescription;
                int i207 = i206 - 1;
                java.lang.Object obj83 = objArr73[i207];
                objArr73[i207] = null;
                objArr73[i207] = ((java.lang.Object[]) obj83)[2];
                return 0;
            case 105:
                java.lang.Object[] objArr74 = this.getCardLayoutDescription;
                int i208 = this.getCiacDecline;
                this.getCiacDecline = i208 + 1;
                objArr74[i208] = objArr74[10];
                return 0;
            case 106:
                java.lang.Object[] objArr75 = this.getCardLayoutDescription;
                int i209 = this.getCiacDecline;
                objArr75[i209] = objArr75[9];
                int[] iArr44 = this.getGpoResponse;
                this.getCiacDecline = i209 + 2;
                iArr44[i209 + 1] = 3;
                return 0;
            case 107:
                int i210 = this.getCiacDecline - 1;
                this.getCiacDecline = i210;
                long[] jArr14 = this.SdkCoreBusinessLogicModuleImpl;
                jArr14[19] = jArr14[i210];
                return 0;
            case 108:
                long[] jArr15 = this.SdkCoreBusinessLogicModuleImpl;
                int i211 = this.getCiacDecline;
                this.getCiacDecline = i211 + 1;
                jArr15[i211] = jArr15[19];
                return 0;
            case 109:
                int i212 = this.getCiacDecline - 1;
                this.getCiacDecline = i212;
                java.lang.Object[] objArr76 = this.getCardLayoutDescription;
                java.lang.Object obj84 = objArr76[i212];
                objArr76[i212] = null;
                objArr76[20] = obj84;
                return 0;
            case 110:
                java.lang.Object[] objArr77 = this.getCardLayoutDescription;
                int i213 = this.getCiacDecline;
                this.getCiacDecline = i213 + 1;
                objArr77[i213] = objArr77[20];
                return 0;
            case 111:
                java.lang.Object[] objArr78 = this.getCardLayoutDescription;
                int i214 = this.getCiacDecline;
                int i215 = i214 - 1;
                java.lang.Object obj85 = objArr78[i215];
                objArr78[i215] = null;
                int i216 = i214 - 2;
                java.lang.Object obj86 = objArr78[i216];
                objArr78[i216] = null;
                objArr78[i215] = obj86;
                objArr78[i216] = obj85;
                int[] iArr45 = this.getGpoResponse;
                this.getCiacDecline = i214 + 1;
                iArr45[i214] = 0;
                return 0;
            case 112:
                int i217 = this.getCiacDecline - 1;
                this.getCiacDecline = i217;
                java.lang.Object[] objArr79 = this.getCardLayoutDescription;
                java.lang.Object obj87 = objArr79[i217];
                objArr79[i217] = null;
                objArr79[33] = obj87;
                return 0;
            case 113:
                java.lang.Object[] objArr80 = this.getCardLayoutDescription;
                int i218 = this.getCiacDecline;
                int i219 = i218 + 1;
                java.lang.Object obj88 = objArr80[9];
                objArr80[i218] = obj88;
                this.getGpoResponse[i219] = 1;
                this.getCiacDecline = i219;
                objArr80[i218] = null;
                objArr80[i218] = ((java.lang.Object[]) obj88)[1];
                return 0;
            case 114:
                int[] iArr46 = this.getGpoResponse;
                int i220 = this.getCiacDecline;
                int i221 = i220 + 1;
                iArr46[i220] = iArr46[11];
                int i222 = iArr46[10];
                iArr46[i221] = i222;
                this.getCiacDecline = i221;
                iArr46[i220] = iArr46[i220] ^ i222;
                return 0;
            case 115:
                long[] jArr16 = this.SdkCoreBusinessLogicModuleImpl;
                int i223 = this.getCiacDecline;
                int i224 = i223 - 1;
                long j2 = this.getGpoResponse[i224];
                jArr16[i224] = j2;
                this.getCiacDecline = i224;
                int i225 = i223 - 2;
                jArr16[i225] = j2 ^ jArr16[i225];
                return 0;
            case 116:
                java.lang.Object[] objArr81 = this.getCardLayoutDescription;
                int i226 = this.getCiacDecline;
                int i227 = i226 - 1;
                java.lang.Object obj89 = objArr81[i227];
                objArr81[i227] = null;
                objArr81[i226] = obj89;
                int i228 = i226 - 2;
                java.lang.Object obj90 = objArr81[i228];
                objArr81[i228] = null;
                objArr81[i227] = obj90;
                objArr81[i228] = obj89;
                java.lang.Object obj91 = objArr81[i226];
                objArr81[i226] = null;
                java.lang.Object obj92 = objArr81[i227];
                objArr81[i227] = null;
                objArr81[i226] = obj92;
                objArr81[i227] = obj91;
                int[] iArr47 = this.getGpoResponse;
                this.getCiacDecline = i226 + 2;
                iArr47[i226 + 1] = 1;
                return 0;
            case 117:
                int i229 = this.getCiacDecline;
                int i230 = i229 - 3;
                this.getCiacDecline = i230;
                java.lang.Object[] objArr82 = this.getCardLayoutDescription;
                java.lang.Object obj93 = objArr82[i230];
                objArr82[i230] = null;
                int i231 = i229 - 2;
                int i232 = this.getGpoResponse[i231];
                int i233 = i229 - 1;
                java.lang.Object obj94 = objArr82[i233];
                objArr82[i233] = null;
                ((java.lang.Object[]) obj93)[i232] = obj94;
                this.getCiacDecline = i231;
                int i234 = i229 - 4;
                java.lang.Object obj95 = objArr82[i234];
                objArr82[i234] = null;
                objArr82[i230] = obj95;
                long[] jArr17 = this.SdkCoreBusinessLogicModuleImpl;
                int i235 = i229 - 5;
                jArr17[i234] = jArr17[i235];
                objArr82[i235] = obj95;
                return 0;
            case 118:
                int[] iArr48 = this.getGpoResponse;
                int i236 = this.getCiacDecline;
                iArr48[i236] = 3;
                this.getCiacDecline = i236;
                java.lang.Object[] objArr83 = this.getCardLayoutDescription;
                int i237 = i236 - 1;
                java.lang.Object obj96 = objArr83[i237];
                objArr83[i237] = null;
                objArr83[i237] = ((java.lang.Object[]) obj96)[3];
                return 0;
            case 119:
                int i238 = this.getCiacDecline - 1;
                this.getCiacDecline = i238;
                long[] jArr18 = this.SdkCoreBusinessLogicModuleImpl;
                jArr18[21] = jArr18[i238];
                return 0;
            case 120:
                long[] jArr19 = this.SdkCoreBusinessLogicModuleImpl;
                int i239 = this.getCiacDecline;
                this.getCiacDecline = i239 + 1;
                jArr19[i239] = jArr19[21];
                return 0;
            case 121:
                int i240 = this.getCiacDecline;
                java.lang.Object[] objArr84 = this.getCardLayoutDescription;
                objArr84[i240 - 1] = null;
                int i241 = i240 - 2;
                this.getCiacDecline = i241;
                objArr84[i241] = null;
                return 0;
            case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                int i242 = this.getCiacDecline - 1;
                this.getCiacDecline = i242;
                int[] iArr49 = this.getGpoResponse;
                iArr49[11] = iArr49[i242];
                return 0;
            case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                int[] iArr50 = this.getGpoResponse;
                int i243 = this.getCiacDecline;
                iArr50[i243] = 0;
                this.getCiacDecline = i243;
                java.lang.Object[] objArr85 = this.getCardLayoutDescription;
                int i244 = i243 - 1;
                java.lang.Object obj97 = objArr85[i244];
                objArr85[i244] = null;
                objArr85[i244] = ((java.lang.Object[]) obj97)[0];
                return 0;
            case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                int i245 = this.getCiacDecline;
                int i246 = i245 - 1;
                this.getCiacDecline = i246;
                int[] iArr51 = this.getGpoResponse;
                java.lang.Object[] objArr86 = this.getCardLayoutDescription;
                int i247 = i245 - 2;
                java.lang.Object obj98 = objArr86[i247];
                objArr86[i247] = null;
                int i248 = ((int[]) obj98)[iArr51[i246]];
                iArr51[i247] = i248;
                iArr51[i246] = i248;
                int i249 = i245 - 1;
                this.getCiacDecline = i249;
                iArr51[10] = iArr51[i249];
                return 0;
            case 125:
                java.lang.Object[] objArr87 = this.getCardLayoutDescription;
                int i250 = this.getCiacDecline;
                int i251 = i250 + 1;
                java.lang.Object obj99 = objArr87[i250 - 1];
                objArr87[i250] = obj99;
                this.getGpoResponse[i251] = 3;
                this.getCiacDecline = i251;
                objArr87[i250] = null;
                objArr87[i250] = ((java.lang.Object[]) obj99)[3];
                return 0;
            case 126:
                int[] iArr52 = this.getGpoResponse;
                int i252 = this.getCiacDecline;
                int i253 = iArr52[10];
                iArr52[i252] = i253;
                this.getCiacDecline = i252;
                int i254 = i252 - 1;
                iArr52[i254] = iArr52[i254] ^ i253;
                return 0;
            case 127:
                java.lang.Object[] objArr88 = this.getCardLayoutDescription;
                int i255 = this.getCiacDecline;
                this.getCiacDecline = i255 + 1;
                int i256 = i255 - 1;
                java.lang.Object obj100 = objArr88[i256];
                objArr88[i256] = null;
                objArr88[i255] = obj100;
                int i257 = i255 - 2;
                java.lang.Object obj101 = objArr88[i257];
                objArr88[i257] = null;
                objArr88[i256] = obj101;
                objArr88[i257] = obj100;
                java.lang.Object obj102 = objArr88[i255];
                objArr88[i255] = null;
                java.lang.Object obj103 = objArr88[i256];
                objArr88[i256] = null;
                objArr88[i255] = obj103;
                objArr88[i256] = obj102;
                return 0;
            case 128:
                int[] iArr53 = this.getGpoResponse;
                int i258 = this.getCiacDecline;
                this.getCiacDecline = i258 + 1;
                iArr53[i258] = 1;
                java.lang.Object[] objArr89 = this.getCardLayoutDescription;
                int i259 = i258 - 1;
                java.lang.Object obj104 = objArr89[i259];
                objArr89[i259] = null;
                objArr89[i258] = obj104;
                iArr53[i259] = 1;
                return 0;
            case 129:
                int[] iArr54 = this.getGpoResponse;
                int i260 = this.getCiacDecline;
                iArr54[i260] = 0;
                java.lang.Object[] objArr90 = this.getCardLayoutDescription;
                int i261 = i260 - 1;
                java.lang.Object obj105 = objArr90[i261];
                objArr90[i261] = null;
                objArr90[i260] = obj105;
                iArr54[i261] = 0;
                int i262 = i260 - 2;
                this.getCiacDecline = i262;
                java.lang.Object obj106 = objArr90[i262];
                objArr90[i262] = null;
                java.lang.Object obj107 = objArr90[i260];
                objArr90[i260] = null;
                ((java.lang.Object[]) obj106)[0] = obj107;
                return 0;
            case 130:
                java.lang.Object[] objArr91 = this.getCardLayoutDescription;
                int i263 = this.getCiacDecline;
                int i264 = i263 - 1;
                java.lang.Object obj108 = objArr91[i264];
                objArr91[i264] = null;
                int i265 = i263 - 2;
                java.lang.Object obj109 = objArr91[i265];
                objArr91[i265] = null;
                objArr91[i264] = obj109;
                objArr91[i265] = obj108;
                this.getCiacDecline = i263 + 1;
                objArr91[i263] = null;
                objArr91[i263] = null;
                java.lang.Object obj110 = objArr91[i264];
                objArr91[i264] = null;
                objArr91[i263] = obj110;
                objArr91[i264] = null;
                return 0;
            case 131:
                java.lang.Object[] objArr92 = this.getCardLayoutDescription;
                int i266 = this.getCiacDecline;
                java.lang.Object obj111 = objArr92[9];
                objArr92[i266] = obj111;
                objArr92[i266 + 1] = obj111;
                int[] iArr55 = this.getGpoResponse;
                this.getCiacDecline = i266 + 3;
                iArr55[i266 + 2] = 3;
                return 0;
            case 132:
                long[] jArr20 = this.SdkCoreBusinessLogicModuleImpl;
                int i267 = this.getCiacDecline;
                long j3 = jArr20[i267 - 1];
                jArr20[i267] = j3;
                this.getCiacDecline = i267;
                jArr20[23] = j3;
                return 0;
            case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                long[] jArr21 = this.SdkCoreBusinessLogicModuleImpl;
                int i268 = this.getCiacDecline;
                this.getCiacDecline = i268 + 1;
                jArr21[i268] = jArr21[23];
                return 0;
            case 134:
                int i269 = this.getCiacDecline;
                int i270 = i269 - 1;
                long[] jArr22 = this.SdkCoreBusinessLogicModuleImpl;
                int i271 = i269 - 2;
                jArr22[i271] = jArr22[i271] + jArr22[i270];
                java.lang.Object[] objArr93 = this.getCardLayoutDescription;
                this.getCiacDecline = i269;
                objArr93[i270] = objArr93[14];
                return 0;
            case 135:
                int i272 = this.getCiacDecline - 1;
                this.getCiacDecline = i272;
                java.lang.Object[] objArr94 = this.getCardLayoutDescription;
                java.lang.Object obj112 = objArr94[i272];
                objArr94[i272] = null;
                objArr94[24] = obj112;
                return 0;
            case 136:
                java.lang.Object[] objArr95 = this.getCardLayoutDescription;
                int i273 = this.getCiacDecline;
                this.getCiacDecline = i273 + 1;
                objArr95[i273] = objArr95[24];
                return 0;
            case 137:
                java.lang.Object[] objArr96 = this.getCardLayoutDescription;
                int i274 = this.getCiacDecline;
                objArr96[i274] = objArr96[24];
                int[] iArr56 = this.getGpoResponse;
                this.getCiacDecline = i274 + 2;
                iArr56[i274 + 1] = 0;
                return 0;
            case 138:
                int[] iArr57 = this.getGpoResponse;
                int i275 = this.getCiacDecline;
                iArr57[i275] = 0;
                java.lang.Object[] objArr97 = this.getCardLayoutDescription;
                this.getCiacDecline = i275 + 2;
                objArr97[i275 + 1] = objArr97[34];
                return 0;
            case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                int i276 = this.getCiacDecline;
                int i277 = i276 - 1;
                java.lang.Object[] objArr98 = this.getCardLayoutDescription;
                java.lang.Object obj113 = objArr98[i277];
                objArr98[i277] = null;
                objArr98[9] = obj113;
                this.getCiacDecline = i276;
                objArr98[i277] = objArr98[24];
                return 0;
            case 140:
                int i278 = this.getCiacDecline;
                int i279 = i278 - 1;
                java.lang.Object[] objArr99 = this.getCardLayoutDescription;
                objArr99[i279] = null;
                objArr99[i279] = objArr99[33];
                this.getCiacDecline = i278 + 1;
                objArr99[i278] = objArr99[33];
                return 0;
            case 141:
                int[] iArr58 = this.getGpoResponse;
                int i280 = this.getCiacDecline;
                iArr58[i280] = 1;
                this.getCiacDecline = i280;
                java.lang.Object[] objArr100 = this.getCardLayoutDescription;
                int i281 = i280 - 1;
                java.lang.Object obj114 = objArr100[i281];
                objArr100[i281] = null;
                objArr100[i281] = ((java.lang.Object[]) obj114)[1];
                return 0;
            case 142:
                int[] iArr59 = this.getGpoResponse;
                int i282 = this.getCiacDecline;
                this.getCiacDecline = i282 + 1;
                iArr59[i282] = iArr59[i282 - 1];
                return 0;
            case 143:
                int i283 = this.getCiacDecline;
                int i284 = i283 - 1;
                int[] iArr60 = this.getGpoResponse;
                iArr60[10] = iArr60[i284];
                this.getCiacDecline = i283;
                iArr60[i284] = iArr60[11];
                return 0;
            case 144:
                int[] iArr61 = this.getGpoResponse;
                int i285 = this.getCiacDecline;
                this.getCiacDecline = i285 + 1;
                iArr61[i285] = iArr61[10];
                return 0;
            case 145:
                int i286 = this.getCiacDecline;
                int i287 = i286 - 1;
                this.getCiacDecline = i287;
                int[] iArr62 = this.getGpoResponse;
                int i288 = i286 - 2;
                int i289 = iArr62[i287] ^ iArr62[i288];
                iArr62[i288] = i289;
                this.SdkCoreBusinessLogicModuleImpl[i288] = i289;
                return 0;
            case 146:
                int i290 = this.getCiacDecline;
                int i291 = i290 - 1;
                this.getCiacDecline = i291;
                int[] iArr63 = this.getGpoResponse;
                java.lang.Object[] objArr101 = this.getCardLayoutDescription;
                int i292 = i290 - 2;
                java.lang.Object obj115 = objArr101[i292];
                objArr101[i292] = null;
                iArr63[i292] = ((int[]) obj115)[iArr63[i291]];
                this.getCiacDecline = i290;
                iArr63[i291] = 0;
                return 0;
            case 147:
                long[] jArr23 = this.SdkCoreBusinessLogicModuleImpl;
                int i293 = this.getCiacDecline;
                long j4 = jArr23[i293 - 1];
                jArr23[i293] = j4;
                this.getCiacDecline = i293;
                jArr23[25] = j4;
                return 0;
            case 148:
                long[] jArr24 = this.SdkCoreBusinessLogicModuleImpl;
                int i294 = this.getCiacDecline;
                this.getCiacDecline = i294 + 1;
                jArr24[i294] = jArr24[25];
                return 0;
            case 149:
                java.lang.Object[] objArr102 = this.getCardLayoutDescription;
                int i295 = this.getCiacDecline;
                objArr102[i295] = objArr102[18];
                int[] iArr64 = this.getGpoResponse;
                this.getCiacDecline = i295 + 2;
                iArr64[i295 + 1] = 0;
                return 0;
            case 150:
                java.lang.Object[] objArr103 = this.getCardLayoutDescription;
                int i296 = this.getCiacDecline;
                java.lang.Object obj116 = objArr103[i296 - 1];
                objArr103[i296] = obj116;
                this.getCiacDecline = i296;
                objArr103[i296] = null;
                objArr103[26] = obj116;
                return 0;
            case 151:
                java.lang.Object[] objArr104 = this.getCardLayoutDescription;
                int i297 = this.getCiacDecline;
                this.getCiacDecline = i297 + 1;
                objArr104[i297] = objArr104[26];
                return 0;
            case 152:
                int i298 = this.getCiacDecline - 1;
                this.getCiacDecline = i298;
                java.lang.Object[] objArr105 = this.getCardLayoutDescription;
                java.lang.Object obj117 = objArr105[i298];
                objArr105[i298] = null;
                objArr105[26] = obj117;
                return 0;
            case 153:
                int[] iArr65 = this.getGpoResponse;
                int i299 = this.getCiacDecline;
                iArr65[i299] = 22;
                this.getCiacDecline = i299;
                int i300 = i299 - 1;
                iArr65[i300] = iArr65[i300] >> 22;
                return 0;
            case 154:
                long[] jArr25 = this.SdkCoreBusinessLogicModuleImpl;
                int i301 = this.getCiacDecline;
                jArr25[i301] = 0;
                int[] iArr66 = this.getGpoResponse;
                int i302 = i301 - 1;
                int i303 = (jArr25[i302] > 0L ? 1 : (jArr25[i302] == 0L ? 0 : -1));
                iArr66[i302] = i303;
                this.getCiacDecline = i302;
                int i304 = i301 - 2;
                iArr66[i304] = iArr66[i304] - i303;
                return 0;
            case 155:
                java.lang.Object[] objArr106 = this.getCardLayoutDescription;
                int i305 = this.getCiacDecline;
                objArr106[i305] = objArr106[i305 - 1];
                int[] iArr67 = this.getGpoResponse;
                this.getCiacDecline = i305 + 2;
                iArr67[i305 + 1] = 3;
                return 0;
            case 156:
                float[] fArr = this.getCvrMaskAnd;
                int i306 = this.getCiacDecline;
                this.getCiacDecline = i306 + 1;
                fArr[i306] = this.values;
                return 0;
            case 157:
                float[] fArr2 = this.getCvrMaskAnd;
                int i307 = this.getCiacDecline;
                fArr2[i307] = 0.0f;
                this.getCiacDecline = i307;
                int i308 = i307 - 1;
                this.getGpoResponse[i308] = (fArr2[i308] > 0.0f ? 1 : (fArr2[i308] == 0.0f ? 0 : -1));
                return 0;
            case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                int i309 = this.getCiacDecline;
                int i310 = i309 - 3;
                this.getCiacDecline = i310;
                java.lang.Object[] objArr107 = this.getCardLayoutDescription;
                java.lang.Object obj118 = objArr107[i310];
                objArr107[i310] = null;
                int i311 = i309 - 2;
                int i312 = this.getGpoResponse[i311];
                int i313 = i309 - 1;
                java.lang.Object obj119 = objArr107[i313];
                objArr107[i313] = null;
                ((java.lang.Object[]) obj118)[i312] = obj119;
                this.getCiacDecline = i311;
                java.lang.Object obj120 = objArr107[26];
                objArr107[i310] = obj120;
                objArr107[i310] = null;
                int i314 = i309 - 4;
                java.lang.Object obj121 = objArr107[i314];
                objArr107[i314] = null;
                objArr107[i310] = obj121;
                objArr107[i314] = obj120;
                return 0;
            case 159:
                int[] iArr68 = this.getGpoResponse;
                int i315 = this.getCiacDecline;
                this.getCiacDecline = i315 + 1;
                iArr68[i315] = 5;
                return 0;
            case 160:
                int[] iArr69 = this.getGpoResponse;
                int i316 = this.getCiacDecline;
                iArr69[i316] = 3;
                java.lang.Object[] objArr108 = this.getCardLayoutDescription;
                int i317 = i316 - 1;
                java.lang.Object obj122 = objArr108[i317];
                objArr108[i317] = null;
                objArr108[i316] = obj122;
                iArr69[i317] = 3;
                int i318 = i316 - 2;
                this.getCiacDecline = i318;
                java.lang.Object obj123 = objArr108[i318];
                objArr108[i318] = null;
                java.lang.Object obj124 = objArr108[i316];
                objArr108[i316] = null;
                ((java.lang.Object[]) obj123)[3] = obj124;
                return 0;
            case 161:
                java.lang.Object[] objArr109 = this.getCardLayoutDescription;
                int i319 = this.getCiacDecline;
                objArr109[i319] = objArr109[i319 - 1];
                this.getGpoResponse[i319 + 1] = 0;
                this.getCiacDecline = i319 + 3;
                objArr109[i319 + 2] = objArr109[34];
                return 0;
            case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                java.lang.Object[] objArr110 = this.getCardLayoutDescription;
                int i320 = this.getCiacDecline;
                objArr110[i320] = objArr110[i320 - 1];
                int[] iArr70 = this.getGpoResponse;
                this.getCiacDecline = i320 + 2;
                iArr70[i320 + 1] = 2;
                return 0;
            case 163:
                java.lang.Object[] objArr111 = this.getCardLayoutDescription;
                int i321 = this.getCiacDecline;
                int i322 = i321 - 1;
                java.lang.Object obj125 = objArr111[i322];
                objArr111[i322] = null;
                int i323 = i321 - 2;
                java.lang.Object obj126 = objArr111[i323];
                objArr111[i323] = null;
                objArr111[i322] = obj126;
                objArr111[i323] = obj125;
                this.getCiacDecline = i321 + 1;
                objArr111[i321] = null;
                return 0;
            case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                int i324 = this.getCiacDecline;
                int i325 = i324 - 1;
                java.lang.Object[] objArr112 = this.getCardLayoutDescription;
                java.lang.Object obj127 = objArr112[i325];
                objArr112[i325] = null;
                objArr112[9] = obj127;
                this.getGpoResponse[i325] = 1;
                this.getCiacDecline = i325;
                int i326 = i324 - 2;
                java.lang.Object obj128 = objArr112[i326];
                objArr112[i326] = null;
                objArr112[i326] = ((java.lang.Object[]) obj128)[1];
                return 0;
            case 165:
                int i327 = this.getCiacDecline;
                int i328 = i327 - 1;
                java.lang.Object[] objArr113 = this.getCardLayoutDescription;
                objArr113[i328] = null;
                this.getCiacDecline = i327;
                objArr113[i328] = objArr113[9];
                return 0;
            case 166:
                int i329 = this.getCiacDecline;
                java.lang.Object[] objArr114 = this.getCardLayoutDescription;
                objArr114[i329 - 1] = null;
                objArr114[i329 - 2] = null;
                int i330 = i329 - 3;
                this.getCiacDecline = i330;
                objArr114[i330] = null;
                return 0;
            case 167:
                int[] iArr71 = this.getGpoResponse;
                int i331 = this.getCiacDecline;
                int i332 = iArr71[i331 - 1];
                iArr71[i331] = i332;
                this.getCiacDecline = i331;
                iArr71[10] = i332;
                return 0;
            case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                java.lang.Object[] objArr115 = this.getCardLayoutDescription;
                int i333 = this.getCiacDecline;
                int i334 = i333 - 1;
                java.lang.Object obj129 = objArr115[i334];
                objArr115[i334] = null;
                int i335 = i333 - 2;
                java.lang.Object obj130 = objArr115[i335];
                objArr115[i335] = null;
                objArr115[i334] = obj130;
                objArr115[i335] = obj129;
                int[] iArr72 = this.getGpoResponse;
                this.getCiacDecline = i333 + 1;
                iArr72[i333] = 1;
                java.lang.Object obj131 = objArr115[i334];
                objArr115[i334] = null;
                objArr115[i333] = obj131;
                iArr72[i334] = 1;
                return 0;
            case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                int i336 = this.getCiacDecline;
                int i337 = i336 - 3;
                this.getCiacDecline = i337;
                java.lang.Object[] objArr116 = this.getCardLayoutDescription;
                java.lang.Object obj132 = objArr116[i337];
                objArr116[i337] = null;
                int i338 = this.getGpoResponse[i336 - 2];
                int i339 = i336 - 1;
                java.lang.Object obj133 = objArr116[i339];
                objArr116[i339] = null;
                ((java.lang.Object[]) obj132)[i338] = obj133;
                int i340 = i336 - 4;
                java.lang.Object obj134 = objArr116[i340];
                objArr116[i340] = null;
                objArr116[i337] = obj134;
                long[] jArr26 = this.SdkCoreBusinessLogicModuleImpl;
                int i341 = i336 - 5;
                jArr26[i340] = jArr26[i341];
                objArr116[i341] = obj134;
                int i342 = i336 - 3;
                this.getCiacDecline = i342;
                objArr116[i342] = null;
                return 0;
            case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                java.lang.Object[] objArr117 = this.getCardLayoutDescription;
                int i343 = this.getCiacDecline;
                java.lang.Object obj135 = objArr117[9];
                objArr117[i343] = obj135;
                objArr117[i343 + 1] = obj135;
                int[] iArr73 = this.getGpoResponse;
                this.getCiacDecline = i343 + 3;
                iArr73[i343 + 2] = 2;
                return 0;
            case 171:
                long[] jArr27 = this.SdkCoreBusinessLogicModuleImpl;
                int i344 = this.getCiacDecline;
                long j5 = jArr27[i344 - 1];
                jArr27[i344] = j5;
                this.getCiacDecline = i344;
                jArr27[27] = j5;
                return 0;
            case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                long[] jArr28 = this.SdkCoreBusinessLogicModuleImpl;
                int i345 = this.getCiacDecline;
                this.getCiacDecline = i345 + 1;
                jArr28[i345] = jArr28[27];
                return 0;
            case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                java.lang.Object[] objArr118 = this.getCardLayoutDescription;
                int i346 = this.getCiacDecline;
                java.lang.Object obj136 = objArr118[9];
                objArr118[i346] = obj136;
                objArr118[i346 + 1] = obj136;
                int[] iArr74 = this.getGpoResponse;
                this.getCiacDecline = i346 + 3;
                iArr74[i346 + 2] = 9;
                return 0;
            case 174:
                int i347 = this.getCiacDecline - 1;
                this.getCiacDecline = i347;
                java.lang.Object[] objArr119 = this.getCardLayoutDescription;
                java.lang.Object obj137 = objArr119[i347];
                objArr119[i347] = null;
                objArr119[12] = obj137;
                return 0;
            case 175:
                java.lang.Object[] objArr120 = this.getCardLayoutDescription;
                int i348 = this.getCiacDecline;
                this.getCiacDecline = i348 + 1;
                objArr120[i348] = objArr120[12];
                return 0;
            case 176:
                java.lang.Object[] objArr121 = this.getCardLayoutDescription;
                int i349 = this.getCiacDecline;
                int i350 = i349 + 1;
                java.lang.Object obj138 = objArr121[9];
                objArr121[i349] = obj138;
                this.getGpoResponse[i350] = 4;
                this.getCiacDecline = i350;
                objArr121[i349] = null;
                objArr121[i349] = ((java.lang.Object[]) obj138)[4];
                return 0;
            case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                int[] iArr75 = this.getGpoResponse;
                int i351 = this.getCiacDecline;
                iArr75[i351] = 5;
                this.getCiacDecline = i351;
                java.lang.Object[] objArr122 = this.getCardLayoutDescription;
                int i352 = i351 - 1;
                java.lang.Object obj139 = objArr122[i352];
                objArr122[i352] = null;
                objArr122[i352] = ((java.lang.Object[]) obj139)[5];
                return 0;
            case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE:
                int[] iArr76 = this.getGpoResponse;
                int i353 = this.getCiacDecline;
                iArr76[i353] = 6;
                this.getCiacDecline = i353;
                java.lang.Object[] objArr123 = this.getCardLayoutDescription;
                int i354 = i353 - 1;
                java.lang.Object obj140 = objArr123[i354];
                objArr123[i354] = null;
                objArr123[i354] = ((java.lang.Object[]) obj140)[6];
                return 0;
            case 179:
                int[] iArr77 = this.getGpoResponse;
                int i355 = this.getCiacDecline;
                this.getCiacDecline = i355 + 1;
                iArr77[i355] = 7;
                return 0;
            case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                java.lang.Object[] objArr124 = this.getCardLayoutDescription;
                int i356 = this.getCiacDecline;
                objArr124[i356] = objArr124[12];
                objArr124[i356 + 1] = objArr124[9];
                int[] iArr78 = this.getGpoResponse;
                this.getCiacDecline = i356 + 3;
                iArr78[i356 + 2] = 8;
                return 0;
            case 181:
                int[] iArr79 = this.getGpoResponse;
                int i357 = this.getCiacDecline;
                iArr79[i357] = iArr79[11];
                this.getCiacDecline = i357 + 2;
                iArr79[i357 + 1] = iArr79[10];
                return 0;
            case SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE:
                int i358 = this.getCiacDecline;
                int i359 = i358 - 1;
                this.getCiacDecline = i359;
                int[] iArr80 = this.getGpoResponse;
                int i360 = i358 - 2;
                iArr80[i360] = iArr80[i359] ^ iArr80[i360];
                return 0;
            case 183:
                this.SdkCoreBusinessLogicModuleImpl[this.getCiacDecline - 1] = this.getGpoResponse[r3];
                return 0;
            case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                int i361 = this.getCiacDecline - 1;
                this.getCiacDecline = i361;
                long[] jArr29 = this.SdkCoreBusinessLogicModuleImpl;
                jArr29[29] = jArr29[i361];
                return 0;
            case 185:
                long[] jArr30 = this.SdkCoreBusinessLogicModuleImpl;
                int i362 = this.getCiacDecline;
                this.getCiacDecline = i362 + 1;
                jArr30[i362] = jArr30[29];
                return 0;
            case 186:
                int i363 = this.getCiacDecline;
                int i364 = i363 - 1;
                java.lang.Object[] objArr125 = this.getCardLayoutDescription;
                objArr125[i364] = null;
                this.getCiacDecline = i363;
                objArr125[i364] = objArr125[33];
                return 0;
            case 187:
                int i365 = this.getCiacDecline - 1;
                this.getCiacDecline = i365;
                long[] jArr31 = this.SdkCoreBusinessLogicModuleImpl;
                jArr31[31] = jArr31[i365];
                return 0;
            case 188:
                long[] jArr32 = this.SdkCoreBusinessLogicModuleImpl;
                int i366 = this.getCiacDecline;
                this.getCiacDecline = i366 + 1;
                jArr32[i366] = jArr32[31];
                return 0;
            case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                int i367 = this.getCiacDecline;
                int i368 = i367 - 1;
                this.getCiacDecline = i368;
                int[] iArr81 = this.getGpoResponse;
                java.lang.Object[] objArr126 = this.getCardLayoutDescription;
                int i369 = i367 - 2;
                java.lang.Object obj141 = objArr126[i369];
                objArr126[i369] = null;
                int i370 = ((int[]) obj141)[iArr81[i368]];
                iArr81[i369] = i370;
                iArr81[11] = i370;
                this.getCiacDecline = i368;
                objArr126[i369] = objArr126[9];
                return 0;
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                int i371 = this.getCiacDecline - 1;
                this.getCiacDecline = i371;
                int[] iArr82 = this.getGpoResponse;
                iArr82[10] = iArr82[i371];
                return 0;
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                this.DigitizedCardProfile = this.getGpoResponse[this.getCiacDecline - 1];
                return 0;
            case 192:
                int[] iArr83 = this.getGpoResponse;
                int i372 = this.getCiacDecline;
                iArr83[i372] = 2;
                this.getCiacDecline = i372 + 2;
                iArr83[i372 + 1] = 2;
                return 0;
            case 193:
                int i373 = this.getCiacDecline;
                int i374 = i373 - 1;
                this.getCiacDecline = i374;
                int[] iArr84 = this.getGpoResponse;
                int i375 = i373 - 2;
                iArr84[i375] = iArr84[i375] % iArr84[i374];
                int i376 = i373 - 2;
                this.getCiacDecline = i376;
                this.getCardLayoutDescription[i376] = null;
                return 0;
            case SDK_ASSET_ICON_EXTERNAL_VALUE:
                int i377 = this.getCiacDecline;
                int i378 = i377 - 1;
                this.getCiacDecline = i378;
                int[] iArr85 = this.getGpoResponse;
                int i379 = i377 - 2;
                iArr85[i379] = iArr85[i379] % iArr85[i378];
                return 0;
            case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
                int[] iArr86 = this.getGpoResponse;
                int i380 = this.getCiacDecline;
                iArr86[i380] = 2;
                this.getCiacDecline = i380;
                int i381 = i380 - 1;
                iArr86[i381] = iArr86[i381] % 2;
                int i382 = i380 - 1;
                this.getCiacDecline = i382;
                this.getCardLayoutDescription[i382] = null;
                return 0;
            case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                int[] iArr87 = this.getGpoResponse;
                int i383 = this.getCiacDecline;
                this.getCiacDecline = i383 + 1;
                iArr87[i383] = 31;
                return 0;
            case 197:
                int[] iArr88 = this.getGpoResponse;
                int i384 = this.getCiacDecline;
                iArr88[i384] = 128;
                this.getCiacDecline = i384;
                int i385 = i384 - 1;
                iArr88[i385] = iArr88[i385] % 128;
                return 0;
            case SDK_ASSET_ICON_ARROW_UP_VALUE:
                int[] iArr89 = this.getGpoResponse;
                int i386 = this.getCiacDecline;
                iArr89[i386] = 2;
                this.getCiacDecline = i386;
                int i387 = i386 - 1;
                iArr89[i387] = iArr89[i387] % 2;
                return 0;
            case 199:
                int[] iArr90 = this.getGpoResponse;
                int i388 = this.getCiacDecline;
                iArr90[i388] = 9;
                this.getCiacDecline = i388;
                int i389 = i388 - 1;
                iArr90[i389] = iArr90[i389] + 9;
                return 0;
            case 200:
                int[] iArr91 = this.getGpoResponse;
                int i390 = this.getCiacDecline;
                int i391 = i390 + 1;
                iArr91[i390] = iArr91[i390 - 1];
                iArr91[i391] = 128;
                this.getCiacDecline = i391;
                iArr91[i390] = iArr91[i390] % 128;
                return 0;
            case 201:
                int i392 = this.getCiacDecline - 1;
                this.getCiacDecline = i392;
                this.DigitizedCardProfile = this.getGpoResponse[i392] != 0 ? 0 : 1;
                return 0;
            case 202:
                int[] iArr92 = this.getGpoResponse;
                int i393 = this.getCiacDecline;
                this.getCiacDecline = i393 + 1;
                iArr92[i393] = 9;
                return 0;
            case 203:
                int[] iArr93 = this.getGpoResponse;
                int i394 = this.getCiacDecline;
                iArr93[i394] = iArr93[i394 - 1];
                this.getCiacDecline = i394 + 2;
                iArr93[i394 + 1] = 128;
                return 0;
            case 204:
                java.lang.Object[] objArr127 = this.getCardLayoutDescription;
                int i395 = this.getCiacDecline;
                int i396 = i395 + 1;
                java.lang.Object obj142 = objArr127[i395 - 1];
                objArr127[i395] = obj142;
                this.getGpoResponse[i396] = 94;
                this.getCiacDecline = i396;
                objArr127[i395] = null;
                objArr127[i395] = ((java.lang.Object[]) obj142)[94];
                return 0;
            case 205:
                int i397 = this.getCiacDecline;
                int i398 = i397 - 1;
                this.getCiacDecline = i398;
                int[] iArr94 = this.getGpoResponse;
                java.lang.Object[] objArr128 = this.getCardLayoutDescription;
                int i399 = i397 - 2;
                java.lang.Object obj143 = objArr128[i399];
                objArr128[i399] = null;
                iArr94[i399] = ((int[]) obj143)[iArr94[i398]];
                this.getCiacDecline = i397;
                iArr94[i398] = 1;
                return 0;
            case 206:
                int[] iArr95 = this.getGpoResponse;
                int i400 = this.getCiacDecline;
                this.getCiacDecline = i400 + 1;
                iArr95[i400] = 61;
                return 0;
            case 207:
                int[] iArr96 = this.getGpoResponse;
                int i401 = this.getCiacDecline;
                iArr96[i401] = 1;
                this.getCiacDecline = i401;
                java.lang.Object[] objArr129 = this.getCardLayoutDescription;
                int i402 = i401 - 1;
                java.lang.Object obj144 = objArr129[i402];
                objArr129[i402] = null;
                iArr96[i402] = ((int[]) obj144)[1];
                this.getCiacDecline = i401 + 1;
                iArr96[i401] = 0;
                return 0;
            case SDK_ASSET_ICON_INCOME_VALUE:
                int[] iArr97 = this.getGpoResponse;
                int i403 = this.getCiacDecline;
                this.getCiacDecline = i403 + 1;
                iArr97[i403] = 43;
                return 0;
            case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                int i404 = this.getCiacDecline;
                int i405 = i404 - 1;
                int[] iArr98 = this.getGpoResponse;
                int i406 = i404 - 2;
                int i407 = iArr98[i406] + iArr98[i405];
                iArr98[i406] = i407;
                iArr98[i405] = i407;
                this.getCiacDecline = i404 + 1;
                iArr98[i404] = 128;
                return 0;
            case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                int[] iArr99 = this.getGpoResponse;
                int i408 = this.getCiacDecline;
                this.getCiacDecline = i408 + 1;
                iArr99[i408] = 93;
                return 0;
            case 211:
                int[] iArr100 = this.getGpoResponse;
                int i409 = this.getCiacDecline;
                iArr100[i409] = 65;
                this.getCiacDecline = i409;
                int i410 = i409 - 1;
                iArr100[i410] = iArr100[i410] + 65;
                return 0;
            case SDK_ASSET_ICON_OVERRIDE_VALUE:
                int[] iArr101 = this.getGpoResponse;
                int i411 = this.getCiacDecline;
                iArr101[i411] = 29;
                int i412 = i411 - 1;
                int i413 = iArr101[i412] + 29;
                iArr101[i412] = i413;
                this.getCiacDecline = i411 + 1;
                iArr101[i411] = i413;
                return 0;
            case SDK_ASSET_ICON_PAUSE_VALUE:
                int[] iArr102 = this.getGpoResponse;
                int i414 = this.getCiacDecline;
                this.getCiacDecline = i414 + 1;
                iArr102[i414] = 128;
                return 0;
            case SDK_ASSET_ICON_PIN_VALUE:
                int[] iArr103 = this.getGpoResponse;
                int i415 = this.getCiacDecline;
                iArr103[i415] = 67;
                int i416 = i415 - 1;
                int i417 = iArr103[i416] + 67;
                iArr103[i416] = i417;
                this.getCiacDecline = i415 + 1;
                iArr103[i415] = i417;
                return 0;
            case 215:
                int[] iArr104 = this.getGpoResponse;
                int i418 = this.getCiacDecline;
                iArr104[i418] = 27;
                this.getCiacDecline = i418;
                int i419 = i418 - 1;
                iArr104[i419] = iArr104[i419] + 27;
                return 0;
            case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
                int[] iArr105 = this.getGpoResponse;
                int i420 = this.getCiacDecline - 1;
                this.getCiacDecline = i420;
                this.DigitizedCardProfile = iArr105[i420];
                return 0;
            case SDK_ASSET_ICON_PROGRESS_VALUE:
                int[] iArr106 = this.getGpoResponse;
                int i421 = this.getCiacDecline;
                this.getCiacDecline = i421 + 1;
                iArr106[i421] = 55;
                return 0;
            case SDK_ASSET_ICON_QUESTION_VALUE:
                int[] iArr107 = this.getGpoResponse;
                int i422 = this.getCiacDecline;
                this.getCiacDecline = i422 + 1;
                iArr107[i422] = 51;
                return 0;
            case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                int[] iArr108 = this.getGpoResponse;
                int i423 = this.getCiacDecline;
                this.getCiacDecline = i423 + 1;
                iArr108[i423] = 47;
                return 0;
            case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                int[] iArr109 = this.getGpoResponse;
                int i424 = this.getCiacDecline;
                this.getCiacDecline = i424 + 1;
                iArr109[i424] = 72;
                return 0;
            case SDK_ASSET_ICON_SUBMIT_VALUE:
                int[] iArr110 = this.getGpoResponse;
                int i425 = this.getCiacDecline;
                this.getCiacDecline = i425 + 1;
                iArr110[i425] = 19;
                return 0;
            case SDK_ASSET_ICON_SUBTRACT_VALUE:
                int[] iArr111 = this.getGpoResponse;
                int i426 = this.getCiacDecline;
                this.getCiacDecline = i426 + 1;
                iArr111[i426] = 34;
                return 0;
            case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                int[] iArr112 = this.getGpoResponse;
                int i427 = this.getCiacDecline;
                this.getCiacDecline = i427 + 1;
                iArr112[i427] = 15;
                return 0;
            case 224:
                int[] iArr113 = this.getGpoResponse;
                int i428 = this.getCiacDecline;
                this.getCiacDecline = i428 + 1;
                iArr113[i428] = 90;
                return 0;
            case 225:
                for (int i429 = this.getCiacDecline - 1; i429 >= 0; i429--) {
                    this.getCardLayoutDescription[i429] = null;
                }
                java.lang.Object[] objArr130 = this.getCardLayoutDescription;
                this.getCiacDecline = 1;
                objArr130[0] = this.IccPrivateKeyCrtComponentsJson;
                return 0;
            default:
                return i;
        }
    }
}

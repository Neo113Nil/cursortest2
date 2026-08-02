package com.payair.hce;

/* loaded from: classes10.dex */
public class setTranslationY {
    public int AlternateContactlessPaymentDataJson;
    public long DigitizedCardProfile;
    public java.lang.Object IccPrivateKeyCrtComponentsJson;
    public float RecordsJson;
    public java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl;
    private final int[] SdkCoreBusinessLogicModuleImpl;
    public double getAid;
    private int getCiacDecline;
    private final java.lang.Object[] getCvmResetTimeout;
    private final long[] getCvrMaskAnd;
    private final float[] getGpoResponse;
    private int getPaymentFci;
    public double getProfileVersion;
    private final double[] getSecurityWord;
    public int valueOf;
    public float values;
    public long writeReplace;

    public int values(int i) {
        java.lang.Object[] objArr = null;
        switch (i) {
            case 1:
                java.lang.Object[] objArr2 = this.getCvmResetTimeout;
                int i2 = this.getCiacDecline;
                this.getCiacDecline = i2 + 1;
                objArr2[i2] = this.SdkCoreAlternateContactlessPaymentDataImpl;
                return 0;
            case 2:
                int i3 = this.getCiacDecline - this.AlternateContactlessPaymentDataJson;
                this.getCiacDecline = i3;
                this.getPaymentFci = i3;
                return 0;
            case 3:
                java.lang.Object[] objArr3 = this.getCvmResetTimeout;
                int i4 = this.getPaymentFci;
                this.getPaymentFci = i4 + 1;
                java.lang.Object obj = objArr3[i4];
                objArr3[i4] = null;
                this.IccPrivateKeyCrtComponentsJson = obj;
                return 0;
            case 4:
                int i5 = this.getCiacDecline - 1;
                this.getCiacDecline = i5;
                this.getCvmResetTimeout[i5] = null;
                return 0;
            case 5:
                int[] iArr = this.SdkCoreBusinessLogicModuleImpl;
                int i6 = this.getCiacDecline;
                int i7 = i6 + 1;
                iArr[i6] = 2;
                iArr[i7] = 2;
                this.getCiacDecline = i7;
                iArr[i6] = iArr[i6] % 2;
                return 0;
            case 7:
                int[] iArr2 = this.SdkCoreBusinessLogicModuleImpl;
                int i8 = this.getCiacDecline;
                this.getCiacDecline = i8 + 1;
                iArr2[i8] = this.AlternateContactlessPaymentDataJson;
            case 6:
                return 0;
            case 8:
                int[] iArr3 = this.SdkCoreBusinessLogicModuleImpl;
                int i9 = this.getCiacDecline;
                iArr3[i9] = 83;
                this.getCiacDecline = i9;
                int i10 = i9 - 1;
                iArr3[i10] = iArr3[i10] + 83;
                return 0;
            case 9:
                int[] iArr4 = this.SdkCoreBusinessLogicModuleImpl;
                int i11 = this.getCiacDecline;
                iArr4[i11] = iArr4[i11 - 1];
                this.getCiacDecline = i11 + 2;
                iArr4[i11 + 1] = 128;
                return 0;
            case 10:
                int[] iArr5 = this.SdkCoreBusinessLogicModuleImpl;
                int i12 = this.getPaymentFci;
                this.getPaymentFci = i12 + 1;
                this.valueOf = iArr5[i12];
                return 0;
            case 11:
                int i13 = this.getCiacDecline;
                int i14 = i13 - 1;
                this.getCiacDecline = i14;
                int[] iArr6 = this.SdkCoreBusinessLogicModuleImpl;
                int i15 = i13 - 2;
                iArr6[i15] = iArr6[i15] % iArr6[i14];
                return 0;
            case 12:
                int[] iArr7 = this.SdkCoreBusinessLogicModuleImpl;
                int i16 = this.getCiacDecline;
                iArr7[i16] = 2;
                this.getCiacDecline = i16;
                int i17 = i16 - 1;
                iArr7[i17] = iArr7[i17] % 2;
                return 0;
            case 13:
                int i18 = this.getCiacDecline - 1;
                this.getCiacDecline = i18;
                this.valueOf = this.SdkCoreBusinessLogicModuleImpl[i18] == 0 ? 0 : 1;
                return 0;
            case 14:
                java.lang.Object[] objArr4 = this.getCvmResetTimeout;
                int i19 = this.getCiacDecline - 1;
                java.lang.Object obj2 = objArr4[i19];
                objArr4[i19] = null;
                this.IccPrivateKeyCrtComponentsJson = obj2;
                return 0;
            case 15:
                int[] iArr8 = this.SdkCoreBusinessLogicModuleImpl;
                int i20 = this.getCiacDecline;
                int i21 = i20 + 1;
                iArr8[i20] = 54;
                iArr8[i21] = 0;
                this.getCiacDecline = i21;
                iArr8[i20] = iArr8[i20] / 0;
                return 0;
            case 16:
                int[] iArr9 = this.SdkCoreBusinessLogicModuleImpl;
                int i22 = this.getCiacDecline - 1;
                this.getCiacDecline = i22;
                this.valueOf = iArr9[i22];
                return 0;
            case 17:
                int[] iArr10 = this.SdkCoreBusinessLogicModuleImpl;
                int i23 = this.getCiacDecline;
                this.getCiacDecline = i23 + 1;
                iArr10[i23] = 56;
                return 0;
            case 18:
                int[] iArr11 = this.SdkCoreBusinessLogicModuleImpl;
                int i24 = this.getCiacDecline;
                this.getCiacDecline = i24 + 1;
                iArr11[i24] = 32;
                return 0;
            case 19:
                for (int i25 = this.getCiacDecline - 1; i25 >= 0; i25--) {
                    this.getCvmResetTimeout[i25] = null;
                }
                java.lang.Object[] objArr5 = this.getCvmResetTimeout;
                this.getCiacDecline = 1;
                objArr5[0] = this.SdkCoreAlternateContactlessPaymentDataImpl;
                return 0;
            case 20:
                int[] iArr12 = this.SdkCoreBusinessLogicModuleImpl;
                int i26 = this.getCiacDecline;
                this.getCiacDecline = i26 + 1;
                iArr12[i26] = 3;
                return 0;
            case 21:
                int[] iArr13 = this.SdkCoreBusinessLogicModuleImpl;
                int i27 = this.getCiacDecline;
                iArr13[i27] = 0;
                this.getCiacDecline = i27 + 2;
                iArr13[i27 + 1] = 0;
                return 0;
            case 22:
                int i28 = this.getCiacDecline;
                int i29 = i28 - 1;
                this.getCiacDecline = i29;
                int[] iArr14 = this.SdkCoreBusinessLogicModuleImpl;
                int i30 = i28 - 2;
                iArr14[i30] = iArr14[i30] - iArr14[i29];
                return 0;
            case 23:
                java.lang.Object[] objArr6 = this.getCvmResetTimeout;
                int i31 = this.getCiacDecline;
                this.getCiacDecline = i31 + 1;
                objArr6[i31] = objArr6[i31 - 1];
                return 0;
            case 24:
                int i32 = this.getCiacDecline - 1;
                this.getCiacDecline = i32;
                java.lang.Object[] objArr7 = this.getCvmResetTimeout;
                java.lang.Object obj3 = objArr7[i32];
                objArr7[i32] = null;
                this.valueOf = obj3 == null ? 0 : 1;
                return 0;
            case 25:
                java.lang.Object[] objArr8 = this.getCvmResetTimeout;
                int i33 = this.getCiacDecline;
                int i34 = i33 - 1;
                java.lang.Object obj4 = objArr8[i34];
                objArr8[i34] = null;
                int i35 = i33 - 2;
                java.lang.Object obj5 = objArr8[i35];
                objArr8[i35] = null;
                objArr8[i34] = obj5;
                objArr8[i35] = obj4;
                return 0;
            case 26:
                int[] iArr15 = this.SdkCoreBusinessLogicModuleImpl;
                int i36 = this.getCiacDecline;
                this.getCiacDecline = i36 + 1;
                iArr15[i36] = 1;
                return 0;
            case 27:
                java.lang.Object[] objArr9 = this.getCvmResetTimeout;
                int i37 = this.getCiacDecline;
                this.getCiacDecline = i37 + 1;
                int i38 = i37 - 1;
                java.lang.Object obj6 = objArr9[i38];
                objArr9[i38] = null;
                objArr9[i37] = obj6;
                int i39 = i37 - 2;
                java.lang.Object obj7 = objArr9[i39];
                objArr9[i39] = null;
                objArr9[i38] = obj7;
                objArr9[i39] = obj6;
                return 0;
            case 28:
                int[] iArr16 = this.SdkCoreBusinessLogicModuleImpl;
                int i40 = this.getCiacDecline;
                this.getCiacDecline = i40 + 1;
                iArr16[i40] = 0;
                java.lang.Object[] objArr10 = this.getCvmResetTimeout;
                int i41 = i40 - 1;
                java.lang.Object obj8 = objArr10[i41];
                objArr10[i41] = null;
                objArr10[i40] = obj8;
                iArr16[i41] = 0;
                return 0;
            case 29:
                int i42 = this.getCiacDecline;
                int i43 = i42 - 3;
                this.getCiacDecline = i43;
                java.lang.Object[] objArr11 = this.getCvmResetTimeout;
                java.lang.Object obj9 = objArr11[i43];
                objArr11[i43] = null;
                int i44 = this.SdkCoreBusinessLogicModuleImpl[i42 - 2];
                int i45 = i42 - 1;
                java.lang.Object obj10 = objArr11[i45];
                objArr11[i45] = null;
                ((java.lang.Object[]) obj9)[i44] = obj10;
                return 0;
            case 30:
                int[] iArr17 = this.SdkCoreBusinessLogicModuleImpl;
                int i46 = this.getCiacDecline;
                this.getCiacDecline = i46 + 1;
                iArr17[i46] = 0;
                return 0;
            case 31:
                java.lang.Object[] objArr12 = this.getCvmResetTimeout;
                int i47 = this.getCiacDecline;
                int i48 = i47 - 1;
                java.lang.Object obj11 = objArr12[i48];
                objArr12[i48] = null;
                int i49 = i47 - 2;
                java.lang.Object obj12 = objArr12[i49];
                objArr12[i49] = null;
                objArr12[i48] = obj12;
                objArr12[i49] = obj11;
                this.getCiacDecline = i47 + 1;
                objArr12[i47] = null;
                return 0;
            case 32:
                int[] iArr18 = this.SdkCoreBusinessLogicModuleImpl;
                int i50 = this.getCiacDecline;
                this.getCiacDecline = i50 + 1;
                iArr18[i50] = 2;
                return 0;
            case 33:
                int[] iArr19 = this.SdkCoreBusinessLogicModuleImpl;
                int i51 = this.getCiacDecline;
                this.getCiacDecline = i51 + 1;
                iArr19[i51] = 41;
                return 0;
            case 34:
                int i52 = this.getCiacDecline;
                int i53 = i52 - 1;
                int[] iArr20 = this.SdkCoreBusinessLogicModuleImpl;
                int i54 = i52 - 2;
                int i55 = iArr20[i54] + iArr20[i53];
                iArr20[i54] = i55;
                iArr20[i53] = i55;
                this.getCiacDecline = i52 + 1;
                iArr20[i52] = 128;
                return 0;
            case 35:
                java.lang.Object[] objArr13 = this.getCvmResetTimeout;
                int i56 = this.getCiacDecline;
                this.getCiacDecline = i56 + 1;
                objArr13[i56] = null;
                int[] iArr21 = this.SdkCoreBusinessLogicModuleImpl;
                objArr13[i56] = null;
                iArr21[i56] = objArr.length;
                return 0;
            case 36:
                int[] iArr22 = this.SdkCoreBusinessLogicModuleImpl;
                int i57 = this.getCiacDecline;
                iArr22[i57] = 97;
                this.getCiacDecline = i57;
                int i58 = i57 - 1;
                iArr22[i58] = iArr22[i58] + 97;
                return 0;
            case 37:
                int[] iArr23 = this.SdkCoreBusinessLogicModuleImpl;
                int i59 = this.getCiacDecline;
                int i60 = i59 + 1;
                iArr23[i59] = iArr23[i59 - 1];
                iArr23[i60] = 128;
                this.getCiacDecline = i60;
                iArr23[i59] = iArr23[i59] % 128;
                return 0;
            case 38:
                int i61 = this.getCiacDecline - 1;
                this.getCiacDecline = i61;
                this.valueOf = this.SdkCoreBusinessLogicModuleImpl[i61] != 0 ? 0 : 1;
                return 0;
            case 39:
                int[] iArr24 = this.SdkCoreBusinessLogicModuleImpl;
                int i62 = this.getCiacDecline;
                iArr24[i62] = 0;
                this.getCiacDecline = i62 + 2;
                iArr24[i62 + 1] = 1;
                return 0;
            case 40:
                int[] iArr25 = this.SdkCoreBusinessLogicModuleImpl;
                int i63 = this.getCiacDecline;
                iArr25[i63] = 3;
                this.getCiacDecline = i63 + 2;
                iArr25[i63 + 1] = 0;
                return 0;
            case 41:
                int i64 = this.getCiacDecline;
                int i65 = i64 - 1;
                this.getCiacDecline = i65;
                int[] iArr26 = this.SdkCoreBusinessLogicModuleImpl;
                int i66 = i64 - 2;
                iArr26[i66] = iArr26[i66] + iArr26[i65];
                return 0;
            case 42:
                java.lang.Object[] objArr14 = this.getCvmResetTimeout;
                int i67 = this.getCiacDecline;
                int i68 = i67 - 1;
                java.lang.Object obj13 = objArr14[i68];
                objArr14[i68] = null;
                objArr14[i67] = obj13;
                int i69 = i67 - 2;
                java.lang.Object obj14 = objArr14[i69];
                objArr14[i69] = null;
                objArr14[i68] = obj14;
                objArr14[i69] = obj13;
                java.lang.Object obj15 = objArr14[i67];
                objArr14[i67] = null;
                java.lang.Object obj16 = objArr14[i68];
                objArr14[i68] = null;
                objArr14[i67] = obj16;
                objArr14[i68] = obj15;
                int[] iArr27 = this.SdkCoreBusinessLogicModuleImpl;
                this.getCiacDecline = i67 + 2;
                iArr27[i67 + 1] = 0;
                return 0;
            case 43:
                java.lang.Object[] objArr15 = this.getCvmResetTimeout;
                int i70 = this.getCiacDecline;
                int i71 = i70 - 2;
                java.lang.Object obj17 = objArr15[i71];
                objArr15[i71] = null;
                int i72 = i70 - 1;
                objArr15[i72] = obj17;
                int[] iArr28 = this.SdkCoreBusinessLogicModuleImpl;
                int i73 = iArr28[i72];
                iArr28[i71] = i73;
                int i74 = i70 - 3;
                this.getCiacDecline = i74;
                java.lang.Object obj18 = objArr15[i74];
                objArr15[i74] = null;
                java.lang.Object obj19 = objArr15[i72];
                objArr15[i72] = null;
                ((java.lang.Object[]) obj18)[i73] = obj19;
                return 0;
            case 44:
                java.lang.Object[] objArr16 = this.getCvmResetTimeout;
                int i75 = this.getCiacDecline;
                int i76 = i75 - 1;
                java.lang.Object obj20 = objArr16[i76];
                objArr16[i76] = null;
                int i77 = i75 - 2;
                java.lang.Object obj21 = objArr16[i77];
                objArr16[i77] = null;
                objArr16[i76] = obj21;
                objArr16[i77] = obj20;
                this.getCiacDecline = i75 + 1;
                objArr16[i75] = null;
                objArr16[i75] = null;
                java.lang.Object obj22 = objArr16[i76];
                objArr16[i76] = null;
                objArr16[i75] = obj22;
                objArr16[i76] = null;
                return 0;
            case 45:
                int[] iArr29 = this.SdkCoreBusinessLogicModuleImpl;
                int i78 = this.getCiacDecline;
                this.getCiacDecline = i78 + 1;
                iArr29[i78] = 111;
                return 0;
            case 46:
                int i79 = this.getCiacDecline;
                int i80 = i79 - 1;
                int[] iArr30 = this.SdkCoreBusinessLogicModuleImpl;
                int i81 = i79 - 2;
                int i82 = iArr30[i81] + iArr30[i80];
                iArr30[i81] = i82;
                this.getCiacDecline = i79;
                iArr30[i80] = i82;
                return 0;
            case 47:
                int[] iArr31 = this.SdkCoreBusinessLogicModuleImpl;
                int i83 = this.getCiacDecline;
                iArr31[i83] = 128;
                this.getCiacDecline = i83;
                int i84 = i83 - 1;
                iArr31[i84] = iArr31[i84] % 128;
                return 0;
            case 48:
                int[] iArr32 = this.SdkCoreBusinessLogicModuleImpl;
                int i85 = this.getCiacDecline;
                iArr32[i85] = 49;
                int i86 = i85 - 1;
                int i87 = iArr32[i86] + 49;
                iArr32[i86] = i87;
                this.getCiacDecline = i85 + 1;
                iArr32[i85] = i87;
                return 0;
            case 49:
                int[] iArr33 = this.SdkCoreBusinessLogicModuleImpl;
                int i88 = this.getCiacDecline;
                this.getCiacDecline = i88 + 1;
                iArr33[i88] = 128;
                return 0;
            case 50:
                int[] iArr34 = this.SdkCoreBusinessLogicModuleImpl;
                int i89 = this.getCiacDecline;
                this.getCiacDecline = i89 + 1;
                iArr34[i89] = 16;
                return 0;
            case 51:
                int i90 = this.getCiacDecline;
                int i91 = i90 - 1;
                this.getCiacDecline = i91;
                int[] iArr35 = this.SdkCoreBusinessLogicModuleImpl;
                int i92 = i90 - 2;
                iArr35[i92] = iArr35[i92] >> iArr35[i91];
                return 0;
            case 52:
                java.lang.Object[] objArr17 = this.getCvmResetTimeout;
                int i93 = this.getCiacDecline;
                int i94 = i93 - 1;
                java.lang.Object obj23 = objArr17[i94];
                objArr17[i94] = null;
                int i95 = i93 - 2;
                java.lang.Object obj24 = objArr17[i95];
                objArr17[i95] = null;
                objArr17[i94] = obj24;
                objArr17[i95] = obj23;
                int i96 = i93 - 1;
                this.getCiacDecline = i96;
                objArr17[i96] = null;
                return 0;
            case 53:
                java.lang.Object[] objArr18 = this.getCvmResetTimeout;
                int i97 = this.getCiacDecline;
                this.getCiacDecline = i97 + 1;
                int i98 = i97 - 1;
                java.lang.Object obj25 = objArr18[i98];
                objArr18[i98] = null;
                objArr18[i97] = obj25;
                int i99 = i97 - 2;
                java.lang.Object obj26 = objArr18[i99];
                objArr18[i99] = null;
                objArr18[i98] = obj26;
                objArr18[i99] = obj25;
                java.lang.Object obj27 = objArr18[i97];
                objArr18[i97] = null;
                java.lang.Object obj28 = objArr18[i98];
                objArr18[i98] = null;
                objArr18[i97] = obj28;
                objArr18[i98] = obj27;
                return 0;
            case 54:
                java.lang.Object[] objArr19 = this.getCvmResetTimeout;
                int i100 = this.getCiacDecline;
                this.getCiacDecline = i100 + 1;
                objArr19[i100] = null;
                return 0;
            case 55:
                int i101 = this.getCiacDecline;
                int i102 = i101 - 1;
                this.getCiacDecline = i102;
                int[] iArr36 = this.SdkCoreBusinessLogicModuleImpl;
                int i103 = i101 - 2;
                iArr36[i103] = iArr36[i103] % iArr36[i102];
                int i104 = i101 - 2;
                this.getCiacDecline = i104;
                this.getCvmResetTimeout[i104] = null;
                return 0;
            case 56:
                int[] iArr37 = this.SdkCoreBusinessLogicModuleImpl;
                int i105 = this.getCiacDecline;
                this.getCiacDecline = i105 + 1;
                iArr37[i105] = 109;
                return 0;
            case 57:
                int[] iArr38 = this.SdkCoreBusinessLogicModuleImpl;
                int i106 = this.getCiacDecline;
                iArr38[i106] = 123;
                this.getCiacDecline = i106;
                int i107 = i106 - 1;
                iArr38[i107] = iArr38[i107] + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                return 0;
            case 58:
                int[] iArr39 = this.SdkCoreBusinessLogicModuleImpl;
                int i108 = this.getCiacDecline;
                int i109 = i108 + 1;
                iArr39[i108] = 5;
                iArr39[i109] = 5;
                this.getCiacDecline = i109;
                iArr39[i108] = iArr39[i108] * 5;
                return 0;
            case 59:
                int[] iArr40 = this.SdkCoreBusinessLogicModuleImpl;
                int i110 = this.getCiacDecline;
                this.getCiacDecline = i110 + 1;
                iArr40[i110] = 95;
                return 0;
            case 60:
                int[] iArr41 = this.SdkCoreBusinessLogicModuleImpl;
                int i111 = this.getCiacDecline;
                this.getCiacDecline = i111 + 1;
                iArr41[i111] = 78;
                return 0;
            case 61:
                long[] jArr = this.getCvrMaskAnd;
                int i112 = this.getCiacDecline;
                this.getCiacDecline = i112 + 1;
                jArr[i112] = this.DigitizedCardProfile;
                return 0;
            case 62:
                long[] jArr2 = this.getCvrMaskAnd;
                int i113 = this.getCiacDecline;
                jArr2[i113] = 0;
                this.getCiacDecline = i113;
                int i114 = i113 - 1;
                this.SdkCoreBusinessLogicModuleImpl[i114] = (jArr2[i114] > 0L ? 1 : (jArr2[i114] == 0L ? 0 : -1));
                return 0;
            case 63:
                java.lang.Object[] objArr20 = this.getCvmResetTimeout;
                int i115 = this.getCiacDecline;
                objArr20[i115] = objArr20[i115 - 1];
                int[] iArr42 = this.SdkCoreBusinessLogicModuleImpl;
                this.getCiacDecline = i115 + 2;
                iArr42[i115 + 1] = 0;
                return 0;
            case 64:
                int[] iArr43 = this.SdkCoreBusinessLogicModuleImpl;
                int i116 = this.getCiacDecline;
                iArr43[i116] = 2;
                this.getCiacDecline = i116 + 2;
                iArr43[i116 + 1] = 2;
                return 0;
            case 65:
                int[] iArr44 = this.SdkCoreBusinessLogicModuleImpl;
                int i117 = this.getCiacDecline;
                this.getCiacDecline = i117 + 1;
                iArr44[i117] = 125;
                return 0;
            case 66:
                int[] iArr45 = this.SdkCoreBusinessLogicModuleImpl;
                int i118 = this.getCiacDecline;
                this.getCiacDecline = i118 + 1;
                iArr45[i118] = 115;
                return 0;
            case 67:
                int[] iArr46 = this.SdkCoreBusinessLogicModuleImpl;
                int i119 = this.getCiacDecline;
                this.getCiacDecline = i119 + 1;
                iArr46[i119] = iArr46[i119 - 1];
                return 0;
            case 68:
                int[] iArr47 = this.SdkCoreBusinessLogicModuleImpl;
                int i120 = this.getCiacDecline;
                iArr47[i120] = 8;
                this.getCiacDecline = i120;
                int i121 = i120 - 1;
                iArr47[i121] = iArr47[i121] >> 8;
                return 0;
            case 69:
                java.lang.Object[] objArr21 = this.getCvmResetTimeout;
                int i122 = this.getCiacDecline;
                this.getCiacDecline = i122 + 1;
                objArr21[i122] = null;
                objArr21[i122] = null;
                int i123 = i122 - 1;
                java.lang.Object obj29 = objArr21[i123];
                objArr21[i123] = null;
                objArr21[i122] = obj29;
                objArr21[i123] = null;
                return 0;
            case 70:
                int[] iArr48 = this.SdkCoreBusinessLogicModuleImpl;
                int i124 = this.getCiacDecline;
                this.getCiacDecline = i124 + 1;
                iArr48[i124] = 77;
                return 0;
            case 71:
                int[] iArr49 = this.SdkCoreBusinessLogicModuleImpl;
                int i125 = this.getCiacDecline;
                int i126 = i125 + 1;
                iArr49[i125] = 32;
                iArr49[i126] = 0;
                this.getCiacDecline = i126;
                iArr49[i125] = iArr49[i125] / 0;
                return 0;
            case 72:
                int[] iArr50 = this.SdkCoreBusinessLogicModuleImpl;
                int i127 = this.getCiacDecline;
                iArr50[i127] = 115;
                int i128 = i127 - 1;
                int i129 = iArr50[i128] + 115;
                iArr50[i128] = i129;
                this.getCiacDecline = i127 + 1;
                iArr50[i127] = i129;
                return 0;
            case 73:
                int[] iArr51 = this.SdkCoreBusinessLogicModuleImpl;
                int i130 = this.getCiacDecline;
                this.getCiacDecline = i130 + 1;
                iArr51[i130] = 14;
                return 0;
            case 74:
                int i131 = this.getCiacDecline;
                int[] iArr52 = this.SdkCoreBusinessLogicModuleImpl;
                int i132 = i131 - 2;
                int i133 = iArr52[i132] - iArr52[i131 - 1];
                iArr52[i132] = i133;
                this.getCiacDecline = i132;
                int i134 = i131 - 3;
                iArr52[i134] = iArr52[i134] << i133;
                return 0;
            case 75:
                int[] iArr53 = this.SdkCoreBusinessLogicModuleImpl;
                int i135 = this.getCiacDecline;
                this.getCiacDecline = i135 + 1;
                iArr53[i135] = 4;
                return 0;
            case 76:
                long[] jArr3 = this.getCvrMaskAnd;
                int i136 = this.getCiacDecline;
                this.getCiacDecline = i136 + 1;
                jArr3[i136] = 0;
                return 0;
            case 77:
                int i137 = this.getCiacDecline;
                int[] iArr54 = this.SdkCoreBusinessLogicModuleImpl;
                long[] jArr4 = this.getCvrMaskAnd;
                int i138 = i137 - 2;
                int i139 = (jArr4[i138] > jArr4[i137 - 1] ? 1 : (jArr4[i138] == jArr4[i137 - 1] ? 0 : -1));
                iArr54[i138] = i139;
                this.getCiacDecline = i138;
                int i140 = i137 - 3;
                iArr54[i140] = iArr54[i140] - i139;
                return 0;
            case 78:
                int[] iArr55 = this.SdkCoreBusinessLogicModuleImpl;
                int i141 = this.getCiacDecline;
                iArr55[i141] = 5;
                int i142 = i141 - 1;
                int i143 = iArr55[i142] + 5;
                iArr55[i142] = i143;
                this.getCiacDecline = i141 + 1;
                iArr55[i141] = i143;
                return 0;
            case 79:
                int[] iArr56 = this.SdkCoreBusinessLogicModuleImpl;
                int i144 = this.getCiacDecline;
                iArr56[i144] = 125;
                int i145 = i144 - 1;
                int i146 = iArr56[i145] + 125;
                iArr56[i145] = i146;
                this.getCiacDecline = i144 + 1;
                iArr56[i144] = i146;
                return 0;
            case 80:
                long[] jArr5 = this.getCvrMaskAnd;
                int i147 = this.getCiacDecline;
                jArr5[i147] = 0;
                int[] iArr57 = this.SdkCoreBusinessLogicModuleImpl;
                int i148 = i147 - 1;
                int i149 = (jArr5[i148] > 0L ? 1 : (jArr5[i148] == 0L ? 0 : -1));
                iArr57[i148] = i149;
                this.getCiacDecline = i148;
                int i150 = i147 - 2;
                iArr57[i150] = iArr57[i150] >>> i149;
                return 0;
            case 81:
                int[] iArr58 = this.SdkCoreBusinessLogicModuleImpl;
                int i151 = this.getCiacDecline;
                iArr58[i151] = 13;
                this.getCiacDecline = i151;
                int i152 = i151 - 1;
                iArr58[i152] = iArr58[i152] + 13;
                return 0;
            case 82:
                int[] iArr59 = this.SdkCoreBusinessLogicModuleImpl;
                int i153 = this.getCiacDecline;
                this.getCiacDecline = i153 + 1;
                iArr59[i153] = 90;
                return 0;
            case 83:
                int[] iArr60 = this.SdkCoreBusinessLogicModuleImpl;
                int i154 = this.getCiacDecline;
                this.getCiacDecline = i154 + 1;
                iArr60[i154] = 65;
                return 0;
            default:
                return i;
        }
    }

    public setTranslationY(long j, long j2) {
        this.SdkCoreBusinessLogicModuleImpl = new int[11];
        long[] jArr = new long[11];
        this.getCvrMaskAnd = jArr;
        this.getGpoResponse = new float[11];
        this.getSecurityWord = new double[11];
        this.getCvmResetTimeout = new java.lang.Object[11];
        jArr[7] = j;
        jArr[9] = j2;
        this.getCiacDecline = 0;
        this.getPaymentFci = -1;
    }

    public setTranslationY() {
        this.SdkCoreBusinessLogicModuleImpl = new int[11];
        this.getCvrMaskAnd = new long[11];
        this.getGpoResponse = new float[11];
        this.getSecurityWord = new double[11];
        this.getCvmResetTimeout = new java.lang.Object[11];
        this.getCiacDecline = 0;
        this.getPaymentFci = -1;
    }
}

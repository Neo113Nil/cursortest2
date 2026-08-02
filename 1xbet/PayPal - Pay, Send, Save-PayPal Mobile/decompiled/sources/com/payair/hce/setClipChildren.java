package com.payair.hce;

/* loaded from: classes4.dex */
public class setClipChildren {
    public int AlternateContactlessPaymentDataJson;
    public float DigitizedCardProfile;
    public java.lang.Object IccPrivateKeyCrtComponentsJson;
    public double RecordsJson;
    public double SdkCoreAlternateContactlessPaymentDataImpl;
    private final long[] SdkCoreBusinessLogicModuleImpl;
    public float getAid;
    private final java.lang.Object[] getApplicationLifeCycleData;
    private final int[] getCiacDecline;
    private int getCvrMaskAnd;
    private final double[] getDualTapResetTimeout;
    private int getGpoResponse;
    private final float[] getPaymentFci;
    public java.lang.Object getProfileVersion;
    public long valueOf;
    public int values;
    public long writeReplace;

    public int AlternateContactlessPaymentDataJson(int i) {
        switch (i) {
            case 1:
                java.lang.Object[] objArr = this.getApplicationLifeCycleData;
                int i2 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i2 + 1;
                objArr[i2] = this.IccPrivateKeyCrtComponentsJson;
                return 0;
            case 2:
                int i3 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i3;
                java.lang.Object[] objArr2 = this.getApplicationLifeCycleData;
                java.lang.Object obj = objArr2[i3];
                objArr2[i3] = null;
                this.AlternateContactlessPaymentDataJson = obj != null ? 0 : 1;
                return 0;
            case 3:
                java.lang.Object[] objArr3 = this.getApplicationLifeCycleData;
                int i4 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i4 + 1;
                objArr3[i4] = objArr3[i4 - 1];
                return 0;
            case 4:
                int i5 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i5;
                java.lang.Object[] objArr4 = this.getApplicationLifeCycleData;
                java.lang.Object obj2 = objArr4[i5];
                objArr4[i5] = null;
                objArr4[8] = obj2;
                return 0;
            case 5:
                int i6 = this.getCvrMaskAnd - this.values;
                this.getCvrMaskAnd = i6;
                this.getGpoResponse = i6;
                return 0;
            case 6:
                java.lang.Object[] objArr5 = this.getApplicationLifeCycleData;
                int i7 = this.getGpoResponse;
                this.getGpoResponse = i7 + 1;
                java.lang.Object obj3 = objArr5[i7];
                objArr5[i7] = null;
                this.getProfileVersion = obj3;
                return 0;
            case 7:
                int i8 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i8;
                java.lang.Object[] objArr6 = this.getApplicationLifeCycleData;
                java.lang.Object obj4 = objArr6[i8];
                objArr6[i8] = null;
                this.AlternateContactlessPaymentDataJson = obj4 == null ? 0 : 1;
                return 0;
            case 8:
                java.lang.Object[] objArr7 = this.getApplicationLifeCycleData;
                int i9 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i9 + 1;
                objArr7[i9] = objArr7[8];
                return 0;
            case 9:
                int[] iArr = this.getCiacDecline;
                int i10 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i10 + 1;
                iArr[i10] = 0;
                return 0;
            case 10:
                int[] iArr2 = this.getCiacDecline;
                int i11 = this.getGpoResponse;
                this.getGpoResponse = i11 + 1;
                this.AlternateContactlessPaymentDataJson = iArr2[i11];
                return 0;
            case 11:
                java.lang.Object[] objArr8 = this.getApplicationLifeCycleData;
                int i12 = this.getCvrMaskAnd - 1;
                java.lang.Object obj5 = objArr8[i12];
                objArr8[i12] = null;
                this.getProfileVersion = obj5;
                return 0;
            case 12:
                int[] iArr3 = this.getCiacDecline;
                int i13 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i13 + 1;
                iArr3[i13] = 2;
                return 0;
            case 13:
                int i14 = this.getCvrMaskAnd;
                int i15 = i14 - 1;
                this.getCvrMaskAnd = i15;
                int[] iArr4 = this.getCiacDecline;
                int i16 = i14 - 2;
                iArr4[i16] = iArr4[i16] % iArr4[i15];
                return 0;
            case 14:
                int i17 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i17;
                this.getApplicationLifeCycleData[i17] = null;
                return 0;
            case 15:
                int[] iArr5 = this.getCiacDecline;
                int i18 = this.getCvrMaskAnd;
                iArr5[i18] = 2;
                this.getCvrMaskAnd = i18;
                int i19 = i18 - 1;
                iArr5[i19] = iArr5[i19] % 2;
                return 0;
            case 16:
                int[] iArr6 = this.getCiacDecline;
                int i20 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i20 + 1;
                iArr6[i20] = this.values;
                return 0;
            case 17:
                int[] iArr7 = this.getCiacDecline;
                int i21 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i21 + 1;
                iArr7[i21] = 123;
                return 0;
            case 18:
                int i22 = this.getCvrMaskAnd;
                int i23 = i22 - 1;
                int[] iArr8 = this.getCiacDecline;
                int i24 = i22 - 2;
                int i25 = iArr8[i24] + iArr8[i23];
                iArr8[i24] = i25;
                this.getCvrMaskAnd = i22;
                iArr8[i23] = i25;
                return 0;
            case 19:
                int[] iArr9 = this.getCiacDecline;
                int i26 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i26 + 1;
                iArr9[i26] = 128;
                return 0;
            case 20:
                int i27 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i27;
                this.AlternateContactlessPaymentDataJson = this.getCiacDecline[i27] != 0 ? 0 : 1;
                return 0;
            case 21:
                int[] iArr10 = this.getCiacDecline;
                int i28 = this.getCvrMaskAnd;
                iArr10[i28] = 4;
                this.getCvrMaskAnd = i28 + 2;
                iArr10[i28 + 1] = 5;
                return 0;
            case 22:
                int i29 = this.getCvrMaskAnd;
                int[] iArr11 = this.getCiacDecline;
                int i30 = i29 - 2;
                iArr11[i30] = iArr11[i30] << iArr11[i29 - 1];
                int i31 = i29 - 2;
                this.getCvrMaskAnd = i31;
                this.getApplicationLifeCycleData[i31] = null;
                return 0;
            case 23:
                int[] iArr12 = this.getCiacDecline;
                int i32 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i32 + 1;
                iArr12[i32] = 69;
                return 0;
            case 24:
                int i33 = this.getCvrMaskAnd;
                int i34 = i33 - 1;
                this.getCvrMaskAnd = i34;
                int[] iArr13 = this.getCiacDecline;
                int i35 = i33 - 2;
                iArr13[i35] = iArr13[i35] + iArr13[i34];
                return 0;
            case 25:
                int[] iArr14 = this.getCiacDecline;
                int i36 = this.getCvrMaskAnd;
                int i37 = i36 + 1;
                iArr14[i36] = iArr14[i36 - 1];
                iArr14[i37] = 128;
                this.getCvrMaskAnd = i37;
                iArr14[i36] = iArr14[i36] % 128;
                return 0;
            case 26:
                java.lang.Object[] objArr9 = this.getApplicationLifeCycleData;
                int i38 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i38 + 1;
                objArr9[i38] = null;
                return 0;
            case 27:
                int[] iArr15 = this.getCiacDecline;
                int i39 = this.getCvrMaskAnd;
                iArr15[i39] = 1;
                this.getCvrMaskAnd = i39;
                int i40 = i39 - 1;
                iArr15[i40] = iArr15[i40] + 1;
                return 0;
            case 28:
                int[] iArr16 = this.getCiacDecline;
                int i41 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i41;
                this.AlternateContactlessPaymentDataJson = iArr16[i41];
                return 0;
            case 29:
                int[] iArr17 = this.getCiacDecline;
                int i42 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i42 + 1;
                iArr17[i42] = 1;
                return 0;
            case 30:
                for (int i43 = this.getCvrMaskAnd - 1; i43 >= 0; i43--) {
                    this.getApplicationLifeCycleData[i43] = null;
                }
                java.lang.Object[] objArr10 = this.getApplicationLifeCycleData;
                this.getCvrMaskAnd = 1;
                objArr10[0] = this.IccPrivateKeyCrtComponentsJson;
                return 0;
            case 31:
                int[] iArr18 = this.getCiacDecline;
                int i44 = this.getCvrMaskAnd;
                java.lang.Object[] objArr11 = this.getApplicationLifeCycleData;
                int i45 = i44 - 1;
                java.lang.Object obj6 = objArr11[i45];
                objArr11[i45] = null;
                iArr18[i45] = ((byte[]) obj6).length;
                return 0;
            case 32:
                java.lang.Object[] objArr12 = this.getApplicationLifeCycleData;
                int i46 = this.getCvrMaskAnd - 1;
                objArr12[i46] = new byte[this.getCiacDecline[i46]];
                return 0;
            case 33:
                int i47 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i47;
                java.lang.Object[] objArr13 = this.getApplicationLifeCycleData;
                java.lang.Object obj7 = objArr13[i47];
                objArr13[i47] = null;
                objArr13[9] = obj7;
                return 0;
            case 34:
                java.lang.Object[] objArr14 = this.getApplicationLifeCycleData;
                int i48 = this.getCvrMaskAnd;
                int i49 = i48 - 1;
                java.lang.Object obj8 = objArr14[i49];
                objArr14[i49] = null;
                int i50 = i48 - 2;
                java.lang.Object obj9 = objArr14[i50];
                objArr14[i50] = null;
                objArr14[i49] = obj9;
                objArr14[i50] = obj8;
                return 0;
            case 35:
                java.lang.Object[] objArr15 = this.getApplicationLifeCycleData;
                int i51 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i51 + 1;
                int i52 = i51 - 1;
                java.lang.Object obj10 = objArr15[i52];
                objArr15[i52] = null;
                objArr15[i51] = obj10;
                int i53 = i51 - 2;
                java.lang.Object obj11 = objArr15[i53];
                objArr15[i53] = null;
                objArr15[i52] = obj11;
                objArr15[i53] = obj10;
                java.lang.Object obj12 = objArr15[i51];
                objArr15[i51] = null;
                java.lang.Object obj13 = objArr15[i52];
                objArr15[i52] = null;
                objArr15[i51] = obj13;
                objArr15[i52] = obj12;
                return 0;
            case 36:
                int[] iArr19 = this.getCiacDecline;
                int i54 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i54 + 1;
                iArr19[i54] = 0;
                java.lang.Object[] objArr16 = this.getApplicationLifeCycleData;
                int i55 = i54 - 1;
                java.lang.Object obj14 = objArr16[i55];
                objArr16[i55] = null;
                objArr16[i54] = obj14;
                iArr19[i55] = 0;
                return 0;
            case 37:
                int i56 = this.getCvrMaskAnd;
                int i57 = i56 - 3;
                this.getCvrMaskAnd = i57;
                java.lang.Object[] objArr17 = this.getApplicationLifeCycleData;
                java.lang.Object obj15 = objArr17[i57];
                objArr17[i57] = null;
                int[] iArr20 = this.getCiacDecline;
                int i58 = i56 - 2;
                int i59 = iArr20[i58];
                int i60 = i56 - 1;
                java.lang.Object obj16 = objArr17[i60];
                objArr17[i60] = null;
                ((java.lang.Object[]) obj15)[i59] = obj16;
                this.getCvrMaskAnd = i58;
                iArr20[i57] = 127;
                return 0;
            case 38:
                int[] iArr21 = this.getCiacDecline;
                int i61 = this.getCvrMaskAnd;
                iArr21[i61] = 16;
                this.getCvrMaskAnd = i61;
                int i62 = i61 - 1;
                iArr21[i62] = iArr21[i62] >> 16;
                return 0;
            case 39:
                java.lang.Object[] objArr18 = this.getApplicationLifeCycleData;
                int i63 = this.getCvrMaskAnd;
                objArr18[i63] = null;
                this.getCvrMaskAnd = i63 + 2;
                objArr18[i63 + 1] = null;
                return 0;
            case 40:
                int[] iArr22 = this.getCiacDecline;
                int i64 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i64 + 1;
                iArr22[i64] = 127;
                return 0;
            case 41:
                int i65 = this.getCvrMaskAnd;
                int i66 = i65 - 1;
                int[] iArr23 = this.getCiacDecline;
                int i67 = i65 - 2;
                iArr23[i67] = iArr23[i67] - iArr23[i66];
                java.lang.Object[] objArr19 = this.getApplicationLifeCycleData;
                objArr19[i66] = null;
                this.getCvrMaskAnd = i65 + 1;
                objArr19[i65] = null;
                return 0;
            case 42:
                int i68 = this.getCvrMaskAnd;
                int i69 = i68 - 3;
                this.getCvrMaskAnd = i69;
                java.lang.Object[] objArr20 = this.getApplicationLifeCycleData;
                java.lang.Object obj17 = objArr20[i69];
                objArr20[i69] = null;
                int i70 = this.getCiacDecline[i68 - 2];
                int i71 = i68 - 1;
                java.lang.Object obj18 = objArr20[i71];
                objArr20[i71] = null;
                ((java.lang.Object[]) obj17)[i70] = obj18;
                return 0;
            case 43:
                java.lang.Object[] objArr21 = this.getApplicationLifeCycleData;
                int i72 = this.getCvrMaskAnd;
                int i73 = i72 - 1;
                java.lang.Object obj19 = objArr21[i73];
                objArr21[i73] = null;
                int i74 = i72 - 2;
                java.lang.Object obj20 = objArr21[i74];
                objArr21[i74] = null;
                objArr21[i73] = obj20;
                objArr21[i74] = obj19;
                this.getCvrMaskAnd = i72 + 1;
                objArr21[i72] = null;
                objArr21[i72] = null;
                java.lang.Object obj21 = objArr21[i73];
                objArr21[i73] = null;
                objArr21[i72] = obj21;
                objArr21[i73] = null;
                return 0;
            case 44:
                int i75 = this.getCvrMaskAnd;
                int i76 = i75 - 1;
                java.lang.Object[] objArr22 = this.getApplicationLifeCycleData;
                objArr22[i76] = null;
                this.getCvrMaskAnd = i75;
                objArr22[i76] = null;
                return 0;
            case 45:
                java.lang.Object[] objArr23 = this.getApplicationLifeCycleData;
                int i77 = this.getCvrMaskAnd;
                objArr23[i77] = objArr23[8];
                this.getCvrMaskAnd = i77 + 2;
                objArr23[i77 + 1] = objArr23[9];
                return 0;
            case 46:
                java.lang.Object[] objArr24 = this.getApplicationLifeCycleData;
                int i78 = this.getCvrMaskAnd;
                int i79 = i78 - 1;
                java.lang.Object obj22 = objArr24[i79];
                objArr24[i79] = null;
                int i80 = i78 - 2;
                java.lang.Object obj23 = objArr24[i80];
                objArr24[i80] = null;
                objArr24[i79] = obj23;
                objArr24[i80] = obj22;
                int i81 = i78 - 1;
                this.getCvrMaskAnd = i81;
                objArr24[i81] = null;
                return 0;
            case 47:
                int i82 = this.getCvrMaskAnd;
                int i83 = i82 - 3;
                this.getCvrMaskAnd = i83;
                java.lang.Object[] objArr25 = this.getApplicationLifeCycleData;
                java.lang.Object obj24 = objArr25[i83];
                objArr25[i83] = null;
                int[] iArr24 = this.getCiacDecline;
                int i84 = i82 - 2;
                int i85 = iArr24[i84];
                int i86 = i82 - 1;
                java.lang.Object obj25 = objArr25[i86];
                objArr25[i86] = null;
                ((java.lang.Object[]) obj24)[i85] = obj25;
                iArr24[i83] = 175;
                this.getCvrMaskAnd = i86;
                iArr24[i84] = 48;
                return 0;
            case 48:
                int i87 = this.getCvrMaskAnd;
                int i88 = i87 - 1;
                int[] iArr25 = this.getCiacDecline;
                int i89 = i87 - 2;
                iArr25[i89] = iArr25[i89] - iArr25[i88];
                java.lang.Object[] objArr26 = this.getApplicationLifeCycleData;
                this.getCvrMaskAnd = i87;
                objArr26[i88] = null;
                return 0;
            case 49:
                int[] iArr26 = this.getCiacDecline;
                int i90 = this.getCvrMaskAnd;
                iArr26[i90] = 127;
                iArr26[i90 + 1] = 0;
                this.getCvrMaskAnd = i90 + 3;
                iArr26[i90 + 2] = 0;
                return 0;
            case 50:
                int[] iArr27 = this.getCiacDecline;
                int i91 = this.getCvrMaskAnd;
                iArr27[i91] = 0;
                this.getCvrMaskAnd = i91 + 2;
                iArr27[i91 + 1] = 0;
                return 0;
            case 51:
                java.lang.Object[] objArr27 = this.getApplicationLifeCycleData;
                int i92 = this.getCvrMaskAnd;
                objArr27[i92] = objArr27[i92 - 1];
                int[] iArr28 = this.getCiacDecline;
                this.getCvrMaskAnd = i92 + 2;
                iArr28[i92 + 1] = 0;
                return 0;
            case 52:
                java.lang.Object[] objArr28 = this.getApplicationLifeCycleData;
                int i93 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i93 + 1;
                int i94 = i93 - 1;
                java.lang.Object obj26 = objArr28[i94];
                objArr28[i94] = null;
                objArr28[i93] = obj26;
                int i95 = i93 - 2;
                java.lang.Object obj27 = objArr28[i95];
                objArr28[i95] = null;
                objArr28[i94] = obj27;
                int i96 = i93 - 3;
                java.lang.Object obj28 = objArr28[i96];
                objArr28[i96] = null;
                objArr28[i95] = obj28;
                objArr28[i96] = obj26;
                return 0;
            case 53:
                int i97 = this.getCvrMaskAnd;
                int i98 = i97 - 1;
                java.lang.Object[] objArr29 = this.getApplicationLifeCycleData;
                java.lang.Object obj29 = objArr29[i98];
                objArr29[i98] = null;
                objArr29[8] = obj29;
                this.getCvrMaskAnd = i97;
                objArr29[i98] = obj29;
                return 0;
            case 54:
                int i99 = this.getCvrMaskAnd;
                int i100 = i99 - 1;
                this.getCvrMaskAnd = i100;
                int[] iArr29 = this.getCiacDecline;
                int i101 = i99 - 2;
                iArr29[i101] = iArr29[i101] % iArr29[i100];
                int i102 = i99 - 2;
                this.getCvrMaskAnd = i102;
                this.getApplicationLifeCycleData[i102] = null;
                return 0;
            case 56:
                int[] iArr30 = this.getCiacDecline;
                int i103 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i103 + 1;
                iArr30[i103] = 83;
            case 55:
                return 0;
            case 57:
                int i104 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i104;
                this.AlternateContactlessPaymentDataJson = this.getCiacDecline[i104] == 0 ? 0 : 1;
                return 0;
            case 58:
                java.lang.Object[] objArr30 = this.getApplicationLifeCycleData;
                int i105 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i105 + 1;
                java.lang.Object obj30 = objArr30[8];
                objArr30[i105] = obj30;
                int[] iArr31 = this.getCiacDecline;
                objArr30[i105] = null;
                int length = ((byte[]) obj30).length;
                iArr31[i105] = length;
                objArr30[i105] = new byte[length];
                return 0;
            case 59:
                int[] iArr32 = this.getCiacDecline;
                int i106 = this.getCvrMaskAnd;
                iArr32[i106] = 0;
                this.getCvrMaskAnd = i106 + 2;
                iArr32[i106 + 1] = 0;
                return 0;
            case 60:
                int i107 = this.getCvrMaskAnd;
                int i108 = i107 - 1;
                this.getCvrMaskAnd = i108;
                int[] iArr33 = this.getCiacDecline;
                int i109 = i107 - 2;
                iArr33[i109] = iArr33[i109] / iArr33[i108];
                int i110 = i107 - 2;
                this.getCvrMaskAnd = i110;
                this.getApplicationLifeCycleData[i110] = null;
                return 0;
            case 61:
                int[] iArr34 = this.getCiacDecline;
                int i111 = this.getCvrMaskAnd;
                iArr34[i111] = 73;
                this.getCvrMaskAnd = i111;
                int i112 = i111 - 1;
                iArr34[i112] = iArr34[i112] + 73;
                return 0;
            case 62:
                int[] iArr35 = this.getCiacDecline;
                int i113 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i113 + 1;
                iArr35[i113] = iArr35[i113 - 1];
                return 0;
            case 63:
                int[] iArr36 = this.getCiacDecline;
                int i114 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i114 + 1;
                iArr36[i114] = 70;
                return 0;
            case 64:
                int[] iArr37 = this.getCiacDecline;
                int i115 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i115 + 1;
                iArr37[i115] = 84;
                return 0;
            case 65:
                int[] iArr38 = this.getCiacDecline;
                int i116 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i116 + 1;
                iArr38[i116] = 47;
                return 0;
            case 66:
                int[] iArr39 = this.getCiacDecline;
                int i117 = this.getCvrMaskAnd;
                iArr39[i117] = 59;
                this.getCvrMaskAnd = i117;
                int i118 = i117 - 1;
                iArr39[i118] = iArr39[i118] + 59;
                return 0;
            case 67:
                int[] iArr40 = this.getCiacDecline;
                int i119 = this.getCvrMaskAnd;
                iArr40[i119] = iArr40[i119 - 1];
                this.getCvrMaskAnd = i119 + 2;
                iArr40[i119 + 1] = 128;
                return 0;
            case 68:
                long[] jArr = this.SdkCoreBusinessLogicModuleImpl;
                int i120 = this.getGpoResponse;
                this.getGpoResponse = i120 + 1;
                this.valueOf = jArr[i120];
                return 0;
            case 69:
                int[] iArr41 = this.getCiacDecline;
                int i121 = this.getCvrMaskAnd;
                iArr41[i121] = 24;
                long[] jArr2 = this.SdkCoreBusinessLogicModuleImpl;
                this.getCvrMaskAnd = i121 + 2;
                jArr2[i121 + 1] = 0;
                return 0;
            case 70:
                int i122 = this.getCvrMaskAnd;
                int i123 = i122 - 1;
                this.getCvrMaskAnd = i123;
                int[] iArr42 = this.getCiacDecline;
                int i124 = i122 - 2;
                iArr42[i124] = iArr42[i124] - iArr42[i123];
                return 0;
            case 71:
                java.lang.Object[] objArr31 = this.getApplicationLifeCycleData;
                int i125 = this.getCvrMaskAnd;
                java.lang.Object obj31 = objArr31[i125 - 1];
                objArr31[i125] = obj31;
                this.getCvrMaskAnd = i125;
                objArr31[i125] = null;
                objArr31[8] = obj31;
                return 0;
            case 72:
                int[] iArr43 = this.getCiacDecline;
                int i126 = this.getCvrMaskAnd;
                int i127 = i126 + 1;
                iArr43[i126] = 2;
                iArr43[i127] = 2;
                this.getCvrMaskAnd = i127;
                iArr43[i126] = iArr43[i126] % 2;
                return 0;
            case 73:
                int[] iArr44 = this.getCiacDecline;
                int i128 = this.getCvrMaskAnd;
                iArr44[i128] = 121;
                int i129 = i128 - 1;
                int i130 = iArr44[i129] + 121;
                iArr44[i129] = i130;
                this.getCvrMaskAnd = i128 + 1;
                iArr44[i128] = i130;
                return 0;
            default:
                return i;
        }
    }

    public setClipChildren(java.lang.Object obj) {
        this.getCiacDecline = new int[12];
        this.SdkCoreBusinessLogicModuleImpl = new long[12];
        this.getPaymentFci = new float[12];
        this.getDualTapResetTimeout = new double[12];
        java.lang.Object[] objArr = new java.lang.Object[12];
        this.getApplicationLifeCycleData = objArr;
        objArr[8] = obj;
        this.getCvrMaskAnd = 0;
        this.getGpoResponse = -1;
    }

    public setClipChildren() {
        this.getCiacDecline = new int[12];
        this.SdkCoreBusinessLogicModuleImpl = new long[12];
        this.getPaymentFci = new float[12];
        this.getDualTapResetTimeout = new double[12];
        this.getApplicationLifeCycleData = new java.lang.Object[12];
        this.getCvrMaskAnd = 0;
        this.getGpoResponse = -1;
    }
}

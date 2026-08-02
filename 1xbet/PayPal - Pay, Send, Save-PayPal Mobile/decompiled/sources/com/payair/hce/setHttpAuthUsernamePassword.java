package com.payair.hce;

/* loaded from: classes10.dex */
public class setHttpAuthUsernamePassword {
    public long AlternateContactlessPaymentDataJson;
    public int DigitizedCardProfile;
    public double IccPrivateKeyCrtComponentsJson;
    public float RecordsJson;
    public java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl;
    private final long[] SdkCoreBusinessLogicModuleImpl;
    public java.lang.Object getAid;
    private int getCvrMaskAnd;
    private int getGpoResponse;
    public double getProfileVersion;
    public long valueOf;
    public float values;
    public int writeReplace;
    private final int[] getPaymentFci = new int[11];
    private final float[] getCiacDecline = new float[11];
    private final double[] getApplicationLifeCycleData = new double[11];
    private final java.lang.Object[] getCardLayoutDescription = new java.lang.Object[11];

    public int values(int i) {
        switch (i) {
            case 1:
                java.lang.Object[] objArr = this.getCardLayoutDescription;
                int i2 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i2 + 1;
                objArr[i2] = this.SdkCoreAlternateContactlessPaymentDataImpl;
                return 0;
            case 2:
                int[] iArr = this.getPaymentFci;
                int i3 = this.getCvrMaskAnd;
                iArr[i3] = 3;
                this.getCvrMaskAnd = i3 + 2;
                iArr[i3 + 1] = 0;
                return 0;
            case 3:
                int i4 = this.getCvrMaskAnd - this.DigitizedCardProfile;
                this.getCvrMaskAnd = i4;
                this.getGpoResponse = i4;
                return 0;
            case 4:
                int[] iArr2 = this.getPaymentFci;
                int i5 = this.getGpoResponse;
                this.getGpoResponse = i5 + 1;
                this.writeReplace = iArr2[i5];
                return 0;
            case 5:
                float[] fArr = this.getCiacDecline;
                int i6 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i6 + 1;
                fArr[i6] = this.values;
                return 0;
            case 6:
                float[] fArr2 = this.getCiacDecline;
                int i7 = this.getCvrMaskAnd;
                fArr2[i7] = 0.0f;
                this.getCvrMaskAnd = i7;
                int i8 = i7 - 1;
                this.getPaymentFci[i8] = (fArr2[i8] > 0.0f ? 1 : (fArr2[i8] == 0.0f ? 0 : -1));
                return 0;
            case 7:
                int i9 = this.getCvrMaskAnd;
                int i10 = i9 - 1;
                this.getCvrMaskAnd = i10;
                int[] iArr3 = this.getPaymentFci;
                int i11 = i9 - 2;
                iArr3[i11] = iArr3[i11] + iArr3[i10];
                return 0;
            case 8:
                int[] iArr4 = this.getPaymentFci;
                int i12 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i12 + 1;
                iArr4[i12] = 44;
                return 0;
            case 9:
                int[] iArr5 = this.getPaymentFci;
                int i13 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i13 + 1;
                iArr5[i13] = this.DigitizedCardProfile;
                return 0;
            case 10:
                int[] iArr6 = this.getPaymentFci;
                int i14 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i14 + 1;
                iArr6[i14] = 16;
                return 0;
            case 11:
                int i15 = this.getCvrMaskAnd;
                int i16 = i15 - 1;
                this.getCvrMaskAnd = i16;
                int[] iArr7 = this.getPaymentFci;
                int i17 = i15 - 2;
                iArr7[i17] = iArr7[i17] >> iArr7[i16];
                return 0;
            case 12:
                int i18 = this.getCvrMaskAnd;
                int i19 = i18 - 1;
                this.getCvrMaskAnd = i19;
                int[] iArr8 = this.getPaymentFci;
                int i20 = i18 - 2;
                int i21 = iArr8[i20] + iArr8[i19];
                iArr8[i20] = i21;
                iArr8[i20] = (byte) i21;
                return 0;
            case 13:
                java.lang.Object[] objArr2 = this.getCardLayoutDescription;
                int i22 = this.getGpoResponse;
                this.getGpoResponse = i22 + 1;
                java.lang.Object obj = objArr2[i22];
                objArr2[i22] = null;
                this.getAid = obj;
                return 0;
            case 14:
                java.lang.Object[] objArr3 = this.getCardLayoutDescription;
                int i23 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i23 + 1;
                objArr3[i23] = objArr3[i23 - 1];
                return 0;
            case 15:
                int i24 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i24;
                java.lang.Object[] objArr4 = this.getCardLayoutDescription;
                java.lang.Object obj2 = objArr4[i24];
                objArr4[i24] = null;
                this.writeReplace = obj2 == null ? 0 : 1;
                return 0;
            case 16:
                java.lang.Object[] objArr5 = this.getCardLayoutDescription;
                int i25 = this.getCvrMaskAnd - 1;
                java.lang.Object obj3 = objArr5[i25];
                objArr5[i25] = null;
                this.getAid = obj3;
                return 0;
            case 17:
                java.lang.Object[] objArr6 = this.getCardLayoutDescription;
                int i26 = this.getCvrMaskAnd;
                int i27 = i26 - 1;
                java.lang.Object obj4 = objArr6[i27];
                objArr6[i27] = null;
                int i28 = i26 - 2;
                java.lang.Object obj5 = objArr6[i28];
                objArr6[i28] = null;
                objArr6[i27] = obj5;
                objArr6[i28] = obj4;
                int i29 = i26 - 1;
                this.getCvrMaskAnd = i29;
                objArr6[i29] = null;
                return 0;
            case 18:
                int i30 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i30;
                this.getCardLayoutDescription[i30] = null;
                return 0;
            case 19:
                int[] iArr9 = this.getPaymentFci;
                int i31 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i31 + 1;
                iArr9[i31] = 1;
                return 0;
            case 20:
                java.lang.Object[] objArr7 = this.getCardLayoutDescription;
                int i32 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i32 + 1;
                int i33 = i32 - 1;
                java.lang.Object obj6 = objArr7[i33];
                objArr7[i33] = null;
                objArr7[i32] = obj6;
                int i34 = i32 - 2;
                java.lang.Object obj7 = objArr7[i34];
                objArr7[i34] = null;
                objArr7[i33] = obj7;
                objArr7[i34] = obj6;
                return 0;
            case 21:
                java.lang.Object[] objArr8 = this.getCardLayoutDescription;
                int i35 = this.getCvrMaskAnd;
                int i36 = i35 - 1;
                java.lang.Object obj8 = objArr8[i36];
                objArr8[i36] = null;
                int i37 = i35 - 2;
                java.lang.Object obj9 = objArr8[i37];
                objArr8[i37] = null;
                objArr8[i36] = obj9;
                objArr8[i37] = obj8;
                int[] iArr10 = this.getPaymentFci;
                this.getCvrMaskAnd = i35 + 1;
                iArr10[i35] = 0;
                return 0;
            case 22:
                java.lang.Object[] objArr9 = this.getCardLayoutDescription;
                int i38 = this.getCvrMaskAnd;
                int i39 = i38 - 2;
                java.lang.Object obj10 = objArr9[i39];
                objArr9[i39] = null;
                int i40 = i38 - 1;
                objArr9[i40] = obj10;
                int[] iArr11 = this.getPaymentFci;
                iArr11[i39] = iArr11[i40];
                return 0;
            case 23:
                int i41 = this.getCvrMaskAnd;
                int i42 = i41 - 3;
                this.getCvrMaskAnd = i42;
                java.lang.Object[] objArr10 = this.getCardLayoutDescription;
                java.lang.Object obj11 = objArr10[i42];
                objArr10[i42] = null;
                int i43 = this.getPaymentFci[i41 - 2];
                int i44 = i41 - 1;
                java.lang.Object obj12 = objArr10[i44];
                objArr10[i44] = null;
                ((java.lang.Object[]) obj11)[i43] = obj12;
                return 0;
            case 24:
                int[] iArr12 = this.getPaymentFci;
                int i45 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i45 + 1;
                iArr12[i45] = 0;
                return 0;
            case 25:
                java.lang.Object[] objArr11 = this.getCardLayoutDescription;
                int i46 = this.getCvrMaskAnd;
                int i47 = i46 - 1;
                java.lang.Object obj13 = objArr11[i47];
                objArr11[i47] = null;
                int i48 = i46 - 2;
                java.lang.Object obj14 = objArr11[i48];
                objArr11[i48] = null;
                objArr11[i47] = obj14;
                objArr11[i48] = obj13;
                this.getCvrMaskAnd = i46 + 1;
                objArr11[i46] = null;
                objArr11[i46] = null;
                java.lang.Object obj15 = objArr11[i47];
                objArr11[i47] = null;
                objArr11[i46] = obj15;
                objArr11[i47] = null;
                return 0;
            case 26:
                java.lang.Object[] objArr12 = this.getCardLayoutDescription;
                int i49 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i49 + 1;
                objArr12[i49] = null;
                return 0;
            case 27:
                int[] iArr13 = this.getPaymentFci;
                int i50 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i50 + 1;
                iArr13[i50] = 2;
                return 0;
            case 28:
                int i51 = this.getCvrMaskAnd;
                int i52 = i51 - 1;
                this.getCvrMaskAnd = i52;
                int[] iArr14 = this.getPaymentFci;
                int i53 = i51 - 2;
                iArr14[i53] = iArr14[i53] % iArr14[i52];
                int i54 = i51 - 2;
                this.getCvrMaskAnd = i54;
                this.getCardLayoutDescription[i54] = null;
                return 0;
            case 29:
                int[] iArr15 = this.getPaymentFci;
                int i55 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i55 + 1;
                iArr15[i55] = 111;
                return 0;
            case 30:
                int[] iArr16 = this.getPaymentFci;
                int i56 = this.getCvrMaskAnd;
                iArr16[i56] = iArr16[i56 - 1];
                this.getCvrMaskAnd = i56 + 2;
                iArr16[i56 + 1] = 128;
                return 0;
            case 31:
                int i57 = this.getCvrMaskAnd;
                int i58 = i57 - 1;
                this.getCvrMaskAnd = i58;
                int[] iArr17 = this.getPaymentFci;
                int i59 = i57 - 2;
                iArr17[i59] = iArr17[i59] % iArr17[i58];
                return 0;
            case 32:
                int i60 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i60;
                this.writeReplace = this.getPaymentFci[i60] == 0 ? 0 : 1;
                return 0;
            case 33:
                int[] iArr18 = this.getPaymentFci;
                int i61 = this.getCvrMaskAnd;
                iArr18[i61] = 5;
                this.getCvrMaskAnd = i61 + 2;
                iArr18[i61 + 1] = 1;
                return 0;
            case 34:
                float[] fArr3 = this.getCiacDecline;
                int i62 = this.getCvrMaskAnd;
                fArr3[i62] = 1.0f;
                int[] iArr19 = this.getPaymentFci;
                int i63 = i62 - 1;
                int i64 = (fArr3[i63] > 1.0f ? 1 : (fArr3[i63] == 1.0f ? 0 : -1));
                iArr19[i63] = i64;
                this.getCvrMaskAnd = i63;
                int i65 = i62 - 2;
                iArr19[i65] = iArr19[i65] * i64;
                return 0;
            case 35:
                int[] iArr20 = this.getPaymentFci;
                int i66 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i66 + 1;
                iArr20[i66] = 35;
                return 0;
            case 36:
                int[] iArr21 = this.getPaymentFci;
                int i67 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i67 + 1;
                iArr21[i67] = 81;
                return 0;
            case 37:
                int i68 = this.getCvrMaskAnd;
                int[] iArr22 = this.getPaymentFci;
                int i69 = i68 - 2;
                int i70 = iArr22[i69] + iArr22[i68 - 1];
                iArr22[i69] = i70;
                this.getCvrMaskAnd = i69;
                int i71 = i68 - 3;
                iArr22[i71] = iArr22[i71] >> i70;
                return 0;
            case 38:
                int[] iArr23 = this.getPaymentFci;
                int i72 = this.getCvrMaskAnd - 1;
                iArr23[i72] = (byte) iArr23[i72];
                return 0;
            case 39:
                int[] iArr24 = this.getPaymentFci;
                int i73 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i73 + 1;
                iArr24[i73] = 125;
                return 0;
            case 40:
                int i74 = this.getCvrMaskAnd;
                int i75 = i74 - 1;
                int[] iArr25 = this.getPaymentFci;
                int i76 = i74 - 2;
                int i77 = iArr25[i76] + iArr25[i75];
                iArr25[i76] = i77;
                this.getCvrMaskAnd = i74;
                iArr25[i75] = i77;
                return 0;
            case 41:
                int[] iArr26 = this.getPaymentFci;
                int i78 = this.getCvrMaskAnd;
                iArr26[i78] = 128;
                this.getCvrMaskAnd = i78;
                int i79 = i78 - 1;
                iArr26[i79] = iArr26[i79] % 128;
                return 0;
            case 42:
                java.lang.Object[] objArr13 = this.getCardLayoutDescription;
                int i80 = this.getCvrMaskAnd;
                int i81 = i80 - 1;
                java.lang.Object obj16 = objArr13[i81];
                objArr13[i81] = null;
                objArr13[i80] = obj16;
                int i82 = i80 - 2;
                java.lang.Object obj17 = objArr13[i82];
                objArr13[i82] = null;
                objArr13[i81] = obj17;
                objArr13[i82] = obj16;
                java.lang.Object obj18 = objArr13[i80];
                objArr13[i80] = null;
                java.lang.Object obj19 = objArr13[i81];
                objArr13[i81] = null;
                objArr13[i80] = obj19;
                objArr13[i81] = obj18;
                int[] iArr27 = this.getPaymentFci;
                this.getCvrMaskAnd = i80 + 2;
                iArr27[i80 + 1] = 0;
                return 0;
            case 43:
                java.lang.Object[] objArr14 = this.getCardLayoutDescription;
                int i83 = this.getCvrMaskAnd;
                int i84 = i83 - 1;
                java.lang.Object obj20 = objArr14[i84];
                objArr14[i84] = null;
                int i85 = i83 - 2;
                java.lang.Object obj21 = objArr14[i85];
                objArr14[i85] = null;
                objArr14[i84] = obj21;
                objArr14[i85] = obj20;
                return 0;
            case 44:
                java.lang.Object[] objArr15 = this.getCardLayoutDescription;
                int i86 = this.getCvrMaskAnd;
                objArr15[i86] = null;
                this.getCvrMaskAnd = i86 + 2;
                objArr15[i86 + 1] = null;
                return 0;
            case 45:
                int[] iArr28 = this.getPaymentFci;
                int i87 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i87;
                this.writeReplace = iArr28[i87];
                return 0;
            case 46:
                int[] iArr29 = this.getPaymentFci;
                int i88 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i88 + 1;
                iArr29[i88] = 15;
                return 0;
            case 47:
                int[] iArr30 = this.getPaymentFci;
                int i89 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i89 + 1;
                iArr30[i89] = 0;
                return 0;
            case 48:
                int[] iArr31 = this.getPaymentFci;
                int i90 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i90 + 1;
                iArr31[i90] = 62;
                return 0;
            case 49:
                int[] iArr32 = this.getPaymentFci;
                int i91 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i91 + 1;
                iArr32[i91] = 27;
                return 0;
            case 50:
                for (int i92 = this.getCvrMaskAnd - 1; i92 >= 0; i92--) {
                    this.getCardLayoutDescription[i92] = null;
                }
                java.lang.Object[] objArr16 = this.getCardLayoutDescription;
                this.getCvrMaskAnd = 1;
                objArr16[0] = this.SdkCoreAlternateContactlessPaymentDataImpl;
                return 0;
            default:
                return i;
        }
    }

    public setHttpAuthUsernamePassword(long j, long j2) {
        long[] jArr = new long[11];
        this.SdkCoreBusinessLogicModuleImpl = jArr;
        jArr[7] = j;
        jArr[9] = j2;
        this.getCvrMaskAnd = 0;
        this.getGpoResponse = -1;
    }
}

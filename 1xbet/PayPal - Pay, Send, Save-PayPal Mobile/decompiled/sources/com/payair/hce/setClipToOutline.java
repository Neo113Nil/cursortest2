package com.payair.hce;

/* loaded from: classes10.dex */
public class setClipToOutline {
    public float AlternateContactlessPaymentDataJson;
    public int DigitizedCardProfile;
    public double IccPrivateKeyCrtComponentsJson;
    public float RecordsJson;
    public double SdkCoreAlternateContactlessPaymentDataImpl;
    public java.lang.Object getAid;
    private int getCiacDecline;
    private int getGpoResponse;
    private final long[] getPaymentFci;
    public java.lang.Object getProfileVersion;
    public int valueOf;
    public long values;
    public long writeReplace;
    private final int[] SdkCoreBusinessLogicModuleImpl = new int[11];
    private final float[] getCvrMaskAnd = new float[11];
    private final double[] getApplicationLifeCycleData = new double[11];
    private final java.lang.Object[] getSecurityWord = new java.lang.Object[11];

    public int valueOf(int i) {
        switch (i) {
            case 1:
                java.lang.Object[] objArr = this.getSecurityWord;
                int i2 = this.getGpoResponse;
                this.getGpoResponse = i2 + 1;
                objArr[i2] = this.getProfileVersion;
                return 0;
            case 2:
                int i3 = this.getGpoResponse - this.DigitizedCardProfile;
                this.getGpoResponse = i3;
                this.getCiacDecline = i3;
                return 0;
            case 3:
                int[] iArr = this.SdkCoreBusinessLogicModuleImpl;
                int i4 = this.getCiacDecline;
                this.getCiacDecline = i4 + 1;
                this.valueOf = iArr[i4];
                return 0;
            case 4:
                int[] iArr2 = this.SdkCoreBusinessLogicModuleImpl;
                int i5 = this.getGpoResponse;
                this.getGpoResponse = i5 + 1;
                iArr2[i5] = this.DigitizedCardProfile;
                return 0;
            case 5:
                int[] iArr3 = this.SdkCoreBusinessLogicModuleImpl;
                int i6 = this.getGpoResponse;
                iArr3[i6] = 19441;
                this.getGpoResponse = i6 + 2;
                iArr3[i6 + 1] = 0;
                return 0;
            case 6:
                int i7 = this.getGpoResponse;
                int i8 = i7 - 1;
                this.getGpoResponse = i8;
                int[] iArr4 = this.SdkCoreBusinessLogicModuleImpl;
                int i9 = i7 - 2;
                iArr4[i9] = iArr4[i9] - iArr4[i8];
                return 0;
            case 7:
                java.lang.Object[] objArr2 = this.getSecurityWord;
                int i10 = this.getCiacDecline;
                this.getCiacDecline = i10 + 1;
                java.lang.Object obj = objArr2[i10];
                objArr2[i10] = null;
                this.getAid = obj;
                return 0;
            case 8:
                java.lang.Object[] objArr3 = this.getSecurityWord;
                int i11 = this.getGpoResponse;
                this.getGpoResponse = i11 + 1;
                objArr3[i11] = objArr3[i11 - 1];
                return 0;
            case 9:
                int i12 = this.getGpoResponse - 1;
                this.getGpoResponse = i12;
                java.lang.Object[] objArr4 = this.getSecurityWord;
                java.lang.Object obj2 = objArr4[i12];
                objArr4[i12] = null;
                this.valueOf = obj2 == null ? 0 : 1;
                return 0;
            case 10:
                java.lang.Object[] objArr5 = this.getSecurityWord;
                int i13 = this.getGpoResponse;
                int i14 = i13 - 1;
                java.lang.Object obj3 = objArr5[i14];
                objArr5[i14] = null;
                int i15 = i13 - 2;
                java.lang.Object obj4 = objArr5[i15];
                objArr5[i15] = null;
                objArr5[i14] = obj4;
                objArr5[i15] = obj3;
                return 0;
            case 11:
                java.lang.Object[] objArr6 = this.getSecurityWord;
                int i16 = this.getGpoResponse - 1;
                java.lang.Object obj5 = objArr6[i16];
                objArr6[i16] = null;
                this.getAid = obj5;
                return 0;
            case 12:
                int i17 = this.getGpoResponse - 1;
                this.getGpoResponse = i17;
                this.getSecurityWord[i17] = null;
                return 0;
            case 13:
                int[] iArr5 = this.SdkCoreBusinessLogicModuleImpl;
                int i18 = this.getGpoResponse;
                this.getGpoResponse = i18 + 1;
                iArr5[i18] = 1;
                return 0;
            case 14:
                java.lang.Object[] objArr7 = this.getSecurityWord;
                int i19 = this.getGpoResponse;
                int i20 = i19 - 1;
                java.lang.Object obj6 = objArr7[i20];
                objArr7[i20] = null;
                objArr7[i19] = obj6;
                int i21 = i19 - 2;
                java.lang.Object obj7 = objArr7[i21];
                objArr7[i21] = null;
                objArr7[i20] = obj7;
                objArr7[i21] = obj6;
                java.lang.Object obj8 = objArr7[i19];
                objArr7[i19] = null;
                java.lang.Object obj9 = objArr7[i20];
                objArr7[i20] = null;
                objArr7[i19] = obj9;
                objArr7[i20] = obj8;
                int[] iArr6 = this.SdkCoreBusinessLogicModuleImpl;
                this.getGpoResponse = i19 + 2;
                iArr6[i19 + 1] = 0;
                return 0;
            case 15:
                java.lang.Object[] objArr8 = this.getSecurityWord;
                int i22 = this.getGpoResponse;
                int i23 = i22 - 2;
                java.lang.Object obj10 = objArr8[i23];
                objArr8[i23] = null;
                int i24 = i22 - 1;
                objArr8[i24] = obj10;
                int[] iArr7 = this.SdkCoreBusinessLogicModuleImpl;
                iArr7[i23] = iArr7[i24];
                return 0;
            case 16:
                int i25 = this.getGpoResponse;
                int i26 = i25 - 3;
                this.getGpoResponse = i26;
                java.lang.Object[] objArr9 = this.getSecurityWord;
                java.lang.Object obj11 = objArr9[i26];
                objArr9[i26] = null;
                int i27 = this.SdkCoreBusinessLogicModuleImpl[i25 - 2];
                int i28 = i25 - 1;
                java.lang.Object obj12 = objArr9[i28];
                objArr9[i28] = null;
                ((java.lang.Object[]) obj11)[i27] = obj12;
                return 0;
            case 17:
                java.lang.Object[] objArr10 = this.getSecurityWord;
                int i29 = this.getGpoResponse;
                objArr10[i29] = objArr10[i29 - 1];
                int[] iArr8 = this.SdkCoreBusinessLogicModuleImpl;
                this.getGpoResponse = i29 + 2;
                iArr8[i29 + 1] = 0;
                return 0;
            case 18:
                java.lang.Object[] objArr11 = this.getSecurityWord;
                int i30 = this.getGpoResponse;
                this.getGpoResponse = i30 + 1;
                objArr11[i30] = null;
                return 0;
            case 19:
                int[] iArr9 = this.SdkCoreBusinessLogicModuleImpl;
                int i31 = this.getGpoResponse;
                this.getGpoResponse = i31 + 1;
                iArr9[i31] = 2;
                return 0;
            case 20:
                int[] iArr10 = this.SdkCoreBusinessLogicModuleImpl;
                int i32 = this.getGpoResponse;
                iArr10[i32] = 2;
                this.getGpoResponse = i32;
                int i33 = i32 - 1;
                iArr10[i33] = iArr10[i33] % 2;
                return 0;
            case 21:
                int[] iArr11 = this.SdkCoreBusinessLogicModuleImpl;
                int i34 = this.getGpoResponse;
                int i35 = i34 + 1;
                iArr11[i34] = 2;
                iArr11[i35] = 2;
                this.getGpoResponse = i35;
                iArr11[i34] = iArr11[i34] % 2;
                return 0;
            case 22:
                int[] iArr12 = this.SdkCoreBusinessLogicModuleImpl;
                int i36 = this.getGpoResponse;
                this.getGpoResponse = i36 + 1;
                iArr12[i36] = 55;
                return 0;
            case 23:
                int i37 = this.getGpoResponse;
                int i38 = i37 - 1;
                this.getGpoResponse = i38;
                int[] iArr13 = this.SdkCoreBusinessLogicModuleImpl;
                int i39 = i37 - 2;
                iArr13[i39] = iArr13[i39] + iArr13[i38];
                return 0;
            case 24:
                int[] iArr14 = this.SdkCoreBusinessLogicModuleImpl;
                int i40 = this.getGpoResponse;
                this.getGpoResponse = i40 + 1;
                iArr14[i40] = iArr14[i40 - 1];
                return 0;
            case 25:
                int[] iArr15 = this.SdkCoreBusinessLogicModuleImpl;
                int i41 = this.getGpoResponse;
                iArr15[i41] = 128;
                this.getGpoResponse = i41;
                int i42 = i41 - 1;
                iArr15[i42] = iArr15[i42] % 128;
                return 0;
            case 26:
                int i43 = this.getGpoResponse;
                int i44 = i43 - 1;
                this.getGpoResponse = i44;
                int[] iArr16 = this.SdkCoreBusinessLogicModuleImpl;
                int i45 = i43 - 2;
                iArr16[i45] = iArr16[i45] % iArr16[i44];
                return 0;
            case 27:
                int i46 = this.getGpoResponse - 1;
                this.getGpoResponse = i46;
                this.valueOf = this.SdkCoreBusinessLogicModuleImpl[i46] == 0 ? 0 : 1;
                return 0;
            case 28:
                int[] iArr17 = this.SdkCoreBusinessLogicModuleImpl;
                int i47 = this.getGpoResponse;
                this.getGpoResponse = i47 + 1;
                iArr17[i47] = 6012;
                return 0;
            case 29:
                int i48 = this.getGpoResponse;
                int i49 = i48 - 1;
                this.getGpoResponse = i49;
                int[] iArr18 = this.SdkCoreBusinessLogicModuleImpl;
                int i50 = i48 - 2;
                iArr18[i50] = iArr18[i50] * iArr18[i49];
                return 0;
            case 30:
                int[] iArr19 = this.SdkCoreBusinessLogicModuleImpl;
                int i51 = this.getGpoResponse;
                iArr19[i51] = 31;
                this.getGpoResponse = i51;
                int i52 = i51 - 1;
                iArr19[i52] = iArr19[i52] + 31;
                return 0;
            case 31:
                int[] iArr20 = this.SdkCoreBusinessLogicModuleImpl;
                int i53 = this.getGpoResponse;
                int i54 = i53 + 1;
                iArr20[i53] = iArr20[i53 - 1];
                iArr20[i54] = 128;
                this.getGpoResponse = i54;
                iArr20[i53] = iArr20[i53] % 128;
                return 0;
            case 32:
                java.lang.Object[] objArr12 = this.getSecurityWord;
                int i55 = this.getGpoResponse;
                this.getGpoResponse = i55 + 1;
                int i56 = i55 - 1;
                java.lang.Object obj13 = objArr12[i56];
                objArr12[i56] = null;
                objArr12[i55] = obj13;
                int i57 = i55 - 2;
                java.lang.Object obj14 = objArr12[i57];
                objArr12[i57] = null;
                objArr12[i56] = obj14;
                objArr12[i57] = obj13;
                return 0;
            case 33:
                java.lang.Object[] objArr13 = this.getSecurityWord;
                int i58 = this.getGpoResponse;
                int i59 = i58 - 1;
                java.lang.Object obj15 = objArr13[i59];
                objArr13[i59] = null;
                int i60 = i58 - 2;
                java.lang.Object obj16 = objArr13[i60];
                objArr13[i60] = null;
                objArr13[i59] = obj16;
                objArr13[i60] = obj15;
                int[] iArr21 = this.SdkCoreBusinessLogicModuleImpl;
                this.getGpoResponse = i58 + 1;
                iArr21[i58] = 1;
                java.lang.Object obj17 = objArr13[i59];
                objArr13[i59] = null;
                objArr13[i58] = obj17;
                iArr21[i59] = 1;
                return 0;
            case 34:
                java.lang.Object[] objArr14 = this.getSecurityWord;
                int i61 = this.getGpoResponse;
                int i62 = i61 - 1;
                java.lang.Object obj18 = objArr14[i62];
                objArr14[i62] = null;
                int i63 = i61 - 2;
                java.lang.Object obj19 = objArr14[i63];
                objArr14[i63] = null;
                objArr14[i62] = obj19;
                objArr14[i63] = obj18;
                this.getGpoResponse = i61 + 1;
                objArr14[i61] = null;
                objArr14[i61] = null;
                java.lang.Object obj20 = objArr14[i62];
                objArr14[i62] = null;
                objArr14[i61] = obj20;
                objArr14[i62] = null;
                return 0;
            case 35:
                java.lang.Object[] objArr15 = this.getSecurityWord;
                int i64 = this.getGpoResponse;
                objArr15[i64] = null;
                this.getGpoResponse = i64 + 2;
                objArr15[i64 + 1] = null;
                return 0;
            case 36:
                int[] iArr22 = this.SdkCoreBusinessLogicModuleImpl;
                int i65 = this.getGpoResponse - 1;
                this.getGpoResponse = i65;
                this.valueOf = iArr22[i65];
                return 0;
            case 37:
                int[] iArr23 = this.SdkCoreBusinessLogicModuleImpl;
                int i66 = this.getGpoResponse;
                this.getGpoResponse = i66 + 1;
                iArr23[i66] = 14;
                return 0;
            case 38:
                int[] iArr24 = this.SdkCoreBusinessLogicModuleImpl;
                int i67 = this.getGpoResponse;
                this.getGpoResponse = i67 + 1;
                iArr24[i67] = 51;
                return 0;
            case 39:
                int[] iArr25 = this.SdkCoreBusinessLogicModuleImpl;
                int i68 = this.getGpoResponse;
                this.getGpoResponse = i68 + 1;
                iArr25[i68] = 0;
                return 0;
            case 40:
                for (int i69 = this.getGpoResponse - 1; i69 >= 0; i69--) {
                    this.getSecurityWord[i69] = null;
                }
                java.lang.Object[] objArr16 = this.getSecurityWord;
                this.getGpoResponse = 1;
                objArr16[0] = this.getProfileVersion;
                return 0;
            default:
                return i;
        }
    }

    public setClipToOutline(long j, long j2) {
        long[] jArr = new long[11];
        this.getPaymentFci = jArr;
        jArr[7] = j;
        jArr[9] = j2;
        this.getGpoResponse = 0;
        this.getCiacDecline = -1;
    }
}

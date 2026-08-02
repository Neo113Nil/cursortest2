package com.payair.hce;

/* loaded from: classes10.dex */
public class CvmIssuerOptions {
    public int AlternateContactlessPaymentDataJson;
    public long DigitizedCardProfile;
    public double IccPrivateKeyCrtComponentsJson;
    public float RecordsJson;
    public java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl;
    private int SdkCoreBusinessLogicModuleImpl;
    public java.lang.Object getAid;
    private int getCiacDecline;
    private final long[] getPaymentFci;
    public double getProfileVersion;
    public int valueOf;
    public long values;
    public float writeReplace;
    private final int[] getCvrMaskAnd = new int[11];
    private final float[] getGpoResponse = new float[11];
    private final double[] getSecurityWord = new double[11];
    private final java.lang.Object[] getCvmResetTimeout = new java.lang.Object[11];

    public int values(int i) {
        switch (i) {
            case 1:
                java.lang.Object[] objArr = this.getCvmResetTimeout;
                int i2 = this.getCiacDecline;
                this.getCiacDecline = i2 + 1;
                objArr[i2] = this.getAid;
                return 0;
            case 2:
                int[] iArr = this.getCvrMaskAnd;
                int i3 = this.getCiacDecline;
                this.getCiacDecline = i3 + 1;
                iArr[i3] = 3;
                return 0;
            case 3:
                int[] iArr2 = this.getCvrMaskAnd;
                int i4 = this.getCiacDecline;
                this.getCiacDecline = i4 + 1;
                iArr2[i4] = this.valueOf;
                return 0;
            case 4:
                int[] iArr3 = this.getCvrMaskAnd;
                int i5 = this.getCiacDecline;
                this.getCiacDecline = i5 + 1;
                iArr3[i5] = 16;
                return 0;
            case 5:
                int i6 = this.getCiacDecline;
                int i7 = i6 - 1;
                this.getCiacDecline = i7;
                int[] iArr4 = this.getCvrMaskAnd;
                int i8 = i6 - 2;
                iArr4[i8] = iArr4[i8] >> iArr4[i7];
                return 0;
            case 6:
                int i9 = this.getCiacDecline;
                int i10 = i9 - 1;
                int[] iArr5 = this.getCvrMaskAnd;
                int i11 = i9 - 2;
                iArr5[i11] = iArr5[i11] + iArr5[i10];
                this.getCiacDecline = i9;
                iArr5[i10] = 31;
                return 0;
            case 7:
                long[] jArr = this.getPaymentFci;
                int i12 = this.getCiacDecline;
                this.getCiacDecline = i12 + 1;
                jArr[i12] = 0;
                return 0;
            case 8:
                int i13 = this.getCiacDecline - this.valueOf;
                this.getCiacDecline = i13;
                this.SdkCoreBusinessLogicModuleImpl = i13;
                return 0;
            case 9:
                long[] jArr2 = this.getPaymentFci;
                int i14 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i14 + 1;
                this.DigitizedCardProfile = jArr2[i14];
                return 0;
            case 10:
                int i15 = this.getCiacDecline;
                int i16 = i15 - 1;
                this.getCiacDecline = i16;
                int[] iArr6 = this.getCvrMaskAnd;
                int i17 = i15 - 2;
                iArr6[i17] = iArr6[i17] + iArr6[i16];
                return 0;
            case 11:
                java.lang.Object[] objArr2 = this.getCvmResetTimeout;
                int i18 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i18 + 1;
                java.lang.Object obj = objArr2[i18];
                objArr2[i18] = null;
                this.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                return 0;
            case 12:
                int[] iArr7 = this.getCvrMaskAnd;
                int i19 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i19 + 1;
                this.AlternateContactlessPaymentDataJson = iArr7[i19];
                return 0;
            case 13:
                int[] iArr8 = this.getCvrMaskAnd;
                int i20 = this.getCiacDecline - 1;
                iArr8[i20] = (byte) iArr8[i20];
                return 0;
            case 14:
                java.lang.Object[] objArr3 = this.getCvmResetTimeout;
                int i21 = this.getCiacDecline;
                this.getCiacDecline = i21 + 1;
                objArr3[i21] = objArr3[i21 - 1];
                return 0;
            case 15:
                int i22 = this.getCiacDecline - 1;
                this.getCiacDecline = i22;
                java.lang.Object[] objArr4 = this.getCvmResetTimeout;
                java.lang.Object obj2 = objArr4[i22];
                objArr4[i22] = null;
                this.AlternateContactlessPaymentDataJson = obj2 == null ? 0 : 1;
                return 0;
            case 16:
                java.lang.Object[] objArr5 = this.getCvmResetTimeout;
                int i23 = this.getCiacDecline;
                int i24 = i23 - 1;
                java.lang.Object obj3 = objArr5[i24];
                objArr5[i24] = null;
                int i25 = i23 - 2;
                java.lang.Object obj4 = objArr5[i25];
                objArr5[i25] = null;
                objArr5[i24] = obj4;
                objArr5[i25] = obj3;
                return 0;
            case 17:
                int i26 = this.getCiacDecline - 1;
                this.getCiacDecline = i26;
                this.getCvmResetTimeout[i26] = null;
                return 0;
            case 18:
                java.lang.Object[] objArr6 = this.getCvmResetTimeout;
                int i27 = this.getCiacDecline - 1;
                java.lang.Object obj5 = objArr6[i27];
                objArr6[i27] = null;
                this.SdkCoreAlternateContactlessPaymentDataImpl = obj5;
                return 0;
            case 19:
                int[] iArr9 = this.getCvrMaskAnd;
                int i28 = this.getCiacDecline;
                this.getCiacDecline = i28 + 1;
                iArr9[i28] = 1;
                return 0;
            case 20:
                java.lang.Object[] objArr7 = this.getCvmResetTimeout;
                int i29 = this.getCiacDecline;
                this.getCiacDecline = i29 + 1;
                int i30 = i29 - 1;
                java.lang.Object obj6 = objArr7[i30];
                objArr7[i30] = null;
                objArr7[i29] = obj6;
                int i31 = i29 - 2;
                java.lang.Object obj7 = objArr7[i31];
                objArr7[i31] = null;
                objArr7[i30] = obj7;
                objArr7[i31] = obj6;
                return 0;
            case 21:
                java.lang.Object[] objArr8 = this.getCvmResetTimeout;
                int i32 = this.getCiacDecline;
                int i33 = i32 - 1;
                java.lang.Object obj8 = objArr8[i33];
                objArr8[i33] = null;
                int i34 = i32 - 2;
                java.lang.Object obj9 = objArr8[i34];
                objArr8[i34] = null;
                objArr8[i33] = obj9;
                objArr8[i34] = obj8;
                int[] iArr10 = this.getCvrMaskAnd;
                this.getCiacDecline = i32 + 1;
                iArr10[i32] = 0;
                return 0;
            case 22:
                java.lang.Object[] objArr9 = this.getCvmResetTimeout;
                int i35 = this.getCiacDecline;
                int i36 = i35 - 2;
                java.lang.Object obj10 = objArr9[i36];
                objArr9[i36] = null;
                int i37 = i35 - 1;
                objArr9[i37] = obj10;
                int[] iArr11 = this.getCvrMaskAnd;
                int i38 = iArr11[i37];
                iArr11[i36] = i38;
                int i39 = i35 - 3;
                this.getCiacDecline = i39;
                java.lang.Object obj11 = objArr9[i39];
                objArr9[i39] = null;
                java.lang.Object obj12 = objArr9[i37];
                objArr9[i37] = null;
                ((java.lang.Object[]) obj11)[i38] = obj12;
                return 0;
            case 23:
                int[] iArr12 = this.getCvrMaskAnd;
                int i40 = this.getCiacDecline;
                this.getCiacDecline = i40 + 1;
                iArr12[i40] = 0;
                return 0;
            case 24:
                int i41 = this.getCiacDecline;
                int i42 = i41 - 3;
                this.getCiacDecline = i42;
                java.lang.Object[] objArr10 = this.getCvmResetTimeout;
                java.lang.Object obj13 = objArr10[i42];
                objArr10[i42] = null;
                int i43 = this.getCvrMaskAnd[i41 - 2];
                int i44 = i41 - 1;
                java.lang.Object obj14 = objArr10[i44];
                objArr10[i44] = null;
                ((java.lang.Object[]) obj13)[i43] = obj14;
                return 0;
            case 25:
                java.lang.Object[] objArr11 = this.getCvmResetTimeout;
                int i45 = this.getCiacDecline;
                this.getCiacDecline = i45 + 1;
                objArr11[i45] = null;
                objArr11[i45] = null;
                int i46 = i45 - 1;
                java.lang.Object obj15 = objArr11[i46];
                objArr11[i46] = null;
                objArr11[i45] = obj15;
                objArr11[i46] = null;
                return 0;
            case 26:
                java.lang.Object[] objArr12 = this.getCvmResetTimeout;
                int i47 = this.getCiacDecline;
                this.getCiacDecline = i47 + 1;
                objArr12[i47] = null;
                return 0;
            case 27:
                java.lang.Object[] objArr13 = this.getCvmResetTimeout;
                int i48 = this.getCiacDecline;
                objArr13[i48] = null;
                this.getCiacDecline = i48 + 2;
                objArr13[i48 + 1] = null;
                return 0;
            case 28:
                int[] iArr13 = this.getCvrMaskAnd;
                int i49 = this.getCiacDecline;
                this.getCiacDecline = i49 + 1;
                iArr13[i49] = 2;
                return 0;
            case 29:
                int i50 = this.getCiacDecline;
                int i51 = i50 - 1;
                this.getCiacDecline = i51;
                int[] iArr14 = this.getCvrMaskAnd;
                int i52 = i50 - 2;
                iArr14[i52] = iArr14[i52] % iArr14[i51];
                int i53 = i50 - 2;
                this.getCiacDecline = i53;
                this.getCvmResetTimeout[i53] = null;
                return 0;
            case 31:
                int[] iArr15 = this.getCvrMaskAnd;
                int i54 = this.getCiacDecline;
                this.getCiacDecline = i54 + 1;
                iArr15[i54] = 103;
            case 30:
                return 0;
            case 32:
                int[] iArr16 = this.getCvrMaskAnd;
                int i55 = this.getCiacDecline;
                this.getCiacDecline = i55 + 1;
                iArr16[i55] = iArr16[i55 - 1];
                return 0;
            case 33:
                int[] iArr17 = this.getCvrMaskAnd;
                int i56 = this.getCiacDecline;
                iArr17[i56] = 128;
                this.getCiacDecline = i56;
                int i57 = i56 - 1;
                iArr17[i57] = iArr17[i57] % 128;
                return 0;
            case 34:
                int[] iArr18 = this.getCvrMaskAnd;
                int i58 = this.getCiacDecline;
                iArr18[i58] = 2;
                this.getCiacDecline = i58;
                int i59 = i58 - 1;
                iArr18[i59] = iArr18[i59] % 2;
                return 0;
            case 35:
                int i60 = this.getCiacDecline - 1;
                this.getCiacDecline = i60;
                this.AlternateContactlessPaymentDataJson = this.getCvrMaskAnd[i60] == 0 ? 0 : 1;
                return 0;
            case 36:
                int[] iArr19 = this.getCvrMaskAnd;
                int i61 = this.getCiacDecline;
                this.getCiacDecline = i61 + 1;
                iArr19[i61] = 45;
                return 0;
            case 37:
                int i62 = this.getCiacDecline;
                int i63 = i62 - 1;
                int[] iArr20 = this.getCvrMaskAnd;
                int i64 = i62 - 2;
                int i65 = iArr20[i64] + iArr20[i63];
                iArr20[i64] = i65;
                this.getCiacDecline = i62;
                iArr20[i63] = i65;
                return 0;
            case 38:
                int[] iArr21 = this.getCvrMaskAnd;
                int i66 = this.getCiacDecline;
                this.getCiacDecline = i66 + 1;
                iArr21[i66] = 128;
                return 0;
            case 39:
                int i67 = this.getCiacDecline;
                int i68 = i67 - 1;
                this.getCiacDecline = i68;
                int[] iArr22 = this.getCvrMaskAnd;
                int i69 = i67 - 2;
                iArr22[i69] = iArr22[i69] % iArr22[i68];
                return 0;
            case 40:
                int i70 = this.getCiacDecline - 1;
                this.getCiacDecline = i70;
                this.AlternateContactlessPaymentDataJson = this.getCvrMaskAnd[i70] != 0 ? 0 : 1;
                return 0;
            case 41:
                int[] iArr23 = this.getCvrMaskAnd;
                int i71 = this.getCiacDecline;
                iArr23[i71] = 37;
                this.getCiacDecline = i71;
                int i72 = i71 - 1;
                iArr23[i72] = iArr23[i72] * 37;
                return 0;
            case 42:
                int[] iArr24 = this.getCvrMaskAnd;
                int i73 = this.getCiacDecline;
                this.getCiacDecline = i73 + 1;
                iArr24[i73] = 30;
                return 0;
            case 43:
                int i74 = this.getCiacDecline;
                int i75 = i74 - 1;
                this.getCiacDecline = i75;
                int[] iArr25 = this.getCvrMaskAnd;
                int i76 = i74 - 2;
                iArr25[i76] = iArr25[i76] * iArr25[i75];
                return 0;
            case 44:
                int[] iArr26 = this.getCvrMaskAnd;
                int i77 = this.getCiacDecline - 1;
                this.getCiacDecline = i77;
                this.AlternateContactlessPaymentDataJson = iArr26[i77];
                return 0;
            case 45:
                int[] iArr27 = this.getCvrMaskAnd;
                int i78 = this.getCiacDecline;
                this.getCiacDecline = i78 + 1;
                iArr27[i78] = 75;
                return 0;
            case 46:
                for (int i79 = this.getCiacDecline - 1; i79 >= 0; i79--) {
                    this.getCvmResetTimeout[i79] = null;
                }
                java.lang.Object[] objArr14 = this.getCvmResetTimeout;
                this.getCiacDecline = 1;
                objArr14[0] = this.getAid;
                return 0;
            default:
                return i;
        }
    }

    public CvmIssuerOptions(long j, long j2) {
        long[] jArr = new long[11];
        this.getPaymentFci = jArr;
        jArr[7] = j;
        jArr[9] = j2;
        this.getCiacDecline = 0;
        this.SdkCoreBusinessLogicModuleImpl = -1;
    }
}

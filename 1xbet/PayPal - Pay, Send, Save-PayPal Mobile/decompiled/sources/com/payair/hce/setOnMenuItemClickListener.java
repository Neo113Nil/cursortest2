package com.payair.hce;

/* loaded from: classes10.dex */
public class setOnMenuItemClickListener {
    public float AlternateContactlessPaymentDataJson;
    public int DigitizedCardProfile;
    public java.lang.Object IccPrivateKeyCrtComponentsJson;
    public double RecordsJson;
    public float SdkCoreAlternateContactlessPaymentDataImpl;
    public java.lang.Object getAid;
    private int getCiacDecline;
    private final long[] getCvrMaskAnd;
    private int getGpoResponse;
    public double getProfileVersion;
    public long valueOf;
    public int values;
    public long writeReplace;
    private final int[] SdkCoreBusinessLogicModuleImpl = new int[11];
    private final float[] getPaymentFci = new float[11];
    private final double[] getCvmResetTimeout = new double[11];
    private final java.lang.Object[] getSecurityWord = new java.lang.Object[11];

    public int values(int i) {
        switch (i) {
            case 1:
                java.lang.Object[] objArr = this.getSecurityWord;
                int i2 = this.getCiacDecline;
                this.getCiacDecline = i2 + 1;
                objArr[i2] = this.IccPrivateKeyCrtComponentsJson;
                return 0;
            case 2:
                int[] iArr = this.SdkCoreBusinessLogicModuleImpl;
                int i3 = this.getCiacDecline;
                this.getCiacDecline = i3 + 1;
                iArr[i3] = 2;
                return 0;
            case 3:
                long[] jArr = this.getCvrMaskAnd;
                int i4 = this.getCiacDecline;
                this.getCiacDecline = i4 + 1;
                jArr[i4] = this.writeReplace;
                return 0;
            case 4:
                long[] jArr2 = this.getCvrMaskAnd;
                int i5 = this.getCiacDecline;
                jArr2[i5] = 0;
                this.getCiacDecline = i5;
                int i6 = i5 - 1;
                this.SdkCoreBusinessLogicModuleImpl[i6] = (jArr2[i6] > 0L ? 1 : (jArr2[i6] == 0L ? 0 : -1));
                return 0;
            case 5:
                int i7 = this.getCiacDecline;
                int i8 = i7 - 1;
                this.getCiacDecline = i8;
                int[] iArr2 = this.SdkCoreBusinessLogicModuleImpl;
                int i9 = i7 - 2;
                iArr2[i9] = iArr2[i9] + iArr2[i8];
                return 0;
            case 6:
                int i10 = this.getCiacDecline - this.values;
                this.getCiacDecline = i10;
                this.getGpoResponse = i10;
                return 0;
            case 7:
                java.lang.Object[] objArr2 = this.getSecurityWord;
                int i11 = this.getGpoResponse;
                this.getGpoResponse = i11 + 1;
                java.lang.Object obj = objArr2[i11];
                objArr2[i11] = null;
                this.getAid = obj;
                return 0;
            case 8:
                int[] iArr3 = this.SdkCoreBusinessLogicModuleImpl;
                int i12 = this.getGpoResponse;
                this.getGpoResponse = i12 + 1;
                this.DigitizedCardProfile = iArr3[i12];
                return 0;
            case 9:
                java.lang.Object[] objArr3 = this.getSecurityWord;
                int i13 = this.getCiacDecline;
                this.getCiacDecline = i13 + 1;
                objArr3[i13] = objArr3[i13 - 1];
                return 0;
            case 10:
                int i14 = this.getCiacDecline - 1;
                this.getCiacDecline = i14;
                java.lang.Object[] objArr4 = this.getSecurityWord;
                java.lang.Object obj2 = objArr4[i14];
                objArr4[i14] = null;
                this.DigitizedCardProfile = obj2 == null ? 0 : 1;
                return 0;
            case 11:
                java.lang.Object[] objArr5 = this.getSecurityWord;
                int i15 = this.getCiacDecline;
                int i16 = i15 - 1;
                java.lang.Object obj3 = objArr5[i16];
                objArr5[i16] = null;
                int i17 = i15 - 2;
                java.lang.Object obj4 = objArr5[i17];
                objArr5[i17] = null;
                objArr5[i16] = obj4;
                objArr5[i17] = obj3;
                return 0;
            case 12:
                java.lang.Object[] objArr6 = this.getSecurityWord;
                int i18 = this.getCiacDecline - 1;
                java.lang.Object obj5 = objArr6[i18];
                objArr6[i18] = null;
                this.getAid = obj5;
                return 0;
            case 13:
                int i19 = this.getCiacDecline - 1;
                this.getCiacDecline = i19;
                this.getSecurityWord[i19] = null;
                return 0;
            case 14:
                int[] iArr4 = this.SdkCoreBusinessLogicModuleImpl;
                int i20 = this.getCiacDecline;
                this.getCiacDecline = i20 + 1;
                iArr4[i20] = 1;
                return 0;
            case 15:
                java.lang.Object[] objArr7 = this.getSecurityWord;
                int i21 = this.getCiacDecline;
                this.getCiacDecline = i21 + 1;
                int i22 = i21 - 1;
                java.lang.Object obj6 = objArr7[i22];
                objArr7[i22] = null;
                objArr7[i21] = obj6;
                int i23 = i21 - 2;
                java.lang.Object obj7 = objArr7[i23];
                objArr7[i23] = null;
                objArr7[i22] = obj7;
                objArr7[i23] = obj6;
                return 0;
            case 16:
                java.lang.Object[] objArr8 = this.getSecurityWord;
                int i24 = this.getCiacDecline;
                int i25 = i24 - 1;
                java.lang.Object obj8 = objArr8[i25];
                objArr8[i25] = null;
                int i26 = i24 - 2;
                java.lang.Object obj9 = objArr8[i26];
                objArr8[i26] = null;
                objArr8[i25] = obj9;
                objArr8[i26] = obj8;
                int[] iArr5 = this.SdkCoreBusinessLogicModuleImpl;
                this.getCiacDecline = i24 + 1;
                iArr5[i24] = 0;
                return 0;
            case 17:
                java.lang.Object[] objArr9 = this.getSecurityWord;
                int i27 = this.getCiacDecline;
                int i28 = i27 - 2;
                java.lang.Object obj10 = objArr9[i28];
                objArr9[i28] = null;
                int i29 = i27 - 1;
                objArr9[i29] = obj10;
                int[] iArr6 = this.SdkCoreBusinessLogicModuleImpl;
                int i30 = iArr6[i29];
                iArr6[i28] = i30;
                int i31 = i27 - 3;
                this.getCiacDecline = i31;
                java.lang.Object obj11 = objArr9[i31];
                objArr9[i31] = null;
                java.lang.Object obj12 = objArr9[i29];
                objArr9[i29] = null;
                ((java.lang.Object[]) obj11)[i30] = obj12;
                return 0;
            case 18:
                int[] iArr7 = this.SdkCoreBusinessLogicModuleImpl;
                int i32 = this.getCiacDecline;
                this.getCiacDecline = i32 + 1;
                iArr7[i32] = 0;
                return 0;
            case 19:
                int i33 = this.getCiacDecline;
                int i34 = i33 - 3;
                this.getCiacDecline = i34;
                java.lang.Object[] objArr10 = this.getSecurityWord;
                java.lang.Object obj13 = objArr10[i34];
                objArr10[i34] = null;
                int i35 = this.SdkCoreBusinessLogicModuleImpl[i33 - 2];
                int i36 = i33 - 1;
                java.lang.Object obj14 = objArr10[i36];
                objArr10[i36] = null;
                ((java.lang.Object[]) obj13)[i35] = obj14;
                return 0;
            case 20:
                java.lang.Object[] objArr11 = this.getSecurityWord;
                int i37 = this.getCiacDecline;
                this.getCiacDecline = i37 + 1;
                objArr11[i37] = null;
                return 0;
            case 21:
                java.lang.Object[] objArr12 = this.getSecurityWord;
                int i38 = this.getCiacDecline;
                objArr12[i38] = null;
                this.getCiacDecline = i38 + 2;
                objArr12[i38 + 1] = null;
                return 0;
            case 22:
                int[] iArr8 = this.SdkCoreBusinessLogicModuleImpl;
                int i39 = this.getCiacDecline;
                int i40 = i39 + 1;
                iArr8[i39] = 2;
                iArr8[i40] = 2;
                this.getCiacDecline = i40;
                iArr8[i39] = iArr8[i39] % 2;
                return 0;
            case 23:
                int[] iArr9 = this.SdkCoreBusinessLogicModuleImpl;
                int i41 = this.getCiacDecline;
                iArr9[i41] = 2;
                this.getCiacDecline = i41;
                int i42 = i41 - 1;
                iArr9[i42] = iArr9[i42] % 2;
                return 0;
            case 24:
                int[] iArr10 = this.SdkCoreBusinessLogicModuleImpl;
                int i43 = this.getCiacDecline;
                this.getCiacDecline = i43 + 1;
                iArr10[i43] = this.values;
                return 0;
            case 25:
                int[] iArr11 = this.SdkCoreBusinessLogicModuleImpl;
                int i44 = this.getCiacDecline;
                iArr11[i44] = 55;
                int i45 = i44 - 1;
                int i46 = iArr11[i45] + 55;
                iArr11[i45] = i46;
                this.getCiacDecline = i44 + 1;
                iArr11[i44] = i46;
                return 0;
            case 26:
                int[] iArr12 = this.SdkCoreBusinessLogicModuleImpl;
                int i47 = this.getCiacDecline;
                this.getCiacDecline = i47 + 1;
                iArr12[i47] = 128;
                return 0;
            case 27:
                int i48 = this.getCiacDecline;
                int i49 = i48 - 1;
                this.getCiacDecline = i49;
                int[] iArr13 = this.SdkCoreBusinessLogicModuleImpl;
                int i50 = i48 - 2;
                iArr13[i50] = iArr13[i50] % iArr13[i49];
                return 0;
            case 28:
                int i51 = this.getCiacDecline - 1;
                this.getCiacDecline = i51;
                this.DigitizedCardProfile = this.SdkCoreBusinessLogicModuleImpl[i51] != 0 ? 0 : 1;
                return 0;
            case 29:
                int[] iArr14 = this.SdkCoreBusinessLogicModuleImpl;
                int i52 = this.getCiacDecline;
                this.getCiacDecline = i52 + 1;
                iArr14[i52] = 31;
                return 0;
            case 30:
                int[] iArr15 = this.SdkCoreBusinessLogicModuleImpl;
                int i53 = this.getCiacDecline;
                int i54 = i53 + 1;
                iArr15[i53] = iArr15[i53 - 1];
                iArr15[i54] = 128;
                this.getCiacDecline = i54;
                iArr15[i53] = iArr15[i53] % 128;
                return 0;
            case 31:
                for (int i55 = this.getCiacDecline - 1; i55 >= 0; i55--) {
                    this.getSecurityWord[i55] = null;
                }
                java.lang.Object[] objArr13 = this.getSecurityWord;
                this.getCiacDecline = 1;
                objArr13[0] = this.IccPrivateKeyCrtComponentsJson;
                return 0;
            default:
                return i;
        }
    }

    public setOnMenuItemClickListener(long j, long j2) {
        long[] jArr = new long[11];
        this.getCvrMaskAnd = jArr;
        jArr[7] = j;
        jArr[9] = j2;
        this.getCiacDecline = 0;
        this.getGpoResponse = -1;
    }
}

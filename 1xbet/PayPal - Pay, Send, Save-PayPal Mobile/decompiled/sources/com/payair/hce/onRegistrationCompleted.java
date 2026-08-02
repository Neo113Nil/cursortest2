package com.payair.hce;

/* loaded from: classes10.dex */
public class onRegistrationCompleted {
    public int AlternateContactlessPaymentDataJson;
    public int DigitizedCardProfile;
    public java.lang.Object IccPrivateKeyCrtComponentsJson;
    public double RecordsJson;
    public float SdkCoreAlternateContactlessPaymentDataImpl;
    private int SdkCoreBusinessLogicModuleImpl;
    public double getAid;
    private int getCvrMaskAnd;
    private final long[] getGpoResponse;
    public java.lang.Object getProfileVersion;
    public float valueOf;
    public long values;
    public long writeReplace;
    private final int[] getPaymentFci = new int[11];
    private final float[] getCiacDecline = new float[11];
    private final double[] getDualTapResetTimeout = new double[11];
    private final java.lang.Object[] getCvmResetTimeout = new java.lang.Object[11];

    public int valueOf(int i) {
        switch (i) {
            case 1:
                int[] iArr = this.getPaymentFci;
                int i2 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i2 + 1;
                iArr[i2] = 127;
                return 0;
            case 2:
                java.lang.Object[] objArr = this.getCvmResetTimeout;
                int i3 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i3 + 1;
                objArr[i3] = this.IccPrivateKeyCrtComponentsJson;
                return 0;
            case 3:
                int i4 = this.SdkCoreBusinessLogicModuleImpl - this.AlternateContactlessPaymentDataJson;
                this.SdkCoreBusinessLogicModuleImpl = i4;
                this.getCvrMaskAnd = i4;
                return 0;
            case 4:
                java.lang.Object[] objArr2 = this.getCvmResetTimeout;
                int i5 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i5 + 1;
                java.lang.Object obj = objArr2[i5];
                objArr2[i5] = null;
                this.getProfileVersion = obj;
                return 0;
            case 5:
                int[] iArr2 = this.getPaymentFci;
                int i6 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i6 + 1;
                iArr2[i6] = this.AlternateContactlessPaymentDataJson;
                return 0;
            case 6:
                int i7 = this.SdkCoreBusinessLogicModuleImpl;
                int i8 = i7 - 1;
                int[] iArr3 = this.getPaymentFci;
                int i9 = i7 - 2;
                iArr3[i9] = iArr3[i9] - iArr3[i8];
                java.lang.Object[] objArr3 = this.getCvmResetTimeout;
                objArr3[i8] = null;
                this.SdkCoreBusinessLogicModuleImpl = i7 + 1;
                objArr3[i7] = null;
                return 0;
            case 7:
                int[] iArr4 = this.getPaymentFci;
                int i10 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i10 + 1;
                this.DigitizedCardProfile = iArr4[i10];
                return 0;
            case 8:
                java.lang.Object[] objArr4 = this.getCvmResetTimeout;
                int i11 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i11 + 1;
                objArr4[i11] = objArr4[i11 - 1];
                return 0;
            case 9:
                int i12 = this.SdkCoreBusinessLogicModuleImpl - 1;
                this.SdkCoreBusinessLogicModuleImpl = i12;
                java.lang.Object[] objArr5 = this.getCvmResetTimeout;
                java.lang.Object obj2 = objArr5[i12];
                objArr5[i12] = null;
                this.DigitizedCardProfile = obj2 == null ? 0 : 1;
                return 0;
            case 10:
                java.lang.Object[] objArr6 = this.getCvmResetTimeout;
                int i13 = this.SdkCoreBusinessLogicModuleImpl;
                int i14 = i13 - 1;
                java.lang.Object obj3 = objArr6[i14];
                objArr6[i14] = null;
                int i15 = i13 - 2;
                java.lang.Object obj4 = objArr6[i15];
                objArr6[i15] = null;
                objArr6[i14] = obj4;
                objArr6[i15] = obj3;
                return 0;
            case 11:
                java.lang.Object[] objArr7 = this.getCvmResetTimeout;
                int i16 = this.SdkCoreBusinessLogicModuleImpl - 1;
                java.lang.Object obj5 = objArr7[i16];
                objArr7[i16] = null;
                this.getProfileVersion = obj5;
                return 0;
            case 12:
                int i17 = this.SdkCoreBusinessLogicModuleImpl - 1;
                this.SdkCoreBusinessLogicModuleImpl = i17;
                this.getCvmResetTimeout[i17] = null;
                return 0;
            case 13:
                int[] iArr5 = this.getPaymentFci;
                int i18 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i18 + 1;
                iArr5[i18] = 1;
                return 0;
            case 14:
                java.lang.Object[] objArr8 = this.getCvmResetTimeout;
                int i19 = this.SdkCoreBusinessLogicModuleImpl;
                int i20 = i19 - 1;
                java.lang.Object obj6 = objArr8[i20];
                objArr8[i20] = null;
                objArr8[i19] = obj6;
                int i21 = i19 - 2;
                java.lang.Object obj7 = objArr8[i21];
                objArr8[i21] = null;
                objArr8[i20] = obj7;
                objArr8[i21] = obj6;
                java.lang.Object obj8 = objArr8[i19];
                objArr8[i19] = null;
                java.lang.Object obj9 = objArr8[i20];
                objArr8[i20] = null;
                objArr8[i19] = obj9;
                objArr8[i20] = obj8;
                int[] iArr6 = this.getPaymentFci;
                this.SdkCoreBusinessLogicModuleImpl = i19 + 2;
                iArr6[i19 + 1] = 0;
                return 0;
            case 15:
                java.lang.Object[] objArr9 = this.getCvmResetTimeout;
                int i22 = this.SdkCoreBusinessLogicModuleImpl;
                int i23 = i22 - 2;
                java.lang.Object obj10 = objArr9[i23];
                objArr9[i23] = null;
                int i24 = i22 - 1;
                objArr9[i24] = obj10;
                int[] iArr7 = this.getPaymentFci;
                iArr7[i23] = iArr7[i24];
                return 0;
            case 16:
                int i25 = this.SdkCoreBusinessLogicModuleImpl;
                int i26 = i25 - 3;
                this.SdkCoreBusinessLogicModuleImpl = i26;
                java.lang.Object[] objArr10 = this.getCvmResetTimeout;
                java.lang.Object obj11 = objArr10[i26];
                objArr10[i26] = null;
                int i27 = this.getPaymentFci[i25 - 2];
                int i28 = i25 - 1;
                java.lang.Object obj12 = objArr10[i28];
                objArr10[i28] = null;
                ((java.lang.Object[]) obj11)[i27] = obj12;
                return 0;
            case 17:
                int[] iArr8 = this.getPaymentFci;
                int i29 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i29 + 1;
                iArr8[i29] = 0;
                return 0;
            case 18:
                java.lang.Object[] objArr11 = this.getCvmResetTimeout;
                int i30 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i30 + 1;
                objArr11[i30] = null;
                objArr11[i30] = null;
                int i31 = i30 - 1;
                java.lang.Object obj13 = objArr11[i31];
                objArr11[i31] = null;
                objArr11[i30] = obj13;
                objArr11[i31] = null;
                return 0;
            case 19:
                java.lang.Object[] objArr12 = this.getCvmResetTimeout;
                int i32 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i32 + 1;
                objArr12[i32] = null;
                return 0;
            case 20:
                int[] iArr9 = this.getPaymentFci;
                int i33 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i33 + 1;
                iArr9[i33] = 2;
                return 0;
            case 21:
                int i34 = this.SdkCoreBusinessLogicModuleImpl;
                int i35 = i34 - 1;
                this.SdkCoreBusinessLogicModuleImpl = i35;
                int[] iArr10 = this.getPaymentFci;
                int i36 = i34 - 2;
                iArr10[i36] = iArr10[i36] % iArr10[i35];
                return 0;
            case 23:
                int[] iArr11 = this.getPaymentFci;
                int i37 = this.SdkCoreBusinessLogicModuleImpl;
                iArr11[i37] = 75;
                this.SdkCoreBusinessLogicModuleImpl = i37;
                int i38 = i37 - 1;
                iArr11[i38] = iArr11[i38] + 75;
            case 22:
                return 0;
            case 24:
                int[] iArr12 = this.getPaymentFci;
                int i39 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i39 + 1;
                iArr12[i39] = iArr12[i39 - 1];
                return 0;
            case 25:
                int[] iArr13 = this.getPaymentFci;
                int i40 = this.SdkCoreBusinessLogicModuleImpl;
                iArr13[i40] = 128;
                this.SdkCoreBusinessLogicModuleImpl = i40;
                int i41 = i40 - 1;
                iArr13[i41] = iArr13[i41] % 128;
                return 0;
            case 26:
                int i42 = this.SdkCoreBusinessLogicModuleImpl - 1;
                this.SdkCoreBusinessLogicModuleImpl = i42;
                this.DigitizedCardProfile = this.getPaymentFci[i42] != 0 ? 0 : 1;
                return 0;
            case 27:
                int[] iArr14 = this.getPaymentFci;
                int i43 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i43 + 1;
                iArr14[i43] = 31;
                return 0;
            case 28:
                int i44 = this.SdkCoreBusinessLogicModuleImpl;
                int i45 = i44 - 1;
                this.SdkCoreBusinessLogicModuleImpl = i45;
                int[] iArr15 = this.getPaymentFci;
                int i46 = i44 - 2;
                iArr15[i46] = iArr15[i46] + iArr15[i45];
                return 0;
            case 29:
                int[] iArr16 = this.getPaymentFci;
                int i47 = this.SdkCoreBusinessLogicModuleImpl;
                int i48 = i47 + 1;
                iArr16[i47] = iArr16[i47 - 1];
                iArr16[i48] = 128;
                this.SdkCoreBusinessLogicModuleImpl = i48;
                iArr16[i47] = iArr16[i47] % 128;
                return 0;
            case 30:
                int[] iArr17 = this.getPaymentFci;
                int i49 = this.SdkCoreBusinessLogicModuleImpl;
                iArr17[i49] = 2;
                this.SdkCoreBusinessLogicModuleImpl = i49;
                int i50 = i49 - 1;
                iArr17[i50] = iArr17[i50] % 2;
                return 0;
            case 31:
                int[] iArr18 = this.getPaymentFci;
                int i51 = this.SdkCoreBusinessLogicModuleImpl;
                int i52 = i51 + 1;
                iArr18[i51] = 11;
                iArr18[i52] = 0;
                this.SdkCoreBusinessLogicModuleImpl = i52;
                iArr18[i51] = iArr18[i51] / 0;
                return 0;
            case 32:
                int[] iArr19 = this.getPaymentFci;
                int i53 = this.SdkCoreBusinessLogicModuleImpl - 1;
                this.SdkCoreBusinessLogicModuleImpl = i53;
                this.DigitizedCardProfile = iArr19[i53];
                return 0;
            case 33:
                for (int i54 = this.SdkCoreBusinessLogicModuleImpl - 1; i54 >= 0; i54--) {
                    this.getCvmResetTimeout[i54] = null;
                }
                java.lang.Object[] objArr13 = this.getCvmResetTimeout;
                this.SdkCoreBusinessLogicModuleImpl = 1;
                objArr13[0] = this.IccPrivateKeyCrtComponentsJson;
                return 0;
            default:
                return i;
        }
    }

    public onRegistrationCompleted(long j, long j2) {
        long[] jArr = new long[11];
        this.getGpoResponse = jArr;
        jArr[7] = j;
        jArr[9] = j2;
        this.SdkCoreBusinessLogicModuleImpl = 0;
        this.getCvrMaskAnd = -1;
    }
}

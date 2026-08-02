package com.payair.hce;

/* loaded from: classes10.dex */
public class setCompoundDrawablesRelative {
    public int AlternateContactlessPaymentDataJson;
    public long DigitizedCardProfile;
    public float IccPrivateKeyCrtComponentsJson;
    public double RecordsJson;
    public double SdkCoreAlternateContactlessPaymentDataImpl;
    private final long[] SdkCoreBusinessLogicModuleImpl;
    public java.lang.Object getAid;
    private int getGpoResponse;
    private int getPaymentFci;
    public java.lang.Object getProfileVersion;
    public float valueOf;
    public long values;
    public int writeReplace;
    private final int[] getCvrMaskAnd = new int[11];
    private final float[] getCiacDecline = new float[11];
    private final double[] getCvmResetTimeout = new double[11];
    private final java.lang.Object[] getApplicationLifeCycleData = new java.lang.Object[11];

    public int DigitizedCardProfile(int i) {
        switch (i) {
            case 1:
                java.lang.Object[] objArr = this.getApplicationLifeCycleData;
                int i2 = this.getGpoResponse;
                this.getGpoResponse = i2 + 1;
                objArr[i2] = this.getProfileVersion;
                return 0;
            case 2:
                int[] iArr = this.getCvrMaskAnd;
                int i3 = this.getGpoResponse;
                this.getGpoResponse = i3 + 1;
                iArr[i3] = this.writeReplace;
                return 0;
            case 3:
                int i4 = this.getGpoResponse - this.writeReplace;
                this.getGpoResponse = i4;
                this.getPaymentFci = i4;
                return 0;
            case 4:
                java.lang.Object[] objArr2 = this.getApplicationLifeCycleData;
                int i5 = this.getPaymentFci;
                this.getPaymentFci = i5 + 1;
                java.lang.Object obj = objArr2[i5];
                objArr2[i5] = null;
                this.getAid = obj;
                return 0;
            case 5:
                int i6 = this.getGpoResponse;
                int i7 = i6 - 1;
                this.getGpoResponse = i7;
                int[] iArr2 = this.getCvrMaskAnd;
                int i8 = i6 - 2;
                iArr2[i8] = iArr2[i8] + iArr2[i7];
                return 0;
            case 6:
                int[] iArr3 = this.getCvrMaskAnd;
                int i9 = this.getPaymentFci;
                this.getPaymentFci = i9 + 1;
                this.AlternateContactlessPaymentDataJson = iArr3[i9];
                return 0;
            case 7:
                java.lang.Object[] objArr3 = this.getApplicationLifeCycleData;
                int i10 = this.getGpoResponse;
                this.getGpoResponse = i10 + 1;
                objArr3[i10] = objArr3[i10 - 1];
                return 0;
            case 8:
                int i11 = this.getGpoResponse - 1;
                this.getGpoResponse = i11;
                java.lang.Object[] objArr4 = this.getApplicationLifeCycleData;
                java.lang.Object obj2 = objArr4[i11];
                objArr4[i11] = null;
                this.AlternateContactlessPaymentDataJson = obj2 == null ? 0 : 1;
                return 0;
            case 9:
                java.lang.Object[] objArr5 = this.getApplicationLifeCycleData;
                int i12 = this.getGpoResponse;
                int i13 = i12 - 1;
                java.lang.Object obj3 = objArr5[i13];
                objArr5[i13] = null;
                int i14 = i12 - 2;
                java.lang.Object obj4 = objArr5[i14];
                objArr5[i14] = null;
                objArr5[i13] = obj4;
                objArr5[i14] = obj3;
                return 0;
            case 10:
                java.lang.Object[] objArr6 = this.getApplicationLifeCycleData;
                int i15 = this.getGpoResponse - 1;
                java.lang.Object obj5 = objArr6[i15];
                objArr6[i15] = null;
                this.getAid = obj5;
                return 0;
            case 11:
                int i16 = this.getGpoResponse - 1;
                this.getGpoResponse = i16;
                this.getApplicationLifeCycleData[i16] = null;
                return 0;
            case 12:
                int[] iArr4 = this.getCvrMaskAnd;
                int i17 = this.getGpoResponse;
                this.getGpoResponse = i17 + 1;
                iArr4[i17] = 1;
                return 0;
            case 13:
                java.lang.Object[] objArr7 = this.getApplicationLifeCycleData;
                int i18 = this.getGpoResponse;
                this.getGpoResponse = i18 + 1;
                int i19 = i18 - 1;
                java.lang.Object obj6 = objArr7[i19];
                objArr7[i19] = null;
                objArr7[i18] = obj6;
                int i20 = i18 - 2;
                java.lang.Object obj7 = objArr7[i20];
                objArr7[i20] = null;
                objArr7[i19] = obj7;
                objArr7[i20] = obj6;
                java.lang.Object obj8 = objArr7[i18];
                objArr7[i18] = null;
                java.lang.Object obj9 = objArr7[i19];
                objArr7[i19] = null;
                objArr7[i18] = obj9;
                objArr7[i19] = obj8;
                return 0;
            case 14:
                int[] iArr5 = this.getCvrMaskAnd;
                int i21 = this.getGpoResponse;
                this.getGpoResponse = i21 + 1;
                iArr5[i21] = 0;
                return 0;
            case 15:
                java.lang.Object[] objArr8 = this.getApplicationLifeCycleData;
                int i22 = this.getGpoResponse;
                int i23 = i22 - 2;
                java.lang.Object obj10 = objArr8[i23];
                objArr8[i23] = null;
                int i24 = i22 - 1;
                objArr8[i24] = obj10;
                int[] iArr6 = this.getCvrMaskAnd;
                iArr6[i23] = iArr6[i24];
                return 0;
            case 16:
                int i25 = this.getGpoResponse;
                int i26 = i25 - 3;
                this.getGpoResponse = i26;
                java.lang.Object[] objArr9 = this.getApplicationLifeCycleData;
                java.lang.Object obj11 = objArr9[i26];
                objArr9[i26] = null;
                int i27 = this.getCvrMaskAnd[i25 - 2];
                int i28 = i25 - 1;
                java.lang.Object obj12 = objArr9[i28];
                objArr9[i28] = null;
                ((java.lang.Object[]) obj11)[i27] = obj12;
                return 0;
            case 17:
                java.lang.Object[] objArr10 = this.getApplicationLifeCycleData;
                int i29 = this.getGpoResponse;
                objArr10[i29] = objArr10[i29 - 1];
                int[] iArr7 = this.getCvrMaskAnd;
                this.getGpoResponse = i29 + 2;
                iArr7[i29 + 1] = 0;
                return 0;
            case 18:
                java.lang.Object[] objArr11 = this.getApplicationLifeCycleData;
                int i30 = this.getGpoResponse;
                this.getGpoResponse = i30 + 1;
                objArr11[i30] = null;
                objArr11[i30] = null;
                int i31 = i30 - 1;
                java.lang.Object obj13 = objArr11[i31];
                objArr11[i31] = null;
                objArr11[i30] = obj13;
                objArr11[i31] = null;
                return 0;
            case 19:
                java.lang.Object[] objArr12 = this.getApplicationLifeCycleData;
                int i32 = this.getGpoResponse;
                this.getGpoResponse = i32 + 1;
                objArr12[i32] = null;
                return 0;
            case 20:
                int[] iArr8 = this.getCvrMaskAnd;
                int i33 = this.getGpoResponse;
                iArr8[i33] = 2;
                this.getGpoResponse = i33 + 2;
                iArr8[i33 + 1] = 2;
                return 0;
            case 21:
                int i34 = this.getGpoResponse;
                int i35 = i34 - 1;
                this.getGpoResponse = i35;
                int[] iArr9 = this.getCvrMaskAnd;
                int i36 = i34 - 2;
                iArr9[i36] = iArr9[i36] % iArr9[i35];
                int i37 = i34 - 2;
                this.getGpoResponse = i37;
                this.getApplicationLifeCycleData[i37] = null;
                return 0;
            case 22:
                int[] iArr10 = this.getCvrMaskAnd;
                int i38 = this.getGpoResponse;
                this.getGpoResponse = i38 + 1;
                iArr10[i38] = 2;
                return 0;
            case 23:
                int i39 = this.getGpoResponse;
                int i40 = i39 - 1;
                this.getGpoResponse = i40;
                int[] iArr11 = this.getCvrMaskAnd;
                int i41 = i39 - 2;
                iArr11[i41] = iArr11[i41] % iArr11[i40];
                return 0;
            case 24:
                int[] iArr12 = this.getCvrMaskAnd;
                int i42 = this.getGpoResponse;
                this.getGpoResponse = i42 + 1;
                iArr12[i42] = 79;
                return 0;
            case 25:
                int[] iArr13 = this.getCvrMaskAnd;
                int i43 = this.getGpoResponse;
                this.getGpoResponse = i43 + 1;
                iArr13[i43] = iArr13[i43 - 1];
                return 0;
            case 26:
                int[] iArr14 = this.getCvrMaskAnd;
                int i44 = this.getGpoResponse;
                iArr14[i44] = 128;
                this.getGpoResponse = i44;
                int i45 = i44 - 1;
                iArr14[i45] = iArr14[i45] % 128;
                return 0;
            case 27:
                int i46 = this.getGpoResponse - 1;
                this.getGpoResponse = i46;
                this.AlternateContactlessPaymentDataJson = this.getCvrMaskAnd[i46] != 0 ? 0 : 1;
                return 0;
            case 28:
                java.lang.Object[] objArr13 = this.getApplicationLifeCycleData;
                int i47 = this.getGpoResponse;
                int i48 = i47 - 1;
                java.lang.Object obj14 = objArr13[i48];
                objArr13[i48] = null;
                objArr13[i47] = obj14;
                int i49 = i47 - 2;
                java.lang.Object obj15 = objArr13[i49];
                objArr13[i49] = null;
                objArr13[i48] = obj15;
                objArr13[i49] = obj14;
                java.lang.Object obj16 = objArr13[i47];
                objArr13[i47] = null;
                java.lang.Object obj17 = objArr13[i48];
                objArr13[i48] = null;
                objArr13[i47] = obj17;
                objArr13[i48] = obj16;
                int[] iArr15 = this.getCvrMaskAnd;
                this.getGpoResponse = i47 + 2;
                iArr15[i47 + 1] = 0;
                return 0;
            case 29:
                java.lang.Object[] objArr14 = this.getApplicationLifeCycleData;
                int i50 = this.getGpoResponse;
                int i51 = i50 - 2;
                java.lang.Object obj18 = objArr14[i51];
                objArr14[i51] = null;
                int i52 = i50 - 1;
                objArr14[i52] = obj18;
                int[] iArr16 = this.getCvrMaskAnd;
                int i53 = iArr16[i52];
                iArr16[i51] = i53;
                int i54 = i50 - 3;
                this.getGpoResponse = i54;
                java.lang.Object obj19 = objArr14[i54];
                objArr14[i54] = null;
                java.lang.Object obj20 = objArr14[i52];
                objArr14[i52] = null;
                ((java.lang.Object[]) obj19)[i53] = obj20;
                return 0;
            case 30:
                java.lang.Object[] objArr15 = this.getApplicationLifeCycleData;
                int i55 = this.getGpoResponse;
                objArr15[i55] = objArr15[i55 - 1];
                int[] iArr17 = this.getCvrMaskAnd;
                this.getGpoResponse = i55 + 2;
                iArr17[i55 + 1] = 1;
                return 0;
            case 31:
                java.lang.Object[] objArr16 = this.getApplicationLifeCycleData;
                int i56 = this.getGpoResponse;
                int i57 = i56 - 1;
                java.lang.Object obj21 = objArr16[i57];
                objArr16[i57] = null;
                int i58 = i56 - 2;
                java.lang.Object obj22 = objArr16[i58];
                objArr16[i58] = null;
                objArr16[i57] = obj22;
                objArr16[i58] = obj21;
                this.getGpoResponse = i56 + 1;
                objArr16[i56] = null;
                return 0;
            case 32:
                int[] iArr18 = this.getCvrMaskAnd;
                int i59 = this.getGpoResponse;
                this.getGpoResponse = i59 + 1;
                iArr18[i59] = 63;
                return 0;
            case 33:
                int[] iArr19 = this.getCvrMaskAnd;
                int i60 = this.getGpoResponse;
                int i61 = i60 + 1;
                iArr19[i60] = iArr19[i60 - 1];
                iArr19[i61] = 128;
                this.getGpoResponse = i61;
                iArr19[i60] = iArr19[i60] % 128;
                return 0;
            case 34:
                int[] iArr20 = this.getCvrMaskAnd;
                int i62 = this.getGpoResponse;
                iArr20[i62] = 2;
                this.getGpoResponse = i62;
                int i63 = i62 - 1;
                iArr20[i63] = iArr20[i63] % 2;
                return 0;
            case 35:
                int i64 = this.getGpoResponse - 1;
                this.getGpoResponse = i64;
                this.AlternateContactlessPaymentDataJson = this.getCvrMaskAnd[i64] == 0 ? 0 : 1;
                return 0;
            case 36:
                int[] iArr21 = this.getCvrMaskAnd;
                int i65 = this.getGpoResponse - 1;
                this.getGpoResponse = i65;
                this.AlternateContactlessPaymentDataJson = iArr21[i65];
                return 0;
            case 37:
                for (int i66 = this.getGpoResponse - 1; i66 >= 0; i66--) {
                    this.getApplicationLifeCycleData[i66] = null;
                }
                java.lang.Object[] objArr17 = this.getApplicationLifeCycleData;
                this.getGpoResponse = 1;
                objArr17[0] = this.getProfileVersion;
                return 0;
            default:
                return i;
        }
    }

    public setCompoundDrawablesRelative(long j, long j2) {
        long[] jArr = new long[11];
        this.SdkCoreBusinessLogicModuleImpl = jArr;
        jArr[7] = j;
        jArr[9] = j2;
        this.getGpoResponse = 0;
        this.getPaymentFci = -1;
    }
}

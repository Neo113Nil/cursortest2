package com.payair.hce;

/* loaded from: classes10.dex */
public class setLayoutParams {
    public int AlternateContactlessPaymentDataJson;
    public int DigitizedCardProfile;
    public float IccPrivateKeyCrtComponentsJson;
    public double RecordsJson;
    public java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl;
    private int SdkCoreBusinessLogicModuleImpl;
    public java.lang.Object getAid;
    private final long[] getCiacDecline;
    private int getGpoResponse;
    public double getProfileVersion;
    public float valueOf;
    public long values;
    public long writeReplace;
    private final int[] getPaymentFci = new int[11];
    private final float[] getCvrMaskAnd = new float[11];
    private final double[] getCardLayoutDescription = new double[11];
    private final java.lang.Object[] getApplicationLifeCycleData = new java.lang.Object[11];

    public int values(int i) {
        switch (i) {
            case 1:
                java.lang.Object[] objArr = this.getApplicationLifeCycleData;
                int i2 = this.getGpoResponse;
                this.getGpoResponse = i2 + 1;
                objArr[i2] = this.SdkCoreAlternateContactlessPaymentDataImpl;
                return 0;
            case 2:
                int i3 = this.getGpoResponse - this.AlternateContactlessPaymentDataJson;
                this.getGpoResponse = i3;
                this.SdkCoreBusinessLogicModuleImpl = i3;
                return 0;
            case 3:
                int[] iArr = this.getPaymentFci;
                int i4 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i4 + 1;
                this.DigitizedCardProfile = iArr[i4];
                return 0;
            case 4:
                double[] dArr = this.getCardLayoutDescription;
                int i5 = this.getGpoResponse;
                this.getGpoResponse = i5 + 1;
                dArr[i5] = this.RecordsJson;
                return 0;
            case 5:
                int[] iArr2 = this.getPaymentFci;
                int i6 = this.getGpoResponse;
                iArr2[i6] = 3;
                this.getGpoResponse = i6 + 2;
                iArr2[i6 + 1] = 0;
                return 0;
            case 6:
                double[] dArr2 = this.getCardLayoutDescription;
                int i7 = this.getGpoResponse;
                dArr2[i7] = 0.0d;
                int[] iArr3 = this.getPaymentFci;
                int i8 = i7 - 1;
                int i9 = (dArr2[i8] > 0.0d ? 1 : (dArr2[i8] == 0.0d ? 0 : -1));
                iArr3[i8] = i9;
                this.getGpoResponse = i8;
                int i10 = i7 - 2;
                iArr3[i10] = iArr3[i10] + i9;
                return 0;
            case 7:
                java.lang.Object[] objArr2 = this.getApplicationLifeCycleData;
                int i11 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i11 + 1;
                java.lang.Object obj = objArr2[i11];
                objArr2[i11] = null;
                this.getAid = obj;
                return 0;
            case 8:
                java.lang.Object[] objArr3 = this.getApplicationLifeCycleData;
                int i12 = this.getGpoResponse;
                this.getGpoResponse = i12 + 1;
                objArr3[i12] = objArr3[i12 - 1];
                return 0;
            case 9:
                int i13 = this.getGpoResponse - 1;
                this.getGpoResponse = i13;
                java.lang.Object[] objArr4 = this.getApplicationLifeCycleData;
                java.lang.Object obj2 = objArr4[i13];
                objArr4[i13] = null;
                this.DigitizedCardProfile = obj2 == null ? 0 : 1;
                return 0;
            case 10:
                java.lang.Object[] objArr5 = this.getApplicationLifeCycleData;
                int i14 = this.getGpoResponse - 1;
                java.lang.Object obj3 = objArr5[i14];
                objArr5[i14] = null;
                this.getAid = obj3;
                return 0;
            case 11:
                java.lang.Object[] objArr6 = this.getApplicationLifeCycleData;
                int i15 = this.getGpoResponse;
                int i16 = i15 - 1;
                java.lang.Object obj4 = objArr6[i16];
                objArr6[i16] = null;
                int i17 = i15 - 2;
                java.lang.Object obj5 = objArr6[i17];
                objArr6[i17] = null;
                objArr6[i16] = obj5;
                objArr6[i17] = obj4;
                int i18 = i15 - 1;
                this.getGpoResponse = i18;
                objArr6[i18] = null;
                return 0;
            case 12:
                int i19 = this.getGpoResponse - 1;
                this.getGpoResponse = i19;
                this.getApplicationLifeCycleData[i19] = null;
                return 0;
            case 13:
                int[] iArr4 = this.getPaymentFci;
                int i20 = this.getGpoResponse;
                this.getGpoResponse = i20 + 1;
                iArr4[i20] = 1;
                return 0;
            case 14:
                java.lang.Object[] objArr7 = this.getApplicationLifeCycleData;
                int i21 = this.getGpoResponse;
                int i22 = i21 - 1;
                java.lang.Object obj6 = objArr7[i22];
                objArr7[i22] = null;
                objArr7[i21] = obj6;
                int i23 = i21 - 2;
                java.lang.Object obj7 = objArr7[i23];
                objArr7[i23] = null;
                objArr7[i22] = obj7;
                objArr7[i23] = obj6;
                java.lang.Object obj8 = objArr7[i21];
                objArr7[i21] = null;
                java.lang.Object obj9 = objArr7[i22];
                objArr7[i22] = null;
                objArr7[i21] = obj9;
                objArr7[i22] = obj8;
                int[] iArr5 = this.getPaymentFci;
                this.getGpoResponse = i21 + 2;
                iArr5[i21 + 1] = 0;
                return 0;
            case 15:
                java.lang.Object[] objArr8 = this.getApplicationLifeCycleData;
                int i24 = this.getGpoResponse;
                int i25 = i24 - 2;
                java.lang.Object obj10 = objArr8[i25];
                objArr8[i25] = null;
                int i26 = i24 - 1;
                objArr8[i26] = obj10;
                int[] iArr6 = this.getPaymentFci;
                int i27 = iArr6[i26];
                iArr6[i25] = i27;
                int i28 = i24 - 3;
                this.getGpoResponse = i28;
                java.lang.Object obj11 = objArr8[i28];
                objArr8[i28] = null;
                java.lang.Object obj12 = objArr8[i26];
                objArr8[i26] = null;
                ((java.lang.Object[]) obj11)[i27] = obj12;
                return 0;
            case 16:
                java.lang.Object[] objArr9 = this.getApplicationLifeCycleData;
                int i29 = this.getGpoResponse;
                objArr9[i29] = objArr9[i29 - 1];
                int[] iArr7 = this.getPaymentFci;
                this.getGpoResponse = i29 + 2;
                iArr7[i29 + 1] = 0;
                return 0;
            case 17:
                int i30 = this.getGpoResponse;
                int i31 = i30 - 3;
                this.getGpoResponse = i31;
                java.lang.Object[] objArr10 = this.getApplicationLifeCycleData;
                java.lang.Object obj13 = objArr10[i31];
                objArr10[i31] = null;
                int i32 = this.getPaymentFci[i30 - 2];
                int i33 = i30 - 1;
                java.lang.Object obj14 = objArr10[i33];
                objArr10[i33] = null;
                ((java.lang.Object[]) obj13)[i32] = obj14;
                return 0;
            case 18:
                java.lang.Object[] objArr11 = this.getApplicationLifeCycleData;
                int i34 = this.getGpoResponse;
                int i35 = i34 - 1;
                java.lang.Object obj15 = objArr11[i35];
                objArr11[i35] = null;
                int i36 = i34 - 2;
                java.lang.Object obj16 = objArr11[i36];
                objArr11[i36] = null;
                objArr11[i35] = obj16;
                objArr11[i36] = obj15;
                return 0;
            case 19:
                java.lang.Object[] objArr12 = this.getApplicationLifeCycleData;
                int i37 = this.getGpoResponse;
                this.getGpoResponse = i37 + 1;
                objArr12[i37] = null;
                return 0;
            case 20:
                int[] iArr8 = this.getPaymentFci;
                int i38 = this.getGpoResponse;
                this.getGpoResponse = i38 + 1;
                iArr8[i38] = 2;
                return 0;
            case 21:
                int[] iArr9 = this.getPaymentFci;
                int i39 = this.getGpoResponse;
                iArr9[i39] = 2;
                this.getGpoResponse = i39;
                int i40 = i39 - 1;
                iArr9[i40] = iArr9[i40] % 2;
                int i41 = i39 - 1;
                this.getGpoResponse = i41;
                this.getApplicationLifeCycleData[i41] = null;
                return 0;
            case 23:
                int[] iArr10 = this.getPaymentFci;
                int i42 = this.getGpoResponse;
                this.getGpoResponse = i42 + 1;
                iArr10[i42] = this.AlternateContactlessPaymentDataJson;
            case 22:
                return 0;
            case 24:
                int[] iArr11 = this.getPaymentFci;
                int i43 = this.getGpoResponse;
                this.getGpoResponse = i43 + 1;
                iArr11[i43] = 117;
                return 0;
            case 25:
                int i44 = this.getGpoResponse;
                int i45 = i44 - 1;
                this.getGpoResponse = i45;
                int[] iArr12 = this.getPaymentFci;
                int i46 = i44 - 2;
                iArr12[i46] = iArr12[i46] + iArr12[i45];
                return 0;
            case 26:
                int[] iArr13 = this.getPaymentFci;
                int i47 = this.getGpoResponse;
                this.getGpoResponse = i47 + 1;
                iArr13[i47] = iArr13[i47 - 1];
                return 0;
            case 27:
                int[] iArr14 = this.getPaymentFci;
                int i48 = this.getGpoResponse;
                iArr14[i48] = 128;
                this.getGpoResponse = i48;
                int i49 = i48 - 1;
                iArr14[i49] = iArr14[i49] % 128;
                return 0;
            case 28:
                int i50 = this.getGpoResponse - 1;
                this.getGpoResponse = i50;
                this.DigitizedCardProfile = this.getPaymentFci[i50] != 0 ? 0 : 1;
                return 0;
            case 29:
                int i51 = this.getGpoResponse;
                int i52 = i51 - 1;
                this.getGpoResponse = i52;
                int[] iArr15 = this.getPaymentFci;
                int i53 = i51 - 2;
                iArr15[i53] = iArr15[i53] % iArr15[i52];
                return 0;
            case 30:
                int[] iArr16 = this.getPaymentFci;
                int i54 = this.getGpoResponse;
                int i55 = i54 + 1;
                iArr16[i54] = 14;
                iArr16[i55] = 0;
                this.getGpoResponse = i55;
                iArr16[i54] = iArr16[i54] / 0;
                return 0;
            case 31:
                int[] iArr17 = this.getPaymentFci;
                int i56 = this.getGpoResponse;
                this.getGpoResponse = i56 + 1;
                iArr17[i56] = 35;
                return 0;
            case 32:
                int[] iArr18 = this.getPaymentFci;
                int i57 = this.getGpoResponse;
                this.getGpoResponse = i57 + 1;
                iArr18[i57] = 128;
                return 0;
            case 33:
                int[] iArr19 = this.getPaymentFci;
                int i58 = this.getGpoResponse - 1;
                this.getGpoResponse = i58;
                this.DigitizedCardProfile = iArr19[i58];
                return 0;
            case 34:
                int[] iArr20 = this.getPaymentFci;
                int i59 = this.getGpoResponse;
                this.getGpoResponse = i59 + 1;
                iArr20[i59] = 0;
                return 0;
            case 35:
                for (int i60 = this.getGpoResponse - 1; i60 >= 0; i60--) {
                    this.getApplicationLifeCycleData[i60] = null;
                }
                java.lang.Object[] objArr13 = this.getApplicationLifeCycleData;
                this.getGpoResponse = 1;
                objArr13[0] = this.SdkCoreAlternateContactlessPaymentDataImpl;
                return 0;
            default:
                return i;
        }
    }

    public setLayoutParams(long j, long j2) {
        long[] jArr = new long[11];
        this.getCiacDecline = jArr;
        jArr[7] = j;
        jArr[9] = j2;
        this.getGpoResponse = 0;
        this.SdkCoreBusinessLogicModuleImpl = -1;
    }
}

package com.payair.hce;

/* loaded from: classes10.dex */
public class getDsrpMdSessionKey {
    public float AlternateContactlessPaymentDataJson;
    public int DigitizedCardProfile;
    public double IccPrivateKeyCrtComponentsJson;
    public java.lang.Object RecordsJson;
    public java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl;
    private final long[] SdkCoreBusinessLogicModuleImpl;
    public float getAid;
    private int getCiacDecline;
    private int getGpoResponse;
    public double getProfileVersion;
    public long valueOf;
    public int values;
    public long writeReplace;
    private final int[] getCvrMaskAnd = new int[11];
    private final float[] getPaymentFci = new float[11];
    private final double[] getCardLayoutDescription = new double[11];
    private final java.lang.Object[] getApplicationLifeCycleData = new java.lang.Object[11];

    public int writeReplace(int i) {
        switch (i) {
            case 1:
                java.lang.Object[] objArr = this.getApplicationLifeCycleData;
                int i2 = this.getCiacDecline;
                this.getCiacDecline = i2 + 1;
                objArr[i2] = this.SdkCoreAlternateContactlessPaymentDataImpl;
                return 0;
            case 2:
                int[] iArr = this.getCvrMaskAnd;
                int i3 = this.getCiacDecline;
                this.getCiacDecline = i3 + 1;
                iArr[i3] = this.DigitizedCardProfile;
                return 0;
            case 3:
                int[] iArr2 = this.getCvrMaskAnd;
                int i4 = this.getCiacDecline;
                this.getCiacDecline = i4 + 1;
                iArr2[i4] = 24;
                return 0;
            case 4:
                int i5 = this.getCiacDecline;
                int[] iArr3 = this.getCvrMaskAnd;
                int i6 = i5 - 2;
                int i7 = iArr3[i6] >> iArr3[i5 - 1];
                iArr3[i6] = i7;
                this.getCiacDecline = i6;
                int i8 = i5 - 3;
                iArr3[i8] = iArr3[i8] + i7;
                return 0;
            case 5:
                int i9 = this.getCiacDecline - this.DigitizedCardProfile;
                this.getCiacDecline = i9;
                this.getGpoResponse = i9;
                return 0;
            case 6:
                int[] iArr4 = this.getCvrMaskAnd;
                int i10 = this.getGpoResponse;
                this.getGpoResponse = i10 + 1;
                this.values = iArr4[i10];
                return 0;
            case 7:
                int[] iArr5 = this.getCvrMaskAnd;
                int i11 = this.getCiacDecline;
                this.getCiacDecline = i11 + 1;
                iArr5[i11] = 0;
                return 0;
            case 8:
                int i12 = this.getCiacDecline;
                int i13 = i12 - 1;
                this.getCiacDecline = i13;
                int[] iArr6 = this.getCvrMaskAnd;
                int i14 = i12 - 2;
                iArr6[i14] = iArr6[i14] - iArr6[i13];
                return 0;
            case 9:
                int[] iArr7 = this.getCvrMaskAnd;
                int i15 = this.getCiacDecline - 1;
                iArr7[i15] = (char) iArr7[i15];
                return 0;
            case 10:
                java.lang.Object[] objArr2 = this.getApplicationLifeCycleData;
                int i16 = this.getGpoResponse;
                this.getGpoResponse = i16 + 1;
                java.lang.Object obj = objArr2[i16];
                objArr2[i16] = null;
                this.RecordsJson = obj;
                return 0;
            case 11:
                java.lang.Object[] objArr3 = this.getApplicationLifeCycleData;
                int i17 = this.getCiacDecline;
                this.getCiacDecline = i17 + 1;
                objArr3[i17] = objArr3[i17 - 1];
                return 0;
            case 12:
                int i18 = this.getCiacDecline - 1;
                this.getCiacDecline = i18;
                java.lang.Object[] objArr4 = this.getApplicationLifeCycleData;
                java.lang.Object obj2 = objArr4[i18];
                objArr4[i18] = null;
                this.values = obj2 == null ? 0 : 1;
                return 0;
            case 13:
                java.lang.Object[] objArr5 = this.getApplicationLifeCycleData;
                int i19 = this.getCiacDecline - 1;
                java.lang.Object obj3 = objArr5[i19];
                objArr5[i19] = null;
                this.RecordsJson = obj3;
                return 0;
            case 14:
                java.lang.Object[] objArr6 = this.getApplicationLifeCycleData;
                int i20 = this.getCiacDecline;
                int i21 = i20 - 1;
                java.lang.Object obj4 = objArr6[i21];
                objArr6[i21] = null;
                int i22 = i20 - 2;
                java.lang.Object obj5 = objArr6[i22];
                objArr6[i22] = null;
                objArr6[i21] = obj5;
                objArr6[i22] = obj4;
                int i23 = i20 - 1;
                this.getCiacDecline = i23;
                objArr6[i23] = null;
                return 0;
            case 15:
                int i24 = this.getCiacDecline - 1;
                this.getCiacDecline = i24;
                this.getApplicationLifeCycleData[i24] = null;
                return 0;
            case 16:
                int[] iArr8 = this.getCvrMaskAnd;
                int i25 = this.getCiacDecline;
                this.getCiacDecline = i25 + 1;
                iArr8[i25] = 1;
                return 0;
            case 17:
                java.lang.Object[] objArr7 = this.getApplicationLifeCycleData;
                int i26 = this.getCiacDecline;
                this.getCiacDecline = i26 + 1;
                int i27 = i26 - 1;
                java.lang.Object obj6 = objArr7[i27];
                objArr7[i27] = null;
                objArr7[i26] = obj6;
                int i28 = i26 - 2;
                java.lang.Object obj7 = objArr7[i28];
                objArr7[i28] = null;
                objArr7[i27] = obj7;
                objArr7[i28] = obj6;
                return 0;
            case 18:
                java.lang.Object[] objArr8 = this.getApplicationLifeCycleData;
                int i29 = this.getCiacDecline;
                int i30 = i29 - 1;
                java.lang.Object obj8 = objArr8[i30];
                objArr8[i30] = null;
                int i31 = i29 - 2;
                java.lang.Object obj9 = objArr8[i31];
                objArr8[i31] = null;
                objArr8[i30] = obj9;
                objArr8[i31] = obj8;
                int[] iArr9 = this.getCvrMaskAnd;
                this.getCiacDecline = i29 + 1;
                iArr9[i29] = 0;
                java.lang.Object obj10 = objArr8[i30];
                objArr8[i30] = null;
                objArr8[i29] = obj10;
                iArr9[i30] = 0;
                return 0;
            case 19:
                int i32 = this.getCiacDecline;
                int i33 = i32 - 3;
                this.getCiacDecline = i33;
                java.lang.Object[] objArr9 = this.getApplicationLifeCycleData;
                java.lang.Object obj11 = objArr9[i33];
                objArr9[i33] = null;
                int i34 = this.getCvrMaskAnd[i32 - 2];
                int i35 = i32 - 1;
                java.lang.Object obj12 = objArr9[i35];
                objArr9[i35] = null;
                ((java.lang.Object[]) obj11)[i34] = obj12;
                return 0;
            case 20:
                java.lang.Object[] objArr10 = this.getApplicationLifeCycleData;
                int i36 = this.getCiacDecline;
                int i37 = i36 - 1;
                java.lang.Object obj13 = objArr10[i37];
                objArr10[i37] = null;
                int i38 = i36 - 2;
                java.lang.Object obj14 = objArr10[i38];
                objArr10[i38] = null;
                objArr10[i37] = obj14;
                objArr10[i38] = obj13;
                this.getCiacDecline = i36 + 1;
                objArr10[i36] = null;
                return 0;
            case 21:
                java.lang.Object[] objArr11 = this.getApplicationLifeCycleData;
                int i39 = this.getCiacDecline;
                int i40 = i39 - 1;
                java.lang.Object obj15 = objArr11[i40];
                objArr11[i40] = null;
                int i41 = i39 - 2;
                java.lang.Object obj16 = objArr11[i41];
                objArr11[i41] = null;
                objArr11[i40] = obj16;
                objArr11[i41] = obj15;
                return 0;
            case 22:
                java.lang.Object[] objArr12 = this.getApplicationLifeCycleData;
                int i42 = this.getCiacDecline;
                this.getCiacDecline = i42 + 1;
                objArr12[i42] = null;
                return 0;
            case 23:
                java.lang.Object[] objArr13 = this.getApplicationLifeCycleData;
                int i43 = this.getCiacDecline;
                objArr13[i43] = null;
                this.getCiacDecline = i43 + 2;
                objArr13[i43 + 1] = null;
                return 0;
            case 24:
                int[] iArr10 = this.getCvrMaskAnd;
                int i44 = this.getCiacDecline;
                iArr10[i44] = 2;
                this.getCiacDecline = i44 + 2;
                iArr10[i44 + 1] = 2;
                return 0;
            case 25:
                int i45 = this.getCiacDecline;
                int i46 = i45 - 1;
                this.getCiacDecline = i46;
                int[] iArr11 = this.getCvrMaskAnd;
                int i47 = i45 - 2;
                iArr11[i47] = iArr11[i47] % iArr11[i46];
                return 0;
            case 27:
                int[] iArr12 = this.getCvrMaskAnd;
                int i48 = this.getCiacDecline;
                iArr12[i48] = 119;
                int i49 = i48 - 1;
                int i50 = iArr12[i49] + 119;
                iArr12[i49] = i50;
                this.getCiacDecline = i48 + 1;
                iArr12[i48] = i50;
            case 26:
                return 0;
            case 28:
                int[] iArr13 = this.getCvrMaskAnd;
                int i51 = this.getCiacDecline;
                this.getCiacDecline = i51 + 1;
                iArr13[i51] = 128;
                return 0;
            case 29:
                int[] iArr14 = this.getCvrMaskAnd;
                int i52 = this.getCiacDecline;
                this.getCiacDecline = i52 + 1;
                iArr14[i52] = 2;
                return 0;
            case 30:
                int i53 = this.getCiacDecline - 1;
                this.getCiacDecline = i53;
                this.values = this.getCvrMaskAnd[i53] != 0 ? 0 : 1;
                return 0;
            case 31:
                int[] iArr15 = this.getCvrMaskAnd;
                int i54 = this.getCiacDecline;
                java.lang.Object[] objArr14 = this.getApplicationLifeCycleData;
                int i55 = i54 - 1;
                java.lang.Object obj17 = objArr14[i55];
                objArr14[i55] = null;
                iArr15[i55] = ((int[]) obj17).length;
                int i56 = i54 - 1;
                this.getCiacDecline = i56;
                objArr14[i56] = null;
                return 0;
            case 32:
                int[] iArr16 = this.getCvrMaskAnd;
                int i57 = this.getCiacDecline;
                this.getCiacDecline = i57 + 1;
                iArr16[i57] = 89;
                return 0;
            case 33:
                int i58 = this.getCiacDecline;
                int i59 = i58 - 1;
                int[] iArr17 = this.getCvrMaskAnd;
                int i60 = i58 - 2;
                int i61 = iArr17[i60] + iArr17[i59];
                iArr17[i60] = i61;
                iArr17[i59] = i61;
                this.getCiacDecline = i58 + 1;
                iArr17[i58] = 128;
                return 0;
            case 34:
                int[] iArr18 = this.getCvrMaskAnd;
                int i62 = this.getCiacDecline;
                iArr18[i62] = 2;
                this.getCiacDecline = i62;
                int i63 = i62 - 1;
                iArr18[i63] = iArr18[i63] % 2;
                return 0;
            case 35:
                int[] iArr19 = this.getCvrMaskAnd;
                int i64 = this.getCiacDecline - 1;
                this.getCiacDecline = i64;
                this.values = iArr19[i64];
                return 0;
            case 36:
                int[] iArr20 = this.getCvrMaskAnd;
                int i65 = this.getCiacDecline;
                this.getCiacDecline = i65 + 1;
                iArr20[i65] = 92;
                return 0;
            case 37:
                int[] iArr21 = this.getCvrMaskAnd;
                int i66 = this.getCiacDecline;
                this.getCiacDecline = i66 + 1;
                iArr21[i66] = 29;
                return 0;
            case 38:
                for (int i67 = this.getCiacDecline - 1; i67 >= 0; i67--) {
                    this.getApplicationLifeCycleData[i67] = null;
                }
                java.lang.Object[] objArr15 = this.getApplicationLifeCycleData;
                this.getCiacDecline = 1;
                objArr15[0] = this.SdkCoreAlternateContactlessPaymentDataImpl;
                return 0;
            default:
                return i;
        }
    }

    public getDsrpMdSessionKey(long j, long j2) {
        long[] jArr = new long[11];
        this.SdkCoreBusinessLogicModuleImpl = jArr;
        jArr[7] = j;
        jArr[9] = j2;
        this.getCiacDecline = 0;
        this.getGpoResponse = -1;
    }
}

package com.payair.hce;

/* loaded from: classes10.dex */
public class setOverflowIcon {
    public int AlternateContactlessPaymentDataJson;
    public int DigitizedCardProfile;
    public java.lang.Object IccPrivateKeyCrtComponentsJson;
    public double RecordsJson;
    public java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl;
    private final long[] SdkCoreBusinessLogicModuleImpl;
    public double getAid;
    private int getCiacDecline;
    private int getCvrMaskAnd;
    public float getProfileVersion;
    public float valueOf;
    public long values;
    public long writeReplace;
    private final int[] getGpoResponse = new int[11];
    private final float[] getPaymentFci = new float[11];
    private final double[] getDualTapResetTimeout = new double[11];
    private final java.lang.Object[] getCvmResetTimeout = new java.lang.Object[11];

    public int AlternateContactlessPaymentDataJson(int i) {
        switch (i) {
            case 1:
                java.lang.Object[] objArr = this.getCvmResetTimeout;
                int i2 = this.getCiacDecline;
                this.getCiacDecline = i2 + 1;
                objArr[i2] = this.SdkCoreAlternateContactlessPaymentDataImpl;
                return 0;
            case 2:
                int[] iArr = this.getGpoResponse;
                int i3 = this.getCiacDecline;
                this.getCiacDecline = i3 + 1;
                iArr[i3] = this.DigitizedCardProfile;
                return 0;
            case 3:
                int[] iArr2 = this.getGpoResponse;
                int i4 = this.getCiacDecline;
                this.getCiacDecline = i4 + 1;
                iArr2[i4] = 16;
                return 0;
            case 4:
                int i5 = this.getCiacDecline;
                int i6 = i5 - 1;
                this.getCiacDecline = i6;
                int[] iArr3 = this.getGpoResponse;
                int i7 = i5 - 2;
                iArr3[i7] = iArr3[i7] >> iArr3[i6];
                return 0;
            case 5:
                int i8 = this.getCiacDecline;
                int i9 = i8 - 1;
                this.getCiacDecline = i9;
                int[] iArr4 = this.getGpoResponse;
                int i10 = i8 - 2;
                iArr4[i10] = iArr4[i10] + iArr4[i9];
                return 0;
            case 6:
                int i11 = this.getCiacDecline - this.DigitizedCardProfile;
                this.getCiacDecline = i11;
                this.getCvrMaskAnd = i11;
                return 0;
            case 7:
                java.lang.Object[] objArr2 = this.getCvmResetTimeout;
                int i12 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i12 + 1;
                java.lang.Object obj = objArr2[i12];
                objArr2[i12] = null;
                this.IccPrivateKeyCrtComponentsJson = obj;
                return 0;
            case 8:
                int[] iArr5 = this.getGpoResponse;
                int i13 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i13 + 1;
                this.AlternateContactlessPaymentDataJson = iArr5[i13];
                return 0;
            case 9:
                java.lang.Object[] objArr3 = this.getCvmResetTimeout;
                int i14 = this.getCiacDecline;
                this.getCiacDecline = i14 + 1;
                objArr3[i14] = objArr3[i14 - 1];
                return 0;
            case 10:
                int i15 = this.getCiacDecline - 1;
                this.getCiacDecline = i15;
                java.lang.Object[] objArr4 = this.getCvmResetTimeout;
                java.lang.Object obj2 = objArr4[i15];
                objArr4[i15] = null;
                this.AlternateContactlessPaymentDataJson = obj2 == null ? 0 : 1;
                return 0;
            case 11:
                java.lang.Object[] objArr5 = this.getCvmResetTimeout;
                int i16 = this.getCiacDecline;
                int i17 = i16 - 1;
                java.lang.Object obj3 = objArr5[i17];
                objArr5[i17] = null;
                int i18 = i16 - 2;
                java.lang.Object obj4 = objArr5[i18];
                objArr5[i18] = null;
                objArr5[i17] = obj4;
                objArr5[i18] = obj3;
                int i19 = i16 - 1;
                this.getCiacDecline = i19;
                objArr5[i19] = null;
                return 0;
            case 12:
                java.lang.Object[] objArr6 = this.getCvmResetTimeout;
                int i20 = this.getCiacDecline - 1;
                java.lang.Object obj5 = objArr6[i20];
                objArr6[i20] = null;
                this.IccPrivateKeyCrtComponentsJson = obj5;
                return 0;
            case 13:
                int i21 = this.getCiacDecline - 1;
                this.getCiacDecline = i21;
                this.getCvmResetTimeout[i21] = null;
                return 0;
            case 14:
                int[] iArr6 = this.getGpoResponse;
                int i22 = this.getCiacDecline;
                this.getCiacDecline = i22 + 1;
                iArr6[i22] = 1;
                return 0;
            case 15:
                java.lang.Object[] objArr7 = this.getCvmResetTimeout;
                int i23 = this.getCiacDecline;
                int i24 = i23 - 1;
                java.lang.Object obj6 = objArr7[i24];
                objArr7[i24] = null;
                objArr7[i23] = obj6;
                int i25 = i23 - 2;
                java.lang.Object obj7 = objArr7[i25];
                objArr7[i25] = null;
                objArr7[i24] = obj7;
                objArr7[i25] = obj6;
                java.lang.Object obj8 = objArr7[i23];
                objArr7[i23] = null;
                java.lang.Object obj9 = objArr7[i24];
                objArr7[i24] = null;
                objArr7[i23] = obj9;
                objArr7[i24] = obj8;
                int[] iArr7 = this.getGpoResponse;
                this.getCiacDecline = i23 + 2;
                iArr7[i23 + 1] = 0;
                return 0;
            case 16:
                java.lang.Object[] objArr8 = this.getCvmResetTimeout;
                int i26 = this.getCiacDecline;
                int i27 = i26 - 2;
                java.lang.Object obj10 = objArr8[i27];
                objArr8[i27] = null;
                int i28 = i26 - 1;
                objArr8[i28] = obj10;
                int[] iArr8 = this.getGpoResponse;
                int i29 = iArr8[i28];
                iArr8[i27] = i29;
                int i30 = i26 - 3;
                this.getCiacDecline = i30;
                java.lang.Object obj11 = objArr8[i30];
                objArr8[i30] = null;
                java.lang.Object obj12 = objArr8[i28];
                objArr8[i28] = null;
                ((java.lang.Object[]) obj11)[i29] = obj12;
                return 0;
            case 17:
                java.lang.Object[] objArr9 = this.getCvmResetTimeout;
                int i31 = this.getCiacDecline;
                objArr9[i31] = objArr9[i31 - 1];
                int[] iArr9 = this.getGpoResponse;
                this.getCiacDecline = i31 + 2;
                iArr9[i31 + 1] = 0;
                return 0;
            case 18:
                int i32 = this.getCiacDecline;
                int i33 = i32 - 3;
                this.getCiacDecline = i33;
                java.lang.Object[] objArr10 = this.getCvmResetTimeout;
                java.lang.Object obj13 = objArr10[i33];
                objArr10[i33] = null;
                int i34 = this.getGpoResponse[i32 - 2];
                int i35 = i32 - 1;
                java.lang.Object obj14 = objArr10[i35];
                objArr10[i35] = null;
                ((java.lang.Object[]) obj13)[i34] = obj14;
                return 0;
            case 19:
                java.lang.Object[] objArr11 = this.getCvmResetTimeout;
                int i36 = this.getCiacDecline;
                int i37 = i36 - 1;
                java.lang.Object obj15 = objArr11[i37];
                objArr11[i37] = null;
                int i38 = i36 - 2;
                java.lang.Object obj16 = objArr11[i38];
                objArr11[i38] = null;
                objArr11[i37] = obj16;
                objArr11[i38] = obj15;
                return 0;
            case 20:
                java.lang.Object[] objArr12 = this.getCvmResetTimeout;
                int i39 = this.getCiacDecline;
                this.getCiacDecline = i39 + 1;
                objArr12[i39] = null;
                return 0;
            case 21:
                int[] iArr10 = this.getGpoResponse;
                int i40 = this.getCiacDecline;
                this.getCiacDecline = i40 + 1;
                iArr10[i40] = 2;
                return 0;
            case 22:
                int i41 = this.getCiacDecline;
                int i42 = i41 - 1;
                this.getCiacDecline = i42;
                int[] iArr11 = this.getGpoResponse;
                int i43 = i41 - 2;
                iArr11[i43] = iArr11[i43] % iArr11[i42];
                return 0;
            case 23:
                int[] iArr12 = this.getGpoResponse;
                int i44 = this.getCiacDecline;
                iArr12[i44] = 2;
                this.getCiacDecline = i44 + 2;
                iArr12[i44 + 1] = 2;
                return 0;
            case 24:
                int i45 = this.getCiacDecline;
                int i46 = i45 - 1;
                this.getCiacDecline = i46;
                int[] iArr13 = this.getGpoResponse;
                int i47 = i45 - 2;
                iArr13[i47] = iArr13[i47] % iArr13[i46];
                int i48 = i45 - 2;
                this.getCiacDecline = i48;
                this.getCvmResetTimeout[i48] = null;
                return 0;
            case 25:
                int[] iArr14 = this.getGpoResponse;
                int i49 = this.getCiacDecline;
                iArr14[i49] = 65;
                this.getCiacDecline = i49;
                int i50 = i49 - 1;
                iArr14[i50] = iArr14[i50] + 65;
                return 0;
            case 26:
                int[] iArr15 = this.getGpoResponse;
                int i51 = this.getCiacDecline;
                this.getCiacDecline = i51 + 1;
                iArr15[i51] = iArr15[i51 - 1];
                return 0;
            case 27:
                int[] iArr16 = this.getGpoResponse;
                int i52 = this.getCiacDecline;
                iArr16[i52] = 128;
                this.getCiacDecline = i52;
                int i53 = i52 - 1;
                iArr16[i53] = iArr16[i53] % 128;
                return 0;
            case 28:
                int i54 = this.getCiacDecline - 1;
                this.getCiacDecline = i54;
                this.AlternateContactlessPaymentDataJson = this.getGpoResponse[i54] == 0 ? 0 : 1;
                return 0;
            case 29:
                int[] iArr17 = this.getGpoResponse;
                int i55 = this.getCiacDecline;
                iArr17[i55] = 2;
                this.getCiacDecline = i55;
                int i56 = i55 - 1;
                iArr17[i56] = iArr17[i56] % 2;
                return 0;
            case 30:
                int[] iArr18 = this.getGpoResponse;
                int i57 = this.getCiacDecline;
                this.getCiacDecline = i57 + 1;
                iArr18[i57] = 1;
                return 0;
            case 31:
                int i58 = this.getCiacDecline;
                int i59 = i58 - 1;
                int[] iArr19 = this.getGpoResponse;
                int i60 = i58 - 2;
                int i61 = iArr19[i60] + iArr19[i59];
                iArr19[i60] = i61;
                this.getCiacDecline = i58;
                iArr19[i59] = i61;
                return 0;
            case 32:
                int[] iArr20 = this.getGpoResponse;
                int i62 = this.getCiacDecline;
                this.getCiacDecline = i62 + 1;
                iArr20[i62] = 128;
                return 0;
            case 33:
                for (int i63 = this.getCiacDecline - 1; i63 >= 0; i63--) {
                    this.getCvmResetTimeout[i63] = null;
                }
                java.lang.Object[] objArr13 = this.getCvmResetTimeout;
                this.getCiacDecline = 1;
                objArr13[0] = this.SdkCoreAlternateContactlessPaymentDataImpl;
                return 0;
            default:
                return i;
        }
    }

    public setOverflowIcon(long j, long j2) {
        long[] jArr = new long[11];
        this.SdkCoreBusinessLogicModuleImpl = jArr;
        jArr[7] = j;
        jArr[9] = j2;
        this.getCiacDecline = 0;
        this.getCvrMaskAnd = -1;
    }
}

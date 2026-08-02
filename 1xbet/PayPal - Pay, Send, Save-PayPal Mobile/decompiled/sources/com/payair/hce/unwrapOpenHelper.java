package com.payair.hce;

/* loaded from: classes10.dex */
public class unwrapOpenHelper {
    public int AlternateContactlessPaymentDataJson;
    public int DigitizedCardProfile;
    public float IccPrivateKeyCrtComponentsJson;
    public double RecordsJson;
    public double SdkCoreAlternateContactlessPaymentDataImpl;
    private final long[] SdkCoreBusinessLogicModuleImpl;
    public java.lang.Object getAid;
    private int getCiacDecline;
    private int getPaymentFci;
    public java.lang.Object getProfileVersion;
    public long valueOf;
    public float values;
    public long writeReplace;
    private final int[] getGpoResponse = new int[11];
    private final float[] getCvrMaskAnd = new float[11];
    private final double[] getSecurityWord = new double[11];
    private final java.lang.Object[] getApplicationLifeCycleData = new java.lang.Object[11];

    public int values(int i) {
        switch (i) {
            case 1:
                java.lang.Object[] objArr = this.getApplicationLifeCycleData;
                int i2 = this.getCiacDecline;
                this.getCiacDecline = i2 + 1;
                objArr[i2] = this.getProfileVersion;
                return 0;
            case 2:
                int[] iArr = this.getGpoResponse;
                int i3 = this.getCiacDecline;
                this.getCiacDecline = i3 + 1;
                iArr[i3] = 1;
                return 0;
            case 3:
                int[] iArr2 = this.getGpoResponse;
                int i4 = this.getCiacDecline;
                this.getCiacDecline = i4 + 1;
                iArr2[i4] = 118;
                return 0;
            case 4:
                int i5 = this.getCiacDecline - this.DigitizedCardProfile;
                this.getCiacDecline = i5;
                this.getPaymentFci = i5;
                return 0;
            case 5:
                long[] jArr = this.SdkCoreBusinessLogicModuleImpl;
                int i6 = this.getPaymentFci;
                this.getPaymentFci = i6 + 1;
                this.valueOf = jArr[i6];
                return 0;
            case 6:
                int[] iArr3 = this.getGpoResponse;
                int i7 = this.getCiacDecline;
                this.getCiacDecline = i7 + 1;
                iArr3[i7] = this.DigitizedCardProfile;
                return 0;
            case 7:
                long[] jArr2 = this.SdkCoreBusinessLogicModuleImpl;
                int i8 = this.getCiacDecline;
                this.getCiacDecline = i8 + 1;
                jArr2[i8] = 0;
                return 0;
            case 8:
                int i9 = this.getCiacDecline;
                int i10 = i9 - 1;
                this.getCiacDecline = i10;
                int[] iArr4 = this.getGpoResponse;
                int i11 = i9 - 2;
                iArr4[i11] = iArr4[i11] - iArr4[i10];
                return 0;
            case 9:
                float[] fArr = this.getCvrMaskAnd;
                int i12 = this.getCiacDecline;
                this.getCiacDecline = i12 + 1;
                fArr[i12] = this.values;
                return 0;
            case 10:
                float[] fArr2 = this.getCvrMaskAnd;
                int i13 = this.getCiacDecline;
                fArr2[i13] = 0.0f;
                int[] iArr5 = this.getGpoResponse;
                int i14 = i13 - 1;
                iArr5[i14] = (fArr2[i14] > 0.0f ? 1 : (fArr2[i14] == 0.0f ? 0 : -1));
                this.getCiacDecline = i13 + 1;
                iArr5[i13] = 2;
                return 0;
            case 11:
                int[] iArr6 = this.getGpoResponse;
                int i15 = this.getPaymentFci;
                this.getPaymentFci = i15 + 1;
                this.AlternateContactlessPaymentDataJson = iArr6[i15];
                return 0;
            case 12:
                java.lang.Object[] objArr2 = this.getApplicationLifeCycleData;
                int i16 = this.getPaymentFci;
                this.getPaymentFci = i16 + 1;
                java.lang.Object obj = objArr2[i16];
                objArr2[i16] = null;
                this.getAid = obj;
                return 0;
            case 13:
                java.lang.Object[] objArr3 = this.getApplicationLifeCycleData;
                int i17 = this.getCiacDecline;
                this.getCiacDecline = i17 + 1;
                objArr3[i17] = objArr3[i17 - 1];
                return 0;
            case 14:
                int i18 = this.getCiacDecline - 1;
                this.getCiacDecline = i18;
                java.lang.Object[] objArr4 = this.getApplicationLifeCycleData;
                java.lang.Object obj2 = objArr4[i18];
                objArr4[i18] = null;
                this.AlternateContactlessPaymentDataJson = obj2 == null ? 0 : 1;
                return 0;
            case 15:
                java.lang.Object[] objArr5 = this.getApplicationLifeCycleData;
                int i19 = this.getCiacDecline;
                int i20 = i19 - 1;
                java.lang.Object obj3 = objArr5[i20];
                objArr5[i20] = null;
                int i21 = i19 - 2;
                java.lang.Object obj4 = objArr5[i21];
                objArr5[i21] = null;
                objArr5[i20] = obj4;
                objArr5[i21] = obj3;
                int i22 = i19 - 1;
                this.getCiacDecline = i22;
                objArr5[i22] = null;
                return 0;
            case 16:
                java.lang.Object[] objArr6 = this.getApplicationLifeCycleData;
                int i23 = this.getCiacDecline - 1;
                java.lang.Object obj5 = objArr6[i23];
                objArr6[i23] = null;
                this.getAid = obj5;
                return 0;
            case 17:
                int i24 = this.getCiacDecline - 1;
                this.getCiacDecline = i24;
                this.getApplicationLifeCycleData[i24] = null;
                return 0;
            case 18:
                java.lang.Object[] objArr7 = this.getApplicationLifeCycleData;
                int i25 = this.getCiacDecline;
                this.getCiacDecline = i25 + 1;
                int i26 = i25 - 1;
                java.lang.Object obj6 = objArr7[i26];
                objArr7[i26] = null;
                objArr7[i25] = obj6;
                int i27 = i25 - 2;
                java.lang.Object obj7 = objArr7[i27];
                objArr7[i27] = null;
                objArr7[i26] = obj7;
                objArr7[i27] = obj6;
                return 0;
            case 19:
                java.lang.Object[] objArr8 = this.getApplicationLifeCycleData;
                int i28 = this.getCiacDecline;
                int i29 = i28 - 1;
                java.lang.Object obj8 = objArr8[i29];
                objArr8[i29] = null;
                int i30 = i28 - 2;
                java.lang.Object obj9 = objArr8[i30];
                objArr8[i30] = null;
                objArr8[i29] = obj9;
                objArr8[i30] = obj8;
                return 0;
            case 20:
                int[] iArr7 = this.getGpoResponse;
                int i31 = this.getCiacDecline;
                iArr7[i31] = 0;
                java.lang.Object[] objArr9 = this.getApplicationLifeCycleData;
                int i32 = i31 - 1;
                java.lang.Object obj10 = objArr9[i32];
                objArr9[i32] = null;
                objArr9[i31] = obj10;
                iArr7[i32] = 0;
                int i33 = i31 - 2;
                this.getCiacDecline = i33;
                java.lang.Object obj11 = objArr9[i33];
                objArr9[i33] = null;
                java.lang.Object obj12 = objArr9[i31];
                objArr9[i31] = null;
                ((java.lang.Object[]) obj11)[0] = obj12;
                return 0;
            case 21:
                java.lang.Object[] objArr10 = this.getApplicationLifeCycleData;
                int i34 = this.getCiacDecline;
                objArr10[i34] = objArr10[i34 - 1];
                int[] iArr8 = this.getGpoResponse;
                this.getCiacDecline = i34 + 2;
                iArr8[i34 + 1] = 0;
                return 0;
            case 22:
                int i35 = this.getCiacDecline;
                int i36 = i35 - 3;
                this.getCiacDecline = i36;
                java.lang.Object[] objArr11 = this.getApplicationLifeCycleData;
                java.lang.Object obj13 = objArr11[i36];
                objArr11[i36] = null;
                int i37 = this.getGpoResponse[i35 - 2];
                int i38 = i35 - 1;
                java.lang.Object obj14 = objArr11[i38];
                objArr11[i38] = null;
                ((java.lang.Object[]) obj13)[i37] = obj14;
                return 0;
            case 23:
                java.lang.Object[] objArr12 = this.getApplicationLifeCycleData;
                int i39 = this.getCiacDecline;
                int i40 = i39 - 1;
                java.lang.Object obj15 = objArr12[i40];
                objArr12[i40] = null;
                int i41 = i39 - 2;
                java.lang.Object obj16 = objArr12[i41];
                objArr12[i41] = null;
                objArr12[i40] = obj16;
                objArr12[i41] = obj15;
                this.getCiacDecline = i39 + 1;
                objArr12[i39] = null;
                objArr12[i39] = null;
                java.lang.Object obj17 = objArr12[i40];
                objArr12[i40] = null;
                objArr12[i39] = obj17;
                objArr12[i40] = null;
                return 0;
            case 24:
                java.lang.Object[] objArr13 = this.getApplicationLifeCycleData;
                int i42 = this.getCiacDecline;
                this.getCiacDecline = i42 + 1;
                objArr13[i42] = null;
                return 0;
            case 25:
                java.lang.Object[] objArr14 = this.getApplicationLifeCycleData;
                int i43 = this.getCiacDecline;
                objArr14[i43] = null;
                this.getCiacDecline = i43 + 2;
                objArr14[i43 + 1] = null;
                return 0;
            case 26:
                int[] iArr9 = this.getGpoResponse;
                int i44 = this.getCiacDecline;
                this.getCiacDecline = i44 + 1;
                iArr9[i44] = 2;
                return 0;
            case 27:
                int i45 = this.getCiacDecline;
                int i46 = i45 - 1;
                this.getCiacDecline = i46;
                int[] iArr10 = this.getGpoResponse;
                int i47 = i45 - 2;
                iArr10[i47] = iArr10[i47] % iArr10[i46];
                return 0;
            case 28:
                int[] iArr11 = this.getGpoResponse;
                int i48 = this.getCiacDecline;
                iArr11[i48] = 2;
                this.getCiacDecline = i48;
                int i49 = i48 - 1;
                iArr11[i49] = iArr11[i49] % 2;
                int i50 = i48 - 1;
                this.getCiacDecline = i50;
                this.getApplicationLifeCycleData[i50] = null;
                return 0;
            case 30:
                int[] iArr12 = this.getGpoResponse;
                int i51 = this.getCiacDecline;
                iArr12[i51] = 9;
                this.getCiacDecline = i51;
                int i52 = i51 - 1;
                iArr12[i52] = iArr12[i52] + 9;
            case 29:
                return 0;
            case 31:
                int[] iArr13 = this.getGpoResponse;
                int i53 = this.getCiacDecline;
                this.getCiacDecline = i53 + 1;
                iArr13[i53] = iArr13[i53 - 1];
                return 0;
            case 32:
                int[] iArr14 = this.getGpoResponse;
                int i54 = this.getCiacDecline;
                iArr14[i54] = 128;
                this.getCiacDecline = i54;
                int i55 = i54 - 1;
                iArr14[i55] = iArr14[i55] % 128;
                return 0;
            case 33:
                int i56 = this.getCiacDecline - 1;
                this.getCiacDecline = i56;
                this.AlternateContactlessPaymentDataJson = this.getGpoResponse[i56] != 0 ? 0 : 1;
                return 0;
            case 34:
                int[] iArr15 = this.getGpoResponse;
                int i57 = this.getCiacDecline;
                iArr15[i57] = 75;
                int i58 = i57 - 1;
                int i59 = iArr15[i58] + 75;
                iArr15[i58] = i59;
                this.getCiacDecline = i57 + 1;
                iArr15[i57] = i59;
                return 0;
            case 35:
                int[] iArr16 = this.getGpoResponse;
                int i60 = this.getCiacDecline;
                this.getCiacDecline = i60 + 1;
                iArr16[i60] = 128;
                return 0;
            case 36:
                int[] iArr17 = this.getGpoResponse;
                int i61 = this.getCiacDecline;
                iArr17[i61] = 2;
                this.getCiacDecline = i61;
                int i62 = i61 - 1;
                iArr17[i62] = iArr17[i62] % 2;
                return 0;
            case 37:
                for (int i63 = this.getCiacDecline - 1; i63 >= 0; i63--) {
                    this.getApplicationLifeCycleData[i63] = null;
                }
                java.lang.Object[] objArr15 = this.getApplicationLifeCycleData;
                this.getCiacDecline = 1;
                objArr15[0] = this.getProfileVersion;
                return 0;
            default:
                return i;
        }
    }

    public unwrapOpenHelper(long j, long j2) {
        long[] jArr = new long[11];
        this.SdkCoreBusinessLogicModuleImpl = jArr;
        jArr[7] = j;
        jArr[9] = j2;
        this.getCiacDecline = 0;
        this.getPaymentFci = -1;
    }
}

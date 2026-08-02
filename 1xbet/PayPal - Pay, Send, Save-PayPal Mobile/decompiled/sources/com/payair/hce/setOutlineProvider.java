package com.payair.hce;

/* loaded from: classes10.dex */
public class setOutlineProvider {
    public int AlternateContactlessPaymentDataJson;
    public long DigitizedCardProfile;
    public java.lang.Object IccPrivateKeyCrtComponentsJson;
    public float RecordsJson;
    public java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl;
    private int SdkCoreBusinessLogicModuleImpl;
    public double getAid;
    private int getCiacDecline;
    private final long[] getGpoResponse;
    public double getProfileVersion;
    public long valueOf;
    public float values;
    public int writeReplace;
    private final int[] getPaymentFci = new int[11];
    private final float[] getCvrMaskAnd = new float[11];
    private final double[] getCardLayoutDescription = new double[11];
    private final java.lang.Object[] getCvmResetTimeout = new java.lang.Object[11];

    public int values(int i) {
        switch (i) {
            case 1:
                int[] iArr = this.getPaymentFci;
                int i2 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i2 + 1;
                iArr[i2] = this.AlternateContactlessPaymentDataJson;
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
                this.getCiacDecline = i4;
                return 0;
            case 4:
                java.lang.Object[] objArr2 = this.getCvmResetTimeout;
                int i5 = this.getCiacDecline;
                this.getCiacDecline = i5 + 1;
                java.lang.Object obj = objArr2[i5];
                objArr2[i5] = null;
                this.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                return 0;
            case 5:
                int i6 = this.SdkCoreBusinessLogicModuleImpl;
                int i7 = i6 - 1;
                this.SdkCoreBusinessLogicModuleImpl = i7;
                int[] iArr2 = this.getPaymentFci;
                int i8 = i6 - 2;
                iArr2[i8] = iArr2[i8] - iArr2[i7];
                return 0;
            case 6:
                long[] jArr = this.getGpoResponse;
                int i9 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i9 + 1;
                jArr[i9] = 0;
                return 0;
            case 7:
                long[] jArr2 = this.getGpoResponse;
                int i10 = this.getCiacDecline;
                this.getCiacDecline = i10 + 1;
                this.DigitizedCardProfile = jArr2[i10];
                return 0;
            case 8:
                long[] jArr3 = this.getGpoResponse;
                int i11 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i11 + 1;
                jArr3[i11] = this.valueOf;
                return 0;
            case 9:
                int i12 = this.SdkCoreBusinessLogicModuleImpl;
                int i13 = i12 - 1;
                int[] iArr3 = this.getPaymentFci;
                int i14 = i12 - 2;
                iArr3[i14] = iArr3[i14] + iArr3[i13];
                this.SdkCoreBusinessLogicModuleImpl = i12;
                iArr3[i13] = -80;
                return 0;
            case 10:
                int i15 = this.SdkCoreBusinessLogicModuleImpl;
                int i16 = i15 - 1;
                this.SdkCoreBusinessLogicModuleImpl = i16;
                int[] iArr4 = this.getPaymentFci;
                long[] jArr4 = this.getGpoResponse;
                int i17 = i15 - 2;
                iArr4[i17] = (jArr4[i17] > jArr4[i16] ? 1 : (jArr4[i17] == jArr4[i16] ? 0 : -1));
                return 0;
            case 11:
                int[] iArr5 = this.getPaymentFci;
                int i18 = this.SdkCoreBusinessLogicModuleImpl - 1;
                iArr5[i18] = (byte) iArr5[i18];
                return 0;
            case 12:
                int[] iArr6 = this.getPaymentFci;
                int i19 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i19 + 1;
                iArr6[i19] = 0;
                return 0;
            case 13:
                int[] iArr7 = this.getPaymentFci;
                int i20 = this.getCiacDecline;
                this.getCiacDecline = i20 + 1;
                this.writeReplace = iArr7[i20];
                return 0;
            case 14:
                int[] iArr8 = this.getPaymentFci;
                int i21 = this.SdkCoreBusinessLogicModuleImpl - 1;
                iArr8[i21] = (short) iArr8[i21];
                return 0;
            case 15:
                java.lang.Object[] objArr3 = this.getCvmResetTimeout;
                int i22 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i22 + 1;
                objArr3[i22] = objArr3[i22 - 1];
                return 0;
            case 16:
                int i23 = this.SdkCoreBusinessLogicModuleImpl - 1;
                this.SdkCoreBusinessLogicModuleImpl = i23;
                java.lang.Object[] objArr4 = this.getCvmResetTimeout;
                java.lang.Object obj2 = objArr4[i23];
                objArr4[i23] = null;
                this.writeReplace = obj2 == null ? 0 : 1;
                return 0;
            case 17:
                java.lang.Object[] objArr5 = this.getCvmResetTimeout;
                int i24 = this.SdkCoreBusinessLogicModuleImpl;
                int i25 = i24 - 1;
                java.lang.Object obj3 = objArr5[i25];
                objArr5[i25] = null;
                int i26 = i24 - 2;
                java.lang.Object obj4 = objArr5[i26];
                objArr5[i26] = null;
                objArr5[i25] = obj4;
                objArr5[i26] = obj3;
                int i27 = i24 - 1;
                this.SdkCoreBusinessLogicModuleImpl = i27;
                objArr5[i27] = null;
                return 0;
            case 18:
                java.lang.Object[] objArr6 = this.getCvmResetTimeout;
                int i28 = this.SdkCoreBusinessLogicModuleImpl - 1;
                java.lang.Object obj5 = objArr6[i28];
                objArr6[i28] = null;
                this.SdkCoreAlternateContactlessPaymentDataImpl = obj5;
                return 0;
            case 19:
                int i29 = this.SdkCoreBusinessLogicModuleImpl - 1;
                this.SdkCoreBusinessLogicModuleImpl = i29;
                this.getCvmResetTimeout[i29] = null;
                return 0;
            case 20:
                int[] iArr9 = this.getPaymentFci;
                int i30 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i30 + 1;
                iArr9[i30] = 1;
                return 0;
            case 21:
                java.lang.Object[] objArr7 = this.getCvmResetTimeout;
                int i31 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i31 + 1;
                int i32 = i31 - 1;
                java.lang.Object obj6 = objArr7[i32];
                objArr7[i32] = null;
                objArr7[i31] = obj6;
                int i33 = i31 - 2;
                java.lang.Object obj7 = objArr7[i33];
                objArr7[i33] = null;
                objArr7[i32] = obj7;
                objArr7[i33] = obj6;
                return 0;
            case 22:
                java.lang.Object[] objArr8 = this.getCvmResetTimeout;
                int i34 = this.SdkCoreBusinessLogicModuleImpl;
                int i35 = i34 - 1;
                java.lang.Object obj8 = objArr8[i35];
                objArr8[i35] = null;
                int i36 = i34 - 2;
                java.lang.Object obj9 = objArr8[i36];
                objArr8[i36] = null;
                objArr8[i35] = obj9;
                objArr8[i36] = obj8;
                int[] iArr10 = this.getPaymentFci;
                this.SdkCoreBusinessLogicModuleImpl = i34 + 1;
                iArr10[i34] = 0;
                java.lang.Object obj10 = objArr8[i35];
                objArr8[i35] = null;
                objArr8[i34] = obj10;
                iArr10[i35] = 0;
                return 0;
            case 23:
                int i37 = this.SdkCoreBusinessLogicModuleImpl;
                int i38 = i37 - 3;
                this.SdkCoreBusinessLogicModuleImpl = i38;
                java.lang.Object[] objArr9 = this.getCvmResetTimeout;
                java.lang.Object obj11 = objArr9[i38];
                objArr9[i38] = null;
                int i39 = this.getPaymentFci[i37 - 2];
                int i40 = i37 - 1;
                java.lang.Object obj12 = objArr9[i40];
                objArr9[i40] = null;
                ((java.lang.Object[]) obj11)[i39] = obj12;
                return 0;
            case 24:
                java.lang.Object[] objArr10 = this.getCvmResetTimeout;
                int i41 = this.SdkCoreBusinessLogicModuleImpl;
                int i42 = i41 - 1;
                java.lang.Object obj13 = objArr10[i42];
                objArr10[i42] = null;
                int i43 = i41 - 2;
                java.lang.Object obj14 = objArr10[i43];
                objArr10[i43] = null;
                objArr10[i42] = obj14;
                objArr10[i43] = obj13;
                return 0;
            case 25:
                java.lang.Object[] objArr11 = this.getCvmResetTimeout;
                int i44 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i44 + 1;
                objArr11[i44] = null;
                objArr11[i44] = null;
                int i45 = i44 - 1;
                java.lang.Object obj15 = objArr11[i45];
                objArr11[i45] = null;
                objArr11[i44] = obj15;
                objArr11[i45] = null;
                return 0;
            case 26:
                java.lang.Object[] objArr12 = this.getCvmResetTimeout;
                int i46 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i46 + 1;
                objArr12[i46] = null;
                return 0;
            case 27:
                java.lang.Object[] objArr13 = this.getCvmResetTimeout;
                int i47 = this.SdkCoreBusinessLogicModuleImpl;
                objArr13[i47] = null;
                this.SdkCoreBusinessLogicModuleImpl = i47 + 2;
                objArr13[i47 + 1] = null;
                return 0;
            case 28:
                int[] iArr11 = this.getPaymentFci;
                int i48 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i48 + 1;
                iArr11[i48] = 2;
                return 0;
            case 29:
                int i49 = this.SdkCoreBusinessLogicModuleImpl;
                int i50 = i49 - 1;
                this.SdkCoreBusinessLogicModuleImpl = i50;
                int[] iArr12 = this.getPaymentFci;
                int i51 = i49 - 2;
                iArr12[i51] = iArr12[i51] % iArr12[i50];
                int i52 = i49 - 2;
                this.SdkCoreBusinessLogicModuleImpl = i52;
                this.getCvmResetTimeout[i52] = null;
                return 0;
            case 31:
                int[] iArr13 = this.getPaymentFci;
                int i53 = this.SdkCoreBusinessLogicModuleImpl;
                iArr13[i53] = 79;
                this.SdkCoreBusinessLogicModuleImpl = i53;
                int i54 = i53 - 1;
                iArr13[i54] = iArr13[i54] + 79;
            case 30:
                return 0;
            case 32:
                int[] iArr14 = this.getPaymentFci;
                int i55 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i55 + 1;
                iArr14[i55] = iArr14[i55 - 1];
                return 0;
            case 33:
                int[] iArr15 = this.getPaymentFci;
                int i56 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i56 + 1;
                iArr15[i56] = 128;
                return 0;
            case 34:
                int i57 = this.SdkCoreBusinessLogicModuleImpl;
                int i58 = i57 - 1;
                this.SdkCoreBusinessLogicModuleImpl = i58;
                int[] iArr16 = this.getPaymentFci;
                int i59 = i57 - 2;
                iArr16[i59] = iArr16[i59] % iArr16[i58];
                return 0;
            case 35:
                int i60 = this.SdkCoreBusinessLogicModuleImpl - 1;
                this.SdkCoreBusinessLogicModuleImpl = i60;
                this.writeReplace = this.getPaymentFci[i60] == 0 ? 0 : 1;
                return 0;
            case 36:
                int[] iArr17 = this.getPaymentFci;
                int i61 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i61 + 1;
                iArr17[i61] = 123;
                return 0;
            case 37:
                int i62 = this.SdkCoreBusinessLogicModuleImpl;
                int i63 = i62 - 1;
                this.SdkCoreBusinessLogicModuleImpl = i63;
                int[] iArr18 = this.getPaymentFci;
                int i64 = i62 - 2;
                iArr18[i64] = iArr18[i64] + iArr18[i63];
                return 0;
            case 38:
                int[] iArr19 = this.getPaymentFci;
                int i65 = this.SdkCoreBusinessLogicModuleImpl;
                iArr19[i65] = iArr19[i65 - 1];
                this.SdkCoreBusinessLogicModuleImpl = i65 + 2;
                iArr19[i65 + 1] = 128;
                return 0;
            case 39:
                for (int i66 = this.SdkCoreBusinessLogicModuleImpl - 1; i66 >= 0; i66--) {
                    this.getCvmResetTimeout[i66] = null;
                }
                java.lang.Object[] objArr14 = this.getCvmResetTimeout;
                this.SdkCoreBusinessLogicModuleImpl = 1;
                objArr14[0] = this.IccPrivateKeyCrtComponentsJson;
                return 0;
            default:
                return i;
        }
    }

    public setOutlineProvider(long j, long j2) {
        long[] jArr = new long[11];
        this.getGpoResponse = jArr;
        jArr[7] = j;
        jArr[9] = j2;
        this.SdkCoreBusinessLogicModuleImpl = 0;
        this.getCiacDecline = -1;
    }
}

package com.payair.hce;

/* loaded from: classes10.dex */
public class getObbDirs {
    public long AlternateContactlessPaymentDataJson;
    public float DigitizedCardProfile;
    public double IccPrivateKeyCrtComponentsJson;
    public double RecordsJson;
    public float SdkCoreAlternateContactlessPaymentDataImpl;
    private int SdkCoreBusinessLogicModuleImpl;
    public java.lang.Object getAid;
    private final long[] getCiacDecline;
    private int getPaymentFci;
    public java.lang.Object getProfileVersion;
    public long valueOf;
    public int values;
    public int writeReplace;
    private final int[] getGpoResponse = new int[11];
    private final float[] getCvrMaskAnd = new float[11];
    private final double[] getCvmResetTimeout = new double[11];
    private final java.lang.Object[] getApplicationLifeCycleData = new java.lang.Object[11];

    public int AlternateContactlessPaymentDataJson(int i) {
        switch (i) {
            case 1:
                java.lang.Object[] objArr = this.getApplicationLifeCycleData;
                int i2 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i2 + 1;
                objArr[i2] = this.getAid;
                return 0;
            case 2:
                int[] iArr = this.getGpoResponse;
                int i3 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i3 + 1;
                iArr[i3] = this.values;
                return 0;
            case 3:
                int[] iArr2 = this.getGpoResponse;
                int i4 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i4 + 1;
                iArr2[i4] = 3;
                return 0;
            case 4:
                int[] iArr3 = this.getGpoResponse;
                int i5 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i5 + 1;
                iArr3[i5] = 16;
                return 0;
            case 5:
                int i6 = this.SdkCoreBusinessLogicModuleImpl;
                int i7 = i6 - 1;
                this.SdkCoreBusinessLogicModuleImpl = i7;
                int[] iArr4 = this.getGpoResponse;
                int i8 = i6 - 2;
                iArr4[i8] = iArr4[i8] >> iArr4[i7];
                return 0;
            case 6:
                int i9 = this.SdkCoreBusinessLogicModuleImpl;
                int i10 = i9 - 1;
                this.SdkCoreBusinessLogicModuleImpl = i10;
                int[] iArr5 = this.getGpoResponse;
                int i11 = i9 - 2;
                iArr5[i11] = iArr5[i11] - iArr5[i10];
                return 0;
            case 7:
                int i12 = this.SdkCoreBusinessLogicModuleImpl - this.values;
                this.SdkCoreBusinessLogicModuleImpl = i12;
                this.getPaymentFci = i12;
                return 0;
            case 8:
                java.lang.Object[] objArr2 = this.getApplicationLifeCycleData;
                int i13 = this.getPaymentFci;
                this.getPaymentFci = i13 + 1;
                java.lang.Object obj = objArr2[i13];
                objArr2[i13] = null;
                this.getProfileVersion = obj;
                return 0;
            case 9:
                int[] iArr6 = this.getGpoResponse;
                int i14 = this.getPaymentFci;
                this.getPaymentFci = i14 + 1;
                this.writeReplace = iArr6[i14];
                return 0;
            case 10:
                java.lang.Object[] objArr3 = this.getApplicationLifeCycleData;
                int i15 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i15 + 1;
                objArr3[i15] = objArr3[i15 - 1];
                return 0;
            case 11:
                int i16 = this.SdkCoreBusinessLogicModuleImpl - 1;
                this.SdkCoreBusinessLogicModuleImpl = i16;
                java.lang.Object[] objArr4 = this.getApplicationLifeCycleData;
                java.lang.Object obj2 = objArr4[i16];
                objArr4[i16] = null;
                this.writeReplace = obj2 == null ? 0 : 1;
                return 0;
            case 12:
                java.lang.Object[] objArr5 = this.getApplicationLifeCycleData;
                int i17 = this.SdkCoreBusinessLogicModuleImpl;
                int i18 = i17 - 1;
                java.lang.Object obj3 = objArr5[i18];
                objArr5[i18] = null;
                int i19 = i17 - 2;
                java.lang.Object obj4 = objArr5[i19];
                objArr5[i19] = null;
                objArr5[i18] = obj4;
                objArr5[i19] = obj3;
                return 0;
            case 13:
                int i20 = this.SdkCoreBusinessLogicModuleImpl - 1;
                this.SdkCoreBusinessLogicModuleImpl = i20;
                this.getApplicationLifeCycleData[i20] = null;
                return 0;
            case 14:
                java.lang.Object[] objArr6 = this.getApplicationLifeCycleData;
                int i21 = this.SdkCoreBusinessLogicModuleImpl - 1;
                java.lang.Object obj5 = objArr6[i21];
                objArr6[i21] = null;
                this.getProfileVersion = obj5;
                return 0;
            case 15:
                int[] iArr7 = this.getGpoResponse;
                int i22 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i22 + 1;
                iArr7[i22] = 1;
                return 0;
            case 16:
                java.lang.Object[] objArr7 = this.getApplicationLifeCycleData;
                int i23 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i23 + 1;
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
                return 0;
            case 17:
                int[] iArr8 = this.getGpoResponse;
                int i26 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i26 + 1;
                iArr8[i26] = 0;
                return 0;
            case 18:
                java.lang.Object[] objArr8 = this.getApplicationLifeCycleData;
                int i27 = this.SdkCoreBusinessLogicModuleImpl;
                int i28 = i27 - 2;
                java.lang.Object obj10 = objArr8[i28];
                objArr8[i28] = null;
                int i29 = i27 - 1;
                objArr8[i29] = obj10;
                int[] iArr9 = this.getGpoResponse;
                int i30 = iArr9[i29];
                iArr9[i28] = i30;
                int i31 = i27 - 3;
                this.SdkCoreBusinessLogicModuleImpl = i31;
                java.lang.Object obj11 = objArr8[i31];
                objArr8[i31] = null;
                java.lang.Object obj12 = objArr8[i29];
                objArr8[i29] = null;
                ((java.lang.Object[]) obj11)[i30] = obj12;
                return 0;
            case 19:
                java.lang.Object[] objArr9 = this.getApplicationLifeCycleData;
                int i32 = this.SdkCoreBusinessLogicModuleImpl;
                objArr9[i32] = objArr9[i32 - 1];
                int[] iArr10 = this.getGpoResponse;
                this.SdkCoreBusinessLogicModuleImpl = i32 + 2;
                iArr10[i32 + 1] = 0;
                return 0;
            case 20:
                int i33 = this.SdkCoreBusinessLogicModuleImpl;
                int i34 = i33 - 3;
                this.SdkCoreBusinessLogicModuleImpl = i34;
                java.lang.Object[] objArr10 = this.getApplicationLifeCycleData;
                java.lang.Object obj13 = objArr10[i34];
                objArr10[i34] = null;
                int i35 = this.getGpoResponse[i33 - 2];
                int i36 = i33 - 1;
                java.lang.Object obj14 = objArr10[i36];
                objArr10[i36] = null;
                ((java.lang.Object[]) obj13)[i35] = obj14;
                return 0;
            case 21:
                java.lang.Object[] objArr11 = this.getApplicationLifeCycleData;
                int i37 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i37 + 1;
                objArr11[i37] = null;
                return 0;
            case 22:
                int[] iArr11 = this.getGpoResponse;
                int i38 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i38 + 1;
                iArr11[i38] = 2;
                return 0;
            case 23:
                int i39 = this.SdkCoreBusinessLogicModuleImpl;
                int i40 = i39 - 1;
                this.SdkCoreBusinessLogicModuleImpl = i40;
                int[] iArr12 = this.getGpoResponse;
                int i41 = i39 - 2;
                iArr12[i41] = iArr12[i41] % iArr12[i40];
                return 0;
            case 24:
                int[] iArr13 = this.getGpoResponse;
                int i42 = this.SdkCoreBusinessLogicModuleImpl;
                iArr13[i42] = 2;
                this.SdkCoreBusinessLogicModuleImpl = i42;
                int i43 = i42 - 1;
                iArr13[i43] = iArr13[i43] % 2;
                return 0;
            case 26:
                int[] iArr14 = this.getGpoResponse;
                int i44 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i44 + 1;
                iArr14[i44] = 37;
            case 25:
                return 0;
            case 27:
                int i45 = this.SdkCoreBusinessLogicModuleImpl;
                int i46 = i45 - 1;
                this.SdkCoreBusinessLogicModuleImpl = i46;
                int[] iArr15 = this.getGpoResponse;
                int i47 = i45 - 2;
                iArr15[i47] = iArr15[i47] + iArr15[i46];
                return 0;
            case 28:
                int[] iArr16 = this.getGpoResponse;
                int i48 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i48 + 1;
                iArr16[i48] = iArr16[i48 - 1];
                return 0;
            case 29:
                int[] iArr17 = this.getGpoResponse;
                int i49 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i49 + 1;
                iArr17[i49] = 128;
                return 0;
            case 30:
                int i50 = this.SdkCoreBusinessLogicModuleImpl - 1;
                this.SdkCoreBusinessLogicModuleImpl = i50;
                this.writeReplace = this.getGpoResponse[i50] != 0 ? 0 : 1;
                return 0;
            case 31:
                int[] iArr18 = this.getGpoResponse;
                int i51 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i51 + 1;
                iArr18[i51] = 84;
                return 0;
            case 32:
                int i52 = this.SdkCoreBusinessLogicModuleImpl;
                int i53 = i52 - 1;
                this.SdkCoreBusinessLogicModuleImpl = i53;
                int[] iArr19 = this.getGpoResponse;
                int i54 = i52 - 2;
                iArr19[i54] = iArr19[i54] * iArr19[i53];
                return 0;
            case 33:
                int i55 = this.SdkCoreBusinessLogicModuleImpl;
                int i56 = i55 - 1;
                this.SdkCoreBusinessLogicModuleImpl = i56;
                int[] iArr20 = this.getGpoResponse;
                int i57 = i55 - 2;
                iArr20[i57] = iArr20[i57] / iArr20[i56];
                return 0;
            case 34:
                int[] iArr21 = this.getGpoResponse;
                int i58 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i58 + 1;
                iArr21[i58] = 25;
                return 0;
            case 35:
                int i59 = this.SdkCoreBusinessLogicModuleImpl;
                int i60 = i59 - 1;
                int[] iArr22 = this.getGpoResponse;
                int i61 = i59 - 2;
                int i62 = iArr22[i61] + iArr22[i60];
                iArr22[i61] = i62;
                this.SdkCoreBusinessLogicModuleImpl = i59;
                iArr22[i60] = i62;
                return 0;
            case 36:
                int[] iArr23 = this.getGpoResponse;
                int i63 = this.SdkCoreBusinessLogicModuleImpl;
                iArr23[i63] = 128;
                this.SdkCoreBusinessLogicModuleImpl = i63;
                int i64 = i63 - 1;
                iArr23[i64] = iArr23[i64] % 128;
                return 0;
            case 37:
                java.lang.Object[] objArr12 = this.getApplicationLifeCycleData;
                int i65 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i65 + 1;
                int i66 = i65 - 1;
                java.lang.Object obj15 = objArr12[i66];
                objArr12[i66] = null;
                objArr12[i65] = obj15;
                int i67 = i65 - 2;
                java.lang.Object obj16 = objArr12[i67];
                objArr12[i67] = null;
                objArr12[i66] = obj16;
                objArr12[i67] = obj15;
                return 0;
            case 38:
                java.lang.Object[] objArr13 = this.getApplicationLifeCycleData;
                int i68 = this.SdkCoreBusinessLogicModuleImpl;
                int i69 = i68 - 1;
                java.lang.Object obj17 = objArr13[i69];
                objArr13[i69] = null;
                int i70 = i68 - 2;
                java.lang.Object obj18 = objArr13[i70];
                objArr13[i70] = null;
                objArr13[i69] = obj18;
                objArr13[i70] = obj17;
                int[] iArr24 = this.getGpoResponse;
                this.SdkCoreBusinessLogicModuleImpl = i68 + 1;
                iArr24[i68] = 1;
                return 0;
            case 39:
                java.lang.Object[] objArr14 = this.getApplicationLifeCycleData;
                int i71 = this.SdkCoreBusinessLogicModuleImpl;
                int i72 = i71 - 2;
                java.lang.Object obj19 = objArr14[i72];
                objArr14[i72] = null;
                int i73 = i71 - 1;
                objArr14[i73] = obj19;
                int[] iArr25 = this.getGpoResponse;
                iArr25[i72] = iArr25[i73];
                return 0;
            case 40:
                java.lang.Object[] objArr15 = this.getApplicationLifeCycleData;
                int i74 = this.SdkCoreBusinessLogicModuleImpl;
                objArr15[i74] = objArr15[i74 - 1];
                int[] iArr26 = this.getGpoResponse;
                this.SdkCoreBusinessLogicModuleImpl = i74 + 2;
                iArr26[i74 + 1] = 1;
                return 0;
            case 41:
                int[] iArr27 = this.getGpoResponse;
                int i75 = this.SdkCoreBusinessLogicModuleImpl - 1;
                this.SdkCoreBusinessLogicModuleImpl = i75;
                this.writeReplace = iArr27[i75];
                return 0;
            case 42:
                int[] iArr28 = this.getGpoResponse;
                int i76 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i76 + 1;
                iArr28[i76] = 65;
                return 0;
            case 43:
                int[] iArr29 = this.getGpoResponse;
                int i77 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i77 + 1;
                iArr29[i77] = 27;
                return 0;
            case 44:
                int[] iArr30 = this.getGpoResponse;
                int i78 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i78 + 1;
                iArr30[i78] = 80;
                return 0;
            case 45:
                int[] iArr31 = this.getGpoResponse;
                int i79 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i79 + 1;
                iArr31[i79] = 90;
                return 0;
            case 46:
                for (int i80 = this.SdkCoreBusinessLogicModuleImpl - 1; i80 >= 0; i80--) {
                    this.getApplicationLifeCycleData[i80] = null;
                }
                java.lang.Object[] objArr16 = this.getApplicationLifeCycleData;
                this.SdkCoreBusinessLogicModuleImpl = 1;
                objArr16[0] = this.getAid;
                return 0;
            default:
                return i;
        }
    }

    public getObbDirs(long j, long j2) {
        long[] jArr = new long[11];
        this.getCiacDecline = jArr;
        jArr[7] = j;
        jArr[9] = j2;
        this.SdkCoreBusinessLogicModuleImpl = 0;
        this.getPaymentFci = -1;
    }
}

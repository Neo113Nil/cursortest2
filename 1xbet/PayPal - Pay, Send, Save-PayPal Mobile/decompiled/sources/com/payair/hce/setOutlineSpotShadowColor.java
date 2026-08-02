package com.payair.hce;

/* loaded from: classes4.dex */
public class setOutlineSpotShadowColor {
    public int AlternateContactlessPaymentDataJson;
    public int DigitizedCardProfile;
    public double IccPrivateKeyCrtComponentsJson;
    public float RecordsJson;
    public double SdkCoreAlternateContactlessPaymentDataImpl;
    private final int[] SdkCoreBusinessLogicModuleImpl;
    public java.lang.Object getAid;
    private final java.lang.Object[] getApplicationLifeCycleData;
    private int getCiacDecline;
    private final float[] getCvrMaskAnd;
    private int getGpoResponse;
    private final long[] getPaymentFci;
    public java.lang.Object getProfileVersion;
    private final double[] getSecurityWord;
    public long valueOf;
    public long values;
    public float writeReplace;

    /* JADX WARN: Multi-variable type inference failed */
    public int values(int i) {
        java.lang.Object[] objArr = null;
        java.lang.Object[] objArr2 = 0;
        switch (i) {
            case 1:
                int i2 = this.getCiacDecline - this.AlternateContactlessPaymentDataJson;
                this.getCiacDecline = i2;
                this.getGpoResponse = i2;
                return 0;
            case 2:
                java.lang.Object[] objArr3 = this.getApplicationLifeCycleData;
                int i3 = this.getGpoResponse;
                this.getGpoResponse = i3 + 1;
                java.lang.Object obj = objArr3[i3];
                objArr3[i3] = null;
                this.getAid = obj;
                return 0;
            case 3:
                java.lang.Object[] objArr4 = this.getApplicationLifeCycleData;
                int i4 = this.getCiacDecline;
                this.getCiacDecline = i4 + 1;
                objArr4[i4] = objArr4[4];
                return 0;
            case 4:
                int[] iArr = this.SdkCoreBusinessLogicModuleImpl;
                int i5 = this.getCiacDecline;
                this.getCiacDecline = i5 + 1;
                iArr[i5] = 2;
                return 0;
            case 5:
                int i6 = this.getCiacDecline;
                int i7 = i6 - 1;
                this.getCiacDecline = i7;
                int[] iArr2 = this.SdkCoreBusinessLogicModuleImpl;
                int i8 = i6 - 2;
                iArr2[i8] = iArr2[i8] % iArr2[i7];
                return 0;
            case 6:
                int i9 = this.getCiacDecline - 1;
                this.getCiacDecline = i9;
                this.getApplicationLifeCycleData[i9] = null;
                return 0;
            case 8:
                int[] iArr3 = this.SdkCoreBusinessLogicModuleImpl;
                int i10 = this.getCiacDecline;
                this.getCiacDecline = i10 + 1;
                iArr3[i10] = this.AlternateContactlessPaymentDataJson;
            case 7:
                return 0;
            case 9:
                int[] iArr4 = this.SdkCoreBusinessLogicModuleImpl;
                int i11 = this.getCiacDecline;
                this.getCiacDecline = i11 + 1;
                iArr4[i11] = 63;
                return 0;
            case 10:
                int i12 = this.getCiacDecline;
                int i13 = i12 - 1;
                int[] iArr5 = this.SdkCoreBusinessLogicModuleImpl;
                int i14 = i12 - 2;
                int i15 = iArr5[i14] + iArr5[i13];
                iArr5[i14] = i15;
                this.getCiacDecline = i12;
                iArr5[i13] = i15;
                return 0;
            case 11:
                int[] iArr6 = this.SdkCoreBusinessLogicModuleImpl;
                int i16 = this.getGpoResponse;
                this.getGpoResponse = i16 + 1;
                this.DigitizedCardProfile = iArr6[i16];
                return 0;
            case 12:
                int[] iArr7 = this.SdkCoreBusinessLogicModuleImpl;
                int i17 = this.getCiacDecline;
                iArr7[i17] = 128;
                this.getCiacDecline = i17;
                int i18 = i17 - 1;
                iArr7[i18] = iArr7[i18] % 128;
                return 0;
            case 13:
                int i19 = this.getCiacDecline - 1;
                this.getCiacDecline = i19;
                this.DigitizedCardProfile = this.SdkCoreBusinessLogicModuleImpl[i19] == 0 ? 0 : 1;
                return 0;
            case 14:
                int[] iArr8 = this.SdkCoreBusinessLogicModuleImpl;
                int i20 = this.getCiacDecline;
                iArr8[i20] = 2;
                this.getCiacDecline = i20;
                int i21 = i20 - 1;
                iArr8[i21] = iArr8[i21] % 2;
                return 0;
            case 15:
                java.lang.Object[] objArr5 = this.getApplicationLifeCycleData;
                int i22 = this.getCiacDecline - 1;
                java.lang.Object obj2 = objArr5[i22];
                objArr5[i22] = null;
                this.getAid = obj2;
                return 0;
            case 16:
                java.lang.Object[] objArr6 = this.getApplicationLifeCycleData;
                int i23 = this.getCiacDecline;
                this.getCiacDecline = i23 + 1;
                objArr6[i23] = null;
                return 0;
            case 17:
                int[] iArr9 = this.SdkCoreBusinessLogicModuleImpl;
                int i24 = this.getCiacDecline;
                java.lang.Object[] objArr7 = this.getApplicationLifeCycleData;
                int i25 = i24 - 1;
                java.lang.Object obj3 = objArr7[i25];
                objArr7[i25] = null;
                iArr9[i25] = ((int[]) obj3).length;
                int i26 = i24 - 1;
                this.getCiacDecline = i26;
                objArr7[i26] = null;
                return 0;
            case 18:
                int[] iArr10 = this.SdkCoreBusinessLogicModuleImpl;
                int i27 = this.getCiacDecline;
                this.getCiacDecline = i27 + 1;
                iArr10[i27] = 19;
                return 0;
            case 19:
                int i28 = this.getCiacDecline;
                int i29 = i28 - 1;
                this.getCiacDecline = i29;
                int[] iArr11 = this.SdkCoreBusinessLogicModuleImpl;
                int i30 = i28 - 2;
                iArr11[i30] = iArr11[i30] + iArr11[i29];
                return 0;
            case 20:
                int[] iArr12 = this.SdkCoreBusinessLogicModuleImpl;
                int i31 = this.getCiacDecline;
                int i32 = i31 + 1;
                iArr12[i31] = iArr12[i31 - 1];
                iArr12[i32] = 128;
                this.getCiacDecline = i32;
                iArr12[i31] = iArr12[i31] % 128;
                return 0;
            case 21:
                int i33 = this.getCiacDecline - 1;
                this.getCiacDecline = i33;
                this.DigitizedCardProfile = this.SdkCoreBusinessLogicModuleImpl[i33] != 0 ? 0 : 1;
                return 0;
            case 22:
                int[] iArr13 = this.SdkCoreBusinessLogicModuleImpl;
                int i34 = this.getCiacDecline - 1;
                this.getCiacDecline = i34;
                this.DigitizedCardProfile = iArr13[i34];
                return 0;
            case 23:
                int[] iArr14 = this.SdkCoreBusinessLogicModuleImpl;
                int i35 = this.getCiacDecline;
                this.getCiacDecline = i35 + 1;
                iArr14[i35] = 62;
                return 0;
            case 24:
                int[] iArr15 = this.SdkCoreBusinessLogicModuleImpl;
                int i36 = this.getCiacDecline;
                this.getCiacDecline = i36 + 1;
                iArr15[i36] = 79;
                return 0;
            case 25:
                for (int i37 = this.getCiacDecline - 1; i37 >= 0; i37--) {
                    this.getApplicationLifeCycleData[i37] = null;
                }
                java.lang.Object[] objArr8 = this.getApplicationLifeCycleData;
                this.getCiacDecline = 1;
                objArr8[0] = this.getProfileVersion;
                return 0;
            case 26:
                int[] iArr16 = this.SdkCoreBusinessLogicModuleImpl;
                int i38 = this.getCiacDecline;
                iArr16[i38] = 121;
                this.getCiacDecline = i38;
                int i39 = i38 - 1;
                iArr16[i39] = iArr16[i39] + 121;
                return 0;
            case 27:
                int[] iArr17 = this.SdkCoreBusinessLogicModuleImpl;
                int i40 = this.getCiacDecline;
                this.getCiacDecline = i40 + 1;
                iArr17[i40] = iArr17[i40 - 1];
                return 0;
            case 28:
                int[] iArr18 = this.SdkCoreBusinessLogicModuleImpl;
                int i41 = this.getCiacDecline;
                this.getCiacDecline = i41 + 1;
                iArr18[i41] = 128;
                return 0;
            case 29:
                int[] iArr19 = this.SdkCoreBusinessLogicModuleImpl;
                int i42 = this.getCiacDecline;
                this.getCiacDecline = i42 + 1;
                iArr19[i42] = 1;
                return 0;
            case 30:
                int[] iArr20 = this.SdkCoreBusinessLogicModuleImpl;
                int i43 = this.getCiacDecline;
                this.getCiacDecline = i43 + 1;
                iArr20[i43] = 0;
                return 0;
            case 31:
                int i44 = this.getCiacDecline;
                int i45 = i44 - 1;
                this.getCiacDecline = i45;
                int[] iArr21 = this.SdkCoreBusinessLogicModuleImpl;
                int i46 = i44 - 2;
                iArr21[i46] = iArr21[i46] % iArr21[i45];
                int i47 = i44 - 2;
                this.getCiacDecline = i47;
                this.getApplicationLifeCycleData[i47] = null;
                return 0;
            case 32:
                int[] iArr22 = this.SdkCoreBusinessLogicModuleImpl;
                int i48 = this.getCiacDecline;
                this.getCiacDecline = i48 + 1;
                iArr22[i48] = 13;
                return 0;
            case 33:
                int[] iArr23 = this.SdkCoreBusinessLogicModuleImpl;
                int i49 = this.getCiacDecline;
                iArr23[i49] = 47;
                this.getCiacDecline = i49;
                int i50 = i49 - 1;
                iArr23[i50] = iArr23[i50] + 47;
                return 0;
            case 34:
                int[] iArr24 = this.SdkCoreBusinessLogicModuleImpl;
                int i51 = this.getCiacDecline;
                int i52 = i51 + 1;
                iArr24[i51] = 92;
                iArr24[i52] = 0;
                this.getCiacDecline = i52;
                iArr24[i51] = iArr24[i51] / 0;
                return 0;
            case 35:
                int[] iArr25 = this.SdkCoreBusinessLogicModuleImpl;
                int i53 = this.getCiacDecline;
                this.getCiacDecline = i53 + 1;
                iArr25[i53] = 77;
                return 0;
            case 36:
                int i54 = this.getCiacDecline;
                int i55 = i54 - 1;
                int[] iArr26 = this.SdkCoreBusinessLogicModuleImpl;
                int i56 = i54 - 2;
                int i57 = iArr26[i56] + iArr26[i55];
                iArr26[i56] = i57;
                iArr26[i55] = i57;
                this.getCiacDecline = i54 + 1;
                iArr26[i54] = 128;
                return 0;
            case 37:
                java.lang.Object[] objArr9 = this.getApplicationLifeCycleData;
                int i58 = this.getCiacDecline;
                this.getCiacDecline = i58 + 1;
                objArr9[i58] = null;
                int[] iArr27 = this.SdkCoreBusinessLogicModuleImpl;
                objArr9[i58] = null;
                iArr27[i58] = objArr.length;
                this.getCiacDecline = i58;
                objArr9[i58] = null;
                return 0;
            case 38:
                int[] iArr28 = this.SdkCoreBusinessLogicModuleImpl;
                int i59 = this.getCiacDecline;
                iArr28[i59] = 49;
                int i60 = i59 - 1;
                int i61 = iArr28[i60] + 49;
                iArr28[i60] = i61;
                this.getCiacDecline = i59 + 1;
                iArr28[i59] = i61;
                return 0;
            case 39:
                java.lang.Object[] objArr10 = this.getApplicationLifeCycleData;
                int i62 = this.getCiacDecline;
                this.getCiacDecline = i62 + 1;
                objArr10[i62] = null;
                int[] iArr29 = this.SdkCoreBusinessLogicModuleImpl;
                objArr10[i62] = null;
                iArr29[i62] = (objArr2 == true ? 1 : 0).length;
                return 0;
            case 40:
                int[] iArr30 = this.SdkCoreBusinessLogicModuleImpl;
                int i63 = this.getCiacDecline;
                this.getCiacDecline = i63 + 1;
                iArr30[i63] = 115;
                return 0;
            case 41:
                int[] iArr31 = this.SdkCoreBusinessLogicModuleImpl;
                int i64 = this.getCiacDecline;
                iArr31[i64] = 75;
                int i65 = i64 - 1;
                int i66 = iArr31[i65] + 75;
                iArr31[i65] = i66;
                this.getCiacDecline = i64 + 1;
                iArr31[i64] = i66;
                return 0;
            case 42:
                int[] iArr32 = this.SdkCoreBusinessLogicModuleImpl;
                int i67 = this.getCiacDecline;
                java.lang.Object[] objArr11 = this.getApplicationLifeCycleData;
                int i68 = i67 - 1;
                java.lang.Object obj4 = objArr11[i68];
                objArr11[i68] = null;
                iArr32[i68] = ((int[]) obj4).length;
                return 0;
            case 43:
                int[] iArr33 = this.SdkCoreBusinessLogicModuleImpl;
                int i69 = this.getCiacDecline;
                int i70 = i69 + 1;
                iArr33[i69] = 2;
                iArr33[i70] = 2;
                this.getCiacDecline = i70;
                iArr33[i69] = iArr33[i69] % 2;
                return 0;
            case 44:
                int[] iArr34 = this.SdkCoreBusinessLogicModuleImpl;
                int i71 = this.getCiacDecline;
                this.getCiacDecline = i71 + 1;
                iArr34[i71] = 81;
                return 0;
            case 45:
                int[] iArr35 = this.SdkCoreBusinessLogicModuleImpl;
                int i72 = this.getCiacDecline;
                this.getCiacDecline = i72 + 1;
                iArr35[i72] = 95;
                return 0;
            case 46:
                java.lang.Object[] objArr12 = this.getApplicationLifeCycleData;
                int i73 = this.getCiacDecline;
                this.getCiacDecline = i73 + 1;
                objArr12[i73] = this.getProfileVersion;
                return 0;
            case 47:
                int[] iArr36 = this.SdkCoreBusinessLogicModuleImpl;
                int i74 = this.getCiacDecline;
                iArr36[i74] = 2;
                this.getCiacDecline = i74 + 2;
                iArr36[i74 + 1] = 2;
                return 0;
            case 48:
                this.DigitizedCardProfile = this.SdkCoreBusinessLogicModuleImpl[this.getCiacDecline - 1];
                return 0;
            case 49:
                int[] iArr37 = this.SdkCoreBusinessLogicModuleImpl;
                int i75 = this.getCiacDecline;
                iArr37[i75] = 113;
                this.getCiacDecline = i75;
                int i76 = i75 - 1;
                iArr37[i76] = iArr37[i76] + 113;
                return 0;
            case 50:
                int[] iArr38 = this.SdkCoreBusinessLogicModuleImpl;
                int i77 = this.getCiacDecline;
                iArr38[i77] = 16;
                this.getCiacDecline = i77;
                int i78 = i77 - 1;
                iArr38[i78] = iArr38[i78] >> 16;
                return 0;
            case 51:
                int[] iArr39 = this.SdkCoreBusinessLogicModuleImpl;
                int i79 = this.getCiacDecline;
                iArr39[i79] = 61;
                this.getCiacDecline = i79;
                int i80 = i79 - 1;
                iArr39[i80] = iArr39[i80] + 61;
                return 0;
            case 52:
                int[] iArr40 = this.SdkCoreBusinessLogicModuleImpl;
                int i81 = this.getCiacDecline;
                iArr40[i81] = iArr40[i81 - 1];
                this.getCiacDecline = i81 + 2;
                iArr40[i81 + 1] = 128;
                return 0;
            case 53:
                int[] iArr41 = this.SdkCoreBusinessLogicModuleImpl;
                int i82 = this.getCiacDecline;
                this.getCiacDecline = i82 + 1;
                iArr41[i82] = 99;
                return 0;
            case 54:
                int[] iArr42 = this.SdkCoreBusinessLogicModuleImpl;
                int i83 = this.getCiacDecline;
                iArr42[i83] = 88;
                this.getCiacDecline = i83;
                int i84 = i83 - 1;
                iArr42[i84] = iArr42[i84] << 88;
                return 0;
            case 55:
                int[] iArr43 = this.SdkCoreBusinessLogicModuleImpl;
                int i85 = this.getCiacDecline;
                this.getCiacDecline = i85 + 1;
                iArr43[i85] = 30;
                return 0;
            case 56:
                int[] iArr44 = this.SdkCoreBusinessLogicModuleImpl;
                int i86 = this.getCiacDecline;
                this.getCiacDecline = i86 + 1;
                iArr44[i86] = 24;
                return 0;
            default:
                return i;
        }
    }

    public setOutlineSpotShadowColor() {
        this.SdkCoreBusinessLogicModuleImpl = new int[5];
        this.getPaymentFci = new long[5];
        this.getCvrMaskAnd = new float[5];
        this.getSecurityWord = new double[5];
        this.getApplicationLifeCycleData = new java.lang.Object[5];
        this.getCiacDecline = 0;
        this.getGpoResponse = -1;
    }

    public setOutlineSpotShadowColor(java.lang.Object obj) {
        this.SdkCoreBusinessLogicModuleImpl = new int[5];
        this.getPaymentFci = new long[5];
        this.getCvrMaskAnd = new float[5];
        this.getSecurityWord = new double[5];
        java.lang.Object[] objArr = new java.lang.Object[5];
        this.getApplicationLifeCycleData = objArr;
        objArr[4] = obj;
        this.getCiacDecline = 0;
        this.getGpoResponse = -1;
    }
}

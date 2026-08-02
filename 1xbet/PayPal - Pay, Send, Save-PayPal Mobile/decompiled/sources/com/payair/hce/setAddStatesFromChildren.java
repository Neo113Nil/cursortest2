package com.payair.hce;

/* loaded from: classes10.dex */
public class setAddStatesFromChildren {
    public float AlternateContactlessPaymentDataJson;
    public long DigitizedCardProfile;
    public java.lang.Object IccPrivateKeyCrtComponentsJson;
    public float RecordsJson;
    public double SdkCoreAlternateContactlessPaymentDataImpl;
    public java.lang.Object getAid;
    private final long[] getCiacDecline;
    private int getCvrMaskAnd;
    private int getGpoResponse;
    public double getProfileVersion;
    public long valueOf;
    public int values;
    public int writeReplace;
    private final int[] SdkCoreBusinessLogicModuleImpl = new int[11];
    private final float[] getPaymentFci = new float[11];
    private final double[] getCvmResetTimeout = new double[11];
    private final java.lang.Object[] getCardLayoutDescription = new java.lang.Object[11];

    public int valueOf(int i) {
        switch (i) {
            case 1:
                java.lang.Object[] objArr = this.getCardLayoutDescription;
                int i2 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i2 + 1;
                objArr[i2] = this.getAid;
                return 0;
            case 2:
                int[] iArr = this.SdkCoreBusinessLogicModuleImpl;
                int i3 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i3 + 1;
                iArr[i3] = this.writeReplace;
                return 0;
            case 3:
                int[] iArr2 = this.SdkCoreBusinessLogicModuleImpl;
                int i4 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i4 + 1;
                iArr2[i4] = 3;
                return 0;
            case 4:
                int[] iArr3 = this.SdkCoreBusinessLogicModuleImpl;
                int i5 = this.getCvrMaskAnd;
                iArr3[i5] = 8;
                this.getCvrMaskAnd = i5;
                int i6 = i5 - 1;
                iArr3[i6] = iArr3[i6] >> 8;
                return 0;
            case 5:
                int i7 = this.getCvrMaskAnd;
                int i8 = i7 - 1;
                this.getCvrMaskAnd = i8;
                int[] iArr4 = this.SdkCoreBusinessLogicModuleImpl;
                int i9 = i7 - 2;
                iArr4[i9] = iArr4[i9] - iArr4[i8];
                return 0;
            case 6:
                int[] iArr5 = this.SdkCoreBusinessLogicModuleImpl;
                int i10 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i10 + 1;
                iArr5[i10] = 14;
                return 0;
            case 7:
                int i11 = this.getCvrMaskAnd - this.writeReplace;
                this.getCvrMaskAnd = i11;
                this.getGpoResponse = i11;
                return 0;
            case 8:
                int[] iArr6 = this.SdkCoreBusinessLogicModuleImpl;
                int i12 = this.getGpoResponse;
                this.getGpoResponse = i12 + 1;
                this.values = iArr6[i12];
                return 0;
            case 9:
                int[] iArr7 = this.SdkCoreBusinessLogicModuleImpl;
                int i13 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i13 + 1;
                iArr7[i13] = 0;
                return 0;
            case 10:
                int[] iArr8 = this.SdkCoreBusinessLogicModuleImpl;
                int i14 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i14 + 1;
                iArr8[i14] = 20;
                return 0;
            case 11:
                int i15 = this.getCvrMaskAnd;
                int i16 = i15 - 1;
                this.getCvrMaskAnd = i16;
                int[] iArr9 = this.SdkCoreBusinessLogicModuleImpl;
                int i17 = i15 - 2;
                iArr9[i17] = iArr9[i17] + iArr9[i16];
                return 0;
            case 12:
                int[] iArr10 = this.SdkCoreBusinessLogicModuleImpl;
                int i18 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i18 + 1;
                iArr10[i18] = 6;
                return 0;
            case 13:
                int i19 = this.getCvrMaskAnd;
                int[] iArr11 = this.SdkCoreBusinessLogicModuleImpl;
                int i20 = i19 - 2;
                int i21 = iArr11[i20] >> iArr11[i19 - 1];
                iArr11[i20] = i21;
                this.getCvrMaskAnd = i20;
                int i22 = i19 - 3;
                int i23 = iArr11[i22] + i21;
                iArr11[i22] = i23;
                iArr11[i22] = (byte) i23;
                return 0;
            case 14:
                java.lang.Object[] objArr2 = this.getCardLayoutDescription;
                int i24 = this.getGpoResponse;
                this.getGpoResponse = i24 + 1;
                java.lang.Object obj = objArr2[i24];
                objArr2[i24] = null;
                this.IccPrivateKeyCrtComponentsJson = obj;
                return 0;
            case 15:
                java.lang.Object[] objArr3 = this.getCardLayoutDescription;
                int i25 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i25 + 1;
                objArr3[i25] = objArr3[i25 - 1];
                return 0;
            case 16:
                int i26 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i26;
                java.lang.Object[] objArr4 = this.getCardLayoutDescription;
                java.lang.Object obj2 = objArr4[i26];
                objArr4[i26] = null;
                this.values = obj2 == null ? 0 : 1;
                return 0;
            case 17:
                java.lang.Object[] objArr5 = this.getCardLayoutDescription;
                int i27 = this.getCvrMaskAnd;
                int i28 = i27 - 1;
                java.lang.Object obj3 = objArr5[i28];
                objArr5[i28] = null;
                int i29 = i27 - 2;
                java.lang.Object obj4 = objArr5[i29];
                objArr5[i29] = null;
                objArr5[i28] = obj4;
                objArr5[i29] = obj3;
                return 0;
            case 18:
                java.lang.Object[] objArr6 = this.getCardLayoutDescription;
                int i30 = this.getCvrMaskAnd - 1;
                java.lang.Object obj5 = objArr6[i30];
                objArr6[i30] = null;
                this.IccPrivateKeyCrtComponentsJson = obj5;
                return 0;
            case 19:
                int i31 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i31;
                this.getCardLayoutDescription[i31] = null;
                return 0;
            case 20:
                int[] iArr12 = this.SdkCoreBusinessLogicModuleImpl;
                int i32 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i32 + 1;
                iArr12[i32] = 1;
                return 0;
            case 21:
                java.lang.Object[] objArr7 = this.getCardLayoutDescription;
                int i33 = this.getCvrMaskAnd;
                int i34 = i33 - 1;
                java.lang.Object obj6 = objArr7[i34];
                objArr7[i34] = null;
                objArr7[i33] = obj6;
                int i35 = i33 - 2;
                java.lang.Object obj7 = objArr7[i35];
                objArr7[i35] = null;
                objArr7[i34] = obj7;
                objArr7[i35] = obj6;
                java.lang.Object obj8 = objArr7[i33];
                objArr7[i33] = null;
                java.lang.Object obj9 = objArr7[i34];
                objArr7[i34] = null;
                objArr7[i33] = obj9;
                objArr7[i34] = obj8;
                int[] iArr13 = this.SdkCoreBusinessLogicModuleImpl;
                this.getCvrMaskAnd = i33 + 2;
                iArr13[i33 + 1] = 0;
                return 0;
            case 22:
                java.lang.Object[] objArr8 = this.getCardLayoutDescription;
                int i36 = this.getCvrMaskAnd;
                int i37 = i36 - 2;
                java.lang.Object obj10 = objArr8[i37];
                objArr8[i37] = null;
                int i38 = i36 - 1;
                objArr8[i38] = obj10;
                int[] iArr14 = this.SdkCoreBusinessLogicModuleImpl;
                int i39 = iArr14[i38];
                iArr14[i37] = i39;
                int i40 = i36 - 3;
                this.getCvrMaskAnd = i40;
                java.lang.Object obj11 = objArr8[i40];
                objArr8[i40] = null;
                java.lang.Object obj12 = objArr8[i38];
                objArr8[i38] = null;
                ((java.lang.Object[]) obj11)[i39] = obj12;
                return 0;
            case 23:
                int i41 = this.getCvrMaskAnd;
                int i42 = i41 - 3;
                this.getCvrMaskAnd = i42;
                java.lang.Object[] objArr9 = this.getCardLayoutDescription;
                java.lang.Object obj13 = objArr9[i42];
                objArr9[i42] = null;
                int i43 = this.SdkCoreBusinessLogicModuleImpl[i41 - 2];
                int i44 = i41 - 1;
                java.lang.Object obj14 = objArr9[i44];
                objArr9[i44] = null;
                ((java.lang.Object[]) obj13)[i43] = obj14;
                return 0;
            case 24:
                java.lang.Object[] objArr10 = this.getCardLayoutDescription;
                int i45 = this.getCvrMaskAnd;
                int i46 = i45 - 1;
                java.lang.Object obj15 = objArr10[i46];
                objArr10[i46] = null;
                int i47 = i45 - 2;
                java.lang.Object obj16 = objArr10[i47];
                objArr10[i47] = null;
                objArr10[i46] = obj16;
                objArr10[i47] = obj15;
                this.getCvrMaskAnd = i45 + 1;
                objArr10[i45] = null;
                objArr10[i45] = null;
                java.lang.Object obj17 = objArr10[i46];
                objArr10[i46] = null;
                objArr10[i45] = obj17;
                objArr10[i46] = null;
                return 0;
            case 25:
                java.lang.Object[] objArr11 = this.getCardLayoutDescription;
                int i48 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i48 + 1;
                objArr11[i48] = null;
                return 0;
            case 26:
                java.lang.Object[] objArr12 = this.getCardLayoutDescription;
                int i49 = this.getCvrMaskAnd;
                objArr12[i49] = null;
                this.getCvrMaskAnd = i49 + 2;
                objArr12[i49 + 1] = null;
                return 0;
            case 27:
                int[] iArr15 = this.SdkCoreBusinessLogicModuleImpl;
                int i50 = this.getCvrMaskAnd;
                iArr15[i50] = 2;
                this.getCvrMaskAnd = i50 + 2;
                iArr15[i50 + 1] = 2;
                return 0;
            case 28:
                int i51 = this.getCvrMaskAnd;
                int i52 = i51 - 1;
                this.getCvrMaskAnd = i52;
                int[] iArr16 = this.SdkCoreBusinessLogicModuleImpl;
                int i53 = i51 - 2;
                iArr16[i53] = iArr16[i53] % iArr16[i52];
                int i54 = i51 - 2;
                this.getCvrMaskAnd = i54;
                this.getCardLayoutDescription[i54] = null;
                return 0;
            case 29:
                int[] iArr17 = this.SdkCoreBusinessLogicModuleImpl;
                int i55 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i55 + 1;
                iArr17[i55] = 2;
                return 0;
            case 30:
                int[] iArr18 = this.SdkCoreBusinessLogicModuleImpl;
                int i56 = this.getCvrMaskAnd;
                iArr18[i56] = 2;
                this.getCvrMaskAnd = i56;
                int i57 = i56 - 1;
                iArr18[i57] = iArr18[i57] % 2;
                return 0;
            case 31:
                int[] iArr19 = this.SdkCoreBusinessLogicModuleImpl;
                int i58 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i58 + 1;
                iArr19[i58] = 43;
                return 0;
            case 32:
                int i59 = this.getCvrMaskAnd;
                int i60 = i59 - 1;
                int[] iArr20 = this.SdkCoreBusinessLogicModuleImpl;
                int i61 = i59 - 2;
                int i62 = iArr20[i61] + iArr20[i60];
                iArr20[i61] = i62;
                iArr20[i60] = i62;
                this.getCvrMaskAnd = i59 + 1;
                iArr20[i59] = 128;
                return 0;
            case 33:
                int i63 = this.getCvrMaskAnd;
                int i64 = i63 - 1;
                this.getCvrMaskAnd = i64;
                int[] iArr21 = this.SdkCoreBusinessLogicModuleImpl;
                int i65 = i63 - 2;
                iArr21[i65] = iArr21[i65] % iArr21[i64];
                return 0;
            case 34:
                int i66 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i66;
                this.values = this.SdkCoreBusinessLogicModuleImpl[i66] != 0 ? 0 : 1;
                return 0;
            case 35:
                int[] iArr22 = this.SdkCoreBusinessLogicModuleImpl;
                int i67 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i67 + 1;
                iArr22[i67] = 15;
                return 0;
            case 36:
                int[] iArr23 = this.SdkCoreBusinessLogicModuleImpl;
                int i68 = this.getCvrMaskAnd;
                int i69 = i68 + 1;
                iArr23[i68] = iArr23[i68 - 1];
                iArr23[i69] = 128;
                this.getCvrMaskAnd = i69;
                iArr23[i68] = iArr23[i68] % 128;
                return 0;
            case 37:
                int i70 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i70;
                this.values = this.SdkCoreBusinessLogicModuleImpl[i70] == 0 ? 0 : 1;
                return 0;
            case 38:
                java.lang.Object[] objArr13 = this.getCardLayoutDescription;
                int i71 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i71 + 1;
                int i72 = i71 - 1;
                java.lang.Object obj18 = objArr13[i72];
                objArr13[i72] = null;
                objArr13[i71] = obj18;
                int i73 = i71 - 2;
                java.lang.Object obj19 = objArr13[i73];
                objArr13[i73] = null;
                objArr13[i72] = obj19;
                objArr13[i73] = obj18;
                java.lang.Object obj20 = objArr13[i71];
                objArr13[i71] = null;
                java.lang.Object obj21 = objArr13[i72];
                objArr13[i72] = null;
                objArr13[i71] = obj21;
                objArr13[i72] = obj20;
                return 0;
            case 39:
                int[] iArr24 = this.SdkCoreBusinessLogicModuleImpl;
                int i74 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i74;
                this.values = iArr24[i74];
                return 0;
            case 40:
                int[] iArr25 = this.SdkCoreBusinessLogicModuleImpl;
                int i75 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i75 + 1;
                iArr25[i75] = 22;
                return 0;
            case 41:
                int[] iArr26 = this.SdkCoreBusinessLogicModuleImpl;
                int i76 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i76 + 1;
                iArr26[i76] = 60;
                return 0;
            case 42:
                for (int i77 = this.getCvrMaskAnd - 1; i77 >= 0; i77--) {
                    this.getCardLayoutDescription[i77] = null;
                }
                java.lang.Object[] objArr14 = this.getCardLayoutDescription;
                this.getCvrMaskAnd = 1;
                objArr14[0] = this.getAid;
                return 0;
            default:
                return i;
        }
    }

    public setAddStatesFromChildren(long j, long j2) {
        long[] jArr = new long[11];
        this.getCiacDecline = jArr;
        jArr[7] = j;
        jArr[9] = j2;
        this.getCvrMaskAnd = 0;
        this.getGpoResponse = -1;
    }
}

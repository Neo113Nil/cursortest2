package com.payair.hce;

/* loaded from: classes10.dex */
public class createContext {
    public long AlternateContactlessPaymentDataJson;
    public int DigitizedCardProfile;
    public java.lang.Object IccPrivateKeyCrtComponentsJson;
    public java.lang.Object RecordsJson;
    public double SdkCoreAlternateContactlessPaymentDataImpl;
    private final long[] SdkCoreBusinessLogicModuleImpl;
    public double getAid;
    private int getGpoResponse;
    private int getPaymentFci;
    public float getProfileVersion;
    public long valueOf;
    public int values;
    public float writeReplace;
    private final int[] getCvrMaskAnd = new int[11];
    private final float[] getCiacDecline = new float[11];
    private final double[] getApplicationLifeCycleData = new double[11];
    private final java.lang.Object[] getCardLayoutDescription = new java.lang.Object[11];

    public int DigitizedCardProfile(int i) {
        java.lang.Object[] objArr = null;
        switch (i) {
            case 1:
                java.lang.Object[] objArr2 = this.getCardLayoutDescription;
                int i2 = this.getPaymentFci;
                this.getPaymentFci = i2 + 1;
                objArr2[i2] = this.IccPrivateKeyCrtComponentsJson;
                return 0;
            case 2:
                int[] iArr = this.getCvrMaskAnd;
                int i3 = this.getPaymentFci;
                this.getPaymentFci = i3 + 1;
                iArr[i3] = 0;
                return 0;
            case 3:
                int[] iArr2 = this.getCvrMaskAnd;
                int i4 = this.getPaymentFci;
                this.getPaymentFci = i4 + 1;
                iArr2[i4] = this.DigitizedCardProfile;
                return 0;
            case 4:
                int[] iArr3 = this.getCvrMaskAnd;
                int i5 = this.getPaymentFci;
                iArr3[i5] = 0;
                this.getPaymentFci = i5 + 2;
                iArr3[i5 + 1] = 0;
                return 0;
            case 5:
                int i6 = this.getPaymentFci - this.DigitizedCardProfile;
                this.getPaymentFci = i6;
                this.getGpoResponse = i6;
                return 0;
            case 6:
                int[] iArr4 = this.getCvrMaskAnd;
                int i7 = this.getGpoResponse;
                this.getGpoResponse = i7 + 1;
                this.values = iArr4[i7];
                return 0;
            case 7:
                int i8 = this.getPaymentFci;
                int i9 = i8 - 1;
                int[] iArr5 = this.getCvrMaskAnd;
                int i10 = i8 - 2;
                iArr5[i10] = iArr5[i10] - iArr5[i9];
                this.getPaymentFci = i8;
                iArr5[i9] = 4;
                return 0;
            case 8:
                java.lang.Object[] objArr3 = this.getCardLayoutDescription;
                int i11 = this.getGpoResponse;
                this.getGpoResponse = i11 + 1;
                java.lang.Object obj = objArr3[i11];
                objArr3[i11] = null;
                this.RecordsJson = obj;
                return 0;
            case 9:
                int i12 = this.getPaymentFci;
                int i13 = i12 - 1;
                int[] iArr6 = this.getCvrMaskAnd;
                int i14 = i12 - 2;
                iArr6[i14] = iArr6[i14] + iArr6[i13];
                iArr6[i13] = 3;
                this.getPaymentFci = i12 + 1;
                iArr6[i12] = 0;
                return 0;
            case 10:
                int i15 = this.getPaymentFci;
                int i16 = i15 - 1;
                this.getPaymentFci = i16;
                int[] iArr7 = this.getCvrMaskAnd;
                int i17 = i15 - 2;
                iArr7[i17] = iArr7[i17] - iArr7[i16];
                return 0;
            case 11:
                java.lang.Object[] objArr4 = this.getCardLayoutDescription;
                int i18 = this.getPaymentFci;
                this.getPaymentFci = i18 + 1;
                objArr4[i18] = objArr4[i18 - 1];
                return 0;
            case 12:
                int i19 = this.getPaymentFci - 1;
                this.getPaymentFci = i19;
                java.lang.Object[] objArr5 = this.getCardLayoutDescription;
                java.lang.Object obj2 = objArr5[i19];
                objArr5[i19] = null;
                this.values = obj2 == null ? 0 : 1;
                return 0;
            case 13:
                java.lang.Object[] objArr6 = this.getCardLayoutDescription;
                int i20 = this.getPaymentFci - 1;
                java.lang.Object obj3 = objArr6[i20];
                objArr6[i20] = null;
                this.RecordsJson = obj3;
                return 0;
            case 14:
                java.lang.Object[] objArr7 = this.getCardLayoutDescription;
                int i21 = this.getPaymentFci;
                int i22 = i21 - 1;
                java.lang.Object obj4 = objArr7[i22];
                objArr7[i22] = null;
                int i23 = i21 - 2;
                java.lang.Object obj5 = objArr7[i23];
                objArr7[i23] = null;
                objArr7[i22] = obj5;
                objArr7[i23] = obj4;
                int i24 = i21 - 1;
                this.getPaymentFci = i24;
                objArr7[i24] = null;
                return 0;
            case 15:
                int i25 = this.getPaymentFci - 1;
                this.getPaymentFci = i25;
                this.getCardLayoutDescription[i25] = null;
                return 0;
            case 16:
                int[] iArr8 = this.getCvrMaskAnd;
                int i26 = this.getPaymentFci;
                this.getPaymentFci = i26 + 1;
                iArr8[i26] = 1;
                return 0;
            case 17:
                java.lang.Object[] objArr8 = this.getCardLayoutDescription;
                int i27 = this.getPaymentFci;
                this.getPaymentFci = i27 + 1;
                int i28 = i27 - 1;
                java.lang.Object obj6 = objArr8[i28];
                objArr8[i28] = null;
                objArr8[i27] = obj6;
                int i29 = i27 - 2;
                java.lang.Object obj7 = objArr8[i29];
                objArr8[i29] = null;
                objArr8[i28] = obj7;
                objArr8[i29] = obj6;
                java.lang.Object obj8 = objArr8[i27];
                objArr8[i27] = null;
                java.lang.Object obj9 = objArr8[i28];
                objArr8[i28] = null;
                objArr8[i27] = obj9;
                objArr8[i28] = obj8;
                return 0;
            case 18:
                int[] iArr9 = this.getCvrMaskAnd;
                int i30 = this.getPaymentFci;
                iArr9[i30] = 0;
                java.lang.Object[] objArr9 = this.getCardLayoutDescription;
                int i31 = i30 - 1;
                java.lang.Object obj10 = objArr9[i31];
                objArr9[i31] = null;
                objArr9[i30] = obj10;
                iArr9[i31] = 0;
                int i32 = i30 - 2;
                this.getPaymentFci = i32;
                java.lang.Object obj11 = objArr9[i32];
                objArr9[i32] = null;
                java.lang.Object obj12 = objArr9[i30];
                objArr9[i30] = null;
                ((java.lang.Object[]) obj11)[0] = obj12;
                return 0;
            case 19:
                int i33 = this.getPaymentFci;
                int i34 = i33 - 3;
                this.getPaymentFci = i34;
                java.lang.Object[] objArr10 = this.getCardLayoutDescription;
                java.lang.Object obj13 = objArr10[i34];
                objArr10[i34] = null;
                int i35 = this.getCvrMaskAnd[i33 - 2];
                int i36 = i33 - 1;
                java.lang.Object obj14 = objArr10[i36];
                objArr10[i36] = null;
                ((java.lang.Object[]) obj13)[i35] = obj14;
                return 0;
            case 20:
                java.lang.Object[] objArr11 = this.getCardLayoutDescription;
                int i37 = this.getPaymentFci;
                int i38 = i37 - 1;
                java.lang.Object obj15 = objArr11[i38];
                objArr11[i38] = null;
                int i39 = i37 - 2;
                java.lang.Object obj16 = objArr11[i39];
                objArr11[i39] = null;
                objArr11[i38] = obj16;
                objArr11[i39] = obj15;
                this.getPaymentFci = i37 + 1;
                objArr11[i37] = null;
                objArr11[i37] = null;
                java.lang.Object obj17 = objArr11[i38];
                objArr11[i38] = null;
                objArr11[i37] = obj17;
                objArr11[i38] = null;
                return 0;
            case 21:
                java.lang.Object[] objArr12 = this.getCardLayoutDescription;
                int i40 = this.getPaymentFci;
                this.getPaymentFci = i40 + 1;
                objArr12[i40] = null;
                return 0;
            case 22:
                java.lang.Object[] objArr13 = this.getCardLayoutDescription;
                int i41 = this.getPaymentFci;
                objArr13[i41] = null;
                this.getPaymentFci = i41 + 2;
                objArr13[i41 + 1] = null;
                return 0;
            case 23:
                int[] iArr10 = this.getCvrMaskAnd;
                int i42 = this.getPaymentFci;
                this.getPaymentFci = i42 + 1;
                iArr10[i42] = 2;
                return 0;
            case 24:
                int i43 = this.getPaymentFci;
                int i44 = i43 - 1;
                this.getPaymentFci = i44;
                int[] iArr11 = this.getCvrMaskAnd;
                int i45 = i43 - 2;
                iArr11[i45] = iArr11[i45] % iArr11[i44];
                return 0;
            case 26:
                int[] iArr12 = this.getCvrMaskAnd;
                int i46 = this.getPaymentFci;
                iArr12[i46] = 47;
                int i47 = i46 - 1;
                int i48 = iArr12[i47] + 47;
                iArr12[i47] = i48;
                this.getPaymentFci = i46 + 1;
                iArr12[i46] = i48;
            case 25:
                return 0;
            case 27:
                int[] iArr13 = this.getCvrMaskAnd;
                int i49 = this.getPaymentFci;
                iArr13[i49] = 128;
                this.getPaymentFci = i49;
                int i50 = i49 - 1;
                iArr13[i50] = iArr13[i50] % 128;
                return 0;
            case 28:
                int i51 = this.getPaymentFci - 1;
                this.getPaymentFci = i51;
                this.values = this.getCvrMaskAnd[i51] == 0 ? 0 : 1;
                return 0;
            case 29:
                int[] iArr14 = this.getCvrMaskAnd;
                int i52 = this.getPaymentFci;
                iArr14[i52] = 97;
                this.getPaymentFci = i52;
                int i53 = i52 - 1;
                iArr14[i53] = iArr14[i53] + 97;
                return 0;
            case 30:
                int[] iArr15 = this.getCvrMaskAnd;
                int i54 = this.getPaymentFci;
                this.getPaymentFci = i54 + 1;
                iArr15[i54] = iArr15[i54 - 1];
                return 0;
            case 31:
                int[] iArr16 = this.getCvrMaskAnd;
                int i55 = this.getPaymentFci;
                this.getPaymentFci = i55 + 1;
                iArr16[i55] = 128;
                return 0;
            case 32:
                int[] iArr17 = this.getCvrMaskAnd;
                int i56 = this.getPaymentFci;
                iArr17[i56] = 2;
                this.getPaymentFci = i56;
                int i57 = i56 - 1;
                iArr17[i57] = iArr17[i57] % 2;
                return 0;
            case 33:
                int[] iArr18 = this.getCvrMaskAnd;
                int i58 = this.getPaymentFci;
                this.getPaymentFci = i58 + 1;
                iArr18[i58] = 31;
                return 0;
            case 34:
                int i59 = this.getPaymentFci;
                int i60 = i59 - 1;
                int[] iArr19 = this.getCvrMaskAnd;
                int i61 = i59 - 2;
                int i62 = iArr19[i61] + iArr19[i60];
                iArr19[i61] = i62;
                this.getPaymentFci = i59;
                iArr19[i60] = i62;
                return 0;
            case 35:
                java.lang.Object[] objArr14 = this.getCardLayoutDescription;
                int i63 = this.getPaymentFci;
                this.getPaymentFci = i63 + 1;
                objArr14[i63] = null;
                int[] iArr20 = this.getCvrMaskAnd;
                objArr14[i63] = null;
                iArr20[i63] = objArr.length;
                this.getPaymentFci = i63;
                objArr14[i63] = null;
                return 0;
            case 36:
                int[] iArr21 = this.getCvrMaskAnd;
                int i64 = this.getPaymentFci - 1;
                this.getPaymentFci = i64;
                this.values = iArr21[i64];
                return 0;
            case 37:
                for (int i65 = this.getPaymentFci - 1; i65 >= 0; i65--) {
                    this.getCardLayoutDescription[i65] = null;
                }
                java.lang.Object[] objArr15 = this.getCardLayoutDescription;
                this.getPaymentFci = 1;
                objArr15[0] = this.IccPrivateKeyCrtComponentsJson;
                return 0;
            default:
                return i;
        }
    }

    public createContext(long j, long j2) {
        long[] jArr = new long[11];
        this.SdkCoreBusinessLogicModuleImpl = jArr;
        jArr[7] = j;
        jArr[9] = j2;
        this.getPaymentFci = 0;
        this.getGpoResponse = -1;
    }
}

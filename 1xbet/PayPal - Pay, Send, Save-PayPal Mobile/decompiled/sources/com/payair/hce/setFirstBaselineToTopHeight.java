package com.payair.hce;

/* loaded from: classes10.dex */
public class setFirstBaselineToTopHeight {
    public float AlternateContactlessPaymentDataJson;
    public int DigitizedCardProfile;
    public double IccPrivateKeyCrtComponentsJson;
    public java.lang.Object RecordsJson;
    public java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl;
    private final long[] SdkCoreBusinessLogicModuleImpl;
    public float getAid;
    private int getGpoResponse;
    private int getPaymentFci;
    public double getProfileVersion;
    public long valueOf;
    public int values;
    public long writeReplace;
    private final int[] getCiacDecline = new int[13];
    private final float[] getCvrMaskAnd = new float[13];
    private final double[] getCardLayoutDescription = new double[13];
    private final java.lang.Object[] getDualTapResetTimeout = new java.lang.Object[13];

    public int values(int i) {
        switch (i) {
            case 1:
                java.lang.Object[] objArr = this.getDualTapResetTimeout;
                int i2 = this.getGpoResponse;
                this.getGpoResponse = i2 + 1;
                objArr[i2] = this.RecordsJson;
                return 0;
            case 2:
                int[] iArr = this.getCiacDecline;
                int i3 = this.getGpoResponse;
                this.getGpoResponse = i3 + 1;
                iArr[i3] = this.values;
                return 0;
            case 3:
                long[] jArr = this.SdkCoreBusinessLogicModuleImpl;
                int i4 = this.getGpoResponse;
                this.getGpoResponse = i4 + 1;
                jArr[i4] = this.writeReplace;
                return 0;
            case 4:
                long[] jArr2 = this.SdkCoreBusinessLogicModuleImpl;
                int i5 = this.getGpoResponse;
                jArr2[i5] = 0;
                this.getGpoResponse = i5;
                int i6 = i5 - 1;
                this.getCiacDecline[i6] = (jArr2[i6] > 0L ? 1 : (jArr2[i6] == 0L ? 0 : -1));
                return 0;
            case 5:
                int i7 = this.getGpoResponse;
                int i8 = i7 - 1;
                this.getGpoResponse = i8;
                int[] iArr2 = this.getCiacDecline;
                int i9 = i7 - 2;
                iArr2[i9] = iArr2[i9] - iArr2[i8];
                return 0;
            case 6:
                long[] jArr3 = this.SdkCoreBusinessLogicModuleImpl;
                int i10 = this.getGpoResponse;
                jArr3[i10] = 0;
                int[] iArr3 = this.getCiacDecline;
                int i11 = i10 - 1;
                int i12 = (jArr3[i11] > 0L ? 1 : (jArr3[i11] == 0L ? 0 : -1));
                iArr3[i11] = i12;
                this.getGpoResponse = i11;
                int i13 = i10 - 2;
                iArr3[i13] = iArr3[i13] - i12;
                return 0;
            case 7:
                int i14 = this.getGpoResponse - this.values;
                this.getGpoResponse = i14;
                this.getPaymentFci = i14;
                return 0;
            case 8:
                java.lang.Object[] objArr2 = this.getDualTapResetTimeout;
                int i15 = this.getPaymentFci;
                this.getPaymentFci = i15 + 1;
                java.lang.Object obj = objArr2[i15];
                objArr2[i15] = null;
                this.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                return 0;
            case 9:
                int[] iArr4 = this.getCiacDecline;
                int i16 = this.getPaymentFci;
                this.getPaymentFci = i16 + 1;
                this.DigitizedCardProfile = iArr4[i16];
                return 0;
            case 10:
                int[] iArr5 = this.getCiacDecline;
                int i17 = this.getGpoResponse - 1;
                iArr5[i17] = (char) iArr5[i17];
                return 0;
            case 11:
                java.lang.Object[] objArr3 = this.getDualTapResetTimeout;
                int i18 = this.getGpoResponse;
                this.getGpoResponse = i18 + 1;
                objArr3[i18] = objArr3[i18 - 1];
                return 0;
            case 12:
                int i19 = this.getGpoResponse - 1;
                this.getGpoResponse = i19;
                java.lang.Object[] objArr4 = this.getDualTapResetTimeout;
                java.lang.Object obj2 = objArr4[i19];
                objArr4[i19] = null;
                this.DigitizedCardProfile = obj2 == null ? 0 : 1;
                return 0;
            case 13:
                java.lang.Object[] objArr5 = this.getDualTapResetTimeout;
                int i20 = this.getGpoResponse;
                int i21 = i20 - 1;
                java.lang.Object obj3 = objArr5[i21];
                objArr5[i21] = null;
                int i22 = i20 - 2;
                java.lang.Object obj4 = objArr5[i22];
                objArr5[i22] = null;
                objArr5[i21] = obj4;
                objArr5[i22] = obj3;
                return 0;
            case 14:
                int i23 = this.getGpoResponse - 1;
                this.getGpoResponse = i23;
                this.getDualTapResetTimeout[i23] = null;
                return 0;
            case 15:
                java.lang.Object[] objArr6 = this.getDualTapResetTimeout;
                int i24 = this.getGpoResponse - 1;
                java.lang.Object obj5 = objArr6[i24];
                objArr6[i24] = null;
                this.SdkCoreAlternateContactlessPaymentDataImpl = obj5;
                return 0;
            case 16:
                int[] iArr6 = this.getCiacDecline;
                int i25 = this.getGpoResponse;
                this.getGpoResponse = i25 + 1;
                iArr6[i25] = 1;
                return 0;
            case 17:
                java.lang.Object[] objArr7 = this.getDualTapResetTimeout;
                int i26 = this.getGpoResponse;
                this.getGpoResponse = i26 + 1;
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
                java.lang.Object[] objArr8 = this.getDualTapResetTimeout;
                int i29 = this.getGpoResponse;
                int i30 = i29 - 1;
                java.lang.Object obj8 = objArr8[i30];
                objArr8[i30] = null;
                int i31 = i29 - 2;
                java.lang.Object obj9 = objArr8[i31];
                objArr8[i31] = null;
                objArr8[i30] = obj9;
                objArr8[i31] = obj8;
                int[] iArr7 = this.getCiacDecline;
                this.getGpoResponse = i29 + 1;
                iArr7[i29] = 0;
                return 0;
            case 19:
                java.lang.Object[] objArr9 = this.getDualTapResetTimeout;
                int i32 = this.getGpoResponse;
                int i33 = i32 - 2;
                java.lang.Object obj10 = objArr9[i33];
                objArr9[i33] = null;
                int i34 = i32 - 1;
                objArr9[i34] = obj10;
                int[] iArr8 = this.getCiacDecline;
                iArr8[i33] = iArr8[i34];
                return 0;
            case 20:
                int i35 = this.getGpoResponse;
                int i36 = i35 - 3;
                this.getGpoResponse = i36;
                java.lang.Object[] objArr10 = this.getDualTapResetTimeout;
                java.lang.Object obj11 = objArr10[i36];
                objArr10[i36] = null;
                int i37 = this.getCiacDecline[i35 - 2];
                int i38 = i35 - 1;
                java.lang.Object obj12 = objArr10[i38];
                objArr10[i38] = null;
                ((java.lang.Object[]) obj11)[i37] = obj12;
                return 0;
            case 21:
                java.lang.Object[] objArr11 = this.getDualTapResetTimeout;
                int i39 = this.getGpoResponse;
                objArr11[i39] = objArr11[i39 - 1];
                int[] iArr9 = this.getCiacDecline;
                this.getGpoResponse = i39 + 2;
                iArr9[i39 + 1] = 0;
                return 0;
            case 22:
                java.lang.Object[] objArr12 = this.getDualTapResetTimeout;
                int i40 = this.getGpoResponse;
                this.getGpoResponse = i40 + 1;
                objArr12[i40] = null;
                objArr12[i40] = null;
                int i41 = i40 - 1;
                java.lang.Object obj13 = objArr12[i41];
                objArr12[i41] = null;
                objArr12[i40] = obj13;
                objArr12[i41] = null;
                return 0;
            case 23:
                java.lang.Object[] objArr13 = this.getDualTapResetTimeout;
                int i42 = this.getGpoResponse;
                this.getGpoResponse = i42 + 1;
                objArr13[i42] = null;
                return 0;
            case 24:
                int[] iArr10 = this.getCiacDecline;
                int i43 = this.getGpoResponse;
                int i44 = i43 + 1;
                iArr10[i43] = 2;
                iArr10[i44] = 2;
                this.getGpoResponse = i44;
                iArr10[i43] = iArr10[i43] % 2;
                return 0;
            case 25:
                int[] iArr11 = this.getCiacDecline;
                int i45 = this.getGpoResponse;
                this.getGpoResponse = i45 + 1;
                iArr11[i45] = 2;
                return 0;
            case 26:
                int i46 = this.getGpoResponse;
                int i47 = i46 - 1;
                this.getGpoResponse = i47;
                int[] iArr12 = this.getCiacDecline;
                int i48 = i46 - 2;
                iArr12[i48] = iArr12[i48] % iArr12[i47];
                int i49 = i46 - 2;
                this.getGpoResponse = i49;
                this.getDualTapResetTimeout[i49] = null;
                return 0;
            case 27:
                int[] iArr13 = this.getCiacDecline;
                int i50 = this.getGpoResponse;
                iArr13[i50] = 41;
                int i51 = i50 - 1;
                int i52 = iArr13[i51] + 41;
                iArr13[i51] = i52;
                this.getGpoResponse = i50 + 1;
                iArr13[i50] = i52;
                return 0;
            case 28:
                int[] iArr14 = this.getCiacDecline;
                int i53 = this.getGpoResponse;
                this.getGpoResponse = i53 + 1;
                iArr14[i53] = 128;
                return 0;
            case 29:
                int i54 = this.getGpoResponse;
                int i55 = i54 - 1;
                this.getGpoResponse = i55;
                int[] iArr15 = this.getCiacDecline;
                int i56 = i54 - 2;
                iArr15[i56] = iArr15[i56] % iArr15[i55];
                return 0;
            case 30:
                int i57 = this.getGpoResponse - 1;
                this.getGpoResponse = i57;
                this.DigitizedCardProfile = this.getCiacDecline[i57] != 0 ? 0 : 1;
                return 0;
            case 31:
                int[] iArr16 = this.getCiacDecline;
                int i58 = this.getGpoResponse;
                this.getGpoResponse = i58 + 1;
                iArr16[i58] = 21;
                return 0;
            case 32:
                int i59 = this.getGpoResponse;
                int i60 = i59 - 1;
                int[] iArr17 = this.getCiacDecline;
                int i61 = i59 - 2;
                int i62 = iArr17[i61] + iArr17[i60];
                iArr17[i61] = i62;
                this.getGpoResponse = i59;
                iArr17[i60] = i62;
                return 0;
            case 33:
                int[] iArr18 = this.getCiacDecline;
                int i63 = this.getGpoResponse;
                iArr18[i63] = 128;
                this.getGpoResponse = i63;
                int i64 = i63 - 1;
                iArr18[i64] = iArr18[i64] % 128;
                return 0;
            case 34:
                int i65 = this.getGpoResponse - 1;
                this.getGpoResponse = i65;
                this.DigitizedCardProfile = this.getCiacDecline[i65] == 0 ? 0 : 1;
                return 0;
            case 35:
                for (int i66 = this.getGpoResponse - 1; i66 >= 0; i66--) {
                    this.getDualTapResetTimeout[i66] = null;
                }
                java.lang.Object[] objArr14 = this.getDualTapResetTimeout;
                this.getGpoResponse = 1;
                objArr14[0] = this.RecordsJson;
                return 0;
            default:
                return i;
        }
    }

    public setFirstBaselineToTopHeight(long j, long j2) {
        long[] jArr = new long[13];
        this.SdkCoreBusinessLogicModuleImpl = jArr;
        jArr[9] = j;
        jArr[11] = j2;
        this.getGpoResponse = 0;
        this.getPaymentFci = -1;
    }
}

package com.payair.hce;

/* loaded from: classes10.dex */
public class revokeSelfPermissionsOnKill {
    public int AlternateContactlessPaymentDataJson;
    public int DigitizedCardProfile;
    public double IccPrivateKeyCrtComponentsJson;
    public java.lang.Object RecordsJson;
    public float SdkCoreAlternateContactlessPaymentDataImpl;
    private int SdkCoreBusinessLogicModuleImpl;
    public double getAid;
    private final long[] getCiacDecline;
    private int getCvrMaskAnd;
    public java.lang.Object getProfileVersion;
    public long valueOf;
    public float values;
    public long writeReplace;
    private final int[] getPaymentFci = new int[12];
    private final float[] getGpoResponse = new float[12];
    private final double[] getCvmResetTimeout = new double[12];
    private final java.lang.Object[] getDualTapResetTimeout = new java.lang.Object[12];

    public int writeReplace(int i) {
        switch (i) {
            case 1:
                int[] iArr = this.getPaymentFci;
                int i2 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i2 + 1;
                iArr[i2] = 1;
                return 0;
            case 2:
                java.lang.Object[] objArr = this.getDualTapResetTimeout;
                int i3 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i3 + 1;
                objArr[i3] = this.getProfileVersion;
                return 0;
            case 3:
                int[] iArr2 = this.getPaymentFci;
                int i4 = this.getCvrMaskAnd;
                iArr2[i4] = 65;
                iArr2[i4 + 1] = 0;
                this.getCvrMaskAnd = i4 + 3;
                iArr2[i4 + 2] = 0;
                return 0;
            case 4:
                int i5 = this.getCvrMaskAnd - this.DigitizedCardProfile;
                this.getCvrMaskAnd = i5;
                this.SdkCoreBusinessLogicModuleImpl = i5;
                return 0;
            case 5:
                int[] iArr3 = this.getPaymentFci;
                int i6 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i6 + 1;
                this.AlternateContactlessPaymentDataJson = iArr3[i6];
                return 0;
            case 6:
                int[] iArr4 = this.getPaymentFci;
                int i7 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i7 + 1;
                iArr4[i7] = this.DigitizedCardProfile;
                return 0;
            case 7:
                long[] jArr = this.getCiacDecline;
                int i8 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i8 + 1;
                jArr[i8] = this.writeReplace;
                return 0;
            case 8:
                int i9 = this.getCvrMaskAnd;
                int i10 = i9 - 1;
                int[] iArr5 = this.getPaymentFci;
                int i11 = i9 - 2;
                iArr5[i11] = iArr5[i11] + iArr5[i10];
                this.getCvrMaskAnd = i9;
                iArr5[i10] = 4;
                return 0;
            case 9:
                long[] jArr2 = this.getCiacDecline;
                int i12 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i12 + 1;
                jArr2[i12] = 0;
                return 0;
            case 10:
                int i13 = this.getCvrMaskAnd;
                int i14 = i13 - 1;
                int[] iArr6 = this.getPaymentFci;
                long[] jArr3 = this.getCiacDecline;
                int i15 = i13 - 2;
                int i16 = (jArr3[i15] > jArr3[i14] ? 1 : (jArr3[i15] == jArr3[i14] ? 0 : -1));
                iArr6[i15] = i16;
                int i17 = i13 - 3;
                iArr6[i17] = iArr6[i17] - i16;
                this.getCvrMaskAnd = i14;
                iArr6[i15] = 3;
                return 0;
            case 11:
                java.lang.Object[] objArr2 = this.getDualTapResetTimeout;
                int i18 = this.SdkCoreBusinessLogicModuleImpl;
                this.SdkCoreBusinessLogicModuleImpl = i18 + 1;
                java.lang.Object obj = objArr2[i18];
                objArr2[i18] = null;
                this.RecordsJson = obj;
                return 0;
            case 12:
                int[] iArr7 = this.getPaymentFci;
                int i19 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i19 + 1;
                iArr7[i19] = 0;
                return 0;
            case 13:
                int i20 = this.getCvrMaskAnd;
                int i21 = i20 - 1;
                this.getCvrMaskAnd = i21;
                int[] iArr8 = this.getPaymentFci;
                int i22 = i20 - 2;
                iArr8[i22] = iArr8[i22] - iArr8[i21];
                return 0;
            case 14:
                java.lang.Object[] objArr3 = this.getDualTapResetTimeout;
                int i23 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i23 + 1;
                objArr3[i23] = objArr3[i23 - 1];
                return 0;
            case 15:
                int i24 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i24;
                java.lang.Object[] objArr4 = this.getDualTapResetTimeout;
                java.lang.Object obj2 = objArr4[i24];
                objArr4[i24] = null;
                this.AlternateContactlessPaymentDataJson = obj2 == null ? 0 : 1;
                return 0;
            case 16:
                java.lang.Object[] objArr5 = this.getDualTapResetTimeout;
                int i25 = this.getCvrMaskAnd;
                int i26 = i25 - 1;
                java.lang.Object obj3 = objArr5[i26];
                objArr5[i26] = null;
                int i27 = i25 - 2;
                java.lang.Object obj4 = objArr5[i27];
                objArr5[i27] = null;
                objArr5[i26] = obj4;
                objArr5[i27] = obj3;
                return 0;
            case 17:
                java.lang.Object[] objArr6 = this.getDualTapResetTimeout;
                int i28 = this.getCvrMaskAnd - 1;
                java.lang.Object obj5 = objArr6[i28];
                objArr6[i28] = null;
                this.RecordsJson = obj5;
                return 0;
            case 18:
                int i29 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i29;
                this.getDualTapResetTimeout[i29] = null;
                return 0;
            case 19:
                java.lang.Object[] objArr7 = this.getDualTapResetTimeout;
                int i30 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i30 + 1;
                int i31 = i30 - 1;
                java.lang.Object obj6 = objArr7[i31];
                objArr7[i31] = null;
                objArr7[i30] = obj6;
                int i32 = i30 - 2;
                java.lang.Object obj7 = objArr7[i32];
                objArr7[i32] = null;
                objArr7[i31] = obj7;
                objArr7[i32] = obj6;
                java.lang.Object obj8 = objArr7[i30];
                objArr7[i30] = null;
                java.lang.Object obj9 = objArr7[i31];
                objArr7[i31] = null;
                objArr7[i30] = obj9;
                objArr7[i31] = obj8;
                return 0;
            case 20:
                java.lang.Object[] objArr8 = this.getDualTapResetTimeout;
                int i33 = this.getCvrMaskAnd;
                int i34 = i33 - 2;
                java.lang.Object obj10 = objArr8[i34];
                objArr8[i34] = null;
                int i35 = i33 - 1;
                objArr8[i35] = obj10;
                int[] iArr9 = this.getPaymentFci;
                int i36 = iArr9[i35];
                iArr9[i34] = i36;
                int i37 = i33 - 3;
                this.getCvrMaskAnd = i37;
                java.lang.Object obj11 = objArr8[i37];
                objArr8[i37] = null;
                java.lang.Object obj12 = objArr8[i35];
                objArr8[i35] = null;
                ((java.lang.Object[]) obj11)[i36] = obj12;
                return 0;
            case 21:
                java.lang.Object[] objArr9 = this.getDualTapResetTimeout;
                int i38 = this.getCvrMaskAnd;
                objArr9[i38] = objArr9[i38 - 1];
                int[] iArr10 = this.getPaymentFci;
                this.getCvrMaskAnd = i38 + 2;
                iArr10[i38 + 1] = 0;
                return 0;
            case 22:
                int i39 = this.getCvrMaskAnd;
                int i40 = i39 - 3;
                this.getCvrMaskAnd = i40;
                java.lang.Object[] objArr10 = this.getDualTapResetTimeout;
                java.lang.Object obj13 = objArr10[i40];
                objArr10[i40] = null;
                int i41 = this.getPaymentFci[i39 - 2];
                int i42 = i39 - 1;
                java.lang.Object obj14 = objArr10[i42];
                objArr10[i42] = null;
                ((java.lang.Object[]) obj13)[i41] = obj14;
                return 0;
            case 23:
                java.lang.Object[] objArr11 = this.getDualTapResetTimeout;
                int i43 = this.getCvrMaskAnd;
                int i44 = i43 - 1;
                java.lang.Object obj15 = objArr11[i44];
                objArr11[i44] = null;
                int i45 = i43 - 2;
                java.lang.Object obj16 = objArr11[i45];
                objArr11[i45] = null;
                objArr11[i44] = obj16;
                objArr11[i45] = obj15;
                this.getCvrMaskAnd = i43 + 1;
                objArr11[i43] = null;
                return 0;
            case 24:
                java.lang.Object[] objArr12 = this.getDualTapResetTimeout;
                int i46 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i46 + 1;
                objArr12[i46] = null;
                return 0;
            case 25:
                java.lang.Object[] objArr13 = this.getDualTapResetTimeout;
                int i47 = this.getCvrMaskAnd;
                objArr13[i47] = null;
                this.getCvrMaskAnd = i47 + 2;
                objArr13[i47 + 1] = null;
                return 0;
            case 26:
                int[] iArr11 = this.getPaymentFci;
                int i48 = this.getCvrMaskAnd;
                iArr11[i48] = 2;
                this.getCvrMaskAnd = i48 + 2;
                iArr11[i48 + 1] = 2;
                return 0;
            case 27:
                int i49 = this.getCvrMaskAnd;
                int i50 = i49 - 1;
                this.getCvrMaskAnd = i50;
                int[] iArr12 = this.getPaymentFci;
                int i51 = i49 - 2;
                iArr12[i51] = iArr12[i51] % iArr12[i50];
                int i52 = i49 - 2;
                this.getCvrMaskAnd = i52;
                this.getDualTapResetTimeout[i52] = null;
                return 0;
            case 28:
                int[] iArr13 = this.getPaymentFci;
                int i53 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i53 + 1;
                iArr13[i53] = 2;
                return 0;
            case 29:
                int[] iArr14 = this.getPaymentFci;
                int i54 = this.getCvrMaskAnd;
                iArr14[i54] = 2;
                this.getCvrMaskAnd = i54;
                int i55 = i54 - 1;
                iArr14[i55] = iArr14[i55] % 2;
                int i56 = i54 - 1;
                this.getCvrMaskAnd = i56;
                this.getDualTapResetTimeout[i56] = null;
                return 0;
            case 30:
                int[] iArr15 = this.getPaymentFci;
                int i57 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i57 + 1;
                iArr15[i57] = 103;
                return 0;
            case 31:
                int i58 = this.getCvrMaskAnd;
                int i59 = i58 - 1;
                this.getCvrMaskAnd = i59;
                int[] iArr16 = this.getPaymentFci;
                int i60 = i58 - 2;
                iArr16[i60] = iArr16[i60] + iArr16[i59];
                return 0;
            case 32:
                int[] iArr17 = this.getPaymentFci;
                int i61 = this.getCvrMaskAnd;
                int i62 = i61 + 1;
                iArr17[i61] = iArr17[i61 - 1];
                iArr17[i62] = 128;
                this.getCvrMaskAnd = i62;
                iArr17[i61] = iArr17[i61] % 128;
                return 0;
            case 33:
                int i63 = this.getCvrMaskAnd;
                int i64 = i63 - 1;
                this.getCvrMaskAnd = i64;
                int[] iArr18 = this.getPaymentFci;
                int i65 = i63 - 2;
                iArr18[i65] = iArr18[i65] % iArr18[i64];
                return 0;
            case 34:
                int i66 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i66;
                this.AlternateContactlessPaymentDataJson = this.getPaymentFci[i66] != 0 ? 0 : 1;
                return 0;
            case 35:
                int[] iArr19 = this.getPaymentFci;
                int i67 = this.getCvrMaskAnd;
                iArr19[i67] = 9;
                int i68 = i67 - 1;
                int i69 = iArr19[i68] + 9;
                iArr19[i68] = i69;
                this.getCvrMaskAnd = i67 + 1;
                iArr19[i67] = i69;
                return 0;
            case 36:
                int[] iArr20 = this.getPaymentFci;
                int i70 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i70 + 1;
                iArr20[i70] = 128;
                return 0;
            case 37:
                int[] iArr21 = this.getPaymentFci;
                int i71 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i71 + 1;
                iArr21[i71] = 3;
                return 0;
            case 38:
                int i72 = this.getCvrMaskAnd;
                int[] iArr22 = this.getPaymentFci;
                int i73 = i72 - 2;
                iArr22[i73] = iArr22[i73] >>> iArr22[i72 - 1];
                int i74 = i72 - 2;
                this.getCvrMaskAnd = i74;
                this.getDualTapResetTimeout[i74] = null;
                return 0;
            case 39:
                int[] iArr23 = this.getPaymentFci;
                int i75 = this.getCvrMaskAnd;
                iArr23[i75] = 65;
                int i76 = i75 - 1;
                int i77 = iArr23[i76] + 65;
                iArr23[i76] = i77;
                this.getCvrMaskAnd = i75 + 1;
                iArr23[i75] = i77;
                return 0;
            case 40:
                int[] iArr24 = this.getPaymentFci;
                int i78 = this.getCvrMaskAnd;
                iArr24[i78] = 128;
                this.getCvrMaskAnd = i78;
                int i79 = i78 - 1;
                iArr24[i79] = iArr24[i79] % 128;
                return 0;
            case 41:
                int i80 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i80;
                this.AlternateContactlessPaymentDataJson = this.getPaymentFci[i80] == 0 ? 0 : 1;
                return 0;
            case 42:
                int[] iArr25 = this.getPaymentFci;
                int i81 = this.getCvrMaskAnd;
                iArr25[i81] = 83;
                this.getCvrMaskAnd = i81 + 2;
                iArr25[i81 + 1] = 1;
                return 0;
            case 43:
                int i82 = this.getCvrMaskAnd;
                int i83 = i82 - 1;
                int[] iArr26 = this.getPaymentFci;
                long[] jArr4 = this.getCiacDecline;
                int i84 = i82 - 2;
                int i85 = (jArr4[i84] > jArr4[i83] ? 1 : (jArr4[i84] == jArr4[i83] ? 0 : -1));
                iArr26[i84] = i85;
                int i86 = i82 - 3;
                iArr26[i86] = iArr26[i86] + i85;
                this.getCvrMaskAnd = i83;
                iArr26[i84] = 4;
                return 0;
            case 44:
                int[] iArr27 = this.getPaymentFci;
                int i87 = this.getCvrMaskAnd - 1;
                this.getCvrMaskAnd = i87;
                this.AlternateContactlessPaymentDataJson = iArr27[i87];
                return 0;
            case 45:
                int[] iArr28 = this.getPaymentFci;
                int i88 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i88 + 1;
                iArr28[i88] = 22;
                return 0;
            case 46:
                int[] iArr29 = this.getPaymentFci;
                int i89 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i89 + 1;
                iArr29[i89] = 47;
                return 0;
            case 47:
                for (int i90 = this.getCvrMaskAnd - 1; i90 >= 0; i90--) {
                    this.getDualTapResetTimeout[i90] = null;
                }
                java.lang.Object[] objArr14 = this.getDualTapResetTimeout;
                this.getCvrMaskAnd = 1;
                objArr14[0] = this.getProfileVersion;
                return 0;
            case 48:
                int[] iArr30 = this.getPaymentFci;
                int i91 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i91 + 1;
                iArr30[i91] = 64;
                return 0;
            case 49:
                int[] iArr31 = this.getPaymentFci;
                int i92 = this.getCvrMaskAnd;
                iArr31[i92] = 24;
                int i93 = i92 - 1;
                int i94 = iArr31[i93] >> 24;
                iArr31[i93] = i94;
                this.getCvrMaskAnd = i93;
                int i95 = i92 - 2;
                iArr31[i95] = iArr31[i95] - i94;
                return 0;
            case 50:
                float[] fArr = this.getGpoResponse;
                int i96 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i96 + 1;
                fArr[i96] = this.values;
                return 0;
            case 51:
                int[] iArr32 = this.getPaymentFci;
                int i97 = this.getCvrMaskAnd;
                iArr32[i97] = 3;
                this.getCvrMaskAnd = i97 + 2;
                iArr32[i97 + 1] = 0;
                return 0;
            case 52:
                float[] fArr2 = this.getGpoResponse;
                int i98 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i98 + 1;
                fArr2[i98] = 0.0f;
                return 0;
            case 53:
                int i99 = this.getCvrMaskAnd;
                int i100 = i99 - 1;
                int[] iArr33 = this.getPaymentFci;
                float[] fArr3 = this.getGpoResponse;
                int i101 = i99 - 2;
                int i102 = (fArr3[i101] > fArr3[i100] ? 1 : (fArr3[i101] == fArr3[i100] ? 0 : -1));
                iArr33[i101] = i102;
                int i103 = i99 - 3;
                iArr33[i103] = iArr33[i103] - i102;
                this.getCvrMaskAnd = i100;
                iArr33[i101] = 3;
                return 0;
            case 54:
                java.lang.Object[] objArr15 = this.getDualTapResetTimeout;
                int i104 = this.getCvrMaskAnd;
                int i105 = i104 - 1;
                java.lang.Object obj17 = objArr15[i105];
                objArr15[i105] = null;
                int i106 = i104 - 2;
                java.lang.Object obj18 = objArr15[i106];
                objArr15[i106] = null;
                objArr15[i105] = obj18;
                objArr15[i106] = obj17;
                int i107 = i104 - 1;
                this.getCvrMaskAnd = i107;
                objArr15[i107] = null;
                return 0;
            case 55:
                java.lang.Object[] objArr16 = this.getDualTapResetTimeout;
                int i108 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i108 + 1;
                int i109 = i108 - 1;
                java.lang.Object obj19 = objArr16[i109];
                objArr16[i109] = null;
                objArr16[i108] = obj19;
                int i110 = i108 - 2;
                java.lang.Object obj20 = objArr16[i110];
                objArr16[i110] = null;
                objArr16[i109] = obj20;
                objArr16[i110] = obj19;
                return 0;
            case 56:
                int[] iArr34 = this.getPaymentFci;
                int i111 = this.getCvrMaskAnd;
                iArr34[i111] = 0;
                java.lang.Object[] objArr17 = this.getDualTapResetTimeout;
                int i112 = i111 - 1;
                java.lang.Object obj21 = objArr17[i112];
                objArr17[i112] = null;
                objArr17[i111] = obj21;
                iArr34[i112] = 0;
                int i113 = i111 - 2;
                this.getCvrMaskAnd = i113;
                java.lang.Object obj22 = objArr17[i113];
                objArr17[i113] = null;
                java.lang.Object obj23 = objArr17[i111];
                objArr17[i111] = null;
                ((java.lang.Object[]) obj22)[0] = obj23;
                return 0;
            case 57:
                java.lang.Object[] objArr18 = this.getDualTapResetTimeout;
                int i114 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i114 + 1;
                objArr18[i114] = null;
                objArr18[i114] = null;
                int i115 = i114 - 1;
                java.lang.Object obj24 = objArr18[i115];
                objArr18[i115] = null;
                objArr18[i114] = obj24;
                objArr18[i115] = null;
                return 0;
            case 59:
                int[] iArr35 = this.getPaymentFci;
                int i116 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i116 + 1;
                iArr35[i116] = 111;
            case 58:
                return 0;
            case 60:
                int i117 = this.getCvrMaskAnd;
                int i118 = i117 - 1;
                int[] iArr36 = this.getPaymentFci;
                int i119 = i117 - 2;
                int i120 = iArr36[i119] + iArr36[i118];
                iArr36[i119] = i120;
                iArr36[i118] = i120;
                this.getCvrMaskAnd = i117 + 1;
                iArr36[i117] = 128;
                return 0;
            case 61:
                int[] iArr37 = this.getPaymentFci;
                int i121 = this.getCvrMaskAnd;
                iArr37[i121] = 2;
                this.getCvrMaskAnd = i121;
                int i122 = i121 - 1;
                iArr37[i122] = iArr37[i122] % 2;
                return 0;
            case 62:
                int[] iArr38 = this.getPaymentFci;
                int i123 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i123 + 1;
                iArr38[i123] = 57;
                return 0;
            case 63:
                int[] iArr39 = this.getPaymentFci;
                int i124 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i124 + 1;
                iArr39[i124] = 36;
                return 0;
            case 64:
                int[] iArr40 = this.getPaymentFci;
                int i125 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i125 + 1;
                iArr40[i125] = 80;
                return 0;
            case 65:
                int i126 = this.getCvrMaskAnd;
                int i127 = i126 - 1;
                int[] iArr41 = this.getPaymentFci;
                int i128 = i126 - 2;
                int i129 = iArr41[i128] * iArr41[i127];
                iArr41[i128] = i129;
                int i130 = i126 - 3;
                iArr41[i130] = iArr41[i130] + i129;
                this.getCvrMaskAnd = i127;
                iArr41[i128] = 2;
                return 0;
            case 66:
                float[] fArr4 = this.getGpoResponse;
                int i131 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i131 + 1;
                fArr4[i131] = 1.0f;
                return 0;
            case 67:
                int i132 = this.getCvrMaskAnd;
                int[] iArr42 = this.getPaymentFci;
                float[] fArr5 = this.getGpoResponse;
                int i133 = i132 - 2;
                int i134 = (fArr5[i133] > fArr5[i132 - 1] ? 1 : (fArr5[i133] == fArr5[i132 - 1] ? 0 : -1));
                iArr42[i133] = i134;
                this.getCvrMaskAnd = i133;
                int i135 = i132 - 3;
                iArr42[i135] = iArr42[i135] >>> i134;
                return 0;
            case 68:
                int i136 = this.getCvrMaskAnd;
                int i137 = i136 - 1;
                this.getCvrMaskAnd = i137;
                int[] iArr43 = this.getPaymentFci;
                int i138 = i136 - 2;
                iArr43[i138] = iArr43[i138] / iArr43[i137];
                return 0;
            case 69:
                int[] iArr44 = this.getPaymentFci;
                int i139 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i139 + 1;
                iArr44[i139] = 4;
                return 0;
            case 70:
                int[] iArr45 = this.getPaymentFci;
                int i140 = this.getCvrMaskAnd;
                this.getCvrMaskAnd = i140 + 1;
                iArr45[i140] = 15;
                return 0;
            default:
                return i;
        }
    }

    public revokeSelfPermissionsOnKill(long j, long j2) {
        long[] jArr = new long[12];
        this.getCiacDecline = jArr;
        jArr[8] = j;
        jArr[10] = j2;
        this.getCvrMaskAnd = 0;
        this.SdkCoreBusinessLogicModuleImpl = -1;
    }
}

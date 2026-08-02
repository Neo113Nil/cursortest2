package com.facetec.sdk;

/* loaded from: classes8.dex */
public class ds {

    /* renamed from: a, reason: collision with root package name */
    public long f3522a;
    public float b;
    public int c;
    public int d;
    public long e;
    public java.lang.Object f;
    public float g;
    public java.lang.Object h;
    public double i;
    public double j;
    private int k;
    private int l;
    private final float[] m;
    private final long[] n;

    /* renamed from: o, reason: collision with root package name */
    private final int[] f3523o;
    private final double[] r;
    private final java.lang.Object[] s;

    public int d(int i) {
        switch (i) {
            case 1:
                int i2 = this.l - this.c;
                this.l = i2;
                this.k = i2;
                return 0;
            case 2:
                java.lang.Object[] objArr = this.s;
                int i3 = this.k;
                this.k = i3 + 1;
                java.lang.Object obj = objArr[i3];
                objArr[i3] = null;
                this.f = obj;
                return 0;
            case 3:
                int[] iArr = this.f3523o;
                int i4 = this.l;
                this.l = i4 + 1;
                iArr[i4] = this.c;
                return 0;
            case 4:
                java.lang.Object[] objArr2 = this.s;
                int i5 = this.l;
                this.l = i5 + 1;
                objArr2[i5] = objArr2[5];
                return 0;
            case 5:
                int i6 = this.l - 1;
                this.l = i6;
                this.d = this.f3523o[i6] == 0 ? 0 : 1;
                return 0;
            case 6:
                java.lang.Object[] objArr3 = this.s;
                int i7 = this.l;
                this.l = i7 + 1;
                objArr3[i7] = this.h;
                return 0;
            case 7:
                int[] iArr2 = this.f3523o;
                int i8 = this.k;
                this.k = i8 + 1;
                this.d = iArr2[i8];
                return 0;
            case 8:
                int[] iArr3 = this.f3523o;
                int i9 = this.l;
                this.l = i9 + 1;
                iArr3[i9] = 1;
                return 0;
            case 9:
                java.lang.Object[] objArr4 = this.s;
                int i10 = this.l;
                this.l = i10 + 1;
                objArr4[i10] = objArr4[i10 - 1];
                return 0;
            case 10:
                int i11 = this.l - 1;
                this.l = i11;
                java.lang.Object[] objArr5 = this.s;
                java.lang.Object obj2 = objArr5[i11];
                objArr5[i11] = null;
                this.d = obj2 != null ? 0 : 1;
                return 0;
            case 11:
                int i12 = this.l - 1;
                this.l = i12;
                java.lang.Object[] objArr6 = this.s;
                java.lang.Object obj3 = objArr6[i12];
                objArr6[i12] = null;
                objArr6[7] = obj3;
                return 0;
            case 12:
                java.lang.Object[] objArr7 = this.s;
                int i13 = this.l;
                this.l = i13 + 1;
                objArr7[i13] = objArr7[7];
                return 0;
            case 13:
                java.lang.Object[] objArr8 = this.s;
                int i14 = this.l;
                java.lang.Object obj4 = objArr8[i14 - 1];
                objArr8[i14] = obj4;
                this.l = i14;
                objArr8[i14] = null;
                objArr8[7] = obj4;
                return 0;
            case 14:
                java.lang.Object[] objArr9 = this.s;
                int i15 = this.l;
                this.l = i15 + 1;
                objArr9[i15] = objArr9[6];
                return 0;
            case 15:
                int[] iArr4 = this.f3523o;
                int i16 = this.l;
                this.l = i16 + 1;
                iArr4[i16] = 0;
                return 0;
            case 16:
                int[] iArr5 = this.f3523o;
                int i17 = this.l;
                int i18 = i17 + 1;
                iArr5[i17] = 2;
                iArr5[i18] = 2;
                this.l = i18;
                iArr5[i17] = iArr5[i17] % 2;
                return 0;
            case 17:
                int i19 = this.l - 1;
                this.l = i19;
                this.s[i19] = null;
                return 0;
            case 19:
                int[] iArr6 = this.f3523o;
                int i20 = this.l;
                iArr6[i20] = 123;
                this.l = i20;
                int i21 = i20 - 1;
                iArr6[i21] = iArr6[i21] + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            case 18:
                return 0;
            case 20:
                int[] iArr7 = this.f3523o;
                int i22 = this.l;
                this.l = i22 + 1;
                iArr7[i22] = iArr7[i22 - 1];
                return 0;
            case 21:
                int[] iArr8 = this.f3523o;
                int i23 = this.l;
                this.l = i23 + 1;
                iArr8[i23] = 128;
                return 0;
            case 22:
                int i24 = this.l;
                int i25 = i24 - 1;
                this.l = i25;
                int[] iArr9 = this.f3523o;
                int i26 = i24 - 2;
                iArr9[i26] = iArr9[i26] % iArr9[i25];
                return 0;
            case 23:
                int[] iArr10 = this.f3523o;
                int i27 = this.l;
                this.l = i27 + 1;
                iArr10[i27] = 2;
                return 0;
            case 24:
                int i28 = this.l - 1;
                this.l = i28;
                this.d = this.f3523o[i28] != 0 ? 0 : 1;
                return 0;
            case 25:
                java.lang.Object[] objArr10 = this.s;
                int i29 = this.l - 1;
                java.lang.Object obj5 = objArr10[i29];
                objArr10[i29] = null;
                this.f = obj5;
                return 0;
            case 26:
                java.lang.Object[] objArr11 = this.s;
                int i30 = this.l;
                this.l = i30 + 1;
                objArr11[i30] = null;
                return 0;
            case 27:
                int[] iArr11 = this.f3523o;
                int i31 = this.l;
                iArr11[i31] = 41;
                int i32 = i31 - 1;
                int i33 = iArr11[i32] + 41;
                iArr11[i32] = i33;
                this.l = i31 + 1;
                iArr11[i31] = i33;
                return 0;
            case 28:
                int[] iArr12 = this.f3523o;
                int i34 = this.l;
                iArr12[i34] = 128;
                this.l = i34;
                int i35 = i34 - 1;
                iArr12[i35] = iArr12[i35] % 128;
                return 0;
            case 29:
                int[] iArr13 = this.f3523o;
                int i36 = this.l;
                this.l = i36 + 1;
                iArr13[i36] = 51;
                return 0;
            case 30:
                int i37 = this.l;
                int i38 = i37 - 1;
                int[] iArr14 = this.f3523o;
                int i39 = i37 - 2;
                int i40 = iArr14[i39] + iArr14[i38];
                iArr14[i39] = i40;
                iArr14[i38] = i40;
                this.l = i37 + 1;
                iArr14[i37] = 128;
                return 0;
            case 31:
                int[] iArr15 = this.f3523o;
                int i41 = this.l;
                int i42 = i41 + 1;
                iArr15[i41] = 47;
                iArr15[i42] = 0;
                this.l = i42;
                iArr15[i41] = iArr15[i41] / 0;
                return 0;
            case 32:
                int[] iArr16 = this.f3523o;
                int i43 = this.l - 1;
                this.l = i43;
                this.d = iArr16[i43];
                return 0;
            case 33:
                int[] iArr17 = this.f3523o;
                int i44 = this.l;
                this.l = i44 + 1;
                iArr17[i44] = 54;
                return 0;
            case 34:
                int[] iArr18 = this.f3523o;
                int i45 = this.l;
                this.l = i45 + 1;
                iArr18[i45] = 82;
                return 0;
            case 35:
                int[] iArr19 = this.f3523o;
                int i46 = this.l;
                this.l = i46 + 1;
                iArr19[i46] = 98;
                return 0;
            case 36:
                int[] iArr20 = this.f3523o;
                int i47 = this.l;
                this.l = i47 + 1;
                iArr20[i47] = 62;
                return 0;
            case 37:
                for (int i48 = this.l - 1; i48 >= 0; i48--) {
                    this.s[i48] = null;
                }
                java.lang.Object[] objArr12 = this.s;
                this.l = 1;
                objArr12[0] = this.h;
                return 0;
            case 38:
                int i49 = this.l - 1;
                this.l = i49;
                java.lang.Object[] objArr13 = this.s;
                java.lang.Object obj6 = objArr13[i49];
                objArr13[i49] = null;
                this.d = obj6 == null ? 0 : 1;
                return 0;
            case 39:
                int[] iArr21 = this.f3523o;
                int i50 = this.l;
                iArr21[i50] = 2;
                this.l = i50;
                int i51 = i50 - 1;
                iArr21[i51] = iArr21[i51] % 2;
                int i52 = i50 - 1;
                this.l = i52;
                this.s[i52] = null;
                return 0;
            case 40:
                int[] iArr22 = this.f3523o;
                int i53 = this.l;
                this.l = i53 + 1;
                iArr22[i53] = 3;
                return 0;
            case 41:
                int i54 = this.l;
                int i55 = i54 - 1;
                this.l = i55;
                int[] iArr23 = this.f3523o;
                int i56 = i54 - 2;
                iArr23[i56] = iArr23[i56] + iArr23[i55];
                return 0;
            case 42:
                int[] iArr24 = this.f3523o;
                int i57 = this.l;
                this.l = i57 + 1;
                iArr24[i57] = 49;
                return 0;
            case 43:
                int[] iArr25 = this.f3523o;
                int i58 = this.l;
                int i59 = i58 + 1;
                iArr25[i58] = iArr25[i58 - 1];
                iArr25[i59] = 128;
                this.l = i59;
                iArr25[i58] = iArr25[i58] % 128;
                return 0;
            case 44:
                int[] iArr26 = this.f3523o;
                int i60 = this.l;
                this.l = i60 + 1;
                iArr26[i60] = 36;
                return 0;
            case 45:
                int[] iArr27 = this.f3523o;
                int i61 = this.l;
                this.l = i61 + 1;
                iArr27[i61] = 0;
                return 0;
            case 46:
                java.lang.Object[] objArr14 = this.s;
                int i62 = this.l;
                this.l = i62 + 1;
                java.lang.Object obj7 = objArr14[7];
                objArr14[i62] = obj7;
                int[] iArr28 = this.f3523o;
                objArr14[i62] = null;
                iArr28[i62] = ((java.lang.Object[]) obj7).length;
                return 0;
            case 47:
                java.lang.Object[] objArr15 = this.s;
                int i63 = this.l;
                java.lang.Object obj8 = objArr15[7];
                objArr15[i63] = obj8;
                this.l = i63;
                objArr15[i63] = null;
                objArr15[8] = obj8;
                return 0;
            case 48:
                int i64 = this.l;
                int i65 = i64 - 1;
                java.lang.Object[] objArr16 = this.s;
                java.lang.Object obj9 = objArr16[i65];
                objArr16[i65] = null;
                objArr16[9] = obj9;
                int[] iArr29 = this.f3523o;
                iArr29[i65] = 0;
                int i66 = i64 - 1;
                this.l = i66;
                iArr29[10] = iArr29[i66];
                return 0;
            case 49:
                int[] iArr30 = this.f3523o;
                int i67 = this.l;
                iArr30[i67] = 0;
                this.l = i67;
                iArr30[11] = 0;
                return 0;
            case 50:
                int[] iArr31 = this.f3523o;
                int i68 = this.l;
                this.l = i68 + 1;
                iArr31[i68] = iArr31[11];
                return 0;
            case 51:
                int i69 = this.l;
                int i70 = i69 - 2;
                this.l = i70;
                int[] iArr32 = this.f3523o;
                this.d = iArr32[i70] >= iArr32[i69 - 1] ? 0 : 1;
                return 0;
            case 52:
                java.lang.Object[] objArr17 = this.s;
                int i71 = this.l;
                this.l = i71 + 1;
                java.lang.Object obj10 = objArr17[8];
                objArr17[i71] = obj10;
                int[] iArr33 = this.f3523o;
                objArr17[i71] = null;
                iArr33[i71] = ((java.lang.Object[]) obj10).length;
                return 0;
            case 53:
                java.lang.Object[] objArr18 = this.s;
                int i72 = this.l;
                int i73 = i72 + 1;
                java.lang.Object obj11 = objArr18[8];
                objArr18[i72] = obj11;
                int[] iArr34 = this.f3523o;
                int i74 = iArr34[11];
                iArr34[i73] = i74;
                this.l = i73;
                objArr18[i72] = null;
                objArr18[i72] = ((java.lang.Object[]) obj11)[i74];
                return 0;
            case 54:
                java.lang.Object[] objArr19 = this.s;
                int i75 = this.l;
                this.l = i75 + 1;
                objArr19[i75] = objArr19[8];
                return 0;
            case 55:
                int[] iArr35 = this.f3523o;
                int i76 = this.l;
                int i77 = iArr35[11];
                iArr35[i76] = i77;
                this.l = i76;
                java.lang.Object[] objArr20 = this.s;
                int i78 = i76 - 1;
                java.lang.Object obj12 = objArr20[i78];
                objArr20[i78] = null;
                objArr20[i78] = ((java.lang.Object[]) obj12)[i77];
                return 0;
            case 56:
                int i79 = this.l;
                int i80 = i79 - 1;
                java.lang.Object[] objArr21 = this.s;
                java.lang.Object obj13 = objArr21[i80];
                objArr21[i80] = null;
                objArr21[12] = obj13;
                this.l = i79;
                objArr21[i80] = objArr21[9];
                return 0;
            case 57:
                java.lang.Object[] objArr22 = this.s;
                int i81 = this.l;
                this.l = i81 + 1;
                objArr22[i81] = objArr22[12];
                return 0;
            case 58:
                java.lang.Object[] objArr23 = this.s;
                int i82 = this.l;
                java.lang.Object obj14 = objArr23[i82 - 1];
                objArr23[i82] = obj14;
                this.l = i82;
                objArr23[i82] = null;
                objArr23[13] = obj14;
                return 0;
            case 59:
                java.lang.Object[] objArr24 = this.s;
                int i83 = this.l;
                this.l = i83 + 1;
                objArr24[i83] = objArr24[13];
                return 0;
            case 60:
                int i84 = this.l - 1;
                this.l = i84;
                int[] iArr36 = this.f3523o;
                iArr36[14] = iArr36[i84];
                return 0;
            case 61:
                java.lang.Object[] objArr25 = this.s;
                int i85 = this.l;
                this.l = i85 + 1;
                objArr25[i85] = objArr25[9];
                return 0;
            case 62:
                int[] iArr37 = this.f3523o;
                int i86 = this.l;
                this.l = i86 + 1;
                iArr37[i86] = iArr37[14];
                return 0;
            case 63:
                int[] iArr38 = this.f3523o;
                int i87 = this.l;
                iArr38[i87] = iArr38[14];
                this.l = i87 + 2;
                iArr38[i87 + 1] = 2;
                return 0;
            case 64:
                int i88 = this.l;
                int i89 = i88 - 2;
                this.l = i89;
                int[] iArr39 = this.f3523o;
                this.d = iArr39[i89] <= iArr39[i88 - 1] ? 0 : 1;
                return 0;
            case 65:
                int[] iArr40 = this.f3523o;
                int i90 = this.l;
                iArr40[i90] = 1;
                this.l = i90;
                iArr40[10] = 1;
                return 0;
            case 66:
                int[] iArr41 = this.f3523o;
                iArr41[11] = iArr41[11] + 1;
                return 0;
            case 67:
                int i91 = this.l;
                int i92 = i91 - 2;
                this.l = i92;
                int[] iArr42 = this.f3523o;
                this.d = iArr42[i92] < iArr42[i91 - 1] ? 0 : 1;
                return 0;
            case 68:
                int[] iArr43 = this.f3523o;
                int i93 = this.l;
                this.l = i93 + 1;
                iArr43[i93] = iArr43[10];
                return 0;
            case 69:
                int i94 = this.l - 1;
                this.l = i94;
                int[] iArr44 = this.f3523o;
                iArr44[11] = iArr44[i94];
                return 0;
            case 70:
                int i95 = this.l;
                int i96 = i95 - 1;
                java.lang.Object[] objArr26 = this.s;
                java.lang.Object obj15 = objArr26[i96];
                objArr26[i96] = null;
                objArr26[9] = obj15;
                int i97 = i95 - 2;
                java.lang.Object obj16 = objArr26[i97];
                objArr26[i97] = null;
                objArr26[8] = obj16;
                this.l = i96;
                objArr26[i97] = objArr26[9];
                return 0;
            case 71:
                int[] iArr45 = this.f3523o;
                int i98 = this.l;
                iArr45[i98] = 640;
                this.l = i98 + 2;
                iArr45[i98 + 1] = 360;
                return 0;
            case 72:
                int i99 = this.l;
                int i100 = i99 - 1;
                java.lang.Object[] objArr27 = this.s;
                java.lang.Object obj17 = objArr27[i100];
                objArr27[i100] = null;
                objArr27[10] = obj17;
                this.l = i99;
                objArr27[i100] = objArr27[8];
                return 0;
            case 73:
                this.m[this.l - 1] = this.f3523o[r2];
                return 0;
            case 74:
                float[] fArr = this.m;
                int i101 = this.l;
                int i102 = i101 - 1;
                float f = this.f3523o[i102];
                fArr[i102] = f;
                this.l = i102;
                int i103 = i101 - 2;
                fArr[i103] = fArr[i103] / f;
                return 0;
            case 75:
                int i104 = this.l - 1;
                this.l = i104;
                float[] fArr2 = this.m;
                fArr2[11] = fArr2[i104];
                return 0;
            case 76:
                java.lang.Object[] objArr28 = this.s;
                int i105 = this.l;
                this.l = i105 + 1;
                objArr28[i105] = objArr28[10];
                return 0;
            case 77:
                int i106 = this.l;
                int i107 = i106 - 1;
                int[] iArr46 = this.f3523o;
                int i108 = i106 - 2;
                int i109 = iArr46[i108] * iArr46[i107];
                iArr46[i108] = i109;
                iArr46[i107] = i109;
                int i110 = i106 - 1;
                this.l = i110;
                iArr46[13] = iArr46[i110];
                return 0;
            case 78:
                int[] iArr47 = this.f3523o;
                int i111 = this.l;
                iArr47[i111] = 2;
                int i112 = i111 - 1;
                iArr47[i112] = iArr47[i112] << 2;
                int i113 = i111 - 1;
                this.l = i113;
                iArr47[14] = iArr47[i113];
                return 0;
            case 79:
                java.lang.Object[] objArr29 = this.s;
                int i114 = this.l;
                int i115 = i114 + 1;
                java.lang.Object obj18 = objArr29[9];
                objArr29[i114] = obj18;
                objArr29[i115] = obj18;
                this.l = i115;
                objArr29[i115] = null;
                objArr29[8] = obj18;
                return 0;
            case 80:
                int[] iArr48 = this.f3523o;
                int i116 = this.l;
                java.lang.Object[] objArr30 = this.s;
                int i117 = i116 - 1;
                java.lang.Object obj19 = objArr30[i117];
                objArr30[i117] = null;
                iArr48[i117] = ((java.lang.Object[]) obj19).length;
                return 0;
            case 81:
                int i118 = this.l;
                int i119 = i118 - 1;
                int[] iArr49 = this.f3523o;
                iArr49[9] = iArr49[i119];
                this.l = i118;
                iArr49[i119] = 0;
                return 0;
            case 82:
                int i120 = this.l - 1;
                this.l = i120;
                int[] iArr50 = this.f3523o;
                iArr50[12] = iArr50[i120];
                return 0;
            case 83:
                int[] iArr51 = this.f3523o;
                int i121 = this.l;
                iArr51[i121] = iArr51[12];
                this.l = i121 + 2;
                iArr51[i121 + 1] = iArr51[9];
                return 0;
            case 84:
                java.lang.Object[] objArr31 = this.s;
                int i122 = this.l;
                objArr31[i122] = objArr31[8];
                int[] iArr52 = this.f3523o;
                this.l = i122 + 2;
                iArr52[i122 + 1] = iArr52[12];
                return 0;
            case 85:
                int i123 = this.l;
                int i124 = i123 - 1;
                this.l = i124;
                java.lang.Object[] objArr32 = this.s;
                int i125 = i123 - 2;
                java.lang.Object obj20 = objArr32[i125];
                objArr32[i125] = null;
                objArr32[i125] = ((java.lang.Object[]) obj20)[this.f3523o[i124]];
                return 0;
            case 86:
                int i126 = this.l - 1;
                this.l = i126;
                java.lang.Object[] objArr33 = this.s;
                java.lang.Object obj21 = objArr33[i126];
                objArr33[i126] = null;
                objArr33[15] = obj21;
                return 0;
            case 87:
                java.lang.Object[] objArr34 = this.s;
                int i127 = this.l;
                this.l = i127 + 1;
                objArr34[i127] = objArr34[15];
                return 0;
            case 88:
                int i128 = this.l;
                int i129 = i128 - 1;
                this.l = i129;
                int[] iArr53 = this.f3523o;
                int i130 = i128 - 2;
                iArr53[i130] = iArr53[i130] * iArr53[i129];
                return 0;
            case 89:
                int i131 = this.l;
                int i132 = i131 - 1;
                int[] iArr54 = this.f3523o;
                iArr54[16] = iArr54[i132];
                this.l = i131;
                iArr54[i132] = iArr54[13];
                return 0;
            case 90:
                int i133 = this.l;
                int i134 = i133 - 2;
                this.l = i134;
                int[] iArr55 = this.f3523o;
                this.d = iArr55[i134] > iArr55[i133 - 1] ? 0 : 1;
                return 0;
            case 91:
                int[] iArr56 = this.f3523o;
                int i135 = this.l;
                iArr56[i135] = iArr56[16];
                this.l = i135 + 2;
                iArr56[i135 + 1] = iArr56[14];
                return 0;
            case 92:
                float[] fArr3 = this.m;
                int i136 = this.l;
                fArr3[i136 - 1] = this.f3523o[r3];
                java.lang.Object[] objArr35 = this.s;
                this.l = i136 + 1;
                objArr35[i136] = objArr35[15];
                return 0;
            case 93:
                int i137 = this.l;
                int i138 = i137 - 1;
                float[] fArr4 = this.m;
                int i139 = i137 - 2;
                float f2 = fArr4[i139] / fArr4[i138];
                fArr4[i139] = f2;
                this.l = i137;
                fArr4[i138] = f2;
                return 0;
            case 94:
                int i140 = this.l - 1;
                this.l = i140;
                float[] fArr5 = this.m;
                fArr5[16] = fArr5[i140];
                return 0;
            case 95:
                float[] fArr6 = this.m;
                int i141 = this.l;
                this.l = i141 + 1;
                fArr6[i141] = this.b;
                return 0;
            case 96:
                int i142 = this.l;
                int i143 = i142 - 1;
                this.l = i143;
                int[] iArr57 = this.f3523o;
                float[] fArr7 = this.m;
                int i144 = i142 - 2;
                iArr57[i144] = (fArr7[i144] > fArr7[i143] ? 1 : (fArr7[i144] == fArr7[i143] ? 0 : -1));
                return 0;
            case 97:
                int i145 = this.l - 1;
                this.l = i145;
                this.d = this.f3523o[i145] > 0 ? 0 : 1;
                return 0;
            case 98:
                java.lang.Object[] objArr36 = this.s;
                int i146 = this.l;
                java.lang.Object obj22 = objArr36[15];
                objArr36[i146] = obj22;
                this.l = i146;
                objArr36[i146] = null;
                objArr36[7] = obj22;
                return 0;
            case 99:
                float[] fArr8 = this.m;
                int i147 = this.l;
                fArr8[i147] = fArr8[16];
                this.l = i147 + 2;
                fArr8[i147 + 1] = fArr8[11];
                return 0;
            case 100:
                int[] iArr58 = this.f3523o;
                iArr58[12] = iArr58[12] + 1;
                return 0;
            case 101:
                java.lang.Object[] objArr37 = this.s;
                int i148 = this.l;
                java.lang.Object obj23 = objArr37[10];
                objArr37[i148] = obj23;
                this.l = i148;
                objArr37[i148] = null;
                objArr37[7] = obj23;
                return 0;
            case 102:
                int i149 = this.l;
                int i150 = i149 - 1;
                java.lang.Object[] objArr38 = this.s;
                java.lang.Object obj24 = objArr38[i150];
                objArr38[i150] = null;
                objArr38[7] = obj24;
                this.l = i149;
                objArr38[i150] = obj24;
                return 0;
            case 103:
                java.lang.Object[] objArr39 = this.s;
                int i151 = this.l;
                objArr39[i151] = objArr39[5];
                objArr39[i151 + 1] = objArr39[6];
                this.l = i151 + 3;
                objArr39[i151 + 2] = objArr39[7];
                return 0;
            case 104:
                int[] iArr59 = this.f3523o;
                int i152 = this.l;
                iArr59[i152] = 2;
                this.l = i152;
                int i153 = i152 - 1;
                iArr59[i153] = iArr59[i153] % 2;
                return 0;
            case 105:
                int i154 = this.l;
                int i155 = i154 - 1;
                this.l = i155;
                int[] iArr60 = this.f3523o;
                int i156 = i154 - 2;
                iArr60[i156] = iArr60[i156] % iArr60[i155];
                int i157 = i154 - 2;
                this.l = i157;
                this.s[i157] = null;
                return 0;
            case 106:
                int[] iArr61 = this.f3523o;
                int i158 = this.l;
                this.l = i158 + 1;
                iArr61[i158] = 33;
                return 0;
            case 107:
                int[] iArr62 = this.f3523o;
                int i159 = this.l;
                this.l = i159 + 1;
                iArr62[i159] = 105;
                return 0;
            case 108:
                int[] iArr63 = this.f3523o;
                int i160 = this.l;
                this.l = i160 + 1;
                iArr63[i160] = 61;
                return 0;
            case 109:
                int[] iArr64 = this.f3523o;
                int i161 = this.l;
                iArr64[i161] = 5;
                int i162 = i161 - 1;
                int i163 = iArr64[i162] + 5;
                iArr64[i162] = i163;
                this.l = i161 + 1;
                iArr64[i161] = i163;
                return 0;
            case 110:
                int[] iArr65 = this.f3523o;
                int i164 = this.l;
                iArr65[i164] = 0;
                this.l = i164;
                iArr65[10] = 0;
                return 0;
            case 111:
                int[] iArr66 = this.f3523o;
                int i165 = this.l;
                this.l = i165 + 1;
                iArr66[i165] = 11;
                return 0;
            case 112:
                int[] iArr67 = this.f3523o;
                int i166 = this.l;
                iArr67[i166] = 57;
                int i167 = i166 - 1;
                int i168 = iArr67[i167] + 57;
                iArr67[i167] = i168;
                this.l = i166 + 1;
                iArr67[i166] = i168;
                return 0;
            case 113:
                int[] iArr68 = this.f3523o;
                int i169 = this.l;
                this.l = i169 + 1;
                iArr68[i169] = 55;
                return 0;
            case 114:
                int i170 = this.l;
                int i171 = i170 - 1;
                this.l = i171;
                int[] iArr69 = this.f3523o;
                int i172 = i170 - 2;
                iArr69[i172] = iArr69[i172] / iArr69[i171];
                int i173 = i170 - 2;
                this.l = i173;
                this.s[i173] = null;
                return 0;
            case 115:
                int[] iArr70 = this.f3523o;
                int i174 = this.l;
                this.l = i174 + 1;
                iArr70[i174] = 53;
                return 0;
            case 116:
                int i175 = this.l;
                int i176 = i175 - 1;
                int[] iArr71 = this.f3523o;
                int i177 = i175 - 2;
                int i178 = iArr71[i177] + iArr71[i176];
                iArr71[i177] = i178;
                this.l = i175;
                iArr71[i176] = i178;
                return 0;
            case 117:
                int[] iArr72 = this.f3523o;
                int i179 = this.l;
                this.l = i179 + 1;
                iArr72[i179] = 4;
                return 0;
            case 118:
                int[] iArr73 = this.f3523o;
                int i180 = this.l;
                iArr73[i180] = 0;
                this.l = i180;
                int i181 = i180 - 1;
                iArr73[i181] = iArr73[i181] / 0;
                int i182 = i180 - 1;
                this.l = i182;
                this.s[i182] = null;
                return 0;
            case 119:
                int[] iArr74 = this.f3523o;
                int i183 = this.l;
                this.l = i183 + 1;
                iArr74[i183] = 50;
                return 0;
            case 120:
                int[] iArr75 = this.f3523o;
                int i184 = this.l;
                this.l = i184 + 1;
                iArr75[i184] = 58;
                return 0;
            case 121:
                int[] iArr76 = this.f3523o;
                int i185 = this.l;
                this.l = i185 + 1;
                iArr76[i185] = 74;
                return 0;
            case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                int[] iArr77 = this.f3523o;
                int i186 = this.l;
                this.l = i186 + 1;
                iArr77[i186] = 19;
                return 0;
            default:
                return i;
        }
    }

    public ds(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.f3523o = new int[17];
        this.n = new long[17];
        this.m = new float[17];
        this.r = new double[17];
        java.lang.Object[] objArr = new java.lang.Object[17];
        this.s = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
        this.l = 0;
        this.k = -1;
    }

    public ds(java.lang.Object obj) {
        this.f3523o = new int[17];
        this.n = new long[17];
        this.m = new float[17];
        this.r = new double[17];
        java.lang.Object[] objArr = new java.lang.Object[17];
        this.s = objArr;
        objArr[5] = obj;
        this.l = 0;
        this.k = -1;
    }

    public ds(java.lang.Object obj, java.lang.Object obj2) {
        this.f3523o = new int[17];
        this.n = new long[17];
        this.m = new float[17];
        this.r = new double[17];
        java.lang.Object[] objArr = new java.lang.Object[17];
        this.s = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        this.l = 0;
        this.k = -1;
    }
}

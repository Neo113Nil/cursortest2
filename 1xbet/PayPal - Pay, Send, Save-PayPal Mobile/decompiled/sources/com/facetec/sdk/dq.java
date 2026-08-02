package com.facetec.sdk;

/* loaded from: classes8.dex */
public class dq {

    /* renamed from: a, reason: collision with root package name */
    public float f3518a;
    public int b;
    public long c;
    public long d;
    public int e;
    public java.lang.Object f;
    public double g;
    public double h;
    public float i;
    public java.lang.Object j;
    private final long[] k;
    private final int[] l;
    private int m;
    private final float[] n;

    /* renamed from: o, reason: collision with root package name */
    private int f3519o;
    private final double[] r;
    private final java.lang.Object[] t;

    public int a(int i) {
        java.lang.Object[] objArr = null;
        switch (i) {
            case 1:
                int i2 = this.f3519o - this.e;
                this.f3519o = i2;
                this.m = i2;
                return 0;
            case 2:
                int[] iArr = this.l;
                int i3 = this.m;
                this.m = i3 + 1;
                this.b = iArr[i3];
                return 0;
            case 3:
                int[] iArr2 = this.l;
                int i4 = this.f3519o;
                this.f3519o = i4 + 1;
                iArr2[i4] = 1;
                return 0;
            case 4:
                int[] iArr3 = this.l;
                int i5 = this.f3519o;
                this.f3519o = i5 + 1;
                iArr3[i5] = this.e;
                return 0;
            case 5:
                int i6 = this.f3519o - 1;
                this.f3519o = i6;
                this.b = this.l[i6] == 0 ? 0 : 1;
                return 0;
            case 6:
                java.lang.Object[] objArr2 = this.t;
                int i7 = this.f3519o;
                this.f3519o = i7 + 1;
                objArr2[i7] = this.j;
                return 0;
            case 7:
                java.lang.Object[] objArr3 = this.t;
                int i8 = this.m;
                this.m = i8 + 1;
                java.lang.Object obj = objArr3[i8];
                objArr3[i8] = null;
                this.f = obj;
                return 0;
            case 8:
                java.lang.Object[] objArr4 = this.t;
                int i9 = this.f3519o - 1;
                java.lang.Object obj2 = objArr4[i9];
                objArr4[i9] = null;
                this.f = obj2;
                return 0;
            case 9:
                java.lang.Object[] objArr5 = this.t;
                int i10 = this.f3519o;
                objArr5[i10] = objArr5[5];
                int[] iArr4 = this.l;
                this.f3519o = i10 + 2;
                iArr4[i10 + 1] = 1;
                return 0;
            case 10:
                java.lang.Object[] objArr6 = this.t;
                int i11 = this.f3519o;
                this.f3519o = i11 + 1;
                objArr6[i11] = objArr6[5];
                return 0;
            case 11:
                java.lang.Object[] objArr7 = this.t;
                int i12 = this.f3519o;
                this.f3519o = i12 + 1;
                objArr7[i12] = null;
                return 0;
            case 12:
                int i13 = this.f3519o;
                int i14 = i13 - 2;
                this.f3519o = i14;
                java.lang.Object[] objArr8 = this.t;
                java.lang.Object obj3 = objArr8[i14];
                objArr8[i14] = null;
                int i15 = i13 - 1;
                java.lang.Object obj4 = objArr8[i15];
                objArr8[i15] = null;
                this.b = obj3 != obj4 ? 0 : 1;
                return 0;
            case 13:
                java.lang.Object[] objArr9 = this.t;
                int i16 = this.f3519o;
                this.f3519o = i16 + 1;
                objArr9[i16] = objArr9[9];
                return 0;
            case 14:
                java.lang.Object[] objArr10 = this.t;
                int i17 = this.f3519o;
                this.f3519o = i17 + 1;
                objArr10[i17] = objArr10[6];
                return 0;
            case 15:
                int i18 = this.f3519o - 1;
                this.f3519o = i18;
                java.lang.Object[] objArr11 = this.t;
                java.lang.Object obj5 = objArr11[i18];
                objArr11[i18] = null;
                this.b = obj5 != null ? 0 : 1;
                return 0;
            case 16:
                java.lang.Object[] objArr12 = this.t;
                int i19 = this.f3519o;
                objArr12[i19] = objArr12[5];
                this.f3519o = i19 + 2;
                objArr12[i19 + 1] = objArr12[9];
                return 0;
            case 17:
                int[] iArr5 = this.l;
                int i20 = this.f3519o;
                this.f3519o = i20 + 1;
                iArr5[i20] = 0;
                return 0;
            case 18:
                java.lang.Object[] objArr13 = this.t;
                int i21 = this.f3519o;
                objArr13[i21] = objArr13[7];
                objArr13[i21 + 1] = objArr13[5];
                this.f3519o = i21 + 3;
                objArr13[i21 + 2] = objArr13[9];
                return 0;
            case 19:
                int i22 = this.f3519o - 1;
                this.f3519o = i22;
                this.t[i22] = null;
                return 0;
            case 20:
                java.lang.Object[] objArr14 = this.t;
                int i23 = this.f3519o;
                objArr14[i23] = objArr14[9];
                int[] iArr6 = this.l;
                this.f3519o = i23 + 2;
                iArr6[i23 + 1] = 0;
                return 0;
            case 21:
                int[] iArr7 = this.l;
                int i24 = this.f3519o;
                this.f3519o = i24 + 1;
                iArr7[i24] = 2;
                return 0;
            case 22:
                int i25 = this.f3519o;
                int i26 = i25 - 1;
                this.f3519o = i26;
                int[] iArr8 = this.l;
                int i27 = i25 - 2;
                iArr8[i27] = iArr8[i27] % iArr8[i26];
                int i28 = i25 - 2;
                this.f3519o = i28;
                this.t[i28] = null;
                return 0;
            case 24:
                int[] iArr9 = this.l;
                int i29 = this.f3519o;
                iArr9[i29] = 2;
                this.f3519o = i29;
                int i30 = i29 - 1;
                iArr9[i30] = iArr9[i30] % 2;
                int i31 = i29 - 1;
                this.f3519o = i31;
                this.t[i31] = null;
            case 23:
                return 0;
            case 25:
                int[] iArr10 = this.l;
                int i32 = this.f3519o;
                this.f3519o = i32 + 1;
                iArr10[i32] = 31;
                return 0;
            case 26:
                int i33 = this.f3519o;
                int i34 = i33 - 1;
                int[] iArr11 = this.l;
                int i35 = i33 - 2;
                int i36 = iArr11[i35] + iArr11[i34];
                iArr11[i35] = i36;
                iArr11[i34] = i36;
                this.f3519o = i33 + 1;
                iArr11[i33] = 128;
                return 0;
            case 27:
                int i37 = this.f3519o;
                int i38 = i37 - 1;
                this.f3519o = i38;
                int[] iArr12 = this.l;
                int i39 = i37 - 2;
                iArr12[i39] = iArr12[i39] % iArr12[i38];
                return 0;
            case 28:
                int i40 = this.f3519o - 1;
                this.f3519o = i40;
                this.b = this.l[i40] != 0 ? 0 : 1;
                return 0;
            case 29:
                int[] iArr13 = this.l;
                int i41 = this.f3519o;
                iArr13[i41] = 2;
                this.f3519o = i41;
                int i42 = i41 - 1;
                iArr13[i42] = iArr13[i42] % 2;
                return 0;
            case 30:
                int[] iArr14 = this.l;
                int i43 = this.f3519o;
                this.f3519o = i43 + 1;
                iArr14[i43] = 1;
                return 0;
            case 31:
                int i44 = this.f3519o;
                int i45 = i44 - 1;
                int[] iArr15 = this.l;
                int i46 = i44 - 2;
                int i47 = iArr15[i46] + iArr15[i45];
                iArr15[i46] = i47;
                this.f3519o = i44;
                iArr15[i45] = i47;
                return 0;
            case 32:
                int[] iArr16 = this.l;
                int i48 = this.f3519o;
                this.f3519o = i48 + 1;
                iArr16[i48] = 128;
                return 0;
            case 33:
                int[] iArr17 = this.l;
                int i49 = this.f3519o;
                this.f3519o = i49 + 1;
                iArr17[i49] = 5;
                return 0;
            case 34:
                int i50 = this.f3519o;
                int i51 = i50 - 1;
                this.f3519o = i51;
                int[] iArr18 = this.l;
                int i52 = i50 - 2;
                iArr18[i52] = iArr18[i52] << iArr18[i51];
                return 0;
            case 35:
                int[] iArr19 = this.l;
                int i53 = this.f3519o;
                iArr19[i53] = 59;
                int i54 = i53 - 1;
                int i55 = iArr19[i54] + 59;
                iArr19[i54] = i55;
                this.f3519o = i53 + 1;
                iArr19[i53] = i55;
                return 0;
            case 36:
                int[] iArr20 = this.l;
                int i56 = this.f3519o;
                this.f3519o = i56 + 1;
                iArr20[i56] = 103;
                return 0;
            case 37:
                int i57 = this.f3519o;
                int i58 = i57 - 1;
                this.f3519o = i58;
                int[] iArr21 = this.l;
                int i59 = i57 - 2;
                iArr21[i59] = iArr21[i59] + iArr21[i58];
                return 0;
            case 38:
                int[] iArr22 = this.l;
                int i60 = this.f3519o;
                this.f3519o = i60 + 1;
                iArr22[i60] = iArr22[i60 - 1];
                return 0;
            case 39:
                int[] iArr23 = this.l;
                int i61 = this.f3519o - 1;
                this.f3519o = i61;
                this.b = iArr23[i61];
                return 0;
            case 40:
                int[] iArr24 = this.l;
                int i62 = this.f3519o;
                this.f3519o = i62 + 1;
                iArr24[i62] = 26;
                return 0;
            case 41:
                int[] iArr25 = this.l;
                int i63 = this.f3519o;
                this.f3519o = i63 + 1;
                iArr25[i63] = 36;
                return 0;
            case 42:
                java.lang.Object[] objArr15 = this.t;
                int i64 = this.f3519o;
                objArr15[i64] = objArr15[5];
                objArr15[i64 + 1] = objArr15[9];
                int[] iArr26 = this.l;
                this.f3519o = i64 + 3;
                iArr26[i64 + 2] = 1;
                return 0;
            case 43:
                java.lang.Object[] objArr16 = this.t;
                int i65 = this.f3519o;
                this.f3519o = i65 + 1;
                objArr16[i65] = objArr16[8];
                return 0;
            case 44:
                java.lang.Object[] objArr17 = this.t;
                int i66 = this.f3519o;
                objArr17[i66] = objArr17[5];
                objArr17[i66 + 1] = objArr17[9];
                int[] iArr27 = this.l;
                this.f3519o = i66 + 3;
                iArr27[i66 + 2] = 0;
                return 0;
            case 45:
                java.lang.Object[] objArr18 = this.t;
                int i67 = this.f3519o;
                this.f3519o = i67 + 1;
                objArr18[i67] = objArr18[7];
                return 0;
            case 46:
                java.lang.Object[] objArr19 = this.t;
                int i68 = this.f3519o;
                objArr19[i68] = objArr19[8];
                objArr19[i68 + 1] = objArr19[5];
                this.f3519o = i68 + 3;
                objArr19[i68 + 2] = objArr19[9];
                return 0;
            case 47:
                java.lang.Object[] objArr20 = this.t;
                int i69 = this.f3519o;
                objArr20[i69] = objArr20[6];
                this.f3519o = i69 + 2;
                objArr20[i69 + 1] = objArr20[7];
                return 0;
            case 48:
                int[] iArr28 = this.l;
                int i70 = this.f3519o;
                iArr28[i70] = 2;
                this.f3519o = i70 + 2;
                iArr28[i70 + 1] = 2;
                return 0;
            case 49:
                int[] iArr29 = this.l;
                int i71 = this.f3519o;
                this.f3519o = i71 + 1;
                iArr29[i71] = 47;
                return 0;
            case 50:
                int[] iArr30 = this.l;
                int i72 = this.f3519o;
                int i73 = i72 + 1;
                iArr30[i72] = iArr30[i72 - 1];
                iArr30[i73] = 128;
                this.f3519o = i73;
                iArr30[i72] = iArr30[i72] % 128;
                return 0;
            case 51:
                java.lang.Object[] objArr21 = this.t;
                int i74 = this.f3519o;
                this.f3519o = i74 + 1;
                objArr21[i74] = null;
                int[] iArr31 = this.l;
                objArr21[i74] = null;
                iArr31[i74] = objArr.length;
                return 0;
            case 52:
                int[] iArr32 = this.l;
                int i75 = this.f3519o;
                this.f3519o = i75 + 1;
                iArr32[i75] = 39;
                return 0;
            case 53:
                int[] iArr33 = this.l;
                int i76 = this.f3519o;
                iArr33[i76] = 128;
                this.f3519o = i76;
                int i77 = i76 - 1;
                iArr33[i77] = iArr33[i77] % 128;
                return 0;
            case 54:
                int[] iArr34 = this.l;
                int i78 = this.f3519o;
                iArr34[i78] = 73;
                int i79 = i78 - 1;
                int i80 = iArr34[i79] + 73;
                iArr34[i79] = i80;
                this.f3519o = i78 + 1;
                iArr34[i78] = i80;
                return 0;
            case 55:
                java.lang.Object[] objArr22 = this.t;
                int i81 = this.f3519o;
                objArr22[i81] = objArr22[9];
                int[] iArr35 = this.l;
                this.f3519o = i81 + 2;
                iArr35[i81 + 1] = 1;
                return 0;
            case 56:
                int[] iArr36 = this.l;
                int i82 = this.f3519o;
                this.f3519o = i82 + 1;
                iArr36[i82] = 49;
                return 0;
            case 57:
                int[] iArr37 = this.l;
                int i83 = this.f3519o;
                this.f3519o = i83 + 1;
                iArr37[i83] = 87;
                return 0;
            case 58:
                int[] iArr38 = this.l;
                int i84 = this.f3519o;
                this.f3519o = i84 + 1;
                iArr38[i84] = 66;
                return 0;
            case 59:
                int[] iArr39 = this.l;
                int i85 = this.f3519o;
                this.f3519o = i85 + 1;
                iArr39[i85] = 29;
                return 0;
            case 60:
                int[] iArr40 = this.l;
                int i86 = this.f3519o;
                this.f3519o = i86 + 1;
                iArr40[i86] = 76;
                return 0;
            case 61:
                int[] iArr41 = this.l;
                int i87 = this.f3519o;
                this.f3519o = i87 + 1;
                iArr41[i87] = 83;
                return 0;
            case 62:
                int[] iArr42 = this.l;
                int i88 = this.f3519o;
                this.f3519o = i88 + 1;
                iArr42[i88] = 23;
                return 0;
            case 63:
                for (int i89 = this.f3519o - 1; i89 >= 0; i89--) {
                    this.t[i89] = null;
                }
                java.lang.Object[] objArr23 = this.t;
                this.f3519o = 1;
                objArr23[0] = this.j;
                return 0;
            case 64:
                java.lang.Object[] objArr24 = this.t;
                int i90 = this.f3519o;
                java.lang.Object obj6 = objArr24[5];
                objArr24[i90] = obj6;
                this.f3519o = i90 + 2;
                objArr24[i90 + 1] = obj6;
                return 0;
            case 65:
                int[] iArr43 = this.l;
                int i91 = this.f3519o;
                this.f3519o = i91 + 1;
                iArr43[i91] = 55;
                return 0;
            case 66:
                int[] iArr44 = this.l;
                int i92 = this.f3519o;
                this.f3519o = i92 + 1;
                iArr44[i92] = 56;
                return 0;
            case 67:
                int[] iArr45 = this.l;
                int i93 = this.f3519o;
                iArr45[i93] = 0;
                this.f3519o = i93;
                int i94 = i93 - 1;
                iArr45[i94] = iArr45[i94] / 0;
                int i95 = i93 - 1;
                this.f3519o = i95;
                this.t[i95] = null;
                return 0;
            case 68:
                int[] iArr46 = this.l;
                int i96 = this.f3519o;
                this.f3519o = i96 + 1;
                iArr46[i96] = 33;
                return 0;
            case 69:
                int[] iArr47 = this.l;
                int i97 = this.f3519o;
                this.f3519o = i97 + 1;
                iArr47[i97] = 16;
                return 0;
            case 70:
                java.lang.Object[] objArr25 = this.t;
                int i98 = this.f3519o;
                this.f3519o = i98 + 1;
                objArr25[i98] = objArr25[i98 - 1];
                return 0;
            case 71:
                int i99 = this.f3519o - 1;
                this.f3519o = i99;
                java.lang.Object[] objArr26 = this.t;
                java.lang.Object obj7 = objArr26[i99];
                objArr26[i99] = null;
                objArr26[6] = obj7;
                return 0;
            case 72:
                java.lang.Object[] objArr27 = this.t;
                int i100 = this.f3519o;
                objArr27[i100] = objArr27[5];
                this.f3519o = i100 + 2;
                objArr27[i100 + 1] = objArr27[8];
                return 0;
            case 73:
                int[] iArr48 = this.l;
                int i101 = this.f3519o;
                this.f3519o = i101 + 1;
                iArr48[i101] = 91;
                return 0;
            case 74:
                int[] iArr49 = this.l;
                int i102 = this.f3519o;
                iArr49[i102] = 31;
                this.f3519o = i102;
                int i103 = i102 - 1;
                iArr49[i103] = iArr49[i103] + 31;
                return 0;
            case 75:
                int[] iArr50 = this.l;
                int i104 = this.f3519o;
                iArr50[i104] = iArr50[i104 - 1];
                this.f3519o = i104 + 2;
                iArr50[i104 + 1] = 128;
                return 0;
            case 76:
                int i105 = this.f3519o;
                int i106 = i105 - 1;
                java.lang.Object[] objArr28 = this.t;
                objArr28[i106] = null;
                this.f3519o = i105;
                objArr28[i106] = objArr28[5];
                return 0;
            case 77:
                int[] iArr51 = this.l;
                int i107 = this.f3519o;
                this.f3519o = i107 + 1;
                iArr51[i107] = 41;
                return 0;
            case 78:
                int[] iArr52 = this.l;
                int i108 = this.f3519o;
                int i109 = i108 + 1;
                iArr52[i108] = 3;
                iArr52[i109] = 0;
                this.f3519o = i109;
                iArr52[i108] = iArr52[i108] / 0;
                return 0;
            case 79:
                int[] iArr53 = this.l;
                int i110 = this.f3519o;
                this.f3519o = i110 + 1;
                iArr53[i110] = 79;
                return 0;
            case 80:
                int[] iArr54 = this.l;
                int i111 = this.f3519o;
                iArr54[i111] = 77;
                int i112 = i111 - 1;
                int i113 = iArr54[i112] + 77;
                iArr54[i112] = i113;
                this.f3519o = i111 + 1;
                iArr54[i111] = i113;
                return 0;
            case 81:
                int[] iArr55 = this.l;
                int i114 = this.f3519o;
                this.f3519o = i114 + 1;
                iArr55[i114] = 40;
                return 0;
            case 82:
                int[] iArr56 = this.l;
                int i115 = this.f3519o;
                iArr56[i115] = 0;
                this.f3519o = i115;
                int i116 = i115 - 1;
                iArr56[i116] = iArr56[i116] / 0;
                return 0;
            case 83:
                int[] iArr57 = this.l;
                int i117 = this.f3519o;
                this.f3519o = i117 + 1;
                iArr57[i117] = 109;
                return 0;
            case 84:
                int[] iArr58 = this.l;
                int i118 = this.f3519o;
                java.lang.Object[] objArr29 = this.t;
                int i119 = i118 - 1;
                java.lang.Object obj8 = objArr29[i119];
                objArr29[i119] = null;
                iArr58[i119] = ((int[]) obj8).length;
                return 0;
            case 85:
                int[] iArr59 = this.l;
                int i120 = this.f3519o;
                this.f3519o = i120 + 1;
                iArr59[i120] = 10;
                return 0;
            case 86:
                int[] iArr60 = this.l;
                int i121 = this.f3519o;
                this.f3519o = i121 + 1;
                iArr60[i121] = 58;
                return 0;
            default:
                return i;
        }
    }

    public dq() {
        this.l = new int[10];
        this.k = new long[10];
        this.n = new float[10];
        this.r = new double[10];
        this.t = new java.lang.Object[10];
        this.f3519o = 0;
        this.m = -1;
    }

    public dq(java.lang.Object obj) {
        this.l = new int[10];
        this.k = new long[10];
        this.n = new float[10];
        this.r = new double[10];
        java.lang.Object[] objArr = new java.lang.Object[10];
        this.t = objArr;
        objArr[5] = obj;
        this.f3519o = 0;
        this.m = -1;
    }

    public dq(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        this.l = new int[10];
        this.k = new long[10];
        this.n = new float[10];
        this.r = new double[10];
        java.lang.Object[] objArr = new java.lang.Object[10];
        this.t = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
        objArr[8] = obj4;
        this.f3519o = 0;
        this.m = -1;
    }

    public dq(java.lang.Object obj, java.lang.Object obj2) {
        this.l = new int[10];
        this.k = new long[10];
        this.n = new float[10];
        this.r = new double[10];
        java.lang.Object[] objArr = new java.lang.Object[10];
        this.t = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        this.f3519o = 0;
        this.m = -1;
    }

    public dq(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        this.l = new int[10];
        this.k = new long[10];
        this.n = new float[10];
        this.r = new double[10];
        java.lang.Object[] objArr = new java.lang.Object[10];
        this.t = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
        objArr[8] = obj4;
        objArr[9] = obj5;
        this.f3519o = 0;
        this.m = -1;
    }
}

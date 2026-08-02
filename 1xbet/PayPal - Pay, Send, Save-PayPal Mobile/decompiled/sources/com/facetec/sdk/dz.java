package com.facetec.sdk;

/* loaded from: classes8.dex */
public class dz {

    /* renamed from: a, reason: collision with root package name */
    public int f3534a;
    public long b;
    public int c;
    public float d;
    public long e;
    public java.lang.Object f;
    public float g;
    public double h;
    public double i;
    public java.lang.Object j;
    private final float[] k;
    private final long[] l;
    private final int[] m;
    private int n;

    /* renamed from: o, reason: collision with root package name */
    private int f3535o;
    private final double[] r;
    private final java.lang.Object[] s;

    public int c(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.l;
                int i2 = this.f3535o;
                this.f3535o = i2 + 1;
                jArr[i2] = jArr[4];
                return 0;
            case 2:
                java.lang.Object[] objArr = this.s;
                int i3 = this.f3535o;
                this.f3535o = i3 + 1;
                objArr[i3] = objArr[6];
                return 0;
            case 3:
                java.lang.Object[] objArr2 = this.s;
                int i4 = this.f3535o;
                this.f3535o = i4 + 1;
                objArr2[i4] = objArr2[7];
                return 0;
            case 4:
                int i5 = this.f3535o - this.c;
                this.f3535o = i5;
                this.n = i5;
                return 0;
            case 5:
                long[] jArr2 = this.l;
                int i6 = this.n;
                this.n = i6 + 1;
                this.b = jArr2[i6];
                return 0;
            case 6:
                java.lang.Object[] objArr3 = this.s;
                int i7 = this.n;
                this.n = i7 + 1;
                java.lang.Object obj = objArr3[i7];
                objArr3[i7] = null;
                this.j = obj;
                return 0;
            case 7:
                int[] iArr = this.m;
                int i8 = this.f3535o;
                int i9 = i8 + 1;
                iArr[i8] = 2;
                iArr[i9] = 2;
                this.f3535o = i9;
                iArr[i8] = iArr[i8] % 2;
                return 0;
            case 8:
                int i10 = this.f3535o - 1;
                this.f3535o = i10;
                this.s[i10] = null;
                return 0;
            case 10:
                int[] iArr2 = this.m;
                int i11 = this.f3535o;
                this.f3535o = i11 + 1;
                iArr2[i11] = this.c;
            case 9:
                return 0;
            case 11:
                int[] iArr3 = this.m;
                int i12 = this.f3535o;
                this.f3535o = i12 + 1;
                iArr3[i12] = 25;
                return 0;
            case 12:
                int i13 = this.f3535o;
                int i14 = i13 - 1;
                int[] iArr4 = this.m;
                int i15 = i13 - 2;
                int i16 = iArr4[i15] + iArr4[i14];
                iArr4[i15] = i16;
                this.f3535o = i13;
                iArr4[i14] = i16;
                return 0;
            case 13:
                int[] iArr5 = this.m;
                int i17 = this.f3535o;
                this.f3535o = i17 + 1;
                iArr5[i17] = 128;
                return 0;
            case 14:
                int i18 = this.f3535o;
                int i19 = i18 - 1;
                this.f3535o = i19;
                int[] iArr6 = this.m;
                int i20 = i18 - 2;
                iArr6[i20] = iArr6[i20] % iArr6[i19];
                return 0;
            case 15:
                int[] iArr7 = this.m;
                int i21 = this.n;
                this.n = i21 + 1;
                this.f3534a = iArr7[i21];
                return 0;
            case 16:
                int i22 = this.f3535o - 1;
                this.f3535o = i22;
                this.f3534a = this.m[i22] == 0 ? 0 : 1;
                return 0;
            case 17:
                int[] iArr8 = this.m;
                int i23 = this.f3535o;
                iArr8[i23] = 2;
                this.f3535o = i23;
                int i24 = i23 - 1;
                iArr8[i24] = iArr8[i24] % 2;
                return 0;
            case 18:
                java.lang.Object[] objArr4 = this.s;
                int i25 = this.f3535o - 1;
                java.lang.Object obj2 = objArr4[i25];
                objArr4[i25] = null;
                this.j = obj2;
                return 0;
            case 19:
                java.lang.Object[] objArr5 = this.s;
                int i26 = this.f3535o;
                this.f3535o = i26 + 1;
                objArr5[i26] = null;
                return 0;
            case 20:
                int[] iArr9 = this.m;
                int i27 = this.f3535o;
                java.lang.Object[] objArr6 = this.s;
                int i28 = i27 - 1;
                java.lang.Object obj3 = objArr6[i28];
                objArr6[i28] = null;
                iArr9[i28] = ((int[]) obj3).length;
                return 0;
            case 21:
                int[] iArr10 = this.m;
                int i29 = this.f3535o;
                iArr10[i29] = 31;
                int i30 = i29 - 1;
                int i31 = iArr10[i30] + 31;
                iArr10[i30] = i31;
                this.f3535o = i29 + 1;
                iArr10[i29] = i31;
                return 0;
            case 22:
                int[] iArr11 = this.m;
                int i32 = this.f3535o;
                this.f3535o = i32 + 1;
                iArr11[i32] = 2;
                return 0;
            case 23:
                int i33 = this.f3535o - 1;
                this.f3535o = i33;
                this.f3534a = this.m[i33] != 0 ? 0 : 1;
                return 0;
            case 24:
                long[] jArr3 = this.l;
                int i34 = this.f3535o;
                jArr3[i34] = jArr3[4];
                java.lang.Object[] objArr7 = this.s;
                this.f3535o = i34 + 2;
                objArr7[i34 + 1] = objArr7[6];
                return 0;
            case 25:
                int[] iArr12 = this.m;
                int i35 = this.f3535o - 1;
                this.f3535o = i35;
                this.f3534a = iArr12[i35];
                return 0;
            case 26:
                int[] iArr13 = this.m;
                int i36 = this.f3535o;
                this.f3535o = i36 + 1;
                iArr13[i36] = 96;
                return 0;
            case 27:
                int[] iArr14 = this.m;
                int i37 = this.f3535o;
                this.f3535o = i37 + 1;
                iArr14[i37] = 74;
                return 0;
            case 28:
                int[] iArr15 = this.m;
                int i38 = this.f3535o;
                this.f3535o = i38 + 1;
                iArr15[i38] = 54;
                return 0;
            case 29:
                int[] iArr16 = this.m;
                int i39 = this.f3535o;
                this.f3535o = i39 + 1;
                iArr16[i39] = 62;
                return 0;
            case 30:
                for (int i40 = this.f3535o - 1; i40 >= 0; i40--) {
                    this.s[i40] = null;
                }
                java.lang.Object[] objArr8 = this.s;
                this.f3535o = 1;
                objArr8[0] = this.f;
                return 0;
            case 31:
                java.lang.Object[] objArr9 = this.s;
                int i41 = this.f3535o;
                this.f3535o = i41 + 1;
                objArr9[i41] = objArr9[4];
                return 0;
            case 32:
                java.lang.Object[] objArr10 = this.s;
                int i42 = this.f3535o;
                this.f3535o = i42 + 1;
                objArr10[i42] = objArr10[5];
                return 0;
            case 33:
                int[] iArr17 = this.m;
                int i43 = this.f3535o;
                iArr17[i43] = 67;
                this.f3535o = i43;
                int i44 = i43 - 1;
                iArr17[i44] = iArr17[i44] + 67;
                return 0;
            case 34:
                int[] iArr18 = this.m;
                int i45 = this.f3535o;
                this.f3535o = i45 + 1;
                iArr18[i45] = iArr18[i45 - 1];
                return 0;
            case 35:
                int[] iArr19 = this.m;
                int i46 = this.f3535o;
                iArr19[i46] = 128;
                this.f3535o = i46;
                int i47 = i46 - 1;
                iArr19[i47] = iArr19[i47] % 128;
                return 0;
            case 36:
                int[] iArr20 = this.m;
                int i48 = this.f3535o;
                iArr20[i48] = 79;
                int i49 = i48 - 1;
                int i50 = iArr20[i49] + 79;
                iArr20[i49] = i50;
                this.f3535o = i48 + 1;
                iArr20[i48] = i50;
                return 0;
            case 37:
                java.lang.Object[] objArr11 = this.s;
                int i51 = this.f3535o;
                this.f3535o = i51 + 1;
                objArr11[i51] = this.f;
                return 0;
            case 38:
                int i52 = this.f3535o - 1;
                this.f3535o = i52;
                java.lang.Object[] objArr12 = this.s;
                java.lang.Object obj4 = objArr12[i52];
                objArr12[i52] = null;
                objArr12[7] = obj4;
                return 0;
            case 39:
                int[] iArr21 = this.m;
                int i53 = this.f3535o;
                iArr21[i53] = 2;
                this.f3535o = i53;
                int i54 = i53 - 1;
                iArr21[i54] = iArr21[i54] % 2;
                int i55 = i53 - 1;
                this.f3535o = i55;
                this.s[i55] = null;
                return 0;
            case 40:
                int[] iArr22 = this.m;
                int i56 = this.f3535o;
                iArr22[i56] = 71;
                int i57 = i56 - 1;
                int i58 = iArr22[i57] + 71;
                iArr22[i57] = i58;
                this.f3535o = i56 + 1;
                iArr22[i56] = i58;
                return 0;
            case 41:
                int[] iArr23 = this.m;
                int i59 = this.f3535o;
                this.f3535o = i59 + 1;
                iArr23[i59] = 97;
                return 0;
            case 42:
                int i60 = this.f3535o;
                int i61 = i60 - 1;
                int[] iArr24 = this.m;
                int i62 = i60 - 2;
                int i63 = iArr24[i62] + iArr24[i61];
                iArr24[i62] = i63;
                iArr24[i61] = i63;
                this.f3535o = i60 + 1;
                iArr24[i60] = 128;
                return 0;
            case 43:
                int i64 = this.f3535o;
                int i65 = i64 - 1;
                java.lang.Object[] objArr13 = this.s;
                java.lang.Object obj5 = objArr13[i65];
                objArr13[i65] = null;
                objArr13[5] = obj5;
                this.f3535o = i64;
                objArr13[i65] = objArr13[4];
                return 0;
            case 44:
                java.lang.Object[] objArr14 = this.s;
                int i66 = this.f3535o;
                this.f3535o = i66 + 1;
                objArr14[i66] = objArr14[i66 - 1];
                return 0;
            case 45:
                int i67 = this.f3535o;
                int i68 = i67 - 1;
                this.f3535o = i68;
                java.lang.Object[] objArr15 = this.s;
                java.lang.Object obj6 = objArr15[i68];
                objArr15[i68] = null;
                objArr15[6] = obj6;
                int[] iArr25 = this.m;
                int i69 = i67 - 2;
                java.lang.Object obj7 = objArr15[i69];
                objArr15[i69] = null;
                iArr25[i69] = ((java.lang.Object[]) obj7).length;
                int i70 = i67 - 2;
                this.f3535o = i70;
                iArr25[7] = iArr25[i70];
                return 0;
            case 46:
                int[] iArr26 = this.m;
                int i71 = this.f3535o;
                iArr26[i71] = 0;
                this.f3535o = i71;
                iArr26[8] = 0;
                return 0;
            case 47:
                int[] iArr27 = this.m;
                int i72 = this.f3535o;
                this.f3535o = i72 + 1;
                iArr27[i72] = iArr27[8];
                return 0;
            case 48:
                int i73 = this.f3535o;
                int i74 = i73 - 2;
                this.f3535o = i74;
                int[] iArr28 = this.m;
                this.f3534a = iArr28[i74] >= iArr28[i73 - 1] ? 0 : 1;
                return 0;
            case 49:
                int[] iArr29 = this.m;
                int i75 = this.f3535o;
                this.f3535o = i75 + 1;
                iArr29[i75] = iArr29[7];
                return 0;
            case 50:
                java.lang.Object[] objArr16 = this.s;
                int i76 = this.f3535o;
                int i77 = i76 + 1;
                java.lang.Object obj8 = objArr16[6];
                objArr16[i76] = obj8;
                int[] iArr30 = this.m;
                int i78 = iArr30[8];
                iArr30[i77] = i78;
                this.f3535o = i77;
                objArr16[i76] = null;
                objArr16[i76] = ((java.lang.Object[]) obj8)[i78];
                return 0;
            case 51:
                int i79 = this.f3535o - 1;
                this.f3535o = i79;
                java.lang.Object[] objArr17 = this.s;
                java.lang.Object obj9 = objArr17[i79];
                objArr17[i79] = null;
                objArr17[9] = obj9;
                return 0;
            case 52:
                java.lang.Object[] objArr18 = this.s;
                int i80 = this.f3535o;
                objArr18[i80] = objArr18[5];
                this.f3535o = i80 + 2;
                objArr18[i80 + 1] = objArr18[9];
                return 0;
            case 53:
                int[] iArr31 = this.m;
                iArr31[8] = iArr31[8] + 1;
                return 0;
            case 54:
                java.lang.Object[] objArr19 = this.s;
                int i81 = this.f3535o;
                objArr19[i81] = objArr19[5];
                int[] iArr32 = this.m;
                this.f3535o = i81 + 2;
                iArr32[i81 + 1] = 41;
                return 0;
            case 55:
                int i82 = this.f3535o;
                int i83 = i82 - 1;
                java.lang.Object[] objArr20 = this.s;
                objArr20[i83] = null;
                this.f3535o = i82;
                objArr20[i83] = objArr20[5];
                return 0;
            case 56:
                int[] iArr33 = this.m;
                int i84 = this.f3535o;
                this.f3535o = i84 + 1;
                iArr33[i84] = 47;
                return 0;
            case 57:
                int i85 = this.f3535o;
                int i86 = i85 - 1;
                this.f3535o = i86;
                int[] iArr34 = this.m;
                int i87 = i85 - 2;
                iArr34[i87] = iArr34[i87] + iArr34[i86];
                return 0;
            case 58:
                int[] iArr35 = this.m;
                int i88 = this.f3535o;
                iArr35[i88] = iArr35[i88 - 1];
                this.f3535o = i88 + 2;
                iArr35[i88 + 1] = 128;
                return 0;
            case 59:
                java.lang.Object[] objArr21 = this.s;
                int i89 = this.f3535o;
                objArr21[i89] = objArr21[6];
                int[] iArr36 = this.m;
                this.f3535o = i89 + 2;
                iArr36[i89 + 1] = iArr36[8];
                return 0;
            case 60:
                int i90 = this.f3535o;
                int i91 = i90 - 1;
                this.f3535o = i91;
                java.lang.Object[] objArr22 = this.s;
                int i92 = i90 - 2;
                java.lang.Object obj10 = objArr22[i92];
                objArr22[i92] = null;
                java.lang.Object obj11 = ((java.lang.Object[]) obj10)[this.m[i91]];
                objArr22[i92] = obj11;
                objArr22[i92] = null;
                objArr22[9] = obj11;
                this.f3535o = i91;
                objArr22[i92] = objArr22[5];
                return 0;
            case 61:
                java.lang.Object[] objArr23 = this.s;
                int i93 = this.f3535o;
                this.f3535o = i93 + 1;
                objArr23[i93] = objArr23[9];
                return 0;
            case 62:
                int[] iArr37 = this.m;
                iArr37[8] = iArr37[8] + 102;
                return 0;
            case 63:
                int[] iArr38 = this.m;
                int i94 = this.f3535o;
                this.f3535o = i94 + 1;
                iArr38[i94] = 113;
                return 0;
            case 64:
                int[] iArr39 = this.m;
                int i95 = this.f3535o;
                this.f3535o = i95 + 1;
                iArr39[i95] = 45;
                return 0;
            case 65:
                int[] iArr40 = this.m;
                int i96 = this.f3535o;
                this.f3535o = i96 + 1;
                iArr40[i96] = 19;
                return 0;
            case 66:
                int[] iArr41 = this.m;
                int i97 = this.f3535o;
                this.f3535o = i97 + 1;
                iArr41[i97] = 1;
                return 0;
            case 67:
                int[] iArr42 = this.m;
                int i98 = this.f3535o;
                this.f3535o = i98 + 1;
                iArr42[i98] = 0;
                return 0;
            case 68:
                int i99 = this.f3535o - 1;
                this.f3535o = i99;
                java.lang.Object[] objArr24 = this.s;
                java.lang.Object obj12 = objArr24[i99];
                objArr24[i99] = null;
                objArr24[4] = obj12;
                return 0;
            case 69:
                int[] iArr43 = this.m;
                int i100 = this.f3535o;
                iArr43[i100] = 46;
                this.f3535o = i100 + 2;
                iArr43[i100 + 1] = 47;
                return 0;
            case 70:
                int[] iArr44 = this.m;
                int i101 = this.f3535o;
                this.f3535o = i101 + 1;
                iArr44[i101] = 59;
                return 0;
            case 71:
                int i102 = this.f3535o;
                int i103 = i102 - 1;
                this.f3535o = i103;
                int[] iArr45 = this.m;
                int i104 = i102 - 2;
                iArr45[i104] = iArr45[i104] % iArr45[i103];
                int i105 = i102 - 2;
                this.f3535o = i105;
                this.s[i105] = null;
                return 0;
            case 72:
                int[] iArr46 = this.m;
                int i106 = this.f3535o;
                this.f3535o = i106 + 1;
                iArr46[i106] = 5;
                return 0;
            case 73:
                int[] iArr47 = this.m;
                int i107 = this.f3535o;
                this.f3535o = i107 + 1;
                iArr47[i107] = 17;
                return 0;
            case 74:
                int[] iArr48 = this.m;
                int i108 = this.f3535o;
                this.f3535o = i108 + 1;
                iArr48[i108] = 70;
                return 0;
            case 75:
                int[] iArr49 = this.m;
                int i109 = this.f3535o;
                this.f3535o = i109 + 1;
                iArr49[i109] = 31;
                return 0;
            case 76:
                int[] iArr50 = this.m;
                int i110 = this.f3535o;
                this.f3535o = i110 + 1;
                iArr50[i110] = 48;
                return 0;
            case 77:
                int[] iArr51 = this.m;
                int i111 = this.f3535o;
                this.f3535o = i111 + 1;
                iArr51[i111] = 40;
                return 0;
            default:
                return i;
        }
    }

    public dz(java.lang.Object obj) {
        this.m = new int[10];
        this.l = new long[10];
        this.k = new float[10];
        this.r = new double[10];
        java.lang.Object[] objArr = new java.lang.Object[10];
        this.s = objArr;
        objArr[4] = obj;
        this.f3535o = 0;
        this.n = -1;
    }

    public dz(long j, java.lang.Object obj) {
        this.m = new int[10];
        long[] jArr = new long[10];
        this.l = jArr;
        this.k = new float[10];
        this.r = new double[10];
        java.lang.Object[] objArr = new java.lang.Object[10];
        this.s = objArr;
        jArr[4] = j;
        objArr[6] = obj;
        this.f3535o = 0;
        this.n = -1;
    }

    public dz(java.lang.Object obj, java.lang.Object obj2) {
        this.m = new int[10];
        this.l = new long[10];
        this.k = new float[10];
        this.r = new double[10];
        java.lang.Object[] objArr = new java.lang.Object[10];
        this.s = objArr;
        objArr[4] = obj;
        objArr[5] = obj2;
        this.f3535o = 0;
        this.n = -1;
    }

    public dz(long j, java.lang.Object obj, java.lang.Object obj2) {
        this.m = new int[10];
        long[] jArr = new long[10];
        this.l = jArr;
        this.k = new float[10];
        this.r = new double[10];
        java.lang.Object[] objArr = new java.lang.Object[10];
        this.s = objArr;
        jArr[4] = j;
        objArr[6] = obj;
        objArr[7] = obj2;
        this.f3535o = 0;
        this.n = -1;
    }
}

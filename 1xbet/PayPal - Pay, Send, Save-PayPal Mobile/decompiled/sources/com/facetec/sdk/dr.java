package com.facetec.sdk;

/* loaded from: classes8.dex */
public class dr {

    /* renamed from: a, reason: collision with root package name */
    public float f3520a;
    public int b;
    public long c;
    public long d;
    public int e;
    public float f;
    public java.lang.Object g;
    public double h;
    public double i;
    public java.lang.Object j;
    private final int[] k;
    private final long[] l;
    private final float[] m;
    private int n;

    /* renamed from: o, reason: collision with root package name */
    private int f3521o;
    private final java.lang.Object[] p;
    private final double[] t;

    public int e(int i) {
        java.lang.Object[] objArr = null;
        switch (i) {
            case 1:
                java.lang.Object[] objArr2 = this.p;
                int i2 = this.f3521o;
                this.f3521o = i2 + 1;
                objArr2[i2] = objArr2[5];
                return 0;
            case 2:
                int i3 = this.f3521o - this.b;
                this.f3521o = i3;
                this.n = i3;
                return 0;
            case 3:
                java.lang.Object[] objArr3 = this.p;
                int i4 = this.n;
                this.n = i4 + 1;
                java.lang.Object obj = objArr3[i4];
                objArr3[i4] = null;
                this.g = obj;
                return 0;
            case 4:
                java.lang.Object[] objArr4 = this.p;
                int i5 = this.f3521o;
                this.f3521o = i5 + 1;
                objArr4[i5] = this.j;
                return 0;
            case 5:
                int i6 = this.f3521o - 1;
                this.f3521o = i6;
                java.lang.Object[] objArr5 = this.p;
                java.lang.Object obj2 = objArr5[i6];
                objArr5[i6] = null;
                this.e = obj2 == null ? 0 : 1;
                return 0;
            case 6:
                int[] iArr = this.k;
                int i7 = this.f3521o;
                this.f3521o = i7 + 1;
                iArr[i7] = this.b;
                return 0;
            case 7:
                int i8 = this.f3521o - 1;
                this.f3521o = i8;
                this.e = this.k[i8] != 0 ? 0 : 1;
                return 0;
            case 8:
                int[] iArr2 = this.k;
                int i9 = this.f3521o;
                this.f3521o = i9 + 1;
                iArr2[i9] = iArr2[6];
                return 0;
            case 9:
                int[] iArr3 = this.k;
                int i10 = this.f3521o;
                this.f3521o = i10 + 1;
                iArr3[i10] = 1;
                return 0;
            case 10:
                int[] iArr4 = this.k;
                int i11 = this.f3521o;
                this.f3521o = i11 + 1;
                iArr4[i11] = 0;
                return 0;
            case 11:
                int i12 = this.f3521o;
                int i13 = i12 - 2;
                this.f3521o = i13;
                int[] iArr5 = this.k;
                this.e = iArr5[i13] != iArr5[i12 - 1] ? 0 : 1;
                return 0;
            case 12:
                int i14 = this.f3521o - 1;
                this.f3521o = i14;
                this.e = this.k[i14] == 0 ? 0 : 1;
                return 0;
            case 13:
                int[] iArr6 = this.k;
                int i15 = this.n;
                this.n = i15 + 1;
                this.e = iArr6[i15];
                return 0;
            case 14:
                int i16 = this.f3521o;
                int i17 = i16 - 1;
                java.lang.Object[] objArr6 = this.p;
                java.lang.Object obj3 = objArr6[i17];
                objArr6[i17] = null;
                objArr6[6] = obj3;
                this.f3521o = i16;
                objArr6[i17] = objArr6[5];
                return 0;
            case 15:
                java.lang.Object[] objArr7 = this.p;
                int i18 = this.f3521o;
                this.f3521o = i18 + 1;
                objArr7[i18] = objArr7[6];
                return 0;
            case 16:
                java.lang.Object[] objArr8 = this.p;
                int i19 = this.f3521o;
                this.f3521o = i19 + 1;
                objArr8[i19] = null;
                return 0;
            case 17:
                int[] iArr7 = this.k;
                int i20 = this.f3521o;
                int i21 = i20 + 1;
                iArr7[i20] = 2;
                iArr7[i21] = 2;
                this.f3521o = i21;
                iArr7[i20] = iArr7[i20] % 2;
                return 0;
            case 18:
                int i22 = this.f3521o - 1;
                this.f3521o = i22;
                this.p[i22] = null;
                return 0;
            case 19:
                int[] iArr8 = this.k;
                int i23 = this.f3521o;
                this.f3521o = i23 + 1;
                iArr8[i23] = 2;
                return 0;
            case 20:
                int[] iArr9 = this.k;
                int i24 = this.f3521o;
                iArr9[i24] = 2;
                this.f3521o = i24;
                int i25 = i24 - 1;
                iArr9[i25] = iArr9[i25] % 2;
                return 0;
            case 21:
                int[] iArr10 = this.k;
                int i26 = this.f3521o;
                iArr10[i26] = 2;
                this.f3521o = i26 + 2;
                iArr10[i26 + 1] = 2;
                return 0;
            case 22:
                int i27 = this.f3521o;
                int i28 = i27 - 1;
                this.f3521o = i28;
                int[] iArr11 = this.k;
                int i29 = i27 - 2;
                iArr11[i29] = iArr11[i29] % iArr11[i28];
                int i30 = i27 - 2;
                this.f3521o = i30;
                this.p[i30] = null;
                return 0;
            case 24:
                int[] iArr12 = this.k;
                int i31 = this.f3521o;
                this.f3521o = i31 + 1;
                iArr12[i31] = 21;
            case 23:
                return 0;
            case 25:
                int i32 = this.f3521o;
                int i33 = i32 - 1;
                int[] iArr13 = this.k;
                int i34 = i32 - 2;
                int i35 = iArr13[i34] + iArr13[i33];
                iArr13[i34] = i35;
                this.f3521o = i32;
                iArr13[i33] = i35;
                return 0;
            case 26:
                int[] iArr14 = this.k;
                int i36 = this.f3521o;
                iArr14[i36] = 128;
                this.f3521o = i36;
                int i37 = i36 - 1;
                iArr14[i37] = iArr14[i37] % 128;
                return 0;
            case 27:
                int i38 = this.f3521o;
                int i39 = i38 - 1;
                this.f3521o = i39;
                int[] iArr15 = this.k;
                int i40 = i38 - 2;
                iArr15[i40] = iArr15[i40] + iArr15[i39];
                return 0;
            case 28:
                int[] iArr16 = this.k;
                int i41 = this.f3521o;
                iArr16[i41] = iArr16[i41 - 1];
                this.f3521o = i41 + 2;
                iArr16[i41 + 1] = 128;
                return 0;
            case 29:
                int i42 = this.f3521o;
                int i43 = i42 - 1;
                this.f3521o = i43;
                int[] iArr17 = this.k;
                int i44 = i42 - 2;
                iArr17[i44] = iArr17[i44] % iArr17[i43];
                return 0;
            case 30:
                int[] iArr18 = this.k;
                int i45 = this.f3521o - 1;
                this.f3521o = i45;
                this.e = iArr18[i45];
                return 0;
            case 31:
                int[] iArr19 = this.k;
                int i46 = this.f3521o;
                this.f3521o = i46 + 1;
                iArr19[i46] = 9;
                return 0;
            case 32:
                int[] iArr20 = this.k;
                int i47 = this.f3521o;
                this.f3521o = i47 + 1;
                iArr20[i47] = 51;
                return 0;
            case 33:
                int[] iArr21 = this.k;
                int i48 = this.f3521o;
                this.f3521o = i48 + 1;
                iArr21[i48] = 19;
                return 0;
            case 34:
                int[] iArr22 = this.k;
                int i49 = this.f3521o;
                this.f3521o = i49 + 1;
                iArr22[i49] = 42;
                return 0;
            case 35:
                for (int i50 = this.f3521o - 1; i50 >= 0; i50--) {
                    this.p[i50] = null;
                }
                java.lang.Object[] objArr9 = this.p;
                this.f3521o = 1;
                objArr9[0] = this.j;
                return 0;
            case 36:
                java.lang.Object[] objArr10 = this.p;
                int i51 = this.f3521o;
                objArr10[i51] = objArr10[5];
                int[] iArr23 = this.k;
                this.f3521o = i51 + 2;
                iArr23[i51 + 1] = 1;
                return 0;
            case 37:
                java.lang.Object[] objArr11 = this.p;
                int i52 = this.f3521o;
                java.lang.Object obj4 = objArr11[i52 - 1];
                objArr11[i52] = obj4;
                this.f3521o = i52;
                objArr11[i52] = null;
                objArr11[7] = obj4;
                return 0;
            case 38:
                int i53 = this.f3521o - 1;
                this.f3521o = i53;
                java.lang.Object[] objArr12 = this.p;
                java.lang.Object obj5 = objArr12[i53];
                objArr12[i53] = null;
                this.e = obj5 != null ? 0 : 1;
                return 0;
            case 39:
                java.lang.Object[] objArr13 = this.p;
                int i54 = this.f3521o;
                this.f3521o = i54 + 1;
                objArr13[i54] = objArr13[7];
                return 0;
            case 40:
                int i55 = this.f3521o;
                int i56 = i55 - 1;
                java.lang.Object[] objArr14 = this.p;
                java.lang.Object obj6 = objArr14[i56];
                objArr14[i56] = null;
                objArr14[8] = obj6;
                objArr14[i56] = objArr14[5];
                this.f3521o = i55 + 1;
                objArr14[i55] = objArr14[8];
                return 0;
            case 41:
                int[] iArr24 = this.k;
                int i57 = this.f3521o;
                iArr24[i57] = 65;
                this.f3521o = i57;
                int i58 = i57 - 1;
                iArr24[i58] = iArr24[i58] + 65;
                return 0;
            case 42:
                int[] iArr25 = this.k;
                int i59 = this.f3521o;
                this.f3521o = i59 + 1;
                iArr25[i59] = iArr25[i59 - 1];
                return 0;
            case 43:
                int[] iArr26 = this.k;
                int i60 = this.f3521o;
                this.f3521o = i60 + 1;
                iArr26[i60] = 128;
                return 0;
            case 44:
                int[] iArr27 = this.k;
                int i61 = this.f3521o;
                iArr27[i61] = 3;
                this.f3521o = i61;
                int i62 = i61 - 1;
                iArr27[i62] = iArr27[i62] + 3;
                return 0;
            case 45:
                int[] iArr28 = this.k;
                int i63 = this.f3521o;
                int i64 = i63 + 1;
                iArr28[i63] = iArr28[i63 - 1];
                iArr28[i64] = 128;
                this.f3521o = i64;
                iArr28[i63] = iArr28[i63] % 128;
                return 0;
            case 46:
                java.lang.Object[] objArr15 = this.p;
                int i65 = this.f3521o - 1;
                java.lang.Object obj7 = objArr15[i65];
                objArr15[i65] = null;
                this.g = obj7;
                return 0;
            case 47:
                java.lang.Object[] objArr16 = this.p;
                int i66 = this.f3521o;
                this.f3521o = i66 + 1;
                objArr16[i66] = null;
                int[] iArr29 = this.k;
                objArr16[i66] = null;
                iArr29[i66] = objArr.length;
                this.f3521o = i66;
                objArr16[i66] = null;
                return 0;
            case 48:
                int[] iArr30 = this.k;
                int i67 = this.f3521o;
                this.f3521o = i67 + 1;
                iArr30[i67] = 39;
                return 0;
            case 49:
                int i68 = this.f3521o;
                int i69 = i68 - 1;
                java.lang.Object[] objArr17 = this.p;
                java.lang.Object obj8 = objArr17[i69];
                objArr17[i69] = null;
                objArr17[8] = obj8;
                this.f3521o = i68;
                objArr17[i69] = objArr17[5];
                return 0;
            case 50:
                java.lang.Object[] objArr18 = this.p;
                int i70 = this.f3521o;
                this.f3521o = i70 + 1;
                objArr18[i70] = objArr18[8];
                return 0;
            case 51:
                int[] iArr31 = this.k;
                int i71 = this.f3521o;
                iArr31[i71] = 73;
                int i72 = i71 - 1;
                int i73 = iArr31[i72] + 73;
                iArr31[i72] = i73;
                this.f3521o = i71 + 1;
                iArr31[i71] = i73;
                return 0;
            case 52:
                int[] iArr32 = this.k;
                int i74 = this.f3521o;
                this.f3521o = i74 + 1;
                iArr32[i74] = 35;
                return 0;
            case 53:
                int[] iArr33 = this.k;
                int i75 = this.f3521o;
                this.f3521o = i75 + 1;
                iArr33[i75] = 7;
                return 0;
            case 54:
                int[] iArr34 = this.k;
                int i76 = this.f3521o;
                this.f3521o = i76 + 1;
                iArr34[i76] = 13;
                return 0;
            case 55:
                int[] iArr35 = this.k;
                int i77 = this.f3521o;
                this.f3521o = i77 + 1;
                iArr35[i77] = 8;
                return 0;
            case 56:
                int[] iArr36 = this.k;
                int i78 = this.f3521o;
                this.f3521o = i78 + 1;
                iArr36[i78] = 40;
                return 0;
            case 57:
                int[] iArr37 = this.k;
                int i79 = this.f3521o;
                this.f3521o = i79 + 1;
                iArr37[i79] = 37;
                return 0;
            case 58:
                int[] iArr38 = this.k;
                int i80 = this.f3521o;
                this.f3521o = i80 + 1;
                iArr38[i80] = 64;
                return 0;
            case 59:
                int[] iArr39 = this.k;
                int i81 = this.f3521o;
                this.f3521o = i81 + 1;
                iArr39[i81] = 50;
                return 0;
            case 60:
                int[] iArr40 = this.k;
                int i82 = this.f3521o;
                this.f3521o = i82 + 1;
                iArr40[i82] = 91;
                return 0;
            case 61:
                int[] iArr41 = this.k;
                int i83 = this.f3521o;
                this.f3521o = i83 + 1;
                iArr41[i83] = 85;
                return 0;
            default:
                return i;
        }
    }

    public dr(java.lang.Object obj, java.lang.Object obj2) {
        this.k = new int[9];
        this.l = new long[9];
        this.m = new float[9];
        this.t = new double[9];
        java.lang.Object[] objArr = new java.lang.Object[9];
        this.p = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        this.f3521o = 0;
        this.n = -1;
    }

    public dr(java.lang.Object obj, int i) {
        int[] iArr = new int[9];
        this.k = iArr;
        this.l = new long[9];
        this.m = new float[9];
        this.t = new double[9];
        java.lang.Object[] objArr = new java.lang.Object[9];
        this.p = objArr;
        objArr[5] = obj;
        iArr[6] = i;
        this.f3521o = 0;
        this.n = -1;
    }
}

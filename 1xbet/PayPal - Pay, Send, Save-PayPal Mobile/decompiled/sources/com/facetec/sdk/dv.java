package com.facetec.sdk;

/* loaded from: classes8.dex */
public class dv {

    /* renamed from: a, reason: collision with root package name */
    public int f3526a;
    public long b;
    public float c;
    public long d;
    public int e;
    public java.lang.Object f;
    public float g;
    public double h;
    public java.lang.Object i;
    public double j;
    private final int[] k;
    private int l;
    private final float[] m;
    private int n;

    /* renamed from: o, reason: collision with root package name */
    private final long[] f3527o;
    private final double[] p;
    private final java.lang.Object[] s;

    public int c(int i) {
        java.lang.Object[] objArr = null;
        switch (i) {
            case 1:
                java.lang.Object[] objArr2 = this.s;
                int i2 = this.n;
                this.n = i2 + 1;
                objArr2[i2] = this.i;
                return 0;
            case 2:
                int[] iArr = this.k;
                int i3 = this.n;
                iArr[i3] = 0;
                java.lang.Object[] objArr3 = this.s;
                this.n = i3 + 2;
                objArr3[i3 + 1] = objArr3[6];
                return 0;
            case 3:
                int i4 = this.n - this.e;
                this.n = i4;
                this.l = i4;
                return 0;
            case 4:
                java.lang.Object[] objArr4 = this.s;
                int i5 = this.l;
                this.l = i5 + 1;
                java.lang.Object obj = objArr4[i5];
                objArr4[i5] = null;
                this.f = obj;
                return 0;
            case 5:
                int[] iArr2 = this.k;
                int i6 = this.n;
                java.lang.Object[] objArr5 = this.s;
                int i7 = i6 - 1;
                java.lang.Object obj2 = objArr5[i7];
                objArr5[i7] = null;
                iArr2[i7] = ((java.lang.Object[]) obj2).length;
                return 0;
            case 6:
                int[] iArr3 = this.k;
                int i8 = this.l;
                this.l = i8 + 1;
                this.f3526a = iArr3[i8];
                return 0;
            case 7:
                int[] iArr4 = this.k;
                int i9 = this.n;
                this.n = i9 + 1;
                iArr4[i9] = this.e;
                return 0;
            case 8:
                int i10 = this.n - 1;
                this.n = i10;
                int[] iArr5 = this.k;
                iArr5[7] = iArr5[i10];
                return 0;
            case 9:
                java.lang.Object[] objArr6 = this.s;
                int i11 = this.n;
                this.n = i11 + 1;
                objArr6[i11] = objArr6[6];
                return 0;
            case 10:
                int[] iArr6 = this.k;
                int i12 = this.n;
                int i13 = iArr6[7];
                iArr6[i12] = i13;
                this.n = i12;
                java.lang.Object[] objArr7 = this.s;
                int i14 = i12 - 1;
                java.lang.Object obj3 = objArr7[i14];
                objArr7[i14] = null;
                objArr7[i14] = ((java.lang.Object[]) obj3)[i13];
                return 0;
            case 11:
                int[] iArr7 = this.k;
                int i15 = this.n;
                this.n = i15 + 1;
                iArr7[i15] = 2;
                return 0;
            case 12:
                int[] iArr8 = this.k;
                int i16 = this.n;
                iArr8[i16] = 2;
                this.n = i16;
                int i17 = i16 - 1;
                iArr8[i17] = iArr8[i17] % 2;
                return 0;
            case 13:
                int i18 = this.n - 1;
                this.n = i18;
                this.s[i18] = null;
                return 0;
            case 15:
                java.lang.Object[] objArr8 = this.s;
                int i19 = this.n - 1;
                java.lang.Object obj4 = objArr8[i19];
                objArr8[i19] = null;
                this.f = obj4;
            case 14:
                return 0;
            case 16:
                int[] iArr9 = this.k;
                int i20 = this.n;
                this.n = i20 + 1;
                iArr9[i20] = 95;
                return 0;
            case 17:
                int i21 = this.n;
                int i22 = i21 - 1;
                int[] iArr10 = this.k;
                int i23 = i21 - 2;
                int i24 = iArr10[i23] + iArr10[i22];
                iArr10[i23] = i24;
                this.n = i21;
                iArr10[i22] = i24;
                return 0;
            case 18:
                int[] iArr11 = this.k;
                int i25 = this.n;
                iArr11[i25] = 128;
                this.n = i25;
                int i26 = i25 - 1;
                iArr11[i26] = iArr11[i26] % 128;
                return 0;
            case 19:
                int i27 = this.n - 1;
                this.n = i27;
                this.f3526a = this.k[i27] != 0 ? 0 : 1;
                return 0;
            case 20:
                int i28 = this.n;
                int i29 = i28 - 1;
                this.n = i29;
                int[] iArr12 = this.k;
                int i30 = i28 - 2;
                iArr12[i30] = iArr12[i30] % iArr12[i29];
                return 0;
            case 21:
                int[] iArr13 = this.k;
                int i31 = this.n;
                iArr13[i31] = 107;
                int i32 = i31 - 1;
                int i33 = iArr13[i32] + 107;
                iArr13[i32] = i33;
                this.n = i31 + 1;
                iArr13[i31] = i33;
                return 0;
            case 22:
                int i34 = this.n;
                int i35 = i34 - 2;
                this.n = i35;
                java.lang.Object[] objArr9 = this.s;
                java.lang.Object obj5 = objArr9[i35];
                objArr9[i35] = null;
                int i36 = i34 - 1;
                java.lang.Object obj6 = objArr9[i36];
                objArr9[i36] = null;
                this.f3526a = obj5 != obj6 ? 0 : 1;
                return 0;
            case 23:
                int i37 = this.n - 1;
                this.n = i37;
                java.lang.Object[] objArr10 = this.s;
                java.lang.Object obj7 = objArr10[i37];
                objArr10[i37] = null;
                this.f3526a = obj7 == null ? 0 : 1;
                return 0;
            case 24:
                java.lang.Object[] objArr11 = this.s;
                int i38 = this.n;
                this.n = i38 + 1;
                objArr11[i38] = objArr11[i38 - 1];
                return 0;
            case 25:
                int[] iArr14 = this.k;
                int i39 = this.n;
                this.n = i39 + 1;
                iArr14[i39] = 1;
                return 0;
            case 26:
                int[] iArr15 = this.k;
                int i40 = this.n;
                this.n = i40 + 1;
                iArr15[i40] = 0;
                return 0;
            case 27:
                int[] iArr16 = this.k;
                int i41 = this.n;
                this.n = i41 + 1;
                iArr16[i41] = iArr16[i41 - 1];
                return 0;
            case 28:
                int i42 = this.n - 1;
                this.n = i42;
                int[] iArr17 = this.k;
                iArr17[9] = iArr17[i42];
                return 0;
            case 29:
                int i43 = this.n;
                int i44 = i43 - 1;
                int[] iArr18 = this.k;
                iArr18[10] = iArr18[i44];
                this.n = i43;
                iArr18[i44] = iArr18[9];
                return 0;
            case 30:
                int[] iArr19 = this.k;
                int i45 = this.n;
                this.n = i45 + 1;
                iArr19[i45] = iArr19[10];
                return 0;
            case 31:
                int[] iArr20 = this.k;
                int i46 = this.n;
                this.n = i46 + 1;
                iArr20[i46] = iArr20[9];
                return 0;
            case 32:
                int i47 = this.n - 1;
                this.n = i47;
                this.f3526a = this.k[i47] == 0 ? 0 : 1;
                return 0;
            case 33:
                int i48 = this.n;
                int i49 = i48 - 1;
                this.n = i49;
                int[] iArr21 = this.k;
                int i50 = i48 - 2;
                iArr21[i50] = iArr21[i50] + iArr21[i49];
                return 0;
            case 34:
                java.lang.Object[] objArr12 = this.s;
                int i51 = this.n;
                objArr12[i51] = objArr12[6];
                int[] iArr22 = this.k;
                this.n = i51 + 2;
                iArr22[i51 + 1] = 0;
                return 0;
            case 35:
                int i52 = this.n - 1;
                this.n = i52;
                java.lang.Object[] objArr13 = this.s;
                java.lang.Object obj8 = objArr13[i52];
                objArr13[i52] = null;
                objArr13[9] = obj8;
                return 0;
            case 36:
                int i53 = this.n;
                int i54 = i53 - 1;
                java.lang.Object[] objArr14 = this.s;
                java.lang.Object obj9 = objArr14[i54];
                objArr14[i54] = null;
                objArr14[10] = obj9;
                this.n = i53;
                objArr14[i54] = objArr14[6];
                return 0;
            case 37:
                int[] iArr23 = this.k;
                int i55 = this.n - 1;
                this.n = i55;
                this.f3526a = iArr23[i55];
                return 0;
            case 38:
                int i56 = this.n;
                int i57 = i56 - 1;
                this.n = i57;
                int[] iArr24 = this.k;
                java.lang.Object[] objArr15 = this.s;
                int i58 = i56 - 2;
                java.lang.Object obj10 = objArr15[i58];
                objArr15[i58] = null;
                iArr24[i58] = ((int[]) obj10)[iArr24[i57]];
                return 0;
            case 39:
                int[] iArr25 = this.k;
                int i59 = this.n;
                this.n = i59 + 1;
                iArr25[i59] = iArr25[8];
                return 0;
            case 40:
                java.lang.Object[] objArr16 = this.s;
                int i60 = this.n;
                this.n = i60 + 1;
                objArr16[i60] = objArr16[7];
                return 0;
            case 41:
                java.lang.Object[] objArr17 = this.s;
                int i61 = this.n;
                this.n = i61 + 1;
                objArr17[i61] = objArr17[10];
                return 0;
            case 42:
                java.lang.Object[] objArr18 = this.s;
                int i62 = this.n;
                this.n = i62 + 1;
                objArr18[i62] = null;
                return 0;
            case 43:
                java.lang.Object[] objArr19 = this.s;
                int i63 = this.n;
                objArr19[i63] = objArr19[6];
                this.n = i63 + 2;
                objArr19[i63 + 1] = objArr19[7];
                return 0;
            case 44:
                java.lang.Object[] objArr20 = this.s;
                int i64 = this.n;
                objArr20[i64] = objArr20[9];
                this.n = i64 + 2;
                objArr20[i64 + 1] = null;
                return 0;
            case 45:
                this.f3526a = this.k[this.n - 1];
                return 0;
            case 46:
                int[] iArr26 = this.k;
                int i65 = this.n;
                iArr26[i65] = 29;
                this.n = i65;
                int i66 = i65 - 1;
                iArr26[i66] = iArr26[i66] + 29;
                return 0;
            case 47:
                int[] iArr27 = this.k;
                int i67 = this.n;
                this.n = i67 + 1;
                iArr27[i67] = 128;
                return 0;
            case 48:
                int[] iArr28 = this.k;
                int i68 = this.n;
                iArr28[i68] = 31;
                this.n = i68;
                int i69 = i68 - 1;
                iArr28[i69] = iArr28[i69] + 31;
                return 0;
            case 49:
                java.lang.Object[] objArr21 = this.s;
                int i70 = this.n;
                this.n = i70 + 1;
                objArr21[i70] = null;
                int[] iArr29 = this.k;
                objArr21[i70] = null;
                iArr29[i70] = objArr.length;
                this.n = i70;
                objArr21[i70] = null;
                return 0;
            case 50:
                int[] iArr30 = this.k;
                int i71 = this.n;
                this.n = i71 + 1;
                iArr30[i71] = 101;
                return 0;
            case 51:
                int[] iArr31 = this.k;
                int i72 = this.n;
                this.n = i72 + 1;
                iArr31[i72] = 79;
                return 0;
            case 52:
                int[] iArr32 = this.k;
                int i73 = this.n;
                iArr32[i73] = 45;
                this.n = i73;
                int i74 = i73 - 1;
                iArr32[i74] = iArr32[i74] + 45;
                return 0;
            case 53:
                int[] iArr33 = this.k;
                int i75 = this.n;
                iArr33[i75] = iArr33[i75 - 1];
                this.n = i75 + 2;
                iArr33[i75 + 1] = 128;
                return 0;
            case 54:
                int[] iArr34 = this.k;
                int i76 = this.n;
                this.n = i76 + 1;
                iArr34[i76] = 65;
                return 0;
            case 55:
                int[] iArr35 = this.k;
                int i77 = this.n;
                this.n = i77 + 1;
                iArr35[i77] = 50;
                return 0;
            case 56:
                int[] iArr36 = this.k;
                int i78 = this.n;
                this.n = i78 + 1;
                iArr36[i78] = 70;
                return 0;
            case 57:
                int[] iArr37 = this.k;
                int i79 = this.n;
                this.n = i79 + 1;
                iArr37[i79] = 7;
                return 0;
            case 58:
                int[] iArr38 = this.k;
                int i80 = this.n;
                this.n = i80 + 1;
                iArr38[i80] = 15;
                return 0;
            case 59:
                int[] iArr39 = this.k;
                int i81 = this.n;
                this.n = i81 + 1;
                iArr39[i81] = 1;
                return 0;
            case 60:
                int[] iArr40 = this.k;
                int i82 = this.n;
                this.n = i82 + 1;
                iArr40[i82] = 29;
                return 0;
            case 61:
                int[] iArr41 = this.k;
                int i83 = this.n;
                this.n = i83 + 1;
                iArr41[i83] = 67;
                return 0;
            case 62:
                int[] iArr42 = this.k;
                int i84 = this.n;
                this.n = i84 + 1;
                iArr42[i84] = 96;
                return 0;
            case 63:
                int[] iArr43 = this.k;
                int i85 = this.n;
                this.n = i85 + 1;
                iArr43[i85] = 54;
                return 0;
            case 64:
                for (int i86 = this.n - 1; i86 >= 0; i86--) {
                    this.s[i86] = null;
                }
                java.lang.Object[] objArr22 = this.s;
                this.n = 1;
                objArr22[0] = this.i;
                return 0;
            default:
                return i;
        }
    }

    public dv(java.lang.Object obj, java.lang.Object obj2, int i) {
        int[] iArr = new int[11];
        this.k = iArr;
        this.f3527o = new long[11];
        this.m = new float[11];
        this.p = new double[11];
        java.lang.Object[] objArr = new java.lang.Object[11];
        this.s = objArr;
        objArr[6] = obj;
        objArr[7] = obj2;
        iArr[8] = i;
        this.n = 0;
        this.l = -1;
    }

    public dv(java.lang.Object obj) {
        this.k = new int[11];
        this.f3527o = new long[11];
        this.m = new float[11];
        this.p = new double[11];
        java.lang.Object[] objArr = new java.lang.Object[11];
        this.s = objArr;
        objArr[6] = obj;
        this.n = 0;
        this.l = -1;
    }
}

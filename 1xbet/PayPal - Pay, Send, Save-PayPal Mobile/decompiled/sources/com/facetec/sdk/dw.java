package com.facetec.sdk;

/* loaded from: classes8.dex */
public class dw {

    /* renamed from: a, reason: collision with root package name */
    public float f3528a;
    public long b;
    public int c;
    public int d;
    public long e;
    public double f;
    public java.lang.Object g;
    public double h;
    public float i;
    public java.lang.Object j;
    private int l;
    private int n;
    private final java.lang.Object[] q;
    private final int[] k = new int[13];
    private final long[] m = new long[13];

    /* renamed from: o, reason: collision with root package name */
    private final float[] f3529o = new float[13];
    private final double[] s = new double[13];

    public int c(int i) {
        java.lang.Object[] objArr = null;
        switch (i) {
            case 1:
                java.lang.Object[] objArr2 = this.q;
                int i2 = this.n;
                this.n = i2 + 1;
                objArr2[i2] = this.j;
                return 0;
            case 2:
                java.lang.Object[] objArr3 = this.q;
                int i3 = this.n;
                this.n = i3 + 1;
                objArr3[i3] = objArr3[9];
                return 0;
            case 3:
                int i4 = this.n - this.d;
                this.n = i4;
                this.l = i4;
                return 0;
            case 4:
                java.lang.Object[] objArr4 = this.q;
                int i5 = this.l;
                this.l = i5 + 1;
                java.lang.Object obj = objArr4[i5];
                objArr4[i5] = null;
                this.g = obj;
                return 0;
            case 5:
                int[] iArr = this.k;
                int i6 = this.n;
                this.n = i6 + 1;
                iArr[i6] = this.d;
                return 0;
            case 6:
                int[] iArr2 = this.k;
                int i7 = this.l;
                this.l = i7 + 1;
                this.c = iArr2[i7];
                return 0;
            case 7:
                int[] iArr3 = this.k;
                int i8 = this.n;
                this.n = i8 + 1;
                iArr3[i8] = 0;
                return 0;
            case 8:
                int[] iArr4 = this.k;
                int i9 = this.n;
                this.n = i9 + 1;
                iArr4[i9] = 1;
                return 0;
            case 9:
                java.lang.Object[] objArr5 = this.q;
                int i10 = this.n;
                this.n = i10 + 1;
                objArr5[i10] = objArr5[i10 - 1];
                return 0;
            case 10:
                int i11 = this.n - 1;
                this.n = i11;
                java.lang.Object[] objArr6 = this.q;
                java.lang.Object obj2 = objArr6[i11];
                objArr6[i11] = null;
                this.c = obj2 == null ? 0 : 1;
                return 0;
            case 11:
                java.lang.Object[] objArr7 = this.q;
                int i12 = this.n;
                int i13 = i12 - 1;
                java.lang.Object obj3 = objArr7[i13];
                objArr7[i13] = null;
                int i14 = i12 - 2;
                java.lang.Object obj4 = objArr7[i14];
                objArr7[i14] = null;
                objArr7[i13] = obj4;
                objArr7[i14] = obj3;
                return 0;
            case 12:
                int i15 = this.n - 1;
                this.n = i15;
                this.q[i15] = null;
                return 0;
            case 13:
                java.lang.Object[] objArr8 = this.q;
                int i16 = this.n - 1;
                java.lang.Object obj5 = objArr8[i16];
                objArr8[i16] = null;
                this.g = obj5;
                return 0;
            case 14:
                int[] iArr5 = this.k;
                int i17 = this.n;
                this.n = i17 + 1;
                iArr5[i17] = 1769;
                return 0;
            case 15:
                int[] iArr6 = this.k;
                int i18 = this.n;
                iArr6[i18] = 16;
                this.n = i18;
                int i19 = i18 - 1;
                iArr6[i19] = iArr6[i19] >> 16;
                return 0;
            case 16:
                int i20 = this.n;
                int i21 = i20 - 1;
                this.n = i21;
                int[] iArr7 = this.k;
                int i22 = i20 - 2;
                iArr7[i22] = iArr7[i22] - iArr7[i21];
                return 0;
            case 17:
                int[] iArr8 = this.k;
                int i23 = this.n - 1;
                iArr8[i23] = (char) iArr8[i23];
                return 0;
            case 18:
                int[] iArr9 = this.k;
                int i24 = this.n;
                iArr9[i24] = -1;
                this.n = i24 + 2;
                iArr9[i24 + 1] = 0;
                return 0;
            case 19:
                int i25 = this.n;
                int i26 = i25 - 1;
                this.n = i26;
                int[] iArr10 = this.k;
                int i27 = i25 - 2;
                int i28 = iArr10[i27] + iArr10[i26];
                iArr10[i27] = i28;
                iArr10[i27] = (char) i28;
                return 0;
            case 20:
                int[] iArr11 = this.k;
                int i29 = this.n;
                iArr11[i29] = 8;
                this.n = i29;
                int i30 = i29 - 1;
                iArr11[i30] = iArr11[i30] >> 8;
                return 0;
            case 21:
                java.lang.Object[] objArr9 = this.q;
                int i31 = this.n;
                this.n = i31 + 1;
                objArr9[i31] = null;
                return 0;
            case 22:
                java.lang.Object[] objArr10 = this.q;
                int i32 = this.n;
                objArr10[i32] = null;
                this.n = i32 + 2;
                objArr10[i32 + 1] = null;
                return 0;
            case 23:
                long[] jArr = this.m;
                int i33 = this.n;
                this.n = i33 + 1;
                jArr[i33] = this.b;
                return 0;
            case 24:
                java.lang.Object[] objArr11 = this.q;
                int i34 = this.n;
                this.n = i34 + 1;
                objArr11[i34] = objArr11[8];
                return 0;
            case 25:
                int i35 = this.n;
                long[] jArr2 = this.m;
                int i36 = i35 - 2;
                jArr2[i36] = jArr2[i36] - jArr2[i35 - 1];
                int i37 = i35 - 2;
                this.n = i37;
                jArr2[11] = jArr2[i37];
                return 0;
            case 26:
                long[] jArr3 = this.m;
                int i38 = this.l;
                this.l = i38 + 1;
                this.e = jArr3[i38];
                return 0;
            case 27:
                long[] jArr4 = this.m;
                int i39 = this.n;
                this.n = i39 + 1;
                jArr4[i39] = jArr4[11];
                return 0;
            case 28:
                java.lang.Object[] objArr12 = this.q;
                int i40 = this.n;
                java.lang.Object obj6 = objArr12[8];
                objArr12[i40] = obj6;
                this.n = i40 + 2;
                objArr12[i40 + 1] = obj6;
                return 0;
            case 29:
                int[] iArr12 = this.k;
                int i41 = this.n;
                this.n = i41 + 1;
                iArr12[i41] = 2;
                return 0;
            case 30:
                int[] iArr13 = this.k;
                int i42 = this.n;
                iArr13[i42] = 2;
                this.n = i42;
                int i43 = i42 - 1;
                iArr13[i43] = iArr13[i43] % 2;
                return 0;
            case 32:
                int[] iArr14 = this.k;
                int i44 = this.n;
                iArr14[i44] = 95;
                int i45 = i44 - 1;
                int i46 = iArr14[i45] + 95;
                iArr14[i45] = i46;
                this.n = i44 + 1;
                iArr14[i44] = i46;
            case 31:
                return 0;
            case 33:
                int[] iArr15 = this.k;
                int i47 = this.n;
                iArr15[i47] = 128;
                this.n = i47;
                int i48 = i47 - 1;
                iArr15[i48] = iArr15[i48] % 128;
                return 0;
            case 34:
                int i49 = this.n - 1;
                this.n = i49;
                this.c = this.k[i49] != 0 ? 0 : 1;
                return 0;
            case 35:
                java.lang.Object[] objArr13 = this.q;
                int i50 = this.n;
                this.n = i50 + 1;
                objArr13[i50] = null;
                int[] iArr16 = this.k;
                objArr13[i50] = null;
                iArr16[i50] = objArr.length;
                this.n = i50;
                objArr13[i50] = null;
                return 0;
            case 36:
                int[] iArr17 = this.k;
                int i51 = this.n;
                iArr17[i51] = 65;
                int i52 = i51 - 1;
                int i53 = iArr17[i52] + 65;
                iArr17[i52] = i53;
                this.n = i51 + 1;
                iArr17[i51] = i53;
                return 0;
            case 37:
                int[] iArr18 = this.k;
                int i54 = this.n;
                this.n = i54 + 1;
                iArr18[i54] = 128;
                return 0;
            case 38:
                int i55 = this.n;
                int i56 = i55 - 1;
                this.n = i56;
                int[] iArr19 = this.k;
                int i57 = i55 - 2;
                iArr19[i57] = iArr19[i57] % iArr19[i56];
                return 0;
            case 39:
                int i58 = this.n - 1;
                this.n = i58;
                this.c = this.k[i58] == 0 ? 0 : 1;
                return 0;
            case 40:
                int[] iArr20 = this.k;
                int i59 = this.n - 1;
                this.n = i59;
                this.c = iArr20[i59];
                return 0;
            case 41:
                int[] iArr21 = this.k;
                int i60 = this.n;
                this.n = i60 + 1;
                iArr21[i60] = 86;
                return 0;
            case 42:
                int[] iArr22 = this.k;
                int i61 = this.n;
                this.n = i61 + 1;
                iArr22[i61] = 85;
                return 0;
            case 43:
                for (int i62 = this.n - 1; i62 >= 0; i62--) {
                    this.q[i62] = null;
                }
                java.lang.Object[] objArr14 = this.q;
                this.n = 1;
                objArr14[0] = this.j;
                return 0;
            default:
                return i;
        }
    }

    public dw(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object[] objArr = new java.lang.Object[13];
        this.q = objArr;
        objArr[8] = obj;
        objArr[9] = obj2;
        objArr[10] = obj3;
        this.n = 0;
        this.l = -1;
    }
}

package com.facetec.sdk;

/* loaded from: classes8.dex */
public class dx {

    /* renamed from: a, reason: collision with root package name */
    public float f3530a;
    public long b;
    public int c;
    public int d;
    public long e;
    public float f;
    public java.lang.Object g;
    public java.lang.Object h;
    public double i;
    public double j;
    private int l;
    private final int[] m;

    /* renamed from: o, reason: collision with root package name */
    private int f3531o;
    private final java.lang.Object[] p;
    private final long[] k = new long[10];
    private final float[] n = new float[10];
    private final double[] r = new double[10];

    public int e(int i) {
        switch (i) {
            case 1:
                int i2 = this.f3531o - this.c;
                this.f3531o = i2;
                this.l = i2;
                return 0;
            case 2:
                java.lang.Object[] objArr = this.p;
                int i3 = this.l;
                this.l = i3 + 1;
                java.lang.Object obj = objArr[i3];
                objArr[i3] = null;
                this.g = obj;
                return 0;
            case 3:
                java.lang.Object[] objArr2 = this.p;
                int i4 = this.f3531o;
                this.f3531o = i4 + 1;
                objArr2[i4] = this.h;
                return 0;
            case 4:
                java.lang.Object[] objArr3 = this.p;
                int i5 = this.f3531o;
                this.f3531o = i5 + 1;
                objArr3[i5] = objArr3[i5 - 1];
                return 0;
            case 5:
                int i6 = this.f3531o - 1;
                this.f3531o = i6;
                java.lang.Object[] objArr4 = this.p;
                java.lang.Object obj2 = objArr4[i6];
                objArr4[i6] = null;
                this.d = obj2 == null ? 0 : 1;
                return 0;
            case 6:
                java.lang.Object[] objArr5 = this.p;
                int i7 = this.f3531o;
                int i8 = i7 - 1;
                java.lang.Object obj3 = objArr5[i8];
                objArr5[i8] = null;
                int i9 = i7 - 2;
                java.lang.Object obj4 = objArr5[i9];
                objArr5[i9] = null;
                objArr5[i8] = obj4;
                objArr5[i9] = obj3;
                int i10 = i7 - 1;
                this.f3531o = i10;
                objArr5[i10] = null;
                return 0;
            case 7:
                java.lang.Object[] objArr6 = this.p;
                int i11 = this.f3531o - 1;
                java.lang.Object obj5 = objArr6[i11];
                objArr6[i11] = null;
                this.g = obj5;
                return 0;
            case 8:
                int i12 = this.f3531o - 1;
                this.f3531o = i12;
                this.p[i12] = null;
                return 0;
            case 9:
                int[] iArr = this.m;
                int i13 = this.f3531o;
                this.f3531o = i13 + 1;
                iArr[i13] = this.c;
                return 0;
            case 10:
                int[] iArr2 = this.m;
                int i14 = this.f3531o;
                this.f3531o = i14 + 1;
                iArr2[i14] = 0;
                return 0;
            case 11:
                int[] iArr3 = this.m;
                int i15 = this.l;
                this.l = i15 + 1;
                this.d = iArr3[i15];
                return 0;
            case 12:
                long[] jArr = this.k;
                int i16 = this.f3531o;
                this.f3531o = i16 + 1;
                jArr[i16] = this.b;
                return 0;
            case 13:
                long[] jArr2 = this.k;
                int i17 = this.f3531o;
                jArr2[i17] = 0;
                this.f3531o = i17;
                int i18 = i17 - 1;
                this.m[i18] = (jArr2[i18] > 0L ? 1 : (jArr2[i18] == 0L ? 0 : -1));
                return 0;
            case 14:
                int i19 = this.f3531o;
                int i20 = i19 - 1;
                this.f3531o = i20;
                int[] iArr4 = this.m;
                int i21 = i19 - 2;
                iArr4[i21] = iArr4[i21] - iArr4[i20];
                return 0;
            case 15:
                int i22 = this.f3531o;
                int i23 = i22 - 1;
                this.f3531o = i23;
                int[] iArr5 = this.m;
                int i24 = i22 - 2;
                iArr5[i24] = iArr5[i24] + iArr5[i23];
                return 0;
            case 16:
                java.lang.Object[] objArr7 = this.p;
                int i25 = this.f3531o;
                this.f3531o = i25 + 1;
                objArr7[i25] = null;
                return 0;
            case 17:
                java.lang.Object[] objArr8 = this.p;
                int i26 = this.f3531o;
                objArr8[i26] = null;
                this.f3531o = i26 + 2;
                objArr8[i26 + 1] = null;
                return 0;
            case 18:
                int i27 = this.f3531o - 1;
                this.f3531o = i27;
                long[] jArr3 = this.k;
                jArr3[8] = jArr3[i27];
                return 0;
            case 19:
                java.lang.Object[] objArr9 = this.p;
                int i28 = this.f3531o;
                this.f3531o = i28 + 1;
                objArr9[i28] = objArr9[6];
                return 0;
            case 20:
                long[] jArr4 = this.k;
                int i29 = this.l;
                this.l = i29 + 1;
                this.e = jArr4[i29];
                return 0;
            case 21:
                long[] jArr5 = this.k;
                int i30 = this.f3531o;
                jArr5[i30] = jArr5[8];
                int[] iArr6 = this.m;
                this.f3531o = i30 + 2;
                iArr6[i30 + 1] = iArr6[7];
                return 0;
            case 22:
                int i31 = this.f3531o - 1;
                this.f3531o = i31;
                java.lang.Object[] objArr10 = this.p;
                java.lang.Object obj6 = objArr10[i31];
                objArr10[i31] = null;
                objArr10[7] = obj6;
                return 0;
            case 23:
                java.lang.Object[] objArr11 = this.p;
                int i32 = this.f3531o;
                this.f3531o = i32 + 1;
                objArr11[i32] = objArr11[7];
                return 0;
            case 24:
                int[] iArr7 = this.m;
                int i33 = this.f3531o;
                int i34 = i33 + 1;
                iArr7[i33] = 2;
                iArr7[i34] = 2;
                this.f3531o = i34;
                iArr7[i33] = iArr7[i33] % 2;
                return 0;
            case 25:
                int[] iArr8 = this.m;
                int i35 = this.f3531o;
                this.f3531o = i35 + 1;
                iArr8[i35] = 2;
                return 0;
            case 26:
                int[] iArr9 = this.m;
                int i36 = this.f3531o;
                iArr9[i36] = 2;
                this.f3531o = i36;
                int i37 = i36 - 1;
                iArr9[i37] = iArr9[i37] % 2;
                return 0;
            case 27:
                int[] iArr10 = this.m;
                int i38 = this.f3531o;
                iArr10[i38] = 95;
                this.f3531o = i38;
                int i39 = i38 - 1;
                iArr10[i39] = iArr10[i39] + 95;
                return 0;
            case 28:
                int[] iArr11 = this.m;
                int i40 = this.f3531o;
                iArr11[i40] = iArr11[i40 - 1];
                this.f3531o = i40 + 2;
                iArr11[i40 + 1] = 128;
                return 0;
            case 29:
                int i41 = this.f3531o;
                int i42 = i41 - 1;
                this.f3531o = i42;
                int[] iArr12 = this.m;
                int i43 = i41 - 2;
                iArr12[i43] = iArr12[i43] % iArr12[i42];
                return 0;
            case 30:
                int i44 = this.f3531o - 1;
                this.f3531o = i44;
                this.d = this.m[i44] != 0 ? 0 : 1;
                return 0;
            case 31:
                int[] iArr13 = this.m;
                int i45 = this.f3531o;
                this.f3531o = i45 + 1;
                iArr13[i45] = 4;
                return 0;
            case 32:
                int i46 = this.f3531o;
                int[] iArr14 = this.m;
                int i47 = i46 - 2;
                iArr14[i47] = iArr14[i47] << iArr14[i46 - 1];
                int i48 = i46 - 2;
                this.f3531o = i48;
                this.p[i48] = null;
                return 0;
            case 33:
                int[] iArr15 = this.m;
                int i49 = this.f3531o - 1;
                this.f3531o = i49;
                this.d = iArr15[i49];
                return 0;
            case 34:
                int[] iArr16 = this.m;
                int i50 = this.f3531o;
                this.f3531o = i50 + 1;
                iArr16[i50] = 76;
                return 0;
            case 35:
                int[] iArr17 = this.m;
                int i51 = this.f3531o;
                this.f3531o = i51 + 1;
                iArr17[i51] = 87;
                return 0;
            case 36:
                for (int i52 = this.f3531o - 1; i52 >= 0; i52--) {
                    this.p[i52] = null;
                }
                java.lang.Object[] objArr12 = this.p;
                this.f3531o = 1;
                objArr12[0] = this.h;
                return 0;
            default:
                return i;
        }
    }

    public dx(java.lang.Object obj, int i) {
        int[] iArr = new int[10];
        this.m = iArr;
        java.lang.Object[] objArr = new java.lang.Object[10];
        this.p = objArr;
        objArr[6] = obj;
        iArr[7] = i;
        this.f3531o = 0;
        this.l = -1;
    }
}

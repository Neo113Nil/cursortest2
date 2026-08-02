package com.facetec.sdk;

/* loaded from: classes8.dex */
public class dy {

    /* renamed from: a, reason: collision with root package name */
    public float f3532a;
    public long b;
    public int c;
    public int d;
    public long e;
    public java.lang.Object f;
    public float g;
    public double h;
    public double i;
    public java.lang.Object j;
    private int l;
    private int m;
    private final java.lang.Object[] t;

    /* renamed from: o, reason: collision with root package name */
    private final int[] f3533o = new int[5];
    private final long[] k = new long[5];
    private final float[] n = new float[5];
    private final double[] s = new double[5];

    public int b(int i) {
        switch (i) {
            case 1:
                java.lang.Object[] objArr = this.t;
                int i2 = this.m;
                this.m = i2 + 1;
                objArr[i2] = this.j;
                return 0;
            case 2:
                int i3 = this.m - 1;
                this.m = i3;
                java.lang.Object[] objArr2 = this.t;
                java.lang.Object obj = objArr2[i3];
                objArr2[i3] = null;
                this.c = obj == null ? 0 : 1;
                return 0;
            case 3:
                int i4 = this.m - this.d;
                this.m = i4;
                this.l = i4;
                return 0;
            case 4:
                java.lang.Object[] objArr3 = this.t;
                int i5 = this.l;
                this.l = i5 + 1;
                java.lang.Object obj2 = objArr3[i5];
                objArr3[i5] = null;
                this.f = obj2;
                return 0;
            case 5:
                int[] iArr = this.f3533o;
                int i6 = this.m;
                this.m = i6 + 1;
                iArr[i6] = this.d;
                return 0;
            case 6:
                this.c = this.f3533o[this.m - 1];
                return 0;
            case 7:
                java.lang.Object[] objArr4 = this.t;
                int i7 = this.m;
                this.m = i7 + 1;
                objArr4[i7] = objArr4[i7 - 1];
                return 0;
            case 8:
                int[] iArr2 = this.f3533o;
                int i8 = this.m;
                iArr2[i8] = 2;
                this.m = i8 + 2;
                iArr2[i8 + 1] = 2;
                return 0;
            case 9:
                int i9 = this.m;
                int i10 = i9 - 1;
                this.m = i10;
                int[] iArr3 = this.f3533o;
                int i11 = i9 - 2;
                iArr3[i11] = iArr3[i11] % iArr3[i10];
                return 0;
            case 10:
                int i12 = this.m - 1;
                this.m = i12;
                this.t[i12] = null;
                return 0;
            case 12:
                int[] iArr4 = this.f3533o;
                int i13 = this.m;
                this.m = i13 + 1;
                iArr4[i13] = 51;
            case 11:
                return 0;
            case 13:
                int i14 = this.m;
                int i15 = i14 - 1;
                int[] iArr5 = this.f3533o;
                int i16 = i14 - 2;
                int i17 = iArr5[i16] + iArr5[i15];
                iArr5[i16] = i17;
                iArr5[i15] = i17;
                this.m = i14 + 1;
                iArr5[i14] = 128;
                return 0;
            case 14:
                int[] iArr6 = this.f3533o;
                int i18 = this.l;
                this.l = i18 + 1;
                this.c = iArr6[i18];
                return 0;
            case 15:
                int i19 = this.m - 1;
                this.m = i19;
                this.c = this.f3533o[i19] != 0 ? 0 : 1;
                return 0;
            case 16:
                int[] iArr7 = this.f3533o;
                int i20 = this.m;
                iArr7[i20] = 2;
                this.m = i20;
                int i21 = i20 - 1;
                iArr7[i21] = iArr7[i21] % 2;
                return 0;
            case 17:
                java.lang.Object[] objArr5 = this.t;
                int i22 = this.m - 1;
                java.lang.Object obj3 = objArr5[i22];
                objArr5[i22] = null;
                this.f = obj3;
                return 0;
            case 18:
                int[] iArr8 = this.f3533o;
                int i23 = this.m;
                iArr8[i23] = 59;
                this.m = i23 + 2;
                iArr8[i23 + 1] = 0;
                return 0;
            case 19:
                int i24 = this.m;
                int i25 = i24 - 1;
                this.m = i25;
                int[] iArr9 = this.f3533o;
                int i26 = i24 - 2;
                iArr9[i26] = iArr9[i26] / iArr9[i25];
                return 0;
            case 20:
                int[] iArr10 = this.f3533o;
                int i27 = this.m;
                this.m = i27 + 1;
                iArr10[i27] = 113;
                return 0;
            case 21:
                int i28 = this.m;
                int i29 = i28 - 1;
                int[] iArr11 = this.f3533o;
                int i30 = i28 - 2;
                int i31 = iArr11[i30] + iArr11[i29];
                iArr11[i30] = i31;
                this.m = i28;
                iArr11[i29] = i31;
                return 0;
            case 22:
                int[] iArr12 = this.f3533o;
                int i32 = this.m;
                this.m = i32 + 1;
                iArr12[i32] = 128;
                return 0;
            case 23:
                int[] iArr13 = this.f3533o;
                int i33 = this.m;
                this.m = i33 + 1;
                iArr13[i33] = 2;
                return 0;
            case 24:
                java.lang.Object[] objArr6 = this.t;
                int i34 = this.m;
                this.m = i34 + 1;
                objArr6[i34] = null;
                return 0;
            case 25:
                int[] iArr14 = this.f3533o;
                int i35 = this.m - 1;
                this.m = i35;
                this.c = iArr14[i35];
                return 0;
            case 26:
                int[] iArr15 = this.f3533o;
                int i36 = this.m;
                this.m = i36 + 1;
                iArr15[i36] = 1;
                return 0;
            case 27:
                int[] iArr16 = this.f3533o;
                int i37 = this.m;
                this.m = i37 + 1;
                iArr16[i37] = 0;
                return 0;
            case 28:
                for (int i38 = this.m - 1; i38 >= 0; i38--) {
                    this.t[i38] = null;
                }
                java.lang.Object[] objArr7 = this.t;
                this.m = 1;
                objArr7[0] = this.j;
                return 0;
            default:
                return i;
        }
    }

    public dy(java.lang.Object obj) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        this.t = objArr;
        objArr[4] = obj;
        this.m = 0;
        this.l = -1;
    }
}

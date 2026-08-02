package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final f0 f11769f = new f0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f11770a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f11771b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f11772c;

    /* renamed from: d, reason: collision with root package name */
    public int f11773d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11774e;

    public f0(int i7, int[] iArr, Object[] objArr, boolean z4) {
        this.f11770a = i7;
        this.f11771b = iArr;
        this.f11772c = objArr;
        this.f11774e = z4;
    }

    public static f0 c() {
        return new f0(0, new int[8], new Object[8], true);
    }

    public final void a(int i7) {
        int[] iArr = this.f11771b;
        if (i7 > iArr.length) {
            int i8 = this.f11770a;
            int i9 = (i8 / 2) + i8;
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f11771b = Arrays.copyOf(iArr, i7);
            this.f11772c = Arrays.copyOf(this.f11772c, i7);
        }
    }

    public final int b() {
        int C02;
        int i7 = this.f11773d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f11770a; i9++) {
            int i10 = this.f11771b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                C02 = C0876l.C0(i11, ((Long) this.f11772c[i9]).longValue());
            } else if (i12 == 1) {
                ((Long) this.f11772c[i9]).getClass();
                C02 = C0876l.n0(i11);
            } else if (i12 == 2) {
                C02 = C0876l.i0(i11, (AbstractC0873i) this.f11772c[i9]);
            } else if (i12 == 3) {
                i8 = ((f0) this.f11772c[i9]).b() + (C0876l.z0(i11) * 2) + i8;
            } else {
                if (i12 != 5) {
                    throw new IllegalStateException(C.c());
                }
                ((Integer) this.f11772c[i9]).getClass();
                C02 = C0876l.m0(i11);
            }
            i8 = C02 + i8;
        }
        this.f11773d = i8;
        return i8;
    }

    public final void d(int i7, Object obj) {
        if (!this.f11774e) {
            throw new UnsupportedOperationException();
        }
        a(this.f11770a + 1);
        int[] iArr = this.f11771b;
        int i8 = this.f11770a;
        iArr[i8] = i7;
        this.f11772c[i8] = obj;
        this.f11770a = i8 + 1;
    }

    public final void e(L l7) {
        if (this.f11770a == 0) {
            return;
        }
        l7.getClass();
        for (int i7 = 0; i7 < this.f11770a; i7++) {
            int i8 = this.f11771b[i7];
            Object obj = this.f11772c[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 == 0) {
                l7.j(i9, ((Long) obj).longValue());
            } else if (i10 == 1) {
                l7.f(i9, ((Long) obj).longValue());
            } else if (i10 == 2) {
                l7.b(i9, (AbstractC0873i) obj);
            } else if (i10 == 3) {
                C0876l c0876l = (C0876l) l7.f11722a;
                c0876l.L0(i9, 3);
                ((f0) obj).e(l7);
                c0876l.L0(i9, 4);
            } else {
                if (i10 != 5) {
                    throw new RuntimeException(C.c());
                }
                l7.e(i9, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        int i7 = this.f11770a;
        if (i7 == f0Var.f11770a) {
            int[] iArr = this.f11771b;
            int[] iArr2 = f0Var.f11771b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.f11772c;
                    Object[] objArr2 = f0Var.f11772c;
                    int i9 = this.f11770a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
                if (iArr[i8] != iArr2[i8]) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f11770a;
        int i8 = (527 + i7) * 31;
        int[] iArr = this.f11771b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i8 + i10) * 31;
        Object[] objArr = this.f11772c;
        int i13 = this.f11770a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }
}

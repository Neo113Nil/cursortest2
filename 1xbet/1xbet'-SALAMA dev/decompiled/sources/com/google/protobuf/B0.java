package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class B0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final B0 f12098f = new B0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f12100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f12101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12102d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12103e;

    public B0(int i7, int[] iArr, Object[] objArr, boolean z4) {
        this.f12099a = i7;
        this.f12100b = iArr;
        this.f12101c = objArr;
        this.f12103e = z4;
    }

    public static B0 c() {
        return new B0(0, new int[8], new Object[8], true);
    }

    public final void a(int i7) {
        int[] iArr = this.f12100b;
        if (i7 > iArr.length) {
            int i8 = this.f12099a;
            int i9 = (i8 / 2) + i8;
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f12100b = Arrays.copyOf(iArr, i7);
            this.f12101c = Arrays.copyOf(this.f12101c, i7);
        }
    }

    public final int b() {
        int iS0;
        int i7 = this.f12102d;
        if (i7 != -1) {
            return i7;
        }
        int iB = 0;
        for (int i8 = 0; i8 < this.f12099a; i8++) {
            int i9 = this.f12100b[i8];
            int i10 = i9 >>> 3;
            int i11 = i9 & 7;
            if (i11 == 0) {
                iS0 = AbstractC0879q.s0(i10, ((Long) this.f12101c[i8]).longValue());
            } else if (i11 == 1) {
                ((Long) this.f12101c[i8]).getClass();
                iS0 = AbstractC0879q.d0(i10);
            } else if (i11 != 2) {
                if (i11 == 3) {
                    iB = ((B0) this.f12101c[i8]).b() + (AbstractC0879q.p0(i10) * 2) + iB;
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException(M.d());
                    }
                    ((Integer) this.f12101c[i8]).getClass();
                    iS0 = AbstractC0879q.c0(i10);
                }
            } else {
                iS0 = AbstractC0879q.Y(i10, (AbstractC0867k) this.f12101c[i8]);
            }
            iB = iS0 + iB;
        }
        this.f12102d = iB;
        return iB;
    }

    public final void d(int i7, Object obj) {
        if (!this.f12103e) {
            throw new UnsupportedOperationException();
        }
        a(this.f12099a + 1);
        int[] iArr = this.f12100b;
        int i8 = this.f12099a;
        iArr[i8] = i7;
        this.f12101c[i8] = obj;
        this.f12099a = i8 + 1;
    }

    public final void e(X x4) {
        if (this.f12099a == 0) {
            return;
        }
        x4.getClass();
        for (int i7 = 0; i7 < this.f12099a; i7++) {
            int i8 = this.f12100b[i7];
            Object obj = this.f12101c[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 == 0) {
                x4.k(i9, ((Long) obj).longValue());
            } else if (i10 == 1) {
                x4.g(i9, ((Long) obj).longValue());
            } else if (i10 == 2) {
                x4.c(i9, (AbstractC0867k) obj);
            } else if (i10 == 3) {
                AbstractC0879q abstractC0879q = (AbstractC0879q) x4.f12168a;
                abstractC0879q.K0(i9, 3);
                ((B0) obj).e(x4);
                abstractC0879q.K0(i9, 4);
            } else {
                if (i10 != 5) {
                    throw new RuntimeException(M.d());
                }
                x4.f(i9, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof B0)) {
            return false;
        }
        B0 b7 = (B0) obj;
        int i7 = this.f12099a;
        if (i7 == b7.f12099a) {
            int[] iArr = this.f12100b;
            int[] iArr2 = b7.f12100b;
            for (int i8 = 0; i8 < i7; i8++) {
                if (iArr[i8] == iArr2[i8]) {
                }
            }
            Object[] objArr = this.f12101c;
            Object[] objArr2 = b7.f12101c;
            int i9 = this.f12099a;
            for (int i10 = 0; i10 < i9; i10++) {
                if (objArr[i10].equals(objArr2[i10])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f12099a;
        int i8 = (527 + i7) * 31;
        int[] iArr = this.f12100b;
        int iHashCode = 17;
        int i9 = 17;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 = (i9 * 31) + iArr[i10];
        }
        int i11 = (i8 + i9) * 31;
        Object[] objArr = this.f12101c;
        int i12 = this.f12099a;
        for (int i13 = 0; i13 < i12; i13++) {
            iHashCode = (iHashCode * 31) + objArr[i13].hashCode();
        }
        return i11 + iHashCode;
    }
}

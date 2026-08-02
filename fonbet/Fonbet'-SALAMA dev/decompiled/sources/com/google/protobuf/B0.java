package com.google.protobuf;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class B0 {

    /* renamed from: f, reason: collision with root package name */
    public static final B0 f12098f = new B0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f12099a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f12100b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f12101c;

    /* renamed from: d, reason: collision with root package name */
    public int f12102d = -1;

    /* renamed from: e, reason: collision with root package name */
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
        int s02;
        int i7 = this.f12102d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f12099a; i9++) {
            int i10 = this.f12100b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                s02 = AbstractC0923q.s0(i11, ((Long) this.f12101c[i9]).longValue());
            } else if (i12 == 1) {
                ((Long) this.f12101c[i9]).getClass();
                s02 = AbstractC0923q.d0(i11);
            } else if (i12 == 2) {
                s02 = AbstractC0923q.Y(i11, (AbstractC0911k) this.f12101c[i9]);
            } else if (i12 == 3) {
                i8 = ((B0) this.f12101c[i9]).b() + (AbstractC0923q.p0(i11) * 2) + i8;
            } else {
                if (i12 != 5) {
                    throw new IllegalStateException(M.d());
                }
                ((Integer) this.f12101c[i9]).getClass();
                s02 = AbstractC0923q.c0(i11);
            }
            i8 = s02 + i8;
        }
        this.f12102d = i8;
        return i8;
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
                x4.c(i9, (AbstractC0911k) obj);
            } else if (i10 == 3) {
                AbstractC0923q abstractC0923q = (AbstractC0923q) x4.f12168a;
                abstractC0923q.K0(i9, 3);
                ((B0) obj).e(x4);
                abstractC0923q.K0(i9, 4);
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
        B0 b02 = (B0) obj;
        int i7 = this.f12099a;
        if (i7 == b02.f12099a) {
            int[] iArr = this.f12100b;
            int[] iArr2 = b02.f12100b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.f12101c;
                    Object[] objArr2 = b02.f12101c;
                    int i9 = this.f12099a;
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
        int i7 = this.f12099a;
        int i8 = (527 + i7) * 31;
        int[] iArr = this.f12100b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i8 + i10) * 31;
        Object[] objArr = this.f12101c;
        int i13 = this.f12099a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }
}

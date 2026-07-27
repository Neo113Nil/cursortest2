package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f4422f = new c0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f4423a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4424b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f4425c;

    /* renamed from: d, reason: collision with root package name */
    public int f4426d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4427e;

    public c0(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f4423a = i2;
        this.f4424b = iArr;
        this.f4425c = objArr;
        this.f4427e = z;
    }

    public final void a(int i2) {
        int[] iArr = this.f4424b;
        if (i2 > iArr.length) {
            int i3 = this.f4423a;
            int i6 = (i3 / 2) + i3;
            if (i6 >= i2) {
                i2 = i6;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f4424b = Arrays.copyOf(iArr, i2);
            this.f4425c = Arrays.copyOf(this.f4425c, i2);
        }
    }

    public final int b() {
        int c02;
        int i2 = this.f4426d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i6 = 0; i6 < this.f4423a; i6++) {
            int i7 = this.f4424b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                c02 = C0217l.c0(i8, ((Long) this.f4425c[i6]).longValue());
            } else if (i9 == 1) {
                ((Long) this.f4425c[i6]).getClass();
                c02 = C0217l.O(i8);
            } else if (i9 == 2) {
                c02 = C0217l.K(i8, (C0212g) this.f4425c[i6]);
            } else if (i9 == 3) {
                i3 = ((c0) this.f4425c[i6]).b() + (C0217l.Z(i8) * 2) + i3;
            } else {
                if (i9 != 5) {
                    throw new IllegalStateException(C0230z.b());
                }
                ((Integer) this.f4425c[i6]).getClass();
                c02 = C0217l.N(i8);
            }
            i3 = c02 + i3;
        }
        this.f4426d = i3;
        return i3;
    }

    public final void c(int i2, Object obj) {
        if (!this.f4427e) {
            throw new UnsupportedOperationException();
        }
        a(this.f4423a + 1);
        int[] iArr = this.f4424b;
        int i3 = this.f4423a;
        iArr[i3] = i2;
        this.f4425c[i3] = obj;
        this.f4423a = i3 + 1;
    }

    public final void d(E e3) {
        if (this.f4423a == 0) {
            return;
        }
        e3.getClass();
        for (int i2 = 0; i2 < this.f4423a; i2++) {
            int i3 = this.f4424b[i2];
            Object obj = this.f4425c[i2];
            int i6 = i3 >>> 3;
            int i7 = i3 & 7;
            if (i7 == 0) {
                e3.j(i6, ((Long) obj).longValue());
            } else if (i7 == 1) {
                e3.f(i6, ((Long) obj).longValue());
            } else if (i7 == 2) {
                e3.b(i6, (C0212g) obj);
            } else if (i7 == 3) {
                C0217l c0217l = (C0217l) e3.f4362a;
                c0217l.t0(i6, 3);
                ((c0) obj).d(e3);
                c0217l.t0(i6, 4);
            } else {
                if (i7 != 5) {
                    throw new RuntimeException(C0230z.b());
                }
                e3.e(i6, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i2 = this.f4423a;
        if (i2 == c0Var.f4423a) {
            int[] iArr = this.f4424b;
            int[] iArr2 = c0Var.f4424b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.f4425c;
                    Object[] objArr2 = c0Var.f4425c;
                    int i6 = this.f4423a;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
                if (iArr[i3] != iArr2[i3]) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f4423a;
        int i3 = (527 + i2) * 31;
        int[] iArr = this.f4424b;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i2; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = (i3 + i7) * 31;
        Object[] objArr = this.f4425c;
        int i10 = this.f4423a;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }
}

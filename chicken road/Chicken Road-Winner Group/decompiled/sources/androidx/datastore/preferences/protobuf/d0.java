package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 {
    public static final d0 f = new d0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f2223a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2224b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f2225c;

    /* renamed from: d, reason: collision with root package name */
    public int f2226d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2227e;

    public d0(int i3, int[] iArr, Object[] objArr, boolean z3) {
        this.f2223a = i3;
        this.f2224b = iArr;
        this.f2225c = objArr;
        this.f2227e = z3;
    }

    public final void a(int i3) {
        int[] iArr = this.f2224b;
        if (i3 > iArr.length) {
            int i4 = this.f2223a;
            int i5 = (i4 / 2) + i4;
            if (i5 >= i3) {
                i3 = i5;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f2224b = Arrays.copyOf(iArr, i3);
            this.f2225c = Arrays.copyOf(this.f2225c, i3);
        }
    }

    public final int b() {
        int q02;
        int s02;
        int q03;
        int i3 = this.f2226d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f2223a; i5++) {
            int i6 = this.f2224b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 != 0) {
                if (i8 == 1) {
                    ((Long) this.f2225c[i5]).getClass();
                    q03 = C0138m.q0(i7) + 8;
                } else if (i8 == 2) {
                    q03 = C0138m.o0(i7, (C0132g) this.f2225c[i5]);
                } else if (i8 == 3) {
                    q02 = C0138m.q0(i7) * 2;
                    s02 = ((d0) this.f2225c[i5]).b();
                } else {
                    if (i8 != 5) {
                        throw new IllegalStateException(A.b());
                    }
                    ((Integer) this.f2225c[i5]).getClass();
                    q03 = C0138m.q0(i7) + 4;
                }
                i4 = q03 + i4;
            } else {
                long longValue = ((Long) this.f2225c[i5]).longValue();
                q02 = C0138m.q0(i7);
                s02 = C0138m.s0(longValue);
            }
            i4 = s02 + q02 + i4;
        }
        this.f2226d = i4;
        return i4;
    }

    public final void c(int i3, Object obj) {
        if (!this.f2227e) {
            throw new UnsupportedOperationException();
        }
        a(this.f2223a + 1);
        int[] iArr = this.f2224b;
        int i4 = this.f2223a;
        iArr[i4] = i3;
        this.f2225c[i4] = obj;
        this.f2223a = i4 + 1;
    }

    public final void d(F f3) {
        if (this.f2223a == 0) {
            return;
        }
        f3.getClass();
        for (int i3 = 0; i3 < this.f2223a; i3++) {
            int i4 = this.f2224b[i3];
            Object obj = this.f2225c[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            C0138m c0138m = (C0138m) f3.f2161a;
            if (i6 == 0) {
                c0138m.M0(i5, ((Long) obj).longValue());
            } else if (i6 == 1) {
                c0138m.C0(i5, ((Long) obj).longValue());
            } else if (i6 == 2) {
                c0138m.y0(i5, (C0132g) obj);
            } else if (i6 == 3) {
                c0138m.J0(i5, 3);
                ((d0) obj).d(f3);
                c0138m.J0(i5, 4);
            } else {
                if (i6 != 5) {
                    throw new RuntimeException(A.b());
                }
                c0138m.A0(i5, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        int i3 = this.f2223a;
        if (i3 == d0Var.f2223a) {
            int[] iArr = this.f2224b;
            int[] iArr2 = d0Var.f2224b;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    Object[] objArr = this.f2225c;
                    Object[] objArr2 = d0Var.f2225c;
                    int i5 = this.f2223a;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (objArr[i6].equals(objArr2[i6])) {
                        }
                    }
                    return true;
                }
                if (iArr[i4] != iArr2[i4]) {
                    break;
                }
                i4++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f2223a;
        int i4 = (527 + i3) * 31;
        int[] iArr = this.f2224b;
        int i5 = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i3; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = (i4 + i6) * 31;
        Object[] objArr = this.f2225c;
        int i9 = this.f2223a;
        for (int i10 = 0; i10 < i9; i10++) {
            i5 = (i5 * 31) + objArr[i10].hashCode();
        }
        return i8 + i5;
    }
}

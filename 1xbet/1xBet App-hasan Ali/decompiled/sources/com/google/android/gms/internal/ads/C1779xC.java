package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.xC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1779xC {
    public static final C1779xC f = new C1779xC(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f16272a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f16273b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f16274c;

    /* renamed from: d, reason: collision with root package name */
    public int f16275d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16276e;

    public C1779xC(int i, int[] iArr, Object[] objArr, boolean z3) {
        this.f16272a = i;
        this.f16273b = iArr;
        this.f16274c = objArr;
        this.f16276e = z3;
    }

    public static C1779xC b() {
        return new C1779xC(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int p02;
        int q02;
        int p03;
        int i = this.f16275d;
        if (i != -1) {
            return i;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f16272a; i6++) {
            int i7 = this.f16273b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f16274c[i6]).getClass();
                    p03 = EB.p0(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int i10 = i8 << 3;
                    AbstractC1823yB abstractC1823yB = (AbstractC1823yB) this.f16274c[i6];
                    int p04 = EB.p0(i10);
                    int g5 = abstractC1823yB.g();
                    i5 = AbstractC0467k.t(g5, g5, p04, i5);
                } else if (i9 == 3) {
                    int p05 = EB.p0(i8 << 3);
                    p02 = p05 + p05;
                    q02 = ((C1779xC) this.f16274c[i6]).a();
                } else {
                    if (i9 != 5) {
                        throw new IllegalStateException(new WB());
                    }
                    ((Integer) this.f16274c[i6]).getClass();
                    p03 = EB.p0(i8 << 3) + 4;
                }
                i5 = p03 + i5;
            } else {
                int i11 = i8 << 3;
                long longValue = ((Long) this.f16274c[i6]).longValue();
                p02 = EB.p0(i11);
                q02 = EB.q0(longValue);
            }
            i5 = q02 + p02 + i5;
        }
        this.f16275d = i5;
        return i5;
    }

    public final void c(int i, Object obj) {
        if (!this.f16276e) {
            throw new UnsupportedOperationException();
        }
        e(this.f16272a + 1);
        int[] iArr = this.f16273b;
        int i5 = this.f16272a;
        iArr[i5] = i;
        this.f16274c[i5] = obj;
        this.f16272a = i5 + 1;
    }

    public final void d(Ps ps) {
        if (this.f16272a != 0) {
            for (int i = 0; i < this.f16272a; i++) {
                int i5 = this.f16273b[i];
                Object obj = this.f16274c[i];
                int i6 = i5 & 7;
                int i7 = i5 >>> 3;
                if (i6 == 0) {
                    ((EB) ps.f11130k).G0(i7, ((Long) obj).longValue());
                } else if (i6 == 1) {
                    ((EB) ps.f11130k).x0(i7, ((Long) obj).longValue());
                } else if (i6 == 2) {
                    ((EB) ps.f11130k).u0(i7, (AbstractC1823yB) obj);
                } else if (i6 == 3) {
                    ((EB) ps.f11130k).D0(i7, 3);
                    ((C1779xC) obj).d(ps);
                    ((EB) ps.f11130k).D0(i7, 4);
                } else {
                    if (i6 != 5) {
                        throw new RuntimeException(new WB());
                    }
                    ((EB) ps.f11130k).v0(i7, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i) {
        int[] iArr = this.f16273b;
        if (i > iArr.length) {
            int i5 = this.f16272a;
            int i6 = (i5 / 2) + i5;
            if (i6 >= i) {
                i = i6;
            }
            if (i < 8) {
                i = 8;
            }
            this.f16273b = Arrays.copyOf(iArr, i);
            this.f16274c = Arrays.copyOf(this.f16274c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1779xC)) {
            return false;
        }
        C1779xC c1779xC = (C1779xC) obj;
        int i = this.f16272a;
        if (i == c1779xC.f16272a) {
            int[] iArr = this.f16273b;
            int[] iArr2 = c1779xC.f16273b;
            int i5 = 0;
            while (true) {
                if (i5 >= i) {
                    Object[] objArr = this.f16274c;
                    Object[] objArr2 = c1779xC.f16274c;
                    int i6 = this.f16272a;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
                if (iArr[i5] != iArr2[i5]) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f16272a;
        int i5 = i + 527;
        int[] iArr = this.f16273b;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = ((i5 * 31) + i7) * 31;
        Object[] objArr = this.f16274c;
        int i10 = this.f16272a;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }
}

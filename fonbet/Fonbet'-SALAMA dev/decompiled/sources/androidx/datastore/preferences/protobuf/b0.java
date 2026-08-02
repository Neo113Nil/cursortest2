package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: f, reason: collision with root package name */
    public static final b0 f9166f = new b0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f9167a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f9168b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f9169c;

    /* renamed from: d, reason: collision with root package name */
    public int f9170d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9171e;

    public b0(int i7, int[] iArr, Object[] objArr, boolean z4) {
        this.f9167a = i7;
        this.f9168b = iArr;
        this.f9169c = objArr;
        this.f9171e = z4;
    }

    public final void a(int i7) {
        int[] iArr = this.f9168b;
        if (i7 > iArr.length) {
            int i8 = this.f9167a;
            int i9 = (i8 / 2) + i8;
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f9168b = Arrays.copyOf(iArr, i7);
            this.f9169c = Arrays.copyOf(this.f9169c, i7);
        }
    }

    public final int b() {
        int N02;
        int i7 = this.f9170d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f9167a; i9++) {
            int i10 = this.f9168b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                N02 = C0687k.N0(i11, ((Long) this.f9169c[i9]).longValue());
            } else if (i12 == 1) {
                ((Long) this.f9169c[i9]).getClass();
                N02 = C0687k.z0(i11);
            } else if (i12 == 2) {
                N02 = C0687k.v0(i11, (C0683g) this.f9169c[i9]);
            } else if (i12 == 3) {
                i8 = ((b0) this.f9169c[i9]).b() + (C0687k.K0(i11) * 2) + i8;
            } else {
                if (i12 != 5) {
                    throw new IllegalStateException(C0700y.b());
                }
                ((Integer) this.f9169c[i9]).getClass();
                N02 = C0687k.y0(i11);
            }
            i8 = N02 + i8;
        }
        this.f9170d = i8;
        return i8;
    }

    public final void c(int i7, Object obj) {
        if (!this.f9171e) {
            throw new UnsupportedOperationException();
        }
        a(this.f9167a + 1);
        int[] iArr = this.f9168b;
        int i8 = this.f9167a;
        iArr[i8] = i7;
        this.f9169c[i8] = obj;
        this.f9167a = i8 + 1;
    }

    public final void d(D d7) {
        if (this.f9167a == 0) {
            return;
        }
        d7.getClass();
        for (int i7 = 0; i7 < this.f9167a; i7++) {
            int i8 = this.f9168b[i7];
            Object obj = this.f9169c[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 == 0) {
                d7.j(i9, ((Long) obj).longValue());
            } else if (i10 == 1) {
                d7.f(i9, ((Long) obj).longValue());
            } else if (i10 == 2) {
                d7.b(i9, (C0683g) obj);
            } else if (i10 == 3) {
                C0687k c0687k = (C0687k) d7.f9107a;
                c0687k.e1(i9, 3);
                ((b0) obj).d(d7);
                c0687k.e1(i9, 4);
            } else {
                if (i10 != 5) {
                    throw new RuntimeException(C0700y.b());
                }
                d7.e(i9, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        int i7 = this.f9167a;
        if (i7 == b0Var.f9167a) {
            int[] iArr = this.f9168b;
            int[] iArr2 = b0Var.f9168b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.f9169c;
                    Object[] objArr2 = b0Var.f9169c;
                    int i9 = this.f9167a;
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
        int i7 = this.f9167a;
        int i8 = (527 + i7) * 31;
        int[] iArr = this.f9168b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i8 + i10) * 31;
        Object[] objArr = this.f9169c;
        int i13 = this.f9167a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }
}

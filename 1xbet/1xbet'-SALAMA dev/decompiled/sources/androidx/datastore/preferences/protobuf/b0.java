package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f9166f = new b0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f9168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f9169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9170d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
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
        int iN0;
        int i7 = this.f9170d;
        if (i7 != -1) {
            return i7;
        }
        int iB = 0;
        for (int i8 = 0; i8 < this.f9167a; i8++) {
            int i9 = this.f9168b[i8];
            int i10 = i9 >>> 3;
            int i11 = i9 & 7;
            if (i11 == 0) {
                iN0 = C0666k.N0(i10, ((Long) this.f9169c[i8]).longValue());
            } else if (i11 == 1) {
                ((Long) this.f9169c[i8]).getClass();
                iN0 = C0666k.z0(i10);
            } else if (i11 != 2) {
                if (i11 == 3) {
                    iB = ((b0) this.f9169c[i8]).b() + (C0666k.K0(i10) * 2) + iB;
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException(C0679y.b());
                    }
                    ((Integer) this.f9169c[i8]).getClass();
                    iN0 = C0666k.y0(i10);
                }
            } else {
                iN0 = C0666k.v0(i10, (C0662g) this.f9169c[i8]);
            }
            iB = iN0 + iB;
        }
        this.f9170d = iB;
        return iB;
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
                d7.b(i9, (C0662g) obj);
            } else if (i10 == 3) {
                C0666k c0666k = (C0666k) d7.f9107a;
                c0666k.e1(i9, 3);
                ((b0) obj).d(d7);
                c0666k.e1(i9, 4);
            } else {
                if (i10 != 5) {
                    throw new RuntimeException(C0679y.b());
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
            for (int i8 = 0; i8 < i7; i8++) {
                if (iArr[i8] == iArr2[i8]) {
                }
            }
            Object[] objArr = this.f9169c;
            Object[] objArr2 = b0Var.f9169c;
            int i9 = this.f9167a;
            for (int i10 = 0; i10 < i9; i10++) {
                if (objArr[i10].equals(objArr2[i10])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f9167a;
        int i8 = (527 + i7) * 31;
        int[] iArr = this.f9168b;
        int iHashCode = 17;
        int i9 = 17;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 = (i9 * 31) + iArr[i10];
        }
        int i11 = (i8 + i9) * 31;
        Object[] objArr = this.f9169c;
        int i12 = this.f9167a;
        for (int i13 = 0; i13 < i12; i13++) {
            iHashCode = (iHashCode * 31) + objArr[i13].hashCode();
        }
        return i11 + iHashCode;
    }
}

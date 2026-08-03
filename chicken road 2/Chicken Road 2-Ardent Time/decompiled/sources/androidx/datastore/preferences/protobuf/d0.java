package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.d0 f2292f = new androidx.datastore.preferences.protobuf.d0(0, new int[0], new java.lang.Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f2293a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2294b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object[] f2295c;

    /* renamed from: d, reason: collision with root package name */
    public int f2296d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2297e;

    public d0(int i2, int[] iArr, java.lang.Object[] objArr, boolean z2) {
        this.f2293a = i2;
        this.f2294b = iArr;
        this.f2295c = objArr;
        this.f2297e = z2;
    }

    public final void a(int i2) {
        int[] iArr = this.f2294b;
        if (i2 > iArr.length) {
            int i3 = this.f2293a;
            int i4 = (i3 / 2) + i3;
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f2294b = java.util.Arrays.copyOf(iArr, i2);
            this.f2295c = java.util.Arrays.copyOf(this.f2295c, i2);
        }
    }

    public final int b() {
        int c02;
        int i2 = this.f2296d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f2293a; i4++) {
            int i5 = this.f2294b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                c02 = androidx.datastore.preferences.protobuf.C0077m.c0(i6, ((java.lang.Long) this.f2295c[i4]).longValue());
            } else if (i7 == 1) {
                ((java.lang.Long) this.f2295c[i4]).getClass();
                c02 = androidx.datastore.preferences.protobuf.C0077m.O(i6);
            } else if (i7 == 2) {
                c02 = androidx.datastore.preferences.protobuf.C0077m.K(i6, (androidx.datastore.preferences.protobuf.C0071g) this.f2295c[i4]);
            } else if (i7 == 3) {
                i3 = ((androidx.datastore.preferences.protobuf.d0) this.f2295c[i4]).b() + (androidx.datastore.preferences.protobuf.C0077m.Z(i6) * 2) + i3;
            } else {
                if (i7 != 5) {
                    throw new java.lang.IllegalStateException(androidx.datastore.preferences.protobuf.A.b());
                }
                ((java.lang.Integer) this.f2295c[i4]).getClass();
                c02 = androidx.datastore.preferences.protobuf.C0077m.N(i6);
            }
            i3 = c02 + i3;
        }
        this.f2296d = i3;
        return i3;
    }

    public final void c(int i2, java.lang.Object obj) {
        if (!this.f2297e) {
            throw new java.lang.UnsupportedOperationException();
        }
        a(this.f2293a + 1);
        int[] iArr = this.f2294b;
        int i3 = this.f2293a;
        iArr[i3] = i2;
        this.f2295c[i3] = obj;
        this.f2293a = i3 + 1;
    }

    public final void d(androidx.datastore.preferences.protobuf.F f2) {
        if (this.f2293a == 0) {
            return;
        }
        f2.getClass();
        for (int i2 = 0; i2 < this.f2293a; i2++) {
            int i3 = this.f2294b[i2];
            java.lang.Object obj = this.f2295c[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                f2.j(i4, ((java.lang.Long) obj).longValue());
            } else if (i5 == 1) {
                f2.f(i4, ((java.lang.Long) obj).longValue());
            } else if (i5 == 2) {
                f2.b(i4, (androidx.datastore.preferences.protobuf.C0071g) obj);
            } else if (i5 == 3) {
                androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) f2.f2229a;
                c0077m.t0(i4, 3);
                ((androidx.datastore.preferences.protobuf.d0) obj).d(f2);
                c0077m.t0(i4, 4);
            } else {
                if (i5 != 5) {
                    throw new java.lang.RuntimeException(androidx.datastore.preferences.protobuf.A.b());
                }
                f2.e(i4, ((java.lang.Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof androidx.datastore.preferences.protobuf.d0)) {
            return false;
        }
        androidx.datastore.preferences.protobuf.d0 d0Var = (androidx.datastore.preferences.protobuf.d0) obj;
        int i2 = this.f2293a;
        if (i2 == d0Var.f2293a) {
            int[] iArr = this.f2294b;
            int[] iArr2 = d0Var.f2294b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    java.lang.Object[] objArr = this.f2295c;
                    java.lang.Object[] objArr2 = d0Var.f2295c;
                    int i4 = this.f2293a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (objArr[i5].equals(objArr2[i5])) {
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
        int i2 = this.f2293a;
        int i3 = (527 + i2) * 31;
        int[] iArr = this.f2294b;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        java.lang.Object[] objArr = this.f2295c;
        int i8 = this.f2293a;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }
}

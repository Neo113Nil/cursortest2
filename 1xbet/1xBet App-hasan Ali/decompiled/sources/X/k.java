package X;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f6061a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f6062b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f6063c;

    public k(int i, long[] jArr, Object[] objArr) {
        this.f6061a = i;
        this.f6062b = jArr;
        this.f6063c = objArr;
    }

    public final int a(long j5) {
        int i = this.f6061a - 1;
        if (i != -1) {
            long[] jArr = this.f6062b;
            int i5 = 0;
            if (i != 0) {
                while (i5 <= i) {
                    int i6 = (i5 + i) >>> 1;
                    long j6 = jArr[i6] - j5;
                    if (j6 < 0) {
                        i5 = i6 + 1;
                    } else {
                        if (j6 <= 0) {
                            return i6;
                        }
                        i = i6 - 1;
                    }
                }
                return -(i5 + 1);
            }
            long j7 = jArr[0];
            if (j7 == j5) {
                return 0;
            }
            if (j7 > j5) {
                return -2;
            }
        }
        return -1;
    }

    public final k b(long j5, Object obj) {
        long[] jArr;
        int i;
        Object[] objArr = this.f6063c;
        int i5 = 0;
        int i6 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i6++;
            }
        }
        int i7 = i6 + 1;
        long[] jArr2 = new long[i7];
        Object[] objArr2 = new Object[i7];
        if (i7 > 1) {
            int i8 = 0;
            while (true) {
                jArr = this.f6062b;
                i = this.f6061a;
                if (i5 >= i7 || i8 >= i) {
                    break;
                }
                long j6 = jArr[i8];
                Object obj3 = objArr[i8];
                if (j6 > j5) {
                    jArr2[i5] = j5;
                    objArr2[i5] = obj;
                    i5++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i5] = j6;
                    objArr2[i5] = obj3;
                    i5++;
                }
                i8++;
            }
            if (i8 == i) {
                jArr2[i6] = j5;
                objArr2[i6] = obj;
            } else {
                while (i5 < i7) {
                    long j7 = jArr[i8];
                    Object obj4 = objArr[i8];
                    if (obj4 != null) {
                        jArr2[i5] = j7;
                        objArr2[i5] = obj4;
                        i5++;
                    }
                    i8++;
                }
            }
        } else {
            jArr2[0] = j5;
            objArr2[0] = obj;
        }
        return new k(i7, jArr2, objArr2);
    }
}

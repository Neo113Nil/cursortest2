package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Q implements U {

    /* renamed from: a, reason: collision with root package name */
    public final Zk f11140a;

    /* renamed from: b, reason: collision with root package name */
    public final Zk f11141b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11142c;

    public Q(long j5, long[] jArr, long[] jArr2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        AbstractC1668us.S(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.f11140a = new Zk(length2);
            this.f11141b = new Zk(length2);
        } else {
            int i = length2 + 1;
            Zk zk = new Zk(i);
            this.f11140a = zk;
            Zk zk2 = new Zk(i);
            this.f11141b = zk2;
            zk.e(0L);
            zk2.e(0L);
        }
        this.f11140a.f(jArr);
        this.f11141b.f(jArr2);
        this.f11142c = j5;
    }

    @Override // com.google.android.gms.internal.ads.U
    public final long a() {
        return this.f11142c;
    }

    @Override // com.google.android.gms.internal.ads.U
    public final T c(long j5) {
        Zk zk = this.f11141b;
        int i = zk.f12512a;
        if (i == 0) {
            V v4 = V.f11847c;
            return new T(v4, v4);
        }
        int i5 = AbstractC1260lo.f14419a;
        int i6 = i - 1;
        int i7 = 0;
        int i8 = 0;
        while (i8 <= i6) {
            int i9 = (i8 + i6) >>> 1;
            if (zk.d(i9) < j5) {
                i8 = i9 + 1;
            } else {
                i6 = i9 - 1;
            }
        }
        int i10 = i6 + 1;
        if (i10 < zk.f12512a && zk.d(i10) == j5) {
            i7 = i10;
        } else if (i6 != -1) {
            i7 = i6;
        }
        long d5 = zk.d(i7);
        Zk zk2 = this.f11140a;
        V v5 = new V(d5, zk2.d(i7));
        if (d5 == j5 || i7 == zk.f12512a - 1) {
            return new T(v5, v5);
        }
        int i11 = i7 + 1;
        return new T(v5, new V(zk.d(i11), zk2.d(i11)));
    }

    @Override // com.google.android.gms.internal.ads.U
    public final boolean g() {
        return this.f11141b.f12512a > 0;
    }
}

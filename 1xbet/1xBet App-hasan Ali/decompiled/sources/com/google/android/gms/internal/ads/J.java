package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class J implements U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9657a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9658b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9659c;

    public /* synthetic */ J(int i, long j5, Object obj) {
        this.f9657a = i;
        this.f9659c = obj;
        this.f9658b = j5;
    }

    @Override // com.google.android.gms.internal.ads.U
    public final long a() {
        switch (this.f9657a) {
        }
        return this.f9658b;
    }

    @Override // com.google.android.gms.internal.ads.U
    public final T c(long j5) {
        switch (this.f9657a) {
            case 0:
                K k5 = (K) this.f9659c;
                AbstractC1668us.F(k5.f10097k);
                C0709Wb c0709Wb = k5.f10097k;
                long[] jArr = (long[]) c0709Wb.f12040l;
                int j6 = AbstractC1260lo.j(jArr, Math.max(0L, Math.min((k5.f10093e * j5) / 1000000, k5.f10096j - 1)), false);
                long j7 = j6 == -1 ? 0L : jArr[j6];
                long[] jArr2 = (long[]) c0709Wb.f12041m;
                long j8 = j6 != -1 ? jArr2[j6] : 0L;
                int i = k5.f10093e;
                long j9 = (j7 * 1000000) / i;
                long j10 = this.f9658b;
                V v4 = new V(j9, j8 + j10);
                if (j9 == j5 || j6 == jArr.length - 1) {
                    return new T(v4, v4);
                }
                int i5 = j6 + 1;
                return new T(v4, new V((jArr[i5] * 1000000) / i, j10 + jArr2[i5]));
            case 1:
                return (T) this.f9659c;
            default:
                C0960f0 c0960f0 = (C0960f0) this.f9659c;
                T a5 = c0960f0.i[0].a(j5);
                int i6 = 1;
                while (true) {
                    C1095i0[] c1095i0Arr = c0960f0.i;
                    if (i6 >= c1095i0Arr.length) {
                        return a5;
                    }
                    T a6 = c1095i0Arr[i6].a(j5);
                    if (a6.f11607a.f11849b < a5.f11607a.f11849b) {
                        a5 = a6;
                    }
                    i6++;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.U
    public final boolean g() {
        switch (this.f9657a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    public J(long j5, long j6) {
        this.f9657a = 1;
        this.f9658b = j5;
        V v4 = j6 == 0 ? V.f11847c : new V(0L, j6);
        this.f9659c = new T(v4, v4);
    }
}

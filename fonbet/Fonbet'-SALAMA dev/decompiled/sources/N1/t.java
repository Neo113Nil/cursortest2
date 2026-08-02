package N1;

import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final q f4770a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4771b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f4772c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f4773d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4774e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f4775f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f4776g;

    /* renamed from: h, reason: collision with root package name */
    public final long f4777h;

    public t(q qVar, long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, long j) {
        AbstractC1664a.f(iArr.length == jArr2.length);
        AbstractC1664a.f(jArr.length == jArr2.length);
        AbstractC1664a.f(iArr2.length == jArr2.length);
        this.f4770a = qVar;
        this.f4772c = jArr;
        this.f4773d = iArr;
        this.f4774e = i7;
        this.f4775f = jArr2;
        this.f4776g = iArr2;
        this.f4777h = j;
        this.f4771b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f4775f;
        for (int b7 = v2.t.b(jArr, j, true); b7 < jArr.length; b7++) {
            if ((this.f4776g[b7] & 1) != 0) {
                return b7;
            }
        }
        return -1;
    }
}

package F1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f implements s {

    /* renamed from: a, reason: collision with root package name */
    public final int f2518a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2519b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f2520c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f2521d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f2522e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2523f;

    public f(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f2519b = iArr;
        this.f2520c = jArr;
        this.f2521d = jArr2;
        this.f2522e = jArr3;
        int length = iArr.length;
        this.f2518a = length;
        if (length > 0) {
            this.f2523f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f2523f = 0L;
        }
    }

    @Override // F1.s
    public final boolean d() {
        return true;
    }

    @Override // F1.s
    public final r h(long j) {
        long[] jArr = this.f2522e;
        int f7 = v2.t.f(jArr, j, true);
        long j3 = jArr[f7];
        long[] jArr2 = this.f2520c;
        t tVar = new t(j3, jArr2[f7]);
        if (j3 >= j || f7 == this.f2518a - 1) {
            return new r(tVar, tVar);
        }
        int i7 = f7 + 1;
        return new r(tVar, new t(jArr[i7], jArr2[i7]));
    }

    @Override // F1.s
    public final long i() {
        return this.f2523f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f2518a + ", sizes=" + Arrays.toString(this.f2519b) + ", offsets=" + Arrays.toString(this.f2520c) + ", timeUs=" + Arrays.toString(this.f2522e) + ", durationsUs=" + Arrays.toString(this.f2521d) + ")";
    }
}

package N3;

import N3.H;
import java.util.Arrays;

/* renamed from: N3.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3656g implements H {

    /* renamed from: a, reason: collision with root package name */
    public final int f18602a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f18603b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f18604c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f18605d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f18606e;

    /* renamed from: f, reason: collision with root package name */
    private final long f18607f;

    public C3656g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f18603b = iArr;
        this.f18604c = jArr;
        this.f18605d = jArr2;
        this.f18606e = jArr3;
        int length = iArr.length;
        this.f18602a = length;
        if (length > 0) {
            this.f18607f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f18607f = 0L;
        }
    }

    @Override // N3.H
    public final long getDurationUs() {
        return this.f18607f;
    }

    @Override // N3.H
    public final H.a getSeekPoints(long j11) {
        long[] jArr = this.f18606e;
        int e11 = m3.N.e(jArr, j11, true);
        long j12 = jArr[e11];
        long[] jArr2 = this.f18604c;
        I i11 = new I(j12, jArr2[e11]);
        if (j12 >= j11 || e11 == this.f18602a - 1) {
            return new H.a(i11, i11);
        }
        int i12 = e11 + 1;
        return new H.a(i11, new I(jArr[i12], jArr2[i12]));
    }

    @Override // N3.H
    public final boolean isSeekable() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f18602a + ", sizes=" + Arrays.toString(this.f18603b) + ", offsets=" + Arrays.toString(this.f18604c) + ", timeUs=" + Arrays.toString(this.f18606e) + ", durationsUs=" + Arrays.toString(this.f18605d) + ")";
    }
}

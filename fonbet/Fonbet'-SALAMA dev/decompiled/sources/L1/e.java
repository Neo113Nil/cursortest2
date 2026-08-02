package L1;

import F1.h;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f4311d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4312a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f4313b;

    /* renamed from: c, reason: collision with root package name */
    public int f4314c;

    public static long a(byte[] bArr, int i7, boolean z4) {
        long j = bArr[0] & 255;
        if (z4) {
            j &= ~f4311d[i7 - 1];
        }
        for (int i8 = 1; i8 < i7; i8++) {
            j = (j << 8) | (bArr[i8] & 255);
        }
        return j;
    }

    public static int b(int i7) {
        for (int i8 = 0; i8 < 8; i8++) {
            if ((f4311d[i8] & i7) != 0) {
                return i8 + 1;
            }
        }
        return -1;
    }

    public final long c(h hVar, boolean z4, boolean z7, int i7) {
        int i8 = this.f4313b;
        byte[] bArr = this.f4312a;
        if (i8 == 0) {
            if (!hVar.a(bArr, 0, 1, z4)) {
                return -1L;
            }
            int b7 = b(bArr[0] & 255);
            this.f4314c = b7;
            if (b7 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f4313b = 1;
        }
        int i9 = this.f4314c;
        if (i9 > i7) {
            this.f4313b = 0;
            return -2L;
        }
        if (i9 != 1) {
            hVar.a(bArr, 1, i9 - 1, false);
        }
        this.f4313b = 0;
        return a(bArr, this.f4314c, z7);
    }
}

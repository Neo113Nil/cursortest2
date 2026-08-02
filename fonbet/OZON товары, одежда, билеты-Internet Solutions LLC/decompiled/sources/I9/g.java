package I9;

/* loaded from: classes9.dex */
final class g {

    /* renamed from: c, reason: collision with root package name */
    private static final int[][] f12015c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a, reason: collision with root package name */
    private final f f12016a;

    /* renamed from: b, reason: collision with root package name */
    private final byte f12017b;

    private g(int i11) {
        this.f12016a = f.a((i11 >> 3) & 3);
        this.f12017b = (byte) (i11 & 7);
    }

    static g a(int i11, int i12) {
        g b11 = b(i11, i12);
        return b11 != null ? b11 : b(i11 ^ 21522, i12 ^ 21522);
    }

    private static g b(int i11, int i12) {
        int bitCount;
        int[][] iArr = f12015c;
        int i13 = Integer.MAX_VALUE;
        int i14 = 0;
        for (int i15 = 0; i15 < 32; i15++) {
            int[] iArr2 = iArr[i15];
            int i16 = iArr2[0];
            if (i16 == i11 || i16 == i12) {
                return new g(iArr2[1]);
            }
            int bitCount2 = Integer.bitCount(i11 ^ i16);
            if (bitCount2 < i13) {
                i14 = iArr2[1];
                i13 = bitCount2;
            }
            if (i11 != i12 && (bitCount = Integer.bitCount(i16 ^ i12)) < i13) {
                i14 = iArr2[1];
                i13 = bitCount;
            }
        }
        if (i13 <= 3) {
            return new g(i14);
        }
        return null;
    }

    final byte c() {
        return this.f12017b;
    }

    final f d() {
        return this.f12016a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f12016a == gVar.f12016a && this.f12017b == gVar.f12017b;
    }

    public final int hashCode() {
        return (this.f12016a.ordinal() << 3) | this.f12017b;
    }
}

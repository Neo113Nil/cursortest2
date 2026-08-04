package F3;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f2729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f2734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f2735h;

    public a(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        int i7 = 0;
        while (true) {
            if (i7 >= cArr.length) {
                this.f2728a = str;
                this.f2729b = cArr;
                try {
                    int iG = p097n3.a.G(cArr.length, RoundingMode.UNNECESSARY);
                    this.f2731d = iG;
                    int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iG);
                    int i8 = 1 << (3 - iNumberOfTrailingZeros);
                    this.f2732e = i8;
                    this.f2733f = iG >> iNumberOfTrailingZeros;
                    this.f2730c = cArr.length - 1;
                    this.f2734g = bArr;
                    boolean[] zArr = new boolean[i8];
                    for (int i9 = 0; i9 < this.f2733f; i9++) {
                        zArr[p097n3.a.r(i9 * 8, this.f2731d, RoundingMode.CEILING)] = true;
                    }
                    this.f2735h = zArr;
                    return;
                } catch (ArithmeticException e7) {
                    throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e7);
                }
            }
            char c3 = cArr[i7];
            if (!(c3 < 128)) {
                throw new IllegalArgumentException(P6.b.z("Non-ASCII character: %s", Character.valueOf(c3)));
            }
            if (!(bArr[c3] == -1)) {
                throw new IllegalArgumentException(P6.b.z("Duplicate character: %s", Character.valueOf(c3)));
            }
            bArr[c3] = (byte) i7;
            i7++;
        }
    }

    public final int a(char c3) throws d {
        if (c3 > 127) {
            throw new d("Unrecognized character: 0x" + Integer.toHexString(c3));
        }
        byte b7 = this.f2734g[c3];
        if (b7 != -1) {
            return b7;
        }
        if (c3 <= ' ' || c3 == 127) {
            throw new d("Unrecognized character: 0x" + Integer.toHexString(c3));
        }
        throw new d("Unrecognized character: " + c3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return Arrays.equals(this.f2729b, aVar.f2729b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2729b) + 1237;
    }

    public final String toString() {
        return this.f2728a;
    }
}

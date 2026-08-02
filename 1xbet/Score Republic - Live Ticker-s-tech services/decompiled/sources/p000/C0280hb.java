package p000;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: hb */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0280hb {

    /* JADX INFO: renamed from: a */
    public final String f3142a;

    /* JADX INFO: renamed from: b */
    public final char[] f3143b;

    /* JADX INFO: renamed from: c */
    public final int f3144c;

    /* JADX INFO: renamed from: d */
    public final int f3145d;

    /* JADX INFO: renamed from: e */
    public final int f3146e;

    /* JADX INFO: renamed from: f */
    public final int f3147f;

    /* JADX INFO: renamed from: g */
    public final byte[] f3148g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f3149h;

    /* JADX INFO: renamed from: i */
    public final boolean f3150i;

    public C0280hb(String str, char[] cArr, byte[] bArr, boolean z) {
        this.f3142a = str;
        cArr.getClass();
        this.f3143b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iM2317k = hn0.m2317k(length);
            this.f3145d = iM2317k;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iM2317k);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.f3146e = i;
            this.f3147f = iM2317k >> iNumberOfTrailingZeros;
            this.f3144c = cArr.length - 1;
            this.f3148g = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f3147f; i2++) {
                int i3 = this.f3145d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[hn0.m2315i(i2 * 8, i3)] = true;
            }
            this.f3149h = zArr;
            this.f3150i = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m2248a(char c) throws C0390kb {
        if (c > 127) {
            throw new C0390kb("Unrecognized character: 0x" + Integer.toHexString(c));
        }
        byte b = this.f3148g[c];
        if (b != -1) {
            return b;
        }
        if (c > ' ' && c != 127) {
            throw new C0390kb("Unrecognized character: " + c);
        }
        throw new C0390kb("Unrecognized character: 0x" + Integer.toHexString(c));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0280hb)) {
            return false;
        }
        C0280hb c0280hb = (C0280hb) obj;
        return this.f3150i == c0280hb.f3150i && Arrays.equals(this.f3143b, c0280hb.f3143b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3143b) + (this.f3150i ? 1231 : 1237);
    }

    public final String toString() {
        return this.f3142a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0280hb(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    C0270h1.m2190f(o80.m3651s("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                C0270h1.m2190f(o80.m3651s("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
        this(str, cArr, bArr, false);
    }
}

package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.tm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1617tm {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f15722d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f15723e = {'\n'};
    public static final AbstractC1177jv f = AbstractC1177jv.m(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f15724a;

    /* renamed from: b, reason: collision with root package name */
    public int f15725b;

    /* renamed from: c, reason: collision with root package name */
    public int f15726c;

    public C1617tm(int i, byte[] bArr) {
        this.f15724a = bArr;
        this.f15726c = i;
    }

    public final long A() {
        byte[] bArr = this.f15724a;
        int i = this.f15725b;
        int i5 = i + 1;
        this.f15725b = i5;
        long j5 = bArr[i];
        int i6 = i + 2;
        this.f15725b = i6;
        long j6 = bArr[i5];
        int i7 = i + 3;
        this.f15725b = i7;
        long j7 = bArr[i6];
        int i8 = i + 4;
        this.f15725b = i8;
        long j8 = bArr[i7];
        int i9 = i + 5;
        this.f15725b = i9;
        long j9 = bArr[i8];
        int i10 = i + 6;
        this.f15725b = i10;
        long j10 = bArr[i9];
        this.f15725b = i + 7;
        long j11 = bArr[i10];
        this.f15725b = i + 8;
        return ((bArr[r3] & 255) << 56) | (255 & j5) | ((j6 & 255) << 8) | ((j7 & 255) << 16) | ((j8 & 255) << 24) | ((j9 & 255) << 32) | ((j10 & 255) << 40) | ((j11 & 255) << 48);
    }

    public final long B() {
        byte[] bArr = this.f15724a;
        int i = this.f15725b;
        int i5 = i + 1;
        this.f15725b = i5;
        long j5 = bArr[i];
        int i6 = i + 2;
        this.f15725b = i6;
        long j6 = bArr[i5];
        this.f15725b = i + 3;
        long j7 = bArr[i6];
        this.f15725b = i + 4;
        return ((bArr[r2] & 255) << 24) | (j5 & 255) | ((j6 & 255) << 8) | ((j7 & 255) << 16);
    }

    public final long C() {
        byte[] bArr = this.f15724a;
        int i = this.f15725b;
        int i5 = i + 1;
        this.f15725b = i5;
        long j5 = bArr[i];
        int i6 = i + 2;
        this.f15725b = i6;
        long j6 = bArr[i5];
        int i7 = i + 3;
        this.f15725b = i7;
        long j7 = bArr[i6];
        int i8 = i + 4;
        this.f15725b = i8;
        long j8 = bArr[i7];
        int i9 = i + 5;
        this.f15725b = i9;
        long j9 = bArr[i8];
        int i10 = i + 6;
        this.f15725b = i10;
        long j10 = bArr[i9];
        this.f15725b = i + 7;
        long j11 = bArr[i10];
        this.f15725b = i + 8;
        return (bArr[r3] & 255) | ((j5 & 255) << 56) | ((j6 & 255) << 48) | ((j7 & 255) << 40) | ((j8 & 255) << 32) | ((j9 & 255) << 24) | ((j10 & 255) << 16) | ((j11 & 255) << 8);
    }

    public final long D() {
        byte[] bArr = this.f15724a;
        int i = this.f15725b;
        int i5 = i + 1;
        this.f15725b = i5;
        long j5 = bArr[i];
        int i6 = i + 2;
        this.f15725b = i6;
        long j6 = bArr[i5];
        this.f15725b = i + 3;
        long j7 = bArr[i6];
        this.f15725b = i + 4;
        return (bArr[r2] & 255) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    public final long E() {
        long C5 = C();
        if (C5 >= 0) {
            return C5;
        }
        throw new IllegalStateException(AbstractC2107A.r("Top bit not zero: ", C5));
    }

    public final long F() {
        int i;
        int i5;
        long j5 = this.f15724a[this.f15725b];
        int i6 = 7;
        while (true) {
            i = 0;
            if (i6 < 0) {
                break;
            }
            if (((1 << i6) & j5) != 0) {
                i6--;
            } else if (i6 < 6) {
                j5 &= r7 - 1;
                i = 7 - i6;
            } else if (i6 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            throw new NumberFormatException(AbstractC2107A.r("Invalid UTF-8 sequence first byte: ", j5));
        }
        for (i5 = 1; i5 < i; i5++) {
            if ((this.f15724a[this.f15725b + i5] & 192) != 128) {
                throw new NumberFormatException(AbstractC2107A.r("Invalid UTF-8 sequence continuation byte: ", j5));
            }
            j5 = (j5 << 6) | (r2 & 63);
        }
        this.f15725b += i;
        return j5;
    }

    public final String G() {
        int i = this.f15726c;
        int i5 = this.f15725b;
        if (i - i5 == 0) {
            return null;
        }
        while (i5 < this.f15726c && this.f15724a[i5] != 0) {
            i5++;
        }
        byte[] bArr = this.f15724a;
        int i6 = this.f15725b;
        int i7 = AbstractC1260lo.f14419a;
        String str = new String(bArr, i6, i5 - i6, StandardCharsets.UTF_8);
        this.f15725b = i5;
        if (i5 < this.f15726c) {
            this.f15725b = i5 + 1;
        }
        return str;
    }

    public final String H(Charset charset) {
        int i;
        AbstractC1668us.W("Unsupported charset: ".concat(String.valueOf(charset)), f.contains(charset));
        if (this.f15726c - this.f15725b == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            c();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            i = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i5 = this.f15725b;
        while (true) {
            int i6 = this.f15726c;
            if (i5 >= i6 - (i - 1)) {
                i5 = i6;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b3 = this.f15724a[i5];
                int i7 = AbstractC1260lo.f14419a;
                if (b3 != 10) {
                    if (b3 == 13) {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.f15724a;
                if (bArr[i5] == 0) {
                    byte b5 = bArr[i5 + 1];
                    int i8 = AbstractC1260lo.f14419a;
                    if (b5 != 10) {
                        if (b5 == 13) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.f15724a;
                if (bArr2[i5 + 1] == 0) {
                    byte b6 = bArr2[i5];
                    int i9 = AbstractC1260lo.f14419a;
                    if (b6 == 10 || b6 == 13) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            i5 += i;
        }
        String b7 = b(i5 - this.f15725b, charset);
        if (this.f15725b != this.f15726c && m(charset, f15722d) == '\r') {
            m(charset, f15723e);
        }
        return b7;
    }

    public final String a(int i) {
        if (i == 0) {
            return "";
        }
        int i5 = this.f15725b;
        int i6 = (i5 + i) - 1;
        int i7 = (i6 >= this.f15726c || this.f15724a[i6] != 0) ? i : i - 1;
        byte[] bArr = this.f15724a;
        int i8 = AbstractC1260lo.f14419a;
        String str = new String(bArr, i5, i7, StandardCharsets.UTF_8);
        this.f15725b += i;
        return str;
    }

    public final String b(int i, Charset charset) {
        byte[] bArr = this.f15724a;
        int i5 = this.f15725b;
        String str = new String(bArr, i5, i, charset);
        this.f15725b = i5 + i;
        return str;
    }

    public final Charset c() {
        int i = this.f15726c;
        int i5 = this.f15725b;
        int i6 = i - i5;
        if (i6 >= 3) {
            byte[] bArr = this.f15724a;
            if (bArr[i5] == -17 && bArr[i5 + 1] == -69 && bArr[i5 + 2] == -65) {
                this.f15725b = i5 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (i6 < 2) {
            return null;
        }
        byte[] bArr2 = this.f15724a;
        byte b3 = bArr2[i5];
        if (b3 == -2) {
            if (bArr2[i5 + 1] != -1) {
                return null;
            }
            this.f15725b = i5 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b3 != -1 || bArr2[i5 + 1] != -2) {
            return null;
        }
        this.f15725b = i5 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final short d() {
        byte[] bArr = this.f15724a;
        int i = this.f15725b;
        int i5 = i + 1;
        this.f15725b = i5;
        int i6 = bArr[i] & 255;
        this.f15725b = i + 2;
        return (short) ((bArr[i5] & 255) | (i6 << 8));
    }

    public final void e(int i) {
        byte[] bArr = this.f15724a;
        if (i > bArr.length) {
            this.f15724a = Arrays.copyOf(bArr, i);
        }
    }

    public final void f(byte[] bArr, int i, int i5) {
        System.arraycopy(this.f15724a, this.f15725b, bArr, i, i5);
        this.f15725b += i5;
    }

    public final void g(int i) {
        byte[] bArr = this.f15724a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        h(i, bArr);
    }

    public final void h(int i, byte[] bArr) {
        this.f15724a = bArr;
        this.f15726c = i;
        this.f15725b = 0;
    }

    public final void i(int i) {
        boolean z3 = false;
        if (i >= 0 && i <= this.f15724a.length) {
            z3 = true;
        }
        AbstractC1668us.S(z3);
        this.f15726c = i;
    }

    public final void j(int i) {
        boolean z3 = false;
        if (i >= 0 && i <= this.f15726c) {
            z3 = true;
        }
        AbstractC1668us.S(z3);
        this.f15725b = i;
    }

    public final void k(int i) {
        j(this.f15725b + i);
    }

    public final byte[] l() {
        return this.f15724a;
    }

    public final char m(Charset charset, char[] cArr) {
        int n5 = n(charset);
        if (n5 != 0) {
            int i = n5 >> 16;
            for (char c5 : cArr) {
                char c6 = (char) i;
                if (c5 == c6) {
                    this.f15725b += (char) n5;
                    return c6;
                }
            }
        }
        return (char) 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n(Charset charset) {
        byte b3;
        int i;
        byte b5;
        int i5;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            int i6 = this.f15726c;
            int i7 = this.f15725b;
            if (i6 - i7 > 0) {
                long j5 = this.f15724a[i7] & 255;
                char c5 = (char) j5;
                AbstractC1400ot.d0(((long) c5) == j5, "Out of range: %s", j5);
                b3 = (byte) c5;
                i = 1;
                long j6 = b3;
                char c6 = (char) j6;
                AbstractC1400ot.d0(((long) c6) == j6, "Out of range: %s", j6);
                return (c6 << 16) + i;
            }
        }
        i = 2;
        if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
            int i8 = this.f15726c;
            int i9 = this.f15725b;
            if (i8 - i9 >= 2) {
                byte[] bArr = this.f15724a;
                byte b6 = bArr[i9];
                b5 = bArr[i9 + 1];
                i5 = b6 << 8;
                b3 = (byte) ((char) ((b5 & 255) | i5));
                long j62 = b3;
                char c62 = (char) j62;
                AbstractC1400ot.d0(((long) c62) == j62, "Out of range: %s", j62);
                return (c62 << 16) + i;
            }
        }
        if (charset.equals(StandardCharsets.UTF_16LE)) {
            int i10 = this.f15726c;
            int i11 = this.f15725b;
            if (i10 - i11 >= 2) {
                byte[] bArr2 = this.f15724a;
                byte b7 = bArr2[i11 + 1];
                b5 = bArr2[i11];
                i5 = b7 << 8;
                b3 = (byte) ((char) ((b5 & 255) | i5));
                long j622 = b3;
                char c622 = (char) j622;
                AbstractC1400ot.d0(((long) c622) == j622, "Out of range: %s", j622);
                return (c622 << 16) + i;
            }
        }
        return 0;
    }

    public final int o() {
        return this.f15726c - this.f15725b;
    }

    public final int p() {
        return this.f15725b;
    }

    public final int q() {
        byte[] bArr = this.f15724a;
        int i = this.f15725b;
        int i5 = i + 1;
        this.f15725b = i5;
        int i6 = bArr[i] & 255;
        int i7 = i + 2;
        this.f15725b = i7;
        int i8 = bArr[i5] & 255;
        int i9 = i + 3;
        this.f15725b = i9;
        int i10 = bArr[i7] & 255;
        this.f15725b = i + 4;
        return (bArr[i9] & 255) | (i6 << 24) | (i8 << 16) | (i10 << 8);
    }

    public final int r() {
        byte[] bArr = this.f15724a;
        int i = this.f15725b;
        int i5 = i + 1;
        this.f15725b = i5;
        int i6 = bArr[i] & 255;
        int i7 = i + 2;
        this.f15725b = i7;
        int i8 = bArr[i5] & 255;
        int i9 = i + 3;
        this.f15725b = i9;
        int i10 = bArr[i7] & 255;
        this.f15725b = i + 4;
        return ((bArr[i9] & 255) << 24) | (i8 << 8) | i6 | (i10 << 16);
    }

    public final int s() {
        int r5 = r();
        if (r5 >= 0) {
            return r5;
        }
        throw new IllegalStateException(AbstractC2107A.q("Top bit not zero: ", r5));
    }

    public final int t() {
        byte[] bArr = this.f15724a;
        int i = this.f15725b;
        int i5 = i + 1;
        this.f15725b = i5;
        int i6 = bArr[i] & 255;
        this.f15725b = i + 2;
        return ((bArr[i5] & 255) << 8) | i6;
    }

    public final int u() {
        return (v() << 21) | (v() << 14) | (v() << 7) | v();
    }

    public final int v() {
        byte[] bArr = this.f15724a;
        int i = this.f15725b;
        this.f15725b = i + 1;
        return bArr[i] & 255;
    }

    public final int w() {
        byte[] bArr = this.f15724a;
        int i = this.f15725b;
        int i5 = i + 1;
        this.f15725b = i5;
        int i6 = bArr[i] & 255;
        this.f15725b = i + 2;
        int i7 = bArr[i5] & 255;
        this.f15725b = i + 4;
        return i7 | (i6 << 8);
    }

    public final int x() {
        byte[] bArr = this.f15724a;
        int i = this.f15725b;
        int i5 = i + 1;
        this.f15725b = i5;
        int i6 = bArr[i] & 255;
        int i7 = i + 2;
        this.f15725b = i7;
        int i8 = bArr[i5] & 255;
        this.f15725b = i + 3;
        return (bArr[i7] & 255) | (i6 << 16) | (i8 << 8);
    }

    public final int y() {
        int q5 = q();
        if (q5 >= 0) {
            return q5;
        }
        throw new IllegalStateException(AbstractC2107A.q("Top bit not zero: ", q5));
    }

    public final int z() {
        byte[] bArr = this.f15724a;
        int i = this.f15725b;
        int i5 = i + 1;
        this.f15725b = i5;
        int i6 = bArr[i] & 255;
        this.f15725b = i + 2;
        return (bArr[i5] & 255) | (i6 << 8);
    }

    public C1617tm() {
        this.f15724a = AbstractC1260lo.f;
    }

    public C1617tm(int i) {
        this.f15724a = new byte[i];
        this.f15726c = i;
    }

    public C1617tm(byte[] bArr) {
        this.f15724a = bArr;
        this.f15726c = bArr.length;
    }
}

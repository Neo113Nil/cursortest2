package p000;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: oc */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0539oc implements b91, ReadableByteChannel, InterfaceC0798vc, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: j */
    public f61 f5697j;

    /* JADX INFO: renamed from: k */
    public long f5698k;

    /* JADX INFO: renamed from: a */
    public final long m3668a() {
        long j = this.f5698k;
        if (j == 0) {
            return 0L;
        }
        f61 f61Var = this.f5697j;
        f61Var.getClass();
        f61 f61Var2 = f61Var.f2325g;
        f61Var2.getClass();
        int i = f61Var2.f2321c;
        return (i >= 8192 || !f61Var2.f2323e) ? j : j - ((long) (i - f61Var2.f2320b));
    }

    public final Object clone() {
        C0539oc c0539oc = new C0539oc();
        if (this.f5698k == 0) {
            return c0539oc;
        }
        f61 f61Var = this.f5697j;
        f61Var.getClass();
        f61 f61VarM1644c = f61Var.m1644c();
        c0539oc.f5697j = f61VarM1644c;
        f61VarM1644c.f2325g = f61VarM1644c;
        f61VarM1644c.f2324f = f61VarM1644c;
        for (f61 f61Var2 = f61Var.f2324f; f61Var2 != f61Var; f61Var2 = f61Var2.f2324f) {
            f61 f61Var3 = f61VarM1644c.f2325g;
            f61Var3.getClass();
            f61Var2.getClass();
            f61Var3.m1643b(f61Var2.m1644c());
        }
        c0539oc.f5698k = this.f5698k;
        return c0539oc;
    }

    /* JADX INFO: renamed from: e */
    public final byte m3669e(long j) {
        a90.m128l(this.f5698k, j, 1L);
        f61 f61Var = this.f5697j;
        f61Var.getClass();
        long j2 = this.f5698k;
        if (j2 - j < j) {
            while (j2 > j) {
                f61Var = f61Var.f2325g;
                f61Var.getClass();
                j2 -= (long) (f61Var.f2321c - f61Var.f2320b);
            }
            return f61Var.f2319a[(int) ((((long) f61Var.f2320b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = f61Var.f2321c;
            int i2 = f61Var.f2320b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return f61Var.f2319a[(int) ((((long) i2) + j) - j3)];
            }
            f61Var = f61Var.f2324f;
            f61Var.getClass();
            j3 = j4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0539oc)) {
            return false;
        }
        long j = this.f5698k;
        C0539oc c0539oc = (C0539oc) obj;
        if (j != c0539oc.f5698k) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        f61 f61Var = this.f5697j;
        f61Var.getClass();
        f61 f61Var2 = c0539oc.f5697j;
        f61Var2.getClass();
        int i = f61Var.f2320b;
        int i2 = f61Var2.f2320b;
        long j2 = 0;
        while (j2 < this.f5698k) {
            long jMin = Math.min(f61Var.f2321c - i, f61Var2.f2321c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (f61Var.f2319a[i] != f61Var2.f2319a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == f61Var.f2321c) {
                f61Var = f61Var.f2324f;
                f61Var.getClass();
                i = f61Var.f2320b;
            }
            if (i2 == f61Var2.f2321c) {
                f61Var2 = f61Var2.f2324f;
                f61Var2.getClass();
                i2 = f61Var2.f2320b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // p000.o81
    /* JADX INFO: renamed from: f */
    public final void mo1553f(C0539oc c0539oc, long j) {
        f61 f61VarM2220b;
        c0539oc.getClass();
        if (c0539oc == this) {
            C0270h1.m2190f("source == this");
            return;
        }
        a90.m128l(c0539oc.f5698k, 0L, j);
        while (j > 0) {
            f61 f61Var = c0539oc.f5697j;
            f61Var.getClass();
            int i = f61Var.f2321c;
            f61 f61Var2 = c0539oc.f5697j;
            f61Var2.getClass();
            long j2 = i - f61Var2.f2320b;
            int i2 = 0;
            if (j < j2) {
                f61 f61Var3 = this.f5697j;
                f61 f61Var4 = f61Var3 != null ? f61Var3.f2325g : null;
                if (f61Var4 != null && f61Var4.f2323e) {
                    if ((((long) f61Var4.f2321c) + j) - ((long) (f61Var4.f2322d ? 0 : f61Var4.f2320b)) <= 8192) {
                        f61 f61Var5 = c0539oc.f5697j;
                        f61Var5.getClass();
                        f61Var5.m1645d(f61Var4, (int) j);
                        c0539oc.f5698k -= j;
                        this.f5698k += j;
                        return;
                    }
                }
                f61 f61Var6 = c0539oc.f5697j;
                f61Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > f61Var6.f2321c - f61Var6.f2320b) {
                    C0270h1.m2190f("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    f61VarM2220b = f61Var6.m1644c();
                } else {
                    f61VarM2220b = h61.m2220b();
                    byte[] bArr = f61Var6.f2319a;
                    byte[] bArr2 = f61VarM2220b.f2319a;
                    int i4 = f61Var6.f2320b;
                    AbstractC0202f8.m1742s(0, i4, i4 + i3, bArr, bArr2);
                }
                f61VarM2220b.f2321c = f61VarM2220b.f2320b + i3;
                f61Var6.f2320b += i3;
                f61 f61Var7 = f61Var6.f2325g;
                f61Var7.getClass();
                f61Var7.m1643b(f61VarM2220b);
                c0539oc.f5697j = f61VarM2220b;
            }
            f61 f61Var8 = c0539oc.f5697j;
            f61Var8.getClass();
            long j3 = f61Var8.f2321c - f61Var8.f2320b;
            c0539oc.f5697j = f61Var8.m1642a();
            f61 f61Var9 = this.f5697j;
            if (f61Var9 == null) {
                this.f5697j = f61Var8;
                f61Var8.f2325g = f61Var8;
                f61Var8.f2324f = f61Var8;
            } else {
                f61 f61Var10 = f61Var9.f2325g;
                f61Var10.getClass();
                f61Var10.m1643b(f61Var8);
                f61 f61Var11 = f61Var8.f2325g;
                if (f61Var11 == f61Var8) {
                    C0270h1.m2191g("cannot compact");
                    return;
                }
                f61Var11.getClass();
                if (f61Var11.f2323e) {
                    int i5 = f61Var8.f2321c - f61Var8.f2320b;
                    f61 f61Var12 = f61Var8.f2325g;
                    f61Var12.getClass();
                    int i6 = 8192 - f61Var12.f2321c;
                    f61 f61Var13 = f61Var8.f2325g;
                    f61Var13.getClass();
                    if (!f61Var13.f2322d) {
                        f61 f61Var14 = f61Var8.f2325g;
                        f61Var14.getClass();
                        i2 = f61Var14.f2320b;
                    }
                    if (i5 <= i6 + i2) {
                        f61 f61Var15 = f61Var8.f2325g;
                        f61Var15.getClass();
                        f61Var8.m1645d(f61Var15, i5);
                        f61Var8.m1642a();
                        h61.m2219a(f61Var8);
                    }
                }
            }
            c0539oc.f5698k -= j3;
            this.f5698k += j3;
            j -= j3;
        }
    }

    public final int hashCode() {
        f61 f61Var = this.f5697j;
        if (f61Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = f61Var.f2321c;
            for (int i3 = f61Var.f2320b; i3 < i2; i3++) {
                i = (i * 31) + f61Var.f2319a[i3];
            }
            f61Var = f61Var.f2324f;
            f61Var.getClass();
        } while (f61Var != this.f5697j);
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final byte m3670i() throws EOFException {
        if (this.f5698k == 0) {
            throw new EOFException();
        }
        f61 f61Var = this.f5697j;
        f61Var.getClass();
        int i = f61Var.f2320b;
        int i2 = f61Var.f2321c;
        int i3 = i + 1;
        byte b = f61Var.f2319a[i];
        this.f5698k--;
        if (i3 != i2) {
            f61Var.f2320b = i3;
            return b;
        }
        this.f5697j = f61Var.m1642a();
        h61.m2219a(f61Var);
        return b;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final byte[] m3671j(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C0270h1.m2188d("byteCount: ", j);
            return null;
        }
        if (this.f5698k < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return bArr;
    }

    @Override // p000.b91
    /* JADX INFO: renamed from: k */
    public final long mo628k(C0539oc c0539oc, long j) {
        if (j < 0) {
            C0270h1.m2188d("byteCount < 0: ", j);
            return 0L;
        }
        long j2 = this.f5698k;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c0539oc.mo1553f(this, j);
        return j;
    }

    /* JADX INFO: renamed from: l */
    public final C0836wd m3672l(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C0270h1.m2188d("byteCount: ", j);
            return null;
        }
        if (this.f5698k < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C0836wd(m3671j(j));
        }
        C0836wd c0836wdM3676q = m3676q((int) j);
        m3674o(j);
        return c0836wdM3676q;
    }

    /* JADX INFO: renamed from: m */
    public final String m3673m(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            C0270h1.m2188d("byteCount: ", j);
            return null;
        }
        if (this.f5698k < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        f61 f61Var = this.f5697j;
        f61Var.getClass();
        int i = f61Var.f2320b;
        if (((long) i) + j > f61Var.f2321c) {
            return new String(m3671j(j), charset);
        }
        int i2 = (int) j;
        String str = new String(f61Var.f2319a, i, i2, charset);
        int i3 = f61Var.f2320b + i2;
        f61Var.f2320b = i3;
        this.f5698k -= j;
        if (i3 == f61Var.f2321c) {
            this.f5697j = f61Var.m1642a();
            h61.m2219a(f61Var);
        }
        return str;
    }

    /* JADX INFO: renamed from: o */
    public final void m3674o(long j) throws EOFException {
        while (j > 0) {
            f61 f61Var = this.f5697j;
            if (f61Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, f61Var.f2321c - f61Var.f2320b);
            long j2 = iMin;
            this.f5698k -= j2;
            j -= j2;
            int i = f61Var.f2320b + iMin;
            f61Var.f2320b = i;
            if (i == f61Var.f2321c) {
                this.f5697j = f61Var.m1642a();
                h61.m2219a(f61Var);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final C0836wd m3675p() {
        long j = this.f5698k;
        if (j <= 2147483647L) {
            return m3676q((int) j);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f5698k).toString());
    }

    /* JADX INFO: renamed from: q */
    public final C0836wd m3676q(int i) {
        if (i == 0) {
            return C0836wd.f8510m;
        }
        a90.m128l(this.f5698k, 0L, i);
        f61 f61Var = this.f5697j;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            f61Var.getClass();
            int i5 = f61Var.f2321c;
            int i6 = f61Var.f2320b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            f61Var = f61Var.f2324f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        f61 f61Var2 = this.f5697j;
        int i7 = 0;
        while (i2 < i) {
            f61Var2.getClass();
            bArr[i7] = f61Var2.f2319a;
            i2 += f61Var2.f2321c - f61Var2.f2320b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = f61Var2.f2320b;
            f61Var2.f2322d = true;
            i7++;
            f61Var2 = f61Var2.f2324f;
        }
        return new i61(bArr, iArr);
    }

    /* JADX INFO: renamed from: r */
    public final f61 m3677r(int i) {
        if (i < 1 || i > 8192) {
            C0270h1.m2190f("unexpected capacity");
            return null;
        }
        f61 f61Var = this.f5697j;
        if (f61Var == null) {
            f61 f61VarM2220b = h61.m2220b();
            this.f5697j = f61VarM2220b;
            f61VarM2220b.f2325g = f61VarM2220b;
            f61VarM2220b.f2324f = f61VarM2220b;
            return f61VarM2220b;
        }
        f61 f61Var2 = f61Var.f2325g;
        f61Var2.getClass();
        if (f61Var2.f2321c + i <= 8192 && f61Var2.f2323e) {
            return f61Var2;
        }
        f61 f61VarM2220b2 = h61.m2220b();
        f61Var2.m1643b(f61VarM2220b2);
        return f61VarM2220b2;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        a90.m128l(bArr.length, i, i2);
        f61 f61Var = this.f5697j;
        if (f61Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, f61Var.f2321c - f61Var.f2320b);
        byte[] bArr2 = f61Var.f2319a;
        int i3 = f61Var.f2320b;
        AbstractC0202f8.m1742s(i, i3, i3 + iMin, bArr2, bArr);
        int i4 = f61Var.f2320b + iMin;
        f61Var.f2320b = i4;
        this.f5698k -= (long) iMin;
        if (i4 == f61Var.f2321c) {
            this.f5697j = f61Var.m1642a();
            h61.m2219a(f61Var);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: s */
    public final void m3678s(int i) {
        f61 f61VarM3677r = m3677r(1);
        byte[] bArr = f61VarM3677r.f2319a;
        int i2 = f61VarM3677r.f2321c;
        f61VarM3677r.f2321c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f5698k++;
    }

    /* JADX INFO: renamed from: t */
    public final void m3679t(String str, int i) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            C0270h1.m2186b(AbstractC0024an.m282e(i, "endIndex < beginIndex: ", " < 0"));
            return;
        }
        if (i > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i + " > " + str.length()).toString());
        }
        int i2 = 0;
        while (i2 < i) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 128) {
                f61 f61VarM3677r = m3677r(1);
                byte[] bArr = f61VarM3677r.f2319a;
                int i3 = f61VarM3677r.f2321c - i2;
                int iMin = Math.min(i, 8192 - i3);
                int i4 = i2 + 1;
                bArr[i2 + i3] = (byte) cCharAt2;
                while (true) {
                    i2 = i4;
                    if (i2 >= iMin || (cCharAt = str.charAt(i2)) >= 128) {
                        break;
                    }
                    i4 = i2 + 1;
                    bArr[i2 + i3] = (byte) cCharAt;
                }
                int i5 = f61VarM3677r.f2321c;
                int i6 = (i3 + i2) - i5;
                f61VarM3677r.f2321c = i5 + i6;
                this.f5698k += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    f61 f61VarM3677r2 = m3677r(2);
                    byte[] bArr2 = f61VarM3677r2.f2319a;
                    int i7 = f61VarM3677r2.f2321c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    f61VarM3677r2.f2321c = i7 + 2;
                    this.f5698k += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    f61 f61VarM3677r3 = m3677r(3);
                    byte[] bArr3 = f61VarM3677r3.f2319a;
                    int i8 = f61VarM3677r3.f2321c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    f61VarM3677r3.f2321c = i8 + 3;
                    this.f5698k += 3;
                } else {
                    int i9 = i2 + 1;
                    char cCharAt3 = i9 < i ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m3678s(63);
                        i2 = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        f61 f61VarM3677r4 = m3677r(4);
                        byte[] bArr4 = f61VarM3677r4.f2319a;
                        int i11 = f61VarM3677r4.f2321c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        f61VarM3677r4.f2321c = i11 + 4;
                        this.f5698k += 4;
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    public final String toString() {
        return m3675p().toString();
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        a90.m128l(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            f61 f61VarM3677r = m3677r(1);
            int iMin = Math.min(i3 - i, 8192 - f61VarM3677r.f2321c);
            int i4 = i + iMin;
            AbstractC0202f8.m1742s(f61VarM3677r.f2321c, i, i4, bArr, f61VarM3677r.f2319a);
            f61VarM3677r.f2321c += iMin;
            i = i4;
        }
        this.f5698k += j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p000.o81
    public final void close() {
    }

    @Override // p000.o81, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            f61 f61VarM3677r = m3677r(1);
            int iMin = Math.min(i, 8192 - f61VarM3677r.f2321c);
            byteBuffer.get(f61VarM3677r.f2319a, f61VarM3677r.f2321c, iMin);
            i -= iMin;
            f61VarM3677r.f2321c += iMin;
        }
        this.f5698k += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        f61 f61Var = this.f5697j;
        if (f61Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), f61Var.f2321c - f61Var.f2320b);
        byteBuffer.put(f61Var.f2319a, f61Var.f2320b, iMin);
        int i = f61Var.f2320b + iMin;
        f61Var.f2320b = i;
        this.f5698k -= (long) iMin;
        if (i == f61Var.f2321c) {
            this.f5697j = f61Var.m1642a();
            h61.m2219a(f61Var);
        }
        return iMin;
    }
}

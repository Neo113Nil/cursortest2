package s1;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class e implements g, f, Cloneable, ByteChannel {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f6616c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a, reason: collision with root package name */
    public o f6617a;

    /* renamed from: b, reason: collision with root package name */
    public long f6618b;

    public final boolean a() {
        return this.f6618b == 0;
    }

    public final byte b(long j2) {
        int i2;
        v.a(this.f6618b, j2, 1L);
        long j3 = this.f6618b;
        if (j3 - j2 <= j2) {
            long j4 = j2 - j3;
            o oVar = this.f6617a;
            do {
                oVar = oVar.f6647g;
                int i3 = oVar.f6643c;
                i2 = oVar.f6642b;
                j4 += i3 - i2;
            } while (j4 < 0);
            return oVar.f6641a[i2 + ((int) j4)];
        }
        o oVar2 = this.f6617a;
        while (true) {
            int i4 = oVar2.f6643c;
            int i5 = oVar2.f6642b;
            long j5 = i4 - i5;
            if (j2 < j5) {
                return oVar2.f6641a[i5 + ((int) j2)];
            }
            j2 -= j5;
            oVar2 = oVar2.f6646f;
        }
    }

    @Override // s1.s
    public final long c(e eVar, long j2) {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        long j3 = this.f6618b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        eVar.e(this, j2);
        return j2;
    }

    public final Object clone() {
        e eVar = new e();
        if (this.f6618b != 0) {
            o c2 = this.f6617a.c();
            eVar.f6617a = c2;
            c2.f6647g = c2;
            c2.f6646f = c2;
            o oVar = this.f6617a;
            while (true) {
                oVar = oVar.f6646f;
                if (oVar == this.f6617a) {
                    break;
                }
                eVar.f6617a.f6647g.b(oVar.c());
            }
            eVar.f6618b = this.f6618b;
        }
        return eVar;
    }

    @Override // s1.s
    public final u d() {
        return u.f6653d;
    }

    @Override // s1.r
    public final void e(e eVar, long j2) {
        o b2;
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (eVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        v.a(eVar.f6618b, 0L, j2);
        while (j2 > 0) {
            o oVar = eVar.f6617a;
            int i2 = oVar.f6643c - oVar.f6642b;
            if (j2 < i2) {
                o oVar2 = this.f6617a;
                o oVar3 = oVar2 != null ? oVar2.f6647g : null;
                if (oVar3 != null && oVar3.f6645e) {
                    if ((oVar3.f6643c + j2) - (oVar3.f6644d ? 0 : oVar3.f6642b) <= 8192) {
                        oVar.d(oVar3, (int) j2);
                        eVar.f6618b -= j2;
                        this.f6618b += j2;
                        return;
                    }
                }
                int i3 = (int) j2;
                if (i3 <= 0 || i3 > i2) {
                    throw new IllegalArgumentException();
                }
                if (i3 >= 1024) {
                    b2 = oVar.c();
                } else {
                    b2 = p.b();
                    System.arraycopy(oVar.f6641a, oVar.f6642b, b2.f6641a, 0, i3);
                }
                b2.f6643c = b2.f6642b + i3;
                oVar.f6642b += i3;
                oVar.f6647g.b(b2);
                eVar.f6617a = b2;
            }
            o oVar4 = eVar.f6617a;
            long j3 = oVar4.f6643c - oVar4.f6642b;
            eVar.f6617a = oVar4.a();
            o oVar5 = this.f6617a;
            if (oVar5 == null) {
                this.f6617a = oVar4;
                oVar4.f6647g = oVar4;
                oVar4.f6646f = oVar4;
            } else {
                oVar5.f6647g.b(oVar4);
                o oVar6 = oVar4.f6647g;
                if (oVar6 == oVar4) {
                    throw new IllegalStateException();
                }
                if (oVar6.f6645e) {
                    int i4 = oVar4.f6643c - oVar4.f6642b;
                    if (i4 <= (8192 - oVar6.f6643c) + (oVar6.f6644d ? 0 : oVar6.f6642b)) {
                        oVar4.d(oVar6, i4);
                        oVar4.a();
                        p.a(oVar4);
                    }
                }
            }
            eVar.f6618b -= j3;
            this.f6618b += j3;
            j2 -= j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        long j2 = this.f6618b;
        if (j2 != eVar.f6618b) {
            return false;
        }
        long j3 = 0;
        if (j2 == 0) {
            return true;
        }
        o oVar = this.f6617a;
        o oVar2 = eVar.f6617a;
        int i2 = oVar.f6642b;
        int i3 = oVar2.f6642b;
        while (j3 < this.f6618b) {
            long min = Math.min(oVar.f6643c - i2, oVar2.f6643c - i3);
            int i4 = 0;
            while (i4 < min) {
                int i5 = i2 + 1;
                int i6 = i3 + 1;
                if (oVar.f6641a[i2] != oVar2.f6641a[i3]) {
                    return false;
                }
                i4++;
                i2 = i5;
                i3 = i6;
            }
            if (i2 == oVar.f6643c) {
                oVar = oVar.f6646f;
                i2 = oVar.f6642b;
            }
            if (i3 == oVar2.f6643c) {
                oVar2 = oVar2.f6646f;
                i3 = oVar2.f6642b;
            }
            j3 += min;
        }
        return true;
    }

    @Override // s1.g
    public final byte[] f() {
        try {
            return j(this.f6618b);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public final int g(byte[] bArr, int i2, int i3) {
        v.a(bArr.length, i2, i3);
        o oVar = this.f6617a;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(i3, oVar.f6643c - oVar.f6642b);
        System.arraycopy(oVar.f6641a, oVar.f6642b, bArr, i2, min);
        int i4 = oVar.f6642b + min;
        oVar.f6642b = i4;
        this.f6618b -= min;
        if (i4 == oVar.f6643c) {
            this.f6617a = oVar.a();
            p.a(oVar);
        }
        return min;
    }

    @Override // s1.f
    public final f h(String str) {
        v(str, 0, str.length());
        return this;
    }

    public final int hashCode() {
        o oVar = this.f6617a;
        if (oVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = oVar.f6643c;
            for (int i4 = oVar.f6642b; i4 < i3; i4++) {
                i2 = (i2 * 31) + oVar.f6641a[i4];
            }
            oVar = oVar.f6646f;
        } while (oVar != this.f6617a);
        return i2;
    }

    public final byte i() {
        long j2 = this.f6618b;
        if (j2 == 0) {
            throw new IllegalStateException("size == 0");
        }
        o oVar = this.f6617a;
        int i2 = oVar.f6642b;
        int i3 = oVar.f6643c;
        int i4 = i2 + 1;
        byte b2 = oVar.f6641a[i2];
        this.f6618b = j2 - 1;
        if (i4 == i3) {
            this.f6617a = oVar.a();
            p.a(oVar);
        } else {
            oVar.f6642b = i4;
        }
        return b2;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte[] j(long j2) {
        v.a(this.f6618b, 0L, j2);
        if (j2 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
        }
        int i2 = (int) j2;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int g2 = g(bArr, i3, i2 - i3);
            if (g2 == -1) {
                throw new EOFException();
            }
            i3 += g2;
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092 A[EDGE_INSN: B:40:0x0092->B:37:0x0092 BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k() {
        int i2;
        if (this.f6618b == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i3 = 0;
        boolean z2 = false;
        long j2 = 0;
        do {
            o oVar = this.f6617a;
            byte[] bArr = oVar.f6641a;
            int i4 = oVar.f6642b;
            int i5 = oVar.f6643c;
            while (i4 < i5) {
                byte b2 = bArr[i4];
                if (b2 >= 48 && b2 <= 57) {
                    i2 = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i2 = b2 - 87;
                } else if (b2 >= 65 && b2 <= 70) {
                    i2 = b2 - 55;
                } else {
                    if (i3 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(b2));
                    }
                    z2 = true;
                    if (i4 != i5) {
                        this.f6617a = oVar.a();
                        p.a(oVar);
                    } else {
                        oVar.f6642b = i4;
                    }
                    if (!z2) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j2) != 0) {
                    e eVar = new e();
                    eVar.u(j2);
                    eVar.t(b2);
                    throw new NumberFormatException("Number too large: ".concat(eVar.o()));
                }
                j2 = (j2 << 4) | i2;
                i4++;
                i3++;
            }
            if (i4 != i5) {
            }
            if (!z2) {
            }
        } while (this.f6617a != null);
        this.f6618b -= i3;
        return j2;
    }

    public final int l() {
        long j2 = this.f6618b;
        if (j2 < 4) {
            throw new IllegalStateException("size < 4: " + this.f6618b);
        }
        o oVar = this.f6617a;
        int i2 = oVar.f6642b;
        int i3 = oVar.f6643c;
        if (i3 - i2 < 4) {
            return ((i() & 255) << 24) | ((i() & 255) << 16) | ((i() & 255) << 8) | (i() & 255);
        }
        byte[] bArr = oVar.f6641a;
        int i4 = i2 + 3;
        int i5 = ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 2] & 255) << 8);
        int i6 = i2 + 4;
        int i7 = i5 | (bArr[i4] & 255);
        this.f6618b = j2 - 4;
        if (i6 == i3) {
            this.f6617a = oVar.a();
            p.a(oVar);
        } else {
            oVar.f6642b = i6;
        }
        return i7;
    }

    public final short m() {
        long j2 = this.f6618b;
        if (j2 < 2) {
            throw new IllegalStateException("size < 2: " + this.f6618b);
        }
        o oVar = this.f6617a;
        int i2 = oVar.f6642b;
        int i3 = oVar.f6643c;
        if (i3 - i2 < 2) {
            return (short) (((i() & 255) << 8) | (i() & 255));
        }
        int i4 = i2 + 1;
        byte[] bArr = oVar.f6641a;
        int i5 = (bArr[i2] & 255) << 8;
        int i6 = i2 + 2;
        int i7 = (bArr[i4] & 255) | i5;
        this.f6618b = j2 - 2;
        if (i6 == i3) {
            this.f6617a = oVar.a();
            p.a(oVar);
        } else {
            oVar.f6642b = i6;
        }
        return (short) i7;
    }

    public final String n(long j2) {
        Charset charset = v.f6657a;
        v.a(this.f6618b, 0L, j2);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j2 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
        }
        if (j2 == 0) {
            return "";
        }
        o oVar = this.f6617a;
        int i2 = oVar.f6642b;
        if (i2 + j2 > oVar.f6643c) {
            return new String(j(j2), charset);
        }
        String str = new String(oVar.f6641a, i2, (int) j2, charset);
        int i3 = (int) (oVar.f6642b + j2);
        oVar.f6642b = i3;
        this.f6618b -= j2;
        if (i3 == oVar.f6643c) {
            this.f6617a = oVar.a();
            p.a(oVar);
        }
        return str;
    }

    public final String o() {
        try {
            long j2 = this.f6618b;
            Charset charset = v.f6657a;
            return n(j2);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public final String p(long j2) {
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (b(j3) == 13) {
                Charset charset = v.f6657a;
                String n2 = n(j3);
                q(2L);
                return n2;
            }
        }
        Charset charset2 = v.f6657a;
        String n3 = n(j2);
        q(1L);
        return n3;
    }

    public final void q(long j2) {
        while (j2 > 0) {
            if (this.f6617a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, r0.f6643c - r0.f6642b);
            long j3 = min;
            this.f6618b -= j3;
            j2 -= j3;
            o oVar = this.f6617a;
            int i2 = oVar.f6642b + min;
            oVar.f6642b = i2;
            if (i2 == oVar.f6643c) {
                this.f6617a = oVar.a();
                p.a(oVar);
            }
        }
    }

    public final o r(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException();
        }
        o oVar = this.f6617a;
        if (oVar == null) {
            o b2 = p.b();
            this.f6617a = b2;
            b2.f6647g = b2;
            b2.f6646f = b2;
            return b2;
        }
        o oVar2 = oVar.f6647g;
        if (oVar2.f6643c + i2 <= 8192 && oVar2.f6645e) {
            return oVar2;
        }
        o b3 = p.b();
        oVar2.b(b3);
        return b3;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        o oVar = this.f6617a;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), oVar.f6643c - oVar.f6642b);
        byteBuffer.put(oVar.f6641a, oVar.f6642b, min);
        int i2 = oVar.f6642b + min;
        oVar.f6642b = i2;
        this.f6618b -= min;
        if (i2 == oVar.f6643c) {
            this.f6617a = oVar.a();
            p.a(oVar);
        }
        return min;
    }

    public final void s(int i2, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        int i3 = 0;
        long j2 = i2;
        v.a(bArr.length, 0, j2);
        while (i3 < i2) {
            o r2 = r(1);
            int min = Math.min(i2 - i3, 8192 - r2.f6643c);
            System.arraycopy(bArr, i3, r2.f6641a, r2.f6643c, min);
            i3 += min;
            r2.f6643c += min;
        }
        this.f6618b += j2;
    }

    public final void t(int i2) {
        o r2 = r(1);
        int i3 = r2.f6643c;
        r2.f6643c = i3 + 1;
        r2.f6641a[i3] = (byte) i2;
        this.f6618b++;
    }

    public final String toString() {
        long j2 = this.f6618b;
        if (j2 <= 2147483647L) {
            int i2 = (int) j2;
            return (i2 == 0 ? h.f6620e : new q(this, i2)).toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f6618b);
    }

    public final void u(long j2) {
        if (j2 == 0) {
            t(48);
            return;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j2)) / 4) + 1;
        o r2 = r(numberOfTrailingZeros);
        int i2 = r2.f6643c;
        for (int i3 = (i2 + numberOfTrailingZeros) - 1; i3 >= i2; i3--) {
            r2.f6641a[i3] = f6616c[(int) (15 & j2)];
            j2 >>>= 4;
        }
        r2.f6643c += numberOfTrailingZeros;
        this.f6618b += numberOfTrailingZeros;
    }

    public final void v(String str, int i2, int i3) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(C0.g.g(i2, "beginIndex < 0: "));
        }
        if (i3 < i2) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i3 + " < " + i2);
        }
        if (i3 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i3 + " > " + str.length());
        }
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                o r2 = r(1);
                int i4 = r2.f6643c - i2;
                int min = Math.min(i3, 8192 - i4);
                int i5 = i2 + 1;
                byte[] bArr = r2.f6641a;
                bArr[i2 + i4] = (byte) charAt;
                while (i5 < min) {
                    char charAt2 = str.charAt(i5);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i5 + i4] = (byte) charAt2;
                    i5++;
                }
                int i6 = r2.f6643c;
                int i7 = (i4 + i5) - i6;
                r2.f6643c = i6 + i7;
                this.f6618b += i7;
                i2 = i5;
            } else {
                if (charAt < 2048) {
                    t((charAt >> 6) | 192);
                    t((charAt & '?') | 128);
                } else if (charAt < 55296 || charAt > 57343) {
                    t((charAt >> '\f') | 224);
                    t(((charAt >> 6) & 63) | 128);
                    t((charAt & '?') | 128);
                } else {
                    int i8 = i2 + 1;
                    char charAt3 = i8 < i3 ? str.charAt(i8) : (char) 0;
                    if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        t(63);
                        i2 = i8;
                    } else {
                        int i9 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                        t((i9 >> 18) | 240);
                        t(((i9 >> 12) & 63) | 128);
                        t(((i9 >> 6) & 63) | 128);
                        t((i9 & 63) | 128);
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    public final void w(int i2) {
        if (i2 < 128) {
            t(i2);
            return;
        }
        if (i2 < 2048) {
            t((i2 >> 6) | 192);
            t((i2 & 63) | 128);
            return;
        }
        if (i2 < 65536) {
            if (i2 >= 55296 && i2 <= 57343) {
                t(63);
                return;
            }
            t((i2 >> 12) | 224);
            t(((i2 >> 6) & 63) | 128);
            t((i2 & 63) | 128);
            return;
        }
        if (i2 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i2));
        }
        t((i2 >> 18) | 240);
        t(((i2 >> 12) & 63) | 128);
        t(((i2 >> 6) & 63) | 128);
        t((i2 & 63) | 128);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            o r2 = r(1);
            int min = Math.min(i2, 8192 - r2.f6643c);
            byteBuffer.get(r2.f6641a, r2.f6643c, min);
            i2 -= min;
            r2.f6643c += min;
        }
        this.f6618b += remaining;
        return remaining;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, s1.r
    public final void close() {
    }

    @Override // s1.r, java.io.Flushable
    public final void flush() {
    }
}

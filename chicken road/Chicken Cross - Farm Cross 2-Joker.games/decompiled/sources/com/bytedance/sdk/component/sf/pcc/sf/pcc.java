package com.bytedance.sdk.component.sf.pcc.sf;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public final class pcc implements gm, sf, Cloneable, ByteChannel {
    private static final byte[] gm = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    vj pcc;
    long sf;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public boolean pcc() {
        return this.sf == 0;
    }

    public byte sf() {
        if (this.sf == 0) {
            throw new IllegalStateException("size == 0");
        }
        vj vjVar = this.pcc;
        int i = vjVar.sf;
        int i2 = vjVar.gm;
        int i3 = i + 1;
        byte b = vjVar.pcc[i];
        this.sf--;
        if (i3 == i2) {
            this.pcc = vjVar.sf();
            wh.pcc(vjVar);
        } else {
            vjVar.sf = i3;
        }
        return b;
    }

    public String gm() {
        try {
            return pcc(this.sf, vy.pcc);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public String pcc(long j, Charset charset) throws EOFException {
        vy.pcc(this.sf, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        if (j == 0) {
            return "";
        }
        vj vjVar = this.pcc;
        if (vjVar.sf + j > vjVar.gm) {
            return new String(pcc(j), charset);
        }
        String str = new String(vjVar.pcc, vjVar.sf, (int) j, charset);
        vjVar.sf = (int) (vjVar.sf + j);
        this.sf -= j;
        if (vjVar.sf == vjVar.gm) {
            this.pcc = vjVar.sf();
            wh.pcc(vjVar);
        }
        return str;
    }

    public byte[] pcc(long j) throws EOFException {
        vy.pcc(this.sf, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        byte[] bArr = new byte[(int) j];
        pcc(bArr);
        return bArr;
    }

    public void pcc(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int pcc = pcc(bArr, i, bArr.length - i);
            if (pcc == -1) {
                throw new EOFException();
            }
            i += pcc;
        }
    }

    public int pcc(byte[] bArr, int i, int i2) {
        vy.pcc(bArr.length, i, i2);
        vj vjVar = this.pcc;
        if (vjVar == null) {
            return -1;
        }
        int min = Math.min(i2, vjVar.gm - vjVar.sf);
        System.arraycopy(vjVar.pcc, vjVar.sf, bArr, i, min);
        vjVar.sf += min;
        this.sf -= min;
        if (vjVar.sf == vjVar.gm) {
            this.pcc = vjVar.sf();
            wh.pcc(vjVar);
        }
        return min;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        vj vjVar = this.pcc;
        if (vjVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), vjVar.gm - vjVar.sf);
        byteBuffer.put(vjVar.pcc, vjVar.sf, min);
        vjVar.sf += min;
        this.sf -= min;
        if (vjVar.sf == vjVar.gm) {
            this.pcc = vjVar.sf();
            wh.pcc(vjVar);
        }
        return min;
    }

    public pcc pcc(String str) {
        return pcc(str, 0, str.length());
    }

    public pcc pcc(String str, int i, int i2) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                vj gm2 = gm(1);
                byte[] bArr = gm2.pcc;
                int i3 = gm2.gm - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = (i3 + i) - gm2.gm;
                gm2.gm += i5;
                this.sf += i5;
            } else {
                if (charAt2 < 2048) {
                    sf((charAt2 >> 6) | 192);
                    sf((charAt2 & '?') | 128);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    sf((charAt2 >> '\f') | 224);
                    sf(((charAt2 >> 6) & 63) | 128);
                    sf((charAt2 & '?') | 128);
                } else {
                    int i6 = i + 1;
                    char charAt3 = i6 < i2 ? str.charAt(i6) : (char) 0;
                    if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        sf(63);
                        i = i6;
                    } else {
                        int i7 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                        sf((i7 >> 18) | 240);
                        sf(((i7 >> 12) & 63) | 128);
                        sf(((i7 >> 6) & 63) | 128);
                        sf((i7 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    public pcc pcc(int i) {
        if (i < 128) {
            sf(i);
        } else if (i < 2048) {
            sf((i >> 6) | 192);
            sf((i & 63) | 128);
        } else if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                sf(63);
            } else {
                sf((i >> 12) | 224);
                sf(((i >> 6) & 63) | 128);
                sf((i & 63) | 128);
            }
        } else if (i <= 1114111) {
            sf((i >> 18) | 240);
            sf(((i >> 12) & 63) | 128);
            sf(((i >> 6) & 63) | 128);
            sf((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    public pcc pcc(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(vy.pcc)) {
            return pcc(str, i, i2);
        }
        byte[] bytes = str.substring(i, i2).getBytes(charset);
        return sf(bytes, 0, bytes.length);
    }

    public pcc sf(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        vy.pcc(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            vj gm2 = gm(1);
            int min = Math.min(i3 - i, 8192 - gm2.gm);
            System.arraycopy(bArr, i, gm2.pcc, gm2.gm, min);
            i += min;
            gm2.gm += min;
        }
        this.sf += j;
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            vj gm2 = gm(1);
            int min = Math.min(i, 8192 - gm2.gm);
            byteBuffer.get(gm2.pcc, gm2.gm, min);
            i -= min;
            gm2.gm += min;
        }
        this.sf += remaining;
        return remaining;
    }

    public pcc sf(int i) {
        vj gm2 = gm(1);
        byte[] bArr = gm2.pcc;
        int i2 = gm2.gm;
        gm2.gm = i2 + 1;
        bArr[i2] = (byte) i;
        this.sf++;
        return this;
    }

    public pcc sf(long j) {
        if (j == 0) {
            return sf(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        vj gm2 = gm(numberOfTrailingZeros);
        byte[] bArr = gm2.pcc;
        int i = gm2.gm;
        for (int i2 = (gm2.gm + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = gm[(int) (15 & j)];
            j >>>= 4;
        }
        gm2.gm += numberOfTrailingZeros;
        this.sf += numberOfTrailingZeros;
        return this;
    }

    vj gm(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        vj vjVar = this.pcc;
        if (vjVar == null) {
            vj pcc = wh.pcc();
            this.pcc = pcc;
            pcc.qf = pcc;
            pcc.wh = pcc;
            return pcc;
        }
        vj vjVar2 = vjVar.qf;
        return (vjVar2.gm + i > 8192 || !vjVar2.vj) ? vjVar2.pcc(wh.pcc()) : vjVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcc)) {
            return false;
        }
        pcc pccVar = (pcc) obj;
        long j = this.sf;
        if (j != pccVar.sf) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        vj vjVar = this.pcc;
        vj vjVar2 = pccVar.pcc;
        int i = vjVar.sf;
        int i2 = vjVar2.sf;
        while (j2 < this.sf) {
            long min = Math.min(vjVar.gm - i, vjVar2.gm - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (vjVar.pcc[i] != vjVar2.pcc[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == vjVar.gm) {
                vjVar = vjVar.wh;
                i = vjVar.sf;
            }
            if (i2 == vjVar2.gm) {
                vjVar2 = vjVar2.wh;
                i2 = vjVar2.sf;
            }
            j2 += min;
        }
        return true;
    }

    public int hashCode() {
        vj vjVar = this.pcc;
        if (vjVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = vjVar.gm;
            for (int i3 = vjVar.sf; i3 < i2; i3++) {
                i = (i * 31) + vjVar.pcc[i3];
            }
            vjVar = vjVar.wh;
        } while (vjVar != this.pcc);
        return i;
    }

    public String toString() {
        return vj().toString();
    }

    /* renamed from: oo, reason: merged with bridge method [inline-methods] */
    public pcc clone() {
        pcc pccVar = new pcc();
        if (this.sf == 0) {
            return pccVar;
        }
        vj pcc = this.pcc.pcc();
        pccVar.pcc = pcc;
        pcc.qf = pcc;
        pcc.wh = pcc;
        vj vjVar = this.pcc;
        while (true) {
            vjVar = vjVar.wh;
            if (vjVar != this.pcc) {
                pccVar.pcc.qf.pcc(vjVar.pcc());
            } else {
                pccVar.sf = this.sf;
                return pccVar;
            }
        }
    }

    public final oo vj() {
        long j = this.sf;
        if (j > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.sf);
        }
        return oo((int) j);
    }

    public final oo oo(int i) {
        if (i == 0) {
            return oo.gm;
        }
        return new qf(this, i);
    }
}

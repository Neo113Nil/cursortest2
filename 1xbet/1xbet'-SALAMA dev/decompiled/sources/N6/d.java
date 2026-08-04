package N6;

import W5.AbstractC0486a1;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements o, ReadableByteChannel, e, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f4796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4797b;

    public final long a() {
        long j = this.f4797b;
        if (j == 0) {
            return 0L;
        }
        j jVar = this.f4796a;
        t6.h.b(jVar);
        j jVar2 = jVar.f4815g;
        t6.h.b(jVar2);
        int i7 = jVar2.f4811c;
        if (i7 < 8192 && jVar2.f4813e) {
            j -= (long) (i7 - jVar2.f4810b);
        }
        return j;
    }

    public final byte b(long j) {
        p113p3.f.m(this.f4797b, j, 1L);
        j jVar = this.f4796a;
        if (jVar == null) {
            t6.h.b(null);
            throw null;
        }
        long j3 = this.f4797b;
        if (j3 - j < j) {
            while (j3 > j) {
                jVar = jVar.f4815g;
                t6.h.b(jVar);
                j3 -= (long) (jVar.f4811c - jVar.f4810b);
            }
            return jVar.f4809a[(int) ((((long) jVar.f4810b) + j) - j3)];
        }
        long j7 = 0;
        while (true) {
            int i7 = jVar.f4811c;
            int i8 = jVar.f4810b;
            long j8 = ((long) (i7 - i8)) + j7;
            if (j8 > j) {
                return jVar.f4809a[(int) ((((long) i8) + j) - j7)];
            }
            jVar = jVar.f4814f;
            t6.h.b(jVar);
            j7 = j8;
        }
    }

    public final byte c() throws EOFException {
        if (this.f4797b == 0) {
            throw new EOFException();
        }
        j jVar = this.f4796a;
        t6.h.b(jVar);
        int i7 = jVar.f4810b;
        int i8 = jVar.f4811c;
        int i9 = i7 + 1;
        byte b7 = jVar.f4809a[i7];
        this.f4797b--;
        if (i9 == i8) {
            this.f4796a = jVar.a();
            k.a(jVar);
        } else {
            jVar.f4810b = i9;
        }
        return b7;
    }

    public final Object clone() {
        d dVar = new d();
        if (this.f4797b != 0) {
            j jVar = this.f4796a;
            t6.h.b(jVar);
            j jVarC = jVar.c();
            dVar.f4796a = jVarC;
            jVarC.f4815g = jVarC;
            jVarC.f4814f = jVarC;
            for (j jVar2 = jVar.f4814f; jVar2 != jVar; jVar2 = jVar2.f4814f) {
                j jVar3 = jVarC.f4815g;
                t6.h.b(jVar3);
                t6.h.b(jVar2);
                jVar3.b(jVar2.c());
            }
            dVar.f4797b = this.f4797b;
        }
        return dVar;
    }

    public final byte[] d(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0486a1.g("byteCount: ", j).toString());
        }
        if (this.f4797b < j) {
            throw new EOFException();
        }
        int i7 = (int) j;
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int i9 = read(bArr, i8, i7 - i8);
            if (i9 == -1) {
                throw new EOFException();
            }
            i8 += i9;
        }
        return bArr;
    }

    public final f e(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0486a1.g("byteCount: ", j).toString());
        }
        if (this.f4797b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new f(d(j));
        }
        f fVarI = i((int) j);
        g(j);
        return fVarI;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                long j = this.f4797b;
                d dVar = (d) obj;
                if (j == dVar.f4797b) {
                    if (j != 0) {
                        j jVar = this.f4796a;
                        t6.h.b(jVar);
                        j jVar2 = dVar.f4796a;
                        t6.h.b(jVar2);
                        int i7 = jVar.f4810b;
                        int i8 = jVar2.f4810b;
                        long j3 = 0;
                        while (j3 < this.f4797b) {
                            long jMin = Math.min(jVar.f4811c - i7, jVar2.f4811c - i8);
                            long j7 = 0;
                            while (j7 < jMin) {
                                int i9 = i7 + 1;
                                byte b7 = jVar.f4809a[i7];
                                int i10 = i8 + 1;
                                if (b7 == jVar2.f4809a[i8]) {
                                    j7++;
                                    i8 = i10;
                                    i7 = i9;
                                }
                            }
                            if (i7 == jVar.f4811c) {
                                j jVar3 = jVar.f4814f;
                                t6.h.b(jVar3);
                                i7 = jVar3.f4810b;
                                jVar = jVar3;
                            }
                            if (i8 == jVar2.f4811c) {
                                jVar2 = jVar2.f4814f;
                                t6.h.b(jVar2);
                                i8 = jVar2.f4810b;
                            }
                            j3 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String f(long j, Charset charset) throws EOFException {
        t6.h.e(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0486a1.g("byteCount: ", j).toString());
        }
        if (this.f4797b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        j jVar = this.f4796a;
        t6.h.b(jVar);
        int i7 = jVar.f4810b;
        if (((long) i7) + j > jVar.f4811c) {
            return new String(d(j), charset);
        }
        int i8 = (int) j;
        String str = new String(jVar.f4809a, i7, i8, charset);
        int i9 = jVar.f4810b + i8;
        jVar.f4810b = i9;
        this.f4797b -= j;
        if (i9 == jVar.f4811c) {
            this.f4796a = jVar.a();
            k.a(jVar);
        }
        return str;
    }

    public final void g(long j) throws EOFException {
        while (j > 0) {
            j jVar = this.f4796a;
            if (jVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, jVar.f4811c - jVar.f4810b);
            long j3 = iMin;
            this.f4797b -= j3;
            j -= j3;
            int i7 = jVar.f4810b + iMin;
            jVar.f4810b = i7;
            if (i7 == jVar.f4811c) {
                this.f4796a = jVar.a();
                k.a(jVar);
            }
        }
    }

    public final f h() {
        long j = this.f4797b;
        if (j <= 2147483647L) {
            return i((int) j);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f4797b).toString());
    }

    public final int hashCode() {
        j jVar = this.f4796a;
        if (jVar == null) {
            return 0;
        }
        int i7 = 1;
        do {
            int i8 = jVar.f4811c;
            for (int i9 = jVar.f4810b; i9 < i8; i9++) {
                i7 = (i7 * 31) + jVar.f4809a[i9];
            }
            jVar = jVar.f4814f;
            t6.h.b(jVar);
        } while (jVar != this.f4796a);
        return i7;
    }

    public final f i(int i7) {
        if (i7 == 0) {
            return f.f4798d;
        }
        p113p3.f.m(this.f4797b, 0L, i7);
        j jVar = this.f4796a;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            t6.h.b(jVar);
            int i11 = jVar.f4811c;
            int i12 = jVar.f4810b;
            if (i11 == i12) {
                throw new AssertionError("s.limit == s.pos");
            }
            i9 += i11 - i12;
            i10++;
            jVar = jVar.f4814f;
        }
        byte[][] bArr = new byte[i10][];
        int[] iArr = new int[i10 * 2];
        j jVar2 = this.f4796a;
        int i13 = 0;
        while (i8 < i7) {
            t6.h.b(jVar2);
            bArr[i13] = jVar2.f4809a;
            i8 += jVar2.f4811c - jVar2.f4810b;
            iArr[i13] = Math.min(i8, i7);
            iArr[i13 + i10] = jVar2.f4810b;
            jVar2.f4812d = true;
            i13++;
            jVar2 = jVar2.f4814f;
        }
        return new l(bArr, iArr);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final j j(int i7) {
        if (i7 < 1 || i7 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        j jVar = this.f4796a;
        if (jVar == null) {
            j jVarB = k.b();
            this.f4796a = jVarB;
            jVarB.f4815g = jVarB;
            jVarB.f4814f = jVarB;
            return jVarB;
        }
        j jVar2 = jVar.f4815g;
        t6.h.b(jVar2);
        if (jVar2.f4811c + i7 <= 8192 && jVar2.f4813e) {
            return jVar2;
        }
        j jVarB2 = k.b();
        jVar2.b(jVarB2);
        return jVarB2;
    }

    public final void k(byte[] bArr, int i7, int i8) {
        t6.h.e(bArr, "source");
        long j = i8;
        p113p3.f.m(bArr.length, i7, j);
        int i9 = i8 + i7;
        while (i7 < i9) {
            j jVarJ = j(1);
            int iMin = Math.min(i9 - i7, 8192 - jVarJ.f4811c);
            int i10 = i7 + iMin;
            p050g6.g.q0(bArr, jVarJ.f4811c, jVarJ.f4809a, i7, i10);
            jVarJ.f4811c += iMin;
            i7 = i10;
        }
        this.f4797b += j;
    }

    @Override // N6.m
    public final void m(d dVar, long j) {
        j jVarB;
        t6.h.e(dVar, "source");
        if (dVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        p113p3.f.m(dVar.f4797b, 0L, j);
        while (j > 0) {
            j jVar = dVar.f4796a;
            t6.h.b(jVar);
            int i7 = jVar.f4811c;
            j jVar2 = dVar.f4796a;
            t6.h.b(jVar2);
            long j3 = i7 - jVar2.f4810b;
            int i8 = 0;
            if (j < j3) {
                j jVar3 = this.f4796a;
                j jVar4 = jVar3 != null ? jVar3.f4815g : null;
                if (jVar4 != null && jVar4.f4813e) {
                    if ((((long) jVar4.f4811c) + j) - ((long) (jVar4.f4812d ? 0 : jVar4.f4810b)) <= 8192) {
                        j jVar5 = dVar.f4796a;
                        t6.h.b(jVar5);
                        jVar5.d(jVar4, (int) j);
                        dVar.f4797b -= j;
                        this.f4797b += j;
                        return;
                    }
                }
                j jVar6 = dVar.f4796a;
                t6.h.b(jVar6);
                int i9 = (int) j;
                if (i9 <= 0 || i9 > jVar6.f4811c - jVar6.f4810b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i9 >= 1024) {
                    jVarB = jVar6.c();
                } else {
                    jVarB = k.b();
                    int i10 = jVar6.f4810b;
                    p050g6.g.q0(jVar6.f4809a, 0, jVarB.f4809a, i10, i10 + i9);
                }
                jVarB.f4811c = jVarB.f4810b + i9;
                jVar6.f4810b += i9;
                j jVar7 = jVar6.f4815g;
                t6.h.b(jVar7);
                jVar7.b(jVarB);
                dVar.f4796a = jVarB;
            }
            j jVar8 = dVar.f4796a;
            t6.h.b(jVar8);
            long j7 = jVar8.f4811c - jVar8.f4810b;
            dVar.f4796a = jVar8.a();
            j jVar9 = this.f4796a;
            if (jVar9 == null) {
                this.f4796a = jVar8;
                jVar8.f4815g = jVar8;
                jVar8.f4814f = jVar8;
            } else {
                j jVar10 = jVar9.f4815g;
                t6.h.b(jVar10);
                jVar10.b(jVar8);
                j jVar11 = jVar8.f4815g;
                if (jVar11 == jVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                t6.h.b(jVar11);
                if (jVar11.f4813e) {
                    int i11 = jVar8.f4811c - jVar8.f4810b;
                    j jVar12 = jVar8.f4815g;
                    t6.h.b(jVar12);
                    int i12 = 8192 - jVar12.f4811c;
                    j jVar13 = jVar8.f4815g;
                    t6.h.b(jVar13);
                    if (!jVar13.f4812d) {
                        j jVar14 = jVar8.f4815g;
                        t6.h.b(jVar14);
                        i8 = jVar14.f4810b;
                    }
                    if (i11 <= i12 + i8) {
                        j jVar15 = jVar8.f4815g;
                        t6.h.b(jVar15);
                        jVar8.d(jVar15, i11);
                        jVar8.a();
                        k.a(jVar8);
                    }
                }
            }
            dVar.f4797b -= j7;
            this.f4797b += j7;
            j -= j7;
        }
    }

    public final void n(int i7) {
        j jVarJ = j(1);
        int i8 = jVarJ.f4811c;
        jVarJ.f4811c = i8 + 1;
        jVarJ.f4809a[i8] = (byte) i7;
        this.f4797b++;
    }

    public final void o(int i7, String str) {
        char cCharAt;
        t6.h.e(str, "string");
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0486a1.f(i7, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (i7 > str.length()) {
            StringBuilder sbJ = AbstractC0486a1.j(i7, "endIndex > string.length: ", " > ");
            sbJ.append(str.length());
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        int i8 = 0;
        while (i8 < i7) {
            char cCharAt2 = str.charAt(i8);
            if (cCharAt2 < 128) {
                j jVarJ = j(1);
                int i9 = jVarJ.f4811c - i8;
                int iMin = Math.min(i7, 8192 - i9);
                int i10 = i8 + 1;
                byte[] bArr = jVarJ.f4809a;
                bArr[i8 + i9] = (byte) cCharAt2;
                while (true) {
                    i8 = i10;
                    if (i8 >= iMin || (cCharAt = str.charAt(i8)) >= 128) {
                        break;
                    }
                    i10 = i8 + 1;
                    bArr[i8 + i9] = (byte) cCharAt;
                }
                int i11 = jVarJ.f4811c;
                int i12 = (i9 + i8) - i11;
                jVarJ.f4811c = i11 + i12;
                this.f4797b += (long) i12;
            } else {
                if (cCharAt2 < 2048) {
                    j jVarJ2 = j(2);
                    int i13 = jVarJ2.f4811c;
                    byte[] bArr2 = jVarJ2.f4809a;
                    bArr2[i13] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i13 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    jVarJ2.f4811c = i13 + 2;
                    this.f4797b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    j jVarJ3 = j(3);
                    int i14 = jVarJ3.f4811c;
                    byte[] bArr3 = jVarJ3.f4809a;
                    bArr3[i14] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i14 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i14 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    jVarJ3.f4811c = i14 + 3;
                    this.f4797b += 3;
                } else {
                    int i15 = i8 + 1;
                    char cCharAt3 = i15 < i7 ? str.charAt(i15) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        n(63);
                        i8 = i15;
                    } else {
                        int i16 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        j jVarJ4 = j(4);
                        int i17 = jVarJ4.f4811c;
                        byte[] bArr4 = jVarJ4.f4809a;
                        bArr4[i17] = (byte) ((i16 >> 18) | 240);
                        bArr4[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                        bArr4[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                        bArr4[i17 + 3] = (byte) ((i16 & 63) | 128);
                        jVarJ4.f4811c = i17 + 4;
                        this.f4797b += 4;
                        i8 += 2;
                    }
                }
                i8++;
            }
        }
    }

    public final void p(String str) {
        t6.h.e(str, "string");
        o(str.length(), str);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        t6.h.e(byteBuffer, "sink");
        j jVar = this.f4796a;
        if (jVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), jVar.f4811c - jVar.f4810b);
        byteBuffer.put(jVar.f4809a, jVar.f4810b, iMin);
        int i7 = jVar.f4810b + iMin;
        jVar.f4810b = i7;
        this.f4797b -= (long) iMin;
        if (i7 == jVar.f4811c) {
            this.f4796a = jVar.a();
            k.a(jVar);
        }
        return iMin;
    }

    @Override // N6.o
    public final long t(d dVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0486a1.g("byteCount < 0: ", j).toString());
        }
        long j3 = this.f4797b;
        if (j3 == 0) {
            return -1L;
        }
        if (j > j3) {
            j = j3;
        }
        dVar.m(this, j);
        return j;
    }

    public final String toString() {
        return h().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        t6.h.e(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i7 = iRemaining;
        while (i7 > 0) {
            j jVarJ = j(1);
            int iMin = Math.min(i7, 8192 - jVarJ.f4811c);
            byteBuffer.get(jVarJ.f4809a, jVarJ.f4811c, iMin);
            i7 -= iMin;
            jVarJ.f4811c += iMin;
        }
        this.f4797b += (long) iRemaining;
        return iRemaining;
    }

    public final int read(byte[] bArr, int i7, int i8) {
        t6.h.e(bArr, "sink");
        p113p3.f.m(bArr.length, i7, i8);
        j jVar = this.f4796a;
        if (jVar == null) {
            return -1;
        }
        int iMin = Math.min(i8, jVar.f4811c - jVar.f4810b);
        int i9 = jVar.f4810b;
        p050g6.g.q0(jVar.f4809a, i7, bArr, i9, i9 + iMin);
        int i10 = jVar.f4810b + iMin;
        jVar.f4810b = i10;
        this.f4797b -= (long) iMin;
        if (i10 == jVar.f4811c) {
            this.f4796a = jVar.a();
            k.a(jVar);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, N6.m
    public final void close() {
    }

    @Override // N6.m, java.io.Flushable
    public final void flush() {
    }
}

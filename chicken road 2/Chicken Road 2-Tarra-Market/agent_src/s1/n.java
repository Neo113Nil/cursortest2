package s1;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class n implements g {

    /* renamed from: a, reason: collision with root package name */
    public final e f6638a = new e();

    /* renamed from: b, reason: collision with root package name */
    public final s f6639b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6640c;

    public n(s sVar) {
        if (sVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f6639b = sVar;
    }

    public final boolean a() {
        if (this.f6640c) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f6638a;
        return eVar.a() && this.f6639b.c(eVar, 8192L) == -1;
    }

    public final long b(byte b2, long j2, long j3) {
        o oVar;
        long j4;
        long j5;
        long j6;
        if (this.f6640c) {
            throw new IllegalStateException("closed");
        }
        long j7 = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException("fromIndex=0 toIndex=" + j3);
        }
        while (j7 < j3) {
            e eVar = this.f6638a;
            eVar.getClass();
            long j8 = 0;
            if (j7 < 0 || j3 < j7) {
                throw new IllegalArgumentException("size=" + eVar.f6618b + " fromIndex=" + j7 + " toIndex=" + j3);
            }
            long j9 = eVar.f6618b;
            long j10 = j3 > j9 ? j9 : j3;
            if (j7 != j10 && (oVar = eVar.f6617a) != null) {
                if (j9 - j7 < j7) {
                    while (j9 > j7) {
                        oVar = oVar.f6647g;
                        j9 -= oVar.f6643c - oVar.f6642b;
                    }
                } else {
                    while (true) {
                        long j11 = (oVar.f6643c - oVar.f6642b) + j8;
                        if (j11 >= j7) {
                            break;
                        }
                        oVar = oVar.f6646f;
                        j8 = j11;
                    }
                    j9 = j8;
                }
                long j12 = j7;
                while (j9 < j10) {
                    byte[] bArr = oVar.f6641a;
                    j4 = j7;
                    int min = (int) Math.min(oVar.f6643c, (oVar.f6642b + j10) - j9);
                    for (int i2 = (int) ((oVar.f6642b + j12) - j9); i2 < min; i2++) {
                        if (bArr[i2] == b2) {
                            j5 = (i2 - oVar.f6642b) + j9;
                            j6 = -1;
                            break;
                        }
                    }
                    j12 = j9 + (oVar.f6643c - oVar.f6642b);
                    oVar = oVar.f6646f;
                    j9 = j12;
                    j7 = j4;
                }
            }
            j4 = j7;
            j6 = -1;
            j5 = -1;
            if (j5 != j6) {
                return j5;
            }
            long j13 = eVar.f6618b;
            if (j13 >= j3 || this.f6639b.c(eVar, 8192L) == j6) {
                return j6;
            }
            j7 = Math.max(j4, j13);
        }
        return -1L;
    }

    @Override // s1.s
    public final long c(e eVar, long j2) {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        if (this.f6640c) {
            throw new IllegalStateException("closed");
        }
        e eVar2 = this.f6638a;
        if (eVar2.f6618b == 0 && this.f6639b.c(eVar2, 8192L) == -1) {
            return -1L;
        }
        return eVar2.c(eVar, Math.min(j2, eVar2.f6618b));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f6640c) {
            return;
        }
        this.f6640c = true;
        this.f6639b.close();
        e eVar = this.f6638a;
        try {
            eVar.q(eVar.f6618b);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // s1.s
    public final u d() {
        return this.f6639b.d();
    }

    @Override // s1.g
    public final byte[] f() {
        e eVar = this.f6638a;
        s sVar = this.f6639b;
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        while (sVar.c(eVar, 8192L) != -1) {
        }
        return eVar.f();
    }

    public final byte g() {
        o(1L);
        return this.f6638a.i();
    }

    public final h i(long j2) {
        o(j2);
        e eVar = this.f6638a;
        eVar.getClass();
        return new h(eVar.j(j2));
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f6640c;
    }

    public final void j(byte[] bArr) {
        e eVar = this.f6638a;
        int i2 = 0;
        try {
            o(bArr.length);
            while (i2 < bArr.length) {
                int g2 = eVar.g(bArr, i2, bArr.length - i2);
                if (g2 == -1) {
                    throw new EOFException();
                }
                i2 += g2;
            }
        } catch (EOFException e2) {
            while (true) {
                long j2 = eVar.f6618b;
                if (j2 <= 0) {
                    throw e2;
                }
                int g3 = eVar.g(bArr, i2, (int) j2);
                if (g3 == -1) {
                    throw new AssertionError();
                }
                i2 += g3;
            }
        }
    }

    public final int k() {
        o(4L);
        return this.f6638a.l();
    }

    public final short l() {
        o(2L);
        return this.f6638a.m();
    }

    public final String m(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j2);
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long b2 = b((byte) 10, 0L, j3);
        e eVar = this.f6638a;
        if (b2 != -1) {
            return eVar.p(b2);
        }
        if (j3 < Long.MAX_VALUE && n(j3) && eVar.b(j3 - 1) == 13 && n(1 + j3) && eVar.b(j3) == 10) {
            return eVar.p(j3);
        }
        e eVar2 = new e();
        long min = Math.min(32L, eVar.f6618b);
        long j4 = 0;
        v.a(eVar.f6618b, 0L, min);
        if (min != 0) {
            eVar2.f6618b += min;
            o oVar = eVar.f6617a;
            while (true) {
                long j5 = oVar.f6643c - oVar.f6642b;
                if (j4 < j5) {
                    break;
                }
                j4 -= j5;
                oVar = oVar.f6646f;
            }
            while (min > 0) {
                o c2 = oVar.c();
                int i2 = (int) (c2.f6642b + j4);
                c2.f6642b = i2;
                c2.f6643c = Math.min(i2 + ((int) min), c2.f6643c);
                o oVar2 = eVar2.f6617a;
                if (oVar2 == null) {
                    c2.f6647g = c2;
                    c2.f6646f = c2;
                    eVar2.f6617a = c2;
                } else {
                    oVar2.f6647g.b(c2);
                }
                min -= c2.f6643c - c2.f6642b;
                oVar = oVar.f6646f;
                j4 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(eVar.f6618b, j2) + " content=" + new h(eVar2.f()).e() + (char) 8230);
    }

    public final boolean n(long j2) {
        e eVar;
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        if (this.f6640c) {
            throw new IllegalStateException("closed");
        }
        do {
            eVar = this.f6638a;
            if (eVar.f6618b >= j2) {
                return true;
            }
        } while (this.f6639b.c(eVar, 8192L) != -1);
        return false;
    }

    public final void o(long j2) {
        if (!n(j2)) {
            throw new EOFException();
        }
    }

    public final void p(long j2) {
        if (this.f6640c) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            e eVar = this.f6638a;
            if (eVar.f6618b == 0 && this.f6639b.c(eVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j2, eVar.f6618b);
            eVar.q(min);
            j2 -= min;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        e eVar = this.f6638a;
        if (eVar.f6618b == 0 && this.f6639b.c(eVar, 8192L) == -1) {
            return -1;
        }
        return eVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f6639b + ")";
    }
}

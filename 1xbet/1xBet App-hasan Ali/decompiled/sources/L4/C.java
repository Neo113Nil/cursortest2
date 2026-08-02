package L4;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import n.AbstractC2107A;
import o4.AbstractC2223a;

/* loaded from: classes.dex */
public final class C implements InterfaceC0228k, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final I f3050k;

    /* renamed from: l, reason: collision with root package name */
    public final C0226i f3051l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3052m;

    public C(I i) {
        kotlin.jvm.internal.l.f("source", i);
        this.f3050k = i;
        this.f3051l = new C0226i();
    }

    @Override // L4.InterfaceC0228k
    public final int B(y yVar) {
        kotlin.jvm.internal.l.f("options", yVar);
        if (this.f3052m) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C0226i c0226i = this.f3051l;
            int b3 = M4.a.b(c0226i, yVar, true);
            if (b3 != -2) {
                if (b3 != -1) {
                    c0226i.J(yVar.f3124k[b3].c());
                    return b3;
                }
            } else if (this.f3050k.e(c0226i, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // L4.InterfaceC0228k
    public final InputStream C() {
        return new C0224g(this, 1);
    }

    @Override // L4.InterfaceC0228k
    public final C0226i a() {
        return this.f3051l;
    }

    public final boolean b() {
        if (this.f3052m) {
            throw new IllegalStateException("closed");
        }
        C0226i c0226i = this.f3051l;
        return c0226i.l() && this.f3050k.e(c0226i, 8192L) == -1;
    }

    @Override // L4.I
    public final K c() {
        return this.f3050k.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f3052m) {
            return;
        }
        this.f3052m = true;
        this.f3050k.close();
        this.f3051l.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(byte b3, long j5, long j6) {
        D d5;
        long j7;
        long j8;
        if (this.f3052m) {
            throw new IllegalStateException("closed");
        }
        long j9 = 0;
        if (0 > j6) {
            throw new IllegalArgumentException(AbstractC2107A.r("fromIndex=0 toIndex=", j6).toString());
        }
        while (j9 < j6) {
            C0226i c0226i = this.f3051l;
            c0226i.getClass();
            long j10 = 0;
            if (0 > j9 || j9 > j6) {
                throw new IllegalArgumentException(("size=" + c0226i.f3091l + " fromIndex=" + j9 + " toIndex=" + j6).toString());
            }
            long j11 = c0226i.f3091l;
            long j12 = j6 > j11 ? j11 : j6;
            if (j9 != j12 && (d5 = c0226i.f3090k) != null) {
                if (j11 - j9 < j9) {
                    while (j11 > j9) {
                        d5 = d5.f3058g;
                        kotlin.jvm.internal.l.c(d5);
                        j11 -= d5.f3055c - d5.f3054b;
                    }
                    long j13 = j9;
                    while (j11 < j12) {
                        j7 = -1;
                        int min = (int) Math.min(d5.f3055c, (d5.f3054b + j12) - j11);
                        for (int i = (int) ((d5.f3054b + j13) - j11); i < min; i++) {
                            if (d5.f3053a[i] == b3) {
                                j8 = (i - d5.f3054b) + j11;
                                break;
                            }
                        }
                        j13 = j11 + (d5.f3055c - d5.f3054b);
                        d5 = d5.f;
                        kotlin.jvm.internal.l.c(d5);
                        j11 = j13;
                    }
                } else {
                    j7 = -1;
                    while (true) {
                        long j14 = (d5.f3055c - d5.f3054b) + j10;
                        if (j14 > j9) {
                            break;
                        }
                        d5 = d5.f;
                        kotlin.jvm.internal.l.c(d5);
                        j10 = j14;
                    }
                    long j15 = j9;
                    while (j10 < j12) {
                        long j16 = j15;
                        int min2 = (int) Math.min(d5.f3055c, (d5.f3054b + j12) - j10);
                        for (int i5 = (int) ((d5.f3054b + j16) - j10); i5 < min2; i5++) {
                            if (d5.f3053a[i5] == b3) {
                                j8 = (i5 - d5.f3054b) + j10;
                                break;
                            }
                        }
                        j15 = (d5.f3055c - d5.f3054b) + j10;
                        d5 = d5.f;
                        kotlin.jvm.internal.l.c(d5);
                        j10 = j15;
                    }
                    j8 = -1;
                }
                if (j8 == j7) {
                    return j8;
                }
                long j17 = c0226i.f3091l;
                if (j17 >= j6 || this.f3050k.e(c0226i, 8192L) == j7) {
                    return j7;
                }
                j9 = Math.max(j9, j17);
            }
            j7 = -1;
            j8 = -1;
            if (j8 == j7) {
            }
        }
        return -1L;
    }

    @Override // L4.I
    public final long e(C0226i c0226i, long j5) {
        kotlin.jvm.internal.l.f("sink", c0226i);
        if (j5 < 0) {
            throw new IllegalArgumentException(AbstractC2107A.r("byteCount < 0: ", j5).toString());
        }
        if (this.f3052m) {
            throw new IllegalStateException("closed");
        }
        C0226i c0226i2 = this.f3051l;
        if (c0226i2.f3091l == 0 && this.f3050k.e(c0226i2, 8192L) == -1) {
            return -1L;
        }
        return c0226i2.e(c0226i, Math.min(j5, c0226i2.f3091l));
    }

    public final byte f() {
        s(1L);
        return this.f3051l.s();
    }

    public final C0229l h(long j5) {
        s(j5);
        return this.f3051l.v(j5);
    }

    public final int i() {
        s(4L);
        return this.f3051l.E();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f3052m;
    }

    @Override // L4.InterfaceC0228k
    public final boolean j(long j5) {
        C0226i c0226i;
        if (j5 < 0) {
            throw new IllegalArgumentException(AbstractC2107A.r("byteCount < 0: ", j5).toString());
        }
        if (this.f3052m) {
            throw new IllegalStateException("closed");
        }
        do {
            c0226i = this.f3051l;
            if (c0226i.f3091l >= j5) {
                return true;
            }
        } while (this.f3050k.e(c0226i, 8192L) != -1);
        return false;
    }

    public final int k() {
        s(4L);
        int E5 = this.f3051l.E();
        return ((E5 & 255) << 24) | (((-16777216) & E5) >>> 24) | ((16711680 & E5) >>> 8) | ((65280 & E5) << 8);
    }

    public final long l() {
        char c5;
        char c6;
        char c7;
        char c8;
        long j5;
        s(8L);
        C0226i c0226i = this.f3051l;
        if (c0226i.f3091l < 8) {
            throw new EOFException();
        }
        D d5 = c0226i.f3090k;
        kotlin.jvm.internal.l.c(d5);
        int i = d5.f3054b;
        int i5 = d5.f3055c;
        if (i5 - i < 8) {
            j5 = ((c0226i.E() & 4294967295L) << 32) | (4294967295L & c0226i.E());
            c7 = '(';
            c8 = '8';
            c5 = '\b';
            c6 = 24;
        } else {
            byte[] bArr = d5.f3053a;
            c5 = '\b';
            c6 = 24;
            c7 = '(';
            c8 = '8';
            int i6 = i + 7;
            long j6 = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
            int i7 = i + 8;
            long j7 = j6 | (bArr[i6] & 255);
            c0226i.f3091l -= 8;
            if (i7 == i5) {
                c0226i.f3090k = d5.a();
                E.a(d5);
            } else {
                d5.f3054b = i7;
            }
            j5 = j7;
        }
        return ((j5 & 255) << c8) | (((-72057594037927936L) & j5) >>> c8) | ((71776119061217280L & j5) >>> c7) | ((280375465082880L & j5) >>> c6) | ((1095216660480L & j5) >>> c5) | ((4278190080L & j5) << c5) | ((16711680 & j5) << c6) | ((65280 & j5) << c7);
    }

    public final short m() {
        s(2L);
        return this.f3051l.F();
    }

    public final short n() {
        s(2L);
        return this.f3051l.G();
    }

    public final String p(long j5) {
        s(j5);
        C0226i c0226i = this.f3051l;
        c0226i.getClass();
        return c0226i.H(j5, AbstractC2223a.f18653a);
    }

    public final String r(long j5) {
        if (j5 < 0) {
            throw new IllegalArgumentException(AbstractC2107A.r("limit < 0: ", j5).toString());
        }
        long j6 = j5 == Long.MAX_VALUE ? Long.MAX_VALUE : j5 + 1;
        long d5 = d((byte) 10, 0L, j6);
        C0226i c0226i = this.f3051l;
        if (d5 != -1) {
            return M4.a.a(c0226i, d5);
        }
        if (j6 < Long.MAX_VALUE && j(j6) && c0226i.m(j6 - 1) == 13 && j(j6 + 1) && c0226i.m(j6) == 10) {
            return M4.a.a(c0226i, j6);
        }
        C0226i c0226i2 = new C0226i();
        c0226i.k(c0226i2, 0L, Math.min(32, c0226i.f3091l));
        throw new EOFException("\\n not found: limit=" + Math.min(c0226i.f3091l, j5) + " content=" + c0226i2.v(c0226i2.f3091l).d() + (char) 8230);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.l.f("sink", byteBuffer);
        C0226i c0226i = this.f3051l;
        if (c0226i.f3091l == 0 && this.f3050k.e(c0226i, 8192L) == -1) {
            return -1;
        }
        return c0226i.read(byteBuffer);
    }

    public final void s(long j5) {
        if (!j(j5)) {
            throw new EOFException();
        }
    }

    public final void t(long j5) {
        if (this.f3052m) {
            throw new IllegalStateException("closed");
        }
        while (j5 > 0) {
            C0226i c0226i = this.f3051l;
            if (c0226i.f3091l == 0 && this.f3050k.e(c0226i, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j5, c0226i.f3091l);
            c0226i.J(min);
            j5 -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.f3050k + ')';
    }

    @Override // L4.InterfaceC0228k
    public final long u(InterfaceC0227j interfaceC0227j) {
        C0226i c0226i;
        long j5 = 0;
        while (true) {
            c0226i = this.f3051l;
            if (this.f3050k.e(c0226i, 8192L) == -1) {
                break;
            }
            long i = c0226i.i();
            if (i > 0) {
                j5 += i;
                interfaceC0227j.D(c0226i, i);
            }
        }
        long j6 = c0226i.f3091l;
        if (j6 <= 0) {
            return j5;
        }
        long j7 = j5 + j6;
        interfaceC0227j.D(c0226i, j6);
        return j7;
    }
}

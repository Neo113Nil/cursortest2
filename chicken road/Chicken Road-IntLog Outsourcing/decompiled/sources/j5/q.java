package j5;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q implements h {

    /* renamed from: a, reason: collision with root package name */
    public final w f10518a;

    /* renamed from: b, reason: collision with root package name */
    public final f f10519b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10520c;

    public q(w source) {
        kotlin.jvm.internal.i.e(source, "source");
        this.f10518a = source;
        this.f10519b = new f();
    }

    public final void A(long j2) {
        if (!y(j2)) {
            throw new EOFException();
        }
    }

    public final void C(long j2) {
        if (this.f10520c) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            f fVar = this.f10519b;
            if (fVar.f10495b == 0 && this.f10518a.s(fVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j2, fVar.f10495b);
            fVar.D(min);
            j2 -= min;
        }
    }

    public final boolean a() {
        if (this.f10520c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f10519b;
        return fVar.a() && this.f10518a.s(fVar, 8192L) == -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        throw new java.lang.IllegalArgumentException(("size=" + r6.f10495b + " fromIndex=" + r4 + " toIndex=" + r2).toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(byte b6, long j2, long j6) {
        long j7;
        r rVar;
        q qVar = this;
        long j8 = j6;
        if (qVar.f10520c) {
            throw new IllegalStateException("closed");
        }
        long j9 = 0;
        if (0 > j8) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j8).toString());
        }
        while (true) {
            if (j9 >= j8) {
                j7 = -1;
                break;
            }
            f fVar = qVar.f10519b;
            fVar.getClass();
            long j10 = 0;
            if (0 > j9 || j9 > j8) {
                break;
            }
            long j11 = fVar.f10495b;
            long j12 = j8 > j11 ? j11 : j8;
            long j13 = -1;
            if (j9 != j12 && (rVar = fVar.f10494a) != null) {
                if (j11 - j9 >= j9) {
                    while (true) {
                        long j14 = (rVar.f10523c - rVar.f10522b) + j10;
                        if (j14 > j9) {
                            break;
                        }
                        rVar = rVar.f10526f;
                        kotlin.jvm.internal.i.b(rVar);
                        j10 = j14;
                    }
                    long j15 = j9;
                    while (true) {
                        if (j10 >= j12) {
                            break;
                        }
                        int min = (int) Math.min(rVar.f10523c, (rVar.f10522b + j12) - j10);
                        for (int i2 = (int) ((rVar.f10522b + j15) - j10); i2 < min; i2++) {
                            if (rVar.f10521a[i2] == b6) {
                                j13 = (i2 - rVar.f10522b) + j10;
                                break;
                            }
                        }
                        j15 = (rVar.f10523c - rVar.f10522b) + j10;
                        rVar = rVar.f10526f;
                        kotlin.jvm.internal.i.b(rVar);
                        j10 = j15;
                    }
                } else {
                    while (j11 > j9) {
                        rVar = rVar.f10527g;
                        kotlin.jvm.internal.i.b(rVar);
                        j11 -= rVar.f10523c - rVar.f10522b;
                    }
                    long j16 = j9;
                    while (true) {
                        if (j11 >= j12) {
                            break;
                        }
                        int min2 = (int) Math.min(rVar.f10523c, (rVar.f10522b + j12) - j11);
                        for (int i3 = (int) ((rVar.f10522b + j16) - j11); i3 < min2; i3++) {
                            if (rVar.f10521a[i3] == b6) {
                                j13 = (i3 - rVar.f10522b) + j11;
                                break;
                            }
                        }
                        j16 = j11 + (rVar.f10523c - rVar.f10522b);
                        rVar = rVar.f10526f;
                        kotlin.jvm.internal.i.b(rVar);
                        j11 = j16;
                    }
                }
            }
            j7 = -1;
            if (j13 != -1) {
                return j13;
            }
            long j17 = fVar.f10495b;
            if (j17 >= j6) {
                break;
            }
            qVar = this;
            if (qVar.f10518a.s(fVar, 8192L) == -1) {
                break;
            }
            j9 = Math.max(j9, j17);
            j8 = j6;
        }
        return j7;
    }

    public final byte c() {
        A(1L);
        return this.f10519b.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f10520c) {
            return;
        }
        this.f10520c = true;
        this.f10518a.close();
        f fVar = this.f10519b;
        fVar.D(fVar.f10495b);
    }

    @Override // j5.w
    public final y d() {
        return this.f10518a.d();
    }

    public final i g(long j2) {
        A(j2);
        return this.f10519b.o(j2);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f10520c;
    }

    @Override // j5.h
    public final byte[] l() {
        w wVar = this.f10518a;
        f fVar = this.f10519b;
        fVar.I(wVar);
        return fVar.g(fVar.f10495b);
    }

    public final int o() {
        A(4L);
        return this.f10519b.q();
    }

    public final short p() {
        A(2L);
        return this.f10519b.y();
    }

    public final String q(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j6 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long b6 = b((byte) 10, 0L, j6);
        f fVar = this.f10519b;
        if (b6 != -1) {
            return k5.a.a(fVar, b6);
        }
        if (j6 < Long.MAX_VALUE && y(j6) && fVar.b(j6 - 1) == 13 && y(1 + j6) && fVar.b(j6) == 10) {
            return k5.a.a(fVar, j6);
        }
        f out = new f();
        long min = Math.min(32, fVar.f10495b);
        long j7 = 0;
        fVar.getClass();
        kotlin.jvm.internal.i.e(out, "out");
        b.d(fVar.f10495b, 0L, min);
        if (min != 0) {
            out.f10495b += min;
            r rVar = fVar.f10494a;
            while (true) {
                kotlin.jvm.internal.i.b(rVar);
                long j8 = rVar.f10523c - rVar.f10522b;
                if (j7 < j8) {
                    break;
                }
                j7 -= j8;
                rVar = rVar.f10526f;
            }
            while (min > 0) {
                kotlin.jvm.internal.i.b(rVar);
                r c2 = rVar.c();
                int i2 = c2.f10522b + ((int) j7);
                c2.f10522b = i2;
                c2.f10523c = Math.min(i2 + ((int) min), c2.f10523c);
                r rVar2 = out.f10494a;
                if (rVar2 == null) {
                    c2.f10527g = c2;
                    c2.f10526f = c2;
                    out.f10494a = c2;
                } else {
                    r rVar3 = rVar2.f10527g;
                    kotlin.jvm.internal.i.b(rVar3);
                    rVar3.b(c2);
                }
                min -= c2.f10523c - c2.f10522b;
                rVar = rVar.f10526f;
                j7 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.f10495b, j2) + " content=" + out.o(out.f10495b).b() + (char) 8230);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        f fVar = this.f10519b;
        if (fVar.f10495b == 0 && this.f10518a.s(fVar, 8192L) == -1) {
            return -1;
        }
        return fVar.read(sink);
    }

    @Override // j5.w
    public final long s(f sink, long j2) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f10520c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f10519b;
        if (fVar.f10495b == 0) {
            if (j2 == 0) {
                return 0L;
            }
            if (this.f10518a.s(fVar, 8192L) == -1) {
                return -1L;
            }
        }
        return fVar.s(sink, Math.min(j2, fVar.f10495b));
    }

    public final String toString() {
        return "buffer(" + this.f10518a + ')';
    }

    public final boolean y(long j2) {
        f fVar;
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f10520c) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.f10519b;
            if (fVar.f10495b >= j2) {
                return true;
            }
        } while (this.f10518a.s(fVar, 8192L) != -1);
        return false;
    }
}

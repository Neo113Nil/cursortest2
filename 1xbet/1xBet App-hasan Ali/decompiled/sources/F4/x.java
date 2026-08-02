package F4;

import L4.C0226i;
import L4.D;
import a3.AbstractC0467k;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import n.AbstractC2107A;
import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class x implements Closeable, AutoCloseable {

    /* renamed from: p, reason: collision with root package name */
    public static final Logger f1675p = Logger.getLogger(f.class.getName());

    /* renamed from: k, reason: collision with root package name */
    public final L4.B f1676k;

    /* renamed from: l, reason: collision with root package name */
    public final C0226i f1677l;

    /* renamed from: m, reason: collision with root package name */
    public int f1678m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1679n;

    /* renamed from: o, reason: collision with root package name */
    public final d f1680o;

    public x(L4.B b3) {
        kotlin.jvm.internal.l.f("sink", b3);
        this.f1676k = b3;
        C0226i c0226i = new C0226i();
        this.f1677l = c0226i;
        this.f1678m = 16384;
        this.f1680o = new d(c0226i);
    }

    public final synchronized void b(B b3) {
        try {
            kotlin.jvm.internal.l.f("peerSettings", b3);
            if (this.f1679n) {
                throw new IOException("closed");
            }
            int i = this.f1678m;
            int i5 = b3.f1565a;
            if ((i5 & 32) != 0) {
                i = b3.f1566b[5];
            }
            this.f1678m = i;
            if (((i5 & 2) != 0 ? b3.f1566b[1] : -1) != -1) {
                d dVar = this.f1680o;
                int i6 = (i5 & 2) != 0 ? b3.f1566b[1] : -1;
                dVar.getClass();
                int min = Math.min(i6, 16384);
                int i7 = dVar.f1584d;
                if (i7 != min) {
                    if (min < i7) {
                        dVar.f1582b = Math.min(dVar.f1582b, min);
                    }
                    dVar.f1583c = true;
                    dVar.f1584d = min;
                    int i8 = dVar.f1587h;
                    if (min < i8) {
                        if (min == 0) {
                            C0122b[] c0122bArr = dVar.f1585e;
                            X3.l.B0(c0122bArr, 0, c0122bArr.length);
                            dVar.f = dVar.f1585e.length - 1;
                            dVar.f1586g = 0;
                            dVar.f1587h = 0;
                        } else {
                            dVar.a(i8 - min);
                        }
                    }
                }
            }
            f(0, 0, 4, 1);
            this.f1676k.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f1679n = true;
        this.f1676k.close();
    }

    public final synchronized void d(boolean z3, int i, C0226i c0226i, int i5) {
        if (this.f1679n) {
            throw new IOException("closed");
        }
        f(i, i5, 0, z3 ? 1 : 0);
        if (i5 > 0) {
            kotlin.jvm.internal.l.c(c0226i);
            this.f1676k.D(c0226i, i5);
        }
    }

    public final void f(int i, int i5, int i6, int i7) {
        Level level = Level.FINE;
        Logger logger = f1675p;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i, i5, i6, i7));
        }
        if (i5 > this.f1678m) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f1678m + ": " + i5).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(AbstractC2107A.q("reserved bit set: ", i).toString());
        }
        byte[] bArr = z4.b.f21979a;
        L4.B b3 = this.f1676k;
        kotlin.jvm.internal.l.f("<this>", b3);
        b3.o((i5 >>> 16) & 255);
        b3.o((i5 >>> 8) & 255);
        b3.o(i5 & 255);
        b3.o(i6 & 255);
        b3.o(i7 & 255);
        b3.d(i & Integer.MAX_VALUE);
    }

    public final synchronized void flush() {
        if (this.f1679n) {
            throw new IOException("closed");
        }
        this.f1676k.flush();
    }

    public final synchronized void h(byte[] bArr, int i, int i5) {
        AbstractC0467k.A("errorCode", i5);
        if (this.f1679n) {
            throw new IOException("closed");
        }
        if (AbstractC2462i.b(i5) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        f(0, bArr.length + 8, 7, 0);
        this.f1676k.d(i);
        this.f1676k.d(AbstractC2462i.b(i5));
        if (bArr.length != 0) {
            this.f1676k.q(bArr);
        }
        this.f1676k.flush();
    }

    public final synchronized void i(boolean z3, int i, ArrayList arrayList) {
        if (this.f1679n) {
            throw new IOException("closed");
        }
        this.f1680o.d(arrayList);
        long j5 = this.f1677l.f3091l;
        long min = Math.min(this.f1678m, j5);
        int i5 = j5 == min ? 4 : 0;
        if (z3) {
            i5 |= 1;
        }
        f(i, (int) min, 1, i5);
        this.f1676k.D(this.f1677l, min);
        if (j5 > min) {
            long j6 = j5 - min;
            while (j6 > 0) {
                long min2 = Math.min(this.f1678m, j6);
                j6 -= min2;
                f(i, (int) min2, 9, j6 == 0 ? 4 : 0);
                this.f1676k.D(this.f1677l, min2);
            }
        }
    }

    public final synchronized void k(int i, int i5, boolean z3) {
        if (this.f1679n) {
            throw new IOException("closed");
        }
        f(0, 8, 6, z3 ? 1 : 0);
        this.f1676k.d(i);
        this.f1676k.d(i5);
        this.f1676k.flush();
    }

    public final synchronized void l(int i, int i5) {
        AbstractC0467k.A("errorCode", i5);
        if (this.f1679n) {
            throw new IOException("closed");
        }
        if (AbstractC2462i.b(i5) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        f(i, 4, 3, 0);
        this.f1676k.d(AbstractC2462i.b(i5));
        this.f1676k.flush();
    }

    public final synchronized void m(B b3) {
        try {
            kotlin.jvm.internal.l.f("settings", b3);
            if (this.f1679n) {
                throw new IOException("closed");
            }
            f(0, Integer.bitCount(b3.f1565a) * 6, 4, 0);
            int i = 0;
            while (i < 10) {
                boolean z3 = true;
                if (((1 << i) & b3.f1565a) == 0) {
                    z3 = false;
                }
                if (z3) {
                    int i5 = i != 4 ? i != 7 ? i : 4 : 3;
                    L4.B b5 = this.f1676k;
                    if (b5.f3049m) {
                        throw new IllegalStateException("closed");
                    }
                    C0226i c0226i = b5.f3048l;
                    D L5 = c0226i.L(2);
                    int i6 = L5.f3055c;
                    byte[] bArr = L5.f3053a;
                    bArr[i6] = (byte) ((i5 >>> 8) & 255);
                    bArr[i6 + 1] = (byte) (i5 & 255);
                    L5.f3055c = i6 + 2;
                    c0226i.f3091l += 2;
                    b5.b();
                    this.f1676k.d(b3.f1566b[i]);
                }
                i++;
            }
            this.f1676k.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n(int i, long j5) {
        if (this.f1679n) {
            throw new IOException("closed");
        }
        if (j5 == 0 || j5 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j5).toString());
        }
        f(i, 4, 8, 0);
        this.f1676k.d((int) j5);
        this.f1676k.flush();
    }
}

package L4;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import n.AbstractC2107A;
import o4.AbstractC2227e;

/* loaded from: classes.dex */
public final class s implements I, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public byte f3110k;

    /* renamed from: l, reason: collision with root package name */
    public final C f3111l;

    /* renamed from: m, reason: collision with root package name */
    public final Inflater f3112m;

    /* renamed from: n, reason: collision with root package name */
    public final t f3113n;

    /* renamed from: o, reason: collision with root package name */
    public final CRC32 f3114o;

    public s(I i) {
        kotlin.jvm.internal.l.f("source", i);
        C c5 = new C(i);
        this.f3111l = c5;
        Inflater inflater = new Inflater(true);
        this.f3112m = inflater;
        this.f3113n = new t(c5, inflater);
        this.f3114o = new CRC32();
    }

    public static void b(int i, int i5, String str) {
        if (i5 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + AbstractC2227e.J0(G4.l.O(i5), 8) + " != expected 0x" + AbstractC2227e.J0(G4.l.O(i), 8));
    }

    @Override // L4.I
    public final K c() {
        return this.f3111l.f3050k.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3113n.close();
    }

    public final void d(C0226i c0226i, long j5, long j6) {
        D d5 = c0226i.f3090k;
        kotlin.jvm.internal.l.c(d5);
        while (true) {
            int i = d5.f3055c;
            int i5 = d5.f3054b;
            if (j5 < i - i5) {
                break;
            }
            j5 -= i - i5;
            d5 = d5.f;
            kotlin.jvm.internal.l.c(d5);
        }
        while (j6 > 0) {
            int min = (int) Math.min(d5.f3055c - r6, j6);
            this.f3114o.update(d5.f3053a, (int) (d5.f3054b + j5), min);
            j6 -= min;
            d5 = d5.f;
            kotlin.jvm.internal.l.c(d5);
            j5 = 0;
        }
    }

    @Override // L4.I
    public final long e(C0226i c0226i, long j5) {
        s sVar = this;
        kotlin.jvm.internal.l.f("sink", c0226i);
        if (j5 < 0) {
            throw new IllegalArgumentException(AbstractC2107A.r("byteCount < 0: ", j5).toString());
        }
        if (j5 == 0) {
            return 0L;
        }
        byte b3 = sVar.f3110k;
        CRC32 crc32 = sVar.f3114o;
        C c5 = sVar.f3111l;
        if (b3 == 0) {
            c5.s(10L);
            C0226i c0226i2 = c5.f3051l;
            byte m5 = c0226i2.m(3L);
            boolean z3 = ((m5 >> 1) & 1) == 1;
            if (z3) {
                sVar.d(c0226i2, 0L, 10L);
            }
            b(8075, c5.m(), "ID1ID2");
            c5.t(8L);
            if (((m5 >> 2) & 1) == 1) {
                c5.s(2L);
                if (z3) {
                    d(c0226i2, 0L, 2L);
                }
                long G5 = c0226i2.G() & 65535;
                c5.s(G5);
                if (z3) {
                    d(c0226i2, 0L, G5);
                }
                c5.t(G5);
            }
            if (((m5 >> 3) & 1) == 1) {
                long d5 = c5.d((byte) 0, 0L, Long.MAX_VALUE);
                if (d5 == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    d(c0226i2, 0L, d5 + 1);
                }
                c5.t(d5 + 1);
            }
            if (((m5 >> 4) & 1) == 1) {
                long d6 = c5.d((byte) 0, 0L, Long.MAX_VALUE);
                if (d6 == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    sVar = this;
                    sVar.d(c0226i2, 0L, d6 + 1);
                } else {
                    sVar = this;
                }
                c5.t(d6 + 1);
            } else {
                sVar = this;
            }
            if (z3) {
                b(c5.n(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            sVar.f3110k = (byte) 1;
        }
        if (sVar.f3110k == 1) {
            long j6 = c0226i.f3091l;
            long e3 = sVar.f3113n.e(c0226i, j5);
            if (e3 != -1) {
                sVar.d(c0226i, j6, e3);
                return e3;
            }
            sVar.f3110k = (byte) 2;
        }
        if (sVar.f3110k == 2) {
            b(c5.k(), (int) crc32.getValue(), "CRC");
            b(c5.k(), (int) sVar.f3112m.getBytesWritten(), "ISIZE");
            sVar.f3110k = (byte) 3;
            if (!c5.b()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}

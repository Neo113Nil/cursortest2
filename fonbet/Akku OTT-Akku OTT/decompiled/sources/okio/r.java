package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

@SourceDebugExtension({"SMAP\nGzipSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,222:1\n1#2:223\n63#3:224\n63#3:226\n63#3:228\n63#3:229\n63#3:230\n63#3:232\n63#3:234\n204#4:225\n204#4:227\n204#4:231\n204#4:233\n88#5:235\n*S KotlinDebug\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n*L\n103#1:224\n105#1:226\n117#1:228\n118#1:229\n120#1:230\n131#1:232\n142#1:234\n104#1:225\n115#1:227\n128#1:231\n139#1:233\n185#1:235\n*E\n"})
/* loaded from: classes5.dex */
public final class r implements K {
    public byte a;
    public final F b;
    public final Inflater c;
    public final s d;
    public final CRC32 e;

    public r(InterfaceC1192g source) {
        Intrinsics.checkNotNullParameter(source, "source");
        F f = new F(source);
        this.b = f;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new s(f, inflater);
        this.e = new CRC32();
    }

    public static void d(int i, int i2, String str) {
        String padStart;
        String padStart2;
        if (i2 == i) {
            return;
        }
        StringBuilder d = androidx.browser.browseractions.a.d(str, ": actual 0x");
        padStart = StringsKt__StringsKt.padStart(C1187b.f(i2), 8, '0');
        d.append(padStart);
        d.append(" != expected 0x");
        padStart2 = StringsKt__StringsKt.padStart(C1187b.f(i), 8, '0');
        d.append(padStart2);
        throw new IOException(d.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    public final void l(long j, C1190e c1190e, long j2) {
        G g = c1190e.a;
        Intrinsics.checkNotNull(g);
        while (true) {
            int i = g.c;
            int i2 = g.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            g = g.f;
            Intrinsics.checkNotNull(g);
        }
        while (j2 > 0) {
            int min = (int) Math.min(g.c - r5, j2);
            this.e.update(g.a, (int) (g.b + j), min);
            j2 -= min;
            g = g.f;
            Intrinsics.checkNotNull(g);
            j = 0;
        }
    }

    @Override // okio.K
    public final long read(C1190e sink, long j) throws IOException {
        r rVar = this;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(androidx.core.database.a.c(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = rVar.a;
        CRC32 crc32 = rVar.e;
        F f = rVar.b;
        if (b == 0) {
            f.A(10L);
            C1190e c1190e = f.b;
            byte t = c1190e.t(3L);
            boolean z = ((t >> 1) & 1) == 1;
            if (z) {
                rVar.l(0L, f.b, 10L);
            }
            d(8075, f.readShort(), "ID1ID2");
            f.skip(8L);
            if (((t >> 2) & 1) == 1) {
                f.A(2L);
                if (z) {
                    l(0L, f.b, 2L);
                }
                long v = c1190e.v() & UShort.MAX_VALUE;
                f.A(v);
                if (z) {
                    l(0L, f.b, v);
                }
                f.skip(v);
            }
            if (((t >> 3) & 1) == 1) {
                long d = f.d((byte) 0, 0L, Long.MAX_VALUE);
                if (d == -1) {
                    throw new EOFException();
                }
                if (z) {
                    l(0L, f.b, d + 1);
                }
                f.skip(d + 1);
            }
            if (((t >> 4) & 1) == 1) {
                long d2 = f.d((byte) 0, 0L, Long.MAX_VALUE);
                if (d2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    rVar = this;
                    rVar.l(0L, f.b, d2 + 1);
                } else {
                    rVar = this;
                }
                f.skip(d2 + 1);
            } else {
                rVar = this;
            }
            if (z) {
                d(f.v(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            rVar.a = (byte) 1;
        }
        if (rVar.a == 1) {
            long j2 = sink.b;
            long read = rVar.d.read(sink, j);
            if (read != -1) {
                rVar.l(j2, sink, read);
                return read;
            }
            rVar.a = (byte) 2;
        }
        if (rVar.a == 2) {
            d(f.P(), (int) crc32.getValue(), "CRC");
            d(f.P(), (int) rVar.c.getBytesWritten(), "ISIZE");
            rVar.a = (byte) 3;
            if (!f.E()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // okio.K
    /* renamed from: timeout */
    public final L getTimeout() {
        return this.b.a.getTimeout();
    }
}

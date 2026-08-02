package okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nGzipSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,152:1\n51#2:153\n1#3:154\n85#4:155\n*S KotlinDebug\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n*L\n62#1:153\n130#1:155\n*E\n"})
/* loaded from: classes5.dex */
public final class q implements J {
    public final E a;
    public final Deflater b;
    public final C1194i c;
    public boolean d;
    public final CRC32 e;

    public q(InterfaceC1191f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        E e = new E(sink);
        this.a = e;
        Deflater deflater = new Deflater(-1, true);
        this.b = deflater;
        this.c = new C1194i(e, deflater);
        this.e = new CRC32();
        C1190e c1190e = e.b;
        c1190e.h0(8075);
        c1190e.c0(8);
        c1190e.c0(0);
        c1190e.f0(0);
        c1190e.c0(0);
        c1190e.c0(0);
    }

    @Override // okio.J, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int value;
        boolean z;
        C1190e c1190e;
        Deflater deflater = this.b;
        E e = this.a;
        if (this.d) {
            return;
        }
        try {
            C1194i c1194i = this.c;
            c1194i.b.finish();
            c1194i.d(false);
            value = (int) this.e.getValue();
            z = e.c;
            c1190e = e.b;
        } catch (Throwable th) {
            th = th;
        }
        if (z) {
            throw new IllegalStateException("closed");
        }
        c1190e.getClass();
        c1190e.f0(C1187b.d(value));
        e.j();
        int bytesRead = (int) deflater.getBytesRead();
        if (e.c) {
            throw new IllegalStateException("closed");
        }
        c1190e.getClass();
        c1190e.f0(C1187b.d(bytesRead));
        e.j();
        th = null;
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            e.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.J, java.io.Flushable
    public final void flush() throws IOException {
        this.c.flush();
    }

    @Override // okio.J
    public final L timeout() {
        return this.a.a.timeout();
    }

    @Override // okio.J
    public final void write(C1190e source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (j < 0) {
            throw new IllegalArgumentException(androidx.core.database.a.c(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return;
        }
        G g = source.a;
        Intrinsics.checkNotNull(g);
        long j2 = j;
        while (j2 > 0) {
            int min = (int) Math.min(j2, g.c - g.b);
            this.e.update(g.a, g.b, min);
            j2 -= min;
            g = g.f;
            Intrinsics.checkNotNull(g);
        }
        this.c.write(source, j);
    }
}

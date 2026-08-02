package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nDeflaterSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,140:1\n85#2:141\n*S KotlinDebug\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n*L\n39#1:141\n*E\n"})
/* renamed from: okio.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1194i implements J {
    public final E a;
    public final Deflater b;
    public boolean c;

    public C1194i(E sink, Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.a = sink;
        this.b = deflater;
    }

    @Override // okio.J, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Deflater deflater = this.b;
        if (this.c) {
            return;
        }
        try {
            deflater.finish();
            d(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    public final void d(boolean z) {
        G a0;
        int deflate;
        E e = this.a;
        C1190e c1190e = e.b;
        while (true) {
            a0 = c1190e.a0(1);
            byte[] bArr = a0.a;
            Deflater deflater = this.b;
            if (z) {
                try {
                    int i = a0.c;
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e2) {
                    throw new IOException("Deflater already closed", e2);
                }
            } else {
                int i2 = a0.c;
                deflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (deflate > 0) {
                a0.c += deflate;
                c1190e.b += deflate;
                e.j();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (a0.b == a0.c) {
            c1190e.a = a0.a();
            H.a(a0);
        }
    }

    @Override // okio.J, java.io.Flushable
    public final void flush() throws IOException {
        d(true);
        this.a.flush();
    }

    @Override // okio.J
    public final L timeout() {
        return this.a.a.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.a + ')';
    }

    @Override // okio.J
    public final void write(C1190e source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        C1187b.b(source.b, 0L, j);
        while (true) {
            Deflater deflater = this.b;
            if (j <= 0) {
                deflater.setInput(okio.internal.w.a, 0, 0);
                return;
            }
            G g = source.a;
            Intrinsics.checkNotNull(g);
            int min = (int) Math.min(j, g.c - g.b);
            deflater.setInput(g.a, g.b, min);
            d(false);
            long j2 = min;
            source.b -= j2;
            int i = g.b + min;
            g.b = i;
            if (i == g.c) {
                source.a = g.a();
                H.a(g);
            }
            j -= j2;
        }
    }
}

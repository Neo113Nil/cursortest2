package okio;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,234:1\n85#2:235\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n*L\n56#1:235\n*E\n"})
/* loaded from: classes5.dex */
public final class B implements J {
    public final OutputStream a;
    public final L b;

    public B(OutputStream out, L timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.a = out;
        this.b = timeout;
    }

    @Override // okio.J, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // okio.J, java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    @Override // okio.J
    public final L timeout() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + this.a + ')';
    }

    @Override // okio.J
    public final void write(C1190e source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        C1187b.b(source.b, 0L, j);
        while (j > 0) {
            this.b.throwIfReached();
            G g = source.a;
            Intrinsics.checkNotNull(g);
            int min = (int) Math.min(j, g.c - g.b);
            this.a.write(g.a, g.b, min);
            int i = g.b + min;
            g.b = i;
            long j2 = min;
            j -= j2;
            source.b -= j2;
            if (i == g.c) {
                source.a = g.a();
                H.a(g);
            }
        }
    }
}

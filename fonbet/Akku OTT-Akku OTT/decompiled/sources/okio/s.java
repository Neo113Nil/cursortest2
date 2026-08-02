package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nInflaterSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,132:1\n1#2:133\n85#3:134\n*S KotlinDebug\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n*L\n66#1:134\n*E\n"})
/* loaded from: classes5.dex */
public final class s implements K {
    public final F a;
    public final Inflater b;
    public int c;
    public boolean d;

    public s(F source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.a = source;
        this.b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    public final long d(C1190e sink, long j) throws IOException {
        Inflater inflater = this.b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(androidx.core.database.a.c(j, "byteCount < 0: ").toString());
        }
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        if (j != 0) {
            try {
                G a0 = sink.a0(1);
                int min = (int) Math.min(j, 8192 - a0.c);
                boolean needsInput = inflater.needsInput();
                F f = this.a;
                if (needsInput && !f.E()) {
                    G g = f.b.a;
                    Intrinsics.checkNotNull(g);
                    int i = g.c;
                    int i2 = g.b;
                    int i3 = i - i2;
                    this.c = i3;
                    inflater.setInput(g.a, i2, i3);
                }
                int inflate = inflater.inflate(a0.a, a0.c, min);
                int i4 = this.c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.c -= remaining;
                    f.skip(remaining);
                }
                if (inflate > 0) {
                    a0.c += inflate;
                    long j2 = inflate;
                    sink.b += j2;
                    return j2;
                }
                if (a0.b == a0.c) {
                    sink.a = a0.a();
                    H.a(a0);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // okio.K
    public final long read(C1190e sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long d = d(sink, j);
            if (d > 0) {
                return d;
            }
            Inflater inflater = this.b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.E());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // okio.K
    public final L timeout() {
        return this.a.a.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(K source, Inflater inflater) {
        this(z.b(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}

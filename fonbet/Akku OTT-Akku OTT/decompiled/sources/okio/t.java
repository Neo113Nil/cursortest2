package okio;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,234:1\n1#2:235\n85#3:236\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n*L\n93#1:236\n*E\n"})
/* loaded from: classes5.dex */
public final class t implements K {
    public final InputStream a;
    public final L b;

    public t(InputStream input, L timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.a = input;
        this.b = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // okio.K
    public final long read(C1190e sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(androidx.core.database.a.c(j, "byteCount < 0: ").toString());
        }
        try {
            this.b.throwIfReached();
            G a0 = sink.a0(1);
            int read = this.a.read(a0.a, a0.c, (int) Math.min(j, 8192 - a0.c));
            if (read != -1) {
                a0.c += read;
                long j2 = read;
                sink.b += j2;
                return j2;
            }
            if (a0.b != a0.c) {
                return -1L;
            }
            sink.a = a0.a();
            H.a(a0);
            return -1L;
        } catch (AssertionError e) {
            if (okio.internal.v.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // okio.K
    public final L timeout() {
        return this.b;
    }

    public final String toString() {
        return "source(" + this.a + ')';
    }
}

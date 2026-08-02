package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okio.C1187b;
import okio.C1190e;
import okio.C1193h;
import okio.C1194i;
import okio.z;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lokio/e;", "Lokio/h;", "suffix", "endsWith", "(Lokio/e;Lokio/h;)Z", "buffer", "", "deflate", "(Lokio/e;)V", "close", "()V", "Z", "deflatedBytes", "Lokio/e;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Lokio/i;", "deflaterSink", "Lokio/i;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MessageDeflater implements Closeable {
    private final C1190e deflatedBytes;
    private final Deflater deflater;
    private final C1194i deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        C1190e sink = new C1190e();
        this.deflatedBytes = sink;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.deflaterSink = new C1194i(z.a(sink), deflater);
    }

    private final boolean endsWith(C1190e c1190e, C1193h c1193h) {
        return c1190e.n(c1190e.b - c1193h.d(), c1193h);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.deflaterSink.close();
    }

    public final void deflate(C1190e buffer) throws IOException {
        C1193h c1193h;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.deflatedBytes.b != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(buffer, buffer.b);
        this.deflaterSink.flush();
        C1190e c1190e = this.deflatedBytes;
        c1193h = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
        if (endsWith(c1190e, c1193h)) {
            C1190e c1190e2 = this.deflatedBytes;
            long j = c1190e2.b - 4;
            C1190e.a H = c1190e2.H(C1187b.a);
            try {
                H.d(j);
                CloseableKt.closeFinally(H, null);
            } finally {
            }
        } else {
            this.deflatedBytes.c0(0);
        }
        C1190e c1190e3 = this.deflatedBytes;
        buffer.write(c1190e3, c1190e3.b);
    }
}

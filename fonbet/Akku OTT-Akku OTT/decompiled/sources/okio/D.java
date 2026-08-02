package okio;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nokio/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes5.dex */
public final class D implements K {
    public final InterfaceC1192g a;
    public final C1190e b;
    public G c;
    public int d;
    public boolean e;
    public long f;

    public D(InterfaceC1192g upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.a = upstream;
        C1190e a = upstream.a();
        this.b = a;
        G g = a.a;
        this.c = g;
        this.d = g != null ? g.b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // okio.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(C1190e sink, long j) {
        G g;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(androidx.core.database.a.c(j, "byteCount < 0: ").toString());
        }
        if (this.e) {
            throw new IllegalStateException("closed");
        }
        G g2 = this.c;
        C1190e c1190e = this.b;
        if (g2 != null) {
            G g3 = c1190e.a;
            if (g2 == g3) {
                int i = this.d;
                Intrinsics.checkNotNull(g3);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.a.p(this.f + 1)) {
            return -1L;
        }
        if (this.c == null && (g = c1190e.a) != null) {
            this.c = g;
            Intrinsics.checkNotNull(g);
            this.d = g.b;
        }
        long min = Math.min(j, c1190e.b - this.f);
        this.b.s(this.f, sink, min);
        this.f += min;
        return min;
    }

    @Override // okio.K
    public final L timeout() {
        return this.a.timeout();
    }
}

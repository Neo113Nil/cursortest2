package okio;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: okio.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1189d implements J {
    @Override // okio.J, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.J, java.io.Flushable
    public final void flush() {
    }

    @Override // okio.J
    public final L timeout() {
        return L.NONE;
    }

    @Override // okio.J
    public final void write(C1190e source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j);
    }
}

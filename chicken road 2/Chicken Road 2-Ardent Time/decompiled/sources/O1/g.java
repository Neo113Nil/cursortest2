package O1;

/* loaded from: classes.dex */
public final class g extends O1.b {

    /* renamed from: d, reason: collision with root package name */
    public boolean f1183d;

    @Override // O1.b, V1.w
    public final long c(V1.g sink, long j2) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (this.f1169b) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (this.f1183d) {
            return -1L;
        }
        long c2 = super.c(sink, 8192L);
        if (c2 != -1) {
            return c2;
        }
        this.f1183d = true;
        a();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1169b) {
            return;
        }
        if (!this.f1183d) {
            a();
        }
        this.f1169b = true;
    }
}

package n1;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: e, reason: collision with root package name */
    public boolean f6191e;

    @Override // n1.a, s1.s
    public final long c(s1.e eVar, long j2) {
        if (this.f6176b) {
            throw new IllegalStateException("closed");
        }
        if (this.f6191e) {
            return -1L;
        }
        long c2 = super.c(eVar, 8192L);
        if (c2 != -1) {
            return c2;
        }
        this.f6191e = true;
        a(true, null);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6176b) {
            return;
        }
        if (!this.f6191e) {
            a(false, null);
        }
        this.f6176b = true;
    }
}

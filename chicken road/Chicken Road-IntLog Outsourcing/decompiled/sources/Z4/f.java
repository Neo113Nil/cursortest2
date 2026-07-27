package Z4;

import T4.o;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: e, reason: collision with root package name */
    public boolean f3807e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3794c) {
            return;
        }
        if (!this.f3807e) {
            a(g.f3808f);
        }
        this.f3794c = true;
    }

    @Override // Z4.a, j5.w
    public final long s(j5.f sink, long j2) {
        i.e(sink, "sink");
        if (this.f3794c) {
            throw new IllegalStateException("closed");
        }
        if (this.f3807e) {
            return -1L;
        }
        long s2 = super.s(sink, 8192L);
        if (s2 != -1) {
            return s2;
        }
        this.f3807e = true;
        a(o.f2913b);
        return -1L;
    }
}

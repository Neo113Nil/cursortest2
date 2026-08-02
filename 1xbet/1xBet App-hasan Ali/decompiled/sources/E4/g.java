package E4;

import L4.C0226i;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: n, reason: collision with root package name */
    public boolean f1502n;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1488l) {
            return;
        }
        if (!this.f1502n) {
            b();
        }
        this.f1488l = true;
    }

    @Override // E4.b, L4.I
    public final long e(C0226i c0226i, long j5) {
        l.f("sink", c0226i);
        if (j5 < 0) {
            throw new IllegalArgumentException(AbstractC2107A.r("byteCount < 0: ", j5).toString());
        }
        if (this.f1488l) {
            throw new IllegalStateException("closed");
        }
        if (this.f1502n) {
            return -1L;
        }
        long e3 = super.e(c0226i, j5);
        if (e3 != -1) {
            return e3;
        }
        this.f1502n = true;
        b();
        return -1L;
    }
}

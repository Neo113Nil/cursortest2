package m1;

import s1.r;
import s1.u;

/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final r f6128a;

    public a(r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f6128a = rVar;
    }

    @Override // s1.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6128a.close();
    }

    @Override // s1.r
    public final u d() {
        return this.f6128a.d();
    }

    @Override // s1.r
    public final void e(s1.e eVar, long j2) {
        this.f6128a.e(eVar, j2);
    }

    @Override // s1.r, java.io.Flushable
    public final void flush() {
        this.f6128a.flush();
    }

    public final String toString() {
        return a.class.getSimpleName() + "(" + this.f6128a.toString() + ")";
    }
}

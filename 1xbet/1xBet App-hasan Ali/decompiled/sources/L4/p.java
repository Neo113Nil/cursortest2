package L4;

/* loaded from: classes.dex */
public abstract class p implements G, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final G f3107k;

    public p(G g5) {
        kotlin.jvm.internal.l.f("delegate", g5);
        this.f3107k = g5;
    }

    @Override // L4.G
    public void D(C0226i c0226i, long j5) {
        kotlin.jvm.internal.l.f("source", c0226i);
        this.f3107k.D(c0226i, j5);
    }

    @Override // L4.G
    public final K c() {
        return this.f3107k.c();
    }

    @Override // L4.G, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3107k.close();
    }

    @Override // L4.G, java.io.Flushable
    public void flush() {
        this.f3107k.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f3107k + ')';
    }
}

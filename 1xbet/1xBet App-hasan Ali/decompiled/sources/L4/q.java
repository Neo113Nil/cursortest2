package L4;

/* loaded from: classes.dex */
public abstract class q implements I, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final I f3108k;

    public q(I i) {
        kotlin.jvm.internal.l.f("delegate", i);
        this.f3108k = i;
    }

    @Override // L4.I
    public final K c() {
        return this.f3108k.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3108k.close();
    }

    @Override // L4.I
    public long e(C0226i c0226i, long j5) {
        kotlin.jvm.internal.l.f("sink", c0226i);
        return this.f3108k.e(c0226i, j5);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f3108k + ')';
    }
}

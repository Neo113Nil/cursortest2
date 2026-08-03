package V1;

/* loaded from: classes.dex */
public class y {

    /* renamed from: d, reason: collision with root package name */
    public static final V1.x f1800d = new V1.x();

    /* renamed from: a, reason: collision with root package name */
    public boolean f1801a;

    /* renamed from: b, reason: collision with root package name */
    public long f1802b;

    /* renamed from: c, reason: collision with root package name */
    public long f1803c;

    public V1.y a() {
        this.f1801a = false;
        return this;
    }

    public V1.y b() {
        this.f1803c = 0L;
        return this;
    }

    public long c() {
        if (this.f1801a) {
            return this.f1802b;
        }
        throw new java.lang.IllegalStateException("No deadline");
    }

    public V1.y d(long j2) {
        this.f1801a = true;
        this.f1802b = j2;
        return this;
    }

    public boolean e() {
        return this.f1801a;
    }

    public void f() {
        if (java.lang.Thread.currentThread().isInterrupted()) {
            throw new java.io.InterruptedIOException("interrupted");
        }
        if (this.f1801a && this.f1802b - java.lang.System.nanoTime() <= 0) {
            throw new java.io.InterruptedIOException("deadline reached");
        }
    }

    public V1.y g(long j2, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.i.e(unit, "unit");
        if (j2 >= 0) {
            this.f1803c = unit.toNanos(j2);
            return this;
        }
        throw new java.lang.IllegalArgumentException(("timeout < 0: " + j2).toString());
    }
}

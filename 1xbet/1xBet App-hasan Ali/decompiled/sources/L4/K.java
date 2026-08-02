package L4;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public class K {

    /* renamed from: d, reason: collision with root package name */
    public static final J f3065d = new J();

    /* renamed from: a, reason: collision with root package name */
    public boolean f3066a;

    /* renamed from: b, reason: collision with root package name */
    public long f3067b;

    /* renamed from: c, reason: collision with root package name */
    public long f3068c;

    public K a() {
        this.f3066a = false;
        return this;
    }

    public K b() {
        this.f3068c = 0L;
        return this;
    }

    public long c() {
        if (this.f3066a) {
            return this.f3067b;
        }
        throw new IllegalStateException("No deadline");
    }

    public K d(long j5) {
        this.f3066a = true;
        this.f3067b = j5;
        return this;
    }

    public boolean e() {
        return this.f3066a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f3066a && this.f3067b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public K g(long j5) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.l.f("unit", timeUnit);
        if (j5 < 0) {
            throw new IllegalArgumentException(AbstractC2107A.r("timeout < 0: ", j5).toString());
        }
        this.f3068c = timeUnit.toNanos(j5);
        return this;
    }
}

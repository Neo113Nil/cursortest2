package s1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class u {

    /* renamed from: d, reason: collision with root package name */
    public static final t f6653d = new t();

    /* renamed from: a, reason: collision with root package name */
    public boolean f6654a;

    /* renamed from: b, reason: collision with root package name */
    public long f6655b;

    /* renamed from: c, reason: collision with root package name */
    public long f6656c;

    public u a() {
        this.f6654a = false;
        return this;
    }

    public u b() {
        this.f6656c = 0L;
        return this;
    }

    public long c() {
        if (this.f6654a) {
            return this.f6655b;
        }
        throw new IllegalStateException("No deadline");
    }

    public u d(long j2) {
        this.f6654a = true;
        this.f6655b = j2;
        return this;
    }

    public boolean e() {
        return this.f6654a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f6654a && this.f6655b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public u g(long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j2);
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f6656c = timeUnit.toNanos(j2);
        return this;
    }
}

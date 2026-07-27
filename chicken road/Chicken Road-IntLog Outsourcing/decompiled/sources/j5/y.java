package j5;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class y {

    /* renamed from: d, reason: collision with root package name */
    public static final x f10533d = new x();

    /* renamed from: a, reason: collision with root package name */
    public boolean f10534a;

    /* renamed from: b, reason: collision with root package name */
    public long f10535b;

    /* renamed from: c, reason: collision with root package name */
    public long f10536c;

    public y a() {
        this.f10534a = false;
        return this;
    }

    public y b() {
        this.f10536c = 0L;
        return this;
    }

    public long c() {
        if (this.f10534a) {
            return this.f10535b;
        }
        throw new IllegalStateException("No deadline");
    }

    public y d(long j2) {
        this.f10534a = true;
        this.f10535b = j2;
        return this;
    }

    public boolean e() {
        return this.f10534a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f10534a && this.f10535b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public y g(long j2, TimeUnit unit) {
        kotlin.jvm.internal.i.e(unit, "unit");
        if (j2 >= 0) {
            this.f10536c = unit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }
}

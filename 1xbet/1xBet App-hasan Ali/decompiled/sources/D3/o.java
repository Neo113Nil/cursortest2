package D3;

import java.util.concurrent.CancellationException;
import m3.v;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f966a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final l f967b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public boolean f968c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f969d;

    /* renamed from: e, reason: collision with root package name */
    public Object f970e;
    public Exception f;

    public final Exception a() {
        Exception exc;
        synchronized (this.f966a) {
            exc = this.f;
        }
        return exc;
    }

    public final Object b() {
        Object obj;
        synchronized (this.f966a) {
            try {
                if (!this.f968c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.f969d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new e(exc);
                }
                obj = this.f970e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean c() {
        boolean z3;
        synchronized (this.f966a) {
            z3 = this.f968c;
        }
        return z3;
    }

    public final boolean d() {
        boolean z3;
        synchronized (this.f966a) {
            try {
                z3 = false;
                if (this.f968c && !this.f969d && this.f == null) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
    }

    public final void e(Exception exc) {
        v.f("Exception must not be null", exc);
        synchronized (this.f966a) {
            h();
            this.f968c = true;
            this.f = exc;
        }
        this.f967b.g(this);
    }

    public final void f(Object obj) {
        synchronized (this.f966a) {
            h();
            this.f968c = true;
            this.f970e = obj;
        }
        this.f967b.g(this);
    }

    public final void g() {
        synchronized (this.f966a) {
            try {
                if (this.f968c) {
                    return;
                }
                this.f968c = true;
                this.f969d = true;
                this.f967b.g(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        if (this.f968c) {
            int i = b.f945k;
            if (!c()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception a5 = a();
        }
    }

    public final void i() {
        synchronized (this.f966a) {
            try {
                if (this.f968c) {
                    this.f967b.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

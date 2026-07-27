package i1;

import S0.r;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* renamed from: i1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341k extends Task {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5022a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final V.f f5023b = new V.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f5024c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f5025d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5026e;
    public Exception f;

    @Override // com.google.android.gms.tasks.Task
    public final Exception a() {
        Exception exc;
        synchronized (this.f5022a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object b() {
        Object obj;
        synchronized (this.f5022a) {
            try {
                if (!this.f5024c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.f5025d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new C0334d(exc);
                }
                obj = this.f5026e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean c() {
        boolean z3;
        synchronized (this.f5022a) {
            try {
                z3 = false;
                if (this.f5024c && !this.f5025d && this.f == null) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
    }

    public final void d(Exception exc) {
        r.d(exc, "Exception must not be null");
        synchronized (this.f5022a) {
            f();
            this.f5024c = true;
            this.f = exc;
        }
        this.f5023b.e(this);
    }

    public final void e(Object obj) {
        synchronized (this.f5022a) {
            f();
            this.f5024c = true;
            this.f5026e = obj;
        }
        this.f5023b.e(this);
    }

    public final void f() {
        boolean z3;
        if (this.f5024c) {
            int i3 = C0331a.f5010a;
            synchronized (this.f5022a) {
                z3 = this.f5024c;
            }
            if (!z3) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception a3 = a();
        }
    }

    public final void g() {
        synchronized (this.f5022a) {
            try {
                if (this.f5024c) {
                    this.f5023b.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

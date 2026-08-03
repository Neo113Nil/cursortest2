package D0;

/* loaded from: classes.dex */
public final class m extends com.google.android.gms.tasks.Task {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f213a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public final D0.j f214b = new D0.j();

    /* renamed from: c, reason: collision with root package name */
    public boolean f215c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f216d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f217e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Exception f218f;

    @Override // com.google.android.gms.tasks.Task
    public final D0.m a(java.util.concurrent.Executor executor, D0.b bVar) {
        this.f214b.c(new D0.g(executor, bVar));
        h();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final java.lang.Exception b() {
        java.lang.Exception exc;
        synchronized (this.f213a) {
            exc = this.f218f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final java.lang.Object c() {
        java.lang.Object obj;
        synchronized (this.f213a) {
            try {
                if (!this.f215c) {
                    throw new java.lang.IllegalStateException("Task is not yet complete");
                }
                if (this.f216d) {
                    throw new java.util.concurrent.CancellationException("Task is already canceled.");
                }
                java.lang.Exception exc = this.f218f;
                if (exc != null) {
                    throw new D0.c(exc);
                }
                obj = this.f217e;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean d() {
        boolean z2;
        synchronized (this.f213a) {
            try {
                z2 = false;
                if (this.f215c && !this.f216d && this.f218f == null) {
                    z2 = true;
                }
            } finally {
            }
        }
        return z2;
    }

    public final void e(java.lang.Exception exc) {
        p0.AbstractC0966r.d(exc, "Exception must not be null");
        synchronized (this.f213a) {
            g();
            this.f215c = true;
            this.f218f = exc;
        }
        this.f214b.d(this);
    }

    public final void f(java.lang.Object obj) {
        synchronized (this.f213a) {
            g();
            this.f215c = true;
            this.f217e = obj;
        }
        this.f214b.d(this);
    }

    public final void g() {
        boolean z2;
        if (this.f215c) {
            int i2 = B1.m.f48a;
            synchronized (this.f213a) {
                z2 = this.f215c;
            }
            if (!z2) {
                throw new java.lang.IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            java.lang.Exception b2 = b();
        }
    }

    public final void h() {
        synchronized (this.f213a) {
            try {
                if (this.f215c) {
                    this.f214b.d(this);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}

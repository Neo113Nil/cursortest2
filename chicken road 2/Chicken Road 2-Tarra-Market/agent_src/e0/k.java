package e0;

import Q.s;
import com.google.android.gms.tasks.Task;
import d1.m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k extends Task {

    /* renamed from: a, reason: collision with root package name */
    public final Object f968a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final i f969b = new i();

    /* renamed from: c, reason: collision with root package name */
    public boolean f970c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f971d;

    /* renamed from: e, reason: collision with root package name */
    public Object f972e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f973f;

    @Override // com.google.android.gms.tasks.Task
    public final k a(Executor executor, InterfaceC0060b interfaceC0060b) {
        this.f969b.c(new f(executor, interfaceC0060b));
        h();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception b() {
        Exception exc;
        synchronized (this.f968a) {
            exc = this.f973f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object c() {
        Object obj;
        synchronized (this.f968a) {
            try {
                if (!this.f970c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.f971d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f973f;
                if (exc != null) {
                    throw new c(exc);
                }
                obj = this.f972e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean d() {
        boolean z2;
        synchronized (this.f968a) {
            try {
                z2 = false;
                if (this.f970c && !this.f971d && this.f973f == null) {
                    z2 = true;
                }
            } finally {
            }
        }
        return z2;
    }

    public final void e(Exception exc) {
        s.d(exc, "Exception must not be null");
        synchronized (this.f968a) {
            g();
            this.f970c = true;
            this.f973f = exc;
        }
        this.f969b.d(this);
    }

    public final void f(Object obj) {
        synchronized (this.f968a) {
            g();
            this.f970c = true;
            this.f972e = obj;
        }
        this.f969b.d(this);
    }

    public final void g() {
        boolean z2;
        if (this.f970c) {
            int i2 = m.f942a;
            synchronized (this.f968a) {
                z2 = this.f970c;
            }
            if (!z2) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception b2 = b();
        }
    }

    public final void h() {
        synchronized (this.f968a) {
            try {
                if (this.f970c) {
                    this.f969b.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

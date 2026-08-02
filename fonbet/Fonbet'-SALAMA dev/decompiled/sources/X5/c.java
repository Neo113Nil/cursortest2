package X5;

import C0.RunnableC0085d;
import W5.W1;
import e6.AbstractC1053b;
import java.io.IOException;
import java.net.Socket;

/* loaded from: classes2.dex */
public final class c implements N6.m {

    /* renamed from: A, reason: collision with root package name */
    public Socket f7483A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f7484B;

    /* renamed from: C, reason: collision with root package name */
    public int f7485C;

    /* renamed from: D, reason: collision with root package name */
    public int f7486D;

    /* renamed from: c, reason: collision with root package name */
    public final W1 f7489c;

    /* renamed from: d, reason: collision with root package name */
    public final m f7490d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7491e;

    /* renamed from: z, reason: collision with root package name */
    public N6.b f7495z;

    /* renamed from: a, reason: collision with root package name */
    public final Object f7487a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final N6.d f7488b = new N6.d();

    /* renamed from: f, reason: collision with root package name */
    public boolean f7492f = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7493x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7494y = false;

    public c(W1 w12, m mVar) {
        p3.f.k(w12, "executor");
        this.f7489c = w12;
        this.f7490d = mVar;
        this.f7491e = 10000;
    }

    public final void a(N6.b bVar, Socket socket) {
        p3.f.q("AsyncSink's becomeConnected should only be called once.", this.f7495z == null);
        this.f7495z = bVar;
        this.f7483A = socket;
    }

    @Override // N6.m, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7494y) {
            return;
        }
        this.f7494y = true;
        this.f7489c.execute(new RunnableC0085d(this, 25));
    }

    @Override // N6.m, java.io.Flushable
    public final void flush() {
        if (this.f7494y) {
            throw new IOException("closed");
        }
        AbstractC1053b.c();
        try {
            synchronized (this.f7487a) {
                if (this.f7493x) {
                    AbstractC1053b.f12736a.getClass();
                    return;
                }
                this.f7493x = true;
                this.f7489c.execute(new a(this, 1));
                AbstractC1053b.f12736a.getClass();
            }
        } catch (Throwable th) {
            try {
                AbstractC1053b.f12736a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // N6.m
    public final void m(N6.d dVar, long j) {
        if (this.f7494y) {
            throw new IOException("closed");
        }
        AbstractC1053b.c();
        try {
            synchronized (this.f7487a) {
                try {
                    this.f7488b.m(dVar, j);
                    int i7 = this.f7486D + this.f7485C;
                    this.f7486D = i7;
                    boolean z4 = false;
                    this.f7485C = 0;
                    if (this.f7484B || i7 <= this.f7491e) {
                        if (!this.f7492f && !this.f7493x && this.f7488b.a() > 0) {
                            this.f7492f = true;
                        }
                        AbstractC1053b.f12736a.getClass();
                        return;
                    }
                    this.f7484B = true;
                    z4 = true;
                    if (!z4) {
                        this.f7489c.execute(new a(this, 0));
                        AbstractC1053b.f12736a.getClass();
                    } else {
                        try {
                            this.f7483A.close();
                        } catch (IOException e7) {
                            this.f7490d.p(e7);
                        }
                        AbstractC1053b.f12736a.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                AbstractC1053b.f12736a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}

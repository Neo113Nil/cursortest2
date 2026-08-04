package X5;

import C0.RunnableC0085d;
import W5.W1;
import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements N6.m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Socket f7483A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f7484B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f7485C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f7486D;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W1 f7489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f7490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7491e;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public N6.b f7495z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7487a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N6.d f7488b = new N6.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7492f = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7493x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7494y = false;

    public c(W1 w7, m mVar) {
        p113p3.f.k(w7, "executor");
        this.f7489c = w7;
        this.f7490d = mVar;
        this.f7491e = 10000;
    }

    public final void a(N6.b bVar, Socket socket) {
        p113p3.f.q("AsyncSink's becomeConnected should only be called once.", this.f7495z == null);
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
    public final void flush() throws IOException {
        if (this.f7494y) {
            throw new IOException("closed");
        }
        p036e6.b.c();
        try {
            synchronized (this.f7487a) {
                if (this.f7493x) {
                    p036e6.b.f12742a.getClass();
                    return;
                }
                this.f7493x = true;
                this.f7489c.execute(new a(this, 1));
                p036e6.b.f12742a.getClass();
            }
        } catch (Throwable th) {
            try {
                p036e6.b.f12742a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // N6.m
    public final void m(N6.d dVar, long j) throws IOException {
        if (this.f7494y) {
            throw new IOException("closed");
        }
        p036e6.b.c();
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
                        p036e6.b.f12742a.getClass();
                        return;
                    }
                    this.f7484B = true;
                    z4 = true;
                    if (!z4) {
                        this.f7489c.execute(new a(this, 0));
                        p036e6.b.f12742a.getClass();
                    } else {
                        try {
                            this.f7483A.close();
                        } catch (IOException e7) {
                            this.f7490d.p(e7);
                        }
                        p036e6.b.f12742a.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                p036e6.b.f12742a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}

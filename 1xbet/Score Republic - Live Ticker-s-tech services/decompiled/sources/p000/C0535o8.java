package p000;

import java.io.IOException;
import java.net.Socket;

/* JADX INFO: renamed from: o8 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0535o8 implements o81 {

    /* JADX INFO: renamed from: l */
    public final a71 f5651l;

    /* JADX INFO: renamed from: m */
    public final ot0 f5652m;

    /* JADX INFO: renamed from: n */
    public final int f5653n;

    /* JADX INFO: renamed from: r */
    public C0572p8 f5657r;

    /* JADX INFO: renamed from: s */
    public Socket f5658s;

    /* JADX INFO: renamed from: t */
    public boolean f5659t;

    /* JADX INFO: renamed from: u */
    public int f5660u;

    /* JADX INFO: renamed from: v */
    public int f5661v;

    /* JADX INFO: renamed from: j */
    public final Object f5649j = new Object();

    /* JADX INFO: renamed from: k */
    public final C0539oc f5650k = new C0539oc();

    /* JADX INFO: renamed from: o */
    public boolean f5654o = false;

    /* JADX INFO: renamed from: p */
    public boolean f5655p = false;

    /* JADX INFO: renamed from: q */
    public boolean f5656q = false;

    public C0535o8(a71 a71Var, ot0 ot0Var) {
        a90.m127k(a71Var, "executor");
        this.f5651l = a71Var;
        this.f5652m = ot0Var;
        this.f5653n = 10000;
    }

    /* JADX INFO: renamed from: a */
    public final void m3639a(C0572p8 c0572p8, Socket socket) {
        a90.m132p("AsyncSink's becomeConnected should only be called once.", this.f5657r == null);
        this.f5657r = c0572p8;
        this.f5658s = socket;
    }

    @Override // p000.o81, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f5656q) {
            return;
        }
        this.f5656q = true;
        this.f5651l.execute(new RunnableC0897y0(2, this));
    }

    @Override // p000.o81
    /* JADX INFO: renamed from: f */
    public final void mo1553f(C0539oc c0539oc, long j) throws IOException {
        if (this.f5656q) {
            C0270h1.m2187c("closed");
            return;
        }
        nv0.m3597c();
        try {
            synchronized (this.f5649j) {
                try {
                    this.f5650k.mo1553f(c0539oc, j);
                    int i = this.f5661v + this.f5660u;
                    this.f5661v = i;
                    this.f5660u = 0;
                    boolean z = true;
                    if (this.f5659t || i <= this.f5653n) {
                        if (!this.f5654o && !this.f5655p && this.f5650k.m3668a() > 0) {
                            this.f5654o = true;
                            z = false;
                        }
                        nv0.f5555a.getClass();
                        return;
                    }
                    this.f5659t = true;
                    if (!z) {
                        this.f5651l.execute(new C0424l8(this, 0));
                        nv0.f5555a.getClass();
                    } else {
                        try {
                            this.f5658s.close();
                        } catch (IOException e) {
                            this.f5652m.m3780n(e);
                        }
                        nv0.f5555a.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                nv0.f5555a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // p000.o81, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f5656q) {
            C0270h1.m2187c("closed");
            return;
        }
        nv0.m3597c();
        try {
            synchronized (this.f5649j) {
                if (this.f5655p) {
                    nv0.f5555a.getClass();
                    return;
                }
                this.f5655p = true;
                this.f5651l.execute(new C0424l8(this, 1));
                nv0.f5555a.getClass();
            }
        } catch (Throwable th) {
            try {
                nv0.f5555a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

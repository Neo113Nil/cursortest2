package o1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public long f6360a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f6361b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6362c;

    /* renamed from: d, reason: collision with root package name */
    public final r f6363d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f6364e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6365f;

    /* renamed from: g, reason: collision with root package name */
    public final v f6366g;

    /* renamed from: h, reason: collision with root package name */
    public final u f6367h;

    /* renamed from: i, reason: collision with root package name */
    public final i1.t f6368i;

    /* renamed from: j, reason: collision with root package name */
    public final i1.t f6369j;

    /* renamed from: k, reason: collision with root package name */
    public int f6370k;

    public w(int i2, r rVar, boolean z2, boolean z3, i1.m mVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f6364e = arrayDeque;
        int i3 = 1;
        this.f6368i = new i1.t(i3, this);
        this.f6369j = new i1.t(i3, this);
        this.f6370k = 0;
        if (rVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f6362c = i2;
        this.f6363d = rVar;
        this.f6361b = rVar.f6333o.a();
        v vVar = new v(this, rVar.f6332n.a());
        this.f6366g = vVar;
        u uVar = new u(this);
        this.f6367h = uVar;
        vVar.f6358e = z3;
        uVar.f6352c = z2;
        if (mVar != null) {
            arrayDeque.add(mVar);
        }
        if (f() && mVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!f() && mVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public final void a() {
        boolean z2;
        boolean g2;
        synchronized (this) {
            try {
                v vVar = this.f6366g;
                if (!vVar.f6358e && vVar.f6357d) {
                    u uVar = this.f6367h;
                    if (!uVar.f6352c) {
                        if (uVar.f6351b) {
                        }
                    }
                    z2 = true;
                    g2 = g();
                }
                z2 = false;
                g2 = g();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            c(6);
        } else {
            if (g2) {
                return;
            }
            this.f6363d.k(this.f6362c);
        }
    }

    public final void b() {
        u uVar = this.f6367h;
        if (uVar.f6351b) {
            throw new IOException("stream closed");
        }
        if (uVar.f6352c) {
            throw new IOException("stream finished");
        }
        if (this.f6370k != 0) {
            throw new A(this.f6370k);
        }
    }

    public final void c(int i2) {
        if (d(i2)) {
            this.f6363d.f6336r.l(this.f6362c, i2);
        }
    }

    public final boolean d(int i2) {
        synchronized (this) {
            try {
                if (this.f6370k != 0) {
                    return false;
                }
                if (this.f6366g.f6358e && this.f6367h.f6352c) {
                    return false;
                }
                this.f6370k = i2;
                notifyAll();
                this.f6363d.k(this.f6362c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final u e() {
        synchronized (this) {
            try {
                if (!this.f6365f && !f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f6367h;
    }

    public final boolean f() {
        return this.f6363d.f6319a == ((this.f6362c & 1) == 1);
    }

    public final synchronized boolean g() {
        try {
            if (this.f6370k != 0) {
                return false;
            }
            v vVar = this.f6366g;
            if (!vVar.f6358e) {
                if (vVar.f6357d) {
                }
                return true;
            }
            u uVar = this.f6367h;
            if (uVar.f6352c || uVar.f6351b) {
                if (this.f6365f) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void h() {
        boolean g2;
        synchronized (this) {
            this.f6366g.f6358e = true;
            g2 = g();
            notifyAll();
        }
        if (g2) {
            return;
        }
        this.f6363d.k(this.f6362c);
    }

    public final void i() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}

package F4;

import a3.AbstractC0467k;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f1663a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1664b;

    /* renamed from: c, reason: collision with root package name */
    public long f1665c;

    /* renamed from: d, reason: collision with root package name */
    public long f1666d;

    /* renamed from: e, reason: collision with root package name */
    public long f1667e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f1668g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1669h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final t f1670j;

    /* renamed from: k, reason: collision with root package name */
    public final v f1671k;

    /* renamed from: l, reason: collision with root package name */
    public final v f1672l;

    /* renamed from: m, reason: collision with root package name */
    public int f1673m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f1674n;

    public w(int i, o oVar, boolean z3, boolean z5, y4.m mVar) {
        kotlin.jvm.internal.l.f("connection", oVar);
        this.f1663a = i;
        this.f1664b = oVar;
        this.f = oVar.f1610A.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f1668g = arrayDeque;
        this.i = new u(this, oVar.f1634z.a(), z5);
        this.f1670j = new t(this, z3);
        this.f1671k = new v(this);
        this.f1672l = new v(this);
        if (mVar == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(mVar);
        }
    }

    public final void a() {
        boolean z3;
        boolean i;
        byte[] bArr = z4.b.f21979a;
        synchronized (this) {
            try {
                u uVar = this.i;
                if (!uVar.f1657l && uVar.f1660o) {
                    t tVar = this.f1670j;
                    if (tVar.f1652k || tVar.f1654m) {
                        z3 = true;
                        i = i();
                    }
                }
                z3 = false;
                i = i();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            c(9, null);
        } else {
            if (i) {
                return;
            }
            this.f1664b.h(this.f1663a);
        }
    }

    public final void b() {
        t tVar = this.f1670j;
        if (tVar.f1654m) {
            throw new IOException("stream closed");
        }
        if (tVar.f1652k) {
            throw new IOException("stream finished");
        }
        if (this.f1673m != 0) {
            IOException iOException = this.f1674n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f1673m;
            AbstractC0467k.x(i);
            throw new C(i);
        }
    }

    public final void c(int i, IOException iOException) {
        AbstractC0467k.A("rstStatusCode", i);
        if (d(i, iOException)) {
            o oVar = this.f1664b;
            oVar.getClass();
            AbstractC0467k.A("statusCode", i);
            oVar.f1616G.l(this.f1663a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = z4.b.f21979a;
        synchronized (this) {
            if (this.f1673m != 0) {
                return false;
            }
            this.f1673m = i;
            this.f1674n = iOException;
            notifyAll();
            if (this.i.f1657l) {
                if (this.f1670j.f1652k) {
                    return false;
                }
            }
            this.f1664b.h(this.f1663a);
            return true;
        }
    }

    public final void e(int i) {
        AbstractC0467k.A("errorCode", i);
        if (d(i, null)) {
            this.f1664b.m(this.f1663a, i);
        }
    }

    public final synchronized int f() {
        return this.f1673m;
    }

    public final t g() {
        synchronized (this) {
            if (!this.f1669h && !h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f1670j;
    }

    public final boolean h() {
        boolean z3 = (this.f1663a & 1) == 1;
        this.f1664b.getClass();
        return true == z3;
    }

    public final synchronized boolean i() {
        if (this.f1673m != 0) {
            return false;
        }
        u uVar = this.i;
        if (uVar.f1657l || uVar.f1660o) {
            t tVar = this.f1670j;
            if (tVar.f1652k || tVar.f1654m) {
                if (this.f1669h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(y4.m mVar, boolean z3) {
        boolean i;
        kotlin.jvm.internal.l.f("headers", mVar);
        byte[] bArr = z4.b.f21979a;
        synchronized (this) {
            try {
                if (this.f1669h && z3) {
                    this.i.getClass();
                    if (z3) {
                        this.i.f1657l = true;
                    }
                    i = i();
                    notifyAll();
                }
                this.f1669h = true;
                this.f1668g.add(mVar);
                if (z3) {
                }
                i = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i) {
            return;
        }
        this.f1664b.h(this.f1663a);
    }

    public final synchronized void k(int i) {
        AbstractC0467k.A("errorCode", i);
        if (this.f1673m == 0) {
            this.f1673m = i;
            notifyAll();
        }
    }

    public final void l() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}

package F4;

import L4.C0226i;
import a3.AbstractC0467k;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class o implements Closeable, AutoCloseable {
    public static final B J;

    /* renamed from: A, reason: collision with root package name */
    public B f1610A;

    /* renamed from: B, reason: collision with root package name */
    public long f1611B;

    /* renamed from: C, reason: collision with root package name */
    public long f1612C;

    /* renamed from: D, reason: collision with root package name */
    public long f1613D;

    /* renamed from: E, reason: collision with root package name */
    public long f1614E;

    /* renamed from: F, reason: collision with root package name */
    public final Socket f1615F;

    /* renamed from: G, reason: collision with root package name */
    public final x f1616G;

    /* renamed from: H, reason: collision with root package name */
    public final k f1617H;

    /* renamed from: I, reason: collision with root package name */
    public final LinkedHashSet f1618I;

    /* renamed from: k, reason: collision with root package name */
    public final h f1619k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f1620l = new LinkedHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final String f1621m;

    /* renamed from: n, reason: collision with root package name */
    public int f1622n;

    /* renamed from: o, reason: collision with root package name */
    public int f1623o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1624p;

    /* renamed from: q, reason: collision with root package name */
    public final B4.d f1625q;

    /* renamed from: r, reason: collision with root package name */
    public final B4.c f1626r;

    /* renamed from: s, reason: collision with root package name */
    public final B4.c f1627s;

    /* renamed from: t, reason: collision with root package name */
    public final B4.c f1628t;

    /* renamed from: u, reason: collision with root package name */
    public final A f1629u;

    /* renamed from: v, reason: collision with root package name */
    public long f1630v;

    /* renamed from: w, reason: collision with root package name */
    public long f1631w;

    /* renamed from: x, reason: collision with root package name */
    public long f1632x;

    /* renamed from: y, reason: collision with root package name */
    public long f1633y;

    /* renamed from: z, reason: collision with root package name */
    public final B f1634z;

    static {
        B b3 = new B();
        b3.c(7, 65535);
        b3.c(5, 16384);
        J = b3;
    }

    public o(C0.c cVar) {
        this.f1619k = (h) cVar.f815g;
        String str = (String) cVar.f813d;
        if (str == null) {
            kotlin.jvm.internal.l.k("connectionName");
            throw null;
        }
        this.f1621m = str;
        this.f1623o = 3;
        B4.d dVar = (B4.d) cVar.f811b;
        this.f1625q = dVar;
        this.f1626r = dVar.e();
        this.f1627s = dVar.e();
        this.f1628t = dVar.e();
        this.f1629u = A.f1564a;
        B b3 = new B();
        b3.c(7, 16777216);
        this.f1634z = b3;
        this.f1610A = J;
        this.f1614E = r0.a();
        Socket socket = (Socket) cVar.f812c;
        if (socket == null) {
            kotlin.jvm.internal.l.k("socket");
            throw null;
        }
        this.f1615F = socket;
        L4.B b5 = (L4.B) cVar.f;
        if (b5 == null) {
            kotlin.jvm.internal.l.k("sink");
            throw null;
        }
        this.f1616G = new x(b5);
        L4.C c5 = (L4.C) cVar.f814e;
        if (c5 == null) {
            kotlin.jvm.internal.l.k("source");
            throw null;
        }
        this.f1617H = new k(this, new s(c5));
        this.f1618I = new LinkedHashSet();
    }

    public final void b(int i, int i5, IOException iOException) {
        int i6;
        Object[] objArr;
        AbstractC0467k.A("connectionCode", i);
        AbstractC0467k.A("streamCode", i5);
        byte[] bArr = z4.b.f21979a;
        try {
            i(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f1620l.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f1620l.values().toArray(new w[0]);
                this.f1620l.clear();
            }
        }
        w[] wVarArr = (w[]) objArr;
        if (wVarArr != null) {
            for (w wVar : wVarArr) {
                try {
                    wVar.c(i5, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f1616G.close();
        } catch (IOException unused3) {
        }
        try {
            this.f1615F.close();
        } catch (IOException unused4) {
        }
        this.f1626r.e();
        this.f1627s.e();
        this.f1628t.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(1, 9, null);
    }

    public final synchronized w d(int i) {
        return (w) this.f1620l.get(Integer.valueOf(i));
    }

    public final synchronized boolean f(long j5) {
        if (this.f1624p) {
            return false;
        }
        if (this.f1632x < this.f1631w) {
            if (j5 >= this.f1633y) {
                return false;
            }
        }
        return true;
    }

    public final void flush() {
        this.f1616G.flush();
    }

    public final synchronized w h(int i) {
        w wVar;
        wVar = (w) this.f1620l.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void i(int i) {
        AbstractC0467k.A("statusCode", i);
        synchronized (this.f1616G) {
            synchronized (this) {
                if (this.f1624p) {
                    return;
                }
                this.f1624p = true;
                this.f1616G.h(z4.b.f21979a, this.f1622n, i);
            }
        }
    }

    public final synchronized void k(long j5) {
        long j6 = this.f1611B + j5;
        this.f1611B = j6;
        long j7 = j6 - this.f1612C;
        if (j7 >= this.f1634z.a() / 2) {
            n(0, j7);
            this.f1612C += j7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f1616G.f1678m);
        r6 = r2;
        r8.f1613D += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, boolean z3, C0226i c0226i, long j5) {
        int min;
        long j6;
        if (j5 == 0) {
            this.f1616G.d(z3, i, c0226i, 0);
            return;
        }
        while (j5 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j7 = this.f1613D;
                            long j8 = this.f1614E;
                            if (j7 < j8) {
                                break;
                            } else {
                                if (!this.f1620l.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j5 -= j6;
            this.f1616G.d(z3 && j5 == 0, i, c0226i, min);
        }
    }

    public final void m(int i, int i5) {
        AbstractC0467k.A("errorCode", i5);
        this.f1626r.c(new j(this.f1621m + '[' + i + "] writeSynReset", this, i, i5, 2), 0L);
    }

    public final void n(int i, long j5) {
        this.f1626r.c(new n(this.f1621m + '[' + i + "] windowUpdate", this, i, j5), 0L);
    }
}

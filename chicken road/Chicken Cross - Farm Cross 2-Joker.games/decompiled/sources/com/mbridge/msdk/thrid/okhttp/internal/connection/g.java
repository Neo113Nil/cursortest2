package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.internal.connection.f;
import com.mbridge.msdk.thrid.okhttp.internal.http2.n;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* compiled from: StreamAllocation.java */
/* loaded from: classes6.dex */
public final class g {
    static final /* synthetic */ boolean o = true;

    /* renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.a f9891a;
    private f.a b;
    private c0 c;
    private final i d;
    public final com.mbridge.msdk.thrid.okhttp.d e;
    public final o f;
    private final Object g;
    private final f h;
    private int i;
    private c j;
    private boolean k;
    private boolean l;
    private boolean m;
    private com.mbridge.msdk.thrid.okhttp.internal.http.c n;

    /* compiled from: StreamAllocation.java */
    public static final class a extends WeakReference<g> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f9892a;

        a(g gVar, Object obj) {
            super(gVar);
            this.f9892a = obj;
        }
    }

    public g(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar, Object obj) {
        this.d = iVar;
        this.f9891a = aVar;
        this.e = dVar;
        this.f = oVar;
        this.h = new f(aVar, i(), dVar, oVar);
        this.g = obj;
    }

    private Socket g() {
        if (!o && !Thread.holdsLock(this.d)) {
            throw new AssertionError();
        }
        c cVar = this.j;
        if (cVar == null || !cVar.k) {
            return null;
        }
        return a(false, false, true);
    }

    private d i() {
        return com.mbridge.msdk.thrid.okhttp.internal.a.f9879a.a(this.d);
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c a(v vVar, t.a aVar, boolean z) {
        try {
            com.mbridge.msdk.thrid.okhttp.internal.http.c a2 = a(aVar.a(), aVar.b(), aVar.c(), vVar.t(), vVar.z(), z).a(vVar, aVar, this);
            synchronized (this.d) {
                this.n = a2;
            }
            return a2;
        } catch (IOException e) {
            throw new e(e);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c b() {
        com.mbridge.msdk.thrid.okhttp.internal.http.c cVar;
        synchronized (this.d) {
            cVar = this.n;
        }
        return cVar;
    }

    public synchronized c c() {
        return this.j;
    }

    public boolean d() {
        f.a aVar;
        return this.c != null || ((aVar = this.b) != null && aVar.b()) || this.h.a();
    }

    public void e() {
        c cVar;
        Socket a2;
        synchronized (this.d) {
            cVar = this.j;
            a2 = a(true, false, false);
            if (this.j != null) {
                cVar = null;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(a2);
        if (cVar != null) {
            this.f.connectionReleased(this.e, cVar);
        }
    }

    public void f() {
        c cVar;
        Socket a2;
        synchronized (this.d) {
            cVar = this.j;
            a2 = a(false, true, false);
            if (this.j != null) {
                cVar = null;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(a2);
        if (cVar != null) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f9879a.a(this.e, (IOException) null);
            this.f.connectionReleased(this.e, cVar);
            this.f.callEnd(this.e);
        }
    }

    public c0 h() {
        return this.c;
    }

    public String toString() {
        c c = c();
        return c != null ? c.toString() : this.f9891a.toString();
    }

    public Socket b(c cVar) {
        if (!o && !Thread.holdsLock(this.d)) {
            throw new AssertionError();
        }
        if (this.n == null && this.j.n.size() == 1) {
            Reference<g> reference = this.j.n.get(0);
            Socket a2 = a(true, false, false);
            this.j = cVar;
            cVar.n.add(reference);
            return a2;
        }
        throw new IllegalStateException();
    }

    private c a(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        while (true) {
            c a2 = a(i, i2, i3, i4, z);
            synchronized (this.d) {
                if (a2.l == 0 && !a2.f()) {
                    return a2;
                }
                if (a2.a(z2)) {
                    return a2;
                }
                e();
            }
        }
    }

    private c a(int i, int i2, int i3, int i4, boolean z) throws IOException {
        c cVar;
        Socket g;
        c cVar2;
        Socket socket;
        c0 c0Var;
        boolean z2;
        boolean z3;
        f.a aVar;
        synchronized (this.d) {
            if (!this.l) {
                if (this.n == null) {
                    if (!this.m) {
                        cVar = this.j;
                        g = g();
                        cVar2 = this.j;
                        socket = null;
                        if (cVar2 != null) {
                            cVar = null;
                        } else {
                            cVar2 = null;
                        }
                        if (!this.k) {
                            cVar = null;
                        }
                        if (cVar2 == null) {
                            com.mbridge.msdk.thrid.okhttp.internal.a.f9879a.a(this.d, this.f9891a, this, null);
                            c cVar3 = this.j;
                            if (cVar3 != null) {
                                z2 = true;
                                cVar2 = cVar3;
                                c0Var = null;
                            } else {
                                c0Var = this.c;
                            }
                        } else {
                            c0Var = null;
                        }
                        z2 = false;
                    } else {
                        throw new IOException("Canceled");
                    }
                } else {
                    throw new IllegalStateException("codec != null");
                }
            } else {
                throw new IllegalStateException("released");
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(g);
        if (cVar != null) {
            this.f.connectionReleased(this.e, cVar);
        }
        if (z2) {
            this.f.connectionAcquired(this.e, cVar2);
        }
        if (cVar2 != null) {
            this.c = this.j.c();
            return cVar2;
        }
        if (c0Var != null || ((aVar = this.b) != null && aVar.b())) {
            z3 = false;
        } else {
            this.b = this.h.c();
            z3 = true;
        }
        synchronized (this.d) {
            if (this.m) {
                throw new IOException("Canceled");
            }
            if (z3) {
                List<c0> a2 = this.b.a();
                int size = a2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    c0 c0Var2 = a2.get(i5);
                    com.mbridge.msdk.thrid.okhttp.internal.a.f9879a.a(this.d, this.f9891a, this, c0Var2);
                    c cVar4 = this.j;
                    if (cVar4 != null) {
                        this.c = c0Var2;
                        z2 = true;
                        cVar2 = cVar4;
                        break;
                    }
                    i5++;
                }
            }
            if (!z2) {
                if (c0Var == null) {
                    c0Var = this.b.c();
                }
                this.c = c0Var;
                this.i = 0;
                cVar2 = new c(this.d, c0Var);
                a(cVar2, false);
            }
        }
        if (z2) {
            this.f.connectionAcquired(this.e, cVar2);
            return cVar2;
        }
        cVar2.a(i, i2, i3, i4, z, this.e, this.f);
        i().a(cVar2.c());
        synchronized (this.d) {
            this.k = true;
            com.mbridge.msdk.thrid.okhttp.internal.a.f9879a.b(this.d, cVar2);
            if (cVar2.f()) {
                socket = com.mbridge.msdk.thrid.okhttp.internal.a.f9879a.a(this.d, this.f9891a, this);
                cVar2 = this.j;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socket);
        this.f.connectionAcquired(this.e, cVar2);
        return cVar2;
    }

    public void a(boolean z, com.mbridge.msdk.thrid.okhttp.internal.http.c cVar, long j, IOException iOException) {
        c cVar2;
        Socket a2;
        boolean z2;
        this.f.responseBodyEnd(this.e, j);
        synchronized (this.d) {
            if (cVar != null) {
                if (cVar == this.n) {
                    if (!z) {
                        this.j.l++;
                    }
                    cVar2 = this.j;
                    a2 = a(z, false, true);
                    if (this.j != null) {
                        cVar2 = null;
                    }
                    z2 = this.l;
                }
            }
            throw new IllegalStateException("expected " + this.n + " but was " + cVar);
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(a2);
        if (cVar2 != null) {
            this.f.connectionReleased(this.e, cVar2);
        }
        if (iOException != null) {
            this.f.callFailed(this.e, com.mbridge.msdk.thrid.okhttp.internal.a.f9879a.a(this.e, iOException));
        } else if (z2) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f9879a.a(this.e, (IOException) null);
            this.f.callEnd(this.e);
        }
    }

    private Socket a(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (!o && !Thread.holdsLock(this.d)) {
            throw new AssertionError();
        }
        if (z3) {
            this.n = null;
        }
        if (z2) {
            this.l = true;
        }
        c cVar = this.j;
        if (cVar == null) {
            return null;
        }
        if (z) {
            cVar.k = true;
        }
        if (this.n != null) {
            return null;
        }
        if (!this.l && !cVar.k) {
            return null;
        }
        a(cVar);
        if (this.j.n.isEmpty()) {
            this.j.o = System.nanoTime();
            if (com.mbridge.msdk.thrid.okhttp.internal.a.f9879a.a(this.d, this.j)) {
                socket = this.j.g();
                this.j = null;
                return socket;
            }
        }
        socket = null;
        this.j = null;
        return socket;
    }

    public void a() {
        com.mbridge.msdk.thrid.okhttp.internal.http.c cVar;
        c cVar2;
        synchronized (this.d) {
            this.m = true;
            cVar = this.n;
            cVar2 = this.j;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.d();
        }
    }

    public void a(IOException iOException) {
        c cVar;
        boolean z;
        Socket a2;
        synchronized (this.d) {
            cVar = null;
            if (iOException instanceof n) {
                com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar = ((n) iOException).f9925a;
                if (bVar == com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM) {
                    int i = this.i + 1;
                    this.i = i;
                    if (i > 1) {
                        this.c = null;
                        z = true;
                    }
                    z = false;
                } else {
                    if (bVar != com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL) {
                        this.c = null;
                        z = true;
                    }
                    z = false;
                }
            } else {
                c cVar2 = this.j;
                if (cVar2 != null && (!cVar2.f() || (iOException instanceof com.mbridge.msdk.thrid.okhttp.internal.http2.a))) {
                    if (this.j.l == 0) {
                        c0 c0Var = this.c;
                        if (c0Var != null && iOException != null) {
                            this.h.a(c0Var, iOException);
                        }
                        this.c = null;
                    }
                    z = true;
                }
                z = false;
            }
            c cVar3 = this.j;
            a2 = a(z, false, true);
            if (this.j == null && this.k) {
                cVar = cVar3;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(a2);
        if (cVar != null) {
            this.f.connectionReleased(this.e, cVar);
        }
    }

    public void a(c cVar, boolean z) {
        if (!o && !Thread.holdsLock(this.d)) {
            throw new AssertionError();
        }
        if (this.j == null) {
            this.j = cVar;
            this.k = z;
            cVar.n.add(new a(this, this.g));
            return;
        }
        throw new IllegalStateException();
    }

    private void a(c cVar) {
        int size = cVar.n.size();
        for (int i = 0; i < size; i++) {
            if (cVar.n.get(i).get() == this) {
                cVar.n.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }
}

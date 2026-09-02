package o1;

import P.B;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p.AbstractC0819i;

/* loaded from: classes.dex */
public final class r implements Closeable {

    /* renamed from: u, reason: collision with root package name */
    public static final ThreadPoolExecutor f6318u;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6319a;

    /* renamed from: b, reason: collision with root package name */
    public final n f6320b;

    /* renamed from: d, reason: collision with root package name */
    public final String f6322d;

    /* renamed from: e, reason: collision with root package name */
    public int f6323e;

    /* renamed from: f, reason: collision with root package name */
    public int f6324f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6325g;

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f6326h;

    /* renamed from: i, reason: collision with root package name */
    public final ThreadPoolExecutor f6327i;

    /* renamed from: j, reason: collision with root package name */
    public final z f6328j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6329k;

    /* renamed from: m, reason: collision with root package name */
    public long f6331m;

    /* renamed from: n, reason: collision with root package name */
    public final B f6332n;

    /* renamed from: o, reason: collision with root package name */
    public final B f6333o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6334p;

    /* renamed from: q, reason: collision with root package name */
    public final Socket f6335q;

    /* renamed from: r, reason: collision with root package name */
    public final x f6336r;

    /* renamed from: s, reason: collision with root package name */
    public final p f6337s;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashSet f6338t;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f6321c = new LinkedHashMap();

    /* renamed from: l, reason: collision with root package name */
    public long f6330l = 0;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = j1.d.f6053a;
        f6318u = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new j1.c("OkHttp Http2Connection", true));
    }

    public r(P.r rVar) {
        B b2 = new B();
        this.f6332n = b2;
        B b3 = new B();
        this.f6333o = b3;
        this.f6334p = false;
        this.f6338t = new LinkedHashSet();
        this.f6328j = z.f6382a;
        boolean z2 = rVar.f346a;
        this.f6319a = z2;
        this.f6320b = (n) rVar.f351f;
        int i2 = z2 ? 1 : 2;
        this.f6324f = i2;
        if (z2) {
            this.f6324f = i2 + 2;
        }
        if (z2) {
            b2.b(7, 16777216);
        }
        String str = (String) rVar.f348c;
        this.f6322d = str;
        byte[] bArr = j1.d.f6053a;
        Locale locale = Locale.US;
        this.f6326h = new ScheduledThreadPoolExecutor(1, new j1.c(AbstractC0819i.a("OkHttp ", str, " Writer"), false));
        this.f6327i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new j1.c(AbstractC0819i.a("OkHttp ", str, " Push Observer"), true));
        b3.b(7, 65535);
        b3.b(5, 16384);
        this.f6331m = b3.a();
        this.f6335q = (Socket) rVar.f347b;
        this.f6336r = new x((s1.m) rVar.f350e, z2);
        this.f6337s = new p(this, new t((s1.n) rVar.f349d, z2));
    }

    public final void a(int i2, int i3) {
        w[] wVarArr = null;
        try {
            l(i2);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            try {
                if (!this.f6321c.isEmpty()) {
                    wVarArr = (w[]) this.f6321c.values().toArray(new w[this.f6321c.size()]);
                    this.f6321c.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (wVarArr != null) {
            for (w wVar : wVarArr) {
                try {
                    wVar.c(i3);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.f6336r.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.f6335q.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.f6326h.shutdown();
        this.f6327i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public final void b() {
        try {
            a(2, 2);
        } catch (IOException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(1, 6);
    }

    public final void flush() {
        this.f6336r.flush();
    }

    public final synchronized w g(int i2) {
        return (w) this.f6321c.get(Integer.valueOf(i2));
    }

    public final synchronized int i() {
        B b2;
        b2 = this.f6333o;
        return (b2.f286a & 16) != 0 ? ((int[]) b2.f287b)[4] : Integer.MAX_VALUE;
    }

    public final synchronized void j(j1.a aVar) {
        synchronized (this) {
        }
        if (!this.f6325g) {
            this.f6327i.execute(aVar);
        }
    }

    public final synchronized w k(int i2) {
        w wVar;
        wVar = (w) this.f6321c.remove(Integer.valueOf(i2));
        notifyAll();
        return wVar;
    }

    public final void l(int i2) {
        synchronized (this.f6336r) {
            synchronized (this) {
                if (this.f6325g) {
                    return;
                }
                this.f6325g = true;
                this.f6336r.i(j1.d.f6053a, this.f6323e, i2);
            }
        }
    }

    public final synchronized void m(long j2) {
        long j3 = this.f6330l + j2;
        this.f6330l = j3;
        if (j3 >= this.f6332n.a() / 2) {
            p(0, this.f6330l);
            this.f6330l = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f6336r.f6375d);
        r6 = r2;
        r8.f6331m -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i2, boolean z2, s1.e eVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f6336r.b(z2, i2, eVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f6331m;
                            if (j4 > 0) {
                                break;
                            } else {
                                if (!this.f6321c.containsKey(Integer.valueOf(i2))) {
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
            j2 -= j3;
            this.f6336r.b(z2 && j2 == 0, i2, eVar, min);
        }
    }

    public final void o(int i2, int i3) {
        try {
            this.f6326h.execute(new i(this, new Object[]{this.f6322d, Integer.valueOf(i2)}, i2, i3));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void p(int i2, long j2) {
        try {
            this.f6326h.execute(new j(this, new Object[]{this.f6322d, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }
}

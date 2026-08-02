package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class np implements java.io.Closeable, java.io.Flushable {

    /* renamed from: a, reason: collision with root package name */
    private int f3687a;
    private long b;
    private long c;
    private com.facetec.sdk.ow d;
    private com.facetec.sdk.pj e;
    private boolean f;
    private boolean g;
    private java.util.LinkedHashMap<java.lang.String, com.facetec.sdk.np.c> h;
    private boolean i;
    private int j;
    private final java.lang.Runnable k;
    private final java.util.concurrent.Executor n;

    public final class a {
        boolean b;
        final com.facetec.sdk.np.c c;
        final /* synthetic */ com.facetec.sdk.np d;
    }

    final class c {

        /* renamed from: a, reason: collision with root package name */
        final java.io.File[] f3688a;
        final java.lang.String b;
        boolean c;
        final java.io.File[] d;
        final long[] e;
        com.facetec.sdk.np.a g;
    }

    static {
        java.util.regex.Pattern.compile("[a-z0-9_-]{1,120}");
    }

    private void b(com.facetec.sdk.np.a aVar) throws java.io.IOException {
        synchronized (this) {
            com.facetec.sdk.np.c cVar = aVar.c;
            if (cVar.g != aVar) {
                throw new java.lang.IllegalStateException();
            }
            for (int i = 0; i < this.f3687a; i++) {
                this.d.c(cVar.f3688a[i]);
            }
            this.j++;
            cVar.g = null;
            if (cVar.c) {
                cVar.c = true;
                this.e.c("CLEAN").g(32);
                this.e.c(cVar.b);
                com.facetec.sdk.pj pjVar = this.e;
                for (long j : cVar.e) {
                    pjVar.g(32).l(j);
                }
                this.e.g(10);
            } else {
                this.h.remove(cVar.b);
                this.e.c("REMOVE").g(32);
                this.e.c(cVar.b);
                this.e.g(10);
            }
            this.e.flush();
            if (this.b > this.c || d()) {
                this.n.execute(this.k);
            }
        }
    }

    private boolean d() {
        int i = this.j;
        return i >= 2000 && i >= this.h.size();
    }

    private boolean e(com.facetec.sdk.np.c cVar) throws java.io.IOException {
        if (cVar.g != null) {
            com.facetec.sdk.np.a aVar = cVar.g;
            if (aVar.c.g == aVar) {
                for (int i = 0; i < aVar.d.f3687a; i++) {
                    try {
                        aVar.d.d.c(aVar.c.f3688a[i]);
                    } catch (java.io.IOException unused) {
                    }
                }
                aVar.c.g = null;
            }
        }
        for (int i2 = 0; i2 < this.f3687a; i2++) {
            this.d.c(cVar.d[i2]);
            this.b -= cVar.e[i2];
            cVar.e[i2] = 0;
        }
        this.j++;
        this.e.c("REMOVE").g(32).c(cVar.b).g(10);
        this.h.remove(cVar.b);
        if (d()) {
            this.n.execute(this.k);
        }
        return true;
    }

    private boolean c() {
        boolean z;
        synchronized (this) {
            z = this.i;
        }
        return z;
    }

    private void a() {
        synchronized (this) {
            if (c()) {
                throw new java.lang.IllegalStateException("cache is closed");
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws java.io.IOException {
        synchronized (this) {
            if (this.f) {
                a();
                e();
                this.e.flush();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        synchronized (this) {
            if (this.f && !this.i) {
                for (com.facetec.sdk.np.c cVar : (com.facetec.sdk.np.c[]) this.h.values().toArray(new com.facetec.sdk.np.c[this.h.size()])) {
                    if (cVar.g != null) {
                        com.facetec.sdk.np.a aVar = cVar.g;
                        synchronized (aVar.d) {
                            if (aVar.b) {
                                throw new java.lang.IllegalStateException();
                            }
                            if (aVar.c.g == aVar) {
                                aVar.d.b(aVar);
                            }
                            aVar.b = true;
                        }
                    }
                }
                e();
                this.e.close();
                this.e = null;
                this.i = true;
                return;
            }
            this.i = true;
        }
    }

    private void e() throws java.io.IOException {
        while (this.b > this.c) {
            e(this.h.values().iterator().next());
        }
        this.g = false;
    }
}

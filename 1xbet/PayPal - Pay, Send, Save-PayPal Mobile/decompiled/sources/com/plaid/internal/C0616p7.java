package com.plaid.internal;

/* renamed from: com.plaid.internal.p7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0616p7<R> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0599o<R> f6535a;
    public final java.util.concurrent.ExecutorService b = java.util.concurrent.Executors.newCachedThreadPool();
    public final boolean c = true;
    public final com.plaid.internal.E0 d;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.plaid.internal.p7$a */
    public final class a<T> implements java.util.concurrent.Callable<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.plaid.internal.C0616p7.c f6536a;

        public a(com.plaid.internal.C0616p7.c cVar) {
            this.f6536a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final T call() {
            return (T) this.f6536a.call();
        }
    }

    /* renamed from: com.plaid.internal.p7$b */
    public final class b implements com.plaid.internal.C0616p7.c<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.plaid.internal.C0608p f6537a;

        public b(com.plaid.internal.C0608p c0608p) {
            this.f6537a = c0608p;
        }

        @Override // com.plaid.internal.C0616p7.c
        public final R call() {
            com.plaid.internal.C0599o<R> c0599o = com.plaid.internal.C0616p7.this.f6535a;
            c0599o.f.a((com.plaid.internal.InterfaceC0627r1) com.plaid.internal.C0599o.a(com.plaid.internal.EnumC0580l7.PRE_CHECK, c0599o.f6511a, new com.plaid.internal.C0545i(), this.f6537a));
            return null;
        }
    }

    /* renamed from: com.plaid.internal.p7$c */
    public interface c<T> {
        T call();
    }

    public C0616p7(com.plaid.internal.C0599o c0599o, com.plaid.internal.E0 e0) {
        this.f6535a = c0599o;
        this.d = e0;
    }

    public final <T> T a(com.plaid.internal.C0616p7.c<T> cVar, com.plaid.internal.C0608p c0608p) {
        try {
            return this.b.submit(new com.plaid.internal.C0616p7.a(cVar)).get();
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            throw new com.plaid.internal.r(c0608p.b, e);
        } catch (java.util.concurrent.ExecutionException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof com.plaid.internal.r) {
                throw ((com.plaid.internal.r) cause);
            }
            throw new com.plaid.internal.r(c0608p.b, cause);
        } catch (java.util.concurrent.TimeoutException unused) {
            c0608p.f6523a = true;
            throw new com.plaid.internal.r(c0608p.b, new com.plaid.internal.C0617q(com.plaid.internal.T0.GENERIC_TIMEOUT));
        }
    }

    public final void b() {
        com.plaid.internal.C0608p c0608p = new com.plaid.internal.C0608p();
        a(new com.plaid.internal.C0616p7.b(c0608p), c0608p);
    }

    public final R a() {
        java.lang.String a2;
        com.plaid.internal.C0608p c0608p = new com.plaid.internal.C0608p();
        try {
            a2 = (java.lang.String) a(new com.plaid.internal.C0625q7(this, c0608p), c0608p);
        } catch (com.plaid.internal.r e) {
            if (this.c && e.f6550a == com.plaid.internal.EnumC0580l7.AUTHENTICATION) {
                a2 = com.plaid.internal.H.a(e, c0608p);
            } else {
                throw e;
            }
        }
        com.plaid.internal.C0599o<R> c0599o = this.f6535a;
        try {
            R r = (R) com.plaid.internal.C0599o.a(com.plaid.internal.EnumC0580l7.FINISH, c0599o.e, new com.plaid.internal.C0590n(a2), c0608p);
            com.plaid.internal.C0599o.g.a(com.plaid.internal.W3.INFO, "authentication completed", new java.lang.Object[0]);
            com.plaid.internal.A7 a7 = c0599o.f;
            synchronized (a7) {
                a7.b();
            }
            return r;
        } catch (com.plaid.internal.r e2) {
            c0599o.f.a();
            throw e2;
        }
    }
}

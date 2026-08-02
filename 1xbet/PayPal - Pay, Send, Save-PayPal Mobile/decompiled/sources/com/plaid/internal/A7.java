package com.plaid.internal;

/* loaded from: classes16.dex */
public final class A7 {
    public static final com.plaid.internal.C0680x0 d;

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.A7.a f5751a;
    public final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());
    public final int c = 120000;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final com.plaid.internal.InterfaceC0627r1 f5752a;
        public final com.plaid.internal.A7.a.RunnableC0153a b = new com.plaid.internal.A7.a.RunnableC0153a();
        public boolean c = false;

        /* renamed from: com.plaid.internal.A7$a$a, reason: collision with other inner class name */
        public final class RunnableC0153a implements java.lang.Runnable {
            public RunnableC0153a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.plaid.internal.A7.a aVar = com.plaid.internal.A7.a.this;
                if (aVar.c) {
                    return;
                }
                com.plaid.internal.A7.d.a(com.plaid.internal.W3.INFO, "release http client", new java.lang.Object[0]);
                aVar.c = true;
                aVar.f5752a.a();
            }
        }

        public a(com.plaid.internal.InterfaceC0627r1 interfaceC0627r1) {
            this.f5752a = interfaceC0627r1;
        }
    }

    public final void a() {
        synchronized (this) {
            b();
        }
    }

    public final void b() {
        synchronized (this) {
            if (this.f5751a != null) {
                com.plaid.internal.C0680x0 c0680x0 = d;
                c0680x0.a(com.plaid.internal.W3.DEBUG, "release cached http client", new java.lang.Object[0]);
                this.b.removeCallbacks(this.f5751a.b);
                com.plaid.internal.A7.a aVar = this.f5751a;
                if (!aVar.c) {
                    c0680x0.a(com.plaid.internal.W3.INFO, "release http client", new java.lang.Object[0]);
                    aVar.c = true;
                    aVar.f5752a.a();
                }
                this.f5751a = null;
            }
        }
    }

    static {
        com.plaid.internal.W3 w3 = com.plaid.internal.Z3.f5986a;
        d = new com.plaid.internal.C0680x0("reuse-network");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0007, B:10:0x000c, B:14:0x0016, B:15:0x0040, B:17:0x0044, B:18:0x0012, B:19:0x002b), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.plaid.internal.InterfaceC0627r1 interfaceC0627r1) {
        int i;
        synchronized (this) {
            if (interfaceC0627r1 == null) {
                b();
            } else {
                com.plaid.internal.A7.a aVar = this.f5751a;
                if (aVar != null) {
                    if ((aVar.c ? null : aVar.f5752a) == interfaceC0627r1) {
                        d.a(com.plaid.internal.W3.INFO, "reuse cached http client", new java.lang.Object[0]);
                        this.b.removeCallbacks(this.f5751a.b);
                        i = this.c;
                        if (i > 0) {
                            d.a(com.plaid.internal.W3.INFO, "schedule http client release in %d ms", java.lang.Integer.valueOf(i));
                            this.b.postDelayed(this.f5751a.b, this.c);
                        }
                    }
                }
                b();
                d.a(com.plaid.internal.W3.INFO, "cache http client", new java.lang.Object[0]);
                this.f5751a = new com.plaid.internal.A7.a(interfaceC0627r1);
                i = this.c;
                if (i > 0) {
                }
            }
        }
    }
}

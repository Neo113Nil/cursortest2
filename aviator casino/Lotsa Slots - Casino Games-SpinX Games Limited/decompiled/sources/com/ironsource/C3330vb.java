package com.ironsource;

/* renamed from: com.ironsource.vb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3330vb {
    private static final java.lang.String g = "vb";

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.lifecycle.b f6777a;
    private final java.lang.Runnable b;
    private final com.ironsource.C3031eg c;
    private java.util.Timer e;
    private final java.lang.Object d = new java.lang.Object();
    private final com.ironsource.InterfaceC3097ia f = new com.ironsource.C3330vb.a();

    /* renamed from: com.ironsource.vb$a */
    class a implements com.ironsource.InterfaceC3097ia {
        a() {
        }

        @Override // com.ironsource.InterfaceC3097ia
        public void a() {
            com.ironsource.C3330vb.this.c.c(java.lang.System.currentTimeMillis());
            com.ironsource.C3330vb.this.c();
        }

        @Override // com.ironsource.InterfaceC3097ia
        public void b() {
            com.ironsource.C3330vb.this.c.b(java.lang.System.currentTimeMillis());
            com.ironsource.C3330vb c3330vb = com.ironsource.C3330vb.this;
            c3330vb.b(c3330vb.c.a());
        }

        @Override // com.ironsource.InterfaceC3097ia
        public void c() {
        }

        @Override // com.ironsource.InterfaceC3097ia
        public void d() {
        }
    }

    /* renamed from: com.ironsource.vb$b */
    class b extends java.util.TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.ironsource.C3330vb c3330vb = com.ironsource.C3330vb.this;
            c3330vb.f6777a.b(c3330vb.f);
            com.ironsource.C3330vb.this.c.b();
            com.ironsource.C3330vb.this.b.run();
        }
    }

    public C3330vb(java.lang.Runnable runnable, com.ironsource.lifecycle.b bVar, com.ironsource.C3031eg c3031eg) {
        this.b = runnable;
        this.f6777a = bVar;
        this.c = c3031eg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.d) {
            java.util.Timer timer = this.e;
            if (timer != null) {
                timer.cancel();
                this.e = null;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void b() {
        c();
        this.f6777a.b(this.f);
        this.c.b();
    }

    public void a(long j) {
        if (j < 0) {
            android.util.Log.d(g, "cannot start timer with delay < 0");
            return;
        }
        this.f6777a.a(this.f);
        this.c.a(j);
        if (this.f6777a.e()) {
            this.c.c(java.lang.System.currentTimeMillis());
        } else {
            b(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        synchronized (this.d) {
            c();
            java.util.Timer timer = new java.util.Timer();
            this.e = timer;
            timer.schedule(new com.ironsource.C3330vb.b(), j);
        }
    }
}

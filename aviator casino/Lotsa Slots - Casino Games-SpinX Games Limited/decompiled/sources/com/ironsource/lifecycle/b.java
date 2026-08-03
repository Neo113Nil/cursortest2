package com.ironsource.lifecycle;

/* loaded from: classes5.dex */
public class b implements android.app.Application.ActivityLifecycleCallbacks {
    private static final com.ironsource.lifecycle.b m = new com.ironsource.lifecycle.b();
    private static java.util.concurrent.atomic.AtomicBoolean n = new java.util.concurrent.atomic.AtomicBoolean(false);
    static final long o = 700;

    /* renamed from: a, reason: collision with root package name */
    private int f6377a = 0;
    private int b = 0;
    private boolean c = true;
    private boolean d = true;
    private com.ironsource.EnumC3114ja e = com.ironsource.EnumC3114ja.NONE;
    private final java.util.List<com.ironsource.InterfaceC3097ia> f = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.lang.Runnable g = new java.lang.Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.lifecycle.b.this.f();
        }
    };
    private final java.lang.Runnable h = new java.lang.Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.lifecycle.b.this.g();
        }
    };
    private final java.lang.Runnable i = new java.lang.Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda2
        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.lifecycle.b.this.h();
        }
    };
    private final java.lang.Runnable j = new java.lang.Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda3
        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.lifecycle.b.this.i();
        }
    };
    private final java.lang.Runnable k = new java.lang.Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda4
        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.lifecycle.b.this.j();
        }
    };
    private final com.ironsource.lifecycle.a.InterfaceC0155a l = new com.ironsource.lifecycle.b.a();

    class a implements com.ironsource.lifecycle.a.InterfaceC0155a {
        a() {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0155a
        public void a(android.app.Activity activity) {
            com.ironsource.lifecycle.b.this.b(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0155a
        public void b(android.app.Activity activity) {
            com.ironsource.lifecycle.b.this.c(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0155a
        public void c(android.app.Activity activity) {
        }
    }

    public static com.ironsource.lifecycle.b d() {
        return m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        a();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        java.util.Iterator<com.ironsource.InterfaceC3097ia> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        java.util.Iterator<com.ironsource.InterfaceC3097ia> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        java.util.Iterator<com.ironsource.InterfaceC3097ia> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        java.util.Iterator<com.ironsource.InterfaceC3097ia> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void a(com.ironsource.InterfaceC3097ia interfaceC3097ia) {
        if (!com.ironsource.lifecycle.IronsourceLifecycleProvider.a() || interfaceC3097ia == null || this.f.contains(interfaceC3097ia)) {
            return;
        }
        this.f.add(interfaceC3097ia);
    }

    public void b(com.ironsource.InterfaceC3097ia interfaceC3097ia) {
        if (this.f.contains(interfaceC3097ia)) {
            this.f.remove(interfaceC3097ia);
        }
    }

    public com.ironsource.EnumC3114ja c() {
        return this.e;
    }

    public boolean e() {
        return this.e == com.ironsource.EnumC3114ja.STOPPED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        com.ironsource.lifecycle.a.b(activity);
        com.ironsource.lifecycle.a a2 = com.ironsource.lifecycle.a.a(activity);
        if (a2 != null) {
            a2.d(this.l);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        d(activity);
    }

    void c(android.app.Activity activity) {
        int i = this.f6377a + 1;
        this.f6377a = i;
        if (i == 1 && this.d) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.k);
            this.d = false;
            this.e = com.ironsource.EnumC3114ja.STARTED;
        }
    }

    void d(android.app.Activity activity) {
        this.f6377a--;
        b();
    }

    void b(android.app.Activity activity) {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (this.c) {
                com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.j);
                this.c = false;
                this.e = com.ironsource.EnumC3114ja.RESUMED;
                return;
            }
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.removeUiThreadTask(this.g);
        }
    }

    void a(android.content.Context context) {
        android.app.Application application;
        if (!n.compareAndSet(false, true) || (application = (android.app.Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    private void b() {
        if (this.f6377a == 0 && this.c) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.i);
            this.d = true;
            this.e = com.ironsource.EnumC3114ja.STOPPED;
        }
    }

    void a(android.app.Activity activity) {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(this.g, 700L);
        }
    }

    private void a() {
        if (this.b == 0) {
            this.c = true;
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.h);
            this.e = com.ironsource.EnumC3114ja.PAUSED;
        }
    }
}

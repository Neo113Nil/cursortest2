package com.ironsource;

/* loaded from: classes5.dex */
public final class Y5 implements com.ironsource.InterfaceC3097ia {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Ye f6089a;
    private long b;

    public Y5(com.ironsource.InterfaceC3129k7 applicationLifecycleService, com.ironsource.Ye task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        this.f6089a = task;
        applicationLifecycleService.a(this);
        f();
    }

    private final long e() {
        return java.lang.System.currentTimeMillis() - this.b;
    }

    private final void f() {
        this.b = java.lang.System.currentTimeMillis();
    }

    @Override // com.ironsource.InterfaceC3097ia
    public void a() {
        this.f6089a.a(java.lang.Long.valueOf(e()));
        this.f6089a.run();
    }

    @Override // com.ironsource.InterfaceC3097ia
    public void b() {
        f();
    }

    @Override // com.ironsource.InterfaceC3097ia
    public void c() {
    }

    @Override // com.ironsource.InterfaceC3097ia
    public void d() {
    }
}

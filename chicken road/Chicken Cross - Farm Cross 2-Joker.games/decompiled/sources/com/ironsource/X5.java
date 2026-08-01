package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class X5 implements InterfaceC4462ia {

    /* renamed from: a, reason: collision with root package name */
    private final We f8005a;
    private long b;

    public X5(InterfaceC4441h7 applicationLifecycleService, We task) {
        Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        Intrinsics.checkNotNullParameter(task, "task");
        this.f8005a = task;
        applicationLifecycleService.a(this);
        f();
    }

    private final long e() {
        return System.currentTimeMillis() - this.b;
    }

    private final void f() {
        this.b = System.currentTimeMillis();
    }

    @Override // com.ironsource.InterfaceC4462ia
    public void a() {
        this.f8005a.a(Long.valueOf(e()));
        this.f8005a.run();
    }

    @Override // com.ironsource.InterfaceC4462ia
    public void b() {
        f();
    }

    @Override // com.ironsource.InterfaceC4462ia
    public void c() {
    }

    @Override // com.ironsource.InterfaceC4462ia
    public void d() {
    }
}

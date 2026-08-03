package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272c6 extends io.appmetrica.analytics.impl.Pg {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f5631f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0774vh f5632g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0659r6 f5633h;

    /* renamed from: i, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.K1 f5634i;

    /* renamed from: j, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0556n6 f5635j;

    public C0272c6(android.content.Context context, io.appmetrica.analytics.impl.C0602p0 c0602p0, io.appmetrica.analytics.impl.Zk zk, io.appmetrica.analytics.impl.C0774vh c0774vh) {
        super(c0602p0, zk, c0774vh);
        this.f5631f = context;
        this.f5632g = c0774vh;
        this.f5633h = io.appmetrica.analytics.impl.C0244b4.l().i();
        this.f5634i = io.appmetrica.analytics.impl.C0244b4.l().f();
        this.f5635j = new io.appmetrica.analytics.impl.C0556n6(context);
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0826xh
    public final synchronized void a() {
        try {
            if (this.f7117c) {
                return;
            }
            this.f7117c = true;
            java.lang.String a2 = this.f5633h.f6720a.a();
            io.appmetrica.analytics.impl.K1 k12 = this.f5634i;
            android.content.Context context = this.f5631f;
            k12.getClass();
            android.content.pm.ServiceInfo serviceInfo = io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils.getServiceInfo(context, io.appmetrica.analytics.internal.AppMetricaService.class);
            if (kotlin.jvm.internal.i.a(a2, serviceInfo != null ? serviceInfo.processName : null)) {
                this.f5635j.a(this.f5632g);
            } else {
                this.f7115a.c();
                this.f7117c = false;
                super.a();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0826xh
    public final boolean c() {
        this.f5635j.a(this.f5632g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0826xh, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        a();
        return h1.C0177i.f3302a;
    }
}

package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class Wo implements io.appmetrica.analytics.impl.I1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5248b;

    public /* synthetic */ Wo(int i2, java.lang.Object obj) {
        this.f5247a = i2;
        this.f5248b = obj;
    }

    @Override // io.appmetrica.analytics.impl.I1
    public final void a(android.content.Intent intent) {
        switch (this.f5247a) {
            case 0:
                io.appmetrica.analytics.impl.C0227ad.a((io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver) this.f5248b, intent);
                break;
            case 1:
                io.appmetrica.analytics.impl.C0227ad.b((io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver) this.f5248b, intent);
                break;
            default:
                ((io.appmetrica.analytics.impl.B1) this.f5248b).d(intent);
                break;
        }
    }
}

package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.y9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0844y9 implements io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0492kk f7137a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor f7138b;

    public C0844y9() {
        io.appmetrica.analytics.impl.C0492kk w2 = io.appmetrica.analytics.impl.C0560na.k().w();
        this.f7137a = w2;
        this.f7138b = w2.b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor getDefaultExecutor() {
        return this.f7137a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread getInterruptionThread(java.lang.String str, java.lang.String str2, java.lang.Runnable runnable) {
        return new io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread(runnable, (str + '-' + str2) + "-" + io.appmetrica.analytics.impl.ThreadFactoryC0874zd.f7184a.incrementAndGet());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor getModuleExecutor() {
        return this.f7138b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final java.util.concurrent.Executor getReportRunnableExecutor() {
        return this.f7137a.d();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor getSupportIOExecutor() {
        io.appmetrica.analytics.impl.C0492kk c0492kk = this.f7137a;
        if (c0492kk.f6313f == null) {
            synchronized (c0492kk) {
                try {
                    if (c0492kk.f6313f == null) {
                        c0492kk.f6308a.getClass();
                        io.appmetrica.analytics.impl.HandlerThreadC0277cb a2 = io.appmetrica.analytics.impl.C0870z9.a("IAA-SIO");
                        c0492kk.f6313f = new io.appmetrica.analytics.impl.C0870z9(a2, a2.getLooper(), new android.os.Handler(a2.getLooper()));
                    }
                } finally {
                }
            }
        }
        return c0492kk.f6313f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final java.util.concurrent.Executor getUiExecutor() {
        io.appmetrica.analytics.impl.C0492kk c0492kk = this.f7137a;
        if (c0492kk.f6315h == null) {
            synchronized (c0492kk) {
                try {
                    if (c0492kk.f6315h == null) {
                        c0492kk.f6308a.getClass();
                        c0492kk.f6315h = new io.appmetrica.analytics.impl.ExecutorC0440ik(new android.os.Handler(android.os.Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return c0492kk.f6315h;
    }
}

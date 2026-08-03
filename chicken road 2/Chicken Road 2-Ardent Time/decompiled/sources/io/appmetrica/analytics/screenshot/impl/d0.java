package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.screenshot.impl.g0 f7546a;

    public d0(io.appmetrica.analytics.screenshot.impl.g0 g0Var) {
        this.f7546a = g0Var;
    }

    public static final java.lang.Boolean a(io.appmetrica.analytics.screenshot.impl.g0 g0Var, io.appmetrica.analytics.screenshot.impl.d0 d0Var, io.appmetrica.analytics.screenshot.impl.C0898n c0898n, android.app.ActivityManager activityManager) {
        java.lang.Object obj;
        java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(200);
        if (runningServices == null) {
            runningServices = i1.C0199r.f3325a;
        }
        for (android.app.ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
        }
        java.util.Iterator<T> it = runningServices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.i.a(((android.app.ActivityManager.RunningServiceInfo) obj).process, "com.android.systemui:screenshot")) {
                break;
            }
        }
        if (((android.app.ActivityManager.RunningServiceInfo) obj) != null) {
            ((io.appmetrica.analytics.screenshot.impl.C0907x) g0Var.f7551b).a("ServiceScreenshotCaptor");
        }
        return java.lang.Boolean.valueOf(g0Var.f7552c.postDelayed(d0Var, java.util.concurrent.TimeUnit.SECONDS.toMillis(c0898n.f7577b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        final io.appmetrica.analytics.screenshot.impl.C0898n c0898n = this.f7546a.f7554e;
        if (this.f7546a.f7553d || c0898n == null || !c0898n.f7576a) {
            return;
        }
        android.content.Context context = this.f7546a.f7550a.getContext();
        final io.appmetrica.analytics.screenshot.impl.g0 g0Var = this.f7546a;
        io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "running service screenshot captor", "ActivityManager", new io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable() { // from class: N0.c
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final java.lang.Object apply(java.lang.Object obj) {
                return io.appmetrica.analytics.screenshot.impl.d0.a(io.appmetrica.analytics.screenshot.impl.g0.this, this, c0898n, (android.app.ActivityManager) obj);
            }
        });
    }
}

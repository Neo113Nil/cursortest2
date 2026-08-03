package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class f0 implements io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.screenshot.impl.g0 f7549a;

    public f0(io.appmetrica.analytics.screenshot.impl.g0 g0Var) {
        this.f7549a = g0Var;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(android.app.Activity activity, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent activityEvent) {
        int i2 = io.appmetrica.analytics.screenshot.impl.e0.f7548a[activityEvent.ordinal()];
        try {
            if (i2 == 1) {
                io.appmetrica.analytics.screenshot.impl.C0898n c0898n = this.f7549a.f7554e;
                if (c0898n == null || !c0898n.f7576a) {
                    return;
                }
                this.f7549a.f7553d = false;
                io.appmetrica.analytics.screenshot.impl.g0 g0Var = this.f7549a;
                g0Var.f7552c.postDelayed(g0Var.f7555f, 0L);
            } else if (i2 != 2) {
            } else {
                this.f7549a.f7553d = true;
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}

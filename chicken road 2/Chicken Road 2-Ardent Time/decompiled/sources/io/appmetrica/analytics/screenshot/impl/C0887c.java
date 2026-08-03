package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0887c implements io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.screenshot.impl.C0888d f7541a;

    public C0887c(io.appmetrica.analytics.screenshot.impl.C0888d c0888d) {
        this.f7541a = c0888d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @android.annotation.SuppressLint({"MissingPermission", "NewApi"})
    public final void onEvent(android.app.Activity activity, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent activityEvent) {
        java.util.concurrent.Executor mainExecutor;
        int i2 = io.appmetrica.analytics.screenshot.impl.AbstractC0886b.f7540a[activityEvent.ordinal()];
        try {
            if (i2 == 1) {
                io.appmetrica.analytics.screenshot.impl.C0894j c0894j = this.f7541a.f7544c;
                if (c0894j == null || !c0894j.f7560a) {
                    return;
                }
                mainExecutor = this.f7541a.f7542a.getContext().getMainExecutor();
                activity.registerScreenCaptureCallback(mainExecutor, io.appmetrica.analytics.screenshot.impl.C0888d.d(this.f7541a));
            } else if (i2 != 2) {
            } else {
                activity.unregisterScreenCaptureCallback(io.appmetrica.analytics.screenshot.impl.C0888d.d(this.f7541a));
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}

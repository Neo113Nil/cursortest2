package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class D5 implements io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.E5 f4188a;

    public D5(io.appmetrica.analytics.impl.E5 e5) {
        this.f4188a = e5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(android.app.Activity activity, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent activityEvent) {
        int i2 = io.appmetrica.analytics.impl.C5.f4164a[activityEvent.ordinal()];
        if (i2 == 1) {
            this.f4188a.f4250b.resumeSession();
        } else {
            if (i2 != 2) {
                return;
            }
            this.f4188a.f4250b.pauseSession();
        }
    }
}

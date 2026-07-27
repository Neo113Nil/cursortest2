package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.screenshot.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1022c implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1023d f9028a;

    public C1022c(C1023d c1023d) {
        this.f9028a = c1023d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        Executor mainExecutor;
        int i3 = AbstractC1021b.f9027a[activityEvent.ordinal()];
        try {
            if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                activity.unregisterScreenCaptureCallback(C1023d.d(this.f9028a));
            } else {
                C1029j c1029j = this.f9028a.f9031c;
                if (c1029j == null || !c1029j.f9046a) {
                    return;
                }
                mainExecutor = this.f9028a.f9029a.getContext().getMainExecutor();
                activity.registerScreenCaptureCallback(mainExecutor, C1023d.d(this.f9028a));
            }
        } catch (Throwable unused) {
        }
    }
}

package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes.dex */
public final class K5 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L5 f6177a;

    public K5(L5 l5) {
        this.f6177a = l5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i3 = J5.f6148a[activityEvent.ordinal()];
        if (i3 == 1) {
            this.f6177a.f6206b.resumeSession();
        } else {
            if (i3 != 2) {
                return;
            }
            this.f6177a.f6206b.pauseSession();
        }
    }
}

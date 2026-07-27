package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes.dex */
public final class K5 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L5 f7030a;

    public K5(L5 l52) {
        this.f7030a = l52;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i2 = J5.f7000a[activityEvent.ordinal()];
        if (i2 == 1) {
            this.f7030a.f7061b.resumeSession();
        } else {
            if (i2 != 2) {
                return;
            }
            this.f7030a.f7061b.pauseSession();
        }
    }
}

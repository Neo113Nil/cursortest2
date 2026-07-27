package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes.dex */
public final class f0 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f10017a;

    public f0(g0 g0Var) {
        this.f10017a = g0Var;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i2 = e0.f10016a[activityEvent.ordinal()];
        try {
            if (i2 == 1) {
                C1182n c1182n = this.f10017a.f10022e;
                if (c1182n == null || !c1182n.f10044a) {
                    return;
                }
                this.f10017a.f10021d = false;
                g0 g0Var = this.f10017a;
                g0Var.f10020c.postDelayed(g0Var.f10023f, 0L);
            } else if (i2 != 2) {
            } else {
                this.f10017a.f10021d = true;
            }
        } catch (Throwable unused) {
        }
    }
}

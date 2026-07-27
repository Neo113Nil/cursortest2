package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes.dex */
public final class f0 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f9036a;

    public f0(g0 g0Var) {
        this.f9036a = g0Var;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i3 = e0.f9035a[activityEvent.ordinal()];
        try {
            if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                this.f9036a.f9040d = true;
                return;
            }
            C1033n c1033n = this.f9036a.f9041e;
            if (c1033n == null || !c1033n.f9062a) {
                return;
            }
            this.f9036a.f9040d = false;
            g0 g0Var = this.f9036a;
            g0Var.f9039c.postDelayed(g0Var.f, 0L);
        } catch (Throwable unused) {
        }
    }
}

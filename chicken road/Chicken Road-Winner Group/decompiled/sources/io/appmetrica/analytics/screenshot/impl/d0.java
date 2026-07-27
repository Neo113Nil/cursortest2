package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f9033a;

    public d0(g0 g0Var) {
        this.f9033a = g0Var;
    }

    public static final Boolean a(g0 g0Var, d0 d0Var, C1033n c1033n, ActivityManager activityManager) {
        Object obj;
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(200);
        if (runningServices == null) {
            runningServices = e2.o.f4877a;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
        }
        Iterator<T> it = runningServices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.j.a(((ActivityManager.RunningServiceInfo) obj).process, "com.android.systemui:screenshot")) {
                break;
            }
        }
        if (((ActivityManager.RunningServiceInfo) obj) != null) {
            ((C1042x) g0Var.f9038b).a("ServiceScreenshotCaptor");
        }
        return Boolean.valueOf(g0Var.f9039c.postDelayed(d0Var, TimeUnit.SECONDS.toMillis(c1033n.f9063b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1033n c1033n = this.f9033a.f9041e;
        if (this.f9033a.f9040d || c1033n == null || !c1033n.f9062a) {
            return;
        }
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f9033a.f9037a.getContext(), "activity", "running service screenshot captor", "ActivityManager", new F0.b(this.f9033a, this, c1033n, 1));
    }
}

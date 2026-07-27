package io.appmetrica.analytics.screenshot.impl;

import a1.C0178b;
import android.app.ActivityManager;
import g4.C0471p;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f10014a;

    public d0(g0 g0Var) {
        this.f10014a = g0Var;
    }

    public static final Boolean a(g0 g0Var, d0 d0Var, C1182n c1182n, ActivityManager activityManager) {
        Object obj;
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(200);
        if (runningServices == null) {
            runningServices = C0471p.f5750a;
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
            if (kotlin.jvm.internal.i.a(((ActivityManager.RunningServiceInfo) obj).process, "com.android.systemui:screenshot")) {
                break;
            }
        }
        if (((ActivityManager.RunningServiceInfo) obj) != null) {
            ((C1191x) g0Var.f10019b).a("ServiceScreenshotCaptor");
        }
        return Boolean.valueOf(g0Var.f10020c.postDelayed(d0Var, TimeUnit.SECONDS.toMillis(c1182n.f10045b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1182n c1182n = this.f10014a.f10022e;
        if (this.f10014a.f10021d || c1182n == null || !c1182n.f10044a) {
            return;
        }
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f10014a.f10018a.getContext(), "activity", "running service screenshot captor", "ActivityManager", new C0178b(this.f10014a, this, c1182n, 5));
    }
}

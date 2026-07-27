package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.startapp.sdk.adsbase.remoteconfig.AppSessionConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public final class v0 extends k6 {

    /* renamed from: a, reason: collision with root package name */
    public final gh f4502a;

    /* renamed from: b, reason: collision with root package name */
    public int f4503b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4504c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4505d;

    public v0(gh ghVar) {
        this.f4502a = ghVar;
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (activity == null) {
            return;
        }
        int i3 = this.f4503b + 1;
        this.f4503b = i3;
        if (i3 != 1 || this.f4504c) {
            return;
        }
        if (!this.f4505d) {
            this.f4505d = true;
            if (this.f4502a.f3781g != null) {
                d9 d9Var = new d9(e9.f3621i);
                d9Var.f3579j = false;
                try {
                    com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f3334U.f4509a;
                    if (aVar != null) {
                        ((t9) aVar.f3369q.a()).a(d9Var);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        gh ghVar = this.f4502a;
        Application application = ghVar.f3781g;
        if (application != null) {
            vh vhVar = (vh) com.startapp.sdk.components.a.a(application).f3359g.a();
            ((k8) vhVar.f4527b.a()).f3952a.post(new nh(vhVar));
            u0 u0Var = (u0) com.startapp.sdk.components.a.a(ghVar.f3781g).f3350Q.a();
            u0Var.f4403a.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = u0Var.f4407e;
            u0Var.f4404b.getClass();
            AppSessionConfig j4 = MetaData.E().j();
            if (elapsedRealtime > Math.max(0L, j4 != null ? j4.a() : 600000L) + j3 || u0Var.f4406d <= 0) {
                u0Var.f4406d = elapsedRealtime;
                u0Var.f4405c.clear();
            }
        }
        if (ghVar.f3781g != null) {
            d9 d9Var2 = new d9(e9.f3621i);
            d9Var2.f3579j = false;
            try {
                com.startapp.sdk.components.a aVar2 = com.startapp.sdk.components.a.f3334U.f4509a;
                if (aVar2 != null) {
                    ((t9) aVar2.f3369q.a()).a(d9Var2);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity == null) {
            return;
        }
        this.f4503b--;
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.f4504c = isChangingConfigurations;
        if (this.f4503b != 0 || isChangingConfigurations) {
            return;
        }
        gh ghVar = this.f4502a;
        Application application = ghVar.f3781g;
        if (application != null) {
            vh vhVar = (vh) com.startapp.sdk.components.a.a(application).f3359g.a();
            ((k8) vhVar.f4527b.a()).f3952a.post(new oh(vhVar));
            u0 u0Var = (u0) com.startapp.sdk.components.a.a(ghVar.f3781g).f3350Q.a();
            u0Var.f4403a.getClass();
            u0Var.f4407e = SystemClock.elapsedRealtime();
        }
        if (ghVar.f3781g != null) {
            d9 d9Var = new d9(e9.f3621i);
            d9Var.f3579j = false;
            try {
                com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f3334U.f4509a;
                if (aVar != null) {
                    ((t9) aVar.f3369q.a()).a(d9Var);
                }
            } catch (Throwable unused) {
            }
        }
        Application application2 = ghVar.f3781g;
        if (application2 != null) {
            try {
                ((mc) com.startapp.sdk.components.a.a(application2).f3375w.a()).b();
            } catch (Throwable th) {
                d9.a(th);
            }
            if (MetaData.E().U() == null || !MetaData.E().U().h()) {
                return;
            }
            ig igVar = (ig) com.startapp.sdk.components.a.a(application2).f3376x.a();
            try {
                SensorManager sensorManager = igVar.f;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(igVar.f3884n);
                }
            } catch (Throwable th2) {
                if (igVar.a(2)) {
                    d9.a(th2);
                }
            }
        }
    }
}

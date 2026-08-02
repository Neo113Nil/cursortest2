package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.K;
import I2.P;
import J2.j;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzayp implements Application.ActivityLifecycleCallbacks {
    private Activity zza;
    private Context zzb;
    private Runnable zzh;
    private long zzj;
    private final Object zzc = new Object();
    private boolean zzd = true;
    private boolean zze = false;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private boolean zzi = false;

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.zza = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            try {
                Activity activity2 = this.zza;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.zza = null;
                }
                Iterator it = this.zzg.iterator();
                while (it.hasNext()) {
                    try {
                        if (((zzaze) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e7) {
                        o.f1952C.f1961g.zzw(e7, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        int i7 = J.f3546b;
                        j.e("", e7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzaze) it.next()).zzb();
                } catch (Exception e7) {
                    o.f1952C.f1961g.zzw(e7, "AppActivityTracker.ActivityListener.onActivityPaused");
                    int i7 = J.f3546b;
                    j.e("", e7);
                }
            }
        }
        this.zze = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            P.f3579l.removeCallbacks(runnable);
        }
        K k7 = P.f3579l;
        zzayo zzayoVar = new zzayo(this);
        this.zzh = zzayoVar;
        k7.postDelayed(zzayoVar, this.zzj);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean z4 = this.zzd;
        this.zzd = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            P.f3579l.removeCallbacks(runnable);
        }
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzaze) it.next()).zzc();
                } catch (Exception e7) {
                    o.f1952C.f1961g.zzw(e7, "AppActivityTracker.ActivityListener.onActivityResumed");
                    int i7 = J.f3546b;
                    j.e("", e7);
                }
            }
            if (z4) {
                int i8 = J.f3546b;
                j.b("App is still foreground.");
            } else {
                Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    try {
                        ((zzayq) it2.next()).zza(true);
                    } catch (Exception e8) {
                        int i9 = J.f3546b;
                        j.e("", e8);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final Activity zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final void zzf(zzayq zzayqVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzayqVar);
        }
    }

    public final void zzg(Application application, Context context) {
        if (this.zzi) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            zzk((Activity) context);
        }
        this.zzb = application;
        this.zzj = ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzbf)).longValue();
        this.zzi = true;
    }

    public final void zzh(zzayq zzayqVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzayqVar);
        }
    }
}

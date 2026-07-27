package com.startapp.sdk.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AutoInterstitialPreferences;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dh extends k6 {
    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean startsWith;
        gh ghVar = fh.f3695a;
        ghVar.getClass();
        boolean z3 = true;
        if (activity.getClass().getName().equals(si.a(activity))) {
            ghVar.f3792r = true;
        }
        ghVar.f3790p = bundle;
        if ((ghVar.f3792r || activity.getClass().getName().equals(si.a(activity))) && ghVar.f3790p == null && ghVar.f3782h.isEmpty() && ((g6) com.startapp.sdk.components.a.a(activity).f3362j.a()).a(false, null, null, null, null, null)) {
            ghVar.f3792r = false;
        }
        com.startapp.sdk.adsbase.e eVar = ja.f3914a;
        boolean equals = activity.getClass().getName().equals(si.a(activity));
        if (bundle == null) {
            String[] split = com.startapp.sdk.adsbase.e.class.getName().split("\\.");
            if (split.length < 3) {
                startsWith = false;
            } else {
                startsWith = activity.getClass().getName().startsWith(split[0] + "." + split[1] + "." + split[2]);
            }
            if (startsWith || equals) {
                return;
            }
            eVar.f3218d++;
            if (eVar.f3215a && AdsCommonMetaData.k().H()) {
                if (eVar.f3216b == null) {
                    eVar.f3216b = new AutoInterstitialPreferences();
                }
                boolean z4 = eVar.f3217c <= 0 || System.currentTimeMillis() >= eVar.f3217c + ((long) (eVar.f3216b.getSecondsBetweenAds() * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
                int i3 = eVar.f3218d;
                if (i3 > 0 && i3 < eVar.f3216b.getActivitiesBetweenAds()) {
                    z3 = false;
                }
                if (z4 && z3) {
                    if (eVar.f3219e == null) {
                        eVar.f3219e = new StartAppAd(activity);
                    }
                    eVar.f3219e.loadAd(StartAppAd.AdMode.AUTOMATIC, new AdPreferences().setAi(Boolean.TRUE), new ia());
                }
            }
        }
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        gh ghVar = fh.f3695a;
        ghVar.getClass();
        if (activity.getClass().getName().equals(si.a(activity))) {
            ghVar.f3792r = false;
        }
        if (ghVar.f3782h.size() == 0) {
            ghVar.f3778c = false;
        }
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        gh ghVar = fh.f3695a;
        ghVar.getClass();
        ghVar.f = System.currentTimeMillis();
        ghVar.f3785k = null;
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        gh ghVar = fh.f3695a;
        if (ghVar.f3777b && ghVar.f3779d) {
            ghVar.f3779d = false;
            p pVar = (p) com.startapp.sdk.components.a.a(activity).f3346M.a();
            if (!pVar.f4181c) {
                synchronized (pVar.f4179a) {
                    try {
                        Iterator it = pVar.f4179a.values().iterator();
                        while (it.hasNext()) {
                            ((w2) it.next()).a();
                        }
                    } finally {
                    }
                }
            }
        }
        if (ghVar.f3786l) {
            ghVar.f3786l = false;
            com.startapp.sdk.adsbase.g.f(activity);
        }
        ghVar.f3785k = activity;
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        gh ghVar = fh.f3695a;
        if (ghVar.f3778c && System.currentTimeMillis() - ghVar.f > MetaData.E().V()) {
            mg.f4061d.a(activity, MetaDataRequest$RequestReason.APP_IDLE);
        }
        ghVar.f3780e = false;
        ghVar.f3778c = false;
        Integer num = (Integer) ghVar.f3782h.get(Integer.valueOf(activity.hashCode()));
        if (num == null) {
            num = 0;
        }
        ghVar.f3782h.put(Integer.valueOf(activity.hashCode()), Integer.valueOf(num.intValue() + 1));
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        gh ghVar = fh.f3695a;
        Integer num = (Integer) ghVar.f3782h.get(Integer.valueOf(activity.hashCode()));
        if (num != null) {
            int intValue = num.intValue() - 1;
            Integer valueOf = Integer.valueOf(intValue);
            if (intValue == 0) {
                ghVar.f3782h.remove(Integer.valueOf(activity.hashCode()));
            } else {
                ghVar.f3782h.put(Integer.valueOf(activity.hashCode()), valueOf);
            }
            if (ghVar.f3782h.size() == 0) {
                if (!ghVar.f3780e) {
                    ghVar.f3778c = true;
                }
                if (ghVar.f3777b) {
                    p pVar = (p) com.startapp.sdk.components.a.a(activity).f3346M.a();
                    try {
                        if (!pVar.f4180b && CacheMetaData.b().a().g() && MetaData.E().f0()) {
                            ((Executor) pVar.f4184g.a()).execute(new RunnableC0258l(pVar));
                        }
                        for (w2 w2Var : pVar.f4179a.values()) {
                            q2 q2Var = w2Var.f4572t;
                            Handler handler = q2Var.f4200b;
                            if (handler != null) {
                                handler.removeCallbacksAndMessages(null);
                            }
                            q2Var.f4202d = false;
                            n2 n2Var = w2Var.f4573u;
                            Handler handler2 = n2Var.f4200b;
                            if (handler2 != null) {
                                handler2.removeCallbacksAndMessages(null);
                            }
                            n2Var.f4202d = false;
                        }
                    } catch (Throwable th) {
                        d9.a(th);
                    }
                    ghVar.f3779d = true;
                }
            }
        }
    }
}

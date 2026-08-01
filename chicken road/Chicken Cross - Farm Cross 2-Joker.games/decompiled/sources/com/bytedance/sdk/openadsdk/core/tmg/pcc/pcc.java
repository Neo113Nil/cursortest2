package com.bytedance.sdk.openadsdk.core.tmg.pcc;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes4.dex */
public class pcc implements Application.ActivityLifecycleCallbacks {
    private static volatile pcc pcc;
    private final sf sf;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    private pcc(Application application) {
        this.sf = sf.pcc(application);
    }

    public static pcc pcc(Application application) {
        if (pcc == null) {
            synchronized (pcc.class) {
                if (pcc == null) {
                    pcc = new pcc(application);
                    application.registerActivityLifecycleCallbacks(pcc);
                }
            }
        }
        return pcc;
    }

    public String pcc(String str, long j, int i) {
        sf sfVar = this.sf;
        if (sfVar != null) {
            return sfVar.pcc(str, j, i);
        }
        return "null";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        sf sfVar = this.sf;
        if (sfVar != null) {
            sfVar.pcc(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        sf sfVar = this.sf;
        if (sfVar != null) {
            sfVar.sf(activity);
        }
    }
}

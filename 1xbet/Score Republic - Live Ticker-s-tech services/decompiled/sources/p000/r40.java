package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class r40 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: m */
    public RunnableC0944za f6708m;

    /* JADX INFO: renamed from: j */
    public final Handler f6705j = new Handler();

    /* JADX INFO: renamed from: k */
    public boolean f6706k = false;

    /* JADX INFO: renamed from: l */
    public boolean f6707l = true;

    /* JADX INFO: renamed from: n */
    public final C0013ac f6709n = new C0013ac();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f6707l = true;
        RunnableC0944za runnableC0944za = this.f6708m;
        Handler handler = this.f6705j;
        if (runnableC0944za != null) {
            handler.removeCallbacks(runnableC0944za);
        }
        RunnableC0944za runnableC0944za2 = new RunnableC0944za(4, this);
        this.f6708m = runnableC0944za2;
        handler.postDelayed(runnableC0944za2, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f6707l = false;
        boolean z = this.f6706k;
        this.f6706k = true;
        RunnableC0944za runnableC0944za = this.f6708m;
        if (runnableC0944za != null) {
            this.f6705j.removeCallbacks(runnableC0944za);
        }
        if (z) {
            return;
        }
        n80.m3497f("went foreground");
        this.f6709n.onNext("ON_FOREGROUND");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}

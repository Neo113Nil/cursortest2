package io.sentry.android.core;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityFramesTracker f14368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f14369c;

    public /* synthetic */ c(ActivityFramesTracker activityFramesTracker, Activity activity, int i7) {
        this.f14367a = i7;
        this.f14368b = activityFramesTracker;
        this.f14369c = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14367a) {
            case 0:
                this.f14368b.lambda$addActivity$0(this.f14369c);
                break;
            default:
                this.f14368b.lambda$setMetrics$1(this.f14369c);
                break;
        }
    }
}

package io.sentry.android.core;

import android.app.Activity;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityFramesTracker f14362b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f14363c;

    public /* synthetic */ c(ActivityFramesTracker activityFramesTracker, Activity activity, int i7) {
        this.f14361a = i7;
        this.f14362b = activityFramesTracker;
        this.f14363c = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14361a) {
            case 0:
                this.f14362b.lambda$addActivity$0(this.f14363c);
                break;
            default:
                this.f14362b.lambda$setMetrics$1(this.f14363c);
                break;
        }
    }
}

package io.sentry.android.core;

import io.sentry.ISpan;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityLifecycleIntegration f14376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ISpan f14377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ISpan f14378d;

    public /* synthetic */ f(ActivityLifecycleIntegration activityLifecycleIntegration, ISpan iSpan, ISpan iSpan2, int i7) {
        this.f14375a = i7;
        this.f14376b = activityLifecycleIntegration;
        this.f14377c = iSpan;
        this.f14378d = iSpan2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14375a) {
            case 0:
                this.f14376b.lambda$startTracing$1(this.f14377c, this.f14378d);
                break;
            case 1:
                this.f14376b.lambda$onActivityResumed$8(this.f14377c, this.f14378d);
                break;
            default:
                this.f14376b.lambda$onActivityResumed$9(this.f14377c, this.f14378d);
                break;
        }
    }
}

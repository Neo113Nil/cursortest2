package io.sentry.android.core;

import io.sentry.ISpan;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityLifecycleIntegration f14370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ISpan f14371c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ISpan f14372d;

    public /* synthetic */ f(ActivityLifecycleIntegration activityLifecycleIntegration, ISpan iSpan, ISpan iSpan2, int i7) {
        this.f14369a = i7;
        this.f14370b = activityLifecycleIntegration;
        this.f14371c = iSpan;
        this.f14372d = iSpan2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14369a) {
            case 0:
                this.f14370b.lambda$startTracing$1(this.f14371c, this.f14372d);
                break;
            case 1:
                this.f14370b.lambda$onActivityResumed$8(this.f14371c, this.f14372d);
                break;
            default:
                this.f14370b.lambda$onActivityResumed$9(this.f14371c, this.f14372d);
                break;
        }
    }
}

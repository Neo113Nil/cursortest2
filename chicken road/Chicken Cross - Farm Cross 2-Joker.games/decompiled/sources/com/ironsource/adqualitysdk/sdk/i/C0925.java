package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴘ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0925 extends AbstractC0404 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0909 f2573;

    public C0925(C0909 c0909) {
        this.f2573 = c0909;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f2573.f2546.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f2573.f2546.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C0909 c0909 = this.f2573;
        c0909.f2546.postDelayed(new C0917(c0909, activity), 500L);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C0909 c0909 = this.f2573;
        if (c0909.f2548) {
            c0909.f2548 = false;
            c0909.f2547.mo5725(activity);
        }
        c0909.f2546.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f2573.f2546.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f2573.f2546.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f2573.f2546.removeCallbacksAndMessages(null);
    }
}

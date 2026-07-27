package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴱ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0939 extends AbstractC0404 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1226 f2642;

    public C0939(C1226 c1226) {
        this.f2642 = c1226;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C1226 c1226 = this.f2642;
        c1226.m5936(AbstractC0739.f2028, C1226.m5925(c1226, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C1226 c1226 = this.f2642;
        c1226.m5936(AbstractC0739.f2027, C1226.m5925(c1226, activity));
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ب, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0593 extends AbstractC0404 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f1547;

    public C0593(C0563 c0563) {
        this.f1547 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC1145.m5895(new C0602(this));
    }
}

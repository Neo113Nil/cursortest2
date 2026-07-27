package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴉ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0917 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0909 f2558;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f2559;

    public C0917(C0909 c0909, Activity activity) {
        this.f2558 = c0909;
        this.f2559 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0909 c0909 = this.f2558;
        c0909.f2548 = true;
        InterfaceC1002 interfaceC1002 = c0909.f2547;
        if (interfaceC1002 != null) {
            interfaceC1002.mo5726(this.f2559);
        }
    }
}

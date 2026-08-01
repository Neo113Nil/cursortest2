package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ỉ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1028 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1027 f3056;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ View f3057;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC1011 f3058;

    public C1028(C1027 c1027, ViewOnClickListenerC1011 viewOnClickListenerC1011, View view) {
        this.f3056 = c1027;
        this.f3058 = viewOnClickListenerC1011;
        this.f3057 = view;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f3056.f3055.mo5806(this.f3058, this.f3057);
    }
}

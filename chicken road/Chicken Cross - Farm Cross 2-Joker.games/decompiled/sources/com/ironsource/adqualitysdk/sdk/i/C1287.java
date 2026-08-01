package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｲ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1287 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC1276 f3670;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f3671;

    public C1287(ViewOnLayoutChangeListenerC1276 viewOnLayoutChangeListenerC1276, ArrayList arrayList) {
        this.f3670 = viewOnLayoutChangeListenerC1276;
        this.f3671 = arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        ViewOnLayoutChangeListenerC1276 viewOnLayoutChangeListenerC1276 = this.f3670;
        viewOnLayoutChangeListenerC1276.f3654.m5583(viewOnLayoutChangeListenerC1276.f3653, viewOnLayoutChangeListenerC1276.f3652, this.f3671);
    }
}

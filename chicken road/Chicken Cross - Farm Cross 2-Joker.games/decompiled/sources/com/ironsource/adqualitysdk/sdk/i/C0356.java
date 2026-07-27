package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewGroup;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ŧ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0356 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC0381 f451;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0369 f452;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f453;

    public C0356(ViewGroup viewGroup, C0369 c0369, ViewOnLayoutChangeListenerC0381 viewOnLayoutChangeListenerC0381) {
        this.f453 = viewGroup;
        this.f452 = c0369;
        this.f451 = viewOnLayoutChangeListenerC0381;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f453.addView(this.f452, new ViewGroup.LayoutParams(-1, -1));
        this.f453.removeOnLayoutChangeListener(this.f451);
        this.f453.addOnLayoutChangeListener(this.f451);
    }
}

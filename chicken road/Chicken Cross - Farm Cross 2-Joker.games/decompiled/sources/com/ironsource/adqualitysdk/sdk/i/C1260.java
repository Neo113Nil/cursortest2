package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ｌ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1260 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC1259 f3560;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f3561;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0623 f3562;

    public C1260(ViewOnAttachStateChangeListenerC1259 viewOnAttachStateChangeListenerC1259, C0623 c0623, ArrayList arrayList) {
        this.f3560 = viewOnAttachStateChangeListenerC1259;
        this.f3562 = c0623;
        this.f3561 = arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0623 c0623 = this.f3562;
        ViewOnAttachStateChangeListenerC1259 viewOnAttachStateChangeListenerC1259 = this.f3560;
        c0623.m5583(viewOnAttachStateChangeListenerC1259.f3555, viewOnAttachStateChangeListenerC1259.f3554, this.f3561);
    }
}

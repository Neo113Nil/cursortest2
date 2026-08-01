package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import java.util.LinkedHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐹ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0761 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0682 f2194;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f2195;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Context f2196;

    public C0761(C0682 c0682, Context context, LinkedHashMap linkedHashMap) {
        this.f2194 = c0682;
        this.f2196 = context;
        this.f2195 = linkedHashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f2194.f1861 = AbstractC0398.m5397().mo5407();
        this.f2194.m5633(this.f2196, this.f2195, new C0773(this));
        AbstractC0398 m5397 = AbstractC0398.m5397();
        C0771 c0771 = new C0771(this);
        C0470 c0470 = (C0470) m5397;
        Handler handler = c0470.f890;
        if (handler != null) {
            handler.post(new C0506(c0470, c0771));
        }
    }
}

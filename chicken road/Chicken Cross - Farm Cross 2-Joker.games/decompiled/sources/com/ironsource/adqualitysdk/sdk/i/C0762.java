package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.mediation.MaxAd;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᑈ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0762 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0759 f2197;

    public C0762(C0759 c0759) {
        this.f2197 = c0759;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0759 c0759 = this.f2197;
        MaxAd maxAd = (MaxAd) arrayList.get(0);
        c0759.getClass();
        return maxAd.getCreativeId();
    }
}

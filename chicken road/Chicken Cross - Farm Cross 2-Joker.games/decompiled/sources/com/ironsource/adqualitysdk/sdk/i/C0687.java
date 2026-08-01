package com.ironsource.adqualitysdk.sdk.i;

import com.my.target.ads.Reward;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ઽ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0687 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0622 f1874;

    public C0687(C0622 c0622) {
        this.f1874 = c0622;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0622 c0622 = this.f1874;
        Reward reward = (Reward) arrayList.get(0);
        c0622.getClass();
        return reward.type;
    }
}

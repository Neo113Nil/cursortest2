package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.common.AdInfo;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class f0 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ o0 f156;

    public f0(o0 o0Var) {
        this.f156 = o0Var;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        o0 o0Var = this.f156;
        AdInfo adInfo = (AdInfo) arrayList.get(0);
        o0Var.getClass();
        return adInfo.getAdUnitId();
    }
}

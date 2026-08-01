package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.common.ImpressionData;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class g0 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ o0 f158;

    public g0(o0 o0Var) {
        this.f158 = o0Var;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        o0 o0Var = this.f158;
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        o0Var.getClass();
        return impressionData.getRawData();
    }
}

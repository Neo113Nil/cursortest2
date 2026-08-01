package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.external.ImpressionData;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Υ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0471 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0337 f911;

    public C0471(C0337 c0337) {
        this.f911 = c0337;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0337 c0337 = this.f911;
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        c0337.getClass();
        return impressionData.getAdvertiserDomain();
    }
}

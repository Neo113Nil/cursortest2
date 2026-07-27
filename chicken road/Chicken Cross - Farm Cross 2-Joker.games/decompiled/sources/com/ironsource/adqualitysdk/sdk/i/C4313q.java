package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.ads.internal.model.AdPayload;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4313q implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C4314s f244;

    public C4313q(C4314s c4314s) {
        this.f244 = c4314s;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C4314s c4314s = this.f244;
        AdPayload.AdUnit adUnit = (AdPayload.AdUnit) arrayList.get(0);
        c4314s.getClass();
        return adUnit.getTemplateSettings();
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.core.api.ApiAdResponse;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ײ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0591 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0441 f1545;

    public C0591(C0441 c0441) {
        this.f1545 = c0441;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0441 c0441 = this.f1545;
        ApiAdResponse apiAdResponse = (ApiAdResponse) arrayList.get(0);
        c0441.getClass();
        return apiAdResponse.getBody();
    }
}

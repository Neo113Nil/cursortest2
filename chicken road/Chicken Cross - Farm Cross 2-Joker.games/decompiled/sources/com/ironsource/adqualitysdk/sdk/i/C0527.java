package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.core.mvvm.model.AdResponse;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ї, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0527 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0441 f1194;

    public C0527(C0441 c0441) {
        this.f1194 = c0441;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0441 c0441 = this.f1194;
        AdResponse adResponse = (AdResponse) arrayList.get(0);
        c0441.getClass();
        return adResponse.getClickUrl();
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import tv.superawesome.lib.samodelspace.saad.SAAd;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵌ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0966 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0777 f2804;

    public C0966(C0777 c0777) {
        this.f2804 = c0777;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0777 c0777 = this.f2804;
        SAAd sAAd = (SAAd) arrayList.get(0);
        c0777.getClass();
        return sAAd.writeToJson();
    }
}

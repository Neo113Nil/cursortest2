package com.ironsource.adqualitysdk.sdk.i;

import io.bidmachine.protobuf.RequestExtension;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.হ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0681 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0582 f1853;

    public C0681(C0582 c0582) {
        this.f1853 = c0582;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0582 c0582 = this.f1853;
        RequestExtension requestExtension = (RequestExtension) arrayList.get(0);
        c0582.getClass();
        return requestExtension.getSellerId();
    }
}

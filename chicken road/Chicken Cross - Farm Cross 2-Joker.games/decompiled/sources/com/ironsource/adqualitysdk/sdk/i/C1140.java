package com.ironsource.adqualitysdk.sdk.i;

import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.דּ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1140 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0971 f3277;

    public C1140(C0971 c0971) {
        this.f3277 = c0971;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0971 c0971 = this.f3277;
        MBridgeIds mBridgeIds = (MBridgeIds) arrayList.get(0);
        c0971.getClass();
        return mBridgeIds.getPlacementId();
    }
}

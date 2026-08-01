package com.ironsource.adqualitysdk.sdk.i;

import com.bytedance.sdk.openadsdk.TTAdConfig;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ԏ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0555 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0486 f1255;

    public C0555(C0486 c0486) {
        this.f1255 = c0486;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0486 c0486 = this.f1255;
        TTAdConfig tTAdConfig = (TTAdConfig) arrayList.get(0);
        c0486.getClass();
        return tTAdConfig.getData();
    }
}

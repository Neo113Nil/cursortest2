package com.ironsource.adqualitysdk.sdk.i;

import com.bytedance.sdk.openadsdk.TTAdConfig;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Դ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0556 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0486 f1256;

    public C0556(C0486 c0486) {
        this.f1256 = c0486;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0486 c0486 = this.f1256;
        TTAdConfig tTAdConfig = (TTAdConfig) arrayList.get(0);
        c0486.getClass();
        return tTAdConfig.getAppId();
    }
}

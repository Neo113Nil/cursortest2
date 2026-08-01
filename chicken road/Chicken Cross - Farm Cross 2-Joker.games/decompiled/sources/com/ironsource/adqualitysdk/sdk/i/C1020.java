package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.model.PreloadedVastData;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ṿ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1020 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1012 f3036;

    public C1020(C1012 c1012) {
        this.f3036 = c1012;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1012 c1012 = this.f3036;
        PreloadedVastData preloadedVastData = (PreloadedVastData) arrayList.get(0);
        c1012.getClass();
        return preloadedVastData.getParameters();
    }
}

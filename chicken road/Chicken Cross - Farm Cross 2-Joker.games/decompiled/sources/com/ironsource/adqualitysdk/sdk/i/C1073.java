package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.ads.UnityAdsLoadOptions;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ⁱ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1073 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0449 f3177;

    public C1073(C0449 c0449) {
        this.f3177 = c0449;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0449 c0449 = this.f3177;
        UnityAdsLoadOptions unityAdsLoadOptions = (UnityAdsLoadOptions) arrayList.get(0);
        c0449.getClass();
        return unityAdsLoadOptions.getData();
    }
}

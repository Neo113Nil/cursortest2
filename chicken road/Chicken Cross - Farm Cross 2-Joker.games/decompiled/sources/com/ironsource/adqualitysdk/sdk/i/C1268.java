package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.device.ads.DTBFetchManager;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｎ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1268 extends HashMap implements InterfaceC0997 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1267 f3641;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0807 f3642;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1268(C1267 c1267, HashMap hashMap, C0807 c0807) {
        super(hashMap);
        this.f3641 = c1267;
        this.f3642 = c0807;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        DTBFetchManager dTBFetchManager = (DTBFetchManager) obj2;
        this.f3641.m5529(this, this.f3642, StringFog.decrypt("xrgtfWrU0wnPjQFaaMXCCsqNHFNCwcBP8pkb\n", "guxvOw+gsGE=\n"), str, dTBFetchManager);
        return (DTBFetchManager) super.put(str, dTBFetchManager);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0997
    /* renamed from: ﾒ */
    public final Object mo5381() {
        return this;
    }
}

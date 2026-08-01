package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.api.data.WebTrafficObject;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.丿, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1120 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1012 f3252;

    public C1120(C1012 c1012) {
        this.f3252 = c1012;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1012 c1012 = this.f3252;
        WebTrafficObject webTrafficObject = (WebTrafficObject) arrayList.get(0);
        c1012.getClass();
        return webTrafficObject.urls;
    }
}

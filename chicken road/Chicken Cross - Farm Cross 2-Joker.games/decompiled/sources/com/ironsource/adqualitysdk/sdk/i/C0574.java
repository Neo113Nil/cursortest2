package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.services.core.webview.WebViewApp;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.י, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0574 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0449 f1327;

    public C0574(C0449 c0449) {
        this.f1327 = c0449;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0449 c0449 = this.f1327;
        Object obj = arrayList.get(0);
        c0449.getClass();
        return new C0454(c0449, (WebViewApp) obj, c0807);
    }
}

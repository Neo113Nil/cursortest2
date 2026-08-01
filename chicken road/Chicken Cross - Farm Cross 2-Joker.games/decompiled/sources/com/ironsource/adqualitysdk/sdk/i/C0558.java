package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.services.core.webview.WebViewApp;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ՙ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0558 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0449 f1273;

    public C0558(C0449 c0449) {
        this.f1273 = c0449;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0449 c0449 = this.f1273;
        Object obj = arrayList.get(0);
        c0449.getClass();
        WebViewApp.setCurrentApp((C0454) obj);
        return null;
    }
}

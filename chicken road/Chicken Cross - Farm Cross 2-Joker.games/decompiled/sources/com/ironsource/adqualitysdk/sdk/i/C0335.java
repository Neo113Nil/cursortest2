package com.ironsource.adqualitysdk.sdk.i;

import com.tapjoy.TJSplitWebView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ı, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0335 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1319 f380;

    public C0335(C1319 c1319) {
        this.f380 = c1319;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1319 c1319 = this.f380;
        TJSplitWebView tJSplitWebView = (TJSplitWebView) arrayList.get(0);
        c1319.getClass();
        return tJSplitWebView.getLastUrl();
    }
}

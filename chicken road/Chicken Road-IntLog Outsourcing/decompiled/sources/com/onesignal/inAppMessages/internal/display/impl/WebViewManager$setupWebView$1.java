package com.onesignal.inAppMessages.internal.display.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager", f = "WebViewManager.kt", l = {371}, m = "setupWebView")
/* loaded from: classes.dex */
public final class WebViewManager$setupWebView$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebViewManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewManager$setupWebView$1(WebViewManager webViewManager, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = webViewManager;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.setupWebView(null, null, false, this);
    }
}

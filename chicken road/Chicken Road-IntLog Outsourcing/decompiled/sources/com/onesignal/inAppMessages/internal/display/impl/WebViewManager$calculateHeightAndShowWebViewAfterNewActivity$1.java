package com.onesignal.inAppMessages.internal.display.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager", f = "WebViewManager.kt", l = {247, 252, 258}, m = "calculateHeightAndShowWebViewAfterNewActivity")
/* loaded from: classes.dex */
public final class WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebViewManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$1(WebViewManager webViewManager, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = webViewManager;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object calculateHeightAndShowWebViewAfterNewActivity;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        calculateHeightAndShowWebViewAfterNewActivity = this.this$0.calculateHeightAndShowWebViewAfterNewActivity(this);
        return calculateHeightAndShowWebViewAfterNewActivity;
    }
}

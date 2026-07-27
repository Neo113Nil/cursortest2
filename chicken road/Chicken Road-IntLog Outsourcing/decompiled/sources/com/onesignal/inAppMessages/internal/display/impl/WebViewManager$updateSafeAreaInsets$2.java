package com.onesignal.inAppMessages.internal.display.impl;

import D4.InterfaceC0022w;
import com.onesignal.common.ViewUtils;
import e5.g;
import f4.v;
import java.util.Arrays;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager$updateSafeAreaInsets$2", f = "WebViewManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WebViewManager$updateSafeAreaInsets$2 extends h implements InterfaceC1445p {
    int label;
    final /* synthetic */ WebViewManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewManager$updateSafeAreaInsets$2(WebViewManager webViewManager, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = webViewManager;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new WebViewManager$updateSafeAreaInsets$2(this.this$0, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((WebViewManager$updateSafeAreaInsets$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        OSWebView oSWebView;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        int[] cutoutAndStatusBarInsets = ViewUtils.INSTANCE.getCutoutAndStatusBarInsets(this.this$0.activity);
        String format = String.format(WebViewManager.SET_SAFE_AREA_INSETS_JS_FUNCTION, Arrays.copyOf(new Object[]{String.format(WebViewManager.SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{new Integer(cutoutAndStatusBarInsets[0]), new Integer(cutoutAndStatusBarInsets[1]), new Integer(cutoutAndStatusBarInsets[2]), new Integer(cutoutAndStatusBarInsets[3])}, 4))}, 1));
        oSWebView = this.this$0.webView;
        i.b(oSWebView);
        oSWebView.evaluateJavascript(format, null);
        return v.f5689a;
    }
}

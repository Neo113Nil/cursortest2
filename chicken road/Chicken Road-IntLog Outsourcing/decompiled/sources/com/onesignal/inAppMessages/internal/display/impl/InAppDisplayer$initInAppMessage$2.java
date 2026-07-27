package com.onesignal.inAppMessages.internal.display.impl;

import B4.k;
import D4.InterfaceC0022w;
import android.app.Activity;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.InAppMessageContent;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer$initInAppMessage$2", f = "InAppDisplayer.kt", l = {148}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InAppDisplayer$initInAppMessage$2 extends h implements InterfaceC1445p {
    final /* synthetic */ String $base64Str;
    final /* synthetic */ InAppMessageContent $content;
    final /* synthetic */ Activity $currentActivity;
    final /* synthetic */ WebViewManager $webViewManager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppDisplayer$initInAppMessage$2(WebViewManager webViewManager, Activity activity, String str, InAppMessageContent inAppMessageContent, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$webViewManager = webViewManager;
        this.$currentActivity = activity;
        this.$base64Str = str;
        this.$content = inAppMessageContent;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new InAppDisplayer$initInAppMessage$2(this.$webViewManager, this.$currentActivity, this.$base64Str, this.$content, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((InAppDisplayer$initInAppMessage$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                g.y(obj);
                WebViewManager webViewManager = this.$webViewManager;
                Activity activity = this.$currentActivity;
                String base64Str = this.$base64Str;
                i.d(base64Str, "$base64Str");
                boolean isFullBleed = this.$content.isFullBleed();
                this.label = 1;
                if (webViewManager.setupWebView(activity, base64Str, isFullBleed, this) == enumC1260a) {
                    return enumC1260a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.y(obj);
            }
        } catch (Exception e3) {
            if (e3.getMessage() != null) {
                String message = e3.getMessage();
                i.b(message);
                if (k.R(message, "No WebView installed", false)) {
                    Logging.info("Error setting up WebView: ", e3);
                }
            }
            throw e3;
        }
        return v.f5689a;
    }
}

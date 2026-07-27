package com.onesignal.inAppMessages.internal.display.impl;

import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager$onActivityAvailable$1", f = "WebViewManager.kt", l = {299, 306, 310}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WebViewManager$onActivityAvailable$1 extends h implements InterfaceC1441l {
    final /* synthetic */ String $lastActivityName;
    int label;
    final /* synthetic */ WebViewManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewManager$onActivityAvailable$1(String str, WebViewManager webViewManager, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.$lastActivityName = str;
        this.this$0 = webViewManager;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new WebViewManager$onActivityAvailable$1(this.$lastActivityName, this.this$0, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object calculateHeightAndShowWebViewAfterNewActivity;
        Integer num;
        Object showMessageView;
        Object showMessageView2;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            String str2 = this.$lastActivityName;
            if (str2 == null) {
                WebViewManager webViewManager = this.this$0;
                this.label = 1;
                showMessageView2 = webViewManager.showMessageView(null, this);
                if (showMessageView2 == enumC1260a) {
                    return enumC1260a;
                }
            } else {
                str = this.this$0.currentActivityName;
                if (i.a(str2, str)) {
                    WebViewManager webViewManager2 = this.this$0;
                    this.label = 3;
                    calculateHeightAndShowWebViewAfterNewActivity = webViewManager2.calculateHeightAndShowWebViewAfterNewActivity(this);
                    if (calculateHeightAndShowWebViewAfterNewActivity == enumC1260a) {
                        return enumC1260a;
                    }
                } else if (!this.this$0.closing) {
                    if (this.this$0.messageView != null) {
                        InAppMessageView inAppMessageView = this.this$0.messageView;
                        i.b(inAppMessageView);
                        inAppMessageView.removeAllViews();
                    }
                    WebViewManager webViewManager3 = this.this$0;
                    num = webViewManager3.lastPageHeight;
                    this.label = 2;
                    showMessageView = webViewManager3.showMessageView(num, this);
                    if (showMessageView == enumC1260a) {
                        return enumC1260a;
                    }
                }
            }
        } else {
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((WebViewManager$onActivityAvailable$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}

package com.onesignal.inAppMessages.internal.display.impl;

import D4.InterfaceC0022w;
import android.app.Activity;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.onesignal.inAppMessages.internal.display.impl.DraggableRelativeLayout;
import com.onesignal.inAppMessages.internal.display.impl.InAppMessageView;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$showDraggableView$2", f = "InAppMessageView.kt", l = {272}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InAppMessageView$showDraggableView$2 extends h implements InterfaceC1445p {
    final /* synthetic */ WebViewManager.Position $displayLocation;
    final /* synthetic */ RelativeLayout.LayoutParams $draggableRelativeLayoutParams;
    final /* synthetic */ RelativeLayout.LayoutParams $relativeLayoutParams;
    final /* synthetic */ DraggableRelativeLayout.Params $webViewLayoutParams;
    int label;
    final /* synthetic */ InAppMessageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageView$showDraggableView$2(InAppMessageView inAppMessageView, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, DraggableRelativeLayout.Params params, WebViewManager.Position position, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = inAppMessageView;
        this.$relativeLayoutParams = layoutParams;
        this.$draggableRelativeLayoutParams = layoutParams2;
        this.$webViewLayoutParams = params;
        this.$displayLocation = position;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new InAppMessageView$showDraggableView$2(this.this$0, this.$relativeLayoutParams, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams, this.$displayLocation, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((InAppMessageView$showDraggableView$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        WebView webView2;
        Activity activity;
        Activity activity2;
        RelativeLayout relativeLayout;
        InAppMessageView.InAppMessageViewListener inAppMessageViewListener;
        Object startDismissTimerIfNeeded;
        DraggableRelativeLayout draggableRelativeLayout;
        RelativeLayout relativeLayout2;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        v vVar = v.f5689a;
        if (i2 == 0) {
            g.y(obj);
            webView = this.this$0.webView;
            if (webView == null) {
                return vVar;
            }
            webView2 = this.this$0.webView;
            i.b(webView2);
            webView2.setLayoutParams(this.$relativeLayoutParams);
            InAppMessageView inAppMessageView = this.this$0;
            activity = inAppMessageView.currentActivity;
            i.b(activity);
            inAppMessageView.setUpDraggableLayout(activity, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams);
            InAppMessageView inAppMessageView2 = this.this$0;
            activity2 = inAppMessageView2.currentActivity;
            i.b(activity2);
            inAppMessageView2.setUpParentRelativeLayout(activity2);
            InAppMessageView inAppMessageView3 = this.this$0;
            relativeLayout = inAppMessageView3.parentRelativeLayout;
            i.b(relativeLayout);
            inAppMessageView3.createPopupWindow(relativeLayout);
            inAppMessageViewListener = this.this$0.messageController;
            if (inAppMessageViewListener != null) {
                InAppMessageView inAppMessageView4 = this.this$0;
                WebViewManager.Position position = this.$displayLocation;
                draggableRelativeLayout = inAppMessageView4.draggableRelativeLayout;
                i.b(draggableRelativeLayout);
                relativeLayout2 = this.this$0.parentRelativeLayout;
                i.b(relativeLayout2);
                inAppMessageView4.animateInAppMessage(position, draggableRelativeLayout, relativeLayout2);
            }
            InAppMessageView inAppMessageView5 = this.this$0;
            this.label = 1;
            startDismissTimerIfNeeded = inAppMessageView5.startDismissTimerIfNeeded(this);
            if (startDismissTimerIfNeeded == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        return vVar;
    }
}

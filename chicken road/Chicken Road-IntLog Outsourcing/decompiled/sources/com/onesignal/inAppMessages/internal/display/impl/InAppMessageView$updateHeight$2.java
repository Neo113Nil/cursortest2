package com.onesignal.inAppMessages.internal.display.impl;

import D4.InterfaceC0022w;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.display.impl.DraggableRelativeLayout;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$updateHeight$2", f = "InAppMessageView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InAppMessageView$updateHeight$2 extends h implements InterfaceC1445p {
    final /* synthetic */ int $pageHeight;
    int label;
    final /* synthetic */ InAppMessageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageView$updateHeight$2(InAppMessageView inAppMessageView, int i2, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = inAppMessageView;
        this.$pageHeight = i2;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new InAppMessageView$updateHeight$2(this.this$0, this.$pageHeight, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((InAppMessageView$updateHeight$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        WebView webView2;
        WebView webView3;
        DraggableRelativeLayout draggableRelativeLayout;
        DraggableRelativeLayout draggableRelativeLayout2;
        boolean z;
        DraggableRelativeLayout.Params createDraggableLayoutParams;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        webView = this.this$0.webView;
        v vVar = v.f5689a;
        if (webView == null) {
            Logging.warn$default("WebView height update skipped, new height will be used once it is displayed.", null, 2, null);
            return vVar;
        }
        webView2 = this.this$0.webView;
        i.b(webView2);
        ViewGroup.LayoutParams layoutParams = webView2.getLayoutParams();
        if (layoutParams == null) {
            Logging.warn$default("WebView height update skipped because of null layoutParams, new height will be used once it is displayed.", null, 2, null);
            return vVar;
        }
        layoutParams.height = this.$pageHeight;
        webView3 = this.this$0.webView;
        i.b(webView3);
        webView3.setLayoutParams(layoutParams);
        draggableRelativeLayout = this.this$0.draggableRelativeLayout;
        if (draggableRelativeLayout != null) {
            draggableRelativeLayout2 = this.this$0.draggableRelativeLayout;
            i.b(draggableRelativeLayout2);
            InAppMessageView inAppMessageView = this.this$0;
            int i2 = this.$pageHeight;
            WebViewManager.Position displayPosition = inAppMessageView.getDisplayPosition();
            z = this.this$0.disableDragDismiss;
            createDraggableLayoutParams = inAppMessageView.createDraggableLayoutParams(i2, displayPosition, z);
            draggableRelativeLayout2.setParams(createDraggableLayoutParams);
        }
        return vVar;
    }
}

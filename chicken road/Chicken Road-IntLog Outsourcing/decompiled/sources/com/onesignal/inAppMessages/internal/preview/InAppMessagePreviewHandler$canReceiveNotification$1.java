package com.onesignal.inAppMessages.internal.preview;

import io.appmetrica.analytics.impl.C0793l9;
import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.inAppMessages.internal.preview.InAppMessagePreviewHandler", f = "InAppMessagePreviewHandler.kt", l = {C0793l9.f8690L, 46}, m = "canReceiveNotification")
/* loaded from: classes.dex */
public final class InAppMessagePreviewHandler$canReceiveNotification$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppMessagePreviewHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessagePreviewHandler$canReceiveNotification$1(InAppMessagePreviewHandler inAppMessagePreviewHandler, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = inAppMessagePreviewHandler;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.canReceiveNotification(null, this);
    }
}

package com.onesignal.inAppMessages.internal.display.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView", f = "InAppMessageView.kt", l = {428, 439}, m = "startDismissTimerIfNeeded")
/* loaded from: classes.dex */
public final class InAppMessageView$startDismissTimerIfNeeded$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppMessageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageView$startDismissTimerIfNeeded$1(InAppMessageView inAppMessageView, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = inAppMessageView;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object startDismissTimerIfNeeded;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        startDismissTimerIfNeeded = this.this$0.startDismissTimerIfNeeded(this);
        return startDismissTimerIfNeeded;
    }
}

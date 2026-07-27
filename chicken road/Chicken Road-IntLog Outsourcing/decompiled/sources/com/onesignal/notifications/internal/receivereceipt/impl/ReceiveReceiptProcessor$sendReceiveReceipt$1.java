package com.onesignal.notifications.internal.receivereceipt.impl;

import io.appmetrica.analytics.impl.C0793l9;
import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptProcessor", f = "ReceiveReceiptProcessor.kt", l = {C0793l9.f8683E}, m = "sendReceiveReceipt")
/* loaded from: classes.dex */
public final class ReceiveReceiptProcessor$sendReceiveReceipt$1 extends AbstractC1295c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReceiveReceiptProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveReceiptProcessor$sendReceiveReceipt$1(ReceiveReceiptProcessor receiveReceiptProcessor, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = receiveReceiptProcessor;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendReceiveReceipt(null, null, null, this);
    }
}

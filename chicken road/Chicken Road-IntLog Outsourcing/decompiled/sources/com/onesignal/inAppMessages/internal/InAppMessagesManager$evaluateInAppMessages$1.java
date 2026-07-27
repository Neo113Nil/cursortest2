package com.onesignal.inAppMessages.internal;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", f = "InAppMessagesManager.kt", l = {450}, m = "evaluateInAppMessages")
/* loaded from: classes.dex */
public final class InAppMessagesManager$evaluateInAppMessages$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessagesManager$evaluateInAppMessages$1(InAppMessagesManager inAppMessagesManager, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = inAppMessagesManager;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object evaluateInAppMessages;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        evaluateInAppMessages = this.this$0.evaluateInAppMessages(this);
        return evaluateInAppMessages;
    }
}

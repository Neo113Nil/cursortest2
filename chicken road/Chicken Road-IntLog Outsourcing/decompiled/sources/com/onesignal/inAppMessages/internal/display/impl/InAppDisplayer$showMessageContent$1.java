package com.onesignal.inAppMessages.internal.display.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer", f = "InAppDisplayer.kt", l = {105, 107, 109, 114, 115}, m = "showMessageContent")
/* loaded from: classes.dex */
public final class InAppDisplayer$showMessageContent$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppDisplayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppDisplayer$showMessageContent$1(InAppDisplayer inAppDisplayer, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = inAppDisplayer;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object showMessageContent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        showMessageContent = this.this$0.showMessageContent(null, null, this);
        return showMessageContent;
    }
}

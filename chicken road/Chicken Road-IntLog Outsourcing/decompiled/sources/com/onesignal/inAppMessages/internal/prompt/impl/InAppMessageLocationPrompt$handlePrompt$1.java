package com.onesignal.inAppMessages.internal.prompt.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.inAppMessages.internal.prompt.impl.InAppMessageLocationPrompt", f = "InAppMessageLocationPrompt.kt", l = {10}, m = "handlePrompt")
/* loaded from: classes.dex */
public final class InAppMessageLocationPrompt$handlePrompt$1 extends AbstractC1295c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppMessageLocationPrompt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageLocationPrompt$handlePrompt$1(InAppMessageLocationPrompt inAppMessageLocationPrompt, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = inAppMessageLocationPrompt;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.handlePrompt(this);
    }
}

package com.onesignal.notifications.internal.registration.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorHMS", f = "PushRegistratorHMS.kt", l = {76}, m = "getHMSTokenTask")
/* loaded from: classes.dex */
public final class PushRegistratorHMS$getHMSTokenTask$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PushRegistratorHMS this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushRegistratorHMS$getHMSTokenTask$1(PushRegistratorHMS pushRegistratorHMS, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = pushRegistratorHMS;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object hMSTokenTask;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        hMSTokenTask = this.this$0.getHMSTokenTask(null, this);
        return hMSTokenTask;
    }
}

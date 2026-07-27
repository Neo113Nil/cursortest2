package com.onesignal.notifications.internal.registration.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle", f = "PushRegistratorAbstractGoogle.kt", l = {128}, m = "attemptRegistration")
/* loaded from: classes.dex */
public final class PushRegistratorAbstractGoogle$attemptRegistration$1 extends AbstractC1295c {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PushRegistratorAbstractGoogle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushRegistratorAbstractGoogle$attemptRegistration$1(PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = pushRegistratorAbstractGoogle;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object attemptRegistration;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        attemptRegistration = this.this$0.attemptRegistration(null, 0, this);
        return attemptRegistration;
    }
}

package com.onesignal.session.internal.outcomes.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository", f = "OutcomeEventsRepository.kt", l = {104}, m = "getAllEventsToSend")
/* loaded from: classes.dex */
public final class OutcomeEventsRepository$getAllEventsToSend$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OutcomeEventsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeEventsRepository$getAllEventsToSend$1(OutcomeEventsRepository outcomeEventsRepository, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = outcomeEventsRepository;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAllEventsToSend(this);
    }
}

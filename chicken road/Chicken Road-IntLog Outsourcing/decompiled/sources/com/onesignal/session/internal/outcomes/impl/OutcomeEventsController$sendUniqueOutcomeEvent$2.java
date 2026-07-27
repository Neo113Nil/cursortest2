package com.onesignal.session.internal.outcomes.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController", f = "OutcomeEventsController.kt", l = {138, 151, 167}, m = "sendUniqueOutcomeEvent")
/* loaded from: classes.dex */
public final class OutcomeEventsController$sendUniqueOutcomeEvent$2 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OutcomeEventsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeEventsController$sendUniqueOutcomeEvent$2(OutcomeEventsController outcomeEventsController, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = outcomeEventsController;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object sendUniqueOutcomeEvent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendUniqueOutcomeEvent = this.this$0.sendUniqueOutcomeEvent(null, null, this);
        return sendUniqueOutcomeEvent;
    }
}

package com.onesignal.session.internal.outcomes.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsBackendService", f = "OutcomeEventsBackendService.kt", l = {49}, m = "sendOutcomeEvent")
/* loaded from: classes.dex */
public final class OutcomeEventsBackendService$sendOutcomeEvent$1 extends AbstractC1295c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OutcomeEventsBackendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeEventsBackendService$sendOutcomeEvent$1(OutcomeEventsBackendService outcomeEventsBackendService, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = outcomeEventsBackendService;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendOutcomeEvent(null, null, null, null, null, null, this);
    }
}

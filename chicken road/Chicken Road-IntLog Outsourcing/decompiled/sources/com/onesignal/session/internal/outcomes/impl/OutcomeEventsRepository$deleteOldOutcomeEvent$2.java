package com.onesignal.session.internal.outcomes.impl;

import D4.InterfaceC0022w;
import com.onesignal.core.internal.database.IDatabaseProvider;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$deleteOldOutcomeEvent$2", f = "OutcomeEventsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OutcomeEventsRepository$deleteOldOutcomeEvent$2 extends h implements InterfaceC1445p {
    final /* synthetic */ OutcomeEventParams $event;
    int label;
    final /* synthetic */ OutcomeEventsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeEventsRepository$deleteOldOutcomeEvent$2(OutcomeEventsRepository outcomeEventsRepository, OutcomeEventParams outcomeEventParams, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = outcomeEventsRepository;
        this.$event = outcomeEventParams;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OutcomeEventsRepository$deleteOldOutcomeEvent$2(this.this$0, this.$event, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OutcomeEventsRepository$deleteOldOutcomeEvent$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IDatabaseProvider iDatabaseProvider;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        iDatabaseProvider = this.this$0._databaseProvider;
        iDatabaseProvider.getOs().delete("outcome", "timestamp = ?", new String[]{String.valueOf(this.$event.getTimestamp())});
        return v.f5689a;
    }
}
